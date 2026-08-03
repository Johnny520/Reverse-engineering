package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۡۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4271 extends androidx.constraintlayout.widget.AbstractC7457 implements Yue.InterfaceC0357, Yue.C4273.InterfaceC4282 {

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean f13320;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public boolean f13321;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public float f13322;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public android.view.View[] f13323;

    public C4271(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.f13320 = r1
            r0.f13321 = r1
            return
    }

    public C4271(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.f13320 = r1
            r0.f13321 = r1
            r0.mo14491(r2)
            return
    }

    public C4271(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.f13320 = r1
            r0.f13321 = r1
            r0.mo14491(r2)
            return
    }

    @Override // Yue.InterfaceC0357
    public float getProgress() {
            r1 = this;
            float r0 = r1.f13322
            return r0
    }

    @Override // Yue.InterfaceC0357
    public void setProgress(float r6) {
            r5 = this;
            r5.f13322 = r6
            int r0 = r5.f26078
            r1 = 0
            if (r0 <= 0) goto L21
            android.view.ViewParent r0 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            android.view.View[] r0 = r5.m28536(r0)
            r5.f13323 = r0
        L13:
            int r0 = r5.f26078
            if (r1 >= r0) goto L3c
            android.view.View[] r0 = r5.f13323
            r0 = r0[r1]
            r5.m16636(r0, r6)
            int r1 = r1 + 1
            goto L13
        L21:
            android.view.ViewParent r0 = r5.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r0.getChildCount()
        L2b:
            if (r1 >= r2) goto L3c
            android.view.View r3 = r0.getChildAt(r1)
            boolean r4 = r3 instanceof Yue.C4271
            if (r4 == 0) goto L36
            goto L39
        L36:
            r5.m16636(r3, r6)
        L39:
            int r1 = r1 + 1
            goto L2b
        L3c:
            return
    }

    @Override // Yue.C4273.InterfaceC4282
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void mo16630(Yue.C4273 r1, int r2, int r3) {
            r0 = this;
            return
    }

    @Override // Yue.C4273.InterfaceC4282
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void mo16631(Yue.C4273 r1, int r2) {
            r0 = this;
            return
    }

    @Override // Yue.C4273.InterfaceC4282
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void mo16632(Yue.C4273 r1, int r2, boolean r3, float r4) {
            r0 = this;
            return
    }

    @Override // Yue.C4273.InterfaceC4282
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void mo16633(Yue.C4273 r1, int r2, int r3, float r4) {
            r0 = this;
            return
    }

    @Override // androidx.constraintlayout.widget.AbstractC7457
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public void mo14491(android.util.AttributeSet r5) {
            r4 = this;
            super.mo14491(r5)
            if (r5 == 0) goto L39
            android.content.Context r0 = r4.getContext()
            int[] r1 = androidx.constraintlayout.widget.C7473.C7486.f28715
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r1)
            int r0 = r5.getIndexCount()
            r1 = 0
        L14:
            if (r1 >= r0) goto L36
            int r2 = r5.getIndex(r1)
            int r3 = androidx.constraintlayout.widget.C7473.C7486.f28717
            if (r2 != r3) goto L27
            boolean r3 = r4.f13320
            boolean r2 = r5.getBoolean(r2, r3)
            r4.f13320 = r2
            goto L33
        L27:
            int r3 = androidx.constraintlayout.widget.C7473.C7486.f28716
            if (r2 != r3) goto L33
            boolean r3 = r4.f13321
            boolean r2 = r5.getBoolean(r2, r3)
            r4.f13321 = r2
        L33:
            int r1 = r1 + 1
            goto L14
        L36:
            r5.recycle()
        L39:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public boolean m16634() {
            r1 = this;
            boolean r0 = r1.f13321
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean m16635() {
            r1 = this;
            boolean r0 = r1.f13320
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public void m16636(android.view.View r1, float r2) {
            r0 = this;
            return
    }
}
