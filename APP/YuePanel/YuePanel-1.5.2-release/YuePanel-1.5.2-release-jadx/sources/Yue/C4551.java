package Yue;

import java.util.Iterator;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/DropSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
public final class C4551<T> implements InterfaceC7326<T>, InterfaceC4552<T> {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final InterfaceC7326<T> f963;

    /* JADX INFO: renamed from: ۥ۟ */
    public final int f964;

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۢۡ$ۥ */
    public static final class C0437 implements Iterator<T>, InterfaceC5591 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final Iterator<T> f9797;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f9798;

        public C0437(C4551<T> c4551) {
            this.f9797 = c4551.f963.iterator();
            this.f9798 = c4551.f964;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m1495();
            return this.f9797.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            m1495();
            return this.f9797.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m1495() {
            while (this.f9798 > 0 && this.f9797.hasNext()) {
                this.f9797.next();
                this.f9798--;
            }
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public final Iterator<T> m1496() {
            return this.f9797;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m13381() {
            return this.f9798;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m13382(int i) {
            this.f9798 = i;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C4551(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, int i) {
        C5499.m17103(interfaceC7326, "sequence");
        this.f963 = interfaceC7326;
        this.f964 = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH).toString());
    }

    @Override // Yue.InterfaceC7326
    @InterfaceC6399
    public Iterator<T> iterator() {
        return new C0437(this);
    }

    @Override // Yue.InterfaceC4552
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public InterfaceC7326<T> mo1493(int i) {
        int i2 = this.f964;
        int i3 = i2 + i;
        return i3 < 0 ? new C7720(this, i) : new C7665(this.f963, i2, i3);
    }

    @Override // Yue.InterfaceC4552
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public InterfaceC7326<T> mo1494(int i) {
        int i2 = this.f964 + i;
        return i2 < 0 ? new C4551(this, i) : new C4551(this.f963, i2);
    }
}
