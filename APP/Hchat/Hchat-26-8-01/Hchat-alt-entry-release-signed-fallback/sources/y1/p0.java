package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f22047a;

    public p0(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.f22047a = r1
            return
    }

    public final void a(java.lang.String r5) {
            r4 = this;
            android.content.Context r0 = r4.f22047a     // Catch: android.content.ActivityNotFoundException -> L11
            android.content.Intent r1 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> L11
            java.lang.String r2 = "android.intent.action.VIEW"
            android.net.Uri r3 = android.net.Uri.parse(r5)     // Catch: android.content.ActivityNotFoundException -> L11
            r1.<init>(r2, r3)     // Catch: android.content.ActivityNotFoundException -> L11
            r0.startActivity(r1)     // Catch: android.content.ActivityNotFoundException -> L11
            return
        L11:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Can't open "
            r2.<init>(r3)
            r2.append(r5)
            r5 = 46
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
    }
}
