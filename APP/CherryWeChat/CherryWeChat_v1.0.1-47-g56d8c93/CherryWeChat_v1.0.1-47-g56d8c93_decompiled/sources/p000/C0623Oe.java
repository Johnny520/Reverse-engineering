package p000;

/* JADX INFO: renamed from: Oe */
/* JADX INFO: loaded from: classes.dex */
public final class C0623Oe implements InterfaceC0717Qm {

    /* JADX INFO: renamed from: a */
    public static final C0623Oe f1986a = new C0623Oe();

    /* JADX INFO: renamed from: b */
    public static final C2473ru f1987b = new C2473ru("kotlin.time.Duration", C2250mu.f7964o);

    @Override // p000.InterfaceC0717Qm
    public final Object deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        int i = C0537Me.f1749d;
        String strMo850y = interfaceC0406Jc.mo850y();
        try {
            return new C0537Me(AbstractC0628Oj.m1238b(strMo850y));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(AbstractC2374ph.m4814k("Invalid ISO duration string format: '", strMo850y, "'."), e);
        }
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return f1987b;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, Object obj) {
        long j;
        long j2;
        int iM1035f;
        long j3 = ((C0537Me) obj).f1750a;
        int i = C0537Me.f1749d;
        StringBuilder sb = new StringBuilder();
        if (j3 < 0) {
            sb.append('-');
        }
        sb.append("PT");
        boolean z = true;
        if (j3 < 0) {
            j = ((-(j3 >> 1)) << 1) + ((long) (((int) j3) & 1));
            int i2 = AbstractC0580Ne.f1877a;
        } else {
            j = j3;
        }
        long jM1035f = C0537Me.m1035f(j, EnumC0666Pe.HOURS);
        if (C0537Me.m1033d(j)) {
            j2 = 0;
            iM1035f = 0;
        } else {
            j2 = 0;
            iM1035f = (int) (C0537Me.m1035f(j, EnumC0666Pe.MINUTES) % ((long) 60));
        }
        int iM1035f2 = C0537Me.m1033d(j) ? 0 : (int) (C0537Me.m1035f(j, EnumC0666Pe.SECONDS) % ((long) 60));
        int iM1032c = C0537Me.m1032c(j);
        if (C0537Me.m1033d(j3)) {
            jM1035f = 9999999999999L;
        }
        boolean z2 = jM1035f != j2;
        boolean z3 = (iM1035f2 == 0 && iM1032c == 0) ? false : true;
        if (iM1035f == 0 && (!z3 || !z2)) {
            z = false;
        }
        if (z2) {
            sb.append(jM1035f);
            sb.append('H');
        }
        if (z) {
            sb.append(iM1035f);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            C0537Me.m1031b(sb, iM1035f2, iM1032c, 9, "S", true);
        }
        throw null;
    }
}
