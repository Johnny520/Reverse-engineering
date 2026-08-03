package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: lq */
/* JADX INFO: loaded from: classes.dex */
public final class C2203lq extends AbstractC2289nq implements Iterator, InterfaceC0545Mm {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f7658e;

    public C2203lq(C2332oq c2332oq, int i) {
        this.f7658e = i;
        this.f8037d = c2332oq;
        this.f8035b = -1;
        this.f8036c = c2332oq.f8188h;
        m4626e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f7658e) {
            case 0:
                m4625b();
                int i = this.f8034a;
                C2332oq c2332oq = (C2332oq) this.f8037d;
                if (i >= c2332oq.f8186f) {
                    throw new NoSuchElementException();
                }
                this.f8034a = i + 1;
                this.f8035b = i;
                C2246mq c2246mq = new C2246mq(c2332oq, i);
                m4626e();
                return c2246mq;
            case 1:
                m4625b();
                int i2 = this.f8034a;
                C2332oq c2332oq2 = (C2332oq) this.f8037d;
                if (i2 >= c2332oq2.f8186f) {
                    throw new NoSuchElementException();
                }
                this.f8034a = i2 + 1;
                this.f8035b = i2;
                Object obj = c2332oq2.f8181a[i2];
                m4626e();
                return obj;
            default:
                m4625b();
                int i3 = this.f8034a;
                C2332oq c2332oq3 = (C2332oq) this.f8037d;
                if (i3 >= c2332oq3.f8186f) {
                    throw new NoSuchElementException();
                }
                this.f8034a = i3 + 1;
                this.f8035b = i3;
                Object obj2 = c2332oq3.f8182b[i3];
                m4626e();
                return obj2;
        }
    }
}
