package p000;

/* JADX INFO: renamed from: Oe */
/* JADX INFO: loaded from: classes.dex */
public final class C0623Oe implements InterfaceC0717Qm {

    /* JADX INFO: renamed from: a */
    public static final C0623Oe f1986a = null;

    /* JADX INFO: renamed from: b */
    public static final C2473ru f1987b = null;

    static {
        f1986a = new C0623Oe();
        f1987b = new C2473ru("kotlin.time.Duration", C2250mu.f7964o);
    }

    @Override // p000.InterfaceC0717Qm
    public final Object deserialize(InterfaceC0406Jc r5) {
        int r0 = C0537Me.f1749d;
        String r52 = r5.mo850y();
        return new C0537Me(AbstractC0628Oj.m1238b(r52));
    L6:
        e = move-exception;
        throw new IllegalArgumentException(AbstractC2374ph.m4814k("Invalid ISO duration string format: '", r52, "'."), e);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return f1987b;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of r16, Object r17) {
        long r0 = ((C0537Me) r17).f1750a;
        int r2 = C0537Me.f1749d;
        StringBuilder r3 = new StringBuilder();
        if (r0 >= 0) goto L5;
        r3.append('-');
    L5:
        r3.append("PT");
        boolean r6 = true;
        if (r0 >= 0) goto L8;
        long r7 = ((-(r0 >> 1)) << 1) + ((long) (((int) r0) & 1));
        int r22 = AbstractC0580Ne.f1877a;
    L9:
        long r9 = C0537Me.m1035f(r7, EnumC0666Pe.f2128f);
        if (C0537Me.m1033d(r7) == false) goto L12;
        long r162 = 0;
        int r23 = 0;
    L14:
        if (C0537Me.m1033d(r7) == false) goto L16;
        int r4 = 0;
    L17:
        int r5 = C0537Me.m1032c(r7);
        if (C0537Me.m1033d(r0) == false) goto L21;
        r9 = 9999999999999L;
    L21:
        if (r9 == r162) goto L23;
        boolean r02 = true;
    L24:
        if (r4 != 0) goto L28;
        if (r5 != 0) goto L28;
        boolean r1 = false;
    L29:
        if (r23 != 0) goto L34;
        if (r1 == false) goto L33;
        if (r02 == true) goto L34;
    L33:
        r6 = false;
    L34:
        if (r02 == false) goto L36;
        r3.append(r9);
        r3.append('H');
    L36:
        if (r6 == false) goto L38;
        r3.append(r23);
        r3.append('M');
    L38:
        if (r1 == true) goto L41;
        if (r02 == true) goto L43;
        if (r6 == false) goto L41;
    L43:
        throw null;
    L41:
        C0537Me.m1031b(r3, r4, r5, 9, "S", true);
    L28:
        r1 = true;
        goto L29
    L23:
        r02 = false;
        goto L24
    L16:
        r4 = (int) (C0537Me.m1035f(r7, EnumC0666Pe.f2126d) % ((long) 60));
        goto L17
    L12:
        r162 = 0;
        r23 = (int) (C0537Me.m1035f(r7, EnumC0666Pe.f2127e) % ((long) 60));
        goto L14
    L8:
        r7 = r0;
        goto L9
    }
}
