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
import p044Y0.AbstractRunnableC0468a;

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

    public C0211c(InterfaceC0202a r1, InterfaceC0205d r2, InterfaceC0290p r3, Object r4) {
        this.f433e = r3;
        this.f434f = r4;
        AbstractC0307g.m701c(r1, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        super(r1);
        this.f430b = r2;
    }

    @Override // p014H0.InterfaceC0202a
    /* JADX INFO: renamed from: c */
    public final InterfaceC0205d mo588c() {
        InterfaceC0205d r02 = this.f430b;
        AbstractC0307g.m700b(r02);
        return r02;
    }

    @Override // p018J0.AbstractC0231a
    /* JADX INFO: renamed from: f */
    public final Object mo520f(Object r3) {
        int r02 = this.f432d;
        if (r02 == 0) goto L8;
        if (r02 != 1) goto L7;
        this.f432d = 2;
        AbstractC0040p.m97b0(r3);
        return r3;
    L7:
        throw new IllegalStateException("This coroutine had already completed".toString());
    L8:
        this.f432d = 1;
        AbstractC0040p.m97b0(r3);
        InterfaceC0290p r32 = this.f433e;
        AbstractC0307g.m701c(r32, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        AbstractC0317q.m712a(r32);
        return r32.mo518b(this.f434f, this);
    }

    @Override // p018J0.AbstractC0231a
    /* JADX INFO: renamed from: g */
    public final void mo591g() {
        InterfaceC0202a r02 = this.f431c;
        if (r02 == null) goto L6;
        if (r02 == this) goto L6;
        InterfaceC0205d r1 = this.f430b;
        AbstractC0307g.m700b(r1);
        AbstractC0307g.m700b(r1.mo589a(C0203b.f422a));
        AbstractRunnableC0468a r03 = (AbstractRunnableC0468a) r02;
    L6:
        this.f431c = C0232b.f472a;
    }
}
