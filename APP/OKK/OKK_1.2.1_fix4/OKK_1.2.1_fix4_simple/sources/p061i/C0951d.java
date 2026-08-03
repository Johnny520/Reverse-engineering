package p061i;

import java.util.Iterator;

/* JADX INFO: renamed from: i.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0951d extends AbstractC0952e implements Iterator {

    /* JADX INFO: renamed from: a */
    public C0950c f3373a;

    /* JADX INFO: renamed from: b */
    public boolean f3374b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0953f f3375c;

    public C0951d(C0953f r1) {
        this.f3375c = r1;
        this.f3374b = true;
    }

    @Override // p061i.AbstractC0952e
    /* JADX INFO: renamed from: a */
    public final void mo2284a(C0950c r2) {
        C0950c r02 = this.f3373a;
        if (r2 != r02) goto L10;
        C0950c r22 = r02.f3372d;
        this.f3373a = r22;
        if (r22 != null) goto L7;
        boolean r23 = true;
    L8:
        this.f3374b = r23;
        return;
    L7:
        r23 = false;
        goto L8
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3374b == true) goto L5;
        C0950c r02 = this.f3373a;
        if (r02 != null) goto L11;
        return false;
    L11:
        if (r02.f3371c != null) goto L13;
        return false;
    L13:
        return true;
    L5:
        if (this.f3375c.f3376a != null) goto L7;
        return false;
    L7:
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3374b == false) goto L5;
        this.f3374b = false;
        this.f3373a = this.f3375c.f3376a;
    L11:
        return this.f3373a;
    L5:
        C0950c r02 = this.f3373a;
        if (r02 == null) goto L8;
        C0950c r03 = r02.f3371c;
    L9:
        this.f3373a = r03;
        goto L11
    L8:
        r03 = null;
        goto L9
    }
}
