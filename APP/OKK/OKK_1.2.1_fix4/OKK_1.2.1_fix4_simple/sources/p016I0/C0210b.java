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

    public C0210b(InterfaceC0202a r1, InterfaceC0290p r2, Object r3) {
        this.f428c = r2;
        this.f429d = r3;
        AbstractC0307g.m701c(r1, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        super(r1);
    }

    @Override // p018J0.AbstractC0231a
    /* JADX INFO: renamed from: f */
    public final Object mo520f(Object r3) {
        int r02 = this.f427b;
        if (r02 == 0) goto L8;
        if (r02 != 1) goto L7;
        this.f427b = 2;
        AbstractC0040p.m97b0(r3);
        return r3;
    L7:
        throw new IllegalStateException("This coroutine had already completed".toString());
    L8:
        this.f427b = 1;
        AbstractC0040p.m97b0(r3);
        InterfaceC0290p r32 = this.f428c;
        AbstractC0307g.m701c(r32, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        AbstractC0317q.m712a(r32);
        return r32.mo518b(this.f429d, this);
    }
}
