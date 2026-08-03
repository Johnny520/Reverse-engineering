package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.util.JDKUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;
import p012ah.C0086a;
import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONBDump(byte[] bArr, boolean z9) {
        this.symbols = new HashMap();
        this.bytes = bArr;
        this.raw = z9;
        this.jsonWriter = JSONWriter.ofPretty();
        this.symbolTable = null;
        dumpAny();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void dumpAny() {
        int int32Value;
        BigInteger bigIntegerValueOf;
        int i9 = this.offset;
        byte[] bArr = this.bytes;
        if (i9 >= bArr.length) {
            return;
        }
        int i10 = i9 + 1;
        this.offset = i10;
        byte b10 = bArr[i9];
        this.type = b10;
        String string = null;
        if (b10 == -90) {
            dumpObject(null);
            return;
        }
        if (b10 != 72) {
            if (b10 == -88) {
                int i11 = i9 + 2;
                this.offset = i11;
                int i12 = bArr[i10] << 8;
                int i13 = i9 + 3;
                this.offset = i13;
                int i14 = i12 + (bArr[i11] & 255);
                int i15 = i9 + 4;
                this.offset = i15;
                byte b11 = bArr[i13];
                int i16 = i9 + 5;
                this.offset = i16;
                byte b12 = bArr[i15];
                int i17 = i9 + 6;
                this.offset = i17;
                byte b13 = bArr[i16];
                int i18 = i9 + 7;
                this.offset = i18;
                byte b14 = bArr[i17];
                this.offset = i9 + 8;
                this.jsonWriter.writeLocalDateTime(LocalDateTime.of(i14, b11, b12, b13, b14, bArr[i18], readInt32Value()));
                return;
            }
            if (b10 == -87) {
                int i19 = i9 + 2;
                this.offset = i19;
                int i20 = bArr[i10] << 8;
                int i21 = i9 + 3;
                this.offset = i21;
                int i22 = i20 + (bArr[i19] & 255);
                int i23 = i9 + 4;
                this.offset = i23;
                byte b15 = bArr[i21];
                this.offset = i9 + 5;
                this.jsonWriter.writeDateYYYMMDD10(i22, b15, bArr[i23]);
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
                        boolean z9 = this.raw;
                        JSONWriter jSONWriter = this.jsonWriter;
                        if (z9) {
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
                    this.jsonWriter.writeName("@value");
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
                            long j3 = (((long) bArr[i9 + 8]) & 255) + ((((long) bArr[i9 + 7]) & 255) << 8) + ((((long) bArr[i9 + 6]) & 255) << 16) + ((((long) bArr[i9 + 5]) & 255) << 24) + ((((long) bArr[i9 + 4]) & 255) << 32) + ((((long) bArr[i9 + 3]) & 255) << 40) + ((((long) bArr[i9 + 2]) & 255) << 48) + (((long) bArr[i10]) << 56);
                            this.offset = i9 + 9;
                            this.jsonWriter.writeInt64(j3);
                            break;
                        case -84:
                        case -83:
                            break;
                        case -82:
                            this.jsonWriter.writeInstant(readInt64Value(), readInt32Value());
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
                            long j4 = (((long) bArr[i9 + 8]) & 255) + ((((long) bArr[i9 + 7]) & 255) << 8) + ((((long) bArr[i9 + 6]) & 255) << 16) + ((((long) bArr[i9 + 5]) & 255) << 24) + ((((long) bArr[i9 + 4]) & 255) << 32) + ((((long) bArr[i9 + 3]) & 255) << 40) + ((((long) bArr[i9 + 2]) & 255) << 48) + (((long) bArr[i10]) << 56);
                            this.offset = i9 + 9;
                            this.jsonWriter.writeDouble(Double.longBitsToDouble(j4));
                            break;
                        case -74:
                            this.jsonWriter.writeFloat(readInt32Value());
                            break;
                        case -73:
                            int i24 = (bArr[i9 + 4] & 255) + ((bArr[i9 + 3] & 255) << 8) + ((bArr[i9 + 2] & 255) << 16) + (bArr[i10] << 24);
                            this.offset = i9 + 5;
                            this.jsonWriter.writeFloat(Float.intBitsToFloat(i24));
                            break;
                        case -72:
                            this.jsonWriter.writeDecimal(BigDecimal.valueOf(readInt64Value()), 0L, null);
                            break;
                        case -71:
                            int int32Value3 = readInt32Value();
                            byte[] bArr3 = this.bytes;
                            int i25 = this.offset;
                            int i26 = i25 + 1;
                            this.offset = i26;
                            byte b16 = bArr3[i25];
                            if (b16 == -70) {
                                bigIntegerValueOf = BigInteger.valueOf(readInt64Value());
                            } else if (b16 == -66) {
                                long jReverseBytes = JDKUtils.UNSAFE.getLong(bArr3, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i26));
                                if (!JDKUtils.BIG_ENDIAN) {
                                    jReverseBytes = Long.reverseBytes(jReverseBytes);
                                }
                                bigIntegerValueOf = BigInteger.valueOf(jReverseBytes);
                                this.offset += 8;
                            } else if (b16 == 72) {
                                bigIntegerValueOf = BigInteger.valueOf(readInt32Value());
                            } else if (b16 >= -16 && b16 <= 47) {
                                bigIntegerValueOf = BigInteger.valueOf(b16);
                            } else if (b16 >= 48 && b16 <= 63) {
                                int i27 = (b16 + JSONB.Constants.BC_INT64_BYTE_MIN) << 8;
                                this.offset = i25 + 2;
                                bigIntegerValueOf = BigInteger.valueOf(i27 + (bArr3[i26] & 255));
                            } else if (b16 < 64 || b16 > 71) {
                                int int32Value4 = readInt32Value();
                                byte[] bArr4 = new byte[int32Value4];
                                System.arraycopy(this.bytes, this.offset, bArr4, 0, int32Value4);
                                this.offset += int32Value4;
                                bigIntegerValueOf = new BigInteger(bArr4);
                            } else {
                                int i28 = (b16 + JSONB.Constants.BC_INT16) << 16;
                                this.offset = i25 + 2;
                                int i29 = i28 + ((bArr3[i26] & 255) << 8);
                                this.offset = i25 + 3;
                                bigIntegerValueOf = BigInteger.valueOf(i29 + (bArr3[r7] & 255));
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
                            int i30 = i9 + 2;
                            this.offset = i30;
                            int i31 = bArr[i10] << 8;
                            this.offset = i9 + 3;
                            jSONWriter2.writeInt16((short) (i31 + (bArr[i30] & 255)));
                            break;
                        case -67:
                            JSONWriter jSONWriter3 = this.jsonWriter;
                            this.offset = i9 + 2;
                            jSONWriter3.writeInt8(bArr[i10]);
                            break;
                        case -65:
                            int i32 = (bArr[i9 + 4] & 255) + ((bArr[i9 + 3] & 255) << 8) + ((bArr[i9 + 2] & 255) << 16) + (bArr[i10] << 24);
                            this.offset = i9 + 5;
                            this.jsonWriter.writeInt64(i32);
                            break;
                        default:
                            switch (b10) {
                                case 122:
                                    int length = readLength();
                                    String str = new String(this.bytes, this.offset, length, StandardCharsets.UTF_8);
                                    this.offset += length;
                                    this.jsonWriter.writeString(str);
                                    break;
                                case 123:
                                    int length2 = readLength();
                                    String str2 = new String(this.bytes, this.offset, length2, StandardCharsets.UTF_16);
                                    this.offset += length2;
                                    this.jsonWriter.writeString(str2);
                                    break;
                                case 124:
                                    int length3 = readLength();
                                    String str3 = new String(this.bytes, this.offset, length3, StandardCharsets.UTF_16LE);
                                    this.offset += length3;
                                    this.jsonWriter.writeString(str3);
                                    break;
                                case 125:
                                    int length4 = readLength();
                                    String str4 = new String(this.bytes, this.offset, length4, StandardCharsets.UTF_16BE);
                                    this.offset += length4;
                                    this.jsonWriter.writeString(str4);
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
                                        boolean z10 = this.raw;
                                        JSONWriter jSONWriter4 = this.jsonWriter;
                                        if (!z10) {
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
                                        int i33 = (b10 + JSONB.Constants.BC_INT64_BYTE_MIN) << 8;
                                        this.offset = i9 + 2;
                                        this.jsonWriter.writeInt32(i33 + (bArr[i10] & 255));
                                    } else if (b10 >= 64 && b10 <= 71) {
                                        int i34 = (b10 + JSONB.Constants.BC_INT16) << 16;
                                        int i35 = i9 + 2;
                                        this.offset = i35;
                                        int i36 = i34 + ((bArr[i10] & 255) << 8);
                                        this.offset = i9 + 3;
                                        this.jsonWriter.writeInt32(i36 + (bArr[i35] & 255));
                                    } else if (b10 >= -56 && b10 <= -41) {
                                        int i37 = (b10 + JSONB.Constants.BC_INT32_BYTE_MIN) << 8;
                                        this.offset = i9 + 2;
                                        this.jsonWriter.writeInt32(i37 + (bArr[i10] & 255));
                                    } else if (b10 >= -64 && b10 <= -57) {
                                        this.offset = i9 + 2;
                                        int i38 = ((b10 + 60) << 16) + ((bArr[i10] & 255) << 8);
                                        this.offset = i9 + 3;
                                        this.jsonWriter.writeInt64(i38 + (bArr[r5] & 255));
                                    } else if (b10 >= -108 && b10 <= -92) {
                                        dumpArray();
                                    } else if (b10 >= 73 && b10 <= 121) {
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
                                    } else {
                                        C0086a.m447f(this.offset, JSONB.typeName(this.type), ", offset ", "not support type : ");
                                    }
                                    break;
                            }
                            break;
                    }
                    return;
            }
        }
        int i39 = (bArr[i9 + 4] & 255) + ((bArr[i9 + 3] & 255) << 8) + ((bArr[i9 + 2] & 255) << 16) + (bArr[i10] << 24);
        this.offset = i9 + 5;
        this.jsonWriter.writeInt32(i39);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void dumpArray() {
        byte b10;
        byte b11 = this.type;
        int length = b11 == -92 ? readLength() : b11 + 108;
        if (length == 0) {
            this.jsonWriter.writeRaw(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
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
        for (int i9 = 0; i9 < length; i9++) {
            if (i9 != 0) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        int i9 = 0;
        while (true) {
            byte[] bArr = this.bytes;
            int i10 = this.offset;
            byte b11 = bArr[i10];
            if (b11 == -109) {
                dumpReference();
            } else {
                if (b11 == -91) {
                    this.offset = i10 + 1;
                    this.jsonWriter.endObject();
                    return;
                }
                if (b11 == 127) {
                    this.offset = i10 + 1;
                    if (isInt()) {
                        int int32Value = readInt32Value();
                        if (this.raw) {
                            this.jsonWriter.writeName("#" + int32Value);
                        } else {
                            String str2 = this.symbols.get(Integer.valueOf(int32Value));
                            if (str2 == null) {
                                C0086a.m464w(AbstractC0921a.m2249l(int32Value, "symbol not found "));
                                return;
                            }
                            this.jsonWriter.writeName(str2);
                        }
                    } else {
                        String string = readString();
                        int int32Value2 = readInt32Value();
                        this.symbols.put(Integer.valueOf(int32Value2), string);
                        boolean z9 = this.raw;
                        JSONWriter jSONWriter2 = this.jsonWriter;
                        if (z9) {
                            jSONWriter2.writeName(string + "#" + int32Value2);
                        } else {
                            jSONWriter2.writeName(string);
                        }
                    }
                } else if (isString()) {
                    this.jsonWriter.writeName(readString());
                } else if (b11 >= -16 && b11 <= 72) {
                    this.jsonWriter.writeName(readInt32Value());
                } else if ((b11 < -40 || b11 > -17) && b11 != -66) {
                    if (i9 != 0) {
                        this.jsonWriter.writeComma();
                    }
                    dumpAny();
                } else {
                    this.jsonWriter.writeName(readInt64Value());
                }
            }
            i9++;
            this.jsonWriter.writeColon();
            if (isReference()) {
                dumpReference();
            } else {
                dumpAny();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void dumpReference() {
        this.jsonWriter.writeRaw("{\"$ref\":");
        String reference = readReference();
        this.jsonWriter.writeString(reference);
        if (!"#-1".equals(reference)) {
            this.lastReference = reference;
        }
        this.jsonWriter.writeRaw("}");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getString(int i9) {
        String name = i9 < 0 ? this.symbolTable.getName(-i9) : this.symbols.get(Integer.valueOf(i9));
        if (name != null) {
            return name;
        }
        C0086a.m464w(AbstractC0921a.m2249l(i9, "symbol not found : "));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isInt() {
        byte b10 = this.bytes[this.offset];
        return (b10 >= -70 && b10 <= 72) || b10 == -83 || b10 == -84 || b10 == -85;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isReference() {
        int i9 = this.offset;
        byte[] bArr = this.bytes;
        return i9 < bArr.length && bArr[i9] == -109;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isString() {
        byte b10 = this.bytes[this.offset];
        return b10 >= 73 && b10 <= 125;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int readInt32Value() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 1;
        this.offset = i10;
        byte b10 = bArr[i9];
        if (b10 >= -16 && b10 <= 47) {
            return b10;
        }
        if (b10 >= 48 && b10 <= 63) {
            int i11 = (b10 + JSONB.Constants.BC_INT64_BYTE_MIN) << 8;
            this.offset = i9 + 2;
            return i11 + (bArr[i10] & 255);
        }
        if (b10 >= 64 && b10 <= 71) {
            int i12 = (b10 + JSONB.Constants.BC_INT16) << 16;
            int i13 = i9 + 2;
            this.offset = i13;
            int i14 = i12 + ((bArr[i10] & 255) << 8);
            this.offset = i9 + 3;
            return i14 + (bArr[i13] & 255);
        }
        if (b10 == -84 || b10 == -83 || b10 == 72) {
            int i15 = (bArr[i9 + 4] & 255) + ((bArr[i9 + 3] & 255) << 8) + ((bArr[i9 + 2] & 255) << 16) + (bArr[i10] << 24);
            this.offset = i9 + 5;
            return i15;
        }
        C0086a.m453l("readInt32Value not support ", this.offset, this.bytes.length, JSONB.typeName(b10));
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long readInt64Value() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 1;
        this.offset = i10;
        byte b10 = bArr[i9];
        if (b10 >= -16 && b10 <= 47) {
            return b10;
        }
        if (b10 >= 48 && b10 <= 63) {
            int i11 = (b10 - JSONB.Constants.BC_INT32_BYTE_ZERO) << 8;
            this.offset = i9 + 2;
            return i11 + (bArr[i10] & 255);
        }
        if (b10 >= 64 && b10 <= 71) {
            int i12 = (b10 + JSONB.Constants.BC_INT16) << 16;
            this.offset = i9 + 2;
            int i13 = i12 + ((bArr[i10] & 255) << 8);
            this.offset = i9 + 3;
            return i13 + (bArr[r5] & 255);
        }
        if (b10 >= -40 && b10 <= -17) {
            return ((long) (b10 - JSONB.Constants.BC_INT64_NUM_MIN)) - 8;
        }
        if (b10 >= -56 && b10 <= -41) {
            int i14 = (b10 + JSONB.Constants.BC_INT32_BYTE_MIN) << 8;
            this.offset = i9 + 2;
            return i14 + (bArr[i10] & 255);
        }
        if (b10 >= -64 && b10 <= -57) {
            this.offset = i9 + 2;
            int i15 = ((b10 + 60) << 16) + ((bArr[i10] & 255) << 8);
            this.offset = i9 + 3;
            return i15 + (bArr[r5] & 255);
        }
        if (b10 != -85) {
            if (b10 != 72) {
                switch (b10) {
                    case -68:
                        int i16 = (bArr[i9 + 2] & 255) + (bArr[i10] << 8);
                        this.offset = i9 + 3;
                        return i16;
                    case -67:
                        this.offset = i9 + 2;
                        return bArr[i10];
                    case -66:
                        break;
                    case -65:
                        break;
                    default:
                        C0086a.m453l("readInt64Value not support ", this.offset, this.bytes.length, JSONB.typeName(b10));
                        return 0L;
                }
            }
            int i17 = (bArr[i9 + 4] & 255) + ((bArr[i9 + 3] & 255) << 8) + ((bArr[i9 + 2] & 255) << 16) + (bArr[i10] << 24);
            this.offset = i9 + 5;
            return i17;
        }
        long j3 = (((long) bArr[i9 + 8]) & 255) + ((((long) bArr[i9 + 7]) & 255) << 8) + ((((long) bArr[i9 + 6]) & 255) << 16) + ((((long) bArr[i9 + 5]) & 255) << 24) + ((((long) bArr[i9 + 4]) & 255) << 32) + ((((long) bArr[i9 + 3]) & 255) << 40) + ((((long) bArr[i9 + 2]) & 255) << 48) + (((long) bArr[i10]) << 56);
        this.offset = i9 + 9;
        return j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int readLength() {
        int i9;
        byte b10;
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 1;
        this.offset = i11;
        byte b11 = bArr[i10];
        if (b11 >= -16 && b11 <= 47) {
            return b11;
        }
        if (b11 >= 64 && b11 <= 71) {
            int i12 = (b11 + JSONB.Constants.BC_INT16) << 16;
            int i13 = i10 + 2;
            this.offset = i13;
            i9 = i12 + ((bArr[i11] & 255) << 8);
            this.offset = i10 + 3;
            b10 = bArr[i13];
        } else {
            if (b11 < 48 || b11 > 63) {
                if (b11 != 72) {
                    C0086a.m464w(AbstractC0921a.m2249l(b11, "not support length type : "));
                    return 0;
                }
                int i14 = i10 + 2;
                this.offset = i14;
                int i15 = bArr[i11] << 24;
                int i16 = i10 + 3;
                this.offset = i16;
                int i17 = i15 + ((bArr[i14] & 255) << 16);
                int i18 = i10 + 4;
                this.offset = i18;
                int i19 = i17 + ((bArr[i16] & 255) << 8);
                this.offset = i10 + 5;
                return i19 + (bArr[i18] & 255);
            }
            i9 = (b11 + JSONB.Constants.BC_INT64_BYTE_MIN) << 8;
            this.offset = i10 + 2;
            b10 = bArr[i11];
        }
        return i9 + (b10 & 255);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String readReference() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        if (bArr[i9] != -109) {
            return null;
        }
        this.offset = i9 + 1;
        if (isString()) {
            return readString();
        }
        C0086a.m450i(JSONB.typeName(this.type), "reference not support input ");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String readString() {
        Charset charset;
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 1;
        this.offset = i10;
        byte b10 = bArr[i9];
        this.strtype = b10;
        if (b10 == -81) {
            return null;
        }
        this.strBegin = i10;
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
            this.strlen = readLength();
            this.strBegin = this.offset;
            charset = StandardCharsets.UTF_16LE;
        } else {
            if (b10 != 125) {
                C0086a.m453l("readString not support type ", this.offset, this.bytes.length, JSONB.typeName(this.strtype));
                return null;
            }
            this.strlen = readLength();
            this.strBegin = this.offset;
            charset = StandardCharsets.UTF_16BE;
        }
        int i11 = this.strlen;
        if (i11 < 0) {
            return this.symbolTable.getName(-i11);
        }
        String str = new String(this.bytes, this.offset, i11, charset);
        this.offset += this.strlen;
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return this.jsonWriter.toString();
    }

    public JSONBDump(byte[] bArr, SymbolTable symbolTable, boolean z9) {
        this.symbols = new HashMap();
        this.bytes = bArr;
        this.raw = z9;
        this.symbolTable = symbolTable;
        this.jsonWriter = JSONWriter.ofPretty();
        dumpAny();
    }
}
