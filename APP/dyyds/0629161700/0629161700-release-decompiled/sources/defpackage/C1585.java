package defpackage;

/* JADX INFO: renamed from: ᛸᲇᛷᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1585 extends defpackage.C0682 {

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public android.content.res.ColorStateList f7011;

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f7012;

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public final defpackage.C1182 f7013;

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public android.graphics.PorterDuff.Mode f7014;

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
    public boolean f7015;

    /* JADX INFO: renamed from: ᲁᛴᛵᛲ, reason: contains not printable characters */
    public boolean f7016;

    public C1585(defpackage.C1182 r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.f7011 = r0
            r1.f7014 = r0
            r0 = 0
            r1.f7015 = r0
            r1.f7016 = r0
            r1.f7013 = r2
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲁᛳ, reason: contains not printable characters */
    public final void m2866(android.graphics.Canvas r8) {
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.f7012
            if (r0 == 0) goto L60
            ᛶᲈᛴᛶ r0 = r7.f7013
            int r1 = r0.getMax()
            r2 = 1
            if (r1 <= r2) goto L60
            android.graphics.drawable.Drawable r3 = r7.f7012
            int r3 = r3.getIntrinsicWidth()
            android.graphics.drawable.Drawable r4 = r7.f7012
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
            android.graphics.drawable.Drawable r4 = r7.f7012
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
            android.graphics.drawable.Drawable r4 = r7.f7012
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

    @Override // defpackage.C0682
    /* JADX INFO: renamed from: ᛷᛷᲀᛴ */
    public final void mo1555(android.util.AttributeSet r9, int r10) {
            r8 = this;
            r5 = 1711538817(0x66040281, float:1.5584964E23)
            super.mo1555(r9, r5)
            ᛶᲈᛴᛶ r0 = r8.f7013
            android.content.Context r10 = r0.getContext()
            int[] r2 = defpackage.AbstractC1070.f4805
            ᛷᛸᛱᛸ r10 = defpackage.C1326.m2454(r10, r9, r2, r5)
            java.lang.Object r1 = r10.f5856
            r7 = r1
            android.content.res.TypedArray r7 = (android.content.res.TypedArray) r7
            android.content.Context r1 = r0.getContext()
            java.lang.Object r3 = r10.f5856
            r4 = r3
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            java.util.WeakHashMap r3 = defpackage.AbstractC0858.f3911
            r6 = 0
            r3 = r9
            defpackage.AbstractC0756.m1676(r0, r1, r2, r3, r4, r5, r6)
            r9 = 0
            android.graphics.drawable.Drawable r9 = r10.m2468(r9)
            if (r9 == 0) goto L31
            r0.setThumb(r9)
        L31:
            r9 = 1
            android.graphics.drawable.Drawable r1 = r10.m2470(r9)
            android.graphics.drawable.Drawable r2 = r8.f7012
            if (r2 == 0) goto L3e
            r3 = 0
            r2.setCallback(r3)
        L3e:
            r8.f7012 = r1
            if (r1 == 0) goto L5c
            r1.setCallback(r0)
            int r2 = r0.getLayoutDirection()
            r1.setLayoutDirection(r2)
            boolean r2 = r1.isStateful()
            if (r2 == 0) goto L59
            int[] r2 = r0.getDrawableState()
            r1.setState(r2)
        L59:
            r8.m2867()
        L5c:
            r0.invalidate()
            r0 = 3
            boolean r1 = r7.hasValue(r0)
            if (r1 == 0) goto L75
            r1 = -1
            int r0 = r7.getInt(r0, r1)
            android.graphics.PorterDuff$Mode r1 = r8.f7014
            android.graphics.PorterDuff$Mode r0 = defpackage.AbstractC1660.m3053(r0, r1)
            r8.f7014 = r0
            r8.f7016 = r9
        L75:
            r0 = 2
            boolean r1 = r7.hasValue(r0)
            if (r1 == 0) goto L84
            android.content.res.ColorStateList r0 = r10.m2480(r0)
            r8.f7011 = r0
            r8.f7015 = r9
        L84:
            r10.m2469()
            r8.m2867()
            return
    }

    /* JADX INFO: renamed from: ᛸᛱᲈᛳ, reason: contains not printable characters */
    public final void m2867() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f7012
            if (r0 == 0) goto L39
            boolean r1 = r2.f7015
            if (r1 != 0) goto Lc
            boolean r1 = r2.f7016
            if (r1 == 0) goto L39
        Lc:
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r2.f7012 = r0
            boolean r1 = r2.f7015
            if (r1 == 0) goto L1b
            android.content.res.ColorStateList r1 = r2.f7011
            r0.setTintList(r1)
        L1b:
            boolean r0 = r2.f7016
            if (r0 == 0) goto L26
            android.graphics.drawable.Drawable r0 = r2.f7012
            android.graphics.PorterDuff$Mode r1 = r2.f7014
            r0.setTintMode(r1)
        L26:
            android.graphics.drawable.Drawable r0 = r2.f7012
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L39
            android.graphics.drawable.Drawable r0 = r2.f7012
            ᛶᲈᛴᛶ r2 = r2.f7013
            int[] r2 = r2.getDrawableState()
            r0.setState(r2)
        L39:
            return
    }
}
