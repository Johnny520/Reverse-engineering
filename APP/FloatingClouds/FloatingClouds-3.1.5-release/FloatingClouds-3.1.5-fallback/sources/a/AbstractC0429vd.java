package a;

/* JADX INFO: renamed from: a.vd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0429vd extends a.W1 {
    public AbstractC0429vd(a.InterfaceC0042a4<java.lang.Object> r2) {
            r1 = this;
            r1.<init>(r2)
            if (r2 == 0) goto L16
            a.x4 r2 = r2.c()
            a.W5 r0 = a.W5.f320a
            if (r2 != r0) goto Le
            goto L16
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Coroutines with restricted suspension must have EmptyCoroutineContext"
            r2.<init>(r0)
            throw r2
        L16:
            return
    }

    @Override // a.InterfaceC0042a4
    public final a.InterfaceC0456x4 c() {
            r1 = this;
            a.W5 r0 = a.W5.f320a
            return r0
    }
}
