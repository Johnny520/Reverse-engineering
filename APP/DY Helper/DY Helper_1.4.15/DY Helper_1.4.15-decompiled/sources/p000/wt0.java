package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class wt0 implements androidx.compose.p001ui.input.pointer.PointerInputEventHandler {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f11855;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ boolean f11856;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ p000.g21 f11857;

    /* JADX INFO: renamed from: δ */
    public final /* synthetic */ p000.g21 f11858;

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ p000.g21 f11859;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.g21 f11860;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.g21 f11861;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ p000.g21 f11862;

    public wt0(int r1, boolean r2, p000.g21 r3, p000.g21 r4, p000.g21 r5, p000.g21 r6, p000.g21 r7, p000.g21 r8) {
            r0 = this;
            r0.<init>()
            r0.f11855 = r1
            r0.f11856 = r2
            r0.f11857 = r3
            r0.f11858 = r4
            r0.f11859 = r5
            r0.f11860 = r6
            r0.f11861 = r7
            r0.f11862 = r8
            return
    }

    @Override // androidx.compose.p001ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(p000.ei1 r14, p000.InterfaceC0631op r15) {
            r13 = this;
            r0 = 4
            float r0 = (float) r0
            e22 r14 = (p000.e22) r14
            float r1 = r14.mo586()
            float r3 = r1 * r0
            vt0 r2 = new vt0
            g21 r11 = r13.f11862
            r12 = 0
            int r4 = r13.f11855
            boolean r5 = r13.f11856
            g21 r6 = r13.f11857
            g21 r7 = r13.f11858
            g21 r8 = r13.f11859
            g21 r9 = r13.f11860
            g21 r10 = r13.f11861
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r13 = p000.pd2.m4486(r14, r2, r15)
            cq r14 = p000.EnumC0184cq.f2716
            if (r13 != r14) goto L29
            return r13
        L29:
            s62 r13 = p000.s62.f9751
            return r13
    }
}
