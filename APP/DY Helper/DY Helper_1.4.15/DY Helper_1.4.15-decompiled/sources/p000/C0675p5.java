package p000;

/* JADX INFO: renamed from: p5 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0675p5 extends p000.C0574n5 {

    /* JADX INFO: renamed from: ι */
    public final androidx.appcompat.widget.AppCompatSeekBar f8417;

    /* JADX INFO: renamed from: κ */
    public android.graphics.drawable.Drawable f8418;

    /* JADX INFO: renamed from: λ */
    public android.content.res.ColorStateList f8419;

    /* JADX INFO: renamed from: μ */
    public android.graphics.PorterDuff.Mode f8420;

    /* JADX INFO: renamed from: ν */
    public boolean f8421;

    /* JADX INFO: renamed from: ξ */
    public boolean f8422;

    public C0675p5(androidx.appcompat.widget.AppCompatSeekBar r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            r0 = 0
            r1.f8419 = r0
            r1.f8420 = r0
            r0 = 0
            r1.f8421 = r0
            r1.f8422 = r0
            r1.f8417 = r2
            return
    }

    @Override // p000.C0574n5
    /* JADX INFO: renamed from: Κ */
    public final void mo3966(android.util.AttributeSet r10, int r11) {
            r9 = this;
            super.mo3966(r10, r11)
            androidx.appcompat.widget.AppCompatSeekBar r0 = r9.f8417
            android.content.Context r1 = r0.getContext()
            int[] r2 = p000.kk1.f5974
            m6 r7 = p000.C0538m6.m3752(r1, r10, r2, r11)
            java.lang.Object r1 = r7.f6967
            r8 = r1
            android.content.res.TypedArray r8 = (android.content.res.TypedArray) r8
            android.content.Context r1 = r0.getContext()
            java.lang.Object r3 = r7.f6967
            r4 = r3
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            java.util.WeakHashMap r3 = p000.b92.f1572
            r6 = 0
            r3 = r10
            r5 = r11
            p000.y82.m6840(r0, r1, r2, r3, r4, r5, r6)
            r10 = 0
            android.graphics.drawable.Drawable r10 = r7.m3755(r10)
            if (r10 == 0) goto L2f
            r0.setThumb(r10)
        L2f:
            r10 = 1
            android.graphics.drawable.Drawable r11 = r7.m3754(r10)
            android.graphics.drawable.Drawable r1 = r9.f8418
            if (r1 == 0) goto L3c
            r2 = 0
            r1.setCallback(r2)
        L3c:
            r9.f8418 = r11
            if (r11 == 0) goto L5a
            r11.setCallback(r0)
            int r1 = r0.getLayoutDirection()
            r11.setLayoutDirection(r1)
            boolean r1 = r11.isStateful()
            if (r1 == 0) goto L57
            int[] r1 = r0.getDrawableState()
            r11.setState(r1)
        L57:
            r9.m4381()
        L5a:
            r0.invalidate()
            r11 = 3
            boolean r0 = r8.hasValue(r11)
            if (r0 == 0) goto L73
            r0 = -1
            int r11 = r8.getInt(r11, r0)
            android.graphics.PorterDuff$Mode r0 = r9.f8420
            android.graphics.PorterDuff$Mode r11 = p000.AbstractC0300fw.m2207(r11, r0)
            r9.f8420 = r11
            r9.f8422 = r10
        L73:
            r11 = 2
            boolean r0 = r8.hasValue(r11)
            if (r0 == 0) goto L82
            android.content.res.ColorStateList r11 = r7.m3790(r11)
            r9.f8419 = r11
            r9.f8421 = r10
        L82:
            r7.m3765()
            r9.m4381()
            return
    }

    /* JADX INFO: renamed from: Ω */
    public final void m4381() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f8418
            if (r0 == 0) goto L39
            boolean r1 = r2.f8421
            if (r1 != 0) goto Lc
            boolean r1 = r2.f8422
            if (r1 == 0) goto L39
        Lc:
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r2.f8418 = r0
            boolean r1 = r2.f8421
            if (r1 == 0) goto L1b
            android.content.res.ColorStateList r1 = r2.f8419
            r0.setTintList(r1)
        L1b:
            boolean r0 = r2.f8422
            if (r0 == 0) goto L26
            android.graphics.drawable.Drawable r0 = r2.f8418
            android.graphics.PorterDuff$Mode r1 = r2.f8420
            r0.setTintMode(r1)
        L26:
            android.graphics.drawable.Drawable r0 = r2.f8418
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L39
            android.graphics.drawable.Drawable r0 = r2.f8418
            androidx.appcompat.widget.AppCompatSeekBar r2 = r2.f8417
            int[] r2 = r2.getDrawableState()
            r0.setState(r2)
        L39:
            return
    }

    /* JADX INFO: renamed from: а */
    public final void m4382(android.graphics.Canvas r8) {
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.f8418
            if (r0 == 0) goto L60
            androidx.appcompat.widget.AppCompatSeekBar r0 = r7.f8417
            int r1 = r0.getMax()
            r2 = 1
            if (r1 <= r2) goto L60
            android.graphics.drawable.Drawable r3 = r7.f8418
            int r3 = r3.getIntrinsicWidth()
            android.graphics.drawable.Drawable r4 = r7.f8418
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
            android.graphics.drawable.Drawable r4 = r7.f8418
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
            android.graphics.drawable.Drawable r4 = r7.f8418
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
