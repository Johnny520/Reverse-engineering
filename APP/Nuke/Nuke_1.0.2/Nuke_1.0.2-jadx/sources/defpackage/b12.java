package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class b12 implements yo2, so {
    public final String a;
    public final qo0 b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final j71 i;
    public final j71 j;
    public final j71 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b12(String str, qo0 qo0Var, int i) {
        this.a = str;
        this.b = qo0Var;
        this.c = i;
        String[] strArr = new String[i];
        final int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i4 = this.c;
        this.f = new List[i4];
        this.g = new boolean[i4];
        this.h = ce0.h;
        xm0 xm0Var = new xm0(this) { // from class: a12
            public final /* synthetic */ b12 i;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.i = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // defpackage.xm0
            public final Object a() {
                w41[] w41VarArrB;
                ArrayList arrayList;
                w41[] w41VarArrC;
                int i5 = i2;
                b12 b12Var = this.i;
                switch (i5) {
                    case 0:
                        qo0 qo0Var2 = b12Var.b;
                        return (qo0Var2 == null || (w41VarArrB = qo0Var2.b()) == null) ? p40.l : w41VarArrB;
                    case 1:
                        qo0 qo0Var3 = b12Var.b;
                        if (qo0Var3 == null || (w41VarArrC = qo0Var3.c()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(w41VarArrC.length);
                            for (w41 w41Var : w41VarArrC) {
                                arrayList.add(w41Var.e());
                            }
                        }
                        return tl.q(arrayList);
                    default:
                        return Integer.valueOf(sp0.F(b12Var, (yo2[]) b12Var.j.getValue()));
                }
            }
        };
        i91 i91Var = i91.h;
        this.i = p7.B(i91Var, xm0Var);
        final int i5 = 1;
        this.j = p7.B(i91Var, new xm0(this) { // from class: a12
            public final /* synthetic */ b12 i;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.i = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // defpackage.xm0
            public final Object a() {
                w41[] w41VarArrB;
                ArrayList arrayList;
                w41[] w41VarArrC;
                int i52 = i5;
                b12 b12Var = this.i;
                switch (i52) {
                    case 0:
                        qo0 qo0Var2 = b12Var.b;
                        return (qo0Var2 == null || (w41VarArrB = qo0Var2.b()) == null) ? p40.l : w41VarArrB;
                    case 1:
                        qo0 qo0Var3 = b12Var.b;
                        if (qo0Var3 == null || (w41VarArrC = qo0Var3.c()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(w41VarArrC.length);
                            for (w41 w41Var : w41VarArrC) {
                                arrayList.add(w41Var.e());
                            }
                        }
                        return tl.q(arrayList);
                    default:
                        return Integer.valueOf(sp0.F(b12Var, (yo2[]) b12Var.j.getValue()));
                }
            }
        });
        final int i6 = 2;
        this.k = p7.B(i91Var, new xm0(this) { // from class: a12
            public final /* synthetic */ b12 i;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.i = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // defpackage.xm0
            public final Object a() {
                w41[] w41VarArrB;
                ArrayList arrayList;
                w41[] w41VarArrC;
                int i52 = i6;
                b12 b12Var = this.i;
                switch (i52) {
                    case 0:
                        qo0 qo0Var2 = b12Var.b;
                        return (qo0Var2 == null || (w41VarArrB = qo0Var2.b()) == null) ? p40.l : w41VarArrB;
                    case 1:
                        qo0 qo0Var3 = b12Var.b;
                        if (qo0Var3 == null || (w41VarArrC = qo0Var3.c()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(w41VarArrC.length);
                            for (w41 w41Var : w41VarArrC) {
                                arrayList.add(w41Var.e());
                            }
                        }
                        return tl.q(arrayList);
                    default:
                        return Integer.valueOf(sp0.F(b12Var, (yo2[]) b12Var.j.getValue()));
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yo2
    public final int a(String str) {
        str.getClass();
        Integer num = (Integer) this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yo2
    public final String b() {
        return this.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yo2
    public s11 c() {
        return yv2.g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yo2
    public final int d() {
        return this.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yo2
    public final String e(int i) {
        return this.e[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b12) {
            yo2 yo2Var = (yo2) obj;
            if (this.a.equals(yo2Var.b()) && Arrays.equals((yo2[]) this.j.getValue(), (yo2[]) ((b12) obj).j.getValue())) {
                int iD = yo2Var.d();
                int i = this.c;
                if (i == iD) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (t11.l(j(i2).b(), yo2Var.j(i2).b()) && t11.l(j(i2).c(), yo2Var.j(i2).c())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.so
    public final Set g() {
        return this.h.keySet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yo2
    public final List getAnnotations() {
        return be0.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yo2
    public final List i(int i) {
        List list = this.f[i];
        return list == null ? be0.h : list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yo2
    public yo2 j(int i) {
        return ((w41[]) this.i.getValue())[i].e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yo2
    public final boolean k(int i) {
        return this.g[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(String str, boolean z) {
        str.getClass();
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = map;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return sp0.k0(this);
    }
}
