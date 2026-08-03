package p061i;

import java.util.Iterator;

/* JADX INFO: renamed from: i.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0949b extends AbstractC0952e implements Iterator {

    /* JADX INFO: renamed from: a */
    public C0950c f3366a;

    /* JADX INFO: renamed from: b */
    public C0950c f3367b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f3368c;

    public C0949b(C0950c c0950c, C0950c c0950c2, int i2) {
        this.f3368c = i2;
        this.f3366a = c0950c2;
        this.f3367b = c0950c;
    }

    @Override // p061i.AbstractC0952e
    /* JADX INFO: renamed from: a */
    public final void mo2284a(C0950c c0950c) {
        C0950c c0950cM2286c = null;
        if (this.f3366a == c0950c && c0950c == this.f3367b) {
            this.f3367b = null;
            this.f3366a = null;
        }
        C0950c c0950c2 = this.f3366a;
        if (c0950c2 == c0950c) {
            this.f3366a = m2285b(c0950c2);
        }
        C0950c c0950c3 = this.f3367b;
        if (c0950c3 == c0950c) {
            C0950c c0950c4 = this.f3366a;
            if (c0950c3 != c0950c4 && c0950c4 != null) {
                c0950cM2286c = m2286c(c0950c3);
            }
            this.f3367b = c0950cM2286c;
        }
    }

    /* JADX INFO: renamed from: b */
    public final C0950c m2285b(C0950c c0950c) {
        switch (this.f3368c) {
            case 0:
                return c0950c.f3372d;
            default:
                return c0950c.f3371c;
        }
    }

    /* JADX INFO: renamed from: c */
    public final C0950c m2286c(C0950c c0950c) {
        switch (this.f3368c) {
            case 0:
                return c0950c.f3371c;
            default:
                return c0950c.f3372d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3367b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0950c c0950c = this.f3367b;
        C0950c c0950c2 = this.f3366a;
        this.f3367b = (c0950c == c0950c2 || c0950c2 == null) ? null : m2286c(c0950c);
        return c0950c;
    }
}
