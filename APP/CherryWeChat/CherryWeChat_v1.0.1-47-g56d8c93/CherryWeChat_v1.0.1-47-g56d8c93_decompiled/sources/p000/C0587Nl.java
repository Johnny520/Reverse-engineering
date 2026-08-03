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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0587Nl(InterfaceC0190Eb interfaceC0190Eb, InterfaceC1137ac interfaceC1137ac, Function2 function2, InterfaceC0190Eb interfaceC0190Eb2) {
        super(interfaceC0190Eb, interfaceC1137ac);
        this.f1911e = function2;
        this.f1912f = interfaceC0190Eb2;
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object obj) throws Throwable {
        int i = this.f1910d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f1910d = 2;
            AbstractC0628Oj.m1232T(obj);
            return obj;
        }
        this.f1910d = 1;
        AbstractC0628Oj.m1232T(obj);
        Function2 function2 = this.f1911e;
        AbstractC0828TB.m1636c(2, function2);
        return function2.mo446d(this.f1912f, this);
    }
}
