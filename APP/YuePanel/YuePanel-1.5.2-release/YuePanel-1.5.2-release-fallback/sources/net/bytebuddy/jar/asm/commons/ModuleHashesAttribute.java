package net.bytebuddy.jar.asm.commons;

/* JADX INFO: loaded from: classes2.dex */
public final class ModuleHashesAttribute extends net.bytebuddy.jar.asm.Attribute {
    public java.lang.String algorithm;
    public java.util.List<byte[]> hashes;
    public java.util.List<java.lang.String> modules;

    public ModuleHashesAttribute() {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0, r0)
            return
    }

    public ModuleHashesAttribute(java.lang.String r2, java.util.List<java.lang.String> r3, java.util.List<byte[]> r4) {
            r1 = this;
            java.lang.String r0 = "ModuleHashes"
            r1.<init>(r0)
            r1.algorithm = r2
            r1.modules = r3
            r1.hashes = r4
            return
    }

    @Override // net.bytebuddy.jar.asm.Attribute
    public net.bytebuddy.jar.asm.Attribute read(net.bytebuddy.jar.asm.ClassReader r8, int r9, int r10, char[] r11, int r12, net.bytebuddy.jar.asm.Label[] r13) {
            r7 = this;
            java.lang.String r10 = r8.readUTF8(r9, r11)
            int r12 = r9 + 2
            int r12 = r8.readUnsignedShort(r12)
            int r9 = r9 + 4
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r12)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r12)
            r1 = 0
            r2 = r1
        L18:
            if (r2 >= r12) goto L40
            java.lang.String r3 = r8.readModule(r9, r11)
            int r4 = r9 + 2
            r13.add(r3)
            int r3 = r8.readUnsignedShort(r4)
            int r9 = r9 + 4
            byte[] r4 = new byte[r3]
            r5 = r1
        L2c:
            if (r5 >= r3) goto L3a
            int r6 = r8.readByte(r9)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r9 = r9 + 1
            int r5 = r5 + 1
            goto L2c
        L3a:
            r0.add(r4)
            int r2 = r2 + 1
            goto L18
        L40:
            net.bytebuddy.jar.asm.commons.ModuleHashesAttribute r8 = new net.bytebuddy.jar.asm.commons.ModuleHashesAttribute
            r8.<init>(r10, r13, r0)
            return r8
    }

    @Override // net.bytebuddy.jar.asm.Attribute
    public net.bytebuddy.jar.asm.ByteVector write(net.bytebuddy.jar.asm.ClassWriter r4, byte[] r5, int r6, int r7, int r8) {
            r3 = this;
            net.bytebuddy.jar.asm.ByteVector r5 = new net.bytebuddy.jar.asm.ByteVector
            r5.<init>()
            java.lang.String r6 = r3.algorithm
            int r6 = r4.newUTF8(r6)
            r5.putShort(r6)
            java.util.List<java.lang.String> r6 = r3.modules
            r7 = 0
            if (r6 != 0) goto L17
            r5.putShort(r7)
            goto L45
        L17:
            int r6 = r6.size()
            r5.putShort(r6)
            r8 = r7
        L1f:
            if (r8 >= r6) goto L45
            java.util.List<java.lang.String> r0 = r3.modules
            java.lang.Object r0 = r0.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.util.List<byte[]> r1 = r3.hashes
            java.lang.Object r1 = r1.get(r8)
            byte[] r1 = (byte[]) r1
            int r0 = r4.newModule(r0)
            net.bytebuddy.jar.asm.ByteVector r0 = r5.putShort(r0)
            int r2 = r1.length
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putShort(r2)
            int r2 = r1.length
            r0.putByteArray(r1, r7, r2)
            int r8 = r8 + 1
            goto L1f
        L45:
            return r5
    }
}
