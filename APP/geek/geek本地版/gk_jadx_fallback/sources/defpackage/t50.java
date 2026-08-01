package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class t50 {
    public int a;
    public int b;
    public int c;
    public java.lang.Object d;

    public t50() {
            r2 = this;
            r2.<init>()
            iy r0 = defpackage.iy.b
            if (r0 != 0) goto L10
            iy r0 = new iy
            r1 = 11
            r0.<init>(r1)
            defpackage.iy.b = r0
        L10:
            return
    }

    public int a(int r3) {
            r2 = this;
            int r0 = r2.c
            if (r3 >= r0) goto L10
            java.lang.Object r0 = r2.d
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r1 = r2.b
            int r1 = r1 + r3
            short r3 = r0.getShort(r1)
            return r3
        L10:
            r3 = 0
            return r3
    }

    public abstract java.lang.Object b(android.view.View r1);

    public abstract void c(android.view.View r1, java.lang.Object r2);

    public void d(android.view.View r3, java.lang.Object r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            int r1 = r2.b
            if (r0 < r1) goto La
            r2.c(r3, r4)
            return
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            int r1 = r2.b
            if (r0 < r1) goto L15
            java.lang.Object r0 = r2.b(r3)
            goto L27
        L15:
            int r0 = r2.a
            java.lang.Object r0 = r3.getTag(r0)
            java.lang.Object r1 = r2.d
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r1 = r1.isInstance(r0)
            if (r1 == 0) goto L26
            goto L27
        L26:
            r0 = 0
        L27:
            boolean r0 = r2.e(r0, r4)
            if (r0 == 0) goto L58
            android.view.View$AccessibilityDelegate r0 = defpackage.ja0.c(r3)
            if (r0 != 0) goto L35
            r0 = 0
            goto L44
        L35:
            boolean r1 = r0 instanceof defpackage.v
            if (r1 == 0) goto L3e
            v r0 = (defpackage.v) r0
            x r0 = r0.a
            goto L44
        L3e:
            x r1 = new x
            r1.<init>(r0)
            r0 = r1
        L44:
            if (r0 != 0) goto L4b
            x r0 = new x
            r0.<init>()
        L4b:
            defpackage.ja0.l(r3, r0)
            int r0 = r2.a
            r3.setTag(r0, r4)
            int r4 = r2.c
            defpackage.ja0.g(r3, r4)
        L58:
            return
    }

    public abstract boolean e(java.lang.Object r1, java.lang.Object r2);
}
