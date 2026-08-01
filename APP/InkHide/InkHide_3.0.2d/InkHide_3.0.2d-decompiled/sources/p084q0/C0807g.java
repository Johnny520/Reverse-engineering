package p084q0;

import android.content.Context;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import p001A0.C0051x;
import p027N0.AbstractC0223g;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0514f;
import p062e0.InterfaceC0551a;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: q0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0807g implements InterfaceC0551a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p062e0.InterfaceC0551a
    public final void handleHook(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        boolean z2 = AbstractC1126i.f3786a;
        if (C1124g.m2435k().getViewWxDbPw()) {
            ClassLoader classLoader = AbstractC0503h.m991x().getClassLoader();
            AbstractC0223g.m418e(classLoader, "classLoader");
            AbstractC0514f.m1025b(AbstractC0514f.f1622b.mo1021l(classLoader, "com.tencent.wcdb.database.SQLiteDatabase"), "openDatabase", "java.lang.String", "[B", "com.tencent.wcdb.database.SQLiteCipherSpec", "com.tencent.wcdb.database.SQLiteDatabase$CursorFactory", "int", "com.tencent.wcdb.DatabaseErrorHandler", "int", new C0051x(2));
        }
    }
}
