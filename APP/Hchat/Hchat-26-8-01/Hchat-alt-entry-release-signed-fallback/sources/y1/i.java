package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements y1.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f21963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.content.ClipboardManager f21964b;

    public i(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.f21963a = r1
            return
    }

    public final android.content.ClipboardManager a() {
            r2 = this;
            android.content.ClipboardManager r0 = r2.f21964b
            if (r0 != 0) goto L13
            android.content.Context r0 = r2.f21963a
            java.lang.String r1 = "clipboard"
            java.lang.Object r0 = r0.getSystemService(r1)
            r0.getClass()
            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0
            r2.f21964b = r0
        L13:
            return r0
    }
}
