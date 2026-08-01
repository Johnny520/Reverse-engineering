package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛸᛷᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0688 implements xhss.InterfaceC0966 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final int f2338;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.InterfaceC0966 f2339;

    public C0688(xhss.InterfaceC0966 r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f2339 = r1
            r0.f2338 = r2
            if (r2 < 0) goto La
            return
        La:
            java.lang.String r0 = "count must be non-negative, but was "
            r1 = 46
            xhss.C0532.m954(r0, r2, r1)
            r0 = 0
            throw r0
    }

    @Override // xhss.InterfaceC0966
    public final java.util.Iterator iterator() {
            r1 = this;
            xhss.ᛸᛲᲀᛵ r0 = new xhss.ᛸᛲᲀᛵ
            r0.<init>(r1)
            return r0
    }
}
