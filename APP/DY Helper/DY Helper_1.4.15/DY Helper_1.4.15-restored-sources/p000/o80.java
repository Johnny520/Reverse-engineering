package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class o80 extends kotlin.jvm.internal.AbstractC0477 implements p000.n80, p000.ko0 {
    private final int arity;
    private final int flags;

    public o80(int r9, java.lang.Object r10, java.lang.Class r11, java.lang.String r12, java.lang.String r13, int r14) {
            r8 = this;
            r0 = 1
            r14 = r14 & r0
            r1 = 0
            if (r14 != r0) goto Lc
            r7 = r0
        L6:
            r2 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            goto Le
        Lc:
            r7 = r1
            goto L6
        Le:
            r2.<init>(r3, r4, r5, r6, r7)
            r2.arity = r9
            r2.flags = r1
            return
    }

    @Override // kotlin.jvm.internal.AbstractC0477
    public p000.io0 computeReflected() {
            r1 = this;
            wm1 r0 = p000.vm1.f11350
            r0.getClass()
            return r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.o80
            r2 = 0
            if (r1 == 0) goto L51
            o80 r5 = (p000.o80) r5
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
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 == 0) goto L50
            jo0 r4 = r4.getOwner()
            jo0 r5 = r5.getOwner()
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 == 0) goto L50
            return r0
        L50:
            return r2
        L51:
            boolean r0 = r5 instanceof p000.ko0
            if (r0 == 0) goto L5e
            io0 r4 = r4.compute()
            boolean r4 = r5.equals(r4)
            return r4
        L5e:
            return r2
    }

    @Override // p000.n80
    public int getArity() {
            r0 = this;
            int r0 = r0.arity
            return r0
    }

    @Override // kotlin.jvm.internal.AbstractC0477
    public /* bridge */ /* synthetic */ p000.io0 getReflected() {
            r0 = this;
            ko0 r0 = r0.getReflected()
            return r0
    }

    @Override // kotlin.jvm.internal.AbstractC0477
    public p000.ko0 getReflected() {
            r1 = this;
            io0 r0 = r1.compute()
            if (r0 == r1) goto L9
            ko0 r0 = (p000.ko0) r0
            return r0
        L9:
            fq r1 = new fq
            java.lang.String r0 = "Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath"
            r1.<init>(r0)
            throw r1
    }

    public int hashCode() {
            r2 = this;
            jo0 r0 = r2.getOwner()
            if (r0 != 0) goto L8
            r0 = 0
            goto L12
        L8:
            jo0 r0 = r2.getOwner()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
        L12:
            java.lang.String r1 = r2.getName()
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r2 = r2.getSignature()
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    @Override // p000.ko0
    public boolean isExternal() {
            r0 = this;
            ko0 r0 = r0.getReflected()
            boolean r0 = r0.isExternal()
            return r0
    }

    @Override // p000.ko0
    public boolean isInfix() {
            r0 = this;
            ko0 r0 = r0.getReflected()
            boolean r0 = r0.isInfix()
            return r0
    }

    @Override // p000.ko0
    public boolean isInline() {
            r0 = this;
            ko0 r0 = r0.getReflected()
            boolean r0 = r0.isInline()
            return r0
    }

    @Override // p000.ko0
    public boolean isOperator() {
            r0 = this;
            ko0 r0 = r0.getReflected()
            boolean r0 = r0.isOperator()
            return r0
    }

    @Override // p000.ko0
    public boolean isSuspend() {
            r0 = this;
            ko0 r0 = r0.getReflected()
            boolean r0 = r0.isSuspend()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            io0 r0 = r2.compute()
            if (r0 == r2) goto Lb
            java.lang.String r2 = r0.toString()
            return r2
        Lb:
            java.lang.String r0 = "<init>"
            java.lang.String r1 = r2.getName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1a
            java.lang.String r2 = "constructor (Kotlin reflection is not available)"
            return r2
        L1a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "function "
            r0.<init>(r1)
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r2 = " (Kotlin reflection is not available)"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
