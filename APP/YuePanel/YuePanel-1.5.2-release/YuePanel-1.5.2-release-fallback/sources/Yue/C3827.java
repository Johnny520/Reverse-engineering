package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3827<E> implements java.lang.Cloneable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final java.lang.Object f12113 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean f12114;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public long[] f12115;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public java.lang.Object[] f12116;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f12117;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            Yue.C3827.f12113 = r0
            return
    }

    public C3827() {
            r1 = this;
            r0 = 10
            r1.<init>(r0)
            return
    }

    public C3827(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f12114 = r0
            if (r2 != 0) goto L11
            long[] r2 = Yue.C1537.f4955
            r1.f12115 = r2
            java.lang.Object[] r2 = Yue.C1537.f4956
            r1.f12116 = r2
            goto L1d
        L11:
            int r2 = Yue.C1537.m7670(r2)
            long[] r0 = new long[r2]
            r1.f12115 = r0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.f12116 = r2
        L1d:
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            Yue.ۥۣ۠ۨۢ r0 = r1.m15311()
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.m15331()
            if (r0 > 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.f12117
            int r1 = r1 * 28
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r1 = 0
        L18:
            int r2 = r4.f12117
            if (r1 >= r2) goto L41
            if (r1 <= 0) goto L23
            java.lang.String r2 = ", "
            r0.append(r2)
        L23:
            long r2 = r4.m15321(r1)
            r0.append(r2)
            r2 = 61
            r0.append(r2)
            java.lang.Object r2 = r4.m15332(r1)
            if (r2 == r4) goto L39
            r0.append(r2)
            goto L3e
        L39:
            java.lang.String r2 = "(this Map)"
            r0.append(r2)
        L3e:
            int r1 = r1 + 1
            goto L18
        L41:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m15309(long r7, E r9) {
            r6 = this;
            int r0 = r6.f12117
            if (r0 == 0) goto L12
            long[] r1 = r6.f12115
            int r2 = r0 + (-1)
            r2 = r1[r2]
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 > 0) goto L12
            r6.m15322(r7, r9)
            return
        L12:
            boolean r1 = r6.f12114
            if (r1 == 0) goto L1e
            long[] r1 = r6.f12115
            int r1 = r1.length
            if (r0 < r1) goto L1e
            r6.m15315()
        L1e:
            int r0 = r6.f12117
            long[] r1 = r6.f12115
            int r1 = r1.length
            if (r0 < r1) goto L40
            int r1 = r0 + 1
            int r1 = Yue.C1537.m7670(r1)
            long[] r2 = new long[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long[] r3 = r6.f12115
            int r4 = r3.length
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r2, r5, r4)
            java.lang.Object[] r3 = r6.f12116
            int r4 = r3.length
            java.lang.System.arraycopy(r3, r5, r1, r5, r4)
            r6.f12115 = r2
            r6.f12116 = r1
        L40:
            long[] r1 = r6.f12115
            r1[r0] = r7
            java.lang.Object[] r7 = r6.f12116
            r7[r0] = r9
            int r0 = r0 + 1
            r6.f12117 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m15310() {
            r5 = this;
            int r0 = r5.f12117
            java.lang.Object[] r1 = r5.f12116
            r2 = 0
            r3 = r2
        L6:
            if (r3 >= r0) goto Le
            r4 = 0
            r1[r3] = r4
            int r3 = r3 + 1
            goto L6
        Le:
            r5.f12117 = r2
            r5.f12114 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Yue.C3827<E> m15311() {
            r2 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L1b
            Yue.ۥۣ۠ۨۢ r0 = (Yue.C3827) r0     // Catch: java.lang.CloneNotSupportedException -> L1b
            long[] r1 = r2.f12115     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object r1 = r1.clone()     // Catch: java.lang.CloneNotSupportedException -> L1b
            long[] r1 = (long[]) r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            r0.f12115 = r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object[] r1 = r2.f12116     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object r1 = r1.clone()     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object[] r1 = (java.lang.Object[]) r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            r0.f12116 = r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            return r0
        L1b:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m15312(long r1) {
            r0 = this;
            int r1 = r0.m15318(r1)
            if (r1 < 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m15313(E r1) {
            r0 = this;
            int r1 = r0.m15319(r1)
            if (r1 < 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m15314(long r1) {
            r0 = this;
            r0.m15325(r1)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m15315() {
            r9 = this;
            int r0 = r9.f12117
            long[] r1 = r9.f12115
            java.lang.Object[] r2 = r9.f12116
            r3 = 0
            r4 = r3
            r5 = r4
        L9:
            if (r4 >= r0) goto L21
            r6 = r2[r4]
            java.lang.Object r7 = Yue.C3827.f12113
            if (r6 == r7) goto L1e
            if (r4 == r5) goto L1c
            r7 = r1[r4]
            r1[r5] = r7
            r2[r5] = r6
            r6 = 0
            r2[r4] = r6
        L1c:
            int r5 = r5 + 1
        L1e:
            int r4 = r4 + 1
            goto L9
        L21:
            r9.f12114 = r3
            r9.f12117 = r5
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public E m15316(long r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.m15317(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public E m15317(long r3, E r5) {
            r2 = this;
            long[] r0 = r2.f12115
            int r1 = r2.f12117
            int r3 = Yue.C1537.m7666(r0, r1, r3)
            if (r3 < 0) goto L14
            java.lang.Object[] r4 = r2.f12116
            r3 = r4[r3]
            java.lang.Object r4 = Yue.C3827.f12113
            if (r3 != r4) goto L13
            goto L14
        L13:
            return r3
        L14:
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int m15318(long r3) {
            r2 = this;
            boolean r0 = r2.f12114
            if (r0 == 0) goto L7
            r2.m15315()
        L7:
            long[] r0 = r2.f12115
            int r1 = r2.f12117
            int r3 = Yue.C1537.m7666(r0, r1, r3)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int m15319(E r3) {
            r2 = this;
            boolean r0 = r2.f12114
            if (r0 == 0) goto L7
            r2.m15315()
        L7:
            r0 = 0
        L8:
            int r1 = r2.f12117
            if (r0 >= r1) goto L16
            java.lang.Object[] r1 = r2.f12116
            r1 = r1[r0]
            if (r1 != r3) goto L13
            return r0
        L13:
            int r0 = r0 + 1
            goto L8
        L16:
            r3 = -1
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean m15320() {
            r1 = this;
            int r0 = r1.m15331()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public long m15321(int r4) {
            r3 = this;
            boolean r0 = r3.f12114
            if (r0 == 0) goto L7
            r3.m15315()
        L7:
            long[] r0 = r3.f12115
            r1 = r0[r4]
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m15322(long r7, E r9) {
            r6 = this;
            long[] r0 = r6.f12115
            int r1 = r6.f12117
            int r0 = Yue.C1537.m7666(r0, r1, r7)
            if (r0 < 0) goto Lf
            java.lang.Object[] r7 = r6.f12116
            r7[r0] = r9
            goto L7e
        Lf:
            int r0 = ~r0
            int r1 = r6.f12117
            if (r0 >= r1) goto L23
            java.lang.Object[] r2 = r6.f12116
            r3 = r2[r0]
            java.lang.Object r4 = Yue.C3827.f12113
            if (r3 != r4) goto L23
            long[] r1 = r6.f12115
            r1[r0] = r7
            r2[r0] = r9
            return
        L23:
            boolean r2 = r6.f12114
            if (r2 == 0) goto L38
            long[] r2 = r6.f12115
            int r2 = r2.length
            if (r1 < r2) goto L38
            r6.m15315()
            long[] r0 = r6.f12115
            int r1 = r6.f12117
            int r0 = Yue.C1537.m7666(r0, r1, r7)
            int r0 = ~r0
        L38:
            int r1 = r6.f12117
            long[] r2 = r6.f12115
            int r2 = r2.length
            if (r1 < r2) goto L5a
            int r1 = r1 + 1
            int r1 = Yue.C1537.m7670(r1)
            long[] r2 = new long[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long[] r3 = r6.f12115
            int r4 = r3.length
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r2, r5, r4)
            java.lang.Object[] r3 = r6.f12116
            int r4 = r3.length
            java.lang.System.arraycopy(r3, r5, r1, r5, r4)
            r6.f12115 = r2
            r6.f12116 = r1
        L5a:
            int r1 = r6.f12117
            int r2 = r1 - r0
            if (r2 == 0) goto L70
            long[] r2 = r6.f12115
            int r3 = r0 + 1
            int r1 = r1 - r0
            java.lang.System.arraycopy(r2, r0, r2, r3, r1)
            java.lang.Object[] r1 = r6.f12116
            int r2 = r6.f12117
            int r2 = r2 - r0
            java.lang.System.arraycopy(r1, r0, r1, r3, r2)
        L70:
            long[] r1 = r6.f12115
            r1[r0] = r7
            java.lang.Object[] r7 = r6.f12116
            r7[r0] = r9
            int r7 = r6.f12117
            int r7 = r7 + 1
            r6.f12117 = r7
        L7e:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m15323(@Yue.InterfaceC4410 Yue.C3827<? extends E> r6) {
            r5 = this;
            int r0 = r6.m15331()
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            long r2 = r6.m15321(r1)
            java.lang.Object r4 = r6.m15332(r1)
            r5.m15322(r2, r4)
            int r1 = r1 + 1
            goto L5
        L15:
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public E m15324(long r2, E r4) {
            r1 = this;
            java.lang.Object r0 = r1.m15316(r2)
            if (r0 != 0) goto L9
            r1.m15322(r2, r4)
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m15325(long r3) {
            r2 = this;
            long[] r0 = r2.f12115
            int r1 = r2.f12117
            int r3 = Yue.C1537.m7666(r0, r1, r3)
            if (r3 < 0) goto L17
            java.lang.Object[] r4 = r2.f12116
            r0 = r4[r3]
            java.lang.Object r1 = Yue.C3827.f12113
            if (r0 == r1) goto L17
            r4[r3] = r1
            r3 = 1
            r2.f12114 = r3
        L17:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean m15326(long r1, java.lang.Object r3) {
            r0 = this;
            int r1 = r0.m15318(r1)
            if (r1 < 0) goto L19
            java.lang.Object r2 = r0.m15332(r1)
            if (r3 == r2) goto L14
            if (r3 == 0) goto L19
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L19
        L14:
            r0.m15327(r1)
            r1 = 1
            return r1
        L19:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m15327(int r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.f12116
            r1 = r0[r4]
            java.lang.Object r2 = Yue.C3827.f12113
            if (r1 == r2) goto Ld
            r0[r4] = r2
            r4 = 1
            r3.f12114 = r4
        Ld:
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public E m15328(long r2, E r4) {
            r1 = this;
            int r2 = r1.m15318(r2)
            if (r2 < 0) goto Ld
            java.lang.Object[] r3 = r1.f12116
            r0 = r3[r2]
            r3[r2] = r4
            return r0
        Ld:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean m15329(long r1, E r3, E r4) {
            r0 = this;
            int r1 = r0.m15318(r1)
            if (r1 < 0) goto L1a
            java.lang.Object[] r2 = r0.f12116
            r2 = r2[r1]
            if (r2 == r3) goto L14
            if (r3 == 0) goto L1a
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L1a
        L14:
            java.lang.Object[] r2 = r0.f12116
            r2[r1] = r4
            r1 = 1
            return r1
        L1a:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public void m15330(int r2, E r3) {
            r1 = this;
            boolean r0 = r1.f12114
            if (r0 == 0) goto L7
            r1.m15315()
        L7:
            java.lang.Object[] r0 = r1.f12116
            r0[r2] = r3
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public int m15331() {
            r1 = this;
            boolean r0 = r1.f12114
            if (r0 == 0) goto L7
            r1.m15315()
        L7:
            int r0 = r1.f12117
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public E m15332(int r2) {
            r1 = this;
            boolean r0 = r1.f12114
            if (r0 == 0) goto L7
            r1.m15315()
        L7:
            java.lang.Object[] r0 = r1.f12116
            r2 = r0[r2]
            return r2
    }
}
