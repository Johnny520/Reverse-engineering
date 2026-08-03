package Yue;

import java.util.Iterator;
import java.util.NoSuchElementException;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/TakeSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
public final class C7720<T> implements InterfaceC7326<T>, InterfaceC4552<T> {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final InterfaceC7326<T> f3041;

    /* JADX INFO: renamed from: ۥ۟ */
    public final int f3042;

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۨۢ$ۥ */
    public static final class C1334 implements Iterator<T>, InterfaceC5591 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f23242;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @InterfaceC6399
        public final Iterator<T> f23243;

        public C1334(C7720<T> c7720) {
            this.f23242 = c7720.f3042;
            this.f23243 = c7720.f3041.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23242 > 0 && this.f23243.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            int i = this.f23242;
            if (i == 0) {
                throw new NoSuchElementException();
            }
            this.f23242 = i - 1;
            return this.f23243.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final Iterator<T> m3815() {
            return this.f23243;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final int m3816() {
            return this.f23242;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m24563(int i) {
            this.f23242 = i;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7720(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, int i) {
        C5499.m17103(interfaceC7326, "sequence");
        this.f3041 = interfaceC7326;
        this.f3042 = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH).toString());
    }

    @Override // Yue.InterfaceC7326
    @InterfaceC6399
    public Iterator<T> iterator() {
        return new C1334(this);
    }

    @Override // Yue.InterfaceC4552
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public InterfaceC7326<T> mo1493(int i) {
        return i >= this.f3042 ? this : new C7720(this.f3041, i);
    }

    @Override // Yue.InterfaceC4552
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public InterfaceC7326<T> mo1494(int i) {
        int i2 = this.f3042;
        return i >= i2 ? C7332.m22871() : new C7665(this.f3041, i, i2);
    }
}
