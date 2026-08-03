package bsh.org.objectweb.asm;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class Attribute {
    private byte[] content;
    bsh.org.objectweb.asm.Attribute nextAttribute;
    public final java.lang.String type;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Set {
        private static final int SIZE_INCREMENT = 6;
        private bsh.org.objectweb.asm.Attribute[] data;
        private int size;

        public Set() {
                r1 = this;
                r1.<init>()
                r0 = 6
                bsh.org.objectweb.asm.Attribute[] r0 = new bsh.org.objectweb.asm.Attribute[r0]
                r1.data = r0
                return
        }

        private void add(bsh.org.objectweb.asm.Attribute r5) {
                r4 = this;
                int r0 = r4.size
                bsh.org.objectweb.asm.Attribute[] r1 = r4.data
                int r2 = r1.length
                if (r0 < r2) goto L12
                int r2 = r1.length
                int r2 = r2 + 6
                bsh.org.objectweb.asm.Attribute[] r2 = new bsh.org.objectweb.asm.Attribute[r2]
                r3 = 0
                java.lang.System.arraycopy(r1, r3, r2, r3, r0)
                r4.data = r2
            L12:
                bsh.org.objectweb.asm.Attribute[] r0 = r4.data
                int r1 = r4.size
                int r2 = r1 + 1
                r4.size = r2
                r0[r1] = r5
                return
        }

        private boolean contains(bsh.org.objectweb.asm.Attribute r5) {
                r4 = this;
                r0 = 0
                r1 = r0
            L2:
                int r2 = r4.size
                if (r1 >= r2) goto L19
                bsh.org.objectweb.asm.Attribute[] r2 = r4.data
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

        public void addAttributes(bsh.org.objectweb.asm.Attribute r2) {
                r1 = this;
            L0:
                if (r2 == 0) goto Le
                boolean r0 = r1.contains(r2)
                if (r0 != 0) goto Lb
                r1.add(r2)
            Lb:
                bsh.org.objectweb.asm.Attribute r2 = r2.nextAttribute
                goto L0
            Le:
                return
        }

        public bsh.org.objectweb.asm.Attribute[] toArray() {
                r4 = this;
                int r0 = r4.size
                bsh.org.objectweb.asm.Attribute[] r1 = new bsh.org.objectweb.asm.Attribute[r0]
                bsh.org.objectweb.asm.Attribute[] r2 = r4.data
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

    public final int computeAttributesSize(bsh.org.objectweb.asm.SymbolTable r7) {
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

    public final int computeAttributesSize(bsh.org.objectweb.asm.SymbolTable r8, byte[] r9, int r10, int r11, int r12) {
            r7 = this;
            bsh.org.objectweb.asm.ClassWriter r1 = r8.classWriter
            r0 = 0
            r6 = r0
            r0 = r7
        L5:
            if (r0 == 0) goto L1d
            java.lang.String r2 = r0.type
            r8.addConstantUtf8(r2)
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            bsh.org.objectweb.asm.ByteVector r9 = r0.write(r1, r2, r3, r4, r5)
            int r9 = r9.length
            int r9 = r9 + 6
            int r6 = r6 + r9
            bsh.org.objectweb.asm.Attribute r0 = r0.nextAttribute
            r9 = r2
            goto L5
        L1d:
            return r6
    }

    public final int getAttributeCount() {
            r2 = this;
            r0 = 0
            r1 = r2
        L2:
            if (r1 == 0) goto L9
            int r0 = r0 + 1
            bsh.org.objectweb.asm.Attribute r1 = r1.nextAttribute
            goto L2
        L9:
            return r0
    }

    public bsh.org.objectweb.asm.Label[] getLabels() {
            r1 = this;
            r0 = 0
            bsh.org.objectweb.asm.Label[] r0 = new bsh.org.objectweb.asm.Label[r0]
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

    public final void putAttributes(bsh.org.objectweb.asm.SymbolTable r8, bsh.org.objectweb.asm.ByteVector r9) {
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

    public final void putAttributes(bsh.org.objectweb.asm.SymbolTable r7, byte[] r8, int r9, int r10, int r11, bsh.org.objectweb.asm.ByteVector r12) {
            r6 = this;
            bsh.org.objectweb.asm.ClassWriter r1 = r7.classWriter
            r0 = r6
        L3:
            if (r0 == 0) goto L2a
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            bsh.org.objectweb.asm.ByteVector r8 = r0.write(r1, r2, r3, r4, r5)
            java.lang.String r9 = r0.type
            int r9 = r7.addConstantUtf8(r9)
            bsh.org.objectweb.asm.ByteVector r9 = r12.putShort(r9)
            int r10 = r8.length
            r9.putInt(r10)
            byte[] r9 = r8.data
            r10 = 0
            int r8 = r8.length
            r12.putByteArray(r9, r10, r8)
            bsh.org.objectweb.asm.Attribute r0 = r0.nextAttribute
            r8 = r2
            r9 = r3
            r10 = r4
            goto L3
        L2a:
            return
    }

    public bsh.org.objectweb.asm.ByteVector write(bsh.org.objectweb.asm.ClassWriter r1, byte[] r2, int r3, int r4, int r5) {
            r0 = this;
            bsh.org.objectweb.asm.ByteVector r1 = new bsh.org.objectweb.asm.ByteVector
            byte[] r2 = r0.content
            r1.<init>(r2)
            return r1
    }
}
