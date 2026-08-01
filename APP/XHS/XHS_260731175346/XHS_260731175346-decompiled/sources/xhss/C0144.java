package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛳᛴᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0144 implements java.io.Serializable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f616;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public java.lang.Object f617;

    public /* synthetic */ C0144() {
            r1 = this;
            r0 = 0
            r1.f616 = r0
            r1.<init>()
            return
    }

    public C0144(java.lang.String r2) {
            r1 = this;
            r0 = 1
            r1.f616 = r0
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            r1.<init>()
            r1.f617 = r2
            return
    }

    public final java.lang.String toString() {
            r1 = this;
            int r0 = r1.f616
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f617
            java.util.regex.Pattern r1 = (java.util.regex.Pattern) r1
            java.lang.String r1 = r1.toString()
            return r1
        Le:
            java.lang.Object r1 = r1.f617
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public xhss.C0623 m375(java.lang.String r2, int r3) {
            r1 = this;
            java.lang.Object r1 = r1.f617
            java.util.regex.Pattern r1 = (java.util.regex.Pattern) r1
            java.util.regex.Matcher r1 = r1.matcher(r2)
            r0 = 0
            java.util.regex.Matcher r1 = r1.useAnchoringBounds(r0)
            r0 = 1
            java.util.regex.Matcher r1 = r1.useTransparentBounds(r0)
            int r2 = r2.length()
            java.util.regex.Matcher r1 = r1.region(r3, r2)
            boolean r2 = r1.lookingAt()
            if (r2 == 0) goto L26
            xhss.ᛷᛱᛳᲁ r2 = new xhss.ᛷᛱᛳᲁ
            r2.<init>(r1)
            return r2
        L26:
            r1 = 0
            return r1
    }
}
