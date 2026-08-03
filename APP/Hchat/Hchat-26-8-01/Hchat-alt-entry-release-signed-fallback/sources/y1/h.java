package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements y1.y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1.i f21918a;

    public h(y1.i r1) {
            r0 = this;
            r0.<init>()
            r0.f21918a = r1
            return
    }

    public final void a(y1.x0 r3) {
            r2 = this;
            y1.i r0 = r2.f21918a
            if (r3 != 0) goto L20
            int r3 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r3 < r1) goto L12
            android.content.ClipboardManager r3 = r0.a()
            h3.c.e(r3)
            return
        L12:
            android.content.ClipboardManager r3 = r0.a()
            java.lang.String r0 = ""
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r0, r0)
            r3.setPrimaryClip(r0)
            return
        L20:
            android.content.ClipboardManager r0 = r0.a()
            android.content.ClipData r3 = r3.f22151a
            r0.setPrimaryClip(r3)
            return
    }
}
