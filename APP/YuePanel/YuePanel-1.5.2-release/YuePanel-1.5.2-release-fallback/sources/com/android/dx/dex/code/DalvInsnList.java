package com.android.dx.dex.code;

/* JADX INFO: loaded from: classes.dex */
public final class DalvInsnList extends com.android.dx.util.FixedSizeList {
    private final int regCount;

    public DalvInsnList(int r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.regCount = r2
            return
    }

    public static com.android.dx.dex.code.DalvInsnList makeImmutable(java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r3, int r4) {
            int r0 = r3.size()
            com.android.dx.dex.code.DalvInsnList r1 = new com.android.dx.dex.code.DalvInsnList
            r1.<init>(r0, r4)
            r4 = 0
        La:
            if (r4 >= r0) goto L18
            java.lang.Object r2 = r3.get(r4)
            com.android.dx.dex.code.DalvInsn r2 = (com.android.dx.dex.code.DalvInsn) r2
            r1.set(r4, r2)
            int r4 = r4 + 1
            goto La
        L18:
            r1.setImmutable()
            return r1
    }

    public int codeSize() {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r0 + (-1)
            com.android.dx.dex.code.DalvInsn r0 = r1.get(r0)
            int r0 = r0.getNextAddress()
            return r0
    }

    public void debugPrint(java.io.OutputStream r2, java.lang.String r3, boolean r4) {
            r1 = this;
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            r0.<init>(r2)
            r1.debugPrint(r0, r3, r4)
            r0.flush()     // Catch: java.io.IOException -> Lc
            return
        Lc:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
    }

    public void debugPrint(java.io.Writer r5, java.lang.String r6, boolean r7) {
            r4 = this;
            com.android.dx.util.IndentingWriter r0 = new com.android.dx.util.IndentingWriter
            r1 = 0
            r0.<init>(r5, r1, r6)
            int r5 = r4.size()
            r6 = r1
        Lb:
            if (r6 >= r5) goto L2f
            java.lang.Object r2 = r4.get0(r6)     // Catch: java.io.IOException -> L2a
            com.android.dx.dex.code.DalvInsn r2 = (com.android.dx.dex.code.DalvInsn) r2     // Catch: java.io.IOException -> L2a
            int r3 = r2.codeSize()     // Catch: java.io.IOException -> L2a
            if (r3 != 0) goto L1e
            if (r7 == 0) goto L1c
            goto L1e
        L1c:
            r2 = 0
            goto L24
        L1e:
            java.lang.String r3 = ""
            java.lang.String r2 = r2.listingString(r3, r1, r7)     // Catch: java.io.IOException -> L2a
        L24:
            if (r2 == 0) goto L2c
            r0.write(r2)     // Catch: java.io.IOException -> L2a
            goto L2c
        L2a:
            r5 = move-exception
            goto L33
        L2c:
            int r6 = r6 + 1
            goto Lb
        L2f:
            r0.flush()     // Catch: java.io.IOException -> L2a
            return
        L33:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5)
            throw r6
    }

    public com.android.dx.dex.code.DalvInsn get(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get0(r1)
            com.android.dx.dex.code.DalvInsn r1 = (com.android.dx.dex.code.DalvInsn) r1
            return r1
    }

    public int getOutsSize() {
            r8 = this;
            int r0 = r8.size()
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            if (r2 >= r0) goto L7d
            java.lang.Object r4 = r8.get0(r2)
            com.android.dx.dex.code.DalvInsn r4 = (com.android.dx.dex.code.DalvInsn) r4
            boolean r5 = r4 instanceof com.android.dx.dex.code.CstInsn
            r6 = 1
            if (r5 == 0) goto L49
            r5 = r4
            com.android.dx.dex.code.CstInsn r5 = (com.android.dx.dex.code.CstInsn) r5
            com.android.dx.rop.cst.Constant r5 = r5.getConstant()
            boolean r7 = r5 instanceof com.android.dx.rop.cst.CstBaseMethodRef
            if (r7 == 0) goto L34
            com.android.dx.rop.cst.CstBaseMethodRef r5 = (com.android.dx.rop.cst.CstBaseMethodRef) r5
            com.android.dx.dex.code.Dop r4 = r4.getOpcode()
            int r4 = r4.getFamily()
            r7 = 113(0x71, float:1.58E-43)
            if (r4 != r7) goto L2e
            goto L2f
        L2e:
            r6 = r1
        L2f:
            int r4 = r5.getParameterWordCount(r6)
            goto L6e
        L34:
            boolean r4 = r5 instanceof com.android.dx.rop.cst.CstCallSiteRef
            if (r4 == 0) goto L47
            com.android.dx.rop.cst.CstCallSiteRef r5 = (com.android.dx.rop.cst.CstCallSiteRef) r5
            com.android.dx.rop.type.Prototype r4 = r5.getPrototype()
            com.android.dx.rop.type.StdTypeList r4 = r4.getParameterTypes()
            int r4 = r4.getWordCount()
            goto L6e
        L47:
            r4 = r1
            goto L6e
        L49:
            boolean r5 = r4 instanceof com.android.dx.dex.code.MultiCstInsn
            if (r5 == 0) goto L7a
            com.android.dx.dex.code.Dop r5 = r4.getOpcode()
            int r5 = r5.getFamily()
            r7 = 250(0xfa, float:3.5E-43)
            if (r5 != r7) goto L72
            com.android.dx.dex.code.MultiCstInsn r4 = (com.android.dx.dex.code.MultiCstInsn) r4
            com.android.dx.rop.cst.Constant r4 = r4.getConstant(r6)
            com.android.dx.rop.cst.CstProtoRef r4 = (com.android.dx.rop.cst.CstProtoRef) r4
            com.android.dx.rop.type.Prototype r4 = r4.getPrototype()
            com.android.dx.rop.type.StdTypeList r4 = r4.getParameterTypes()
            int r4 = r4.getWordCount()
            int r4 = r4 + r6
        L6e:
            if (r4 <= r3) goto L7a
            r3 = r4
            goto L7a
        L72:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Expecting invoke-polymorphic"
            r0.<init>(r1)
            throw r0
        L7a:
            int r2 = r2 + 1
            goto L7
        L7d:
            return r3
    }

    public int getRegistersSize() {
            r1 = this;
            int r0 = r1.regCount
            return r0
    }

    public void set(int r1, com.android.dx.dex.code.DalvInsn r2) {
            r0 = this;
            r0.set0(r1, r2)
            return
    }

    public void writeTo(com.android.dx.util.AnnotatedOutput r11) {
            r10 = this;
            int r0 = r11.getCursor()
            int r1 = r10.size()
            boolean r2 = r11.annotates()
            r3 = 0
            if (r2 == 0) goto L44
            boolean r2 = r11.isVerbose()
            r4 = r3
        L14:
            if (r4 >= r1) goto L44
            java.lang.Object r5 = r10.get0(r4)
            com.android.dx.dex.code.DalvInsn r5 = (com.android.dx.dex.code.DalvInsn) r5
            int r6 = r5.codeSize()
            int r6 = r6 * 2
            if (r6 != 0) goto L29
            if (r2 == 0) goto L27
            goto L29
        L27:
            r5 = 0
            goto L34
        L29:
            java.lang.String r7 = "  "
            int r8 = r11.getAnnotationWidth()
            r9 = 1
            java.lang.String r5 = r5.listingString(r7, r8, r9)
        L34:
            if (r5 == 0) goto L3a
            r11.annotate(r6, r5)
            goto L41
        L3a:
            if (r6 == 0) goto L41
            java.lang.String r5 = ""
            r11.annotate(r6, r5)
        L41:
            int r4 = r4 + 1
            goto L14
        L44:
            if (r3 >= r1) goto L69
            java.lang.Object r2 = r10.get0(r3)
            com.android.dx.dex.code.DalvInsn r2 = (com.android.dx.dex.code.DalvInsn) r2
            r2.writeTo(r11)     // Catch: java.lang.RuntimeException -> L52
            int r3 = r3 + 1
            goto L44
        L52:
            r11 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "...while writing "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.android.dex.util.ExceptionWithContext r11 = com.android.dex.util.ExceptionWithContext.withContext(r11, r0)
            throw r11
        L69:
            int r11 = r11.getCursor()
            int r11 = r11 - r0
            int r11 = r11 / 2
            int r0 = r10.codeSize()
            if (r11 != r0) goto L77
            return
        L77:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "write length mismatch; expected "
            r1.append(r2)
            int r2 = r10.codeSize()
            r1.append(r2)
            java.lang.String r2 = " but actually wrote "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
    }
}
