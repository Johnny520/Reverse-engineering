package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class du2 implements x93 {

    /* JADX INFO: renamed from: h */
    public final x93 f2229h;

    /* JADX INFO: renamed from: i */
    public final long f2230i;

    public du2(x93 x93Var, long j) {
        this.f2229h = x93Var;
        this.f2230i = j;
    }

    @Override // p000.x93
    /* JADX INFO: renamed from: a */
    public final boolean mo121a() {
        return this.f2229h.mo121a();
    }

    @Override // p000.x93
    /* JADX INFO: renamed from: b */
    public final long mo1171b(AbstractC0494nd abstractC0494nd, AbstractC0494nd abstractC0494nd2, AbstractC0494nd abstractC0494nd3) {
        return this.f2229h.mo1171b(abstractC0494nd, abstractC0494nd2, abstractC0494nd3) + this.f2230i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof du2)) {
            return false;
        }
        du2 du2Var = (du2) obj;
        return du2Var.f2230i == this.f2230i && t11.m5086l(du2Var.f2229h, this.f2229h);
    }

    public final int hashCode() {
        return Long.hashCode(this.f2230i) + (this.f2229h.hashCode() * 31);
    }

    @Override // p000.x93
    /* JADX INFO: renamed from: q */
    public final AbstractC0494nd mo737q(long j, AbstractC0494nd abstractC0494nd, AbstractC0494nd abstractC0494nd2, AbstractC0494nd abstractC0494nd3) {
        long j2 = this.f2230i;
        return j < j2 ? abstractC0494nd3 : this.f2229h.mo737q(j - j2, abstractC0494nd, abstractC0494nd2, abstractC0494nd3);
    }

    @Override // p000.x93
    /* JADX INFO: renamed from: s */
    public final AbstractC0494nd mo739s(long j, AbstractC0494nd abstractC0494nd, AbstractC0494nd abstractC0494nd2, AbstractC0494nd abstractC0494nd3) {
        long j2 = this.f2230i;
        return j < j2 ? abstractC0494nd : this.f2229h.mo739s(j - j2, abstractC0494nd, abstractC0494nd2, abstractC0494nd3);
    }
}
