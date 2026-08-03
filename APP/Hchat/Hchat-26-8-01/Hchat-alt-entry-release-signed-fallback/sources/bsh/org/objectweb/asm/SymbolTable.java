package bsh.org.objectweb.asm;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class SymbolTable {
    private int bootstrapMethodCount;
    private bsh.org.objectweb.asm.ByteVector bootstrapMethods;
    private java.lang.String className;
    final bsh.org.objectweb.asm.ClassWriter classWriter;
    private bsh.org.objectweb.asm.ByteVector constantPool;
    private int constantPoolCount;
    private bsh.org.objectweb.asm.SymbolTable.Entry[] entries;
    private int entryCount;
    private int majorVersion;
    private int typeCount;
    private bsh.org.objectweb.asm.SymbolTable.Entry[] typeTable;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class Entry extends bsh.org.objectweb.asm.Symbol {
        final int hashCode;
        bsh.org.objectweb.asm.SymbolTable.Entry next;

        public Entry(int r9, int r10, long r11, int r13) {
                r8 = this;
                r4 = 0
                r5 = 0
                r3 = 0
                r0 = r8
                r1 = r9
                r2 = r10
                r6 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r0.hashCode = r13
                return
        }

        public Entry(int r9, int r10, java.lang.String r11, int r12) {
                r8 = this;
                r4 = 0
                r6 = 0
                r3 = 0
                r0 = r8
                r1 = r9
                r2 = r10
                r5 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r0.hashCode = r12
                return
        }

        public Entry(int r9, int r10, java.lang.String r11, long r12, int r14) {
                r8 = this;
                r3 = 0
                r4 = 0
                r0 = r8
                r1 = r9
                r2 = r10
                r5 = r11
                r6 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r0.hashCode = r14
                return
        }

        public Entry(int r9, int r10, java.lang.String r11, java.lang.String r12, int r13) {
                r8 = this;
                r3 = 0
                r6 = 0
                r0 = r8
                r1 = r9
                r2 = r10
                r4 = r11
                r5 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r0.hashCode = r13
                return
        }

        public Entry(int r1, int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, long r6, int r8) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r1 = r0
                r1.hashCode = r8
                return
        }
    }

    public SymbolTable(bsh.org.objectweb.asm.ClassWriter r1) {
            r0 = this;
            r0.<init>()
            r0.classWriter = r1
            r1 = 256(0x100, float:3.59E-43)
            bsh.org.objectweb.asm.SymbolTable$Entry[] r1 = new bsh.org.objectweb.asm.SymbolTable.Entry[r1]
            r0.entries = r1
            r1 = 1
            r0.constantPoolCount = r1
            bsh.org.objectweb.asm.ByteVector r1 = new bsh.org.objectweb.asm.ByteVector
            r1.<init>()
            r0.constantPool = r1
            return
    }

    private void add(bsh.org.objectweb.asm.SymbolTable.Entry r4) {
            r3 = this;
            int r0 = r3.entryCount
            int r0 = r0 + 1
            r3.entryCount = r0
            int r0 = r4.hashCode
            bsh.org.objectweb.asm.SymbolTable$Entry[] r1 = r3.entries
            int r2 = r1.length
            int r0 = r0 % r2
            r2 = r1[r0]
            r4.next = r2
            r1[r0] = r4
            return
    }

    private bsh.org.objectweb.asm.Symbol addBootstrapMethod(int r9, int r10, int r11) {
            r8 = this;
            bsh.org.objectweb.asm.ByteVector r0 = r8.bootstrapMethods
            byte[] r0 = r0.data
            bsh.org.objectweb.asm.SymbolTable$Entry r1 = r8.get(r11)
        L8:
            if (r1 == 0) goto L30
            int r2 = r1.tag
            r3 = 64
            if (r2 != r3) goto L2d
            int r2 = r1.hashCode
            if (r2 != r11) goto L2d
            long r2 = r1.data
            int r2 = (int) r2
            r3 = 0
        L18:
            if (r3 >= r10) goto L28
            int r4 = r9 + r3
            r4 = r0[r4]
            int r5 = r2 + r3
            r5 = r0[r5]
            if (r4 == r5) goto L25
            goto L2d
        L25:
            int r3 = r3 + 1
            goto L18
        L28:
            bsh.org.objectweb.asm.ByteVector r10 = r8.bootstrapMethods
            r10.length = r9
            return r1
        L2d:
            bsh.org.objectweb.asm.SymbolTable$Entry r1 = r1.next
            goto L8
        L30:
            bsh.org.objectweb.asm.SymbolTable$Entry r2 = new bsh.org.objectweb.asm.SymbolTable$Entry
            int r3 = r8.bootstrapMethodCount
            int r10 = r3 + 1
            r8.bootstrapMethodCount = r10
            r4 = 64
            long r5 = (long) r9
            r7 = r11
            r2.<init>(r3, r4, r5, r7)
            bsh.org.objectweb.asm.SymbolTable$Entry r9 = r8.put(r2)
            return r9
    }

    private bsh.org.objectweb.asm.Symbol addConstantDynamicOrInvokeDynamicReference(int r10, java.lang.String r11, java.lang.String r12, int r13) {
            r9 = this;
            int r8 = hash(r10, r11, r12, r13)
            bsh.org.objectweb.asm.SymbolTable$Entry r0 = r9.get(r8)
        L8:
            if (r0 == 0) goto L2d
            int r1 = r0.tag
            if (r1 != r10) goto L2a
            int r1 = r0.hashCode
            if (r1 != r8) goto L2a
            long r1 = r0.data
            long r3 = (long) r13
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L2a
            java.lang.String r1 = r0.name
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L2a
            java.lang.String r1 = r0.value
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L2a
            return r0
        L2a:
            bsh.org.objectweb.asm.SymbolTable$Entry r0 = r0.next
            goto L8
        L2d:
            bsh.org.objectweb.asm.ByteVector r0 = r9.constantPool
            int r1 = r9.addConstantNameAndType(r11, r12)
            r0.put122(r10, r13, r1)
            bsh.org.objectweb.asm.SymbolTable$Entry r0 = new bsh.org.objectweb.asm.SymbolTable$Entry
            int r1 = r9.constantPoolCount
            int r2 = r1 + 1
            r9.constantPoolCount = r2
            r3 = 0
            long r6 = (long) r13
            r2 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            bsh.org.objectweb.asm.SymbolTable$Entry r10 = r9.put(r0)
            return r10
    }

    private void addConstantDynamicOrInvokeDynamicReference(int r10, int r11, java.lang.String r12, java.lang.String r13, int r14) {
            r9 = this;
            int r8 = hash(r10, r12, r13, r14)
            bsh.org.objectweb.asm.SymbolTable$Entry r0 = new bsh.org.objectweb.asm.SymbolTable$Entry
            r3 = 0
            long r6 = (long) r14
            r2 = r10
            r1 = r11
            r4 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            r9.add(r0)
            return
    }

    private bsh.org.objectweb.asm.Symbol addConstantInteger(int r7, int r8) {
            r6 = this;
            int r5 = hash(r7, r8)
            bsh.org.objectweb.asm.SymbolTable$Entry r0 = r6.get(r5)
        L8:
            if (r0 == 0) goto L1d
            int r1 = r0.tag
            if (r1 != r7) goto L1a
            int r1 = r0.hashCode
            if (r1 != r5) goto L1a
            long r1 = r0.data
            long r3 = (long) r8
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L1a
            return r0
        L1a:
            bsh.org.objectweb.asm.SymbolTable$Entry r0 = r0.next
            goto L8
        L1d:
            bsh.org.objectweb.asm.ByteVector r0 = r6.constantPool
            bsh.org.objectweb.asm.ByteVector r0 = r0.putByte(r7)
            r0.putInt(r8)
            bsh.org.objectweb.asm.SymbolTable$Entry r0 = new bsh.org.objectweb.asm.SymbolTable$Entry
            int r1 = r6.constantPoolCount
            int r2 = r1 + 1
            r6.constantPoolCount = r2
            long r3 = (long) r8
            r2 = r7
            r0.<init>(r1, r2, r3, r5)
            bsh.org.objectweb.asm.SymbolTable$Entry r7 = r6.put(r0)
            return r7
    }

    private void addConstantInteger(int r7, int r8, int r9) {
            r6 = this;
            bsh.org.objectweb.asm.SymbolTable$Entry r0 = new bsh.org.objectweb.asm.SymbolTable$Entry
            long r3 = (long) r9
            int r5 = hash(r8, r9)
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r5)
            r6.add(r0)
            return
    }

    private bsh.org.objectweb.asm.Symbol addConstantLong(int r7, long r8) {
            r6 = this;
            int r5 = hash(r7, r8)
            bsh.org.objectweb.asm.SymbolTable$Entry r0 = r6.get(r5)
        L8:
            if (r0 == 0) goto L1c
            int r1 = r0.tag
            if (r1 != r7) goto L19
            int r1 = r0.hashCode
            if (r1 != r5) goto L19
            long r1 = r0.data
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 != 0) goto L19
            return r0
        L19:
            bsh.org.objectweb.asm.SymbolTable$Entry r0 = r0.next
            goto L8
        L1c:
            int r1 = r6.constantPoolCount
            bsh.org.objectweb.asm.ByteVector r0 = r6.constantPool
            bsh.org.objectweb.asm.ByteVector r0 = r0.putByte(r7)
            r0.putLong(r8)
            int r0 = r6.constantPoolCount
            int r0 = r0 + 2
            r6.constantPoolCount = r0
            bsh.org.objectweb.asm.SymbolTable$Entry r0 = new bsh.org.objectweb.asm.SymbolTable$Entry
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3, r5)
            bsh.org.objectweb.asm.SymbolTable$Entry r7 = r6.put(r0)
            return r7
    }

    private void addConstantLong(int r7, int r8, long r9) {
            r6 = this;
            bsh.org.objectweb.asm.SymbolTable$Entry r0 = new bsh.org.objectweb.asm.SymbolTable$Entry
            int r5 = hash(r8, r9)
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r5)
            r6.add(r0)
            return
    }

    private bsh.org.objectweb.asm.SymbolTable.Entry addConstantMemberReference(int r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
            r9 = this;
            int r8 = hash(r10, r11, r12, r13)
            bsh.org.objectweb.asm.SymbolTable$Entry r0 = r9.get(r8)
        L8:
            if (r0 == 0) goto L2e
            int r1 = r0.tag
            if (r1 != r10) goto L2b
            int r1 = r0.hashCode
            if (r1 != r8) goto L2b
            java.lang.String r1 = r0.owner
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L2b
            java.lang.String r1 = r0.name
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L2b
            java.lang.String r1 = r0.value
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L2b
            return r0
        L2b:
            bsh.org.objectweb.asm.SymbolTable$Entry r0 = r0.next
            goto L8
        L2e:
            bsh.org.objectweb.asm.ByteVector r0 = r9.constantPool
            bsh.org.objectweb.asm.Symbol r1 = r9.addConstantClass(r11)
            int r1 = r1.index
            int r2 = r9.addConstantNameAndType(r12, r13)
            r0.put122(r10, r1, r2)
            bsh.org.objectweb.asm.SymbolTable$Entry r0 = new bsh.org.objectweb.asm.SymbolTable$Entry
            int r1 = r9.constantPoolCount
            int r2 = r1 + 1
            r9.constantPoolCount = r2
            r6 = 0
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            bsh.org.objectweb.asm.SymbolTable$Entry r10 = r9.put(r0)
            return r10
    }

    private void addConstantMemberReference(int r10, int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
            r9 = this;
            bsh.org.objectweb.asm.SymbolTable$Entry r0 = new bsh.org.objectweb.asm.SymbolTable$Entry
            r6 = 0
            int r8 = hash(r11, r12, r13, r14)
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            r9.add(r0)
            return
    }

    private void addConstantMethodHandle(int r11, int r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
            r10 = this;
            r0 = 15
            int r9 = hash(r0, r13, r14, r15, r12)
            bsh.org.objectweb.asm.SymbolTable$Entry r1 = new bsh.org.objectweb.asm.SymbolTable$Entry
            r3 = 15
            long r7 = (long) r12
            r2 = r11
            r4 = r13
            r5 = r14
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r9)
            r10.add(r1)
            return
    }

    private void addConstantNameAndType(int r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            bsh.org.objectweb.asm.SymbolTable$Entry r0 = new bsh.org.objectweb.asm.SymbolTable$Entry
            r1 = 12
            int r5 = hash(r1, r8, r9)
            r2 = 12
            r1 = r7
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r6.add(r0)
            return
    }

    private void addConstantUtf8(int r4, java.lang.String r5) {
            r3 = this;
            bsh.org.objectweb.asm.SymbolTable$Entry r0 = new bsh.org.objectweb.asm.SymbolTable$Entry
            r1 = 1
            int r2 = hash(r1, r5)
            r0.<init>(r4, r1, r5, r2)
            r3.add(r0)
            return
    }

    private bsh.org.objectweb.asm.Symbol addConstantUtf8Reference(int r5, java.lang.String r6) {
            r4 = this;
            int r0 = hash(r5, r6)
            bsh.org.objectweb.asm.SymbolTable$Entry r1 = r4.get(r0)
        L8:
            if (r1 == 0) goto L1e
            int r2 = r1.tag
            if (r2 != r5) goto L1b
            int r2 = r1.hashCode
            if (r2 != r0) goto L1b
            java.lang.String r2 = r1.value
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L1b
            return r1
        L1b:
            bsh.org.objectweb.asm.SymbolTable$Entry r1 = r1.next
            goto L8
        L1e:
            bsh.org.objectweb.asm.ByteVector r1 = r4.constantPool
            int r2 = r4.addConstantUtf8(r6)
            r1.put12(r5, r2)
            bsh.org.objectweb.asm.SymbolTable$Entry r1 = new bsh.org.objectweb.asm.SymbolTable$Entry
            int r2 = r4.constantPoolCount
            int r3 = r2 + 1
            r4.constantPoolCount = r3
            r1.<init>(r2, r5, r6, r0)
            bsh.org.objectweb.asm.SymbolTable$Entry r5 = r4.put(r1)
            return r5
    }

    private void addConstantUtf8Reference(int r3, int r4, java.lang.String r5) {
            r2 = this;
            bsh.org.objectweb.asm.SymbolTable$Entry r0 = new bsh.org.objectweb.asm.SymbolTable$Entry
            int r1 = hash(r4, r5)
            r0.<init>(r3, r4, r5, r1)
            r2.add(r0)
            return
    }

    private int addType(bsh.org.objectweb.asm.SymbolTable.Entry r5) {
            r4 = this;
            bsh.org.objectweb.asm.SymbolTable$Entry[] r0 = r4.typeTable
            if (r0 != 0) goto La
            r0 = 16
            bsh.org.objectweb.asm.SymbolTable$Entry[] r0 = new bsh.org.objectweb.asm.SymbolTable.Entry[r0]
            r4.typeTable = r0
        La:
            int r0 = r4.typeCount
            bsh.org.objectweb.asm.SymbolTable$Entry[] r1 = r4.typeTable
            int r2 = r1.length
            if (r0 != r2) goto L1d
            int r0 = r1.length
            int r0 = r0 * 2
            bsh.org.objectweb.asm.SymbolTable$Entry[] r0 = new bsh.org.objectweb.asm.SymbolTable.Entry[r0]
            int r2 = r1.length
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r0, r3, r2)
            r4.typeTable = r0
        L1d:
            bsh.org.objectweb.asm.SymbolTable$Entry[] r0 = r4.typeTable
            int r1 = r4.typeCount
            int r2 = r1 + 1
            r4.typeCount = r2
            r0[r1] = r5
            bsh.org.objectweb.asm.SymbolTable$Entry r5 = r4.put(r5)
            int r5 = r5.index
            return r5
    }

    private bsh.org.objectweb.asm.SymbolTable.Entry get(int r3) {
            r2 = this;
            bsh.org.objectweb.asm.SymbolTable$Entry[] r0 = r2.entries
            int r1 = r0.length
            int r3 = r3 % r1
            r3 = r0[r3]
            return r3
    }

    private static int hash(int r1, int r2) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r1 + r2
            r1 = r1 & r0
            return r1
    }

    private static int hash(int r1, long r2) {
            int r0 = (int) r2
            int r1 = r1 + r0
            r0 = 32
            long r2 = r2 >>> r0
            int r2 = (int) r2
            int r1 = r1 + r2
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r2
            return r1
    }

    private static int hash(int r0, java.lang.String r1) {
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            return r0
    }

    private static int hash(int r0, java.lang.String r1, int r2) {
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 + r2
            r0 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            return r0
    }

    private static int hash(int r0, java.lang.String r1, java.lang.String r2) {
            int r1 = r1.hashCode()
            int r2 = r2.hashCode()
            int r2 = r2 * r1
            int r2 = r2 + r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r2
            return r0
    }

    private static int hash(int r0, java.lang.String r1, java.lang.String r2, int r3) {
            int r1 = r1.hashCode()
            int r2 = r2.hashCode()
            int r2 = r2 * r1
            int r3 = r3 + 1
            int r3 = r3 * r2
            int r3 = r3 + r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r3
            return r0
    }

    private static int hash(int r0, java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            int r1 = r1.hashCode()
            int r2 = r2.hashCode()
            int r2 = r2 * r1
            int r1 = r3.hashCode()
            int r1 = r1 * r2
            int r1 = r1 + r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            return r0
    }

    private static int hash(int r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4) {
            int r1 = r1.hashCode()
            int r2 = r2.hashCode()
            int r2 = r2 * r1
            int r1 = r3.hashCode()
            int r1 = r1 * r2
            int r1 = r1 * r4
            int r1 = r1 + r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            return r0
    }

    private bsh.org.objectweb.asm.SymbolTable.Entry put(bsh.org.objectweb.asm.SymbolTable.Entry r8) {
            r7 = this;
            int r0 = r7.entryCount
            bsh.org.objectweb.asm.SymbolTable$Entry[] r1 = r7.entries
            int r2 = r1.length
            int r2 = r2 * 3
            int r2 = r2 / 4
            if (r0 <= r2) goto L2e
            int r0 = r1.length
            int r1 = r0 * 2
            int r1 = r1 + 1
            bsh.org.objectweb.asm.SymbolTable$Entry[] r2 = new bsh.org.objectweb.asm.SymbolTable.Entry[r1]
            int r0 = r0 + (-1)
        L14:
            if (r0 < 0) goto L2c
            bsh.org.objectweb.asm.SymbolTable$Entry[] r3 = r7.entries
            r3 = r3[r0]
        L1a:
            if (r3 == 0) goto L29
            int r4 = r3.hashCode
            int r4 = r4 % r1
            bsh.org.objectweb.asm.SymbolTable$Entry r5 = r3.next
            r6 = r2[r4]
            r3.next = r6
            r2[r4] = r3
            r3 = r5
            goto L1a
        L29:
            int r0 = r0 + (-1)
            goto L14
        L2c:
            r7.entries = r2
        L2e:
            int r0 = r7.entryCount
            int r0 = r0 + 1
            r7.entryCount = r0
            int r0 = r8.hashCode
            bsh.org.objectweb.asm.SymbolTable$Entry[] r1 = r7.entries
            int r2 = r1.length
            int r0 = r0 % r2
            r2 = r1[r0]
            r8.next = r2
            r1[r0] = r8
            return r8
    }

    public bsh.org.objectweb.asm.Symbol addBootstrapMethod(bsh.org.objectweb.asm.Handle r10, java.lang.Object... r11) {
            r9 = this;
            bsh.org.objectweb.asm.ByteVector r0 = r9.bootstrapMethods
            if (r0 != 0) goto Lb
            bsh.org.objectweb.asm.ByteVector r0 = new bsh.org.objectweb.asm.ByteVector
            r0.<init>()
            r9.bootstrapMethods = r0
        Lb:
            int r1 = r11.length
            r2 = 0
            r3 = r2
        Le:
            if (r3 >= r1) goto L18
            r4 = r11[r3]
            r9.addConstant(r4)
            int r3 = r3 + 1
            goto Le
        L18:
            int r1 = r0.length
            int r4 = r10.getTag()
            java.lang.String r5 = r10.getOwner()
            java.lang.String r6 = r10.getName()
            java.lang.String r7 = r10.getDesc()
            boolean r8 = r10.isInterface()
            r3 = r9
            bsh.org.objectweb.asm.Symbol r4 = r3.addConstantMethodHandle(r4, r5, r6, r7, r8)
            int r4 = r4.index
            r0.putShort(r4)
            int r4 = r11.length
            r0.putShort(r4)
            int r4 = r11.length
            r5 = r2
        L3e:
            if (r5 >= r4) goto L4e
            r6 = r11[r5]
            bsh.org.objectweb.asm.Symbol r6 = r9.addConstant(r6)
            int r6 = r6.index
            r0.putShort(r6)
            int r5 = r5 + 1
            goto L3e
        L4e:
            int r0 = r0.length
            int r0 = r0 - r1
            int r10 = r10.hashCode()
            int r4 = r11.length
        L56:
            if (r2 >= r4) goto L62
            r5 = r11[r2]
            int r5 = r5.hashCode()
            r10 = r10 ^ r5
            int r2 = r2 + 1
            goto L56
        L62:
            r11 = 2147483647(0x7fffffff, float:NaN)
            r10 = r10 & r11
            bsh.org.objectweb.asm.Symbol r10 = r9.addBootstrapMethod(r1, r0, r10)
            return r10
    }

    public bsh.org.objectweb.asm.Symbol addConstant(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 == 0) goto Lf
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            bsh.org.objectweb.asm.Symbol r7 = r6.addConstantInteger(r7)
            return r7
        Lf:
            boolean r0 = r7 instanceof java.lang.Byte
            if (r0 == 0) goto L1e
            java.lang.Byte r7 = (java.lang.Byte) r7
            int r7 = r7.intValue()
            bsh.org.objectweb.asm.Symbol r7 = r6.addConstantInteger(r7)
            return r7
        L1e:
            boolean r0 = r7 instanceof java.lang.Character
            if (r0 == 0) goto L2d
            java.lang.Character r7 = (java.lang.Character) r7
            char r7 = r7.charValue()
            bsh.org.objectweb.asm.Symbol r7 = r6.addConstantInteger(r7)
            return r7
        L2d:
            boolean r0 = r7 instanceof java.lang.Short
            if (r0 == 0) goto L3c
            java.lang.Short r7 = (java.lang.Short) r7
            int r7 = r7.intValue()
            bsh.org.objectweb.asm.Symbol r7 = r6.addConstantInteger(r7)
            return r7
        L3c:
            boolean r0 = r7 instanceof java.lang.Boolean
            if (r0 == 0) goto L4b
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            bsh.org.objectweb.asm.Symbol r7 = r6.addConstantInteger(r7)
            return r7
        L4b:
            boolean r0 = r7 instanceof java.lang.Float
            if (r0 == 0) goto L5a
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            bsh.org.objectweb.asm.Symbol r7 = r6.addConstantFloat(r7)
            return r7
        L5a:
            boolean r0 = r7 instanceof java.lang.Long
            if (r0 == 0) goto L69
            java.lang.Long r7 = (java.lang.Long) r7
            long r0 = r7.longValue()
            bsh.org.objectweb.asm.Symbol r7 = r6.addConstantLong(r0)
            return r7
        L69:
            boolean r0 = r7 instanceof java.lang.Double
            if (r0 == 0) goto L78
            java.lang.Double r7 = (java.lang.Double) r7
            double r0 = r7.doubleValue()
            bsh.org.objectweb.asm.Symbol r7 = r6.addConstantDouble(r0)
            return r7
        L78:
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L83
            java.lang.String r7 = (java.lang.String) r7
            bsh.org.objectweb.asm.Symbol r7 = r6.addConstantString(r7)
            return r7
        L83:
            boolean r0 = r7 instanceof bsh.org.objectweb.asm.Type
            if (r0 == 0) goto Lb0
            bsh.org.objectweb.asm.Type r7 = (bsh.org.objectweb.asm.Type) r7
            int r0 = r7.getSort()
            r1 = 10
            if (r0 != r1) goto L9a
            java.lang.String r7 = r7.getInternalName()
            bsh.org.objectweb.asm.Symbol r7 = r6.addConstantClass(r7)
            return r7
        L9a:
            r1 = 11
            if (r0 != r1) goto La7
            java.lang.String r7 = r7.getDescriptor()
            bsh.org.objectweb.asm.Symbol r7 = r6.addConstantMethodType(r7)
            return r7
        La7:
            java.lang.String r7 = r7.getDescriptor()
            bsh.org.objectweb.asm.Symbol r7 = r6.addConstantClass(r7)
            return r7
        Lb0:
            boolean r0 = r7 instanceof bsh.org.objectweb.asm.Handle
            if (r0 == 0) goto Ld0
            bsh.org.objectweb.asm.Handle r7 = (bsh.org.objectweb.asm.Handle) r7
            int r1 = r7.getTag()
            java.lang.String r2 = r7.getOwner()
            java.lang.String r3 = r7.getName()
            java.lang.String r4 = r7.getDesc()
            boolean r5 = r7.isInterface()
            r0 = r6
            bsh.org.objectweb.asm.Symbol r7 = r0.addConstantMethodHandle(r1, r2, r3, r4, r5)
            return r7
        Ld0:
            java.lang.String r0 = "value "
            g1.d.f(r7, r0)
            r7 = 0
            return r7
    }

    public bsh.org.objectweb.asm.Symbol addConstantClass(java.lang.String r2) {
            r1 = this;
            r0 = 7
            bsh.org.objectweb.asm.Symbol r2 = r1.addConstantUtf8Reference(r0, r2)
            return r2
    }

    public bsh.org.objectweb.asm.Symbol addConstantDouble(double r2) {
            r1 = this;
            r0 = 6
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            bsh.org.objectweb.asm.Symbol r2 = r1.addConstantLong(r0, r2)
            return r2
    }

    public bsh.org.objectweb.asm.Symbol addConstantDynamic(java.lang.String r1, java.lang.String r2, bsh.org.objectweb.asm.Handle r3, java.lang.Object... r4) {
            r0 = this;
            bsh.org.objectweb.asm.Symbol r3 = r0.addBootstrapMethod(r3, r4)
            r4 = 17
            int r3 = r3.index
            bsh.org.objectweb.asm.Symbol r1 = r0.addConstantDynamicOrInvokeDynamicReference(r4, r1, r2, r3)
            return r1
    }

    public bsh.org.objectweb.asm.Symbol addConstantFieldref(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = 9
            bsh.org.objectweb.asm.SymbolTable$Entry r2 = r1.addConstantMemberReference(r0, r2, r3, r4)
            return r2
    }

    public bsh.org.objectweb.asm.Symbol addConstantFloat(float r2) {
            r1 = this;
            r0 = 4
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            bsh.org.objectweb.asm.Symbol r2 = r1.addConstantInteger(r0, r2)
            return r2
    }

    public bsh.org.objectweb.asm.Symbol addConstantInteger(int r2) {
            r1 = this;
            r0 = 3
            bsh.org.objectweb.asm.Symbol r2 = r1.addConstantInteger(r0, r2)
            return r2
    }

    public bsh.org.objectweb.asm.Symbol addConstantInvokeDynamic(java.lang.String r1, java.lang.String r2, bsh.org.objectweb.asm.Handle r3, java.lang.Object... r4) {
            r0 = this;
            bsh.org.objectweb.asm.Symbol r3 = r0.addBootstrapMethod(r3, r4)
            r4 = 18
            int r3 = r3.index
            bsh.org.objectweb.asm.Symbol r1 = r0.addConstantDynamicOrInvokeDynamicReference(r4, r1, r2, r3)
            return r1
    }

    public bsh.org.objectweb.asm.Symbol addConstantLong(long r2) {
            r1 = this;
            r0 = 5
            bsh.org.objectweb.asm.Symbol r2 = r1.addConstantLong(r0, r2)
            return r2
    }

    public bsh.org.objectweb.asm.Symbol addConstantMethodHandle(int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15) {
            r10 = this;
            r0 = 15
            int r9 = hash(r0, r12, r13, r14, r11)
            bsh.org.objectweb.asm.SymbolTable$Entry r1 = r10.get(r9)
        La:
            if (r1 == 0) goto L37
            int r2 = r1.tag
            if (r2 != r0) goto L34
            int r2 = r1.hashCode
            if (r2 != r9) goto L34
            long r2 = r1.data
            long r4 = (long) r11
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L34
            java.lang.String r2 = r1.owner
            boolean r2 = r2.equals(r12)
            if (r2 == 0) goto L34
            java.lang.String r2 = r1.name
            boolean r2 = r2.equals(r13)
            if (r2 == 0) goto L34
            java.lang.String r2 = r1.value
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L34
            return r1
        L34:
            bsh.org.objectweb.asm.SymbolTable$Entry r1 = r1.next
            goto La
        L37:
            bsh.org.objectweb.asm.ByteVector r1 = r10.constantPool
            r2 = 4
            if (r11 > r2) goto L46
            bsh.org.objectweb.asm.Symbol r15 = r10.addConstantFieldref(r12, r13, r14)
            int r15 = r15.index
            r1.put112(r0, r11, r15)
            goto L4f
        L46:
            bsh.org.objectweb.asm.Symbol r15 = r10.addConstantMethodref(r12, r13, r14, r15)
            int r15 = r15.index
            r1.put112(r0, r11, r15)
        L4f:
            bsh.org.objectweb.asm.SymbolTable$Entry r1 = new bsh.org.objectweb.asm.SymbolTable$Entry
            int r2 = r10.constantPoolCount
            int r15 = r2 + 1
            r10.constantPoolCount = r15
            r3 = 15
            long r7 = (long) r11
            r4 = r12
            r5 = r13
            r6 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r9)
            bsh.org.objectweb.asm.SymbolTable$Entry r11 = r10.put(r1)
            return r11
    }

    public bsh.org.objectweb.asm.Symbol addConstantMethodType(java.lang.String r2) {
            r1 = this;
            r0 = 16
            bsh.org.objectweb.asm.Symbol r2 = r1.addConstantUtf8Reference(r0, r2)
            return r2
    }

    public bsh.org.objectweb.asm.Symbol addConstantMethodref(java.lang.String r1, java.lang.String r2, java.lang.String r3, boolean r4) {
            r0 = this;
            if (r4 == 0) goto L5
            r4 = 11
            goto L7
        L5:
            r4 = 10
        L7:
            bsh.org.objectweb.asm.SymbolTable$Entry r1 = r0.addConstantMemberReference(r4, r1, r2, r3)
            return r1
    }

    public bsh.org.objectweb.asm.Symbol addConstantModule(java.lang.String r2) {
            r1 = this;
            r0 = 19
            bsh.org.objectweb.asm.Symbol r2 = r1.addConstantUtf8Reference(r0, r2)
            return r2
    }

    public int addConstantNameAndType(java.lang.String r8, java.lang.String r9) {
            r7 = this;
            r0 = 12
            int r6 = hash(r0, r8, r9)
            bsh.org.objectweb.asm.SymbolTable$Entry r1 = r7.get(r6)
        La:
            if (r1 == 0) goto L2a
            int r2 = r1.tag
            if (r2 != r0) goto L27
            int r2 = r1.hashCode
            if (r2 != r6) goto L27
            java.lang.String r2 = r1.name
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L27
            java.lang.String r2 = r1.value
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L27
            int r8 = r1.index
            return r8
        L27:
            bsh.org.objectweb.asm.SymbolTable$Entry r1 = r1.next
            goto La
        L2a:
            bsh.org.objectweb.asm.ByteVector r1 = r7.constantPool
            int r2 = r7.addConstantUtf8(r8)
            int r3 = r7.addConstantUtf8(r9)
            r1.put122(r0, r2, r3)
            bsh.org.objectweb.asm.SymbolTable$Entry r1 = new bsh.org.objectweb.asm.SymbolTable$Entry
            int r2 = r7.constantPoolCount
            int r0 = r2 + 1
            r7.constantPoolCount = r0
            r3 = 12
            r4 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            bsh.org.objectweb.asm.SymbolTable$Entry r8 = r7.put(r1)
            int r8 = r8.index
            return r8
    }

    public bsh.org.objectweb.asm.Symbol addConstantPackage(java.lang.String r2) {
            r1 = this;
            r0 = 20
            bsh.org.objectweb.asm.Symbol r2 = r1.addConstantUtf8Reference(r0, r2)
            return r2
    }

    public bsh.org.objectweb.asm.Symbol addConstantString(java.lang.String r2) {
            r1 = this;
            r0 = 8
            bsh.org.objectweb.asm.Symbol r2 = r1.addConstantUtf8Reference(r0, r2)
            return r2
    }

    public int addConstantUtf8(java.lang.String r6) {
            r5 = this;
            r0 = 1
            int r1 = hash(r0, r6)
            bsh.org.objectweb.asm.SymbolTable$Entry r2 = r5.get(r1)
        L9:
            if (r2 == 0) goto L21
            int r3 = r2.tag
            if (r3 != r0) goto L1e
            int r3 = r2.hashCode
            if (r3 != r1) goto L1e
            java.lang.String r3 = r2.value
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L1e
            int r6 = r2.index
            return r6
        L1e:
            bsh.org.objectweb.asm.SymbolTable$Entry r2 = r2.next
            goto L9
        L21:
            bsh.org.objectweb.asm.ByteVector r2 = r5.constantPool
            bsh.org.objectweb.asm.ByteVector r2 = r2.putByte(r0)
            r2.putUTF8(r6)
            bsh.org.objectweb.asm.SymbolTable$Entry r2 = new bsh.org.objectweb.asm.SymbolTable$Entry
            int r3 = r5.constantPoolCount
            int r4 = r3 + 1
            r5.constantPoolCount = r4
            r2.<init>(r3, r0, r6, r1)
            bsh.org.objectweb.asm.SymbolTable$Entry r6 = r5.put(r2)
            int r6 = r6.index
            return r6
    }

    public int addMergedType(int r11, int r12) {
            r10 = this;
            long r0 = (long) r11
            long r2 = (long) r12
            r4 = 32
            long r2 = r2 << r4
            long r7 = r0 | r2
            int r0 = r11 + r12
            r1 = 130(0x82, float:1.82E-43)
            int r9 = hash(r1, r0)
            bsh.org.objectweb.asm.SymbolTable$Entry r0 = r10.get(r9)
        L13:
            if (r0 == 0) goto L29
            int r2 = r0.tag
            if (r2 != r1) goto L26
            int r2 = r0.hashCode
            if (r2 != r9) goto L26
            long r2 = r0.data
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto L26
            int r11 = r0.info
            return r11
        L26:
            bsh.org.objectweb.asm.SymbolTable$Entry r0 = r0.next
            goto L13
        L29:
            bsh.org.objectweb.asm.SymbolTable$Entry[] r0 = r10.typeTable
            r11 = r0[r11]
            java.lang.String r11 = r11.value
            r12 = r0[r12]
            java.lang.String r12 = r12.value
            bsh.org.objectweb.asm.ClassWriter r0 = r10.classWriter
            java.lang.String r11 = r0.getCommonSuperClass(r11, r12)
            int r11 = r10.addType(r11)
            bsh.org.objectweb.asm.SymbolTable$Entry r4 = new bsh.org.objectweb.asm.SymbolTable$Entry
            int r5 = r10.typeCount
            r6 = 130(0x82, float:1.82E-43)
            r4.<init>(r5, r6, r7, r9)
            bsh.org.objectweb.asm.SymbolTable$Entry r12 = r10.put(r4)
            r12.info = r11
            return r11
    }

    public int addType(java.lang.String r5) {
            r4 = this;
            r0 = 128(0x80, float:1.8E-43)
            int r1 = hash(r0, r5)
            bsh.org.objectweb.asm.SymbolTable$Entry r2 = r4.get(r1)
        La:
            if (r2 == 0) goto L22
            int r3 = r2.tag
            if (r3 != r0) goto L1f
            int r3 = r2.hashCode
            if (r3 != r1) goto L1f
            java.lang.String r3 = r2.value
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L1f
            int r5 = r2.index
            return r5
        L1f:
            bsh.org.objectweb.asm.SymbolTable$Entry r2 = r2.next
            goto La
        L22:
            bsh.org.objectweb.asm.SymbolTable$Entry r2 = new bsh.org.objectweb.asm.SymbolTable$Entry
            int r3 = r4.typeCount
            r2.<init>(r3, r0, r5, r1)
            int r5 = r4.addType(r2)
            return r5
    }

    public int addUninitializedType(java.lang.String r9, int r10) {
            r8 = this;
            r0 = 129(0x81, float:1.81E-43)
            int r7 = hash(r0, r9, r10)
            bsh.org.objectweb.asm.SymbolTable$Entry r1 = r8.get(r7)
        La:
            if (r1 == 0) goto L29
            int r2 = r1.tag
            if (r2 != r0) goto L26
            int r2 = r1.hashCode
            if (r2 != r7) goto L26
            long r2 = r1.data
            long r4 = (long) r10
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L26
            java.lang.String r2 = r1.value
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L26
            int r9 = r1.index
            return r9
        L26:
            bsh.org.objectweb.asm.SymbolTable$Entry r1 = r1.next
            goto La
        L29:
            bsh.org.objectweb.asm.SymbolTable$Entry r1 = new bsh.org.objectweb.asm.SymbolTable$Entry
            int r2 = r8.typeCount
            r3 = 129(0x81, float:1.81E-43)
            long r5 = (long) r10
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r7)
            int r9 = r8.addType(r1)
            return r9
    }

    public int computeBootstrapMethodsSize() {
            r1 = this;
            bsh.org.objectweb.asm.ByteVector r0 = r1.bootstrapMethods
            if (r0 == 0) goto L10
            java.lang.String r0 = "BootstrapMethods"
            r1.addConstantUtf8(r0)
            bsh.org.objectweb.asm.ByteVector r0 = r1.bootstrapMethods
            int r0 = r0.length
            int r0 = r0 + 8
            return r0
        L10:
            r0 = 0
            return r0
    }

    public java.lang.String getClassName() {
            r1 = this;
            java.lang.String r0 = r1.className
            return r0
    }

    public int getConstantPoolCount() {
            r1 = this;
            int r0 = r1.constantPoolCount
            return r0
    }

    public int getConstantPoolLength() {
            r1 = this;
            bsh.org.objectweb.asm.ByteVector r0 = r1.constantPool
            int r0 = r0.length
            return r0
    }

    public int getMajorVersion() {
            r1 = this;
            int r0 = r1.majorVersion
            return r0
    }

    public bsh.org.objectweb.asm.Symbol getType(int r2) {
            r1 = this;
            bsh.org.objectweb.asm.SymbolTable$Entry[] r0 = r1.typeTable
            r2 = r0[r2]
            return r2
    }

    public void putBootstrapMethods(bsh.org.objectweb.asm.ByteVector r4) {
            r3 = this;
            bsh.org.objectweb.asm.ByteVector r0 = r3.bootstrapMethods
            if (r0 == 0) goto L28
            java.lang.String r0 = "BootstrapMethods"
            int r0 = r3.addConstantUtf8(r0)
            bsh.org.objectweb.asm.ByteVector r4 = r4.putShort(r0)
            bsh.org.objectweb.asm.ByteVector r0 = r3.bootstrapMethods
            int r0 = r0.length
            int r0 = r0 + 2
            bsh.org.objectweb.asm.ByteVector r4 = r4.putInt(r0)
            int r0 = r3.bootstrapMethodCount
            bsh.org.objectweb.asm.ByteVector r4 = r4.putShort(r0)
            bsh.org.objectweb.asm.ByteVector r0 = r3.bootstrapMethods
            byte[] r1 = r0.data
            r2 = 0
            int r0 = r0.length
            r4.putByteArray(r1, r2, r0)
        L28:
            return
    }

    public void putConstantPool(bsh.org.objectweb.asm.ByteVector r4) {
            r3 = this;
            int r0 = r3.constantPoolCount
            bsh.org.objectweb.asm.ByteVector r4 = r4.putShort(r0)
            bsh.org.objectweb.asm.ByteVector r0 = r3.constantPool
            byte[] r1 = r0.data
            r2 = 0
            int r0 = r0.length
            r4.putByteArray(r1, r2, r0)
            return
    }

    public int setMajorVersionAndClassName(int r1, java.lang.String r2) {
            r0 = this;
            r0.majorVersion = r1
            r0.className = r2
            bsh.org.objectweb.asm.Symbol r1 = r0.addConstantClass(r2)
            int r1 = r1.index
            return r1
    }
}
