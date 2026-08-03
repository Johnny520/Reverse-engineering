package net.bytebuddy.jar.asm;

/* JADX INFO: loaded from: classes2.dex */
public class Attribute {
    private byte[] content;
    net.bytebuddy.jar.asm.Attribute nextAttribute;
    public final java.lang.String type;

    public static final class Set {
        private static final int SIZE_INCREMENT = 6;
        private net.bytebuddy.jar.asm.Attribute[] data;
        private int size;

        public Set() {
                r1 = this;
                r1.<init>()
                r0 = 6
                net.bytebuddy.jar.asm.Attribute[] r0 = new net.bytebuddy.jar.asm.Attribute[r0]
                r1.data = r0
                return
        }

        private void add(net.bytebuddy.jar.asm.Attribute r5) {
                r4 = this;
                int r0 = r4.size
                net.bytebuddy.jar.asm.Attribute[] r1 = r4.data
                int r2 = r1.length
                if (r0 < r2) goto L12
                int r2 = r1.length
                int r2 = r2 + 6
                net.bytebuddy.jar.asm.Attribute[] r2 = new net.bytebuddy.jar.asm.Attribute[r2]
                r3 = 0
                java.lang.System.arraycopy(r1, r3, r2, r3, r0)
                r4.data = r2
            L12:
                net.bytebuddy.jar.asm.Attribute[] r0 = r4.data
                int r1 = r4.size
                int r2 = r1 + 1
                r4.size = r2
                r0[r1] = r5
                return
        }

        private boolean contains(net.bytebuddy.jar.asm.Attribute r5) {
                r4 = this;
                r0 = 0
                r1 = r0
            L2:
                int r2 = r4.size
                if (r1 >= r2) goto L19
                net.bytebuddy.jar.asm.Attribute[] r2 = r4.data
                r2 = r2[r1]
                java.lang.String r2 = r2.type
                java.lang.String r3 = r5.type
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L16
                r5 = 1
                return r5
            L16:
                int r1 = r1 + 1
                goto L2
            L19:
                return r0
        }

        public void addAttributes(net.bytebuddy.jar.asm.Attribute r2) {
                r1 = this;
            L0:
                if (r2 == 0) goto Le
                boolean r0 = r1.contains(r2)
                if (r0 != 0) goto Lb
                r1.add(r2)
            Lb:
                net.bytebuddy.jar.asm.Attribute r2 = r2.nextAttribute
                goto L0
            Le:
                return
        }

        public net.bytebuddy.jar.asm.Attribute[] toArray() {
                r4 = this;
                int r0 = r4.size
                net.bytebuddy.jar.asm.Attribute[] r1 = new net.bytebuddy.jar.asm.Attribute[r0]
                net.bytebuddy.jar.asm.Attribute[] r2 = r4.data
                r3 = 0
                java.lang.System.arraycopy(r2, r3, r1, r3, r0)
                return r1
        }
    }

    public Attribute(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            return
    }

    public static int computeAttributesSize(net.bytebuddy.jar.asm.SymbolTable r2, int r3, int r4) {
            r0 = r3 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L13
            int r0 = r2.getMajorVersion()
            r1 = 49
            if (r0 >= r1) goto L13
            java.lang.String r0 = "Synthetic"
            r2.addConstantUtf8(r0)
            r0 = 6
            goto L14
        L13:
            r0 = 0
        L14:
            if (r4 == 0) goto L1d
            java.lang.String r4 = "Signature"
            r2.addConstantUtf8(r4)
            int r0 = r0 + 8
        L1d:
            r4 = 131072(0x20000, float:1.83671E-40)
            r3 = r3 & r4
            if (r3 == 0) goto L29
            java.lang.String r3 = "Deprecated"
            r2.addConstantUtf8(r3)
            int r0 = r0 + 6
        L29:
            return r0
    }

    public static void putAttributes(net.bytebuddy.jar.asm.SymbolTable r3, int r4, int r5, net.bytebuddy.jar.asm.ByteVector r6) {
            r0 = r4 & 4096(0x1000, float:5.74E-42)
            r1 = 0
            if (r0 == 0) goto L1a
            int r0 = r3.getMajorVersion()
            r2 = 49
            if (r0 >= r2) goto L1a
            java.lang.String r0 = "Synthetic"
            int r0 = r3.addConstantUtf8(r0)
            net.bytebuddy.jar.asm.ByteVector r0 = r6.putShort(r0)
            r0.putInt(r1)
        L1a:
            if (r5 == 0) goto L2e
            java.lang.String r0 = "Signature"
            int r0 = r3.addConstantUtf8(r0)
            net.bytebuddy.jar.asm.ByteVector r0 = r6.putShort(r0)
            r2 = 2
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putInt(r2)
            r0.putShort(r5)
        L2e:
            r5 = 131072(0x20000, float:1.83671E-40)
            r4 = r4 & r5
            if (r4 == 0) goto L40
            java.lang.String r4 = "Deprecated"
            int r3 = r3.addConstantUtf8(r4)
            net.bytebuddy.jar.asm.ByteVector r3 = r6.putShort(r3)
            r3.putInt(r1)
        L40:
            return
    }

    public final int computeAttributesSize(net.bytebuddy.jar.asm.SymbolTable r7) {
            r6 = this;
            r4 = -1
            r5 = -1
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            int r7 = r0.computeAttributesSize(r1, r2, r3, r4, r5)
            return r7
    }

    public final int computeAttributesSize(net.bytebuddy.jar.asm.SymbolTable r10, byte[] r11, int r12, int r13, int r14) {
            r9 = this;
            net.bytebuddy.jar.asm.ClassWriter r6 = r10.classWriter
            r0 = 0
            r8 = r9
            r7 = r0
        L5:
            if (r8 == 0) goto L1e
            java.lang.String r0 = r8.type
            r10.addConstantUtf8(r0)
            r0 = r8
            r1 = r6
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            net.bytebuddy.jar.asm.ByteVector r0 = r0.write(r1, r2, r3, r4, r5)
            int r0 = r0.length
            int r0 = r0 + 6
            int r7 = r7 + r0
            net.bytebuddy.jar.asm.Attribute r8 = r8.nextAttribute
            goto L5
        L1e:
            return r7
    }

    public final int getAttributeCount() {
            r2 = this;
            r0 = 0
            r1 = r2
        L2:
            if (r1 == 0) goto L9
            int r0 = r0 + 1
            net.bytebuddy.jar.asm.Attribute r1 = r1.nextAttribute
            goto L2
        L9:
            return r0
    }

    public net.bytebuddy.jar.asm.Label[] getLabels() {
            r1 = this;
            r0 = 0
            net.bytebuddy.jar.asm.Label[] r0 = new net.bytebuddy.jar.asm.Label[r0]
            return r0
    }

    public boolean isCodeAttribute() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isUnknown() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final void putAttributes(net.bytebuddy.jar.asm.SymbolTable r8, net.bytebuddy.jar.asm.ByteVector r9) {
            r7 = this;
            r4 = -1
            r5 = -1
            r2 = 0
            r3 = 0
            r0 = r7
            r1 = r8
            r6 = r9
            r0.putAttributes(r1, r2, r3, r4, r5, r6)
            return
    }

    public final void putAttributes(net.bytebuddy.jar.asm.SymbolTable r9, byte[] r10, int r11, int r12, int r13, net.bytebuddy.jar.asm.ByteVector r14) {
            r8 = this;
            net.bytebuddy.jar.asm.ClassWriter r6 = r9.classWriter
            r7 = r8
        L3:
            if (r7 == 0) goto L29
            r0 = r7
            r1 = r6
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            net.bytebuddy.jar.asm.ByteVector r0 = r0.write(r1, r2, r3, r4, r5)
            java.lang.String r1 = r7.type
            int r1 = r9.addConstantUtf8(r1)
            net.bytebuddy.jar.asm.ByteVector r1 = r14.putShort(r1)
            int r2 = r0.length
            r1.putInt(r2)
            byte[] r1 = r0.data
            r2 = 0
            int r0 = r0.length
            r14.putByteArray(r1, r2, r0)
            net.bytebuddy.jar.asm.Attribute r7 = r7.nextAttribute
            goto L3
        L29:
            return
    }

    public net.bytebuddy.jar.asm.Attribute read(net.bytebuddy.jar.asm.ClassReader r1, int r2, int r3, char[] r4, int r5, net.bytebuddy.jar.asm.Label[] r6) {
            r0 = this;
            net.bytebuddy.jar.asm.Attribute r4 = new net.bytebuddy.jar.asm.Attribute
            java.lang.String r5 = r0.type
            r4.<init>(r5)
            byte[] r5 = new byte[r3]
            r4.content = r5
            byte[] r1 = r1.classFileBuffer
            r6 = 0
            java.lang.System.arraycopy(r1, r2, r5, r6, r3)
            return r4
    }

    public net.bytebuddy.jar.asm.ByteVector write(net.bytebuddy.jar.asm.ClassWriter r1, byte[] r2, int r3, int r4, int r5) {
            r0 = this;
            net.bytebuddy.jar.asm.ByteVector r1 = new net.bytebuddy.jar.asm.ByteVector
            byte[] r2 = r0.content
            r1.<init>(r2)
            return r1
    }
}
