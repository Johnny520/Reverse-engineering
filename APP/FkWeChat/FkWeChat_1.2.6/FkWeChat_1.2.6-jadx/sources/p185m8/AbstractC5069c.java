package p185m8;

import bsh.C1189h4;
import java.util.Iterator;
import p036c9.InterfaceC1400a;
import p376zd.C9987e;

/* JADX INFO: renamed from: m8.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5069c implements Iterator, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public int f15372q;

    /* JADX INFO: renamed from: r */
    public Object f15373r;

    /* JADX INFO: renamed from: g */
    public abstract void mo20488g();

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10 = this.f15372q;
        if (i10 == 0) {
            return m20491v();
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        C9987e.m38645a("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final void m20489l() {
        this.f15372q = 2;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i10 = this.f15372q;
        if (i10 == 1) {
            this.f15372q = 0;
            return this.f15373r;
        }
        if (i10 == 2 || !m20491v()) {
            C1189h4.m4429a();
            return null;
        }
        this.f15372q = 0;
        return this.f15373r;
    }

    /* JADX INFO: renamed from: o */
    public final void m20490o(Object obj) {
        this.f15373r = obj;
        this.f15372q = 1;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: v */
    public final boolean m20491v() {
        this.f15372q = 3;
        mo20488g();
        return this.f15372q == 1;
    }
}
