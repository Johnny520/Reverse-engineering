package defpackage;

/* JADX INFO: renamed from: ᲈᛳᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2217 extends java.lang.ThreadLocal {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f9464;

    public /* synthetic */ C2217(int r1) {
            r0 = this;
            r0.f9464 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.ThreadLocal
    public final java.lang.Object initialValue() {
            r2 = this;
            int r2 = r2.f9464
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
            java.util.TimeZone r0 = defpackage.AbstractC0508.f2501
            r2.setTimeZone(r0)
            return r2
    }
}
