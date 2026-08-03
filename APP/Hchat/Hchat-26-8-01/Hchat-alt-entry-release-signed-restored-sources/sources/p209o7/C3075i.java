package p209o7;

import bsh.C0353j;
import java.util.Iterator;
import p166l7.C2518f;
import p285t7.C4135b;

/* JADX INFO: renamed from: o7.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3075i implements Iterator {

    /* JADX INFO: renamed from: g */
    public int f9943g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f9944h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f9945i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C2518f f9946j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3075i(int i9, int i10, C2518f c2518f) {
        this.f9944h = i9;
        this.f9945i = i10;
        this.f9946j = c2518f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9943g <= this.f9944h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        int i9 = this.f9943g;
        if (i9 > this.f9944h) {
            C0353j.m1307e();
            return null;
        }
        int i10 = this.f9945i | i9;
        this.f9943g = i9 + 1;
        return new C4135b(this.f9946j, i10);
    }
}
