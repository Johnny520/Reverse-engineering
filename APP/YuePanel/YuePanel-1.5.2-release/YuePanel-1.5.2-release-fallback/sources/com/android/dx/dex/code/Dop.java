package com.android.dx.dex.code;

/* JADX INFO: loaded from: classes.dex */
public final class Dop {
    private final int family;
    private final com.android.dx.dex.code.InsnFormat format;
    private final boolean hasResult;
    private final int nextOpcode;
    private final int opcode;

    public Dop(int r2, int r3, int r4, com.android.dx.dex.code.InsnFormat r5, boolean r6) {
            r1 = this;
            r1.<init>()
            boolean r0 = com.android.dx.io.Opcodes.isValidShape(r2)
            if (r0 == 0) goto L3a
            boolean r0 = com.android.dx.io.Opcodes.isValidShape(r3)
            if (r0 == 0) goto L32
            boolean r0 = com.android.dx.io.Opcodes.isValidShape(r4)
            if (r0 == 0) goto L2a
            if (r5 == 0) goto L22
            r1.opcode = r2
            r1.family = r3
            r1.nextOpcode = r4
            r1.format = r5
            r1.hasResult = r6
            return
        L22:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "format == null"
            r2.<init>(r3)
            throw r2
        L2a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "bogus nextOpcode"
            r2.<init>(r3)
            throw r2
        L32:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "bogus family"
            r2.<init>(r3)
            throw r2
        L3a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "bogus opcode"
            r2.<init>(r3)
            throw r2
    }

    public int getFamily() {
            r1 = this;
            int r0 = r1.family
            return r0
    }

    public com.android.dx.dex.code.InsnFormat getFormat() {
            r1 = this;
            com.android.dx.dex.code.InsnFormat r0 = r1.format
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            int r0 = r1.opcode
            java.lang.String r0 = com.android.dx.io.OpcodeInfo.getName(r0)
            return r0
    }

    public int getNextOpcode() {
            r1 = this;
            int r0 = r1.nextOpcode
            return r0
    }

    public int getOpcode() {
            r1 = this;
            int r0 = r1.opcode
            return r0
    }

    public com.android.dx.dex.code.Dop getOppositeTest() {
            r3 = this;
            int r0 = r3.opcode
            switch(r0) {
                case 50: goto L3d;
                case 51: goto L3a;
                case 52: goto L37;
                case 53: goto L34;
                case 54: goto L31;
                case 55: goto L2e;
                case 56: goto L2b;
                case 57: goto L28;
                case 58: goto L25;
                case 59: goto L22;
                case 60: goto L1f;
                case 61: goto L1c;
                default: goto L5;
            }
        L5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "bogus opcode: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1c:
            com.android.dx.dex.code.Dop r0 = com.android.dx.dex.code.Dops.IF_GTZ
            return r0
        L1f:
            com.android.dx.dex.code.Dop r0 = com.android.dx.dex.code.Dops.IF_LEZ
            return r0
        L22:
            com.android.dx.dex.code.Dop r0 = com.android.dx.dex.code.Dops.IF_LTZ
            return r0
        L25:
            com.android.dx.dex.code.Dop r0 = com.android.dx.dex.code.Dops.IF_GEZ
            return r0
        L28:
            com.android.dx.dex.code.Dop r0 = com.android.dx.dex.code.Dops.IF_EQZ
            return r0
        L2b:
            com.android.dx.dex.code.Dop r0 = com.android.dx.dex.code.Dops.IF_NEZ
            return r0
        L2e:
            com.android.dx.dex.code.Dop r0 = com.android.dx.dex.code.Dops.IF_GT
            return r0
        L31:
            com.android.dx.dex.code.Dop r0 = com.android.dx.dex.code.Dops.IF_LE
            return r0
        L34:
            com.android.dx.dex.code.Dop r0 = com.android.dx.dex.code.Dops.IF_LT
            return r0
        L37:
            com.android.dx.dex.code.Dop r0 = com.android.dx.dex.code.Dops.IF_GE
            return r0
        L3a:
            com.android.dx.dex.code.Dop r0 = com.android.dx.dex.code.Dops.IF_EQ
            return r0
        L3d:
            com.android.dx.dex.code.Dop r0 = com.android.dx.dex.code.Dops.IF_NE
            return r0
    }

    public boolean hasResult() {
            r1 = this;
            boolean r0 = r1.hasResult
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.getName()
            return r0
    }
}
