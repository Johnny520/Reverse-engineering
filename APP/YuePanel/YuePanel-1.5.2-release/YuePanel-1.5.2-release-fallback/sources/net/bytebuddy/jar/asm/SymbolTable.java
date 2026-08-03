package net.bytebuddy.jar.asm;

/* JADX INFO: loaded from: classes2.dex */
final class SymbolTable {
    private int bootstrapMethodCount;
    private net.bytebuddy.jar.asm.ByteVector bootstrapMethods;
    private java.lang.String className;
    final net.bytebuddy.jar.asm.ClassWriter classWriter;
    private net.bytebuddy.jar.asm.ByteVector constantPool;
    private int constantPoolCount;
    private net.bytebuddy.jar.asm.SymbolTable.Entry[] entries;
    private int entryCount;
    private int labelCount;
    private net.bytebuddy.jar.asm.SymbolTable.LabelEntry[] labelEntries;
    private net.bytebuddy.jar.asm.SymbolTable.LabelEntry[] labelTable;
    private int majorVersion;
    private final net.bytebuddy.jar.asm.ClassReader sourceClassReader;
    private int typeCount;
    private net.bytebuddy.jar.asm.SymbolTable.Entry[] typeTable;

    public static final class Entry extends net.bytebuddy.jar.asm.Symbol {
        final int hashCode;
        net.bytebuddy.jar.asm.SymbolTable.Entry next;

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
                r8.hashCode = r13
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
                r8.hashCode = r12
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
                r8.hashCode = r14
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
                r8.hashCode = r13
                return
        }

        public Entry(int r1, int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, long r6, int r8) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r0.hashCode = r8
                return
        }
    }

    public static final class LabelEntry {
        final int index;
        final net.bytebuddy.jar.asm.Label label;
        net.bytebuddy.jar.asm.SymbolTable.LabelEntry next;

        public LabelEntry(int r1, net.bytebuddy.jar.asm.Label r2) {
                r0 = this;
                r0.<init>()
                r0.index = r1
                r0.label = r2
                return
        }
    }

    public SymbolTable(net.bytebuddy.jar.asm.ClassWriter r1) {
            r0 = this;
            r0.<init>()
            r0.classWriter = r1
            r1 = 0
            r0.sourceClassReader = r1
            r1 = 256(0x100, float:3.59E-43)
            net.bytebuddy.jar.asm.SymbolTable$Entry[] r1 = new net.bytebuddy.jar.asm.SymbolTable.Entry[r1]
            r0.entries = r1
            r1 = 1
            r0.constantPoolCount = r1
            net.bytebuddy.jar.asm.ByteVector r1 = new net.bytebuddy.jar.asm.ByteVector
            r1.<init>()
            r0.constantPool = r1
            return
    }

    public SymbolTable(net.bytebuddy.jar.asm.ClassWriter r14, net.bytebuddy.jar.asm.ClassReader r15) {
            r13 = this;
            r13.<init>()
            r13.classWriter = r14
            r13.sourceClassReader = r15
            byte[] r14 = r15.classFileBuffer
            r0 = 1
            int r1 = r15.getItem(r0)
            int r1 = r1 - r0
            int r2 = r15.header
            int r2 = r2 - r1
            int r3 = r15.getItemCount()
            r13.constantPoolCount = r3
            net.bytebuddy.jar.asm.ByteVector r3 = new net.bytebuddy.jar.asm.ByteVector
            r3.<init>(r2)
            r13.constantPool = r3
            r3.putByteArray(r14, r1, r2)
            int r1 = r13.constantPoolCount
            r2 = 2
            int r1 = r1 * r2
            net.bytebuddy.jar.asm.SymbolTable$Entry[] r1 = new net.bytebuddy.jar.asm.SymbolTable.Entry[r1]
            r13.entries = r1
            int r1 = r15.getMaxStringLength()
            char[] r1 = new char[r1]
            r3 = 0
            r10 = r0
        L32:
            int r4 = r13.constantPoolCount
            if (r10 >= r4) goto Lee
            int r4 = r15.getItem(r10)
            int r5 = r4 + (-1)
            r11 = r14[r5]
            switch(r11) {
                case 1: goto Lda;
                case 2: goto L41;
                case 3: goto Ld2;
                case 4: goto Ld2;
                case 5: goto Lca;
                case 6: goto Lca;
                case 7: goto Lc2;
                case 8: goto Lc2;
                case 9: goto La4;
                case 10: goto La4;
                case 11: goto La4;
                case 12: goto L96;
                case 13: goto L41;
                case 14: goto L41;
                case 15: goto L67;
                case 16: goto Lc2;
                case 17: goto L47;
                case 18: goto L47;
                case 19: goto Lc2;
                case 20: goto Lc2;
                default: goto L41;
            }
        L41:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            r14.<init>()
            throw r14
        L47:
            int r3 = r4 + 2
            int r3 = r15.readUnsignedShort(r3)
            int r3 = r15.getItem(r3)
            java.lang.String r7 = r15.readUTF8(r3, r1)
            int r3 = r3 + r2
            java.lang.String r8 = r15.readUTF8(r3, r1)
            int r9 = r15.readUnsignedShort(r4)
            r4 = r13
            r5 = r11
            r6 = r10
            r4.addConstantDynamicOrInvokeDynamicReference(r5, r6, r7, r8, r9)
            r3 = r0
            goto Le1
        L67:
            int r5 = r4 + 1
            int r5 = r15.readUnsignedShort(r5)
            int r5 = r15.getItem(r5)
            int r6 = r5 + 2
            int r6 = r15.readUnsignedShort(r6)
            int r6 = r15.getItem(r6)
            int r7 = r15.readByte(r4)
            java.lang.String r8 = r15.readClass(r5, r1)
            java.lang.String r9 = r15.readUTF8(r6, r1)
            int r6 = r6 + r2
            java.lang.String r12 = r15.readUTF8(r6, r1)
            r4 = r13
            r5 = r10
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r12
            r4.addConstantMethodHandle(r5, r6, r7, r8, r9)
            goto Le1
        L96:
            java.lang.String r5 = r15.readUTF8(r4, r1)
            int r4 = r4 + 2
            java.lang.String r4 = r15.readUTF8(r4, r1)
            r13.addConstantNameAndType(r10, r5, r4)
            goto Le1
        La4:
            int r5 = r4 + 2
            int r5 = r15.readUnsignedShort(r5)
            int r5 = r15.getItem(r5)
            java.lang.String r7 = r15.readClass(r4, r1)
            java.lang.String r8 = r15.readUTF8(r5, r1)
            int r5 = r5 + r2
            java.lang.String r9 = r15.readUTF8(r5, r1)
            r4 = r13
            r5 = r10
            r6 = r11
            r4.addConstantMemberReference(r5, r6, r7, r8, r9)
            goto Le1
        Lc2:
            java.lang.String r4 = r15.readUTF8(r4, r1)
            r13.addConstantUtf8Reference(r10, r11, r4)
            goto Le1
        Lca:
            long r4 = r15.readLong(r4)
            r13.addConstantLongOrDouble(r10, r11, r4)
            goto Le1
        Ld2:
            int r4 = r15.readInt(r4)
            r13.addConstantIntegerOrFloat(r10, r11, r4)
            goto Le1
        Lda:
            java.lang.String r4 = r15.readUtf(r10, r1)
            r13.addConstantUtf8(r10, r4)
        Le1:
            r4 = 5
            if (r11 == r4) goto Lea
            r4 = 6
            if (r11 != r4) goto Le8
            goto Lea
        Le8:
            r4 = r0
            goto Leb
        Lea:
            r4 = r2
        Leb:
            int r10 = r10 + r4
            goto L32
        Lee:
            if (r3 == 0) goto Lf3
            r13.copyBootstrapMethods(r15, r1)
        Lf3:
            return
    }

    private void add(net.bytebuddy.jar.asm.SymbolTable.Entry r4) {
            r3 = this;
            int r0 = r3.entryCount
            int r0 = r0 + 1
            r3.entryCount = r0
            int r0 = r4.hashCode
            net.bytebuddy.jar.asm.SymbolTable$Entry[] r1 = r3.entries
            int r2 = r1.length
            int r0 = r0 % r2
            r2 = r1[r0]
            r4.next = r2
            r1[r0] = r4
            return
    }

    private net.bytebuddy.jar.asm.Symbol addBootstrapMethod(int r9, int r10, int r11) {
            r8 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = r8.bootstrapMethods
            byte[] r0 = r0.data
            net.bytebuddy.jar.asm.SymbolTable$Entry r1 = r8.get(r11)
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
            net.bytebuddy.jar.asm.ByteVector r10 = r8.bootstrapMethods
            r10.length = r9
            return r1
        L2d:
            net.bytebuddy.jar.asm.SymbolTable$Entry r1 = r1.next
            goto L8
        L30:
            net.bytebuddy.jar.asm.SymbolTable$Entry r10 = new net.bytebuddy.jar.asm.SymbolTable$Entry
            int r3 = r8.bootstrapMethodCount
            int r0 = r3 + 1
            r8.bootstrapMethodCount = r0
            r4 = 64
            long r5 = (long) r9
            r2 = r10
            r7 = r11
            r2.<init>(r3, r4, r5, r7)
            net.bytebuddy.jar.asm.SymbolTable$Entry r9 = r8.put(r10)
            return r9
    }

    private net.bytebuddy.jar.asm.Symbol addConstantDynamicOrInvokeDynamicReference(int r11, java.lang.String r12, java.lang.String r13, int r14) {
            r10 = this;
            int r8 = hash(r11, r12, r13, r14)
            net.bytebuddy.jar.asm.SymbolTable$Entry r0 = r10.get(r8)
        L8:
            if (r0 == 0) goto L2d
            int r1 = r0.tag
            if (r1 != r11) goto L2a
            int r1 = r0.hashCode
            if (r1 != r8) goto L2a
            long r1 = r0.data
            long r3 = (long) r14
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L2a
            java.lang.String r1 = r0.name
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L2a
            java.lang.String r1 = r0.value
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L2a
            return r0
        L2a:
            net.bytebuddy.jar.asm.SymbolTable$Entry r0 = r0.next
            goto L8
        L2d:
            net.bytebuddy.jar.asm.ByteVector r0 = r10.constantPool
            int r1 = r10.addConstantNameAndType(r12, r13)
            r0.put122(r11, r14, r1)
            net.bytebuddy.jar.asm.SymbolTable$Entry r9 = new net.bytebuddy.jar.asm.SymbolTable$Entry
            int r1 = r10.constantPoolCount
            int r0 = r1 + 1
            r10.constantPoolCount = r0
            r3 = 0
            long r6 = (long) r14
            r0 = r9
            r2 = r11
            r4 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            net.bytebuddy.jar.asm.SymbolTable$Entry r11 = r10.put(r9)
            return r11
    }

    private void addConstantDynamicOrInvokeDynamicReference(int r11, int r12, java.lang.String r13, java.lang.String r14, int r15) {
            r10 = this;
            int r8 = hash(r11, r13, r14, r15)
            net.bytebuddy.jar.asm.SymbolTable$Entry r9 = new net.bytebuddy.jar.asm.SymbolTable$Entry
            r3 = 0
            long r6 = (long) r15
            r0 = r9
            r1 = r12
            r2 = r11
            r4 = r13
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            r10.add(r9)
            return
    }

    private net.bytebuddy.jar.asm.Symbol addConstantIntegerOrFloat(int r8, int r9) {
            r7 = this;
            int r5 = hash(r8, r9)
            net.bytebuddy.jar.asm.SymbolTable$Entry r0 = r7.get(r5)
        L8:
            if (r0 == 0) goto L1d
            int r1 = r0.tag
            if (r1 != r8) goto L1a
            int r1 = r0.hashCode
            if (r1 != r5) goto L1a
            long r1 = r0.data
            long r3 = (long) r9
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L1a
            return r0
        L1a:
            net.bytebuddy.jar.asm.SymbolTable$Entry r0 = r0.next
            goto L8
        L1d:
            net.bytebuddy.jar.asm.ByteVector r0 = r7.constantPool
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putByte(r8)
            r0.putInt(r9)
            net.bytebuddy.jar.asm.SymbolTable$Entry r6 = new net.bytebuddy.jar.asm.SymbolTable$Entry
            int r1 = r7.constantPoolCount
            int r0 = r1 + 1
            r7.constantPoolCount = r0
            long r3 = (long) r9
            r0 = r6
            r2 = r8
            r0.<init>(r1, r2, r3, r5)
            net.bytebuddy.jar.asm.SymbolTable$Entry r8 = r7.put(r6)
            return r8
    }

    private void addConstantIntegerOrFloat(int r8, int r9, int r10) {
            r7 = this;
            net.bytebuddy.jar.asm.SymbolTable$Entry r6 = new net.bytebuddy.jar.asm.SymbolTable$Entry
            long r3 = (long) r10
            int r5 = hash(r9, r10)
            r0 = r6
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r5)
            r7.add(r6)
            return
    }

    private net.bytebuddy.jar.asm.Symbol addConstantLongOrDouble(int r8, long r9) {
            r7 = this;
            int r5 = hash(r8, r9)
            net.bytebuddy.jar.asm.SymbolTable$Entry r0 = r7.get(r5)
        L8:
            if (r0 == 0) goto L1c
            int r1 = r0.tag
            if (r1 != r8) goto L19
            int r1 = r0.hashCode
            if (r1 != r5) goto L19
            long r1 = r0.data
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 != 0) goto L19
            return r0
        L19:
            net.bytebuddy.jar.asm.SymbolTable$Entry r0 = r0.next
            goto L8
        L1c:
            int r1 = r7.constantPoolCount
            net.bytebuddy.jar.asm.ByteVector r0 = r7.constantPool
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putByte(r8)
            r0.putLong(r9)
            int r0 = r7.constantPoolCount
            int r0 = r0 + 2
            r7.constantPoolCount = r0
            net.bytebuddy.jar.asm.SymbolTable$Entry r6 = new net.bytebuddy.jar.asm.SymbolTable$Entry
            r0 = r6
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r5)
            net.bytebuddy.jar.asm.SymbolTable$Entry r8 = r7.put(r6)
            return r8
    }

    private void addConstantLongOrDouble(int r8, int r9, long r10) {
            r7 = this;
            net.bytebuddy.jar.asm.SymbolTable$Entry r6 = new net.bytebuddy.jar.asm.SymbolTable$Entry
            int r5 = hash(r9, r10)
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r5)
            r7.add(r6)
            return
    }

    private net.bytebuddy.jar.asm.SymbolTable.Entry addConstantMemberReference(int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
            r10 = this;
            int r8 = hash(r11, r12, r13, r14)
            net.bytebuddy.jar.asm.SymbolTable$Entry r0 = r10.get(r8)
        L8:
            if (r0 == 0) goto L2e
            int r1 = r0.tag
            if (r1 != r11) goto L2b
            int r1 = r0.hashCode
            if (r1 != r8) goto L2b
            java.lang.String r1 = r0.owner
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L2b
            java.lang.String r1 = r0.name
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L2b
            java.lang.String r1 = r0.value
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L2b
            return r0
        L2b:
            net.bytebuddy.jar.asm.SymbolTable$Entry r0 = r0.next
            goto L8
        L2e:
            net.bytebuddy.jar.asm.ByteVector r0 = r10.constantPool
            net.bytebuddy.jar.asm.Symbol r1 = r10.addConstantClass(r12)
            int r1 = r1.index
            int r2 = r10.addConstantNameAndType(r13, r14)
            r0.put122(r11, r1, r2)
            net.bytebuddy.jar.asm.SymbolTable$Entry r9 = new net.bytebuddy.jar.asm.SymbolTable$Entry
            int r1 = r10.constantPoolCount
            int r0 = r1 + 1
            r10.constantPoolCount = r0
            r6 = 0
            r0 = r9
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            net.bytebuddy.jar.asm.SymbolTable$Entry r11 = r10.put(r9)
            return r11
    }

    private void addConstantMemberReference(int r11, int r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
            r10 = this;
            net.bytebuddy.jar.asm.SymbolTable$Entry r9 = new net.bytebuddy.jar.asm.SymbolTable$Entry
            r6 = 0
            int r8 = hash(r12, r13, r14, r15)
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            r10.add(r9)
            return
    }

    private void addConstantMethodHandle(int r11, int r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
            r10 = this;
            r0 = 15
            int r9 = hash(r0, r13, r14, r15, r12)
            net.bytebuddy.jar.asm.SymbolTable$Entry r0 = new net.bytebuddy.jar.asm.SymbolTable$Entry
            r3 = 15
            long r7 = (long) r12
            r1 = r0
            r2 = r11
            r4 = r13
            r5 = r14
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r9)
            r10.add(r0)
            return
    }

    private void addConstantNameAndType(int r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            net.bytebuddy.jar.asm.SymbolTable$Entry r6 = new net.bytebuddy.jar.asm.SymbolTable$Entry
            r0 = 12
            int r5 = hash(r0, r9, r10)
            r2 = 12
            r0 = r6
            r1 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r7.add(r6)
            return
    }

    private void addConstantUtf8(int r4, java.lang.String r5) {
            r3 = this;
            net.bytebuddy.jar.asm.SymbolTable$Entry r0 = new net.bytebuddy.jar.asm.SymbolTable$Entry
            r1 = 1
            int r2 = hash(r1, r5)
            r0.<init>(r4, r1, r5, r2)
            r3.add(r0)
            return
    }

    private net.bytebuddy.jar.asm.Symbol addConstantUtf8Reference(int r5, java.lang.String r6) {
            r4 = this;
            int r0 = hash(r5, r6)
            net.bytebuddy.jar.asm.SymbolTable$Entry r1 = r4.get(r0)
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
            net.bytebuddy.jar.asm.SymbolTable$Entry r1 = r1.next
            goto L8
        L1e:
            net.bytebuddy.jar.asm.ByteVector r1 = r4.constantPool
            int r2 = r4.addConstantUtf8(r6)
            r1.put12(r5, r2)
            net.bytebuddy.jar.asm.SymbolTable$Entry r1 = new net.bytebuddy.jar.asm.SymbolTable$Entry
            int r2 = r4.constantPoolCount
            int r3 = r2 + 1
            r4.constantPoolCount = r3
            r1.<init>(r2, r5, r6, r0)
            net.bytebuddy.jar.asm.SymbolTable$Entry r5 = r4.put(r1)
            return r5
    }

    private void addConstantUtf8Reference(int r3, int r4, java.lang.String r5) {
            r2 = this;
            net.bytebuddy.jar.asm.SymbolTable$Entry r0 = new net.bytebuddy.jar.asm.SymbolTable$Entry
            int r1 = hash(r4, r5)
            r0.<init>(r3, r4, r5, r1)
            r2.add(r0)
            return
    }

    private int addTypeInternal(net.bytebuddy.jar.asm.SymbolTable.Entry r5) {
            r4 = this;
            net.bytebuddy.jar.asm.SymbolTable$Entry[] r0 = r4.typeTable
            if (r0 != 0) goto La
            r0 = 16
            net.bytebuddy.jar.asm.SymbolTable$Entry[] r0 = new net.bytebuddy.jar.asm.SymbolTable.Entry[r0]
            r4.typeTable = r0
        La:
            int r0 = r4.typeCount
            net.bytebuddy.jar.asm.SymbolTable$Entry[] r1 = r4.typeTable
            int r2 = r1.length
            if (r0 != r2) goto L1d
            int r0 = r1.length
            int r0 = r0 * 2
            net.bytebuddy.jar.asm.SymbolTable$Entry[] r0 = new net.bytebuddy.jar.asm.SymbolTable.Entry[r0]
            int r2 = r1.length
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r0, r3, r2)
            r4.typeTable = r0
        L1d:
            net.bytebuddy.jar.asm.SymbolTable$Entry[] r0 = r4.typeTable
            int r1 = r4.typeCount
            int r2 = r1 + 1
            r4.typeCount = r2
            r0[r1] = r5
            net.bytebuddy.jar.asm.SymbolTable$Entry r5 = r4.put(r5)
            int r5 = r5.index
            return r5
    }

    private void copyBootstrapMethods(net.bytebuddy.jar.asm.ClassReader r11, char[] r12) {
            r10 = this;
            byte[] r0 = r11.classFileBuffer
            int r1 = r11.getFirstAttributeOffset()
            int r2 = r1 + (-2)
            int r2 = r11.readUnsignedShort(r2)
        Lc:
            if (r2 <= 0) goto L2f
            java.lang.String r3 = r11.readUTF8(r1, r12)
            java.lang.String r4 = "BootstrapMethods"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L23
            int r2 = r1 + 6
            int r2 = r11.readUnsignedShort(r2)
            r10.bootstrapMethodCount = r2
            goto L2f
        L23:
            int r3 = r1 + 2
            int r3 = r11.readInt(r3)
            int r3 = r3 + 6
            int r1 = r1 + r3
            int r2 = r2 + (-1)
            goto Lc
        L2f:
            int r2 = r10.bootstrapMethodCount
            if (r2 <= 0) goto L8d
            int r2 = r1 + 8
            int r1 = r1 + 2
            int r1 = r11.readInt(r1)
            int r1 = r1 + (-2)
            net.bytebuddy.jar.asm.ByteVector r3 = new net.bytebuddy.jar.asm.ByteVector
            r3.<init>(r1)
            r10.bootstrapMethods = r3
            r3.putByteArray(r0, r2, r1)
            r0 = 0
            r1 = r2
        L49:
            int r3 = r10.bootstrapMethodCount
            if (r0 >= r3) goto L8d
            int r3 = r1 - r2
            int r4 = r11.readUnsignedShort(r1)
            int r5 = r1 + 2
            int r5 = r11.readUnsignedShort(r5)
            int r1 = r1 + 4
            java.lang.Object r4 = r11.readConst(r4, r12)
            int r4 = r4.hashCode()
        L63:
            int r6 = r5 + (-1)
            if (r5 <= 0) goto L78
            int r5 = r11.readUnsignedShort(r1)
            int r1 = r1 + 2
            java.lang.Object r5 = r11.readConst(r5, r12)
            int r5 = r5.hashCode()
            r4 = r4 ^ r5
            r5 = r6
            goto L63
        L78:
            net.bytebuddy.jar.asm.SymbolTable$Entry r9 = new net.bytebuddy.jar.asm.SymbolTable$Entry
            long r6 = (long) r3
            r3 = 2147483647(0x7fffffff, float:NaN)
            r8 = r4 & r3
            r5 = 64
            r3 = r9
            r4 = r0
            r3.<init>(r4, r5, r6, r8)
            r10.add(r9)
            int r0 = r0 + 1
            goto L49
        L8d:
            return
    }

    private net.bytebuddy.jar.asm.SymbolTable.Entry get(int r3) {
            r2 = this;
            net.bytebuddy.jar.asm.SymbolTable$Entry[] r0 = r2.entries
            int r1 = r0.length
            int r3 = r3 % r1
            r3 = r0[r3]
            return r3
    }

    private net.bytebuddy.jar.asm.SymbolTable.LabelEntry getOrAddLabelEntry(net.bytebuddy.jar.asm.Label r9) {
            r8 = this;
            net.bytebuddy.jar.asm.SymbolTable$LabelEntry[] r0 = r8.labelEntries
            if (r0 != 0) goto Le
            r0 = 16
            net.bytebuddy.jar.asm.SymbolTable$LabelEntry[] r1 = new net.bytebuddy.jar.asm.SymbolTable.LabelEntry[r0]
            r8.labelEntries = r1
            net.bytebuddy.jar.asm.SymbolTable$LabelEntry[] r0 = new net.bytebuddy.jar.asm.SymbolTable.LabelEntry[r0]
            r8.labelTable = r0
        Le:
            int r0 = java.lang.System.identityHashCode(r9)
            net.bytebuddy.jar.asm.SymbolTable$LabelEntry[] r1 = r8.labelEntries
            int r2 = r1.length
            int r2 = r0 % r2
            r1 = r1[r2]
        L19:
            if (r1 == 0) goto L22
            net.bytebuddy.jar.asm.Label r2 = r1.label
            if (r2 == r9) goto L22
            net.bytebuddy.jar.asm.SymbolTable$LabelEntry r1 = r1.next
            goto L19
        L22:
            if (r1 == 0) goto L25
            return r1
        L25:
            int r1 = r8.labelCount
            net.bytebuddy.jar.asm.SymbolTable$LabelEntry[] r2 = r8.labelEntries
            int r3 = r2.length
            int r3 = r3 * 3
            int r3 = r3 / 4
            if (r1 <= r3) goto L57
            int r1 = r2.length
            int r2 = r1 * 2
            int r2 = r2 + 1
            net.bytebuddy.jar.asm.SymbolTable$LabelEntry[] r3 = new net.bytebuddy.jar.asm.SymbolTable.LabelEntry[r2]
            int r1 = r1 + (-1)
        L39:
            if (r1 < 0) goto L55
            net.bytebuddy.jar.asm.SymbolTable$LabelEntry[] r4 = r8.labelEntries
            r4 = r4[r1]
        L3f:
            if (r4 == 0) goto L52
            net.bytebuddy.jar.asm.Label r5 = r4.label
            int r5 = java.lang.System.identityHashCode(r5)
            int r5 = r5 % r2
            net.bytebuddy.jar.asm.SymbolTable$LabelEntry r6 = r4.next
            r7 = r3[r5]
            r4.next = r7
            r3[r5] = r4
            r4 = r6
            goto L3f
        L52:
            int r1 = r1 + (-1)
            goto L39
        L55:
            r8.labelEntries = r3
        L57:
            int r1 = r8.labelCount
            net.bytebuddy.jar.asm.SymbolTable$LabelEntry[] r2 = r8.labelTable
            int r3 = r2.length
            if (r1 != r3) goto L6a
            int r1 = r2.length
            int r1 = r1 * 2
            net.bytebuddy.jar.asm.SymbolTable$LabelEntry[] r1 = new net.bytebuddy.jar.asm.SymbolTable.LabelEntry[r1]
            int r3 = r2.length
            r4 = 0
            java.lang.System.arraycopy(r2, r4, r1, r4, r3)
            r8.labelTable = r1
        L6a:
            net.bytebuddy.jar.asm.SymbolTable$LabelEntry r1 = new net.bytebuddy.jar.asm.SymbolTable$LabelEntry
            int r2 = r8.labelCount
            r1.<init>(r2, r9)
            net.bytebuddy.jar.asm.SymbolTable$LabelEntry[] r9 = r8.labelEntries
            int r2 = r9.length
            int r0 = r0 % r2
            r2 = r9[r0]
            r1.next = r2
            r9[r0] = r1
            net.bytebuddy.jar.asm.SymbolTable$LabelEntry[] r9 = r8.labelTable
            int r0 = r8.labelCount
            int r2 = r0 + 1
            r8.labelCount = r2
            r9[r0] = r1
            return r1
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
            int r0 = r0 + r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            return r0
    }

    private static int hash(int r0, java.lang.String r1, int r2) {
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 + r2
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            return r0
    }

    private static int hash(int r0, java.lang.String r1, java.lang.String r2) {
            int r1 = r1.hashCode()
            int r2 = r2.hashCode()
            int r1 = r1 * r2
            int r0 = r0 + r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            return r0
    }

    private static int hash(int r0, java.lang.String r1, java.lang.String r2, int r3) {
            int r1 = r1.hashCode()
            int r2 = r2.hashCode()
            int r1 = r1 * r2
            int r3 = r3 + 1
            int r1 = r1 * r3
            int r0 = r0 + r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            return r0
    }

    private static int hash(int r0, java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            int r1 = r1.hashCode()
            int r2 = r2.hashCode()
            int r1 = r1 * r2
            int r2 = r3.hashCode()
            int r1 = r1 * r2
            int r0 = r0 + r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            return r0
    }

    private static int hash(int r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4) {
            int r1 = r1.hashCode()
            int r2 = r2.hashCode()
            int r1 = r1 * r2
            int r2 = r3.hashCode()
            int r1 = r1 * r2
            int r1 = r1 * r4
            int r0 = r0 + r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            return r0
    }

    private net.bytebuddy.jar.asm.SymbolTable.Entry put(net.bytebuddy.jar.asm.SymbolTable.Entry r8) {
            r7 = this;
            int r0 = r7.entryCount
            net.bytebuddy.jar.asm.SymbolTable$Entry[] r1 = r7.entries
            int r2 = r1.length
            int r2 = r2 * 3
            int r2 = r2 / 4
            if (r0 <= r2) goto L2e
            int r0 = r1.length
            int r1 = r0 * 2
            int r1 = r1 + 1
            net.bytebuddy.jar.asm.SymbolTable$Entry[] r2 = new net.bytebuddy.jar.asm.SymbolTable.Entry[r1]
            int r0 = r0 + (-1)
        L14:
            if (r0 < 0) goto L2c
            net.bytebuddy.jar.asm.SymbolTable$Entry[] r3 = r7.entries
            r3 = r3[r0]
        L1a:
            if (r3 == 0) goto L29
            int r4 = r3.hashCode
            int r4 = r4 % r1
            net.bytebuddy.jar.asm.SymbolTable$Entry r5 = r3.next
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
            net.bytebuddy.jar.asm.SymbolTable$Entry[] r1 = r7.entries
            int r2 = r1.length
            int r0 = r0 % r2
            r2 = r1[r0]
            r8.next = r2
            r1[r0] = r8
            return r8
    }

    public net.bytebuddy.jar.asm.Symbol addBootstrapMethod(net.bytebuddy.jar.asm.Handle r12, java.lang.Object... r13) {
            r11 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = r11.bootstrapMethods
            if (r0 != 0) goto Lb
            net.bytebuddy.jar.asm.ByteVector r0 = new net.bytebuddy.jar.asm.ByteVector
            r0.<init>()
            r11.bootstrapMethods = r0
        Lb:
            int r1 = r13.length
            int[] r2 = new int[r1]
            r3 = 0
            r4 = r3
        L10:
            if (r4 >= r1) goto L1f
            r5 = r13[r4]
            net.bytebuddy.jar.asm.Symbol r5 = r11.addConstant(r5)
            int r5 = r5.index
            r2[r4] = r5
            int r4 = r4 + 1
            goto L10
        L1f:
            int r4 = r0.length
            int r6 = r12.getTag()
            java.lang.String r7 = r12.getOwner()
            java.lang.String r8 = r12.getName()
            java.lang.String r9 = r12.getDesc()
            boolean r10 = r12.isInterface()
            r5 = r11
            net.bytebuddy.jar.asm.Symbol r5 = r5.addConstantMethodHandle(r6, r7, r8, r9, r10)
            int r5 = r5.index
            r0.putShort(r5)
            r0.putShort(r1)
            r5 = r3
        L43:
            if (r5 >= r1) goto L4d
            r6 = r2[r5]
            r0.putShort(r6)
            int r5 = r5 + 1
            goto L43
        L4d:
            int r0 = r0.length
            int r0 = r0 - r4
            int r12 = r12.hashCode()
            int r1 = r13.length
        L55:
            if (r3 >= r1) goto L61
            r2 = r13[r3]
            int r2 = r2.hashCode()
            r12 = r12 ^ r2
            int r3 = r3 + 1
            goto L55
        L61:
            r13 = 2147483647(0x7fffffff, float:NaN)
            r12 = r12 & r13
            net.bytebuddy.jar.asm.Symbol r12 = r11.addBootstrapMethod(r4, r0, r12)
            return r12
    }

    public net.bytebuddy.jar.asm.Symbol addConstant(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 == 0) goto Lf
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            net.bytebuddy.jar.asm.Symbol r7 = r6.addConstantInteger(r7)
            return r7
        Lf:
            boolean r0 = r7 instanceof java.lang.Byte
            if (r0 == 0) goto L1e
            java.lang.Byte r7 = (java.lang.Byte) r7
            int r7 = r7.intValue()
            net.bytebuddy.jar.asm.Symbol r7 = r6.addConstantInteger(r7)
            return r7
        L1e:
            boolean r0 = r7 instanceof java.lang.Character
            if (r0 == 0) goto L2d
            java.lang.Character r7 = (java.lang.Character) r7
            char r7 = r7.charValue()
            net.bytebuddy.jar.asm.Symbol r7 = r6.addConstantInteger(r7)
            return r7
        L2d:
            boolean r0 = r7 instanceof java.lang.Short
            if (r0 == 0) goto L3c
            java.lang.Short r7 = (java.lang.Short) r7
            int r7 = r7.intValue()
            net.bytebuddy.jar.asm.Symbol r7 = r6.addConstantInteger(r7)
            return r7
        L3c:
            boolean r0 = r7 instanceof java.lang.Boolean
            if (r0 == 0) goto L4b
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            net.bytebuddy.jar.asm.Symbol r7 = r6.addConstantInteger(r7)
            return r7
        L4b:
            boolean r0 = r7 instanceof java.lang.Float
            if (r0 == 0) goto L5a
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            net.bytebuddy.jar.asm.Symbol r7 = r6.addConstantFloat(r7)
            return r7
        L5a:
            boolean r0 = r7 instanceof java.lang.Long
            if (r0 == 0) goto L69
            java.lang.Long r7 = (java.lang.Long) r7
            long r0 = r7.longValue()
            net.bytebuddy.jar.asm.Symbol r7 = r6.addConstantLong(r0)
            return r7
        L69:
            boolean r0 = r7 instanceof java.lang.Double
            if (r0 == 0) goto L78
            java.lang.Double r7 = (java.lang.Double) r7
            double r0 = r7.doubleValue()
            net.bytebuddy.jar.asm.Symbol r7 = r6.addConstantDouble(r0)
            return r7
        L78:
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L83
            java.lang.String r7 = (java.lang.String) r7
            net.bytebuddy.jar.asm.Symbol r7 = r6.addConstantString(r7)
            return r7
        L83:
            boolean r0 = r7 instanceof net.bytebuddy.jar.asm.Type
            if (r0 == 0) goto Lb0
            net.bytebuddy.jar.asm.Type r7 = (net.bytebuddy.jar.asm.Type) r7
            int r0 = r7.getSort()
            r1 = 10
            if (r0 != r1) goto L9a
            java.lang.String r7 = r7.getInternalName()
            net.bytebuddy.jar.asm.Symbol r7 = r6.addConstantClass(r7)
            return r7
        L9a:
            r1 = 11
            if (r0 != r1) goto La7
            java.lang.String r7 = r7.getDescriptor()
            net.bytebuddy.jar.asm.Symbol r7 = r6.addConstantMethodType(r7)
            return r7
        La7:
            java.lang.String r7 = r7.getDescriptor()
            net.bytebuddy.jar.asm.Symbol r7 = r6.addConstantClass(r7)
            return r7
        Lb0:
            boolean r0 = r7 instanceof net.bytebuddy.jar.asm.Handle
            if (r0 == 0) goto Ld0
            net.bytebuddy.jar.asm.Handle r7 = (net.bytebuddy.jar.asm.Handle) r7
            int r1 = r7.getTag()
            java.lang.String r2 = r7.getOwner()
            java.lang.String r3 = r7.getName()
            java.lang.String r4 = r7.getDesc()
            boolean r5 = r7.isInterface()
            r0 = r6
            net.bytebuddy.jar.asm.Symbol r7 = r0.addConstantMethodHandle(r1, r2, r3, r4, r5)
            return r7
        Ld0:
            boolean r0 = r7 instanceof net.bytebuddy.jar.asm.ConstantDynamic
            if (r0 == 0) goto Leb
            net.bytebuddy.jar.asm.ConstantDynamic r7 = (net.bytebuddy.jar.asm.ConstantDynamic) r7
            java.lang.String r0 = r7.getName()
            java.lang.String r1 = r7.getDescriptor()
            net.bytebuddy.jar.asm.Handle r2 = r7.getBootstrapMethod()
            java.lang.Object[] r7 = r7.getBootstrapMethodArgumentsUnsafe()
            net.bytebuddy.jar.asm.Symbol r7 = r6.addConstantDynamic(r0, r1, r2, r7)
            return r7
        Leb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "value "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
    }

    public net.bytebuddy.jar.asm.Symbol addConstantClass(java.lang.String r2) {
            r1 = this;
            r0 = 7
            net.bytebuddy.jar.asm.Symbol r2 = r1.addConstantUtf8Reference(r0, r2)
            return r2
    }

    public net.bytebuddy.jar.asm.Symbol addConstantDouble(double r2) {
            r1 = this;
            r0 = 6
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            net.bytebuddy.jar.asm.Symbol r2 = r1.addConstantLongOrDouble(r0, r2)
            return r2
    }

    public net.bytebuddy.jar.asm.Symbol addConstantDynamic(java.lang.String r1, java.lang.String r2, net.bytebuddy.jar.asm.Handle r3, java.lang.Object... r4) {
            r0 = this;
            net.bytebuddy.jar.asm.Symbol r3 = r0.addBootstrapMethod(r3, r4)
            r4 = 17
            int r3 = r3.index
            net.bytebuddy.jar.asm.Symbol r1 = r0.addConstantDynamicOrInvokeDynamicReference(r4, r1, r2, r3)
            return r1
    }

    public net.bytebuddy.jar.asm.Symbol addConstantFieldref(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = 9
            net.bytebuddy.jar.asm.SymbolTable$Entry r2 = r1.addConstantMemberReference(r0, r2, r3, r4)
            return r2
    }

    public net.bytebuddy.jar.asm.Symbol addConstantFloat(float r2) {
            r1 = this;
            r0 = 4
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            net.bytebuddy.jar.asm.Symbol r2 = r1.addConstantIntegerOrFloat(r0, r2)
            return r2
    }

    public net.bytebuddy.jar.asm.Symbol addConstantInteger(int r2) {
            r1 = this;
            r0 = 3
            net.bytebuddy.jar.asm.Symbol r2 = r1.addConstantIntegerOrFloat(r0, r2)
            return r2
    }

    public net.bytebuddy.jar.asm.Symbol addConstantInvokeDynamic(java.lang.String r1, java.lang.String r2, net.bytebuddy.jar.asm.Handle r3, java.lang.Object... r4) {
            r0 = this;
            net.bytebuddy.jar.asm.Symbol r3 = r0.addBootstrapMethod(r3, r4)
            r4 = 18
            int r3 = r3.index
            net.bytebuddy.jar.asm.Symbol r1 = r0.addConstantDynamicOrInvokeDynamicReference(r4, r1, r2, r3)
            return r1
    }

    public net.bytebuddy.jar.asm.Symbol addConstantLong(long r2) {
            r1 = this;
            r0 = 5
            net.bytebuddy.jar.asm.Symbol r2 = r1.addConstantLongOrDouble(r0, r2)
            return r2
    }

    public net.bytebuddy.jar.asm.Symbol addConstantMethodHandle(int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15) {
            r10 = this;
            r0 = 15
            int r9 = hash(r0, r12, r13, r14, r11)
            net.bytebuddy.jar.asm.SymbolTable$Entry r1 = r10.get(r9)
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
            net.bytebuddy.jar.asm.SymbolTable$Entry r1 = r1.next
            goto La
        L37:
            r1 = 4
            if (r11 > r1) goto L46
            net.bytebuddy.jar.asm.ByteVector r15 = r10.constantPool
            net.bytebuddy.jar.asm.Symbol r1 = r10.addConstantFieldref(r12, r13, r14)
            int r1 = r1.index
            r15.put112(r0, r11, r1)
            goto L51
        L46:
            net.bytebuddy.jar.asm.ByteVector r1 = r10.constantPool
            net.bytebuddy.jar.asm.Symbol r15 = r10.addConstantMethodref(r12, r13, r14, r15)
            int r15 = r15.index
            r1.put112(r0, r11, r15)
        L51:
            net.bytebuddy.jar.asm.SymbolTable$Entry r15 = new net.bytebuddy.jar.asm.SymbolTable$Entry
            int r2 = r10.constantPoolCount
            int r0 = r2 + 1
            r10.constantPoolCount = r0
            r3 = 15
            long r7 = (long) r11
            r1 = r15
            r4 = r12
            r5 = r13
            r6 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r9)
            net.bytebuddy.jar.asm.SymbolTable$Entry r11 = r10.put(r15)
            return r11
    }

    public net.bytebuddy.jar.asm.Symbol addConstantMethodType(java.lang.String r2) {
            r1 = this;
            r0 = 16
            net.bytebuddy.jar.asm.Symbol r2 = r1.addConstantUtf8Reference(r0, r2)
            return r2
    }

    public net.bytebuddy.jar.asm.Symbol addConstantMethodref(java.lang.String r1, java.lang.String r2, java.lang.String r3, boolean r4) {
            r0 = this;
            if (r4 == 0) goto L5
            r4 = 11
            goto L7
        L5:
            r4 = 10
        L7:
            net.bytebuddy.jar.asm.SymbolTable$Entry r1 = r0.addConstantMemberReference(r4, r1, r2, r3)
            return r1
    }

    public net.bytebuddy.jar.asm.Symbol addConstantModule(java.lang.String r2) {
            r1 = this;
            r0 = 19
            net.bytebuddy.jar.asm.Symbol r2 = r1.addConstantUtf8Reference(r0, r2)
            return r2
    }

    public int addConstantNameAndType(java.lang.String r8, java.lang.String r9) {
            r7 = this;
            r0 = 12
            int r6 = hash(r0, r8, r9)
            net.bytebuddy.jar.asm.SymbolTable$Entry r1 = r7.get(r6)
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
            net.bytebuddy.jar.asm.SymbolTable$Entry r1 = r1.next
            goto La
        L2a:
            net.bytebuddy.jar.asm.ByteVector r1 = r7.constantPool
            int r2 = r7.addConstantUtf8(r8)
            int r3 = r7.addConstantUtf8(r9)
            r1.put122(r0, r2, r3)
            net.bytebuddy.jar.asm.SymbolTable$Entry r0 = new net.bytebuddy.jar.asm.SymbolTable$Entry
            int r2 = r7.constantPoolCount
            int r1 = r2 + 1
            r7.constantPoolCount = r1
            r3 = 12
            r1 = r0
            r4 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            net.bytebuddy.jar.asm.SymbolTable$Entry r8 = r7.put(r0)
            int r8 = r8.index
            return r8
    }

    public net.bytebuddy.jar.asm.Symbol addConstantPackage(java.lang.String r2) {
            r1 = this;
            r0 = 20
            net.bytebuddy.jar.asm.Symbol r2 = r1.addConstantUtf8Reference(r0, r2)
            return r2
    }

    public net.bytebuddy.jar.asm.Symbol addConstantString(java.lang.String r2) {
            r1 = this;
            r0 = 8
            net.bytebuddy.jar.asm.Symbol r2 = r1.addConstantUtf8Reference(r0, r2)
            return r2
    }

    public int addConstantUtf8(java.lang.String r6) {
            r5 = this;
            r0 = 1
            int r1 = hash(r0, r6)
            net.bytebuddy.jar.asm.SymbolTable$Entry r2 = r5.get(r1)
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
            net.bytebuddy.jar.asm.SymbolTable$Entry r2 = r2.next
            goto L9
        L21:
            net.bytebuddy.jar.asm.ByteVector r2 = r5.constantPool
            net.bytebuddy.jar.asm.ByteVector r2 = r2.putByte(r0)
            r2.putUTF8(r6)
            net.bytebuddy.jar.asm.SymbolTable$Entry r2 = new net.bytebuddy.jar.asm.SymbolTable$Entry
            int r3 = r5.constantPoolCount
            int r4 = r3 + 1
            r5.constantPoolCount = r4
            r2.<init>(r3, r0, r6, r1)
            net.bytebuddy.jar.asm.SymbolTable$Entry r6 = r5.put(r2)
            int r6 = r6.index
            return r6
    }

    public int addForwardUninitializedType(java.lang.String r9, net.bytebuddy.jar.asm.Label r10) {
            r8 = this;
            net.bytebuddy.jar.asm.SymbolTable$LabelEntry r10 = r8.getOrAddLabelEntry(r10)
            int r10 = r10.index
            r0 = 130(0x82, float:1.82E-43)
            int r7 = hash(r0, r9, r10)
            net.bytebuddy.jar.asm.SymbolTable$Entry r1 = r8.get(r7)
        L10:
            if (r1 == 0) goto L2f
            int r2 = r1.tag
            if (r2 != r0) goto L2c
            int r2 = r1.hashCode
            if (r2 != r7) goto L2c
            long r2 = r1.data
            long r4 = (long) r10
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L2c
            java.lang.String r2 = r1.value
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L2c
            int r9 = r1.index
            return r9
        L2c:
            net.bytebuddy.jar.asm.SymbolTable$Entry r1 = r1.next
            goto L10
        L2f:
            net.bytebuddy.jar.asm.SymbolTable$Entry r0 = new net.bytebuddy.jar.asm.SymbolTable$Entry
            int r2 = r8.typeCount
            r3 = 130(0x82, float:1.82E-43)
            long r5 = (long) r10
            r1 = r0
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r7)
            int r9 = r8.addTypeInternal(r0)
            return r9
    }

    public int addMergedType(int r9, int r10) {
            r8 = this;
            r0 = 32
            if (r9 >= r10) goto Lb
            long r1 = (long) r9
            long r3 = (long) r10
        L6:
            long r3 = r3 << r0
            long r0 = r1 | r3
            r5 = r0
            goto Le
        Lb:
            long r1 = (long) r10
            long r3 = (long) r9
            goto L6
        Le:
            int r0 = r9 + r10
            r1 = 131(0x83, float:1.84E-43)
            int r7 = hash(r1, r0)
            net.bytebuddy.jar.asm.SymbolTable$Entry r0 = r8.get(r7)
        L1a:
            if (r0 == 0) goto L30
            int r2 = r0.tag
            if (r2 != r1) goto L2d
            int r2 = r0.hashCode
            if (r2 != r7) goto L2d
            long r2 = r0.data
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L2d
            int r9 = r0.info
            return r9
        L2d:
            net.bytebuddy.jar.asm.SymbolTable$Entry r0 = r0.next
            goto L1a
        L30:
            net.bytebuddy.jar.asm.SymbolTable$Entry[] r0 = r8.typeTable
            r9 = r0[r9]
            java.lang.String r9 = r9.value
            r10 = r0[r10]
            java.lang.String r10 = r10.value
            net.bytebuddy.jar.asm.ClassWriter r0 = r8.classWriter
            java.lang.String r9 = r0.getCommonSuperClass(r9, r10)
            int r9 = r8.addType(r9)
            net.bytebuddy.jar.asm.SymbolTable$Entry r10 = new net.bytebuddy.jar.asm.SymbolTable$Entry
            int r3 = r8.typeCount
            r4 = 131(0x83, float:1.84E-43)
            r2 = r10
            r2.<init>(r3, r4, r5, r7)
            net.bytebuddy.jar.asm.SymbolTable$Entry r10 = r8.put(r10)
            r10.info = r9
            return r9
    }

    public int addType(java.lang.String r5) {
            r4 = this;
            r0 = 128(0x80, float:1.8E-43)
            int r1 = hash(r0, r5)
            net.bytebuddy.jar.asm.SymbolTable$Entry r2 = r4.get(r1)
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
            net.bytebuddy.jar.asm.SymbolTable$Entry r2 = r2.next
            goto La
        L22:
            net.bytebuddy.jar.asm.SymbolTable$Entry r2 = new net.bytebuddy.jar.asm.SymbolTable$Entry
            int r3 = r4.typeCount
            r2.<init>(r3, r0, r5, r1)
            int r5 = r4.addTypeInternal(r2)
            return r5
    }

    public int addUninitializedType(java.lang.String r9, int r10) {
            r8 = this;
            r0 = 129(0x81, float:1.81E-43)
            int r7 = hash(r0, r9, r10)
            net.bytebuddy.jar.asm.SymbolTable$Entry r1 = r8.get(r7)
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
            net.bytebuddy.jar.asm.SymbolTable$Entry r1 = r1.next
            goto La
        L29:
            net.bytebuddy.jar.asm.SymbolTable$Entry r0 = new net.bytebuddy.jar.asm.SymbolTable$Entry
            int r2 = r8.typeCount
            r3 = 129(0x81, float:1.81E-43)
            long r5 = (long) r10
            r1 = r0
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r7)
            int r9 = r8.addTypeInternal(r0)
            return r9
    }

    public int computeBootstrapMethodsSize() {
            r1 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = r1.bootstrapMethods
            if (r0 == 0) goto L10
            java.lang.String r0 = "BootstrapMethods"
            r1.addConstantUtf8(r0)
            net.bytebuddy.jar.asm.ByteVector r0 = r1.bootstrapMethods
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
            net.bytebuddy.jar.asm.ByteVector r0 = r1.constantPool
            int r0 = r0.length
            return r0
    }

    public net.bytebuddy.jar.asm.Label getForwardUninitializedLabel(int r4) {
            r3 = this;
            net.bytebuddy.jar.asm.SymbolTable$LabelEntry[] r0 = r3.labelTable
            net.bytebuddy.jar.asm.SymbolTable$Entry[] r1 = r3.typeTable
            r4 = r1[r4]
            long r1 = r4.data
            int r4 = (int) r1
            r4 = r0[r4]
            net.bytebuddy.jar.asm.Label r4 = r4.label
            return r4
    }

    public int getMajorVersion() {
            r1 = this;
            int r0 = r1.majorVersion
            return r0
    }

    public net.bytebuddy.jar.asm.ClassReader getSource() {
            r1 = this;
            net.bytebuddy.jar.asm.ClassReader r0 = r1.sourceClassReader
            return r0
    }

    public net.bytebuddy.jar.asm.Symbol getType(int r2) {
            r1 = this;
            net.bytebuddy.jar.asm.SymbolTable$Entry[] r0 = r1.typeTable
            r2 = r0[r2]
            return r2
    }

    public void putBootstrapMethods(net.bytebuddy.jar.asm.ByteVector r4) {
            r3 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = r3.bootstrapMethods
            if (r0 == 0) goto L28
            java.lang.String r0 = "BootstrapMethods"
            int r0 = r3.addConstantUtf8(r0)
            net.bytebuddy.jar.asm.ByteVector r4 = r4.putShort(r0)
            net.bytebuddy.jar.asm.ByteVector r0 = r3.bootstrapMethods
            int r0 = r0.length
            int r0 = r0 + 2
            net.bytebuddy.jar.asm.ByteVector r4 = r4.putInt(r0)
            int r0 = r3.bootstrapMethodCount
            net.bytebuddy.jar.asm.ByteVector r4 = r4.putShort(r0)
            net.bytebuddy.jar.asm.ByteVector r0 = r3.bootstrapMethods
            byte[] r1 = r0.data
            r2 = 0
            int r0 = r0.length
            r4.putByteArray(r1, r2, r0)
        L28:
            return
    }

    public void putConstantPool(net.bytebuddy.jar.asm.ByteVector r4) {
            r3 = this;
            int r0 = r3.constantPoolCount
            net.bytebuddy.jar.asm.ByteVector r4 = r4.putShort(r0)
            net.bytebuddy.jar.asm.ByteVector r0 = r3.constantPool
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
            net.bytebuddy.jar.asm.Symbol r1 = r0.addConstantClass(r2)
            int r1 = r1.index
            return r1
    }
}
