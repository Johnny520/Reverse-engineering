package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0316 extends Yue.C3023 {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float f676;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public java.lang.Object f677;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public java.lang.Object f678;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public java.lang.Object f679;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public java.lang.Object f680;

    public C0316(Yue.C5934 r2) {
            r1 = this;
            Yue.ۥۢ۠۟۟$ۥ۟۟۟۟ r0 = Yue.C5934.EnumC5939.f21654
            r1.<init>(r2, r0)
            r2 = 1056964608(0x3f000000, float:0.5)
            r1.f676 = r2
            return
    }

    @Override // Yue.C3023
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
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
            r1.m7448()
            java.lang.Object r2 = r4.f677
            if (r2 == 0) goto L21
            r1.m7480(r2)
            goto L2e
        L21:
            java.lang.Object r2 = r4.f678
            if (r2 == 0) goto L29
            r1.m7479(r2)
            goto L2e
        L29:
            java.lang.Integer r2 = Yue.C5934.f21618
            r1.m7480(r2)
        L2e:
            java.lang.Object r2 = r4.f679
            if (r2 == 0) goto L36
            r1.m7454(r2)
            goto L43
        L36:
            java.lang.Object r2 = r4.f680
            if (r2 == 0) goto L3e
            r1.m7453(r2)
            goto L43
        L3e:
            java.lang.Integer r2 = Yue.C5934.f21618
            r1.m7453(r2)
        L43:
            float r2 = r4.f676
            r3 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L6
            r1.m7463(r2)
            goto L6
        L4f:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m1362(float r1) {
            r0 = this;
            r0.f676 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m1363(java.lang.Object r1) {
            r0 = this;
            r0.f680 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m1364(java.lang.Object r1) {
            r0 = this;
            r0.f679 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m1365(java.lang.Object r1) {
            r0 = this;
            r0.f678 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m1366(java.lang.Object r1) {
            r0 = this;
            r0.f677 = r1
            return
    }
}
