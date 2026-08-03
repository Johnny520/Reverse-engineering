package yf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g extends yf.a {
    public g(wf.c r2) {
            r1 = this;
            r1.<init>(r2)
            if (r2 == 0) goto L15
            wf.g r2 = r2.getContext()
            wf.h r0 = wf.h.f20786g
            if (r2 != r0) goto Le
            goto L15
        Le:
            java.lang.String r2 = "Coroutines with restricted suspension must have EmptyCoroutineContext"
            j8.o.t(r2)
            r2 = 0
            throw r2
        L15:
            return
    }

    @Override // wf.c
    public wf.g getContext() {
            r1 = this;
            wf.h r0 = wf.h.f20786g
            return r0
    }
}
