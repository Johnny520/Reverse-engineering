package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛲᛵᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C1012 extends xhss.AbstractC0121 {
    public C1012() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.Object mo119(xhss.C0385 r7) {
            r6 = this;
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            r7.m735()
            int r0 = r7.m762()
            r1 = 0
            r2 = r1
        Le:
            r3 = 2
            if (r0 == r3) goto L58
            int r3 = xhss.AbstractC0390.m784(r0)
            r4 = 5
            r5 = 0
            if (r3 == r4) goto L34
            r4 = 6
            if (r3 == r4) goto L34
            r4 = 7
            if (r3 != r4) goto L24
            boolean r0 = r7.m751()
            goto L40
        L24:
            java.lang.String r6 = xhss.AbstractC0390.m768(r0)
            java.lang.String r0 = "; at path "
            java.lang.String r7 = r7.m764(r1)
            java.lang.String r1 = "Invalid bitset value type: "
            xhss.C0532.m957(r1, r6, r0, r7)
            return r5
        L34:
            int r0 = r7.m741()
            if (r0 != 0) goto L3c
            r0 = r1
            goto L40
        L3c:
            r3 = 1
            if (r0 != r3) goto L4c
            r0 = r3
        L40:
            if (r0 == 0) goto L45
            r6.set(r2)
        L45:
            int r2 = r2 + 1
            int r0 = r7.m762()
            goto Le
        L4c:
            java.lang.String r6 = ", expected 0 or 1; at path "
            java.lang.String r7 = r7.m764(r3)
            java.lang.String r1 = "Invalid bitset value "
            xhss.C0349.m710(r1, r0, r6, r7)
            return r5
        L58:
            r7.m752()
            return r6
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final void mo120(xhss.C0827 r4, java.lang.Object r5) {
            r3 = this;
            java.util.BitSet r5 = (java.util.BitSet) r5
            r4.m1395()
            int r3 = r5.length()
            r0 = 0
        La:
            if (r0 >= r3) goto L17
            boolean r1 = r5.get(r0)
            long r1 = (long) r1
            r4.m1397(r1)
            int r0 = r0 + 1
            goto La
        L17:
            r4.m1401()
            return
    }
}
