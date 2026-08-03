package p000;

/* JADX INFO: renamed from: U2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0862U2 {

    /* JADX INFO: renamed from: a */
    public final boolean f2721a;

    /* JADX INFO: renamed from: b */
    public final String f2722b;

    /* JADX INFO: renamed from: c */
    public final String f2723c;

    /* JADX INFO: renamed from: d */
    public final Integer f2724d;

    /* JADX INFO: renamed from: e */
    public final C0819T2 f2725e;

    public /* synthetic */ C0862U2(String r7, boolean r8) {
        this(r8, r7, null, null, null);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0862U2) == true) goto L8;
        return false;
    L8:
        C0862U2 r52 = (C0862U2) r5;
        if (this.f2721a == r52.f2721a) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.f2722b, r52.f2722b) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.f2723c, r52.f2723c) == true) goto L18;
        return false;
    L18:
        if (AbstractC0585Nj.m1134a(this.f2724d, r52.f2724d) == true) goto L21;
        return false;
    L21:
        if (AbstractC0585Nj.m1134a(this.f2725e, r52.f2725e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public final int hashCode() {
        int r0 = AbstractC2374ph.m4810g(this.f2722b, Boolean.hashCode(this.f2721a) * 31, 31);
        int r2 = 0;
        String r3 = this.f2723c;
        if (r3 != null) goto L5;
        int r32 = 0;
    L6:
        int r02 = (r0 + r32) * 31;
        Integer r33 = this.f2724d;
        if (r33 != null) goto L9;
        int r34 = 0;
    L10:
        int r03 = (r02 + r34) * 31;
        C0819T2 r1 = this.f2725e;
        if (r1 == null) goto L15;
        r2 = r1.hashCode();
    L15:
        return r03 + r2;
    L9:
        r34 = r33.hashCode();
        goto L10
    L5:
        r32 = r3.hashCode();
        goto L6
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(AbstractC0295Gu.m625r(-395471998679093L));
        r0.append(this.f2721a);
        r0.append(AbstractC0295Gu.m625r(-393917220517941L));
        AbstractC2374ph.m4817n(r0, this.f2722b, -393964465158197L);
        AbstractC2374ph.m4817n(r0, this.f2723c, -393998824896565L);
        r0.append(this.f2724d);
        r0.append(AbstractC0295Gu.m625r(-394054659471413L));
        r0.append(this.f2725e);
        r0.append(')');
        return r0.toString();
    }

    public C0862U2(boolean r3, String r4, String r5, Integer r6, C0819T2 r7) {
        AbstractC0295Gu.m625r(-395403279202357L);
        this.f2721a = r3;
        this.f2722b = r4;
        this.f2723c = r5;
        this.f2724d = r6;
        this.f2725e = r7;
    }
}
