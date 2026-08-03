package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2951 implements Yue.InterfaceC5274 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final Yue.C5934 f9562;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f9563;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Yue.C2948 f9564;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f9565;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f9566;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public float f9567;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public java.lang.Object f9568;

    public C2951(Yue.C5934 r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f9565 = r0
            r1.f9566 = r0
            r0 = 0
            r1.f9567 = r0
            r1.f9562 = r2
            return
    }

    @Override // Yue.InterfaceC5274
    public void apply() {
            r2 = this;
            Yue.ۥ۠ۤ۟ۧ r0 = r2.f9564
            int r1 = r2.f9563
            r0.m12558(r1)
            int r0 = r2.f9565
            r1 = -1
            if (r0 == r1) goto L12
            Yue.ۥ۠ۤ۟ۧ r1 = r2.f9564
            r1.m12553(r0)
            goto L23
        L12:
            int r0 = r2.f9566
            if (r0 == r1) goto L1c
            Yue.ۥ۠ۤ۟ۧ r1 = r2.f9564
            r1.m12554(r0)
            goto L23
        L1c:
            Yue.ۥ۠ۤ۟ۧ r0 = r2.f9564
            float r1 = r2.f9567
            r0.m12555(r1)
        L23:
            return
    }

    @Override // Yue.InterfaceC5274
    public java.lang.Object getKey() {
            r1 = this;
            java.lang.Object r0 = r1.f9568
            return r0
    }

    @Override // Yue.InterfaceC5274
    /* JADX INFO: renamed from: ۥ */
    public void mo7435(Yue.C1517 r2) {
            r1 = this;
            boolean r0 = r2 instanceof Yue.C2948
            if (r0 == 0) goto L9
            Yue.ۥ۠ۤ۟ۧ r2 = (Yue.C2948) r2
            r1.f9564 = r2
            goto Lc
        L9:
            r2 = 0
            r1.f9564 = r2
        Lc:
            return
    }

    @Override // Yue.InterfaceC5274
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo7436(java.lang.Object r1) {
            r0 = this;
            r0.f9568 = r1
            return
    }

    @Override // Yue.InterfaceC5274
    /* JADX INFO: renamed from: ۥ۟۟ */
    public Yue.C1517 mo7437() {
            r1 = this;
            Yue.ۥ۠ۤ۟ۧ r0 = r1.f9564
            if (r0 != 0) goto Lb
            Yue.ۥ۠ۤ۟ۧ r0 = new Yue.ۥ۠ۤ۟ۧ
            r0.<init>()
            r1.f9564 = r0
        Lb:
            Yue.ۥ۠ۤ۟ۧ r0 = r1.f9564
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m12560(java.lang.Object r2) {
            r1 = this;
            r0 = -1
            r1.f9565 = r0
            Yue.ۥۢ۠۟۟ r0 = r1.f9562
            int r2 = r0.m22016(r2)
            r1.f9566 = r2
            r2 = 0
            r1.f9567 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m12561() {
            r1 = this;
            int r0 = r1.f9563
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m12562(float r2) {
            r1 = this;
            r0 = -1
            r1.f9565 = r0
            r1.f9566 = r0
            r1.f9567 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m12563(int r1) {
            r0 = this;
            r0.f9563 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m12564(java.lang.Object r2) {
            r1 = this;
            Yue.ۥۢ۠۟۟ r0 = r1.f9562
            int r2 = r0.m22016(r2)
            r1.f9565 = r2
            r2 = -1
            r1.f9566 = r2
            r2 = 0
            r1.f9567 = r2
            return
    }
}
