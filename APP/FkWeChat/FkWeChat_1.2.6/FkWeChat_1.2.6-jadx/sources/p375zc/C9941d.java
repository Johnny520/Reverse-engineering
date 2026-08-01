package p375zc;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1041j;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1400a;
import p185m8.AbstractC5081g0;
import p300uc.InterfaceC8647b;
import p300uc.InterfaceC8660n;

/* JADX INFO: renamed from: zc.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8660n(with = C9945f.class)
@Metadata(m16757d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010*\n\u0002\b\r\b\u0007\u0018\u0000 /2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001\u0014B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0001H\u0096\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0096\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u001b\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u0019H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u000bH\u0096\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0001H\u0096\u0001¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0001H\u0096\u0001¢\u0006\u0004\b\"\u0010!J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010#H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010#2\u0006\u0010\u001d\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b$\u0010&J&\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u0010\r¨\u00060"}, m16758d2 = {"Lzc/d;", "Lzc/l;", _UrlKt.FRAGMENT_ENCODE_SET, "content", "<init>", "(Ljava/util/List;)V", _UrlKt.FRAGMENT_ENCODE_SET, "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "isEmpty", "()Z", "element", "a", "(Lzc/l;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "iterator", "()Ljava/util/Iterator;", _UrlKt.FRAGMENT_ENCODE_SET, "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "c", "(I)Lzc/l;", "l", "(Lzc/l;)I", "o", _UrlKt.FRAGMENT_ENCODE_SET, "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "q", "Ljava/util/List;", "e", "size", "Companion", "kotlinx-serialization-json"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class C9941d extends AbstractC9957l implements List<AbstractC9957l>, InterfaceC1400a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public final List content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9941d(List list) {
        super(null);
        list.getClass();
        this.content = list;
    }

    /* JADX INFO: renamed from: a */
    public boolean m38517a(AbstractC9957l element) {
        element.getClass();
        return this.content.contains(element);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, AbstractC9957l abstractC9957l) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends AbstractC9957l> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC9957l get(int index) {
        return (AbstractC9957l) this.content.get(index);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof AbstractC9957l) {
            return m38517a((AbstractC9957l) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection elements) {
        elements.getClass();
        return this.content.containsAll(elements);
    }

    /* JADX INFO: renamed from: e */
    public int m38519e() {
        return this.content.size();
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object other) {
        return AbstractC1061t.m3842c(this.content, other);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.content.hashCode();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof AbstractC9957l) {
            return m38520l((AbstractC9957l) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.content.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.content.iterator();
    }

    /* JADX INFO: renamed from: l */
    public int m38520l(AbstractC9957l element) {
        element.getClass();
        return this.content.indexOf(element);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof AbstractC9957l) {
            return m38521o((AbstractC9957l) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<AbstractC9957l> listIterator() {
        return this.content.listIterator();
    }

    /* JADX INFO: renamed from: o */
    public int m38521o(AbstractC9957l element) {
        element.getClass();
        return this.content.lastIndexOf(element);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ AbstractC9957l remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<AbstractC9957l> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ AbstractC9957l set(int i10, AbstractC9957l abstractC9957l) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return m38519e();
    }

    @Override // java.util.List
    public void sort(Comparator<? super AbstractC9957l> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<AbstractC9957l> subList(int fromIndex, int toIndex) {
        return this.content.subList(fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return AbstractC1041j.m3804b(this, objArr);
    }

    public String toString() {
        return AbstractC5081g0.m20585s0(this.content, ",", "[", "]", 0, null, null, 56, null);
    }

    /* JADX INFO: renamed from: zc.d$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Companion {
        public Companion() {
        }

        public final InterfaceC8647b serializer() {
            return C9945f.f33494a;
        }

        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }
    }

    @Override // java.util.List
    public ListIterator<AbstractC9957l> listIterator(int index) {
        return this.content.listIterator(index);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC1041j.m3803a(this);
    }
}
