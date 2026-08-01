package xhss;

/* JADX INFO: renamed from: xhss.ᛷᲁᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0703 extends java.util.ArrayList {
    public final java.lang.Object first() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lc
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            return r1
        Lc:
            java.lang.String r1 = "list is empty"
            xhss.C0532.m950(r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.Object m1225() {
            r5 = this;
            int r0 = super.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = 0
            java.lang.Object r0 = r5.get(r0)
            int r2 = super.size()
            r3 = 1
        L12:
            if (r3 >= r2) goto L22
            java.lang.Object r4 = r5.get(r3)
            boolean r4 = xhss.AbstractC0007.m97(r0, r4)
            if (r4 != 0) goto L1f
            return r1
        L1f:
            int r3 = r3 + 1
            goto L12
        L22:
            return r0
    }
}
