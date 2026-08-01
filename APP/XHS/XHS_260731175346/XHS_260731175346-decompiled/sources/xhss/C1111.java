package xhss;

/* JADX INFO: renamed from: xhss.ᲈᛱᛱᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1111 implements xhss.InterfaceC0966 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.Object f3583;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f3584;

    public /* synthetic */ C1111(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f3584 = r1
            r0.f3583 = r2
            r0.<init>()
            return
    }

    @Override // xhss.InterfaceC0966
    public final java.util.Iterator iterator() {
            r2 = this;
            int r0 = r2.f3584
            java.lang.Object r1 = r2.f3583
            switch(r0) {
                case 0: goto L1e;
                case 1: goto L18;
                case 2: goto La;
                default: goto L7;
            }
        L7:
            java.util.Iterator r1 = (java.util.Iterator) r1
            return r1
        La:
            xhss.ᛸᛸᲁᲁ r1 = (xhss.C0794) r1
            xhss.ᛸᛴᲇᲁ r2 = new xhss.ᛸᛴᲇᲁ
            r2.<init>()
            xhss.ᛱᛴᛶᛴ r0 = r1.mo117(r2, r2)
            r2.f2541 = r0
            return r2
        L18:
            xhss.ᲈᛷᛸ r0 = new xhss.ᲈᛷᛸ
            r0.<init>(r2)
            return r0
        L1e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r2 = r1.iterator()
            return r2
    }
}
