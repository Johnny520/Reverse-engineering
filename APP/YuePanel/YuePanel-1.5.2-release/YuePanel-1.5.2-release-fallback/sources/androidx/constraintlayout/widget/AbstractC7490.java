package androidx.constraintlayout.widget;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟۟۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7490 extends androidx.constraintlayout.widget.AbstractC7457 {

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean f28940;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public boolean f28941;

    public AbstractC7490(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public AbstractC7490(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public AbstractC7490(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // androidx.constraintlayout.widget.AbstractC7457, android.view.View
    public void onAttachedToWindow() {
            r6 = this;
            super.onAttachedToWindow()
            boolean r0 = r6.f28940
            if (r0 != 0) goto Lb
            boolean r0 = r6.f28941
            if (r0 == 0) goto L49
        Lb:
            android.view.ViewParent r0 = r6.getParent()
            if (r0 == 0) goto L49
            boolean r1 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L49
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            int r1 = r6.getVisibility()
            float r2 = r6.getElevation()
            r3 = 0
        L20:
            int r4 = r6.f26078
            if (r3 >= r4) goto L49
            int[] r4 = r6.f26077
            r4 = r4[r3]
            android.view.View r4 = r0.getViewById(r4)
            if (r4 == 0) goto L46
            boolean r5 = r6.f28940
            if (r5 == 0) goto L35
            r4.setVisibility(r1)
        L35:
            boolean r5 = r6.f28941
            if (r5 == 0) goto L46
            r5 = 0
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 <= 0) goto L46
            float r5 = r4.getTranslationZ()
            float r5 = r5 + r2
            r4.setTranslationZ(r5)
        L46:
            int r3 = r3 + 1
            goto L20
        L49:
            return
    }

    @Override // android.view.View
    public void setElevation(float r1) {
            r0 = this;
            super.setElevation(r1)
            r0.m28531()
            return
    }

    @Override // android.view.View
    public void setVisibility(int r1) {
            r0 = this;
            super.setVisibility(r1)
            r0.m28531()
            return
    }

    @Override // androidx.constraintlayout.widget.AbstractC7457
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public void mo14491(android.util.AttributeSet r6) {
            r5 = this;
            super.mo14491(r6)
            if (r6 == 0) goto L2e
            android.content.Context r0 = r5.getContext()
            int[] r1 = androidx.constraintlayout.widget.C7473.C7486.f28216
            android.content.res.TypedArray r6 = r0.obtainStyledAttributes(r6, r1)
            int r0 = r6.getIndexCount()
            r1 = 0
        L14:
            if (r1 >= r0) goto L2b
            int r2 = r6.getIndex(r1)
            int r3 = androidx.constraintlayout.widget.C7473.C7486.f28223
            r4 = 1
            if (r2 != r3) goto L22
            r5.f28940 = r4
            goto L28
        L22:
            int r3 = androidx.constraintlayout.widget.C7473.C7486.f28230
            if (r2 != r3) goto L28
            r5.f28941 = r4
        L28:
            int r1 = r1 + 1
            goto L14
        L2b:
            r6.recycle()
        L2e:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public void mo28496(Yue.C6952 r1, int r2, int r3) {
            r0 = this;
            return
    }
}
