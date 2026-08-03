package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5868<E> implements java.lang.Cloneable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final java.lang.Object f21495 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean f21496;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int[] f21497;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public java.lang.Object[] f21498;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f21499;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            Yue.C5868.f21495 = r0
            return
    }

    public C5868() {
            r1 = this;
            r0 = 10
            r1.<init>(r0)
            return
    }

    public C5868(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f21496 = r0
            if (r2 != 0) goto L11
            int[] r2 = Yue.C1537.f4954
            r1.f21497 = r2
            java.lang.Object[] r2 = Yue.C1537.f4956
            r1.f21498 = r2
            goto L1d
        L11:
            int r2 = Yue.C1537.m7669(r2)
            int[] r0 = new int[r2]
            r1.f21497 = r0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.f21498 = r2
        L1d:
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            Yue.ۥۢ۟ۦ۠ r0 = r1.m21809()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.m21830()
            if (r0 > 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r3.f21499
            int r1 = r1 * 28
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r1 = 0
        L18:
            int r2 = r3.f21499
            if (r1 >= r2) goto L41
            if (r1 <= 0) goto L23
            java.lang.String r2 = ", "
            r0.append(r2)
        L23:
            int r2 = r3.m21819(r1)
            r0.append(r2)
            r2 = 61
            r0.append(r2)
            java.lang.Object r2 = r3.m21831(r1)
            if (r2 == r3) goto L39
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
    public void m21807(int r7, E r8) {
            r6 = this;
            int r0 = r6.f21499
            if (r0 == 0) goto L10
            int[] r1 = r6.f21497
            int r2 = r0 + (-1)
            r1 = r1[r2]
            if (r7 > r1) goto L10
            r6.m21820(r7, r8)
            return
        L10:
            boolean r1 = r6.f21496
            if (r1 == 0) goto L1c
            int[] r1 = r6.f21497
            int r1 = r1.length
            if (r0 < r1) goto L1c
            r6.m21813()
        L1c:
            int r0 = r6.f21499
            int[] r1 = r6.f21497
            int r1 = r1.length
            if (r0 < r1) goto L3e
            int r1 = r0 + 1
            int r1 = Yue.C1537.m7669(r1)
            int[] r2 = new int[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int[] r3 = r6.f21497
            int r4 = r3.length
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r2, r5, r4)
            java.lang.Object[] r3 = r6.f21498
            int r4 = r3.length
            java.lang.System.arraycopy(r3, r5, r1, r5, r4)
            r6.f21497 = r2
            r6.f21498 = r1
        L3e:
            int[] r1 = r6.f21497
            r1[r0] = r7
            java.lang.Object[] r7 = r6.f21498
            r7[r0] = r8
            int r0 = r0 + 1
            r6.f21499 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m21808() {
            r5 = this;
            int r0 = r5.f21499
            java.lang.Object[] r1 = r5.f21498
            r2 = 0
            r3 = r2
        L6:
            if (r3 >= r0) goto Le
            r4 = 0
            r1[r3] = r4
            int r3 = r3 + 1
            goto L6
        Le:
            r5.f21499 = r2
            r5.f21496 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Yue.C5868<E> m21809() {
            r2 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L1b
            Yue.ۥۢ۟ۦ۠ r0 = (Yue.C5868) r0     // Catch: java.lang.CloneNotSupportedException -> L1b
            int[] r1 = r2.f21497     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object r1 = r1.clone()     // Catch: java.lang.CloneNotSupportedException -> L1b
            int[] r1 = (int[]) r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            r0.f21497 = r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object[] r1 = r2.f21498     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object r1 = r1.clone()     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object[] r1 = (java.lang.Object[]) r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            r0.f21498 = r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            return r0
        L1b:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m21810(int r1) {
            r0 = this;
            int r1 = r0.m21816(r1)
            if (r1 < 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m21811(E r1) {
            r0 = this;
            int r1 = r0.m21817(r1)
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
    public void m21812(int r1) {
            r0 = this;
            r0.m21823(r1)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m21813() {
            r8 = this;
            int r0 = r8.f21499
            int[] r1 = r8.f21497
            java.lang.Object[] r2 = r8.f21498
            r3 = 0
            r4 = r3
            r5 = r4
        L9:
            if (r4 >= r0) goto L21
            r6 = r2[r4]
            java.lang.Object r7 = Yue.C5868.f21495
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
            r8.f21496 = r3
            r8.f21499 = r5
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public E m21814(int r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.m21815(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public E m21815(int r3, E r4) {
            r2 = this;
            int[] r0 = r2.f21497
            int r1 = r2.f21499
            int r3 = Yue.C1537.m7665(r0, r1, r3)
            if (r3 < 0) goto L14
            java.lang.Object[] r0 = r2.f21498
            r3 = r0[r3]
            java.lang.Object r0 = Yue.C5868.f21495
            if (r3 != r0) goto L13
            goto L14
        L13:
            return r3
        L14:
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int m21816(int r3) {
            r2 = this;
            boolean r0 = r2.f21496
            if (r0 == 0) goto L7
            r2.m21813()
        L7:
            int[] r0 = r2.f21497
            int r1 = r2.f21499
            int r3 = Yue.C1537.m7665(r0, r1, r3)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int m21817(E r3) {
            r2 = this;
            boolean r0 = r2.f21496
            if (r0 == 0) goto L7
            r2.m21813()
        L7:
            r0 = 0
        L8:
            int r1 = r2.f21499
            if (r0 >= r1) goto L16
            java.lang.Object[] r1 = r2.f21498
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
    public boolean m21818() {
            r1 = this;
            int r0 = r1.m21830()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public int m21819(int r2) {
            r1 = this;
            boolean r0 = r1.f21496
            if (r0 == 0) goto L7
            r1.m21813()
        L7:
            int[] r0 = r1.f21497
            r2 = r0[r2]
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m21820(int r7, E r8) {
            r6 = this;
            int[] r0 = r6.f21497
            int r1 = r6.f21499
            int r0 = Yue.C1537.m7665(r0, r1, r7)
            if (r0 < 0) goto Lf
            java.lang.Object[] r7 = r6.f21498
            r7[r0] = r8
            goto L7e
        Lf:
            int r0 = ~r0
            int r1 = r6.f21499
            if (r0 >= r1) goto L23
            java.lang.Object[] r2 = r6.f21498
            r3 = r2[r0]
            java.lang.Object r4 = Yue.C5868.f21495
            if (r3 != r4) goto L23
            int[] r1 = r6.f21497
            r1[r0] = r7
            r2[r0] = r8
            return
        L23:
            boolean r2 = r6.f21496
            if (r2 == 0) goto L38
            int[] r2 = r6.f21497
            int r2 = r2.length
            if (r1 < r2) goto L38
            r6.m21813()
            int[] r0 = r6.f21497
            int r1 = r6.f21499
            int r0 = Yue.C1537.m7665(r0, r1, r7)
            int r0 = ~r0
        L38:
            int r1 = r6.f21499
            int[] r2 = r6.f21497
            int r2 = r2.length
            if (r1 < r2) goto L5a
            int r1 = r1 + 1
            int r1 = Yue.C1537.m7669(r1)
            int[] r2 = new int[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int[] r3 = r6.f21497
            int r4 = r3.length
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r2, r5, r4)
            java.lang.Object[] r3 = r6.f21498
            int r4 = r3.length
            java.lang.System.arraycopy(r3, r5, r1, r5, r4)
            r6.f21497 = r2
            r6.f21498 = r1
        L5a:
            int r1 = r6.f21499
            int r2 = r1 - r0
            if (r2 == 0) goto L70
            int[] r2 = r6.f21497
            int r3 = r0 + 1
            int r1 = r1 - r0
            java.lang.System.arraycopy(r2, r0, r2, r3, r1)
            java.lang.Object[] r1 = r6.f21498
            int r2 = r6.f21499
            int r2 = r2 - r0
            java.lang.System.arraycopy(r1, r0, r1, r3, r2)
        L70:
            int[] r1 = r6.f21497
            r1[r0] = r7
            java.lang.Object[] r7 = r6.f21498
            r7[r0] = r8
            int r7 = r6.f21499
            int r7 = r7 + 1
            r6.f21499 = r7
        L7e:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m21821(@Yue.InterfaceC4410 Yue.C5868<? extends E> r5) {
            r4 = this;
            int r0 = r5.m21830()
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            int r2 = r5.m21819(r1)
            java.lang.Object r3 = r5.m21831(r1)
            r4.m21820(r2, r3)
            int r1 = r1 + 1
            goto L5
        L15:
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public E m21822(int r2, E r3) {
            r1 = this;
            java.lang.Object r0 = r1.m21814(r2)
            if (r0 != 0) goto L9
            r1.m21820(r2, r3)
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m21823(int r4) {
            r3 = this;
            int[] r0 = r3.f21497
            int r1 = r3.f21499
            int r4 = Yue.C1537.m7665(r0, r1, r4)
            if (r4 < 0) goto L17
            java.lang.Object[] r0 = r3.f21498
            r1 = r0[r4]
            java.lang.Object r2 = Yue.C5868.f21495
            if (r1 == r2) goto L17
            r0[r4] = r2
            r4 = 1
            r3.f21496 = r4
        L17:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean m21824(int r2, java.lang.Object r3) {
            r1 = this;
            int r2 = r1.m21816(r2)
            if (r2 < 0) goto L19
            java.lang.Object r0 = r1.m21831(r2)
            if (r3 == r0) goto L14
            if (r3 == 0) goto L19
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L19
        L14:
            r1.m21825(r2)
            r2 = 1
            return r2
        L19:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m21825(int r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.f21498
            r1 = r0[r4]
            java.lang.Object r2 = Yue.C5868.f21495
            if (r1 == r2) goto Ld
            r0[r4] = r2
            r4 = 1
            r3.f21496 = r4
        Ld:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public void m21826(int r2, int r3) {
            r1 = this;
            int r0 = r1.f21499
            int r3 = r3 + r2
            int r3 = java.lang.Math.min(r0, r3)
        L7:
            if (r2 >= r3) goto Lf
            r1.m21825(r2)
            int r2 = r2 + 1
            goto L7
        Lf:
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public E m21827(int r3, E r4) {
            r2 = this;
            int r3 = r2.m21816(r3)
            if (r3 < 0) goto Ld
            java.lang.Object[] r0 = r2.f21498
            r1 = r0[r3]
            r0[r3] = r4
            return r1
        Ld:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean m21828(int r2, E r3, E r4) {
            r1 = this;
            int r2 = r1.m21816(r2)
            if (r2 < 0) goto L1a
            java.lang.Object[] r0 = r1.f21498
            r0 = r0[r2]
            if (r0 == r3) goto L14
            if (r3 == 0) goto L1a
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L1a
        L14:
            java.lang.Object[] r3 = r1.f21498
            r3[r2] = r4
            r2 = 1
            return r2
        L1a:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public void m21829(int r2, E r3) {
            r1 = this;
            boolean r0 = r1.f21496
            if (r0 == 0) goto L7
            r1.m21813()
        L7:
            java.lang.Object[] r0 = r1.f21498
            r0[r2] = r3
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public int m21830() {
            r1 = this;
            boolean r0 = r1.f21496
            if (r0 == 0) goto L7
            r1.m21813()
        L7:
            int r0 = r1.f21499
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public E m21831(int r2) {
            r1 = this;
            boolean r0 = r1.f21496
            if (r0 == 0) goto L7
            r1.m21813()
        L7:
            java.lang.Object[] r0 = r1.f21498
            r2 = r0[r2]
            return r2
    }
}
