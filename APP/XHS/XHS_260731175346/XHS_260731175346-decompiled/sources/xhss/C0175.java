package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛶᛵᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0175 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final android.content.res.Configuration f696;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final int f697;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final android.content.res.ColorStateList f698;

    public C0175(android.content.res.ColorStateList r1, android.content.res.Configuration r2, android.content.res.Resources.Theme r3) {
            r0 = this;
            r0.<init>()
            r0.f698 = r1
            r0.f696 = r2
            if (r3 != 0) goto Lb
            r1 = 0
            goto Lf
        Lb:
            int r1 = r3.hashCode()
        Lf:
            r0.f697 = r1
            return
    }
}
