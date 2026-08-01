package xhss;

/* JADX INFO: renamed from: xhss.ᲁᛲᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0929 extends xhss.AbstractC0121 {

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final xhss.C0810 f3013 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final int f3014;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C1125 f3015;

    static {
            xhss.ᛸᲁᲀᛵ r0 = new xhss.ᛸᲁᲀᛵ
            r1 = 1
            r0.<init>(r1)
            xhss.C0929.f3013 = r0
            return
    }

    public C0929(xhss.C1125 r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f3015 = r1
            r0.f3014 = r2
            return
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.Object mo119(xhss.C0385 r10) {
            r9 = this;
            int r0 = r10.m762()
            int r1 = xhss.AbstractC0390.m784(r0)
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1a
            if (r1 == r2) goto L11
            r1 = r4
            goto L22
        L11:
            r10.m743()
            xhss.ᛱᛴᲈᛵ r1 = new xhss.ᛱᛴᲈᛵ
            r1.<init>(r3)
            goto L22
        L1a:
            r10.m735()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L22:
            if (r1 != 0) goto L29
            java.io.Serializable r9 = r9.m1530(r0, r10)
            return r9
        L29:
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
        L2e:
            boolean r5 = r10.m744()
            if (r5 == 0) goto L80
            boolean r5 = r1 instanceof java.util.Map
            if (r5 == 0) goto L3d
            java.lang.String r5 = r10.m765()
            goto L3e
        L3d:
            r5 = r4
        L3e:
            int r6 = r10.m762()
            int r7 = xhss.AbstractC0390.m784(r6)
            if (r7 == 0) goto L55
            if (r7 == r2) goto L4c
            r7 = r4
            goto L5d
        L4c:
            r10.m743()
            xhss.ᛱᛴᲈᛵ r7 = new xhss.ᛱᛴᲈᛵ
            r7.<init>(r3)
            goto L5d
        L55:
            r10.m735()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L5d:
            if (r7 == 0) goto L61
            r8 = r3
            goto L62
        L61:
            r8 = 0
        L62:
            if (r7 != 0) goto L68
            java.io.Serializable r7 = r9.m1530(r6, r10)
        L68:
            boolean r6 = r1 instanceof java.util.List
            if (r6 == 0) goto L73
            r5 = r1
            java.util.List r5 = (java.util.List) r5
            r5.add(r7)
            goto L79
        L73:
            r6 = r1
            java.util.Map r6 = (java.util.Map) r6
            r6.put(r5, r7)
        L79:
            if (r8 == 0) goto L2e
            r0.addLast(r1)
            r1 = r7
            goto L2e
        L80:
            boolean r5 = r1 instanceof java.util.List
            if (r5 == 0) goto L88
            r10.m752()
            goto L8b
        L88:
            r10.m750()
        L8b:
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L92
            return r1
        L92:
            java.lang.Object r1 = r0.removeLast()
            goto L2e
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final void mo120(xhss.C0827 r2, java.lang.Object r3) {
            r1 = this;
            if (r3 != 0) goto L6
            r2.m1396()
            return
        L6:
            xhss.ᲈᛲᛶᛴ r1 = r1.f3015
            java.lang.Class r0 = r3.getClass()
            xhss.ᛲᛱᛶᛴ r1 = r1.m1814(r0)
            boolean r0 = r1 instanceof xhss.C0929
            if (r0 == 0) goto L1b
            r2.m1407()
            r2.m1399()
            return
        L1b:
            r1.mo120(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.io.Serializable m1530(int r3, xhss.C0385 r4) {
            r2 = this;
            int r0 = xhss.AbstractC0390.m784(r3)
            r1 = 5
            if (r0 == r1) goto L34
            r1 = 6
            if (r0 == r1) goto L2d
            r2 = 7
            if (r0 == r2) goto L24
            r2 = 8
            r1 = 0
            if (r0 != r2) goto L16
            r4.m756()
            return r1
        L16:
            java.lang.String r2 = xhss.AbstractC0390.m768(r3)
            java.lang.String r3 = "Unexpected token: "
            java.lang.String r2 = r3.concat(r2)
            xhss.C0532.m950(r2)
            return r1
        L24:
            boolean r2 = r4.m751()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L2d:
            int r2 = r2.f3014
            java.lang.Number r2 = xhss.AbstractC0390.m776(r2, r4)
            return r2
        L34:
            java.lang.String r2 = r4.m739()
            return r2
    }
}
