package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3402 extends Yue.AbstractC1419 implements Yue.InterfaceC1892, Yue.InterfaceC3235 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public Yue.C3403 f10860;

    public AbstractC3402() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // Yue.C3783
    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = Yue.C1758.m8350(r2)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = Yue.C1758.m8351(r2)
            r0.append(r1)
            java.lang.String r1 = "[job@"
            r0.append(r1)
            Yue.ۥ۠ۦ۠۟ r1 = r2.m14079()
            java.lang.String r1 = Yue.C1758.m8351(r1)
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC3235
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public boolean mo10054() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // Yue.InterfaceC3235
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public Yue.C4403 mo10055() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC1892
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
    public void mo352() {
            r1 = this;
            Yue.ۥ۠ۦ۠۟ r0 = r1.m14079()
            r0.m14130(r1)
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public final Yue.C3403 m14079() {
            r1 = this;
            Yue.ۥ۠ۦ۠۟ r0 = r1.f10860
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "job"
            Yue.C3329.m13935(r0)
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public final void m14080(@Yue.InterfaceC4418 Yue.C3403 r1) {
            r0 = this;
            r0.f10860 = r1
            return
    }
}
