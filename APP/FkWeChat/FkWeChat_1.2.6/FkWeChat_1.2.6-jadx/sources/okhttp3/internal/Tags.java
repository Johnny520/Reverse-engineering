package okhttp3.internal;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p098g9.InterfaceC2549c;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\b\u001a\u00020\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\b\u0010\tJ*\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦\u0002¢\u0006\u0004\b\n\u0010\u000b\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m16758d2 = {"Lokhttp3/internal/Tags;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "T", "Lg9/c;", "key", "value", "plus", "(Lg9/c;Ljava/lang/Object;)Lokhttp3/internal/Tags;", "get", "(Lg9/c;)Ljava/lang/Object;", "Lokhttp3/internal/EmptyTags;", "Lokhttp3/internal/LinkedTags;", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public abstract class Tags {
    public /* synthetic */ Tags(AbstractC1043k abstractC1043k) {
        this();
    }

    public abstract <T> T get(InterfaceC2549c key);

    public abstract <T> Tags plus(InterfaceC2549c key, T value);

    private Tags() {
    }
}
