package me.gilo.woodroid.offlinecart.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import me.gilo.woodroid.offlinecart.dao.CartItemDao;
import me.gilo.woodroid.offlinecart.dao.CartItemDao_Impl;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile CartItemDao _cartItemDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `cart_item` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `created_at` INTEGER, `modified_at` INTEGER, `product_id` INTEGER NOT NULL, `quantity` INTEGER NOT NULL, `variation_id` INTEGER, `product_name` TEXT, `product_price` TEXT, `product_image` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c480f6e181606cae1fdc9fb066a377d3')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `cart_item`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCartItem = new HashMap<String, TableInfo.Column>(9);
        _columnsCartItem.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartItem.put("created_at", new TableInfo.Column("created_at", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartItem.put("modified_at", new TableInfo.Column("modified_at", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartItem.put("product_id", new TableInfo.Column("product_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartItem.put("quantity", new TableInfo.Column("quantity", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartItem.put("variation_id", new TableInfo.Column("variation_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartItem.put("product_name", new TableInfo.Column("product_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartItem.put("product_price", new TableInfo.Column("product_price", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartItem.put("product_image", new TableInfo.Column("product_image", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCartItem = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCartItem = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCartItem = new TableInfo("cart_item", _columnsCartItem, _foreignKeysCartItem, _indicesCartItem);
        final TableInfo _existingCartItem = TableInfo.read(_db, "cart_item");
        if (! _infoCartItem.equals(_existingCartItem)) {
          return new RoomOpenHelper.ValidationResult(false, "cart_item(me.gilo.woodroid.offlinecart.entity.CartItemEntity).\n"
                  + " Expected:\n" + _infoCartItem + "\n"
                  + " Found:\n" + _existingCartItem);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "c480f6e181606cae1fdc9fb066a377d3", "864f000eb515ce4a5086377668aa8bfb");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "cart_item");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `cart_item`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public CartItemDao cartItemDao() {
    if (_cartItemDao != null) {
      return _cartItemDao;
    } else {
      synchronized(this) {
        if(_cartItemDao == null) {
          _cartItemDao = new CartItemDao_Impl(this);
        }
        return _cartItemDao;
      }
    }
  }
}
