package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class l72 implements p000.InterfaceC0199d4 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f6466;

    /* JADX INFO: renamed from: ζ */
    public final p000.e40 f6467;

    public l72(float r3, float r4) {
            r2 = this;
            r0 = 0
            r2.f6466 = r0
            r2.<init>()
            e40 r0 = new e40
            r1 = 1008981770(0x3c23d70a, float:0.01)
            r0.<init>(r3, r4, r1)
            r2.f6467 = r0
            return
    }

    public l72(p000.e40 r2) {
            r1 = this;
            r0 = 1
            r1.f6466 = r0
            r1.<init>()
            r1.f6467 = r2
            return
    }

    @Override // p000.InterfaceC0199d4
    public final p000.e40 get(int r1) {
            r0 = this;
            int r1 = r0.f6466
            switch(r1) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            e40 r0 = r0.f6467
            return r0
        L8:
            e40 r0 = r0.f6467
            return r0
    }
}
