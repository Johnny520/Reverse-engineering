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

    public C0855Tw(C0898Uw c0898Uw, C0898Uw c0898Uw2, int i) {
        this.f2707c = i;
        this.f2705a = c0898Uw2;
        this.f2706b = c0898Uw;
    }

    @Override // p000.AbstractC0984Ww
    /* JADX INFO: renamed from: a */
    public final void mo1688a(C0898Uw c0898Uw) {
        C0898Uw c0898Uw2;
        C0898Uw c0898UwM1689b = null;
        if (this.f2705a == c0898Uw && c0898Uw == this.f2706b) {
            this.f2706b = null;
            this.f2705a = null;
        }
        C0898Uw c0898Uw3 = this.f2705a;
        if (c0898Uw3 == c0898Uw) {
            switch (this.f2707c) {
                case 0:
                    c0898Uw2 = c0898Uw3.f2794d;
                    break;
                default:
                    c0898Uw2 = c0898Uw3.f2793c;
                    break;
            }
            this.f2705a = c0898Uw2;
        }
        C0898Uw c0898Uw4 = this.f2706b;
        if (c0898Uw4 == c0898Uw) {
            C0898Uw c0898Uw5 = this.f2705a;
            if (c0898Uw4 != c0898Uw5 && c0898Uw5 != null) {
                c0898UwM1689b = m1689b(c0898Uw4);
            }
            this.f2706b = c0898UwM1689b;
        }
    }

    /* JADX INFO: renamed from: b */
    public final C0898Uw m1689b(C0898Uw c0898Uw) {
        switch (this.f2707c) {
            case 0:
                return c0898Uw.f2793c;
            default:
                return c0898Uw.f2794d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2706b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0898Uw c0898Uw = this.f2706b;
        C0898Uw c0898Uw2 = this.f2705a;
        this.f2706b = (c0898Uw == c0898Uw2 || c0898Uw2 == null) ? null : m1689b(c0898Uw);
        return c0898Uw;
    }
}
