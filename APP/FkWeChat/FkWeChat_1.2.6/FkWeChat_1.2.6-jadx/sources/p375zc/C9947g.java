package p375zc;

import bd.AbstractC1109b;
import p024b9.AbstractC1061t;
import p376zd.C9987e;
import p376zd.C9994h0;

/* JADX INFO: renamed from: zc.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9947g {

    /* JADX INFO: renamed from: a */
    public boolean f33501a;

    /* JADX INFO: renamed from: b */
    public boolean f33502b;

    /* JADX INFO: renamed from: c */
    public boolean f33503c;

    /* JADX INFO: renamed from: d */
    public boolean f33504d;

    /* JADX INFO: renamed from: e */
    public boolean f33505e;

    /* JADX INFO: renamed from: f */
    public String f33506f;

    /* JADX INFO: renamed from: g */
    public boolean f33507g;

    /* JADX INFO: renamed from: h */
    public String f33508h;

    /* JADX INFO: renamed from: i */
    public EnumC9935a f33509i;

    /* JADX INFO: renamed from: j */
    public boolean f33510j;

    /* JADX INFO: renamed from: k */
    public boolean f33511k;

    /* JADX INFO: renamed from: l */
    public boolean f33512l;

    /* JADX INFO: renamed from: m */
    public boolean f33513m;

    /* JADX INFO: renamed from: n */
    public boolean f33514n;

    /* JADX INFO: renamed from: o */
    public boolean f33515o;

    /* JADX INFO: renamed from: p */
    public boolean f33516p;

    /* JADX INFO: renamed from: q */
    public AbstractC1109b f33517q;

    public C9947g(AbstractC9939c abstractC9939c) {
        abstractC9939c.getClass();
        this.f33501a = abstractC9939c.m38514f().m38556i();
        this.f33502b = abstractC9939c.m38514f().m38557j();
        this.f33503c = abstractC9939c.m38514f().m38558k();
        this.f33504d = abstractC9939c.m38514f().m38564q();
        this.f33505e = abstractC9939c.m38514f().m38560m();
        this.f33506f = abstractC9939c.m38514f().m38561n();
        this.f33507g = abstractC9939c.m38514f().m38554g();
        this.f33508h = abstractC9939c.m38514f().m38552e();
        this.f33509i = abstractC9939c.m38514f().m38553f();
        this.f33510j = abstractC9939c.m38514f().m38562o();
        abstractC9939c.m38514f().m38559l();
        this.f33511k = abstractC9939c.m38514f().m38555h();
        this.f33512l = abstractC9939c.m38514f().m38551d();
        this.f33513m = abstractC9939c.m38514f().m38548a();
        this.f33514n = abstractC9939c.m38514f().m38549b();
        this.f33515o = abstractC9939c.m38514f().m38550c();
        this.f33516p = abstractC9939c.m38514f().m38563p();
        this.f33517q = abstractC9939c.mo33269a();
    }

    /* JADX INFO: renamed from: a */
    public final C9951i m38528a() {
        if (this.f33516p) {
            if (!AbstractC1061t.m3842c(this.f33508h, "type")) {
                C9987e.m38645a("Class discriminator should not be specified when array polymorphism is specified");
                return null;
            }
            if (this.f33509i != EnumC9935a.f33474s) {
                C9987e.m38645a("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
                return null;
            }
        }
        boolean z10 = this.f33505e;
        String str = this.f33506f;
        if (z10) {
            if (!AbstractC1061t.m3842c(str, "    ")) {
                String str2 = this.f33506f;
                for (int i10 = 0; i10 < str2.length(); i10++) {
                    char cCharAt = str2.charAt(i10);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        C9994h0.m38667a("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ", this.f33506f);
                        return null;
                    }
                }
            }
        } else if (!AbstractC1061t.m3842c(str, "    ")) {
            C9987e.m38645a("Indent should not be specified when default printing mode is used");
            return null;
        }
        return new C9951i(this.f33501a, this.f33503c, this.f33504d, this.f33515o, this.f33505e, this.f33502b, this.f33506f, this.f33507g, this.f33516p, this.f33508h, this.f33514n, this.f33510j, null, this.f33511k, this.f33512l, this.f33513m, this.f33509i);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC1109b m38529b() {
        return this.f33517q;
    }

    /* JADX INFO: renamed from: c */
    public final void m38530c(boolean z10) {
        this.f33514n = z10;
    }

    /* JADX INFO: renamed from: d */
    public final void m38531d(boolean z10) {
        this.f33515o = z10;
    }

    /* JADX INFO: renamed from: e */
    public final void m38532e(EnumC9935a enumC9935a) {
        enumC9935a.getClass();
        this.f33509i = enumC9935a;
    }

    /* JADX INFO: renamed from: f */
    public final void m38533f(boolean z10) {
        this.f33501a = z10;
    }

    /* JADX INFO: renamed from: g */
    public final void m38534g(boolean z10) {
        this.f33502b = z10;
    }

    /* JADX INFO: renamed from: h */
    public final void m38535h(boolean z10) {
        this.f33503c = z10;
    }

    /* JADX INFO: renamed from: i */
    public final void m38536i(boolean z10) {
        this.f33504d = z10;
    }

    /* JADX INFO: renamed from: j */
    public final void m38537j(boolean z10) {
        this.f33505e = z10;
    }

    /* JADX INFO: renamed from: k */
    public final void m38538k(boolean z10) {
        this.f33516p = z10;
    }
}
