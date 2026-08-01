package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class co1 extends p000.AbstractC0715q8 {
    public co1(p000.InterfaceC0631op r1) {
            r0 = this;
            r0.<init>(r1)
            if (r1 == 0) goto L15
            up r0 = r1.mo72()
            hz r1 = p000.C0377hz.f4846
            if (r0 != r1) goto Le
            goto L15
        Le:
            java.lang.String r0 = "Coroutines with restricted suspension must have EmptyCoroutineContext"
            p000.C1080.m7275(r0)
            r0 = 0
            throw r0
        L15:
            return
    }

    @Override // p000.InterfaceC0631op
    /* JADX INFO: renamed from: γ */
    public final p000.InterfaceC0880up mo72() {
            r0 = this;
            hz r0 = p000.C0377hz.f4846
            return r0
    }
}
