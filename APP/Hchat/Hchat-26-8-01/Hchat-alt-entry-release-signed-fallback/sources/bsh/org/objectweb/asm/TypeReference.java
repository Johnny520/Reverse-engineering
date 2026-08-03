package bsh.org.objectweb.asm;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class TypeReference {
    public static final int CAST = 71;
    public static final int CLASS_EXTENDS = 16;
    public static final int CLASS_TYPE_PARAMETER = 0;
    public static final int CLASS_TYPE_PARAMETER_BOUND = 17;
    public static final int CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT = 72;
    public static final int CONSTRUCTOR_REFERENCE = 69;
    public static final int CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT = 74;
    public static final int EXCEPTION_PARAMETER = 66;
    public static final int FIELD = 19;
    public static final int INSTANCEOF = 67;
    public static final int LOCAL_VARIABLE = 64;
    public static final int METHOD_FORMAL_PARAMETER = 22;
    public static final int METHOD_INVOCATION_TYPE_ARGUMENT = 73;
    public static final int METHOD_RECEIVER = 21;
    public static final int METHOD_REFERENCE = 70;
    public static final int METHOD_REFERENCE_TYPE_ARGUMENT = 75;
    public static final int METHOD_RETURN = 20;
    public static final int METHOD_TYPE_PARAMETER = 1;
    public static final int METHOD_TYPE_PARAMETER_BOUND = 18;
    public static final int NEW = 68;
    public static final int RESOURCE_VARIABLE = 65;
    public static final int THROWS = 23;
    private final int targetTypeAndInfo;

    public TypeReference(int r1) {
            r0 = this;
            r0.<init>()
            r0.targetTypeAndInfo = r1
            return
    }

    public static bsh.org.objectweb.asm.TypeReference newExceptionReference(int r2) {
            bsh.org.objectweb.asm.TypeReference r0 = new bsh.org.objectweb.asm.TypeReference
            int r2 = r2 << 8
            r1 = 385875968(0x17000000, float:4.135903E-25)
            r2 = r2 | r1
            r0.<init>(r2)
            return r0
    }

    public static bsh.org.objectweb.asm.TypeReference newFormalParameterReference(int r2) {
            bsh.org.objectweb.asm.TypeReference r0 = new bsh.org.objectweb.asm.TypeReference
            int r2 = r2 << 16
            r1 = 369098752(0x16000000, float:1.0339758E-25)
            r2 = r2 | r1
            r0.<init>(r2)
            return r0
    }

    public static bsh.org.objectweb.asm.TypeReference newSuperTypeReference(int r2) {
            bsh.org.objectweb.asm.TypeReference r0 = new bsh.org.objectweb.asm.TypeReference
            r1 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            int r2 = r2 << 8
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r2 = r2 | r1
            r0.<init>(r2)
            return r0
    }

    public static bsh.org.objectweb.asm.TypeReference newTryCatchReference(int r2) {
            bsh.org.objectweb.asm.TypeReference r0 = new bsh.org.objectweb.asm.TypeReference
            int r2 = r2 << 8
            r1 = 1107296256(0x42000000, float:32.0)
            r2 = r2 | r1
            r0.<init>(r2)
            return r0
    }

    public static bsh.org.objectweb.asm.TypeReference newTypeArgumentReference(int r1, int r2) {
            bsh.org.objectweb.asm.TypeReference r0 = new bsh.org.objectweb.asm.TypeReference
            int r1 = r1 << 24
            r1 = r1 | r2
            r0.<init>(r1)
            return r0
    }

    public static bsh.org.objectweb.asm.TypeReference newTypeParameterBoundReference(int r1, int r2, int r3) {
            bsh.org.objectweb.asm.TypeReference r0 = new bsh.org.objectweb.asm.TypeReference
            int r1 = r1 << 24
            int r2 = r2 << 16
            r1 = r1 | r2
            int r2 = r3 << 8
            r1 = r1 | r2
            r0.<init>(r1)
            return r0
    }

    public static bsh.org.objectweb.asm.TypeReference newTypeParameterReference(int r1, int r2) {
            bsh.org.objectweb.asm.TypeReference r0 = new bsh.org.objectweb.asm.TypeReference
            int r1 = r1 << 24
            int r2 = r2 << 16
            r1 = r1 | r2
            r0.<init>(r1)
            return r0
    }

    public static bsh.org.objectweb.asm.TypeReference newTypeReference(int r1) {
            bsh.org.objectweb.asm.TypeReference r0 = new bsh.org.objectweb.asm.TypeReference
            int r1 = r1 << 24
            r0.<init>(r1)
            return r0
    }

    public static void putTarget(int r2, bsh.org.objectweb.asm.ByteVector r3) {
            int r0 = r2 >>> 24
            if (r0 == 0) goto L23
            r1 = 1
            if (r0 == r1) goto L23
            switch(r0) {
                case 16: goto L19;
                case 17: goto L19;
                case 18: goto L19;
                case 19: goto L15;
                case 20: goto L15;
                case 21: goto L15;
                case 22: goto L23;
                case 23: goto L19;
                default: goto La;
            }
        La:
            switch(r0) {
                case 66: goto L19;
                case 67: goto L19;
                case 68: goto L19;
                case 69: goto L19;
                case 70: goto L19;
                case 71: goto L11;
                case 72: goto L11;
                case 73: goto L11;
                case 74: goto L11;
                case 75: goto L11;
                default: goto Ld;
            }
        Ld:
            j8.o.o()
            return
        L11:
            r3.putInt(r2)
            return
        L15:
            r3.putByte(r0)
            return
        L19:
            r1 = 16776960(0xffff00, float:2.3509528E-38)
            r2 = r2 & r1
            int r2 = r2 >> 8
            r3.put12(r0, r2)
            return
        L23:
            int r2 = r2 >>> 16
            r3.putShort(r2)
            return
    }

    public int getExceptionIndex() {
            r2 = this;
            int r0 = r2.targetTypeAndInfo
            r1 = 16776960(0xffff00, float:2.3509528E-38)
            r0 = r0 & r1
            int r0 = r0 >> 8
            return r0
    }

    public int getFormalParameterIndex() {
            r2 = this;
            int r0 = r2.targetTypeAndInfo
            r1 = 16711680(0xff0000, float:2.3418052E-38)
            r0 = r0 & r1
            int r0 = r0 >> 16
            return r0
    }

    public int getSort() {
            r1 = this;
            int r0 = r1.targetTypeAndInfo
            int r0 = r0 >>> 24
            return r0
    }

    public int getSuperTypeIndex() {
            r2 = this;
            int r0 = r2.targetTypeAndInfo
            r1 = 16776960(0xffff00, float:2.3509528E-38)
            r0 = r0 & r1
            int r0 = r0 >> 8
            short r0 = (short) r0
            return r0
    }

    public int getTryCatchBlockIndex() {
            r2 = this;
            int r0 = r2.targetTypeAndInfo
            r1 = 16776960(0xffff00, float:2.3509528E-38)
            r0 = r0 & r1
            int r0 = r0 >> 8
            return r0
    }

    public int getTypeArgumentIndex() {
            r1 = this;
            int r0 = r1.targetTypeAndInfo
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    public int getTypeParameterBoundIndex() {
            r2 = this;
            int r0 = r2.targetTypeAndInfo
            r1 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r1
            int r0 = r0 >> 8
            return r0
    }

    public int getTypeParameterIndex() {
            r2 = this;
            int r0 = r2.targetTypeAndInfo
            r1 = 16711680(0xff0000, float:2.3418052E-38)
            r0 = r0 & r1
            int r0 = r0 >> 16
            return r0
    }

    public int getValue() {
            r1 = this;
            int r0 = r1.targetTypeAndInfo
            return r0
    }
}
