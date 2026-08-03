package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5443 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f20186 = 0;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f20187 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f20188 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static int f20189;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int f20190;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean f20191;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Yue.AbstractC7012 f20192;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Yue.AbstractC7012 f20193;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.util.ArrayList<Yue.AbstractC7012> f20194;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f20195;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f20196;

    public C5443(Yue.AbstractC7012 r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f20190 = r0
            r1.f20191 = r0
            r0 = 0
            r1.f20192 = r0
            r1.f20193 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f20194 = r0
            int r0 = Yue.C5443.f20189
            r1.f20195 = r0
            int r0 = r0 + 1
            Yue.C5443.f20189 = r0
            r1.f20192 = r2
            r1.f20193 = r2
            r1.f20196 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m20540(Yue.AbstractC7012 r2) {
            r1 = this;
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r0 = r1.f20194
            r0.add(r2)
            r1.f20193 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public long m20541(Yue.C1520 r12, int r13) {
            r11 = this;
            Yue.ۥۢۥۣ۠ r0 = r11.f20192
            boolean r1 = r0 instanceof Yue.C0968
            r2 = 0
            if (r1 == 0) goto L10
            r1 = r0
            Yue.ۥ۟ۤ۠۠ r1 = (Yue.C0968) r1
            int r1 = r1.f24533
            if (r1 == r13) goto L1c
            return r2
        L10:
            if (r13 != 0) goto L17
            boolean r1 = r0 instanceof Yue.C3078
            if (r1 != 0) goto L1c
            return r2
        L17:
            boolean r1 = r0 instanceof Yue.C6691
            if (r1 != 0) goto L1c
            return r2
        L1c:
            if (r13 != 0) goto L23
            Yue.ۥ۠ۤۦۧ r1 = r12.f4823
        L20:
            Yue.ۥ۟ۨۨۥ r1 = r1.f24535
            goto L26
        L23:
            Yue.ۥۣۢۦۧ r1 = r12.f4824
            goto L20
        L26:
            if (r13 != 0) goto L2d
            Yue.ۥ۠ۤۦۧ r12 = r12.f4823
        L2a:
            Yue.ۥ۟ۨۨۥ r12 = r12.f24536
            goto L30
        L2d:
            Yue.ۥۣۢۦۧ r12 = r12.f4824
            goto L2a
        L30:
            Yue.ۥ۟ۨۨۥ r0 = r0.f24535
            java.util.List<Yue.ۥ۟ۨۨۥ> r0 = r0.f5570
            boolean r0 = r0.contains(r1)
            Yue.ۥۢۥۣ۠ r1 = r11.f20192
            Yue.ۥ۟ۨۨۥ r1 = r1.f24536
            java.util.List<Yue.ۥ۟ۨۨۥ> r1 = r1.f5570
            boolean r12 = r1.contains(r12)
            Yue.ۥۢۥۣ۠ r1 = r11.f20192
            long r4 = r1.mo5457()
            if (r0 == 0) goto Lab
            if (r12 == 0) goto Lab
            Yue.ۥۢۥۣ۠ r12 = r11.f20192
            Yue.ۥ۟ۨۨۥ r12 = r12.f24535
            long r0 = r11.m20545(r12, r2)
            Yue.ۥۢۥۣ۠ r12 = r11.f20192
            Yue.ۥ۟ۨۨۥ r12 = r12.f24536
            long r6 = r11.m20544(r12, r2)
            long r0 = r0 - r4
            Yue.ۥۢۥۣ۠ r12 = r11.f20192
            Yue.ۥ۟ۨۨۥ r8 = r12.f24536
            int r8 = r8.f5564
            int r9 = -r8
            long r9 = (long) r9
            int r9 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r9 < 0) goto L6b
            long r8 = (long) r8
            long r0 = r0 + r8
        L6b:
            long r6 = -r6
            long r6 = r6 - r4
            Yue.ۥ۟ۨۨۥ r8 = r12.f24535
            int r8 = r8.f5564
            long r9 = (long) r8
            long r6 = r6 - r9
            long r9 = (long) r8
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto L7a
            long r8 = (long) r8
            long r6 = r6 - r8
        L7a:
            Yue.ۥ۟ۧ۟ۢ r12 = r12.f24529
            float r12 = r12.m7503(r13)
            r13 = 0
            int r13 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r13 <= 0) goto L8f
            float r13 = (float) r6
            float r13 = r13 / r12
            float r0 = (float) r0
            float r1 = r8 - r12
            float r0 = r0 / r1
            float r13 = r13 + r0
            long r2 = (long) r13
        L8f:
            float r13 = (float) r2
            float r0 = r13 * r12
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            long r2 = (long) r0
            float r8 = r8 - r12
            float r13 = r13 * r8
            float r13 = r13 + r1
            long r12 = (long) r13
            long r2 = r2 + r4
            long r2 = r2 + r12
            Yue.ۥۢۥۣ۠ r12 = r11.f20192
            Yue.ۥ۟ۨۨۥ r13 = r12.f24535
            int r13 = r13.f5564
            long r0 = (long) r13
            long r0 = r0 + r2
            Yue.ۥ۟ۨۨۥ r12 = r12.f24536
            int r12 = r12.f5564
        La8:
            long r12 = (long) r12
            long r0 = r0 - r12
            goto Lf4
        Lab:
            if (r0 == 0) goto Lc5
            Yue.ۥۢۥۣ۠ r12 = r11.f20192
            Yue.ۥ۟ۨۨۥ r12 = r12.f24535
            int r13 = r12.f5564
            long r0 = (long) r13
            long r12 = r11.m20545(r12, r0)
            Yue.ۥۢۥۣ۠ r0 = r11.f20192
            Yue.ۥ۟ۨۨۥ r0 = r0.f24535
            int r0 = r0.f5564
            long r0 = (long) r0
            long r0 = r0 + r4
            long r0 = java.lang.Math.max(r12, r0)
            goto Lf4
        Lc5:
            if (r12 == 0) goto Le1
            Yue.ۥۢۥۣ۠ r12 = r11.f20192
            Yue.ۥ۟ۨۨۥ r12 = r12.f24536
            int r13 = r12.f5564
            long r0 = (long) r13
            long r12 = r11.m20544(r12, r0)
            Yue.ۥۢۥۣ۠ r0 = r11.f20192
            Yue.ۥ۟ۨۨۥ r0 = r0.f24536
            int r0 = r0.f5564
            int r0 = -r0
            long r0 = (long) r0
            long r0 = r0 + r4
            long r12 = -r12
            long r0 = java.lang.Math.max(r12, r0)
            goto Lf4
        Le1:
            Yue.ۥۢۥۣ۠ r12 = r11.f20192
            Yue.ۥ۟ۨۨۥ r13 = r12.f24535
            int r13 = r13.f5564
            long r0 = (long) r13
            long r12 = r12.mo5457()
            long r0 = r0 + r12
            Yue.ۥۢۥۣ۠ r12 = r11.f20192
            Yue.ۥ۟ۨۨۥ r12 = r12.f24536
            int r12 = r12.f5564
            goto La8
        Lf4:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m20542(Yue.AbstractC7012 r6, int r7) {
            r5 = this;
            Yue.ۥ۟ۧ۟ۢ r0 = r6.f24529
            boolean[] r0 = r0.f4825
            boolean r0 = r0[r7]
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            Yue.ۥ۟ۨۨۥ r0 = r6.f24535
            java.util.List<Yue.ۥۣ۟ۨۨ> r0 = r0.f5569
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5a
            java.lang.Object r2 = r0.next()
            Yue.ۥۣ۟ۨۨ r2 = (Yue.InterfaceC1812) r2
            boolean r3 = r2 instanceof Yue.C1814
            if (r3 == 0) goto L12
            Yue.ۥ۟ۨۨۥ r2 = (Yue.C1814) r2
            Yue.ۥۢۥۣ۠ r3 = r2.f5562
            if (r3 != r6) goto L29
            goto L12
        L29:
            Yue.ۥ۟ۨۨۥ r3 = r3.f24535
            if (r2 != r3) goto L12
            boolean r3 = r6 instanceof Yue.C0968
            if (r3 == 0) goto L4a
            r3 = r6
            Yue.ۥ۟ۤ۠۠ r3 = (Yue.C0968) r3
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r3 = r3.f2760
            java.util.Iterator r3 = r3.iterator()
        L3a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L54
            java.lang.Object r4 = r3.next()
            Yue.ۥۢۥۣ۠ r4 = (Yue.AbstractC7012) r4
            r5.m20542(r4, r7)
            goto L3a
        L4a:
            boolean r3 = r6 instanceof Yue.C3024
            if (r3 != 0) goto L54
            Yue.ۥ۟ۧ۟ۢ r3 = r6.f24529
            boolean[] r3 = r3.f4825
            r3[r7] = r1
        L54:
            Yue.ۥۢۥۣ۠ r2 = r2.f5562
            r5.m20542(r2, r7)
            goto L12
        L5a:
            Yue.ۥ۟ۨۨۥ r0 = r6.f24536
            java.util.List<Yue.ۥۣ۟ۨۨ> r0 = r0.f5569
            java.util.Iterator r0 = r0.iterator()
        L62:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Laa
            java.lang.Object r2 = r0.next()
            Yue.ۥۣ۟ۨۨ r2 = (Yue.InterfaceC1812) r2
            boolean r3 = r2 instanceof Yue.C1814
            if (r3 == 0) goto L62
            Yue.ۥ۟ۨۨۥ r2 = (Yue.C1814) r2
            Yue.ۥۢۥۣ۠ r3 = r2.f5562
            if (r3 != r6) goto L79
            goto L62
        L79:
            Yue.ۥ۟ۨۨۥ r3 = r3.f24535
            if (r2 != r3) goto L62
            boolean r3 = r6 instanceof Yue.C0968
            if (r3 == 0) goto L9a
            r3 = r6
            Yue.ۥ۟ۤ۠۠ r3 = (Yue.C0968) r3
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r3 = r3.f2760
            java.util.Iterator r3 = r3.iterator()
        L8a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto La4
            java.lang.Object r4 = r3.next()
            Yue.ۥۢۥۣ۠ r4 = (Yue.AbstractC7012) r4
            r5.m20542(r4, r7)
            goto L8a
        L9a:
            boolean r3 = r6 instanceof Yue.C3024
            if (r3 != 0) goto La4
            Yue.ۥ۟ۧ۟ۢ r3 = r6.f24529
            boolean[] r3 = r3.f4825
            r3[r7] = r1
        La4:
            Yue.ۥۢۥۣ۠ r2 = r2.f5562
            r5.m20542(r2, r7)
            goto L62
        Laa:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m20543(boolean r2, boolean r3) {
            r1 = this;
            if (r2 == 0) goto Lc
            Yue.ۥۢۥۣ۠ r2 = r1.f20192
            boolean r0 = r2 instanceof Yue.C3078
            if (r0 == 0) goto Lc
            r0 = 0
            r1.m20542(r2, r0)
        Lc:
            if (r3 == 0) goto L18
            Yue.ۥۢۥۣ۠ r2 = r1.f20192
            boolean r3 = r2 instanceof Yue.C6691
            if (r3 == 0) goto L18
            r3 = 1
            r1.m20542(r2, r3)
        L18:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final long m20544(Yue.C1814 r9, long r10) {
            r8 = this;
            Yue.ۥۢۥۣ۠ r0 = r9.f5562
            boolean r1 = r0 instanceof Yue.C3024
            if (r1 == 0) goto L7
            return r10
        L7:
            java.util.List<Yue.ۥۣ۟ۨۨ> r1 = r9.f5569
            int r1 = r1.size()
            r2 = 0
            r3 = r10
        Lf:
            if (r2 >= r1) goto L33
            java.util.List<Yue.ۥۣ۟ۨۨ> r5 = r9.f5569
            java.lang.Object r5 = r5.get(r2)
            Yue.ۥۣ۟ۨۨ r5 = (Yue.InterfaceC1812) r5
            boolean r6 = r5 instanceof Yue.C1814
            if (r6 == 0) goto L30
            Yue.ۥ۟ۨۨۥ r5 = (Yue.C1814) r5
            Yue.ۥۢۥۣ۠ r6 = r5.f5562
            if (r6 != r0) goto L24
            goto L30
        L24:
            int r6 = r5.f5564
            long r6 = (long) r6
            long r6 = r6 + r10
            long r5 = r8.m20544(r5, r6)
            long r3 = java.lang.Math.min(r3, r5)
        L30:
            int r2 = r2 + 1
            goto Lf
        L33:
            Yue.ۥ۟ۨۨۥ r1 = r0.f24536
            if (r9 != r1) goto L50
            long r1 = r0.mo5457()
            Yue.ۥ۟ۨۨۥ r9 = r0.f24535
            long r10 = r10 - r1
            long r1 = r8.m20544(r9, r10)
            long r1 = java.lang.Math.min(r3, r1)
            Yue.ۥ۟ۨۨۥ r9 = r0.f24535
            int r9 = r9.f5564
            long r3 = (long) r9
            long r10 = r10 - r3
            long r3 = java.lang.Math.min(r1, r10)
        L50:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final long m20545(Yue.C1814 r9, long r10) {
            r8 = this;
            Yue.ۥۢۥۣ۠ r0 = r9.f5562
            boolean r1 = r0 instanceof Yue.C3024
            if (r1 == 0) goto L7
            return r10
        L7:
            java.util.List<Yue.ۥۣ۟ۨۨ> r1 = r9.f5569
            int r1 = r1.size()
            r2 = 0
            r3 = r10
        Lf:
            if (r2 >= r1) goto L33
            java.util.List<Yue.ۥۣ۟ۨۨ> r5 = r9.f5569
            java.lang.Object r5 = r5.get(r2)
            Yue.ۥۣ۟ۨۨ r5 = (Yue.InterfaceC1812) r5
            boolean r6 = r5 instanceof Yue.C1814
            if (r6 == 0) goto L30
            Yue.ۥ۟ۨۨۥ r5 = (Yue.C1814) r5
            Yue.ۥۢۥۣ۠ r6 = r5.f5562
            if (r6 != r0) goto L24
            goto L30
        L24:
            int r6 = r5.f5564
            long r6 = (long) r6
            long r6 = r6 + r10
            long r5 = r8.m20545(r5, r6)
            long r3 = java.lang.Math.max(r3, r5)
        L30:
            int r2 = r2 + 1
            goto Lf
        L33:
            Yue.ۥ۟ۨۨۥ r1 = r0.f24535
            if (r9 != r1) goto L50
            long r1 = r0.mo5457()
            Yue.ۥ۟ۨۨۥ r9 = r0.f24536
            long r10 = r10 + r1
            long r1 = r8.m20545(r9, r10)
            long r1 = java.lang.Math.max(r3, r1)
            Yue.ۥ۟ۨۨۥ r9 = r0.f24536
            int r9 = r9.f5564
            long r3 = (long) r9
            long r10 = r10 - r3
            long r3 = java.lang.Math.max(r1, r10)
        L50:
            return r3
    }
}
