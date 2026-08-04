package com.p000ss.android.ugc.awemes;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.CopyOnWriteArraySet;
import yyds.AbstractC1174;
import yyds.AbstractC2328;
import yyds.C0207;
import yyds.C1416;
import yyds.C2713;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class MainApp extends Application {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static volatile C1416 f486;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final CopyOnWriteArraySet f487 = new CopyOnWriteArraySet();

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        AbstractC2328.m4341(-1297294444626798L);
        System.loadLibrary(AbstractC2328.m4341(-1297315919463278L));
        String str = context.getApplicationInfo().dataDir;
        AbstractC2328.m4341(-1297345984234350L);
        C0207.f1193.m859(str, new C2713(7, this));
        super.attachBaseContext(context);
    }

    /* JADX INFO: renamed from: e */
    public final native byte[] m1e(byte[] bArr);

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        try {
            AbstractC1174.m2369(this);
        } catch (Throwable unused) {
        }
    }
}
