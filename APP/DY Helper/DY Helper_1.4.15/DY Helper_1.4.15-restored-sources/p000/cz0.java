package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class cz0 extends android.view.ViewOutlineProvider {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f2808;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ float f2809;

    public /* synthetic */ cz0(int r1, float r2) {
            r0 = this;
            r0.f2808 = r1
            r0.f2809 = r2
            r0.<init>()
            return
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View r14, android.graphics.Outline r15) {
            r13 = this;
            int r0 = r13.f2808
            switch(r0) {
                case 0: goto L1c;
                default: goto L5;
            }
        L5:
            r14.getClass()
            r15.getClass()
            int r4 = r14.getWidth()
            int r5 = r14.getHeight()
            float r6 = r13.f2809
            r2 = 0
            r3 = 0
            r1 = r15
            r1.setRoundRect(r2, r3, r4, r5, r6)
            return
        L1c:
            r1 = r15
            r14.getClass()
            r1.getClass()
            int r10 = r14.getWidth()
            int r11 = r14.getHeight()
            float r12 = r13.f2809
            r8 = 0
            r9 = 0
            r7 = r1
            r7.setRoundRect(r8, r9, r10, r11, r12)
            return
    }
}
