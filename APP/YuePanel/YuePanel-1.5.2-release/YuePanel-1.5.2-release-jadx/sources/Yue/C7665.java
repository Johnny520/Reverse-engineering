package Yue;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥۣۢ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SubSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
public final class C7665<T> implements InterfaceC7326<T>, InterfaceC4552<T> {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final InterfaceC7326<T> f3000;

    /* JADX INFO: renamed from: ۥ۟ */
    public final int f3001;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int f23062;

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠ۦ$ۥ */
    public static final class C1318 implements Iterator<T>, InterfaceC5591 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final Iterator<T> f23063;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f23064;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ C7665<T> f23065;

        public C1318(C7665<T> c7665) {
            this.f23065 = c7665;
            this.f23063 = c7665.f3000.iterator();
        }

        /* JADX INFO: renamed from: ۥ */
        private final void m3772() {
            while (this.f23064 < this.f23065.f3001 && this.f23063.hasNext()) {
                this.f23063.next();
                this.f23064++;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m3772();
            return this.f23064 < this.f23065.f23062 && this.f23063.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            m3772();
            if (this.f23064 >= this.f23065.f23062) {
                throw new NoSuchElementException();
            }
            this.f23064++;
            return this.f23063.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public final Iterator<T> m3773() {
            return this.f23063;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m24402() {
            return this.f23064;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m24403(int i) {
            this.f23064 = i;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7665(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, int i, int i2) {
        C5499.m17103(interfaceC7326, "sequence");
        this.f3000 = interfaceC7326;
        this.f3001 = i;
        this.f23062 = i2;
        if (i < 0) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i2).toString());
        }
        if (i2 >= i) {
            return;
        }
        throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i2 + " < " + i).toString());
    }

    @Override // Yue.InterfaceC7326
    @InterfaceC6399
    public Iterator<T> iterator() {
        return new C1318(this);
    }

    @Override // Yue.InterfaceC4552
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public InterfaceC7326<T> mo1493(int i) {
        if (i >= m24401()) {
            return this;
        }
        InterfaceC7326<T> interfaceC7326 = this.f3000;
        int i2 = this.f3001;
        return new C7665(interfaceC7326, i2, i + i2);
    }

    @Override // Yue.InterfaceC4552
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public InterfaceC7326<T> mo1494(int i) {
        return i >= m24401() ? C7332.m22871() : new C7665(this.f3000, this.f3001 + i, this.f23062);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int m24401() {
        return this.f23062 - this.f3001;
    }
}
