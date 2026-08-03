package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7009 extends Yue.C1517 {

    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public java.util.ArrayList<Yue.C1517> f24511;

    public C7009() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f24511 = r0
            return
    }

    public C7009(int r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f24511 = r1
            return
    }

    public C7009(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f24511 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m27138(Yue.C1517 r2) {
            r1 = this;
            java.util.ArrayList<Yue.ۥ۟ۧ۟ۢ> r0 = r1.f24511
            r0.add(r2)
            Yue.ۥ۟ۧ۟ۢ r0 = r2.m7529()
            if (r0 == 0) goto L14
            Yue.ۥ۟ۧ۟ۢ r0 = r2.m7529()
            Yue.ۥۢۥۣ r0 = (Yue.C7009) r0
            r0.m27142(r2)
        L14:
            r2.m7608(r1)
            return
    }

    @Override // Yue.C1517
    /* JADX INFO: renamed from: ۥ۟۟ۦۡ */
    public void mo7564() {
            r1 = this;
            java.util.ArrayList<Yue.ۥ۟ۧ۟ۢ> r0 = r1.f24511
            r0.clear()
            super.mo7564()
            return
    }

    @Override // Yue.C1517
    /* JADX INFO: renamed from: ۥ۟۟ۦۦ */
    public void mo7569(Yue.C0892 r4) {
            r3 = this;
            super.mo7569(r4)
            java.util.ArrayList<Yue.ۥ۟ۧ۟ۢ> r0 = r3.f24511
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList<Yue.ۥ۟ۧ۟ۢ> r2 = r3.f24511
            java.lang.Object r2 = r2.get(r1)
            Yue.ۥ۟ۧ۟ۢ r2 = (Yue.C1517) r2
            r2.mo7569(r4)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    @Override // Yue.C1517
    /* JADX INFO: renamed from: ۥ۟۠۠ */
    public void mo7606(int r4, int r5) {
            r3 = this;
            super.mo7606(r4, r5)
            java.util.ArrayList<Yue.ۥ۟ۧ۟ۢ> r4 = r3.f24511
            int r4 = r4.size()
            r5 = 0
        La:
            if (r5 >= r4) goto L22
            java.util.ArrayList<Yue.ۥ۟ۧ۟ۢ> r0 = r3.f24511
            java.lang.Object r0 = r0.get(r5)
            Yue.ۥ۟ۧ۟ۢ r0 = (Yue.C1517) r0
            int r1 = r3.m7533()
            int r2 = r3.m7534()
            r0.mo7606(r1, r2)
            int r5 = r5 + 1
            goto La
        L22:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۦ, reason: contains not printable characters */
    public void m27139(Yue.C1517... r4) {
            r3 = this;
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Lc
            r2 = r4[r1]
            r3.m27138(r2)
            int r1 = r1 + 1
            goto L2
        Lc:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۧ, reason: contains not printable characters */
    public java.util.ArrayList<Yue.C1517> m27140() {
            r1 = this;
            java.util.ArrayList<Yue.ۥ۟ۧ۟ۢ> r0 = r1.f24511
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۨ, reason: contains not printable characters */
    public Yue.C1520 m27141() {
            r4 = this;
            Yue.ۥ۟ۧ۟ۢ r0 = r4.m7529()
            boolean r1 = r4 instanceof Yue.C1520
            if (r1 == 0) goto Lc
            r1 = r4
            Yue.ۥۣ۟ۧ۟ r1 = (Yue.C1520) r1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r0 == 0) goto L1c
            Yue.ۥ۟ۧ۟ۢ r2 = r0.m7529()
            boolean r3 = r0 instanceof Yue.C1520
            if (r3 == 0) goto L1a
            r1 = r0
            Yue.ۥۣ۟ۧ۟ r1 = (Yue.C1520) r1
        L1a:
            r0 = r2
            goto Ld
        L1c:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ */
    public void mo7626() {
            r4 = this;
            java.util.ArrayList<Yue.ۥ۟ۧ۟ۢ> r0 = r4.f24511
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L20
            java.util.ArrayList<Yue.ۥ۟ۧ۟ۢ> r2 = r4.f24511
            java.lang.Object r2 = r2.get(r1)
            Yue.ۥ۟ۧ۟ۢ r2 = (Yue.C1517) r2
            boolean r3 = r2 instanceof Yue.C7009
            if (r3 == 0) goto L1d
            Yue.ۥۢۥۣ r2 = (Yue.C7009) r2
            r2.mo7626()
        L1d:
            int r1 = r1 + 1
            goto La
        L20:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۟, reason: contains not printable characters */
    public void m27142(Yue.C1517 r2) {
            r1 = this;
            java.util.ArrayList<Yue.ۥ۟ۧ۟ۢ> r0 = r1.f24511
            r0.remove(r2)
            r2.mo7564()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۠, reason: contains not printable characters */
    public void m27143() {
            r1 = this;
            java.util.ArrayList<Yue.ۥ۟ۧ۟ۢ> r0 = r1.f24511
            r0.clear()
            return
    }
}
