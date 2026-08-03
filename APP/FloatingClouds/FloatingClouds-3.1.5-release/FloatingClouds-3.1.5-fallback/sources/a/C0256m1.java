package a;

/* JADX INFO: renamed from: a.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0256m1 extends a.C0167h1 {
    public final a.C0238l1 d;
    public android.graphics.drawable.Drawable e;
    public android.content.res.ColorStateList f;
    public android.graphics.PorterDuff.Mode g;
    public boolean h;
    public boolean i;

    public C0256m1(a.C0238l1 r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.f = r0
            r1.g = r0
            r0 = 0
            r1.h = r0
            r1.i = r0
            r1.d = r2
            return
    }

    @Override // a.C0167h1
    public final void a(android.util.AttributeSet r8, int r9) {
            r7 = this;
            super.a(r8, r9)
            a.l1 r0 = r7.d
            android.content.Context r1 = r0.getContext()
            int[] r2 = androidx.appcompat.R.styleable.AppCompatSeekBar
            a.of r6 = a.C0306of.e(r1, r8, r2, r9)
            android.content.Context r1 = r0.getContext()
            int[] r2 = androidx.appcompat.R.styleable.AppCompatSeekBar
            android.content.res.TypedArray r4 = r6.b
            r3 = r8
            r5 = r9
            a.C0414ug.i(r0, r1, r2, r3, r4, r5)
            int r8 = androidx.appcompat.R.styleable.AppCompatSeekBar_android_thumb
            android.graphics.drawable.Drawable r8 = r6.c(r8)
            if (r8 == 0) goto L27
            r0.setThumb(r8)
        L27:
            int r8 = androidx.appcompat.R.styleable.AppCompatSeekBar_tickMark
            android.graphics.drawable.Drawable r8 = r6.b(r8)
            android.graphics.drawable.Drawable r9 = r7.e
            if (r9 == 0) goto L35
            r1 = 0
            r9.setCallback(r1)
        L35:
            r7.e = r8
            if (r8 == 0) goto L53
            r8.setCallback(r0)
            int r9 = r0.getLayoutDirection()
            a.C0439w5.b.b(r8, r9)
            boolean r9 = r8.isStateful()
            if (r9 == 0) goto L50
            int[] r9 = r0.getDrawableState()
            r8.setState(r9)
        L50:
            r7.c()
        L53:
            r0.invalidate()
            int r8 = androidx.appcompat.R.styleable.AppCompatSeekBar_tickMarkTintMode
            android.content.res.TypedArray r9 = r6.b
            boolean r8 = r9.hasValue(r8)
            r0 = 1
            if (r8 == 0) goto L72
            int r8 = androidx.appcompat.R.styleable.AppCompatSeekBar_tickMarkTintMode
            r1 = -1
            int r8 = r9.getInt(r8, r1)
            android.graphics.PorterDuff$Mode r1 = r7.g
            android.graphics.PorterDuff$Mode r8 = a.C0457x5.c(r8, r1)
            r7.g = r8
            r7.i = r0
        L72:
            int r8 = androidx.appcompat.R.styleable.AppCompatSeekBar_tickMarkTint
            boolean r8 = r9.hasValue(r8)
            if (r8 == 0) goto L84
            int r8 = androidx.appcompat.R.styleable.AppCompatSeekBar_tickMarkTint
            android.content.res.ColorStateList r8 = r6.a(r8)
            r7.f = r8
            r7.h = r0
        L84:
            r6.f()
            r7.c()
            return
    }

    public final void c() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.e
            if (r0 == 0) goto L39
            boolean r1 = r2.h
            if (r1 != 0) goto Lc
            boolean r1 = r2.i
            if (r1 == 0) goto L39
        Lc:
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r2.e = r0
            boolean r1 = r2.h
            if (r1 == 0) goto L1b
            android.content.res.ColorStateList r1 = r2.f
            a.C0439w5.a.h(r0, r1)
        L1b:
            boolean r0 = r2.i
            if (r0 == 0) goto L26
            android.graphics.drawable.Drawable r0 = r2.e
            android.graphics.PorterDuff$Mode r1 = r2.g
            a.C0439w5.a.i(r0, r1)
        L26:
            android.graphics.drawable.Drawable r0 = r2.e
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L39
            android.graphics.drawable.Drawable r0 = r2.e
            a.l1 r1 = r2.d
            int[] r1 = r1.getDrawableState()
            r0.setState(r1)
        L39:
            return
    }

    public final void d(android.graphics.Canvas r8) {
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.e
            if (r0 == 0) goto L60
            a.l1 r0 = r7.d
            int r1 = r0.getMax()
            r2 = 1
            if (r1 <= r2) goto L60
            android.graphics.drawable.Drawable r3 = r7.e
            int r3 = r3.getIntrinsicWidth()
            android.graphics.drawable.Drawable r4 = r7.e
            int r4 = r4.getIntrinsicHeight()
            if (r3 < 0) goto L1e
            int r3 = r3 / 2
            goto L1f
        L1e:
            r3 = r2
        L1f:
            if (r4 < 0) goto L23
            int r2 = r4 / 2
        L23:
            android.graphics.drawable.Drawable r4 = r7.e
            int r5 = -r3
            int r6 = -r2
            r4.setBounds(r5, r6, r3, r2)
            int r2 = r0.getWidth()
            int r3 = r0.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r0.getPaddingRight()
            int r2 = r2 - r3
            float r2 = (float) r2
            float r3 = (float) r1
            float r2 = r2 / r3
            int r3 = r8.save()
            int r4 = r0.getPaddingLeft()
            float r4 = (float) r4
            int r0 = r0.getHeight()
            int r0 = r0 / 2
            float r0 = (float) r0
            r8.translate(r4, r0)
            r0 = 0
        L4f:
            if (r0 > r1) goto L5d
            android.graphics.drawable.Drawable r4 = r7.e
            r4.draw(r8)
            r4 = 0
            r8.translate(r2, r4)
            int r0 = r0 + 1
            goto L4f
        L5d:
            r8.restoreToCount(r3)
        L60:
            return
    }
}
