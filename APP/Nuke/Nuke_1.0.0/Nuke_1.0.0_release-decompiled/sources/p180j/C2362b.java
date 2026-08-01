package p180j;

import java.util.Iterator;

/* JADX INFO: renamed from: j.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2362b extends AbstractC2365e implements Iterator {

    /* JADX INFO: renamed from: d */
    public C2363c f7663d;

    /* JADX INFO: renamed from: e */
    public C2363c f7664e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f7665f;

    public C2362b(C2363c c2363c, C2363c c2363c2, int i5) {
        this.f7665f = i5;
        this.f7663d = c2363c2;
        this.f7664e = c2363c;
    }

    @Override // p180j.AbstractC2365e
    /* JADX INFO: renamed from: a */
    public final void mo4216a(C2363c c2363c) {
        C2363c c2363c2;
        C2363c c2363cM4217b = null;
        if (this.f7663d == c2363c && c2363c == this.f7664e) {
            this.f7664e = null;
            this.f7663d = null;
        }
        C2363c c2363c3 = this.f7663d;
        if (c2363c3 == c2363c) {
            switch (this.f7665f) {
                case 0:
                    c2363c2 = c2363c3.f7669g;
                    break;
                default:
                    c2363c2 = c2363c3.f7668f;
                    break;
            }
            this.f7663d = c2363c2;
        }
        C2363c c2363c4 = this.f7664e;
        if (c2363c4 == c2363c) {
            C2363c c2363c5 = this.f7663d;
            if (c2363c4 != c2363c5 && c2363c5 != null) {
                c2363cM4217b = m4217b(c2363c4);
            }
            this.f7664e = c2363cM4217b;
        }
    }

    /* JADX INFO: renamed from: b */
    public final C2363c m4217b(C2363c c2363c) {
        switch (this.f7665f) {
            case 0:
                return c2363c.f7668f;
            default:
                return c2363c.f7669g;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7664e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C2363c c2363c = this.f7664e;
        C2363c c2363c2 = this.f7663d;
        this.f7664e = (c2363c == c2363c2 || c2363c2 == null) ? null : m4217b(c2363c);
        return c2363c;
    }
}
