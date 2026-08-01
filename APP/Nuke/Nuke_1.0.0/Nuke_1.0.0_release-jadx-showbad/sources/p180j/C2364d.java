package p180j;

import java.util.Iterator;

/* JADX INFO: renamed from: j.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2364d extends AbstractC2365e implements Iterator {

    /* JADX INFO: renamed from: d */
    public C2363c f7670d;

    /* JADX INFO: renamed from: e */
    public boolean f7671e = true;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2361a f7672f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2364d(C2361a c2361a) {
        this.f7672f = c2361a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p180j.AbstractC2365e
    /* JADX INFO: renamed from: a */
    public final void mo4216a(C2363c c2363c) {
        C2363c c2363c2 = this.f7670d;
        if (c2363c == c2363c2) {
            C2363c c2363c3 = c2363c2.f7669g;
            this.f7670d = c2363c3;
            this.f7671e = c2363c3 == null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f7671e) {
            return this.f7672f.f7658d != null;
        }
        C2363c c2363c = this.f7670d;
        return (c2363c == null || c2363c.f7668f == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (this.f7671e) {
            this.f7671e = false;
            this.f7670d = this.f7672f.f7658d;
        } else {
            C2363c c2363c = this.f7670d;
            this.f7670d = c2363c != null ? c2363c.f7668f : null;
        }
        return this.f7670d;
    }
}
