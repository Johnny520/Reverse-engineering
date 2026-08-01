package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class v70 {
    public static final defpackage.z6 a = null;
    public static final java.lang.ThreadLocal b = null;
    public static final java.util.ArrayList c = null;

    static {
            z6 r0 = new z6
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.w = r1
            r1 = 1
            r0.x = r1
            r1 = 0
            r0.z = r1
            r0.A = r1
            r0.x = r1
            pj r1 = new pj
            r2 = 2
            r1.<init>(r2)
            r0.F(r1)
            b9 r1 = new b9
            r1.<init>()
            r0.F(r1)
            pj r1 = new pj
            r2 = 1
            r1.<init>(r2)
            r0.F(r1)
            defpackage.v70.a = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            defpackage.v70.b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            defpackage.v70.c = r0
            return
    }

    public static void a(android.view.ViewGroup r5, defpackage.r70 r6) {
            java.util.ArrayList r0 = defpackage.v70.c
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L6f
            java.util.WeakHashMap r1 = defpackage.ja0.a
            boolean r1 = defpackage.v90.c(r5)
            if (r1 == 0) goto L6f
            r0.add(r5)
            if (r6 != 0) goto L17
            z6 r6 = defpackage.v70.a
        L17:
            r70 r6 = r6.i()
            n6 r0 = b()
            r1 = 0
            java.lang.Object r0 = r0.getOrDefault(r5, r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L41
            int r2 = r0.size()
            if (r2 <= 0) goto L41
            int r2 = r0.size()
            r3 = 0
        L33:
            if (r3 >= r2) goto L41
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            r70 r4 = (defpackage.r70) r4
            r4.t(r5)
            goto L33
        L41:
            if (r6 == 0) goto L47
            r0 = 1
            r6.g(r5, r0)
        L47:
            r0 = 2131296680(0x7f0901a8, float:1.8211284E38)
            java.lang.Object r2 = r5.getTag(r0)
            if (r2 != 0) goto L69
            r5.setTag(r0, r1)
            if (r6 == 0) goto L6f
            u70 r0 = new u70
            r0.<init>()
            r0.a = r6
            r0.b = r5
            r5.addOnAttachStateChangeListener(r0)
            android.view.ViewTreeObserver r5 = r5.getViewTreeObserver()
            r5.addOnPreDrawListener(r0)
            return
        L69:
            java.lang.ClassCastException r5 = new java.lang.ClassCastException
            r5.<init>()
            throw r5
        L6f:
            return
    }

    public static defpackage.n6 b() {
            java.lang.ThreadLocal r0 = defpackage.v70.b
            java.lang.Object r1 = r0.get()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            if (r1 == 0) goto L13
            java.lang.Object r1 = r1.get()
            n6 r1 = (defpackage.n6) r1
            if (r1 == 0) goto L13
            return r1
        L13:
            n6 r1 = new n6
            r1.<init>()
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.set(r2)
            return r1
    }
}
