package Yue;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥۣۡۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7381<E> extends AbstractC2998<E> implements Set<E>, Serializable, InterfaceC5602 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1248 f22281 = new C1248(null);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C7381 f22282 = new C7381(C5926.f14851.m18539());

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final C5926<E, ?> f22283;

    /* JADX INFO: renamed from: Yue.ۥۣۡۨۦ$ۥ */
    public static final class C1248 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣۡۨۦ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1248(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1248() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7381(@InterfaceC6399 C5926<E, ?> c5926) {
        C5499.m17103(c5926, "backing");
        this.f22283 = c5926;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    private final Object m23115() throws NotSerializableException {
        if (this.f22283.m18524()) {
            return new C7371(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // Yue.AbstractC2998, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        return this.f22283.m18506(e) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@InterfaceC6399 Collection<? extends E> collection) {
        C5499.m17103(collection, "elements");
        this.f22283.m18509();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f22283.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f22283.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f22283.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @InterfaceC6399
    public Iterator<E> iterator() {
        return this.f22283.m18525();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f22283.m18532(obj) >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@InterfaceC6399 Collection<? extends Object> collection) {
        C5499.m17103(collection, "elements");
        this.f22283.m18509();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@InterfaceC6399 Collection<? extends Object> collection) {
        C5499.m17103(collection, "elements");
        this.f22283.m18509();
        return super.retainAll(collection);
    }

    @Override // Yue.AbstractC2998
    /* JADX INFO: renamed from: ۥ */
    public int mo66() {
        return this.f22283.size();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public final Set<E> m3590() {
        this.f22283.m18508();
        return size() > 0 ? this : f22282;
    }

    public C7381() {
        this(new C5926());
    }

    public C7381(int i) {
        this(new C5926(i));
    }
}
