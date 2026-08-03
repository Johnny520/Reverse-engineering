package net.bytebuddy.jar.asm;

/* JADX INFO: loaded from: classes2.dex */
final class CurrentFrame extends net.bytebuddy.jar.asm.Frame {
    public CurrentFrame(net.bytebuddy.jar.asm.Label r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // net.bytebuddy.jar.asm.Frame
    public void execute(int r1, int r2, net.bytebuddy.jar.asm.Symbol r3, net.bytebuddy.jar.asm.SymbolTable r4) {
            r0 = this;
            super.execute(r1, r2, r3, r4)
            net.bytebuddy.jar.asm.Frame r1 = new net.bytebuddy.jar.asm.Frame
            r2 = 0
            r1.<init>(r2)
            r2 = 0
            r0.merge(r4, r1, r2)
            r0.copyFrom(r1)
            return
    }
}
