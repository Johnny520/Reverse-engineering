package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۣ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C2853 extends Yue.AbstractC0908 implements Yue.InterfaceC2850, Yue.InterfaceC3441 {
    private final int arity;

    @Yue.InterfaceC5792(version = "1.4")
    private final int flags;

    public C2853(int r8) {
            r7 = this;
            java.lang.Object r2 = Yue.AbstractC0908.NO_RECEIVER
            r5 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Yue.InterfaceC5792(version = "1.1")
    public C2853(int r8, java.lang.Object r9) {
            r7 = this;
            r5 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Yue.InterfaceC5792(version = "1.4")
    public C2853(int r9, java.lang.Object r10, java.lang.Class r11, java.lang.String r12, java.lang.String r13, int r14) {
            r8 = this;
            r0 = r14 & 1
            r1 = 1
            if (r0 != r1) goto L7
            r7 = r1
            goto L9
        L7:
            r0 = 0
            r7 = r0
        L9:
            r2 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r8.arity = r9
            int r9 = r14 >> 1
            r8.flags = r9
            return
    }

    @Override // Yue.AbstractC0908
    @Yue.InterfaceC5792(version = "1.1")
    public Yue.InterfaceC3433 computeReflected() {
            r1 = this;
            Yue.ۥ۠ۦۢۧ r0 = Yue.C5277.m19887(r1)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof Yue.C2853
            r2 = 0
            if (r1 == 0) goto L52
            Yue.ۥۣۣ۠ۥ r5 = (Yue.C2853) r5
            java.lang.String r1 = r4.getName()
            java.lang.String r3 = r5.getName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L50
            java.lang.String r1 = r4.getSignature()
            java.lang.String r3 = r5.getSignature()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L50
            int r1 = r4.flags
            int r3 = r5.flags
            if (r1 != r3) goto L50
            int r1 = r4.arity
            int r3 = r5.arity
            if (r1 != r3) goto L50
            java.lang.Object r1 = r4.getBoundReceiver()
            java.lang.Object r3 = r5.getBoundReceiver()
            boolean r1 = Yue.C3329.m13897(r1, r3)
            if (r1 == 0) goto L50
            Yue.ۥ۠ۦۢۦ r1 = r4.getOwner()
            Yue.ۥ۠ۦۢۦ r5 = r5.getOwner()
            boolean r5 = Yue.C3329.m13897(r1, r5)
            if (r5 == 0) goto L50
            goto L51
        L50:
            r0 = r2
        L51:
            return r0
        L52:
            boolean r0 = r5 instanceof Yue.InterfaceC3441
            if (r0 == 0) goto L5f
            Yue.ۥ۠ۦۢۡ r0 = r4.compute()
            boolean r5 = r5.equals(r0)
            return r5
        L5f:
            return r2
    }

    @Override // Yue.InterfaceC2850
    public int getArity() {
            r1 = this;
            int r0 = r1.arity
            return r0
    }

    @Override // Yue.AbstractC0908
    @Yue.InterfaceC5792(version = "1.1")
    public /* bridge */ /* synthetic */ Yue.InterfaceC3433 getReflected() {
            r1 = this;
            Yue.ۥ۠ۦۢۧ r0 = r1.getReflected()
            return r0
    }

    @Override // Yue.AbstractC0908
    @Yue.InterfaceC5792(version = "1.1")
    public Yue.InterfaceC3441 getReflected() {
            r1 = this;
            Yue.ۥ۠ۦۢۡ r0 = super.getReflected()
            Yue.ۥ۠ۦۢۧ r0 = (Yue.InterfaceC3441) r0
            return r0
    }

    public int hashCode() {
            r2 = this;
            Yue.ۥ۠ۦۢۦ r0 = r2.getOwner()
            if (r0 != 0) goto L8
            r0 = 0
            goto L12
        L8:
            Yue.ۥ۠ۦۢۦ r0 = r2.getOwner()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
        L12:
            java.lang.String r1 = r2.getName()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.getSignature()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // Yue.InterfaceC3441
    @Yue.InterfaceC5792(version = "1.1")
    public boolean isExternal() {
            r1 = this;
            Yue.ۥ۠ۦۢۧ r0 = r1.getReflected()
            boolean r0 = r0.isExternal()
            return r0
    }

    @Override // Yue.InterfaceC3441
    @Yue.InterfaceC5792(version = "1.1")
    public boolean isInfix() {
            r1 = this;
            Yue.ۥ۠ۦۢۧ r0 = r1.getReflected()
            boolean r0 = r0.isInfix()
            return r0
    }

    @Override // Yue.InterfaceC3441
    @Yue.InterfaceC5792(version = "1.1")
    public boolean isInline() {
            r1 = this;
            Yue.ۥ۠ۦۢۧ r0 = r1.getReflected()
            boolean r0 = r0.isInline()
            return r0
    }

    @Override // Yue.InterfaceC3441
    @Yue.InterfaceC5792(version = "1.1")
    public boolean isOperator() {
            r1 = this;
            Yue.ۥ۠ۦۢۧ r0 = r1.getReflected()
            boolean r0 = r0.isOperator()
            return r0
    }

    @Override // Yue.AbstractC0908, Yue.InterfaceC3433
    @Yue.InterfaceC5792(version = "1.1")
    public boolean isSuspend() {
            r1 = this;
            Yue.ۥ۠ۦۢۧ r0 = r1.getReflected()
            boolean r0 = r0.isSuspend()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            Yue.ۥ۠ۦۢۡ r0 = r2.compute()
            if (r0 == r2) goto Lb
            java.lang.String r0 = r0.toString()
            return r0
        Lb:
            java.lang.String r0 = "<init>"
            java.lang.String r1 = r2.getName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1a
            java.lang.String r0 = "constructor (Kotlin reflection is not available)"
            goto L34
        L1a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "function "
            r0.append(r1)
            java.lang.String r1 = r2.getName()
            r0.append(r1)
            java.lang.String r1 = " (Kotlin reflection is not available)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L34:
            return r0
    }
}
