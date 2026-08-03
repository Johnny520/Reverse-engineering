package p000;

/* JADX INFO: renamed from: Ro */
/* JADX INFO: loaded from: classes.dex */
public final class C0761Ro extends AbstractC0676Po {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1061Yn f2408a;

    public C0761Ro(InterfaceC1061Yn interfaceC1061Yn, C2709xE c2709xE) {
        AbstractC2580uE abstractC2580uEMo171a;
        this.f2408a = interfaceC1061Yn;
        C2098jc c2098jc = C2098jc.f7385b;
        String canonicalName = C0719Qo.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        String strConcat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
        AbstractC2580uE abstractC2580uE = (AbstractC2580uE) c2709xE.f9284a.get(strConcat);
        boolean zIsInstance = C0719Qo.class.isInstance(abstractC2580uE);
        C0111Ci c0111Ci = C0719Qo.f2303e;
        if (!zIsInstance) {
            C2557ts c2557ts = new C2557ts(c2098jc);
            c2557ts.m5044a(C1456gf.f5170n, strConcat);
            try {
                abstractC2580uEMo171a = c0111Ci.mo2563b(C0719Qo.class, c2557ts);
            } catch (AbstractMethodError unused) {
                abstractC2580uEMo171a = c0111Ci.mo171a(C0719Qo.class);
            }
            abstractC2580uE = abstractC2580uEMo171a;
            AbstractC2580uE abstractC2580uE2 = (AbstractC2580uE) c2709xE.f9284a.put(strConcat, abstractC2580uE);
            if (abstractC2580uE2 != null) {
                abstractC2580uE2.mo297b();
            }
        }
    }

    public final String toString() {
        int iLastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        InterfaceC1061Yn interfaceC1061Yn = this.f2408a;
        if (interfaceC1061Yn == null) {
            sb.append("null");
        } else {
            String simpleName = interfaceC1061Yn.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = interfaceC1061Yn.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(iLastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            sb.append(Integer.toHexString(System.identityHashCode(interfaceC1061Yn)));
        }
        sb.append("}}");
        return sb.toString();
    }
}
