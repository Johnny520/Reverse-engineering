package p000a;

import java.io.Serializable;

/* JADX INFO: renamed from: a.E2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0077E2 implements InterfaceC0745o9, Serializable {

    /* JADX INFO: renamed from: a */
    public transient InterfaceC0745o9 f250a;

    /* JADX INFO: renamed from: b */
    public final Object f251b;

    /* JADX INFO: renamed from: c */
    public final Class f252c;

    /* JADX INFO: renamed from: d */
    public final String f253d;

    /* JADX INFO: renamed from: e */
    public final String f254e;

    /* JADX INFO: renamed from: f */
    public final boolean f255f;

    /* JADX INFO: renamed from: a.E2$a */
    public static class a implements Serializable {

        /* JADX INFO: renamed from: a */
        public static final a f256a = new a();
    }

    public AbstractC0077E2(Object obj, Class cls, String str, String str2, boolean z) {
        this.f251b = obj;
        this.f252c = cls;
        this.f253d = str;
        this.f254e = str2;
        this.f255f = z;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC0473a3 m205c() {
        Class cls = this.f252c;
        if (cls == null) {
            return null;
        }
        if (this.f255f) {
            C0356Tc.f1350a.getClass();
            return new C0672kc(cls);
        }
        C0356Tc.f1350a.getClass();
        return new C0568f3(cls);
    }
}
