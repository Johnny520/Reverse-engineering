package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0317 extends Yue.C3023 {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float f681;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public java.lang.Object f682;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public java.lang.Object f683;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public java.lang.Object f684;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public java.lang.Object f685;

    public C0317(Yue.C5934 r2) {
            r1 = this;
            Yue.ۥۢ۠۟۟$ۥ۟۟۟۟ r0 = Yue.C5934.EnumC5939.f21654
            r1.<init>(r2, r0)
            r2 = 1056964608(0x3f000000, float:0.5)
            r1.f681 = r2
            return
    }

    @Override // Yue.C3023
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo1361() {
            r4 = this;
            java.util.ArrayList<java.lang.Object> r0 = r4.f9721
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r0.next()
            Yue.ۥۢ۠۟۟ r2 = r4.f9719
            Yue.ۥ۟ۧ۟ۡ r1 = r2.m22015(r1)
            r1.m7449()
            java.lang.Object r2 = r4.f682
            if (r2 == 0) goto L21
            r1.m7483(r2)
            goto L2e
        L21:
            java.lang.Object r2 = r4.f683
            if (r2 == 0) goto L29
            r1.m7482(r2)
            goto L2e
        L29:
            java.lang.Integer r2 = Yue.C5934.f21618
            r1.m7483(r2)
        L2e:
            java.lang.Object r2 = r4.f684
            if (r2 == 0) goto L36
            r1.m7444(r2)
            goto L43
        L36:
            java.lang.Object r2 = r4.f685
            if (r2 == 0) goto L3e
            r1.m7443(r2)
            goto L43
        L3e:
            java.lang.Integer r2 = Yue.C5934.f21618
            r1.m7443(r2)
        L43:
            float r2 = r4.f681
            r3 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L6
            r1.m7485(r2)
            goto L6
        L4f:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m1367(float r1) {
            r0 = this;
            r0.f681 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m1368(java.lang.Object r1) {
            r0 = this;
            r0.f685 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m1369(java.lang.Object r1) {
            r0 = this;
            r0.f684 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m1370(java.lang.Object r1) {
            r0 = this;
            r0.f683 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m1371(java.lang.Object r1) {
            r0 = this;
            r0.f682 = r1
            return
    }
}
