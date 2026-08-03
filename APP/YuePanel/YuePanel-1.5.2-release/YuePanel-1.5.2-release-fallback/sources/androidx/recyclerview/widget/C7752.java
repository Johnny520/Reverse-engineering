package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7752 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.util.Comparator<androidx.recyclerview.widget.C7752.C7759> f29849 = null;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ, reason: contains not printable characters */
    public static class C7753 implements java.util.Comparator<androidx.recyclerview.widget.C7752.C7759> {
        public C7753() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(androidx.recyclerview.widget.C7752.C7759 r1, androidx.recyclerview.widget.C7752.C7759 r2) {
                r0 = this;
                androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ۡ r1 = (androidx.recyclerview.widget.C7752.C7759) r1
                androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ۡ r2 = (androidx.recyclerview.widget.C7752.C7759) r2
                int r1 = r0.m30087(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int m30087(androidx.recyclerview.widget.C7752.C7759 r3, androidx.recyclerview.widget.C7752.C7759 r4) {
                r2 = this;
                int r0 = r3.f29872
                int r1 = r4.f29872
                int r0 = r0 - r1
                if (r0 != 0) goto Ld
                int r3 = r3.f29873
                int r4 = r4.f29873
                int r0 = r3 - r4
            Ld:
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟, reason: contains not printable characters */
    public static abstract class AbstractC7754 {
        public AbstractC7754() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ */
        public abstract boolean mo30036(int r1, int r2);

        /* JADX INFO: renamed from: ۥ۟ */
        public abstract boolean mo30037(int r1, int r2);

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟ */
        public java.lang.Object mo30038(int r1, int r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public abstract int mo30039();

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public abstract int mo30040();
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟, reason: contains not printable characters */
    public static class C7755 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final int f29850 = -1;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final int f29851 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final int f29852 = 2;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static final int f29853 = 4;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static final int f29854 = 8;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static final int f29855 = 16;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static final int f29856 = 5;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public static final int f29857 = 31;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.util.List<androidx.recyclerview.widget.C7752.C7759> f29858;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final int[] f29859;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int[] f29860;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final androidx.recyclerview.widget.C7752.AbstractC7754 f29861;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final int f29862;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final int f29863;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final boolean f29864;

        public C7755(androidx.recyclerview.widget.C7752.AbstractC7754 r1, java.util.List<androidx.recyclerview.widget.C7752.C7759> r2, int[] r3, int[] r4, boolean r5) {
                r0 = this;
                r0.<init>()
                r0.f29858 = r2
                r0.f29859 = r3
                r0.f29860 = r4
                r2 = 0
                java.util.Arrays.fill(r3, r2)
                java.util.Arrays.fill(r4, r2)
                r0.f29861 = r1
                int r2 = r1.mo30040()
                r0.f29862 = r2
                int r1 = r1.mo30039()
                r0.f29863 = r1
                r0.f29864 = r5
                r0.m30089()
                r0.m30098()
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static androidx.recyclerview.widget.C7752.C7757 m30088(java.util.List<androidx.recyclerview.widget.C7752.C7757> r5, int r6, boolean r7) {
                int r0 = r5.size()
                r1 = 1
                int r0 = r0 - r1
            L6:
                if (r0 < 0) goto L36
                java.lang.Object r2 = r5.get(r0)
                androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟۟ r2 = (androidx.recyclerview.widget.C7752.C7757) r2
                int r3 = r2.f29865
                if (r3 != r6) goto L33
                boolean r3 = r2.f29867
                if (r3 != r7) goto L33
                r5.remove(r0)
            L19:
                int r6 = r5.size()
                if (r0 >= r6) goto L32
                java.lang.Object r6 = r5.get(r0)
                androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟۟ r6 = (androidx.recyclerview.widget.C7752.C7757) r6
                int r3 = r6.f29866
                if (r7 == 0) goto L2b
                r4 = r1
                goto L2c
            L2b:
                r4 = -1
            L2c:
                int r3 = r3 + r4
                r6.f29866 = r3
                int r0 = r0 + 1
                goto L19
            L32:
                return r2
            L33:
                int r0 = r0 + (-1)
                goto L6
            L36:
                r5 = 0
                return r5
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final void m30089() {
                r3 = this;
                java.util.List<androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ۡ> r0 = r3.f29858
                boolean r0 = r0.isEmpty()
                r1 = 0
                if (r0 == 0) goto Lb
                r0 = 0
                goto L13
            Lb:
                java.util.List<androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ۡ> r0 = r3.f29858
                java.lang.Object r0 = r0.get(r1)
                androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ۡ r0 = (androidx.recyclerview.widget.C7752.C7759) r0
            L13:
                if (r0 == 0) goto L1d
                int r2 = r0.f29872
                if (r2 != 0) goto L1d
                int r0 = r0.f29873
                if (r0 == 0) goto L31
            L1d:
                androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ۡ r0 = new androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ۡ
                r0.<init>()
                r0.f29872 = r1
                r0.f29873 = r1
                r0.f29875 = r1
                r0.f29874 = r1
                r0.f29876 = r1
                java.util.List<androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ۡ> r2 = r3.f29858
                r2.add(r1, r0)
            L31:
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int m30090(@Yue.InterfaceC3281(from = 0) int r4) {
                r3 = this;
                if (r4 < 0) goto L13
                int r0 = r3.f29863
                if (r4 >= r0) goto L13
                int[] r0 = r3.f29860
                r4 = r0[r4]
                r0 = r4 & 31
                if (r0 != 0) goto L10
                r4 = -1
                return r4
            L10:
                int r4 = r4 >> 5
                return r4
            L13:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Index out of bounds - passed position = "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = ", new list size = "
                r1.append(r4)
                int r4 = r3.f29863
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int m30091(@Yue.InterfaceC3281(from = 0) int r4) {
                r3 = this;
                if (r4 < 0) goto L13
                int r0 = r3.f29862
                if (r4 >= r0) goto L13
                int[] r0 = r3.f29859
                r4 = r0[r4]
                r0 = r4 & 31
                if (r0 != 0) goto L10
                r4 = -1
                return r4
            L10:
                int r4 = r4 >> 5
                return r4
            L13:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Index out of bounds - passed position = "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = ", old list size = "
                r1.append(r4)
                int r4 = r3.f29862
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m30092(java.util.List<androidx.recyclerview.widget.C7752.C7757> r7, Yue.InterfaceC3643 r8, int r9, int r10, int r11) {
                r6 = this;
                boolean r0 = r6.f29864
                if (r0 != 0) goto L8
                r8.mo4606(r9, r10)
                return
            L8:
                r0 = 1
                int r10 = r10 - r0
            La:
                if (r10 < 0) goto L82
                int[] r1 = r6.f29860
                int r2 = r11 + r10
                r1 = r1[r2]
                r3 = r1 & 31
                if (r3 == 0) goto L66
                r4 = 4
                if (r3 == r4) goto L4f
                r5 = 8
                if (r3 == r5) goto L4f
                r1 = 16
                if (r3 != r1) goto L2b
                androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟۟ r1 = new androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟۟
                r3 = 0
                r1.<init>(r2, r9, r3)
                r7.add(r1)
                goto L7f
            L2b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "unknown flag for pos "
                r8.append(r9)
                r8.append(r2)
                java.lang.String r9 = " "
                r8.append(r9)
                long r9 = (long) r3
                java.lang.String r9 = java.lang.Long.toBinaryString(r9)
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                r7.<init>(r8)
                throw r7
            L4f:
                int r1 = r1 >> 5
                androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟۟ r5 = m30088(r7, r1, r0)
                int r5 = r5.f29866
                r8.mo4605(r5, r9)
                if (r3 != r4) goto L7f
                androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟ r3 = r6.f29861
                java.lang.Object r1 = r3.mo30038(r1, r2)
                r8.mo4608(r9, r0, r1)
                goto L7f
            L66:
                r8.mo4606(r9, r0)
                java.util.Iterator r1 = r7.iterator()
            L6d:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L7f
                java.lang.Object r2 = r1.next()
                androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟۟ r2 = (androidx.recyclerview.widget.C7752.C7757) r2
                int r3 = r2.f29866
                int r3 = r3 + r0
                r2.f29866 = r3
                goto L6d
            L7f:
                int r10 = r10 + (-1)
                goto La
            L82:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final void m30093(java.util.List<androidx.recyclerview.widget.C7752.C7757> r9, Yue.InterfaceC3643 r10, int r11, int r12, int r13) {
                r8 = this;
                boolean r0 = r8.f29864
                if (r0 != 0) goto L8
                r10.mo4607(r11, r12)
                return
            L8:
                r0 = 1
                int r12 = r12 - r0
            La:
                if (r12 < 0) goto L8d
                int[] r1 = r8.f29859
                int r2 = r13 + r12
                r1 = r1[r2]
                r3 = r1 & 31
                if (r3 == 0) goto L6e
                r4 = 4
                if (r3 == r4) goto L50
                r5 = 8
                if (r3 == r5) goto L50
                r1 = 16
                if (r3 != r1) goto L2c
                androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟۟ r1 = new androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟۟
                int r3 = r11 + r12
                r1.<init>(r2, r3, r0)
                r9.add(r1)
                goto L89
            L2c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "unknown flag for pos "
                r10.append(r11)
                r10.append(r2)
                java.lang.String r11 = " "
                r10.append(r11)
                long r11 = (long) r3
                java.lang.String r11 = java.lang.Long.toBinaryString(r11)
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.<init>(r10)
                throw r9
            L50:
                int r1 = r1 >> 5
                r5 = 0
                androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟۟ r5 = m30088(r9, r1, r5)
                int r6 = r11 + r12
                int r7 = r5.f29866
                int r7 = r7 - r0
                r10.mo4605(r6, r7)
                if (r3 != r4) goto L89
                int r3 = r5.f29866
                int r3 = r3 - r0
                androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟ r4 = r8.f29861
                java.lang.Object r1 = r4.mo30038(r2, r1)
                r10.mo4608(r3, r0, r1)
                goto L89
            L6e:
                int r1 = r11 + r12
                r10.mo4607(r1, r0)
                java.util.Iterator r1 = r9.iterator()
            L77:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L89
                java.lang.Object r2 = r1.next()
                androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟۟ r2 = (androidx.recyclerview.widget.C7752.C7757) r2
                int r3 = r2.f29866
                int r3 = r3 - r0
                r2.f29866 = r3
                goto L77
            L89:
                int r12 = r12 + (-1)
                goto La
            L8d:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void m30094(@Yue.InterfaceC4410 Yue.InterfaceC3643 r15) {
                r14 = this;
                boolean r0 = r15 instanceof Yue.C0750
                if (r0 == 0) goto L7
                Yue.ۥ۟ۢۦۦ r15 = (Yue.C0750) r15
                goto Ld
            L7:
                Yue.ۥ۟ۢۦۦ r0 = new Yue.ۥ۟ۢۦۦ
                r0.<init>(r15)
                r15 = r0
            Ld:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                int r1 = r14.f29862
                int r2 = r14.f29863
                java.util.List<androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ۡ> r3 = r14.f29858
                int r3 = r3.size()
                r7 = 1
                int r3 = r3 - r7
                r8 = r2
                r9 = r3
            L20:
                if (r9 < 0) goto L77
                java.util.List<androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ۡ> r2 = r14.f29858
                java.lang.Object r2 = r2.get(r9)
                r10 = r2
                androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ۡ r10 = (androidx.recyclerview.widget.C7752.C7759) r10
                int r11 = r10.f29874
                int r2 = r10.f29872
                int r12 = r2 + r11
                int r2 = r10.f29873
                int r13 = r2 + r11
                if (r12 >= r1) goto L41
                int r5 = r1 - r12
                r1 = r14
                r2 = r0
                r3 = r15
                r4 = r12
                r6 = r12
                r1.m30093(r2, r3, r4, r5, r6)
            L41:
                if (r13 >= r8) goto L4d
                int r5 = r8 - r13
                r1 = r14
                r2 = r0
                r3 = r15
                r4 = r12
                r6 = r13
                r1.m30092(r2, r3, r4, r5, r6)
            L4d:
                int r11 = r11 + (-1)
            L4f:
                if (r11 < 0) goto L70
                int[] r1 = r14.f29859
                int r2 = r10.f29872
                int r3 = r2 + r11
                r1 = r1[r3]
                r1 = r1 & 31
                r3 = 2
                if (r1 != r3) goto L6d
                int r1 = r2 + r11
                androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟ r3 = r14.f29861
                int r2 = r2 + r11
                int r4 = r10.f29873
                int r4 = r4 + r11
                java.lang.Object r2 = r3.mo30038(r2, r4)
                r15.mo4608(r1, r7, r2)
            L6d:
                int r11 = r11 + (-1)
                goto L4f
            L70:
                int r1 = r10.f29872
                int r8 = r10.f29873
                int r9 = r9 + (-1)
                goto L20
            L77:
                r15.m4609()
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m30095(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7678 r2) {
                r1 = this;
                androidx.recyclerview.widget.ۥ۟ r0 = new androidx.recyclerview.widget.ۥ۟
                r0.<init>(r2)
                r1.m30094(r0)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final void m30096(int r3, int r4, int r5) {
                r2 = this;
                int[] r0 = r2.f29859
                int r1 = r3 + (-1)
                r0 = r0[r1]
                if (r0 == 0) goto L9
                return
            L9:
                r0 = 0
                r2.m30097(r3, r4, r5, r0)
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final boolean m30097(int r9, int r10, int r11, boolean r12) {
                r8 = this;
                if (r12 == 0) goto L7
                int r10 = r10 + (-1)
                r1 = r9
                r0 = r10
                goto La
            L7:
                int r0 = r9 + (-1)
                r1 = r0
            La:
                if (r11 < 0) goto L78
                java.util.List<androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ۡ> r2 = r8.f29858
                java.lang.Object r2 = r2.get(r11)
                androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ۡ r2 = (androidx.recyclerview.widget.C7752.C7759) r2
                int r3 = r2.f29872
                int r4 = r2.f29874
                int r3 = r3 + r4
                int r5 = r2.f29873
                int r5 = r5 + r4
                r4 = 4
                r6 = 8
                r7 = 1
                if (r12 == 0) goto L49
                int r1 = r1 - r7
            L23:
                if (r1 < r3) goto L71
                androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟ r10 = r8.f29861
                boolean r10 = r10.mo30037(r1, r0)
                if (r10 == 0) goto L46
                androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟ r9 = r8.f29861
                boolean r9 = r9.mo30036(r1, r0)
                if (r9 == 0) goto L36
                r4 = r6
            L36:
                int[] r9 = r8.f29860
                int r10 = r1 << 5
                r10 = r10 | 16
                r9[r0] = r10
                int[] r9 = r8.f29859
                int r10 = r0 << 5
                r10 = r10 | r4
                r9[r1] = r10
                return r7
            L46:
                int r1 = r1 + (-1)
                goto L23
            L49:
                int r10 = r10 - r7
            L4a:
                if (r10 < r5) goto L71
                androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟ r1 = r8.f29861
                boolean r1 = r1.mo30037(r0, r10)
                if (r1 == 0) goto L6e
                androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟ r11 = r8.f29861
                boolean r11 = r11.mo30036(r0, r10)
                if (r11 == 0) goto L5d
                r4 = r6
            L5d:
                int[] r11 = r8.f29859
                int r9 = r9 - r7
                int r12 = r10 << 5
                r12 = r12 | 16
                r11[r9] = r12
                int[] r11 = r8.f29860
                int r9 = r9 << 5
                r9 = r9 | r4
                r11[r10] = r9
                return r7
            L6e:
                int r10 = r10 + (-1)
                goto L4a
            L71:
                int r1 = r2.f29872
                int r10 = r2.f29873
                int r11 = r11 + (-1)
                goto La
            L78:
                r9 = 0
                return r9
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final void m30098() {
                r9 = this;
                int r0 = r9.f29862
                int r1 = r9.f29863
                java.util.List<androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ۡ> r2 = r9.f29858
                int r2 = r2.size()
                r3 = 1
                int r2 = r2 - r3
            Lc:
                if (r2 < 0) goto L60
                java.util.List<androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ۡ> r4 = r9.f29858
                java.lang.Object r4 = r4.get(r2)
                androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ۡ r4 = (androidx.recyclerview.widget.C7752.C7759) r4
                int r5 = r4.f29872
                int r6 = r4.f29874
                int r5 = r5 + r6
                int r7 = r4.f29873
                int r7 = r7 + r6
                boolean r6 = r9.f29864
                if (r6 == 0) goto L32
            L22:
                if (r0 <= r5) goto L2a
                r9.m30096(r0, r1, r2)
                int r0 = r0 + (-1)
                goto L22
            L2a:
                if (r1 <= r7) goto L32
                r9.m30099(r0, r1, r2)
                int r1 = r1 + (-1)
                goto L2a
            L32:
                r0 = 0
            L33:
                int r1 = r4.f29874
                if (r0 >= r1) goto L59
                int r1 = r4.f29872
                int r1 = r1 + r0
                int r5 = r4.f29873
                int r5 = r5 + r0
                androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟ r6 = r9.f29861
                boolean r6 = r6.mo30036(r1, r5)
                if (r6 == 0) goto L47
                r6 = r3
                goto L48
            L47:
                r6 = 2
            L48:
                int[] r7 = r9.f29859
                int r8 = r5 << 5
                r8 = r8 | r6
                r7[r1] = r8
                int[] r7 = r9.f29860
                int r1 = r1 << 5
                r1 = r1 | r6
                r7[r5] = r1
                int r0 = r0 + 1
                goto L33
            L59:
                int r0 = r4.f29872
                int r1 = r4.f29873
                int r2 = r2 + (-1)
                goto Lc
            L60:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final void m30099(int r3, int r4, int r5) {
                r2 = this;
                int[] r0 = r2.f29860
                int r1 = r4 + (-1)
                r0 = r0[r1]
                if (r0 == 0) goto L9
                return
            L9:
                r0 = 1
                r2.m30097(r3, r4, r5, r0)
                return
        }

        @Yue.InterfaceC6959
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public java.util.List<androidx.recyclerview.widget.C7752.C7759> m30100() {
                r1 = this;
                java.util.List<androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ۡ> r0 = r1.f29858
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟, reason: contains not printable characters */
    public static abstract class AbstractC7756<T> {
        public AbstractC7756() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public abstract boolean m30101(@Yue.InterfaceC4410 T r1, @Yue.InterfaceC4410 T r2);

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public abstract boolean m30102(@Yue.InterfaceC4410 T r1, @Yue.InterfaceC4410 T r2);

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public java.lang.Object m30103(@Yue.InterfaceC4410 T r1, @Yue.InterfaceC4410 T r2) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C7757 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int f29865;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f29866;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean f29867;

        public C7757(int r1, int r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.f29865 = r1
                r0.f29866 = r2
                r0.f29867 = r3
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static class C7758 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int f29868;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f29869;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f29870;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f29871;

        public C7758() {
                r0 = this;
                r0.<init>()
                return
        }

        public C7758(int r1, int r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.f29868 = r1
                r0.f29869 = r2
                r0.f29870 = r3
                r0.f29871 = r4
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C7759 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int f29872;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f29873;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f29874;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f29875;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean f29876;

        public C7759() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ r0 = new androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ
            r0.<init>()
            androidx.recyclerview.widget.C7752.f29849 = r0
            return
    }

    public C7752() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static androidx.recyclerview.widget.C7752.C7755 m30084(@Yue.InterfaceC4410 androidx.recyclerview.widget.C7752.AbstractC7754 r1) {
            r0 = 1
            androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟ r1 = m30085(r1, r0)
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static androidx.recyclerview.widget.C7752.C7755 m30085(@Yue.InterfaceC4410 androidx.recyclerview.widget.C7752.AbstractC7754 r15, boolean r16) {
            int r0 = r15.mo30040()
            int r1 = r15.mo30039()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟۠ r3 = new androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟۠
            r5 = 0
            r3.<init>(r5, r0, r5, r1)
            r2.add(r3)
            int r3 = r0 + r1
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            int r3 = r3 + r0
            int r0 = r3 * 2
            int[] r1 = new int[r0]
            int[] r0 = new int[r0]
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L2e:
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto Led
            int r5 = r2.size()
            int r5 = r5 + (-1)
            java.lang.Object r5 = r2.remove(r5)
            r14 = r5
            androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟۠ r14 = (androidx.recyclerview.widget.C7752.C7758) r14
            int r6 = r14.f29868
            int r7 = r14.f29869
            int r8 = r14.f29870
            int r9 = r14.f29871
            r5 = r15
            r10 = r1
            r11 = r0
            r12 = r3
            androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ۡ r5 = m30086(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r5 == 0) goto Le8
            int r6 = r5.f29874
            if (r6 <= 0) goto L5a
            r4.add(r5)
        L5a:
            int r6 = r5.f29872
            int r7 = r14.f29868
            int r6 = r6 + r7
            r5.f29872 = r6
            int r6 = r5.f29873
            int r7 = r14.f29870
            int r6 = r6 + r7
            r5.f29873 = r6
            boolean r6 = r13.isEmpty()
            if (r6 == 0) goto L74
            androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟۠ r6 = new androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟۠
            r6.<init>()
            goto L80
        L74:
            int r6 = r13.size()
            int r6 = r6 + (-1)
            java.lang.Object r6 = r13.remove(r6)
            androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟۠ r6 = (androidx.recyclerview.widget.C7752.C7758) r6
        L80:
            int r7 = r14.f29868
            r6.f29868 = r7
            int r7 = r14.f29870
            r6.f29870 = r7
            boolean r7 = r5.f29876
            if (r7 == 0) goto L95
            int r7 = r5.f29872
            r6.f29869 = r7
            int r7 = r5.f29873
            r6.f29871 = r7
            goto Lae
        L95:
            boolean r7 = r5.f29875
            if (r7 == 0) goto La4
            int r7 = r5.f29872
            int r7 = r7 + (-1)
            r6.f29869 = r7
            int r7 = r5.f29873
            r6.f29871 = r7
            goto Lae
        La4:
            int r7 = r5.f29872
            r6.f29869 = r7
            int r7 = r5.f29873
            int r7 = r7 + (-1)
            r6.f29871 = r7
        Lae:
            r2.add(r6)
            boolean r6 = r5.f29876
            if (r6 == 0) goto Ld7
            boolean r6 = r5.f29875
            if (r6 == 0) goto Lc8
            int r6 = r5.f29872
            int r7 = r5.f29874
            int r6 = r6 + r7
            int r6 = r6 + 1
            r14.f29868 = r6
            int r5 = r5.f29873
            int r5 = r5 + r7
            r14.f29870 = r5
            goto Le3
        Lc8:
            int r6 = r5.f29872
            int r7 = r5.f29874
            int r6 = r6 + r7
            r14.f29868 = r6
            int r5 = r5.f29873
            int r5 = r5 + r7
            int r5 = r5 + 1
            r14.f29870 = r5
            goto Le3
        Ld7:
            int r6 = r5.f29872
            int r7 = r5.f29874
            int r6 = r6 + r7
            r14.f29868 = r6
            int r5 = r5.f29873
            int r5 = r5 + r7
            r14.f29870 = r5
        Le3:
            r2.add(r14)
            goto L2e
        Le8:
            r13.add(r14)
            goto L2e
        Led:
            java.util.Comparator<androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ۡ> r2 = androidx.recyclerview.widget.C7752.f29849
            java.util.Collections.sort(r4, r2)
            androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟ r8 = new androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟
            r2 = r8
            r3 = r15
            r5 = r1
            r6 = r0
            r7 = r16
            r2.<init>(r3, r4, r5, r6, r7)
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static androidx.recyclerview.widget.C7752.C7759 m30086(androidx.recyclerview.widget.C7752.AbstractC7754 r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
            r0 = r19
            r1 = r24
            r2 = r25
            int r3 = r21 - r20
            int r4 = r23 - r22
            r5 = 1
            if (r3 < r5) goto L129
            if (r4 >= r5) goto L11
            goto L129
        L11:
            int r6 = r3 - r4
            int r7 = r3 + r4
            int r7 = r7 + r5
            int r7 = r7 / 2
            int r8 = r26 - r7
            int r8 = r8 - r5
            int r9 = r26 + r7
            int r9 = r9 + r5
            r10 = 0
            java.util.Arrays.fill(r1, r8, r9, r10)
            int r8 = r8 + r6
            int r9 = r9 + r6
            java.util.Arrays.fill(r2, r8, r9, r3)
            int r8 = r6 % 2
            if (r8 == 0) goto L2d
            r8 = r5
            goto L2e
        L2d:
            r8 = r10
        L2e:
            r9 = r10
        L2f:
            if (r9 > r7) goto L121
            int r11 = -r9
            r12 = r11
        L33:
            if (r12 > r9) goto L9d
            if (r12 == r11) goto L4d
            if (r12 == r9) goto L45
            int r13 = r26 + r12
            int r14 = r13 + (-1)
            r14 = r1[r14]
            int r13 = r13 + r5
            r13 = r1[r13]
            if (r14 >= r13) goto L45
            goto L4d
        L45:
            int r13 = r26 + r12
            int r13 = r13 - r5
            r13 = r1[r13]
            int r13 = r13 + r5
            r14 = r5
            goto L53
        L4d:
            int r13 = r26 + r12
            int r13 = r13 + r5
            r13 = r1[r13]
            r14 = r10
        L53:
            int r15 = r13 - r12
        L55:
            if (r13 >= r3) goto L6a
            if (r15 >= r4) goto L6a
            int r10 = r20 + r13
            int r5 = r22 + r15
            boolean r5 = r0.mo30037(r10, r5)
            if (r5 == 0) goto L6a
            int r13 = r13 + 1
            int r15 = r15 + 1
            r5 = 1
            r10 = 0
            goto L55
        L6a:
            int r5 = r26 + r12
            r1[r5] = r13
            if (r8 == 0) goto L97
            int r10 = r6 - r9
            r15 = 1
            int r10 = r10 + r15
            if (r12 < r10) goto L97
            int r10 = r6 + r9
            int r10 = r10 - r15
            if (r12 > r10) goto L97
            r10 = r2[r5]
            if (r13 < r10) goto L97
            androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ۡ r0 = new androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ۡ
            r0.<init>()
            r2 = r2[r5]
            r0.f29872 = r2
            int r3 = r2 - r12
            r0.f29873 = r3
            r1 = r1[r5]
            int r1 = r1 - r2
            r0.f29874 = r1
            r0.f29875 = r14
            r15 = 0
            r0.f29876 = r15
            return r0
        L97:
            r15 = 0
            int r12 = r12 + 2
            r10 = r15
            r5 = 1
            goto L33
        L9d:
            r15 = r10
            r5 = r11
        L9f:
            if (r5 > r9) goto L116
            int r10 = r5 + r6
            int r12 = r9 + r6
            if (r10 == r12) goto Lc1
            int r12 = r11 + r6
            if (r10 == r12) goto Lb8
            int r12 = r26 + r10
            int r13 = r12 + (-1)
            r13 = r2[r13]
            r14 = 1
            int r12 = r12 + r14
            r12 = r2[r12]
            if (r13 >= r12) goto Lb9
            goto Lc2
        Lb8:
            r14 = 1
        Lb9:
            int r12 = r26 + r10
            int r12 = r12 + r14
            r12 = r2[r12]
            int r12 = r12 - r14
            r13 = r14
            goto Lc8
        Lc1:
            r14 = 1
        Lc2:
            int r12 = r26 + r10
            int r12 = r12 - r14
            r12 = r2[r12]
            r13 = r15
        Lc8:
            int r16 = r12 - r10
        Lca:
            if (r12 <= 0) goto Le7
            if (r16 <= 0) goto Le7
            int r17 = r20 + r12
            int r15 = r17 + (-1)
            int r17 = r22 + r16
            r18 = r3
            int r3 = r17 + (-1)
            boolean r3 = r0.mo30037(r15, r3)
            if (r3 == 0) goto Le9
            int r12 = r12 + (-1)
            int r16 = r16 + (-1)
            r3 = r18
            r14 = 1
            r15 = 0
            goto Lca
        Le7:
            r18 = r3
        Le9:
            int r3 = r26 + r10
            r2[r3] = r12
            if (r8 != 0) goto L10f
            if (r10 < r11) goto L10f
            if (r10 > r9) goto L10f
            r14 = r1[r3]
            if (r14 < r12) goto L10f
            androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ۡ r0 = new androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ۡ
            r0.<init>()
            r2 = r2[r3]
            r0.f29872 = r2
            int r4 = r2 - r10
            r0.f29873 = r4
            r1 = r1[r3]
            int r1 = r1 - r2
            r0.f29874 = r1
            r0.f29875 = r13
            r3 = 1
            r0.f29876 = r3
            return r0
        L10f:
            r3 = 1
            int r5 = r5 + 2
            r3 = r18
            r15 = 0
            goto L9f
        L116:
            r18 = r3
            r3 = 1
            int r9 = r9 + 1
            r5 = r3
            r3 = r18
            r10 = 0
            goto L2f
        L121:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation."
            r0.<init>(r1)
            throw r0
        L129:
            r0 = 0
            return r0
    }
}
