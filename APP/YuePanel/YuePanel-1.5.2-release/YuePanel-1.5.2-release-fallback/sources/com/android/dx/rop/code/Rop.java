package com.android.dx.rop.code;

/* JADX INFO: loaded from: classes.dex */
public final class Rop {
    public static final int BRANCH_GOTO = 3;
    public static final int BRANCH_IF = 4;
    public static final int BRANCH_MAX = 6;
    public static final int BRANCH_MIN = 1;
    public static final int BRANCH_NONE = 1;
    public static final int BRANCH_RETURN = 2;
    public static final int BRANCH_SWITCH = 5;
    public static final int BRANCH_THROW = 6;
    private final int branchingness;
    private final com.android.dx.rop.type.TypeList exceptions;
    private final boolean isCallLike;
    private final java.lang.String nickname;
    private final int opcode;
    private final com.android.dx.rop.type.Type result;
    private final com.android.dx.rop.type.TypeList sources;

    public Rop(int r9, com.android.dx.rop.type.Type r10, com.android.dx.rop.type.TypeList r11, int r12, java.lang.String r13) {
            r8 = this;
            com.android.dx.rop.type.StdTypeList r4 = com.android.dx.rop.type.StdTypeList.EMPTY
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public Rop(int r9, com.android.dx.rop.type.Type r10, com.android.dx.rop.type.TypeList r11, com.android.dx.rop.type.TypeList r12, int r13, java.lang.String r14) {
            r8 = this;
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public Rop(int r3, com.android.dx.rop.type.Type r4, com.android.dx.rop.type.TypeList r5, com.android.dx.rop.type.TypeList r6, int r7, boolean r8, java.lang.String r9) {
            r2 = this;
            r2.<init>()
            if (r4 == 0) goto L56
            if (r5 == 0) goto L4e
            if (r6 == 0) goto L46
            r0 = 1
            if (r7 < r0) goto L2f
            r0 = 6
            if (r7 > r0) goto L2f
            int r1 = r6.size()
            if (r1 == 0) goto L20
            if (r7 != r0) goto L18
            goto L20
        L18:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "exceptions / branchingness mismatch"
            r3.<init>(r4)
            throw r3
        L20:
            r2.opcode = r3
            r2.result = r4
            r2.sources = r5
            r2.exceptions = r6
            r2.branchingness = r7
            r2.isCallLike = r8
            r2.nickname = r9
            return
        L2f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "invalid branchingness: "
            r4.append(r5)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L46:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "exceptions == null"
            r3.<init>(r4)
            throw r3
        L4e:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "sources == null"
            r3.<init>(r4)
            throw r3
        L56:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "result == null"
            r3.<init>(r4)
            throw r3
    }

    public Rop(int r9, com.android.dx.rop.type.Type r10, com.android.dx.rop.type.TypeList r11, com.android.dx.rop.type.TypeList r12, java.lang.String r13) {
            r8 = this;
            r5 = 6
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public Rop(int r9, com.android.dx.rop.type.Type r10, com.android.dx.rop.type.TypeList r11, java.lang.String r12) {
            r8 = this;
            com.android.dx.rop.type.StdTypeList r4 = com.android.dx.rop.type.StdTypeList.EMPTY
            r5 = 1
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r7 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public Rop(int r9, com.android.dx.rop.type.TypeList r10, com.android.dx.rop.type.TypeList r11) {
            r8 = this;
            com.android.dx.rop.type.Type r2 = com.android.dx.rop.type.Type.VOID
            r6 = 1
            r7 = 0
            r5 = 6
            r0 = r8
            r1 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public final boolean canThrow() {
            r1 = this;
            com.android.dx.rop.type.TypeList r0 = r1.exceptions
            int r0 = r0.size()
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.android.dx.rop.code.Rop
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.android.dx.rop.code.Rop r5 = (com.android.dx.rop.code.Rop) r5
            int r1 = r4.opcode
            int r3 = r5.opcode
            if (r1 != r3) goto L33
            int r1 = r4.branchingness
            int r3 = r5.branchingness
            if (r1 != r3) goto L33
            com.android.dx.rop.type.Type r1 = r4.result
            com.android.dx.rop.type.Type r3 = r5.result
            if (r1 != r3) goto L33
            com.android.dx.rop.type.TypeList r1 = r4.sources
            com.android.dx.rop.type.TypeList r3 = r5.sources
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L33
            com.android.dx.rop.type.TypeList r1 = r4.exceptions
            com.android.dx.rop.type.TypeList r5 = r5.exceptions
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L33
            goto L34
        L33:
            r0 = r2
        L34:
            return r0
    }

    public int getBranchingness() {
            r1 = this;
            int r0 = r1.branchingness
            return r0
    }

    public com.android.dx.rop.type.TypeList getExceptions() {
            r1 = this;
            com.android.dx.rop.type.TypeList r0 = r1.exceptions
            return r0
    }

    public java.lang.String getNickname() {
            r1 = this;
            java.lang.String r0 = r1.nickname
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = r1.toString()
            return r0
    }

    public int getOpcode() {
            r1 = this;
            int r0 = r1.opcode
            return r0
    }

    public com.android.dx.rop.type.Type getResult() {
            r1 = this;
            com.android.dx.rop.type.Type r0 = r1.result
            return r0
    }

    public com.android.dx.rop.type.TypeList getSources() {
            r1 = this;
            com.android.dx.rop.type.TypeList r0 = r1.sources
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.opcode
            int r0 = r0 * 31
            int r1 = r2.branchingness
            int r0 = r0 + r1
            int r0 = r0 * 31
            com.android.dx.rop.type.Type r1 = r2.result
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            com.android.dx.rop.type.TypeList r1 = r2.sources
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            com.android.dx.rop.type.TypeList r1 = r2.exceptions
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public boolean isCallLike() {
            r1 = this;
            boolean r0 = r1.isCallLike
            return r0
    }

    public boolean isCommutative() {
            r2 = this;
            int r0 = r2.opcode
            r1 = 14
            if (r0 == r1) goto Lf
            r1 = 16
            if (r0 == r1) goto Lf
            switch(r0) {
                case 20: goto Lf;
                case 21: goto Lf;
                case 22: goto Lf;
                default: goto Ld;
            }
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    public java.lang.String toString() {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 40
            r0.<init>(r1)
            java.lang.String r1 = "Rop{"
            r0.append(r1)
            int r1 = r7.opcode
            java.lang.String r1 = com.android.dx.rop.code.RegOps.opName(r1)
            r0.append(r1)
            com.android.dx.rop.type.Type r1 = r7.result
            com.android.dx.rop.type.Type r2 = com.android.dx.rop.type.Type.VOID
            java.lang.String r3 = " ."
            java.lang.String r4 = " "
            if (r1 == r2) goto L28
            r0.append(r4)
            com.android.dx.rop.type.Type r1 = r7.result
            r0.append(r1)
            goto L2b
        L28:
            r0.append(r3)
        L2b:
            java.lang.String r1 = " <-"
            r0.append(r1)
            com.android.dx.rop.type.TypeList r1 = r7.sources
            int r1 = r1.size()
            r2 = 32
            r5 = 0
            if (r1 != 0) goto L3f
            r0.append(r3)
            goto L51
        L3f:
            r3 = r5
        L40:
            if (r3 >= r1) goto L51
            r0.append(r2)
            com.android.dx.rop.type.TypeList r6 = r7.sources
            com.android.dx.rop.type.Type r6 = r6.getType(r3)
            r0.append(r6)
            int r3 = r3 + 1
            goto L40
        L51:
            boolean r1 = r7.isCallLike
            if (r1 == 0) goto L5a
            java.lang.String r1 = " call"
            r0.append(r1)
        L5a:
            com.android.dx.rop.type.TypeList r1 = r7.exceptions
            int r1 = r1.size()
            if (r1 == 0) goto L88
            java.lang.String r3 = " throws"
            r0.append(r3)
        L67:
            if (r5 >= r1) goto Lcf
            r0.append(r2)
            com.android.dx.rop.type.TypeList r3 = r7.exceptions
            com.android.dx.rop.type.Type r3 = r3.getType(r5)
            com.android.dx.rop.type.Type r4 = com.android.dx.rop.type.Type.THROWABLE
            if (r3 != r4) goto L7c
            java.lang.String r3 = "<any>"
            r0.append(r3)
            goto L85
        L7c:
            com.android.dx.rop.type.TypeList r3 = r7.exceptions
            com.android.dx.rop.type.Type r3 = r3.getType(r5)
            r0.append(r3)
        L85:
            int r5 = r5 + 1
            goto L67
        L88:
            int r1 = r7.branchingness
            r2 = 1
            if (r1 == r2) goto Lca
            r2 = 2
            if (r1 == r2) goto Lc4
            r2 = 3
            if (r1 == r2) goto Lbe
            r2 = 4
            if (r1 == r2) goto Lb8
            r2 = 5
            if (r1 == r2) goto Lb2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            int r2 = r7.branchingness
            java.lang.String r2 = com.android.dx.util.Hex.u1(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            goto Lcf
        Lb2:
            java.lang.String r1 = " switches"
            r0.append(r1)
            goto Lcf
        Lb8:
            java.lang.String r1 = " ifs"
            r0.append(r1)
            goto Lcf
        Lbe:
            java.lang.String r1 = " gotos"
            r0.append(r1)
            goto Lcf
        Lc4:
            java.lang.String r1 = " returns"
            r0.append(r1)
            goto Lcf
        Lca:
            java.lang.String r1 = " flows"
            r0.append(r1)
        Lcf:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
