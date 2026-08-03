package p222p;

import p018b3.C0171a;
import p091g3.C1332r0;
import p117i0.AbstractC1874r;
import p117i0.C1845j1;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;

/* JADX INFO: renamed from: p.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3202b implements InterfaceC3252r1 {

    /* JADX INFO: renamed from: a */
    public final int f10236a;

    /* JADX INFO: renamed from: b */
    public final String f10237b;

    /* JADX INFO: renamed from: c */
    public final C1845j1 f10238c = AbstractC1874r.m4639u(C0171a.f444e);

    /* JADX INFO: renamed from: d */
    public final C1845j1 f10239d = AbstractC1874r.m4639u(Boolean.TRUE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3202b(int i9, String str) {
        this.f10236a = i9;
        this.f10237b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3252r1
    /* JADX INFO: renamed from: a */
    public final int mo6854a(InterfaceC4233c interfaceC4233c, EnumC4243m enumC4243m) {
        return m6858e().f447c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3252r1
    /* JADX INFO: renamed from: b */
    public final int mo6855b(InterfaceC4233c interfaceC4233c) {
        return m6858e().f448d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3252r1
    /* JADX INFO: renamed from: c */
    public final int mo6856c(InterfaceC4233c interfaceC4233c, EnumC4243m enumC4243m) {
        return m6858e().f445a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3252r1
    /* JADX INFO: renamed from: d */
    public final int mo6857d(InterfaceC4233c interfaceC4233c) {
        return m6858e().f446b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final C0171a m6858e() {
        return (C0171a) this.f10238c.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3202b) {
            return this.f10236a == ((C3202b) obj).f10236a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m6859f(boolean z9) {
        this.f10239d.setValue(Boolean.valueOf(z9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m6860g(C1332r0 c1332r0, int i9) {
        int i10 = this.f10236a;
        if (i9 == 0 || (i9 & i10) != 0) {
            this.f10238c.setValue(c1332r0.f4398a.mo3501g(i10));
            m6859f(c1332r0.f4398a.mo3506q(i10));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10236a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f10237b);
        sb2.append('(');
        sb2.append(m6858e().f445a);
        sb2.append(", ");
        sb2.append(m6858e().f446b);
        sb2.append(", ");
        sb2.append(m6858e().f447c);
        sb2.append(", ");
        return AbstractC3199a.m6841n(sb2, m6858e().f448d, ')');
    }
}
