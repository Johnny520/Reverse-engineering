package top.mmjz.floatingclouds;

import android.app.Application;
import p000a.C0889w1;

/* JADX INFO: loaded from: classes.dex */
public final class App extends Application {
    public static final C1328a Companion = new C1328a();
    public static App instance;

    /* JADX INFO: renamed from: top.mmjz.floatingclouds.App$a */
    public static final class C1328a {
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        C0889w1.f3488p = this;
        C0889w1.m2118D(this);
        Companion.getClass();
        instance = this;
    }
}
