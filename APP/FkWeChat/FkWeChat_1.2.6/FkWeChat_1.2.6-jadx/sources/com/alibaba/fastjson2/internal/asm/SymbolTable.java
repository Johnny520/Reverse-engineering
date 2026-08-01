package com.alibaba.fastjson2.internal.asm;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class SymbolTable {
    String className;
    final ClassWriter classWriter;
    private int entryCount;
    private int typeCount;
    Symbol[] typeTable;
    private Symbol[] entries = new Symbol[256];
    int constantPoolCount = 1;
    final ByteVector constantPool = new ByteVector(4096);

    public SymbolTable(ClassWriter classWriter) {
        this.classWriter = classWriter;
    }

    private int addTypeInternal(Symbol symbol) {
        if (this.typeTable == null) {
            this.typeTable = new Symbol[16];
        }
        int i10 = this.typeCount;
        Symbol[] symbolArr = this.typeTable;
        if (i10 == symbolArr.length) {
            Symbol[] symbolArr2 = new Symbol[symbolArr.length * 2];
            System.arraycopy(symbolArr, 0, symbolArr2, 0, symbolArr.length);
            this.typeTable = symbolArr2;
        }
        Symbol[] symbolArr3 = this.typeTable;
        int i11 = this.typeCount;
        this.typeCount = i11 + 1;
        symbolArr3[i11] = symbol;
        return put(symbol).index;
    }

    private Symbol put(Symbol symbol) {
        int i10 = this.entryCount;
        Symbol[] symbolArr = this.entries;
        if (i10 > (symbolArr.length * 3) / 4) {
            int length = symbolArr.length;
            int i11 = (length * 2) + 1;
            Symbol[] symbolArr2 = new Symbol[i11];
            for (int i12 = length - 1; i12 >= 0; i12--) {
                Symbol symbol2 = this.entries[i12];
                while (symbol2 != null) {
                    int i13 = symbol2.hashCode % i11;
                    Symbol symbol3 = symbol2.next;
                    symbol2.next = symbolArr2[i13];
                    symbolArr2[i13] = symbol2;
                    symbol2 = symbol3;
                }
            }
            this.entries = symbolArr2;
        }
        this.entryCount++;
        int i14 = symbol.hashCode;
        Symbol[] symbolArr3 = this.entries;
        int length2 = i14 % symbolArr3.length;
        symbol.next = symbolArr3[length2];
        symbolArr3[length2] = symbol;
        return symbol;
    }

    public Symbol addConstantIntegerOrFloat(int i10) {
        int i11 = (i10 + 3) & Integer.MAX_VALUE;
        Symbol[] symbolArr = this.entries;
        for (Symbol symbol = symbolArr[i11 % symbolArr.length]; symbol != null; symbol = symbol.next) {
            if (symbol.tag == 3 && symbol.hashCode == i11 && symbol.data == i10) {
                return symbol;
            }
        }
        this.constantPool.putByte(3).putInt(i10);
        int i12 = this.constantPoolCount;
        this.constantPoolCount = i12 + 1;
        return put(new Symbol(i12, 3, null, null, null, i10, i11));
    }

    public Symbol addConstantLongOrDouble(long j10) {
        int i10 = (((int) j10) + 5 + ((int) (j10 >>> 32))) & Integer.MAX_VALUE;
        Symbol[] symbolArr = this.entries;
        for (Symbol symbol = symbolArr[i10 % symbolArr.length]; symbol != null; symbol = symbol.next) {
            if (symbol.tag == 5 && symbol.hashCode == i10 && symbol.data == j10) {
                return symbol;
            }
        }
        int i11 = this.constantPoolCount;
        this.constantPool.putByte(5).putLong(j10);
        this.constantPoolCount += 2;
        return put(new Symbol(i11, 5, null, null, null, j10, i10));
    }

    public Symbol addConstantMemberReference(int i10, String str, String str2, String str3) {
        int iHashCode = ((str.hashCode() * str2.hashCode() * str3.hashCode()) + i10) & Integer.MAX_VALUE;
        Symbol[] symbolArr = this.entries;
        for (Symbol symbol = symbolArr[iHashCode % symbolArr.length]; symbol != null; symbol = symbol.next) {
            if (symbol.tag == i10 && symbol.hashCode == iHashCode && symbol.owner.equals(str) && symbol.name.equals(str2) && symbol.value.equals(str3)) {
                return symbol;
            }
        }
        this.constantPool.put122(i10, addConstantUtf8Reference(7, str).index, addConstantNameAndType(str2, str3));
        int i11 = this.constantPoolCount;
        this.constantPoolCount = i11 + 1;
        return put(new Symbol(i11, i10, str, str2, str3, 0L, iHashCode));
    }

    public int addConstantNameAndType(String str, String str2) {
        int iHashCode = ((str.hashCode() * str2.hashCode()) + 12) & Integer.MAX_VALUE;
        Symbol[] symbolArr = this.entries;
        for (Symbol symbol = symbolArr[iHashCode % symbolArr.length]; symbol != null; symbol = symbol.next) {
            if (symbol.tag == 12 && symbol.hashCode == iHashCode && symbol.name.equals(str) && symbol.value.equals(str2)) {
                return symbol.index;
            }
        }
        this.constantPool.put122(12, addConstantUtf8(str), addConstantUtf8(str2));
        int i10 = this.constantPoolCount;
        this.constantPoolCount = i10 + 1;
        return put(new Symbol(i10, 12, null, str, str2, 0L, iHashCode)).index;
    }

    public int addConstantUtf8(String str) {
        int iHashCode = (str.hashCode() + 1) & Integer.MAX_VALUE;
        Symbol[] symbolArr = this.entries;
        for (Symbol symbol = symbolArr[iHashCode % symbolArr.length]; symbol != null; symbol = symbol.next) {
            if (symbol.tag == 1 && symbol.hashCode == iHashCode && symbol.value.equals(str)) {
                return symbol.index;
            }
        }
        this.constantPool.putByte(1).putUTF8(str);
        int i10 = this.constantPoolCount;
        this.constantPoolCount = i10 + 1;
        return put(new Symbol(i10, 1, null, null, str, 0L, iHashCode)).index;
    }

    public Symbol addConstantUtf8Reference(int i10, String str) {
        int iHashCode = (str.hashCode() + i10) & Integer.MAX_VALUE;
        Symbol[] symbolArr = this.entries;
        for (Symbol symbol = symbolArr[iHashCode % symbolArr.length]; symbol != null; symbol = symbol.next) {
            if (symbol.tag == i10 && symbol.hashCode == iHashCode && symbol.value.equals(str)) {
                return symbol;
            }
        }
        this.constantPool.put12(i10, addConstantUtf8(str));
        int i11 = this.constantPoolCount;
        this.constantPoolCount = i11 + 1;
        return put(new Symbol(i11, i10, null, null, str, 0L, iHashCode));
    }

    public int addMergedType(int i10, int i11) {
        long j10;
        long j11;
        if (i10 < i11) {
            j10 = i10;
            j11 = i11;
        } else {
            j10 = i11;
            j11 = i10;
        }
        long j12 = j10 | (j11 << 32);
        int i12 = (i10 + Opcodes.IXOR + i11) & Integer.MAX_VALUE;
        Symbol[] symbolArr = this.entries;
        for (Symbol symbol = symbolArr[i12 % symbolArr.length]; symbol != null; symbol = symbol.next) {
            if (symbol.tag == 130 && symbol.hashCode == i12 && symbol.data == j12) {
                return symbol.info;
            }
        }
        Symbol[] symbolArr2 = this.typeTable;
        int iAddType = addType(this.classWriter.getCommonSuperClass(symbolArr2[i10].value, symbolArr2[i11].value));
        put(new Symbol(this.typeCount, Opcodes.IXOR, null, null, null, j12, i12)).info = iAddType;
        return iAddType;
    }

    public int addType(String str) {
        int iHashCode = (str.hashCode() + 128) & Integer.MAX_VALUE;
        Symbol[] symbolArr = this.entries;
        for (Symbol symbol = symbolArr[iHashCode % symbolArr.length]; symbol != null; symbol = symbol.next) {
            if (symbol.tag == 128 && symbol.hashCode == iHashCode && symbol.value.equals(str)) {
                return symbol.index;
            }
        }
        return addTypeInternal(new Symbol(this.typeCount, 128, null, null, str, 0L, iHashCode));
    }

    public int addUninitializedType(String str, int i10) {
        int iHashCode = (str.hashCode() + Opcodes.LOR + i10) & Integer.MAX_VALUE;
        Symbol[] symbolArr = this.entries;
        for (Symbol symbol = symbolArr[iHashCode % symbolArr.length]; symbol != null; symbol = symbol.next) {
            if (symbol.tag == 129 && symbol.hashCode == iHashCode && symbol.data == i10 && symbol.value.equals(str)) {
                return symbol.index;
            }
        }
        return addTypeInternal(new Symbol(this.typeCount, Opcodes.LOR, null, null, str, i10, iHashCode));
    }

    public int setMajorVersionAndClassName(int i10, String str) {
        this.className = str;
        return addConstantUtf8Reference(7, str).index;
    }
}
