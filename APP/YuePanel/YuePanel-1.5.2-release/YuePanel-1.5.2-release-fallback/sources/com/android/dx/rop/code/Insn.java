package com.android.dx.rop.code;

/* JADX INFO: loaded from: classes.dex */
public abstract class Insn implements com.android.dx.util.ToHuman {
    private final com.android.dx.rop.code.Rop opcode;
    private final com.android.dx.rop.code.SourcePosition position;
    private final com.android.dx.rop.code.RegisterSpec result;
    private final com.android.dx.rop.code.RegisterSpecList sources;

    public static class BaseVisitor implements com.android.dx.rop.code.Insn.Visitor {
        public BaseVisitor() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.android.dx.rop.code.Insn.Visitor
        public void visitFillArrayDataInsn(com.android.dx.rop.code.FillArrayDataInsn r1) {
                r0 = this;
                return
        }

        @Override // com.android.dx.rop.code.Insn.Visitor
        public void visitInvokePolymorphicInsn(com.android.dx.rop.code.InvokePolymorphicInsn r1) {
                r0 = this;
                return
        }

        @Override // com.android.dx.rop.code.Insn.Visitor
        public void visitPlainCstInsn(com.android.dx.rop.code.PlainCstInsn r1) {
                r0 = this;
                return
        }

        @Override // com.android.dx.rop.code.Insn.Visitor
        public void visitPlainInsn(com.android.dx.rop.code.PlainInsn r1) {
                r0 = this;
                return
        }

        @Override // com.android.dx.rop.code.Insn.Visitor
        public void visitSwitchInsn(com.android.dx.rop.code.SwitchInsn r1) {
                r0 = this;
                return
        }

        @Override // com.android.dx.rop.code.Insn.Visitor
        public void visitThrowingCstInsn(com.android.dx.rop.code.ThrowingCstInsn r1) {
                r0 = this;
                return
        }

        @Override // com.android.dx.rop.code.Insn.Visitor
        public void visitThrowingInsn(com.android.dx.rop.code.ThrowingInsn r1) {
                r0 = this;
                return
        }
    }

    public interface Visitor {
        void visitFillArrayDataInsn(com.android.dx.rop.code.FillArrayDataInsn r1);

        void visitInvokePolymorphicInsn(com.android.dx.rop.code.InvokePolymorphicInsn r1);

        void visitPlainCstInsn(com.android.dx.rop.code.PlainCstInsn r1);

        void visitPlainInsn(com.android.dx.rop.code.PlainInsn r1);

        void visitSwitchInsn(com.android.dx.rop.code.SwitchInsn r1);

        void visitThrowingCstInsn(com.android.dx.rop.code.ThrowingCstInsn r1);

        void visitThrowingInsn(com.android.dx.rop.code.ThrowingInsn r1);
    }

    public Insn(com.android.dx.rop.code.Rop r1, com.android.dx.rop.code.SourcePosition r2, com.android.dx.rop.code.RegisterSpec r3, com.android.dx.rop.code.RegisterSpecList r4) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L22
            if (r2 == 0) goto L1a
            if (r4 == 0) goto L12
            r0.opcode = r1
            r0.position = r2
            r0.result = r3
            r0.sources = r4
            return
        L12:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "sources == null"
            r1.<init>(r2)
            throw r1
        L1a:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "position == null"
            r1.<init>(r2)
            throw r1
        L22:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "opcode == null"
            r1.<init>(r2)
            throw r1
    }

    private static boolean equalsHandleNulls(java.lang.Object r0, java.lang.Object r1) {
            if (r0 == r1) goto Ld
            if (r0 == 0) goto Lb
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    public abstract void accept(com.android.dx.rop.code.Insn.Visitor r1);

    public final boolean canThrow() {
            r1 = this;
            com.android.dx.rop.code.Rop r0 = r1.opcode
            boolean r0 = r0.canThrow()
            return r0
    }

    public boolean contentEquals(com.android.dx.rop.code.Insn r3) {
            r2 = this;
            com.android.dx.rop.code.Rop r0 = r2.opcode
            com.android.dx.rop.code.Rop r1 = r3.getOpcode()
            if (r0 != r1) goto L46
            com.android.dx.rop.code.SourcePosition r0 = r2.position
            com.android.dx.rop.code.SourcePosition r1 = r3.getPosition()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r3.getClass()
            if (r0 != r1) goto L46
            com.android.dx.rop.code.RegisterSpec r0 = r2.result
            com.android.dx.rop.code.RegisterSpec r1 = r3.getResult()
            boolean r0 = equalsHandleNulls(r0, r1)
            if (r0 == 0) goto L46
            com.android.dx.rop.code.RegisterSpecList r0 = r2.sources
            com.android.dx.rop.code.RegisterSpecList r1 = r3.getSources()
            boolean r0 = equalsHandleNulls(r0, r1)
            if (r0 == 0) goto L46
            com.android.dx.rop.type.TypeList r0 = r2.getCatches()
            com.android.dx.rop.type.TypeList r3 = r3.getCatches()
            boolean r3 = com.android.dx.rop.type.StdTypeList.equalContents(r0, r3)
            if (r3 == 0) goto L46
            r3 = 1
            goto L47
        L46:
            r3 = 0
        L47:
            return r3
    }

    public com.android.dx.rop.code.Insn copy() {
            r1 = this;
            r0 = 0
            com.android.dx.rop.code.Insn r0 = r1.withRegisterOffset(r0)
            return r0
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r0 != r1) goto L4
            r1 = 1
            goto L5
        L4:
            r1 = 0
        L5:
            return r1
    }

    public abstract com.android.dx.rop.type.TypeList getCatches();

    public java.lang.String getInlineString() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final com.android.dx.rop.code.RegisterSpec getLocalAssignment() {
            r3 = this;
            com.android.dx.rop.code.Rop r0 = r3.opcode
            int r0 = r0.getOpcode()
            r1 = 54
            if (r0 != r1) goto L12
            com.android.dx.rop.code.RegisterSpecList r0 = r3.sources
            r1 = 0
            com.android.dx.rop.code.RegisterSpec r0 = r0.get(r1)
            goto L14
        L12:
            com.android.dx.rop.code.RegisterSpec r0 = r3.result
        L14:
            r1 = 0
            if (r0 != 0) goto L18
            return r1
        L18:
            com.android.dx.rop.code.LocalItem r2 = r0.getLocalItem()
            if (r2 != 0) goto L1f
            return r1
        L1f:
            return r0
    }

    public final com.android.dx.rop.code.Rop getOpcode() {
            r1 = this;
            com.android.dx.rop.code.Rop r0 = r1.opcode
            return r0
    }

    public final com.android.dx.rop.code.SourcePosition getPosition() {
            r1 = this;
            com.android.dx.rop.code.SourcePosition r0 = r1.position
            return r0
    }

    public final com.android.dx.rop.code.RegisterSpec getResult() {
            r1 = this;
            com.android.dx.rop.code.RegisterSpec r0 = r1.result
            return r0
    }

    public final com.android.dx.rop.code.RegisterSpecList getSources() {
            r1 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r1.sources
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = java.lang.System.identityHashCode(r1)
            return r0
    }

    @Override // com.android.dx.util.ToHuman
    public java.lang.String toHuman() {
            r1 = this;
            java.lang.String r0 = r1.getInlineString()
            java.lang.String r0 = r1.toHumanWithInline(r0)
            return r0
    }

    public final java.lang.String toHumanWithInline(java.lang.String r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 80
            r0.<init>(r1)
            com.android.dx.rop.code.SourcePosition r1 = r4.position
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            com.android.dx.rop.code.Rop r1 = r4.opcode
            java.lang.String r1 = r1.getNickname()
            r0.append(r1)
            if (r5 == 0) goto L29
            java.lang.String r1 = "("
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
        L29:
            com.android.dx.rop.code.RegisterSpec r5 = r4.result
            java.lang.String r1 = " "
            java.lang.String r2 = " ."
            if (r5 != 0) goto L35
            r0.append(r2)
            goto L41
        L35:
            r0.append(r1)
            com.android.dx.rop.code.RegisterSpec r5 = r4.result
            java.lang.String r5 = r5.toHuman()
            r0.append(r5)
        L41:
            java.lang.String r5 = " <-"
            r0.append(r5)
            com.android.dx.rop.code.RegisterSpecList r5 = r4.sources
            int r5 = r5.size()
            if (r5 != 0) goto L52
            r0.append(r2)
            goto L68
        L52:
            r2 = 0
        L53:
            if (r2 >= r5) goto L68
            r0.append(r1)
            com.android.dx.rop.code.RegisterSpecList r3 = r4.sources
            com.android.dx.rop.code.RegisterSpec r3 = r3.get(r2)
            java.lang.String r3 = r3.toHuman()
            r0.append(r3)
            int r2 = r2 + 1
            goto L53
        L68:
            java.lang.String r5 = r0.toString()
            return r5
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.getInlineString()
            java.lang.String r0 = r1.toStringWithInline(r0)
            return r0
    }

    public final java.lang.String toStringWithInline(java.lang.String r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 80
            r0.<init>(r1)
            java.lang.String r1 = "Insn{"
            r0.append(r1)
            com.android.dx.rop.code.SourcePosition r1 = r3.position
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            com.android.dx.rop.code.Rop r2 = r3.opcode
            r0.append(r2)
            if (r4 == 0) goto L23
            r0.append(r1)
            r0.append(r4)
        L23:
            java.lang.String r4 = " :: "
            r0.append(r4)
            com.android.dx.rop.code.RegisterSpec r4 = r3.result
            if (r4 == 0) goto L34
            r0.append(r4)
            java.lang.String r4 = " <- "
            r0.append(r4)
        L34:
            com.android.dx.rop.code.RegisterSpecList r4 = r3.sources
            r0.append(r4)
            r4 = 125(0x7d, float:1.75E-43)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    public abstract com.android.dx.rop.code.Insn withAddedCatch(com.android.dx.rop.type.Type r1);

    public abstract com.android.dx.rop.code.Insn withNewRegisters(com.android.dx.rop.code.RegisterSpec r1, com.android.dx.rop.code.RegisterSpecList r2);

    public abstract com.android.dx.rop.code.Insn withRegisterOffset(int r1);

    public com.android.dx.rop.code.Insn withSourceLiteral() {
            r0 = this;
            return r0
    }
}
