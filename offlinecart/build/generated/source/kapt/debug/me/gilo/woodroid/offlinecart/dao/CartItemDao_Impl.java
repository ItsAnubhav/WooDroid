package me.gilo.woodroid.offlinecart.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Boolean;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import me.gilo.woodroid.offlinecart.entity.CartItemEntity;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CartItemDao_Impl implements CartItemDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CartItemEntity> __insertionAdapterOfCartItemEntity;

  private final EntityDeletionOrUpdateAdapter<CartItemEntity> __deletionAdapterOfCartItemEntity;

  private final EntityDeletionOrUpdateAdapter<CartItemEntity> __updateAdapterOfCartItemEntity;

  public CartItemDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCartItemEntity = new EntityInsertionAdapter<CartItemEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `cart_item` (`id`,`created_at`,`modified_at`,`product_id`,`quantity`,`variation_id`,`product_name`,`product_price`,`product_image`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CartItemEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getCreatedAt() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getCreatedAt());
        }
        if (value.getModifiedAt() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getModifiedAt());
        }
        stmt.bindLong(4, value.getProductId());
        stmt.bindLong(5, value.getQuantity());
        if (value.getVariationId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getVariationId());
        }
        if (value.getProductName() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getProductName());
        }
        if (value.getProductPrice() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getProductPrice());
        }
        if (value.getProductImage() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getProductImage());
        }
      }
    };
    this.__deletionAdapterOfCartItemEntity = new EntityDeletionOrUpdateAdapter<CartItemEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `cart_item` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CartItemEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfCartItemEntity = new EntityDeletionOrUpdateAdapter<CartItemEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `cart_item` SET `id` = ?,`created_at` = ?,`modified_at` = ?,`product_id` = ?,`quantity` = ?,`variation_id` = ?,`product_name` = ?,`product_price` = ?,`product_image` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CartItemEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getCreatedAt() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getCreatedAt());
        }
        if (value.getModifiedAt() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getModifiedAt());
        }
        stmt.bindLong(4, value.getProductId());
        stmt.bindLong(5, value.getQuantity());
        if (value.getVariationId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getVariationId());
        }
        if (value.getProductName() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getProductName());
        }
        if (value.getProductPrice() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getProductPrice());
        }
        if (value.getProductImage() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getProductImage());
        }
        if (value.getId() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.getId());
        }
      }
    };
  }

  @Override
  public Long insert(final CartItemEntity category) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfCartItemEntity.insertAndReturnId(category);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final CartItemEntity category) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfCartItemEntity.handle(category);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final CartItemEntity category) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfCartItemEntity.handle(category);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<CartItemEntity> fetchAll() {
    final String _sql = "SELECT * FROM cart_item ORDER BY created_at desc";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
      final int _cursorIndexOfModifiedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "modified_at");
      final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "product_id");
      final int _cursorIndexOfQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "quantity");
      final int _cursorIndexOfVariationId = CursorUtil.getColumnIndexOrThrow(_cursor, "variation_id");
      final int _cursorIndexOfProductName = CursorUtil.getColumnIndexOrThrow(_cursor, "product_name");
      final int _cursorIndexOfProductPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "product_price");
      final int _cursorIndexOfProductImage = CursorUtil.getColumnIndexOrThrow(_cursor, "product_image");
      final List<CartItemEntity> _result = new ArrayList<CartItemEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final CartItemEntity _item;
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        final Long _tmpCreatedAt;
        if (_cursor.isNull(_cursorIndexOfCreatedAt)) {
          _tmpCreatedAt = null;
        } else {
          _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
        }
        final Long _tmpModifiedAt;
        if (_cursor.isNull(_cursorIndexOfModifiedAt)) {
          _tmpModifiedAt = null;
        } else {
          _tmpModifiedAt = _cursor.getLong(_cursorIndexOfModifiedAt);
        }
        final int _tmpProductId;
        _tmpProductId = _cursor.getInt(_cursorIndexOfProductId);
        final int _tmpQuantity;
        _tmpQuantity = _cursor.getInt(_cursorIndexOfQuantity);
        final Integer _tmpVariationId;
        if (_cursor.isNull(_cursorIndexOfVariationId)) {
          _tmpVariationId = null;
        } else {
          _tmpVariationId = _cursor.getInt(_cursorIndexOfVariationId);
        }
        final String _tmpProductName;
        _tmpProductName = _cursor.getString(_cursorIndexOfProductName);
        final String _tmpProductPrice;
        _tmpProductPrice = _cursor.getString(_cursorIndexOfProductPrice);
        final String _tmpProductImage;
        _tmpProductImage = _cursor.getString(_cursorIndexOfProductImage);
        _item = new CartItemEntity(_tmpId,_tmpCreatedAt,_tmpModifiedAt,_tmpProductId,_tmpQuantity,_tmpVariationId,_tmpProductName,_tmpProductPrice,_tmpProductImage);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<CartItemEntity>> items() {
    final String _sql = "SELECT * FROM cart_item ORDER BY created_at desc";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"cart_item"}, false, new Callable<List<CartItemEntity>>() {
      @Override
      public List<CartItemEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfModifiedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "modified_at");
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "product_id");
          final int _cursorIndexOfQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "quantity");
          final int _cursorIndexOfVariationId = CursorUtil.getColumnIndexOrThrow(_cursor, "variation_id");
          final int _cursorIndexOfProductName = CursorUtil.getColumnIndexOrThrow(_cursor, "product_name");
          final int _cursorIndexOfProductPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "product_price");
          final int _cursorIndexOfProductImage = CursorUtil.getColumnIndexOrThrow(_cursor, "product_image");
          final List<CartItemEntity> _result = new ArrayList<CartItemEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CartItemEntity _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final Long _tmpCreatedAt;
            if (_cursor.isNull(_cursorIndexOfCreatedAt)) {
              _tmpCreatedAt = null;
            } else {
              _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            }
            final Long _tmpModifiedAt;
            if (_cursor.isNull(_cursorIndexOfModifiedAt)) {
              _tmpModifiedAt = null;
            } else {
              _tmpModifiedAt = _cursor.getLong(_cursorIndexOfModifiedAt);
            }
            final int _tmpProductId;
            _tmpProductId = _cursor.getInt(_cursorIndexOfProductId);
            final int _tmpQuantity;
            _tmpQuantity = _cursor.getInt(_cursorIndexOfQuantity);
            final Integer _tmpVariationId;
            if (_cursor.isNull(_cursorIndexOfVariationId)) {
              _tmpVariationId = null;
            } else {
              _tmpVariationId = _cursor.getInt(_cursorIndexOfVariationId);
            }
            final String _tmpProductName;
            _tmpProductName = _cursor.getString(_cursorIndexOfProductName);
            final String _tmpProductPrice;
            _tmpProductPrice = _cursor.getString(_cursorIndexOfProductPrice);
            final String _tmpProductImage;
            _tmpProductImage = _cursor.getString(_cursorIndexOfProductImage);
            _item = new CartItemEntity(_tmpId,_tmpCreatedAt,_tmpModifiedAt,_tmpProductId,_tmpQuantity,_tmpVariationId,_tmpProductName,_tmpProductPrice,_tmpProductImage);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<Integer> count() {
    final String _sql = "SELECT COUNT(*) FROM cart_item";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"cart_item"}, false, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<Boolean> exists(final int productId) {
    final String _sql = "SELECT COUNT(*) FROM cart_item where product_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, productId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"cart_item"}, false, new Callable<Boolean>() {
      @Override
      public Boolean call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Boolean _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp == null ? null : _tmp != 0;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<CartItemEntity> get(final int id) {
    final String _sql = "SELECT * FROM cart_item WHERE id =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[]{"cart_item"}, false, new Callable<CartItemEntity>() {
      @Override
      public CartItemEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfModifiedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "modified_at");
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "product_id");
          final int _cursorIndexOfQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "quantity");
          final int _cursorIndexOfVariationId = CursorUtil.getColumnIndexOrThrow(_cursor, "variation_id");
          final int _cursorIndexOfProductName = CursorUtil.getColumnIndexOrThrow(_cursor, "product_name");
          final int _cursorIndexOfProductPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "product_price");
          final int _cursorIndexOfProductImage = CursorUtil.getColumnIndexOrThrow(_cursor, "product_image");
          final CartItemEntity _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final Long _tmpCreatedAt;
            if (_cursor.isNull(_cursorIndexOfCreatedAt)) {
              _tmpCreatedAt = null;
            } else {
              _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            }
            final Long _tmpModifiedAt;
            if (_cursor.isNull(_cursorIndexOfModifiedAt)) {
              _tmpModifiedAt = null;
            } else {
              _tmpModifiedAt = _cursor.getLong(_cursorIndexOfModifiedAt);
            }
            final int _tmpProductId;
            _tmpProductId = _cursor.getInt(_cursorIndexOfProductId);
            final int _tmpQuantity;
            _tmpQuantity = _cursor.getInt(_cursorIndexOfQuantity);
            final Integer _tmpVariationId;
            if (_cursor.isNull(_cursorIndexOfVariationId)) {
              _tmpVariationId = null;
            } else {
              _tmpVariationId = _cursor.getInt(_cursorIndexOfVariationId);
            }
            final String _tmpProductName;
            _tmpProductName = _cursor.getString(_cursorIndexOfProductName);
            final String _tmpProductPrice;
            _tmpProductPrice = _cursor.getString(_cursorIndexOfProductPrice);
            final String _tmpProductImage;
            _tmpProductImage = _cursor.getString(_cursorIndexOfProductImage);
            _result = new CartItemEntity(_tmpId,_tmpCreatedAt,_tmpModifiedAt,_tmpProductId,_tmpQuantity,_tmpVariationId,_tmpProductName,_tmpProductPrice,_tmpProductImage);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
