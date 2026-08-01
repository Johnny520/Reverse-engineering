package com.alibaba.fastjson2.internal.asm;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class Type {
    static final int ARRAY = 9;
    static final int BOOLEAN = 1;
    static final int BYTE = 3;
    static final int CHAR = 2;
    static final int DOUBLE = 8;
    static final Type DOUBLE_TYPE;
    static final int FLOAT = 6;
    static final int INT = 5;
    static final int INTERNAL = 12;
    static final int LONG = 7;
    static final Type LONG_TYPE;
    static final int METHOD = 11;
    static final int OBJECT = 10;
    static final int SHORT = 4;
    static final Type[] TYPES_0;
    static final Type[] TYPES_1;
    static final Type[] TYPES_2;
    static final Type[] TYPES_3;
    static final Type[] TYPES_4;
    static final Type TYPE_CLASS;
    static final Type TYPE_JSON_READER;
    static final Type TYPE_JSON_WRITER;
    static final Type TYPE_LIST;
    static final Type TYPE_OBJECT;
    static final Type TYPE_STRING;
    static final Type TYPE_SUPPLIER;
    static final Type TYPE_TYPE;
    static final int VOID = 0;
    final int sort;
    final int valueBegin;
    final String valueBuffer;
    final int valueEnd;
    static final Type VOID_TYPE = new Type(0, "VZCBSIFJD", 0, 1);
    static final Type BOOLEAN_TYPE = new Type(1, "VZCBSIFJD", 1, 2);
    static final Type CHAR_TYPE = new Type(2, "VZCBSIFJD", 2, 3);
    static final Type BYTE_TYPE = new Type(3, "VZCBSIFJD", 3, 4);
    static final Type SHORT_TYPE = new Type(4, "VZCBSIFJD", 4, 5);
    static final Type INT_TYPE = new Type(5, "VZCBSIFJD", 5, 6);
    static final Type FLOAT_TYPE = new Type(6, "VZCBSIFJD", 6, 7);

    static {
        Type type = new Type(7, "VZCBSIFJD", 7, 8);
        LONG_TYPE = type;
        DOUBLE_TYPE = new Type(8, "VZCBSIFJD", 8, 9);
        Type type2 = new Type(10, "Ljava/lang/Class;", 1, 16);
        TYPE_CLASS = type2;
        Type type3 = new Type(10, "Ljava/lang/reflect/Type;", 1, 23);
        TYPE_TYPE = type3;
        Type type4 = new Type(10, "Ljava/lang/Object;", 1, 17);
        TYPE_OBJECT = type4;
        Type type5 = new Type(10, "Ljava/lang/String;", 1, 17);
        TYPE_STRING = type5;
        Type type6 = new Type(10, "Ljava/util/List;", 1, 15);
        TYPE_LIST = type6;
        Type type7 = new Type(10, "Lcom/alibaba/fastjson2/JSONReader;", 1, 33);
        TYPE_JSON_READER = type7;
        Type type8 = new Type(10, "Lcom/alibaba/fastjson2/JSONWriter;", 1, 33);
        TYPE_JSON_WRITER = type8;
        Type type9 = new Type(10, ASMUtils.DESC_SUPPLIER, 1, 28);
        TYPE_SUPPLIER = type9;
        TYPES_0 = new Type[]{type2, type5, type5, type, type6};
        TYPES_1 = new Type[]{type8, type4, type4, type3, type};
        TYPES_2 = new Type[]{type2, type9, type7};
        TYPES_3 = new Type[]{type};
        TYPES_4 = new Type[]{type7, type3, type4, type};
    }

    private Type(int i10, String str, int i11, int i12) {
        this.sort = i10;
        this.valueBuffer = str;
        this.valueBegin = i11;
        this.valueEnd = i12;
    }

    public static Type[] getArgumentTypes(String str) {
        int i10;
        str.getClass();
        i10 = 0;
        switch (str) {
            case "(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;":
                return TYPES_4;
            case "(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V":
                return TYPES_1;
            case "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V":
                return TYPES_0;
            case "()V":
                return new Type[0];
            case "(J)Lcom/alibaba/fastjson2/reader/FieldReader;":
            case "(J)Ljava/lang/Object;":
                return TYPES_3;
            case "(Ljava/lang/Class;Ljava/util/function/Supplier;[Lcom/alibaba/fastjson2/reader/FieldReader;)V":
                return TYPES_2;
            default:
                int i11 = 0;
                int iMax = 1;
                while (str.charAt(iMax) != ')') {
                    while (str.charAt(iMax) == '[') {
                        iMax++;
                    }
                    int i12 = iMax + 1;
                    iMax = str.charAt(iMax) == 'L' ? Math.max(i12, str.indexOf(59, i12) + 1) : i12;
                    i11++;
                }
                Type[] typeArr = new Type[i11];
                int i13 = 1;
                while (str.charAt(i13) != ')') {
                    int i14 = i13;
                    while (str.charAt(i14) == '[') {
                        i14++;
                    }
                    int iMax2 = i14 + 1;
                    if (str.charAt(i14) == 'L') {
                        iMax2 = Math.max(iMax2, str.indexOf(59, iMax2) + 1);
                    }
                    typeArr[i10] = getTypeInternal(str, i13, iMax2);
                    i10++;
                    i13 = iMax2;
                }
                return typeArr;
        }
    }

    public static int getArgumentsAndReturnSizes(String str) {
        str.getClass();
        switch (str) {
            case "(Ljava/lang/Enum;)V":
            case "(Ljava/lang/String;)V":
            case "(I)V":
            case "(Lcom/alibaba/fastjson2/JSONWriter;)V":
            case "(Ljava/lang/Object;)V":
                return 8;
            case "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLcom/alibaba/fastjson2/schema/JSONSchema;Ljava/util/function/Supplier;Ljava/util/function/Function;[Lcom/alibaba/fastjson2/reader/FieldReader;)V":
                return 40;
            case "(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/Object;":
            case "(Lcom/alibaba/fastjson2/JSONReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;":
            case "(C)Z":
            case "(Lcom/alibaba/fastjson2/JSONWriter;)Z":
            case "(I)Ljava/lang/Object;":
            case "(Ljava/lang/Object;)Z":
            case "(I)Ljava/lang/Integer;":
                return 9;
            case "(Ljava/lang/Object;JLjava/lang/Object;)V":
            case "(Lcom/alibaba/fastjson2/JSONReader;Ljava/util/List;ILjava/lang/String;)V":
                return 20;
            case "(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;":
            case "(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Class;J)Ljava/lang/Object;":
                return 21;
            case "(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;":
                return 25;
            case "(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V":
            case "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V":
                return 28;
            case "(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;Ljava/lang/String;)V":
            case "(Lcom/alibaba/fastjson2/JSONWriter;ZLjava/util/List;)V":
            case "(Ljava/lang/Class;Ljava/util/function/Supplier;[Lcom/alibaba/fastjson2/reader/FieldReader;)V":
            case "(Lcom/alibaba/fastjson2/JSONWriter;J)V":
                return 16;
            case "(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/writer/ObjectWriter;":
            case "(J)Z":
            case "(Lcom/alibaba/fastjson2/writer/FieldWriter;Ljava/lang/Object;)Ljava/lang/String;":
            case "(Ljava/lang/Object;Ljava/lang/reflect/Type;)Z":
            case "(J)Lcom/alibaba/fastjson2/reader/FieldReader;":
            case "(J)Ljava/lang/Object;":
            case "(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;":
                return 13;
            case "(Ljava/util/List;Ljava/lang/reflect/Type;)V":
            case "(J)V":
            case "(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Enum;)V":
            case "(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V":
            case "(Lcom/alibaba/fastjson2/JSONWriter;I)V":
                return 12;
            case "()Ljava/lang/Class;":
            case "()I":
            case "()Z":
            case "()Ljava/lang/String;":
                return 5;
            case "()J":
                return 6;
            case "()V":
                return 4;
            default:
                char cCharAt = str.charAt(1);
                int i10 = 1;
                int i11 = 1;
                while (cCharAt != ')') {
                    if (cCharAt == 'J' || cCharAt == 'D') {
                        i10++;
                        i11 += 2;
                    } else {
                        while (str.charAt(i10) == '[') {
                            i10++;
                        }
                        int iMax = i10 + 1;
                        if (str.charAt(i10) == 'L') {
                            iMax = Math.max(iMax, str.indexOf(59, iMax) + 1);
                        }
                        i11++;
                        i10 = iMax;
                    }
                    cCharAt = str.charAt(i10);
                }
                char cCharAt2 = str.charAt(i10 + 1);
                if (cCharAt2 == 'V') {
                    return i11 << 2;
                }
                return (i11 << 2) | ((cCharAt2 == 'J' || cCharAt2 == 'D') ? 2 : 1);
        }
    }

    public static Type getTypeInternal(String str, int i10, int i11) {
        char cCharAt = str.charAt(i10);
        if (cCharAt == '(') {
            return new Type(11, str, i10, i11);
        }
        if (cCharAt == 'F') {
            return FLOAT_TYPE;
        }
        if (cCharAt != 'L') {
            if (cCharAt == 'S') {
                return SHORT_TYPE;
            }
            if (cCharAt == 'V') {
                return VOID_TYPE;
            }
            if (cCharAt == 'I') {
                return INT_TYPE;
            }
            if (cCharAt == 'J') {
                return LONG_TYPE;
            }
            if (cCharAt == 'Z') {
                return BOOLEAN_TYPE;
            }
            if (cCharAt == '[') {
                return new Type(9, str, i10, i11);
            }
            switch (cCharAt) {
                case 'B':
                    return BYTE_TYPE;
                case 'C':
                    return CHAR_TYPE;
                case 'D':
                    return DOUBLE_TYPE;
                default:
                    throw new IllegalArgumentException();
            }
        }
        int i12 = i11 - i10;
        if (i12 == 24) {
            Type type = TYPE_TYPE;
            if (str.regionMatches(i10, type.valueBuffer, 0, i12)) {
                return type;
            }
        } else if (i12 == 29) {
            Type type2 = TYPE_SUPPLIER;
            if (str.regionMatches(i10, type2.valueBuffer, 0, i12)) {
                return type2;
            }
        } else if (i12 != 34) {
            switch (i12) {
                case 16:
                    Type type3 = TYPE_LIST;
                    if (str.regionMatches(i10, type3.valueBuffer, 0, i12)) {
                        return type3;
                    }
                    break;
                case Opcodes.SIPUSH /* 17 */:
                    Type type4 = TYPE_CLASS;
                    if (str.regionMatches(i10, type4.valueBuffer, 0, i12)) {
                        return type4;
                    }
                    break;
                case Opcodes.LDC /* 18 */:
                    Type type5 = TYPE_STRING;
                    if (str.regionMatches(i10, type5.valueBuffer, 0, i12)) {
                        return type5;
                    }
                    Type type6 = TYPE_OBJECT;
                    if (str.regionMatches(i10, type6.valueBuffer, 0, i12)) {
                        return type6;
                    }
                    break;
            }
        } else {
            Type type7 = TYPE_JSON_WRITER;
            if (str.regionMatches(i10, type7.valueBuffer, 0, i12)) {
                return type7;
            }
            Type type8 = TYPE_JSON_READER;
            if (str.regionMatches(i10, type8.valueBuffer, 0, i12)) {
                return type8;
            }
        }
        return new Type(10, str, i10 + 1, i11 - 1);
    }

    public String getClassName() {
        switch (this.sort) {
            case 0:
                return "void";
            case 1:
                return "boolean";
            case 2:
                return "char";
            case 3:
                return "byte";
            case 4:
                return "short";
            case 5:
                return "int";
            case 6:
                return "float";
            case 7:
                return "long";
            case 8:
                return "double";
            case 9:
                StringBuilder sb2 = new StringBuilder(getTypeInternal(this.valueBuffer, this.valueBegin + getDimensions(), this.valueEnd).getClassName());
                for (int dimensions = getDimensions(); dimensions > 0; dimensions--) {
                    sb2.append(_UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
                }
                return sb2.toString();
            case 10:
            case 12:
                return this.valueBuffer.substring(this.valueBegin, this.valueEnd).replace('/', '.');
            case 11:
            default:
                throw new AssertionError();
        }
    }

    public String getDescriptor() {
        int i10 = this.sort;
        if (i10 != 10) {
            String str = this.valueBuffer;
            if (i10 == 12) {
                return "L" + str.substring(this.valueBegin, this.valueEnd) + ';';
            }
            str.getClass();
            if (str.equals("VZCBSIFJD")) {
                if (this.valueBegin == 7 && this.valueEnd == 8) {
                    return "J";
                }
            } else if (str.equals("(Ljava/lang/Class;Ljava/util/function/Supplier;[Lcom/alibaba/fastjson2/reader/FieldReader;)V") && this.valueBegin == 47 && this.valueEnd == 90) {
                return "[Lcom/alibaba/fastjson2/reader/FieldReader;";
            }
            return this.valueBuffer.substring(this.valueBegin, this.valueEnd);
        }
        String str2 = this.valueBuffer;
        str2.getClass();
        switch (str2) {
            case "(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;":
                int i11 = this.valueBegin;
                if (i11 == 2 && this.valueEnd == 34) {
                    return "Lcom/alibaba/fastjson2/JSONReader;";
                }
                if (i11 == 36 && this.valueEnd == 58) {
                    return "Ljava/lang/reflect/Type;";
                }
                if (i11 == 60 && this.valueEnd == 76) {
                    return "Ljava/lang/Object;";
                }
                break;
            case "(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V":
                int i12 = this.valueBegin;
                if (i12 == 2 && this.valueEnd == 34) {
                    return "Lcom/alibaba/fastjson2/JSONWriter;";
                }
                if (i12 == 36 && this.valueEnd == 52) {
                    return "Ljava/lang/Object;";
                }
                if (i12 == 54 && this.valueEnd == 70) {
                    return "Ljava/lang/Object;";
                }
                if (i12 == 72 && this.valueEnd == 94) {
                    return "Ljava/lang/reflect/Type;";
                }
                break;
            case "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V":
                int i13 = this.valueBegin;
                if (i13 == 2 && this.valueEnd == 17) {
                    return "Ljava/lang/Class;";
                }
                if (i13 == 19 && this.valueEnd == 35) {
                    return "Ljava/lang/String;";
                }
                if (i13 == 37 && this.valueEnd == 53) {
                    return "Ljava/lang/String;";
                }
                if (i13 == 56 && this.valueEnd == 70) {
                    return "Ljava/util/List;";
                }
                break;
            case "(Ljava/lang/Class;Ljava/util/function/Supplier;[Lcom/alibaba/fastjson2/reader/FieldReader;)V":
                int i14 = this.valueBegin;
                if (i14 == 2 && this.valueEnd == 17) {
                    return "Ljava/lang/Class;";
                }
                if (i14 == 19 && this.valueEnd == 46) {
                    return ASMUtils.DESC_SUPPLIER;
                }
                break;
        }
        return (this.valueBegin == 1 && this.valueEnd + 1 == this.valueBuffer.length()) ? this.valueBuffer : this.valueBuffer.substring(this.valueBegin - 1, this.valueEnd + 1);
    }

    public int getDimensions() {
        int i10 = 1;
        while (this.valueBuffer.charAt(this.valueBegin + i10) == '[') {
            i10++;
        }
        return i10;
    }
}
