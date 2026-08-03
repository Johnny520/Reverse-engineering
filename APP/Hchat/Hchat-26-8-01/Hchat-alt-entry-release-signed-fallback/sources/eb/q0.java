package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q0 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.function.Consumer f2634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h.Hchat.hooks.items.script.ScriptWaBridge f2635i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2636j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f2637k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f2638l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2639m;

    public /* synthetic */ q0(java.util.function.Consumer r2, h.Hchat.hooks.items.script.ScriptWaBridge r3, java.lang.String r4, java.lang.String r5, java.util.Map r6, long r7) {
            r1 = this;
            r0 = 1
            r1.f2633g = r0
            r1.<init>()
            r1.f2634h = r2
            r1.f2635i = r3
            r1.f2636j = r4
            r1.f2639m = r5
            r1.f2637k = r6
            r1.f2638l = r7
            return
    }

    public /* synthetic */ q0(java.util.function.Consumer r2, h.Hchat.hooks.items.script.ScriptWaBridge r3, java.lang.String r4, java.util.Map r5, java.util.Map r6, long r7) {
            r1 = this;
            r0 = 0
            r1.f2633g = r0
            r1.<init>()
            r1.f2634h = r2
            r1.f2635i = r3
            r1.f2636j = r4
            r1.f2637k = r5
            r1.f2639m = r6
            r1.f2638l = r7
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r8 = this;
            int r0 = r8.f2633g
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r8.f2639m
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            java.util.Map r5 = r8.f2637k
            long r6 = r8.f2638l
            java.util.function.Consumer r1 = r8.f2634h
            h.Hchat.hooks.items.script.ScriptWaBridge r2 = r8.f2635i
            java.lang.String r3 = r8.f2636j
            sf.n r0 = h.Hchat.hooks.items.script.ScriptWaBridge.C(r1, r2, r3, r4, r5, r6)
            return r0
        L19:
            java.lang.Object r0 = r8.f2639m
            r5 = r0
            java.util.Map r5 = (java.util.Map) r5
            long r6 = r8.f2638l
            java.util.function.Consumer r1 = r8.f2634h
            h.Hchat.hooks.items.script.ScriptWaBridge r2 = r8.f2635i
            java.lang.String r3 = r8.f2636j
            java.util.Map r4 = r8.f2637k
            sf.n r0 = h.Hchat.hooks.items.script.ScriptWaBridge.o(r1, r2, r3, r4, r5, r6)
            return r0
    }
}
