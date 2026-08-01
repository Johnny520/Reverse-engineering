package p361yc;

import java.util.List;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5114x;
import p299ub.AbstractC8644z;
import p329wc.AbstractC9224l;
import p329wc.AbstractC9225m;
import p329wc.InterfaceC9218f;
import p376zd.C10010p0;

/* JADX INFO: renamed from: yc.m1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9728m1 implements InterfaceC9218f {

    /* JADX INFO: renamed from: a */
    public final String f32995a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9218f f32996b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9218f f32997c;

    /* JADX INFO: renamed from: d */
    public final int f32998d;

    public AbstractC9728m1(String str, InterfaceC9218f interfaceC9218f, InterfaceC9218f interfaceC9218f2) {
        this.f32995a = str;
        this.f32996b = interfaceC9218f;
        this.f32997c = interfaceC9218f2;
        this.f32998d = 2;
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: a */
    public String mo35888a() {
        return this.f32995a;
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: c */
    public boolean mo35889c() {
        return super.mo35889c();
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: d */
    public int mo35890d(String str) {
        str.getClass();
        Integer numM33252s = AbstractC8644z.m33252s(str);
        if (numM33252s != null) {
            return numM33252s.intValue();
        }
        throw new IllegalArgumentException(str + " is not a valid map index");
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: e */
    public int mo35891e() {
        return this.f32998d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC9728m1)) {
            return false;
        }
        AbstractC9728m1 abstractC9728m1 = (AbstractC9728m1) obj;
        return AbstractC1061t.m3842c(mo35888a(), abstractC9728m1.mo35888a()) && AbstractC1061t.m3842c(this.f32996b, abstractC9728m1.f32996b) && AbstractC1061t.m3842c(this.f32997c, abstractC9728m1.f32997c);
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: f */
    public String mo35892f(int i10) {
        return String.valueOf(i10);
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: g */
    public List mo35893g(int i10) {
        if (i10 >= 0) {
            return AbstractC5114x.m20800o();
        }
        C9723l1.m37966a(i10, mo35888a());
        return null;
    }

    @Override // p329wc.InterfaceC9218f
    public List getAnnotations() {
        return super.getAnnotations();
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: h */
    public InterfaceC9218f mo35894h(int i10) {
        if (i10 < 0) {
            C9723l1.m37966a(i10, mo35888a());
            return null;
        }
        int i11 = i10 % 2;
        if (i11 == 0) {
            return this.f32996b;
        }
        if (i11 == 1) {
            return this.f32997c;
        }
        C10010p0.m38820a("Unreached");
        return null;
    }

    public int hashCode() {
        return (((mo35888a().hashCode() * 31) + this.f32996b.hashCode()) * 31) + this.f32997c.hashCode();
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: i */
    public boolean mo35895i(int i10) {
        if (i10 >= 0) {
            return false;
        }
        C9723l1.m37966a(i10, mo35888a());
        return false;
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: j */
    public AbstractC9224l mo35896j() {
        return AbstractC9225m.c.f31488a;
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: k */
    public boolean mo35897k() {
        return super.mo35897k();
    }

    public String toString() {
        return mo35888a() + '(' + this.f32996b + ", " + this.f32997c + ')';
    }

    public /* synthetic */ AbstractC9728m1(String str, InterfaceC9218f interfaceC9218f, InterfaceC9218f interfaceC9218f2, AbstractC1043k abstractC1043k) {
        this(str, interfaceC9218f, interfaceC9218f2);
    }
}
