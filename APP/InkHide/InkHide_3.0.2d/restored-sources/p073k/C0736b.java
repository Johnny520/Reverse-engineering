package p073k;

import java.util.Iterator;

/* JADX INFO: renamed from: k.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0736b extends AbstractC0739e implements Iterator {

    /* JADX INFO: renamed from: a */
    public C0737c f2491a;

    /* JADX INFO: renamed from: b */
    public C0737c f2492b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f2493c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0736b(C0737c c0737c, C0737c c0737c2, int i2) {
        this.f2493c = i2;
        this.f2491a = c0737c2;
        this.f2492b = c0737c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p073k.AbstractC0739e
    /* JADX INFO: renamed from: a */
    public final void mo1390a(C0737c c0737c) {
        C0737c c0737c2;
        C0737c c0737cM1391b = null;
        if (this.f2491a == c0737c && c0737c == this.f2492b) {
            this.f2492b = null;
            this.f2491a = null;
        }
        C0737c c0737c3 = this.f2491a;
        if (c0737c3 == c0737c) {
            switch (this.f2493c) {
                case 0:
                    c0737c2 = c0737c3.f2497d;
                    break;
                default:
                    c0737c2 = c0737c3.f2496c;
                    break;
            }
            this.f2491a = c0737c2;
        }
        C0737c c0737c4 = this.f2492b;
        if (c0737c4 == c0737c) {
            C0737c c0737c5 = this.f2491a;
            if (c0737c4 != c0737c5 && c0737c5 != null) {
                c0737cM1391b = m1391b(c0737c4);
            }
            this.f2492b = c0737cM1391b;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C0737c m1391b(C0737c c0737c) {
        switch (this.f2493c) {
            case 0:
                return c0737c.f2496c;
            default:
                return c0737c.f2497d;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2492b != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        C0737c c0737c = this.f2492b;
        C0737c c0737c2 = this.f2491a;
        this.f2492b = (c0737c == c0737c2 || c0737c2 == null) ? null : m1391b(c0737c);
        return c0737c;
    }
}
