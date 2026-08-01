package net.bytebuddy.jar.asm;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
