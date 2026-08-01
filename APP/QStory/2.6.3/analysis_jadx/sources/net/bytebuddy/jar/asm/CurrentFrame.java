package net.bytebuddy.jar.asm;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final class CurrentFrame extends Frame {
    public CurrentFrame(Label label) {
        super(label);
    }

    @Override // net.bytebuddy.jar.asm.Frame
    public void execute(int i, int i2, Symbol symbol, SymbolTable symbolTable) {
        super.execute(i, i2, symbol, symbolTable);
        Frame frame = new Frame(null);
        merge(symbolTable, frame, 0);
        copyFrom(frame);
    }
}
