package net.bytebuddy.jar.asm;

/* JADX INFO: loaded from: classes2.dex */
final class AnnotationWriter extends net.bytebuddy.jar.asm.AnnotationVisitor {
    private final net.bytebuddy.jar.asm.ByteVector annotation;
    private net.bytebuddy.jar.asm.AnnotationWriter nextAnnotation;
    private int numElementValuePairs;
    private final int numElementValuePairsOffset;
    private final net.bytebuddy.jar.asm.AnnotationWriter previousAnnotation;
    private final net.bytebuddy.jar.asm.SymbolTable symbolTable;
    private final boolean useNamedValues;

    public AnnotationWriter(net.bytebuddy.jar.asm.SymbolTable r2, boolean r3, net.bytebuddy.jar.asm.ByteVector r4, net.bytebuddy.jar.asm.AnnotationWriter r5) {
            r1 = this;
            r0 = 589824(0x90000, float:8.2652E-40)
            r1.<init>(r0)
            r1.symbolTable = r2
            r1.useNamedValues = r3
            r1.annotation = r4
            int r2 = r4.length
            if (r2 != 0) goto L11
            r2 = -1
            goto L13
        L11:
            int r2 = r2 + (-2)
        L13:
            r1.numElementValuePairsOffset = r2
            r1.previousAnnotation = r5
            if (r5 == 0) goto L1b
            r5.nextAnnotation = r1
        L1b:
            return
    }

    public static int computeAnnotationsSize(net.bytebuddy.jar.asm.AnnotationWriter r1, net.bytebuddy.jar.asm.AnnotationWriter r2, net.bytebuddy.jar.asm.AnnotationWriter r3, net.bytebuddy.jar.asm.AnnotationWriter r4) {
            if (r1 == 0) goto L9
            java.lang.String r0 = "RuntimeVisibleAnnotations"
            int r1 = r1.computeAnnotationsSize(r0)
            goto La
        L9:
            r1 = 0
        La:
            if (r2 == 0) goto L13
            java.lang.String r0 = "RuntimeInvisibleAnnotations"
            int r2 = r2.computeAnnotationsSize(r0)
            int r1 = r1 + r2
        L13:
            if (r3 == 0) goto L1c
            java.lang.String r2 = "RuntimeVisibleTypeAnnotations"
            int r2 = r3.computeAnnotationsSize(r2)
            int r1 = r1 + r2
        L1c:
            if (r4 == 0) goto L25
            java.lang.String r2 = "RuntimeInvisibleTypeAnnotations"
            int r2 = r4.computeAnnotationsSize(r2)
            int r1 = r1 + r2
        L25:
            return r1
    }

    public static int computeParameterAnnotationsSize(java.lang.String r4, net.bytebuddy.jar.asm.AnnotationWriter[] r5, int r6) {
            int r0 = r6 * 2
            int r0 = r0 + 7
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r6) goto L18
            r3 = r5[r2]
            if (r3 != 0) goto Le
            r3 = r1
            goto L14
        Le:
            int r3 = r3.computeAnnotationsSize(r4)
            int r3 = r3 + (-8)
        L14:
            int r0 = r0 + r3
            int r2 = r2 + 1
            goto L6
        L18:
            return r0
    }

    public static net.bytebuddy.jar.asm.AnnotationWriter create(net.bytebuddy.jar.asm.SymbolTable r1, int r2, net.bytebuddy.jar.asm.TypePath r3, java.lang.String r4, net.bytebuddy.jar.asm.AnnotationWriter r5) {
            net.bytebuddy.jar.asm.ByteVector r0 = new net.bytebuddy.jar.asm.ByteVector
            r0.<init>()
            net.bytebuddy.jar.asm.TypeReference.putTarget(r2, r0)
            net.bytebuddy.jar.asm.TypePath.put(r3, r0)
            int r2 = r1.addConstantUtf8(r4)
            net.bytebuddy.jar.asm.ByteVector r2 = r0.putShort(r2)
            r3 = 0
            r2.putShort(r3)
            net.bytebuddy.jar.asm.AnnotationWriter r2 = new net.bytebuddy.jar.asm.AnnotationWriter
            r3 = 1
            r2.<init>(r1, r3, r0, r5)
            return r2
    }

    public static net.bytebuddy.jar.asm.AnnotationWriter create(net.bytebuddy.jar.asm.SymbolTable r2, java.lang.String r3, net.bytebuddy.jar.asm.AnnotationWriter r4) {
            net.bytebuddy.jar.asm.ByteVector r0 = new net.bytebuddy.jar.asm.ByteVector
            r0.<init>()
            int r3 = r2.addConstantUtf8(r3)
            net.bytebuddy.jar.asm.ByteVector r3 = r0.putShort(r3)
            r1 = 0
            r3.putShort(r1)
            net.bytebuddy.jar.asm.AnnotationWriter r3 = new net.bytebuddy.jar.asm.AnnotationWriter
            r1 = 1
            r3.<init>(r2, r1, r0, r4)
            return r3
    }

    public static void putAnnotations(net.bytebuddy.jar.asm.SymbolTable r1, net.bytebuddy.jar.asm.AnnotationWriter r2, net.bytebuddy.jar.asm.AnnotationWriter r3, net.bytebuddy.jar.asm.AnnotationWriter r4, net.bytebuddy.jar.asm.AnnotationWriter r5, net.bytebuddy.jar.asm.ByteVector r6) {
            if (r2 == 0) goto Lb
            java.lang.String r0 = "RuntimeVisibleAnnotations"
            int r0 = r1.addConstantUtf8(r0)
            r2.putAnnotations(r0, r6)
        Lb:
            if (r3 == 0) goto L16
            java.lang.String r2 = "RuntimeInvisibleAnnotations"
            int r2 = r1.addConstantUtf8(r2)
            r3.putAnnotations(r2, r6)
        L16:
            if (r4 == 0) goto L21
            java.lang.String r2 = "RuntimeVisibleTypeAnnotations"
            int r2 = r1.addConstantUtf8(r2)
            r4.putAnnotations(r2, r6)
        L21:
            if (r5 == 0) goto L2c
            java.lang.String r2 = "RuntimeInvisibleTypeAnnotations"
            int r1 = r1.addConstantUtf8(r2)
            r5.putAnnotations(r1, r6)
        L2c:
            return
    }

    public static void putParameterAnnotations(int r6, net.bytebuddy.jar.asm.AnnotationWriter[] r7, int r8, net.bytebuddy.jar.asm.ByteVector r9) {
            int r0 = r8 * 2
            int r0 = r0 + 1
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 >= r8) goto L19
            r4 = r7[r2]
            if (r4 != 0) goto Lf
            r3 = r1
            goto L15
        Lf:
            int r3 = r4.computeAnnotationsSize(r3)
            int r3 = r3 + (-8)
        L15:
            int r0 = r0 + r3
            int r2 = r2 + 1
            goto L6
        L19:
            r9.putShort(r6)
            r9.putInt(r0)
            r9.putByte(r8)
            r6 = r1
        L23:
            if (r6 >= r8) goto L4a
            r0 = r7[r6]
            r2 = r1
            r4 = r3
        L29:
            if (r0 == 0) goto L36
            r0.visitEnd()
            int r2 = r2 + 1
            net.bytebuddy.jar.asm.AnnotationWriter r4 = r0.previousAnnotation
            r5 = r4
            r4 = r0
            r0 = r5
            goto L29
        L36:
            r9.putShort(r2)
        L39:
            if (r4 == 0) goto L47
            net.bytebuddy.jar.asm.ByteVector r0 = r4.annotation
            byte[] r2 = r0.data
            int r0 = r0.length
            r9.putByteArray(r2, r1, r0)
            net.bytebuddy.jar.asm.AnnotationWriter r4 = r4.nextAnnotation
            goto L39
        L47:
            int r6 = r6 + 1
            goto L23
        L4a:
            return
    }

    public int computeAnnotationsSize(java.lang.String r3) {
            r2 = this;
            if (r3 == 0) goto L7
            net.bytebuddy.jar.asm.SymbolTable r0 = r2.symbolTable
            r0.addConstantUtf8(r3)
        L7:
            r3 = 8
            r0 = r2
        La:
            if (r0 == 0) goto L14
            net.bytebuddy.jar.asm.ByteVector r1 = r0.annotation
            int r1 = r1.length
            int r3 = r3 + r1
            net.bytebuddy.jar.asm.AnnotationWriter r0 = r0.previousAnnotation
            goto La
        L14:
            return r3
    }

    public void putAnnotations(int r7, net.bytebuddy.jar.asm.ByteVector r8) {
            r6 = this;
            r0 = 2
            r1 = 0
            r2 = 0
            r4 = r1
            r3 = r2
            r2 = r6
        L6:
            if (r2 == 0) goto L18
            r2.visitEnd()
            net.bytebuddy.jar.asm.ByteVector r3 = r2.annotation
            int r3 = r3.length
            int r0 = r0 + r3
            int r4 = r4 + 1
            net.bytebuddy.jar.asm.AnnotationWriter r3 = r2.previousAnnotation
            r5 = r3
            r3 = r2
            r2 = r5
            goto L6
        L18:
            r8.putShort(r7)
            r8.putInt(r0)
            r8.putShort(r4)
        L21:
            if (r3 == 0) goto L2f
            net.bytebuddy.jar.asm.ByteVector r7 = r3.annotation
            byte[] r0 = r7.data
            int r7 = r7.length
            r8.putByteArray(r0, r1, r7)
            net.bytebuddy.jar.asm.AnnotationWriter r3 = r3.nextAnnotation
            goto L21
        L2f:
            return
    }

    @Override // net.bytebuddy.jar.asm.AnnotationVisitor
    public void visit(java.lang.String r7, java.lang.Object r8) {
            r6 = this;
            int r0 = r6.numElementValuePairs
            int r0 = r0 + 1
            r6.numElementValuePairs = r0
            boolean r0 = r6.useNamedValues
            if (r0 == 0) goto L15
            net.bytebuddy.jar.asm.ByteVector r0 = r6.annotation
            net.bytebuddy.jar.asm.SymbolTable r1 = r6.symbolTable
            int r7 = r1.addConstantUtf8(r7)
            r0.putShort(r7)
        L15:
            boolean r7 = r8 instanceof java.lang.String
            if (r7 == 0) goto L2a
            net.bytebuddy.jar.asm.ByteVector r7 = r6.annotation
            net.bytebuddy.jar.asm.SymbolTable r0 = r6.symbolTable
            java.lang.String r8 = (java.lang.String) r8
            int r8 = r0.addConstantUtf8(r8)
            r0 = 115(0x73, float:1.61E-43)
            r7.put12(r0, r8)
            goto L1d7
        L2a:
            boolean r7 = r8 instanceof java.lang.Byte
            r0 = 66
            if (r7 == 0) goto L45
            net.bytebuddy.jar.asm.ByteVector r7 = r6.annotation
            net.bytebuddy.jar.asm.SymbolTable r1 = r6.symbolTable
            java.lang.Byte r8 = (java.lang.Byte) r8
            byte r8 = r8.byteValue()
            net.bytebuddy.jar.asm.Symbol r8 = r1.addConstantInteger(r8)
            int r8 = r8.index
            r7.put12(r0, r8)
            goto L1d7
        L45:
            boolean r7 = r8 instanceof java.lang.Boolean
            r1 = 90
            if (r7 == 0) goto L60
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            net.bytebuddy.jar.asm.ByteVector r8 = r6.annotation
            net.bytebuddy.jar.asm.SymbolTable r0 = r6.symbolTable
            net.bytebuddy.jar.asm.Symbol r7 = r0.addConstantInteger(r7)
            int r7 = r7.index
            r8.put12(r1, r7)
            goto L1d7
        L60:
            boolean r7 = r8 instanceof java.lang.Character
            r2 = 67
            if (r7 == 0) goto L7b
            net.bytebuddy.jar.asm.ByteVector r7 = r6.annotation
            net.bytebuddy.jar.asm.SymbolTable r0 = r6.symbolTable
            java.lang.Character r8 = (java.lang.Character) r8
            char r8 = r8.charValue()
            net.bytebuddy.jar.asm.Symbol r8 = r0.addConstantInteger(r8)
            int r8 = r8.index
            r7.put12(r2, r8)
            goto L1d7
        L7b:
            boolean r7 = r8 instanceof java.lang.Short
            r3 = 83
            if (r7 == 0) goto L96
            net.bytebuddy.jar.asm.ByteVector r7 = r6.annotation
            net.bytebuddy.jar.asm.SymbolTable r0 = r6.symbolTable
            java.lang.Short r8 = (java.lang.Short) r8
            short r8 = r8.shortValue()
            net.bytebuddy.jar.asm.Symbol r8 = r0.addConstantInteger(r8)
            int r8 = r8.index
            r7.put12(r3, r8)
            goto L1d7
        L96:
            boolean r7 = r8 instanceof net.bytebuddy.jar.asm.Type
            if (r7 == 0) goto Laf
            net.bytebuddy.jar.asm.ByteVector r7 = r6.annotation
            net.bytebuddy.jar.asm.SymbolTable r0 = r6.symbolTable
            net.bytebuddy.jar.asm.Type r8 = (net.bytebuddy.jar.asm.Type) r8
            java.lang.String r8 = r8.getDescriptor()
            int r8 = r0.addConstantUtf8(r8)
            r0 = 99
            r7.put12(r0, r8)
            goto L1d7
        Laf:
            boolean r7 = r8 instanceof byte[]
            r4 = 0
            r5 = 91
            if (r7 == 0) goto Ld3
            byte[] r8 = (byte[]) r8
            net.bytebuddy.jar.asm.ByteVector r7 = r6.annotation
            int r1 = r8.length
            r7.put12(r5, r1)
            int r7 = r8.length
        Lbf:
            if (r4 >= r7) goto L1d7
            r1 = r8[r4]
            net.bytebuddy.jar.asm.ByteVector r2 = r6.annotation
            net.bytebuddy.jar.asm.SymbolTable r3 = r6.symbolTable
            net.bytebuddy.jar.asm.Symbol r1 = r3.addConstantInteger(r1)
            int r1 = r1.index
            r2.put12(r0, r1)
            int r4 = r4 + 1
            goto Lbf
        Ld3:
            boolean r7 = r8 instanceof boolean[]
            if (r7 == 0) goto Lf4
            boolean[] r8 = (boolean[]) r8
            net.bytebuddy.jar.asm.ByteVector r7 = r6.annotation
            int r0 = r8.length
            r7.put12(r5, r0)
            int r7 = r8.length
        Le0:
            if (r4 >= r7) goto L1d7
            boolean r0 = r8[r4]
            net.bytebuddy.jar.asm.ByteVector r2 = r6.annotation
            net.bytebuddy.jar.asm.SymbolTable r3 = r6.symbolTable
            net.bytebuddy.jar.asm.Symbol r0 = r3.addConstantInteger(r0)
            int r0 = r0.index
            r2.put12(r1, r0)
            int r4 = r4 + 1
            goto Le0
        Lf4:
            boolean r7 = r8 instanceof short[]
            if (r7 == 0) goto L115
            short[] r8 = (short[]) r8
            net.bytebuddy.jar.asm.ByteVector r7 = r6.annotation
            int r0 = r8.length
            r7.put12(r5, r0)
            int r7 = r8.length
        L101:
            if (r4 >= r7) goto L1d7
            short r0 = r8[r4]
            net.bytebuddy.jar.asm.ByteVector r1 = r6.annotation
            net.bytebuddy.jar.asm.SymbolTable r2 = r6.symbolTable
            net.bytebuddy.jar.asm.Symbol r0 = r2.addConstantInteger(r0)
            int r0 = r0.index
            r1.put12(r3, r0)
            int r4 = r4 + 1
            goto L101
        L115:
            boolean r7 = r8 instanceof char[]
            if (r7 == 0) goto L136
            char[] r8 = (char[]) r8
            net.bytebuddy.jar.asm.ByteVector r7 = r6.annotation
            int r0 = r8.length
            r7.put12(r5, r0)
            int r7 = r8.length
        L122:
            if (r4 >= r7) goto L1d7
            char r0 = r8[r4]
            net.bytebuddy.jar.asm.ByteVector r1 = r6.annotation
            net.bytebuddy.jar.asm.SymbolTable r3 = r6.symbolTable
            net.bytebuddy.jar.asm.Symbol r0 = r3.addConstantInteger(r0)
            int r0 = r0.index
            r1.put12(r2, r0)
            int r4 = r4 + 1
            goto L122
        L136:
            boolean r7 = r8 instanceof int[]
            if (r7 == 0) goto L159
            int[] r8 = (int[]) r8
            net.bytebuddy.jar.asm.ByteVector r7 = r6.annotation
            int r0 = r8.length
            r7.put12(r5, r0)
            int r7 = r8.length
        L143:
            if (r4 >= r7) goto L1d7
            r0 = r8[r4]
            net.bytebuddy.jar.asm.ByteVector r1 = r6.annotation
            net.bytebuddy.jar.asm.SymbolTable r2 = r6.symbolTable
            net.bytebuddy.jar.asm.Symbol r0 = r2.addConstantInteger(r0)
            int r0 = r0.index
            r2 = 73
            r1.put12(r2, r0)
            int r4 = r4 + 1
            goto L143
        L159:
            boolean r7 = r8 instanceof long[]
            if (r7 == 0) goto L17c
            long[] r8 = (long[]) r8
            net.bytebuddy.jar.asm.ByteVector r7 = r6.annotation
            int r0 = r8.length
            r7.put12(r5, r0)
            int r7 = r8.length
        L166:
            if (r4 >= r7) goto L1d7
            r0 = r8[r4]
            net.bytebuddy.jar.asm.ByteVector r2 = r6.annotation
            net.bytebuddy.jar.asm.SymbolTable r3 = r6.symbolTable
            net.bytebuddy.jar.asm.Symbol r0 = r3.addConstantLong(r0)
            int r0 = r0.index
            r1 = 74
            r2.put12(r1, r0)
            int r4 = r4 + 1
            goto L166
        L17c:
            boolean r7 = r8 instanceof float[]
            if (r7 == 0) goto L19f
            float[] r8 = (float[]) r8
            net.bytebuddy.jar.asm.ByteVector r7 = r6.annotation
            int r0 = r8.length
            r7.put12(r5, r0)
            int r7 = r8.length
        L189:
            if (r4 >= r7) goto L1d7
            r0 = r8[r4]
            net.bytebuddy.jar.asm.ByteVector r1 = r6.annotation
            net.bytebuddy.jar.asm.SymbolTable r2 = r6.symbolTable
            net.bytebuddy.jar.asm.Symbol r0 = r2.addConstantFloat(r0)
            int r0 = r0.index
            r2 = 70
            r1.put12(r2, r0)
            int r4 = r4 + 1
            goto L189
        L19f:
            boolean r7 = r8 instanceof double[]
            if (r7 == 0) goto L1c2
            double[] r8 = (double[]) r8
            net.bytebuddy.jar.asm.ByteVector r7 = r6.annotation
            int r0 = r8.length
            r7.put12(r5, r0)
            int r7 = r8.length
        L1ac:
            if (r4 >= r7) goto L1d7
            r0 = r8[r4]
            net.bytebuddy.jar.asm.ByteVector r2 = r6.annotation
            net.bytebuddy.jar.asm.SymbolTable r3 = r6.symbolTable
            net.bytebuddy.jar.asm.Symbol r0 = r3.addConstantDouble(r0)
            int r0 = r0.index
            r1 = 68
            r2.put12(r1, r0)
            int r4 = r4 + 1
            goto L1ac
        L1c2:
            net.bytebuddy.jar.asm.SymbolTable r7 = r6.symbolTable
            net.bytebuddy.jar.asm.Symbol r7 = r7.addConstant(r8)
            net.bytebuddy.jar.asm.ByteVector r8 = r6.annotation
            int r0 = r7.tag
            java.lang.String r1 = ".s.IFJDCS"
            char r0 = r1.charAt(r0)
            int r7 = r7.index
            r8.put12(r0, r7)
        L1d7:
            return
    }

    @Override // net.bytebuddy.jar.asm.AnnotationVisitor
    public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotation(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            int r0 = r3.numElementValuePairs
            r1 = 1
            int r0 = r0 + r1
            r3.numElementValuePairs = r0
            boolean r0 = r3.useNamedValues
            if (r0 == 0) goto L15
            net.bytebuddy.jar.asm.ByteVector r0 = r3.annotation
            net.bytebuddy.jar.asm.SymbolTable r2 = r3.symbolTable
            int r4 = r2.addConstantUtf8(r4)
            r0.putShort(r4)
        L15:
            net.bytebuddy.jar.asm.ByteVector r4 = r3.annotation
            net.bytebuddy.jar.asm.SymbolTable r0 = r3.symbolTable
            int r5 = r0.addConstantUtf8(r5)
            r0 = 64
            net.bytebuddy.jar.asm.ByteVector r4 = r4.put12(r0, r5)
            r5 = 0
            r4.putShort(r5)
            net.bytebuddy.jar.asm.AnnotationWriter r4 = new net.bytebuddy.jar.asm.AnnotationWriter
            net.bytebuddy.jar.asm.SymbolTable r5 = r3.symbolTable
            net.bytebuddy.jar.asm.ByteVector r0 = r3.annotation
            r2 = 0
            r4.<init>(r5, r1, r0, r2)
            return r4
    }

    @Override // net.bytebuddy.jar.asm.AnnotationVisitor
    public net.bytebuddy.jar.asm.AnnotationVisitor visitArray(java.lang.String r5) {
            r4 = this;
            int r0 = r4.numElementValuePairs
            int r0 = r0 + 1
            r4.numElementValuePairs = r0
            boolean r0 = r4.useNamedValues
            if (r0 == 0) goto L15
            net.bytebuddy.jar.asm.ByteVector r0 = r4.annotation
            net.bytebuddy.jar.asm.SymbolTable r1 = r4.symbolTable
            int r5 = r1.addConstantUtf8(r5)
            r0.putShort(r5)
        L15:
            net.bytebuddy.jar.asm.ByteVector r5 = r4.annotation
            r0 = 91
            r1 = 0
            r5.put12(r0, r1)
            net.bytebuddy.jar.asm.AnnotationWriter r5 = new net.bytebuddy.jar.asm.AnnotationWriter
            net.bytebuddy.jar.asm.SymbolTable r0 = r4.symbolTable
            net.bytebuddy.jar.asm.ByteVector r2 = r4.annotation
            r3 = 0
            r5.<init>(r0, r1, r2, r3)
            return r5
    }

    @Override // net.bytebuddy.jar.asm.AnnotationVisitor
    public void visitEnd() {
            r4 = this;
            int r0 = r4.numElementValuePairsOffset
            r1 = -1
            if (r0 == r1) goto L15
            net.bytebuddy.jar.asm.ByteVector r1 = r4.annotation
            byte[] r1 = r1.data
            int r2 = r4.numElementValuePairs
            int r3 = r2 >>> 8
            byte r3 = (byte) r3
            r1[r0] = r3
            int r0 = r0 + 1
            byte r2 = (byte) r2
            r1[r0] = r2
        L15:
            return
    }

    @Override // net.bytebuddy.jar.asm.AnnotationVisitor
    public void visitEnum(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            int r0 = r2.numElementValuePairs
            int r0 = r0 + 1
            r2.numElementValuePairs = r0
            boolean r0 = r2.useNamedValues
            if (r0 == 0) goto L15
            net.bytebuddy.jar.asm.ByteVector r0 = r2.annotation
            net.bytebuddy.jar.asm.SymbolTable r1 = r2.symbolTable
            int r3 = r1.addConstantUtf8(r3)
            r0.putShort(r3)
        L15:
            net.bytebuddy.jar.asm.ByteVector r3 = r2.annotation
            net.bytebuddy.jar.asm.SymbolTable r0 = r2.symbolTable
            int r4 = r0.addConstantUtf8(r4)
            r0 = 101(0x65, float:1.42E-43)
            net.bytebuddy.jar.asm.ByteVector r3 = r3.put12(r0, r4)
            net.bytebuddy.jar.asm.SymbolTable r4 = r2.symbolTable
            int r4 = r4.addConstantUtf8(r5)
            r3.putShort(r4)
            return
    }
}
