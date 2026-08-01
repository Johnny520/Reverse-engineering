package p000;

/* JADX INFO: renamed from: ke */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0408ke extends AbstractC0280h implements InterfaceC0481md {

    /* JADX INFO: renamed from: b */
    public static final C0371je f2885b = new C0371je(C0819vh.f4843b, C0332ie.f2422b);

    public AbstractC0408ke() {
        super(C0819vh.f4843b);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [cq, sm] */
    @Override // p000.AbstractC0280h, p000.InterfaceC0258ge
    /* JADX INFO: renamed from: b */
    public final InterfaceC0184ee mo1272b(InterfaceC0221fe interfaceC0221fe) {
        InterfaceC0184ee interfaceC0184ee;
        AbstractC0346ip.m1503o("key", interfaceC0221fe);
        if (interfaceC0221fe instanceof C0371je) {
            C0371je c0371je = (C0371je) interfaceC0221fe;
            InterfaceC0221fe interfaceC0221fe2 = this.f2179a;
            if ((interfaceC0221fe2 == c0371je || c0371je.f2620b == interfaceC0221fe2) && (interfaceC0184ee = (InterfaceC0184ee) c0371je.f2619a.mo96f(this)) != null) {
                return interfaceC0184ee;
            }
        } else if (C0819vh.f4843b == interfaceC0221fe) {
            return this;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo1598d(InterfaceC0258ge interfaceC0258ge, Runnable runnable);

    /* JADX INFO: renamed from: e */
    public boolean mo1605e() {
        return !(this instanceof n80);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (((p000.InterfaceC0184ee) r3.f2619a.mo96f(r2)) == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if (p000.C0819vh.f4843b == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        return p000.C0857wi.f4966a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        return r2;
     */
    /* JADX WARN: Type inference failed for: r3v3, types: [cq, sm] */
    @Override // p000.AbstractC0280h, p000.InterfaceC0258ge
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p000.InterfaceC0258ge mo1273g(p000.InterfaceC0221fe r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            p000.AbstractC0346ip.m1503o(r0, r3)
            boolean r0 = r3 instanceof p000.C0371je
            if (r0 == 0) goto L20
            je r3 = (p000.C0371je) r3
            fe r0 = r2.f2179a
            if (r0 == r3) goto L15
            fe r1 = r3.f2620b
            if (r1 != r0) goto L14
            goto L15
        L14:
            return r2
        L15:
            cq r3 = r3.f2619a
            java.lang.Object r3 = r3.mo96f(r2)
            ee r3 = (p000.InterfaceC0184ee) r3
            if (r3 == 0) goto L27
            goto L24
        L20:
            vh r0 = p000.C0819vh.f4843b
            if (r0 != r3) goto L27
        L24:
            wi r3 = p000.C0857wi.f4966a
            return r3
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0408ke.mo1273g(fe):ge");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0222ff.m1197s(this);
    }
}
