package p172lg;

import bsh.C0353j;
import java.util.Iterator;
import p114hg.InterfaceC1711a;

/* JADX INFO: renamed from: lg.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2563c implements Iterator, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public final int f8315g;

    /* JADX INFO: renamed from: h */
    public final int f8316h;

    /* JADX INFO: renamed from: i */
    public boolean f8317i;

    /* JADX INFO: renamed from: j */
    public int f8318j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2563c(int i9, int i10, int i11) {
        this.f8315g = i11;
        this.f8316h = i10;
        boolean z9 = false;
        if (i11 <= 0 ? i9 >= i10 : i9 <= i10) {
            z9 = true;
        }
        this.f8317i = z9;
        this.f8318j = z9 ? i9 : i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8317i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int nextInt() {
        int i9 = this.f8318j;
        if (i9 != this.f8316h) {
            this.f8318j = this.f8315g + i9;
            return i9;
        }
        if (this.f8317i) {
            this.f8317i = false;
            return i9;
        }
        C0353j.m1307e();
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
