package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y0 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2692g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h.Hchat.hooks.items.script.ScriptWaBridge f2693h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.function.Consumer f2694i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2695j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2696k;

    public /* synthetic */ y0(h.Hchat.hooks.items.script.ScriptWaBridge r2, java.util.function.Consumer r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            r0 = 1
            r1.f2692g = r0
            r1.<init>()
            r1.f2693h = r2
            r1.f2694i = r3
            r1.f2695j = r4
            r1.f2696k = r5
            return
    }

    public /* synthetic */ y0(java.util.function.Consumer r2, h.Hchat.hooks.items.script.ScriptWaBridge r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            r0 = 0
            r1.f2692g = r0
            r1.<init>()
            r1.f2694i = r2
            r1.f2693h = r3
            r1.f2695j = r4
            r1.f2696k = r5
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r4 = this;
            int r0 = r4.f2692g
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = r4.f2695j
            java.lang.String r1 = r4.f2696k
            h.Hchat.hooks.items.script.ScriptWaBridge r2 = r4.f2693h
            java.util.function.Consumer r3 = r4.f2694i
            sf.n r0 = h.Hchat.hooks.items.script.ScriptWaBridge.k(r2, r3, r0, r1)
            return r0
        L12:
            java.lang.String r0 = r4.f2695j
            java.lang.String r1 = r4.f2696k
            h.Hchat.hooks.items.script.ScriptWaBridge r2 = r4.f2693h
            java.util.function.Consumer r3 = r4.f2694i
            sf.n r0 = h.Hchat.hooks.items.script.ScriptWaBridge.K(r2, r3, r0, r1)
            return r0
    }
}
