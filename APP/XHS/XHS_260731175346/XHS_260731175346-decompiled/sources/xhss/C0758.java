package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛴᲀᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0758 extends xhss.C1179 {

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final java.util.HashMap f2535;

    public C0758() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f2535 = r0
            return
    }

    @Override // xhss.C1179
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.Object mo1300(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = super.mo1300(r2)
            java.util.HashMap r1 = r1.f2535
            r1.remove(r2)
            return r0
    }

    @Override // xhss.C1179
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0359 mo1301(java.lang.Object r1) {
            r0 = this;
            java.util.HashMap r0 = r0.f2535
            java.lang.Object r0 = r0.get(r1)
            xhss.ᛴᛴᲁᲈ r0 = (xhss.C0359) r0
            return r0
    }
}
