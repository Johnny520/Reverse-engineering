package p000;

/* JADX INFO: renamed from: h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0280h implements InterfaceC0184ee {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0221fe f2179a;

    public AbstractC0280h(InterfaceC0221fe interfaceC0221fe) {
        this.f2179a = interfaceC0221fe;
    }

    @Override // p000.InterfaceC0258ge
    /* JADX INFO: renamed from: b */
    public InterfaceC0184ee mo1272b(InterfaceC0221fe interfaceC0221fe) {
        AbstractC0346ip.m1503o("key", interfaceC0221fe);
        if (AbstractC0346ip.m1497i(getKey(), interfaceC0221fe)) {
            return this;
        }
        return null;
    }

    @Override // p000.InterfaceC0258ge
    /* JADX INFO: renamed from: g */
    public InterfaceC0258ge mo1273g(InterfaceC0221fe interfaceC0221fe) {
        return AbstractC0222ff.m1159B(this, interfaceC0221fe);
    }

    @Override // p000.InterfaceC0184ee
    public final InterfaceC0221fe getKey() {
        return this.f2179a;
    }

    @Override // p000.InterfaceC0258ge
    /* JADX INFO: renamed from: h */
    public final Object mo1274h(Object obj, InterfaceC0861wm interfaceC0861wm) {
        return interfaceC0861wm.mo472e(obj, this);
    }

    @Override // p000.InterfaceC0258ge
    /* JADX INFO: renamed from: i */
    public final InterfaceC0258ge mo1275i(InterfaceC0258ge interfaceC0258ge) {
        return AbstractC0222ff.m1161E(this, interfaceC0258ge);
    }
}
