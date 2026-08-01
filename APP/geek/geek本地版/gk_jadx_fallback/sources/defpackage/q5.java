package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class q5 {
    public static final java.lang.Class[] b = null;
    public static final int[] c = null;
    public static final int[] d = null;
    public static final int[] e = null;
    public static final int[] f = null;
    public static final java.lang.String[] g = null;
    public static final defpackage.u30 h = null;
    public final java.lang.Object[] a;

    static {
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class<android.util.AttributeSet> r1 = android.util.AttributeSet.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r1}
            defpackage.q5.b = r0
            r0 = 16843375(0x101026f, float:2.3695304E-38)
            int[] r0 = new int[]{r0}
            defpackage.q5.c = r0
            r0 = 16844160(0x1010580, float:2.3697504E-38)
            int[] r0 = new int[]{r0}
            defpackage.q5.d = r0
            r0 = 16844156(0x101057c, float:2.3697493E-38)
            int[] r0 = new int[]{r0}
            defpackage.q5.e = r0
            r0 = 16844148(0x1010574, float:2.369747E-38)
            int[] r0 = new int[]{r0}
            defpackage.q5.f = r0
            java.lang.String r0 = "android.view."
            java.lang.String r1 = "android.webkit."
            java.lang.String r2 = "android.widget."
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            defpackage.q5.g = r0
            u30 r0 = new u30
            r0.<init>()
            defpackage.q5.h = r0
            return
    }

    public q5() {
            r1 = this;
            r1.<init>()
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.a = r0
            return
    }

    public defpackage.u2 a(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            u2 r0 = new u2
            r0.<init>(r2, r3)
            return r0
    }

    public defpackage.w2 b(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            w2 r0 = new w2
            r1 = 2130968719(0x7f04008f, float:1.75461E38)
            r0.<init>(r3, r4, r1)
            return r0
    }

    public defpackage.y2 c(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            y2 r0 = new y2
            r1 = 2130968737(0x7f0400a1, float:1.7546136E38)
            r0.<init>(r3, r4, r1)
            return r0
    }

    public defpackage.e4 d(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            e4 r0 = new e4
            r0.<init>(r2, r3)
            return r0
    }

    public defpackage.g5 e(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            g5 r0 = new g5
            r0.<init>(r2, r3)
            return r0
    }

    public final android.view.View f(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            u30 r0 = defpackage.q5.h
            r1 = 0
            java.lang.Object r2 = r0.getOrDefault(r5, r1)
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
            if (r2 != 0) goto L2b
            if (r6 == 0) goto L12
            java.lang.String r6 = r6.concat(r5)     // Catch: java.lang.Exception -> L38
            goto L13
        L12:
            r6 = r5
        L13:
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.Exception -> L38
            r2 = 0
            java.lang.Class r4 = java.lang.Class.forName(r6, r2, r4)     // Catch: java.lang.Exception -> L38
            java.lang.Class<android.view.View> r6 = android.view.View.class
            java.lang.Class r4 = r4.asSubclass(r6)     // Catch: java.lang.Exception -> L38
            java.lang.Class[] r6 = defpackage.q5.b     // Catch: java.lang.Exception -> L38
            java.lang.reflect.Constructor r2 = r4.getConstructor(r6)     // Catch: java.lang.Exception -> L38
            r0.put(r5, r2)     // Catch: java.lang.Exception -> L38
        L2b:
            r4 = 1
            r2.setAccessible(r4)     // Catch: java.lang.Exception -> L38
            java.lang.Object[] r4 = r3.a     // Catch: java.lang.Exception -> L38
            java.lang.Object r4 = r2.newInstance(r4)     // Catch: java.lang.Exception -> L38
            android.view.View r4 = (android.view.View) r4     // Catch: java.lang.Exception -> L38
            return r4
        L38:
            return r1
    }
}
