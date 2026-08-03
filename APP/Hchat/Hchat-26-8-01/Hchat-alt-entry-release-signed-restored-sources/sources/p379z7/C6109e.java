package p379z7;

import java.util.Iterator;

/* JADX INFO: renamed from: z7.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6109e implements Iterator {

    /* JADX INFO: renamed from: g */
    public final C6107c f24654g;

    /* JADX INFO: renamed from: h */
    public int f24655h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6109e(C6107c c6107c) {
        this.f24654g = c6107c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24655h < this.f24654g.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        int i9 = this.f24655h;
        this.f24655h = i9 + 1;
        return this.f24654g.f24642g[i9];
    }
}
