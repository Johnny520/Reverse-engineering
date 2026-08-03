package p000;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Nl */
/* JADX INFO: loaded from: classes.dex */
public final class C0587Nl extends AbstractC0233Fb {

    /* JADX INFO: renamed from: d */
    public int f1910d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Function2 f1911e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC0190Eb f1912f;

    public C0587Nl(InterfaceC0190Eb r1, InterfaceC1137ac r2, Function2 r3, InterfaceC0190Eb r4) {
        this.f1911e = r3;
        this.f1912f = r4;
        super(r1, r2);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object r4) {
        int r0 = this.f1910d;
        if (r0 == 0) goto L9;
        if (r0 != 1) goto L8;
        this.f1910d = 2;
        AbstractC0628Oj.m1232T(r4);
        return r4;
    L8:
        throw new IllegalStateException("This coroutine had already completed");
    L9:
        this.f1910d = 1;
        AbstractC0628Oj.m1232T(r4);
        Function2 r42 = this.f1911e;
        AbstractC0828TB.m1636c(2, r42);
        return r42.mo446d(this.f1912f, this);
    }
}
