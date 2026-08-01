package com.google.flatbuffers.reflection;

/* JADX INFO: loaded from: classes2.dex */
public final class BaseType {
    public static final byte Array = 17;
    public static final byte Bool = 2;
    public static final byte Byte = 3;
    public static final byte Double = 12;
    public static final byte Float = 11;
    public static final byte Int = 7;
    public static final byte Long = 9;
    public static final byte MaxBaseType = 19;
    public static final byte None = 0;
    public static final byte Obj = 15;
    public static final byte Short = 5;
    public static final byte String = 13;
    public static final byte UByte = 4;
    public static final byte UInt = 8;
    public static final byte ULong = 10;
    public static final byte UShort = 6;
    public static final byte UType = 1;
    public static final byte Union = 16;
    public static final byte Vector = 14;
    public static final byte Vector64 = 18;
    public static final java.lang.String[] names = null;

    static {
            java.lang.String r18 = "Vector64"
            java.lang.String r19 = "MaxBaseType"
            java.lang.String r0 = "None"
            java.lang.String r1 = "UType"
            java.lang.String r2 = "Bool"
            java.lang.String r3 = "Byte"
            java.lang.String r4 = "UByte"
            java.lang.String r5 = "Short"
            java.lang.String r6 = "UShort"
            java.lang.String r7 = "Int"
            java.lang.String r8 = "UInt"
            java.lang.String r9 = "Long"
            java.lang.String r10 = "ULong"
            java.lang.String r11 = "Float"
            java.lang.String r12 = "Double"
            java.lang.String r13 = "String"
            java.lang.String r14 = "Vector"
            java.lang.String r15 = "Obj"
            java.lang.String r16 = "Union"
            java.lang.String r17 = "Array"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19}
            com.google.flatbuffers.reflection.BaseType.names = r0
            return
    }

    private BaseType() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String name(int r1) {
            java.lang.String[] r0 = com.google.flatbuffers.reflection.BaseType.names
            r0 = r0[r1]
            return r0
    }
}
