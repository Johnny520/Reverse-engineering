package p000;

/* JADX INFO: renamed from: bx */
/* JADX INFO: loaded from: classes.dex */
public final class C1238bx implements InterfaceC0889Un {

    /* JADX INFO: renamed from: a */
    public final String f4207a;

    /* JADX INFO: renamed from: b */
    public final C1194ax f4208b;

    /* JADX INFO: renamed from: c */
    public boolean f4209c;

    public C1238bx(String r1, C1194ax r2) {
        this.f4207a = r1;
        this.f4208b = r2;
    }

    @Override // p000.InterfaceC0889Un
    public final void onStateChanged(InterfaceC1061Yn r2, EnumC0632On r3) {
        if (r3 != EnumC0632On.ON_DESTROY) goto L6;
        this.f4209c = false;
        r2.getLifecycle().mo1556b(this);
        return;
    }
}
