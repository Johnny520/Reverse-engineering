package p119i1;

import androidx.compose.runtime.snapshots.SnapshotStateSet;
import java.util.Iterator;
import p036c9.InterfaceC1400a;
import p117i.C3039b;
import p172l8.C4700i0;

/* JADX INFO: renamed from: i1.y0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3164y0 implements Iterator, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final SnapshotStateSet f8439q;

    /* JADX INFO: renamed from: r */
    public final Iterator f8440r;

    /* JADX INFO: renamed from: s */
    public Object f8441s;

    /* JADX INFO: renamed from: t */
    public Object f8442t;

    /* JADX INFO: renamed from: u */
    public int f8443u;

    public C3164y0(SnapshotStateSet snapshotStateSet, Iterator it) {
        this.f8439q = snapshotStateSet;
        this.f8440r = it;
        this.f8443u = AbstractC3142n0.m11817c(snapshotStateSet);
        m11947g();
    }

    /* JADX INFO: renamed from: g */
    private final void m11947g() {
        this.f8441s = this.f8442t;
        this.f8442t = this.f8440r.hasNext() ? this.f8440r.next() : null;
    }

    /* JADX INFO: renamed from: l */
    private final void m11948l() {
        if (AbstractC3142n0.m11817c(this.f8439q) == this.f8443u) {
            return;
        }
        C3039b.m11232a();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f8442t != null;
    }

    @Override // java.util.Iterator
    public Object next() {
        m11948l();
        m11947g();
        Object obj = this.f8441s;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public void remove() {
        m11948l();
        Object obj = this.f8441s;
        if (obj == null) {
            throw new IllegalStateException();
        }
        this.f8439q.remove(obj);
        this.f8441s = null;
        C4700i0 c4700i0 = C4700i0.f13910a;
        this.f8443u = AbstractC3142n0.m11817c(this.f8439q);
    }
}
