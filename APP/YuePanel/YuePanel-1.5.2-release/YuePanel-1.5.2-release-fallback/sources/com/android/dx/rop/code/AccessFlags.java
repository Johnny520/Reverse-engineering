package com.android.dx.rop.code;

/* JADX INFO: loaded from: classes.dex */
public final class AccessFlags {
    public static final int ACC_ABSTRACT = 1024;
    public static final int ACC_ANNOTATION = 8192;
    public static final int ACC_BRIDGE = 64;
    public static final int ACC_CONSTRUCTOR = 65536;
    public static final int ACC_DECLARED_SYNCHRONIZED = 131072;
    public static final int ACC_ENUM = 16384;
    public static final int ACC_FINAL = 16;
    public static final int ACC_INTERFACE = 512;
    public static final int ACC_NATIVE = 256;
    public static final int ACC_PRIVATE = 2;
    public static final int ACC_PROTECTED = 4;
    public static final int ACC_PUBLIC = 1;
    public static final int ACC_STATIC = 8;
    public static final int ACC_STRICT = 2048;
    public static final int ACC_SUPER = 32;
    public static final int ACC_SYNCHRONIZED = 32;
    public static final int ACC_SYNTHETIC = 4096;
    public static final int ACC_TRANSIENT = 128;
    public static final int ACC_VARARGS = 128;
    public static final int ACC_VOLATILE = 64;
    public static final int CLASS_FLAGS = 30257;
    private static final int CONV_CLASS = 1;
    private static final int CONV_FIELD = 2;
    private static final int CONV_METHOD = 3;
    public static final int FIELD_FLAGS = 20703;
    public static final int INNER_CLASS_FLAGS = 30239;
    public static final int METHOD_FLAGS = 204287;

    private AccessFlags() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String classString(int r2) {
            r0 = 30257(0x7631, float:4.2399E-41)
            r1 = 1
            java.lang.String r2 = humanHelper(r2, r0, r1)
            return r2
    }

    public static java.lang.String fieldString(int r2) {
            r0 = 20703(0x50df, float:2.9011E-41)
            r1 = 2
            java.lang.String r2 = humanHelper(r2, r0, r1)
            return r2
    }

    private static java.lang.String humanHelper(int r4, int r5, int r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 80
            r0.<init>(r1)
            int r1 = ~r5
            r1 = r1 & r4
            r4 = r4 & r5
            r5 = r4 & 1
            if (r5 == 0) goto L13
            java.lang.String r5 = "|public"
            r0.append(r5)
        L13:
            r5 = r4 & 2
            if (r5 == 0) goto L1c
            java.lang.String r5 = "|private"
            r0.append(r5)
        L1c:
            r5 = r4 & 4
            if (r5 == 0) goto L25
            java.lang.String r5 = "|protected"
            r0.append(r5)
        L25:
            r5 = r4 & 8
            if (r5 == 0) goto L2e
            java.lang.String r5 = "|static"
            r0.append(r5)
        L2e:
            r5 = r4 & 16
            if (r5 == 0) goto L37
            java.lang.String r5 = "|final"
            r0.append(r5)
        L37:
            r5 = r4 & 32
            r2 = 1
            if (r5 == 0) goto L49
            if (r6 != r2) goto L44
            java.lang.String r5 = "|super"
            r0.append(r5)
            goto L49
        L44:
            java.lang.String r5 = "|synchronized"
            r0.append(r5)
        L49:
            r5 = r4 & 64
            r3 = 3
            if (r5 == 0) goto L5b
            if (r6 != r3) goto L56
            java.lang.String r5 = "|bridge"
            r0.append(r5)
            goto L5b
        L56:
            java.lang.String r5 = "|volatile"
            r0.append(r5)
        L5b:
            r5 = r4 & 128(0x80, float:1.8E-43)
            if (r5 == 0) goto L6c
            if (r6 != r3) goto L67
            java.lang.String r5 = "|varargs"
            r0.append(r5)
            goto L6c
        L67:
            java.lang.String r5 = "|transient"
            r0.append(r5)
        L6c:
            r5 = r4 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L75
            java.lang.String r5 = "|native"
            r0.append(r5)
        L75:
            r5 = r4 & 512(0x200, float:7.17E-43)
            if (r5 == 0) goto L7e
            java.lang.String r5 = "|interface"
            r0.append(r5)
        L7e:
            r5 = r4 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L87
            java.lang.String r5 = "|abstract"
            r0.append(r5)
        L87:
            r5 = r4 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L90
            java.lang.String r5 = "|strictfp"
            r0.append(r5)
        L90:
            r5 = r4 & 4096(0x1000, float:5.74E-42)
            if (r5 == 0) goto L99
            java.lang.String r5 = "|synthetic"
            r0.append(r5)
        L99:
            r5 = r4 & 8192(0x2000, float:1.148E-41)
            if (r5 == 0) goto La2
            java.lang.String r5 = "|annotation"
            r0.append(r5)
        La2:
            r5 = r4 & 16384(0x4000, float:2.2959E-41)
            if (r5 == 0) goto Lab
            java.lang.String r5 = "|enum"
            r0.append(r5)
        Lab:
            r5 = 65536(0x10000, float:9.1835E-41)
            r5 = r5 & r4
            if (r5 == 0) goto Lb5
            java.lang.String r5 = "|constructor"
            r0.append(r5)
        Lb5:
            r5 = 131072(0x20000, float:1.83671E-40)
            r4 = r4 & r5
            if (r4 == 0) goto Lbf
            java.lang.String r4 = "|declared_synchronized"
            r0.append(r4)
        Lbf:
            if (r1 != 0) goto Lc7
            int r4 = r0.length()
            if (r4 != 0) goto Ld3
        Lc7:
            r4 = 124(0x7c, float:1.74E-43)
            r0.append(r4)
            java.lang.String r4 = com.android.dx.util.Hex.u2(r1)
            r0.append(r4)
        Ld3:
            java.lang.String r4 = r0.substring(r2)
            return r4
    }

    public static java.lang.String innerClassString(int r2) {
            r0 = 30239(0x761f, float:4.2374E-41)
            r1 = 1
            java.lang.String r2 = humanHelper(r2, r0, r1)
            return r2
    }

    public static boolean isAbstract(int r0) {
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public static boolean isAnnotation(int r0) {
            r0 = r0 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public static boolean isConstructor(int r1) {
            r0 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L7
            r1 = 1
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    public static boolean isDeclaredSynchronized(int r1) {
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L7
            r1 = 1
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    public static boolean isEnum(int r0) {
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public static boolean isInterface(int r0) {
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public static boolean isNative(int r0) {
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public static boolean isPrivate(int r0) {
            r0 = r0 & 2
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public static boolean isProtected(int r0) {
            r0 = r0 & 4
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public static boolean isPublic(int r1) {
            r0 = 1
            r1 = r1 & r0
            if (r1 == 0) goto L5
            goto L6
        L5:
            r0 = 0
        L6:
            return r0
    }

    public static boolean isStatic(int r0) {
            r0 = r0 & 8
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public static boolean isSynchronized(int r0) {
            r0 = r0 & 32
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public static java.lang.String methodString(int r2) {
            r0 = 204287(0x31dff, float:2.86267E-40)
            r1 = 3
            java.lang.String r2 = humanHelper(r2, r0, r1)
            return r2
    }
}
