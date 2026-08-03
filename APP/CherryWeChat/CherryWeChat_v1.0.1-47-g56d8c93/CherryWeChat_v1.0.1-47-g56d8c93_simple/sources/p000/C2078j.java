package p000;

/* JADX INFO: renamed from: j */
/* JADX INFO: loaded from: classes.dex */
public final class C2078j {

    /* JADX INFO: renamed from: a */
    public final String f7335a;

    /* JADX INFO: renamed from: b */
    public final String f7336b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0884Ui f7337c;

    public C2078j(String r3, String r4, InterfaceC0884Ui r5) {
        AbstractC0295Gu.m625r(-817010153879605L);
        AbstractC0295Gu.m625r(-817035923683381L);
        this.f7335a = r3;
        this.f7336b = r4;
        this.f7337c = r5;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C2078j) == true) goto L8;
        return false;
    L8:
        C2078j r52 = (C2078j) r5;
        if (AbstractC0585Nj.m1134a(this.f7335a, r52.f7335a) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.f7336b, r52.f7336b) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.f7337c, r52.f7337c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r0 = this.f7335a.hashCode() * 31;
        int r02 = AbstractC2374ph.m4810g(this.f7336b, r0, 31);
        InterfaceC0884Ui r1 = this.f7337c;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(AbstractC0295Gu.m625r(-817164772702261L));
        AbstractC2374ph.m4817n(r0, this.f7335a, -817783247992885L);
        AbstractC2374ph.m4817n(r0, this.f7336b, -817847672502325L);
        r0.append(this.f7337c);
        r0.append(')');
        return r0.toString();
    }
}
