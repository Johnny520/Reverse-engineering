package bsh.org.objectweb.asm;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class Label {
    static final bsh.org.objectweb.asm.Label EMPTY_LIST = null;
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
    bsh.org.objectweb.asm.Frame frame;
    public java.lang.Object info;
    short inputStackSize;
    private short lineNumber;
    bsh.org.objectweb.asm.Label nextBasicBlock;
    bsh.org.objectweb.asm.Label nextListElement;
    private int[] otherLineNumbers;
    bsh.org.objectweb.asm.Edge outgoingEdges;
    short outputStackMax;
    short outputStackSize;
    short subroutineId;

    static {
            bsh.org.objectweb.asm.Label r0 = new bsh.org.objectweb.asm.Label
            r0.<init>()
            bsh.org.objectweb.asm.Label.EMPTY_LIST = r0
            return
    }

    public Label() {
            r0 = this;
            r0.<init>()
            return
    }

    private void addForwardReference(int r7, int r8, int r9) {
            r6 = this;
            int[] r0 = r6.forwardReferences
            r1 = 6
            if (r0 != 0) goto L9
            int[] r0 = new int[r1]
            r6.forwardReferences = r0
        L9:
            int[] r0 = r6.forwardReferences
            r2 = 0
            r3 = r0[r2]
            int r4 = r3 + 2
            int r5 = r0.length
            if (r4 < r5) goto L1d
            int r4 = r0.length
            int r4 = r4 + r1
            int[] r1 = new int[r4]
            int r4 = r0.length
            java.lang.System.arraycopy(r0, r2, r1, r2, r4)
            r6.forwardReferences = r1
        L1d:
            int[] r0 = r6.forwardReferences
            int r1 = r3 + 1
            r0[r1] = r7
            int r3 = r3 + 2
            r7 = r8 | r9
            r0[r3] = r7
            r0[r2] = r3
            return
    }

    private bsh.org.objectweb.asm.Label pushSuccessors(bsh.org.objectweb.asm.Label r4) {
            r3 = this;
            bsh.org.objectweb.asm.Edge r0 = r3.outgoingEdges
        L2:
            if (r0 == 0) goto L1d
            short r1 = r3.flags
            r1 = r1 & 16
            if (r1 == 0) goto L11
            bsh.org.objectweb.asm.Edge r1 = r3.outgoingEdges
            bsh.org.objectweb.asm.Edge r1 = r1.nextEdge
            if (r0 != r1) goto L11
            goto L1a
        L11:
            bsh.org.objectweb.asm.Label r1 = r0.successor
            bsh.org.objectweb.asm.Label r2 = r1.nextListElement
            if (r2 != 0) goto L1a
            r1.nextListElement = r4
            r4 = r1
        L1a:
            bsh.org.objectweb.asm.Edge r0 = r0.nextEdge
            goto L2
        L1d:
            return r4
    }

    public final void accept(bsh.org.objectweb.asm.MethodVisitor r3, boolean r4) {
            r2 = this;
            r3.visitLabel(r2)
            if (r4 == 0) goto L24
            short r4 = r2.lineNumber
            if (r4 == 0) goto L24
            r0 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r0
            r3.visitLineNumber(r4, r2)
            int[] r4 = r2.otherLineNumbers
            if (r4 == 0) goto L24
            r4 = 1
        L15:
            int[] r0 = r2.otherLineNumbers
            r1 = 0
            r1 = r0[r1]
            if (r4 > r1) goto L24
            r0 = r0[r4]
            r3.visitLineNumber(r0, r2)
            int r4 = r4 + 1
            goto L15
        L24:
            return
    }

    public final void addLineNumber(int r6) {
            r5 = this;
            short r0 = r5.lineNumber
            if (r0 != 0) goto L8
            short r6 = (short) r6
            r5.lineNumber = r6
            return
        L8:
            int[] r0 = r5.otherLineNumbers
            r1 = 4
            if (r0 != 0) goto L11
            int[] r0 = new int[r1]
            r5.otherLineNumbers = r0
        L11:
            int[] r0 = r5.otherLineNumbers
            r2 = 0
            r3 = r0[r2]
            int r3 = r3 + 1
            r0[r2] = r3
            int r4 = r0.length
            if (r3 < r4) goto L27
            int r4 = r0.length
            int r4 = r4 + r1
            int[] r1 = new int[r4]
            int r4 = r0.length
            java.lang.System.arraycopy(r0, r2, r1, r2, r4)
            r5.otherLineNumbers = r1
        L27:
            int[] r0 = r5.otherLineNumbers
            r0[r3] = r6
            return
    }

    public final void addSubroutineRetSuccessors(bsh.org.objectweb.asm.Label r8) {
            r7 = this;
            bsh.org.objectweb.asm.Label r0 = bsh.org.objectweb.asm.Label.EMPTY_LIST
            r7.nextListElement = r0
            r1 = r0
            r0 = r7
        L6:
            bsh.org.objectweb.asm.Label r2 = bsh.org.objectweb.asm.Label.EMPTY_LIST
            if (r0 == r2) goto L31
            bsh.org.objectweb.asm.Label r2 = r0.nextListElement
            r0.nextListElement = r1
            short r1 = r0.flags
            r1 = r1 & 64
            if (r1 == 0) goto L29
            short r1 = r0.subroutineId
            short r3 = r8.subroutineId
            if (r1 == r3) goto L29
            bsh.org.objectweb.asm.Edge r1 = new bsh.org.objectweb.asm.Edge
            short r3 = r0.outputStackSize
            bsh.org.objectweb.asm.Edge r4 = r8.outgoingEdges
            bsh.org.objectweb.asm.Label r4 = r4.successor
            bsh.org.objectweb.asm.Edge r5 = r0.outgoingEdges
            r1.<init>(r3, r4, r5)
            r0.outgoingEdges = r1
        L29:
            bsh.org.objectweb.asm.Label r1 = r0.pushSuccessors(r2)
            r6 = r1
            r1 = r0
            r0 = r6
            goto L6
        L31:
            bsh.org.objectweb.asm.Label r8 = bsh.org.objectweb.asm.Label.EMPTY_LIST
            if (r1 == r8) goto L3c
            bsh.org.objectweb.asm.Label r8 = r1.nextListElement
            r0 = 0
            r1.nextListElement = r0
            r1 = r8
            goto L31
        L3c:
            return
    }

    public final bsh.org.objectweb.asm.Label getCanonicalInstance() {
            r1 = this;
            bsh.org.objectweb.asm.Frame r0 = r1.frame
            if (r0 != 0) goto L5
            return r1
        L5:
            bsh.org.objectweb.asm.Label r0 = r0.owner
            return r0
    }

    public int getOffset() {
            r1 = this;
            short r0 = r1.flags
            r0 = r0 & 4
            if (r0 == 0) goto L9
            int r0 = r1.bytecodeOffset
            return r0
        L9:
            java.lang.String r0 = "Label offset position has not been resolved yet"
            j8.o.A(r0)
            r0 = 0
            return r0
    }

    public final void markSubroutine(short r4) {
            r3 = this;
            bsh.org.objectweb.asm.Label r0 = bsh.org.objectweb.asm.Label.EMPTY_LIST
            r3.nextListElement = r0
            r0 = r3
        L5:
            bsh.org.objectweb.asm.Label r1 = bsh.org.objectweb.asm.Label.EMPTY_LIST
            if (r0 == r1) goto L1b
            bsh.org.objectweb.asm.Label r1 = r0.nextListElement
            r2 = 0
            r0.nextListElement = r2
            short r2 = r0.subroutineId
            if (r2 != 0) goto L19
            r0.subroutineId = r4
            bsh.org.objectweb.asm.Label r0 = r0.pushSuccessors(r1)
            goto L5
        L19:
            r0 = r1
            goto L5
        L1b:
            return
    }

    public final void put(bsh.org.objectweb.asm.ByteVector r3, int r4, boolean r5) {
            r2 = this;
            short r0 = r2.flags
            r0 = r0 & 4
            if (r0 != 0) goto L1f
            r0 = -1
            if (r5 == 0) goto L14
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            int r1 = r3.length
            r2.addForwardReference(r4, r5, r1)
            r3.putInt(r0)
            return
        L14:
            r5 = 268435456(0x10000000, float:2.524355E-29)
            int r1 = r3.length
            r2.addForwardReference(r4, r5, r1)
            r3.putShort(r0)
            return
        L1f:
            int r0 = r2.bytecodeOffset
            if (r5 == 0) goto L28
            int r0 = r0 - r4
            r3.putInt(r0)
            return
        L28:
            int r0 = r0 - r4
            r3.putShort(r0)
            return
    }

    public final boolean resolve(byte[] r8, int r9) {
            r7 = this;
            short r0 = r7.flags
            r0 = r0 | 4
            short r0 = (short) r0
            r7.flags = r0
            r7.bytecodeOffset = r9
            int[] r0 = r7.forwardReferences
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0 = r0[r1]
        L11:
            if (r0 <= 0) goto L6a
            int[] r2 = r7.forwardReferences
            int r3 = r0 + (-1)
            r3 = r2[r3]
            r2 = r2[r0]
            int r4 = r9 - r3
            r5 = 268435455(0xfffffff, float:2.5243547E-29)
            r5 = r5 & r2
            r6 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r2 = r2 & r6
            r6 = 268435456(0x10000000, float:2.524355E-29)
            if (r2 != r6) goto L4f
            r2 = -32768(0xffffffffffff8000, float:NaN)
            if (r4 < r2) goto L30
            r2 = 32767(0x7fff, float:4.5916E-41)
            if (r4 <= r2) goto L44
        L30:
            r1 = r8[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 198(0xc6, float:2.77E-43)
            if (r1 >= r2) goto L3e
            int r1 = r1 + 49
            byte r1 = (byte) r1
            r8[r3] = r1
            goto L43
        L3e:
            int r1 = r1 + 20
            byte r1 = (byte) r1
            r8[r3] = r1
        L43:
            r1 = 1
        L44:
            int r2 = r5 + 1
            int r3 = r4 >>> 8
            byte r3 = (byte) r3
            r8[r5] = r3
            byte r3 = (byte) r4
            r8[r2] = r3
            goto L67
        L4f:
            int r2 = r5 + 1
            int r3 = r4 >>> 24
            byte r3 = (byte) r3
            r8[r5] = r3
            int r3 = r5 + 2
            int r6 = r4 >>> 16
            byte r6 = (byte) r6
            r8[r2] = r6
            int r5 = r5 + 3
            int r2 = r4 >>> 8
            byte r2 = (byte) r2
            r8[r3] = r2
            byte r2 = (byte) r4
            r8[r5] = r2
        L67:
            int r0 = r0 + (-2)
            goto L11
        L6a:
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "L"
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
