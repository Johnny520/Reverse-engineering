package p055e;

import java.util.Iterator;

/* JADX INFO: renamed from: e.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0797b extends AbstractC0800e implements Iterator {

    /* JADX INFO: renamed from: g */
    public C0798c f2388g;

    /* JADX INFO: renamed from: h */
    public C0798c f2389h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f2390i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0797b(C0798c c0798c, C0798c c0798c2, int i9) {
        this.f2390i = i9;
        this.f2388g = c0798c2;
        this.f2389h = c0798c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p055e.AbstractC0800e
    /* JADX INFO: renamed from: a */
    public final void mo2031a(C0798c c0798c) {
        C0798c c0798c2;
        C0798c c0798cM2032b = null;
        if (this.f2388g == c0798c && c0798c == this.f2389h) {
            this.f2389h = null;
            this.f2388g = null;
        }
        C0798c c0798c3 = this.f2388g;
        if (c0798c3 == c0798c) {
            switch (this.f2390i) {
                case 0:
                    c0798c2 = c0798c3.f2394j;
                    break;
                default:
                    c0798c2 = c0798c3.f2393i;
                    break;
            }
            this.f2388g = c0798c2;
        }
        C0798c c0798c4 = this.f2389h;
        if (c0798c4 == c0798c) {
            C0798c c0798c5 = this.f2388g;
            if (c0798c4 != c0798c5 && c0798c5 != null) {
                c0798cM2032b = m2032b(c0798c4);
            }
            this.f2389h = c0798cM2032b;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C0798c m2032b(C0798c c0798c) {
        switch (this.f2390i) {
            case 0:
                return c0798c.f2393i;
            default:
                return c0798c.f2394j;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2389h != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        C0798c c0798c = this.f2389h;
        C0798c c0798c2 = this.f2388g;
        this.f2389h = (c0798c == c0798c2 || c0798c2 == null) ? null : m2032b(c0798c);
        return c0798c;
    }
}
