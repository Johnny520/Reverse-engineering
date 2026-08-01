package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛷᲇᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0879 extends java.lang.ThreadLocal {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2837;

    public /* synthetic */ C0879(int r1) {
            r0 = this;
            r0.f2837 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.ThreadLocal
    public final java.lang.Object initialValue() {
            r2 = this;
            int r2 = r2.f2837
            switch(r2) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            java.util.Random r2 = new java.util.Random
            r2.<init>()
            return r2
        Lb:
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r0 = "EEE, dd MMM yyyy HH:mm:ss 'GMT'"
            java.util.Locale r1 = java.util.Locale.US
            r2.<init>(r0, r1)
            r0 = 0
            r2.setLenient(r0)
            java.util.TimeZone r0 = xhss.AbstractC0559.f1984
            r2.setTimeZone(r0)
            return r2
    }
}
