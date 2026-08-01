package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class wu {
    public final android.content.Context a;
    public final defpackage.ku b;
    public final boolean c;
    public final int d;
    public android.view.View e;
    public int f;
    public boolean g;
    public defpackage.cv h;
    public defpackage.tu i;
    public android.widget.PopupWindow.OnDismissListener j;
    public final defpackage.uu k;

    public wu(android.content.Context r1, defpackage.ku r2, android.view.View r3, boolean r4, int r5, int r6) {
            r0 = this;
            r0.<init>()
            r6 = 8388611(0x800003, float:1.1754948E-38)
            r0.f = r6
            uu r6 = new uu
            r6.<init>(r0)
            r0.k = r6
            r0.a = r1
            r0.b = r2
            r0.e = r3
            r0.c = r4
            r0.d = r5
            return
    }

    public final defpackage.tu a() {
            r11 = this;
            tu r0 = r11.i
            if (r0 != 0) goto L6b
            java.lang.String r0 = "window"
            android.content.Context r1 = r11.a
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            defpackage.vu.a(r0, r2)
            int r0 = r2.x
            int r2 = r2.y
            int r0 = java.lang.Math.min(r0, r2)
            android.content.res.Resources r2 = r1.getResources()
            r3 = 2131165206(0x7f070016, float:1.7944623E38)
            int r2 = r2.getDimensionPixelSize(r3)
            if (r0 < r2) goto L3b
            t8 r0 = new t8
            android.view.View r2 = r11.e
            int r3 = r11.d
            boolean r4 = r11.c
            r0.<init>(r1, r2, r3, r4)
            goto L4b
        L3b:
            q40 r5 = new q40
            android.view.View r8 = r11.e
            int r9 = r11.d
            boolean r10 = r11.c
            android.content.Context r6 = r11.a
            ku r7 = r11.b
            r5.<init>(r6, r7, r8, r9, r10)
            r0 = r5
        L4b:
            ku r1 = r11.b
            r0.l(r1)
            uu r1 = r11.k
            r0.r(r1)
            android.view.View r1 = r11.e
            r0.n(r1)
            cv r1 = r11.h
            r0.e(r1)
            boolean r1 = r11.g
            r0.o(r1)
            int r1 = r11.f
            r0.p(r1)
            r11.i = r0
        L6b:
            tu r0 = r11.i
            return r0
    }

    public final boolean b() {
            r1 = this;
            tu r0 = r1.i
            if (r0 == 0) goto Lc
            boolean r0 = r0.b()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public void c() {
            r1 = this;
            r0 = 0
            r1.i = r0
            android.widget.PopupWindow$OnDismissListener r0 = r1.j
            if (r0 == 0) goto La
            r0.onDismiss()
        La:
            return
    }

    public final void d(int r4, int r5, boolean r6, boolean r7) {
            r3 = this;
            tu r0 = r3.a()
            r0.s(r7)
            if (r6 == 0) goto L49
            int r6 = r3.f
            android.view.View r7 = r3.e
            java.util.WeakHashMap r1 = defpackage.ja0.a
            int r7 = defpackage.t90.d(r7)
            int r6 = android.view.Gravity.getAbsoluteGravity(r6, r7)
            r6 = r6 & 7
            r7 = 5
            if (r6 != r7) goto L23
            android.view.View r6 = r3.e
            int r6 = r6.getWidth()
            int r4 = r4 - r6
        L23:
            r0.q(r4)
            r0.t(r5)
            android.content.Context r6 = r3.a
            android.content.res.Resources r6 = r6.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            r7 = 1111490560(0x42400000, float:48.0)
            float r6 = r6 * r7
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r7
            int r6 = (int) r6
            android.graphics.Rect r7 = new android.graphics.Rect
            int r1 = r4 - r6
            int r2 = r5 - r6
            int r4 = r4 + r6
            int r5 = r5 + r6
            r7.<init>(r1, r2, r4, r5)
            r0.a = r7
        L49:
            r0.f()
            return
    }
}
