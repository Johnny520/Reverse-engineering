package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛱᛱᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1002 extends xhss.AbstractC0495 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0042 f3291;

    public C1002() {
            r2 = this;
            r2.<init>()
            xhss.ᛱᛴᲈᛵ r0 = new xhss.ᛱᛴᲈᛵ
            xhss.ᛸᛲᲇᲁ r1 = xhss.C0042.f274
            r1 = 0
            r0.<init>(r1)
            r2.f3291 = r0
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto L15
            boolean r0 = r2 instanceof xhss.C1002
            if (r0 == 0) goto L13
            xhss.ᲇᛱᛱᛷ r2 = (xhss.C1002) r2
            xhss.ᛱᛴᲈᛵ r2 = r2.f3291
            xhss.ᛱᛴᲈᛵ r1 = r1.f3291
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L13
            goto L15
        L13:
            r1 = 0
            return r1
        L15:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            xhss.ᛱᛴᲈᛵ r0 = r0.f3291
            int r0 = r0.hashCode()
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final xhss.AbstractC0495 m1644(java.lang.String r1) {
            r0 = this;
            xhss.ᛱᛴᲈᛵ r0 = r0.f3291
            java.lang.Object r0 = r0.get(r1)
            xhss.ᛵᛷᛸᛶ r0 = (xhss.AbstractC0495) r0
            return r0
    }
}
