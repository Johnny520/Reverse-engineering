package p054dg;

import bsh.C0353j;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import p114hg.InterfaceC1711a;

/* JADX INFO: renamed from: dg.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0794m implements Iterator, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public String f2378g;

    /* JADX INFO: renamed from: h */
    public boolean f2379h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0795n f2380i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0794m(C0795n c0795n) {
        this.f2380i = c0795n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.f2378g == null && !this.f2379h) {
            String line = ((BufferedReader) this.f2380i.f2382b).readLine();
            this.f2378g = line;
            if (line == null) {
                this.f2379h = true;
            }
        }
        return this.f2378g != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C0353j.m1307e();
            return null;
        }
        String str = this.f2378g;
        this.f2378g = null;
        str.getClass();
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
