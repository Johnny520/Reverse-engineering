package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: Vw */
/* JADX INFO: loaded from: classes.dex */
public final class C0941Vw extends AbstractC0984Ww implements Iterator {

    /* JADX INFO: renamed from: a */
    public C0898Uw f2958a;

    /* JADX INFO: renamed from: b */
    public boolean f2959b = true;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1027Xw f2960c;

    public C0941Vw(C1027Xw c1027Xw) {
        this.f2960c = c1027Xw;
    }

    @Override // p000.AbstractC0984Ww
    /* JADX INFO: renamed from: a */
    public final void mo1688a(C0898Uw c0898Uw) {
        C0898Uw c0898Uw2 = this.f2958a;
        if (c0898Uw == c0898Uw2) {
            C0898Uw c0898Uw3 = c0898Uw2.f2794d;
            this.f2958a = c0898Uw3;
            this.f2959b = c0898Uw3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2959b) {
            return this.f2960c.f3269a != null;
        }
        C0898Uw c0898Uw = this.f2958a;
        return (c0898Uw == null || c0898Uw.f2793c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2959b) {
            this.f2959b = false;
            this.f2958a = this.f2960c.f3269a;
        } else {
            C0898Uw c0898Uw = this.f2958a;
            this.f2958a = c0898Uw != null ? c0898Uw.f2793c : null;
        }
        return this.f2958a;
    }
}
