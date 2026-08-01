package p016b1;

import bsh.C1189h4;
import java.util.Iterator;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: b1.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0909e implements Iterator, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final AbstractC0925u[] f2861q;

    /* JADX INFO: renamed from: r */
    public int f2862r;

    /* JADX INFO: renamed from: s */
    public boolean f2863s = true;

    public AbstractC0909e(C0924t c0924t, AbstractC0925u[] abstractC0925uArr) {
        this.f2861q = abstractC0925uArr;
        abstractC0925uArr[0].m3408B(c0924t.m3392p(), c0924t.m3389m() * 2);
        this.f2862r = 0;
        m3334o();
    }

    /* JADX INFO: renamed from: g */
    public final void m3332g() {
        if (hasNext()) {
            return;
        }
        C1189h4.m4429a();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f2863s;
    }

    /* JADX INFO: renamed from: l */
    public final Object m3333l() {
        m3332g();
        return this.f2861q[this.f2862r].m3411g();
    }

    @Override // java.util.Iterator
    public Object next() {
        m3332g();
        Object next = this.f2861q[this.f2862r].next();
        m3334o();
        return next;
    }

    /* JADX INFO: renamed from: o */
    public final void m3334o() {
        if (this.f2861q[this.f2862r].m3415x()) {
            return;
        }
        for (int i10 = this.f2862r; -1 < i10; i10--) {
            int iM3336x = m3336x(i10);
            if (iM3336x == -1 && this.f2861q[i10].m3416y()) {
                this.f2861q[i10].m3407A();
                iM3336x = m3336x(i10);
            }
            if (iM3336x != -1) {
                this.f2862r = iM3336x;
                return;
            }
            if (i10 > 0) {
                this.f2861q[i10 - 1].m3407A();
            }
            this.f2861q[i10].m3408B(C0924t.f2881e.m3403a().m3392p(), 0);
        }
        this.f2863s = false;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: v */
    public final AbstractC0925u[] m3335v() {
        return this.f2861q;
    }

    /* JADX INFO: renamed from: x */
    public final int m3336x(int i10) {
        if (this.f2861q[i10].m3415x()) {
            return i10;
        }
        if (!this.f2861q[i10].m3416y()) {
            return -1;
        }
        C0924t c0924tM3412l = this.f2861q[i10].m3412l();
        AbstractC0925u[] abstractC0925uArr = this.f2861q;
        if (i10 == 6) {
            abstractC0925uArr[i10 + 1].m3408B(c0924tM3412l.m3392p(), c0924tM3412l.m3392p().length);
        } else {
            abstractC0925uArr[i10 + 1].m3408B(c0924tM3412l.m3392p(), c0924tM3412l.m3389m() * 2);
        }
        return m3336x(i10 + 1);
    }

    /* JADX INFO: renamed from: y */
    public final void m3337y(int i10) {
        this.f2862r = i10;
    }
}
