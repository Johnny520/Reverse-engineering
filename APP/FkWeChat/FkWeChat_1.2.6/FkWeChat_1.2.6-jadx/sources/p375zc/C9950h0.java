package p375zc;

import ad.AbstractC0256f1;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1400a;
import p185m8.AbstractC5081g0;
import p300uc.InterfaceC8647b;
import p300uc.InterfaceC8660n;

/* JADX INFO: renamed from: zc.h0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8660n(with = C9954j0.class)
@Metadata(m16757d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u0005\b\u0007\u0018\u0000 )2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002:\u0001*B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0001H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0013\u001a\u00020\u0003H\u0096\u0003¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010\"8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$R&\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010&0\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010 ¨\u0006+"}, m16758d2 = {"Lzc/h0;", "Lzc/l;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "content", "<init>", "(Ljava/util/Map;)V", _UrlKt.FRAGMENT_ENCODE_SET, "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", "toString", "()Ljava/lang/String;", "isEmpty", "()Z", "key", "c", "(Ljava/lang/String;)Z", "value", "e", "(Lzc/l;)Z", "l", "(Ljava/lang/String;)Lzc/l;", "q", "Ljava/util/Map;", "size", _UrlKt.FRAGMENT_ENCODE_SET, "p", "()Ljava/util/Set;", "keys", _UrlKt.FRAGMENT_ENCODE_SET, "r", "()Ljava/util/Collection;", "values", _UrlKt.FRAGMENT_ENCODE_SET, "o", "entries", "Companion", "a", "kotlinx-serialization-json"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class C9950h0 extends AbstractC9957l implements Map<String, AbstractC9957l>, InterfaceC1400a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public final Map content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9950h0(Map map) {
        super(null);
        map.getClass();
        this.content = map;
    }

    /* JADX INFO: renamed from: a */
    public static CharSequence m38539a(Map.Entry entry) {
        entry.getClass();
        String str = (String) entry.getKey();
        AbstractC9957l abstractC9957l = (AbstractC9957l) entry.getValue();
        StringBuilder sb2 = new StringBuilder();
        AbstractC0256f1.m754c(sb2, str);
        sb2.append(':');
        sb2.append(abstractC9957l);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public boolean m38540c(String key) {
        key.getClass();
        return this.content.containsKey(key);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ AbstractC9957l compute(String str, BiFunction<? super String, ? super AbstractC9957l, ? extends AbstractC9957l> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ AbstractC9957l computeIfAbsent(String str, Function<? super String, ? extends AbstractC9957l> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ AbstractC9957l computeIfPresent(String str, BiFunction<? super String, ? super AbstractC9957l, ? extends AbstractC9957l> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return m38540c((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof AbstractC9957l) {
            return m38541e((AbstractC9957l) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public boolean m38541e(AbstractC9957l value) {
        value.getClass();
        return this.content.containsValue(value);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, AbstractC9957l>> entrySet() {
        return m38543o();
    }

    @Override // java.util.Map
    public boolean equals(Object other) {
        return AbstractC1061t.m3842c(this.content, other);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC9957l get(Object obj) {
        if (obj instanceof String) {
            return m38542l((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.content.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.content.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return m38544p();
    }

    /* JADX INFO: renamed from: l */
    public AbstractC9957l m38542l(String key) {
        key.getClass();
        return (AbstractC9957l) this.content.get(key);
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ AbstractC9957l merge(String str, AbstractC9957l abstractC9957l, BiFunction<? super AbstractC9957l, ? super AbstractC9957l, ? extends AbstractC9957l> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: o */
    public Set m38543o() {
        return this.content.entrySet();
    }

    /* JADX INFO: renamed from: p */
    public Set m38544p() {
        return this.content.keySet();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ AbstractC9957l put(String str, AbstractC9957l abstractC9957l) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends AbstractC9957l> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ AbstractC9957l putIfAbsent(String str, AbstractC9957l abstractC9957l) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: q */
    public int m38545q() {
        return this.content.size();
    }

    /* JADX INFO: renamed from: r */
    public Collection m38546r() {
        return this.content.values();
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ AbstractC9957l replace(String str, AbstractC9957l abstractC9957l) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super AbstractC9957l, ? extends AbstractC9957l> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public AbstractC9957l remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m38545q();
    }

    public String toString() {
        return AbstractC5081g0.m20585s0(this.content.entrySet(), ",", "{", "}", 0, null, new InterfaceC0184l() { // from class: zc.g0
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C9950h0.m38539a((Map.Entry) obj);
            }
        }, 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<AbstractC9957l> values() {
        return m38546r();
    }

    /* JADX INFO: renamed from: zc.h0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Companion {
        public Companion() {
        }

        public final InterfaceC8647b serializer() {
            return C9954j0.f33538a;
        }

        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(String str, AbstractC9957l abstractC9957l, AbstractC9957l abstractC9957l2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
