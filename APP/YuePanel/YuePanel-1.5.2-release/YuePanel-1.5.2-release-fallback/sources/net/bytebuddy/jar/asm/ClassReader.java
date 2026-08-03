package net.bytebuddy.jar.asm;

/* JADX INFO: loaded from: classes2.dex */
public class ClassReader {
    static final int EXPAND_ASM_INSNS = 256;
    public static final int EXPAND_FRAMES = 8;
    private static final int INPUT_STREAM_DATA_CHUNK_SIZE = 4096;
    private static final int MAX_BUFFER_SIZE = 1048576;
    public static final int SKIP_CODE = 1;
    public static final int SKIP_DEBUG = 2;
    public static final int SKIP_FRAMES = 4;

    @java.lang.Deprecated
    public final byte[] b;
    private final int[] bootstrapMethodOffsets;
    final byte[] classFileBuffer;
    private final net.bytebuddy.jar.asm.ConstantDynamic[] constantDynamicValues;
    private final java.lang.String[] constantUtf8Values;
    private final int[] cpInfoOffsets;
    public final int header;
    private final int maxStringLength;

    public ClassReader(java.io.InputStream r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            byte[] r2 = readStream(r2, r0)
            r1.<init>(r2)
            return
    }

    public ClassReader(java.lang.String r4) throws java.io.IOException {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 46
            r2 = 47
            java.lang.String r4 = r4.replace(r1, r2)
            r0.append(r4)
            java.lang.String r4 = ".class"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.io.InputStream r4 = java.lang.ClassLoader.getSystemResourceAsStream(r4)
            r0 = 1
            byte[] r4 = readStream(r4, r0)
            r3.<init>(r4)
            return
    }

    public ClassReader(byte[] r3) {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            r2.<init>(r3, r1, r0)
            return
    }

    public ClassReader(byte[] r1, int r2, int r3) {
            r0 = this;
            r3 = 1
            r0.<init>(r1, r2, r3)
            return
    }

    public ClassReader(byte[] r11, int r12, boolean r13) {
            r10 = this;
            r10.<init>()
            r10.classFileBuffer = r11
            r10.b = r11
            if (r13 == 0) goto L2f
            int r13 = r12 + 6
            short r0 = r10.readShort(r13)
            r1 = 66
            if (r0 > r1) goto L14
            goto L2f
        L14:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Unsupported class file major version "
            r12.append(r0)
            short r13 = r10.readShort(r13)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L2f:
            int r13 = r12 + 8
            int r13 = r10.readUnsignedShort(r13)
            int[] r0 = new int[r13]
            r10.cpInfoOffsets = r0
            java.lang.String[] r0 = new java.lang.String[r13]
            r10.constantUtf8Values = r0
            int r12 = r12 + 10
            r0 = 0
            r1 = 1
            r2 = r0
            r3 = r2
            r4 = r1
        L44:
            if (r4 >= r13) goto L75
            int[] r5 = r10.cpInfoOffsets
            int r6 = r4 + 1
            int r7 = r12 + 1
            r5[r4] = r7
            r5 = r11[r12]
            r8 = 3
            r9 = 5
            switch(r5) {
                case 1: goto L6a;
                case 2: goto L55;
                case 3: goto L5c;
                case 4: goto L5c;
                case 5: goto L65;
                case 6: goto L65;
                case 7: goto L63;
                case 8: goto L63;
                case 9: goto L5c;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L5c;
                case 13: goto L55;
                case 14: goto L55;
                case 15: goto L62;
                case 16: goto L63;
                case 17: goto L5f;
                case 18: goto L5b;
                case 19: goto L63;
                case 20: goto L63;
                default: goto L55;
            }
        L55:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>()
            throw r11
        L5b:
            r3 = r1
        L5c:
            r4 = r6
            r8 = r9
            goto L73
        L5f:
            r2 = r1
            r3 = r2
            goto L5c
        L62:
            r8 = 4
        L63:
            r4 = r6
            goto L73
        L65:
            int r4 = r4 + 2
            r8 = 9
            goto L73
        L6a:
            int r4 = r10.readUnsignedShort(r7)
            int r8 = r8 + r4
            if (r8 <= r0) goto L63
            r4 = r6
            r0 = r8
        L73:
            int r12 = r12 + r8
            goto L44
        L75:
            r10.maxStringLength = r0
            r10.header = r12
            r11 = 0
            if (r2 == 0) goto L7f
            net.bytebuddy.jar.asm.ConstantDynamic[] r12 = new net.bytebuddy.jar.asm.ConstantDynamic[r13]
            goto L80
        L7f:
            r12 = r11
        L80:
            r10.constantDynamicValues = r12
            if (r3 == 0) goto L88
            int[] r11 = r10.readBootstrapMethodsAttribute(r0)
        L88:
            r10.bootstrapMethodOffsets = r11
            return
    }

    private static int computeBufferSize(java.io.InputStream r1) throws java.io.IOException {
            int r1 = r1.available()
            r0 = 256(0x100, float:3.59E-43)
            if (r1 >= r0) goto Lb
            r1 = 4096(0x1000, float:5.74E-42)
            return r1
        Lb:
            r0 = 1048576(0x100000, float:1.469368E-39)
            int r1 = java.lang.Math.min(r1, r0)
            return r1
    }

    private void computeImplicitFrame(net.bytebuddy.jar.asm.Context r11) {
            r10 = this;
            java.lang.String r0 = r11.currentMethodDescriptor
            java.lang.Object[] r1 = r11.currentFrameLocalTypes
            int r2 = r11.currentMethodAccessFlags
            r2 = r2 & 8
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L29
            java.lang.String r2 = "<init>"
            java.lang.String r5 = r11.currentMethodName
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L1c
            java.lang.Integer r2 = net.bytebuddy.jar.asm.Opcodes.UNINITIALIZED_THIS
            r1[r4] = r2
        L1a:
            r4 = r3
            goto L29
        L1c:
            int r2 = r10.header
            int r2 = r2 + 2
            char[] r5 = r11.charBuffer
            java.lang.String r2 = r10.readClass(r2, r5)
            r1[r4] = r2
            goto L1a
        L29:
            r2 = r3
        L2a:
            int r5 = r2 + 1
            char r6 = r0.charAt(r2)
            r7 = 70
            if (r6 == r7) goto La6
            r7 = 59
            r8 = 76
            if (r6 == r8) goto L8f
            r9 = 83
            if (r6 == r9) goto L88
            r9 = 73
            if (r6 == r9) goto L88
            r9 = 74
            if (r6 == r9) goto L81
            r9 = 90
            if (r6 == r9) goto L88
            r9 = 91
            if (r6 == r9) goto L5d
            switch(r6) {
                case 66: goto L88;
                case 67: goto L88;
                case 68: goto L54;
                default: goto L51;
            }
        L51:
            r11.currentFrameLocalCount = r4
            return
        L54:
            int r2 = r4 + 1
            java.lang.Integer r6 = net.bytebuddy.jar.asm.Opcodes.DOUBLE
            r1[r4] = r6
        L5a:
            r4 = r2
            r2 = r5
            goto L2a
        L5d:
            char r6 = r0.charAt(r5)
            if (r6 != r9) goto L66
            int r5 = r5 + 1
            goto L5d
        L66:
            char r6 = r0.charAt(r5)
            if (r6 != r8) goto L75
        L6c:
            int r5 = r5 + 1
            char r6 = r0.charAt(r5)
            if (r6 == r7) goto L75
            goto L6c
        L75:
            int r6 = r4 + 1
            int r5 = r5 + r3
            java.lang.String r2 = r0.substring(r2, r5)
            r1[r4] = r2
            r2 = r5
            r4 = r6
            goto L2a
        L81:
            int r2 = r4 + 1
            java.lang.Integer r6 = net.bytebuddy.jar.asm.Opcodes.LONG
            r1[r4] = r6
            goto L5a
        L88:
            int r2 = r4 + 1
            java.lang.Integer r6 = net.bytebuddy.jar.asm.Opcodes.INTEGER
            r1[r4] = r6
            goto L5a
        L8f:
            r2 = r5
        L90:
            char r6 = r0.charAt(r2)
            if (r6 == r7) goto L99
            int r2 = r2 + 1
            goto L90
        L99:
            int r6 = r4 + 1
            int r7 = r2 + 1
            java.lang.String r2 = r0.substring(r5, r2)
            r1[r4] = r2
            r4 = r6
            r2 = r7
            goto L2a
        La6:
            int r2 = r4 + 1
            java.lang.Integer r6 = net.bytebuddy.jar.asm.Opcodes.FLOAT
            r1[r4] = r6
            goto L5a
    }

    private void createDebugLabel(int r2, net.bytebuddy.jar.asm.Label[] r3) {
            r1 = this;
            r0 = r3[r2]
            if (r0 != 0) goto Lf
            net.bytebuddy.jar.asm.Label r2 = r1.readLabel(r2, r3)
            short r3 = r2.flags
            r3 = r3 | 1
            short r3 = (short) r3
            r2.flags = r3
        Lf:
            return
    }

    private net.bytebuddy.jar.asm.Label createLabel(int r1, net.bytebuddy.jar.asm.Label[] r2) {
            r0 = this;
            net.bytebuddy.jar.asm.Label r1 = r0.readLabel(r1, r2)
            short r2 = r1.flags
            r2 = r2 & (-2)
            short r2 = (short) r2
            r1.flags = r2
            return r1
    }

    private int getTypeAnnotationBytecodeOffset(int[] r3, int r4) {
            r2 = this;
            if (r3 == 0) goto L19
            int r0 = r3.length
            if (r4 >= r0) goto L19
            r0 = r3[r4]
            int r0 = r2.readByte(r0)
            r1 = 67
            if (r0 >= r1) goto L10
            goto L19
        L10:
            r3 = r3[r4]
            int r3 = r3 + 1
            int r3 = r2.readUnsignedShort(r3)
            return r3
        L19:
            r3 = -1
            return r3
    }

    private net.bytebuddy.jar.asm.Attribute readAttribute(net.bytebuddy.jar.asm.Attribute[] r12, java.lang.String r13, int r14, int r15, char[] r16, int r17, net.bytebuddy.jar.asm.Label[] r18) {
            r11 = this;
            r0 = r12
            r1 = r13
            int r2 = r0.length
            r3 = 0
        L4:
            if (r3 >= r2) goto L21
            r4 = r0[r3]
            java.lang.String r5 = r4.type
            boolean r5 = r5.equals(r13)
            if (r5 == 0) goto L1e
            r5 = r11
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            net.bytebuddy.jar.asm.Attribute r0 = r4.read(r5, r6, r7, r8, r9, r10)
            return r0
        L1e:
            int r3 = r3 + 1
            goto L4
        L21:
            net.bytebuddy.jar.asm.Attribute r4 = new net.bytebuddy.jar.asm.Attribute
            r4.<init>(r13)
            r9 = -1
            r10 = 0
            r8 = 0
            r5 = r11
            r6 = r14
            r7 = r15
            net.bytebuddy.jar.asm.Attribute r0 = r4.read(r5, r6, r7, r8, r9, r10)
            return r0
    }

    private int[] readBootstrapMethodsAttribute(int r7) {
            r6 = this;
            char[] r7 = new char[r7]
            int r0 = r6.getFirstAttributeOffset()
            int r1 = r0 + (-2)
            int r1 = r6.readUnsignedShort(r1)
        Lc:
            if (r1 <= 0) goto L43
            java.lang.String r2 = r6.readUTF8(r0, r7)
            int r3 = r0 + 2
            int r3 = r6.readInt(r3)
            int r4 = r0 + 6
            java.lang.String r5 = "BootstrapMethods"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L3e
            int r7 = r6.readUnsignedShort(r4)
            int[] r1 = new int[r7]
            int r0 = r0 + 8
            r2 = 0
        L2b:
            if (r2 >= r7) goto L3d
            r1[r2] = r0
            int r3 = r0 + 2
            int r3 = r6.readUnsignedShort(r3)
            int r3 = r3 * 2
            int r3 = r3 + 4
            int r0 = r0 + r3
            int r2 = r2 + 1
            goto L2b
        L3d:
            return r1
        L3e:
            int r0 = r4 + r3
            int r1 = r1 + (-1)
            goto Lc
        L43:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
    }

    private void readCode(net.bytebuddy.jar.asm.MethodVisitor r43, net.bytebuddy.jar.asm.Context r44, int r45) {
            r42 = this;
            r8 = r42
            r9 = r43
            r10 = r44
            r11 = r45
            byte[] r12 = r8.classFileBuffer
            char[] r13 = r10.charBuffer
            int r14 = r8.readUnsignedShort(r11)
            int r0 = r11 + 2
            int r15 = r8.readUnsignedShort(r0)
            int r0 = r11 + 4
            int r7 = r8.readInt(r0)
            int r16 = r11 + 8
            byte[] r0 = r8.classFileBuffer
            int r0 = r0.length
            int r0 = r0 - r16
            if (r7 > r0) goto La20
            int r6 = r16 + r7
            int r0 = r7 + 1
            net.bytebuddy.jar.asm.Label[] r5 = new net.bytebuddy.jar.asm.Label[r0]
            r10.currentMethodLabels = r5
            r0 = r16
        L2f:
            r4 = 132(0x84, float:1.85E-43)
            r2 = 8
            if (r0 >= r6) goto Le4
            int r1 = r0 - r16
            r3 = r12[r0]
            r3 = r3 & 255(0xff, float:3.57E-43)
            switch(r3) {
                case 0: goto Le0;
                case 1: goto Le0;
                case 2: goto Le0;
                case 3: goto Le0;
                case 4: goto Le0;
                case 5: goto Le0;
                case 6: goto Le0;
                case 7: goto Le0;
                case 8: goto Le0;
                case 9: goto Le0;
                case 10: goto Le0;
                case 11: goto Le0;
                case 12: goto Le0;
                case 13: goto Le0;
                case 14: goto Le0;
                case 15: goto Le0;
                case 16: goto Ldc;
                case 17: goto L4e;
                case 18: goto Ldc;
                case 19: goto L4e;
                case 20: goto L4e;
                case 21: goto Ldc;
                case 22: goto Ldc;
                case 23: goto Ldc;
                case 24: goto Ldc;
                case 25: goto Ldc;
                case 26: goto Le0;
                case 27: goto Le0;
                case 28: goto Le0;
                case 29: goto Le0;
                case 30: goto Le0;
                case 31: goto Le0;
                case 32: goto Le0;
                case 33: goto Le0;
                case 34: goto Le0;
                case 35: goto Le0;
                case 36: goto Le0;
                case 37: goto Le0;
                case 38: goto Le0;
                case 39: goto Le0;
                case 40: goto Le0;
                case 41: goto Le0;
                case 42: goto Le0;
                case 43: goto Le0;
                case 44: goto Le0;
                case 45: goto Le0;
                case 46: goto Le0;
                case 47: goto Le0;
                case 48: goto Le0;
                case 49: goto Le0;
                case 50: goto Le0;
                case 51: goto Le0;
                case 52: goto Le0;
                case 53: goto Le0;
                case 54: goto Ldc;
                case 55: goto Ldc;
                case 56: goto Ldc;
                case 57: goto Ldc;
                case 58: goto Ldc;
                case 59: goto Le0;
                case 60: goto Le0;
                case 61: goto Le0;
                case 62: goto Le0;
                case 63: goto Le0;
                case 64: goto Le0;
                case 65: goto Le0;
                case 66: goto Le0;
                case 67: goto Le0;
                case 68: goto Le0;
                case 69: goto Le0;
                case 70: goto Le0;
                case 71: goto Le0;
                case 72: goto Le0;
                case 73: goto Le0;
                case 74: goto Le0;
                case 75: goto Le0;
                case 76: goto Le0;
                case 77: goto Le0;
                case 78: goto Le0;
                case 79: goto Le0;
                case 80: goto Le0;
                case 81: goto Le0;
                case 82: goto Le0;
                case 83: goto Le0;
                case 84: goto Le0;
                case 85: goto Le0;
                case 86: goto Le0;
                case 87: goto Le0;
                case 88: goto Le0;
                case 89: goto Le0;
                case 90: goto Le0;
                case 91: goto Le0;
                case 92: goto Le0;
                case 93: goto Le0;
                case 94: goto Le0;
                case 95: goto Le0;
                case 96: goto Le0;
                case 97: goto Le0;
                case 98: goto Le0;
                case 99: goto Le0;
                case 100: goto Le0;
                case 101: goto Le0;
                case 102: goto Le0;
                case 103: goto Le0;
                case 104: goto Le0;
                case 105: goto Le0;
                case 106: goto Le0;
                case 107: goto Le0;
                case 108: goto Le0;
                case 109: goto Le0;
                case 110: goto Le0;
                case 111: goto Le0;
                case 112: goto Le0;
                case 113: goto Le0;
                case 114: goto Le0;
                case 115: goto Le0;
                case 116: goto Le0;
                case 117: goto Le0;
                case 118: goto Le0;
                case 119: goto Le0;
                case 120: goto Le0;
                case 121: goto Le0;
                case 122: goto Le0;
                case 123: goto Le0;
                case 124: goto Le0;
                case 125: goto Le0;
                case 126: goto Le0;
                case 127: goto Le0;
                case 128: goto Le0;
                case 129: goto Le0;
                case 130: goto Le0;
                case 131: goto Le0;
                case 132: goto L4e;
                case 133: goto Le0;
                case 134: goto Le0;
                case 135: goto Le0;
                case 136: goto Le0;
                case 137: goto Le0;
                case 138: goto Le0;
                case 139: goto Le0;
                case 140: goto Le0;
                case 141: goto Le0;
                case 142: goto Le0;
                case 143: goto Le0;
                case 144: goto Le0;
                case 145: goto Le0;
                case 146: goto Le0;
                case 147: goto Le0;
                case 148: goto Le0;
                case 149: goto Le0;
                case 150: goto Le0;
                case 151: goto Le0;
                case 152: goto Le0;
                case 153: goto Ld0;
                case 154: goto Ld0;
                case 155: goto Ld0;
                case 156: goto Ld0;
                case 157: goto Ld0;
                case 158: goto Ld0;
                case 159: goto Ld0;
                case 160: goto Ld0;
                case 161: goto Ld0;
                case 162: goto Ld0;
                case 163: goto Ld0;
                case 164: goto Ld0;
                case 165: goto Ld0;
                case 166: goto Ld0;
                case 167: goto Ld0;
                case 168: goto Ld0;
                case 169: goto Ldc;
                case 170: goto La2;
                case 171: goto L7c;
                case 172: goto Le0;
                case 173: goto Le0;
                case 174: goto Le0;
                case 175: goto Le0;
                case 176: goto Le0;
                case 177: goto Le0;
                case 178: goto L4e;
                case 179: goto L4e;
                case 180: goto L4e;
                case 181: goto L4e;
                case 182: goto L4e;
                case 183: goto L4e;
                case 184: goto L4e;
                case 185: goto L5b;
                case 186: goto L5b;
                case 187: goto L4e;
                case 188: goto Ldc;
                case 189: goto L4e;
                case 190: goto Le0;
                case 191: goto Le0;
                case 192: goto L4e;
                case 193: goto L4e;
                case 194: goto Le0;
                case 195: goto Le0;
                case 196: goto L61;
                case 197: goto L5e;
                case 198: goto Ld0;
                case 199: goto Ld0;
                case 200: goto L51;
                case 201: goto L51;
                case 202: goto L44;
                case 203: goto L44;
                case 204: goto L44;
                case 205: goto L44;
                case 206: goto L44;
                case 207: goto L44;
                case 208: goto L44;
                case 209: goto L44;
                case 210: goto L44;
                case 211: goto L44;
                case 212: goto L44;
                case 213: goto L44;
                case 214: goto L44;
                case 215: goto L44;
                case 216: goto L44;
                case 217: goto L44;
                case 218: goto L44;
                case 219: goto L44;
                case 220: goto L51;
                default: goto L3e;
            }
        L3e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L44:
            int r2 = r0 + 1
            int r2 = r8.readUnsignedShort(r2)
            int r1 = r1 + r2
            r8.createLabel(r1, r5)
        L4e:
            int r0 = r0 + 3
            goto L2f
        L51:
            int r2 = r0 + 1
            int r2 = r8.readInt(r2)
            int r1 = r1 + r2
            r8.createLabel(r1, r5)
        L5b:
            int r0 = r0 + 5
            goto L2f
        L5e:
            int r0 = r0 + 4
            goto L2f
        L61:
            int r1 = r0 + 1
            r1 = r12[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            if (r1 == r4) goto L79
            r2 = 169(0xa9, float:2.37E-43)
            if (r1 == r2) goto L5e
            switch(r1) {
                case 21: goto L5e;
                case 22: goto L5e;
                case 23: goto L5e;
                case 24: goto L5e;
                case 25: goto L5e;
                default: goto L70;
            }
        L70:
            switch(r1) {
                case 54: goto L5e;
                case 55: goto L5e;
                case 56: goto L5e;
                case 57: goto L5e;
                case 58: goto L5e;
                default: goto L73;
            }
        L73:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L79:
            int r0 = r0 + 6
            goto L2f
        L7c:
            r3 = r1 & 3
            int r3 = 4 - r3
            int r0 = r0 + r3
            int r3 = r8.readInt(r0)
            int r3 = r3 + r1
            r8.createLabel(r3, r5)
            int r3 = r0 + 4
            int r3 = r8.readInt(r3)
            int r0 = r0 + r2
        L90:
            int r2 = r3 + (-1)
            if (r3 <= 0) goto L2f
            int r3 = r0 + 4
            int r3 = r8.readInt(r3)
            int r3 = r3 + r1
            r8.createLabel(r3, r5)
            int r0 = r0 + 8
            r3 = r2
            goto L90
        La2:
            r2 = r1 & 3
            int r2 = 4 - r2
            int r0 = r0 + r2
            int r2 = r8.readInt(r0)
            int r2 = r2 + r1
            r8.createLabel(r2, r5)
            int r2 = r0 + 8
            int r2 = r8.readInt(r2)
            int r3 = r0 + 4
            int r3 = r8.readInt(r3)
            int r2 = r2 - r3
            r3 = 1
            int r2 = r2 + r3
            int r0 = r0 + 12
        Lc0:
            int r3 = r2 + (-1)
            if (r2 <= 0) goto L2f
            int r2 = r8.readInt(r0)
            int r2 = r2 + r1
            r8.createLabel(r2, r5)
            int r0 = r0 + 4
            r2 = r3
            goto Lc0
        Ld0:
            int r2 = r0 + 1
            short r2 = r8.readShort(r2)
            int r1 = r1 + r2
            r8.createLabel(r1, r5)
            goto L4e
        Ldc:
            int r0 = r0 + 2
            goto L2f
        Le0:
            int r0 = r0 + 1
            goto L2f
        Le4:
            int r1 = r8.readUnsignedShort(r0)
            int r0 = r0 + 2
        Lea:
            int r3 = r1 + (-1)
            if (r1 <= 0) goto L12a
            int r1 = r8.readUnsignedShort(r0)
            net.bytebuddy.jar.asm.Label r1 = r8.createLabel(r1, r5)
            int r2 = r0 + 2
            int r2 = r8.readUnsignedShort(r2)
            net.bytebuddy.jar.asm.Label r2 = r8.createLabel(r2, r5)
            int r4 = r0 + 4
            int r4 = r8.readUnsignedShort(r4)
            net.bytebuddy.jar.asm.Label r4 = r8.createLabel(r4, r5)
            r20 = r3
            int[] r3 = r8.cpInfoOffsets
            r21 = r6
            int r6 = r0 + 6
            int r6 = r8.readUnsignedShort(r6)
            r3 = r3[r6]
            java.lang.String r3 = r8.readUTF8(r3, r13)
            int r0 = r0 + 8
            r9.visitTryCatchBlock(r1, r2, r4, r3)
            r1 = r20
            r6 = r21
            r2 = 8
            r4 = 132(0x84, float:1.85E-43)
            goto Lea
        L12a:
            r21 = r6
            int r1 = r8.readUnsignedShort(r0)
            int r0 = r0 + 2
            r2 = 0
            r3 = 1
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
        L140:
            int r27 = r1 + (-1)
            if (r1 <= 0) goto L27a
            java.lang.String r1 = r8.readUTF8(r0, r13)
            int r6 = r0 + 2
            int r29 = r8.readInt(r6)
            int r6 = r0 + 6
            java.lang.String r4 = "LocalVariableTable"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L196
            int r1 = r10.parsingOptions
            r1 = r1 & 2
            if (r1 != 0) goto L191
            int r1 = r8.readUnsignedShort(r6)
            int r0 = r0 + 8
        L164:
            int r4 = r1 + (-1)
            if (r1 <= 0) goto L181
            int r1 = r8.readUnsignedShort(r0)
            r8.createDebugLabel(r1, r5)
            r31 = r2
            int r2 = r0 + 2
            int r2 = r8.readUnsignedShort(r2)
            int r1 = r1 + r2
            r8.createDebugLabel(r1, r5)
            int r0 = r0 + 10
            r1 = r4
            r2 = r31
            goto L164
        L181:
            r31 = r2
            r17 = r5
            r18 = r6
            r25 = r18
        L189:
            r36 = r7
            r35 = r21
        L18d:
            r11 = 8
            goto L26c
        L191:
            r31 = r2
        L193:
            r4 = 1
            goto L1fe
        L196:
            r31 = r2
            java.lang.String r2 = "LocalVariableTypeTable"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L1ad
            r17 = r5
            r18 = r6
            r26 = r18
        L1a6:
            r36 = r7
            r35 = r21
            r2 = r31
            goto L18d
        L1ad:
            java.lang.String r2 = "LineNumberTable"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L1db
            int r1 = r10.parsingOptions
            r1 = r1 & 2
            if (r1 != 0) goto L193
            int r1 = r8.readUnsignedShort(r6)
            int r0 = r0 + 8
        L1c1:
            int r2 = r1 + (-1)
            if (r1 <= 0) goto L193
            int r1 = r8.readUnsignedShort(r0)
            int r4 = r0 + 2
            int r4 = r8.readUnsignedShort(r4)
            int r0 = r0 + 4
            r8.createDebugLabel(r1, r5)
            r1 = r5[r1]
            r1.addLineNumber(r4)
            r1 = r2
            goto L1c1
        L1db:
            java.lang.String r2 = "RuntimeVisibleTypeAnnotations"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L1ee
            r4 = 1
            int[] r0 = r8.readTypeAnnotations(r9, r10, r6, r4)
            r2 = r0
            r17 = r5
            r18 = r6
            goto L189
        L1ee:
            r4 = 1
            java.lang.String r2 = "RuntimeInvisibleTypeAnnotations"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L203
            r2 = 0
            int[] r0 = r8.readTypeAnnotations(r9, r10, r6, r2)
            r22 = r0
        L1fe:
            r17 = r5
            r18 = r6
            goto L1a6
        L203:
            java.lang.String r2 = "StackMapTable"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L21a
            int r1 = r10.parsingOptions
            r1 = r1 & 4
            if (r1 != 0) goto L1fe
            int r0 = r0 + 8
            int r1 = r6 + r29
            r20 = r0
            r23 = r1
            goto L1fe
        L21a:
            java.lang.String r2 = "StackMap"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L23d
            int r1 = r10.parsingOptions
            r1 = r1 & 4
            if (r1 != 0) goto L1fe
            int r0 = r0 + 8
            int r1 = r6 + r29
            r20 = r0
            r23 = r1
            r17 = r5
            r18 = r6
            r36 = r7
            r35 = r21
            r2 = r31
            r3 = 0
            goto L18d
        L23d:
            net.bytebuddy.jar.asm.Attribute[] r2 = r10.attributePrototypes
            r0 = r42
            r17 = r1
            r1 = r2
            r32 = r31
            r11 = 8
            r18 = 0
            r2 = r17
            r33 = r3
            r3 = r6
            r4 = r29
            r17 = r5
            r5 = r13
            r18 = r6
            r35 = r21
            r6 = r45
            r36 = r7
            r7 = r17
            net.bytebuddy.jar.asm.Attribute r0 = r0.readAttribute(r1, r2, r3, r4, r5, r6, r7)
            r7 = r24
            r0.nextAttribute = r7
            r24 = r0
            r2 = r32
            r3 = r33
        L26c:
            int r0 = r18 + r29
            r11 = r45
            r5 = r17
            r1 = r27
            r21 = r35
            r7 = r36
            goto L140
        L27a:
            r32 = r2
            r33 = r3
            r17 = r5
            r36 = r7
            r35 = r21
            r7 = r24
            r11 = 8
            int r0 = r10.parsingOptions
            r0 = r0 & r11
            if (r0 == 0) goto L28f
            r6 = 1
            goto L290
        L28f:
            r6 = 0
        L290:
            r5 = -1
            if (r20 == 0) goto L2ea
            r10.currentFrameOffset = r5
            r4 = 0
            r10.currentFrameType = r4
            r10.currentFrameLocalCount = r4
            r10.currentFrameLocalCountDelta = r4
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r10.currentFrameLocalTypes = r0
            r10.currentFrameStackCount = r4
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r10.currentFrameStackTypes = r0
            if (r6 == 0) goto L2ab
            r8.computeImplicitFrame(r10)
        L2ab:
            r0 = r20
        L2ad:
            r3 = r23
            int r1 = r3 + (-2)
            if (r0 >= r1) goto L2e5
            r1 = r12[r0]
            if (r1 != r11) goto L2d6
            int r1 = r0 + 1
            int r1 = r8.readUnsignedShort(r1)
            if (r1 < 0) goto L2d6
            r2 = r36
            if (r1 >= r2) goto L2d3
            int r18 = r16 + r1
            r4 = r12[r18]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 187(0xbb, float:2.62E-43)
            if (r4 != r5) goto L2d3
            r5 = r17
            r8.createLabel(r1, r5)
            goto L2da
        L2d3:
            r5 = r17
            goto L2da
        L2d6:
            r5 = r17
            r2 = r36
        L2da:
            int r0 = r0 + 1
            r36 = r2
            r23 = r3
            r17 = r5
            r4 = 0
            r5 = -1
            goto L2ad
        L2e5:
            r5 = r17
        L2e7:
            r2 = r36
            goto L2ef
        L2ea:
            r5 = r17
            r3 = r23
            goto L2e7
        L2ef:
            if (r6 == 0) goto L312
            int r0 = r10.parsingOptions
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L312
            r4 = 0
            r17 = 0
            r1 = -1
            r18 = 0
            r0 = r43
            r19 = r2
            r2 = r15
            r11 = r3
            r3 = r18
            r18 = r7
            r7 = 0
            r37 = r5
            r5 = r17
            r0.visitFrame(r1, r2, r3, r4, r5)
        L30f:
            r5 = r32
            goto L31b
        L312:
            r19 = r2
            r11 = r3
            r37 = r5
            r18 = r7
            r7 = 0
            goto L30f
        L31b:
            int r0 = r8.getTypeAnnotationBytecodeOffset(r5, r7)
            r4 = r22
            int r1 = r8.getTypeAnnotationBytecodeOffset(r4, r7)
            int r2 = r10.parsingOptions
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L330
            r2 = 33
            r17 = r2
            goto L332
        L330:
            r17 = r7
        L332:
            r22 = r1
            r23 = r7
            r24 = r23
            r3 = r16
            r1 = r20
            r20 = r0
            r0 = r24
        L340:
            r2 = r35
            if (r3 >= r2) goto L8b8
            int r7 = r3 - r16
            r8.readBytecodeInstructionOffset(r7)
            r45 = r0
            r27 = r14
            r14 = r37
            r0 = r14[r7]
            r28 = r1
            if (r0 == 0) goto L361
            int r1 = r10.parsingOptions
            r1 = r1 & 2
            if (r1 != 0) goto L35d
            r1 = 1
            goto L35e
        L35d:
            r1 = 0
        L35e:
            r0.accept(r9, r1)
        L361:
            r0 = r45
            r1 = r28
        L365:
            if (r1 == 0) goto L406
            r45 = r1
            int r1 = r10.currentFrameOffset
            r28 = r15
            r15 = -1
            if (r1 == r7) goto L384
            if (r1 != r15) goto L373
            goto L384
        L373:
            r9 = r45
            r31 = r2
            r15 = r3
            r38 = r4
            r39 = r5
        L37c:
            r40 = r33
            r33 = r13
            r13 = r40
            goto L412
        L384:
            if (r1 == r15) goto L3d1
            r1 = r33
            if (r1 == 0) goto L38c
            if (r6 == 0) goto L399
        L38c:
            r9 = r45
            r31 = r2
            r15 = r3
            r38 = r4
            r39 = r5
            r33 = r13
            r13 = r1
            goto L3c1
        L399:
            int r0 = r10.currentFrameType
            int r15 = r10.currentFrameLocalCountDelta
            r29 = r3
            java.lang.Object[] r3 = r10.currentFrameLocalTypes
            r30 = r4
            int r4 = r10.currentFrameStackCount
            r32 = r5
            java.lang.Object[] r5 = r10.currentFrameStackTypes
            r31 = r0
            r0 = r43
            r9 = r45
            r33 = r13
            r13 = r1
            r1 = r31
            r31 = r2
            r2 = r15
            r15 = r29
            r38 = r30
            r39 = r32
            r0.visitFrame(r1, r2, r3, r4, r5)
            goto L3cf
        L3c1:
            int r2 = r10.currentFrameLocalCount
            java.lang.Object[] r3 = r10.currentFrameLocalTypes
            int r4 = r10.currentFrameStackCount
            java.lang.Object[] r5 = r10.currentFrameStackTypes
            r1 = -1
            r0 = r43
            r0.visitFrame(r1, r2, r3, r4, r5)
        L3cf:
            r0 = 0
            goto L3e0
        L3d1:
            r9 = r45
            r31 = r2
            r15 = r3
            r38 = r4
            r39 = r5
            r40 = r33
            r33 = r13
            r13 = r40
        L3e0:
            if (r9 >= r11) goto L3f9
            int r1 = r8.readStackMapFrame(r9, r13, r6, r10)
            r9 = r43
            r3 = r15
            r15 = r28
            r2 = r31
            r4 = r38
            r5 = r39
        L3f1:
            r40 = r33
            r33 = r13
            r13 = r40
            goto L365
        L3f9:
            r9 = r43
            r3 = r15
            r15 = r28
            r2 = r31
            r4 = r38
            r5 = r39
            r1 = 0
            goto L3f1
        L406:
            r9 = r1
            r31 = r2
            r38 = r4
            r39 = r5
            r28 = r15
            r15 = r3
            goto L37c
        L412:
            if (r0 == 0) goto L429
            int r0 = r10.parsingOptions
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto L426
            r4 = 0
            r5 = 0
            r1 = 256(0x100, float:3.59E-43)
            r2 = 0
            r3 = 0
            r0 = r43
            r0.visitFrame(r1, r2, r3, r4, r5)
        L426:
            r29 = 0
            goto L42b
        L429:
            r29 = r0
        L42b:
            r0 = r12[r15]
            r5 = r0 & 255(0xff, float:3.57E-43)
            r0 = 200(0xc8, float:2.8E-43)
            switch(r5) {
                case 0: goto L807;
                case 1: goto L807;
                case 2: goto L807;
                case 3: goto L807;
                case 4: goto L807;
                case 5: goto L807;
                case 6: goto L807;
                case 7: goto L807;
                case 8: goto L807;
                case 9: goto L807;
                case 10: goto L807;
                case 11: goto L807;
                case 12: goto L807;
                case 13: goto L807;
                case 14: goto L807;
                case 15: goto L807;
                case 16: goto L7ea;
                case 17: goto L7cb;
                case 18: goto L7aa;
                case 19: goto L788;
                case 20: goto L788;
                case 21: goto L767;
                case 22: goto L767;
                case 23: goto L767;
                case 24: goto L767;
                case 25: goto L767;
                case 26: goto L747;
                case 27: goto L747;
                case 28: goto L747;
                case 29: goto L747;
                case 30: goto L747;
                case 31: goto L747;
                case 32: goto L747;
                case 33: goto L747;
                case 34: goto L747;
                case 35: goto L747;
                case 36: goto L747;
                case 37: goto L747;
                case 38: goto L747;
                case 39: goto L747;
                case 40: goto L747;
                case 41: goto L747;
                case 42: goto L747;
                case 43: goto L747;
                case 44: goto L747;
                case 45: goto L747;
                case 46: goto L807;
                case 47: goto L807;
                case 48: goto L807;
                case 49: goto L807;
                case 50: goto L807;
                case 51: goto L807;
                case 52: goto L807;
                case 53: goto L807;
                case 54: goto L767;
                case 55: goto L767;
                case 56: goto L767;
                case 57: goto L767;
                case 58: goto L767;
                case 59: goto L724;
                case 60: goto L724;
                case 61: goto L724;
                case 62: goto L724;
                case 63: goto L724;
                case 64: goto L724;
                case 65: goto L724;
                case 66: goto L724;
                case 67: goto L724;
                case 68: goto L724;
                case 69: goto L724;
                case 70: goto L724;
                case 71: goto L724;
                case 72: goto L724;
                case 73: goto L724;
                case 74: goto L724;
                case 75: goto L724;
                case 76: goto L724;
                case 77: goto L724;
                case 78: goto L724;
                case 79: goto L807;
                case 80: goto L807;
                case 81: goto L807;
                case 82: goto L807;
                case 83: goto L807;
                case 84: goto L807;
                case 85: goto L807;
                case 86: goto L807;
                case 87: goto L807;
                case 88: goto L807;
                case 89: goto L807;
                case 90: goto L807;
                case 91: goto L807;
                case 92: goto L807;
                case 93: goto L807;
                case 94: goto L807;
                case 95: goto L807;
                case 96: goto L807;
                case 97: goto L807;
                case 98: goto L807;
                case 99: goto L807;
                case 100: goto L807;
                case 101: goto L807;
                case 102: goto L807;
                case 103: goto L807;
                case 104: goto L807;
                case 105: goto L807;
                case 106: goto L807;
                case 107: goto L807;
                case 108: goto L807;
                case 109: goto L807;
                case 110: goto L807;
                case 111: goto L807;
                case 112: goto L807;
                case 113: goto L807;
                case 114: goto L807;
                case 115: goto L807;
                case 116: goto L807;
                case 117: goto L807;
                case 118: goto L807;
                case 119: goto L807;
                case 120: goto L807;
                case 121: goto L807;
                case 122: goto L807;
                case 123: goto L807;
                case 124: goto L807;
                case 125: goto L807;
                case 126: goto L807;
                case 127: goto L807;
                case 128: goto L807;
                case 129: goto L807;
                case 130: goto L807;
                case 131: goto L807;
                case 132: goto L703;
                case 133: goto L807;
                case 134: goto L807;
                case 135: goto L807;
                case 136: goto L807;
                case 137: goto L807;
                case 138: goto L807;
                case 139: goto L807;
                case 140: goto L807;
                case 141: goto L807;
                case 142: goto L807;
                case 143: goto L807;
                case 144: goto L807;
                case 145: goto L807;
                case 146: goto L807;
                case 147: goto L807;
                case 148: goto L807;
                case 149: goto L807;
                case 150: goto L807;
                case 151: goto L807;
                case 152: goto L807;
                case 153: goto L6e0;
                case 154: goto L6e0;
                case 155: goto L6e0;
                case 156: goto L6e0;
                case 157: goto L6e0;
                case 158: goto L6e0;
                case 159: goto L6e0;
                case 160: goto L6e0;
                case 161: goto L6e0;
                case 162: goto L6e0;
                case 163: goto L6e0;
                case 164: goto L6e0;
                case 165: goto L6e0;
                case 166: goto L6e0;
                case 167: goto L6e0;
                case 168: goto L6e0;
                case 169: goto L767;
                case 170: goto L698;
                case 171: goto L647;
                case 172: goto L807;
                case 173: goto L807;
                case 174: goto L807;
                case 175: goto L807;
                case 176: goto L807;
                case 177: goto L807;
                case 178: goto L5dd;
                case 179: goto L5dd;
                case 180: goto L5dd;
                case 181: goto L5dd;
                case 182: goto L5dd;
                case 183: goto L5dd;
                case 184: goto L5dd;
                case 185: goto L5dd;
                case 186: goto L56e;
                case 187: goto L559;
                case 188: goto L7ea;
                case 189: goto L559;
                case 190: goto L807;
                case 191: goto L807;
                case 192: goto L559;
                case 193: goto L559;
                case 194: goto L807;
                case 195: goto L807;
                case 196: goto L517;
                case 197: goto L4e9;
                case 198: goto L6e0;
                case 199: goto L6e0;
                case 200: goto L4c3;
                case 201: goto L4c3;
                case 202: goto L464;
                case 203: goto L464;
                case 204: goto L464;
                case 205: goto L464;
                case 206: goto L464;
                case 207: goto L464;
                case 208: goto L464;
                case 209: goto L464;
                case 210: goto L464;
                case 211: goto L464;
                case 212: goto L464;
                case 213: goto L464;
                case 214: goto L464;
                case 215: goto L464;
                case 216: goto L464;
                case 217: goto L464;
                case 218: goto L464;
                case 219: goto L464;
                case 220: goto L43a;
                default: goto L434;
            }
        L434:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L43a:
            int r3 = r15 + 1
            int r1 = r8.readInt(r3)
            int r1 = r1 + r7
            r1 = r14[r1]
            r30 = r9
            r9 = r43
            r9.visitJumpInsn(r0, r1)
            int r3 = r15 + 5
            r45 = r6
            r32 = r11
            r1 = r20
            r4 = r23
            r11 = r39
            r0 = 1
            r2 = 8
            r10 = 1
        L45a:
            r34 = 132(0x84, float:1.85E-43)
            r40 = r33
            r33 = r13
            r13 = r40
            goto L820
        L464:
            r30 = r9
            r9 = r43
            r1 = 218(0xda, float:3.05E-43)
            if (r5 >= r1) goto L46f
            int r5 = r5 + (-49)
            goto L471
        L46f:
            int r5 = r5 + (-20)
        L471:
            int r3 = r15 + 1
            int r1 = r8.readUnsignedShort(r3)
            int r1 = r1 + r7
            r1 = r14[r1]
            r2 = 167(0xa7, float:2.34E-43)
            if (r5 == r2) goto L482
            r3 = 168(0xa8, float:2.35E-43)
            if (r5 != r3) goto L484
        L482:
            r4 = 1
            goto L49e
        L484:
            if (r5 >= r2) goto L48d
            int r5 = r5 + 1
            r4 = 1
            r2 = r5 ^ 1
            int r2 = r2 - r4
            goto L490
        L48d:
            r4 = 1
            r2 = r5 ^ 1
        L490:
            int r3 = r7 + 3
            net.bytebuddy.jar.asm.Label r3 = r8.createLabel(r3, r14)
            r9.visitJumpInsn(r2, r3)
            r9.visitJumpInsn(r0, r1)
            r3 = r4
            goto L4a5
        L49e:
            int r5 = r5 + 33
            r9.visitJumpInsn(r5, r1)
            r3 = r29
        L4a5:
            int r0 = r15 + 3
            r10 = r4
            r45 = r6
            r32 = r11
            r1 = r20
            r4 = r23
            r11 = r39
            r2 = 8
            r34 = 132(0x84, float:1.85E-43)
            r40 = r3
            r3 = r0
            r0 = r40
            r41 = r33
            r33 = r13
            r13 = r41
            goto L820
        L4c3:
            r30 = r9
            r4 = 1
            r9 = r43
            int r5 = r5 - r17
            int r3 = r15 + 1
            int r0 = r8.readInt(r3)
            int r0 = r0 + r7
            r0 = r14[r0]
            r9.visitJumpInsn(r5, r0)
            int r3 = r15 + 5
            r10 = r4
            r45 = r6
            r32 = r11
            r1 = r20
            r4 = r23
            r0 = r29
            r11 = r39
            r2 = 8
            goto L45a
        L4e9:
            r30 = r9
            r4 = 1
            r9 = r43
            int r3 = r15 + 1
            r2 = r33
            java.lang.String r0 = r8.readClass(r3, r2)
            int r3 = r15 + 3
            r1 = r12[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r9.visitMultiANewArrayInsn(r0, r1)
            int r3 = r15 + 4
            r10 = r4
            r45 = r6
            r32 = r11
            r33 = r13
            r1 = r20
            r4 = r23
            r0 = r29
            r11 = r39
        L510:
            r34 = 132(0x84, float:1.85E-43)
            r13 = r2
        L513:
            r2 = 8
            goto L820
        L517:
            r30 = r9
            r2 = r33
            r4 = 1
            r9 = r43
            int r3 = r15 + 1
            r0 = r12[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 132(0x84, float:1.85E-43)
            if (r0 != r3) goto L54d
            int r0 = r15 + 2
            int r0 = r8.readUnsignedShort(r0)
            int r1 = r15 + 4
            short r1 = r8.readShort(r1)
            r9.visitIincInsn(r0, r1)
            int r0 = r15 + 6
        L539:
            r34 = r3
            r10 = r4
            r45 = r6
            r32 = r11
            r33 = r13
            r1 = r20
            r4 = r23
            r11 = r39
            r3 = r0
            r13 = r2
            r0 = r29
            goto L513
        L54d:
            int r1 = r15 + 2
            int r1 = r8.readUnsignedShort(r1)
            r9.visitVarInsn(r0, r1)
            int r0 = r15 + 4
            goto L539
        L559:
            r30 = r9
            r2 = r33
            r3 = 132(0x84, float:1.85E-43)
            r4 = 1
            r9 = r43
            int r0 = r15 + 1
            java.lang.String r0 = r8.readClass(r0, r2)
            r9.visitTypeInsn(r5, r0)
            int r0 = r15 + 3
            goto L539
        L56e:
            r30 = r9
            r2 = r33
            r3 = 132(0x84, float:1.85E-43)
            r4 = 1
            r9 = r43
            int[] r0 = r8.cpInfoOffsets
            int r1 = r15 + 1
            int r1 = r8.readUnsignedShort(r1)
            r0 = r0[r1]
            int[] r1 = r8.cpInfoOffsets
            int r5 = r0 + 2
            int r5 = r8.readUnsignedShort(r5)
            r1 = r1[r5]
            java.lang.String r5 = r8.readUTF8(r1, r2)
            int r1 = r1 + 2
            java.lang.String r1 = r8.readUTF8(r1, r2)
            int[] r3 = r8.bootstrapMethodOffsets
            int r0 = r8.readUnsignedShort(r0)
            r0 = r3[r0]
            int r3 = r8.readUnsignedShort(r0)
            java.lang.Object r3 = r8.readConst(r3, r2)
            net.bytebuddy.jar.asm.Handle r3 = (net.bytebuddy.jar.asm.Handle) r3
            int r4 = r0 + 2
            int r4 = r8.readUnsignedShort(r4)
            r45 = r6
            java.lang.Object[] r6 = new java.lang.Object[r4]
            int r0 = r0 + 4
            r32 = r11
            r11 = 0
        L5b6:
            if (r11 >= r4) goto L5cb
            r33 = r4
            int r4 = r8.readUnsignedShort(r0)
            java.lang.Object r4 = r8.readConst(r4, r2)
            r6[r11] = r4
            int r0 = r0 + 2
            int r11 = r11 + 1
            r4 = r33
            goto L5b6
        L5cb:
            r9.visitInvokeDynamicInsn(r5, r1, r3, r6)
            int r3 = r15 + 5
            r33 = r13
            r1 = r20
            r4 = r23
            r0 = r29
            r11 = r39
            r10 = 1
            goto L510
        L5dd:
            r45 = r6
            r30 = r9
            r32 = r11
            r2 = r33
            r9 = r43
            int[] r0 = r8.cpInfoOffsets
            int r3 = r15 + 1
            int r1 = r8.readUnsignedShort(r3)
            r0 = r0[r1]
            int[] r1 = r8.cpInfoOffsets
            int r3 = r0 + 2
            int r3 = r8.readUnsignedShort(r3)
            r1 = r1[r3]
            java.lang.String r3 = r8.readClass(r0, r2)
            java.lang.String r4 = r8.readUTF8(r1, r2)
            int r1 = r1 + 2
            java.lang.String r6 = r8.readUTF8(r1, r2)
            r1 = 182(0xb6, float:2.55E-43)
            if (r5 >= r1) goto L618
            r9.visitFieldInsn(r5, r3, r4, r6)
            r6 = r5
            r33 = r13
            r10 = 1
            r34 = 132(0x84, float:1.85E-43)
            r13 = r2
            goto L634
        L618:
            int r0 = r0 + (-1)
            r0 = r12[r0]
            r1 = 11
            if (r0 != r1) goto L622
            r11 = 1
            goto L623
        L622:
            r11 = 0
        L623:
            r0 = r43
            r1 = r5
            r33 = r13
            r13 = r2
            r2 = r3
            r34 = 132(0x84, float:1.85E-43)
            r3 = r4
            r10 = 1
            r4 = r6
            r6 = r5
            r5 = r11
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
        L634:
            r0 = 185(0xb9, float:2.59E-43)
            if (r6 != r0) goto L644
            int r3 = r15 + 5
        L63a:
            r1 = r20
            r4 = r23
            r0 = r29
            r11 = r39
            goto L513
        L644:
            int r3 = r15 + 3
            goto L63a
        L647:
            r45 = r6
            r30 = r9
            r32 = r11
            r10 = 1
            r34 = 132(0x84, float:1.85E-43)
            r9 = r43
            r40 = r33
            r33 = r13
            r13 = r40
            r0 = r7 & 3
            int r0 = 4 - r0
            int r3 = r15 + r0
            int r0 = r8.readInt(r3)
            int r0 = r0 + r7
            r0 = r14[r0]
            int r1 = r3 + 4
            int r1 = r8.readInt(r1)
            r2 = 8
            int r3 = r3 + r2
            int[] r4 = new int[r1]
            net.bytebuddy.jar.asm.Label[] r5 = new net.bytebuddy.jar.asm.Label[r1]
            r6 = 0
        L673:
            if (r6 >= r1) goto L68b
            int r11 = r8.readInt(r3)
            r4[r6] = r11
            int r11 = r3 + 4
            int r11 = r8.readInt(r11)
            int r11 = r11 + r7
            r11 = r14[r11]
            r5[r6] = r11
            int r3 = r3 + 8
            int r6 = r6 + 1
            goto L673
        L68b:
            r9.visitLookupSwitchInsn(r0, r4, r5)
        L68e:
            r1 = r20
            r4 = r23
            r0 = r29
            r11 = r39
            goto L820
        L698:
            r45 = r6
            r30 = r9
            r32 = r11
            r2 = 8
            r10 = 1
            r34 = 132(0x84, float:1.85E-43)
            r9 = r43
            r40 = r33
            r33 = r13
            r13 = r40
            r0 = r7 & 3
            int r0 = 4 - r0
            int r3 = r15 + r0
            int r0 = r8.readInt(r3)
            int r0 = r0 + r7
            r0 = r14[r0]
            int r1 = r3 + 4
            int r1 = r8.readInt(r1)
            int r4 = r3 + 8
            int r4 = r8.readInt(r4)
            int r3 = r3 + 12
            int r5 = r4 - r1
            int r5 = r5 + r10
            net.bytebuddy.jar.asm.Label[] r6 = new net.bytebuddy.jar.asm.Label[r5]
            r11 = 0
        L6cc:
            if (r11 >= r5) goto L6dc
            int r15 = r8.readInt(r3)
            int r15 = r15 + r7
            r15 = r14[r15]
            r6[r11] = r15
            int r3 = r3 + 4
            int r11 = r11 + 1
            goto L6cc
        L6dc:
            r9.visitTableSwitchInsn(r1, r4, r0, r6)
            goto L68e
        L6e0:
            r45 = r6
            r30 = r9
            r32 = r11
            r2 = 8
            r10 = 1
            r34 = 132(0x84, float:1.85E-43)
            r9 = r43
            r6 = r5
            r40 = r33
            r33 = r13
            r13 = r40
            int r3 = r15 + 1
            short r0 = r8.readShort(r3)
            int r0 = r0 + r7
            r0 = r14[r0]
            r9.visitJumpInsn(r6, r0)
        L700:
            int r3 = r15 + 3
            goto L68e
        L703:
            r45 = r6
            r30 = r9
            r32 = r11
            r2 = 8
            r10 = 1
            r34 = 132(0x84, float:1.85E-43)
            r9 = r43
            r40 = r33
            r33 = r13
            r13 = r40
            int r3 = r15 + 1
            r0 = r12[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r15 + 2
            r1 = r12[r3]
            r9.visitIincInsn(r0, r1)
            goto L700
        L724:
            r45 = r6
            r30 = r9
            r32 = r11
            r2 = 8
            r10 = 1
            r34 = 132(0x84, float:1.85E-43)
            r9 = r43
            r6 = r5
            r40 = r33
            r33 = r13
            r13 = r40
            int r5 = r6 + (-59)
            int r0 = r5 >> 2
            int r0 = r0 + 54
            r1 = r5 & 3
            r9.visitVarInsn(r0, r1)
        L743:
            int r3 = r15 + 1
            goto L68e
        L747:
            r45 = r6
            r30 = r9
            r32 = r11
            r2 = 8
            r10 = 1
            r34 = 132(0x84, float:1.85E-43)
            r9 = r43
            r6 = r5
            r40 = r33
            r33 = r13
            r13 = r40
            int r5 = r6 + (-26)
            int r0 = r5 >> 2
            int r0 = r0 + 21
            r1 = r5 & 3
            r9.visitVarInsn(r0, r1)
            goto L743
        L767:
            r45 = r6
            r30 = r9
            r32 = r11
            r2 = 8
            r10 = 1
            r34 = 132(0x84, float:1.85E-43)
            r9 = r43
            r6 = r5
            r40 = r33
            r33 = r13
            r13 = r40
            int r3 = r15 + 1
            r0 = r12[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r9.visitVarInsn(r6, r0)
        L784:
            int r3 = r15 + 2
            goto L68e
        L788:
            r45 = r6
            r30 = r9
            r32 = r11
            r2 = 8
            r10 = 1
            r34 = 132(0x84, float:1.85E-43)
            r9 = r43
            r40 = r33
            r33 = r13
            r13 = r40
            int r3 = r15 + 1
            int r0 = r8.readUnsignedShort(r3)
            java.lang.Object r0 = r8.readConst(r0, r13)
            r9.visitLdcInsn(r0)
            goto L700
        L7aa:
            r45 = r6
            r30 = r9
            r32 = r11
            r2 = 8
            r10 = 1
            r34 = 132(0x84, float:1.85E-43)
            r9 = r43
            r40 = r33
            r33 = r13
            r13 = r40
            int r3 = r15 + 1
            r0 = r12[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.Object r0 = r8.readConst(r0, r13)
            r9.visitLdcInsn(r0)
            goto L784
        L7cb:
            r45 = r6
            r30 = r9
            r32 = r11
            r2 = 8
            r10 = 1
            r34 = 132(0x84, float:1.85E-43)
            r9 = r43
            r6 = r5
            r40 = r33
            r33 = r13
            r13 = r40
            int r3 = r15 + 1
            short r0 = r8.readShort(r3)
            r9.visitIntInsn(r6, r0)
            goto L700
        L7ea:
            r45 = r6
            r30 = r9
            r32 = r11
            r2 = 8
            r10 = 1
            r34 = 132(0x84, float:1.85E-43)
            r9 = r43
            r6 = r5
            r40 = r33
            r33 = r13
            r13 = r40
            int r3 = r15 + 1
            r0 = r12[r3]
            r9.visitIntInsn(r6, r0)
            goto L784
        L807:
            r45 = r6
            r30 = r9
            r32 = r11
            r2 = 8
            r10 = 1
            r34 = 132(0x84, float:1.85E-43)
            r9 = r43
            r6 = r5
            r40 = r33
            r33 = r13
            r13 = r40
            r9.visitInsn(r6)
            goto L743
        L820:
            if (r11 == 0) goto L850
            int r5 = r11.length
            if (r4 >= r5) goto L850
            if (r1 > r7) goto L850
            if (r1 != r7) goto L844
            r1 = r11[r4]
            r15 = r10
            r10 = r44
            int r1 = r8.readTypeAnnotationTarget(r10, r1)
            java.lang.String r5 = r8.readUTF8(r1, r13)
            int r1 = r1 + 2
            int r6 = r10.currentTypeAnnotationTarget
            net.bytebuddy.jar.asm.TypePath r2 = r10.currentTypeAnnotationTargetPath
            net.bytebuddy.jar.asm.AnnotationVisitor r2 = r9.visitInsnAnnotation(r6, r2, r5, r15)
            r8.readElementValues(r2, r1, r15, r13)
            goto L847
        L844:
            r15 = r10
            r10 = r44
        L847:
            int r4 = r4 + 1
            int r1 = r8.getTypeAnnotationBytecodeOffset(r11, r4)
            r10 = r15
            goto L513
        L850:
            r15 = r10
            r10 = r44
            r2 = r22
            r5 = r24
            r6 = r38
        L859:
            if (r6 == 0) goto L897
            int r15 = r6.length
            if (r5 >= r15) goto L897
            if (r2 > r7) goto L897
            if (r2 != r7) goto L882
            r2 = r6[r5]
            int r2 = r8.readTypeAnnotationTarget(r10, r2)
            java.lang.String r15 = r8.readUTF8(r2, r13)
            int r2 = r2 + 2
            r20 = r0
            int r0 = r10.currentTypeAnnotationTarget
            r22 = r1
            net.bytebuddy.jar.asm.TypePath r1 = r10.currentTypeAnnotationTargetPath
            r23 = r7
            r7 = 0
            net.bytebuddy.jar.asm.AnnotationVisitor r0 = r9.visitInsnAnnotation(r0, r1, r15, r7)
            r1 = 1
            r8.readElementValues(r0, r2, r1, r13)
            goto L889
        L882:
            r20 = r0
            r22 = r1
            r23 = r7
            r7 = 0
        L889:
            int r5 = r5 + 1
            int r2 = r8.getTypeAnnotationBytecodeOffset(r6, r5)
            r0 = r20
            r1 = r22
            r7 = r23
            r15 = 1
            goto L859
        L897:
            r20 = r0
            r22 = r1
            r7 = 0
            r23 = r4
            r24 = r5
            r4 = r6
            r5 = r11
            r37 = r14
            r0 = r20
            r20 = r22
            r14 = r27
            r15 = r28
            r1 = r30
            r35 = r31
            r11 = r32
            r6 = r45
            r22 = r2
            goto L340
        L8b8:
            r6 = r4
            r11 = r5
            r27 = r14
            r28 = r15
            r14 = r37
            r0 = r14[r19]
            if (r0 == 0) goto L8c7
            r9.visitLabel(r0)
        L8c7:
            r4 = r25
            if (r4 == 0) goto L967
            int r0 = r10.parsingOptions
            r0 = r0 & 2
            if (r0 != 0) goto L967
            r0 = r26
            if (r0 == 0) goto L900
            int r1 = r8.readUnsignedShort(r0)
            int r1 = r1 * 3
            int[] r2 = new int[r1]
            int r26 = r0 + 2
            r0 = r26
        L8e1:
            if (r1 <= 0) goto L8fe
            int r3 = r1 + (-1)
            int r5 = r0 + 6
            r2[r3] = r5
            int r3 = r1 + (-2)
            int r5 = r0 + 8
            int r5 = r8.readUnsignedShort(r5)
            r2[r3] = r5
            int r1 = r1 + (-3)
            int r3 = r8.readUnsignedShort(r0)
            r2[r1] = r3
            int r0 = r0 + 10
            goto L8e1
        L8fe:
            r12 = r2
            goto L901
        L900:
            r12 = 0
        L901:
            int r0 = r8.readUnsignedShort(r4)
            int r25 = r4 + 2
            r1 = r25
        L909:
            int r15 = r0 + (-1)
            if (r0 <= 0) goto L967
            int r0 = r8.readUnsignedShort(r1)
            int r2 = r1 + 2
            int r2 = r8.readUnsignedShort(r2)
            int r3 = r1 + 4
            java.lang.String r3 = r8.readUTF8(r3, r13)
            int r4 = r1 + 6
            java.lang.String r4 = r8.readUTF8(r4, r13)
            int r5 = r1 + 8
            int r5 = r8.readUnsignedShort(r5)
            int r16 = r1 + 10
            if (r12 == 0) goto L948
            r1 = r7
        L92e:
            int r7 = r12.length
            if (r1 >= r7) goto L948
            r7 = r12[r1]
            if (r7 != r0) goto L945
            int r7 = r1 + 1
            r7 = r12[r7]
            if (r7 != r5) goto L945
            int r1 = r1 + 2
            r1 = r12[r1]
            java.lang.String r1 = r8.readUTF8(r1, r13)
            r7 = r1
            goto L949
        L945:
            int r1 = r1 + 3
            goto L92e
        L948:
            r7 = 0
        L949:
            r17 = r14[r0]
            int r0 = r0 + r2
            r19 = r14[r0]
            r0 = r43
            r1 = r3
            r2 = r4
            r3 = r7
            r4 = r17
            r7 = r5
            r5 = r19
            r45 = r12
            r12 = r6
            r6 = r7
            r0.visitLocalVariable(r1, r2, r3, r4, r5, r6)
            r6 = r12
            r0 = r15
            r1 = r16
            r7 = 0
            r12 = r45
            goto L909
        L967:
            r12 = r6
            r14 = 65
            r15 = 64
            if (r11 == 0) goto L9c0
            int r7 = r11.length
            r6 = 0
        L970:
            if (r6 >= r7) goto L9c0
            r0 = r11[r6]
            int r1 = r8.readByte(r0)
            if (r1 == r15) goto L986
            if (r1 != r14) goto L97d
            goto L986
        L97d:
            r19 = r6
            r24 = r18
            r16 = 0
            r18 = r7
            goto L9b7
        L986:
            int r0 = r8.readTypeAnnotationTarget(r10, r0)
            java.lang.String r16 = r8.readUTF8(r0, r13)
            int r5 = r0 + 2
            int r1 = r10.currentTypeAnnotationTarget
            net.bytebuddy.jar.asm.TypePath r2 = r10.currentTypeAnnotationTargetPath
            net.bytebuddy.jar.asm.Label[] r3 = r10.currentLocalVariableAnnotationRangeStarts
            net.bytebuddy.jar.asm.Label[] r4 = r10.currentLocalVariableAnnotationRangeEnds
            int[] r0 = r10.currentLocalVariableAnnotationRangeIndices
            r17 = 1
            r19 = r0
            r0 = r43
            r14 = r5
            r5 = r19
            r19 = r6
            r6 = r16
            r24 = r18
            r16 = 0
            r18 = r7
            r7 = r17
            net.bytebuddy.jar.asm.AnnotationVisitor r0 = r0.visitLocalVariableAnnotation(r1, r2, r3, r4, r5, r6, r7)
            r1 = 1
            r8.readElementValues(r0, r14, r1, r13)
        L9b7:
            int r6 = r19 + 1
            r7 = r18
            r18 = r24
            r14 = 65
            goto L970
        L9c0:
            r24 = r18
            r16 = 0
            if (r12 == 0) goto La0a
            int r11 = r12.length
            r14 = r16
        L9c9:
            if (r14 >= r11) goto La0a
            r0 = r12[r14]
            int r1 = r8.readByte(r0)
            r7 = 65
            if (r1 == r15) goto L9dc
            if (r1 != r7) goto L9d8
            goto L9dc
        L9d8:
            r17 = r7
            r1 = 1
            goto La05
        L9dc:
            int r0 = r8.readTypeAnnotationTarget(r10, r0)
            java.lang.String r6 = r8.readUTF8(r0, r13)
            int r5 = r0 + 2
            int r1 = r10.currentTypeAnnotationTarget
            net.bytebuddy.jar.asm.TypePath r2 = r10.currentTypeAnnotationTargetPath
            net.bytebuddy.jar.asm.Label[] r3 = r10.currentLocalVariableAnnotationRangeStarts
            net.bytebuddy.jar.asm.Label[] r4 = r10.currentLocalVariableAnnotationRangeEnds
            int[] r0 = r10.currentLocalVariableAnnotationRangeIndices
            r16 = 0
            r17 = r0
            r0 = r43
            r15 = r5
            r5 = r17
            r17 = r7
            r7 = r16
            net.bytebuddy.jar.asm.AnnotationVisitor r0 = r0.visitLocalVariableAnnotation(r1, r2, r3, r4, r5, r6, r7)
            r1 = 1
            r8.readElementValues(r0, r15, r1, r13)
        La05:
            int r14 = r14 + 1
            r15 = 64
            goto L9c9
        La0a:
            r0 = r24
        La0c:
            if (r0 == 0) goto La18
            net.bytebuddy.jar.asm.Attribute r1 = r0.nextAttribute
            r2 = 0
            r0.nextAttribute = r2
            r9.visitAttribute(r0)
            r0 = r1
            goto La0c
        La18:
            r0 = r27
            r1 = r28
            r9.visitMaxs(r0, r1)
            return
        La20:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    private net.bytebuddy.jar.asm.ConstantDynamic readConstantDynamic(int r9, char[] r10) {
            r8 = this;
            net.bytebuddy.jar.asm.ConstantDynamic[] r0 = r8.constantDynamicValues
            r0 = r0[r9]
            if (r0 == 0) goto L7
            return r0
        L7:
            int[] r0 = r8.cpInfoOffsets
            r1 = r0[r9]
            int r2 = r1 + 2
            int r2 = r8.readUnsignedShort(r2)
            r0 = r0[r2]
            java.lang.String r2 = r8.readUTF8(r0, r10)
            int r0 = r0 + 2
            java.lang.String r0 = r8.readUTF8(r0, r10)
            int[] r3 = r8.bootstrapMethodOffsets
            int r1 = r8.readUnsignedShort(r1)
            r1 = r3[r1]
            int r3 = r8.readUnsignedShort(r1)
            java.lang.Object r3 = r8.readConst(r3, r10)
            net.bytebuddy.jar.asm.Handle r3 = (net.bytebuddy.jar.asm.Handle) r3
            int r4 = r1 + 2
            int r4 = r8.readUnsignedShort(r4)
            java.lang.Object[] r5 = new java.lang.Object[r4]
            int r1 = r1 + 4
            r6 = 0
        L3a:
            if (r6 >= r4) goto L4b
            int r7 = r8.readUnsignedShort(r1)
            java.lang.Object r7 = r8.readConst(r7, r10)
            r5[r6] = r7
            int r1 = r1 + 2
            int r6 = r6 + 1
            goto L3a
        L4b:
            net.bytebuddy.jar.asm.ConstantDynamic[] r10 = r8.constantDynamicValues
            net.bytebuddy.jar.asm.ConstantDynamic r1 = new net.bytebuddy.jar.asm.ConstantDynamic
            r1.<init>(r2, r0, r3, r5)
            r10[r9] = r1
            return r1
    }

    private int readElementValue(net.bytebuddy.jar.asm.AnnotationVisitor r11, int r12, java.lang.String r13, char[] r14) {
            r10 = this;
            r0 = 101(0x65, float:1.42E-43)
            r1 = 91
            r2 = 64
            r3 = 0
            r4 = 1
            if (r11 != 0) goto L2a
            byte[] r11 = r10.classFileBuffer
            r11 = r11[r12]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r13 = 0
            if (r11 == r2) goto L23
            if (r11 == r1) goto L1d
            if (r11 == r0) goto L1a
            int r12 = r12 + 3
            return r12
        L1a:
            int r12 = r12 + 5
            return r12
        L1d:
            int r12 = r12 + r4
            int r11 = r10.readElementValues(r13, r12, r3, r14)
            return r11
        L23:
            int r12 = r12 + 3
            int r11 = r10.readElementValues(r13, r12, r4, r14)
            return r11
        L2a:
            byte[] r5 = r10.classFileBuffer
            int r6 = r12 + 1
            r5 = r5[r12]
            r5 = r5 & 255(0xff, float:3.57E-43)
            if (r5 == r2) goto L219
            r2 = 70
            if (r5 == r2) goto L20c
            r7 = 83
            if (r5 == r7) goto L1f6
            r8 = 99
            if (r5 == r8) goto L1e9
            if (r5 == r0) goto L1d9
            r0 = 115(0x73, float:1.61E-43)
            if (r5 == r0) goto L1d0
            r0 = 73
            if (r5 == r0) goto L20c
            r8 = 74
            if (r5 == r8) goto L20c
            r9 = 90
            if (r5 == r9) goto L1b8
            if (r5 == r1) goto L8a
            switch(r5) {
                case 66: goto L75;
                case 67: goto L5d;
                case 68: goto L20c;
                default: goto L57;
            }
        L57:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>()
            throw r11
        L5d:
            int[] r14 = r10.cpInfoOffsets
            int r0 = r10.readUnsignedShort(r6)
            r14 = r14[r0]
            int r14 = r10.readInt(r14)
            char r14 = (char) r14
            java.lang.Character r14 = java.lang.Character.valueOf(r14)
            r11.visit(r13, r14)
        L71:
            int r12 = r12 + 3
            goto L227
        L75:
            int[] r14 = r10.cpInfoOffsets
            int r0 = r10.readUnsignedShort(r6)
            r14 = r14[r0]
            int r14 = r10.readInt(r14)
            byte r14 = (byte) r14
            java.lang.Byte r14 = java.lang.Byte.valueOf(r14)
            r11.visit(r13, r14)
            goto L71
        L8a:
            int r1 = r10.readUnsignedShort(r6)
            int r5 = r12 + 3
            if (r1 != 0) goto L9c
            net.bytebuddy.jar.asm.AnnotationVisitor r11 = r11.visitArray(r13)
            int r12 = r12 + r4
            int r11 = r10.readElementValues(r11, r12, r3, r14)
            return r11
        L9c:
            byte[] r6 = r10.classFileBuffer
            r6 = r6[r5]
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r6 == r2) goto L196
            if (r6 == r7) goto L177
            if (r6 == r9) goto L153
            if (r6 == r0) goto L136
            if (r6 == r8) goto L119
            switch(r6) {
                case 66: goto Lfb;
                case 67: goto Ldd;
                case 68: goto Lba;
                default: goto Laf;
            }
        Laf:
            net.bytebuddy.jar.asm.AnnotationVisitor r11 = r11.visitArray(r13)
            int r12 = r12 + r4
            int r12 = r10.readElementValues(r11, r12, r3, r14)
            goto L227
        Lba:
            double[] r12 = new double[r1]
        Lbc:
            if (r3 >= r1) goto Ld7
            int[] r14 = r10.cpInfoOffsets
            int r0 = r5 + 1
            int r0 = r10.readUnsignedShort(r0)
            r14 = r14[r0]
            long r6 = r10.readLong(r14)
            double r6 = java.lang.Double.longBitsToDouble(r6)
            r12[r3] = r6
            int r5 = r5 + 3
            int r3 = r3 + 1
            goto Lbc
        Ld7:
            r11.visit(r13, r12)
        Lda:
            r12 = r5
            goto L227
        Ldd:
            char[] r12 = new char[r1]
        Ldf:
            if (r3 >= r1) goto Lf7
            int[] r14 = r10.cpInfoOffsets
            int r0 = r5 + 1
            int r0 = r10.readUnsignedShort(r0)
            r14 = r14[r0]
            int r14 = r10.readInt(r14)
            char r14 = (char) r14
            r12[r3] = r14
            int r5 = r5 + 3
            int r3 = r3 + 1
            goto Ldf
        Lf7:
            r11.visit(r13, r12)
            goto Lda
        Lfb:
            byte[] r12 = new byte[r1]
        Lfd:
            if (r3 >= r1) goto L115
            int[] r14 = r10.cpInfoOffsets
            int r0 = r5 + 1
            int r0 = r10.readUnsignedShort(r0)
            r14 = r14[r0]
            int r14 = r10.readInt(r14)
            byte r14 = (byte) r14
            r12[r3] = r14
            int r5 = r5 + 3
            int r3 = r3 + 1
            goto Lfd
        L115:
            r11.visit(r13, r12)
            goto Lda
        L119:
            long[] r12 = new long[r1]
        L11b:
            if (r3 >= r1) goto L132
            int[] r14 = r10.cpInfoOffsets
            int r0 = r5 + 1
            int r0 = r10.readUnsignedShort(r0)
            r14 = r14[r0]
            long r6 = r10.readLong(r14)
            r12[r3] = r6
            int r5 = r5 + 3
            int r3 = r3 + 1
            goto L11b
        L132:
            r11.visit(r13, r12)
            goto Lda
        L136:
            int[] r12 = new int[r1]
        L138:
            if (r3 >= r1) goto L14f
            int[] r14 = r10.cpInfoOffsets
            int r0 = r5 + 1
            int r0 = r10.readUnsignedShort(r0)
            r14 = r14[r0]
            int r14 = r10.readInt(r14)
            r12[r3] = r14
            int r5 = r5 + 3
            int r3 = r3 + 1
            goto L138
        L14f:
            r11.visit(r13, r12)
            goto Lda
        L153:
            boolean[] r12 = new boolean[r1]
            r14 = r3
        L156:
            if (r14 >= r1) goto L172
            int[] r0 = r10.cpInfoOffsets
            int r2 = r5 + 1
            int r2 = r10.readUnsignedShort(r2)
            r0 = r0[r2]
            int r0 = r10.readInt(r0)
            if (r0 == 0) goto L16a
            r0 = r4
            goto L16b
        L16a:
            r0 = r3
        L16b:
            r12[r14] = r0
            int r5 = r5 + 3
            int r14 = r14 + 1
            goto L156
        L172:
            r11.visit(r13, r12)
            goto Lda
        L177:
            short[] r12 = new short[r1]
        L179:
            if (r3 >= r1) goto L191
            int[] r14 = r10.cpInfoOffsets
            int r0 = r5 + 1
            int r0 = r10.readUnsignedShort(r0)
            r14 = r14[r0]
            int r14 = r10.readInt(r14)
            short r14 = (short) r14
            r12[r3] = r14
            int r5 = r5 + 3
            int r3 = r3 + 1
            goto L179
        L191:
            r11.visit(r13, r12)
            goto Lda
        L196:
            float[] r12 = new float[r1]
        L198:
            if (r3 >= r1) goto L1b3
            int[] r14 = r10.cpInfoOffsets
            int r0 = r5 + 1
            int r0 = r10.readUnsignedShort(r0)
            r14 = r14[r0]
            int r14 = r10.readInt(r14)
            float r14 = java.lang.Float.intBitsToFloat(r14)
            r12[r3] = r14
            int r5 = r5 + 3
            int r3 = r3 + 1
            goto L198
        L1b3:
            r11.visit(r13, r12)
            goto Lda
        L1b8:
            int[] r14 = r10.cpInfoOffsets
            int r0 = r10.readUnsignedShort(r6)
            r14 = r14[r0]
            int r14 = r10.readInt(r14)
            if (r14 != 0) goto L1c9
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            goto L1cb
        L1c9:
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
        L1cb:
            r11.visit(r13, r14)
            goto L71
        L1d0:
            java.lang.String r14 = r10.readUTF8(r6, r14)
            r11.visit(r13, r14)
            goto L71
        L1d9:
            java.lang.String r0 = r10.readUTF8(r6, r14)
            int r1 = r12 + 3
            java.lang.String r14 = r10.readUTF8(r1, r14)
            r11.visitEnum(r13, r0, r14)
            int r12 = r12 + 5
            goto L227
        L1e9:
            java.lang.String r14 = r10.readUTF8(r6, r14)
            net.bytebuddy.jar.asm.Type r14 = net.bytebuddy.jar.asm.Type.getType(r14)
            r11.visit(r13, r14)
            goto L71
        L1f6:
            int[] r14 = r10.cpInfoOffsets
            int r0 = r10.readUnsignedShort(r6)
            r14 = r14[r0]
            int r14 = r10.readInt(r14)
            short r14 = (short) r14
            java.lang.Short r14 = java.lang.Short.valueOf(r14)
            r11.visit(r13, r14)
            goto L71
        L20c:
            int r0 = r10.readUnsignedShort(r6)
            java.lang.Object r14 = r10.readConst(r0, r14)
            r11.visit(r13, r14)
            goto L71
        L219:
            java.lang.String r0 = r10.readUTF8(r6, r14)
            net.bytebuddy.jar.asm.AnnotationVisitor r11 = r11.visitAnnotation(r13, r0)
            int r12 = r12 + 3
            int r12 = r10.readElementValues(r11, r12, r4, r14)
        L227:
            return r12
    }

    private int readElementValues(net.bytebuddy.jar.asm.AnnotationVisitor r2, int r3, boolean r4, char[] r5) {
            r1 = this;
            int r0 = r1.readUnsignedShort(r3)
            int r3 = r3 + 2
            if (r4 == 0) goto L18
        L8:
            int r4 = r0 + (-1)
            if (r0 <= 0) goto L23
            java.lang.String r0 = r1.readUTF8(r3, r5)
            int r3 = r3 + 2
            int r3 = r1.readElementValue(r2, r3, r0, r5)
            r0 = r4
            goto L8
        L18:
            int r4 = r0 + (-1)
            if (r0 <= 0) goto L23
            r0 = 0
            int r3 = r1.readElementValue(r2, r3, r0, r5)
            r0 = r4
            goto L18
        L23:
            if (r2 == 0) goto L28
            r2.visitEnd()
        L28:
            return r3
    }

    private int readField(net.bytebuddy.jar.asm.ClassVisitor r28, net.bytebuddy.jar.asm.Context r29, int r30) {
            r27 = this;
            r8 = r27
            r9 = r29
            r0 = r30
            char[] r10 = r9.charBuffer
            int r1 = r8.readUnsignedShort(r0)
            int r2 = r0 + 2
            java.lang.String r13 = r8.readUTF8(r2, r10)
            int r2 = r0 + 4
            java.lang.String r14 = r8.readUTF8(r2, r10)
            int r2 = r0 + 6
            int r2 = r8.readUnsignedShort(r2)
            int r0 = r0 + 8
            r15 = 0
            r12 = 0
            r11 = r1
            r4 = r12
            r5 = r4
            r6 = r5
            r7 = r6
            r3 = r15
            r16 = r3
            r17 = r16
        L2c:
            int r18 = r2 + (-1)
            if (r2 <= 0) goto Le5
            java.lang.String r2 = r8.readUTF8(r0, r10)
            int r1 = r0 + 2
            int r19 = r8.readInt(r1)
            int r1 = r0 + 6
            java.lang.String r0 = "ConstantValue"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L57
            int r0 = r8.readUnsignedShort(r1)
            if (r0 != 0) goto L4d
            r17 = r15
            goto L53
        L4d:
            java.lang.Object r0 = r8.readConst(r0, r10)
            r17 = r0
        L53:
            r23 = r1
            goto Ldd
        L57:
            java.lang.String r0 = "Signature"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L64
            java.lang.String r16 = r8.readUTF8(r1, r10)
            goto L53
        L64:
            java.lang.String r0 = "Deprecated"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L71
            r0 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 | r11
        L6f:
            r11 = r0
            goto L53
        L71:
            java.lang.String r0 = "Synthetic"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L7c
            r0 = r11 | 4096(0x1000, float:5.74E-42)
            goto L6f
        L7c:
            java.lang.String r0 = "RuntimeVisibleAnnotations"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L89
            r7 = r1
            r23 = r7
            goto Ldd
        L89:
            java.lang.String r0 = "RuntimeVisibleTypeAnnotations"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L95
            r5 = r1
            r23 = r5
            goto Ldd
        L95:
            java.lang.String r0 = "RuntimeInvisibleAnnotations"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto La1
            r6 = r1
            r23 = r6
            goto Ldd
        La1:
            java.lang.String r0 = "RuntimeInvisibleTypeAnnotations"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lad
            r4 = r1
            r23 = r4
            goto Ldd
        Lad:
            net.bytebuddy.jar.asm.Attribute[] r0 = r9.attributePrototypes
            r20 = -1
            r21 = 0
            r22 = r0
            r0 = r27
            r23 = r1
            r1 = r22
            r24 = r3
            r3 = r23
            r25 = r4
            r4 = r19
            r26 = r5
            r5 = r10
            r9 = r6
            r6 = r20
            r30 = r9
            r9 = r7
            r7 = r21
            net.bytebuddy.jar.asm.Attribute r3 = r0.readAttribute(r1, r2, r3, r4, r5, r6, r7)
            r1 = r24
            r3.nextAttribute = r1
            r6 = r30
            r7 = r9
            r4 = r25
            r5 = r26
        Ldd:
            int r0 = r23 + r19
            r9 = r29
            r2 = r18
            goto L2c
        Le5:
            r1 = r3
            r25 = r4
            r26 = r5
            r30 = r6
            r9 = r7
            r2 = r11
            r11 = r28
            r3 = r12
            r12 = r2
            r2 = r15
            r15 = r16
            r16 = r17
            net.bytebuddy.jar.asm.FieldVisitor r4 = r11.visitField(r12, r13, r14, r15, r16)
            if (r4 != 0) goto Lfe
            return r0
        Lfe:
            r5 = 1
            if (r9 == 0) goto L11b
            int r6 = r8.readUnsignedShort(r9)
            int r7 = r9 + 2
        L107:
            int r9 = r6 + (-1)
            if (r6 <= 0) goto L11b
            java.lang.String r6 = r8.readUTF8(r7, r10)
            int r7 = r7 + 2
            net.bytebuddy.jar.asm.AnnotationVisitor r6 = r4.visitAnnotation(r6, r5)
            int r7 = r8.readElementValues(r6, r7, r5, r10)
            r6 = r9
            goto L107
        L11b:
            if (r30 == 0) goto L139
            r12 = r30
            int r6 = r8.readUnsignedShort(r12)
            int r7 = r12 + 2
        L125:
            int r9 = r6 + (-1)
            if (r6 <= 0) goto L139
            java.lang.String r6 = r8.readUTF8(r7, r10)
            int r7 = r7 + 2
            net.bytebuddy.jar.asm.AnnotationVisitor r6 = r4.visitAnnotation(r6, r3)
            int r7 = r8.readElementValues(r6, r7, r5, r10)
            r6 = r9
            goto L125
        L139:
            r12 = r26
            if (r12 == 0) goto L161
            int r6 = r8.readUnsignedShort(r12)
            int r7 = r12 + 2
        L143:
            int r9 = r6 + (-1)
            if (r6 <= 0) goto L161
            r6 = r29
            int r7 = r8.readTypeAnnotationTarget(r6, r7)
            java.lang.String r11 = r8.readUTF8(r7, r10)
            int r7 = r7 + 2
            int r12 = r6.currentTypeAnnotationTarget
            net.bytebuddy.jar.asm.TypePath r13 = r6.currentTypeAnnotationTargetPath
            net.bytebuddy.jar.asm.AnnotationVisitor r11 = r4.visitTypeAnnotation(r12, r13, r11, r5)
            int r7 = r8.readElementValues(r11, r7, r5, r10)
            r6 = r9
            goto L143
        L161:
            r6 = r29
            r12 = r25
            if (r12 == 0) goto L189
            int r7 = r8.readUnsignedShort(r12)
            int r9 = r12 + 2
        L16d:
            int r11 = r7 + (-1)
            if (r7 <= 0) goto L189
            int r7 = r8.readTypeAnnotationTarget(r6, r9)
            java.lang.String r9 = r8.readUTF8(r7, r10)
            int r7 = r7 + 2
            int r12 = r6.currentTypeAnnotationTarget
            net.bytebuddy.jar.asm.TypePath r13 = r6.currentTypeAnnotationTargetPath
            net.bytebuddy.jar.asm.AnnotationVisitor r9 = r4.visitTypeAnnotation(r12, r13, r9, r3)
            int r9 = r8.readElementValues(r9, r7, r5, r10)
            r7 = r11
            goto L16d
        L189:
            r3 = r1
            if (r3 == 0) goto L194
            net.bytebuddy.jar.asm.Attribute r1 = r3.nextAttribute
            r3.nextAttribute = r2
            r4.visitAttribute(r3)
            goto L189
        L194:
            r4.visitEnd()
            return r0
    }

    private int readMethod(net.bytebuddy.jar.asm.ClassVisitor r35, net.bytebuddy.jar.asm.Context r36, int r37) {
            r34 = this;
            r8 = r34
            r9 = r36
            r10 = r37
            char[] r11 = r9.charBuffer
            int r0 = r8.readUnsignedShort(r10)
            r9.currentMethodAccessFlags = r0
            int r0 = r10 + 2
            java.lang.String r0 = r8.readUTF8(r0, r11)
            r9.currentMethodName = r0
            int r12 = r10 + 4
            java.lang.String r0 = r8.readUTF8(r12, r11)
            r9.currentMethodDescriptor = r0
            int r0 = r10 + 6
            int r0 = r8.readUnsignedShort(r0)
            int r1 = r10 + 8
            r7 = r1
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
        L3b:
            int r17 = r0 + (-1)
            r27 = 131072(0x20000, float:1.83671E-40)
            if (r0 <= 0) goto L1aa
            java.lang.String r0 = r8.readUTF8(r7, r11)
            int r14 = r7 + 2
            int r14 = r8.readInt(r14)
            r18 = r6
            int r6 = r7 + 6
            r19 = r1
            java.lang.String r1 = "Code"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L6c
            int r0 = r9.parsingOptions
            r1 = 1
            r0 = r0 & r1
            if (r0 != 0) goto L69
            r26 = r6
            r1 = r19
            r6 = r18
            r18 = r26
            goto L1a2
        L69:
            r20 = r2
            goto Lbf
        L6c:
            java.lang.String r1 = "Exceptions"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L9a
            int r0 = r8.readUnsignedShort(r6)
            java.lang.String[] r1 = new java.lang.String[r0]
            int r7 = r7 + 8
            r20 = r2
            r2 = 0
        L7f:
            if (r2 >= r0) goto L8c
            java.lang.String r16 = r8.readClass(r7, r11)
            r1[r2] = r16
            int r7 = r7 + 2
            int r2 = r2 + 1
            goto L7f
        L8c:
            r22 = r1
            r16 = r6
            r1 = r19
            r2 = r20
            r6 = r18
            r18 = r16
            goto L1a2
        L9a:
            r20 = r2
            java.lang.String r1 = "Signature"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Lb1
            int r0 = r8.readUnsignedShort(r6)
            r18 = r6
            r1 = r19
            r2 = r20
            r6 = r0
            goto L1a2
        Lb1:
            java.lang.String r1 = "Deprecated"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Lcb
            int r0 = r9.currentMethodAccessFlags
            r0 = r0 | r27
            r9.currentMethodAccessFlags = r0
        Lbf:
            r1 = r19
            r2 = r20
        Lc3:
            r33 = r18
            r18 = r6
            r6 = r33
            goto L1a2
        Lcb:
            java.lang.String r1 = "RuntimeVisibleAnnotations"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Lde
            r3 = r6
            r1 = r19
            r2 = r20
            r6 = r18
            r18 = r3
            goto L1a2
        Lde:
            java.lang.String r1 = "RuntimeVisibleTypeAnnotations"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Lef
            r1 = r6
            r2 = r20
            r6 = r18
            r18 = r1
            goto L1a2
        Lef:
            java.lang.String r1 = "AnnotationDefault"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L102
            r4 = r6
            r1 = r19
            r2 = r20
            r6 = r18
            r18 = r4
            goto L1a2
        L102:
            java.lang.String r1 = "Synthetic"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L116
            int r0 = r9.currentMethodAccessFlags
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r9.currentMethodAccessFlags = r0
            r1 = r19
            r2 = r20
            r15 = 1
            goto Lc3
        L116:
            java.lang.String r1 = "RuntimeInvisibleAnnotations"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L127
            r2 = r6
            r1 = r19
            r6 = r18
            r18 = r2
            goto L1a2
        L127:
            java.lang.String r1 = "RuntimeInvisibleTypeAnnotations"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L13b
            r23 = r6
            r1 = r19
            r2 = r20
            r6 = r18
            r18 = r23
            goto L1a2
        L13b:
            java.lang.String r1 = "RuntimeVisibleParameterAnnotations"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L14f
            r24 = r6
            r1 = r19
            r2 = r20
            r6 = r18
            r18 = r24
            goto L1a2
        L14f:
            java.lang.String r1 = "RuntimeInvisibleParameterAnnotations"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L162
            r25 = r6
            r1 = r19
            r2 = r20
            r6 = r18
            r18 = r25
            goto L1a2
        L162:
            java.lang.String r1 = "MethodParameters"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L174
            r5 = r6
            r1 = r19
            r2 = r20
            r6 = r18
            r18 = r5
            goto L1a2
        L174:
            net.bytebuddy.jar.asm.Attribute[] r1 = r9.attributePrototypes
            r7 = -1
            r21 = 0
            r2 = r0
            r0 = r34
            r28 = r19
            r29 = r20
            r30 = r3
            r3 = r6
            r31 = r4
            r4 = r14
            r32 = r5
            r5 = r11
            r10 = r18
            r18 = r6
            r6 = r7
            r7 = r21
            net.bytebuddy.jar.asm.Attribute r0 = r0.readAttribute(r1, r2, r3, r4, r5, r6, r7)
            r0.nextAttribute = r13
            r13 = r0
            r6 = r10
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
        L1a2:
            int r7 = r18 + r14
            r10 = r37
            r0 = r17
            goto L3b
        L1aa:
            r28 = r1
            r29 = r2
            r30 = r3
            r31 = r4
            r32 = r5
            r10 = r6
            int r0 = r9.currentMethodAccessFlags
            java.lang.String r1 = r9.currentMethodName
            java.lang.String r2 = r9.currentMethodDescriptor
            if (r10 != 0) goto L1c0
            r21 = 0
            goto L1c6
        L1c0:
            java.lang.String r3 = r8.readUtf(r10, r11)
            r21 = r3
        L1c6:
            r17 = r35
            r18 = r0
            r19 = r1
            r20 = r2
            net.bytebuddy.jar.asm.MethodVisitor r14 = r17.visitMethod(r18, r19, r20, r21, r22)
            if (r14 != 0) goto L1d5
            return r7
        L1d5:
            boolean r0 = r14 instanceof net.bytebuddy.jar.asm.MethodWriter
            if (r0 == 0) goto L1ff
            r6 = r14
            net.bytebuddy.jar.asm.MethodWriter r6 = (net.bytebuddy.jar.asm.MethodWriter) r6
            int r0 = r9.currentMethodAccessFlags
            r0 = r0 & r27
            if (r0 == 0) goto L1e4
            r3 = 1
            goto L1e5
        L1e4:
            r3 = 0
        L1e5:
            int r4 = r8.readUnsignedShort(r12)
            r0 = r6
            r1 = r34
            r2 = r15
            r5 = r10
            r10 = r6
            r6 = r16
            boolean r0 = r0.canCopyMethodAttributes(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L1ff
            r0 = r37
            int r1 = r7 - r0
            r10.setMethodAttributesSource(r0, r1)
            return r7
        L1ff:
            r5 = r32
            if (r5 == 0) goto L224
            int r0 = r9.parsingOptions
            r0 = r0 & 2
            if (r0 != 0) goto L224
            int r0 = r8.readByte(r5)
            r1 = 1
            int r5 = r5 + r1
        L20f:
            int r1 = r0 + (-1)
            if (r0 <= 0) goto L224
            java.lang.String r0 = r8.readUTF8(r5, r11)
            int r2 = r5 + 2
            int r2 = r8.readUnsignedShort(r2)
            r14.visitParameter(r0, r2)
            int r5 = r5 + 4
            r0 = r1
            goto L20f
        L224:
            r4 = r31
            if (r4 == 0) goto L235
            net.bytebuddy.jar.asm.AnnotationVisitor r0 = r14.visitAnnotationDefault()
            r1 = 0
            r8.readElementValue(r0, r4, r1, r11)
            if (r0 == 0) goto L235
            r0.visitEnd()
        L235:
            r3 = r30
            if (r3 == 0) goto L254
            int r0 = r8.readUnsignedShort(r3)
            int r3 = r3 + 2
        L23f:
            int r1 = r0 + (-1)
            if (r0 <= 0) goto L254
            java.lang.String r0 = r8.readUTF8(r3, r11)
            int r3 = r3 + 2
            r2 = 1
            net.bytebuddy.jar.asm.AnnotationVisitor r0 = r14.visitAnnotation(r0, r2)
            int r3 = r8.readElementValues(r0, r3, r2, r11)
            r0 = r1
            goto L23f
        L254:
            r2 = r29
            if (r2 == 0) goto L274
            int r0 = r8.readUnsignedShort(r2)
            int r2 = r2 + 2
        L25e:
            int r1 = r0 + (-1)
            if (r0 <= 0) goto L274
            java.lang.String r0 = r8.readUTF8(r2, r11)
            int r2 = r2 + 2
            r3 = 0
            net.bytebuddy.jar.asm.AnnotationVisitor r0 = r14.visitAnnotation(r0, r3)
            r3 = 1
            int r2 = r8.readElementValues(r0, r2, r3, r11)
            r0 = r1
            goto L25e
        L274:
            r1 = r28
            if (r1 == 0) goto L29b
            int r0 = r8.readUnsignedShort(r1)
            int r1 = r1 + 2
        L27e:
            int r2 = r0 + (-1)
            if (r0 <= 0) goto L29b
            int r0 = r8.readTypeAnnotationTarget(r9, r1)
            java.lang.String r1 = r8.readUTF8(r0, r11)
            int r0 = r0 + 2
            int r3 = r9.currentTypeAnnotationTarget
            net.bytebuddy.jar.asm.TypePath r4 = r9.currentTypeAnnotationTargetPath
            r5 = 1
            net.bytebuddy.jar.asm.AnnotationVisitor r1 = r14.visitTypeAnnotation(r3, r4, r1, r5)
            int r1 = r8.readElementValues(r1, r0, r5, r11)
            r0 = r2
            goto L27e
        L29b:
            r0 = r23
            if (r0 == 0) goto L2c5
            int r1 = r8.readUnsignedShort(r0)
            int r23 = r0 + 2
            r0 = r23
        L2a7:
            int r2 = r1 + (-1)
            if (r1 <= 0) goto L2c5
            int r0 = r8.readTypeAnnotationTarget(r9, r0)
            java.lang.String r1 = r8.readUTF8(r0, r11)
            int r0 = r0 + 2
            int r3 = r9.currentTypeAnnotationTarget
            net.bytebuddy.jar.asm.TypePath r4 = r9.currentTypeAnnotationTargetPath
            r5 = 0
            net.bytebuddy.jar.asm.AnnotationVisitor r1 = r14.visitTypeAnnotation(r3, r4, r1, r5)
            r3 = 1
            int r0 = r8.readElementValues(r1, r0, r3, r11)
            r1 = r2
            goto L2a7
        L2c5:
            r3 = 1
            r5 = 0
            r0 = r24
            if (r0 == 0) goto L2ce
            r8.readParameterAnnotations(r14, r9, r0, r3)
        L2ce:
            r0 = r25
            if (r0 == 0) goto L2d5
            r8.readParameterAnnotations(r14, r9, r0, r5)
        L2d5:
            if (r13 == 0) goto L2e1
            net.bytebuddy.jar.asm.Attribute r0 = r13.nextAttribute
            r1 = 0
            r13.nextAttribute = r1
            r14.visitAttribute(r13)
            r13 = r0
            goto L2d5
        L2e1:
            r13 = r26
            if (r13 == 0) goto L2eb
            r14.visitCode()
            r8.readCode(r14, r9, r13)
        L2eb:
            r14.visitEnd()
            return r7
    }

    private void readModuleAttributes(net.bytebuddy.jar.asm.ClassVisitor r8, net.bytebuddy.jar.asm.Context r9, int r10, int r11, java.lang.String r12) {
            r7 = this;
            char[] r9 = r9.charBuffer
            java.lang.String r0 = r7.readModule(r10, r9)
            int r1 = r10 + 2
            int r1 = r7.readUnsignedShort(r1)
            int r2 = r10 + 4
            java.lang.String r2 = r7.readUTF8(r2, r9)
            int r3 = r10 + 6
            net.bytebuddy.jar.asm.ModuleVisitor r8 = r8.visitModule(r0, r1, r2)
            if (r8 != 0) goto L1b
            return
        L1b:
            if (r12 == 0) goto L20
            r8.visitMainClass(r12)
        L20:
            if (r11 == 0) goto L37
            int r12 = r7.readUnsignedShort(r11)
            int r11 = r11 + 2
        L28:
            int r0 = r12 + (-1)
            if (r12 <= 0) goto L37
            java.lang.String r12 = r7.readPackage(r11, r9)
            r8.visitPackage(r12)
            int r11 = r11 + 2
            r12 = r0
            goto L28
        L37:
            int r11 = r7.readUnsignedShort(r3)
            int r10 = r10 + 8
        L3d:
            int r12 = r11 + (-1)
            if (r11 <= 0) goto L58
            java.lang.String r11 = r7.readModule(r10, r9)
            int r0 = r10 + 2
            int r0 = r7.readUnsignedShort(r0)
            int r1 = r10 + 4
            java.lang.String r1 = r7.readUTF8(r1, r9)
            int r10 = r10 + 6
            r8.visitRequire(r11, r0, r1)
            r11 = r12
            goto L3d
        L58:
            int r11 = r7.readUnsignedShort(r10)
            int r10 = r10 + 2
        L5e:
            int r12 = r11 + (-1)
            r0 = 0
            r1 = 0
            if (r11 <= 0) goto L8c
            java.lang.String r11 = r7.readPackage(r10, r9)
            int r2 = r10 + 2
            int r2 = r7.readUnsignedShort(r2)
            int r3 = r10 + 4
            int r3 = r7.readUnsignedShort(r3)
            int r10 = r10 + 6
            if (r3 == 0) goto L87
            java.lang.String[] r0 = new java.lang.String[r3]
        L7a:
            if (r1 >= r3) goto L87
            java.lang.String r4 = r7.readModule(r10, r9)
            r0[r1] = r4
            int r10 = r10 + 2
            int r1 = r1 + 1
            goto L7a
        L87:
            r8.visitExport(r11, r2, r0)
            r11 = r12
            goto L5e
        L8c:
            int r11 = r7.readUnsignedShort(r10)
            int r10 = r10 + 2
        L92:
            int r12 = r11 + (-1)
            if (r11 <= 0) goto Lc0
            java.lang.String r11 = r7.readPackage(r10, r9)
            int r2 = r10 + 2
            int r2 = r7.readUnsignedShort(r2)
            int r3 = r10 + 4
            int r3 = r7.readUnsignedShort(r3)
            int r10 = r10 + 6
            if (r3 == 0) goto Lba
            java.lang.String[] r4 = new java.lang.String[r3]
            r5 = r1
        Lad:
            if (r5 >= r3) goto Lbb
            java.lang.String r6 = r7.readModule(r10, r9)
            r4[r5] = r6
            int r10 = r10 + 2
            int r5 = r5 + 1
            goto Lad
        Lba:
            r4 = r0
        Lbb:
            r8.visitOpen(r11, r2, r4)
            r11 = r12
            goto L92
        Lc0:
            int r11 = r7.readUnsignedShort(r10)
            int r10 = r10 + 2
        Lc6:
            int r12 = r11 + (-1)
            if (r11 <= 0) goto Ld5
            java.lang.String r11 = r7.readClass(r10, r9)
            r8.visitUse(r11)
            int r10 = r10 + 2
            r11 = r12
            goto Lc6
        Ld5:
            int r11 = r7.readUnsignedShort(r10)
            int r10 = r10 + 2
        Ldb:
            int r12 = r11 + (-1)
            if (r11 <= 0) goto L100
            java.lang.String r11 = r7.readClass(r10, r9)
            int r0 = r10 + 2
            int r0 = r7.readUnsignedShort(r0)
            int r10 = r10 + 4
            java.lang.String[] r2 = new java.lang.String[r0]
            r3 = r1
        Lee:
            if (r3 >= r0) goto Lfb
            java.lang.String r4 = r7.readClass(r10, r9)
            r2[r3] = r4
            int r10 = r10 + 2
            int r3 = r3 + 1
            goto Lee
        Lfb:
            r8.visitProvide(r11, r2)
            r11 = r12
            goto Ldb
        L100:
            r8.visitEnd()
            return
    }

    private void readParameterAnnotations(net.bytebuddy.jar.asm.MethodVisitor r6, net.bytebuddy.jar.asm.Context r7, int r8, boolean r9) {
            r5 = this;
            byte[] r0 = r5.classFileBuffer
            int r1 = r8 + 1
            r8 = r0[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r6.visitAnnotableParameterCount(r8, r9)
            char[] r7 = r7.charBuffer
            r0 = 0
        Le:
            if (r0 >= r8) goto L2e
            int r2 = r5.readUnsignedShort(r1)
            int r1 = r1 + 2
        L16:
            int r3 = r2 + (-1)
            if (r2 <= 0) goto L2b
            java.lang.String r2 = r5.readUTF8(r1, r7)
            int r1 = r1 + 2
            net.bytebuddy.jar.asm.AnnotationVisitor r2 = r6.visitParameterAnnotation(r0, r2, r9)
            r4 = 1
            int r1 = r5.readElementValues(r2, r1, r4, r7)
            r2 = r3
            goto L16
        L2b:
            int r0 = r0 + 1
            goto Le
        L2e:
            return
    }

    private int readRecordComponent(net.bytebuddy.jar.asm.ClassVisitor r25, net.bytebuddy.jar.asm.Context r26, int r27) {
            r24 = this;
            r8 = r24
            r9 = r26
            r0 = r27
            char[] r10 = r9.charBuffer
            java.lang.String r11 = r8.readUTF8(r0, r10)
            int r1 = r0 + 2
            java.lang.String r12 = r8.readUTF8(r1, r10)
            int r1 = r0 + 4
            int r1 = r8.readUnsignedShort(r1)
            int r0 = r0 + 6
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r15 = 0
        L20:
            int r16 = r1 + (-1)
            if (r1 <= 0) goto La3
            java.lang.String r2 = r8.readUTF8(r0, r10)
            int r1 = r0 + 2
            int r17 = r8.readInt(r1)
            int r1 = r0 + 6
            java.lang.String r0 = "Signature"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L40
            java.lang.String r15 = r8.readUTF8(r1, r10)
            r21 = r1
            goto L9b
        L40:
            java.lang.String r0 = "RuntimeVisibleAnnotations"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L4c
            r7 = r1
            r21 = r7
            goto L9b
        L4c:
            java.lang.String r0 = "RuntimeVisibleTypeAnnotations"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L58
            r5 = r1
            r21 = r5
            goto L9b
        L58:
            java.lang.String r0 = "RuntimeInvisibleAnnotations"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L64
            r6 = r1
            r21 = r6
            goto L9b
        L64:
            java.lang.String r0 = "RuntimeInvisibleTypeAnnotations"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L70
            r3 = r1
            r21 = r3
            goto L9b
        L70:
            net.bytebuddy.jar.asm.Attribute[] r0 = r9.attributePrototypes
            r18 = -1
            r19 = 0
            r20 = r0
            r0 = r24
            r21 = r1
            r1 = r20
            r13 = r3
            r3 = r21
            r14 = r4
            r4 = r17
            r22 = r5
            r5 = r10
            r23 = r13
            r13 = r6
            r6 = r18
            r9 = r7
            r7 = r19
            net.bytebuddy.jar.asm.Attribute r4 = r0.readAttribute(r1, r2, r3, r4, r5, r6, r7)
            r4.nextAttribute = r14
            r7 = r9
            r6 = r13
            r5 = r22
            r3 = r23
        L9b:
            int r0 = r21 + r17
            r9 = r26
            r1 = r16
            goto L20
        La3:
            r1 = r25
            r23 = r3
            r14 = r4
            r22 = r5
            r13 = r6
            r9 = r7
            net.bytebuddy.jar.asm.RecordComponentVisitor r1 = r1.visitRecordComponent(r11, r12, r15)
            if (r1 != 0) goto Lb3
            return r0
        Lb3:
            r2 = 1
            if (r9 == 0) goto Ld0
            int r3 = r8.readUnsignedShort(r9)
            int r7 = r9 + 2
        Lbc:
            int r4 = r3 + (-1)
            if (r3 <= 0) goto Ld0
            java.lang.String r3 = r8.readUTF8(r7, r10)
            int r7 = r7 + 2
            net.bytebuddy.jar.asm.AnnotationVisitor r3 = r1.visitAnnotation(r3, r2)
            int r7 = r8.readElementValues(r3, r7, r2, r10)
            r3 = r4
            goto Lbc
        Ld0:
            if (r13 == 0) goto Led
            int r3 = r8.readUnsignedShort(r13)
            int r6 = r13 + 2
        Ld8:
            int r4 = r3 + (-1)
            if (r3 <= 0) goto Led
            java.lang.String r3 = r8.readUTF8(r6, r10)
            int r6 = r6 + 2
            r5 = 0
            net.bytebuddy.jar.asm.AnnotationVisitor r3 = r1.visitAnnotation(r3, r5)
            int r6 = r8.readElementValues(r3, r6, r2, r10)
            r3 = r4
            goto Ld8
        Led:
            r5 = r22
            if (r5 == 0) goto L115
            int r3 = r8.readUnsignedShort(r5)
            int r5 = r5 + 2
        Lf7:
            int r4 = r3 + (-1)
            if (r3 <= 0) goto L115
            r3 = r26
            int r5 = r8.readTypeAnnotationTarget(r3, r5)
            java.lang.String r6 = r8.readUTF8(r5, r10)
            int r5 = r5 + 2
            int r7 = r3.currentTypeAnnotationTarget
            net.bytebuddy.jar.asm.TypePath r9 = r3.currentTypeAnnotationTargetPath
            net.bytebuddy.jar.asm.AnnotationVisitor r6 = r1.visitTypeAnnotation(r7, r9, r6, r2)
            int r5 = r8.readElementValues(r6, r5, r2, r10)
            r3 = r4
            goto Lf7
        L115:
            r3 = r26
            if (r23 == 0) goto L13e
            r4 = r23
            int r5 = r8.readUnsignedShort(r4)
            int r4 = r4 + 2
        L121:
            int r6 = r5 + (-1)
            if (r5 <= 0) goto L13e
            int r4 = r8.readTypeAnnotationTarget(r3, r4)
            java.lang.String r5 = r8.readUTF8(r4, r10)
            int r4 = r4 + 2
            int r7 = r3.currentTypeAnnotationTarget
            net.bytebuddy.jar.asm.TypePath r9 = r3.currentTypeAnnotationTargetPath
            r11 = 0
            net.bytebuddy.jar.asm.AnnotationVisitor r5 = r1.visitTypeAnnotation(r7, r9, r5, r11)
            int r4 = r8.readElementValues(r5, r4, r2, r10)
            r5 = r6
            goto L121
        L13e:
            r4 = r14
        L13f:
            if (r4 == 0) goto L14b
            net.bytebuddy.jar.asm.Attribute r2 = r4.nextAttribute
            r3 = 0
            r4.nextAttribute = r3
            r1.visitAttribute(r4)
            r4 = r2
            goto L13f
        L14b:
            r1.visitEnd()
            return r0
    }

    private int readStackMapFrame(int r12, boolean r13, boolean r14, net.bytebuddy.jar.asm.Context r15) {
            r11 = this;
            char[] r6 = r15.charBuffer
            net.bytebuddy.jar.asm.Label[] r7 = r15.currentMethodLabels
            r0 = 255(0xff, float:3.57E-43)
            if (r13 == 0) goto L10
            byte[] r13 = r11.classFileBuffer
            int r1 = r12 + 1
            r12 = r13[r12]
            r12 = r12 & r0
            goto L15
        L10:
            r13 = -1
            r15.currentFrameOffset = r13
            r1 = r12
            r12 = r0
        L15:
            r13 = 0
            r15.currentFrameLocalCountDelta = r13
            r2 = 3
            r3 = 64
            r8 = 1
            if (r12 >= r3) goto L24
            r15.currentFrameType = r2
            r15.currentFrameStackCount = r13
            goto Ld4
        L24:
            r3 = 128(0x80, float:1.8E-43)
            r9 = 4
            if (r12 >= r3) goto L3b
            int r12 = r12 + (-64)
            java.lang.Object[] r2 = r15.currentFrameStackTypes
            r3 = 0
            r0 = r11
            r4 = r6
            r5 = r7
            int r1 = r0.readVerificationTypeInfo(r1, r2, r3, r4, r5)
            r15.currentFrameType = r9
            r15.currentFrameStackCount = r8
            goto Ld4
        L3b:
            r3 = 247(0xf7, float:3.46E-43)
            if (r12 < r3) goto Lde
            int r10 = r11.readUnsignedShort(r1)
            int r4 = r1 + 2
            if (r12 != r3) goto L59
            java.lang.Object[] r2 = r15.currentFrameStackTypes
            r3 = 0
            r0 = r11
            r1 = r4
            r4 = r6
            r5 = r7
            int r1 = r0.readVerificationTypeInfo(r1, r2, r3, r4, r5)
            r15.currentFrameType = r9
            r15.currentFrameStackCount = r8
        L56:
            r12 = r10
            goto Ld4
        L59:
            r3 = 248(0xf8, float:3.48E-43)
            r9 = 2
            r5 = 251(0xfb, float:3.52E-43)
            if (r12 < r3) goto L70
            if (r12 >= r5) goto L70
            r15.currentFrameType = r9
            int r12 = 251 - r12
            r15.currentFrameLocalCountDelta = r12
            int r14 = r15.currentFrameLocalCount
            int r14 = r14 - r12
            r15.currentFrameLocalCount = r14
            r15.currentFrameStackCount = r13
            goto L76
        L70:
            if (r12 != r5) goto L78
            r15.currentFrameType = r2
            r15.currentFrameStackCount = r13
        L76:
            r1 = r4
            goto L56
        L78:
            if (r12 >= r0) goto La2
            if (r14 == 0) goto L7f
            int r14 = r15.currentFrameLocalCount
            goto L80
        L7f:
            r14 = r13
        L80:
            int r12 = r12 + (-251)
            r3 = r14
            r1 = r4
            r14 = r12
        L85:
            if (r14 <= 0) goto L96
            java.lang.Object[] r2 = r15.currentFrameLocalTypes
            int r9 = r3 + 1
            r0 = r11
            r4 = r6
            r5 = r7
            int r1 = r0.readVerificationTypeInfo(r1, r2, r3, r4, r5)
            int r14 = r14 + (-1)
            r3 = r9
            goto L85
        L96:
            r15.currentFrameType = r8
            r15.currentFrameLocalCountDelta = r12
            int r14 = r15.currentFrameLocalCount
            int r14 = r14 + r12
            r15.currentFrameLocalCount = r14
            r15.currentFrameStackCount = r13
            goto L56
        La2:
            int r12 = r11.readUnsignedShort(r4)
            int r1 = r1 + 4
            r15.currentFrameType = r13
            r15.currentFrameLocalCountDelta = r12
            r15.currentFrameLocalCount = r12
            r14 = r13
        Laf:
            if (r14 >= r12) goto Lbe
            java.lang.Object[] r2 = r15.currentFrameLocalTypes
            r0 = r11
            r3 = r14
            r4 = r6
            r5 = r7
            int r1 = r0.readVerificationTypeInfo(r1, r2, r3, r4, r5)
            int r14 = r14 + 1
            goto Laf
        Lbe:
            int r12 = r11.readUnsignedShort(r1)
            int r1 = r1 + r9
            r15.currentFrameStackCount = r12
        Lc5:
            if (r13 >= r12) goto L56
            java.lang.Object[] r2 = r15.currentFrameStackTypes
            r0 = r11
            r3 = r13
            r4 = r6
            r5 = r7
            int r1 = r0.readVerificationTypeInfo(r1, r2, r3, r4, r5)
            int r13 = r13 + 1
            goto Lc5
        Ld4:
            int r13 = r15.currentFrameOffset
            int r12 = r12 + r8
            int r13 = r13 + r12
            r15.currentFrameOffset = r13
            r11.createLabel(r13, r7)
            return r1
        Lde:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            throw r12
    }

    private static byte[] readStream(java.io.InputStream r7, boolean r8) throws java.io.IOException {
            if (r7 == 0) goto L46
            int r0 = computeBufferSize(r7)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L2d
            r1.<init>()     // Catch: java.lang.Throwable -> L2d
            byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> L1c
            r3 = 0
            r4 = r3
        Lf:
            int r5 = r7.read(r2, r3, r0)     // Catch: java.lang.Throwable -> L1c
            r6 = -1
            if (r5 == r6) goto L1e
            r1.write(r2, r3, r5)     // Catch: java.lang.Throwable -> L1c
            int r4 = r4 + 1
            goto Lf
        L1c:
            r0 = move-exception
            goto L3c
        L1e:
            r1.flush()     // Catch: java.lang.Throwable -> L1c
            r0 = 1
            if (r4 != r0) goto L2f
            r1.close()     // Catch: java.lang.Throwable -> L2d
            if (r8 == 0) goto L2c
            r7.close()
        L2c:
            return r2
        L2d:
            r0 = move-exception
            goto L40
        L2f:
            byte[] r0 = r1.toByteArray()     // Catch: java.lang.Throwable -> L1c
            r1.close()     // Catch: java.lang.Throwable -> L2d
            if (r8 == 0) goto L3b
            r7.close()
        L3b:
            return r0
        L3c:
            r1.close()     // Catch: java.lang.Throwable -> L3f
        L3f:
            throw r0     // Catch: java.lang.Throwable -> L2d
        L40:
            if (r8 == 0) goto L45
            r7.close()
        L45:
            throw r0
        L46:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "Class not found"
            r7.<init>(r8)
            throw r7
    }

    private java.lang.String readStringish(int r2, char[] r3) {
            r1 = this;
            int[] r0 = r1.cpInfoOffsets
            int r2 = r1.readUnsignedShort(r2)
            r2 = r0[r2]
            java.lang.String r2 = r1.readUTF8(r2, r3)
            return r2
    }

    private int readTypeAnnotationTarget(net.bytebuddy.jar.asm.Context r10, int r11) {
            r9 = this;
            int r0 = r9.readInt(r11)
            int r1 = r0 >>> 24
            r2 = 1
            if (r1 == 0) goto L70
            if (r1 == r2) goto L70
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            switch(r1) {
                case 16: goto L6d;
                case 17: goto L6d;
                case 18: goto L6d;
                case 19: goto L6a;
                case 20: goto L6a;
                case 21: goto L6a;
                case 22: goto L70;
                case 23: goto L6d;
                default: goto L10;
            }
        L10:
            switch(r1) {
                case 64: goto L24;
                case 65: goto L24;
                case 66: goto L6d;
                case 67: goto L20;
                case 68: goto L20;
                case 69: goto L20;
                case 70: goto L20;
                case 71: goto L19;
                case 72: goto L19;
                case 73: goto L19;
                case 74: goto L19;
                case 75: goto L19;
                default: goto L13;
            }
        L13:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>()
            throw r10
        L19:
            r1 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r0 = r0 & r1
            int r11 = r11 + 4
            goto L75
        L20:
            r0 = r0 & r3
        L21:
            int r11 = r11 + 3
            goto L75
        L24:
            r0 = r0 & r3
            int r1 = r11 + 1
            int r1 = r9.readUnsignedShort(r1)
            int r11 = r11 + 3
            net.bytebuddy.jar.asm.Label[] r3 = new net.bytebuddy.jar.asm.Label[r1]
            r10.currentLocalVariableAnnotationRangeStarts = r3
            net.bytebuddy.jar.asm.Label[] r3 = new net.bytebuddy.jar.asm.Label[r1]
            r10.currentLocalVariableAnnotationRangeEnds = r3
            int[] r3 = new int[r1]
            r10.currentLocalVariableAnnotationRangeIndices = r3
            r3 = 0
        L3a:
            if (r3 >= r1) goto L75
            int r4 = r9.readUnsignedShort(r11)
            int r5 = r11 + 2
            int r5 = r9.readUnsignedShort(r5)
            int r6 = r11 + 4
            int r6 = r9.readUnsignedShort(r6)
            int r11 = r11 + 6
            net.bytebuddy.jar.asm.Label[] r7 = r10.currentLocalVariableAnnotationRangeStarts
            net.bytebuddy.jar.asm.Label[] r8 = r10.currentMethodLabels
            net.bytebuddy.jar.asm.Label r8 = r9.createLabel(r4, r8)
            r7[r3] = r8
            net.bytebuddy.jar.asm.Label[] r7 = r10.currentLocalVariableAnnotationRangeEnds
            int r4 = r4 + r5
            net.bytebuddy.jar.asm.Label[] r5 = r10.currentMethodLabels
            net.bytebuddy.jar.asm.Label r4 = r9.createLabel(r4, r5)
            r7[r3] = r4
            int[] r4 = r10.currentLocalVariableAnnotationRangeIndices
            r4[r3] = r6
            int r3 = r3 + 1
            goto L3a
        L6a:
            r0 = r0 & r3
            int r11 = r11 + r2
            goto L75
        L6d:
            r0 = r0 & (-256(0xffffffffffffff00, float:NaN))
            goto L21
        L70:
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r1
            int r11 = r11 + 2
        L75:
            r10.currentTypeAnnotationTarget = r0
            int r0 = r9.readByte(r11)
            if (r0 != 0) goto L7f
            r1 = 0
            goto L86
        L7f:
            net.bytebuddy.jar.asm.TypePath r1 = new net.bytebuddy.jar.asm.TypePath
            byte[] r3 = r9.classFileBuffer
            r1.<init>(r3, r11)
        L86:
            r10.currentTypeAnnotationTargetPath = r1
            int r11 = r11 + r2
            int r0 = r0 * 2
            int r11 = r11 + r0
            return r11
    }

    private int[] readTypeAnnotations(net.bytebuddy.jar.asm.MethodVisitor r11, net.bytebuddy.jar.asm.Context r12, int r13, boolean r14) {
            r10 = this;
            char[] r0 = r12.charBuffer
            int r1 = r10.readUnsignedShort(r13)
            int[] r2 = new int[r1]
            int r13 = r13 + 2
            r3 = 0
        Lb:
            if (r3 >= r1) goto L84
            r2[r3] = r13
            int r4 = r10.readInt(r13)
            int r5 = r4 >>> 24
            r6 = 23
            if (r5 == r6) goto L4d
            switch(r5) {
                case 16: goto L4d;
                case 17: goto L4d;
                case 18: goto L4d;
                default: goto L1c;
            }
        L1c:
            switch(r5) {
                case 64: goto L28;
                case 65: goto L28;
                case 66: goto L4d;
                case 67: goto L4d;
                case 68: goto L4d;
                case 69: goto L4d;
                case 70: goto L4d;
                case 71: goto L25;
                case 72: goto L25;
                case 73: goto L25;
                case 74: goto L25;
                case 75: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>()
            throw r11
        L25:
            int r13 = r13 + 4
            goto L4f
        L28:
            int r6 = r13 + 1
            int r6 = r10.readUnsignedShort(r6)
            int r13 = r13 + 3
        L30:
            int r7 = r6 + (-1)
            if (r6 <= 0) goto L4f
            int r6 = r10.readUnsignedShort(r13)
            int r8 = r13 + 2
            int r8 = r10.readUnsignedShort(r8)
            int r13 = r13 + 6
            net.bytebuddy.jar.asm.Label[] r9 = r12.currentMethodLabels
            r10.createLabel(r6, r9)
            int r6 = r6 + r8
            net.bytebuddy.jar.asm.Label[] r8 = r12.currentMethodLabels
            r10.createLabel(r6, r8)
            r6 = r7
            goto L30
        L4d:
            int r13 = r13 + 3
        L4f:
            int r6 = r10.readByte(r13)
            r7 = 66
            r8 = 0
            r9 = 1
            if (r5 != r7) goto L78
            if (r6 != 0) goto L5c
            goto L63
        L5c:
            net.bytebuddy.jar.asm.TypePath r8 = new net.bytebuddy.jar.asm.TypePath
            byte[] r5 = r10.classFileBuffer
            r8.<init>(r5, r13)
        L63:
            int r6 = r6 * 2
            int r6 = r6 + r9
            int r13 = r13 + r6
            java.lang.String r5 = r10.readUTF8(r13, r0)
            int r13 = r13 + 2
            r4 = r4 & (-256(0xffffffffffffff00, float:NaN))
            net.bytebuddy.jar.asm.AnnotationVisitor r4 = r11.visitTryCatchAnnotation(r4, r8, r5, r14)
            int r13 = r10.readElementValues(r4, r13, r9, r0)
            goto L81
        L78:
            int r6 = r6 * 2
            int r6 = r6 + 3
            int r13 = r13 + r6
            int r13 = r10.readElementValues(r8, r13, r9, r0)
        L81:
            int r3 = r3 + 1
            goto Lb
        L84:
            return r2
    }

    private java.lang.String readUtf(int r8, int r9, char[] r10) {
            r7 = this;
            int r9 = r9 + r8
            byte[] r0 = r7.classFileBuffer
            r1 = 0
            r2 = r1
        L5:
            if (r8 >= r9) goto L4b
            int r3 = r8 + 1
            r4 = r0[r8]
            r5 = r4 & 128(0x80, float:1.8E-43)
            if (r5 != 0) goto L19
            int r8 = r2 + 1
            r4 = r4 & 127(0x7f, float:1.78E-43)
            char r4 = (char) r4
            r10[r2] = r4
            r2 = r8
            r8 = r3
            goto L5
        L19:
            r5 = r4 & 224(0xe0, float:3.14E-43)
            r6 = 192(0xc0, float:2.69E-43)
            if (r5 != r6) goto L31
            int r5 = r2 + 1
            r4 = r4 & 31
            int r4 = r4 << 6
            int r8 = r8 + 2
            r3 = r0[r3]
            r3 = r3 & 63
            int r4 = r4 + r3
            char r3 = (char) r4
            r10[r2] = r3
        L2f:
            r2 = r5
            goto L5
        L31:
            int r5 = r2 + 1
            r4 = r4 & 15
            int r4 = r4 << 12
            int r6 = r8 + 2
            r3 = r0[r3]
            r3 = r3 & 63
            int r3 = r3 << 6
            int r4 = r4 + r3
            int r8 = r8 + 3
            r3 = r0[r6]
            r3 = r3 & 63
            int r4 = r4 + r3
            char r3 = (char) r4
            r10[r2] = r3
            goto L2f
        L4b:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r10, r1, r2)
            return r8
    }

    private int readVerificationTypeInfo(int r3, java.lang.Object[] r4, int r5, char[] r6, net.bytebuddy.jar.asm.Label[] r7) {
            r2 = this;
            byte[] r0 = r2.classFileBuffer
            int r1 = r3 + 1
            r0 = r0[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            switch(r0) {
                case 0: goto L43;
                case 1: goto L3e;
                case 2: goto L39;
                case 3: goto L34;
                case 4: goto L2f;
                case 5: goto L2a;
                case 6: goto L25;
                case 7: goto L1e;
                case 8: goto L11;
                default: goto Lb;
            }
        Lb:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
        L11:
            int r6 = r2.readUnsignedShort(r1)
            net.bytebuddy.jar.asm.Label r6 = r2.createLabel(r6, r7)
            r4[r5] = r6
        L1b:
            int r1 = r3 + 3
            goto L47
        L1e:
            java.lang.String r6 = r2.readClass(r1, r6)
            r4[r5] = r6
            goto L1b
        L25:
            java.lang.Integer r3 = net.bytebuddy.jar.asm.Opcodes.UNINITIALIZED_THIS
            r4[r5] = r3
            goto L47
        L2a:
            java.lang.Integer r3 = net.bytebuddy.jar.asm.Opcodes.NULL
            r4[r5] = r3
            goto L47
        L2f:
            java.lang.Integer r3 = net.bytebuddy.jar.asm.Opcodes.LONG
            r4[r5] = r3
            goto L47
        L34:
            java.lang.Integer r3 = net.bytebuddy.jar.asm.Opcodes.DOUBLE
            r4[r5] = r3
            goto L47
        L39:
            java.lang.Integer r3 = net.bytebuddy.jar.asm.Opcodes.FLOAT
            r4[r5] = r3
            goto L47
        L3e:
            java.lang.Integer r3 = net.bytebuddy.jar.asm.Opcodes.INTEGER
            r4[r5] = r3
            goto L47
        L43:
            java.lang.Integer r3 = net.bytebuddy.jar.asm.Opcodes.TOP
            r4[r5] = r3
        L47:
            return r1
    }

    public void accept(net.bytebuddy.jar.asm.ClassVisitor r2, int r3) {
            r1 = this;
            r0 = 0
            net.bytebuddy.jar.asm.Attribute[] r0 = new net.bytebuddy.jar.asm.Attribute[r0]
            r1.accept(r2, r0, r3)
            return
    }

    public void accept(net.bytebuddy.jar.asm.ClassVisitor r42, net.bytebuddy.jar.asm.Attribute[] r43, int r44) {
            r41 = this;
            r8 = r41
            r9 = r42
            r10 = r44
            net.bytebuddy.jar.asm.Context r11 = new net.bytebuddy.jar.asm.Context
            r11.<init>()
            r12 = r43
            r11.attributePrototypes = r12
            r11.parsingOptions = r10
            int r0 = r8.maxStringLength
            char[] r13 = new char[r0]
            r11.charBuffer = r13
            int r0 = r8.header
            int r1 = r8.readUnsignedShort(r0)
            int r2 = r0 + 2
            java.lang.String r14 = r8.readClass(r2, r13)
            int r2 = r0 + 4
            java.lang.String r15 = r8.readClass(r2, r13)
            int r2 = r0 + 6
            int r2 = r8.readUnsignedShort(r2)
            java.lang.String[] r7 = new java.lang.String[r2]
            int r0 = r0 + 8
            r5 = r0
            r0 = 0
        L35:
            if (r0 >= r2) goto L42
            java.lang.String r3 = r8.readClass(r5, r13)
            r7[r0] = r3
            int r5 = r5 + 2
            int r0 = r0 + 1
            goto L35
        L42:
            int r0 = r41.getFirstAttributeOffset()
            int r2 = r0 + (-2)
            int r2 = r8.readUnsignedShort(r2)
            r3 = r1
            r16 = r2
            r1 = 0
            r2 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
        L6f:
            if (r16 <= 0) goto L1f1
            java.lang.String r4 = r8.readUTF8(r0, r13)
            int r6 = r0 + 2
            int r6 = r8.readInt(r6)
            int r0 = r0 + 6
            r34 = r1
            java.lang.String r1 = "SourceFile"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L99
            java.lang.String r1 = r8.readUTF8(r0, r13)
            r37 = r0
            r2 = r1
        L8e:
            r40 = r5
            r32 = r6
            r33 = r7
            r1 = r34
        L96:
            r12 = 0
            goto L1e5
        L99:
            java.lang.String r1 = "InnerClasses"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto La6
            r30 = r0
            r37 = r30
            goto L8e
        La6:
            java.lang.String r1 = "EnclosingMethod"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto Lb3
            r22 = r0
            r37 = r22
            goto L8e
        Lb3:
            java.lang.String r1 = "NestHost"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto Lc4
            java.lang.String r1 = r8.readClass(r0, r13)
            r37 = r0
            r21 = r1
            goto L8e
        Lc4:
            java.lang.String r1 = "NestMembers"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto Ld1
            r27 = r0
            r37 = r27
            goto L8e
        Ld1:
            java.lang.String r1 = "PermittedSubclasses"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto Lde
            r29 = r0
            r37 = r29
            goto L8e
        Lde:
            java.lang.String r1 = "Signature"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto Led
            java.lang.String r18 = r8.readUTF8(r0, r13)
        Lea:
            r37 = r0
            goto L8e
        Led:
            java.lang.String r1 = "RuntimeVisibleAnnotations"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto Lfa
            r23 = r0
            r37 = r23
            goto L8e
        Lfa:
            java.lang.String r1 = "RuntimeVisibleTypeAnnotations"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L107
            r25 = r0
            r37 = r25
            goto L8e
        L107:
            java.lang.String r1 = "Deprecated"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L113
            r1 = 131072(0x20000, float:1.83671E-40)
            r3 = r3 | r1
            goto Lea
        L113:
            java.lang.String r1 = "Synthetic"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L11e
            r3 = r3 | 4096(0x1000, float:5.74E-42)
            goto Lea
        L11e:
            java.lang.String r1 = "SourceDebugExtension"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L142
            byte[] r1 = r8.classFileBuffer
            int r1 = r1.length
            int r1 = r1 - r0
            if (r6 > r1) goto L13c
            char[] r1 = new char[r6]
            java.lang.String r1 = r8.readUtf(r0, r6, r1)
            r37 = r0
            r40 = r5
            r32 = r6
            r33 = r7
            goto L96
        L13c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L142:
            java.lang.String r1 = "RuntimeInvisibleAnnotations"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L150
            r24 = r0
            r37 = r24
            goto L8e
        L150:
            java.lang.String r1 = "RuntimeInvisibleTypeAnnotations"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L15e
            r26 = r0
            r37 = r26
            goto L8e
        L15e:
            java.lang.String r1 = "Record"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L16f
            r1 = 65536(0x10000, float:9.1835E-41)
            r3 = r3 | r1
            r31 = r0
            r37 = r31
            goto L8e
        L16f:
            java.lang.String r1 = "Module"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L17d
            r17 = r0
            r37 = r17
            goto L8e
        L17d:
            java.lang.String r1 = "ModuleMainClass"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L18b
            java.lang.String r20 = r8.readClass(r0, r13)
            goto Lea
        L18b:
            java.lang.String r1 = "ModulePackages"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L199
            r19 = r0
            r37 = r19
            goto L8e
        L199:
            java.lang.String r1 = "BootstrapMethods"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L1d2
            r35 = -1
            r36 = 0
            r37 = r0
            r0 = r41
            r38 = r34
            r1 = r43
            r39 = r2
            r2 = r4
            r34 = r3
            r3 = r37
            r4 = r6
            r40 = r5
            r5 = r13
            r32 = r6
            r12 = 0
            r6 = r35
            r33 = r7
            r7 = r36
            net.bytebuddy.jar.asm.Attribute r0 = r0.readAttribute(r1, r2, r3, r4, r5, r6, r7)
            r7 = r28
            r0.nextAttribute = r7
            r28 = r0
            r3 = r34
            r1 = r38
            r2 = r39
            goto L1e5
        L1d2:
            r37 = r0
            r39 = r2
            r40 = r5
            r32 = r6
            r33 = r7
            r7 = r28
            r38 = r34
            r12 = 0
            r34 = r3
            r1 = r38
        L1e5:
            int r0 = r37 + r32
            int r16 = r16 + (-1)
            r12 = r43
            r7 = r33
            r5 = r40
            goto L6f
        L1f1:
            r38 = r1
            r39 = r2
            r34 = r3
            r40 = r5
            r33 = r7
            r7 = r28
            r12 = 0
            int[] r0 = r8.cpInfoOffsets
            r6 = 1
            r0 = r0[r6]
            int r0 = r0 + (-7)
            int r1 = r8.readInt(r0)
            r0 = r42
            r2 = r34
            r3 = r14
            r4 = r18
            r5 = r15
            r14 = r6
            r6 = r33
            r0.visit(r1, r2, r3, r4, r5, r6)
            r0 = r10 & 2
            if (r0 != 0) goto L226
            r2 = r39
            r1 = r38
            if (r2 != 0) goto L223
            if (r1 == 0) goto L226
        L223:
            r9.visitSource(r2, r1)
        L226:
            if (r17 == 0) goto L236
            r0 = r41
            r1 = r42
            r2 = r11
            r3 = r17
            r4 = r19
            r5 = r20
            r0.readModuleAttributes(r1, r2, r3, r4, r5)
        L236:
            r4 = r21
            if (r4 == 0) goto L23d
            r9.visitNestHost(r4)
        L23d:
            r6 = r22
            if (r6 == 0) goto L268
            java.lang.String r0 = r8.readClass(r6, r13)
            int r1 = r6 + 2
            int r1 = r8.readUnsignedShort(r1)
            if (r1 != 0) goto L24f
            r4 = 0
            goto L257
        L24f:
            int[] r2 = r8.cpInfoOffsets
            r2 = r2[r1]
            java.lang.String r4 = r8.readUTF8(r2, r13)
        L257:
            if (r1 != 0) goto L25b
            r1 = 0
            goto L265
        L25b:
            int[] r2 = r8.cpInfoOffsets
            r1 = r2[r1]
            int r1 = r1 + 2
            java.lang.String r1 = r8.readUTF8(r1, r13)
        L265:
            r9.visitOuterClass(r0, r4, r1)
        L268:
            r6 = r23
            if (r6 == 0) goto L288
            int r0 = r8.readUnsignedShort(r6)
            int r23 = r6 + 2
            r1 = r23
        L274:
            int r2 = r0 + (-1)
            if (r0 <= 0) goto L288
            java.lang.String r0 = r8.readUTF8(r1, r13)
            int r1 = r1 + 2
            net.bytebuddy.jar.asm.AnnotationVisitor r0 = r9.visitAnnotation(r0, r14)
            int r1 = r8.readElementValues(r0, r1, r14, r13)
            r0 = r2
            goto L274
        L288:
            r6 = r24
            if (r6 == 0) goto L2a8
            int r0 = r8.readUnsignedShort(r6)
            int r24 = r6 + 2
            r1 = r24
        L294:
            int r2 = r0 + (-1)
            if (r0 <= 0) goto L2a8
            java.lang.String r0 = r8.readUTF8(r1, r13)
            int r1 = r1 + 2
            net.bytebuddy.jar.asm.AnnotationVisitor r0 = r9.visitAnnotation(r0, r12)
            int r1 = r8.readElementValues(r0, r1, r14, r13)
            r0 = r2
            goto L294
        L2a8:
            r6 = r25
            if (r6 == 0) goto L2d0
            int r0 = r8.readUnsignedShort(r6)
            int r25 = r6 + 2
            r1 = r25
        L2b4:
            int r2 = r0 + (-1)
            if (r0 <= 0) goto L2d0
            int r0 = r8.readTypeAnnotationTarget(r11, r1)
            java.lang.String r1 = r8.readUTF8(r0, r13)
            int r0 = r0 + 2
            int r3 = r11.currentTypeAnnotationTarget
            net.bytebuddy.jar.asm.TypePath r4 = r11.currentTypeAnnotationTargetPath
            net.bytebuddy.jar.asm.AnnotationVisitor r1 = r9.visitTypeAnnotation(r3, r4, r1, r14)
            int r1 = r8.readElementValues(r1, r0, r14, r13)
            r0 = r2
            goto L2b4
        L2d0:
            r6 = r26
            if (r6 == 0) goto L2f8
            int r0 = r8.readUnsignedShort(r6)
            int r26 = r6 + 2
            r1 = r26
        L2dc:
            int r2 = r0 + (-1)
            if (r0 <= 0) goto L2f8
            int r0 = r8.readTypeAnnotationTarget(r11, r1)
            java.lang.String r1 = r8.readUTF8(r0, r13)
            int r0 = r0 + 2
            int r3 = r11.currentTypeAnnotationTarget
            net.bytebuddy.jar.asm.TypePath r4 = r11.currentTypeAnnotationTargetPath
            net.bytebuddy.jar.asm.AnnotationVisitor r1 = r9.visitTypeAnnotation(r3, r4, r1, r12)
            int r1 = r8.readElementValues(r1, r0, r14, r13)
            r0 = r2
            goto L2dc
        L2f8:
            if (r7 == 0) goto L304
            net.bytebuddy.jar.asm.Attribute r0 = r7.nextAttribute
            r1 = 0
            r7.nextAttribute = r1
            r9.visitAttribute(r7)
            r7 = r0
            goto L2f8
        L304:
            r6 = r27
            if (r6 == 0) goto L31f
            int r0 = r8.readUnsignedShort(r6)
            int r27 = r6 + 2
            r1 = r27
        L310:
            int r2 = r0 + (-1)
            if (r0 <= 0) goto L31f
            java.lang.String r0 = r8.readClass(r1, r13)
            r9.visitNestMember(r0)
            int r1 = r1 + 2
            r0 = r2
            goto L310
        L31f:
            r6 = r29
            if (r6 == 0) goto L33a
            int r0 = r8.readUnsignedShort(r6)
            int r29 = r6 + 2
            r1 = r29
        L32b:
            int r2 = r0 + (-1)
            if (r0 <= 0) goto L33a
            java.lang.String r0 = r8.readClass(r1, r13)
            r9.visitPermittedSubclass(r0)
            int r1 = r1 + 2
            r0 = r2
            goto L32b
        L33a:
            r6 = r30
            if (r6 == 0) goto L367
            int r0 = r8.readUnsignedShort(r6)
            int r30 = r6 + 2
            r1 = r30
        L346:
            int r2 = r0 + (-1)
            if (r0 <= 0) goto L367
            java.lang.String r0 = r8.readClass(r1, r13)
            int r3 = r1 + 2
            java.lang.String r3 = r8.readClass(r3, r13)
            int r4 = r1 + 4
            java.lang.String r4 = r8.readUTF8(r4, r13)
            int r5 = r1 + 6
            int r5 = r8.readUnsignedShort(r5)
            r9.visitInnerClass(r0, r3, r4, r5)
            int r1 = r1 + 8
            r0 = r2
            goto L346
        L367:
            r6 = r31
            if (r6 == 0) goto L37d
            int r0 = r8.readUnsignedShort(r6)
            int r31 = r6 + 2
            r1 = r31
        L373:
            int r2 = r0 + (-1)
            if (r0 <= 0) goto L37d
            int r1 = r8.readRecordComponent(r9, r11, r1)
            r0 = r2
            goto L373
        L37d:
            r0 = r40
            int r1 = r8.readUnsignedShort(r0)
            int r5 = r0 + 2
        L385:
            int r0 = r1 + (-1)
            if (r1 <= 0) goto L38f
            int r5 = r8.readField(r9, r11, r5)
            r1 = r0
            goto L385
        L38f:
            int r0 = r8.readUnsignedShort(r5)
            int r5 = r5 + 2
        L395:
            int r1 = r0 + (-1)
            if (r0 <= 0) goto L39f
            int r5 = r8.readMethod(r9, r11, r5)
            r0 = r1
            goto L395
        L39f:
            r42.visitEnd()
            return
    }

    public int getAccess() {
            r1 = this;
            int r0 = r1.header
            int r0 = r1.readUnsignedShort(r0)
            return r0
    }

    public java.lang.String getClassName() {
            r2 = this;
            int r0 = r2.header
            int r0 = r0 + 2
            int r1 = r2.maxStringLength
            char[] r1 = new char[r1]
            java.lang.String r0 = r2.readClass(r0, r1)
            return r0
    }

    public final int getFirstAttributeOffset() {
            r4 = this;
            int r0 = r4.header
            int r1 = r0 + 8
            int r0 = r0 + 6
            int r0 = r4.readUnsignedShort(r0)
            int r0 = r0 * 2
            int r1 = r1 + r0
            int r0 = r4.readUnsignedShort(r1)
            int r1 = r1 + 2
        L13:
            int r2 = r0 + (-1)
            if (r0 <= 0) goto L30
            int r0 = r1 + 6
            int r0 = r4.readUnsignedShort(r0)
            int r1 = r1 + 8
        L1f:
            int r3 = r0 + (-1)
            if (r0 <= 0) goto L2e
            int r0 = r1 + 2
            int r0 = r4.readInt(r0)
            int r0 = r0 + 6
            int r1 = r1 + r0
            r0 = r3
            goto L1f
        L2e:
            r0 = r2
            goto L13
        L30:
            int r0 = r4.readUnsignedShort(r1)
            int r1 = r1 + 2
        L36:
            int r2 = r0 + (-1)
            if (r0 <= 0) goto L53
            int r0 = r1 + 6
            int r0 = r4.readUnsignedShort(r0)
            int r1 = r1 + 8
        L42:
            int r3 = r0 + (-1)
            if (r0 <= 0) goto L51
            int r0 = r1 + 2
            int r0 = r4.readInt(r0)
            int r0 = r0 + 6
            int r1 = r1 + r0
            r0 = r3
            goto L42
        L51:
            r0 = r2
            goto L36
        L53:
            int r1 = r1 + 2
            return r1
    }

    public java.lang.String[] getInterfaces() {
            r6 = this;
            int r0 = r6.header
            int r0 = r0 + 6
            int r1 = r6.readUnsignedShort(r0)
            java.lang.String[] r2 = new java.lang.String[r1]
            if (r1 <= 0) goto L1e
            int r3 = r6.maxStringLength
            char[] r3 = new char[r3]
            r4 = 0
        L11:
            if (r4 >= r1) goto L1e
            int r0 = r0 + 2
            java.lang.String r5 = r6.readClass(r0, r3)
            r2[r4] = r5
            int r4 = r4 + 1
            goto L11
        L1e:
            return r2
    }

    public int getItem(int r2) {
            r1 = this;
            int[] r0 = r1.cpInfoOffsets
            r2 = r0[r2]
            return r2
    }

    public int getItemCount() {
            r1 = this;
            int[] r0 = r1.cpInfoOffsets
            int r0 = r0.length
            return r0
    }

    public int getMaxStringLength() {
            r1 = this;
            int r0 = r1.maxStringLength
            return r0
    }

    public java.lang.String getSuperName() {
            r2 = this;
            int r0 = r2.header
            int r0 = r0 + 4
            int r1 = r2.maxStringLength
            char[] r1 = new char[r1]
            java.lang.String r0 = r2.readClass(r0, r1)
            return r0
    }

    public int readByte(int r2) {
            r1 = this;
            byte[] r0 = r1.classFileBuffer
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            return r2
    }

    public void readBytecodeInstructionOffset(int r1) {
            r0 = this;
            return
    }

    public java.lang.String readClass(int r1, char[] r2) {
            r0 = this;
            java.lang.String r1 = r0.readStringish(r1, r2)
            return r1
    }

    public java.lang.Object readConst(int r7, char[] r8) {
            r6 = this;
            int[] r0 = r6.cpInfoOffsets
            r0 = r0[r7]
            byte[] r1 = r6.classFileBuffer
            int r2 = r0 + (-1)
            r1 = r1[r2]
            switch(r1) {
                case 3: goto L92;
                case 4: goto L85;
                case 5: goto L7c;
                case 6: goto L6f;
                case 7: goto L66;
                case 8: goto L61;
                default: goto Ld;
            }
        Ld:
            switch(r1) {
                case 15: goto L24;
                case 16: goto L1b;
                case 17: goto L16;
                default: goto L10;
            }
        L10:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        L16:
            net.bytebuddy.jar.asm.ConstantDynamic r7 = r6.readConstantDynamic(r7, r8)
            return r7
        L1b:
            java.lang.String r7 = r6.readUTF8(r0, r8)
            net.bytebuddy.jar.asm.Type r7 = net.bytebuddy.jar.asm.Type.getMethodType(r7)
            return r7
        L24:
            int r1 = r6.readByte(r0)
            int[] r7 = r6.cpInfoOffsets
            r2 = 1
            int r0 = r0 + r2
            int r0 = r6.readUnsignedShort(r0)
            r7 = r7[r0]
            int[] r0 = r6.cpInfoOffsets
            int r3 = r7 + 2
            int r3 = r6.readUnsignedShort(r3)
            r0 = r0[r3]
            java.lang.String r3 = r6.readClass(r7, r8)
            java.lang.String r4 = r6.readUTF8(r0, r8)
            int r0 = r0 + 2
            java.lang.String r8 = r6.readUTF8(r0, r8)
            byte[] r0 = r6.classFileBuffer
            int r7 = r7 - r2
            r7 = r0[r7]
            r0 = 11
            if (r7 != r0) goto L55
            r5 = r2
            goto L57
        L55:
            r7 = 0
            r5 = r7
        L57:
            net.bytebuddy.jar.asm.Handle r7 = new net.bytebuddy.jar.asm.Handle
            r0 = r7
            r2 = r3
            r3 = r4
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r7
        L61:
            java.lang.String r7 = r6.readUTF8(r0, r8)
            return r7
        L66:
            java.lang.String r7 = r6.readUTF8(r0, r8)
            net.bytebuddy.jar.asm.Type r7 = net.bytebuddy.jar.asm.Type.getObjectType(r7)
            return r7
        L6f:
            long r7 = r6.readLong(r0)
            double r7 = java.lang.Double.longBitsToDouble(r7)
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            return r7
        L7c:
            long r7 = r6.readLong(r0)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            return r7
        L85:
            int r7 = r6.readInt(r0)
            float r7 = java.lang.Float.intBitsToFloat(r7)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            return r7
        L92:
            int r7 = r6.readInt(r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            return r7
    }

    public int readInt(int r4) {
            r3 = this;
            byte[] r0 = r3.classFileBuffer
            r1 = r0[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 24
            int r2 = r4 + 1
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
            r1 = r1 | r2
            int r2 = r4 + 2
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r1 = r1 | r2
            int r4 = r4 + 3
            r4 = r0[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r4 = r4 | r1
            return r4
    }

    public net.bytebuddy.jar.asm.Label readLabel(int r2, net.bytebuddy.jar.asm.Label[] r3) {
            r1 = this;
            r0 = r3[r2]
            if (r0 != 0) goto Lb
            net.bytebuddy.jar.asm.Label r0 = new net.bytebuddy.jar.asm.Label
            r0.<init>()
            r3[r2] = r0
        Lb:
            r2 = r3[r2]
            return r2
    }

    public long readLong(int r7) {
            r6 = this;
            int r0 = r6.readInt(r7)
            long r0 = (long) r0
            int r7 = r7 + 4
            int r7 = r6.readInt(r7)
            long r2 = (long) r7
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            r7 = 32
            long r0 = r0 << r7
            long r0 = r0 | r2
            return r0
    }

    public java.lang.String readModule(int r1, char[] r2) {
            r0 = this;
            java.lang.String r1 = r0.readStringish(r1, r2)
            return r1
    }

    public java.lang.String readPackage(int r1, char[] r2) {
            r0 = this;
            java.lang.String r1 = r0.readStringish(r1, r2)
            return r1
    }

    public short readShort(int r3) {
            r2 = this;
            byte[] r0 = r2.classFileBuffer
            r1 = r0[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            int r3 = r3 + 1
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r1
            short r3 = (short) r3
            return r3
    }

    public java.lang.String readUTF8(int r2, char[] r3) {
            r1 = this;
            int r0 = r1.readUnsignedShort(r2)
            if (r2 == 0) goto Le
            if (r0 != 0) goto L9
            goto Le
        L9:
            java.lang.String r2 = r1.readUtf(r0, r3)
            return r2
        Le:
            r2 = 0
            return r2
    }

    public int readUnsignedShort(int r3) {
            r2 = this;
            byte[] r0 = r2.classFileBuffer
            r1 = r0[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            int r3 = r3 + 1
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r1
            return r3
    }

    public final java.lang.String readUtf(int r4, char[] r5) {
            r3 = this;
            java.lang.String[] r0 = r3.constantUtf8Values
            r1 = r0[r4]
            if (r1 == 0) goto L7
            return r1
        L7:
            int[] r1 = r3.cpInfoOffsets
            r1 = r1[r4]
            int r2 = r1 + 2
            int r1 = r3.readUnsignedShort(r1)
            java.lang.String r5 = r3.readUtf(r2, r1, r5)
            r0[r4] = r5
            return r5
    }
}
