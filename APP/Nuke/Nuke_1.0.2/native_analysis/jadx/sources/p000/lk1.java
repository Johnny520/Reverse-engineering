package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lk1 {

    /* JADX INFO: renamed from: a */
    public Object[] f6163a;

    /* JADX INFO: renamed from: b */
    public int f6164b;

    /* JADX INFO: renamed from: c */
    public jk1 f6165c;

    public lk1(int i) {
        this.f6163a = i == 0 ? js1.f5195a : new Object[i];
    }

    /* JADX INFO: renamed from: a */
    public final void m2925a(Object obj) {
        int i = this.f6164b + 1;
        Object[] objArr = this.f6163a;
        if (objArr.length < i) {
            m2937m(i, objArr);
        }
        Object[] objArr2 = this.f6163a;
        int i2 = this.f6164b;
        objArr2[i2] = obj;
        this.f6164b = i2 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m2926b(lk1 lk1Var) {
        lk1Var.getClass();
        if (lk1Var.m2932h()) {
            return;
        }
        int i = this.f6164b + lk1Var.f6164b;
        Object[] objArr = this.f6163a;
        if (objArr.length < i) {
            m2937m(i, objArr);
        }
        AbstractC0460mg.m3088c0(lk1Var.f6163a, this.f6163a, this.f6164b, 0, lk1Var.f6164b);
        this.f6164b += lk1Var.f6164b;
    }

    /* JADX INFO: renamed from: c */
    public final void m2927c(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.f6164b;
        int size = list.size() + i;
        Object[] objArr = this.f6163a;
        if (objArr.length < size) {
            m2937m(size, objArr);
        }
        Object[] objArr2 = this.f6163a;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.f6164b = list.size() + this.f6164b;
    }

    /* JADX INFO: renamed from: d */
    public final void m2928d() {
        AbstractC0460mg.m3094i0(this.f6163a, 0, this.f6164b);
        this.f6164b = 0;
    }

    /* JADX INFO: renamed from: e */
    public final Object m2929e() {
        if (!m2932h()) {
            return this.f6163a[0];
        }
        um2.m5519i("ObjectList is empty.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lk1) {
            lk1 lk1Var = (lk1) obj;
            int i = lk1Var.f6164b;
            int i2 = this.f6164b;
            if (i == i2) {
                Object[] objArr = this.f6163a;
                Object[] objArr2 = lk1Var.f6163a;
                c11 c11VarM799X = ci0.m799X(0, i2);
                int i3 = c11VarM799X.f25h;
                int i4 = c11VarM799X.f26i;
                if (i3 > i4) {
                    return true;
                }
                while (t11.m5086l(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final Object m2930f(int i) {
        if (i >= 0 && i < this.f6164b) {
            return this.f6163a[i];
        }
        m2939o(i);
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public final int m2931g(Object obj) {
        Object[] objArr = this.f6163a;
        int i = 0;
        if (obj == null) {
            int i2 = this.f6164b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.f6164b;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2932h() {
        return this.f6164b == 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f6163a;
        int i = this.f6164b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2933i() {
        return this.f6164b != 0;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2934j(Object obj) {
        int iM2931g = m2931g(obj);
        if (iM2931g < 0) {
            return false;
        }
        m2935k(iM2931g);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final Object m2935k(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f6164b)) {
            m2939o(i);
            throw null;
        }
        Object[] objArr = this.f6163a;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            AbstractC0460mg.m3088c0(objArr, objArr, i, i + 1, i2);
        }
        int i3 = this.f6164b - 1;
        this.f6164b = i3;
        objArr[i3] = null;
        return obj;
    }

    /* JADX INFO: renamed from: l */
    public final void m2936l(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.f6164b) || i2 < 0 || i2 > i3) {
            c80.m673q(hk1.m2212k("Start (", i, i2, ") and end (", ") must be in 0.."), this.f6164b);
            return;
        }
        if (i2 < i) {
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.f6163a;
                AbstractC0460mg.m3088c0(objArr, objArr, i, i2, i3);
            }
            int i4 = this.f6164b;
            int i5 = i4 - (i2 - i);
            AbstractC0460mg.m3094i0(this.f6163a, i5, i4);
            this.f6164b = i5;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m2937m(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        AbstractC0460mg.m3088c0(objArr, objArr2, 0, 0, length);
        this.f6163a = objArr2;
    }

    /* JADX INFO: renamed from: n */
    public final Object m2938n(int i, Object obj) {
        if (i < 0 || i >= this.f6164b) {
            m2939o(i);
            throw null;
        }
        Object[] objArr = this.f6163a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: o */
    public final void m2939o(int i) {
        StringBuilder sbM5695n = vi0.m5695n(i, "Index ", " must be in 0..");
        sbM5695n.append(this.f6164b - 1);
        throw new IndexOutOfBoundsException(sbM5695n.toString());
    }

    /* JADX INFO: renamed from: p */
    public final void m2940p(int i) {
        StringBuilder sbM5695n = vi0.m5695n(i, "Index ", " must be in 0..");
        sbM5695n.append(this.f6164b);
        throw new IndexOutOfBoundsException(sbM5695n.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f6163a;
        int i = this.f6164b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i2++;
        }
        return sb.toString();
    }

    public /* synthetic */ lk1() {
        this(16);
    }
}
