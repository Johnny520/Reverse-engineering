package p016I0;

import p001A0.AbstractC0040p;
import p014H0.InterfaceC0202a;
import p018J0.AbstractC0236f;
import p029P0.InterfaceC0290p;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;

/* JADX INFO: renamed from: I0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0210b extends AbstractC0236f {

    /* JADX INFO: renamed from: b */
    public int f427b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0290p f428c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f429d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0210b(InterfaceC0202a interfaceC0202a, InterfaceC0290p interfaceC0290p, Object obj) {
        super(interfaceC0202a);
        this.f428c = interfaceC0290p;
        this.f429d = obj;
        AbstractC0307g.m701c(interfaceC0202a, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // p018J0.AbstractC0231a
    /* JADX INFO: renamed from: f */
    public final Object mo520f(Object obj) throws Throwable {
        int i2 = this.f427b;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f427b = 2;
            AbstractC0040p.m97b0(obj);
            return obj;
        }
        this.f427b = 1;
        AbstractC0040p.m97b0(obj);
        InterfaceC0290p interfaceC0290p = this.f428c;
        AbstractC0307g.m701c(interfaceC0290p, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        AbstractC0317q.m712a(interfaceC0290p);
        return interfaceC0290p.mo518b(this.f429d, this);
    }
}
