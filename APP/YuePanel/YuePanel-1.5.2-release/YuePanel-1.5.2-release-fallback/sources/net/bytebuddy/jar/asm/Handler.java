package net.bytebuddy.jar.asm;

/* JADX INFO: loaded from: classes2.dex */
final class Handler {
    final int catchType;
    final java.lang.String catchTypeDescriptor;
    final net.bytebuddy.jar.asm.Label endPc;
    final net.bytebuddy.jar.asm.Label handlerPc;
    net.bytebuddy.jar.asm.Handler nextHandler;
    final net.bytebuddy.jar.asm.Label startPc;

    public Handler(net.bytebuddy.jar.asm.Handler r7, net.bytebuddy.jar.asm.Label r8, net.bytebuddy.jar.asm.Label r9) {
            r6 = this;
            net.bytebuddy.jar.asm.Label r3 = r7.handlerPc
            int r4 = r7.catchType
            java.lang.String r5 = r7.catchTypeDescriptor
            r0 = r6
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            net.bytebuddy.jar.asm.Handler r7 = r7.nextHandler
            r6.nextHandler = r7
            return
    }

    public Handler(net.bytebuddy.jar.asm.Label r1, net.bytebuddy.jar.asm.Label r2, net.bytebuddy.jar.asm.Label r3, int r4, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.startPc = r1
            r0.endPc = r2
            r0.handlerPc = r3
            r0.catchType = r4
            r0.catchTypeDescriptor = r5
            return
    }

    public static int getExceptionTableLength(net.bytebuddy.jar.asm.Handler r1) {
            r0 = 0
        L1:
            if (r1 == 0) goto L8
            int r0 = r0 + 1
            net.bytebuddy.jar.asm.Handler r1 = r1.nextHandler
            goto L1
        L8:
            return r0
    }

    public static int getExceptionTableSize(net.bytebuddy.jar.asm.Handler r0) {
            int r0 = getExceptionTableLength(r0)
            int r0 = r0 * 8
            int r0 = r0 + 2
            return r0
    }

    public static void putExceptionTable(net.bytebuddy.jar.asm.Handler r2, net.bytebuddy.jar.asm.ByteVector r3) {
            int r0 = getExceptionTableLength(r2)
            r3.putShort(r0)
        L7:
            if (r2 == 0) goto L29
            net.bytebuddy.jar.asm.Label r0 = r2.startPc
            int r0 = r0.bytecodeOffset
            net.bytebuddy.jar.asm.ByteVector r0 = r3.putShort(r0)
            net.bytebuddy.jar.asm.Label r1 = r2.endPc
            int r1 = r1.bytecodeOffset
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putShort(r1)
            net.bytebuddy.jar.asm.Label r1 = r2.handlerPc
            int r1 = r1.bytecodeOffset
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putShort(r1)
            int r1 = r2.catchType
            r0.putShort(r1)
            net.bytebuddy.jar.asm.Handler r2 = r2.nextHandler
            goto L7
        L29:
            return
    }

    public static net.bytebuddy.jar.asm.Handler removeRange(net.bytebuddy.jar.asm.Handler r7, net.bytebuddy.jar.asm.Label r8, net.bytebuddy.jar.asm.Label r9) {
            if (r7 != 0) goto L4
            r7 = 0
            return r7
        L4:
            net.bytebuddy.jar.asm.Handler r0 = r7.nextHandler
            net.bytebuddy.jar.asm.Handler r0 = removeRange(r0, r8, r9)
            r7.nextHandler = r0
            net.bytebuddy.jar.asm.Label r1 = r7.startPc
            int r2 = r1.bytecodeOffset
            net.bytebuddy.jar.asm.Label r3 = r7.endPc
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
            net.bytebuddy.jar.asm.Handler r8 = new net.bytebuddy.jar.asm.Handler
            r8.<init>(r7, r9, r3)
            return r8
        L2e:
            if (r6 < r4) goto L36
            net.bytebuddy.jar.asm.Handler r9 = new net.bytebuddy.jar.asm.Handler
            r9.<init>(r7, r1, r8)
            return r9
        L36:
            net.bytebuddy.jar.asm.Handler r0 = new net.bytebuddy.jar.asm.Handler
            r0.<init>(r7, r9, r3)
            r7.nextHandler = r0
            net.bytebuddy.jar.asm.Handler r9 = new net.bytebuddy.jar.asm.Handler
            net.bytebuddy.jar.asm.Label r0 = r7.startPc
            r9.<init>(r7, r0, r8)
            return r9
        L45:
            return r7
    }
}
