package xhss;

/* JADX INFO: renamed from: xhss.ᛲᲀᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0200 extends xhss.AbstractC0588 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final java.lang.reflect.Method f761;

    public C0200(java.lang.reflect.Method r1) {
            r0 = this;
            r0.<init>()
            r0.f761 = r1
            return
    }

    /* JADX INFO: renamed from: ᛱᲈᛳᛴ, reason: contains not printable characters */
    public final java.lang.Object m462(java.lang.Object... r3) {
            r2 = this;
            int r0 = r3.length     // Catch: java.lang.Throwable -> L16
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)     // Catch: java.lang.Throwable -> L16
            r2.m1024()     // Catch: java.lang.Throwable -> L16
            java.lang.reflect.Method r0 = r2.f761     // Catch: java.lang.Throwable -> L16
            java.lang.Object r2 = r2.f2045     // Catch: java.lang.Throwable -> L16
            int r1 = r3.length     // Catch: java.lang.Throwable -> L16
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)     // Catch: java.lang.Throwable -> L16
            java.lang.Object r2 = r0.invoke(r2, r3)     // Catch: java.lang.Throwable -> L16
            goto L1d
        L16:
            r2 = move-exception
            xhss.ᲈᛳᛱᲇ r3 = new xhss.ᲈᛳᛱᲇ
            r3.<init>(r2)
            r2 = r3
        L1d:
            boolean r3 = r2 instanceof xhss.C1129
            if (r3 == 0) goto L22
            r2 = 0
        L22:
            return r2
    }

    @Override // xhss.AbstractC0588
    /* JADX INFO: renamed from: ᛵᛷᛲᛸ, reason: contains not printable characters */
    public final xhss.AbstractC0588 mo463(java.lang.Object r1) {
            r0 = this;
            r0.m1051(r1)
            return r0
    }

    @Override // xhss.AbstractC0561
    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final java.lang.reflect.Member mo464() {
            r0 = this;
            java.lang.reflect.Method r0 = r0.f761
            return r0
    }
}
