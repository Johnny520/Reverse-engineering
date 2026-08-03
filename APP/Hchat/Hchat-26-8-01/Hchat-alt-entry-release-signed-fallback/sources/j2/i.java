package j2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final android.text.Layout.Alignment f6692a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final android.text.Layout.Alignment f6693b = null;

    static {
            android.text.Layout$Alignment[] r0 = android.text.Layout.Alignment.values()
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            int r2 = r0.length
            r3 = 0
            r4 = r3
            r3 = r1
        La:
            if (r4 >= r2) goto L2c
            r5 = r0[r4]
            java.lang.String r6 = r5.name()
            java.lang.String r7 = "ALIGN_LEFT"
            boolean r6 = gg.l.a(r6, r7)
            if (r6 == 0) goto L1c
            r1 = r5
            goto L29
        L1c:
            java.lang.String r6 = r5.name()
            java.lang.String r7 = "ALIGN_RIGHT"
            boolean r6 = gg.l.a(r6, r7)
            if (r6 == 0) goto L29
            r3 = r5
        L29:
            int r4 = r4 + 1
            goto La
        L2c:
            j2.i.f6692a = r1
            j2.i.f6693b = r3
            return
    }
}
