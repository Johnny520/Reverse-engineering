package com.android.dx.cf.direct;

/* JADX INFO: loaded from: classes.dex */
abstract class MemberListParser {
    private final com.android.dx.cf.direct.AttributeFactory attributeFactory;
    private final com.android.dx.cf.direct.DirectClassFile cf;
    private final com.android.dx.rop.cst.CstType definer;
    private int endOffset;
    private com.android.dx.cf.iface.ParseObserver observer;
    private final int offset;

    public MemberListParser(com.android.dx.cf.direct.DirectClassFile r1, com.android.dx.rop.cst.CstType r2, int r3, com.android.dx.cf.direct.AttributeFactory r4) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L25
            if (r3 < 0) goto L1d
            if (r4 == 0) goto L15
            r0.cf = r1
            r0.definer = r2
            r0.offset = r3
            r0.attributeFactory = r4
            r1 = -1
            r0.endOffset = r1
            return
        L15:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "attributeFactory == null"
            r1.<init>(r2)
            throw r1
        L1d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "offset < 0"
            r1.<init>(r2)
            throw r1
        L25:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "cf == null"
            r1.<init>(r2)
            throw r1
    }

    private void parse() {
            r19 = this;
            r1 = r19
            java.lang.String r2 = "]"
            java.lang.String r3 = "...while parsing "
            java.lang.String r4 = "s["
            int r0 = r19.getAttributeContext()
            int r5 = r19.getCount()
            int r6 = r1.offset
            r7 = 2
            int r6 = r6 + r7
            com.android.dx.cf.direct.DirectClassFile r8 = r1.cf
            com.android.dx.util.ByteArray r8 = r8.getBytes()
            com.android.dx.cf.direct.DirectClassFile r9 = r1.cf
            com.android.dx.rop.cst.ConstantPool r15 = r9.getConstantPool()
            com.android.dx.cf.iface.ParseObserver r9 = r1.observer
            if (r9 == 0) goto L45
            int r10 = r1.offset
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r19.humanName()
            r11.append(r12)
            java.lang.String r12 = "s_count: "
            r11.append(r12)
            java.lang.String r12 = com.android.dx.util.Hex.u2(r5)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r9.parsed(r8, r10, r7, r11)
        L45:
            r13 = 0
        L46:
            if (r13 >= r5) goto L1bf
            int r9 = r8.getUnsignedShort(r6)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            int r10 = r6 + 2
            int r11 = r8.getUnsignedShort(r10)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            int r12 = r6 + 4
            int r7 = r8.getUnsignedShort(r12)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            com.android.dx.rop.cst.Constant r11 = r15.get(r11)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            com.android.dx.rop.cst.CstString r11 = (com.android.dx.rop.cst.CstString) r11     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            com.android.dx.rop.cst.Constant r7 = r15.get(r7)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            com.android.dx.rop.cst.CstString r7 = (com.android.dx.rop.cst.CstString) r7     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            com.android.dx.cf.iface.ParseObserver r14 = r1.observer     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            if (r14 == 0) goto Lfd
            r17 = r5
            java.lang.String r5 = r11.getString()     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            r18 = r15
            java.lang.String r15 = r7.getString()     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            r14.startParsingMember(r8, r6, r5, r15)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            com.android.dx.cf.iface.ParseObserver r5 = r1.observer     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            r14.<init>()     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            java.lang.String r15 = "\n"
            r14.append(r15)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            java.lang.String r15 = r19.humanName()     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            r14.append(r15)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            r14.append(r4)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            r14.append(r13)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            java.lang.String r15 = "]:\n"
            r14.append(r15)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            java.lang.String r14 = r14.toString()     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            r15 = 0
            r5.parsed(r8, r6, r15, r14)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            com.android.dx.cf.iface.ParseObserver r5 = r1.observer     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            r14 = 1
            r5.changeIndent(r14)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            com.android.dx.cf.iface.ParseObserver r5 = r1.observer     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            r14.<init>()     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            java.lang.String r15 = "access_flags: "
            r14.append(r15)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            java.lang.String r15 = r1.humanAccessFlags(r9)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            r14.append(r15)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            java.lang.String r14 = r14.toString()     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            r15 = 2
            r5.parsed(r8, r6, r15, r14)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            com.android.dx.cf.iface.ParseObserver r5 = r1.observer     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            r14.<init>()     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            java.lang.String r15 = "name: "
            r14.append(r15)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            java.lang.String r15 = r11.toHuman()     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            r14.append(r15)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            java.lang.String r14 = r14.toString()     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            r15 = 2
            r5.parsed(r8, r10, r15, r14)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            com.android.dx.cf.iface.ParseObserver r5 = r1.observer     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            r10.<init>()     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            java.lang.String r14 = "descriptor: "
            r10.append(r14)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            java.lang.String r14 = r7.toHuman()     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            r10.append(r14)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            java.lang.String r10 = r10.toString()     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            r15 = 2
            r5.parsed(r8, r12, r15, r10)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            goto L102
        Lf5:
            r0 = move-exception
            r5 = r13
            goto L17a
        Lf9:
            r0 = move-exception
            r5 = r13
            goto L19f
        Lfd:
            r17 = r5
            r18 = r15
            r15 = 2
        L102:
            int r6 = r6 + 6
            com.android.dx.cf.direct.AttributeListParser r5 = new com.android.dx.cf.direct.AttributeListParser     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            com.android.dx.cf.direct.DirectClassFile r10 = r1.cf     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            com.android.dx.cf.direct.AttributeFactory r12 = r1.attributeFactory     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            r5.<init>(r10, r0, r6, r12)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            com.android.dx.cf.iface.ParseObserver r6 = r1.observer     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            r5.setObserver(r6)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            int r6 = r5.getEndOffset()     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            com.android.dx.cf.iface.StdAttributeList r5 = r5.getList()     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            r5.setImmutable()     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            com.android.dx.rop.cst.CstNat r10 = new com.android.dx.rop.cst.CstNat     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            r10.<init>(r11, r7)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            com.android.dx.cf.iface.Member r14 = r1.set(r13, r9, r10, r5)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            com.android.dx.cf.iface.ParseObserver r5 = r1.observer     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            if (r5 == 0) goto L16f
            r9 = -1
            r5.changeIndent(r9)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            com.android.dx.cf.iface.ParseObserver r5 = r1.observer     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            r9.<init>()     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            java.lang.String r10 = "end "
            r9.append(r10)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            java.lang.String r10 = r19.humanName()     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            r9.append(r10)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            r9.append(r4)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            r9.append(r13)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            java.lang.String r10 = "]\n"
            r9.append(r10)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            java.lang.String r9 = r9.toString()     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            r12 = 0
            r5.parsed(r8, r6, r12, r9)     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            com.android.dx.cf.iface.ParseObserver r9 = r1.observer     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            java.lang.String r5 = r11.getString()     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            java.lang.String r7 = r7.getString()     // Catch: java.lang.RuntimeException -> Lf5 com.android.dx.cf.iface.ParseException -> Lf9
            r10 = r8
            r11 = r6
            r16 = r12
            r12 = r5
            r5 = r13
            r13 = r7
            r7 = r16
            r9.endParsingMember(r10, r11, r12, r13, r14)     // Catch: java.lang.RuntimeException -> L16b com.android.dx.cf.iface.ParseException -> L16d
            goto L171
        L16b:
            r0 = move-exception
            goto L17a
        L16d:
            r0 = move-exception
            goto L19f
        L16f:
            r5 = r13
            r7 = 0
        L171:
            int r13 = r5 + 1
            r7 = r15
            r5 = r17
            r15 = r18
            goto L46
        L17a:
            com.android.dx.cf.iface.ParseException r6 = new com.android.dx.cf.iface.ParseException
            r6.<init>(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = r19.humanName()
            r0.append(r3)
            r0.append(r4)
            r0.append(r5)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r6.addContext(r0)
            throw r6
        L19f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r3 = r19.humanName()
            r6.append(r3)
            r6.append(r4)
            r6.append(r5)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r0.addContext(r2)
            throw r0
        L1bf:
            r1.endOffset = r6
            return
    }

    public abstract int getAttributeContext();

    public final int getCount() {
            r2 = this;
            com.android.dx.cf.direct.DirectClassFile r0 = r2.cf
            com.android.dx.util.ByteArray r0 = r0.getBytes()
            int r1 = r2.offset
            int r0 = r0.getUnsignedShort(r1)
            return r0
    }

    public final com.android.dx.rop.cst.CstType getDefiner() {
            r1 = this;
            com.android.dx.rop.cst.CstType r0 = r1.definer
            return r0
    }

    public int getEndOffset() {
            r1 = this;
            r1.parseIfNecessary()
            int r0 = r1.endOffset
            return r0
    }

    public abstract java.lang.String humanAccessFlags(int r1);

    public abstract java.lang.String humanName();

    public final void parseIfNecessary() {
            r1 = this;
            int r0 = r1.endOffset
            if (r0 >= 0) goto L7
            r1.parse()
        L7:
            return
    }

    public abstract com.android.dx.cf.iface.Member set(int r1, int r2, com.android.dx.rop.cst.CstNat r3, com.android.dx.cf.iface.AttributeList r4);

    public final void setObserver(com.android.dx.cf.iface.ParseObserver r1) {
            r0 = this;
            r0.observer = r1
            return
    }
}
