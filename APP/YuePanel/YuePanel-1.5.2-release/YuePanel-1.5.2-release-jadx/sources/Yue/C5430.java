package Yue;

import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5430<T> implements Iterator<C5428<? extends T>>, InterfaceC5591 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final Iterator<T> f13333;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f13334;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Iterator<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C5430(@InterfaceC6399 Iterator<? extends T> it) {
        C5499.m17103(it, "iterator");
        this.f13333 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13333.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
    @Override // java.util.Iterator
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
    public final C5428<T> next() {
        int i = this.f13334;
        this.f13334 = i + 1;
        if (i < 0) {
            C3880.m10753();
        }
        return new C5428<>(i, this.f13333.next());
    }
}
