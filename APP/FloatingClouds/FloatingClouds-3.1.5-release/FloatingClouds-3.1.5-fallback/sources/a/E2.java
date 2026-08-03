package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class E2 implements a.InterfaceC0300o9, java.io.Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient a.InterfaceC0300o9 f66a;
    public final java.lang.Object b;
    public final java.lang.Class c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final boolean f;

    public static class a implements java.io.Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a.E2.a f67a = null;

        static {
                a.E2$a r0 = new a.E2$a
                r0.<init>()
                a.E2.a.f67a = r0
                return
        }
    }

    public E2(java.lang.Object r1, java.lang.Class r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.c = r2
            r0.d = r3
            r0.e = r4
            r0.f = r5
            return
    }

    public final a.InterfaceC0041a3 c() {
            r2 = this;
            java.lang.Class r0 = r2.c
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r1 = r2.f
            if (r1 == 0) goto L15
            a.Uc r1 = a.Tc.f281a
            r1.getClass()
            a.kc r1 = new a.kc
            r1.<init>(r0)
            return r1
        L15:
            a.Uc r1 = a.Tc.f281a
            r1.getClass()
            a.f3 r1 = new a.f3
            r1.<init>(r0)
            return r1
    }
}
