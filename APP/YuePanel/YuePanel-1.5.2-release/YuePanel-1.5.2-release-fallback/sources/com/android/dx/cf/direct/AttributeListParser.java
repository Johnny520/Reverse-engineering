package com.android.dx.cf.direct;

/* JADX INFO: loaded from: classes.dex */
final class AttributeListParser {
    private final com.android.dx.cf.direct.AttributeFactory attributeFactory;
    private final com.android.dx.cf.direct.DirectClassFile cf;
    private final int context;
    private int endOffset;
    private final com.android.dx.cf.iface.StdAttributeList list;
    private com.android.dx.cf.iface.ParseObserver observer;
    private final int offset;

    public AttributeListParser(com.android.dx.cf.direct.DirectClassFile r2, int r3, int r4, com.android.dx.cf.direct.AttributeFactory r5) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L2a
            if (r5 == 0) goto L22
            com.android.dx.util.ByteArray r0 = r2.getBytes()
            int r0 = r0.getUnsignedShort(r4)
            r1.cf = r2
            r1.context = r3
            r1.offset = r4
            r1.attributeFactory = r5
            com.android.dx.cf.iface.StdAttributeList r2 = new com.android.dx.cf.iface.StdAttributeList
            r2.<init>(r0)
            r1.list = r2
            r2 = -1
            r1.endOffset = r2
            return
        L22:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "attributeFactory == null"
            r2.<init>(r3)
            throw r2
        L2a:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "cf == null"
            r2.<init>(r3)
            throw r2
    }

    private void parse() {
            r11 = this;
            java.lang.String r0 = "]"
            java.lang.String r1 = "...while parsing attributes["
            com.android.dx.cf.iface.StdAttributeList r2 = r11.list
            int r2 = r2.size()
            int r3 = r11.offset
            r4 = 2
            int r3 = r3 + r4
            com.android.dx.cf.direct.DirectClassFile r5 = r11.cf
            com.android.dx.util.ByteArray r5 = r5.getBytes()
            com.android.dx.cf.iface.ParseObserver r6 = r11.observer
            if (r6 == 0) goto L32
            int r7 = r11.offset
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "attributes_count: "
            r8.append(r9)
            java.lang.String r9 = com.android.dx.util.Hex.u2(r2)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r6.parsed(r5, r7, r4, r8)
        L32:
            r4 = 0
            r6 = r4
        L34:
            if (r6 >= r2) goto Lcb
            com.android.dx.cf.iface.ParseObserver r7 = r11.observer     // Catch: java.lang.RuntimeException -> L5a com.android.dx.cf.iface.ParseException -> L5c
            if (r7 == 0) goto L5e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L5a com.android.dx.cf.iface.ParseException -> L5c
            r8.<init>()     // Catch: java.lang.RuntimeException -> L5a com.android.dx.cf.iface.ParseException -> L5c
            java.lang.String r9 = "\nattributes["
            r8.append(r9)     // Catch: java.lang.RuntimeException -> L5a com.android.dx.cf.iface.ParseException -> L5c
            r8.append(r6)     // Catch: java.lang.RuntimeException -> L5a com.android.dx.cf.iface.ParseException -> L5c
            java.lang.String r9 = "]:\n"
            r8.append(r9)     // Catch: java.lang.RuntimeException -> L5a com.android.dx.cf.iface.ParseException -> L5c
            java.lang.String r8 = r8.toString()     // Catch: java.lang.RuntimeException -> L5a com.android.dx.cf.iface.ParseException -> L5c
            r7.parsed(r5, r3, r4, r8)     // Catch: java.lang.RuntimeException -> L5a com.android.dx.cf.iface.ParseException -> L5c
            com.android.dx.cf.iface.ParseObserver r7 = r11.observer     // Catch: java.lang.RuntimeException -> L5a com.android.dx.cf.iface.ParseException -> L5c
            r8 = 1
            r7.changeIndent(r8)     // Catch: java.lang.RuntimeException -> L5a com.android.dx.cf.iface.ParseException -> L5c
            goto L5e
        L5a:
            r2 = move-exception
            goto L9a
        L5c:
            r2 = move-exception
            goto Lb5
        L5e:
            com.android.dx.cf.direct.AttributeFactory r7 = r11.attributeFactory     // Catch: java.lang.RuntimeException -> L5a com.android.dx.cf.iface.ParseException -> L5c
            com.android.dx.cf.direct.DirectClassFile r8 = r11.cf     // Catch: java.lang.RuntimeException -> L5a com.android.dx.cf.iface.ParseException -> L5c
            int r9 = r11.context     // Catch: java.lang.RuntimeException -> L5a com.android.dx.cf.iface.ParseException -> L5c
            com.android.dx.cf.iface.ParseObserver r10 = r11.observer     // Catch: java.lang.RuntimeException -> L5a com.android.dx.cf.iface.ParseException -> L5c
            com.android.dx.cf.iface.Attribute r7 = r7.parse(r8, r9, r3, r10)     // Catch: java.lang.RuntimeException -> L5a com.android.dx.cf.iface.ParseException -> L5c
            int r8 = r7.byteLength()     // Catch: java.lang.RuntimeException -> L5a com.android.dx.cf.iface.ParseException -> L5c
            int r3 = r3 + r8
            com.android.dx.cf.iface.StdAttributeList r8 = r11.list     // Catch: java.lang.RuntimeException -> L5a com.android.dx.cf.iface.ParseException -> L5c
            r8.set(r6, r7)     // Catch: java.lang.RuntimeException -> L5a com.android.dx.cf.iface.ParseException -> L5c
            com.android.dx.cf.iface.ParseObserver r7 = r11.observer     // Catch: java.lang.RuntimeException -> L5a com.android.dx.cf.iface.ParseException -> L5c
            if (r7 == 0) goto L97
            r8 = -1
            r7.changeIndent(r8)     // Catch: java.lang.RuntimeException -> L5a com.android.dx.cf.iface.ParseException -> L5c
            com.android.dx.cf.iface.ParseObserver r7 = r11.observer     // Catch: java.lang.RuntimeException -> L5a com.android.dx.cf.iface.ParseException -> L5c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L5a com.android.dx.cf.iface.ParseException -> L5c
            r8.<init>()     // Catch: java.lang.RuntimeException -> L5a com.android.dx.cf.iface.ParseException -> L5c
            java.lang.String r9 = "end attributes["
            r8.append(r9)     // Catch: java.lang.RuntimeException -> L5a com.android.dx.cf.iface.ParseException -> L5c
            r8.append(r6)     // Catch: java.lang.RuntimeException -> L5a com.android.dx.cf.iface.ParseException -> L5c
            java.lang.String r9 = "]\n"
            r8.append(r9)     // Catch: java.lang.RuntimeException -> L5a com.android.dx.cf.iface.ParseException -> L5c
            java.lang.String r8 = r8.toString()     // Catch: java.lang.RuntimeException -> L5a com.android.dx.cf.iface.ParseException -> L5c
            r7.parsed(r5, r3, r4, r8)     // Catch: java.lang.RuntimeException -> L5a com.android.dx.cf.iface.ParseException -> L5c
        L97:
            int r6 = r6 + 1
            goto L34
        L9a:
            com.android.dx.cf.iface.ParseException r3 = new com.android.dx.cf.iface.ParseException
            r3.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r6)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r3.addContext(r0)
            throw r3
        Lb5:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r6)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.addContext(r0)
            throw r2
        Lcb:
            r11.endOffset = r3
            return
    }

    private void parseIfNecessary() {
            r1 = this;
            int r0 = r1.endOffset
            if (r0 >= 0) goto L7
            r1.parse()
        L7:
            return
    }

    public int getEndOffset() {
            r1 = this;
            r1.parseIfNecessary()
            int r0 = r1.endOffset
            return r0
    }

    public com.android.dx.cf.iface.StdAttributeList getList() {
            r1 = this;
            r1.parseIfNecessary()
            com.android.dx.cf.iface.StdAttributeList r0 = r1.list
            return r0
    }

    public void setObserver(com.android.dx.cf.iface.ParseObserver r1) {
            r0 = this;
            r0.observer = r1
            return
    }
}
