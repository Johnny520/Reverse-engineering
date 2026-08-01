package xhss;

/* JADX INFO: renamed from: xhss.ᛲᲁᛸᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C0208 extends xhss.AbstractC0121 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final xhss.C0208 f775 = null;

    static {
            xhss.ᛲᲁᛸᛴ r0 = new xhss.ᛲᲁᛸᛴ
            r0.<init>()
            xhss.C0208.f775 = r0
            return
    }

    private C0208() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static xhss.AbstractC0495 m472(int r2, xhss.C0385 r3) {
            int r0 = xhss.AbstractC0390.m784(r2)
            r1 = 5
            if (r0 == r1) goto L43
            r1 = 6
            if (r0 == r1) goto L34
            r1 = 7
            if (r0 == r1) goto L26
            r1 = 8
            if (r0 != r1) goto L17
            r3.m756()
            xhss.ᲇᛳᛷᛳ r2 = xhss.C1023.f3322
            return r2
        L17:
            java.lang.String r2 = xhss.AbstractC0390.m768(r2)
            java.lang.String r3 = "Unexpected token: "
            java.lang.String r2 = r3.concat(r2)
            xhss.C0532.m950(r2)
            r2 = 0
            return r2
        L26:
            xhss.ᛶᲇᛴ r2 = new xhss.ᛶᲇᛴ
            boolean r3 = r3.m751()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.<init>(r3)
            return r2
        L34:
            java.lang.String r2 = r3.m739()
            xhss.ᛶᲇᛴ r3 = new xhss.ᛶᲇᛴ
            xhss.ᛴᛷᛴᲇ r0 = new xhss.ᛴᛷᛴᲇ
            r0.<init>(r2)
            r3.<init>(r0)
            return r3
        L43:
            xhss.ᛶᲇᛴ r2 = new xhss.ᛶᲇᛴ
            java.lang.String r3 = r3.m739()
            r2.<init>(r3)
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static xhss.AbstractC0495 m473(xhss.C0385 r8) {
            int r0 = r8.m762()
            int r1 = xhss.AbstractC0390.m784(r0)
            r2 = 2
            r3 = 0
            if (r1 == 0) goto L19
            if (r1 == r2) goto L10
            r1 = r3
            goto L21
        L10:
            r8.m743()
            xhss.ᲇᛱᛱᛷ r1 = new xhss.ᲇᛱᛱᛷ
            r1.<init>()
            goto L21
        L19:
            r8.m735()
            xhss.ᛷᛳᛶᲇ r1 = new xhss.ᛷᛳᛶᲇ
            r1.<init>()
        L21:
            if (r1 != 0) goto L28
            xhss.ᛵᛷᛸᛶ r8 = m472(r0, r8)
            return r8
        L28:
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
        L2d:
            boolean r4 = r8.m744()
            if (r4 == 0) goto L83
            boolean r4 = r1 instanceof xhss.C1002
            if (r4 == 0) goto L3c
            java.lang.String r4 = r8.m765()
            goto L3d
        L3c:
            r4 = r3
        L3d:
            int r5 = r8.m762()
            int r6 = xhss.AbstractC0390.m784(r5)
            if (r6 == 0) goto L54
            if (r6 == r2) goto L4b
            r6 = r3
            goto L5c
        L4b:
            r8.m743()
            xhss.ᲇᛱᛱᛷ r6 = new xhss.ᲇᛱᛱᛷ
            r6.<init>()
            goto L5c
        L54:
            r8.m735()
            xhss.ᛷᛳᛶᲇ r6 = new xhss.ᛷᛳᛶᲇ
            r6.<init>()
        L5c:
            if (r6 == 0) goto L60
            r7 = 1
            goto L61
        L60:
            r7 = 0
        L61:
            if (r6 != 0) goto L67
            xhss.ᛵᛷᛸᛶ r6 = m472(r5, r8)
        L67:
            boolean r5 = r1 instanceof xhss.C0638
            if (r5 == 0) goto L74
            r4 = r1
            xhss.ᛷᛳᛶᲇ r4 = (xhss.C0638) r4
            java.util.ArrayList r4 = r4.f2191
            r4.add(r6)
            goto L7c
        L74:
            r5 = r1
            xhss.ᲇᛱᛱᛷ r5 = (xhss.C1002) r5
            xhss.ᛱᛴᲈᛵ r5 = r5.f3291
            r5.put(r4, r6)
        L7c:
            if (r7 == 0) goto L2d
            r0.addLast(r1)
            r1 = r6
            goto L2d
        L83:
            boolean r4 = r1 instanceof xhss.C0638
            if (r4 == 0) goto L8b
            r8.m752()
            goto L8e
        L8b:
            r8.m750()
        L8e:
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L95
            return r1
        L95:
            java.lang.Object r1 = r0.removeLast()
            xhss.ᛵᛷᛸᛶ r1 = (xhss.AbstractC0495) r1
            goto L2d
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static void m474(xhss.C0827 r2, xhss.AbstractC0495 r3) {
            if (r3 == 0) goto Lb6
            boolean r0 = r3 instanceof xhss.C1023
            if (r0 == 0) goto L8
            goto Lb6
        L8:
            boolean r0 = r3 instanceof xhss.C0600
            if (r0 == 0) goto L3f
            xhss.ᛶᲇᛴ r3 = (xhss.C0600) r3
            java.io.Serializable r0 = r3.f2076
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L1c
            java.lang.Number r3 = r3.m1055()
            r2.m1394(r3)
            return
        L1c:
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L37
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L2b
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r3 = r0.booleanValue()
            goto L33
        L2b:
            java.lang.String r3 = r3.mo901()
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
        L33:
            r2.m1409(r3)
            return
        L37:
            java.lang.String r3 = r3.mo901()
            r2.m1405(r3)
            return
        L3f:
            boolean r0 = r3 instanceof xhss.C0638
            if (r0 == 0) goto L62
            r2.m1395()
            xhss.ᛷᛳᛶᲇ r3 = (xhss.C0638) r3
            java.util.ArrayList r3 = r3.f2191
            java.util.Iterator r3 = r3.iterator()
        L4e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r3.next()
            xhss.ᛵᛷᛸᛶ r0 = (xhss.AbstractC0495) r0
            m474(r2, r0)
            goto L4e
        L5e:
            r2.m1401()
            return
        L62:
            boolean r0 = r3 instanceof xhss.C1002
            if (r0 == 0) goto L9e
            r2.m1407()
            xhss.ᲇᛱᛱᛷ r3 = (xhss.C1002) r3
            xhss.ᛱᛴᲈᛵ r3 = r3.f3291
            java.util.Set r3 = r3.entrySet()
            xhss.ᛶᛶᛷᲈ r3 = (xhss.C0568) r3
            java.util.Iterator r3 = r3.iterator()
        L77:
            r0 = r3
            xhss.ᛳᛱᛱᛸ r0 = (xhss.C0228) r0
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L9a
            r0 = r3
            xhss.ᛳᛱᛱᛸ r0 = (xhss.C0228) r0
            xhss.ᛵᛲᛶᛵ r0 = r0.m499()
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r2.m1403(r1)
            java.lang.Object r0 = r0.getValue()
            xhss.ᛵᛷᛸᛶ r0 = (xhss.AbstractC0495) r0
            m474(r2, r0)
            goto L77
        L9a:
            r2.m1399()
            return
        L9e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.Class r3 = r3.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Couldn't write "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        Lb6:
            r2.m1396()
            return
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final /* bridge */ /* synthetic */ java.lang.Object mo119(xhss.C0385 r1) {
            r0 = this;
            xhss.ᛵᛷᛸᛶ r0 = m473(r1)
            return r0
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final /* bridge */ /* synthetic */ void mo120(xhss.C0827 r1, java.lang.Object r2) {
            r0 = this;
            xhss.ᛵᛷᛸᛶ r2 = (xhss.AbstractC0495) r2
            m474(r1, r2)
            return
    }
}
