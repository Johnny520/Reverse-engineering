package com.p055lu.wxmask;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C0464P;
import androidx.lifecycle.InterfaceC0465Q;
import p052b1.AbstractC0503h;
import p077m0.C0763a;
import p086r0.C0925n1;
import p094v0.AbstractC1027b;
import p102z0.AbstractC1121d;

/* JADX INFO: loaded from: classes.dex */
public final class App extends Application implements InterfaceC0465Q {
    public static final C0763a Companion = new C0763a();
    public static App instance;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0465Q
    public C0464P getViewModelStore() {
        return new C0464P();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        Companion.getClass();
        instance = this;
        Context applicationContext = getApplicationContext();
        if (applicationContext == null) {
            AbstractC0503h.f1600i = this;
        } else {
            AbstractC0503h.f1600i = applicationContext;
        }
        AbstractC1121d.f3779a.m2409h(false, new C0925n1(21));
        AbstractC1027b.m2222b(this);
    }
}
