package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7242<T> extends AbstractC2980<T> implements InterfaceC4246 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public final InterfaceC4199<T> f21885;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥ۟ۧۤۢ<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7242(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        super(interfaceC4225, true, true);
        this.f21885 = interfaceC4199;
    }

    @Override // Yue.InterfaceC4246
    @InterfaceC6489
    public final InterfaceC4246 getCallerFrame() {
        InterfaceC4199<T> interfaceC4199 = this.f21885;
        if (interfaceC4199 instanceof InterfaceC4246) {
            return (InterfaceC4246) interfaceC4199;
        }
        return null;
    }

    @Override // Yue.InterfaceC4246
    @InterfaceC6489
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // Yue.C5557
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    public void mo9504(@InterfaceC6489 Object obj) {
        C4417.m12840(C5501.m17135(this.f21885), C4056.m1009(obj, this.f21885), null, 2, null);
    }

    @Override // Yue.C5557
    /* JADX INFO: renamed from: ۥ۟۟ۧ */
    public final boolean mo9505() {
        return true;
    }

    @Override // Yue.AbstractC2980
    /* JADX INFO: renamed from: ۥ۟۠۟ۧ */
    public void mo5778(@InterfaceC6489 Object obj) {
        InterfaceC4199<T> interfaceC4199 = this.f21885;
        interfaceC4199.resumeWith(C4056.m1009(obj, interfaceC4199));
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public final InterfaceC5542 m22679() {
        InterfaceC3814 interfaceC3814M17272 = m17272();
        if (interfaceC3814M17272 != null) {
            return interfaceC3814M17272.getParent();
        }
        return null;
    }
}
