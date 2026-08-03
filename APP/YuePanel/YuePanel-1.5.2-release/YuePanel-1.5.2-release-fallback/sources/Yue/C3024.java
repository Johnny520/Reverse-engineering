package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3024 extends Yue.AbstractC7012 {
    public C3024(Yue.C1517 r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    private void m12784(Yue.C1814 r2) {
            r1 = this;
            Yue.ۥ۟ۨۨۥ r0 = r1.f24535
            java.util.List<Yue.ۥۣ۟ۨۨ> r0 = r0.f5569
            r0.add(r2)
            java.util.List<Yue.ۥ۟ۨۨۥ> r2 = r2.f5570
            Yue.ۥ۟ۨۨۥ r0 = r1.f24535
            r2.add(r0)
            return
    }

    @Override // Yue.AbstractC7012, Yue.InterfaceC1812
    /* JADX INFO: renamed from: ۥ */
    public void mo5453(Yue.InterfaceC1812 r7) {
            r6 = this;
            Yue.ۥ۟ۧ۟ۢ r7 = r6.f24529
            Yue.ۥ۟ۢۤۧ r7 = (Yue.C0721) r7
            int r0 = r7.m4471()
            Yue.ۥ۟ۨۨۥ r1 = r6.f24535
            java.util.List<Yue.ۥ۟ۨۨۥ> r1 = r1.f5570
            java.util.Iterator r1 = r1.iterator()
            r2 = -1
            r3 = 0
            r4 = r2
        L13:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L2a
            java.lang.Object r5 = r1.next()
            Yue.ۥ۟ۨۨۥ r5 = (Yue.C1814) r5
            int r5 = r5.f5565
            if (r4 == r2) goto L25
            if (r5 >= r4) goto L26
        L25:
            r4 = r5
        L26:
            if (r3 >= r5) goto L13
            r3 = r5
            goto L13
        L2a:
            if (r0 == 0) goto L3b
            r1 = 2
            if (r0 != r1) goto L30
            goto L3b
        L30:
            Yue.ۥ۟ۨۨۥ r0 = r6.f24535
            int r7 = r7.m4472()
            int r3 = r3 + r7
            r0.mo8539(r3)
            goto L45
        L3b:
            Yue.ۥ۟ۨۨۥ r0 = r6.f24535
            int r7 = r7.m4472()
            int r4 = r4 + r7
            r0.mo8539(r4)
        L45:
            return
    }

    @Override // Yue.AbstractC7012
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo5454() {
            r7 = this;
            Yue.ۥ۟ۧ۟ۢ r0 = r7.f24529
            boolean r1 = r0 instanceof Yue.C0721
            if (r1 == 0) goto L121
            Yue.ۥ۟ۨۨۥ r1 = r7.f24535
            r2 = 1
            r1.f5560 = r2
            Yue.ۥ۟ۢۤۧ r0 = (Yue.C0721) r0
            int r1 = r0.m4471()
            boolean r3 = r0.m4470()
            r4 = 8
            r5 = 0
            if (r1 == 0) goto Le3
            if (r1 == r2) goto La4
            r2 = 2
            if (r1 == r2) goto L64
            r2 = 3
            if (r1 == r2) goto L24
            goto L121
        L24:
            Yue.ۥ۟ۨۨۥ r1 = r7.f24535
            Yue.ۥ۟ۨۨۥ$ۥ r2 = Yue.C1814.EnumC1815.f5577
            r1.f5563 = r2
        L2a:
            int r1 = r0.f9724
            if (r5 >= r1) goto L50
            Yue.ۥ۟ۧ۟ۢ[] r1 = r0.f9723
            r1 = r1[r5]
            if (r3 != 0) goto L3b
            int r2 = r1.m7543()
            if (r2 != r4) goto L3b
            goto L4d
        L3b:
            Yue.ۥۣۢۦۧ r1 = r1.f4824
            Yue.ۥ۟ۨۨۥ r1 = r1.f24536
            java.util.List<Yue.ۥۣ۟ۨۨ> r2 = r1.f5569
            Yue.ۥ۟ۨۨۥ r6 = r7.f24535
            r2.add(r6)
            Yue.ۥ۟ۨۨۥ r2 = r7.f24535
            java.util.List<Yue.ۥ۟ۨۨۥ> r2 = r2.f5570
            r2.add(r1)
        L4d:
            int r5 = r5 + 1
            goto L2a
        L50:
            Yue.ۥ۟ۧ۟ۢ r0 = r7.f24529
            Yue.ۥۣۢۦۧ r0 = r0.f4824
            Yue.ۥ۟ۨۨۥ r0 = r0.f24535
            r7.m12784(r0)
            Yue.ۥ۟ۧ۟ۢ r0 = r7.f24529
            Yue.ۥۣۢۦۧ r0 = r0.f4824
            Yue.ۥ۟ۨۨۥ r0 = r0.f24536
            r7.m12784(r0)
            goto L121
        L64:
            Yue.ۥ۟ۨۨۥ r1 = r7.f24535
            Yue.ۥ۟ۨۨۥ$ۥ r2 = Yue.C1814.EnumC1815.f5576
            r1.f5563 = r2
        L6a:
            int r1 = r0.f9724
            if (r5 >= r1) goto L90
            Yue.ۥ۟ۧ۟ۢ[] r1 = r0.f9723
            r1 = r1[r5]
            if (r3 != 0) goto L7b
            int r2 = r1.m7543()
            if (r2 != r4) goto L7b
            goto L8d
        L7b:
            Yue.ۥۣۢۦۧ r1 = r1.f4824
            Yue.ۥ۟ۨۨۥ r1 = r1.f24535
            java.util.List<Yue.ۥۣ۟ۨۨ> r2 = r1.f5569
            Yue.ۥ۟ۨۨۥ r6 = r7.f24535
            r2.add(r6)
            Yue.ۥ۟ۨۨۥ r2 = r7.f24535
            java.util.List<Yue.ۥ۟ۨۨۥ> r2 = r2.f5570
            r2.add(r1)
        L8d:
            int r5 = r5 + 1
            goto L6a
        L90:
            Yue.ۥ۟ۧ۟ۢ r0 = r7.f24529
            Yue.ۥۣۢۦۧ r0 = r0.f4824
            Yue.ۥ۟ۨۨۥ r0 = r0.f24535
            r7.m12784(r0)
            Yue.ۥ۟ۧ۟ۢ r0 = r7.f24529
            Yue.ۥۣۢۦۧ r0 = r0.f4824
            Yue.ۥ۟ۨۨۥ r0 = r0.f24536
            r7.m12784(r0)
            goto L121
        La4:
            Yue.ۥ۟ۨۨۥ r1 = r7.f24535
            Yue.ۥ۟ۨۨۥ$ۥ r2 = Yue.C1814.EnumC1815.f5575
            r1.f5563 = r2
        Laa:
            int r1 = r0.f9724
            if (r5 >= r1) goto Ld0
            Yue.ۥ۟ۧ۟ۢ[] r1 = r0.f9723
            r1 = r1[r5]
            if (r3 != 0) goto Lbb
            int r2 = r1.m7543()
            if (r2 != r4) goto Lbb
            goto Lcd
        Lbb:
            Yue.ۥ۠ۤۦۧ r1 = r1.f4823
            Yue.ۥ۟ۨۨۥ r1 = r1.f24536
            java.util.List<Yue.ۥۣ۟ۨۨ> r2 = r1.f5569
            Yue.ۥ۟ۨۨۥ r6 = r7.f24535
            r2.add(r6)
            Yue.ۥ۟ۨۨۥ r2 = r7.f24535
            java.util.List<Yue.ۥ۟ۨۨۥ> r2 = r2.f5570
            r2.add(r1)
        Lcd:
            int r5 = r5 + 1
            goto Laa
        Ld0:
            Yue.ۥ۟ۧ۟ۢ r0 = r7.f24529
            Yue.ۥ۠ۤۦۧ r0 = r0.f4823
            Yue.ۥ۟ۨۨۥ r0 = r0.f24535
            r7.m12784(r0)
            Yue.ۥ۟ۧ۟ۢ r0 = r7.f24529
            Yue.ۥ۠ۤۦۧ r0 = r0.f4823
            Yue.ۥ۟ۨۨۥ r0 = r0.f24536
            r7.m12784(r0)
            goto L121
        Le3:
            Yue.ۥ۟ۨۨۥ r1 = r7.f24535
            Yue.ۥ۟ۨۨۥ$ۥ r2 = Yue.C1814.EnumC1815.f5574
            r1.f5563 = r2
        Le9:
            int r1 = r0.f9724
            if (r5 >= r1) goto L10f
            Yue.ۥ۟ۧ۟ۢ[] r1 = r0.f9723
            r1 = r1[r5]
            if (r3 != 0) goto Lfa
            int r2 = r1.m7543()
            if (r2 != r4) goto Lfa
            goto L10c
        Lfa:
            Yue.ۥ۠ۤۦۧ r1 = r1.f4823
            Yue.ۥ۟ۨۨۥ r1 = r1.f24535
            java.util.List<Yue.ۥۣ۟ۨۨ> r2 = r1.f5569
            Yue.ۥ۟ۨۨۥ r6 = r7.f24535
            r2.add(r6)
            Yue.ۥ۟ۨۨۥ r2 = r7.f24535
            java.util.List<Yue.ۥ۟ۨۨۥ> r2 = r2.f5570
            r2.add(r1)
        L10c:
            int r5 = r5 + 1
            goto Le9
        L10f:
            Yue.ۥ۟ۧ۟ۢ r0 = r7.f24529
            Yue.ۥ۠ۤۦۧ r0 = r0.f4823
            Yue.ۥ۟ۨۨۥ r0 = r0.f24535
            r7.m12784(r0)
            Yue.ۥ۟ۧ۟ۢ r0 = r7.f24529
            Yue.ۥ۠ۤۦۧ r0 = r0.f4823
            Yue.ۥ۟ۨۨۥ r0 = r0.f24536
            r7.m12784(r0)
        L121:
            return
    }

    @Override // Yue.AbstractC7012
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo5455() {
            r2 = this;
            Yue.ۥ۟ۧ۟ۢ r0 = r2.f24529
            boolean r1 = r0 instanceof Yue.C0721
            if (r1 == 0) goto L25
            Yue.ۥ۟ۢۤۧ r0 = (Yue.C0721) r0
            int r0 = r0.m4471()
            if (r0 == 0) goto L1c
            r1 = 1
            if (r0 != r1) goto L12
            goto L1c
        L12:
            Yue.ۥ۟ۧ۟ۢ r0 = r2.f24529
            Yue.ۥ۟ۨۨۥ r1 = r2.f24535
            int r1 = r1.f5565
            r0.m7621(r1)
            goto L25
        L1c:
            Yue.ۥ۟ۧ۟ۢ r0 = r2.f24529
            Yue.ۥ۟ۨۨۥ r1 = r2.f24535
            int r1 = r1.f5565
            r0.m7620(r1)
        L25:
            return
    }

    @Override // Yue.AbstractC7012
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo5456() {
            r1 = this;
            r0 = 0
            r1.f24530 = r0
            Yue.ۥ۟ۨۨۥ r0 = r1.f24535
            r0.m8537()
            return
    }

    @Override // Yue.AbstractC7012
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo5458() {
            r2 = this;
            Yue.ۥ۟ۨۨۥ r0 = r2.f24535
            r1 = 0
            r0.f5568 = r1
            return
    }

    @Override // Yue.AbstractC7012
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public boolean mo5459() {
            r1 = this;
            r0 = 0
            return r0
    }
}
