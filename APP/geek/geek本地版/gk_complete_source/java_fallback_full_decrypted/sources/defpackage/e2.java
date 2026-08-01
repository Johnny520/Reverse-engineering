package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e2 {
    public final android.content.Context a;
    public final defpackage.g2 b;
    public final android.view.Window c;
    public java.lang.CharSequence d;
    public androidx.appcompat.app.AlertController$RecycleListView e;
    public android.widget.Button f;
    public android.widget.Button g;
    public android.widget.Button h;
    public androidx.core.widget.NestedScrollView i;
    public android.graphics.drawable.Drawable j;
    public android.widget.ImageView k;
    public android.widget.TextView l;
    public android.widget.TextView m;
    public android.view.View n;
    public android.widget.ListAdapter o;
    public int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final boolean u;
    public final defpackage.c2 v;
    public final defpackage.x0 w;

    public e2(android.content.Context r4, defpackage.g2 r5, android.view.Window r6) {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.p = r0
            x0 r0 = new x0
            r1 = 1
            r0.<init>(r1, r3)
            r3.w = r0
            r3.a = r4
            r3.b = r5
            r3.c = r6
            c2 r6 = new c2
            r6.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r5)
            r6.a = r0
            r3.v = r6
            int[] r6 = defpackage.xy.e
            r0 = 2130968617(0x7f040029, float:1.7545893E38)
            r1 = 0
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r1, r6, r0, r2)
            int r6 = r4.getResourceId(r2, r2)
            r3.q = r6
            r6 = 2
            r4.getResourceId(r6, r2)
            r6 = 4
            int r6 = r4.getResourceId(r6, r2)
            r3.r = r6
            r6 = 5
            r4.getResourceId(r6, r2)
            r6 = 7
            int r6 = r4.getResourceId(r6, r2)
            r3.s = r6
            r6 = 3
            int r6 = r4.getResourceId(r6, r2)
            r3.t = r6
            r6 = 6
            r0 = 1
            boolean r6 = r4.getBoolean(r6, r0)
            r3.u = r6
            r4.getDimensionPixelSize(r0, r2)
            r4.recycle()
            e3 r4 = r5.c()
            r4.g(r0)
            return
    }

    public static android.view.ViewGroup a(android.view.View r2, android.view.View r3) {
            if (r2 != 0) goto Lf
            boolean r2 = r3 instanceof android.view.ViewStub
            if (r2 == 0) goto Lc
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            android.view.View r3 = r3.inflate()
        Lc:
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            return r3
        Lf:
            if (r3 == 0) goto L1e
            android.view.ViewParent r0 = r3.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L1e
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r3)
        L1e:
            boolean r3 = r2 instanceof android.view.ViewStub
            if (r3 == 0) goto L28
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            android.view.View r2 = r2.inflate()
        L28:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            return r2
    }
}
