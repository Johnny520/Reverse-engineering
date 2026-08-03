package p351xe;

import java.util.Iterator;
import p136j8.C2104o;

/* JADX INFO: renamed from: xe.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5788i implements Iterator {

    /* JADX INFO: renamed from: g */
    public final int f23532g;

    /* JADX INFO: renamed from: h */
    public int f23533h = 0;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C5789j f23534i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5788i(C5789j c5789j) {
        this.f23534i = c5789j;
        this.f23532g = c5789j.f23535g.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23533h < this.f23532g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object[] objArr = this.f23534i.f23535g;
            int i9 = this.f23533h;
            this.f23533h = i9 + 1;
            return objArr[i9];
        } catch (IndexOutOfBoundsException e6) {
            C2104o.m5287l(e6.getMessage());
            return null;
        }
    }
}
