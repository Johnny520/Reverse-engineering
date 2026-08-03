package com.android.dx.cf.direct;

/* JADX INFO: loaded from: classes.dex */
public class AttributeFactory {
    public static final int CTX_CLASS = 0;
    public static final int CTX_CODE = 3;
    public static final int CTX_COUNT = 4;
    public static final int CTX_FIELD = 1;
    public static final int CTX_METHOD = 2;

    public AttributeFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public final com.android.dx.cf.iface.Attribute parse(com.android.dx.cf.direct.DirectClassFile r11, int r12, int r13, com.android.dx.cf.iface.ParseObserver r14) {
            r10 = this;
            if (r11 == 0) goto Lac
            if (r12 < 0) goto La4
            r1 = 4
            if (r12 >= r1) goto La4
            r2 = 0
            com.android.dx.util.ByteArray r3 = r11.getBytes()     // Catch: com.android.dx.cf.iface.ParseException -> L68
            com.android.dx.rop.cst.ConstantPool r4 = r11.getConstantPool()     // Catch: com.android.dx.cf.iface.ParseException -> L68
            int r5 = r3.getUnsignedShort(r13)     // Catch: com.android.dx.cf.iface.ParseException -> L68
            int r6 = r13 + 2
            int r8 = r3.getInt(r6)     // Catch: com.android.dx.cf.iface.ParseException -> L68
            com.android.dx.rop.cst.Constant r4 = r4.get(r5)     // Catch: com.android.dx.cf.iface.ParseException -> L68
            r9 = r4
            com.android.dx.rop.cst.CstString r9 = (com.android.dx.rop.cst.CstString) r9     // Catch: com.android.dx.cf.iface.ParseException -> L68
            if (r14 == 0) goto L58
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: com.android.dx.cf.iface.ParseException -> L55
            r2.<init>()     // Catch: com.android.dx.cf.iface.ParseException -> L55
            java.lang.String r4 = "name: "
            r2.append(r4)     // Catch: com.android.dx.cf.iface.ParseException -> L55
            java.lang.String r4 = r9.toHuman()     // Catch: com.android.dx.cf.iface.ParseException -> L55
            r2.append(r4)     // Catch: com.android.dx.cf.iface.ParseException -> L55
            java.lang.String r2 = r2.toString()     // Catch: com.android.dx.cf.iface.ParseException -> L55
            r4 = 2
            r14.parsed(r3, r13, r4, r2)     // Catch: com.android.dx.cf.iface.ParseException -> L55
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: com.android.dx.cf.iface.ParseException -> L55
            r2.<init>()     // Catch: com.android.dx.cf.iface.ParseException -> L55
            java.lang.String r4 = "length: "
            r2.append(r4)     // Catch: com.android.dx.cf.iface.ParseException -> L55
            java.lang.String r4 = com.android.dx.util.Hex.u4(r8)     // Catch: com.android.dx.cf.iface.ParseException -> L55
            r2.append(r4)     // Catch: com.android.dx.cf.iface.ParseException -> L55
            java.lang.String r2 = r2.toString()     // Catch: com.android.dx.cf.iface.ParseException -> L55
            r14.parsed(r3, r6, r1, r2)     // Catch: com.android.dx.cf.iface.ParseException -> L55
            goto L58
        L55:
            r0 = move-exception
            r2 = r9
            goto L69
        L58:
            java.lang.String r4 = r9.getString()     // Catch: com.android.dx.cf.iface.ParseException -> L55
            int r5 = r13 + 6
            r1 = r10
            r2 = r11
            r3 = r12
            r6 = r8
            r7 = r14
            com.android.dx.cf.iface.Attribute r0 = r1.parse0(r2, r3, r4, r5, r6, r7)     // Catch: com.android.dx.cf.iface.ParseException -> L55
            return r0
        L68:
            r0 = move-exception
        L69:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "...while parsing "
            r1.append(r3)
            if (r2 == 0) goto L8b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = r2.toHuman()
            r3.append(r2)
            java.lang.String r2 = " "
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            goto L8d
        L8b:
            java.lang.String r2 = ""
        L8d:
            r1.append(r2)
            java.lang.String r2 = "attribute at offset "
            r1.append(r2)
            java.lang.String r2 = com.android.dx.util.Hex.u4(r13)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addContext(r1)
            throw r0
        La4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "bad context"
            r0.<init>(r1)
            throw r0
        Lac:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "cf == null"
            r0.<init>(r1)
            throw r0
    }

    public com.android.dx.cf.iface.Attribute parse0(com.android.dx.cf.direct.DirectClassFile r7, int r8, java.lang.String r9, int r10, int r11, com.android.dx.cf.iface.ParseObserver r12) {
            r6 = this;
            com.android.dx.util.ByteArray r8 = r7.getBytes()
            com.android.dx.rop.cst.ConstantPool r5 = r7.getConstantPool()
            com.android.dx.cf.attrib.RawAttribute r7 = new com.android.dx.cf.attrib.RawAttribute
            r0 = r7
            r1 = r9
            r2 = r8
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            if (r12 == 0) goto L19
            java.lang.String r9 = "attribute data"
            r12.parsed(r8, r10, r11, r9)
        L19:
            return r7
    }
}
