package me.gilo.woodroid.offlinecart.task;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ!\u0010\t\u001a\u00020\u00032\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u000b\"\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lme/gilo/woodroid/offlinecart/task/DeleteCartItem;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "appDatabase", "Lme/gilo/woodroid/offlinecart/db/AppDatabase;", "cartItem", "Lme/gilo/woodroid/core/cart/CartItem;", "(Lme/gilo/woodroid/offlinecart/db/AppDatabase;Lme/gilo/woodroid/core/cart/CartItem;)V", "doInBackground", "voids", "", "([Ljava/lang/Void;)V", "offlinecart_debug"})
public final class DeleteCartItem extends android.os.AsyncTask<java.lang.Void, java.lang.Void, kotlin.Unit> {
    private final me.gilo.woodroid.offlinecart.db.AppDatabase appDatabase = null;
    private final me.gilo.woodroid.core.cart.CartItem cartItem = null;
    
    @java.lang.Override()
    protected void doInBackground(@org.jetbrains.annotations.NotNull()
    java.lang.Void... voids) {
    }
    
    public DeleteCartItem(@org.jetbrains.annotations.NotNull()
    me.gilo.woodroid.offlinecart.db.AppDatabase appDatabase, @org.jetbrains.annotations.NotNull()
    me.gilo.woodroid.core.cart.CartItem cartItem) {
        super();
    }
}