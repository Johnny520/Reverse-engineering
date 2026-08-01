package p135j2;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import p024b9.AbstractC1041j;
import p024b9.AbstractC1043k;
import p036c9.InterfaceC1400a;
import p117i.AbstractC3098z0;
import p117i.C3078p0;

/* JADX INFO: renamed from: j2.d2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3514d2 {
    /* JADX INFO: renamed from: a */
    void mo1105a(a aVar);

    /* JADX INFO: renamed from: b */
    boolean mo1106b(Object obj, Object obj2);

    /* JADX INFO: renamed from: j2.d2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Collection, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public final C3078p0 f9742q;

        public /* synthetic */ a(C3078p0 c3078p0, int i10, AbstractC1043k abstractC1043k) {
            this((i10 & 1) != 0 ? AbstractC3098z0.m11619a() : c3078p0);
        }

        @Override // java.util.Collection
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean add(Object obj) {
            return this.f9742q.m11484g(obj);
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: c */
        public final C3078p0 m13090c() {
            return this.f9742q;
        }

        @Override // java.util.Collection
        public final void clear() {
            this.f9742q.m11488k();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return this.f9742q.m11612a(obj);
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!this.f9742q.m11612a(it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: e */
        public int m13091e() {
            return this.f9742q.m11614c();
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.f9742q.m11615d();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return this.f9742q.m11487j().iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.f9742q.m11501x(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection collection) {
            return this.f9742q.m11501x(collection);
        }

        @Override // java.util.Collection
        public boolean removeIf(Predicate predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection collection) {
            return this.f9742q.m11483B(collection);
        }

        @Override // java.util.Collection
        public final /* bridge */ int size() {
            return m13091e();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractC1041j.m3803a(this);
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC1041j.m3804b(this, objArr);
        }

        public a(C3078p0 c3078p0) {
            this.f9742q = c3078p0;
        }
    }
}
