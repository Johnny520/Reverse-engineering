package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7726 implements androidx.recyclerview.widget.C7789.InterfaceC7790 {

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f29741 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f29742 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final boolean f29743 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final java.lang.String f29744 = "AHT";

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.C4820.InterfaceC4821<androidx.recyclerview.widget.C7726.C7728> f29745;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.util.ArrayList<androidx.recyclerview.widget.C7726.C7728> f29746;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.util.ArrayList<androidx.recyclerview.widget.C7726.C7728> f29747;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final androidx.recyclerview.widget.C7726.InterfaceC7727 f29748;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.lang.Runnable f29749;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final boolean f29750;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final androidx.recyclerview.widget.C7789 f29751;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int f29752;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ$ۥ, reason: contains not printable characters */
    public interface InterfaceC7727 {
        /* JADX INFO: renamed from: ۥ */
        void mo29708(int r1, int r2);

        /* JADX INFO: renamed from: ۥ۟ */
        void mo29709(androidx.recyclerview.widget.C7726.C7728 r1);

        /* JADX INFO: renamed from: ۥ۟۟ */
        void mo29710(int r1, int r2, java.lang.Object r3);

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        void mo29711(androidx.recyclerview.widget.C7726.C7728 r1);

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        androidx.recyclerview.widget.RecyclerView.AbstractC7716 mo29712(int r1);

        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        void mo29713(int r1, int r2);

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        void mo29714(int r1, int r2);

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        void mo29715(int r1, int r2);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ$ۥ۟, reason: contains not printable characters */
    public static class C7728 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final int f29753 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f29754 = 2;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f29755 = 4;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final int f29756 = 8;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final int f29757 = 30;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int f29758;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f29759;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public java.lang.Object f29760;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f29761;

        public C7728(int r1, int r2, int r3, java.lang.Object r4) {
                r0 = this;
                r0.<init>()
                r0.f29758 = r1
                r0.f29759 = r2
                r0.f29761 = r3
                r0.f29760 = r4
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L58
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L12
                goto L58
            L12:
                androidx.recyclerview.widget.ۥ$ۥ۟ r5 = (androidx.recyclerview.widget.C7726.C7728) r5
                int r2 = r4.f29758
                int r3 = r5.f29758
                if (r2 == r3) goto L1b
                return r1
            L1b:
                r3 = 8
                if (r2 != r3) goto L37
                int r2 = r4.f29761
                int r3 = r4.f29759
                int r2 = r2 - r3
                int r2 = java.lang.Math.abs(r2)
                if (r2 != r0) goto L37
                int r2 = r4.f29761
                int r3 = r5.f29759
                if (r2 != r3) goto L37
                int r2 = r4.f29759
                int r3 = r5.f29761
                if (r2 != r3) goto L37
                return r0
            L37:
                int r2 = r4.f29761
                int r3 = r5.f29761
                if (r2 == r3) goto L3e
                return r1
            L3e:
                int r2 = r4.f29759
                int r3 = r5.f29759
                if (r2 == r3) goto L45
                return r1
            L45:
                java.lang.Object r2 = r4.f29760
                if (r2 == 0) goto L52
                java.lang.Object r5 = r5.f29760
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L57
                return r1
            L52:
                java.lang.Object r5 = r5.f29760
                if (r5 == 0) goto L57
                return r1
            L57:
                return r0
            L58:
                return r1
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.f29758
                int r0 = r0 * 31
                int r1 = r2.f29759
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.f29761
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r1 = "["
                r0.append(r1)
                java.lang.String r1 = r2.m30022()
                r0.append(r1)
                java.lang.String r1 = ",s:"
                r0.append(r1)
                int r1 = r2.f29759
                r0.append(r1)
                java.lang.String r1 = "c:"
                r0.append(r1)
                int r1 = r2.f29761
                r0.append(r1)
                java.lang.String r1 = ",p:"
                r0.append(r1)
                java.lang.Object r1 = r2.f29760
                r0.append(r1)
                java.lang.String r1 = "]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public java.lang.String m30022() {
                r2 = this;
                int r0 = r2.f29758
                r1 = 1
                if (r0 == r1) goto L1b
                r1 = 2
                if (r0 == r1) goto L18
                r1 = 4
                if (r0 == r1) goto L15
                r1 = 8
                if (r0 == r1) goto L12
                java.lang.String r0 = "??"
                return r0
            L12:
                java.lang.String r0 = "mv"
                return r0
            L15:
                java.lang.String r0 = "up"
                return r0
            L18:
                java.lang.String r0 = "rm"
                return r0
            L1b:
                java.lang.String r0 = "add"
                return r0
        }
    }

    public C7726(androidx.recyclerview.widget.C7726.InterfaceC7727 r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public C7726(androidx.recyclerview.widget.C7726.InterfaceC7727 r3, boolean r4) {
            r2 = this;
            r2.<init>()
            Yue.ۥۡۤۤ۠$ۥ۟ r0 = new Yue.ۥۡۤۤ۠$ۥ۟
            r1 = 30
            r0.<init>(r1)
            r2.f29745 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f29746 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f29747 = r0
            r0 = 0
            r2.f29752 = r0
            r2.f29748 = r3
            r2.f29750 = r4
            androidx.recyclerview.widget.ۥ۟۟۠۟ r3 = new androidx.recyclerview.widget.ۥ۟۟۠۟
            r3.<init>(r2)
            r2.f29751 = r3
            return
    }

    @Override // androidx.recyclerview.widget.C7789.InterfaceC7790
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void mo29995(androidx.recyclerview.widget.C7726.C7728 r2) {
            r1 = this;
            boolean r0 = r1.f29750
            if (r0 != 0) goto Lc
            r0 = 0
            r2.f29760 = r0
            Yue.ۥۡۤۤ۠$ۥ<androidx.recyclerview.widget.ۥ$ۥ۟> r0 = r1.f29745
            r0.release(r2)
        Lc:
            return
    }

    @Override // androidx.recyclerview.widget.C7789.InterfaceC7790
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public androidx.recyclerview.widget.C7726.C7728 mo29996(int r2, int r3, int r4, java.lang.Object r5) {
            r1 = this;
            Yue.ۥۡۤۤ۠$ۥ<androidx.recyclerview.widget.ۥ$ۥ۟> r0 = r1.f29745
            java.lang.Object r0 = r0.acquire()
            androidx.recyclerview.widget.ۥ$ۥ۟ r0 = (androidx.recyclerview.widget.C7726.C7728) r0
            if (r0 != 0) goto L10
            androidx.recyclerview.widget.ۥ$ۥ۟ r0 = new androidx.recyclerview.widget.ۥ$ۥ۟
            r0.<init>(r2, r3, r4, r5)
            goto L18
        L10:
            r0.f29758 = r2
            r0.f29759 = r3
            r0.f29761 = r4
            r0.f29760 = r5
        L18:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public androidx.recyclerview.widget.C7726 m29997(androidx.recyclerview.widget.C7726.C7728... r2) {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r0 = r1.f29746
            java.util.Collections.addAll(r0, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m29998(androidx.recyclerview.widget.C7726.C7728 r1) {
            r0 = this;
            r0.m30017(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m29999(androidx.recyclerview.widget.C7726.C7728 r1) {
            r0 = this;
            r0.m30017(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m30000(int r6) {
            r5 = this;
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r0 = r5.f29746
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L47
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r2 = r5.f29746
            java.lang.Object r2 = r2.get(r1)
            androidx.recyclerview.widget.ۥ$ۥ۟ r2 = (androidx.recyclerview.widget.C7726.C7728) r2
            int r3 = r2.f29758
            r4 = 1
            if (r3 == r4) goto L3d
            r4 = 2
            if (r3 == r4) goto L30
            r4 = 8
            if (r3 == r4) goto L1e
            goto L44
        L1e:
            int r3 = r2.f29759
            if (r3 != r6) goto L25
            int r6 = r2.f29761
            goto L44
        L25:
            if (r3 >= r6) goto L29
            int r6 = r6 + (-1)
        L29:
            int r2 = r2.f29761
            if (r2 > r6) goto L44
            int r6 = r6 + 1
            goto L44
        L30:
            int r3 = r2.f29759
            if (r3 > r6) goto L44
            int r2 = r2.f29761
            int r3 = r3 + r2
            if (r3 <= r6) goto L3b
            r6 = -1
            return r6
        L3b:
            int r6 = r6 - r2
            goto L44
        L3d:
            int r3 = r2.f29759
            if (r3 > r6) goto L44
            int r2 = r2.f29761
            int r6 = r6 + r2
        L44:
            int r1 = r1 + 1
            goto L7
        L47:
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m30001(androidx.recyclerview.widget.C7726.C7728 r11) {
            r10 = this;
            int r0 = r11.f29759
            int r1 = r11.f29761
            int r1 = r1 + r0
            r2 = 0
            r3 = -1
            r4 = r0
            r5 = r2
        L9:
            r6 = 0
            r7 = 2
            if (r4 >= r1) goto L43
            androidx.recyclerview.widget.ۥ$ۥ r8 = r10.f29748
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r8 = r8.mo29712(r4)
            r9 = 1
            if (r8 != 0) goto L2b
            boolean r8 = r10.m30003(r4)
            if (r8 == 0) goto L1d
            goto L2b
        L1d:
            if (r3 != r9) goto L28
            androidx.recyclerview.widget.ۥ$ۥ۟ r3 = r10.mo29996(r7, r0, r5, r6)
            r10.m30017(r3)
            r3 = r9
            goto L29
        L28:
            r3 = r2
        L29:
            r6 = r2
            goto L38
        L2b:
            if (r3 != 0) goto L36
            androidx.recyclerview.widget.ۥ$ۥ۟ r3 = r10.mo29996(r7, r0, r5, r6)
            r10.m30006(r3)
            r3 = r9
            goto L37
        L36:
            r3 = r2
        L37:
            r6 = r9
        L38:
            if (r3 == 0) goto L3e
            int r4 = r4 - r5
            int r1 = r1 - r5
            r5 = r9
            goto L40
        L3e:
            int r5 = r5 + 1
        L40:
            int r4 = r4 + r9
            r3 = r6
            goto L9
        L43:
            int r1 = r11.f29761
            if (r5 == r1) goto L4e
            r10.mo29995(r11)
            androidx.recyclerview.widget.ۥ$ۥ۟ r11 = r10.mo29996(r7, r0, r5, r6)
        L4e:
            if (r3 != 0) goto L54
            r10.m30006(r11)
            goto L57
        L54:
            r10.m30017(r11)
        L57:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m30002(androidx.recyclerview.widget.C7726.C7728 r10) {
            r9 = this;
            int r0 = r10.f29759
            int r1 = r10.f29761
            int r1 = r1 + r0
            r2 = 0
            r3 = -1
            r5 = r2
            r4 = r3
            r3 = r0
        La:
            r6 = 4
            if (r0 >= r1) goto L3e
            androidx.recyclerview.widget.ۥ$ۥ r7 = r9.f29748
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r7 = r7.mo29712(r0)
            r8 = 1
            if (r7 != 0) goto L2c
            boolean r7 = r9.m30003(r0)
            if (r7 == 0) goto L1d
            goto L2c
        L1d:
            if (r4 != r8) goto L2a
            java.lang.Object r4 = r10.f29760
            androidx.recyclerview.widget.ۥ$ۥ۟ r3 = r9.mo29996(r6, r3, r5, r4)
            r9.m30017(r3)
            r3 = r0
            r5 = r2
        L2a:
            r4 = r2
            goto L3a
        L2c:
            if (r4 != 0) goto L39
            java.lang.Object r4 = r10.f29760
            androidx.recyclerview.widget.ۥ$ۥ۟ r3 = r9.mo29996(r6, r3, r5, r4)
            r9.m30006(r3)
            r3 = r0
            r5 = r2
        L39:
            r4 = r8
        L3a:
            int r5 = r5 + r8
            int r0 = r0 + 1
            goto La
        L3e:
            int r0 = r10.f29761
            if (r5 == r0) goto L4b
            java.lang.Object r0 = r10.f29760
            r9.mo29995(r10)
            androidx.recyclerview.widget.ۥ$ۥ۟ r10 = r9.mo29996(r6, r3, r5, r0)
        L4b:
            if (r4 != 0) goto L51
            r9.m30006(r10)
            goto L54
        L51:
            r9.m30017(r10)
        L54:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final boolean m30003(int r8) {
            r7 = this;
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r0 = r7.f29747
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L3c
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r3 = r7.f29747
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.ۥ$ۥ۟ r3 = (androidx.recyclerview.widget.C7726.C7728) r3
            int r4 = r3.f29758
            r5 = 8
            r6 = 1
            if (r4 != r5) goto L24
            int r3 = r3.f29761
            int r4 = r2 + 1
            int r3 = r7.m30009(r3, r4)
            if (r3 != r8) goto L39
            return r6
        L24:
            if (r4 != r6) goto L39
            int r4 = r3.f29759
            int r3 = r3.f29761
            int r3 = r3 + r4
        L2b:
            if (r4 >= r3) goto L39
            int r5 = r2 + 1
            int r5 = r7.m30009(r4, r5)
            if (r5 != r8) goto L36
            return r6
        L36:
            int r4 = r4 + 1
            goto L2b
        L39:
            int r2 = r2 + 1
            goto L8
        L3c:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m30004() {
            r5 = this;
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r0 = r5.f29747
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L1a
            androidx.recyclerview.widget.ۥ$ۥ r3 = r5.f29748
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r4 = r5.f29747
            java.lang.Object r4 = r4.get(r2)
            androidx.recyclerview.widget.ۥ$ۥ۟ r4 = (androidx.recyclerview.widget.C7726.C7728) r4
            r3.mo29711(r4)
            int r2 = r2 + 1
            goto L8
        L1a:
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r0 = r5.f29747
            r5.m30019(r0)
            r5.f29752 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m30005() {
            r7 = this;
            r7.m30004()
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r0 = r7.f29746
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        Lb:
            if (r2 >= r0) goto L6c
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r3 = r7.f29746
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.ۥ$ۥ۟ r3 = (androidx.recyclerview.widget.C7726.C7728) r3
            int r4 = r3.f29758
            r5 = 1
            if (r4 == r5) goto L54
            r5 = 2
            if (r4 == r5) goto L45
            r5 = 4
            if (r4 == r5) goto L34
            r5 = 8
            if (r4 == r5) goto L25
            goto L62
        L25:
            androidx.recyclerview.widget.ۥ$ۥ r4 = r7.f29748
            r4.mo29711(r3)
            androidx.recyclerview.widget.ۥ$ۥ r4 = r7.f29748
            int r5 = r3.f29759
            int r3 = r3.f29761
            r4.mo29708(r5, r3)
            goto L62
        L34:
            androidx.recyclerview.widget.ۥ$ۥ r4 = r7.f29748
            r4.mo29711(r3)
            androidx.recyclerview.widget.ۥ$ۥ r4 = r7.f29748
            int r5 = r3.f29759
            int r6 = r3.f29761
            java.lang.Object r3 = r3.f29760
            r4.mo29710(r5, r6, r3)
            goto L62
        L45:
            androidx.recyclerview.widget.ۥ$ۥ r4 = r7.f29748
            r4.mo29711(r3)
            androidx.recyclerview.widget.ۥ$ۥ r4 = r7.f29748
            int r5 = r3.f29759
            int r3 = r3.f29761
            r4.mo29715(r5, r3)
            goto L62
        L54:
            androidx.recyclerview.widget.ۥ$ۥ r4 = r7.f29748
            r4.mo29711(r3)
            androidx.recyclerview.widget.ۥ$ۥ r4 = r7.f29748
            int r5 = r3.f29759
            int r3 = r3.f29761
            r4.mo29714(r5, r3)
        L62:
            java.lang.Runnable r3 = r7.f29749
            if (r3 == 0) goto L69
            r3.run()
        L69:
            int r2 = r2 + 1
            goto Lb
        L6c:
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r0 = r7.f29746
            r7.m30019(r0)
            r7.f29752 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m30006(androidx.recyclerview.widget.C7726.C7728 r12) {
            r11 = this;
            int r0 = r12.f29758
            r1 = 1
            if (r0 == r1) goto L7f
            r2 = 8
            if (r0 == r2) goto L7f
            int r2 = r12.f29759
            int r0 = r11.m30021(r2, r0)
            int r2 = r12.f29759
            int r3 = r12.f29758
            r4 = 2
            r5 = 4
            if (r3 == r4) goto L32
            if (r3 != r5) goto L1b
            r3 = r1
            goto L33
        L1b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "op should be remove or update."
            r1.append(r2)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r0.<init>(r12)
            throw r0
        L32:
            r3 = 0
        L33:
            r6 = r1
            r7 = r6
        L35:
            int r8 = r12.f29761
            if (r6 >= r8) goto L6b
            int r8 = r12.f29759
            int r9 = r3 * r6
            int r8 = r8 + r9
            int r9 = r12.f29758
            int r8 = r11.m30021(r8, r9)
            int r9 = r12.f29758
            if (r9 == r4) goto L50
            if (r9 == r5) goto L4b
            goto L55
        L4b:
            int r10 = r0 + 1
            if (r8 != r10) goto L55
            goto L52
        L50:
            if (r8 != r0) goto L55
        L52:
            int r7 = r7 + 1
            goto L68
        L55:
            java.lang.Object r10 = r12.f29760
            androidx.recyclerview.widget.ۥ$ۥ۟ r0 = r11.mo29996(r9, r0, r7, r10)
            r11.m30007(r0, r2)
            r11.mo29995(r0)
            int r0 = r12.f29758
            if (r0 != r5) goto L66
            int r2 = r2 + r7
        L66:
            r7 = r1
            r0 = r8
        L68:
            int r6 = r6 + 1
            goto L35
        L6b:
            java.lang.Object r1 = r12.f29760
            r11.mo29995(r12)
            if (r7 <= 0) goto L7e
            int r12 = r12.f29758
            androidx.recyclerview.widget.ۥ$ۥ۟ r12 = r11.mo29996(r12, r0, r7, r1)
            r11.m30007(r12, r2)
            r11.mo29995(r12)
        L7e:
            return
        L7f:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "should not dispatch add or move for pre layout"
            r12.<init>(r0)
            throw r12
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m30007(androidx.recyclerview.widget.C7726.C7728 r3, int r4) {
            r2 = this;
            androidx.recyclerview.widget.ۥ$ۥ r0 = r2.f29748
            r0.mo29709(r3)
            int r0 = r3.f29758
            r1 = 2
            if (r0 == r1) goto L1f
            r1 = 4
            if (r0 != r1) goto L17
            androidx.recyclerview.widget.ۥ$ۥ r0 = r2.f29748
            int r1 = r3.f29761
            java.lang.Object r3 = r3.f29760
            r0.mo29710(r4, r1, r3)
            goto L26
        L17:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "only remove and update ops can be dispatched in first pass"
            r3.<init>(r4)
            throw r3
        L1f:
            androidx.recyclerview.widget.ۥ$ۥ r0 = r2.f29748
            int r3 = r3.f29761
            r0.mo29715(r4, r3)
        L26:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public int m30008(int r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.m30009(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public int m30009(int r6, int r7) {
            r5 = this;
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r0 = r5.f29747
            int r0 = r0.size()
        L6:
            if (r7 >= r0) goto L41
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r1 = r5.f29747
            java.lang.Object r1 = r1.get(r7)
            androidx.recyclerview.widget.ۥ$ۥ۟ r1 = (androidx.recyclerview.widget.C7726.C7728) r1
            int r2 = r1.f29758
            r3 = 8
            if (r2 != r3) goto L28
            int r2 = r1.f29759
            if (r2 != r6) goto L1d
            int r6 = r1.f29761
            goto L3e
        L1d:
            if (r2 >= r6) goto L21
            int r6 = r6 + (-1)
        L21:
            int r1 = r1.f29761
            if (r1 > r6) goto L3e
            int r6 = r6 + 1
            goto L3e
        L28:
            int r3 = r1.f29759
            if (r3 > r6) goto L3e
            r4 = 2
            if (r2 != r4) goto L38
            int r1 = r1.f29761
            int r3 = r3 + r1
            if (r6 >= r3) goto L36
            r6 = -1
            return r6
        L36:
            int r6 = r6 - r1
            goto L3e
        L38:
            r3 = 1
            if (r2 != r3) goto L3e
            int r1 = r1.f29761
            int r6 = r6 + r1
        L3e:
            int r7 = r7 + 1
            goto L6
        L41:
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public boolean m30010(int r2) {
            r1 = this;
            int r0 = r1.f29752
            r2 = r2 & r0
            if (r2 == 0) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public boolean m30011() {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r0 = r1.f29746
            int r0 = r0.size()
            if (r0 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public boolean m30012() {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r0 = r1.f29747
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L12
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r0 = r1.f29746
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public boolean m30013(int r5, int r6, java.lang.Object r7) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r6 >= r1) goto L5
            return r0
        L5:
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r2 = r4.f29746
            r3 = 4
            androidx.recyclerview.widget.ۥ$ۥ۟ r5 = r4.mo29996(r3, r5, r6, r7)
            r2.add(r5)
            int r5 = r4.f29752
            r5 = r5 | r3
            r4.f29752 = r5
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r5 = r4.f29746
            int r5 = r5.size()
            if (r5 != r1) goto L1d
            r0 = r1
        L1d:
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean m30014(int r5, int r6) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r6 >= r1) goto L5
            return r0
        L5:
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r2 = r4.f29746
            r3 = 0
            androidx.recyclerview.widget.ۥ$ۥ۟ r5 = r4.mo29996(r1, r5, r6, r3)
            r2.add(r5)
            int r5 = r4.f29752
            r5 = r5 | r1
            r4.f29752 = r5
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r5 = r4.f29746
            int r5 = r5.size()
            if (r5 != r1) goto L1d
            r0 = r1
        L1d:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean m30015(int r5, int r6, int r7) {
            r4 = this;
            r0 = 0
            if (r5 != r6) goto L4
            return r0
        L4:
            r1 = 1
            if (r7 != r1) goto L22
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r7 = r4.f29746
            r2 = 0
            r3 = 8
            androidx.recyclerview.widget.ۥ$ۥ۟ r5 = r4.mo29996(r3, r5, r6, r2)
            r7.add(r5)
            int r5 = r4.f29752
            r5 = r5 | r3
            r4.f29752 = r5
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r5 = r4.f29746
            int r5 = r5.size()
            if (r5 != r1) goto L21
            r0 = r1
        L21:
            return r0
        L22:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Moving more than 1 item is not supported yet"
            r5.<init>(r6)
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean m30016(int r6, int r7) {
            r5 = this;
            r0 = 0
            r1 = 1
            if (r7 >= r1) goto L5
            return r0
        L5:
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r2 = r5.f29746
            r3 = 0
            r4 = 2
            androidx.recyclerview.widget.ۥ$ۥ۟ r6 = r5.mo29996(r4, r6, r7, r3)
            r2.add(r6)
            int r6 = r5.f29752
            r6 = r6 | r4
            r5.f29752 = r6
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r6 = r5.f29746
            int r6 = r6.size()
            if (r6 != r1) goto L1e
            r0 = r1
        L1e:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final void m30017(androidx.recyclerview.widget.C7726.C7728 r4) {
            r3 = this;
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r0 = r3.f29747
            r0.add(r4)
            int r0 = r4.f29758
            r1 = 1
            if (r0 == r1) goto L4b
            r1 = 2
            if (r0 == r1) goto L41
            r1 = 4
            if (r0 == r1) goto L35
            r1 = 8
            if (r0 != r1) goto L1e
            androidx.recyclerview.widget.ۥ$ۥ r0 = r3.f29748
            int r1 = r4.f29759
            int r4 = r4.f29761
            r0.mo29708(r1, r4)
            goto L54
        L1e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown update op type for "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L35:
            androidx.recyclerview.widget.ۥ$ۥ r0 = r3.f29748
            int r1 = r4.f29759
            int r2 = r4.f29761
            java.lang.Object r4 = r4.f29760
            r0.mo29710(r1, r2, r4)
            goto L54
        L41:
            androidx.recyclerview.widget.ۥ$ۥ r0 = r3.f29748
            int r1 = r4.f29759
            int r4 = r4.f29761
            r0.mo29713(r1, r4)
            goto L54
        L4b:
            androidx.recyclerview.widget.ۥ$ۥ r0 = r3.f29748
            int r1 = r4.f29759
            int r4 = r4.f29761
            r0.mo29714(r1, r4)
        L54:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m30018() {
            r5 = this;
            androidx.recyclerview.widget.ۥ۟۟۠۟ r0 = r5.f29751
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r1 = r5.f29746
            r0.m30234(r1)
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r0 = r5.f29746
            int r0 = r0.size()
            r1 = 0
        Le:
            if (r1 >= r0) goto L41
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r2 = r5.f29746
            java.lang.Object r2 = r2.get(r1)
            androidx.recyclerview.widget.ۥ$ۥ۟ r2 = (androidx.recyclerview.widget.C7726.C7728) r2
            int r3 = r2.f29758
            r4 = 1
            if (r3 == r4) goto L34
            r4 = 2
            if (r3 == r4) goto L30
            r4 = 4
            if (r3 == r4) goto L2c
            r4 = 8
            if (r3 == r4) goto L28
            goto L37
        L28:
            r5.m29999(r2)
            goto L37
        L2c:
            r5.m30002(r2)
            goto L37
        L30:
            r5.m30001(r2)
            goto L37
        L34:
            r5.m29998(r2)
        L37:
            java.lang.Runnable r2 = r5.f29749
            if (r2 == 0) goto L3e
            r2.run()
        L3e:
            int r1 = r1 + 1
            goto Le
        L41:
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r0 = r5.f29746
            r0.clear()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public void m30019(java.util.List<androidx.recyclerview.widget.C7726.C7728> r4) {
            r3 = this;
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L13
            java.lang.Object r2 = r4.get(r1)
            androidx.recyclerview.widget.ۥ$ۥ۟ r2 = (androidx.recyclerview.widget.C7726.C7728) r2
            r3.mo29995(r2)
            int r1 = r1 + 1
            goto L5
        L13:
            r4.clear()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public void m30020() {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r0 = r1.f29746
            r1.m30019(r0)
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r0 = r1.f29747
            r1.m30019(r0)
            r0 = 0
            r1.f29752 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final int m30021(int r9, int r10) {
            r8 = this;
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r0 = r8.f29747
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            r2 = 8
            if (r0 < 0) goto L82
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r3 = r8.f29747
            java.lang.Object r3 = r3.get(r0)
            androidx.recyclerview.widget.ۥ$ۥ۟ r3 = (androidx.recyclerview.widget.C7726.C7728) r3
            int r4 = r3.f29758
            r5 = 2
            if (r4 != r2) goto L62
            int r2 = r3.f29759
            int r4 = r3.f29761
            if (r2 >= r4) goto L22
            r6 = r2
            r7 = r4
            goto L24
        L22:
            r7 = r2
            r6 = r4
        L24:
            if (r9 < r6) goto L4a
            if (r9 > r7) goto L4a
            if (r6 != r2) goto L3a
            if (r10 != r1) goto L31
            int r4 = r4 + 1
            r3.f29761 = r4
            goto L37
        L31:
            if (r10 != r5) goto L37
            int r4 = r4 + (-1)
            r3.f29761 = r4
        L37:
            int r9 = r9 + 1
            goto L7f
        L3a:
            if (r10 != r1) goto L41
            int r2 = r2 + 1
            r3.f29759 = r2
            goto L47
        L41:
            if (r10 != r5) goto L47
            int r2 = r2 + (-1)
            r3.f29759 = r2
        L47:
            int r9 = r9 + (-1)
            goto L7f
        L4a:
            if (r9 >= r2) goto L7f
            if (r10 != r1) goto L57
            int r2 = r2 + 1
            r3.f29759 = r2
            int r4 = r4 + 1
            r3.f29761 = r4
            goto L7f
        L57:
            if (r10 != r5) goto L7f
            int r2 = r2 + (-1)
            r3.f29759 = r2
            int r4 = r4 + (-1)
            r3.f29761 = r4
            goto L7f
        L62:
            int r2 = r3.f29759
            if (r2 > r9) goto L72
            if (r4 != r1) goto L6c
            int r2 = r3.f29761
            int r9 = r9 - r2
            goto L7f
        L6c:
            if (r4 != r5) goto L7f
            int r2 = r3.f29761
            int r9 = r9 + r2
            goto L7f
        L72:
            if (r10 != r1) goto L79
            int r2 = r2 + 1
            r3.f29759 = r2
            goto L7f
        L79:
            if (r10 != r5) goto L7f
            int r2 = r2 + (-1)
            r3.f29759 = r2
        L7f:
            int r0 = r0 + (-1)
            goto L8
        L82:
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r10 = r8.f29747
            int r10 = r10.size()
            int r10 = r10 - r1
        L89:
            if (r10 < 0) goto Lb7
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r0 = r8.f29747
            java.lang.Object r0 = r0.get(r10)
            androidx.recyclerview.widget.ۥ$ۥ۟ r0 = (androidx.recyclerview.widget.C7726.C7728) r0
            int r1 = r0.f29758
            if (r1 != r2) goto La8
            int r1 = r0.f29761
            int r3 = r0.f29759
            if (r1 == r3) goto L9f
            if (r1 >= 0) goto Lb4
        L9f:
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r1 = r8.f29747
            r1.remove(r10)
            r8.mo29995(r0)
            goto Lb4
        La8:
            int r1 = r0.f29761
            if (r1 > 0) goto Lb4
            java.util.ArrayList<androidx.recyclerview.widget.ۥ$ۥ۟> r1 = r8.f29747
            r1.remove(r10)
            r8.mo29995(r0)
        Lb4:
            int r10 = r10 + (-1)
            goto L89
        Lb7:
            return r9
    }
}
