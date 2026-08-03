package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.SymbolTable;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.IOUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class FieldWriterEnum extends FieldWriter {
    final Enum[] enumConstants;
    final Class enumType;
    final long[] hashCodes;
    final long[] hashCodesSymbolCache;
    final char[][] utf16ValueCache;
    final byte[][] utf8ValueCache;
    final char[][] valueNameCacheUTF16;
    final byte[][] valueNameCacheUTF8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriterEnum(String str, int i9, long j3, String str2, String str3, Type type, Class<? extends Enum> cls, Field field, Method method) {
        super(str, i9, j3, str2, str3, type, cls, field, method);
        this.enumType = cls;
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        this.enumConstants = enumArr;
        this.hashCodes = new long[enumArr.length];
        this.hashCodesSymbolCache = new long[enumArr.length];
        int i10 = 0;
        while (true) {
            Enum[] enumArr2 = this.enumConstants;
            if (i10 >= enumArr2.length) {
                this.valueNameCacheUTF8 = new byte[enumArr2.length][];
                this.valueNameCacheUTF16 = new char[enumArr2.length][];
                this.utf8ValueCache = new byte[enumArr2.length][];
                this.utf16ValueCache = new char[enumArr2.length][];
                return;
            }
            this.hashCodes[i10] = Fnv.hashCode64(enumArr2[i10].name());
            i10++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private byte[] getBytes(int i9) {
        int iStringSize = IOUtils.stringSize(i9);
        byte[] bArr = this.nameWithColonUTF8;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length + iStringSize);
        byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length);
        IOUtils.writeInt32(bArrCopyOf2, this.nameWithColonUTF8.length, i9);
        return bArrCopyOf2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private char[] getChars(int i9) {
        int iStringSize = IOUtils.stringSize(i9);
        char[] cArr = this.nameWithColonUTF16;
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length + iStringSize);
        char[] cArrCopyOf2 = Arrays.copyOf(cArrCopyOf, cArrCopyOf.length);
        IOUtils.writeInt32(cArrCopyOf2, this.nameWithColonUTF16.length, i9);
        return cArrCopyOf2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private byte[] getNameBytes(int i9) {
        byte[] bytes = this.enumConstants[i9].name().getBytes(StandardCharsets.UTF_8);
        byte[] bArr = this.nameWithColonUTF8;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length + bytes.length + 2);
        byte[] bArr2 = this.nameWithColonUTF8;
        bArrCopyOf[bArr2.length] = 34;
        int length = bArr2.length + 1;
        int length2 = bytes.length;
        int i10 = 0;
        while (i10 < length2) {
            bArrCopyOf[length] = bytes[i10];
            i10++;
            length++;
        }
        bArrCopyOf[bArrCopyOf.length - 1] = 34;
        return bArrCopyOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private char[] getNameChars(int i9) {
        String strName = this.enumConstants[i9].name();
        char[] cArr = this.nameWithColonUTF16;
        char[] cArrCopyOf = Arrays.copyOf(cArr, strName.length() + cArr.length + 2);
        cArrCopyOf[this.nameWithColonUTF16.length] = '\"';
        strName.getChars(0, strName.length(), cArrCopyOf, this.nameWithColonUTF16.length + 1);
        cArrCopyOf[cArrCopyOf.length - 1] = '\"';
        return cArrCopyOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void writeJSONBToString(JSONWriter jSONWriter, Enum r82, SymbolTable symbolTable) {
        int ordinalByHashCode;
        if (symbolTable != null) {
            int iIdentityHashCode = System.identityHashCode(symbolTable);
            long j3 = this.nameSymbolCache;
            if (j3 == 0) {
                ordinalByHashCode = symbolTable.getOrdinalByHashCode(this.hashCode);
                this.nameSymbolCache = (((long) ordinalByHashCode) << 32) | ((long) iIdentityHashCode);
            } else if (((int) j3) == iIdentityHashCode) {
                ordinalByHashCode = (int) (j3 >> 32);
            } else {
                ordinalByHashCode = symbolTable.getOrdinalByHashCode(this.hashCode);
                this.nameSymbolCache = (((long) ordinalByHashCode) << 32) | ((long) iIdentityHashCode);
            }
        } else {
            ordinalByHashCode = -1;
        }
        if (ordinalByHashCode != -1) {
            jSONWriter.writeSymbol(-ordinalByHashCode);
        } else {
            jSONWriter.writeNameRaw(this.nameJSONB, this.hashCode);
        }
        jSONWriter.writeString(r82.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean writeSymbolNameOrdinal(JSONWriter jSONWriter, int i9, SymbolTable symbolTable) {
        int ordinalByHashCode;
        int ordinalByHashCode2;
        int iIdentityHashCode = System.identityHashCode(symbolTable);
        long j3 = this.hashCodesSymbolCache[i9];
        if (j3 == 0) {
            ordinalByHashCode = symbolTable.getOrdinalByHashCode(this.hashCodes[i9]);
            this.hashCodesSymbolCache[i9] = (((long) ordinalByHashCode) << 32) | ((long) iIdentityHashCode);
        } else if (((int) j3) == iIdentityHashCode) {
            ordinalByHashCode = (int) (j3 >> 32);
        } else {
            ordinalByHashCode = symbolTable.getOrdinalByHashCode(this.hashCodes[i9]);
            this.hashCodesSymbolCache[i9] = (((long) ordinalByHashCode) << 32) | ((long) iIdentityHashCode);
        }
        if (ordinalByHashCode < 0) {
            return false;
        }
        long j4 = this.nameSymbolCache;
        if (j4 == 0) {
            ordinalByHashCode2 = symbolTable.getOrdinalByHashCode(this.hashCode);
            if (ordinalByHashCode2 != -1) {
                this.nameSymbolCache = (((long) ordinalByHashCode2) << 32) | ((long) iIdentityHashCode);
            }
        } else if (((int) j4) == iIdentityHashCode) {
            ordinalByHashCode2 = (int) (j4 >> 32);
        } else {
            ordinalByHashCode2 = symbolTable.getOrdinalByHashCode(this.hashCode);
            this.nameSymbolCache = (((long) ordinalByHashCode2) << 32) | ((long) iIdentityHashCode);
        }
        if (ordinalByHashCode2 != -1) {
            jSONWriter.writeSymbol(-ordinalByHashCode2);
        } else {
            jSONWriter.writeNameRaw(this.nameJSONB, this.hashCode);
        }
        jSONWriter.writeRaw(JSONB.Constants.BC_STR_ASCII);
        jSONWriter.writeInt32(-ordinalByHashCode);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, Object obj) {
        Enum r72 = (Enum) getFieldValue(obj);
        if (r72 != null) {
            if (jSONWriter.jsonb) {
                writeEnumJSONB(jSONWriter, r72);
            } else {
                writeEnum(jSONWriter, r72);
            }
            return true;
        }
        if (((this.features | jSONWriter.getFeatures()) & JSONWriter.Feature.WriteNulls.mask) == 0) {
            return false;
        }
        writeFieldName(jSONWriter);
        jSONWriter.writeNull();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void writeEnum(JSONWriter jSONWriter, Enum r12) {
        long features = jSONWriter.getFeatures(this.features);
        if ((JSONWriter.Feature.WriteEnumUsingToString.mask & features) == 0) {
            if (jSONWriter.jsonb) {
                writeEnumJSONB(jSONWriter, r12);
                return;
            }
            boolean z9 = false;
            boolean z10 = (JSONWriter.Feature.UnquoteFieldName.mask & features) != 0;
            boolean z11 = jSONWriter.utf8;
            if (!z11 && jSONWriter.utf16) {
                z9 = true;
            }
            int iOrdinal = r12.ordinal();
            if ((features & JSONWriter.Feature.WriteEnumUsingOrdinal.mask) != 0) {
                if (!z10) {
                    if (z11) {
                        byte[][] bArr = this.utf8ValueCache;
                        byte[] bytes = bArr[iOrdinal];
                        if (bytes == null) {
                            bytes = getBytes(iOrdinal);
                            bArr[iOrdinal] = bytes;
                        }
                        jSONWriter.writeNameRaw(bytes);
                        return;
                    }
                    if (z9) {
                        char[][] cArr = this.utf16ValueCache;
                        char[] chars = cArr[iOrdinal];
                        if (chars == null) {
                            chars = getChars(iOrdinal);
                            cArr[iOrdinal] = chars;
                        }
                        jSONWriter.writeNameRaw(chars);
                        return;
                    }
                }
                writeFieldName(jSONWriter);
                jSONWriter.writeInt32(iOrdinal);
                return;
            }
            if (!z10) {
                if (z11) {
                    byte[][] bArr2 = this.valueNameCacheUTF8;
                    byte[] nameBytes = bArr2[iOrdinal];
                    if (nameBytes == null) {
                        nameBytes = getNameBytes(iOrdinal);
                        bArr2[iOrdinal] = nameBytes;
                    }
                    jSONWriter.writeNameRaw(nameBytes);
                    return;
                }
                if (z9) {
                    char[][] cArr2 = this.valueNameCacheUTF16;
                    char[] nameChars = cArr2[iOrdinal];
                    if (nameChars == null) {
                        nameChars = getNameChars(iOrdinal);
                        cArr2[iOrdinal] = nameChars;
                    }
                    jSONWriter.writeNameRaw(nameChars);
                    return;
                }
            }
        }
        writeFieldName(jSONWriter);
        jSONWriter.writeString(r12.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void writeEnumJSONB(JSONWriter jSONWriter, Enum r11) {
        int ordinalByHashCode;
        if (r11 == null) {
            return;
        }
        long features = jSONWriter.getFeatures(this.features);
        long j3 = JSONWriter.Feature.WriteEnumUsingToString.mask;
        boolean z9 = ((JSONWriter.Feature.WriteEnumsUsingName.mask | j3) & features) == 0;
        boolean z10 = (features & j3) != 0;
        int iOrdinal = r11.ordinal();
        SymbolTable symbolTable = jSONWriter.symbolTable;
        if (symbolTable == null || !z9 || z10 || !writeSymbolNameOrdinal(jSONWriter, iOrdinal, symbolTable)) {
            if (z10) {
                writeJSONBToString(jSONWriter, r11, symbolTable);
                return;
            }
            if (!z9) {
                writeFieldName(jSONWriter);
                jSONWriter.writeString(r11.name());
                return;
            }
            if (symbolTable != null) {
                int iIdentityHashCode = System.identityHashCode(symbolTable);
                long j4 = this.nameSymbolCache;
                if (j4 == 0) {
                    ordinalByHashCode = symbolTable.getOrdinalByHashCode(this.hashCode);
                    this.nameSymbolCache = (((long) ordinalByHashCode) << 32) | ((long) iIdentityHashCode);
                } else if (((int) j4) == iIdentityHashCode) {
                    ordinalByHashCode = (int) (j4 >> 32);
                } else {
                    ordinalByHashCode = symbolTable.getOrdinalByHashCode(this.hashCode);
                    this.nameSymbolCache = (((long) ordinalByHashCode) << 32) | ((long) iIdentityHashCode);
                }
            } else {
                ordinalByHashCode = -1;
            }
            if (ordinalByHashCode != -1) {
                jSONWriter.writeSymbol(-ordinalByHashCode);
            } else {
                jSONWriter.writeNameRaw(this.nameJSONB, this.hashCode);
            }
            jSONWriter.writeInt32(iOrdinal);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void writeValue(JSONWriter jSONWriter, Object obj) {
        jSONWriter.writeEnum((Enum) getFieldValue(obj));
    }
}
