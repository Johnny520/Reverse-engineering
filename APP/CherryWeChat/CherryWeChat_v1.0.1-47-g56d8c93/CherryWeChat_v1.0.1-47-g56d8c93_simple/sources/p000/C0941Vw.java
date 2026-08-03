package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: Vw */
/* JADX INFO: loaded from: classes.dex */
public final class C0941Vw extends AbstractC0984Ww implements Iterator {

    /* JADX INFO: renamed from: a */
    public C0898Uw f2958a;

    /* JADX INFO: renamed from: b */
    public boolean f2959b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1027Xw f2960c;

    public C0941Vw(C1027Xw r1) {
        this.f2960c = r1;
        this.f2959b = true;
    }

    @Override // p000.AbstractC0984Ww
    /* JADX INFO: renamed from: a */
    public final void mo1688a(C0898Uw r2) {
        C0898Uw r0 = this.f2958a;
        if (r2 != r0) goto L10;
        C0898Uw r22 = r0.f2794d;
        this.f2958a = r22;
        if (r22 != null) goto L7;
        boolean r23 = true;
    L8:
        this.f2959b = r23;
        return;
    L7:
        r23 = false;
        goto L8
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2959b == true) goto L5;
        C0898Uw r0 = this.f2958a;
        if (r0 != null) goto L11;
    L13:
        return false;
    L11:
        if (r0.f2793c == null) goto L13;
        return true;
    L5:
        if (this.f2960c.f3269a == null) goto L7;
        return true;
    L7:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2959b == false) goto L5;
        this.f2959b = false;
        this.f2958a = this.f2960c.f3269a;
    L11:
        return this.f2958a;
    L5:
        C0898Uw r0 = this.f2958a;
        if (r0 == null) goto L8;
        C0898Uw r02 = r0.f2793c;
    L9:
        this.f2958a = r02;
        goto L11
    L8:
        r02 = null;
        goto L9
    }
}
