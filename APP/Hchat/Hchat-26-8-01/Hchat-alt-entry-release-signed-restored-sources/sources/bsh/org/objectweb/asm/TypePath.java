package bsh.org.objectweb.asm;

import p136j8.C2104o;
import p222p.AbstractC3199a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class TypePath {
    public static final int ARRAY_ELEMENT = 0;
    public static final int INNER_TYPE = 1;
    public static final int TYPE_ARGUMENT = 3;
    public static final int WILDCARD_BOUND = 2;
    private final byte[] typePathContainer;
    private final int typePathOffset;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TypePath(byte[] bArr, int i9) {
        this.typePathContainer = bArr;
        this.typePathOffset = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static TypePath fromString(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int length = str.length();
        ByteVector byteVector = new ByteVector(length);
        byteVector.putByte(0);
        int i9 = 0;
        while (i9 < length) {
            int i10 = i9 + 1;
            char cCharAt = str.charAt(i9);
            if (cCharAt == '[') {
                byteVector.put11(0, 0);
            } else if (cCharAt == '.') {
                byteVector.put11(1, 0);
            } else if (cCharAt == '*') {
                byteVector.put11(2, 0);
            } else {
                if (cCharAt < '0' || cCharAt > '9') {
                    C2104o.m5289o();
                    return null;
                }
                int i11 = cCharAt - '0';
                while (i10 < length) {
                    int i12 = i10 + 1;
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                        i11 = ((i11 * 10) + cCharAt2) - 48;
                        i10 = i12;
                    } else {
                        if (cCharAt2 != ';') {
                            C2104o.m5289o();
                            return null;
                        }
                        i10 = i12;
                        byteVector.put11(3, i11);
                    }
                }
                byteVector.put11(3, i11);
            }
            i9 = i10;
        }
        byte[] bArr = byteVector.data;
        bArr[0] = (byte) (byteVector.length / 2);
        return new TypePath(bArr, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void put(TypePath typePath, ByteVector byteVector) {
        if (typePath == null) {
            byteVector.putByte(0);
            return;
        }
        byte[] bArr = typePath.typePathContainer;
        int i9 = typePath.typePathOffset;
        byteVector.putByteArray(bArr, i9, (bArr[i9] * 2) + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getLength() {
        return this.typePathContainer[this.typePathOffset];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getStep(int i9) {
        return this.typePathContainer[AbstractC3199a.m6834g(i9, 2, this.typePathOffset, 1)];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getStepArgument(int i9) {
        return this.typePathContainer[AbstractC3199a.m6834g(i9, 2, this.typePathOffset, 2)];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        int length = getLength();
        StringBuilder sb2 = new StringBuilder(length * 2);
        for (int i9 = 0; i9 < length; i9++) {
            int step = getStep(i9);
            if (step == 0) {
                sb2.append('[');
            } else if (step == 1) {
                sb2.append('.');
            } else if (step == 2) {
                sb2.append('*');
            } else {
                if (step != 3) {
                    throw new AssertionError();
                }
                sb2.append(getStepArgument(i9));
                sb2.append(';');
            }
        }
        return sb2.toString();
    }
}
