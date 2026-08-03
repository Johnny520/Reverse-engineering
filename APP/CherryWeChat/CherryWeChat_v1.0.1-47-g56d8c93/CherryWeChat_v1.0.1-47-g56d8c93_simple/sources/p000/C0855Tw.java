package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: Tw */
/* JADX INFO: loaded from: classes.dex */
public final class C0855Tw extends AbstractC0984Ww implements Iterator {

    /* JADX INFO: renamed from: a */
    public C0898Uw f2705a;

    /* JADX INFO: renamed from: b */
    public C0898Uw f2706b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f2707c;

    public C0855Tw(C0898Uw r1, C0898Uw r2, int r3) {
        this.f2707c = r3;
        this.f2705a = r2;
        this.f2706b = r1;
    }

    @Override // p000.AbstractC0984Ww
    /* JADX INFO: renamed from: a */
    public final void mo1688a(C0898Uw r4) {
        C0898Uw r1 = null;
        if (this.f2705a == r4) goto L5;
    L7:
        C0898Uw r0 = this.f2705a;
        if (r0 == r4) goto L10;
    L14:
        C0898Uw r02 = this.f2706b;
        if (r02 != r4) goto L23;
        C0898Uw r42 = this.f2705a;
        if (r02 == r42) goto L21;
        if (r42 == null) goto L21;
        r1 = m1689b(r02);
    L21:
        this.f2706b = r1;
        return;
    L23:
        return;
    L10:
        switch(this.f2707c) {
            case 0: goto L12;
            default: goto L11;
        };
    L11:
        C0898Uw r03 = r0.f2793c;
    L13:
        this.f2705a = r03;
        goto L14
    L12:
        r03 = r0.f2794d;
        goto L13
    L5:
        if (r4 != this.f2706b) goto L7;
        this.f2706b = null;
        this.f2705a = null;
        goto L7
    }

    /* JADX INFO: renamed from: b */
    public final C0898Uw m1689b(C0898Uw r2) {
        switch(this.f2707c) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r2.f2794d;
    L7:
        return r2.f2793c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2706b == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0898Uw r0 = this.f2706b;
        C0898Uw r1 = this.f2705a;
        if (r0 == r1) goto L7;
        if (r1 == null) goto L7;
        C0898Uw r12 = m1689b(r0);
    L8:
        this.f2706b = r12;
        return r0;
    L7:
        r12 = null;
        goto L8
    }
}
