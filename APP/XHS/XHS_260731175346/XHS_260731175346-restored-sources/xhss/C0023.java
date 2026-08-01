package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛲᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0023 extends xhss.C0953 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static final xhss.C0023 f203 = null;

    static {
            xhss.ᛱᛲᲇᲀ r0 = new xhss.ᛱᛲᲇᲀ
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2, r1)
            xhss.C0023.f203 = r0
            return
    }

    @Override // xhss.C0953
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof xhss.C0023
            if (r0 == 0) goto L23
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            xhss.ᛱᛲᲇᲀ r0 = (xhss.C0023) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L21
        L13:
            xhss.ᛱᛲᲇᲀ r3 = (xhss.C0023) r3
            int r0 = r3.f3090
            int r1 = r2.f3090
            if (r1 != r0) goto L23
            int r2 = r2.f3091
            int r3 = r3.f3091
            if (r2 != r3) goto L23
        L21:
            r2 = 1
            return r2
        L23:
            r2 = 0
            return r2
    }

    @Override // xhss.C0953
    public final int hashCode() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r1 = -1
            return r1
        L8:
            int r0 = r1.f3090
            int r0 = r0 * 31
            int r1 = r1.f3091
            int r0 = r0 + r1
            return r0
    }

    @Override // xhss.C0953
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.f3090
            int r1 = r1.f3091
            if (r0 <= r1) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // xhss.C0953
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.f3090
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            int r2 = r2.f3091
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
