package com.ss.android.ugc.awemes;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class MainApp extends android.app.Application {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final java.util.concurrent.CopyOnWriteArraySet f423 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static volatile defpackage.C1851 f424;

    static {
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            com.ss.android.ugc.awemes.MainApp.f423 = r0
            return
    }

    public MainApp() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context r4) {
            r3 = this;
            r0 = -830410736442926(0xfffd0cbeef0961d2, double:NaN)
            r0 = -830432211279406(0xfffd0cb9ef0961d2, double:NaN)
            java.lang.String r0 = "native"
            java.lang.System.loadLibrary(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 3
            r0.<init>(r1)
            r1 = -830462276050478(0xfffd0cb2ef0961d2, double:NaN)
            java.lang.String r1 = "0x106"
            r0.add(r1)
            android.content.pm.ApplicationInfo r1 = r4.getApplicationInfo()
            java.lang.String r1 = r1.dataDir
            r0.add(r1)
            r3.e(r0)
            super.attachBaseContext(r4)
            return
    }

    public final native java.lang.Object e(java.lang.Object r1);

    @Override // android.app.Application
    public final void onCreate() {
            r0 = this;
            super.onCreate()
            defpackage.AbstractC2338.m3818(r0)     // Catch: java.lang.Throwable -> L6
        L6:
            return
    }
}
