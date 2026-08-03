package p000;

/* JADX INFO: renamed from: t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2522t implements InterfaceC0717Qm {
    /* JADX INFO: renamed from: a */
    public abstract Object mo544a();

    /* JADX INFO: renamed from: b */
    public abstract int mo545b(Object r1);

    /* JADX INFO: renamed from: c */
    public abstract int mo182c(Object r1);

    /* JADX INFO: renamed from: d */
    public final Object m5004d(InterfaceC0406Jc r5) {
        Object r0 = mo544a();
        int r1 = mo545b(r0);
        InterfaceC0919Va r52 = r5.mo839B(getDescriptor());
    L3:
        int r2 = r52.mo1770j(getDescriptor());
        if (r2 == (-1)) goto L6;
        mo183e(r52, r2 + r1, r0);
        goto L3
    L6:
        r52.mo1777r(getDescriptor());
        return mo546g(r0);
    }

    @Override // p000.InterfaceC0717Qm
    public Object deserialize(InterfaceC0406Jc r1) {
        return m5004d(r1);
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo183e(InterfaceC0919Va r1, int r2, Object r3);

    /* JADX INFO: renamed from: f */
    public abstract Object mo184f(Object r1);

    /* JADX INFO: renamed from: g */
    public abstract Object mo546g(Object r1);
}
