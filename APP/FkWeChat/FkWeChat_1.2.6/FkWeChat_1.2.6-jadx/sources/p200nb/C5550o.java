package p200nb;

import bsh.C1189h4;
import java.util.Iterator;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: nb.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5550o extends AbstractC5538c {

    /* JADX INFO: renamed from: q */
    public final Object f17340q;

    /* JADX INFO: renamed from: r */
    public final int f17341r;

    /* JADX INFO: renamed from: nb.o$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Iterator, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public boolean f17342q = true;

        public a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f17342q;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f17342q) {
                this.f17342q = false;
                return C5550o.this.m22584l();
            }
            C1189h4.m4429a();
            return null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5550o(Object obj, int i10) {
        super(null);
        obj.getClass();
        this.f17340q = obj;
        this.f17341r = i10;
    }

    @Override // p200nb.AbstractC5538c
    /* JADX INFO: renamed from: a */
    public int mo22566a() {
        return 1;
    }

    @Override // p200nb.AbstractC5538c
    /* JADX INFO: renamed from: c */
    public void mo22567c(int i10, Object obj) {
        obj.getClass();
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: e */
    public final int m22583e() {
        return this.f17341r;
    }

    @Override // p200nb.AbstractC5538c
    public Object get(int i10) {
        if (i10 == this.f17341r) {
            return this.f17340q;
        }
        return null;
    }

    @Override // p200nb.AbstractC5538c, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    /* JADX INFO: renamed from: l */
    public final Object m22584l() {
        return this.f17340q;
    }
}
