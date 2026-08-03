package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView.l f1014a;
    public int b;
    public final android.graphics.Rect c;

    public s(androidx.recyclerview.widget.RecyclerView.l r2) {
            r1 = this;
            r1.<init>()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.b = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.c = r0
            r1.f1014a = r2
            return
    }

    public static androidx.recyclerview.widget.s a(androidx.recyclerview.widget.RecyclerView.l r1, int r2) {
            if (r2 == 0) goto L13
            r0 = 1
            if (r2 != r0) goto Lb
            androidx.recyclerview.widget.r r2 = new androidx.recyclerview.widget.r
            r2.<init>(r1)
            return r2
        Lb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "invalid orientation"
            r1.<init>(r2)
            throw r1
        L13:
            androidx.recyclerview.widget.q r2 = new androidx.recyclerview.widget.q
            r2.<init>(r1)
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
