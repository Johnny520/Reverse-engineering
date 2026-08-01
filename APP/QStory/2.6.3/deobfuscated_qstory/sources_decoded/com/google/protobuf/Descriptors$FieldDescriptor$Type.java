package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FieldDescriptorProto;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Descriptors$FieldDescriptor$Type {
    private static final /* synthetic */ Descriptors$FieldDescriptor$Type[] $VALUES;
    public static final Descriptors$FieldDescriptor$Type BOOL;
    public static final Descriptors$FieldDescriptor$Type BYTES;
    public static final Descriptors$FieldDescriptor$Type ENUM;
    public static final Descriptors$FieldDescriptor$Type FIXED32;
    public static final Descriptors$FieldDescriptor$Type FIXED64;
    public static final Descriptors$FieldDescriptor$Type GROUP;
    public static final Descriptors$FieldDescriptor$Type INT32;
    public static final Descriptors$FieldDescriptor$Type INT64;
    public static final Descriptors$FieldDescriptor$Type MESSAGE;
    public static final Descriptors$FieldDescriptor$Type SFIXED32;
    public static final Descriptors$FieldDescriptor$Type SFIXED64;
    public static final Descriptors$FieldDescriptor$Type SINT32;
    public static final Descriptors$FieldDescriptor$Type SINT64;
    public static final Descriptors$FieldDescriptor$Type STRING;
    public static final Descriptors$FieldDescriptor$Type UINT32;
    public static final Descriptors$FieldDescriptor$Type UINT64;
    private static final Descriptors$FieldDescriptor$Type[] types;
    private final Descriptors$FieldDescriptor$JavaType javaType;
    public static final Descriptors$FieldDescriptor$Type DOUBLE = new Descriptors$FieldDescriptor$Type("DOUBLE", 0, Descriptors$FieldDescriptor$JavaType.DOUBLE);
    public static final Descriptors$FieldDescriptor$Type FLOAT = new Descriptors$FieldDescriptor$Type("FLOAT", 1, Descriptors$FieldDescriptor$JavaType.FLOAT);

    private static /* synthetic */ Descriptors$FieldDescriptor$Type[] $values() {
        return new Descriptors$FieldDescriptor$Type[]{DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, GROUP, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64};
    }

    static {
        Descriptors$FieldDescriptor$JavaType descriptors$FieldDescriptor$JavaType = Descriptors$FieldDescriptor$JavaType.LONG;
        INT64 = new Descriptors$FieldDescriptor$Type("INT64", 2, descriptors$FieldDescriptor$JavaType);
        UINT64 = new Descriptors$FieldDescriptor$Type("UINT64", 3, descriptors$FieldDescriptor$JavaType);
        Descriptors$FieldDescriptor$JavaType descriptors$FieldDescriptor$JavaType2 = Descriptors$FieldDescriptor$JavaType.INT;
        INT32 = new Descriptors$FieldDescriptor$Type("INT32", 4, descriptors$FieldDescriptor$JavaType2);
        FIXED64 = new Descriptors$FieldDescriptor$Type("FIXED64", 5, descriptors$FieldDescriptor$JavaType);
        FIXED32 = new Descriptors$FieldDescriptor$Type("FIXED32", 6, descriptors$FieldDescriptor$JavaType2);
        BOOL = new Descriptors$FieldDescriptor$Type("BOOL", 7, Descriptors$FieldDescriptor$JavaType.BOOLEAN);
        STRING = new Descriptors$FieldDescriptor$Type("STRING", 8, Descriptors$FieldDescriptor$JavaType.STRING);
        Descriptors$FieldDescriptor$JavaType descriptors$FieldDescriptor$JavaType3 = Descriptors$FieldDescriptor$JavaType.MESSAGE;
        GROUP = new Descriptors$FieldDescriptor$Type("GROUP", 9, descriptors$FieldDescriptor$JavaType3);
        MESSAGE = new Descriptors$FieldDescriptor$Type("MESSAGE", 10, descriptors$FieldDescriptor$JavaType3);
        BYTES = new Descriptors$FieldDescriptor$Type("BYTES", 11, Descriptors$FieldDescriptor$JavaType.BYTE_STRING);
        UINT32 = new Descriptors$FieldDescriptor$Type("UINT32", 12, descriptors$FieldDescriptor$JavaType2);
        ENUM = new Descriptors$FieldDescriptor$Type("ENUM", 13, Descriptors$FieldDescriptor$JavaType.ENUM);
        SFIXED32 = new Descriptors$FieldDescriptor$Type("SFIXED32", 14, descriptors$FieldDescriptor$JavaType2);
        SFIXED64 = new Descriptors$FieldDescriptor$Type("SFIXED64", 15, descriptors$FieldDescriptor$JavaType);
        SINT32 = new Descriptors$FieldDescriptor$Type("SINT32", 16, descriptors$FieldDescriptor$JavaType2);
        SINT64 = new Descriptors$FieldDescriptor$Type("SINT64", 17, descriptors$FieldDescriptor$JavaType);
        $VALUES = $values();
        types = values();
    }

    private Descriptors$FieldDescriptor$Type(String str, int i, Descriptors$FieldDescriptor$JavaType descriptors$FieldDescriptor$JavaType) {
        this.javaType = descriptors$FieldDescriptor$JavaType;
    }

    public static Descriptors$FieldDescriptor$Type valueOf(DescriptorProtos$FieldDescriptorProto.Type type) {
        return types[type.getNumber() - 1];
    }

    public static Descriptors$FieldDescriptor$Type[] values() {
        return (Descriptors$FieldDescriptor$Type[]) $VALUES.clone();
    }

    public Descriptors$FieldDescriptor$JavaType getJavaType() {
        return this.javaType;
    }

    public DescriptorProtos$FieldDescriptorProto.Type toProto() {
        return DescriptorProtos$FieldDescriptorProto.Type.forNumber(ordinal() + 1);
    }

    public static Descriptors$FieldDescriptor$Type valueOf(String str) {
        return (Descriptors$FieldDescriptor$Type) java.lang.Enum.valueOf(Descriptors$FieldDescriptor$Type.class, str);
    }
}
