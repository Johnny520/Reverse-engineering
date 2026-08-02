package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mb1 extends AbstractMap implements Serializable {
    public static final sl0 p = new sl0(14);
    public final boolean i;
    public lb1 j;
    public final lb1 m;
    public kb1 n;
    public kb1 o;
    public int k = 0;
    public int l = 0;
    public final Comparator h = p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public mb1(boolean z) {
        this.i = z;
        this.m = new lb1(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final lb1 a(Object obj, boolean z) {
        int iCompareTo;
        lb1 lb1Var;
        lb1 lb1Var2 = this.j;
        sl0 sl0Var = p;
        Comparator comparator = this.h;
        if (lb1Var2 != null) {
            Comparable comparable = comparator == sl0Var ? (Comparable) obj : null;
            while (true) {
                Object obj2 = lb1Var2.m;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return lb1Var2;
                }
                lb1 lb1Var3 = iCompareTo < 0 ? lb1Var2.i : lb1Var2.j;
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
        lb1 lb1Var5 = this.m;
        if (lb1Var4 != null) {
            lb1Var = new lb1(this.i, lb1Var4, obj, lb1Var5, lb1Var5.l);
            if (iCompareTo < 0) {
                lb1Var4.i = lb1Var;
            } else {
                lb1Var4.j = lb1Var;
            }
            b(lb1Var4, true);
        } else {
            if (comparator == sl0Var && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            lb1Var = new lb1(this.i, lb1Var4, obj, lb1Var5, lb1Var5.l);
            this.j = lb1Var;
        }
        this.k++;
        this.l++;
        return lb1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(lb1 lb1Var, boolean z) {
        while (lb1Var != null) {
            lb1 lb1Var2 = lb1Var.i;
            lb1 lb1Var3 = lb1Var.j;
            int i = lb1Var2 != null ? lb1Var2.p : 0;
            int i2 = lb1Var3 != null ? lb1Var3.p : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                lb1 lb1Var4 = lb1Var3.i;
                lb1 lb1Var5 = lb1Var3.j;
                int i4 = (lb1Var4 != null ? lb1Var4.p : 0) - (lb1Var5 != null ? lb1Var5.p : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    e(lb1Var);
                } else {
                    f(lb1Var3);
                    e(lb1Var);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                lb1 lb1Var6 = lb1Var2.i;
                lb1 lb1Var7 = lb1Var2.j;
                int i5 = (lb1Var6 != null ? lb1Var6.p : 0) - (lb1Var7 != null ? lb1Var7.p : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    f(lb1Var);
                } else {
                    e(lb1Var2);
                    f(lb1Var);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                lb1Var.p = i + 1;
                if (z) {
                    return;
                }
            } else {
                lb1Var.p = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            lb1Var = lb1Var.h;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(lb1 lb1Var, boolean z) {
        lb1 lb1Var2;
        lb1 lb1Var3;
        int i;
        if (z) {
            lb1 lb1Var4 = lb1Var.l;
            lb1Var4.k = lb1Var.k;
            lb1Var.k.l = lb1Var4;
        }
        lb1 lb1Var5 = lb1Var.i;
        lb1 lb1Var6 = lb1Var.j;
        lb1 lb1Var7 = lb1Var.h;
        int i2 = 0;
        if (lb1Var5 == null || lb1Var6 == null) {
            if (lb1Var5 != null) {
                d(lb1Var, lb1Var5);
                lb1Var.i = null;
            } else if (lb1Var6 != null) {
                d(lb1Var, lb1Var6);
                lb1Var.j = null;
            } else {
                d(lb1Var, null);
            }
            b(lb1Var7, false);
            this.k--;
            this.l++;
            return;
        }
        if (lb1Var5.p > lb1Var6.p) {
            lb1 lb1Var8 = lb1Var5.j;
            while (true) {
                lb1 lb1Var9 = lb1Var8;
                lb1Var3 = lb1Var5;
                lb1Var5 = lb1Var9;
                if (lb1Var5 == null) {
                    break;
                } else {
                    lb1Var8 = lb1Var5.j;
                }
            }
        } else {
            lb1 lb1Var10 = lb1Var6.i;
            while (true) {
                lb1Var2 = lb1Var6;
                lb1Var6 = lb1Var10;
                if (lb1Var6 == null) {
                    break;
                } else {
                    lb1Var10 = lb1Var6.i;
                }
            }
            lb1Var3 = lb1Var2;
        }
        c(lb1Var3, false);
        lb1 lb1Var11 = lb1Var.i;
        if (lb1Var11 != null) {
            i = lb1Var11.p;
            lb1Var3.i = lb1Var11;
            lb1Var11.h = lb1Var3;
            lb1Var.i = null;
        } else {
            i = 0;
        }
        lb1 lb1Var12 = lb1Var.j;
        if (lb1Var12 != null) {
            i2 = lb1Var12.p;
            lb1Var3.j = lb1Var12;
            lb1Var12.h = lb1Var3;
            lb1Var.j = null;
        }
        lb1Var3.p = Math.max(i, i2) + 1;
        d(lb1Var, lb1Var3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.j = null;
        this.k = 0;
        this.l++;
        lb1 lb1Var = this.m;
        lb1Var.l = lb1Var;
        lb1Var.k = lb1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        lb1 lb1VarA = null;
        if (obj != null) {
            try {
                lb1VarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return lb1VarA != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(lb1 lb1Var, lb1 lb1Var2) {
        lb1 lb1Var3 = lb1Var.h;
        lb1Var.h = null;
        if (lb1Var2 != null) {
            lb1Var2.h = lb1Var3;
        }
        if (lb1Var3 == null) {
            this.j = lb1Var2;
        } else if (lb1Var3.i == lb1Var) {
            lb1Var3.i = lb1Var2;
        } else {
            lb1Var3.j = lb1Var2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(lb1 lb1Var) {
        lb1 lb1Var2 = lb1Var.i;
        lb1 lb1Var3 = lb1Var.j;
        lb1 lb1Var4 = lb1Var3.i;
        lb1 lb1Var5 = lb1Var3.j;
        lb1Var.j = lb1Var4;
        if (lb1Var4 != null) {
            lb1Var4.h = lb1Var;
        }
        d(lb1Var, lb1Var3);
        lb1Var3.i = lb1Var;
        lb1Var.h = lb1Var3;
        int iMax = Math.max(lb1Var2 != null ? lb1Var2.p : 0, lb1Var4 != null ? lb1Var4.p : 0) + 1;
        lb1Var.p = iMax;
        lb1Var3.p = Math.max(iMax, lb1Var5 != null ? lb1Var5.p : 0) + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        kb1 kb1Var = this.n;
        if (kb1Var != null) {
            return kb1Var;
        }
        kb1 kb1Var2 = new kb1(this, 0);
        this.n = kb1Var2;
        return kb1Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(lb1 lb1Var) {
        lb1 lb1Var2 = lb1Var.i;
        lb1 lb1Var3 = lb1Var.j;
        lb1 lb1Var4 = lb1Var2.i;
        lb1 lb1Var5 = lb1Var2.j;
        lb1Var.i = lb1Var5;
        if (lb1Var5 != null) {
            lb1Var5.h = lb1Var;
        }
        d(lb1Var, lb1Var2);
        lb1Var2.j = lb1Var;
        lb1Var.h = lb1Var2;
        int iMax = Math.max(lb1Var3 != null ? lb1Var3.p : 0, lb1Var5 != null ? lb1Var5.p : 0) + 1;
        lb1Var.p = iMax;
        lb1Var2.p = Math.max(iMax, lb1Var4 != null ? lb1Var4.p : 0) + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        lb1 lb1VarA;
        if (obj != null) {
            try {
                lb1VarA = a(obj, false);
            } catch (ClassCastException unused) {
                lb1VarA = null;
            }
        } else {
            lb1VarA = null;
        }
        if (lb1VarA != null) {
            return lb1VarA.o;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        kb1 kb1Var = this.o;
        if (kb1Var != null) {
            return kb1Var;
        }
        kb1 kb1Var2 = new kb1(this, 1);
        this.o = kb1Var2;
        return kb1Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            um2.f("key == null");
            return null;
        }
        if (obj2 == null && !this.i) {
            um2.f("value == null");
            return null;
        }
        lb1 lb1VarA = a(obj, true);
        Object obj3 = lb1VarA.o;
        lb1VarA.o = obj2;
        return obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        lb1 lb1VarA;
        if (obj != null) {
            try {
                lb1VarA = a(obj, false);
            } catch (ClassCastException unused) {
                lb1VarA = null;
            }
        } else {
            lb1VarA = null;
        }
        if (lb1VarA != null) {
            c(lb1VarA, true);
        }
        if (lb1VarA != null) {
            return lb1VarA.o;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.k;
    }
}
