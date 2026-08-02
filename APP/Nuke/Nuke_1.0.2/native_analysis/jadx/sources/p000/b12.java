package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class b12 implements yo2, InterfaceC0701so {

    /* JADX INFO: renamed from: a */
    public final String f513a;

    /* JADX INFO: renamed from: b */
    public final qo0 f514b;

    /* JADX INFO: renamed from: c */
    public final int f515c;

    /* JADX INFO: renamed from: d */
    public int f516d = -1;

    /* JADX INFO: renamed from: e */
    public final String[] f517e;

    /* JADX INFO: renamed from: f */
    public final List[] f518f;

    /* JADX INFO: renamed from: g */
    public final boolean[] f519g;

    /* JADX INFO: renamed from: h */
    public Map f520h;

    /* JADX INFO: renamed from: i */
    public final j71 f521i;

    /* JADX INFO: renamed from: j */
    public final j71 f522j;

    /* JADX INFO: renamed from: k */
    public final j71 f523k;

    public b12(String str, qo0 qo0Var, int i) {
        this.f513a = str;
        this.f514b = qo0Var;
        this.f515c = i;
        String[] strArr = new String[i];
        final int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.f517e = strArr;
        int i4 = this.f515c;
        this.f518f = new List[i4];
        this.f519g = new boolean[i4];
        this.f520h = ce0.f1492h;
        xm0 xm0Var = new xm0(this) { // from class: a12

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ b12 f29i;

            {
                this.f29i = this;
            }

            @Override // p000.xm0
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                w41[] w41VarArrMo166b;
                ArrayList arrayList;
                w41[] w41VarArrMo3344c;
                int i5 = i2;
                b12 b12Var = this.f29i;
                switch (i5) {
                    case 0:
                        qo0 qo0Var2 = b12Var.f514b;
                        return (qo0Var2 == null || (w41VarArrMo166b = qo0Var2.mo166b()) == null) ? p40.f7976l : w41VarArrMo166b;
                    case 1:
                        qo0 qo0Var3 = b12Var.f514b;
                        if (qo0Var3 == null || (w41VarArrMo3344c = qo0Var3.mo3344c()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(w41VarArrMo3344c.length);
                            for (w41 w41Var : w41VarArrMo3344c) {
                                arrayList.add(w41Var.mo168e());
                            }
                        }
                        return AbstractC0738tl.m5318q(arrayList);
                    default:
                        return Integer.valueOf(sp0.m4910F(b12Var, (yo2[]) b12Var.f522j.getValue()));
                }
            }
        };
        i91 i91Var = i91.f4497h;
        this.f521i = AbstractC0570p7.m3746B(i91Var, xm0Var);
        final int i5 = 1;
        this.f522j = AbstractC0570p7.m3746B(i91Var, new xm0(this) { // from class: a12

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ b12 f29i;

            {
                this.f29i = this;
            }

            @Override // p000.xm0
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                w41[] w41VarArrMo166b;
                ArrayList arrayList;
                w41[] w41VarArrMo3344c;
                int i52 = i5;
                b12 b12Var = this.f29i;
                switch (i52) {
                    case 0:
                        qo0 qo0Var2 = b12Var.f514b;
                        return (qo0Var2 == null || (w41VarArrMo166b = qo0Var2.mo166b()) == null) ? p40.f7976l : w41VarArrMo166b;
                    case 1:
                        qo0 qo0Var3 = b12Var.f514b;
                        if (qo0Var3 == null || (w41VarArrMo3344c = qo0Var3.mo3344c()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(w41VarArrMo3344c.length);
                            for (w41 w41Var : w41VarArrMo3344c) {
                                arrayList.add(w41Var.mo168e());
                            }
                        }
                        return AbstractC0738tl.m5318q(arrayList);
                    default:
                        return Integer.valueOf(sp0.m4910F(b12Var, (yo2[]) b12Var.f522j.getValue()));
                }
            }
        });
        final int i6 = 2;
        this.f523k = AbstractC0570p7.m3746B(i91Var, new xm0(this) { // from class: a12

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ b12 f29i;

            {
                this.f29i = this;
            }

            @Override // p000.xm0
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                w41[] w41VarArrMo166b;
                ArrayList arrayList;
                w41[] w41VarArrMo3344c;
                int i52 = i6;
                b12 b12Var = this.f29i;
                switch (i52) {
                    case 0:
                        qo0 qo0Var2 = b12Var.f514b;
                        return (qo0Var2 == null || (w41VarArrMo166b = qo0Var2.mo166b()) == null) ? p40.f7976l : w41VarArrMo166b;
                    case 1:
                        qo0 qo0Var3 = b12Var.f514b;
                        if (qo0Var3 == null || (w41VarArrMo3344c = qo0Var3.mo3344c()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(w41VarArrMo3344c.length);
                            for (w41 w41Var : w41VarArrMo3344c) {
                                arrayList.add(w41Var.mo168e());
                            }
                        }
                        return AbstractC0738tl.m5318q(arrayList);
                    default:
                        return Integer.valueOf(sp0.m4910F(b12Var, (yo2[]) b12Var.f522j.getValue()));
                }
            }
        });
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: a */
    public final int mo249a(String str) {
        str.getClass();
        Integer num = (Integer) this.f520h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: b */
    public final String mo250b() {
        return this.f513a;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: c */
    public s11 mo251c() {
        return yv2.f13632g;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: d */
    public final int mo252d() {
        return this.f515c;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: e */
    public final String mo253e(int i) {
        return this.f517e[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b12) {
            yo2 yo2Var = (yo2) obj;
            if (this.f513a.equals(yo2Var.mo250b()) && Arrays.equals((yo2[]) this.f522j.getValue(), (yo2[]) ((b12) obj).f522j.getValue())) {
                int iMo252d = yo2Var.mo252d();
                int i = this.f515c;
                if (i == iMo252d) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (t11.m5086l(mo256j(i2).mo250b(), yo2Var.mo256j(i2).mo250b()) && t11.m5086l(mo256j(i2).mo251c(), yo2Var.mo256j(i2).mo251c())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.InterfaceC0701so
    /* JADX INFO: renamed from: g */
    public final Set mo254g() {
        return this.f520h.keySet();
    }

    @Override // p000.yo2
    public final List getAnnotations() {
        return be0.f819h;
    }

    public int hashCode() {
        return ((Number) this.f523k.getValue()).intValue();
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: i */
    public final List mo255i(int i) {
        List list = this.f518f[i];
        return list == null ? be0.f819h : list;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: j */
    public yo2 mo256j(int i) {
        return ((w41[]) this.f521i.getValue())[i].mo168e();
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: k */
    public final boolean mo257k(int i) {
        return this.f519g[i];
    }

    /* JADX INFO: renamed from: l */
    public final void m359l(String str, boolean z) {
        str.getClass();
        int i = this.f516d + 1;
        this.f516d = i;
        String[] strArr = this.f517e;
        strArr[i] = str;
        this.f519g[i] = z;
        this.f518f[i] = null;
        if (i == this.f515c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.f520h = map;
        }
    }

    public String toString() {
        return sp0.m4949k0(this);
    }
}
