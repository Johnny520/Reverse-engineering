package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛵᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0168 extends xhss.AbstractC0121 {

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final xhss.C1124 f676 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C1113 f677;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.Class f678;

    static {
            xhss.ᲈᛲᛶ r0 = new xhss.ᲈᛲᛶ
            r0.<init>()
            xhss.C0168.f676 = r0
            return
    }

    public C0168(xhss.C1125 r3, xhss.AbstractC0121 r4, java.lang.Class r5) {
            r2 = this;
            r2.<init>()
            xhss.ᲈᛱᛲᛴ r0 = new xhss.ᲈᛱᛲᛴ
            r1 = 2
            r0.<init>(r3, r4, r5, r1)
            r2.f677 = r0
            r2.f678 = r5
            return
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.Object mo119(xhss.C0385 r4) {
            r3 = this;
            int r0 = r4.m762()
            r1 = 9
            if (r0 != r1) goto Ld
            r4.m756()
            r3 = 0
            return r3
        Ld:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.m735()
        L15:
            boolean r1 = r4.m744()
            if (r1 == 0) goto L27
            xhss.ᲈᛱᛲᛴ r1 = r3.f677
            xhss.ᛲᛱᛶᛴ r1 = r1.f3589
            java.lang.Object r1 = r1.mo119(r4)
            r0.add(r1)
            goto L15
        L27:
            r4.m752()
            int r4 = r0.size()
            java.lang.Class r3 = r3.f678
            boolean r1 = r3.isPrimitive()
            if (r1 == 0) goto L48
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r4)
            r1 = 0
        L3b:
            if (r1 >= r4) goto L47
            java.lang.Object r2 = r0.get(r1)
            java.lang.reflect.Array.set(r3, r1, r2)
            int r1 = r1 + 1
            goto L3b
        L47:
            return r3
        L48:
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r4)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            java.lang.Object[] r3 = r0.toArray(r3)
            return r3
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final void mo120(xhss.C0827 r5, java.lang.Object r6) {
            r4 = this;
            if (r6 != 0) goto L6
            r5.m1396()
            return
        L6:
            r5.m1395()
            int r0 = java.lang.reflect.Array.getLength(r6)
            r1 = 0
        Le:
            if (r1 >= r0) goto L1c
            java.lang.Object r2 = java.lang.reflect.Array.get(r6, r1)
            xhss.ᲈᛱᛲᛴ r3 = r4.f677
            r3.mo120(r5, r2)
            int r1 = r1 + 1
            goto Le
        L1c:
            r5.m1401()
            return
    }
}
