package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛲᲇᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0845 implements xhss.InterfaceC0966 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.Object f2747;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.InterfaceC0938 f2748;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2749;

    public /* synthetic */ C0845(java.lang.Object r1, xhss.InterfaceC0938 r2, int r3) {
            r0 = this;
            r0.f2749 = r3
            r0.f2747 = r1
            r0.f2748 = r2
            r0.<init>()
            return
    }

    @Override // xhss.InterfaceC0966
    public final java.util.Iterator iterator() {
            r1 = this;
            int r0 = r1.f2749
            switch(r0) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            xhss.ᛵᛴᛱᲈ r0 = new xhss.ᛵᛴᛱᲈ
            r0.<init>(r1)
            return r0
        Lb:
            xhss.ᲀᲀᲇᛵ r0 = new xhss.ᲀᲀᲇᛵ
            r0.<init>(r1)
            return r0
    }
}
