package a;

/* JADX INFO: renamed from: a.k9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0228k9 extends a.AbstractC0061b4 {
    public int d;
    public final /* synthetic */ a.H7 e;
    public final /* synthetic */ a.InterfaceC0042a4 f;

    public C0228k9(a.InterfaceC0042a4 r1, a.InterfaceC0456x4 r2, a.H7 r3, a.InterfaceC0042a4 r4) {
            r0 = this;
            r0.e = r3
            r0.f = r4
            r0.<init>(r1, r2)
            return
    }

    @Override // a.W1
    public final java.lang.Object h(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.d
            r1 = 1
            if (r0 == 0) goto L16
            if (r0 != r1) goto Le
            r0 = 2
            r2.d = r0
            a.C0465xd.b(r3)
            return r3
        Le:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "This coroutine had already completed"
            r3.<init>(r0)
            throw r3
        L16:
            r2.d = r1
            a.C0465xd.b(r3)
            a.H7 r3 = r2.e
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>"
            a.C0193i9.c(r3, r0)
            a.Kf.a(r3)
            a.a4 r0 = r2.f
            java.lang.Object r3 = r3.e(r0, r2)
            return r3
    }
}
