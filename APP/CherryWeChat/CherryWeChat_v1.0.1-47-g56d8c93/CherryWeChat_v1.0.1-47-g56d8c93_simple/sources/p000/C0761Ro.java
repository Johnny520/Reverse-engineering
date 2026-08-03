package p000;

/* JADX INFO: renamed from: Ro */
/* JADX INFO: loaded from: classes.dex */
public final class C0761Ro extends AbstractC0676Po {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1061Yn f2408a;

    public C0761Ro(InterfaceC1061Yn r6, C2709xE r7) {
        this.f2408a = r6;
        C2098jc r62 = C2098jc.f7385b;
        String r1 = C0719Qo.class.getCanonicalName();
        if (r1 == null) goto L17;
        String r12 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r1);
        AbstractC2580uE r2 = (AbstractC2580uE) r7.f9284a.get(r12);
        boolean r3 = C0719Qo.class.isInstance(r2);
        C0111Ci r4 = C0719Qo.f2303e;
        if (r3 == true) goto L14;
        C2557ts r22 = new C2557ts(r62);
        r22.m5044a(C1456gf.f5170n, r12);
        AbstractC2580uE r63 = r4.mo2563b(C0719Qo.class, r22);     // Catch: AbstractMethodError -> L10
    L9:
        r2 = r63;
        AbstractC2580uE r64 = (AbstractC2580uE) r7.f9284a.put(r12, r2);
        if (r64 == null) goto L14;
        r64.mo297b();
    L10:
        r63 = r4.mo171a(C0719Qo.class);
    L14:
        C0719Qo r23 = (C0719Qo) r2;
        return;
    L17:
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder(128);
        r0.append("LoaderManager{");
        r0.append(Integer.toHexString(System.identityHashCode(this)));
        r0.append(" in ");
        InterfaceC1061Yn r1 = this.f2408a;
        if (r1 != null) goto L5;
        r0.append("null");
    L11:
        r0.append("}}");
        return r0.toString();
    L5:
        String r2 = r1.getClass().getSimpleName();
        if (r2.length() > 0) goto L10;
        r2 = r1.getClass().getName();
        int r3 = r2.lastIndexOf(46);
        if (r3 <= 0) goto L10;
        r2 = r2.substring(r3 + 1);
    L10:
        r0.append(r2);
        r0.append('{');
        r0.append(Integer.toHexString(System.identityHashCode(r1)));
        goto L11
    }
}
