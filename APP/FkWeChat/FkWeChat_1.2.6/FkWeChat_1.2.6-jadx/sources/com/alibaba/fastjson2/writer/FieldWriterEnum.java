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
import java.util.Locale;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
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

    public FieldWriterEnum(String str, int i10, long j10, String str2, Locale locale, String str3, Type type, Class<? extends Enum> cls, Field field, Method method, Function function) {
        super(str, i10, j10, str2, locale, str3, type, cls, field, method, function);
        this.enumType = cls;
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        this.enumConstants = enumArr;
        this.hashCodes = new long[enumArr.length];
        this.hashCodesSymbolCache = new long[enumArr.length];
        int i11 = 0;
        while (true) {
            Enum[] enumArr2 = this.enumConstants;
            if (i11 >= enumArr2.length) {
                this.valueNameCacheUTF8 = new byte[enumArr2.length][];
                this.valueNameCacheUTF16 = new char[enumArr2.length][];
                this.utf8ValueCache = new byte[enumArr2.length][];
                this.utf16ValueCache = new char[enumArr2.length][];
                return;
            }
            this.hashCodes[i11] = Fnv.hashCode64(enumArr2[i11].name());
            i11++;
        }
    }

    private byte[] getBytes(int i10) {
        int iStringSize = IOUtils.stringSize(i10);
        byte[] bArr = this.nameWithColonUTF8;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length + iStringSize);
        byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length);
        IOUtils.getChars(i10, bArrCopyOf2.length, bArrCopyOf2);
        return bArrCopyOf2;
    }

    private char[] getChars(int i10) {
        int iStringSize = IOUtils.stringSize(i10);
        char[] cArr = this.nameWithColonUTF16;
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length + iStringSize);
        char[] cArrCopyOf2 = Arrays.copyOf(cArrCopyOf, cArrCopyOf.length);
        IOUtils.getChars(i10, cArrCopyOf2.length, cArrCopyOf2);
        return cArrCopyOf2;
    }

    private byte[] getNameBytes(int i10) {
        byte[] bytes = this.enumConstants[i10].name().getBytes(StandardCharsets.UTF_8);
        byte[] bArr = this.nameWithColonUTF8;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length + bytes.length + 2);
        byte[] bArr2 = this.nameWithColonUTF8;
        bArrCopyOf[bArr2.length] = 34;
        int length = bArr2.length + 1;
        int length2 = bytes.length;
        int i11 = 0;
        while (i11 < length2) {
            bArrCopyOf[length] = bytes[i11];
            i11++;
            length++;
        }
        bArrCopyOf[bArrCopyOf.length - 1] = 34;
        return bArrCopyOf;
    }

    private char[] getNameChars(int i10) {
        String strName = this.enumConstants[i10].name();
        char[] cArr = this.nameWithColonUTF16;
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length + strName.length() + 2);
        cArrCopyOf[this.nameWithColonUTF16.length] = '\"';
        strName.getChars(0, strName.length(), cArrCopyOf, this.nameWithColonUTF16.length + 1);
        cArrCopyOf[cArrCopyOf.length - 1] = '\"';
        return cArrCopyOf;
    }

    private void writeEnumUsingOrdinal(JSONWriter jSONWriter, int i10) {
        if ((this.features & JSONWriter.Feature.UnquoteFieldName.mask) == 0) {
            if (jSONWriter.utf8) {
                byte[][] bArr = this.utf8ValueCache;
                byte[] bytes = bArr[i10];
                if (bytes == null) {
                    bytes = getBytes(i10);
                    bArr[i10] = bytes;
                }
                jSONWriter.writeNameRaw(bytes);
                return;
            }
            if (jSONWriter.utf16) {
                char[][] cArr = this.utf16ValueCache;
                char[] chars = cArr[i10];
                if (chars == null) {
                    chars = getChars(i10);
                    cArr[i10] = chars;
                }
                jSONWriter.writeNameRaw(chars);
                return;
            }
        }
        writeFieldName(jSONWriter);
        jSONWriter.writeInt32(i10);
    }

    private void writeJSONBToString(JSONWriter jSONWriter, Enum r82, SymbolTable symbolTable) {
        int ordinalByHashCode;
        if (symbolTable != null) {
            int iIdentityHashCode = System.identityHashCode(symbolTable);
            long j10 = this.nameSymbolCache;
            if (j10 == 0) {
                ordinalByHashCode = symbolTable.getOrdinalByHashCode(this.hashCode);
                this.nameSymbolCache = (((long) ordinalByHashCode) << 32) | ((long) iIdentityHashCode);
            } else if (((int) j10) == iIdentityHashCode) {
                ordinalByHashCode = (int) (j10 >> 32);
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

    private boolean writeSymbolNameOrdinal(JSONWriter jSONWriter, int i10, SymbolTable symbolTable) {
        int ordinalByHashCode;
        int ordinalByHashCode2;
        int iIdentityHashCode = System.identityHashCode(symbolTable);
        long j10 = this.hashCodesSymbolCache[i10];
        if (j10 == 0) {
            ordinalByHashCode = symbolTable.getOrdinalByHashCode(this.hashCodes[i10]);
            this.hashCodesSymbolCache[i10] = (((long) ordinalByHashCode) << 32) | ((long) iIdentityHashCode);
        } else if (((int) j10) == iIdentityHashCode) {
            ordinalByHashCode = (int) (j10 >> 32);
        } else {
            ordinalByHashCode = symbolTable.getOrdinalByHashCode(this.hashCodes[i10]);
            this.hashCodesSymbolCache[i10] = (((long) ordinalByHashCode) << 32) | ((long) iIdentityHashCode);
        }
        if (ordinalByHashCode < 0) {
            return false;
        }
        long j11 = this.nameSymbolCache;
        if (j11 == 0) {
            ordinalByHashCode2 = symbolTable.getOrdinalByHashCode(this.hashCode);
            if (ordinalByHashCode2 != -1) {
                this.nameSymbolCache = (((long) ordinalByHashCode2) << 32) | ((long) iIdentityHashCode);
            }
        } else if (((int) j11) == iIdentityHashCode) {
            ordinalByHashCode2 = (int) (j11 >> 32);
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

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void writeEnum(JSONWriter jSONWriter, Enum r10) {
        long features = jSONWriter.getFeatures(this.features);
        if ((JSONWriter.Feature.WriteEnumUsingToString.mask & features) == 0) {
            if (jSONWriter.jsonb) {
                writeEnumJSONB(jSONWriter, r10);
                return;
            }
            int iOrdinal = r10.ordinal();
            if ((JSONWriter.Feature.WriteEnumUsingOrdinal.mask & features) != 0) {
                writeEnumUsingOrdinal(jSONWriter, iOrdinal);
                return;
            }
            if ((features & JSONWriter.Feature.UnquoteFieldName.mask) == 0) {
                if (jSONWriter.utf8) {
                    byte[][] bArr = this.valueNameCacheUTF8;
                    byte[] nameBytes = bArr[iOrdinal];
                    if (nameBytes == null) {
                        nameBytes = getNameBytes(iOrdinal);
                        bArr[iOrdinal] = nameBytes;
                    }
                    jSONWriter.writeNameRaw(nameBytes);
                    return;
                }
                if (jSONWriter.utf16) {
                    char[][] cArr = this.valueNameCacheUTF16;
                    char[] nameChars = cArr[iOrdinal];
                    if (nameChars == null) {
                        nameChars = getNameChars(iOrdinal);
                        cArr[iOrdinal] = nameChars;
                    }
                    jSONWriter.writeNameRaw(nameChars);
                    return;
                }
            }
        }
        writeFieldName(jSONWriter);
        jSONWriter.writeString(r10.toString());
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void writeEnumJSONB(JSONWriter jSONWriter, Enum r11) {
        int ordinalByHashCode;
        if (r11 == null) {
            return;
        }
        long features = jSONWriter.getFeatures(this.features);
        long j10 = JSONWriter.Feature.WriteEnumUsingToString.mask;
        boolean z10 = ((JSONWriter.Feature.WriteEnumsUsingName.mask | j10) & features) == 0;
        boolean z11 = (features & j10) != 0;
        int iOrdinal = r11.ordinal();
        SymbolTable symbolTable = jSONWriter.symbolTable;
        if (symbolTable == null || !z10 || z11 || !writeSymbolNameOrdinal(jSONWriter, iOrdinal, symbolTable)) {
            if (z11) {
                writeJSONBToString(jSONWriter, r11, symbolTable);
                return;
            }
            if (!z10) {
                writeFieldName(jSONWriter);
                jSONWriter.writeString(r11.name());
                return;
            }
            if (symbolTable != null) {
                int iIdentityHashCode = System.identityHashCode(symbolTable);
                long j11 = this.nameSymbolCache;
                if (j11 == 0) {
                    ordinalByHashCode = symbolTable.getOrdinalByHashCode(this.hashCode);
                    this.nameSymbolCache = (((long) ordinalByHashCode) << 32) | ((long) iIdentityHashCode);
                } else if (((int) j11) == iIdentityHashCode) {
                    ordinalByHashCode = (int) (j11 >> 32);
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

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final int writeEnumValueJSONB(byte[] bArr, int i10, Enum r10, SymbolTable symbolTable, long j10) {
        if (r10 == null) {
            bArr[i10] = JSONB.Constants.BC_NULL;
            return i10 + 1;
        }
        long j11 = j10 | this.features;
        long j12 = JSONWriter.Feature.WriteEnumUsingToString.mask;
        boolean z10 = ((JSONWriter.Feature.WriteEnumsUsingName.mask | j12) & j11) == 0;
        String string = (j11 & j12) != 0 ? r10.toString() : r10.name();
        return IOUtils.isASCII(string) ? JSONB.InterfaceC1562IO.writeSymbol(bArr, i10, string, symbolTable) : z10 ? JSONB.InterfaceC1562IO.writeInt32(bArr, i10, r10.ordinal()) : JSONB.InterfaceC1562IO.writeString(bArr, i10, string);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void writeValue(JSONWriter jSONWriter, Object obj) {
        jSONWriter.writeEnum((Enum) getFieldValue(obj));
    }
}
