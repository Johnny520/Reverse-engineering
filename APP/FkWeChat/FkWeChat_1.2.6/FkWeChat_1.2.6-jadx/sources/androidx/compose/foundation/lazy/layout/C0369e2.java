package androidx.compose.foundation.lazy.layout;

import p117i.AbstractC3044c1;
import p117i.C3082r0;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.e2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0369e2 {

    /* JADX INFO: renamed from: a */
    public final C3082r0 f1089a = AbstractC3044c1.m11262b();

    /* JADX INFO: renamed from: b */
    public Object f1090b;

    /* JADX INFO: renamed from: c */
    public C0358c f1091c;

    /* JADX INFO: renamed from: a */
    public final C0358c m1195a(Object obj) {
        C0358c c0358c = this.f1091c;
        if (this.f1090b == obj && c0358c != null) {
            return c0358c;
        }
        C3082r0 c3082r0 = this.f1089a;
        Object objM11238e = c3082r0.m11238e(obj);
        if (objM11238e == null) {
            objM11238e = new C0358c();
            c3082r0.m11529x(obj, objM11238e);
        }
        C0358c c0358c2 = (C0358c) objM11238e;
        this.f1090b = obj;
        this.f1091c = c0358c2;
        return c0358c2;
    }
}
