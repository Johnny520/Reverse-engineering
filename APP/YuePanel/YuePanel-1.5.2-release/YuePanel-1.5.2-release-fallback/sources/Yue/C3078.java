package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3078 extends Yue.AbstractC7012 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static int[] f10048;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۦۧ$ۥ, reason: contains not printable characters */
    public static /* synthetic */ class C3079 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final /* synthetic */ int[] f10049 = null;

        static {
                Yue.ۥۢۥۣ۠$ۥ۟[] r0 = Yue.AbstractC7012.EnumC7014.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Yue.C3078.C3079.f10049 = r0
                Yue.ۥۢۥۣ۠$ۥ۟ r1 = Yue.AbstractC7012.EnumC7014.f24540     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = Yue.C3078.C3079.f10049     // Catch: java.lang.NoSuchFieldError -> L1d
                Yue.ۥۢۥۣ۠$ۥ۟ r1 = Yue.AbstractC7012.EnumC7014.f24541     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = Yue.C3078.C3079.f10049     // Catch: java.lang.NoSuchFieldError -> L28
                Yue.ۥۢۥۣ۠$ۥ۟ r1 = Yue.AbstractC7012.EnumC7014.f24542     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    static {
            r0 = 2
            int[] r0 = new int[r0]
            Yue.C3078.f10048 = r0
            return
    }

    public C3078(Yue.C1517 r2) {
            r1 = this;
            r1.<init>(r2)
            Yue.ۥ۟ۨۨۥ r2 = r1.f24535
            Yue.ۥ۟ۨۨۥ$ۥ r0 = Yue.C1814.EnumC1815.f5574
            r2.f5563 = r0
            Yue.ۥ۟ۨۨۥ r2 = r1.f24536
            Yue.ۥ۟ۨۨۥ$ۥ r0 = Yue.C1814.EnumC1815.f5575
            r2.f5563 = r0
            r2 = 0
            r1.f24533 = r2
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "HorizontalRun "
            r0.append(r1)
            Yue.ۥ۟ۧ۟ۢ r1 = r2.f24529
            java.lang.String r1 = r1.m7507()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.AbstractC7012, Yue.InterfaceC1812
    /* JADX INFO: renamed from: ۥ */
    public void mo5453(Yue.InterfaceC1812 r17) {
            r16 = this;
            r8 = r16
            int[] r0 = Yue.C3078.C3079.f10049
            Yue.ۥۢۥۣ۠$ۥ۟ r1 = r8.f24537
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L29
            if (r0 == r1) goto L23
            if (r0 == r2) goto L17
            goto L2e
        L17:
            Yue.ۥ۟ۧ۟ۢ r0 = r8.f24529
            Yue.ۥ۟ۧ۟۠ r1 = r0.f4854
            Yue.ۥ۟ۧ۟۠ r0 = r0.f4856
            r3 = r17
            r8.m27171(r3, r1, r0, r10)
            return
        L23:
            r3 = r17
            r16.m27172(r17)
            goto L2e
        L29:
            r3 = r17
            r16.m27173(r17)
        L2e:
            Yue.ۥ۠۟ۡۡ r0 = r8.f24532
            boolean r0 = r0.f5568
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L31f
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r0 = r8.f24531
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r3 = Yue.C1517.EnumC1519.f4913
            if (r0 != r3) goto L31f
            Yue.ۥ۟ۧ۟ۢ r0 = r8.f24529
            int r3 = r0.f4834
            if (r3 == r1) goto L302
            if (r3 == r2) goto L46
            goto L31f
        L46:
            int r1 = r0.f4835
            r3 = -1
            if (r1 == 0) goto L8f
            if (r1 != r2) goto L4e
            goto L8f
        L4e:
            int r0 = r0.m7510()
            if (r0 == r3) goto L7a
            if (r0 == 0) goto L6b
            if (r0 == r9) goto L5a
            r0 = r10
            goto L88
        L5a:
            Yue.ۥ۟ۧ۟ۢ r0 = r8.f24529
            Yue.ۥۣۢۦۧ r1 = r0.f4824
            Yue.ۥ۠۟ۡۡ r1 = r1.f24532
            int r1 = r1.f5565
            float r1 = (float) r1
            float r0 = r0.m7509()
        L67:
            float r1 = r1 * r0
        L68:
            float r1 = r1 + r11
            int r0 = (int) r1
            goto L88
        L6b:
            Yue.ۥ۟ۧ۟ۢ r0 = r8.f24529
            Yue.ۥۣۢۦۧ r1 = r0.f4824
            Yue.ۥ۠۟ۡۡ r1 = r1.f24532
            int r1 = r1.f5565
            float r1 = (float) r1
            float r0 = r0.m7509()
            float r1 = r1 / r0
            goto L68
        L7a:
            Yue.ۥ۟ۧ۟ۢ r0 = r8.f24529
            Yue.ۥۣۢۦۧ r1 = r0.f4824
            Yue.ۥ۠۟ۡۡ r1 = r1.f24532
            int r1 = r1.f5565
            float r1 = (float) r1
            float r0 = r0.m7509()
            goto L67
        L88:
            Yue.ۥ۠۟ۡۡ r1 = r8.f24532
            r1.mo8539(r0)
            goto L31f
        L8f:
            Yue.ۥۣۢۦۧ r1 = r0.f4824
            Yue.ۥ۟ۨۨۥ r12 = r1.f24535
            Yue.ۥ۟ۨۨۥ r13 = r1.f24536
            Yue.ۥ۟ۧ۟۠ r1 = r0.f4854
            Yue.ۥ۟ۧ۟۠ r1 = r1.f4737
            if (r1 == 0) goto L9d
            r1 = r9
            goto L9e
        L9d:
            r1 = r10
        L9e:
            Yue.ۥ۟ۧ۟۠ r2 = r0.f4855
            Yue.ۥ۟ۧ۟۠ r2 = r2.f4737
            if (r2 == 0) goto La6
            r2 = r9
            goto La7
        La6:
            r2 = r10
        La7:
            Yue.ۥ۟ۧ۟۠ r4 = r0.f4856
            Yue.ۥ۟ۧ۟۠ r4 = r4.f4737
            if (r4 == 0) goto Laf
            r4 = r9
            goto Lb0
        Laf:
            r4 = r10
        Lb0:
            Yue.ۥ۟ۧ۟۠ r5 = r0.f4857
            Yue.ۥ۟ۧ۟۠ r5 = r5.f4737
            if (r5 == 0) goto Lb8
            r5 = r9
            goto Lb9
        Lb8:
            r5 = r10
        Lb9:
            int r14 = r0.m7510()
            if (r1 == 0) goto L200
            if (r2 == 0) goto L200
            if (r4 == 0) goto L200
            if (r5 == 0) goto L200
            Yue.ۥ۟ۧ۟ۢ r0 = r8.f24529
            float r15 = r0.m7509()
            boolean r0 = r12.f5568
            if (r0 == 0) goto L12e
            boolean r0 = r13.f5568
            if (r0 == 0) goto L12e
            Yue.ۥ۟ۨۨۥ r0 = r8.f24535
            boolean r1 = r0.f5561
            if (r1 == 0) goto L12d
            Yue.ۥ۟ۨۨۥ r1 = r8.f24536
            boolean r1 = r1.f5561
            if (r1 != 0) goto Le0
            goto L12d
        Le0:
            java.util.List<Yue.ۥ۟ۨۨۥ> r0 = r0.f5570
            java.lang.Object r0 = r0.get(r10)
            Yue.ۥ۟ۨۨۥ r0 = (Yue.C1814) r0
            int r0 = r0.f5565
            Yue.ۥ۟ۨۨۥ r1 = r8.f24535
            int r1 = r1.f5564
            int r2 = r0 + r1
            Yue.ۥ۟ۨۨۥ r0 = r8.f24536
            java.util.List<Yue.ۥ۟ۨۨۥ> r0 = r0.f5570
            java.lang.Object r0 = r0.get(r10)
            Yue.ۥ۟ۨۨۥ r0 = (Yue.C1814) r0
            int r0 = r0.f5565
            Yue.ۥ۟ۨۨۥ r1 = r8.f24536
            int r1 = r1.f5564
            int r3 = r0 - r1
            int r0 = r12.f5565
            int r1 = r12.f5564
            int r4 = r0 + r1
            int r0 = r13.f5565
            int r1 = r13.f5564
            int r5 = r0 - r1
            int[] r1 = Yue.C3078.f10048
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m12960(r1, r2, r3, r4, r5, r6, r7)
            Yue.ۥ۠۟ۡۡ r0 = r8.f24532
            int[] r1 = Yue.C3078.f10048
            r1 = r1[r10]
            r0.mo8539(r1)
            Yue.ۥ۟ۧ۟ۢ r0 = r8.f24529
            Yue.ۥۣۢۦۧ r0 = r0.f4824
            Yue.ۥ۠۟ۡۡ r0 = r0.f24532
            int[] r1 = Yue.C3078.f10048
            r1 = r1[r9]
            r0.mo8539(r1)
        L12d:
            return
        L12e:
            Yue.ۥ۟ۨۨۥ r0 = r8.f24535
            boolean r1 = r0.f5568
            if (r1 == 0) goto L18b
            Yue.ۥ۟ۨۨۥ r1 = r8.f24536
            boolean r2 = r1.f5568
            if (r2 == 0) goto L18b
            boolean r2 = r12.f5561
            if (r2 == 0) goto L18a
            boolean r2 = r13.f5561
            if (r2 != 0) goto L143
            goto L18a
        L143:
            int r2 = r0.f5565
            int r0 = r0.f5564
            int r2 = r2 + r0
            int r0 = r1.f5565
            int r1 = r1.f5564
            int r3 = r0 - r1
            java.util.List<Yue.ۥ۟ۨۨۥ> r0 = r12.f5570
            java.lang.Object r0 = r0.get(r10)
            Yue.ۥ۟ۨۨۥ r0 = (Yue.C1814) r0
            int r0 = r0.f5565
            int r1 = r12.f5564
            int r4 = r0 + r1
            java.util.List<Yue.ۥ۟ۨۨۥ> r0 = r13.f5570
            java.lang.Object r0 = r0.get(r10)
            Yue.ۥ۟ۨۨۥ r0 = (Yue.C1814) r0
            int r0 = r0.f5565
            int r1 = r13.f5564
            int r5 = r0 - r1
            int[] r1 = Yue.C3078.f10048
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m12960(r1, r2, r3, r4, r5, r6, r7)
            Yue.ۥ۠۟ۡۡ r0 = r8.f24532
            int[] r1 = Yue.C3078.f10048
            r1 = r1[r10]
            r0.mo8539(r1)
            Yue.ۥ۟ۧ۟ۢ r0 = r8.f24529
            Yue.ۥۣۢۦۧ r0 = r0.f4824
            Yue.ۥ۠۟ۡۡ r0 = r0.f24532
            int[] r1 = Yue.C3078.f10048
            r1 = r1[r9]
            r0.mo8539(r1)
            goto L18b
        L18a:
            return
        L18b:
            Yue.ۥ۟ۨۨۥ r0 = r8.f24535
            boolean r1 = r0.f5561
            if (r1 == 0) goto L1ff
            Yue.ۥ۟ۨۨۥ r1 = r8.f24536
            boolean r1 = r1.f5561
            if (r1 == 0) goto L1ff
            boolean r1 = r12.f5561
            if (r1 == 0) goto L1ff
            boolean r1 = r13.f5561
            if (r1 != 0) goto L1a0
            goto L1ff
        L1a0:
            java.util.List<Yue.ۥ۟ۨۨۥ> r0 = r0.f5570
            java.lang.Object r0 = r0.get(r10)
            Yue.ۥ۟ۨۨۥ r0 = (Yue.C1814) r0
            int r0 = r0.f5565
            Yue.ۥ۟ۨۨۥ r1 = r8.f24535
            int r1 = r1.f5564
            int r2 = r0 + r1
            Yue.ۥ۟ۨۨۥ r0 = r8.f24536
            java.util.List<Yue.ۥ۟ۨۨۥ> r0 = r0.f5570
            java.lang.Object r0 = r0.get(r10)
            Yue.ۥ۟ۨۨۥ r0 = (Yue.C1814) r0
            int r0 = r0.f5565
            Yue.ۥ۟ۨۨۥ r1 = r8.f24536
            int r1 = r1.f5564
            int r3 = r0 - r1
            java.util.List<Yue.ۥ۟ۨۨۥ> r0 = r12.f5570
            java.lang.Object r0 = r0.get(r10)
            Yue.ۥ۟ۨۨۥ r0 = (Yue.C1814) r0
            int r0 = r0.f5565
            int r1 = r12.f5564
            int r4 = r0 + r1
            java.util.List<Yue.ۥ۟ۨۨۥ> r0 = r13.f5570
            java.lang.Object r0 = r0.get(r10)
            Yue.ۥ۟ۨۨۥ r0 = (Yue.C1814) r0
            int r0 = r0.f5565
            int r1 = r13.f5564
            int r5 = r0 - r1
            int[] r1 = Yue.C3078.f10048
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m12960(r1, r2, r3, r4, r5, r6, r7)
            Yue.ۥ۠۟ۡۡ r0 = r8.f24532
            int[] r1 = Yue.C3078.f10048
            r1 = r1[r10]
            r0.mo8539(r1)
            Yue.ۥ۟ۧ۟ۢ r0 = r8.f24529
            Yue.ۥۣۢۦۧ r0 = r0.f4824
            Yue.ۥ۠۟ۡۡ r0 = r0.f24532
            int[] r1 = Yue.C3078.f10048
            r1 = r1[r9]
            r0.mo8539(r1)
            goto L31f
        L1ff:
            return
        L200:
            if (r1 == 0) goto L289
            if (r4 == 0) goto L289
            Yue.ۥ۟ۨۨۥ r0 = r8.f24535
            boolean r0 = r0.f5561
            if (r0 == 0) goto L288
            Yue.ۥ۟ۨۨۥ r0 = r8.f24536
            boolean r0 = r0.f5561
            if (r0 != 0) goto L212
            goto L288
        L212:
            Yue.ۥ۟ۧ۟ۢ r0 = r8.f24529
            float r0 = r0.m7509()
            Yue.ۥ۟ۨۨۥ r1 = r8.f24535
            java.util.List<Yue.ۥ۟ۨۨۥ> r1 = r1.f5570
            java.lang.Object r1 = r1.get(r10)
            Yue.ۥ۟ۨۨۥ r1 = (Yue.C1814) r1
            int r1 = r1.f5565
            Yue.ۥ۟ۨۨۥ r2 = r8.f24535
            int r2 = r2.f5564
            int r1 = r1 + r2
            Yue.ۥ۟ۨۨۥ r2 = r8.f24536
            java.util.List<Yue.ۥ۟ۨۨۥ> r2 = r2.f5570
            java.lang.Object r2 = r2.get(r10)
            Yue.ۥ۟ۨۨۥ r2 = (Yue.C1814) r2
            int r2 = r2.f5565
            Yue.ۥ۟ۨۨۥ r4 = r8.f24536
            int r4 = r4.f5564
            int r2 = r2 - r4
            if (r14 == r3) goto L265
            if (r14 == 0) goto L265
            if (r14 == r9) goto L242
            goto L31f
        L242:
            int r2 = r2 - r1
            int r1 = r8.m27164(r2, r10)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.m27164(r2, r9)
            if (r2 == r3) goto L255
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L255:
            Yue.ۥ۠۟ۡۡ r0 = r8.f24532
            r0.mo8539(r1)
            Yue.ۥ۟ۧ۟ۢ r0 = r8.f24529
            Yue.ۥۣۢۦۧ r0 = r0.f4824
            Yue.ۥ۠۟ۡۡ r0 = r0.f24532
            r0.mo8539(r3)
            goto L31f
        L265:
            int r2 = r2 - r1
            int r1 = r8.m27164(r2, r10)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.m27164(r2, r9)
            if (r2 == r3) goto L278
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L278:
            Yue.ۥ۠۟ۡۡ r0 = r8.f24532
            r0.mo8539(r1)
            Yue.ۥ۟ۧ۟ۢ r0 = r8.f24529
            Yue.ۥۣۢۦۧ r0 = r0.f4824
            Yue.ۥ۠۟ۡۡ r0 = r0.f24532
            r0.mo8539(r3)
            goto L31f
        L288:
            return
        L289:
            if (r2 == 0) goto L31f
            if (r5 == 0) goto L31f
            boolean r0 = r12.f5561
            if (r0 == 0) goto L301
            boolean r0 = r13.f5561
            if (r0 != 0) goto L296
            goto L301
        L296:
            Yue.ۥ۟ۧ۟ۢ r0 = r8.f24529
            float r0 = r0.m7509()
            java.util.List<Yue.ۥ۟ۨۨۥ> r1 = r12.f5570
            java.lang.Object r1 = r1.get(r10)
            Yue.ۥ۟ۨۨۥ r1 = (Yue.C1814) r1
            int r1 = r1.f5565
            int r2 = r12.f5564
            int r1 = r1 + r2
            java.util.List<Yue.ۥ۟ۨۨۥ> r2 = r13.f5570
            java.lang.Object r2 = r2.get(r10)
            Yue.ۥ۟ۨۨۥ r2 = (Yue.C1814) r2
            int r2 = r2.f5565
            int r4 = r13.f5564
            int r2 = r2 - r4
            if (r14 == r3) goto L2df
            if (r14 == 0) goto L2bd
            if (r14 == r9) goto L2df
            goto L31f
        L2bd:
            int r2 = r2 - r1
            int r1 = r8.m27164(r2, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.m27164(r2, r10)
            if (r2 == r3) goto L2d0
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L2d0:
            Yue.ۥ۠۟ۡۡ r0 = r8.f24532
            r0.mo8539(r3)
            Yue.ۥ۟ۧ۟ۢ r0 = r8.f24529
            Yue.ۥۣۢۦۧ r0 = r0.f4824
            Yue.ۥ۠۟ۡۡ r0 = r0.f24532
            r0.mo8539(r1)
            goto L31f
        L2df:
            int r2 = r2 - r1
            int r1 = r8.m27164(r2, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.m27164(r2, r10)
            if (r2 == r3) goto L2f2
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L2f2:
            Yue.ۥ۠۟ۡۡ r0 = r8.f24532
            r0.mo8539(r3)
            Yue.ۥ۟ۧ۟ۢ r0 = r8.f24529
            Yue.ۥۣۢۦۧ r0 = r0.f4824
            Yue.ۥ۠۟ۡۡ r0 = r0.f24532
            r0.mo8539(r1)
            goto L31f
        L301:
            return
        L302:
            Yue.ۥ۟ۧ۟ۢ r0 = r0.m7529()
            if (r0 == 0) goto L31f
            Yue.ۥ۠ۤۦۧ r0 = r0.f4823
            Yue.ۥ۠۟ۡۡ r0 = r0.f24532
            boolean r1 = r0.f5568
            if (r1 == 0) goto L31f
            Yue.ۥ۟ۧ۟ۢ r1 = r8.f24529
            float r1 = r1.f4839
            int r0 = r0.f5565
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
            Yue.ۥ۠۟ۡۡ r1 = r8.f24532
            r1.mo8539(r0)
        L31f:
            Yue.ۥ۟ۨۨۥ r0 = r8.f24535
            boolean r1 = r0.f5561
            if (r1 == 0) goto L43f
            Yue.ۥ۟ۨۨۥ r1 = r8.f24536
            boolean r2 = r1.f5561
            if (r2 != 0) goto L32d
            goto L43f
        L32d:
            boolean r0 = r0.f5568
            if (r0 == 0) goto L33c
            boolean r0 = r1.f5568
            if (r0 == 0) goto L33c
            Yue.ۥ۠۟ۡۡ r0 = r8.f24532
            boolean r0 = r0.f5568
            if (r0 == 0) goto L33c
            return
        L33c:
            Yue.ۥ۠۟ۡۡ r0 = r8.f24532
            boolean r0 = r0.f5568
            if (r0 != 0) goto L386
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r0 = r8.f24531
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = Yue.C1517.EnumC1519.f4913
            if (r0 != r1) goto L386
            Yue.ۥ۟ۧ۟ۢ r0 = r8.f24529
            int r1 = r0.f4834
            if (r1 != 0) goto L386
            boolean r0 = r0.m7553()
            if (r0 != 0) goto L386
            Yue.ۥ۟ۨۨۥ r0 = r8.f24535
            java.util.List<Yue.ۥ۟ۨۨۥ> r0 = r0.f5570
            java.lang.Object r0 = r0.get(r10)
            Yue.ۥ۟ۨۨۥ r0 = (Yue.C1814) r0
            Yue.ۥ۟ۨۨۥ r1 = r8.f24536
            java.util.List<Yue.ۥ۟ۨۨۥ> r1 = r1.f5570
            java.lang.Object r1 = r1.get(r10)
            Yue.ۥ۟ۨۨۥ r1 = (Yue.C1814) r1
            int r0 = r0.f5565
            Yue.ۥ۟ۨۨۥ r2 = r8.f24535
            int r3 = r2.f5564
            int r0 = r0 + r3
            int r1 = r1.f5565
            Yue.ۥ۟ۨۨۥ r3 = r8.f24536
            int r3 = r3.f5564
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.mo8539(r0)
            Yue.ۥ۟ۨۨۥ r0 = r8.f24536
            r0.mo8539(r1)
            Yue.ۥ۠۟ۡۡ r0 = r8.f24532
            r0.mo8539(r3)
            return
        L386:
            Yue.ۥ۠۟ۡۡ r0 = r8.f24532
            boolean r0 = r0.f5568
            if (r0 != 0) goto L3ea
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r0 = r8.f24531
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = Yue.C1517.EnumC1519.f4913
            if (r0 != r1) goto L3ea
            int r0 = r8.f24528
            if (r0 != r9) goto L3ea
            Yue.ۥ۟ۨۨۥ r0 = r8.f24535
            java.util.List<Yue.ۥ۟ۨۨۥ> r0 = r0.f5570
            int r0 = r0.size()
            if (r0 <= 0) goto L3ea
            Yue.ۥ۟ۨۨۥ r0 = r8.f24536
            java.util.List<Yue.ۥ۟ۨۨۥ> r0 = r0.f5570
            int r0 = r0.size()
            if (r0 <= 0) goto L3ea
            Yue.ۥ۟ۨۨۥ r0 = r8.f24535
            java.util.List<Yue.ۥ۟ۨۨۥ> r0 = r0.f5570
            java.lang.Object r0 = r0.get(r10)
            Yue.ۥ۟ۨۨۥ r0 = (Yue.C1814) r0
            Yue.ۥ۟ۨۨۥ r1 = r8.f24536
            java.util.List<Yue.ۥ۟ۨۨۥ> r1 = r1.f5570
            java.lang.Object r1 = r1.get(r10)
            Yue.ۥ۟ۨۨۥ r1 = (Yue.C1814) r1
            int r0 = r0.f5565
            Yue.ۥ۟ۨۨۥ r2 = r8.f24535
            int r2 = r2.f5564
            int r0 = r0 + r2
            int r1 = r1.f5565
            Yue.ۥ۟ۨۨۥ r2 = r8.f24536
            int r2 = r2.f5564
            int r1 = r1 + r2
            int r1 = r1 - r0
            Yue.ۥ۠۟ۡۡ r0 = r8.f24532
            int r0 = r0.f5704
            int r0 = java.lang.Math.min(r1, r0)
            Yue.ۥ۟ۧ۟ۢ r1 = r8.f24529
            int r2 = r1.f4838
            int r1 = r1.f4837
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L3e5
            int r0 = java.lang.Math.min(r2, r0)
        L3e5:
            Yue.ۥ۠۟ۡۡ r1 = r8.f24532
            r1.mo8539(r0)
        L3ea:
            Yue.ۥ۠۟ۡۡ r0 = r8.f24532
            boolean r0 = r0.f5568
            if (r0 != 0) goto L3f1
            return
        L3f1:
            Yue.ۥ۟ۨۨۥ r0 = r8.f24535
            java.util.List<Yue.ۥ۟ۨۨۥ> r0 = r0.f5570
            java.lang.Object r0 = r0.get(r10)
            Yue.ۥ۟ۨۨۥ r0 = (Yue.C1814) r0
            Yue.ۥ۟ۨۨۥ r1 = r8.f24536
            java.util.List<Yue.ۥ۟ۨۨۥ> r1 = r1.f5570
            java.lang.Object r1 = r1.get(r10)
            Yue.ۥ۟ۨۨۥ r1 = (Yue.C1814) r1
            int r2 = r0.f5565
            Yue.ۥ۟ۨۨۥ r3 = r8.f24535
            int r3 = r3.f5564
            int r2 = r2 + r3
            int r3 = r1.f5565
            Yue.ۥ۟ۨۨۥ r4 = r8.f24536
            int r4 = r4.f5564
            int r3 = r3 + r4
            Yue.ۥ۟ۧ۟ۢ r4 = r8.f24529
            float r4 = r4.m7513()
            if (r0 != r1) goto L420
            int r2 = r0.f5565
            int r3 = r1.f5565
            r4 = r11
        L420:
            int r3 = r3 - r2
            Yue.ۥ۠۟ۡۡ r0 = r8.f24532
            int r0 = r0.f5565
            int r3 = r3 - r0
            Yue.ۥ۟ۨۨۥ r0 = r8.f24535
            float r1 = (float) r2
            float r1 = r1 + r11
            float r2 = (float) r3
            float r2 = r2 * r4
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.mo8539(r1)
            Yue.ۥ۟ۨۨۥ r0 = r8.f24536
            Yue.ۥ۟ۨۨۥ r1 = r8.f24535
            int r1 = r1.f5565
            Yue.ۥ۠۟ۡۡ r2 = r8.f24532
            int r2 = r2.f5565
            int r1 = r1 + r2
            r0.mo8539(r1)
        L43f:
            return
    }

    @Override // Yue.AbstractC7012
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo5454() {
            r7 = this;
            Yue.ۥ۟ۧ۟ۢ r0 = r7.f24529
            boolean r1 = r0.f4819
            if (r1 == 0) goto Lf
            Yue.ۥ۠۟ۡۡ r1 = r7.f24532
            int r0 = r0.m7544()
            r1.mo8539(r0)
        Lf:
            Yue.ۥ۠۟ۡۡ r0 = r7.f24532
            boolean r0 = r0.f5568
            if (r0 != 0) goto L8c
            Yue.ۥ۟ۧ۟ۢ r0 = r7.f24529
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r0 = r0.m7516()
            r7.f24531 = r0
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = Yue.C1517.EnumC1519.f4913
            if (r0 == r1) goto Lcc
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = Yue.C1517.EnumC1519.f4914
            if (r0 != r1) goto L7a
            Yue.ۥ۟ۧ۟ۢ r0 = r7.f24529
            Yue.ۥ۟ۧ۟ۢ r0 = r0.m7529()
            if (r0 == 0) goto L35
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r2 = r0.m7516()
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r3 = Yue.C1517.EnumC1519.f4911
            if (r2 == r3) goto L3b
        L35:
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r2 = r0.m7516()
            if (r2 != r1) goto L7a
        L3b:
            int r1 = r0.m7544()
            Yue.ۥ۟ۧ۟ۢ r2 = r7.f24529
            Yue.ۥ۟ۧ۟۠ r2 = r2.f4854
            int r2 = r2.m7412()
            int r1 = r1 - r2
            Yue.ۥ۟ۧ۟ۢ r2 = r7.f24529
            Yue.ۥ۟ۧ۟۠ r2 = r2.f4856
            int r2 = r2.m7412()
            int r1 = r1 - r2
            Yue.ۥ۟ۨۨۥ r2 = r7.f24535
            Yue.ۥ۠ۤۦۧ r3 = r0.f4823
            Yue.ۥ۟ۨۨۥ r3 = r3.f24535
            Yue.ۥ۟ۧ۟ۢ r4 = r7.f24529
            Yue.ۥ۟ۧ۟۠ r4 = r4.f4854
            int r4 = r4.m7412()
            r7.m27162(r2, r3, r4)
            Yue.ۥ۟ۨۨۥ r2 = r7.f24536
            Yue.ۥ۠ۤۦۧ r0 = r0.f4823
            Yue.ۥ۟ۨۨۥ r0 = r0.f24536
            Yue.ۥ۟ۧ۟ۢ r3 = r7.f24529
            Yue.ۥ۟ۧ۟۠ r3 = r3.f4856
            int r3 = r3.m7412()
            int r3 = -r3
            r7.m27162(r2, r0, r3)
            Yue.ۥ۠۟ۡۡ r0 = r7.f24532
            r0.mo8539(r1)
            return
        L7a:
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r0 = r7.f24531
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = Yue.C1517.EnumC1519.f4911
            if (r0 != r1) goto Lcc
            Yue.ۥ۠۟ۡۡ r0 = r7.f24532
            Yue.ۥ۟ۧ۟ۢ r1 = r7.f24529
            int r1 = r1.m7544()
            r0.mo8539(r1)
            goto Lcc
        L8c:
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r0 = r7.f24531
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = Yue.C1517.EnumC1519.f4914
            if (r0 != r1) goto Lcc
            Yue.ۥ۟ۧ۟ۢ r0 = r7.f24529
            Yue.ۥ۟ۧ۟ۢ r0 = r0.m7529()
            if (r0 == 0) goto La2
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r2 = r0.m7516()
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r3 = Yue.C1517.EnumC1519.f4911
            if (r2 == r3) goto La8
        La2:
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r2 = r0.m7516()
            if (r2 != r1) goto Lcc
        La8:
            Yue.ۥ۟ۨۨۥ r1 = r7.f24535
            Yue.ۥ۠ۤۦۧ r2 = r0.f4823
            Yue.ۥ۟ۨۨۥ r2 = r2.f24535
            Yue.ۥ۟ۧ۟ۢ r3 = r7.f24529
            Yue.ۥ۟ۧ۟۠ r3 = r3.f4854
            int r3 = r3.m7412()
            r7.m27162(r1, r2, r3)
            Yue.ۥ۟ۨۨۥ r1 = r7.f24536
            Yue.ۥ۠ۤۦۧ r0 = r0.f4823
            Yue.ۥ۟ۨۨۥ r0 = r0.f24536
            Yue.ۥ۟ۧ۟ۢ r2 = r7.f24529
            Yue.ۥ۟ۧ۟۠ r2 = r2.f4856
            int r2 = r2.m7412()
            int r2 = -r2
            r7.m27162(r1, r0, r2)
            return
        Lcc:
            Yue.ۥ۠۟ۡۡ r0 = r7.f24532
            boolean r1 = r0.f5568
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1d4
            Yue.ۥ۟ۧ۟ۢ r1 = r7.f24529
            boolean r4 = r1.f4819
            if (r4 == 0) goto L1d4
            Yue.ۥ۟ۧ۟۠[] r0 = r1.f4862
            r4 = r0[r2]
            Yue.ۥ۟ۧ۟۠ r5 = r4.f4737
            if (r5 == 0) goto L14e
            r6 = r0[r3]
            Yue.ۥ۟ۧ۟۠ r6 = r6.f4737
            if (r6 == 0) goto L14e
            boolean r0 = r1.m7553()
            if (r0 == 0) goto L10d
            Yue.ۥ۟ۨۨۥ r0 = r7.f24535
            Yue.ۥ۟ۧ۟ۢ r1 = r7.f24529
            Yue.ۥ۟ۧ۟۠[] r1 = r1.f4862
            r1 = r1[r2]
            int r1 = r1.m7412()
            r0.f5564 = r1
            Yue.ۥ۟ۨۨۥ r0 = r7.f24536
            Yue.ۥ۟ۧ۟ۢ r1 = r7.f24529
            Yue.ۥ۟ۧ۟۠[] r1 = r1.f4862
            r1 = r1[r3]
            int r1 = r1.m7412()
            int r1 = -r1
            r0.f5564 = r1
            goto L3cd
        L10d:
            Yue.ۥ۟ۧ۟ۢ r0 = r7.f24529
            Yue.ۥ۟ۧ۟۠[] r0 = r0.f4862
            r0 = r0[r2]
            Yue.ۥ۟ۨۨۥ r0 = r7.m27165(r0)
            if (r0 == 0) goto L128
            Yue.ۥ۟ۨۨۥ r1 = r7.f24535
            Yue.ۥ۟ۧ۟ۢ r4 = r7.f24529
            Yue.ۥ۟ۧ۟۠[] r4 = r4.f4862
            r2 = r4[r2]
            int r2 = r2.m7412()
            r7.m27162(r1, r0, r2)
        L128:
            Yue.ۥ۟ۧ۟ۢ r0 = r7.f24529
            Yue.ۥ۟ۧ۟۠[] r0 = r0.f4862
            r0 = r0[r3]
            Yue.ۥ۟ۨۨۥ r0 = r7.m27165(r0)
            if (r0 == 0) goto L144
            Yue.ۥ۟ۨۨۥ r1 = r7.f24536
            Yue.ۥ۟ۧ۟ۢ r2 = r7.f24529
            Yue.ۥ۟ۧ۟۠[] r2 = r2.f4862
            r2 = r2[r3]
            int r2 = r2.m7412()
            int r2 = -r2
            r7.m27162(r1, r0, r2)
        L144:
            Yue.ۥ۟ۨۨۥ r0 = r7.f24535
            r0.f5560 = r3
            Yue.ۥ۟ۨۨۥ r0 = r7.f24536
            r0.f5560 = r3
            goto L3cd
        L14e:
            if (r5 == 0) goto L172
            Yue.ۥ۟ۨۨۥ r0 = r7.m27165(r4)
            if (r0 == 0) goto L3cd
            Yue.ۥ۟ۨۨۥ r1 = r7.f24535
            Yue.ۥ۟ۧ۟ۢ r3 = r7.f24529
            Yue.ۥ۟ۧ۟۠[] r3 = r3.f4862
            r2 = r3[r2]
            int r2 = r2.m7412()
            r7.m27162(r1, r0, r2)
            Yue.ۥ۟ۨۨۥ r0 = r7.f24536
            Yue.ۥ۟ۨۨۥ r1 = r7.f24535
            Yue.ۥ۠۟ۡۡ r2 = r7.f24532
            int r2 = r2.f5565
            r7.m27162(r0, r1, r2)
            goto L3cd
        L172:
            r0 = r0[r3]
            Yue.ۥ۟ۧ۟۠ r2 = r0.f4737
            if (r2 == 0) goto L19c
            Yue.ۥ۟ۨۨۥ r0 = r7.m27165(r0)
            if (r0 == 0) goto L3cd
            Yue.ۥ۟ۨۨۥ r1 = r7.f24536
            Yue.ۥ۟ۧ۟ۢ r2 = r7.f24529
            Yue.ۥ۟ۧ۟۠[] r2 = r2.f4862
            r2 = r2[r3]
            int r2 = r2.m7412()
            int r2 = -r2
            r7.m27162(r1, r0, r2)
            Yue.ۥ۟ۨۨۥ r0 = r7.f24535
            Yue.ۥ۟ۨۨۥ r1 = r7.f24536
            Yue.ۥ۠۟ۡۡ r2 = r7.f24532
            int r2 = r2.f5565
            int r2 = -r2
            r7.m27162(r0, r1, r2)
            goto L3cd
        L19c:
            boolean r0 = r1 instanceof Yue.InterfaceC3022
            if (r0 != 0) goto L3cd
            Yue.ۥ۟ۧ۟ۢ r0 = r1.m7529()
            if (r0 == 0) goto L3cd
            Yue.ۥ۟ۧ۟ۢ r0 = r7.f24529
            Yue.ۥ۟ۧ۟۠$ۥ۟ r1 = Yue.C1510.EnumC1512.f4748
            Yue.ۥ۟ۧ۟۠ r0 = r0.mo7500(r1)
            Yue.ۥ۟ۧ۟۠ r0 = r0.f4737
            if (r0 != 0) goto L3cd
            Yue.ۥ۟ۧ۟ۢ r0 = r7.f24529
            Yue.ۥ۟ۧ۟ۢ r0 = r0.m7529()
            Yue.ۥ۠ۤۦۧ r0 = r0.f4823
            Yue.ۥ۟ۨۨۥ r0 = r0.f24535
            Yue.ۥ۟ۨۨۥ r1 = r7.f24535
            Yue.ۥ۟ۧ۟ۢ r2 = r7.f24529
            int r2 = r2.m7545()
            r7.m27162(r1, r0, r2)
            Yue.ۥ۟ۨۨۥ r0 = r7.f24536
            Yue.ۥ۟ۨۨۥ r1 = r7.f24535
            Yue.ۥ۠۟ۡۡ r2 = r7.f24532
            int r2 = r2.f5565
            r7.m27162(r0, r1, r2)
            goto L3cd
        L1d4:
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = r7.f24531
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r4 = Yue.C1517.EnumC1519.f4913
            if (r1 != r4) goto L309
            Yue.ۥ۟ۧ۟ۢ r1 = r7.f24529
            int r4 = r1.f4834
            r5 = 2
            if (r4 == r5) goto L2dc
            r5 = 3
            if (r4 == r5) goto L1e6
            goto L309
        L1e6:
            int r4 = r1.f4835
            if (r4 != r5) goto L28b
            Yue.ۥ۟ۨۨۥ r4 = r7.f24535
            r4.f5559 = r7
            Yue.ۥ۟ۨۨۥ r4 = r7.f24536
            r4.f5559 = r7
            Yue.ۥۣۢۦۧ r4 = r1.f4824
            Yue.ۥ۟ۨۨۥ r5 = r4.f24535
            r5.f5559 = r7
            Yue.ۥ۟ۨۨۥ r4 = r4.f24536
            r4.f5559 = r7
            r0.f5559 = r7
            boolean r0 = r1.m7555()
            if (r0 == 0) goto L258
            Yue.ۥ۠۟ۡۡ r0 = r7.f24532
            java.util.List<Yue.ۥ۟ۨۨۥ> r0 = r0.f5570
            Yue.ۥ۟ۧ۟ۢ r1 = r7.f24529
            Yue.ۥۣۢۦۧ r1 = r1.f4824
            Yue.ۥ۠۟ۡۡ r1 = r1.f24532
            r0.add(r1)
            Yue.ۥ۟ۧ۟ۢ r0 = r7.f24529
            Yue.ۥۣۢۦۧ r0 = r0.f4824
            Yue.ۥ۠۟ۡۡ r0 = r0.f24532
            java.util.List<Yue.ۥۣ۟ۨۨ> r0 = r0.f5569
            Yue.ۥ۠۟ۡۡ r1 = r7.f24532
            r0.add(r1)
            Yue.ۥ۟ۧ۟ۢ r0 = r7.f24529
            Yue.ۥۣۢۦۧ r0 = r0.f4824
            Yue.ۥ۠۟ۡۡ r1 = r0.f24532
            r1.f5559 = r7
            Yue.ۥ۠۟ۡۡ r1 = r7.f24532
            java.util.List<Yue.ۥ۟ۨۨۥ> r1 = r1.f5570
            Yue.ۥ۟ۨۨۥ r0 = r0.f24535
            r1.add(r0)
            Yue.ۥ۠۟ۡۡ r0 = r7.f24532
            java.util.List<Yue.ۥ۟ۨۨۥ> r0 = r0.f5570
            Yue.ۥ۟ۧ۟ۢ r1 = r7.f24529
            Yue.ۥۣۢۦۧ r1 = r1.f4824
            Yue.ۥ۟ۨۨۥ r1 = r1.f24536
            r0.add(r1)
            Yue.ۥ۟ۧ۟ۢ r0 = r7.f24529
            Yue.ۥۣۢۦۧ r0 = r0.f4824
            Yue.ۥ۟ۨۨۥ r0 = r0.f24535
            java.util.List<Yue.ۥۣ۟ۨۨ> r0 = r0.f5569
            Yue.ۥ۠۟ۡۡ r1 = r7.f24532
            r0.add(r1)
            Yue.ۥ۟ۧ۟ۢ r0 = r7.f24529
            Yue.ۥۣۢۦۧ r0 = r0.f4824
            Yue.ۥ۟ۨۨۥ r0 = r0.f24536
            java.util.List<Yue.ۥۣ۟ۨۨ> r0 = r0.f5569
            Yue.ۥ۠۟ۡۡ r1 = r7.f24532
            r0.add(r1)
            goto L309
        L258:
            Yue.ۥ۟ۧ۟ۢ r0 = r7.f24529
            boolean r0 = r0.m7553()
            if (r0 == 0) goto L27c
            Yue.ۥ۟ۧ۟ۢ r0 = r7.f24529
            Yue.ۥۣۢۦۧ r0 = r0.f4824
            Yue.ۥ۠۟ۡۡ r0 = r0.f24532
            java.util.List<Yue.ۥ۟ۨۨۥ> r0 = r0.f5570
            Yue.ۥ۠۟ۡۡ r1 = r7.f24532
            r0.add(r1)
            Yue.ۥ۠۟ۡۡ r0 = r7.f24532
            java.util.List<Yue.ۥۣ۟ۨۨ> r0 = r0.f5569
            Yue.ۥ۟ۧ۟ۢ r1 = r7.f24529
            Yue.ۥۣۢۦۧ r1 = r1.f4824
            Yue.ۥ۠۟ۡۡ r1 = r1.f24532
            r0.add(r1)
            goto L309
        L27c:
            Yue.ۥ۟ۧ۟ۢ r0 = r7.f24529
            Yue.ۥۣۢۦۧ r0 = r0.f4824
            Yue.ۥ۠۟ۡۡ r0 = r0.f24532
            java.util.List<Yue.ۥ۟ۨۨۥ> r0 = r0.f5570
            Yue.ۥ۠۟ۡۡ r1 = r7.f24532
            r0.add(r1)
            goto L309
        L28b:
            Yue.ۥۣۢۦۧ r1 = r1.f4824
            Yue.ۥ۠۟ۡۡ r1 = r1.f24532
            java.util.List<Yue.ۥ۟ۨۨۥ> r0 = r0.f5570
            r0.add(r1)
            java.util.List<Yue.ۥۣ۟ۨۨ> r0 = r1.f5569
            Yue.ۥ۠۟ۡۡ r1 = r7.f24532
            r0.add(r1)
            Yue.ۥ۟ۧ۟ۢ r0 = r7.f24529
            Yue.ۥۣۢۦۧ r0 = r0.f4824
            Yue.ۥ۟ۨۨۥ r0 = r0.f24535
            java.util.List<Yue.ۥۣ۟ۨۨ> r0 = r0.f5569
            Yue.ۥ۠۟ۡۡ r1 = r7.f24532
            r0.add(r1)
            Yue.ۥ۟ۧ۟ۢ r0 = r7.f24529
            Yue.ۥۣۢۦۧ r0 = r0.f4824
            Yue.ۥ۟ۨۨۥ r0 = r0.f24536
            java.util.List<Yue.ۥۣ۟ۨۨ> r0 = r0.f5569
            Yue.ۥ۠۟ۡۡ r1 = r7.f24532
            r0.add(r1)
            Yue.ۥ۠۟ۡۡ r0 = r7.f24532
            r0.f5560 = r3
            java.util.List<Yue.ۥۣ۟ۨۨ> r0 = r0.f5569
            Yue.ۥ۟ۨۨۥ r1 = r7.f24535
            r0.add(r1)
            Yue.ۥ۠۟ۡۡ r0 = r7.f24532
            java.util.List<Yue.ۥۣ۟ۨۨ> r0 = r0.f5569
            Yue.ۥ۟ۨۨۥ r1 = r7.f24536
            r0.add(r1)
            Yue.ۥ۟ۨۨۥ r0 = r7.f24535
            java.util.List<Yue.ۥ۟ۨۨۥ> r0 = r0.f5570
            Yue.ۥ۠۟ۡۡ r1 = r7.f24532
            r0.add(r1)
            Yue.ۥ۟ۨۨۥ r0 = r7.f24536
            java.util.List<Yue.ۥ۟ۨۨۥ> r0 = r0.f5570
            Yue.ۥ۠۟ۡۡ r1 = r7.f24532
            r0.add(r1)
            goto L309
        L2dc:
            Yue.ۥ۟ۧ۟ۢ r0 = r1.m7529()
            if (r0 != 0) goto L2e3
            goto L309
        L2e3:
            Yue.ۥۣۢۦۧ r0 = r0.f4824
            Yue.ۥ۠۟ۡۡ r0 = r0.f24532
            Yue.ۥ۠۟ۡۡ r1 = r7.f24532
            java.util.List<Yue.ۥ۟ۨۨۥ> r1 = r1.f5570
            r1.add(r0)
            java.util.List<Yue.ۥۣ۟ۨۨ> r0 = r0.f5569
            Yue.ۥ۠۟ۡۡ r1 = r7.f24532
            r0.add(r1)
            Yue.ۥ۠۟ۡۡ r0 = r7.f24532
            r0.f5560 = r3
            java.util.List<Yue.ۥۣ۟ۨۨ> r0 = r0.f5569
            Yue.ۥ۟ۨۨۥ r1 = r7.f24535
            r0.add(r1)
            Yue.ۥ۠۟ۡۡ r0 = r7.f24532
            java.util.List<Yue.ۥۣ۟ۨۨ> r0 = r0.f5569
            Yue.ۥ۟ۨۨۥ r1 = r7.f24536
            r0.add(r1)
        L309:
            Yue.ۥ۟ۧ۟ۢ r0 = r7.f24529
            Yue.ۥ۟ۧ۟۠[] r1 = r0.f4862
            r4 = r1[r2]
            Yue.ۥ۟ۧ۟۠ r5 = r4.f4737
            if (r5 == 0) goto L35d
            r6 = r1[r3]
            Yue.ۥ۟ۧ۟۠ r6 = r6.f4737
            if (r6 == 0) goto L35d
            boolean r0 = r0.m7553()
            if (r0 == 0) goto L33e
            Yue.ۥ۟ۨۨۥ r0 = r7.f24535
            Yue.ۥ۟ۧ۟ۢ r1 = r7.f24529
            Yue.ۥ۟ۧ۟۠[] r1 = r1.f4862
            r1 = r1[r2]
            int r1 = r1.m7412()
            r0.f5564 = r1
            Yue.ۥ۟ۨۨۥ r0 = r7.f24536
            Yue.ۥ۟ۧ۟ۢ r1 = r7.f24529
            Yue.ۥ۟ۧ۟۠[] r1 = r1.f4862
            r1 = r1[r3]
            int r1 = r1.m7412()
            int r1 = -r1
            r0.f5564 = r1
            goto L3cd
        L33e:
            Yue.ۥ۟ۧ۟ۢ r0 = r7.f24529
            Yue.ۥ۟ۧ۟۠[] r0 = r0.f4862
            r0 = r0[r2]
            Yue.ۥ۟ۨۨۥ r0 = r7.m27165(r0)
            Yue.ۥ۟ۧ۟ۢ r1 = r7.f24529
            Yue.ۥ۟ۧ۟۠[] r1 = r1.f4862
            r1 = r1[r3]
            Yue.ۥ۟ۨۨۥ r1 = r7.m27165(r1)
            r0.m8536(r7)
            r1.m8536(r7)
            Yue.ۥۢۥۣ۠$ۥ۟ r0 = Yue.AbstractC7012.EnumC7014.f24542
            r7.f24537 = r0
            goto L3cd
        L35d:
            if (r5 == 0) goto L37e
            Yue.ۥ۟ۨۨۥ r0 = r7.m27165(r4)
            if (r0 == 0) goto L3cd
            Yue.ۥ۟ۨۨۥ r1 = r7.f24535
            Yue.ۥ۟ۧ۟ۢ r4 = r7.f24529
            Yue.ۥ۟ۧ۟۠[] r4 = r4.f4862
            r2 = r4[r2]
            int r2 = r2.m7412()
            r7.m27162(r1, r0, r2)
            Yue.ۥ۟ۨۨۥ r0 = r7.f24536
            Yue.ۥ۟ۨۨۥ r1 = r7.f24535
            Yue.ۥ۠۟ۡۡ r2 = r7.f24532
            r7.m27163(r0, r1, r3, r2)
            goto L3cd
        L37e:
            r1 = r1[r3]
            Yue.ۥ۟ۧ۟۠ r2 = r1.f4737
            if (r2 == 0) goto L3a5
            Yue.ۥ۟ۨۨۥ r0 = r7.m27165(r1)
            if (r0 == 0) goto L3cd
            Yue.ۥ۟ۨۨۥ r1 = r7.f24536
            Yue.ۥ۟ۧ۟ۢ r2 = r7.f24529
            Yue.ۥ۟ۧ۟۠[] r2 = r2.f4862
            r2 = r2[r3]
            int r2 = r2.m7412()
            int r2 = -r2
            r7.m27162(r1, r0, r2)
            Yue.ۥ۟ۨۨۥ r0 = r7.f24535
            Yue.ۥ۟ۨۨۥ r1 = r7.f24536
            r2 = -1
            Yue.ۥ۠۟ۡۡ r3 = r7.f24532
            r7.m27163(r0, r1, r2, r3)
            goto L3cd
        L3a5:
            boolean r1 = r0 instanceof Yue.InterfaceC3022
            if (r1 != 0) goto L3cd
            Yue.ۥ۟ۧ۟ۢ r0 = r0.m7529()
            if (r0 == 0) goto L3cd
            Yue.ۥ۟ۧ۟ۢ r0 = r7.f24529
            Yue.ۥ۟ۧ۟ۢ r0 = r0.m7529()
            Yue.ۥ۠ۤۦۧ r0 = r0.f4823
            Yue.ۥ۟ۨۨۥ r0 = r0.f24535
            Yue.ۥ۟ۨۨۥ r1 = r7.f24535
            Yue.ۥ۟ۧ۟ۢ r2 = r7.f24529
            int r2 = r2.m7545()
            r7.m27162(r1, r0, r2)
            Yue.ۥ۟ۨۨۥ r0 = r7.f24536
            Yue.ۥ۟ۨۨۥ r1 = r7.f24535
            Yue.ۥ۠۟ۡۡ r2 = r7.f24532
            r7.m27163(r0, r1, r3, r2)
        L3cd:
            return
    }

    @Override // Yue.AbstractC7012
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo5455() {
            r2 = this;
            Yue.ۥ۟ۨۨۥ r0 = r2.f24535
            boolean r1 = r0.f5568
            if (r1 == 0) goto Ld
            Yue.ۥ۟ۧ۟ۢ r1 = r2.f24529
            int r0 = r0.f5565
            r1.m7620(r0)
        Ld:
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
            Yue.ۥ۟ۨۨۥ r0 = r1.f24536
            r0.m8537()
            Yue.ۥ۠۟ۡۡ r0 = r1.f24532
            r0.m8537()
            r0 = 0
            r1.f24534 = r0
            return
    }

    @Override // Yue.AbstractC7012
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo5458() {
            r2 = this;
            r0 = 0
            r2.f24534 = r0
            Yue.ۥ۟ۨۨۥ r1 = r2.f24535
            r1.m8537()
            Yue.ۥ۟ۨۨۥ r1 = r2.f24535
            r1.f5568 = r0
            Yue.ۥ۟ۨۨۥ r1 = r2.f24536
            r1.m8537()
            Yue.ۥ۟ۨۨۥ r1 = r2.f24536
            r1.f5568 = r0
            Yue.ۥ۠۟ۡۡ r1 = r2.f24532
            r1.f5568 = r0
            return
    }

    @Override // Yue.AbstractC7012
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public boolean mo5459() {
            r3 = this;
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r0 = r3.f24531
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = Yue.C1517.EnumC1519.f4913
            r2 = 1
            if (r0 != r1) goto L10
            Yue.ۥ۟ۧ۟ۢ r0 = r3.f24529
            int r0 = r0.f4834
            if (r0 != 0) goto Le
            return r2
        Le:
            r0 = 0
            return r0
        L10:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m12960(int[] r3, int r4, int r5, int r6, int r7, float r8, int r9) {
            r2 = this;
            int r5 = r5 - r4
            int r7 = r7 - r6
            r4 = -1
            r6 = 0
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 1
            if (r9 == r4) goto L20
            if (r9 == 0) goto L17
            if (r9 == r1) goto Le
            goto L35
        Le:
            float r4 = (float) r5
            float r4 = r4 * r8
            float r4 = r4 + r0
            int r4 = (int) r4
            r3[r6] = r5
            r3[r1] = r4
            goto L35
        L17:
            float r4 = (float) r7
            float r4 = r4 * r8
            float r4 = r4 + r0
            int r4 = (int) r4
            r3[r6] = r4
            r3[r1] = r7
            goto L35
        L20:
            float r4 = (float) r7
            float r4 = r4 * r8
            float r4 = r4 + r0
            int r4 = (int) r4
            float r9 = (float) r5
            float r9 = r9 / r8
            float r9 = r9 + r0
            int r8 = (int) r9
            if (r4 > r5) goto L2f
            r3[r6] = r4
            r3[r1] = r7
            goto L35
        L2f:
            if (r8 > r7) goto L35
            r3[r6] = r5
            r3[r1] = r8
        L35:
            return
    }
}
