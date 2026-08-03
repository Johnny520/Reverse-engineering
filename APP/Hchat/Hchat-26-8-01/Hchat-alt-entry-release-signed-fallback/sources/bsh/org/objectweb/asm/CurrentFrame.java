package bsh.org.objectweb.asm;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class CurrentFrame extends bsh.org.objectweb.asm.Frame {
    public CurrentFrame(bsh.org.objectweb.asm.Label r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // bsh.org.objectweb.asm.Frame
    public void execute(int r1, int r2, bsh.org.objectweb.asm.Symbol r3, bsh.org.objectweb.asm.SymbolTable r4) {
            r0 = this;
            super.execute(r1, r2, r3, r4)
            bsh.org.objectweb.asm.Frame r1 = new bsh.org.objectweb.asm.Frame
            r2 = 0
            r1.<init>(r2)
            r2 = 0
            r0.merge(r4, r1, r2)
            r0.copyFrom(r1)
            return
    }
}
