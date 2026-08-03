package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3025 extends Yue.C1517 implements Yue.InterfaceC3022 {

    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public Yue.C1517[] f9723;

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public int f9724;

    public C3025() {
            r1 = this;
            r1.<init>()
            r0 = 4
            Yue.ۥ۟ۧ۟ۢ[] r0 = new Yue.C1517[r0]
            r1.f9723 = r0
            r0 = 0
            r1.f9724 = r0
            return
    }

    @Override // Yue.InterfaceC3022
    /* JADX INFO: renamed from: ۥ */
    public void mo12778() {
            r2 = this;
            r0 = 0
            r2.f9724 = r0
            Yue.ۥ۟ۧ۟ۢ[] r0 = r2.f9723
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            return
    }

    @Override // Yue.InterfaceC3022
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo12779(Yue.C1517 r4) {
            r3 = this;
            if (r4 == r3) goto L23
            if (r4 != 0) goto L5
            goto L23
        L5:
            int r0 = r3.f9724
            int r0 = r0 + 1
            Yue.ۥ۟ۧ۟ۢ[] r1 = r3.f9723
            int r2 = r1.length
            if (r0 <= r2) goto L19
            int r0 = r1.length
            int r0 = r0 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            Yue.ۥ۟ۧ۟ۢ[] r0 = (Yue.C1517[]) r0
            r3.f9723 = r0
        L19:
            Yue.ۥ۟ۧ۟ۢ[] r0 = r3.f9723
            int r1 = r3.f9724
            r0[r1] = r4
            int r1 = r1 + 1
            r3.f9724 = r1
        L23:
            return
    }

    @Override // Yue.InterfaceC3022
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo12780(Yue.C1520 r1) {
            r0 = this;
            return
    }

    @Override // Yue.C1517
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo4466(Yue.C1517 r4, java.util.HashMap<Yue.C1517, Yue.C1517> r5) {
            r3 = this;
            super.mo4466(r4, r5)
            Yue.ۥ۠ۤۤۡ r4 = (Yue.C3025) r4
            r0 = 0
            r3.f9724 = r0
            int r1 = r4.f9724
        La:
            if (r0 >= r1) goto L1c
            Yue.ۥ۟ۧ۟ۢ[] r2 = r4.f9723
            r2 = r2[r0]
            java.lang.Object r2 = r5.get(r2)
            Yue.ۥ۟ۧ۟ۢ r2 = (Yue.C1517) r2
            r3.mo12779(r2)
            int r0 = r0 + 1
            goto La
        L1c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۦ, reason: contains not printable characters */
    public void m12785(java.util.ArrayList<Yue.C7010> r4, int r5, Yue.C7010 r6) {
            r3 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r3.f9724
            if (r1 >= r2) goto L10
            Yue.ۥ۟ۧ۟ۢ[] r2 = r3.f9723
            r2 = r2[r1]
            r6.m27144(r2)
            int r1 = r1 + 1
            goto L2
        L10:
            int r1 = r3.f9724
            if (r0 >= r1) goto L1e
            Yue.ۥ۟ۧ۟ۢ[] r1 = r3.f9723
            r1 = r1[r0]
            Yue.C2941.m12516(r1, r5, r4, r6)
            int r0 = r0 + 1
            goto L10
        L1e:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۧ, reason: contains not printable characters */
    public int m12786(int r5) {
            r4 = this;
            r0 = 0
        L1:
            int r1 = r4.f9724
            r2 = -1
            if (r0 >= r1) goto L1c
            Yue.ۥ۟ۧ۟ۢ[] r1 = r4.f9723
            r1 = r1[r0]
            if (r5 != 0) goto L11
            int r3 = r1.f4907
            if (r3 == r2) goto L11
            return r3
        L11:
            r3 = 1
            if (r5 != r3) goto L19
            int r1 = r1.f4908
            if (r1 == r2) goto L19
            return r1
        L19:
            int r0 = r0 + 1
            goto L1
        L1c:
            return r2
    }
}
