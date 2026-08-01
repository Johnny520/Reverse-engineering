package p016b1;

import java.util.Iterator;
import p036c9.InterfaceC1400a;
import p041d1.AbstractC1851a;

/* JADX INFO: renamed from: b1.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0925u implements Iterator, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public Object[] f2890q = C0924t.f2881e.m3403a().m3392p();

    /* JADX INFO: renamed from: r */
    public int f2891r;

    /* JADX INFO: renamed from: s */
    public int f2892s;

    /* JADX INFO: renamed from: A */
    public final void m3407A() {
        AbstractC1851a.m6548a(m3416y());
        this.f2892s++;
    }

    /* JADX INFO: renamed from: B */
    public final void m3408B(Object[] objArr, int i10) {
        m3409C(objArr, i10, 0);
    }

    /* JADX INFO: renamed from: C */
    public final void m3409C(Object[] objArr, int i10, int i11) {
        this.f2890q = objArr;
        this.f2891r = i10;
        this.f2892s = i11;
    }

    /* JADX INFO: renamed from: D */
    public final void m3410D(int i10) {
        this.f2892s = i10;
    }

    /* JADX INFO: renamed from: g */
    public final Object m3411g() {
        AbstractC1851a.m6548a(m3415x());
        return this.f2890q[this.f2892s];
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return m3415x();
    }

    /* JADX INFO: renamed from: l */
    public final C0924t m3412l() {
        AbstractC1851a.m6548a(m3416y());
        Object obj = this.f2890q[this.f2892s];
        obj.getClass();
        return (C0924t) obj;
    }

    /* JADX INFO: renamed from: o */
    public final Object[] m3413o() {
        return this.f2890q;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: v */
    public final int m3414v() {
        return this.f2892s;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m3415x() {
        return this.f2892s < this.f2891r;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m3416y() {
        AbstractC1851a.m6548a(this.f2892s >= this.f2891r);
        return this.f2892s < this.f2890q.length;
    }

    /* JADX INFO: renamed from: z */
    public final void m3417z() {
        AbstractC1851a.m6548a(m3415x());
        this.f2892s += 2;
    }
}
