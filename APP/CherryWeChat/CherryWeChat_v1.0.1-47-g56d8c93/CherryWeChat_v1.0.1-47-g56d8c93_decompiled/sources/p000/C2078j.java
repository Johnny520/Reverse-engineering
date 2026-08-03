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

    public C2078j(String str, String str2, InterfaceC0884Ui interfaceC0884Ui) {
        AbstractC0295Gu.m625r(-817010153879605L);
        AbstractC0295Gu.m625r(-817035923683381L);
        this.f7335a = str;
        this.f7336b = str2;
        this.f7337c = interfaceC0884Ui;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2078j)) {
            return false;
        }
        C2078j c2078j = (C2078j) obj;
        return AbstractC0585Nj.m1134a(this.f7335a, c2078j.f7335a) && AbstractC0585Nj.m1134a(this.f7336b, c2078j.f7336b) && AbstractC0585Nj.m1134a(this.f7337c, c2078j.f7337c);
    }

    public final int hashCode() {
        int iM4810g = AbstractC2374ph.m4810g(this.f7336b, this.f7335a.hashCode() * 31, 31);
        InterfaceC0884Ui interfaceC0884Ui = this.f7337c;
        return iM4810g + (interfaceC0884Ui == null ? 0 : interfaceC0884Ui.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0295Gu.m625r(-817164772702261L));
        AbstractC2374ph.m4817n(sb, this.f7335a, -817783247992885L);
        AbstractC2374ph.m4817n(sb, this.f7336b, -817847672502325L);
        sb.append(this.f7337c);
        sb.append(')');
        return sb.toString();
    }
}
