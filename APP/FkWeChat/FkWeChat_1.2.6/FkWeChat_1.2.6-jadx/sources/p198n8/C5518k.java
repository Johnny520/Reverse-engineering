package p198n8;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p024b9.AbstractC1043k;
import p036c9.InterfaceC1405f;
import p185m8.AbstractC5090l;

/* JADX INFO: renamed from: n8.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5518k extends AbstractC5090l implements Set, Serializable, InterfaceC1405f {

    /* JADX INFO: renamed from: r */
    public static final a f17243r = new a(null);

    /* JADX INFO: renamed from: s */
    public static final C5518k f17244s = new C5518k(C5511d.f17213D.m22473e());

    /* JADX INFO: renamed from: q */
    public final C5511d f17245q;

    public C5518k(C5511d c5511d) {
        c5511d.getClass();
        this.f17245q = c5511d;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f17245q.m22446I()) {
            return new C5515h(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // p185m8.AbstractC5090l
    /* JADX INFO: renamed from: a */
    public int mo500a() {
        return this.f17245q.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        return this.f17245q.m22459o(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        collection.getClass();
        this.f17245q.m22462r();
        return super.addAll(collection);
    }

    /* JADX INFO: renamed from: c */
    public final Set m22487c() {
        this.f17245q.m22461q();
        return size() > 0 ? this : f17244s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f17245q.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f17245q.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f17245q.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f17245q.m22447J();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f17245q.m22455S(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        collection.getClass();
        this.f17245q.m22462r();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        this.f17245q.m22462r();
        return super.retainAll(collection);
    }

    /* JADX INFO: renamed from: n8.k$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    public C5518k() {
        this(new C5511d());
    }

    public C5518k(int i10) {
        this(new C5511d(i10));
    }
}
