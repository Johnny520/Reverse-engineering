package p061i;

import java.util.Iterator;

/* JADX INFO: renamed from: i.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0951d extends AbstractC0952e implements Iterator {

    /* JADX INFO: renamed from: a */
    public C0950c f3373a;

    /* JADX INFO: renamed from: b */
    public boolean f3374b = true;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0953f f3375c;

    public C0951d(C0953f c0953f) {
        this.f3375c = c0953f;
    }

    @Override // p061i.AbstractC0952e
    /* JADX INFO: renamed from: a */
    public final void mo2284a(C0950c c0950c) {
        C0950c c0950c2 = this.f3373a;
        if (c0950c == c0950c2) {
            C0950c c0950c3 = c0950c2.f3372d;
            this.f3373a = c0950c3;
            this.f3374b = c0950c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3374b) {
            return this.f3375c.f3376a != null;
        }
        C0950c c0950c = this.f3373a;
        return (c0950c == null || c0950c.f3371c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3374b) {
            this.f3374b = false;
            this.f3373a = this.f3375c.f3376a;
        } else {
            C0950c c0950c = this.f3373a;
            this.f3373a = c0950c != null ? c0950c.f3371c : null;
        }
        return this.f3373a;
    }
}
