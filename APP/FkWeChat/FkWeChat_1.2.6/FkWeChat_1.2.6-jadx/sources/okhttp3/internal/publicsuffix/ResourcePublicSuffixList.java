package okhttp3.internal.publicsuffix;

import kotlin.Metadata;
import okio.AbstractC5795a;
import okio.C5799e;
import p024b9.AbstractC1043k;
import p376zd.InterfaceC10024w0;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m16758d2 = {"Lokhttp3/internal/publicsuffix/ResourcePublicSuffixList;", "Lokhttp3/internal/publicsuffix/BasePublicSuffixList;", "Lokio/e;", "path", "Lokio/a;", "fileSystem", "<init>", "(Lokio/e;Lokio/a;)V", "Lzd/w0;", "listSource", "()Lzd/w0;", "Lokio/e;", "getPath", "()Lokio/e;", "Lokio/a;", "getFileSystem", "()Lokio/a;", "Companion", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class ResourcePublicSuffixList extends BasePublicSuffixList {
    public static final C5799e PUBLIC_SUFFIX_RESOURCE = C5799e.a.m23310e(C5799e.f18171r, "okhttp3/internal/publicsuffix/" + PublicSuffixDatabase.class.getSimpleName() + ".list", false, 1, null);
    private final AbstractC5795a fileSystem;
    private final C5799e path;

    public /* synthetic */ ResourcePublicSuffixList(C5799e c5799e, AbstractC5795a abstractC5795a, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? PUBLIC_SUFFIX_RESOURCE : c5799e, (i10 & 2) != 0 ? AbstractC5795a.RESOURCES : abstractC5795a);
    }

    public final AbstractC5795a getFileSystem() {
        return this.fileSystem;
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public InterfaceC10024w0 listSource() {
        return this.fileSystem.source(getPath());
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public C5799e getPath() {
        return this.path;
    }

    public ResourcePublicSuffixList(C5799e c5799e, AbstractC5795a abstractC5795a) {
        c5799e.getClass();
        abstractC5795a.getClass();
        this.path = c5799e;
        this.fileSystem = abstractC5795a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResourcePublicSuffixList() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
