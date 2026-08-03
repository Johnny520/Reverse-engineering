package ng;

import bsh.C0353j;
import java.io.File;
import java.util.Iterator;
import p114hg.InterfaceC1711a;

/* JADX INFO: renamed from: ng.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3017o implements Iterator, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public boolean f9812g = true;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ File f9813h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3017o(File file) {
        this.f9813h = file;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9812g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (this.f9812g) {
            this.f9812g = false;
            return this.f9813h;
        }
        C0353j.m1307e();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
