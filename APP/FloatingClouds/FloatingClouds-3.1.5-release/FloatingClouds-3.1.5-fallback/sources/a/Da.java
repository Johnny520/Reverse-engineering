package a;

/* JADX INFO: loaded from: classes.dex */
public final class Da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.material.button.MaterialButton f59a;
    public a.Vd b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public android.graphics.PorterDuff.Mode i;
    public android.content.res.ColorStateList j;
    public android.content.res.ColorStateList k;
    public android.content.res.ColorStateList l;
    public a.Ta m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public android.graphics.drawable.RippleDrawable s;
    public int t;

    public Da(com.google.android.material.button.MaterialButton r2, a.Vd r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.n = r0
            r1.o = r0
            r1.p = r0
            r0 = 1
            r1.r = r0
            r1.f59a = r2
            r1.b = r3
            return
    }

    public final a.Zd a() {
            r3 = this;
            android.graphics.drawable.RippleDrawable r0 = r3.s
            if (r0 == 0) goto L26
            int r0 = r0.getNumberOfLayers()
            r1 = 1
            if (r0 <= r1) goto L26
            android.graphics.drawable.RippleDrawable r0 = r3.s
            int r0 = r0.getNumberOfLayers()
            r2 = 2
            if (r0 <= r2) goto L1d
            android.graphics.drawable.RippleDrawable r0 = r3.s
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r2)
            a.Zd r0 = (a.Zd) r0
            return r0
        L1d:
            android.graphics.drawable.RippleDrawable r0 = r3.s
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            a.Zd r0 = (a.Zd) r0
            return r0
        L26:
            r0 = 0
            return r0
    }

    public final a.Ta b(boolean r3) {
            r2 = this;
            android.graphics.drawable.RippleDrawable r0 = r2.s
            if (r0 == 0) goto L22
            int r0 = r0.getNumberOfLayers()
            if (r0 <= 0) goto L22
            android.graphics.drawable.RippleDrawable r0 = r2.s
            r1 = 0
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            android.graphics.drawable.InsetDrawable r0 = (android.graphics.drawable.InsetDrawable) r0
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            android.graphics.drawable.LayerDrawable r0 = (android.graphics.drawable.LayerDrawable) r0
            r3 = r3 ^ 1
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            a.Ta r3 = (a.Ta) r3
            return r3
        L22:
            r3 = 0
            return r3
    }

    public final void c(a.Vd r3) {
            r2 = this;
            r2.b = r3
            r0 = 0
            a.Ta r1 = r2.b(r0)
            if (r1 == 0) goto L10
            a.Ta r0 = r2.b(r0)
            r0.setShapeAppearanceModel(r3)
        L10:
            r0 = 1
            a.Ta r1 = r2.b(r0)
            if (r1 == 0) goto L1e
            a.Ta r0 = r2.b(r0)
            r0.setShapeAppearanceModel(r3)
        L1e:
            a.Zd r0 = r2.a()
            if (r0 == 0) goto L2b
            a.Zd r0 = r2.a()
            r0.setShapeAppearanceModel(r3)
        L2b:
            return
    }

    public final void d(int r9, int r10) {
            r8 = this;
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            com.google.android.material.button.MaterialButton r0 = r8.f59a
            int r1 = r0.getPaddingStart()
            int r2 = r0.getPaddingTop()
            int r3 = r0.getPaddingEnd()
            int r4 = r0.getPaddingBottom()
            int r5 = r8.e
            int r6 = r8.f
            r8.f = r10
            r8.e = r9
            boolean r7 = r8.o
            if (r7 != 0) goto L23
            r8.e()
        L23:
            int r2 = r2 + r9
            int r2 = r2 - r5
            int r4 = r4 + r10
            int r4 = r4 - r6
            r0.setPaddingRelative(r1, r2, r3, r4)
            return
    }

    public final void e() {
            r12 = this;
            r0 = 0
            a.Ta r1 = new a.Ta
            a.Vd r2 = r12.b
            r1.<init>(r2)
            com.google.android.material.button.MaterialButton r2 = r12.f59a
            android.content.Context r3 = r2.getContext()
            r1.i(r3)
            android.content.res.ColorStateList r3 = r12.j
            a.C0439w5.a.h(r1, r3)
            android.graphics.PorterDuff$Mode r3 = r12.i
            if (r3 == 0) goto L1d
            a.C0439w5.a.i(r1, r3)
        L1d:
            int r3 = r12.h
            float r3 = (float) r3
            android.content.res.ColorStateList r4 = r12.k
            a.Ta$b r5 = r1.f278a
            r5.j = r3
            r1.invalidateSelf()
            a.Ta$b r3 = r1.f278a
            android.content.res.ColorStateList r5 = r3.d
            if (r5 == r4) goto L38
            r3.d = r4
            int[] r3 = r1.getState()
            r1.onStateChange(r3)
        L38:
            a.Ta r3 = new a.Ta
            a.Vd r4 = r12.b
            r3.<init>(r4)
            r3.setTint(r0)
            int r4 = r12.h
            float r4 = (float) r4
            boolean r5 = r12.n
            if (r5 == 0) goto L50
            int r5 = com.google.android.material.R.attr.colorSurface
            int r5 = a.Na.b(r2, r5)
            goto L51
        L50:
            r5 = r0
        L51:
            a.Ta$b r6 = r3.f278a
            r6.j = r4
            r3.invalidateSelf()
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r5)
            a.Ta$b r5 = r3.f278a
            android.content.res.ColorStateList r6 = r5.d
            if (r6 == r4) goto L6b
            r5.d = r4
            int[] r4 = r3.getState()
            r3.onStateChange(r4)
        L6b:
            a.Ta r4 = new a.Ta
            a.Vd r5 = r12.b
            r4.<init>(r5)
            r12.m = r4
            r5 = -1
            a.C0439w5.a.g(r4, r5)
            android.graphics.drawable.RippleDrawable r4 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r5 = r12.l
            if (r5 == 0) goto L7f
            goto L83
        L7f:
            android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r0)
        L83:
            android.graphics.drawable.LayerDrawable r7 = new android.graphics.drawable.LayerDrawable
            r6 = 2
            android.graphics.drawable.Drawable[] r6 = new android.graphics.drawable.Drawable[r6]
            r6[r0] = r3
            r3 = 1
            r6[r3] = r1
            r7.<init>(r6)
            android.graphics.drawable.InsetDrawable r6 = new android.graphics.drawable.InsetDrawable
            int r8 = r12.c
            int r9 = r12.e
            int r10 = r12.d
            int r11 = r12.f
            r6.<init>(r7, r8, r9, r10, r11)
            a.Ta r1 = r12.m
            r4.<init>(r5, r6, r1)
            r12.s = r4
            r2.setInternalBackground(r4)
            a.Ta r0 = r12.b(r0)
            if (r0 == 0) goto Lba
            int r1 = r12.t
            float r1 = (float) r1
            r0.j(r1)
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        Lba:
            return
    }

    public final void f() {
            r6 = this;
            r0 = 0
            a.Ta r1 = r6.b(r0)
            r2 = 1
            a.Ta r2 = r6.b(r2)
            if (r1 == 0) goto L52
            int r3 = r6.h
            float r3 = (float) r3
            android.content.res.ColorStateList r4 = r6.k
            a.Ta$b r5 = r1.f278a
            r5.j = r3
            r1.invalidateSelf()
            a.Ta$b r3 = r1.f278a
            android.content.res.ColorStateList r5 = r3.d
            if (r5 == r4) goto L27
            r3.d = r4
            int[] r3 = r1.getState()
            r1.onStateChange(r3)
        L27:
            if (r2 == 0) goto L52
            int r1 = r6.h
            float r1 = (float) r1
            boolean r3 = r6.n
            if (r3 == 0) goto L38
            com.google.android.material.button.MaterialButton r0 = r6.f59a
            int r3 = com.google.android.material.R.attr.colorSurface
            int r0 = a.Na.b(r0, r3)
        L38:
            a.Ta$b r3 = r2.f278a
            r3.j = r1
            r2.invalidateSelf()
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            a.Ta$b r1 = r2.f278a
            android.content.res.ColorStateList r3 = r1.d
            if (r3 == r0) goto L52
            r1.d = r0
            int[] r0 = r2.getState()
            r2.onStateChange(r0)
        L52:
            return
    }
}
