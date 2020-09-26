package me.gilo.woodroid.offlinecart.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000fJ\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f2\u0006\u0010\u0016\u001a\u00020\u0011J\u000e\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lme/gilo/woodroid/offlinecart/repo/RoomCartRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "appDatabase", "Lme/gilo/woodroid/offlinecart/db/AppDatabase;", "getContext", "()Landroid/content/Context;", "addToCart", "", "cartItem", "Lme/gilo/woodroid/core/cart/CartItem;", "cart", "Lme/gilo/woodroid/core/cart/Cart;", "Landroidx/lifecycle/LiveData;", "id", "", "count", "delete", "exists", "", "productId", "update", "offlinecart_debug"})
public final class RoomCartRepository {
    private final me.gilo.woodroid.offlinecart.db.AppDatabase appDatabase = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    public final void addToCart(@org.jetbrains.annotations.NotNull()
    me.gilo.woodroid.core.cart.CartItem cartItem) {
    }
    
    public final void update(@org.jetbrains.annotations.NotNull()
    me.gilo.woodroid.core.cart.CartItem cartItem) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> count() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> exists(int productId) {
        return null;
    }
    
    public final void delete(@org.jetbrains.annotations.NotNull()
    me.gilo.woodroid.core.cart.CartItem cartItem) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<me.gilo.woodroid.core.cart.CartItem> cartItem(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final me.gilo.woodroid.core.cart.Cart cart() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public RoomCartRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}