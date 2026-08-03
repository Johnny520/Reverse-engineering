package okio.internal;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ResourceFileSystem$toJarRoot$zip$1 extends gg.m implements fg.l {
    public static final okio.internal.ResourceFileSystem$toJarRoot$zip$1 INSTANCE = null;

    static {
            okio.internal.ResourceFileSystem$toJarRoot$zip$1 r0 = new okio.internal.ResourceFileSystem$toJarRoot$zip$1
            r0.<init>()
            okio.internal.ResourceFileSystem$toJarRoot$zip$1.INSTANCE = r0
            return
    }

    public ResourceFileSystem$toJarRoot$zip$1() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    public final java.lang.Boolean invoke(okio.internal.ZipEntry r2) {
            r1 = this;
            r2.getClass()
            okio.internal.ResourceFileSystem$Companion r0 = okio.internal.ResourceFileSystem.access$getCompanion$p()
            okio.Path r2 = r2.getCanonicalPath()
            boolean r2 = okio.internal.ResourceFileSystem.Companion.access$keepPath(r0, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }

    @Override // fg.l
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
            r0 = this;
            okio.internal.ZipEntry r1 = (okio.internal.ZipEntry) r1
            java.lang.Boolean r1 = r0.invoke(r1)
            return r1
    }
}
