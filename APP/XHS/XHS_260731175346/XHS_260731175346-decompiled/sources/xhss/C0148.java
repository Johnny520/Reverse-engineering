package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛳᲇᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0148 extends android.text.Editable.Factory {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static volatile xhss.C0148 f626;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static java.lang.Class f627;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final java.lang.Object f628 = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            xhss.C0148.f628 = r0
            return
    }

    @Override // android.text.Editable.Factory
    public final android.text.Editable newEditable(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.Class r0 = xhss.C0148.f627
            if (r0 == 0) goto La
            xhss.ᛳᛸᛷᛸ r1 = new xhss.ᛳᛸᛷᛸ
            r1.<init>(r0, r2)
            return r1
        La:
            android.text.Editable r1 = super.newEditable(r2)
            return r1
    }
}
