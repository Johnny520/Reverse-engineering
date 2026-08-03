package p061i;

import java.util.Iterator;

/* JADX INFO: renamed from: i.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0949b extends AbstractC0952e implements Iterator {

    /* JADX INFO: renamed from: a */
    public C0950c f3366a;

    /* JADX INFO: renamed from: b */
    public C0950c f3367b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f3368c;

    public C0949b(C0950c r1, C0950c r2, int r3) {
        this.f3368c = r3;
        this.f3366a = r2;
        this.f3367b = r1;
    }

    @Override // p061i.AbstractC0952e
    /* JADX INFO: renamed from: a */
    public final void mo2284a(C0950c r3) {
        C0950c r1 = null;
        if (this.f3366a == r3) goto L5;
    L7:
        C0950c r02 = this.f3366a;
        if (r02 != r3) goto L10;
        this.f3366a = m2285b(r02);
    L10:
        C0950c r03 = this.f3367b;
        if (r03 != r3) goto L19;
        C0950c r32 = this.f3366a;
        if (r03 == r32) goto L17;
        if (r32 == null) goto L17;
        r1 = m2286c(r03);
    L17:
        this.f3367b = r1;
        return;
    L19:
        return;
    L5:
        if (r3 != this.f3367b) goto L7;
        this.f3367b = null;
        this.f3366a = null;
        goto L7
    }

    /* JADX INFO: renamed from: b */
    public final C0950c m2285b(C0950c r2) {
        switch(this.f3368c) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r2.f3371c;
    L7:
        return r2.f3372d;
    }

    /* JADX INFO: renamed from: c */
    public final C0950c m2286c(C0950c r2) {
        switch(this.f3368c) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r2.f3372d;
    L7:
        return r2.f3371c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3367b == null) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0950c r02 = this.f3367b;
        C0950c r1 = this.f3366a;
        if (r02 == r1) goto L7;
        if (r1 == null) goto L7;
        C0950c r12 = m2286c(r02);
    L8:
        this.f3367b = r12;
        return r02;
    L7:
        r12 = null;
        goto L8
    }
}
