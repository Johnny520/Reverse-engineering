package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C8102<T> extends C7242<T> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public ThreadLocal<C6599<InterfaceC4225, Object>> f24030;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8102(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        C8104 c8104 = C8104.f24031;
        super(interfaceC4225.get(c8104) == null ? interfaceC4225.plus(c8104) : interfaceC4225, interfaceC4199);
        this.f24030 = new ThreadLocal<>();
        if (interfaceC4199.getContext().get(InterfaceC4202.f8519) instanceof AbstractC4232) {
            return;
        }
        Object objM24718 = C7776.m24718(interfaceC4225, null);
        C7776.m3874(interfaceC4225, objM24718);
        m26702(interfaceC4225, objM24718);
    }

    @Override // Yue.C7242, Yue.AbstractC2980
    /* JADX INFO: renamed from: ۥ۟۠۟ۧ */
    public void mo5778(@InterfaceC6489 Object obj) {
        C6599<InterfaceC4225, Object> c6599 = this.f24030.get();
        if (c6599 != null) {
            C7776.m3874(c6599.m3062(), c6599.m3063());
            this.f24030.set(null);
        }
        Object objM1009 = C4056.m1009(obj, this.f21885);
        InterfaceC4199<T> interfaceC4199 = this.f21885;
        InterfaceC4225 context = interfaceC4199.getContext();
        Object objM24718 = C7776.m24718(context, null);
        C8102<?> c8102M12167 = objM24718 != C7776.f3074 ? C4230.m12167(interfaceC4199, context, objM24718) : null;
        try {
            this.f21885.resumeWith(objM1009);
            C8107 c8107 = C8107.f3222;
        } finally {
            if (c8102M12167 == null || c8102M12167.m26701()) {
                C7776.m3874(context, objM24718);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public final boolean m26701() {
        if (this.f24030.get() == null) {
            return false;
        }
        this.f24030.set(null);
        return true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public final void m26702(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6489 Object obj) {
        this.f24030.set(C8003.m4014(interfaceC4225, obj));
    }
}
