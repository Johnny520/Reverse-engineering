package p207o5;

import androidx.lifecycle.C0119x;
import bsh.C0353j;
import java.util.Iterator;
import p005a5.C0016a;
import p150k5.C2243a;
import p150k5.C2245b;
import p150k5.C2247c;
import p228p5.C3322a;

/* JADX INFO: renamed from: o5.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3052g implements Iterator {

    /* JADX INFO: renamed from: g */
    public final C0016a f9879g;

    /* JADX INFO: renamed from: h */
    public final int f9880h;

    /* JADX INFO: renamed from: i */
    public int f9881i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f9882j = 1;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Iterable f9883k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3052g(C2243a c2243a, C0119x c0119x, int i9, int i10) {
        this.f9883k = c2243a;
        c0119x.getClass();
        this.f9879g = new C0016a(i9, 5, c0119x);
        this.f9880h = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9881i < this.f9880h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        int i9 = this.f9881i;
        if (i9 >= this.f9880h) {
            C0353j.m1307e();
            return null;
        }
        this.f9881i = i9 + 1;
        int i10 = this.f9882j;
        C0016a c0016a = this.f9879g;
        switch (i10) {
            case 0:
                return ((C3053h) this.f9883k).f9885g.f7548r.m5523d(c0016a.m211o(false) - 1);
            default:
                C2243a c2243a = (C2243a) this.f9883k;
                switch (c2243a.f7438j) {
                    case 0:
                        return new C2247c(((C2245b) c2243a.f7439k).f7441g, c0016a);
                    default:
                        return new C2247c(((C3322a) c2243a.f7439k).f10700g, c0016a);
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public C3052g(C3053h c3053h, C0016a c0016a, int i9) {
        this.f9883k = c3053h;
        this.f9879g = c0016a;
        this.f9880h = i9;
    }
}
