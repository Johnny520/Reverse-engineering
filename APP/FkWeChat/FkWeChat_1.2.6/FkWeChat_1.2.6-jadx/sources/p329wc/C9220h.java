package p329wc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1061t;
import p172l8.AbstractC4706m;
import p172l8.AbstractC4717x;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5106t;
import p185m8.AbstractC5109u0;
import p185m8.AbstractC5116y;
import p185m8.C5095n0;
import p361yc.AbstractC9689e2;
import p361yc.AbstractC9724l2;
import p361yc.InterfaceC9731n;

/* JADX INFO: renamed from: wc.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9220h implements InterfaceC9218f, InterfaceC9731n {

    /* JADX INFO: renamed from: a */
    public final String f31466a;

    /* JADX INFO: renamed from: b */
    public final AbstractC9224l f31467b;

    /* JADX INFO: renamed from: c */
    public final int f31468c;

    /* JADX INFO: renamed from: d */
    public final List f31469d;

    /* JADX INFO: renamed from: e */
    public final Set f31470e;

    /* JADX INFO: renamed from: f */
    public final String[] f31471f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC9218f[] f31472g;

    /* JADX INFO: renamed from: h */
    public final List[] f31473h;

    /* JADX INFO: renamed from: i */
    public final boolean[] f31474i;

    /* JADX INFO: renamed from: j */
    public final Map f31475j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC9218f[] f31476k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC4705l f31477l;

    public C9220h(String str, AbstractC9224l abstractC9224l, int i10, List list, C9213a c9213a) {
        str.getClass();
        abstractC9224l.getClass();
        list.getClass();
        c9213a.getClass();
        this.f31466a = str;
        this.f31467b = abstractC9224l;
        this.f31468c = i10;
        this.f31469d = c9213a.m35879c();
        this.f31470e = AbstractC5081g0.m20550V0(c9213a.m35882f());
        String[] strArr = (String[]) c9213a.m35882f().toArray(new String[0]);
        this.f31471f = strArr;
        this.f31472g = AbstractC9689e2.m37879b(c9213a.m35881e());
        this.f31473h = (List[]) c9213a.m35880d().toArray(new List[0]);
        this.f31474i = AbstractC5081g0.m20546R0(c9213a.m35883g());
        Iterable<C5095n0> iterableM20739i1 = AbstractC5106t.m20739i1(strArr);
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(iterableM20739i1, 10));
        for (C5095n0 c5095n0 : iterableM20739i1) {
            arrayList.add(AbstractC4717x.m18815a(c5095n0.m20622d(), Integer.valueOf(c5095n0.m20621c())));
        }
        this.f31475j = AbstractC5109u0.m20778s(arrayList);
        this.f31476k = AbstractC9689e2.m37879b(list);
        this.f31477l = AbstractC4706m.m18787a(new InterfaceC0173a() { // from class: wc.g
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return Integer.valueOf(C9220h.m35898l(this.f31465q));
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static int m35898l(C9220h c9220h) {
        return AbstractC9724l2.m37968b(c9220h, c9220h.f31476k);
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: a */
    public String mo35888a() {
        return this.f31466a;
    }

    @Override // p361yc.InterfaceC9731n
    /* JADX INFO: renamed from: b */
    public Set mo35899b() {
        return this.f31470e;
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
        Integer num = (Integer) this.f31475j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: e */
    public int mo35891e() {
        return this.f31468c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9220h)) {
            return false;
        }
        InterfaceC9218f interfaceC9218f = (InterfaceC9218f) obj;
        if (!AbstractC1061t.m3842c(mo35888a(), interfaceC9218f.mo35888a()) || !Arrays.equals(this.f31476k, ((C9220h) obj).f31476k) || mo35891e() != interfaceC9218f.mo35891e()) {
            return false;
        }
        int iMo35891e = mo35891e();
        for (int i10 = 0; i10 < iMo35891e; i10++) {
            if (!AbstractC1061t.m3842c(mo35894h(i10).mo35888a(), interfaceC9218f.mo35894h(i10).mo35888a()) || !AbstractC1061t.m3842c(mo35894h(i10).mo35896j(), interfaceC9218f.mo35894h(i10).mo35896j())) {
                return false;
            }
        }
        return true;
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: f */
    public String mo35892f(int i10) {
        return this.f31471f[i10];
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: g */
    public List mo35893g(int i10) {
        return this.f31473h[i10];
    }

    @Override // p329wc.InterfaceC9218f
    public List getAnnotations() {
        return this.f31469d;
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: h */
    public InterfaceC9218f mo35894h(int i10) {
        return this.f31472g[i10];
    }

    public int hashCode() {
        return m35900m();
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: i */
    public boolean mo35895i(int i10) {
        return this.f31474i[i10];
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: j */
    public AbstractC9224l mo35896j() {
        return this.f31467b;
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: k */
    public boolean mo35897k() {
        return super.mo35897k();
    }

    /* JADX INFO: renamed from: m */
    public final int m35900m() {
        return ((Number) this.f31477l.getValue()).intValue();
    }

    public String toString() {
        return AbstractC9724l2.m37969c(this);
    }
}
