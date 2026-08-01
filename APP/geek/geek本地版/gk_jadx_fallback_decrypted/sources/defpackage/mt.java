package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mt {
    public final com.google.android.material.button.MaterialButton a;
    public defpackage.f30 b;
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
    public defpackage.eu m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public android.graphics.drawable.RippleDrawable s;
    public int t;

    public mt(com.google.android.material.button.MaterialButton r2, defpackage.f30 r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.n = r0
            r1.o = r0
            r1.p = r0
            r0 = 1
            r1.r = r0
            r1.a = r2
            r1.b = r3
            return
    }

    public final defpackage.q30 a() {
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
            q30 r0 = (defpackage.q30) r0
            return r0
        L1d:
            android.graphics.drawable.RippleDrawable r0 = r3.s
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            q30 r0 = (defpackage.q30) r0
            return r0
        L26:
            r0 = 0
            return r0
    }

    public final defpackage.eu b(boolean r3) {
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
            eu r3 = (defpackage.eu) r3
            return r3
        L22:
            r3 = 0
            return r3
    }

    public final void c(defpackage.f30 r3) {
            r2 = this;
            r2.b = r3
            r0 = 0
            eu r1 = r2.b(r0)
            if (r1 == 0) goto L10
            eu r0 = r2.b(r0)
            r0.setShapeAppearanceModel(r3)
        L10:
            r0 = 1
            eu r1 = r2.b(r0)
            if (r1 == 0) goto L1e
            eu r0 = r2.b(r0)
            r0.setShapeAppearanceModel(r3)
        L1e:
            q30 r0 = r2.a()
            if (r0 == 0) goto L2b
            q30 r0 = r2.a()
            r0.setShapeAppearanceModel(r3)
        L2b:
            return
    }

    public final void d(int r9, int r10) {
            r8 = this;
            java.util.WeakHashMap r0 = defpackage.ja0.a
            com.google.android.material.button.MaterialButton r0 = r8.a
            int r1 = defpackage.t90.f(r0)
            int r2 = r0.getPaddingTop()
            int r3 = defpackage.t90.e(r0)
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
            defpackage.t90.k(r0, r1, r2, r3, r4)
            return
    }

    public final void e() {
            r12 = this;
            eu r0 = new eu
            f30 r1 = r12.b
            r0.<init>(r1)
            com.google.android.material.button.MaterialButton r1 = r12.a
            android.content.Context r2 = r1.getContext()
            r0.h(r2)
            android.content.res.ColorStateList r2 = r12.j
            defpackage.ch.h(r0, r2)
            android.graphics.PorterDuff$Mode r2 = r12.i
            if (r2 == 0) goto L1c
            defpackage.ch.i(r0, r2)
        L1c:
            int r2 = r12.h
            float r2 = (float) r2
            android.content.res.ColorStateList r3 = r12.k
            du r4 = r0.a
            r4.j = r2
            r0.invalidateSelf()
            du r2 = r0.a
            android.content.res.ColorStateList r4 = r2.d
            if (r4 == r3) goto L37
            r2.d = r3
            int[] r2 = r0.getState()
            r0.onStateChange(r2)
        L37:
            eu r2 = new eu
            f30 r3 = r12.b
            r2.<init>(r3)
            r3 = 0
            r2.setTint(r3)
            int r4 = r12.h
            float r4 = (float) r4
            boolean r5 = r12.n
            if (r5 == 0) goto L51
            r5 = 2130968841(0x7f040109, float:1.7546347E38)
            int r5 = defpackage.zt.k(r1, r5)
            goto L52
        L51:
            r5 = r3
        L52:
            du r6 = r2.a
            r6.j = r4
            r2.invalidateSelf()
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r5)
            du r5 = r2.a
            android.content.res.ColorStateList r6 = r5.d
            if (r6 == r4) goto L6c
            r5.d = r4
            int[] r4 = r2.getState()
            r2.onStateChange(r4)
        L6c:
            eu r4 = new eu
            f30 r5 = r12.b
            r4.<init>(r5)
            r12.m = r4
            r5 = -1
            defpackage.ch.g(r4, r5)
            android.graphics.drawable.RippleDrawable r4 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r5 = r12.l
            android.content.res.ColorStateList r5 = defpackage.g10.a(r5)
            android.graphics.drawable.LayerDrawable r7 = new android.graphics.drawable.LayerDrawable
            r6 = 2
            android.graphics.drawable.Drawable[] r6 = new android.graphics.drawable.Drawable[r6]
            r6[r3] = r2
            r2 = 1
            r6[r2] = r0
            r7.<init>(r6)
            android.graphics.drawable.InsetDrawable r6 = new android.graphics.drawable.InsetDrawable
            int r8 = r12.c
            int r9 = r12.e
            int r10 = r12.d
            int r11 = r12.f
            r6.<init>(r7, r8, r9, r10, r11)
            eu r0 = r12.m
            r4.<init>(r5, r6, r0)
            r12.s = r4
            r1.setInternalBackground(r4)
            eu r0 = r12.b(r3)
            if (r0 == 0) goto Lb8
            int r2 = r12.t
            float r2 = (float) r2
            r0.i(r2)
            int[] r1 = r1.getDrawableState()
            r0.setState(r1)
        Lb8:
            return
    }

    public final void f() {
            r6 = this;
            r0 = 0
            eu r1 = r6.b(r0)
            r2 = 1
            eu r2 = r6.b(r2)
            if (r1 == 0) goto L53
            int r3 = r6.h
            float r3 = (float) r3
            android.content.res.ColorStateList r4 = r6.k
            du r5 = r1.a
            r5.j = r3
            r1.invalidateSelf()
            du r3 = r1.a
            android.content.res.ColorStateList r5 = r3.d
            if (r5 == r4) goto L27
            r3.d = r4
            int[] r3 = r1.getState()
            r1.onStateChange(r3)
        L27:
            if (r2 == 0) goto L53
            int r1 = r6.h
            float r1 = (float) r1
            boolean r3 = r6.n
            if (r3 == 0) goto L39
            com.google.android.material.button.MaterialButton r0 = r6.a
            r3 = 2130968841(0x7f040109, float:1.7546347E38)
            int r0 = defpackage.zt.k(r0, r3)
        L39:
            du r3 = r2.a
            r3.j = r1
            r2.invalidateSelf()
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            du r1 = r2.a
            android.content.res.ColorStateList r3 = r1.d
            if (r3 == r0) goto L53
            r1.d = r0
            int[] r0 = r2.getState()
            r2.onStateChange(r0)
        L53:
            return
    }
}
