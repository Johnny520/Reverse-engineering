package net.bytebuddy.jar.asm;

/* JADX INFO: loaded from: classes2.dex */
final class ModuleWriter extends net.bytebuddy.jar.asm.ModuleVisitor {
    private final net.bytebuddy.jar.asm.ByteVector exports;
    private int exportsCount;
    private int mainClassIndex;
    private final int moduleFlags;
    private final int moduleNameIndex;
    private final int moduleVersionIndex;
    private final net.bytebuddy.jar.asm.ByteVector opens;
    private int opensCount;
    private int packageCount;
    private final net.bytebuddy.jar.asm.ByteVector packageIndex;
    private final net.bytebuddy.jar.asm.ByteVector provides;
    private int providesCount;
    private final net.bytebuddy.jar.asm.ByteVector requires;
    private int requiresCount;
    private final net.bytebuddy.jar.asm.SymbolTable symbolTable;
    private int usesCount;
    private final net.bytebuddy.jar.asm.ByteVector usesIndex;

    public ModuleWriter(net.bytebuddy.jar.asm.SymbolTable r2, int r3, int r4, int r5) {
            r1 = this;
            r0 = 589824(0x90000, float:8.2652E-40)
            r1.<init>(r0)
            r1.symbolTable = r2
            r1.moduleNameIndex = r3
            r1.moduleFlags = r4
            r1.moduleVersionIndex = r5
            net.bytebuddy.jar.asm.ByteVector r2 = new net.bytebuddy.jar.asm.ByteVector
            r2.<init>()
            r1.requires = r2
            net.bytebuddy.jar.asm.ByteVector r2 = new net.bytebuddy.jar.asm.ByteVector
            r2.<init>()
            r1.exports = r2
            net.bytebuddy.jar.asm.ByteVector r2 = new net.bytebuddy.jar.asm.ByteVector
            r2.<init>()
            r1.opens = r2
            net.bytebuddy.jar.asm.ByteVector r2 = new net.bytebuddy.jar.asm.ByteVector
            r2.<init>()
            r1.usesIndex = r2
            net.bytebuddy.jar.asm.ByteVector r2 = new net.bytebuddy.jar.asm.ByteVector
            r2.<init>()
            r1.provides = r2
            net.bytebuddy.jar.asm.ByteVector r2 = new net.bytebuddy.jar.asm.ByteVector
            r2.<init>()
            r1.packageIndex = r2
            return
    }

    public int computeAttributesSize() {
            r3 = this;
            net.bytebuddy.jar.asm.SymbolTable r0 = r3.symbolTable
            java.lang.String r1 = "Module"
            r0.addConstantUtf8(r1)
            net.bytebuddy.jar.asm.ByteVector r0 = r3.requires
            int r0 = r0.length
            int r0 = r0 + 22
            net.bytebuddy.jar.asm.ByteVector r1 = r3.exports
            int r1 = r1.length
            int r0 = r0 + r1
            net.bytebuddy.jar.asm.ByteVector r1 = r3.opens
            int r1 = r1.length
            int r0 = r0 + r1
            net.bytebuddy.jar.asm.ByteVector r1 = r3.usesIndex
            int r1 = r1.length
            int r0 = r0 + r1
            net.bytebuddy.jar.asm.ByteVector r1 = r3.provides
            int r1 = r1.length
            int r0 = r0 + r1
            int r1 = r3.packageCount
            if (r1 <= 0) goto L33
            net.bytebuddy.jar.asm.SymbolTable r1 = r3.symbolTable
            java.lang.String r2 = "ModulePackages"
            r1.addConstantUtf8(r2)
            net.bytebuddy.jar.asm.ByteVector r1 = r3.packageIndex
            int r1 = r1.length
            int r1 = r1 + 8
            int r0 = r0 + r1
        L33:
            int r1 = r3.mainClassIndex
            if (r1 <= 0) goto L40
            net.bytebuddy.jar.asm.SymbolTable r1 = r3.symbolTable
            java.lang.String r2 = "ModuleMainClass"
            r1.addConstantUtf8(r2)
            int r0 = r0 + 8
        L40:
            return r0
    }

    public int getAttributeCount() {
            r4 = this;
            int r0 = r4.packageCount
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            int r0 = r0 + r2
            int r3 = r4.mainClassIndex
            if (r3 <= 0) goto Lf
            r1 = r2
        Lf:
            int r0 = r0 + r1
            return r0
    }

    public void putAttributes(net.bytebuddy.jar.asm.ByteVector r6) {
            r5 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = r5.requires
            int r0 = r0.length
            int r0 = r0 + 16
            net.bytebuddy.jar.asm.ByteVector r1 = r5.exports
            int r1 = r1.length
            int r0 = r0 + r1
            net.bytebuddy.jar.asm.ByteVector r1 = r5.opens
            int r1 = r1.length
            int r0 = r0 + r1
            net.bytebuddy.jar.asm.ByteVector r1 = r5.usesIndex
            int r1 = r1.length
            int r0 = r0 + r1
            net.bytebuddy.jar.asm.ByteVector r1 = r5.provides
            int r1 = r1.length
            int r0 = r0 + r1
            net.bytebuddy.jar.asm.SymbolTable r1 = r5.symbolTable
            java.lang.String r2 = "Module"
            int r1 = r1.addConstantUtf8(r2)
            net.bytebuddy.jar.asm.ByteVector r1 = r6.putShort(r1)
            net.bytebuddy.jar.asm.ByteVector r0 = r1.putInt(r0)
            int r1 = r5.moduleNameIndex
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putShort(r1)
            int r1 = r5.moduleFlags
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putShort(r1)
            int r1 = r5.moduleVersionIndex
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putShort(r1)
            int r1 = r5.requiresCount
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putShort(r1)
            net.bytebuddy.jar.asm.ByteVector r1 = r5.requires
            byte[] r2 = r1.data
            int r1 = r1.length
            r3 = 0
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putByteArray(r2, r3, r1)
            int r1 = r5.exportsCount
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putShort(r1)
            net.bytebuddy.jar.asm.ByteVector r1 = r5.exports
            byte[] r2 = r1.data
            int r1 = r1.length
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putByteArray(r2, r3, r1)
            int r1 = r5.opensCount
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putShort(r1)
            net.bytebuddy.jar.asm.ByteVector r1 = r5.opens
            byte[] r2 = r1.data
            int r1 = r1.length
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putByteArray(r2, r3, r1)
            int r1 = r5.usesCount
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putShort(r1)
            net.bytebuddy.jar.asm.ByteVector r1 = r5.usesIndex
            byte[] r2 = r1.data
            int r1 = r1.length
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putByteArray(r2, r3, r1)
            int r1 = r5.providesCount
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putShort(r1)
            net.bytebuddy.jar.asm.ByteVector r1 = r5.provides
            byte[] r2 = r1.data
            int r1 = r1.length
            r0.putByteArray(r2, r3, r1)
            int r0 = r5.packageCount
            r1 = 2
            if (r0 <= 0) goto Lb5
            net.bytebuddy.jar.asm.SymbolTable r0 = r5.symbolTable
            java.lang.String r2 = "ModulePackages"
            int r0 = r0.addConstantUtf8(r2)
            net.bytebuddy.jar.asm.ByteVector r0 = r6.putShort(r0)
            net.bytebuddy.jar.asm.ByteVector r2 = r5.packageIndex
            int r2 = r2.length
            int r2 = r2 + r1
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putInt(r2)
            int r2 = r5.packageCount
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putShort(r2)
            net.bytebuddy.jar.asm.ByteVector r2 = r5.packageIndex
            byte[] r4 = r2.data
            int r2 = r2.length
            r0.putByteArray(r4, r3, r2)
        Lb5:
            int r0 = r5.mainClassIndex
            if (r0 <= 0) goto Lce
            net.bytebuddy.jar.asm.SymbolTable r0 = r5.symbolTable
            java.lang.String r2 = "ModuleMainClass"
            int r0 = r0.addConstantUtf8(r2)
            net.bytebuddy.jar.asm.ByteVector r6 = r6.putShort(r0)
            net.bytebuddy.jar.asm.ByteVector r6 = r6.putInt(r1)
            int r0 = r5.mainClassIndex
            r6.putShort(r0)
        Lce:
            return
    }

    @Override // net.bytebuddy.jar.asm.ModuleVisitor
    public void visitEnd() {
            r0 = this;
            return
    }

    @Override // net.bytebuddy.jar.asm.ModuleVisitor
    public void visitExport(java.lang.String r4, int r5, java.lang.String... r6) {
            r3 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = r3.exports
            net.bytebuddy.jar.asm.SymbolTable r1 = r3.symbolTable
            net.bytebuddy.jar.asm.Symbol r4 = r1.addConstantPackage(r4)
            int r4 = r4.index
            net.bytebuddy.jar.asm.ByteVector r4 = r0.putShort(r4)
            r4.putShort(r5)
            r4 = 0
            if (r6 != 0) goto L1a
            net.bytebuddy.jar.asm.ByteVector r5 = r3.exports
            r5.putShort(r4)
            goto L35
        L1a:
            net.bytebuddy.jar.asm.ByteVector r5 = r3.exports
            int r0 = r6.length
            r5.putShort(r0)
            int r5 = r6.length
        L21:
            if (r4 >= r5) goto L35
            r0 = r6[r4]
            net.bytebuddy.jar.asm.ByteVector r1 = r3.exports
            net.bytebuddy.jar.asm.SymbolTable r2 = r3.symbolTable
            net.bytebuddy.jar.asm.Symbol r0 = r2.addConstantModule(r0)
            int r0 = r0.index
            r1.putShort(r0)
            int r4 = r4 + 1
            goto L21
        L35:
            int r4 = r3.exportsCount
            int r4 = r4 + 1
            r3.exportsCount = r4
            return
    }

    @Override // net.bytebuddy.jar.asm.ModuleVisitor
    public void visitMainClass(java.lang.String r2) {
            r1 = this;
            net.bytebuddy.jar.asm.SymbolTable r0 = r1.symbolTable
            net.bytebuddy.jar.asm.Symbol r2 = r0.addConstantClass(r2)
            int r2 = r2.index
            r1.mainClassIndex = r2
            return
    }

    @Override // net.bytebuddy.jar.asm.ModuleVisitor
    public void visitOpen(java.lang.String r4, int r5, java.lang.String... r6) {
            r3 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = r3.opens
            net.bytebuddy.jar.asm.SymbolTable r1 = r3.symbolTable
            net.bytebuddy.jar.asm.Symbol r4 = r1.addConstantPackage(r4)
            int r4 = r4.index
            net.bytebuddy.jar.asm.ByteVector r4 = r0.putShort(r4)
            r4.putShort(r5)
            r4 = 0
            if (r6 != 0) goto L1a
            net.bytebuddy.jar.asm.ByteVector r5 = r3.opens
            r5.putShort(r4)
            goto L35
        L1a:
            net.bytebuddy.jar.asm.ByteVector r5 = r3.opens
            int r0 = r6.length
            r5.putShort(r0)
            int r5 = r6.length
        L21:
            if (r4 >= r5) goto L35
            r0 = r6[r4]
            net.bytebuddy.jar.asm.ByteVector r1 = r3.opens
            net.bytebuddy.jar.asm.SymbolTable r2 = r3.symbolTable
            net.bytebuddy.jar.asm.Symbol r0 = r2.addConstantModule(r0)
            int r0 = r0.index
            r1.putShort(r0)
            int r4 = r4 + 1
            goto L21
        L35:
            int r4 = r3.opensCount
            int r4 = r4 + 1
            r3.opensCount = r4
            return
    }

    @Override // net.bytebuddy.jar.asm.ModuleVisitor
    public void visitPackage(java.lang.String r3) {
            r2 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = r2.packageIndex
            net.bytebuddy.jar.asm.SymbolTable r1 = r2.symbolTable
            net.bytebuddy.jar.asm.Symbol r3 = r1.addConstantPackage(r3)
            int r3 = r3.index
            r0.putShort(r3)
            int r3 = r2.packageCount
            int r3 = r3 + 1
            r2.packageCount = r3
            return
    }

    @Override // net.bytebuddy.jar.asm.ModuleVisitor
    public void visitProvide(java.lang.String r5, java.lang.String... r6) {
            r4 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = r4.provides
            net.bytebuddy.jar.asm.SymbolTable r1 = r4.symbolTable
            net.bytebuddy.jar.asm.Symbol r5 = r1.addConstantClass(r5)
            int r5 = r5.index
            r0.putShort(r5)
            net.bytebuddy.jar.asm.ByteVector r5 = r4.provides
            int r0 = r6.length
            r5.putShort(r0)
            int r5 = r6.length
            r0 = 0
        L15:
            if (r0 >= r5) goto L29
            r1 = r6[r0]
            net.bytebuddy.jar.asm.ByteVector r2 = r4.provides
            net.bytebuddy.jar.asm.SymbolTable r3 = r4.symbolTable
            net.bytebuddy.jar.asm.Symbol r1 = r3.addConstantClass(r1)
            int r1 = r1.index
            r2.putShort(r1)
            int r0 = r0 + 1
            goto L15
        L29:
            int r5 = r4.providesCount
            int r5 = r5 + 1
            r4.providesCount = r5
            return
    }

    @Override // net.bytebuddy.jar.asm.ModuleVisitor
    public void visitRequire(java.lang.String r3, int r4, java.lang.String r5) {
            r2 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = r2.requires
            net.bytebuddy.jar.asm.SymbolTable r1 = r2.symbolTable
            net.bytebuddy.jar.asm.Symbol r3 = r1.addConstantModule(r3)
            int r3 = r3.index
            net.bytebuddy.jar.asm.ByteVector r3 = r0.putShort(r3)
            net.bytebuddy.jar.asm.ByteVector r3 = r3.putShort(r4)
            if (r5 != 0) goto L16
            r4 = 0
            goto L1c
        L16:
            net.bytebuddy.jar.asm.SymbolTable r4 = r2.symbolTable
            int r4 = r4.addConstantUtf8(r5)
        L1c:
            r3.putShort(r4)
            int r3 = r2.requiresCount
            int r3 = r3 + 1
            r2.requiresCount = r3
            return
    }

    @Override // net.bytebuddy.jar.asm.ModuleVisitor
    public void visitUse(java.lang.String r3) {
            r2 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = r2.usesIndex
            net.bytebuddy.jar.asm.SymbolTable r1 = r2.symbolTable
            net.bytebuddy.jar.asm.Symbol r3 = r1.addConstantClass(r3)
            int r3 = r3.index
            r0.putShort(r3)
            int r3 = r2.usesCount
            int r3 = r3 + 1
            r2.usesCount = r3
            return
    }
}
