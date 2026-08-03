package okio;

/* JADX INFO: renamed from: okio.-DeprecatedUtf8, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
@sf.a
public final class DeprecatedUtf8 {
    public static final okio.DeprecatedUtf8 INSTANCE = null;

    static {
            okio.-DeprecatedUtf8 r0 = new okio.-DeprecatedUtf8
            r0.<init>()
            okio.DeprecatedUtf8.INSTANCE = r0
            return
    }

    private DeprecatedUtf8() {
            r0 = this;
            r0.<init>()
            return
    }

    @sf.a
    public final long size(java.lang.String r4) {
            r3 = this;
            r4.getClass()
            r0 = 3
            r1 = 0
            r2 = 0
            long r0 = okio.Utf8.size$default(r4, r2, r2, r0, r1)
            return r0
    }

    @sf.a
    public final long size(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r1.getClass()
            long r1 = okio.Utf8.size(r1, r2, r3)
            return r1
    }
}
