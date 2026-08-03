package d8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h.Hchat.ModuleEntry f2073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ de.robv.android.xposed.XC_MethodHook.MethodHookParam f2074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f2075j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam f2076k;

    public /* synthetic */ a(h.Hchat.ModuleEntry r1, de.robv.android.xposed.XC_MethodHook.MethodHookParam r2, android.content.Context r3, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r4, int r5) {
            r0 = this;
            r0.f2072g = r5
            r0.f2073h = r1
            r0.f2074i = r2
            r0.f2075j = r3
            r0.f2076k = r4
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.f2072g
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            android.content.Context r0 = r4.f2075j
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r1 = r4.f2076k
            h.Hchat.ModuleEntry r2 = r4.f2073h
            de.robv.android.xposed.XC_MethodHook$MethodHookParam r3 = r4.f2074i
            h.Hchat.ModuleEntry.a(r2, r3, r0, r1)
            return
        L11:
            android.content.Context r0 = r4.f2075j
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r1 = r4.f2076k
            h.Hchat.ModuleEntry r2 = r4.f2073h
            de.robv.android.xposed.XC_MethodHook$MethodHookParam r3 = r4.f2074i
            h.Hchat.ModuleEntry.e(r2, r3, r0, r1)
            return
    }
}
