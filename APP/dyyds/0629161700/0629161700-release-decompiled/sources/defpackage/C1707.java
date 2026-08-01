package defpackage;

/* JADX INFO: renamed from: ᲀᛷᛵᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C1707 extends defpackage.AbstractC0758 {
    public C1707() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo561(defpackage.C0353 r4, java.lang.Object r5) {
            r3 = this;
            java.util.BitSet r5 = (java.util.BitSet) r5
            r4.m1082()
            int r3 = r5.length()
            r0 = 0
        La:
            if (r0 >= r3) goto L17
            boolean r1 = r5.get(r0)
            long r1 = (long) r1
            r4.m1070(r1)
            int r0 = r0 + 1
            goto La
        L17:
            r4.m1068()
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo562(defpackage.C1103 r7) {
            r6 = this;
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            r7.m2101()
            int r0 = r7.m2090()
            r1 = 0
            r2 = r1
        Le:
            r3 = 2
            if (r0 == r3) goto L58
            int r3 = defpackage.AbstractC0225.m812(r0)
            r4 = 5
            r5 = 0
            if (r3 == r4) goto L34
            r4 = 6
            if (r3 == r4) goto L34
            r4 = 7
            if (r3 != r4) goto L24
            boolean r0 = r7.m2100()
            goto L40
        L24:
            java.lang.String r6 = defpackage.AbstractC0225.m824(r0)
            java.lang.String r0 = "; at path "
            java.lang.String r7 = r7.m2106(r1)
            java.lang.String r1 = "Invalid bitset value type: "
            defpackage.C0086.m555(r1, r6, r0, r7)
            return r5
        L34:
            int r0 = r7.m2099()
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
            int r0 = r7.m2090()
            goto Le
        L4c:
            java.lang.String r6 = ", expected 0 or 1; at path "
            java.lang.String r7 = r7.m2106(r3)
            java.lang.String r1 = "Invalid bitset value "
            defpackage.C0086.m549(r1, r0, r6, r7)
            return r5
        L58:
            r7.m2083()
            return r6
    }
}
