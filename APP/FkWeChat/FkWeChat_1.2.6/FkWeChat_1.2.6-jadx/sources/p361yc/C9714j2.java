package p361yc;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p172l8.AbstractC4706m;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5109u0;
import p185m8.AbstractC5114x;
import p215oc.C5725t;
import p300uc.InterfaceC8647b;
import p329wc.AbstractC9224l;
import p329wc.AbstractC9225m;
import p329wc.InterfaceC9218f;

/* JADX INFO: renamed from: yc.j2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C9714j2 implements InterfaceC9218f, InterfaceC9731n {

    /* JADX INFO: renamed from: a */
    public final String f32965a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9732n0 f32966b;

    /* JADX INFO: renamed from: c */
    public final int f32967c;

    /* JADX INFO: renamed from: d */
    public int f32968d;

    /* JADX INFO: renamed from: e */
    public final String[] f32969e;

    /* JADX INFO: renamed from: f */
    public final List[] f32970f;

    /* JADX INFO: renamed from: g */
    public List f32971g;

    /* JADX INFO: renamed from: h */
    public final boolean[] f32972h;

    /* JADX INFO: renamed from: i */
    public Map f32973i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC4705l f32974j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC4705l f32975k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC4705l f32976l;

    public C9714j2(String str, InterfaceC9732n0 interfaceC9732n0, int i10) {
        str.getClass();
        this.f32965a = str;
        this.f32966b = interfaceC9732n0;
        this.f32967c = i10;
        this.f32968d = -1;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.f32969e = strArr;
        int i12 = this.f32967c;
        this.f32970f = new List[i12];
        this.f32972h = new boolean[i12];
        this.f32973i = AbstractC5109u0.m20768i();
        EnumC4708o enumC4708o = EnumC4708o.f13922r;
        this.f32974j = AbstractC4706m.m18788b(enumC4708o, new InterfaceC0173a() { // from class: yc.g2
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C9714j2.m37935n(this.f32943q);
            }
        });
        this.f32975k = AbstractC4706m.m18788b(enumC4708o, new InterfaceC0173a() { // from class: yc.h2
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C9714j2.m37934m(this.f32949q);
            }
        });
        this.f32976l = AbstractC4706m.m18788b(enumC4708o, new InterfaceC0173a() { // from class: yc.i2
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return Integer.valueOf(C9714j2.m37933l(this.f32959q));
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static int m37933l(C9714j2 c9714j2) {
        return AbstractC9724l2.m37968b(c9714j2, c9714j2.m37941s());
    }

    /* JADX INFO: renamed from: m */
    public static InterfaceC9218f[] m37934m(C9714j2 c9714j2) {
        ArrayList arrayList;
        InterfaceC8647b[] interfaceC8647bArrMo15955c;
        InterfaceC9732n0 interfaceC9732n0 = c9714j2.f32966b;
        if (interfaceC9732n0 == null || (interfaceC8647bArrMo15955c = interfaceC9732n0.mo15955c()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(interfaceC8647bArrMo15955c.length);
            for (InterfaceC8647b interfaceC8647b : interfaceC8647bArrMo15955c) {
                arrayList.add(interfaceC8647b.mo15953a());
            }
        }
        return AbstractC9689e2.m37879b(arrayList);
    }

    /* JADX INFO: renamed from: n */
    public static InterfaceC8647b[] m37935n(C9714j2 c9714j2) {
        InterfaceC8647b[] interfaceC8647bArrMo15957e;
        InterfaceC9732n0 interfaceC9732n0 = c9714j2.f32966b;
        return (interfaceC9732n0 == null || (interfaceC8647bArrMo15957e = interfaceC9732n0.mo15957e()) == null) ? AbstractC9729m2.f32999a : interfaceC8647bArrMo15957e;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m37936p(C9714j2 c9714j2, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: addElement");
            return;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        c9714j2.m37938o(str, z10);
    }

    /* JADX INFO: renamed from: t */
    private final int m37937t() {
        return ((Number) this.f32976l.getValue()).intValue();
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: a */
    public String mo35888a() {
        return this.f32965a;
    }

    @Override // p361yc.InterfaceC9731n
    /* JADX INFO: renamed from: b */
    public Set mo35899b() {
        return this.f32973i.keySet();
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
        Integer num = (Integer) this.f32973i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: e */
    public final int mo35891e() {
        return this.f32967c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9714j2)) {
            return false;
        }
        InterfaceC9218f interfaceC9218f = (InterfaceC9218f) obj;
        if (!AbstractC1061t.m3842c(mo35888a(), interfaceC9218f.mo35888a()) || !Arrays.equals(m37941s(), ((C9714j2) obj).m37941s()) || mo35891e() != interfaceC9218f.mo35891e()) {
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
        return this.f32969e[i10];
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: g */
    public List mo35893g(int i10) {
        List list = this.f32970f[i10];
        return list == null ? AbstractC5114x.m20800o() : list;
    }

    @Override // p329wc.InterfaceC9218f
    public List getAnnotations() {
        List list = this.f32971g;
        return list == null ? AbstractC5114x.m20800o() : list;
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: h */
    public InterfaceC9218f mo35894h(int i10) {
        return m37940r()[i10].mo15953a();
    }

    public int hashCode() {
        return m37937t();
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: i */
    public boolean mo35895i(int i10) {
        return this.f32972h[i10];
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: j */
    public AbstractC9224l mo35896j() {
        return AbstractC9225m.a.f31486a;
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: k */
    public boolean mo35897k() {
        return super.mo35897k();
    }

    /* JADX INFO: renamed from: o */
    public final void m37938o(String str, boolean z10) {
        str.getClass();
        String[] strArr = this.f32969e;
        int i10 = this.f32968d + 1;
        this.f32968d = i10;
        strArr[i10] = str;
        this.f32972h[i10] = z10;
        this.f32970f[i10] = null;
        if (i10 == this.f32967c - 1) {
            this.f32973i = m37939q();
        }
    }

    /* JADX INFO: renamed from: q */
    public final Map m37939q() {
        HashMap map = new HashMap();
        int length = this.f32969e.length;
        for (int i10 = 0; i10 < length; i10++) {
            map.put(this.f32969e[i10], Integer.valueOf(i10));
        }
        return map;
    }

    /* JADX INFO: renamed from: r */
    public final InterfaceC8647b[] m37940r() {
        return (InterfaceC8647b[]) this.f32974j.getValue();
    }

    /* JADX INFO: renamed from: s */
    public final InterfaceC9218f[] m37941s() {
        return (InterfaceC9218f[]) this.f32975k.getValue();
    }

    public String toString() {
        return AbstractC9724l2.m37969c(this);
    }

    /* JADX INFO: renamed from: u */
    public final void m37942u(Annotation annotation) {
        annotation.getClass();
        List arrayList = this.f32970f[this.f32968d];
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            this.f32970f[this.f32968d] = arrayList;
        }
        arrayList.add(annotation);
    }

    /* JADX INFO: renamed from: v */
    public final void m37943v(Annotation annotation) {
        annotation.getClass();
        if (this.f32971g == null) {
            this.f32971g = new ArrayList(1);
        }
        List list = this.f32971g;
        list.getClass();
        list.add(annotation);
    }

    public /* synthetic */ C9714j2(String str, InterfaceC9732n0 interfaceC9732n0, int i10, int i11, AbstractC1043k abstractC1043k) {
        this(str, (i11 & 2) != 0 ? null : interfaceC9732n0, i10);
    }
}
