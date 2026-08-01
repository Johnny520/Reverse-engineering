package p329wc;

import java.util.Iterator;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: wc.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9221i {

    /* JADX INFO: renamed from: wc.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Iterator, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public int f31478q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC9218f f31479r;

        public a(InterfaceC9218f interfaceC9218f) {
            this.f31479r = interfaceC9218f;
            this.f31478q = interfaceC9218f.mo35891e();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public InterfaceC9218f next() {
            InterfaceC9218f interfaceC9218f = this.f31479r;
            int iMo35891e = interfaceC9218f.mo35891e();
            int i10 = this.f31478q;
            this.f31478q = i10 - 1;
            return interfaceC9218f.mo35894h(iMo35891e - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31478q > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: wc.i$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements Iterator, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public int f31480q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC9218f f31481r;

        public b(InterfaceC9218f interfaceC9218f) {
            this.f31481r = interfaceC9218f;
            this.f31480q = interfaceC9218f.mo35891e();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public String next() {
            InterfaceC9218f interfaceC9218f = this.f31481r;
            int iMo35891e = interfaceC9218f.mo35891e();
            int i10 = this.f31480q;
            this.f31480q = i10 - 1;
            return interfaceC9218f.mo35892f(iMo35891e - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31480q > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: wc.i$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements Iterable, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ InterfaceC9218f f31482q;

        public c(InterfaceC9218f interfaceC9218f) {
            this.f31482q = interfaceC9218f;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new a(this.f31482q);
        }
    }

    /* JADX INFO: renamed from: wc.i$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d implements Iterable, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ InterfaceC9218f f31483q;

        public d(InterfaceC9218f interfaceC9218f) {
            this.f31483q = interfaceC9218f;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new b(this.f31483q);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Iterable m35901a(InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
        return new c(interfaceC9218f);
    }

    /* JADX INFO: renamed from: b */
    public static final Iterable m35902b(InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
        return new d(interfaceC9218f);
    }
}
