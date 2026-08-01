package p319w2;

import java.util.List;
import p004a3.AbstractC0042h;
import p004a3.InterfaceC0040g;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p104h3.AbstractC2869v;
import p121i3.C3173c;
import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;

/* JADX INFO: renamed from: w2.p3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9117p3 {

    /* JADX INFO: renamed from: a */
    public final C9058e f31167a;

    /* JADX INFO: renamed from: b */
    public final C9147v3 f31168b;

    /* JADX INFO: renamed from: c */
    public final List f31169c;

    /* JADX INFO: renamed from: d */
    public final int f31170d;

    /* JADX INFO: renamed from: e */
    public final boolean f31171e;

    /* JADX INFO: renamed from: f */
    public final int f31172f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC3175e f31173g;

    /* JADX INFO: renamed from: h */
    public final EnumC3191u f31174h;

    /* JADX INFO: renamed from: i */
    public final AbstractC0042h.b f31175i;

    /* JADX INFO: renamed from: j */
    public final long f31176j;

    /* JADX INFO: renamed from: k */
    public InterfaceC0040g f31177k;

    public C9117p3(C9058e c9058e, C9147v3 c9147v3, List list, int i10, boolean z10, int i11, InterfaceC3175e interfaceC3175e, EnumC3191u enumC3191u, InterfaceC0040g interfaceC0040g, AbstractC0042h.b bVar, long j10) {
        this.f31167a = c9058e;
        this.f31168b = c9147v3;
        this.f31169c = list;
        this.f31170d = i10;
        this.f31171e = z10;
        this.f31172f = i11;
        this.f31173g = interfaceC3175e;
        this.f31174h = enumC3191u;
        this.f31175i = bVar;
        this.f31176j = j10;
        this.f31177k = interfaceC0040g;
    }

    /* JADX INFO: renamed from: a */
    public final long m35361a() {
        return this.f31176j;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC3175e m35362b() {
        return this.f31173g;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC0042h.b m35363c() {
        return this.f31175i;
    }

    /* JADX INFO: renamed from: d */
    public final EnumC3191u m35364d() {
        return this.f31174h;
    }

    /* JADX INFO: renamed from: e */
    public final int m35365e() {
        return this.f31170d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9117p3)) {
            return false;
        }
        C9117p3 c9117p3 = (C9117p3) obj;
        return AbstractC1061t.m3842c(this.f31167a, c9117p3.f31167a) && AbstractC1061t.m3842c(this.f31168b, c9117p3.f31168b) && AbstractC1061t.m3842c(this.f31169c, c9117p3.f31169c) && this.f31170d == c9117p3.f31170d && this.f31171e == c9117p3.f31171e && AbstractC2869v.m10303g(this.f31172f, c9117p3.f31172f) && AbstractC1061t.m3842c(this.f31173g, c9117p3.f31173g) && this.f31174h == c9117p3.f31174h && AbstractC1061t.m3842c(this.f31175i, c9117p3.f31175i) && C3173c.m11967f(this.f31176j, c9117p3.f31176j);
    }

    /* JADX INFO: renamed from: f */
    public final int m35366f() {
        return this.f31172f;
    }

    /* JADX INFO: renamed from: g */
    public final List m35367g() {
        return this.f31169c;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m35368h() {
        return this.f31171e;
    }

    public int hashCode() {
        return (((((((((((((((((this.f31167a.hashCode() * 31) + this.f31168b.hashCode()) * 31) + this.f31169c.hashCode()) * 31) + this.f31170d) * 31) + Boolean.hashCode(this.f31171e)) * 31) + AbstractC2869v.m10304h(this.f31172f)) * 31) + this.f31173g.hashCode()) * 31) + this.f31174h.hashCode()) * 31) + this.f31175i.hashCode()) * 31) + C3173c.m11976o(this.f31176j);
    }

    /* JADX INFO: renamed from: i */
    public final C9147v3 m35369i() {
        return this.f31168b;
    }

    /* JADX INFO: renamed from: j */
    public final C9058e m35370j() {
        return this.f31167a;
    }

    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f31167a) + ", style=" + this.f31168b + ", placeholders=" + this.f31169c + ", maxLines=" + this.f31170d + ", softWrap=" + this.f31171e + ", overflow=" + ((Object) AbstractC2869v.m10305i(this.f31172f)) + ", density=" + this.f31173g + ", layoutDirection=" + this.f31174h + ", fontFamilyResolver=" + this.f31175i + ", constraints=" + ((Object) C3173c.m11977p(this.f31176j)) + ')';
    }

    public /* synthetic */ C9117p3(C9058e c9058e, C9147v3 c9147v3, List list, int i10, boolean z10, int i11, InterfaceC3175e interfaceC3175e, EnumC3191u enumC3191u, AbstractC0042h.b bVar, long j10, AbstractC1043k abstractC1043k) {
        this(c9058e, c9147v3, list, i10, z10, i11, interfaceC3175e, enumC3191u, bVar, j10);
    }

    public C9117p3(C9058e c9058e, C9147v3 c9147v3, List list, int i10, boolean z10, int i11, InterfaceC3175e interfaceC3175e, EnumC3191u enumC3191u, AbstractC0042h.b bVar, long j10) {
        this(c9058e, c9147v3, list, i10, z10, i11, interfaceC3175e, enumC3191u, (InterfaceC0040g) null, bVar, j10);
    }
}
