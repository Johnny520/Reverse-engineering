package com.android.dex;

/* JADX INFO: loaded from: classes.dex */
public final class DexFormat {
    public static final int API_CONST_METHOD_HANDLE = 28;
    public static final int API_CURRENT = 28;
    public static final int API_DEFINE_INTERFACE_METHODS = 24;
    public static final int API_INVOKE_INTERFACE_METHODS = 24;
    public static final int API_INVOKE_STATIC_INTERFACE_METHODS = 21;
    public static final int API_METHOD_HANDLES = 26;
    public static final int API_NO_EXTENDED_OPCODES = 13;
    public static final int API_SPACES_IN_SIMPLE_NAME = 10000;
    public static final java.lang.String DEX_IN_JAR_NAME = "classes.dex";
    public static final int ENDIAN_TAG = 305419896;
    public static final java.lang.String MAGIC_PREFIX = "dex\n";
    public static final java.lang.String MAGIC_SUFFIX = "\u0000";
    public static final int MAX_MEMBER_IDX = 65535;
    public static final int MAX_TYPE_IDX = 65535;
    public static final java.lang.String VERSION_CURRENT = "039";
    public static final java.lang.String VERSION_FOR_API_10000 = "040";
    public static final java.lang.String VERSION_FOR_API_13 = "035";
    public static final java.lang.String VERSION_FOR_API_24 = "037";
    public static final java.lang.String VERSION_FOR_API_26 = "038";
    public static final java.lang.String VERSION_FOR_API_28 = "039";

    private DexFormat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String apiToMagic(int r3) {
            java.lang.String r0 = "039"
            r1 = 28
            if (r3 < r1) goto L7
            goto L21
        L7:
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r3 < r2) goto Le
            java.lang.String r0 = "040"
            goto L21
        Le:
            if (r3 < r1) goto L11
            goto L21
        L11:
            r0 = 26
            if (r3 < r0) goto L18
            java.lang.String r0 = "038"
            goto L21
        L18:
            r0 = 24
            if (r3 < r0) goto L1f
            java.lang.String r0 = "037"
            goto L21
        L1f:
            java.lang.String r0 = "035"
        L21:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "dex\n"
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = "\u0000"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
    }

    public static boolean isSupportedDexMagic(byte[] r0) {
            int r0 = magicToApi(r0)
            if (r0 <= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static int magicToApi(byte[] r4) {
            int r0 = r4.length
            r1 = 8
            r2 = -1
            if (r0 == r1) goto L7
            return r2
        L7:
            r0 = 0
            r0 = r4[r0]
            r1 = 100
            if (r0 != r1) goto L8a
            r0 = 1
            r0 = r4[r0]
            r1 = 101(0x65, float:1.42E-43)
            if (r0 != r1) goto L8a
            r0 = 2
            r0 = r4[r0]
            r1 = 120(0x78, float:1.68E-43)
            if (r0 != r1) goto L8a
            r0 = 3
            r0 = r4[r0]
            r1 = 10
            if (r0 != r1) goto L8a
            r0 = 7
            r0 = r4[r0]
            if (r0 == 0) goto L29
            goto L8a
        L29:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            r1 = 4
            r1 = r4[r1]
            char r1 = (char) r1
            r0.append(r1)
            r1 = 5
            r1 = r4[r1]
            char r1 = (char) r1
            r0.append(r1)
            r1 = 6
            r4 = r4[r1]
            char r4 = (char) r4
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "035"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L57
            r4 = 13
            return r4
        L57:
            java.lang.String r0 = "037"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
            r4 = 24
            return r4
        L62:
            java.lang.String r0 = "038"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L6d
            r4 = 26
            return r4
        L6d:
            java.lang.String r0 = "039"
            boolean r1 = r4.equals(r0)
            r3 = 28
            if (r1 == 0) goto L78
            return r3
        L78:
            java.lang.String r1 = "040"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L83
            r4 = 10000(0x2710, float:1.4013E-41)
            return r4
        L83:
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L8a
            return r3
        L8a:
            return r2
    }
}
