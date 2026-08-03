package j8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static final boolean a(int r2) {
            int r2 = t3.c.b(r2)
            r0 = 1
            if (r2 == 0) goto L11
            if (r2 == r0) goto L11
            r1 = 2
            if (r2 == r1) goto L11
            r1 = 3
            if (r2 == r1) goto L11
            r2 = 0
            return r2
        L11:
            return r0
    }

    public static final java.lang.String b(int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            switch(r2) {
                case 1: goto L3d;
                case 2: goto L3a;
                case 3: goto L37;
                case 4: goto L34;
                case 5: goto L31;
                case 6: goto L2e;
                case 7: goto L2b;
                case 8: goto L28;
                case 9: goto L25;
                case 10: goto L22;
                case 11: goto L1f;
                case 12: goto L1c;
                case 13: goto L19;
                case 14: goto L16;
                case 15: goto L13;
                case 16: goto L10;
                case 17: goto Ld;
                case 18: goto La;
                default: goto L8;
            }
        L8:
            r2 = 0
            throw r2
        La:
            java.lang.String r1 = "STAGED_ALIAS"
            goto L3f
        Ld:
            java.lang.String r1 = "OVERLAYABLE_POLICY"
            goto L3f
        L10:
            java.lang.String r1 = "OVERLAYABLE"
            goto L3f
        L13:
            java.lang.String r1 = "LIBRARY"
            goto L3f
        L16:
            java.lang.String r1 = "SPEC"
            goto L3f
        L19:
            java.lang.String r1 = "TYPE"
            goto L3f
        L1c:
            java.lang.String r1 = "PACKAGE"
            goto L3f
        L1f:
            java.lang.String r1 = "XML_RESOURCE_MAP"
            goto L3f
        L22:
            java.lang.String r1 = "XML_LAST_CHUNK"
            goto L3f
        L25:
            java.lang.String r1 = "XML_CDATA"
            goto L3f
        L28:
            java.lang.String r1 = "XML_END_ELEMENT"
            goto L3f
        L2b:
            java.lang.String r1 = "XML_START_ELEMENT"
            goto L3f
        L2e:
            java.lang.String r1 = "XML_END_NAMESPACE"
            goto L3f
        L31:
            java.lang.String r1 = "XML_START_NAMESPACE"
            goto L3f
        L34:
            java.lang.String r1 = "XML"
            goto L3f
        L37:
            java.lang.String r1 = "TABLE"
            goto L3f
        L3a:
            java.lang.String r1 = "STRING"
            goto L3f
        L3d:
            java.lang.String r1 = "NULL"
        L3f:
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            short r2 = c(r2)
            java.lang.String r2 = y7.a.o(r2)
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static /* synthetic */ short c(int r0) {
            switch(r0) {
                case 1: goto L35;
                case 2: goto L33;
                case 3: goto L31;
                case 4: goto L2f;
                case 5: goto L2c;
                case 6: goto L29;
                case 7: goto L26;
                case 8: goto L23;
                case 9: goto L20;
                case 10: goto L1d;
                case 11: goto L1a;
                case 12: goto L17;
                case 13: goto L14;
                case 14: goto L11;
                case 15: goto Le;
                case 16: goto Lb;
                case 17: goto L8;
                case 18: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            throw r0
        L5:
            r0 = 518(0x206, float:7.26E-43)
            return r0
        L8:
            r0 = 517(0x205, float:7.24E-43)
            return r0
        Lb:
            r0 = 516(0x204, float:7.23E-43)
            return r0
        Le:
            r0 = 515(0x203, float:7.22E-43)
            return r0
        L11:
            r0 = 514(0x202, float:7.2E-43)
            return r0
        L14:
            r0 = 513(0x201, float:7.19E-43)
            return r0
        L17:
            r0 = 512(0x200, float:7.17E-43)
            return r0
        L1a:
            r0 = 384(0x180, float:5.38E-43)
            return r0
        L1d:
            r0 = 383(0x17f, float:5.37E-43)
            return r0
        L20:
            r0 = 260(0x104, float:3.64E-43)
            return r0
        L23:
            r0 = 259(0x103, float:3.63E-43)
            return r0
        L26:
            r0 = 258(0x102, float:3.62E-43)
            return r0
        L29:
            r0 = 257(0x101, float:3.6E-43)
            return r0
        L2c:
            r0 = 256(0x100, float:3.59E-43)
            return r0
        L2f:
            r0 = 3
            return r0
        L31:
            r0 = 2
            return r0
        L33:
            r0 = 1
            return r0
        L35:
            r0 = 0
            return r0
    }

    public static int d(java.nio.ByteBuffer r0, java.nio.ByteOrder r1) {
            r0.order(r1)
            int r1 = r0.position()
            int r0 = r0.getInt(r1)
            return r0
    }

    public static int e(java.util.List r0, int r1, int r2) {
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * r2
            return r0
    }

    public static g8.d f() {
            i8.a r0 = h.Hchat.hooks.api.core.WeChatApis.contact()
            r0.getClass()
            g8.d r0 = h.Hchat.hooks.api.core.WeChatApis.c()
            return r0
    }

    public static java.lang.Enum g(java.lang.Class r0, java.lang.String r1) {
            gg.f r0 = gg.v.a(r0)
            java.lang.Class r0 = r0.f4555a
            r0.getClass()
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            return r0
    }

    public static java.lang.String h(java.lang.String r0, java.lang.String r1, java.lang.String r2) {
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            java.util.regex.Matcher r0 = r0.matcher(r1)
            java.lang.String r0 = r0.replaceAll(r2)
            r0.getClass()
            return r0
    }

    public static java.lang.String i(java.lang.String r0, java.lang.String r1, java.lang.String r2, org.json.JSONObject r3) {
            r0.getClass()
            java.lang.String r0 = r3.optString(r1, r2)
            r0.getClass()
            return r0
    }

    public static java.lang.String j(java.lang.StringBuilder r0, int r1, java.lang.String r2) {
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String k(java.lang.StringBuilder r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0.append(r1)
            r0.append(r2)
            r0.append(r3)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String l(java.util.Locale r0, java.lang.String r1, java.util.Locale r2) {
            r0.getClass()
            java.lang.String r0 = r1.toLowerCase(r2)
            r0.getClass()
            return r0
    }

    public static java.lang.String m(okio.Path r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.Thread n(java.lang.String r1, boolean r2, java.lang.Runnable r3) {
            java.lang.Thread r0 = new java.lang.Thread
            r0.<init>(r3, r1)
            r0.setDaemon(r2)
            return r0
    }

    public static java.util.Set o() {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            return r0
    }

    public static void p(int r0, i0.h0 r1, x1.e r2, i0.h0 r3, x1.d r4) {
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            i0.r.A(r2, r1, r0)
            i0.r.w(r4, r3)
            return
    }

    public static void q(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0.getClass()
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            return
    }

    public static void r(java.lang.String r0, java.util.ArrayList r1) {
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            r1.add(r0)
            return
    }

    public static void s(java.lang.StringBuilder r0, java.lang.String r1, long r2, java.lang.String r4) {
            r0.append(r1)
            r0.append(r2)
            r0.append(r4)
            return
    }

    public static void t(java.lang.StringBuilder r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0.append(r1)
            r0.append(r2)
            r0.append(r3)
            r0.append(r4)
            return
    }

    public static /* synthetic */ java.lang.String u(int r0) {
            switch(r0) {
                case 1: goto L39;
                case 2: goto L36;
                case 3: goto L33;
                case 4: goto L30;
                case 5: goto L2d;
                case 6: goto L2a;
                case 7: goto L27;
                case 8: goto L24;
                case 9: goto L21;
                case 10: goto L1e;
                case 11: goto L1b;
                case 12: goto L18;
                case 13: goto L15;
                case 14: goto L12;
                case 15: goto Lf;
                case 16: goto Lc;
                case 17: goto L9;
                case 18: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "null"
            return r0
        L6:
            java.lang.String r0 = "STAGED_ALIAS"
            return r0
        L9:
            java.lang.String r0 = "OVERLAYABLE_POLICY"
            return r0
        Lc:
            java.lang.String r0 = "OVERLAYABLE"
            return r0
        Lf:
            java.lang.String r0 = "LIBRARY"
            return r0
        L12:
            java.lang.String r0 = "SPEC"
            return r0
        L15:
            java.lang.String r0 = "TYPE"
            return r0
        L18:
            java.lang.String r0 = "PACKAGE"
            return r0
        L1b:
            java.lang.String r0 = "XML_RESOURCE_MAP"
            return r0
        L1e:
            java.lang.String r0 = "XML_LAST_CHUNK"
            return r0
        L21:
            java.lang.String r0 = "XML_CDATA"
            return r0
        L24:
            java.lang.String r0 = "XML_END_ELEMENT"
            return r0
        L27:
            java.lang.String r0 = "XML_START_ELEMENT"
            return r0
        L2a:
            java.lang.String r0 = "XML_END_NAMESPACE"
            return r0
        L2d:
            java.lang.String r0 = "XML_START_NAMESPACE"
            return r0
        L30:
            java.lang.String r0 = "XML"
            return r0
        L33:
            java.lang.String r0 = "TABLE"
            return r0
        L36:
            java.lang.String r0 = "STRING"
            return r0
        L39:
            java.lang.String r0 = "NULL"
            return r0
    }

    public static /* synthetic */ java.lang.String v(int r0) {
            switch(r0) {
                case 1: goto L1e;
                case 2: goto L1b;
                case 3: goto L18;
                case 4: goto L15;
                case 5: goto L12;
                case 6: goto Lf;
                case 7: goto Lc;
                case 8: goto L9;
                case 9: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "null"
            return r0
        L6:
            java.lang.String r0 = "INVOKE_INTERFACE"
            return r0
        L9:
            java.lang.String r0 = "INVOKE_CONSTRUCTOR"
            return r0
        Lc:
            java.lang.String r0 = "INVOKE_DIRECT"
            return r0
        Lf:
            java.lang.String r0 = "INVOKE_INSTANCE"
            return r0
        L12:
            java.lang.String r0 = "INVOKE_STATIC"
            return r0
        L15:
            java.lang.String r0 = "INSTANCE_GET"
            return r0
        L18:
            java.lang.String r0 = "INSTANCE_PUT"
            return r0
        L1b:
            java.lang.String r0 = "STATIC_GET"
            return r0
        L1e:
            java.lang.String r0 = "STATIC_PUT"
            return r0
    }

    public static /* synthetic */ java.lang.String w(int r0) {
            switch(r0) {
                case 1: goto L39;
                case 2: goto L36;
                case 3: goto L33;
                case 4: goto L30;
                case 5: goto L2d;
                case 6: goto L2a;
                case 7: goto L27;
                case 8: goto L24;
                case 9: goto L21;
                case 10: goto L1e;
                case 11: goto L1b;
                case 12: goto L18;
                case 13: goto L15;
                case 14: goto L12;
                case 15: goto Lf;
                case 16: goto Lc;
                case 17: goto L9;
                case 18: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "null"
            return r0
        L6:
            java.lang.String r0 = "ENCODED_ANNOTATION"
            return r0
        L9:
            java.lang.String r0 = "ENCODED_ARRAY"
            return r0
        Lc:
            java.lang.String r0 = "ENCODED_METHOD_HANDLE"
            return r0
        Lf:
            java.lang.String r0 = "ENCODED_METHOD_TYPE"
            return r0
        L12:
            java.lang.String r0 = "ENCODED_METHOD"
            return r0
        L15:
            java.lang.String r0 = "ENCODED_FIELD"
            return r0
        L18:
            java.lang.String r0 = "ENCODED_ENUM"
            return r0
        L1b:
            java.lang.String r0 = "ENCODED_TYPE"
            return r0
        L1e:
            java.lang.String r0 = "ENCODED_STRING"
            return r0
        L21:
            java.lang.String r0 = "ENCODED_DOUBLE"
            return r0
        L24:
            java.lang.String r0 = "ENCODED_FLOAT"
            return r0
        L27:
            java.lang.String r0 = "ENCODED_LONG"
            return r0
        L2a:
            java.lang.String r0 = "ENCODED_INT"
            return r0
        L2d:
            java.lang.String r0 = "ENCODED_CHAR"
            return r0
        L30:
            java.lang.String r0 = "ENCODED_SHORT"
            return r0
        L33:
            java.lang.String r0 = "ENCODED_BYTE"
            return r0
        L36:
            java.lang.String r0 = "ENCODED_BOOLEAN"
            return r0
        L39:
            java.lang.String r0 = "ENCODED_NULL"
            return r0
    }
}
