package bsh.org.objectweb.asm;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class CurrentFrame extends Frame {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CurrentFrame(Label label) {
        super(label);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.org.objectweb.asm.Frame
    public void execute(int i9, int i10, Symbol symbol, SymbolTable symbolTable) {
        super.execute(i9, i10, symbol, symbolTable);
        Frame frame = new Frame(null);
        merge(symbolTable, frame, 0);
        copyFrom(frame);
    }
}
