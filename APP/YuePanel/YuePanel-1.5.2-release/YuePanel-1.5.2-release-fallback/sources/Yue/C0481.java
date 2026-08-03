package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0481 extends Yue.C0472 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final android.widget.SeekBar f1212;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f1213;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public android.content.res.ColorStateList f1214;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public android.graphics.PorterDuff.Mode f1215;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean f1216;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean f1217;

    public C0481(android.widget.SeekBar r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.f1214 = r0
            r1.f1215 = r0
            r0 = 0
            r1.f1216 = r0
            r1.f1217 = r0
            r1.f1212 = r2
            return
    }

    @Override // Yue.C0472
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo1726(android.util.AttributeSet r9, int r10) {
            r8 = this;
            super.mo1726(r9, r10)
            android.widget.SeekBar r0 = r8.f1212
            android.content.Context r0 = r0.getContext()
            int[] r1 = Yue.C5058.C5071.f17649
            r2 = 0
            Yue.ۥۢۡۥۦ r0 = Yue.C6264.m23339(r0, r9, r1, r10, r2)
            android.widget.SeekBar r1 = r8.f1212
            android.content.Context r2 = r1.getContext()
            int[] r3 = Yue.C5058.C5071.f17649
            android.content.res.TypedArray r5 = r0.m23367()
            r7 = 0
            r4 = r9
            r6 = r10
            Yue.C6794.m26221(r1, r2, r3, r4, r5, r6, r7)
            int r9 = Yue.C5058.C5071.f17650
            android.graphics.drawable.Drawable r9 = r0.m23348(r9)
            if (r9 == 0) goto L2f
            android.widget.SeekBar r10 = r8.f1212
            r10.setThumb(r9)
        L2f:
            int r9 = Yue.C5058.C5071.f17651
            android.graphics.drawable.Drawable r9 = r0.m23347(r9)
            r8.m1745(r9)
            int r9 = Yue.C5058.C5071.f17653
            boolean r9 = r0.m23368(r9)
            r10 = 1
            if (r9 == 0) goto L52
            int r9 = Yue.C5058.C5071.f17653
            r1 = -1
            int r9 = r0.m23354(r9, r1)
            android.graphics.PorterDuff$Mode r1 = r8.f1215
            android.graphics.PorterDuff$Mode r9 = Yue.C2012.m9307(r9, r1)
            r8.f1215 = r9
            r8.f1217 = r10
        L52:
            int r9 = Yue.C5058.C5071.f17652
            boolean r9 = r0.m23368(r9)
            if (r9 == 0) goto L64
            int r9 = Yue.C5058.C5071.f17652
            android.content.res.ColorStateList r9 = r0.m23343(r9)
            r8.f1214 = r9
            r8.f1216 = r10
        L64:
            r0.m23371()
            r8.m1738()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m1738() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f1213
            if (r0 == 0) goto L3d
            boolean r1 = r2.f1216
            if (r1 != 0) goto Lc
            boolean r1 = r2.f1217
            if (r1 == 0) goto L3d
        Lc:
            android.graphics.drawable.Drawable r0 = r0.mutate()
            android.graphics.drawable.Drawable r0 = Yue.C1995.m9235(r0)
            r2.f1213 = r0
            boolean r1 = r2.f1216
            if (r1 == 0) goto L1f
            android.content.res.ColorStateList r1 = r2.f1214
            Yue.C1995.m9232(r0, r1)
        L1f:
            boolean r0 = r2.f1217
            if (r0 == 0) goto L2a
            android.graphics.drawable.Drawable r0 = r2.f1213
            android.graphics.PorterDuff$Mode r1 = r2.f1215
            Yue.C1995.m9233(r0, r1)
        L2a:
            android.graphics.drawable.Drawable r0 = r2.f1213
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L3d
            android.graphics.drawable.Drawable r0 = r2.f1213
            android.widget.SeekBar r1 = r2.f1212
            int[] r1 = r1.getDrawableState()
            r0.setState(r1)
        L3d:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m1739(android.graphics.Canvas r7) {
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.f1213
            if (r0 == 0) goto L6a
            android.widget.SeekBar r0 = r6.f1212
            int r0 = r0.getMax()
            r1 = 1
            if (r0 <= r1) goto L6a
            android.graphics.drawable.Drawable r2 = r6.f1213
            int r2 = r2.getIntrinsicWidth()
            android.graphics.drawable.Drawable r3 = r6.f1213
            int r3 = r3.getIntrinsicHeight()
            if (r2 < 0) goto L1e
            int r2 = r2 / 2
            goto L1f
        L1e:
            r2 = r1
        L1f:
            if (r3 < 0) goto L23
            int r1 = r3 / 2
        L23:
            android.graphics.drawable.Drawable r3 = r6.f1213
            int r4 = -r2
            int r5 = -r1
            r3.setBounds(r4, r5, r2, r1)
            android.widget.SeekBar r1 = r6.f1212
            int r1 = r1.getWidth()
            android.widget.SeekBar r2 = r6.f1212
            int r2 = r2.getPaddingLeft()
            int r1 = r1 - r2
            android.widget.SeekBar r2 = r6.f1212
            int r2 = r2.getPaddingRight()
            int r1 = r1 - r2
            float r1 = (float) r1
            float r2 = (float) r0
            float r1 = r1 / r2
            int r2 = r7.save()
            android.widget.SeekBar r3 = r6.f1212
            int r3 = r3.getPaddingLeft()
            float r3 = (float) r3
            android.widget.SeekBar r4 = r6.f1212
            int r4 = r4.getHeight()
            int r4 = r4 / 2
            float r4 = (float) r4
            r7.translate(r3, r4)
            r3 = 0
        L59:
            if (r3 > r0) goto L67
            android.graphics.drawable.Drawable r4 = r6.f1213
            r4.draw(r7)
            r4 = 0
            r7.translate(r1, r4)
            int r3 = r3 + 1
            goto L59
        L67:
            r7.restoreToCount(r2)
        L6a:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m1740() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f1213
            if (r0 == 0) goto L1b
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto L1b
            android.widget.SeekBar r1 = r2.f1212
            int[] r1 = r1.getDrawableState()
            boolean r1 = r0.setState(r1)
            if (r1 == 0) goto L1b
            android.widget.SeekBar r1 = r2.f1212
            r1.invalidateDrawable(r0)
        L1b:
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public android.graphics.drawable.Drawable m1741() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1213
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public android.content.res.ColorStateList m1742() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f1214
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public android.graphics.PorterDuff.Mode m1743() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.f1215
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m1744() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1213
            if (r0 == 0) goto L7
            r0.jumpToCurrentState()
        L7:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m1745(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f1213
            if (r0 == 0) goto L8
            r1 = 0
            r0.setCallback(r1)
        L8:
            r2.f1213 = r3
            if (r3 == 0) goto L2c
            android.widget.SeekBar r0 = r2.f1212
            r3.setCallback(r0)
            android.widget.SeekBar r0 = r2.f1212
            int r0 = r0.getLayoutDirection()
            Yue.C1995.m9230(r3, r0)
            boolean r0 = r3.isStateful()
            if (r0 == 0) goto L29
            android.widget.SeekBar r0 = r2.f1212
            int[] r0 = r0.getDrawableState()
            r3.setState(r0)
        L29:
            r2.m1738()
        L2c:
            android.widget.SeekBar r3 = r2.f1212
            r3.invalidate()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m1746(@Yue.InterfaceC4544 android.content.res.ColorStateList r1) {
            r0 = this;
            r0.f1214 = r1
            r1 = 1
            r0.f1216 = r1
            r0.m1738()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m1747(@Yue.InterfaceC4544 android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.f1215 = r1
            r1 = 1
            r0.f1217 = r1
            r0.m1738()
            return
    }
}
