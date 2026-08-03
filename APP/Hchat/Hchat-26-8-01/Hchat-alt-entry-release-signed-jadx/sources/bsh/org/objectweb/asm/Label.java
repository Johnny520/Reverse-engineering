package bsh.org.objectweb.asm;

import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class Label {
    static final Label EMPTY_LIST = new Label();
    static final int FLAG_DEBUG_ONLY = 1;
    static final int FLAG_JUMP_TARGET = 2;
    static final int FLAG_REACHABLE = 8;
    static final int FLAG_RESOLVED = 4;
    static final int FLAG_SUBROUTINE_CALLER = 16;
    static final int FLAG_SUBROUTINE_END = 64;
    static final int FLAG_SUBROUTINE_START = 32;
    static final int FORWARD_REFERENCES_CAPACITY_INCREMENT = 6;
    static final int FORWARD_REFERENCE_HANDLE_MASK = 268435455;
    static final int FORWARD_REFERENCE_TYPE_MASK = -268435456;
    static final int FORWARD_REFERENCE_TYPE_SHORT = 268435456;
    static final int FORWARD_REFERENCE_TYPE_WIDE = 536870912;
    static final int LINE_NUMBERS_CAPACITY_INCREMENT = 4;
    int bytecodeOffset;
    short flags;
    private int[] forwardReferences;
    Frame frame;
    public Object info;
    short inputStackSize;
    private short lineNumber;
    Label nextBasicBlock;
    Label nextListElement;
    private int[] otherLineNumbers;
    Edge outgoingEdges;
    short outputStackMax;
    short outputStackSize;
    short subroutineId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void addForwardReference(int i9, int i10, int i11) {
        if (this.forwardReferences == null) {
            this.forwardReferences = new int[6];
        }
        int[] iArr = this.forwardReferences;
        int i12 = iArr[0];
        if (i12 + 2 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.forwardReferences = iArr2;
        }
        int[] iArr3 = this.forwardReferences;
        iArr3[i12 + 1] = i9;
        int i13 = i12 + 2;
        iArr3[i13] = i10 | i11;
        iArr3[0] = i13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Label pushSuccessors(Label label) {
        for (Edge edge = this.outgoingEdges; edge != null; edge = edge.nextEdge) {
            if ((this.flags & 16) == 0 || edge != this.outgoingEdges.nextEdge) {
                Label label2 = edge.successor;
                if (label2.nextListElement == null) {
                    label2.nextListElement = label;
                    label = label2;
                }
            }
        }
        return label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void accept(MethodVisitor methodVisitor, boolean z9) {
        short s10;
        methodVisitor.visitLabel(this);
        if (!z9 || (s10 = this.lineNumber) == 0) {
            return;
        }
        methodVisitor.visitLineNumber(s10 & 65535, this);
        if (this.otherLineNumbers == null) {
            return;
        }
        int i9 = 1;
        while (true) {
            int[] iArr = this.otherLineNumbers;
            if (i9 > iArr[0]) {
                return;
            }
            methodVisitor.visitLineNumber(iArr[i9], this);
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addLineNumber(int i9) {
        if (this.lineNumber == 0) {
            this.lineNumber = (short) i9;
            return;
        }
        if (this.otherLineNumbers == null) {
            this.otherLineNumbers = new int[4];
        }
        int[] iArr = this.otherLineNumbers;
        int i10 = iArr[0] + 1;
        iArr[0] = i10;
        if (i10 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 4];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.otherLineNumbers = iArr2;
        }
        this.otherLineNumbers[i10] = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addSubroutineRetSuccessors(Label label) {
        Label label2 = EMPTY_LIST;
        this.nextListElement = label2;
        Label label3 = label2;
        Label labelPushSuccessors = this;
        while (labelPushSuccessors != EMPTY_LIST) {
            Label label4 = labelPushSuccessors.nextListElement;
            labelPushSuccessors.nextListElement = label3;
            if ((labelPushSuccessors.flags & 64) != 0 && labelPushSuccessors.subroutineId != label.subroutineId) {
                labelPushSuccessors.outgoingEdges = new Edge(labelPushSuccessors.outputStackSize, label.outgoingEdges.successor, labelPushSuccessors.outgoingEdges);
            }
            label3 = labelPushSuccessors;
            labelPushSuccessors = labelPushSuccessors.pushSuccessors(label4);
        }
        while (label3 != EMPTY_LIST) {
            Label label5 = label3.nextListElement;
            label3.nextListElement = null;
            label3 = label5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Label getCanonicalInstance() {
        Frame frame = this.frame;
        return frame == null ? this : frame.owner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getOffset() {
        if ((this.flags & 4) != 0) {
            return this.bytecodeOffset;
        }
        C2104o.m5276A("Label offset position has not been resolved yet");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void markSubroutine(short s10) {
        this.nextListElement = EMPTY_LIST;
        Label labelPushSuccessors = this;
        while (labelPushSuccessors != EMPTY_LIST) {
            Label label = labelPushSuccessors.nextListElement;
            labelPushSuccessors.nextListElement = null;
            if (labelPushSuccessors.subroutineId == 0) {
                labelPushSuccessors.subroutineId = s10;
                labelPushSuccessors = labelPushSuccessors.pushSuccessors(label);
            } else {
                labelPushSuccessors = label;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void put(ByteVector byteVector, int i9, boolean z9) {
        if ((this.flags & 4) != 0) {
            int i10 = this.bytecodeOffset;
            if (z9) {
                byteVector.putInt(i10 - i9);
                return;
            } else {
                byteVector.putShort(i10 - i9);
                return;
            }
        }
        if (z9) {
            addForwardReference(i9, FORWARD_REFERENCE_TYPE_WIDE, byteVector.length);
            byteVector.putInt(-1);
        } else {
            addForwardReference(i9, FORWARD_REFERENCE_TYPE_SHORT, byteVector.length);
            byteVector.putShort(-1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean resolve(byte[] bArr, int i9) {
        this.flags = (short) (this.flags | 4);
        this.bytecodeOffset = i9;
        int[] iArr = this.forwardReferences;
        boolean z9 = false;
        if (iArr == null) {
            return false;
        }
        for (int i10 = iArr[0]; i10 > 0; i10 -= 2) {
            int[] iArr2 = this.forwardReferences;
            int i11 = iArr2[i10 - 1];
            int i12 = iArr2[i10];
            int i13 = i9 - i11;
            int i14 = FORWARD_REFERENCE_HANDLE_MASK & i12;
            if ((i12 & FORWARD_REFERENCE_TYPE_MASK) == FORWARD_REFERENCE_TYPE_SHORT) {
                if (i13 < -32768 || i13 > 32767) {
                    int i15 = bArr[i11] & 255;
                    if (i15 < 198) {
                        bArr[i11] = (byte) (i15 + 49);
                    } else {
                        bArr[i11] = (byte) (i15 + 20);
                    }
                    z9 = true;
                }
                bArr[i14] = (byte) (i13 >>> 8);
                bArr[i14 + 1] = (byte) i13;
            } else {
                bArr[i14] = (byte) (i13 >>> 24);
                bArr[i14 + 1] = (byte) (i13 >>> 16);
                bArr[i14 + 2] = (byte) (i13 >>> 8);
                bArr[i14 + 3] = (byte) i13;
            }
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "L" + System.identityHashCode(this);
    }
}
