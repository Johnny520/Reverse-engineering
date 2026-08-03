package bsh.org.objectweb.asm;

import p089g1.C1275d;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class SymbolTable {
    private int bootstrapMethodCount;
    private ByteVector bootstrapMethods;
    private String className;
    final ClassWriter classWriter;
    private int entryCount;
    private int majorVersion;
    private int typeCount;
    private Entry[] typeTable;
    private Entry[] entries = new Entry[Opcodes.ACC_NATIVE];
    private int constantPoolCount = 1;
    private ByteVector constantPool = new ByteVector();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SymbolTable(ClassWriter classWriter) {
        this.classWriter = classWriter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void add(Entry entry) {
        this.entryCount++;
        int i9 = entry.hashCode;
        Entry[] entryArr = this.entries;
        int length = i9 % entryArr.length;
        entry.next = entryArr[length];
        entryArr[length] = entry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Symbol addConstantDynamicOrInvokeDynamicReference(int i9, String str, String str2, int i10) {
        int iHash = hash(i9, str, str2, i10);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == i9 && entry.hashCode == iHash && entry.data == i10 && entry.name.equals(str) && entry.value.equals(str2)) {
                return entry;
            }
        }
        this.constantPool.put122(i9, i10, addConstantNameAndType(str, str2));
        int i11 = this.constantPoolCount;
        this.constantPoolCount = i11 + 1;
        return put(new Entry(i11, i9, null, str, str2, i10, iHash));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Symbol addConstantInteger(int i9, int i10) {
        int iHash = hash(i9, i10);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == i9 && entry.hashCode == iHash && entry.data == i10) {
                return entry;
            }
        }
        this.constantPool.putByte(i9).putInt(i10);
        int i11 = this.constantPoolCount;
        this.constantPoolCount = i11 + 1;
        return put(new Entry(i11, i9, i10, iHash));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Symbol addConstantLong(int i9, long j3) {
        int iHash = hash(i9, j3);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == i9 && entry.hashCode == iHash && entry.data == j3) {
                return entry;
            }
        }
        int i10 = this.constantPoolCount;
        this.constantPool.putByte(i9).putLong(j3);
        this.constantPoolCount += 2;
        return put(new Entry(i10, i9, j3, iHash));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Entry addConstantMemberReference(int i9, String str, String str2, String str3) {
        int iHash = hash(i9, str, str2, str3);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == i9 && entry.hashCode == iHash && entry.owner.equals(str) && entry.name.equals(str2) && entry.value.equals(str3)) {
                return entry;
            }
        }
        this.constantPool.put122(i9, addConstantClass(str).index, addConstantNameAndType(str2, str3));
        int i10 = this.constantPoolCount;
        this.constantPoolCount = i10 + 1;
        return put(new Entry(i10, i9, str, str2, str3, 0L, iHash));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Symbol addConstantUtf8Reference(int i9, String str) {
        int iHash = hash(i9, str);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == i9 && entry.hashCode == iHash && entry.value.equals(str)) {
                return entry;
            }
        }
        this.constantPool.put12(i9, addConstantUtf8(str));
        int i10 = this.constantPoolCount;
        this.constantPoolCount = i10 + 1;
        return put(new Entry(i10, i9, str, iHash));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Entry get(int i9) {
        Entry[] entryArr = this.entries;
        return entryArr[i9 % entryArr.length];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int hash(int i9, String str, String str2, String str3, int i10) {
        return Integer.MAX_VALUE & ((str3.hashCode() * str2.hashCode() * str.hashCode() * i10) + i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Entry put(Entry entry) {
        int i9 = this.entryCount;
        Entry[] entryArr = this.entries;
        if (i9 > (entryArr.length * 3) / 4) {
            int length = entryArr.length;
            int i10 = (length * 2) + 1;
            Entry[] entryArr2 = new Entry[i10];
            for (int i11 = length - 1; i11 >= 0; i11--) {
                Entry entry2 = this.entries[i11];
                while (entry2 != null) {
                    int i12 = entry2.hashCode % i10;
                    Entry entry3 = entry2.next;
                    entry2.next = entryArr2[i12];
                    entryArr2[i12] = entry2;
                    entry2 = entry3;
                }
            }
            this.entries = entryArr2;
        }
        this.entryCount++;
        int i13 = entry.hashCode;
        Entry[] entryArr3 = this.entries;
        int length2 = i13 % entryArr3.length;
        entry.next = entryArr3[length2];
        entryArr3[length2] = entry;
        return entry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Symbol addBootstrapMethod(Handle handle, Object... objArr) {
        ByteVector byteVector = this.bootstrapMethods;
        if (byteVector == null) {
            byteVector = new ByteVector();
            this.bootstrapMethods = byteVector;
        }
        for (Object obj : objArr) {
            addConstant(obj);
        }
        int i9 = byteVector.length;
        byteVector.putShort(addConstantMethodHandle(handle.getTag(), handle.getOwner(), handle.getName(), handle.getDesc(), handle.isInterface()).index);
        byteVector.putShort(objArr.length);
        for (Object obj2 : objArr) {
            byteVector.putShort(addConstant(obj2).index);
        }
        int i10 = byteVector.length - i9;
        int iHashCode = handle.hashCode();
        for (Object obj3 : objArr) {
            iHashCode ^= obj3.hashCode();
        }
        return addBootstrapMethod(i9, i10, iHashCode & Integer.MAX_VALUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Symbol addConstant(Object obj) {
        if (obj instanceof Integer) {
            return addConstantInteger(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return addConstantInteger(((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return addConstantInteger(((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return addConstantInteger(((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return addConstantInteger(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Float) {
            return addConstantFloat(((Float) obj).floatValue());
        }
        if (obj instanceof Long) {
            return addConstantLong(((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return addConstantDouble(((Double) obj).doubleValue());
        }
        if (obj instanceof String) {
            return addConstantString((String) obj);
        }
        if (obj instanceof Type) {
            Type type = (Type) obj;
            int sort = type.getSort();
            return sort == 10 ? addConstantClass(type.getInternalName()) : sort == 11 ? addConstantMethodType(type.getDescriptor()) : addConstantClass(type.getDescriptor());
        }
        if (obj instanceof Handle) {
            Handle handle = (Handle) obj;
            return addConstantMethodHandle(handle.getTag(), handle.getOwner(), handle.getName(), handle.getDesc(), handle.isInterface());
        }
        C1275d.m3412f(obj, "value ");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Symbol addConstantClass(String str) {
        return addConstantUtf8Reference(7, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Symbol addConstantDouble(double d10) {
        return addConstantLong(6, Double.doubleToRawLongBits(d10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Symbol addConstantDynamic(String str, String str2, Handle handle, Object... objArr) {
        return addConstantDynamicOrInvokeDynamicReference(17, str, str2, addBootstrapMethod(handle, objArr).index);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Symbol addConstantFieldref(String str, String str2, String str3) {
        return addConstantMemberReference(9, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Symbol addConstantFloat(float f3) {
        return addConstantInteger(4, Float.floatToRawIntBits(f3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Symbol addConstantInvokeDynamic(String str, String str2, Handle handle, Object... objArr) {
        return addConstantDynamicOrInvokeDynamicReference(18, str, str2, addBootstrapMethod(handle, objArr).index);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Symbol addConstantMethodHandle(int i9, String str, String str2, String str3, boolean z9) {
        int iHash = hash(15, str, str2, str3, i9);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == 15 && entry.hashCode == iHash && entry.data == i9 && entry.owner.equals(str) && entry.name.equals(str2) && entry.value.equals(str3)) {
                return entry;
            }
        }
        ByteVector byteVector = this.constantPool;
        if (i9 <= 4) {
            byteVector.put112(15, i9, addConstantFieldref(str, str2, str3).index);
        } else {
            byteVector.put112(15, i9, addConstantMethodref(str, str2, str3, z9).index);
        }
        int i10 = this.constantPoolCount;
        this.constantPoolCount = i10 + 1;
        return put(new Entry(i10, 15, str, str2, str3, i9, iHash));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Symbol addConstantMethodType(String str) {
        return addConstantUtf8Reference(16, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Symbol addConstantMethodref(String str, String str2, String str3, boolean z9) {
        return addConstantMemberReference(z9 ? 11 : 10, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Symbol addConstantModule(String str) {
        return addConstantUtf8Reference(19, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int addConstantNameAndType(String str, String str2) {
        int iHash = hash(12, str, str2);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == 12 && entry.hashCode == iHash && entry.name.equals(str) && entry.value.equals(str2)) {
                return entry.index;
            }
        }
        this.constantPool.put122(12, addConstantUtf8(str), addConstantUtf8(str2));
        int i9 = this.constantPoolCount;
        this.constantPoolCount = i9 + 1;
        return put(new Entry(i9, 12, str, str2, iHash)).index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Symbol addConstantPackage(String str) {
        return addConstantUtf8Reference(20, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Symbol addConstantString(String str) {
        return addConstantUtf8Reference(8, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int addConstantUtf8(String str) {
        int iHash = hash(1, str);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == 1 && entry.hashCode == iHash && entry.value.equals(str)) {
                return entry.index;
            }
        }
        this.constantPool.putByte(1).putUTF8(str);
        int i9 = this.constantPoolCount;
        this.constantPoolCount = i9 + 1;
        return put(new Entry(i9, 1, str, iHash)).index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int addMergedType(int i9, int i10) {
        long j3 = ((long) i9) | (((long) i10) << 32);
        int iHash = hash(130, i9 + i10);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == 130 && entry.hashCode == iHash && entry.data == j3) {
                return entry.info;
            }
        }
        Entry[] entryArr = this.typeTable;
        int iAddType = addType(this.classWriter.getCommonSuperClass(entryArr[i9].value, entryArr[i10].value));
        put(new Entry(this.typeCount, 130, j3, iHash)).info = iAddType;
        return iAddType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int addType(String str) {
        int iHash = hash(128, str);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == 128 && entry.hashCode == iHash && entry.value.equals(str)) {
                return entry.index;
            }
        }
        return addType(new Entry(this.typeCount, 128, str, iHash));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int addUninitializedType(String str, int i9) {
        int iHash = hash(129, str, i9);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == 129 && entry.hashCode == iHash && entry.data == i9 && entry.value.equals(str)) {
                return entry.index;
            }
        }
        return addType(new Entry(this.typeCount, 129, str, i9, iHash));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int computeBootstrapMethodsSize() {
        if (this.bootstrapMethods == null) {
            return 0;
        }
        addConstantUtf8("BootstrapMethods");
        return this.bootstrapMethods.length + 8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getClassName() {
        return this.className;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getConstantPoolCount() {
        return this.constantPoolCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getConstantPoolLength() {
        return this.constantPool.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getMajorVersion() {
        return this.majorVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Symbol getType(int i9) {
        return this.typeTable[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void putBootstrapMethods(ByteVector byteVector) {
        if (this.bootstrapMethods != null) {
            ByteVector byteVectorPutShort = byteVector.putShort(addConstantUtf8("BootstrapMethods")).putInt(this.bootstrapMethods.length + 2).putShort(this.bootstrapMethodCount);
            ByteVector byteVector2 = this.bootstrapMethods;
            byteVectorPutShort.putByteArray(byteVector2.data, 0, byteVector2.length);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void putConstantPool(ByteVector byteVector) {
        ByteVector byteVectorPutShort = byteVector.putShort(this.constantPoolCount);
        ByteVector byteVector2 = this.constantPool;
        byteVectorPutShort.putByteArray(byteVector2.data, 0, byteVector2.length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int setMajorVersionAndClassName(int i9, String str) {
        this.majorVersion = i9;
        this.className = str;
        return addConstantClass(str).index;
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class Entry extends Symbol {
        final int hashCode;
        Entry next;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Entry(int i9, int i10, String str, int i11) {
            super(i9, i10, null, null, str, 0L);
            this.hashCode = i11;
        }

        public Entry(int i9, int i10, String str, String str2, String str3, long j3, int i11) {
            super(i9, i10, str, str2, str3, j3);
            this.hashCode = i11;
        }

        public Entry(int i9, int i10, String str, long j3, int i11) {
            super(i9, i10, null, null, str, j3);
            this.hashCode = i11;
        }

        public Entry(int i9, int i10, String str, String str2, int i11) {
            super(i9, i10, null, str, str2, 0L);
            this.hashCode = i11;
        }

        public Entry(int i9, int i10, long j3, int i11) {
            super(i9, i10, null, null, null, j3);
            this.hashCode = i11;
        }
    }

    private static int hash(int i9, long j3) {
        return (i9 + ((int) j3) + ((int) (j3 >>> 32))) & Integer.MAX_VALUE;
    }

    private static int hash(int i9, String str) {
        return Integer.MAX_VALUE & (str.hashCode() + i9);
    }

    private static int hash(int i9, String str, int i10) {
        return Integer.MAX_VALUE & (str.hashCode() + i9 + i10);
    }

    private static int hash(int i9, String str, String str2) {
        return Integer.MAX_VALUE & ((str2.hashCode() * str.hashCode()) + i9);
    }

    private static int hash(int i9, String str, String str2, int i10) {
        return Integer.MAX_VALUE & (((i10 + 1) * str2.hashCode() * str.hashCode()) + i9);
    }

    private static int hash(int i9, String str, String str2, String str3) {
        return Integer.MAX_VALUE & ((str3.hashCode() * str2.hashCode() * str.hashCode()) + i9);
    }

    private static int hash(int i9, int i10) {
        return (i9 + i10) & Integer.MAX_VALUE;
    }

    private int addType(Entry entry) {
        if (this.typeTable == null) {
            this.typeTable = new Entry[16];
        }
        int i9 = this.typeCount;
        Entry[] entryArr = this.typeTable;
        if (i9 == entryArr.length) {
            Entry[] entryArr2 = new Entry[entryArr.length * 2];
            System.arraycopy(entryArr, 0, entryArr2, 0, entryArr.length);
            this.typeTable = entryArr2;
        }
        Entry[] entryArr3 = this.typeTable;
        int i10 = this.typeCount;
        this.typeCount = i10 + 1;
        entryArr3[i10] = entry;
        return put(entry).index;
    }

    private void addConstantUtf8Reference(int i9, int i10, String str) {
        add(new Entry(i9, i10, str, hash(i10, str)));
    }

    public Symbol addConstantInteger(int i9) {
        return addConstantInteger(3, i9);
    }

    private void addConstantInteger(int i9, int i10, int i11) {
        add(new Entry(i9, i10, i11, hash(i10, i11)));
    }

    public Symbol addConstantLong(long j3) {
        return addConstantLong(5, j3);
    }

    private void addConstantLong(int i9, int i10, long j3) {
        add(new Entry(i9, i10, j3, hash(i10, j3)));
    }

    private void addConstantUtf8(int i9, String str) {
        add(new Entry(i9, 1, str, hash(1, str)));
    }

    private void addConstantDynamicOrInvokeDynamicReference(int i9, int i10, String str, String str2, int i11) {
        add(new Entry(i10, i9, null, str, str2, i11, hash(i9, str, str2, i11)));
    }

    private void addConstantNameAndType(int i9, String str, String str2) {
        add(new Entry(i9, 12, str, str2, hash(12, str, str2)));
    }

    private void addConstantMemberReference(int i9, int i10, String str, String str2, String str3) {
        add(new Entry(i9, i10, str, str2, str3, 0L, hash(i10, str, str2, str3)));
    }

    private void addConstantMethodHandle(int i9, int i10, String str, String str2, String str3) {
        add(new Entry(i9, 15, str, str2, str3, i10, hash(15, str, str2, str3, i10)));
    }

    private Symbol addBootstrapMethod(int i9, int i10, int i11) {
        byte[] bArr = this.bootstrapMethods.data;
        for (Entry entry = get(i11); entry != null; entry = entry.next) {
            if (entry.tag == 64 && entry.hashCode == i11) {
                int i12 = (int) entry.data;
                for (int i13 = 0; i13 < i10; i13++) {
                    if (bArr[i9 + i13] != bArr[i12 + i13]) {
                        break;
                    }
                }
                this.bootstrapMethods.length = i9;
                return entry;
            }
        }
        int i14 = this.bootstrapMethodCount;
        this.bootstrapMethodCount = i14 + 1;
        return put(new Entry(i14, 64, i9, i11));
    }
}
