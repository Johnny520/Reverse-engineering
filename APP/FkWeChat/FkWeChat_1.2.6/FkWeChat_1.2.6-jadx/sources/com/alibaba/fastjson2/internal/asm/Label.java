package com.alibaba.fastjson2.internal.asm;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class Label {
    static final Label EMPTY_LIST = new Label();
    static final int FLAG_DEBUG_ONLY = 1;
    static final int FLAG_JUMP_TARGET = 2;
    static final int FLAG_REACHABLE = 8;
    static final int FLAG_RESOLVED = 4;
    static final int FORWARD_REFERENCES_CAPACITY_INCREMENT = 6;
    static final int FORWARD_REFERENCE_HANDLE_MASK = 268435455;
    static final int FORWARD_REFERENCE_TYPE_MASK = -268435456;
    static final int FORWARD_REFERENCE_TYPE_SHORT = 268435456;
    static final int FORWARD_REFERENCE_TYPE_WIDE = 536870912;
    int bytecodeOffset;
    short flags;
    private int[] forwardReferences;
    Frame frame;
    public Object info;
    Label nextBasicBlock;
    Label nextListElement;
    Edge outgoingEdges;
    short outputStackMax;

    private void addForwardReference(int i10, int i11, int i12) {
        if (this.forwardReferences == null) {
            this.forwardReferences = new int[6];
        }
        int[] iArr = this.forwardReferences;
        int i13 = iArr[0];
        int i14 = i13 + 2;
        if (i14 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.forwardReferences = iArr2;
        }
        int[] iArr3 = this.forwardReferences;
        iArr3[i13 + 1] = i10;
        iArr3[i14] = i11 | i12;
        iArr3[0] = i14;
    }

    public final Label getCanonicalInstance() {
        Frame frame = this.frame;
        return frame == null ? this : frame.owner;
    }

    public final void put(ByteVector byteVector, int i10, boolean z10) {
        if ((this.flags & 4) != 0) {
            int i11 = this.bytecodeOffset;
            if (z10) {
                byteVector.putInt(i11 - i10);
                return;
            } else {
                byteVector.putShort(i11 - i10);
                return;
            }
        }
        if (z10) {
            addForwardReference(i10, FORWARD_REFERENCE_TYPE_WIDE, byteVector.length);
            byteVector.putInt(-1);
        } else {
            addForwardReference(i10, FORWARD_REFERENCE_TYPE_SHORT, byteVector.length);
            byteVector.putShort(-1);
        }
    }

    public final boolean resolve(byte[] bArr, int i10) {
        this.flags = (short) (this.flags | 4);
        this.bytecodeOffset = i10;
        int[] iArr = this.forwardReferences;
        boolean z10 = false;
        if (iArr == null) {
            return false;
        }
        for (int i11 = iArr[0]; i11 > 0; i11 -= 2) {
            int[] iArr2 = this.forwardReferences;
            int i12 = iArr2[i11 - 1];
            int i13 = iArr2[i11];
            int i14 = i10 - i12;
            int i15 = FORWARD_REFERENCE_HANDLE_MASK & i13;
            if ((i13 & FORWARD_REFERENCE_TYPE_MASK) != FORWARD_REFERENCE_TYPE_SHORT) {
                int i16 = i15 + 1;
                bArr[i15] = (byte) (i14 >>> 24);
                i15 += 2;
                bArr[i16] = (byte) (i14 >>> 16);
            } else if (i14 < -32768 || i14 > 32767) {
                int i17 = bArr[i12] & 255;
                if (i17 < 198) {
                    bArr[i12] = (byte) (i17 + 49);
                } else {
                    bArr[i12] = (byte) (i17 + 20);
                }
                z10 = true;
            }
            bArr[i15] = (byte) (i14 >>> 8);
            bArr[i15 + 1] = (byte) i14;
        }
        return z10;
    }
}
