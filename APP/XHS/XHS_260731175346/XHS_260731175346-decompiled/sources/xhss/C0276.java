package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛵᲁᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0276 implements xhss.InterfaceC0204 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final boolean f1069;

    public C0276(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.f1069 = r1
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Empty{"
            r0.<init>(r1)
            boolean r2 = r2.f1069
            if (r2 == 0) goto Le
            java.lang.String r2 = "Active"
            goto L10
        Le:
            java.lang.String r2 = "New"
        L10:
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // xhss.InterfaceC0204
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final boolean mo465() {
            r0 = this;
            boolean r0 = r0.f1069
            return r0
    }

    @Override // xhss.InterfaceC0204
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public final xhss.C0409 mo466() {
            r0 = this;
            r0 = 0
            return r0
    }
}
