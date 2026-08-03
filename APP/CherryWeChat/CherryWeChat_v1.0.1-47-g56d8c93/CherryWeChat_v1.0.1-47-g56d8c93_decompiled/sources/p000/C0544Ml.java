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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0544Ml(InterfaceC0190Eb interfaceC0190Eb, InterfaceC0190Eb interfaceC0190Eb2, Function2 function2) {
        super(interfaceC0190Eb);
        this.f1765c = function2;
        this.f1766d = interfaceC0190Eb2;
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object obj) throws Throwable {
        int i = this.f1764b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f1764b = 2;
            AbstractC0628Oj.m1232T(obj);
            return obj;
        }
        this.f1764b = 1;
        AbstractC0628Oj.m1232T(obj);
        Function2 function2 = this.f1765c;
        AbstractC0828TB.m1636c(2, function2);
        return function2.mo446d(this.f1766d, this);
    }
}
