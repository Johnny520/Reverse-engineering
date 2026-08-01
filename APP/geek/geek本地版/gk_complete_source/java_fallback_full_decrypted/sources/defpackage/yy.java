package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class yy extends androidx.constraintlayout.widget.ConstraintLayout {
    public final defpackage.p1 p;
    public int q;
    public final defpackage.eu r;

    public yy(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            r0 = 2130969286(0x7f0402c6, float:1.754725E38)
            r4.<init>(r5, r6, r0)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r5)
            r2 = 2131492921(0x7f0c0039, float:1.8609308E38)
            r1.inflate(r2, r4)
            eu r1 = new eu
            r1.<init>()
            r4.r = r1
            l00 r2 = new l00
            r3 = 1056964608(0x3f000000, float:0.5)
            r2.<init>(r3)
            du r3 = r1.a
            f30 r3 = r3.a
            e30 r3 = r3.e()
            r3.e = r2
            r3.f = r2
            r3.g = r2
            r3.h = r2
            f30 r2 = r3.a()
            r1.setShapeAppearanceModel(r2)
            eu r1 = r4.r
            r2 = -1
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r1.j(r2)
            eu r1 = r4.r
            java.util.WeakHashMap r2 = defpackage.ja0.a
            defpackage.s90.q(r4, r1)
            int[] r1 = defpackage.wy.t
            r2 = 0
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r1, r0, r2)
            int r6 = r5.getDimensionPixelSize(r2, r2)
            r4.q = r6
            p1 r6 = new p1
            r0 = 11
            r6.<init>(r0, r4)
            r4.p = r6
            r5.recycle()
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0 = this;
            super.addView(r1, r2, r3)
            int r2 = r1.getId()
            r3 = -1
            if (r2 != r3) goto L13
            java.util.WeakHashMap r2 = defpackage.ja0.a
            int r2 = defpackage.t90.a()
            r1.setId(r2)
        L13:
            android.os.Handler r1 = r0.getHandler()
            if (r1 == 0) goto L21
            p1 r2 = r0.p
            r1.removeCallbacks(r2)
            r1.post(r2)
        L21:
            return
    }

    public abstract void e();

    @Override // android.view.View
    public final void onFinishInflate() {
            r0 = this;
            super.onFinishInflate()
            r0.e()
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(android.view.View r2) {
            r1 = this;
            super.onViewRemoved(r2)
            android.os.Handler r2 = r1.getHandler()
            if (r2 == 0) goto L11
            p1 r0 = r1.p
            r2.removeCallbacks(r0)
            r2.post(r0)
        L11:
            return
    }

    @Override // android.view.View
    public final void setBackgroundColor(int r2) {
            r1 = this;
            eu r0 = r1.r
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r0.j(r2)
            return
    }
}
