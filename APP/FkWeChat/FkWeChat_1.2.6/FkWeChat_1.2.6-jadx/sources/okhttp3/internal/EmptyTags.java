package okhttp3.internal;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p098g9.InterfaceC2549c;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\t\u001a\u00020\u0001\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m16758d2 = {"Lokhttp3/internal/EmptyTags;", "Lokhttp3/internal/Tags;", "<init>", "()V", _UrlKt.FRAGMENT_ENCODE_SET, "T", "Lg9/c;", "key", "value", "plus", "(Lg9/c;Ljava/lang/Object;)Lokhttp3/internal/Tags;", "get", "(Lg9/c;)Ljava/lang/Object;", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class EmptyTags extends Tags {
    public static final EmptyTags INSTANCE = new EmptyTags();

    private EmptyTags() {
        super(null);
    }

    @Override // okhttp3.internal.Tags
    public <T> T get(InterfaceC2549c key) {
        key.getClass();
        return null;
    }

    @Override // okhttp3.internal.Tags
    public <T> Tags plus(InterfaceC2549c key, T value) {
        key.getClass();
        return value != null ? new LinkedTags(key, value, this) : this;
    }

    public String toString() {
        return "{}";
    }
}
