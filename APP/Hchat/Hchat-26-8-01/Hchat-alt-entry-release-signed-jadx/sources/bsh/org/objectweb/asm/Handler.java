package bsh.org.objectweb.asm;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class Handler {
    final int catchType;
    final String catchTypeDescriptor;
    final Label endPc;
    final Label handlerPc;
    Handler nextHandler;
    final Label startPc;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Handler(Handler handler, Label label, Label label2) {
        this(label, label2, handler.handlerPc, handler.catchType, handler.catchTypeDescriptor);
        this.nextHandler = handler.nextHandler;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int getExceptionTableLength(Handler handler) {
        int i9 = 0;
        while (handler != null) {
            i9++;
            handler = handler.nextHandler;
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int getExceptionTableSize(Handler handler) {
        return (getExceptionTableLength(handler) * 8) + 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void putExceptionTable(Handler handler, ByteVector byteVector) {
        byteVector.putShort(getExceptionTableLength(handler));
        while (handler != null) {
            byteVector.putShort(handler.startPc.bytecodeOffset).putShort(handler.endPc.bytecodeOffset).putShort(handler.handlerPc.bytecodeOffset).putShort(handler.catchType);
            handler = handler.nextHandler;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Handler removeRange(Handler handler, Label label, Label label2) {
        if (handler == null) {
            return null;
        }
        Handler handlerRemoveRange = removeRange(handler.nextHandler, label, label2);
        handler.nextHandler = handlerRemoveRange;
        Label label3 = handler.startPc;
        int i9 = label3.bytecodeOffset;
        Label label4 = handler.endPc;
        int i10 = label4.bytecodeOffset;
        int i11 = label.bytecodeOffset;
        int i12 = label2 == null ? Integer.MAX_VALUE : label2.bytecodeOffset;
        if (i11 >= i10 || i12 <= i9) {
            return handler;
        }
        if (i11 <= i9) {
            return i12 >= i10 ? handlerRemoveRange : new Handler(handler, label2, label4);
        }
        if (i12 >= i10) {
            return new Handler(handler, label3, label);
        }
        handler.nextHandler = new Handler(handler, label2, label4);
        return new Handler(handler, handler.startPc, label);
    }

    public Handler(Label label, Label label2, Label label3, int i9, String str) {
        this.startPc = label;
        this.endPc = label2;
        this.handlerPc = label3;
        this.catchType = i9;
        this.catchTypeDescriptor = str;
    }
}
