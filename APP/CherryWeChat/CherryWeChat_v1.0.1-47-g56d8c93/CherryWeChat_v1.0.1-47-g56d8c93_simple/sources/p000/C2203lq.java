package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: lq */
/* JADX INFO: loaded from: classes.dex */
public final class C2203lq extends AbstractC2289nq implements Iterator, InterfaceC0545Mm {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f7658e;

    public C2203lq(C2332oq r1, int r2) {
        this.f7658e = r2;
        this.f8037d = r1;
        this.f8035b = -1;
        this.f8036c = r1.f8188h;
        m4626e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch(this.f7658e) {
            case 0: goto L16;
            case 1: goto L10;
            default: goto L4;
        };
    L4:
        m4625b();
        int r0 = this.f8034a;
        C2332oq r1 = (C2332oq) this.f8037d;
        if (r0 >= r1.f8186f) goto L9;
        this.f8034a = r0 + 1;
        this.f8035b = r0;
        Object r02 = r1.f8182b[r0];
        m4626e();
        return r02;
    L9:
        throw new NoSuchElementException();
    L10:
        m4625b();
        int r03 = this.f8034a;
        C2332oq r12 = (C2332oq) this.f8037d;
        if (r03 >= r12.f8186f) goto L15;
        this.f8034a = r03 + 1;
        this.f8035b = r03;
        Object r04 = r12.f8181a[r03];
        m4626e();
        return r04;
    L15:
        throw new NoSuchElementException();
    L16:
        m4625b();
        int r05 = this.f8034a;
        C2332oq r13 = (C2332oq) this.f8037d;
        if (r05 >= r13.f8186f) goto L21;
        this.f8034a = r05 + 1;
        this.f8035b = r05;
        C2246mq r2 = new C2246mq(r13, r05);
        m4626e();
        return r2;
    L21:
        throw new NoSuchElementException();
    }
}
