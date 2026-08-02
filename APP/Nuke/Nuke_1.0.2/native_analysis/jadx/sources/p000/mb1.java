package p000;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mb1 extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: p */
    public static final sl0 f6542p = new sl0(14);

    /* JADX INFO: renamed from: i */
    public final boolean f6544i;

    /* JADX INFO: renamed from: j */
    public lb1 f6545j;

    /* JADX INFO: renamed from: m */
    public final lb1 f6548m;

    /* JADX INFO: renamed from: n */
    public kb1 f6549n;

    /* JADX INFO: renamed from: o */
    public kb1 f6550o;

    /* JADX INFO: renamed from: k */
    public int f6546k = 0;

    /* JADX INFO: renamed from: l */
    public int f6547l = 0;

    /* JADX INFO: renamed from: h */
    public final Comparator f6543h = f6542p;

    public mb1(boolean z) {
        this.f6544i = z;
        this.f6548m = new lb1(z);
    }

    /* JADX INFO: renamed from: a */
    public final lb1 m3051a(Object obj, boolean z) {
        int iCompareTo;
        lb1 lb1Var;
        lb1 lb1Var2 = this.f6545j;
        sl0 sl0Var = f6542p;
        Comparator comparator = this.f6543h;
        if (lb1Var2 != null) {
            Comparable comparable = comparator == sl0Var ? (Comparable) obj : null;
            while (true) {
                Object obj2 = lb1Var2.f6026m;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return lb1Var2;
                }
                lb1 lb1Var3 = iCompareTo < 0 ? lb1Var2.f6022i : lb1Var2.f6023j;
                if (lb1Var3 == null) {
                    break;
                }
                lb1Var2 = lb1Var3;
            }
        } else {
            iCompareTo = 0;
        }
        lb1 lb1Var4 = lb1Var2;
        if (!z) {
            return null;
        }
        lb1 lb1Var5 = this.f6548m;
        if (lb1Var4 != null) {
            lb1Var = new lb1(this.f6544i, lb1Var4, obj, lb1Var5, lb1Var5.f6025l);
            if (iCompareTo < 0) {
                lb1Var4.f6022i = lb1Var;
            } else {
                lb1Var4.f6023j = lb1Var;
            }
            m3052b(lb1Var4, true);
        } else {
            if (comparator == sl0Var && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            lb1Var = new lb1(this.f6544i, lb1Var4, obj, lb1Var5, lb1Var5.f6025l);
            this.f6545j = lb1Var;
        }
        this.f6546k++;
        this.f6547l++;
        return lb1Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m3052b(lb1 lb1Var, boolean z) {
        while (lb1Var != null) {
            lb1 lb1Var2 = lb1Var.f6022i;
            lb1 lb1Var3 = lb1Var.f6023j;
            int i = lb1Var2 != null ? lb1Var2.f6029p : 0;
            int i2 = lb1Var3 != null ? lb1Var3.f6029p : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                lb1 lb1Var4 = lb1Var3.f6022i;
                lb1 lb1Var5 = lb1Var3.f6023j;
                int i4 = (lb1Var4 != null ? lb1Var4.f6029p : 0) - (lb1Var5 != null ? lb1Var5.f6029p : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    m3055e(lb1Var);
                } else {
                    m3056f(lb1Var3);
                    m3055e(lb1Var);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                lb1 lb1Var6 = lb1Var2.f6022i;
                lb1 lb1Var7 = lb1Var2.f6023j;
                int i5 = (lb1Var6 != null ? lb1Var6.f6029p : 0) - (lb1Var7 != null ? lb1Var7.f6029p : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    m3056f(lb1Var);
                } else {
                    m3055e(lb1Var2);
                    m3056f(lb1Var);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                lb1Var.f6029p = i + 1;
                if (z) {
                    return;
                }
            } else {
                lb1Var.f6029p = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            lb1Var = lb1Var.f6021h;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3053c(lb1 lb1Var, boolean z) {
        lb1 lb1Var2;
        lb1 lb1Var3;
        int i;
        if (z) {
            lb1 lb1Var4 = lb1Var.f6025l;
            lb1Var4.f6024k = lb1Var.f6024k;
            lb1Var.f6024k.f6025l = lb1Var4;
        }
        lb1 lb1Var5 = lb1Var.f6022i;
        lb1 lb1Var6 = lb1Var.f6023j;
        lb1 lb1Var7 = lb1Var.f6021h;
        int i2 = 0;
        if (lb1Var5 == null || lb1Var6 == null) {
            if (lb1Var5 != null) {
                m3054d(lb1Var, lb1Var5);
                lb1Var.f6022i = null;
            } else if (lb1Var6 != null) {
                m3054d(lb1Var, lb1Var6);
                lb1Var.f6023j = null;
            } else {
                m3054d(lb1Var, null);
            }
            m3052b(lb1Var7, false);
            this.f6546k--;
            this.f6547l++;
            return;
        }
        if (lb1Var5.f6029p > lb1Var6.f6029p) {
            lb1 lb1Var8 = lb1Var5.f6023j;
            while (true) {
                lb1 lb1Var9 = lb1Var8;
                lb1Var3 = lb1Var5;
                lb1Var5 = lb1Var9;
                if (lb1Var5 == null) {
                    break;
                } else {
                    lb1Var8 = lb1Var5.f6023j;
                }
            }
        } else {
            lb1 lb1Var10 = lb1Var6.f6022i;
            while (true) {
                lb1Var2 = lb1Var6;
                lb1Var6 = lb1Var10;
                if (lb1Var6 == null) {
                    break;
                } else {
                    lb1Var10 = lb1Var6.f6022i;
                }
            }
            lb1Var3 = lb1Var2;
        }
        m3053c(lb1Var3, false);
        lb1 lb1Var11 = lb1Var.f6022i;
        if (lb1Var11 != null) {
            i = lb1Var11.f6029p;
            lb1Var3.f6022i = lb1Var11;
            lb1Var11.f6021h = lb1Var3;
            lb1Var.f6022i = null;
        } else {
            i = 0;
        }
        lb1 lb1Var12 = lb1Var.f6023j;
        if (lb1Var12 != null) {
            i2 = lb1Var12.f6029p;
            lb1Var3.f6023j = lb1Var12;
            lb1Var12.f6021h = lb1Var3;
            lb1Var.f6023j = null;
        }
        lb1Var3.f6029p = Math.max(i, i2) + 1;
        m3054d(lb1Var, lb1Var3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f6545j = null;
        this.f6546k = 0;
        this.f6547l++;
        lb1 lb1Var = this.f6548m;
        lb1Var.f6025l = lb1Var;
        lb1Var.f6024k = lb1Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        lb1 lb1VarM3051a = null;
        if (obj != null) {
            try {
                lb1VarM3051a = m3051a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return lb1VarM3051a != null;
    }

    /* JADX INFO: renamed from: d */
    public final void m3054d(lb1 lb1Var, lb1 lb1Var2) {
        lb1 lb1Var3 = lb1Var.f6021h;
        lb1Var.f6021h = null;
        if (lb1Var2 != null) {
            lb1Var2.f6021h = lb1Var3;
        }
        if (lb1Var3 == null) {
            this.f6545j = lb1Var2;
        } else if (lb1Var3.f6022i == lb1Var) {
            lb1Var3.f6022i = lb1Var2;
        } else {
            lb1Var3.f6023j = lb1Var2;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3055e(lb1 lb1Var) {
        lb1 lb1Var2 = lb1Var.f6022i;
        lb1 lb1Var3 = lb1Var.f6023j;
        lb1 lb1Var4 = lb1Var3.f6022i;
        lb1 lb1Var5 = lb1Var3.f6023j;
        lb1Var.f6023j = lb1Var4;
        if (lb1Var4 != null) {
            lb1Var4.f6021h = lb1Var;
        }
        m3054d(lb1Var, lb1Var3);
        lb1Var3.f6022i = lb1Var;
        lb1Var.f6021h = lb1Var3;
        int iMax = Math.max(lb1Var2 != null ? lb1Var2.f6029p : 0, lb1Var4 != null ? lb1Var4.f6029p : 0) + 1;
        lb1Var.f6029p = iMax;
        lb1Var3.f6029p = Math.max(iMax, lb1Var5 != null ? lb1Var5.f6029p : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        kb1 kb1Var = this.f6549n;
        if (kb1Var != null) {
            return kb1Var;
        }
        kb1 kb1Var2 = new kb1(this, 0);
        this.f6549n = kb1Var2;
        return kb1Var2;
    }

    /* JADX INFO: renamed from: f */
    public final void m3056f(lb1 lb1Var) {
        lb1 lb1Var2 = lb1Var.f6022i;
        lb1 lb1Var3 = lb1Var.f6023j;
        lb1 lb1Var4 = lb1Var2.f6022i;
        lb1 lb1Var5 = lb1Var2.f6023j;
        lb1Var.f6022i = lb1Var5;
        if (lb1Var5 != null) {
            lb1Var5.f6021h = lb1Var;
        }
        m3054d(lb1Var, lb1Var2);
        lb1Var2.f6023j = lb1Var;
        lb1Var.f6021h = lb1Var2;
        int iMax = Math.max(lb1Var3 != null ? lb1Var3.f6029p : 0, lb1Var5 != null ? lb1Var5.f6029p : 0) + 1;
        lb1Var.f6029p = iMax;
        lb1Var2.f6029p = Math.max(iMax, lb1Var4 != null ? lb1Var4.f6029p : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        lb1 lb1VarM3051a;
        if (obj != null) {
            try {
                lb1VarM3051a = m3051a(obj, false);
            } catch (ClassCastException unused) {
                lb1VarM3051a = null;
            }
        } else {
            lb1VarM3051a = null;
        }
        if (lb1VarM3051a != null) {
            return lb1VarM3051a.f6028o;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        kb1 kb1Var = this.f6550o;
        if (kb1Var != null) {
            return kb1Var;
        }
        kb1 kb1Var2 = new kb1(this, 1);
        this.f6550o = kb1Var2;
        return kb1Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            um2.m5516f("key == null");
            return null;
        }
        if (obj2 == null && !this.f6544i) {
            um2.m5516f("value == null");
            return null;
        }
        lb1 lb1VarM3051a = m3051a(obj, true);
        Object obj3 = lb1VarM3051a.f6028o;
        lb1VarM3051a.f6028o = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        lb1 lb1VarM3051a;
        if (obj != null) {
            try {
                lb1VarM3051a = m3051a(obj, false);
            } catch (ClassCastException unused) {
                lb1VarM3051a = null;
            }
        } else {
            lb1VarM3051a = null;
        }
        if (lb1VarM3051a != null) {
            m3053c(lb1VarM3051a, true);
        }
        if (lb1VarM3051a != null) {
            return lb1VarM3051a.f6028o;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f6546k;
    }
}
