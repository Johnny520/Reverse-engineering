package okhttp3.internal;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p098g9.InterfaceC2549c;
import p185m8.AbstractC5081g0;
import p372z8.AbstractC9886a;
import sb.AbstractC7291q;
import sb.AbstractC7294t;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ1\u0010\u000b\u001a\u00020\u0003\"\b\b\u0001\u0010\n*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\n*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0006\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0015"}, m16758d2 = {"Lokhttp3/internal/LinkedTags;", _UrlKt.FRAGMENT_ENCODE_SET, "K", "Lokhttp3/internal/Tags;", "Lg9/c;", "key", "value", "next", "<init>", "(Lg9/c;Ljava/lang/Object;Lokhttp3/internal/Tags;)V", "T", "plus", "(Lg9/c;Ljava/lang/Object;)Lokhttp3/internal/Tags;", "get", "(Lg9/c;)Ljava/lang/Object;", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "Lg9/c;", "Ljava/lang/Object;", "Lokhttp3/internal/Tags;", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
final class LinkedTags<K> extends Tags {
    private final InterfaceC2549c key;
    private final Tags next;
    private final K value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedTags(InterfaceC2549c interfaceC2549c, K k10, Tags tags) {
        super(null);
        interfaceC2549c.getClass();
        k10.getClass();
        tags.getClass();
        this.key = interfaceC2549c;
        this.value = k10;
        this.next = tags;
    }

    /* JADX INFO: renamed from: a */
    public static LinkedTags m23256a(LinkedTags linkedTags) {
        linkedTags.getClass();
        Tags tags = linkedTags.next;
        if (tags instanceof LinkedTags) {
            return (LinkedTags) tags;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m23257b(LinkedTags linkedTags) {
        linkedTags.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(linkedTags.key);
        sb2.append('=');
        sb2.append(linkedTags.value);
        return sb2.toString();
    }

    @Override // okhttp3.internal.Tags
    public <T> T get(InterfaceC2549c key) {
        key.getClass();
        return AbstractC1061t.m3842c(key, this.key) ? (T) AbstractC9886a.m38367b(key).cast(this.value) : (T) this.next.get(key);
    }

    @Override // okhttp3.internal.Tags
    public <T> Tags plus(InterfaceC2549c key, T value) {
        key.getClass();
        boolean zM3842c = AbstractC1061t.m3842c(key, this.key);
        Tags linkedTags = this.next;
        if (!zM3842c) {
            Tags tagsPlus = linkedTags.plus(key, null);
            linkedTags = tagsPlus == this.next ? this : new LinkedTags(this.key, this.value, tagsPlus);
        }
        return value != null ? new LinkedTags(key, value, linkedTags) : linkedTags;
    }

    public String toString() {
        return AbstractC5081g0.m20585s0(AbstractC5081g0.m20535G0(AbstractC7294t.m28908P(AbstractC7291q.m28888p(this, new InterfaceC0184l() { // from class: okhttp3.internal.a
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return LinkedTags.m23256a((LinkedTags) obj);
            }
        }))), null, "{", "}", 0, null, new InterfaceC0184l() { // from class: okhttp3.internal.b
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return LinkedTags.m23257b((LinkedTags) obj);
            }
        }, 25, null);
    }
}
