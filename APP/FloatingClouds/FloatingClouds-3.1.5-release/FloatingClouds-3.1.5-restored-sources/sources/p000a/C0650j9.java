package p000a;

/* JADX INFO: renamed from: a.j9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0650j9 extends AbstractC0882vd {

    /* JADX INFO: renamed from: b */
    public int f2405b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0136H7 f2406c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC0474a4 f2407d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0650j9(InterfaceC0474a4 interfaceC0474a4, InterfaceC0474a4 interfaceC0474a42, InterfaceC0136H7 interfaceC0136H7) {
        super(interfaceC0474a4);
        this.f2406c = interfaceC0136H7;
        this.f2407d = interfaceC0474a42;
    }

    @Override // p000a.AbstractC0399W1
    /* JADX INFO: renamed from: h */
    public final Object mo148h(Object obj) throws Throwable {
        int i = this.f2405b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f2405b = 2;
            C0920xd.m2207b(obj);
            return obj;
        }
        this.f2405b = 1;
        C0920xd.m2207b(obj);
        InterfaceC0136H7 interfaceC0136H7 = this.f2406c;
        C0631i9.m1480c(interfaceC0136H7, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        C0198Kf.m548a(interfaceC0136H7);
        return interfaceC0136H7.mo146e(this.f2407d, this);
    }
}
