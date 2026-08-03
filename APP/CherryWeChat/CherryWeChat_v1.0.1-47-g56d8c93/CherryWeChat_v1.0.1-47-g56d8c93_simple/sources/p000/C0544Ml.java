package p000;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Ml */
/* JADX INFO: loaded from: classes.dex */
public final class C0544Ml extends AbstractC0211Ew {

    /* JADX INFO: renamed from: b */
    public int f1764b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Function2 f1765c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC0190Eb f1766d;

    public C0544Ml(InterfaceC0190Eb r1, InterfaceC0190Eb r2, Function2 r3) {
        this.f1765c = r3;
        this.f1766d = r2;
        super(r1);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object r4) {
        int r0 = this.f1764b;
        if (r0 == 0) goto L9;
        if (r0 != 1) goto L8;
        this.f1764b = 2;
        AbstractC0628Oj.m1232T(r4);
        return r4;
    L8:
        throw new IllegalStateException("This coroutine had already completed");
    L9:
        this.f1764b = 1;
        AbstractC0628Oj.m1232T(r4);
        Function2 r42 = this.f1765c;
        AbstractC0828TB.m1636c(2, r42);
        return r42.mo446d(this.f1766d, this);
    }
}
