package p016I0;

import p001A0.AbstractC0040p;
import p014H0.C0203b;
import p014H0.InterfaceC0202a;
import p014H0.InterfaceC0205d;
import p018J0.AbstractC0231a;
import p018J0.C0232b;
import p029P0.InterfaceC0290p;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;

/* JADX INFO: renamed from: I0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0211c extends AbstractC0231a {

    /* JADX INFO: renamed from: b */
    public final InterfaceC0205d f430b;

    /* JADX INFO: renamed from: c */
    public transient InterfaceC0202a f431c;

    /* JADX INFO: renamed from: d */
    public int f432d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0290p f433e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f434f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0211c(InterfaceC0202a interfaceC0202a, InterfaceC0205d interfaceC0205d, InterfaceC0290p interfaceC0290p, Object obj) {
        super(interfaceC0202a);
        this.f433e = interfaceC0290p;
        this.f434f = obj;
        AbstractC0307g.m701c(interfaceC0202a, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f430b = interfaceC0205d;
    }

    @Override // p014H0.InterfaceC0202a
    /* JADX INFO: renamed from: c */
    public final InterfaceC0205d mo588c() {
        InterfaceC0205d interfaceC0205d = this.f430b;
        AbstractC0307g.m700b(interfaceC0205d);
        return interfaceC0205d;
    }

    @Override // p018J0.AbstractC0231a
    /* JADX INFO: renamed from: f */
    public final Object mo520f(Object obj) throws Throwable {
        int i2 = this.f432d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f432d = 2;
            AbstractC0040p.m97b0(obj);
            return obj;
        }
        this.f432d = 1;
        AbstractC0040p.m97b0(obj);
        InterfaceC0290p interfaceC0290p = this.f433e;
        AbstractC0307g.m701c(interfaceC0290p, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        AbstractC0317q.m712a(interfaceC0290p);
        return interfaceC0290p.mo518b(this.f434f, this);
    }

    @Override // p018J0.AbstractC0231a
    /* JADX INFO: renamed from: g */
    public final void mo591g() {
        InterfaceC0202a interfaceC0202a = this.f431c;
        if (interfaceC0202a != null && interfaceC0202a != this) {
            InterfaceC0205d interfaceC0205d = this.f430b;
            AbstractC0307g.m700b(interfaceC0205d);
            AbstractC0307g.m700b(interfaceC0205d.mo589a(C0203b.f422a));
        }
        this.f431c = C0232b.f472a;
    }
}
