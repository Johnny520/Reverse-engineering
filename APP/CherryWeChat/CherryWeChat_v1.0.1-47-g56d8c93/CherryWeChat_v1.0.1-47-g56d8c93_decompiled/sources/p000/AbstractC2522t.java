package p000;

/* JADX INFO: renamed from: t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2522t implements InterfaceC0717Qm {
    /* JADX INFO: renamed from: a */
    public abstract Object mo544a();

    /* JADX INFO: renamed from: b */
    public abstract int mo545b(Object obj);

    /* JADX INFO: renamed from: c */
    public abstract int mo182c(Object obj);

    /* JADX INFO: renamed from: d */
    public final Object m5004d(InterfaceC0406Jc interfaceC0406Jc) {
        Object objMo544a = mo544a();
        int iMo545b = mo545b(objMo544a);
        InterfaceC0919Va interfaceC0919VaMo839B = interfaceC0406Jc.mo839B(getDescriptor());
        while (true) {
            int iMo1770j = interfaceC0919VaMo839B.mo1770j(getDescriptor());
            if (iMo1770j == -1) {
                interfaceC0919VaMo839B.mo1777r(getDescriptor());
                return mo546g(objMo544a);
            }
            mo183e(interfaceC0919VaMo839B, iMo1770j + iMo545b, objMo544a);
        }
    }

    @Override // p000.InterfaceC0717Qm
    public Object deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        return m5004d(interfaceC0406Jc);
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo183e(InterfaceC0919Va interfaceC0919Va, int i, Object obj);

    /* JADX INFO: renamed from: f */
    public abstract Object mo184f(Object obj);

    /* JADX INFO: renamed from: g */
    public abstract Object mo546g(Object obj);
}
