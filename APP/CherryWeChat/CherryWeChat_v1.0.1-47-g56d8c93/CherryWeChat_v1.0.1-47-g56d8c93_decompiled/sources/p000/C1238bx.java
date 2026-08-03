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

    public C1238bx(String str, C1194ax c1194ax) {
        this.f4207a = str;
        this.f4208b = c1194ax;
    }

    @Override // p000.InterfaceC0889Un
    public final void onStateChanged(InterfaceC1061Yn interfaceC1061Yn, EnumC0632On enumC0632On) {
        if (enumC0632On == EnumC0632On.ON_DESTROY) {
            this.f4209c = false;
            interfaceC1061Yn.getLifecycle().mo1556b(this);
        }
    }
}
