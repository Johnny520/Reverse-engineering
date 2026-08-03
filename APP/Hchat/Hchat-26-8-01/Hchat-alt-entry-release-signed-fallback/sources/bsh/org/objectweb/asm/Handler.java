package bsh.org.objectweb.asm;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class Handler {
    final int catchType;
    final java.lang.String catchTypeDescriptor;
    final bsh.org.objectweb.asm.Label endPc;
    final bsh.org.objectweb.asm.Label handlerPc;
    bsh.org.objectweb.asm.Handler nextHandler;
    final bsh.org.objectweb.asm.Label startPc;

    public Handler(bsh.org.objectweb.asm.Handler r7, bsh.org.objectweb.asm.Label r8, bsh.org.objectweb.asm.Label r9) {
            r6 = this;
            bsh.org.objectweb.asm.Label r3 = r7.handlerPc
            int r4 = r7.catchType
            java.lang.String r5 = r7.catchTypeDescriptor
            r0 = r6
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            bsh.org.objectweb.asm.Handler r7 = r7.nextHandler
            r0.nextHandler = r7
            return
    }

    public Handler(bsh.org.objectweb.asm.Label r1, bsh.org.objectweb.asm.Label r2, bsh.org.objectweb.asm.Label r3, int r4, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.startPc = r1
            r0.endPc = r2
            r0.handlerPc = r3
            r0.catchType = r4
            r0.catchTypeDescriptor = r5
            return
    }

    public static int getExceptionTableLength(bsh.org.objectweb.asm.Handler r1) {
            r0 = 0
        L1:
            if (r1 == 0) goto L8
            int r0 = r0 + 1
            bsh.org.objectweb.asm.Handler r1 = r1.nextHandler
            goto L1
        L8:
            return r0
    }

    public static int getExceptionTableSize(bsh.org.objectweb.asm.Handler r0) {
            int r0 = getExceptionTableLength(r0)
            int r0 = r0 * 8
            int r0 = r0 + 2
            return r0
    }

    public static void putExceptionTable(bsh.org.objectweb.asm.Handler r2, bsh.org.objectweb.asm.ByteVector r3) {
            int r0 = getExceptionTableLength(r2)
            r3.putShort(r0)
        L7:
            if (r2 == 0) goto L29
            bsh.org.objectweb.asm.Label r0 = r2.startPc
            int r0 = r0.bytecodeOffset
            bsh.org.objectweb.asm.ByteVector r0 = r3.putShort(r0)
            bsh.org.objectweb.asm.Label r1 = r2.endPc
            int r1 = r1.bytecodeOffset
            bsh.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            bsh.org.objectweb.asm.Label r1 = r2.handlerPc
            int r1 = r1.bytecodeOffset
            bsh.org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            int r1 = r2.catchType
            r0.putShort(r1)
            bsh.org.objectweb.asm.Handler r2 = r2.nextHandler
            goto L7
        L29:
            return
    }

    public static bsh.org.objectweb.asm.Handler removeRange(bsh.org.objectweb.asm.Handler r7, bsh.org.objectweb.asm.Label r8, bsh.org.objectweb.asm.Label r9) {
            if (r7 != 0) goto L4
            r7 = 0
            return r7
        L4:
            bsh.org.objectweb.asm.Handler r0 = r7.nextHandler
            bsh.org.objectweb.asm.Handler r0 = removeRange(r0, r8, r9)
            r7.nextHandler = r0
            bsh.org.objectweb.asm.Label r1 = r7.startPc
            int r2 = r1.bytecodeOffset
            bsh.org.objectweb.asm.Label r3 = r7.endPc
            int r4 = r3.bytecodeOffset
            int r5 = r8.bytecodeOffset
            if (r9 != 0) goto L1c
            r6 = 2147483647(0x7fffffff, float:NaN)
            goto L1e
        L1c:
            int r6 = r9.bytecodeOffset
        L1e:
            if (r5 >= r4) goto L45
            if (r6 > r2) goto L23
            goto L45
        L23:
            if (r5 > r2) goto L2e
            if (r6 < r4) goto L28
            return r0
        L28:
            bsh.org.objectweb.asm.Handler r8 = new bsh.org.objectweb.asm.Handler
            r8.<init>(r7, r9, r3)
            return r8
        L2e:
            if (r6 < r4) goto L36
            bsh.org.objectweb.asm.Handler r9 = new bsh.org.objectweb.asm.Handler
            r9.<init>(r7, r1, r8)
            return r9
        L36:
            bsh.org.objectweb.asm.Handler r0 = new bsh.org.objectweb.asm.Handler
            r0.<init>(r7, r9, r3)
            r7.nextHandler = r0
            bsh.org.objectweb.asm.Handler r9 = new bsh.org.objectweb.asm.Handler
            bsh.org.objectweb.asm.Label r0 = r7.startPc
            r9.<init>(r7, r0, r8)
            return r9
        L45:
            return r7
    }
}
