package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3905 implements Yue.C6875.InterfaceC6891 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final int f12444;

    public C3905(@Yue.InterfaceC4992 int r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Margin must be non-negative"
            Yue.C4868.m19179(r2, r0)
            r1.f12444 = r2
            return
    }

    @Override // Yue.C6875.InterfaceC6891
    /* JADX INFO: renamed from: ۥ */
    public void mo7075(@Yue.InterfaceC4410 android.view.View r3, float r4) {
            r2 = this;
            Yue.ۥۢۤۦۢ r0 = r2.m15861(r3)
            int r1 = r2.f12444
            float r1 = (float) r1
            float r1 = r1 * r4
            int r4 = r0.getOrientation()
            if (r4 != 0) goto L19
            boolean r4 = r0.m26643()
            if (r4 == 0) goto L15
            float r1 = -r1
        L15:
            r3.setTranslationX(r1)
            goto L1c
        L19:
            r3.setTranslationY(r1)
        L1c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.C6875 m15861(@Yue.InterfaceC4410 android.view.View r2) {
            r1 = this;
            android.view.ViewParent r2 = r2.getParent()
            android.view.ViewParent r0 = r2.getParent()
            boolean r2 = r2 instanceof androidx.recyclerview.widget.RecyclerView
            if (r2 == 0) goto L13
            boolean r2 = r0 instanceof Yue.C6875
            if (r2 == 0) goto L13
            Yue.ۥۢۤۦۢ r0 = (Yue.C6875) r0
            return r0
        L13:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Expected the page view to be managed by a ViewPager2 instance."
            r2.<init>(r0)
            throw r2
    }
}
