package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛴᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0759 extends xhss.AbstractC0588 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final java.lang.reflect.Field f2536;

    public C0759(java.lang.reflect.Field r1) {
            r0 = this;
            r0.<init>()
            r0.f2536 = r1
            return
    }

    /* JADX INFO: renamed from: ᛱᲈᛳᛴ, reason: contains not printable characters */
    public final java.lang.Object m1302() {
            r1 = this;
            r1.m1024()     // Catch: java.lang.Throwable -> Lc
            java.lang.reflect.Field r0 = r1.f2536     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r1 = r1.f2045     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.Throwable -> Lc
            goto L13
        Lc:
            r1 = move-exception
            xhss.ᲈᛳᛱᲇ r0 = new xhss.ᲈᛳᛱᲇ
            r0.<init>(r1)
            r1 = r0
        L13:
            boolean r0 = r1 instanceof xhss.C1129
            if (r0 == 0) goto L18
            r1 = 0
        L18:
            return r1
    }

    @Override // xhss.AbstractC0588
    /* JADX INFO: renamed from: ᛵᛷᛲᛸ */
    public final xhss.AbstractC0588 mo463(java.lang.Object r1) {
            r0 = this;
            r0.m1051(r1)
            return r0
    }

    @Override // xhss.AbstractC0561
    /* JADX INFO: renamed from: ᛸᛲᲀᛵ */
    public final java.lang.reflect.Member mo464() {
            r0 = this;
            java.lang.reflect.Field r0 = r0.f2536
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛴᛸᛲ, reason: contains not printable characters */
    public final java.lang.Object m1303() {
            r2 = this;
            r0 = 0
            r2.m1024()     // Catch: java.lang.Throwable -> L10
            java.lang.reflect.Field r1 = r2.f2536     // Catch: java.lang.Throwable -> L10
            java.lang.Object r2 = r2.f2045     // Catch: java.lang.Throwable -> L10
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L10
            if (r2 != 0) goto L17
            r2 = r0
            goto L17
        L10:
            r2 = move-exception
            xhss.ᲈᛳᛱᲇ r1 = new xhss.ᲈᛳᛱᲇ
            r1.<init>(r2)
            r2 = r1
        L17:
            boolean r1 = r2 instanceof xhss.C1129
            if (r1 == 0) goto L1c
            goto L1d
        L1c:
            r0 = r2
        L1d:
            return r0
    }
}
