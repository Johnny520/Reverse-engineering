package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛸᛳᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1062 extends xhss.AbstractC0954 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final java.lang.String f3427;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final xhss.C0380 f3428;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final xhss.C0380 f3429;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final xhss.C0380 f3430;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final java.util.ArrayList f3431;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final int f3432;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final java.lang.Integer f3433;

    public C1062(org.luckypray.dexkit.DexKitBridge r1, int r2, int r3, int r4, java.lang.String r5, java.lang.Integer r6, java.util.ArrayList r7, java.util.ArrayList r8, java.util.ArrayList r9) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.f3432 = r4
            r0.f3427 = r5
            r0.f3433 = r6
            r0.f3431 = r7
            xhss.ᛸᛱᲁᲁ r2 = new xhss.ᛸᛱᲁᲁ
            r4 = 0
            r2.<init>(r4, r0)
            xhss.ᛴᛷᛱ r5 = new xhss.ᛴᛷᛱ
            r5.<init>(r2)
            r0.f3429 = r5
            xhss.ᛶᲇᲇᛸ r2 = new xhss.ᛶᲇᲇᛸ
            r2.<init>(r0, r1, r3)
            xhss.ᛴᛷᛱ r5 = new xhss.ᛴᛷᛱ
            r5.<init>(r2)
            r0.f3428 = r5
            xhss.ᛶᲇᲇᛸ r2 = new xhss.ᛶᲇᲇᛸ
            r2.<init>(r1, r0, r3, r4)
            xhss.ᛴᛷᛱ r1 = new xhss.ᛴᛷᛱ
            r1.<init>(r2)
            r0.f3430 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L13
        L3:
            boolean r0 = r2 instanceof xhss.C1062
            if (r0 == 0) goto L15
            xhss.ᲇᛸᛳᛸ r2 = (xhss.C1062) r2
            java.lang.String r2 = r2.f3427
            java.lang.String r1 = r1.f3427
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L15
        L13:
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.f3427
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r4.f3432
            if (r1 <= 0) goto L21
            java.lang.String r1 = java.lang.reflect.Modifier.toString(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " "
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.append(r1)
        L21:
            xhss.ᲇᛶᛳᛵ r1 = r4.m1721()
            java.lang.String r1 = r1.f3370
            java.lang.String r2 = "class "
            java.lang.String r1 = r2.concat(r1)
            r0.append(r1)
            xhss.ᛴᛷᛱ r1 = r4.f3428
            java.lang.Object r1 = r1.m734()
            xhss.ᲇᛸᛳᛸ r1 = (xhss.C1062) r1
            if (r1 == 0) goto L48
            java.lang.String r2 = " extends "
            r0.append(r2)
            xhss.ᲇᛶᛳᛵ r1 = r1.m1721()
            java.lang.String r1 = r1.f3370
            r0.append(r1)
        L48:
            java.util.ArrayList r1 = r4.f3431
            int r1 = r1.size()
            if (r1 <= 0) goto L6a
            java.lang.String r1 = " implements "
            r0.append(r1)
            xhss.ᛴᛷᛱ r4 = r4.f3430
            java.lang.Object r4 = r4.m734()
            xhss.ᛵᛲᛴᛵ r4 = (xhss.C0443) r4
            xhss.ᲀᲈᲇᛱ r1 = xhss.C0919.f2962
            r2 = 30
            java.lang.String r3 = ", "
            java.lang.String r4 = xhss.AbstractC0713.m1242(r4, r3, r1, r2)
            r0.append(r4)
        L6a:
            java.lang.String r4 = r0.toString()
            return r4
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final xhss.C1047 m1721() {
            r0 = this;
            xhss.ᛴᛷᛱ r0 = r0.f3429
            java.lang.Object r0 = r0.m734()
            xhss.ᲇᛶᛳᛵ r0 = (xhss.C1047) r0
            return r0
    }
}
