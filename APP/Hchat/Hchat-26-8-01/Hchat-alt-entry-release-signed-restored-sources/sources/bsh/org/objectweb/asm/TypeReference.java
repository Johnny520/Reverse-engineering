package bsh.org.objectweb.asm;

import okhttp3.internal.http2.Settings;
import p136j8.C2104o;

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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TypeReference(int i9) {
        this.targetTypeAndInfo = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static TypeReference newExceptionReference(int i9) {
        return new TypeReference((i9 << 8) | 385875968);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static TypeReference newFormalParameterReference(int i9) {
        return new TypeReference((i9 << 16) | 369098752);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static TypeReference newSuperTypeReference(int i9) {
        return new TypeReference(((i9 & Settings.DEFAULT_INITIAL_WINDOW_SIZE) << 8) | 268435456);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static TypeReference newTryCatchReference(int i9) {
        return new TypeReference((i9 << 8) | 1107296256);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static TypeReference newTypeArgumentReference(int i9, int i10) {
        return new TypeReference((i9 << 24) | i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static TypeReference newTypeParameterBoundReference(int i9, int i10, int i11) {
        return new TypeReference((i9 << 24) | (i10 << 16) | (i11 << 8));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static TypeReference newTypeParameterReference(int i9, int i10) {
        return new TypeReference((i9 << 24) | (i10 << 16));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static TypeReference newTypeReference(int i9) {
        return new TypeReference(i9 << 24);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void putTarget(int i9, ByteVector byteVector) {
        int i10 = i9 >>> 24;
        if (i10 != 0 && i10 != 1) {
            switch (i10) {
                case 16:
                case 17:
                case 18:
                case 23:
                    break;
                case 19:
                case 20:
                case 21:
                    byteVector.putByte(i10);
                    return;
                case 22:
                    break;
                default:
                    switch (i10) {
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                            break;
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                            byteVector.putInt(i9);
                            break;
                        default:
                            C2104o.m5289o();
                            break;
                    }
                    return;
            }
            byteVector.put12(i10, (i9 & 16776960) >> 8);
            return;
        }
        byteVector.putShort(i9 >>> 16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getExceptionIndex() {
        return (this.targetTypeAndInfo & 16776960) >> 8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getFormalParameterIndex() {
        return (this.targetTypeAndInfo & 16711680) >> 16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getSort() {
        return this.targetTypeAndInfo >>> 24;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getSuperTypeIndex() {
        return (short) ((this.targetTypeAndInfo & 16776960) >> 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getTryCatchBlockIndex() {
        return (this.targetTypeAndInfo & 16776960) >> 8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getTypeArgumentIndex() {
        return this.targetTypeAndInfo & 255;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getTypeParameterBoundIndex() {
        return (this.targetTypeAndInfo & 65280) >> 8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getTypeParameterIndex() {
        return (this.targetTypeAndInfo & 16711680) >> 16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getValue() {
        return this.targetTypeAndInfo;
    }
}
