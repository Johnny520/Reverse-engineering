package okio.internal;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ResourceFileSystem$roots$2 extends gg.m implements fg.a {
    final /* synthetic */ okio.internal.ResourceFileSystem this$0;

    public ResourceFileSystem$roots$2(okio.internal.ResourceFileSystem r1) {
            r0 = this;
            r0.this$0 = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // fg.a
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            r1 = this;
            java.util.List r0 = r1.invoke()
            return r0
    }

    @Override // fg.a
    public final java.util.List<sf.e> invoke() {
            r2 = this;
            okio.internal.ResourceFileSystem r0 = r2.this$0
            java.lang.ClassLoader r1 = okio.internal.ResourceFileSystem.access$getClassLoader$p(r0)
            java.util.List r0 = okio.internal.ResourceFileSystem.access$toClasspathRoots(r0, r1)
            return r0
    }
}
