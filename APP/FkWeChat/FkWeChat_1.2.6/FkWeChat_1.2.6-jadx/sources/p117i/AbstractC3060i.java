package p117i;

import bsh.C1189h4;
import java.util.Iterator;
import p036c9.InterfaceC1400a;
import p132j.AbstractC3492d;

/* JADX INFO: renamed from: i.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3060i implements Iterator, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public int f8121q;

    /* JADX INFO: renamed from: r */
    public int f8122r;

    /* JADX INFO: renamed from: s */
    public boolean f8123s;

    public AbstractC3060i(int i10) {
        this.f8121q = i10;
    }

    /* JADX INFO: renamed from: g */
    public abstract Object mo11217g(int i10);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f8122r < this.f8121q;
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo11218l(int i10);

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            C1189h4.m4429a();
            return null;
        }
        Object objMo11217g = mo11217g(this.f8122r);
        this.f8122r++;
        this.f8123s = true;
        return objMo11217g;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f8123s) {
            AbstractC3492d.m13016b("Call next() before removing an element.");
        }
        int i10 = this.f8122r - 1;
        this.f8122r = i10;
        mo11218l(i10);
        this.f8121q--;
        this.f8123s = false;
    }
}
