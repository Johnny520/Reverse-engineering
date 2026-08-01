package com.android.p002dx.dex.file;

import bsh.C3466;
import com.alibaba.fastjson2.C3775;
import com.android.dex.util.ExceptionWithContext;
import com.android.p002dx.dex.code.DalvCode;
import com.android.p002dx.dex.code.DalvInsnList;
import com.android.p002dx.dex.code.LocalList;
import com.android.p002dx.dex.code.PositionList;
import com.android.p002dx.rop.cst.CstMethodRef;
import com.android.p002dx.rop.cst.CstString;
import com.android.p002dx.rop.type.Prototype;
import com.android.p002dx.rop.type.StdTypeList;
import com.android.p002dx.rop.type.Type;
import com.bumptech.glide.AbstractC3887;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import p025.AbstractC7012;
import p299.C9211;
import p300.InterfaceC9215;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class DebugInfoDecoder {
    private final int codesize;
    private final Prototype desc;
    private final byte[] encoded;
    private final DexFile file;
    private final boolean isStatic;
    private final LocalEntry[] lastEntryForReg;
    private final ArrayList<LocalEntry> locals;
    private final ArrayList<PositionEntry> positions;
    private final int regSize;
    private final int thisStringIdx;
    private int line = 1;
    private int address = 0;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class LocalEntry {
        public int address;
        public boolean isStart;
        public int nameIndex;
        public int reg;
        public int signatureIndex;
        public int typeIndex;

        public LocalEntry(int i, boolean z, int i2, int i3, int i4, int i5) {
            this.address = i;
            this.isStart = z;
            this.reg = i2;
            this.nameIndex = i3;
            this.typeIndex = i4;
            this.signatureIndex = i5;
        }

        public String toString() {
            return String.format("[%x %s v%d %04x %04x %04x]", Integer.valueOf(this.address), this.isStart ? "start" : "end", Integer.valueOf(this.reg), Integer.valueOf(this.nameIndex), Integer.valueOf(this.typeIndex), Integer.valueOf(this.signatureIndex));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class PositionEntry {
        public int address;
        public int line;

        public PositionEntry(int i, int i2) {
            this.address = i;
            this.line = i2;
        }
    }

    public DebugInfoDecoder(byte[] bArr, int i, int i2, boolean z, CstMethodRef cstMethodRef, DexFile dexFile) {
        int iIndexOf;
        if (bArr == null) {
            C3466.m5903("encoded == null");
            throw null;
        }
        this.encoded = bArr;
        this.isStatic = z;
        this.desc = cstMethodRef.getPrototype();
        this.file = dexFile;
        this.regSize = i2;
        this.positions = new ArrayList<>();
        this.locals = new ArrayList<>();
        this.codesize = i;
        this.lastEntryForReg = new LocalEntry[i2];
        try {
            iIndexOf = dexFile.getStringIds().indexOf(new CstString("this"));
        } catch (IllegalArgumentException unused) {
            iIndexOf = -1;
        }
        this.thisStringIdx = iIndexOf;
    }

    private void decode0() {
        C9211 c9211 = new C9211(this.encoded);
        this.line = AbstractC3887.m7204(c9211);
        int iM7204 = AbstractC3887.m7204(c9211);
        StdTypeList parameterTypes = this.desc.getParameterTypes();
        int paramBase = getParamBase();
        if (iM7204 != parameterTypes.size()) {
            C3466.m5899("Mismatch between parameters_size and prototype");
            return;
        }
        if (!this.isStatic) {
            LocalEntry localEntry = new LocalEntry(0, true, paramBase, this.thisStringIdx, 0, 0);
            this.locals.add(localEntry);
            this.lastEntryForReg[paramBase] = localEntry;
            paramBase++;
        }
        int category = paramBase;
        for (int i = 0; i < iM7204; i++) {
            Type type = parameterTypes.getType(i);
            int stringIndex = readStringIndex(c9211);
            LocalEntry localEntry2 = stringIndex == -1 ? new LocalEntry(0, true, category, -1, 0, 0) : new LocalEntry(0, true, category, stringIndex, 0, 0);
            this.locals.add(localEntry2);
            this.lastEntryForReg[category] = localEntry2;
            category += type.getCategory();
        }
        while (true) {
            int i2 = c9211.readByte() & DefaultClassResolver.NAME;
            switch (i2) {
                case 0:
                    return;
                case 1:
                    this.address = AbstractC3887.m7204(c9211) + this.address;
                    break;
                case 2:
                    this.line = AbstractC3887.m7205(c9211) + this.line;
                    break;
                case 3:
                    int iM72042 = AbstractC3887.m7204(c9211);
                    LocalEntry localEntry3 = new LocalEntry(this.address, true, iM72042, readStringIndex(c9211), readStringIndex(c9211), 0);
                    this.locals.add(localEntry3);
                    this.lastEntryForReg[iM72042] = localEntry3;
                    break;
                case 4:
                    int iM72043 = AbstractC3887.m7204(c9211);
                    LocalEntry localEntry4 = new LocalEntry(this.address, true, iM72043, readStringIndex(c9211), readStringIndex(c9211), readStringIndex(c9211));
                    this.locals.add(localEntry4);
                    this.lastEntryForReg[iM72043] = localEntry4;
                    break;
                case 5:
                    int iM72044 = AbstractC3887.m7204(c9211);
                    try {
                        LocalEntry localEntry5 = this.lastEntryForReg[iM72044];
                        if (!localEntry5.isStart) {
                            throw new RuntimeException("nonsensical END_LOCAL on dead register v" + iM72044);
                        }
                        LocalEntry localEntry6 = new LocalEntry(this.address, false, iM72044, localEntry5.nameIndex, localEntry5.typeIndex, localEntry5.signatureIndex);
                        this.locals.add(localEntry6);
                        this.lastEntryForReg[iM72044] = localEntry6;
                    } catch (NullPointerException unused) {
                        C3466.m5899(AbstractC7012.m12147(iM72044, "Encountered END_LOCAL on new v"));
                        return;
                    }
                    break;
                case 6:
                    int iM72045 = AbstractC3887.m7204(c9211);
                    try {
                        LocalEntry localEntry7 = this.lastEntryForReg[iM72045];
                        if (localEntry7.isStart) {
                            throw new RuntimeException("nonsensical RESTART_LOCAL on live register v" + iM72045);
                        }
                        LocalEntry localEntry8 = new LocalEntry(this.address, true, iM72045, localEntry7.nameIndex, localEntry7.typeIndex, 0);
                        this.locals.add(localEntry8);
                        this.lastEntryForReg[iM72045] = localEntry8;
                    } catch (NullPointerException unused2) {
                        C3466.m5899(AbstractC7012.m12147(iM72045, "Encountered RESTART_LOCAL on new v"));
                        return;
                    }
                    break;
                case 7:
                case 8:
                case 9:
                    break;
                default:
                    if (i2 < 10) {
                        C3466.m5899(AbstractC7012.m12147(i2, "Invalid extended opcode encountered "));
                        return;
                    }
                    int i3 = ((i2 - 10) / 15) + this.address;
                    this.address = i3;
                    int i4 = ((r1 % 15) - 4) + this.line;
                    this.line = i4;
                    this.positions.add(new PositionEntry(i3, i4));
                    break;
                    break;
            }
        }
    }

    private int getParamBase() {
        return (this.regSize - this.desc.getParameterTypes().getWordCount()) - (!this.isStatic ? 1 : 0);
    }

    private int readStringIndex(InterfaceC9215 interfaceC9215) {
        return AbstractC3887.m7204(interfaceC9215) - 1;
    }

    public static void validateEncode(byte[] bArr, DexFile dexFile, CstMethodRef cstMethodRef, DalvCode dalvCode, boolean z) {
        PositionList positions = dalvCode.getPositions();
        LocalList locals = dalvCode.getLocals();
        DalvInsnList insns = dalvCode.getInsns();
        try {
            validateEncode0(bArr, insns.codeSize(), insns.getRegistersSize(), z, cstMethodRef, dexFile, positions, locals);
        } catch (RuntimeException e) {
            System.err.println("instructions:");
            insns.debugPrint((OutputStream) System.err, "  ", true);
            System.err.println("local list:");
            locals.debugPrint(System.err, "  ");
            throw ExceptionWithContext.withContext(e, "while processing " + cstMethodRef.toHuman());
        }
    }

    private static void validateEncode0(byte[] bArr, int i, int i2, boolean z, CstMethodRef cstMethodRef, DexFile dexFile, PositionList positionList, LocalList localList) {
        LocalEntry localEntry;
        DebugInfoDecoder debugInfoDecoder = new DebugInfoDecoder(bArr, i, i2, z, cstMethodRef, dexFile);
        debugInfoDecoder.decode();
        List<PositionEntry> positionList2 = debugInfoDecoder.getPositionList();
        if (positionList2.size() != positionList.size()) {
            C3775.m6965("Decoded positions table not same size was ", positionList2.size(), " expected ", positionList.size());
            return;
        }
        for (PositionEntry positionEntry : positionList2) {
            for (int size = positionList.size() - 1; size >= 0; size--) {
                PositionList.Entry entry = positionList.get(size);
                if (positionEntry.line != entry.getPosition().getLine() || positionEntry.address != entry.getAddress()) {
                }
            }
            C3775.m6965("Could not match position entry: ", positionEntry.address, ", ", positionEntry.line);
            return;
        }
        List<LocalEntry> locals = debugInfoDecoder.getLocals();
        int i3 = debugInfoDecoder.thisStringIdx;
        int size2 = locals.size();
        int paramBase = debugInfoDecoder.getParamBase();
        for (int i4 = 0; i4 < size2; i4++) {
            LocalEntry localEntry2 = locals.get(i4);
            int i5 = localEntry2.nameIndex;
            if (i5 < 0 || i5 == i3) {
                int i6 = i4 + 1;
                while (true) {
                    if (i6 < size2) {
                        LocalEntry localEntry3 = locals.get(i6);
                        if (localEntry3.address == 0) {
                            if (localEntry2.reg == localEntry3.reg && localEntry3.isStart) {
                                locals.set(i4, localEntry3);
                                locals.remove(i6);
                                size2--;
                                break;
                            }
                            i6++;
                        }
                    }
                }
            }
        }
        int size3 = localList.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size3; i8++) {
            LocalList.Entry entry2 = localList.get(i8);
            if (entry2.getDisposition() != LocalList.Disposition.END_REPLACED) {
                do {
                    localEntry = locals.get(i7);
                    if (localEntry.nameIndex >= 0) {
                        break;
                    } else {
                        i7++;
                    }
                } while (i7 < size2);
                int i9 = localEntry.address;
                if (localEntry.reg != entry2.getRegister()) {
                    System.err.println("local register mismatch at orig " + i8 + " / decoded " + i7);
                } else if (localEntry.isStart != entry2.isStart()) {
                    System.err.println("local start/end mismatch at orig " + i8 + " / decoded " + i7);
                } else if (i9 == entry2.getAddress() || (i9 == 0 && localEntry.reg >= paramBase)) {
                    i7++;
                } else {
                    System.err.println("local address mismatch at orig " + i8 + " / decoded " + i7);
                }
                System.err.println("decoded locals:");
                for (LocalEntry localEntry4 : locals) {
                    System.err.println("  " + localEntry4);
                }
                C3466.m5899("local table problem");
                return;
            }
        }
    }

    public void decode() {
        try {
            decode0();
        } catch (Exception e) {
            throw ExceptionWithContext.withContext(e, "...while decoding debug info");
        }
    }

    public List<LocalEntry> getLocals() {
        return this.locals;
    }

    public List<PositionEntry> getPositionList() {
        return this.positions;
    }
}
