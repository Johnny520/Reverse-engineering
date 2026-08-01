package p079P2;

import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1051i;
import p084Q2.AbstractC1178c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1678w;
import p127Z2.AbstractC1784a;

/* JADX INFO: renamed from: P2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1154c extends AbstractC1178c {

    /* JADX INFO: renamed from: g */
    public int f3795g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1603e f3796h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1046d f3797i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1154c(InterfaceC1046d interfaceC1046d, InterfaceC1051i interfaceC1051i, InterfaceC1603e interfaceC1603e, InterfaceC1046d interfaceC1046d2) {
        super(interfaceC1046d, interfaceC1051i);
        this.f3796h = interfaceC1603e;
        this.f3797i = interfaceC1046d2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        int i5 = this.f3795g;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f3795g = 2;
            AbstractC1784a.m3205S(obj);
            return obj;
        }
        this.f3795g = 1;
        AbstractC1784a.m3205S(obj);
        InterfaceC1603e interfaceC1603e = this.f3796h;
        AbstractC1665j.m2983c(interfaceC1603e, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        AbstractC1678w.m2998b(2, interfaceC1603e);
        return interfaceC1603e.mo0g(this.f3797i, this);
    }
}
