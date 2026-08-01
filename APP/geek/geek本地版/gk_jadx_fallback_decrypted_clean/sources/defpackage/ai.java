package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ai {
    public int a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public ai(defpackage.di r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            mf r0 = new mf
            r0.<init>()
            r1.c = r0
            r1.b = r2
            return
    }

    public ai(defpackage.nz r2) {
            r1 = this;
            r1.<init>()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.a = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.c = r0
            r1.b = r2
            return
    }

    public static defpackage.ai a(defpackage.nz r1, int r2) {
            if (r2 == 0) goto L14
            r0 = 1
            if (r2 != r0) goto Lc
            ex r2 = new ex
            r0 = 1
            r2.<init>(r1, r0)
            return r2
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "invalid orientation"
            r1.<init>(r2)
            throw r1
        L14:
            ex r2 = new ex
            r0 = 0
            r2.<init>(r1, r0)
            return r2
    }

    public abstract int b(android.view.View r1);

    public abstract int c(android.view.View r1);

    public abstract int d(android.view.View r1);

    public abstract int e(android.view.View r1);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(android.view.View r1);

    public abstract int n(android.view.View r1);

    public abstract void o(int r1);
}
