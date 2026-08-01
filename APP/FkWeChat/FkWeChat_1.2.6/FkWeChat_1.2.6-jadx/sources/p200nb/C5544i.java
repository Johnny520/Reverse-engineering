package p200nb;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: nb.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5544i extends AbstractC5538c {

    /* JADX INFO: renamed from: q */
    public static final C5544i f17331q = new C5544i();

    /* JADX INFO: renamed from: nb.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Iterator, InterfaceC1400a {
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Void next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C5544i() {
        super(null);
    }

    @Override // p200nb.AbstractC5538c
    /* JADX INFO: renamed from: a */
    public int mo22566a() {
        return 0;
    }

    @Override // p200nb.AbstractC5538c
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Void get(int i10) {
        return null;
    }

    @Override // p200nb.AbstractC5538c, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    @Override // p200nb.AbstractC5538c
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22567c(int i10, Void r22) {
        r22.getClass();
        throw new IllegalStateException();
    }
}
