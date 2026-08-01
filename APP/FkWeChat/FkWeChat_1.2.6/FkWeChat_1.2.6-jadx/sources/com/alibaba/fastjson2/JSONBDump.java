package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class JSONBDump {
    static Charset GB18030;
    final byte[] bytes;
    final JSONWriter jsonWriter;
    String lastReference;
    int offset;
    final boolean raw;
    int strBegin;
    int strlen;
    byte strtype;
    final SymbolTable symbolTable;
    final Map<Integer, String> symbols;
    byte type;

    public JSONBDump(byte[] bArr, boolean z10) {
        this.symbols = new HashMap();
        this.bytes = bArr;
        this.raw = z10;
        this.jsonWriter = JSONWriter.ofPretty();
        this.symbolTable = null;
        dumpAny();
    }

    private void dumpAny() {
        int int32Value;
        BigInteger bigIntegerValueOf;
        String str;
        String str2;
        int i10 = this.offset;
        byte[] bArr = this.bytes;
        if (i10 >= bArr.length) {
            return;
        }
        int i11 = i10 + 1;
        this.offset = i11;
        byte b10 = bArr[i10];
        this.type = b10;
        String string = null;
        if (b10 == -90) {
            dumpObject(null);
            return;
        }
        if (b10 != 72) {
            if (b10 == -88) {
                int i12 = i10 + 2;
                this.offset = i12;
                int i13 = bArr[i11] << 8;
                int i14 = i10 + 3;
                this.offset = i14;
                int i15 = i13 + (bArr[i12] & 255);
                int i16 = i10 + 4;
                this.offset = i16;
                byte b11 = bArr[i14];
                int i17 = i10 + 5;
                this.offset = i17;
                byte b12 = bArr[i16];
                int i18 = i10 + 6;
                this.offset = i18;
                byte b13 = bArr[i17];
                int i19 = i10 + 7;
                this.offset = i19;
                byte b14 = bArr[i18];
                this.offset = i10 + 8;
                this.jsonWriter.writeLocalDateTime(LocalDateTime.of(i15, b11, b12, b13, b14, bArr[i19], readInt32Value()));
                return;
            }
            if (b10 == -87) {
                int i20 = i10 + 2;
                this.offset = i20;
                int i21 = bArr[i11] << 8;
                int i22 = i10 + 3;
                this.offset = i22;
                int i23 = i21 + (bArr[i20] & 255);
                int i24 = i10 + 4;
                this.offset = i24;
                byte b15 = bArr[i22];
                this.offset = i10 + 5;
                this.jsonWriter.writeLocalDate(LocalDate.of(i23, b15, bArr[i24]));
                return;
            }
            switch (b10) {
                case -112:
                    this.jsonWriter.writeChar((char) readInt32Value());
                    return;
                case -111:
                    int int32Value2 = readInt32Value();
                    byte[] bArr2 = new byte[int32Value2];
                    System.arraycopy(this.bytes, this.offset, bArr2, 0, int32Value2);
                    this.offset += int32Value2;
                    this.jsonWriter.writeBinary(bArr2);
                    return;
                case -110:
                    if (isInt()) {
                        int32Value = readInt32Value();
                    } else {
                        string = readString();
                        int32Value = readInt32Value();
                        this.symbols.put(Integer.valueOf(int32Value), string);
                    }
                    if (!this.raw && this.bytes[this.offset] == -90) {
                        if (string == null) {
                            string = getString(int32Value);
                        }
                        this.offset++;
                        dumpObject(string);
                        return;
                    }
                    this.jsonWriter.startObject();
                    this.jsonWriter.writeName("@type");
                    this.jsonWriter.writeColon();
                    if (string != null) {
                        boolean z10 = this.raw;
                        JSONWriter jSONWriter = this.jsonWriter;
                        if (z10) {
                            jSONWriter.writeString(string + "#" + int32Value);
                        } else {
                            jSONWriter.writeString(string);
                        }
                    } else if (int32Value >= 0) {
                        this.jsonWriter.writeString("#" + int32Value);
                    } else if (this.raw) {
                        this.jsonWriter.writeString("#" + int32Value);
                    } else {
                        this.jsonWriter.writeString(this.symbolTable.getName(-int32Value));
                    }
                    this.jsonWriter.writeName(ObjectReader.VALUE_NAME);
                    this.jsonWriter.writeColon();
                    dumpAny();
                    this.jsonWriter.endObject();
                    return;
                case -109:
                    dumpReference();
                    return;
                default:
                    switch (b10) {
                        case -85:
                        case -66:
                            long j10 = (((long) bArr[i10 + 8]) & 255) + ((((long) bArr[i10 + 7]) & 255) << 8) + ((((long) bArr[i10 + 6]) & 255) << 16) + ((((long) bArr[i10 + 5]) & 255) << 24) + ((((long) bArr[i10 + 4]) & 255) << 32) + ((((long) bArr[i10 + 3]) & 255) << 40) + ((((long) bArr[i10 + 2]) & 255) << 48) + (((long) bArr[i11]) << 56);
                            this.offset = i10 + 9;
                            this.jsonWriter.writeInt64(j10);
                            break;
                        case -84:
                        case -83:
                            break;
                        case -82:
                            this.jsonWriter.writeInstant(Instant.ofEpochSecond(readInt64Value(), readInt32Value()));
                            break;
                        case -81:
                            this.jsonWriter.writeNull();
                            break;
                        case -80:
                            this.jsonWriter.writeBool(false);
                            break;
                        case -79:
                            this.jsonWriter.writeBool(true);
                            break;
                        case -78:
                            this.jsonWriter.writeDouble(0.0d);
                            break;
                        case -77:
                            this.jsonWriter.writeDouble(1.0d);
                            break;
                        case -76:
                            this.jsonWriter.writeDouble(readInt64Value());
                            break;
                        case -75:
                            long j11 = (((long) bArr[i10 + 8]) & 255) + ((((long) bArr[i10 + 7]) & 255) << 8) + ((((long) bArr[i10 + 6]) & 255) << 16) + ((((long) bArr[i10 + 5]) & 255) << 24) + ((((long) bArr[i10 + 4]) & 255) << 32) + ((((long) bArr[i10 + 3]) & 255) << 40) + ((((long) bArr[i10 + 2]) & 255) << 48) + (((long) bArr[i11]) << 56);
                            this.offset = i10 + 9;
                            this.jsonWriter.writeDouble(Double.longBitsToDouble(j11));
                            break;
                        case -74:
                            this.jsonWriter.writeFloat(readInt32Value());
                            break;
                        case -73:
                            int i25 = (bArr[i10 + 4] & 255) + ((bArr[i10 + 3] & 255) << 8) + ((bArr[i10 + 2] & 255) << 16) + (bArr[i11] << 24);
                            this.offset = i10 + 5;
                            this.jsonWriter.writeFloat(Float.intBitsToFloat(i25));
                            break;
                        case -72:
                            this.jsonWriter.writeDecimal(BigDecimal.valueOf(readInt64Value()), 0L, null);
                            break;
                        case -71:
                            int int32Value3 = readInt32Value();
                            byte[] bArr3 = this.bytes;
                            int i26 = this.offset;
                            int i27 = i26 + 1;
                            this.offset = i27;
                            byte b16 = bArr3[i26];
                            if (b16 == -70) {
                                bigIntegerValueOf = BigInteger.valueOf(readInt64Value());
                            } else if (b16 == -66) {
                                bigIntegerValueOf = BigInteger.valueOf(IOUtils.getLongBE(bArr3, i27));
                                this.offset += 8;
                            } else if (b16 == 72) {
                                bigIntegerValueOf = BigInteger.valueOf(readInt32Value());
                            } else if (b16 >= -16 && b16 <= 47) {
                                bigIntegerValueOf = BigInteger.valueOf(b16);
                            } else if (b16 >= 48 && b16 <= 63) {
                                int i28 = (b16 + JSONB.Constants.BC_INT64_BYTE_MIN) << 8;
                                this.offset = i26 + 2;
                                bigIntegerValueOf = BigInteger.valueOf(i28 + (bArr3[i27] & 255));
                            } else if (b16 < 64 || b16 > 71) {
                                int int32Value4 = readInt32Value();
                                byte[] bArr4 = new byte[int32Value4];
                                System.arraycopy(this.bytes, this.offset, bArr4, 0, int32Value4);
                                this.offset += int32Value4;
                                bigIntegerValueOf = new BigInteger(bArr4);
                            } else {
                                int i29 = (b16 + JSONB.Constants.BC_INT16) << 16;
                                this.offset = i26 + 2;
                                int i30 = i29 + ((bArr3[i27] & 255) << 8);
                                this.offset = i26 + 3;
                                bigIntegerValueOf = BigInteger.valueOf(i30 + (bArr3[r7] & 255));
                            }
                            this.jsonWriter.writeDecimal(int32Value3 == 0 ? new BigDecimal(bigIntegerValueOf) : new BigDecimal(bigIntegerValueOf, int32Value3), 0L, null);
                            break;
                        case -70:
                            this.jsonWriter.writeInt64(readInt64Value());
                            break;
                        case -69:
                            int int32Value5 = readInt32Value();
                            byte[] bArr5 = new byte[int32Value5];
                            System.arraycopy(this.bytes, this.offset, bArr5, 0, int32Value5);
                            this.offset += int32Value5;
                            this.jsonWriter.writeBigInt(new BigInteger(bArr5));
                            break;
                        case -68:
                            JSONWriter jSONWriter2 = this.jsonWriter;
                            int i31 = i10 + 2;
                            this.offset = i31;
                            int i32 = bArr[i11] << 8;
                            this.offset = i10 + 3;
                            jSONWriter2.writeInt16((short) (i32 + (bArr[i31] & 255)));
                            break;
                        case -67:
                            JSONWriter jSONWriter3 = this.jsonWriter;
                            this.offset = i10 + 2;
                            jSONWriter3.writeInt8(bArr[i11]);
                            break;
                        case -65:
                            int i33 = (bArr[i10 + 4] & 255) + ((bArr[i10 + 3] & 255) << 8) + ((bArr[i10 + 2] & 255) << 16) + (bArr[i11] << 24);
                            this.offset = i10 + 5;
                            this.jsonWriter.writeInt64(i33);
                            break;
                        default:
                            switch (b10) {
                                case Opcodes.ISHR /* 122 */:
                                    int length = readLength();
                                    String str3 = new String(this.bytes, this.offset, length, StandardCharsets.UTF_8);
                                    this.offset += length;
                                    this.jsonWriter.writeString(str3);
                                    break;
                                case Opcodes.LSHR /* 123 */:
                                    int length2 = readLength();
                                    String str4 = new String(this.bytes, this.offset, length2, StandardCharsets.UTF_16);
                                    this.offset += length2;
                                    this.jsonWriter.writeString(str4);
                                    break;
                                case Opcodes.IUSHR /* 124 */:
                                    int length3 = readLength();
                                    BiFunction<byte[], Byte, String> biFunction = JDKUtils.STRING_CREATOR_JDK11;
                                    if (biFunction == null || JDKUtils.BIG_ENDIAN) {
                                        str = new String(this.bytes, this.offset, length3, StandardCharsets.UTF_16LE);
                                    } else {
                                        byte[] bArr6 = new byte[length3];
                                        System.arraycopy(this.bytes, this.offset, bArr6, 0, length3);
                                        str = biFunction.apply(bArr6, JDKUtils.UTF16);
                                    }
                                    this.offset += length3;
                                    this.jsonWriter.writeString(str);
                                    break;
                                case Opcodes.LUSHR /* 125 */:
                                    int length4 = readLength();
                                    BiFunction<byte[], Byte, String> biFunction2 = JDKUtils.STRING_CREATOR_JDK11;
                                    if (biFunction2 == null || !JDKUtils.BIG_ENDIAN) {
                                        str2 = new String(this.bytes, this.offset, length4, StandardCharsets.UTF_16BE);
                                    } else {
                                        byte[] bArr7 = new byte[length4];
                                        System.arraycopy(this.bytes, this.offset, bArr7, 0, length4);
                                        str2 = biFunction2.apply(bArr7, JDKUtils.UTF16);
                                    }
                                    this.offset += length4;
                                    this.jsonWriter.writeString(str2);
                                    break;
                                case 126:
                                    if (GB18030 == null) {
                                        GB18030 = Charset.forName("GB18030");
                                    }
                                    int length5 = readLength();
                                    String str5 = new String(this.bytes, this.offset, length5, GB18030);
                                    this.offset += length5;
                                    this.jsonWriter.writeString(str5);
                                    break;
                                case 127:
                                    if (!isInt()) {
                                        String string2 = readString();
                                        int int32Value6 = readInt32Value();
                                        this.symbols.put(Integer.valueOf(int32Value6), string2);
                                        boolean z11 = this.raw;
                                        JSONWriter jSONWriter4 = this.jsonWriter;
                                        if (!z11) {
                                            jSONWriter4.writeString(string2);
                                        } else {
                                            jSONWriter4.writeString(string2 + "#" + int32Value6);
                                        }
                                    } else {
                                        int int32Value7 = readInt32Value();
                                        if (!this.raw) {
                                            this.jsonWriter.writeString(getString(int32Value7));
                                        } else {
                                            this.jsonWriter.writeString("#" + int32Value7);
                                        }
                                    }
                                    break;
                                default:
                                    if (b10 >= -16 && b10 <= 47) {
                                        this.jsonWriter.writeInt32(b10);
                                    } else if (b10 >= -40 && b10 <= -17) {
                                        this.jsonWriter.writeInt64(b10 + 32);
                                    } else if (b10 >= 48 && b10 <= 63) {
                                        int i34 = (b10 + JSONB.Constants.BC_INT64_BYTE_MIN) << 8;
                                        this.offset = i10 + 2;
                                        this.jsonWriter.writeInt32(i34 + (bArr[i11] & 255));
                                    } else if (b10 >= 64 && b10 <= 71) {
                                        int i35 = (b10 + JSONB.Constants.BC_INT16) << 16;
                                        int i36 = i10 + 2;
                                        this.offset = i36;
                                        int i37 = i35 + ((bArr[i11] & 255) << 8);
                                        this.offset = i10 + 3;
                                        this.jsonWriter.writeInt32(i37 + (bArr[i36] & 255));
                                    } else if (b10 >= -56 && b10 <= -41) {
                                        int i38 = (b10 + JSONB.Constants.BC_INT32_BYTE_MIN) << 8;
                                        this.offset = i10 + 2;
                                        this.jsonWriter.writeInt32(i38 + (bArr[i11] & 255));
                                    } else if (b10 >= -64 && b10 <= -57) {
                                        this.offset = i10 + 2;
                                        int i39 = ((b10 + 60) << 16) + ((bArr[i11] & 255) << 8);
                                        this.offset = i10 + 3;
                                        this.jsonWriter.writeInt64(i39 + (bArr[r5] & 255));
                                    } else if (b10 >= -108 && b10 <= -92) {
                                        dumpArray();
                                    } else if (b10 < 73) {
                                        C1573e.m6261a("not support type : ", JSONB.typeName(this.type), ", offset ", this.offset);
                                    } else {
                                        int length6 = b10 == 121 ? readLength() : b10 + JSONB.Constants.BC_FLOAT;
                                        this.strlen = length6;
                                        if (length6 >= 0) {
                                            String str6 = new String(this.bytes, this.offset, length6, StandardCharsets.ISO_8859_1);
                                            this.offset += this.strlen;
                                            this.jsonWriter.writeString(str6);
                                        } else {
                                            this.jsonWriter.writeRaw("{\"$symbol\":");
                                            this.jsonWriter.writeInt32(this.strlen);
                                            this.jsonWriter.writeRaw("}");
                                        }
                                    }
                                    break;
                            }
                            break;
                    }
                    return;
            }
        }
        int i40 = (bArr[i10 + 4] & 255) + ((bArr[i10 + 3] & 255) << 8) + ((bArr[i10 + 2] & 255) << 16) + (bArr[i11] << 24);
        this.offset = i10 + 5;
        this.jsonWriter.writeInt32(i40);
    }

    private void dumpArray() {
        byte b10;
        byte b11 = this.type;
        int length = b11 == -92 ? readLength() : b11 + 108;
        if (length == 0) {
            this.jsonWriter.writeRaw(_UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
            return;
        }
        if (length == 1) {
            this.type = this.bytes[this.offset];
            if (isInt() || (b10 = this.type) == -81 || (b10 >= 73 && b10 <= 120)) {
                this.jsonWriter.writeRaw("[");
                dumpAny();
                this.jsonWriter.writeRaw("]");
                return;
            }
        }
        this.jsonWriter.startArray();
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                this.jsonWriter.writeComma();
            }
            if (isReference()) {
                dumpReference();
            } else {
                dumpAny();
            }
        }
        this.jsonWriter.endArray();
    }

    private void dumpObject(String str) {
        if (str != null) {
            this.jsonWriter.startObject();
            this.jsonWriter.writeName("@type");
            this.jsonWriter.writeColon();
            this.jsonWriter.writeString(str);
        } else {
            byte b10 = this.bytes[this.offset];
            JSONWriter jSONWriter = this.jsonWriter;
            if (b10 == -91) {
                jSONWriter.writeRaw("{}");
                this.offset++;
                return;
            }
            jSONWriter.startObject();
        }
        int i10 = 0;
        while (true) {
            byte[] bArr = this.bytes;
            int i11 = this.offset;
            byte b11 = bArr[i11];
            if (b11 == -109) {
                dumpReference();
            } else {
                if (b11 == -91) {
                    this.offset = i11 + 1;
                    this.jsonWriter.endObject();
                    return;
                }
                if (b11 == 127) {
                    this.offset = i11 + 1;
                    if (isInt()) {
                        int int32Value = readInt32Value();
                        boolean z10 = this.raw;
                        JSONWriter jSONWriter2 = this.jsonWriter;
                        if (z10) {
                            jSONWriter2.writeName("#" + int32Value);
                        } else {
                            jSONWriter2.writeName(getString(int32Value));
                        }
                    } else {
                        String string = readString();
                        int int32Value2 = readInt32Value();
                        this.symbols.put(Integer.valueOf(int32Value2), string);
                        boolean z11 = this.raw;
                        JSONWriter jSONWriter3 = this.jsonWriter;
                        if (z11) {
                            jSONWriter3.writeName(string + "#" + int32Value2);
                        } else {
                            jSONWriter3.writeName(string);
                        }
                    }
                } else if (isString()) {
                    this.jsonWriter.writeName(readString());
                } else if (b11 >= -16 && b11 <= 72) {
                    this.jsonWriter.writeName(readInt32Value());
                } else if ((b11 < -40 || b11 > -17) && b11 != -66) {
                    if (i10 != 0) {
                        this.jsonWriter.writeComma();
                    }
                    dumpAny();
                } else {
                    this.jsonWriter.writeName(readInt64Value());
                }
            }
            i10++;
            this.jsonWriter.writeColon();
            if (isReference()) {
                dumpReference();
            } else {
                dumpAny();
            }
        }
    }

    private void dumpReference() {
        this.jsonWriter.writeRaw("{\"$ref\":");
        String reference = readReference();
        this.jsonWriter.writeString(reference);
        if (!"#-1".equals(reference)) {
            this.lastReference = reference;
        }
        this.jsonWriter.writeRaw("}");
    }

    public String getString(int i10) {
        String name = i10 < 0 ? this.symbolTable.getName(-i10) : this.symbols.get(Integer.valueOf(i10));
        if (name != null) {
            return name;
        }
        C1575f.m6263a("symbol not found : ", i10);
        return null;
    }

    public boolean isInt() {
        byte b10 = this.bytes[this.offset];
        return (b10 >= -70 && b10 <= 72) || b10 == -83 || b10 == -84 || b10 == -85;
    }

    public boolean isReference() {
        int i10 = this.offset;
        byte[] bArr = this.bytes;
        return i10 < bArr.length && bArr[i10] == -109;
    }

    public boolean isString() {
        byte b10 = this.bytes[this.offset];
        return b10 >= 73 && b10 <= 125;
    }

    public int readInt32Value() {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 1;
        this.offset = i11;
        byte b10 = bArr[i10];
        if (b10 >= -16 && b10 <= 47) {
            return b10;
        }
        if (b10 >= 48 && b10 <= 63) {
            int i12 = (b10 + JSONB.Constants.BC_INT64_BYTE_MIN) << 8;
            this.offset = i10 + 2;
            return i12 + (bArr[i11] & 255);
        }
        if (b10 >= 64 && b10 <= 71) {
            int i13 = (b10 + JSONB.Constants.BC_INT16) << 16;
            int i14 = i10 + 2;
            this.offset = i14;
            int i15 = i13 + ((bArr[i11] & 255) << 8);
            this.offset = i10 + 3;
            return i15 + (bArr[i14] & 255);
        }
        if (b10 != -84 && b10 != -83 && b10 != 72) {
            C1584g.m6276a("readInt32Value not support ", JSONB.typeName(b10), this.offset, this.bytes.length);
            return 0;
        }
        int i16 = (bArr[i10 + 4] & 255) + ((bArr[i10 + 3] & 255) << 8) + ((bArr[i10 + 2] & 255) << 16) + (bArr[i11] << 24);
        this.offset = i10 + 5;
        return i16;
    }

    public long readInt64Value() {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 1;
        this.offset = i11;
        byte b10 = bArr[i10];
        if (b10 >= -16 && b10 <= 47) {
            return b10;
        }
        if (b10 >= 48 && b10 <= 63) {
            int i12 = (b10 - JSONB.Constants.BC_INT32_BYTE_ZERO) << 8;
            this.offset = i10 + 2;
            return i12 + (bArr[i11] & 255);
        }
        if (b10 >= 64 && b10 <= 71) {
            int i13 = (b10 + JSONB.Constants.BC_INT16) << 16;
            this.offset = i10 + 2;
            int i14 = i13 + ((bArr[i11] & 255) << 8);
            this.offset = i10 + 3;
            return i14 + (bArr[r5] & 255);
        }
        if (b10 >= -40 && b10 <= -17) {
            return ((long) (b10 - JSONB.Constants.BC_INT64_NUM_MIN)) - 8;
        }
        if (b10 >= -56 && b10 <= -41) {
            int i15 = (b10 + JSONB.Constants.BC_INT32_BYTE_MIN) << 8;
            this.offset = i10 + 2;
            return i15 + (bArr[i11] & 255);
        }
        if (b10 >= -64 && b10 <= -57) {
            this.offset = i10 + 2;
            int i16 = ((b10 + 60) << 16) + ((bArr[i11] & 255) << 8);
            this.offset = i10 + 3;
            return i16 + (bArr[r5] & 255);
        }
        if (b10 != -85) {
            if (b10 != 72) {
                switch (b10) {
                    case -68:
                        int i17 = (bArr[i10 + 2] & 255) + (bArr[i11] << 8);
                        this.offset = i10 + 3;
                        return i17;
                    case -67:
                        this.offset = i10 + 2;
                        return bArr[i11];
                    case -66:
                        break;
                    case -65:
                        break;
                    default:
                        C1584g.m6276a("readInt64Value not support ", JSONB.typeName(b10), this.offset, this.bytes.length);
                        return 0L;
                }
            }
            int i18 = (bArr[i10 + 4] & 255) + ((bArr[i10 + 3] & 255) << 8) + ((bArr[i10 + 2] & 255) << 16) + (bArr[i11] << 24);
            this.offset = i10 + 5;
            return i18;
        }
        long j10 = (((long) bArr[i10 + 8]) & 255) + ((((long) bArr[i10 + 7]) & 255) << 8) + ((((long) bArr[i10 + 6]) & 255) << 16) + ((((long) bArr[i10 + 5]) & 255) << 24) + ((((long) bArr[i10 + 4]) & 255) << 32) + ((((long) bArr[i10 + 3]) & 255) << 40) + ((((long) bArr[i10 + 2]) & 255) << 48) + (((long) bArr[i11]) << 56);
        this.offset = i10 + 9;
        return j10;
    }

    public int readLength() {
        int i10;
        byte b10;
        byte[] bArr = this.bytes;
        int i11 = this.offset;
        int i12 = i11 + 1;
        this.offset = i12;
        byte b11 = bArr[i11];
        if (b11 >= -16 && b11 <= 47) {
            return b11;
        }
        if (b11 >= 64 && b11 <= 71) {
            int i13 = (b11 + JSONB.Constants.BC_INT16) << 16;
            int i14 = i11 + 2;
            this.offset = i14;
            i10 = i13 + ((bArr[i12] & 255) << 8);
            this.offset = i11 + 3;
            b10 = bArr[i14];
        } else {
            if (b11 < 48 || b11 > 63) {
                if (b11 != 72) {
                    C1575f.m6263a("not support length type : ", b11);
                    return 0;
                }
                int i15 = i11 + 2;
                this.offset = i15;
                int i16 = bArr[i12] << 24;
                int i17 = i11 + 3;
                this.offset = i17;
                int i18 = i16 + ((bArr[i15] & 255) << 16);
                int i19 = i11 + 4;
                this.offset = i19;
                int i20 = i18 + ((bArr[i17] & 255) << 8);
                this.offset = i11 + 5;
                return i20 + (bArr[i19] & 255);
            }
            i10 = (b11 + JSONB.Constants.BC_INT64_BYTE_MIN) << 8;
            this.offset = i11 + 2;
            b10 = bArr[i12];
        }
        return i10 + (b10 & 255);
    }

    public String readReference() {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        if (bArr[i10] != -109) {
            return null;
        }
        this.offset = i10 + 1;
        if (isString()) {
            return readString();
        }
        C1607k.m6296a("reference not support input ", JSONB.typeName(this.type));
        return null;
    }

    public String readString() {
        Charset charset;
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 1;
        this.offset = i11;
        byte b10 = bArr[i10];
        this.strtype = b10;
        this.strBegin = i11;
        if (b10 >= 73 && b10 <= 121) {
            if (b10 == 121) {
                this.strlen = readLength();
                this.strBegin = this.offset;
            } else {
                this.strlen = b10 - 73;
            }
            charset = StandardCharsets.ISO_8859_1;
        } else if (b10 == 122) {
            this.strlen = readLength();
            this.strBegin = this.offset;
            charset = StandardCharsets.UTF_8;
        } else if (b10 == 123) {
            this.strlen = readLength();
            this.strBegin = this.offset;
            charset = StandardCharsets.UTF_16;
        } else if (b10 == 124) {
            int length = readLength();
            this.strlen = length;
            int i12 = this.offset;
            this.strBegin = i12;
            BiFunction<byte[], Byte, String> biFunction = JDKUtils.STRING_CREATOR_JDK11;
            if (biFunction != null && !JDKUtils.BIG_ENDIAN) {
                byte[] bArr2 = new byte[length];
                System.arraycopy(this.bytes, i12, bArr2, 0, length);
                String strApply = biFunction.apply(bArr2, JDKUtils.UTF16);
                this.offset += this.strlen;
                return strApply;
            }
            charset = StandardCharsets.UTF_16LE;
        } else {
            if (b10 != 125) {
                C1584g.m6276a("readString not support type ", JSONB.typeName(this.strtype), this.offset, this.bytes.length);
                return null;
            }
            int length2 = readLength();
            this.strlen = length2;
            int i13 = this.offset;
            this.strBegin = i13;
            BiFunction<byte[], Byte, String> biFunction2 = JDKUtils.STRING_CREATOR_JDK11;
            if (biFunction2 != null && JDKUtils.BIG_ENDIAN) {
                byte[] bArr3 = new byte[length2];
                System.arraycopy(this.bytes, i13, bArr3, 0, length2);
                String strApply2 = biFunction2.apply(bArr3, JDKUtils.UTF16);
                this.offset += this.strlen;
                return strApply2;
            }
            charset = StandardCharsets.UTF_16BE;
        }
        int i14 = this.strlen;
        if (i14 < 0) {
            return this.symbolTable.getName(-i14);
        }
        String str = new String(this.bytes, this.offset, i14, charset);
        this.offset += this.strlen;
        return str;
    }

    public String toString() {
        return this.jsonWriter.toString();
    }

    public JSONBDump(byte[] bArr, SymbolTable symbolTable, boolean z10) {
        this.symbols = new HashMap();
        this.bytes = bArr;
        this.raw = z10;
        this.symbolTable = symbolTable;
        this.jsonWriter = JSONWriter.ofPretty();
        dumpAny();
    }
}
