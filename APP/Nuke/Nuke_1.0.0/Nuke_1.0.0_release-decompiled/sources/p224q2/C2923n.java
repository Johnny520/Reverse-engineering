package p224q2;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;
import p220p4.C2892a;

/* JADX INFO: renamed from: q2.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2923n extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: l */
    public static final C2892a f9235l = new C2892a(1);

    /* JADX INFO: renamed from: e */
    public final boolean f9237e;

    /* JADX INFO: renamed from: f */
    public C2922m f9238f;

    /* JADX INFO: renamed from: i */
    public final C2922m f9241i;

    /* JADX INFO: renamed from: j */
    public C2921l f9242j;

    /* JADX INFO: renamed from: k */
    public C2921l f9243k;

    /* JADX INFO: renamed from: g */
    public int f9239g = 0;

    /* JADX INFO: renamed from: h */
    public int f9240h = 0;

    /* JADX INFO: renamed from: d */
    public final Comparator f9236d = f9235l;

    public C2923n(boolean z5) {
        this.f9237e = z5;
        this.f9241i = new C2922m(z5);
    }

    /* JADX INFO: renamed from: a */
    public final C2922m m5123a(Object obj, boolean z5) {
        int iCompareTo;
        C2922m c2922m;
        C2922m c2922m2 = this.f9238f;
        C2892a c2892a = f9235l;
        Comparator comparator = this.f9236d;
        if (c2922m2 != null) {
            Comparable comparable = comparator == c2892a ? (Comparable) obj : null;
            while (true) {
                Object obj2 = c2922m2.f9231i;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return c2922m2;
                }
                C2922m c2922m3 = iCompareTo < 0 ? c2922m2.f9227e : c2922m2.f9228f;
                if (c2922m3 == null) {
                    break;
                }
                c2922m2 = c2922m3;
            }
        } else {
            iCompareTo = 0;
        }
        C2922m c2922m4 = c2922m2;
        if (!z5) {
            return null;
        }
        C2922m c2922m5 = this.f9241i;
        if (c2922m4 != null) {
            c2922m = new C2922m(this.f9237e, c2922m4, obj, c2922m5, c2922m5.f9230h);
            if (iCompareTo < 0) {
                c2922m4.f9227e = c2922m;
            } else {
                c2922m4.f9228f = c2922m;
            }
            m5124b(c2922m4, true);
        } else {
            if (comparator == c2892a && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c2922m = new C2922m(this.f9237e, c2922m4, obj, c2922m5, c2922m5.f9230h);
            this.f9238f = c2922m;
        }
        this.f9239g++;
        this.f9240h++;
        return c2922m;
    }

    /* JADX INFO: renamed from: b */
    public final void m5124b(C2922m c2922m, boolean z5) {
        while (c2922m != null) {
            C2922m c2922m2 = c2922m.f9227e;
            C2922m c2922m3 = c2922m.f9228f;
            int i5 = c2922m2 != null ? c2922m2.f9234l : 0;
            int i6 = c2922m3 != null ? c2922m3.f9234l : 0;
            int i7 = i5 - i6;
            if (i7 == -2) {
                C2922m c2922m4 = c2922m3.f9227e;
                C2922m c2922m5 = c2922m3.f9228f;
                int i8 = (c2922m4 != null ? c2922m4.f9234l : 0) - (c2922m5 != null ? c2922m5.f9234l : 0);
                if (i8 == -1 || (i8 == 0 && !z5)) {
                    m5127e(c2922m);
                } else {
                    m5128f(c2922m3);
                    m5127e(c2922m);
                }
                if (z5) {
                    return;
                }
            } else if (i7 == 2) {
                C2922m c2922m6 = c2922m2.f9227e;
                C2922m c2922m7 = c2922m2.f9228f;
                int i9 = (c2922m6 != null ? c2922m6.f9234l : 0) - (c2922m7 != null ? c2922m7.f9234l : 0);
                if (i9 == 1 || (i9 == 0 && !z5)) {
                    m5128f(c2922m);
                } else {
                    m5127e(c2922m2);
                    m5128f(c2922m);
                }
                if (z5) {
                    return;
                }
            } else if (i7 == 0) {
                c2922m.f9234l = i5 + 1;
                if (z5) {
                    return;
                }
            } else {
                c2922m.f9234l = Math.max(i5, i6) + 1;
                if (!z5) {
                    return;
                }
            }
            c2922m = c2922m.f9226d;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5125c(C2922m c2922m, boolean z5) {
        C2922m c2922m2;
        C2922m c2922m3;
        int i5;
        if (z5) {
            C2922m c2922m4 = c2922m.f9230h;
            c2922m4.f9229g = c2922m.f9229g;
            c2922m.f9229g.f9230h = c2922m4;
        }
        C2922m c2922m5 = c2922m.f9227e;
        C2922m c2922m6 = c2922m.f9228f;
        C2922m c2922m7 = c2922m.f9226d;
        int i6 = 0;
        if (c2922m5 == null || c2922m6 == null) {
            if (c2922m5 != null) {
                m5126d(c2922m, c2922m5);
                c2922m.f9227e = null;
            } else if (c2922m6 != null) {
                m5126d(c2922m, c2922m6);
                c2922m.f9228f = null;
            } else {
                m5126d(c2922m, null);
            }
            m5124b(c2922m7, false);
            this.f9239g--;
            this.f9240h++;
            return;
        }
        if (c2922m5.f9234l > c2922m6.f9234l) {
            C2922m c2922m8 = c2922m5.f9228f;
            while (true) {
                C2922m c2922m9 = c2922m8;
                c2922m3 = c2922m5;
                c2922m5 = c2922m9;
                if (c2922m5 == null) {
                    break;
                } else {
                    c2922m8 = c2922m5.f9228f;
                }
            }
        } else {
            C2922m c2922m10 = c2922m6.f9227e;
            while (true) {
                c2922m2 = c2922m6;
                c2922m6 = c2922m10;
                if (c2922m6 == null) {
                    break;
                } else {
                    c2922m10 = c2922m6.f9227e;
                }
            }
            c2922m3 = c2922m2;
        }
        m5125c(c2922m3, false);
        C2922m c2922m11 = c2922m.f9227e;
        if (c2922m11 != null) {
            i5 = c2922m11.f9234l;
            c2922m3.f9227e = c2922m11;
            c2922m11.f9226d = c2922m3;
            c2922m.f9227e = null;
        } else {
            i5 = 0;
        }
        C2922m c2922m12 = c2922m.f9228f;
        if (c2922m12 != null) {
            i6 = c2922m12.f9234l;
            c2922m3.f9228f = c2922m12;
            c2922m12.f9226d = c2922m3;
            c2922m.f9228f = null;
        }
        c2922m3.f9234l = Math.max(i5, i6) + 1;
        m5126d(c2922m, c2922m3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f9238f = null;
        this.f9239g = 0;
        this.f9240h++;
        C2922m c2922m = this.f9241i;
        c2922m.f9230h = c2922m;
        c2922m.f9229g = c2922m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C2922m c2922mM5123a = null;
        if (obj != null) {
            try {
                c2922mM5123a = m5123a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return c2922mM5123a != null;
    }

    /* JADX INFO: renamed from: d */
    public final void m5126d(C2922m c2922m, C2922m c2922m2) {
        C2922m c2922m3 = c2922m.f9226d;
        c2922m.f9226d = null;
        if (c2922m2 != null) {
            c2922m2.f9226d = c2922m3;
        }
        if (c2922m3 == null) {
            this.f9238f = c2922m2;
        } else if (c2922m3.f9227e == c2922m) {
            c2922m3.f9227e = c2922m2;
        } else {
            c2922m3.f9228f = c2922m2;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5127e(C2922m c2922m) {
        C2922m c2922m2 = c2922m.f9227e;
        C2922m c2922m3 = c2922m.f9228f;
        C2922m c2922m4 = c2922m3.f9227e;
        C2922m c2922m5 = c2922m3.f9228f;
        c2922m.f9228f = c2922m4;
        if (c2922m4 != null) {
            c2922m4.f9226d = c2922m;
        }
        m5126d(c2922m, c2922m3);
        c2922m3.f9227e = c2922m;
        c2922m.f9226d = c2922m3;
        int iMax = Math.max(c2922m2 != null ? c2922m2.f9234l : 0, c2922m4 != null ? c2922m4.f9234l : 0) + 1;
        c2922m.f9234l = iMax;
        c2922m3.f9234l = Math.max(iMax, c2922m5 != null ? c2922m5.f9234l : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C2921l c2921l = this.f9242j;
        if (c2921l != null) {
            return c2921l;
        }
        C2921l c2921l2 = new C2921l(this, 0);
        this.f9242j = c2921l2;
        return c2921l2;
    }

    /* JADX INFO: renamed from: f */
    public final void m5128f(C2922m c2922m) {
        C2922m c2922m2 = c2922m.f9227e;
        C2922m c2922m3 = c2922m.f9228f;
        C2922m c2922m4 = c2922m2.f9227e;
        C2922m c2922m5 = c2922m2.f9228f;
        c2922m.f9227e = c2922m5;
        if (c2922m5 != null) {
            c2922m5.f9226d = c2922m;
        }
        m5126d(c2922m, c2922m2);
        c2922m2.f9228f = c2922m;
        c2922m.f9226d = c2922m2;
        int iMax = Math.max(c2922m3 != null ? c2922m3.f9234l : 0, c2922m5 != null ? c2922m5.f9234l : 0) + 1;
        c2922m.f9234l = iMax;
        c2922m2.f9234l = Math.max(iMax, c2922m4 != null ? c2922m4.f9234l : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        C2922m c2922mM5123a;
        if (obj != null) {
            try {
                c2922mM5123a = m5123a(obj, false);
            } catch (ClassCastException unused) {
                c2922mM5123a = null;
            }
        } else {
            c2922mM5123a = null;
        }
        if (c2922mM5123a != null) {
            return c2922mM5123a.f9233k;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C2921l c2921l = this.f9243k;
        if (c2921l != null) {
            return c2921l;
        }
        C2921l c2921l2 = new C2921l(this, 1);
        this.f9243k = c2921l2;
        return c2921l2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f9237e) {
            throw new NullPointerException("value == null");
        }
        C2922m c2922mM5123a = m5123a(obj, true);
        Object obj3 = c2922mM5123a.f9233k;
        c2922mM5123a.f9233k = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        C2922m c2922mM5123a;
        if (obj != null) {
            try {
                c2922mM5123a = m5123a(obj, false);
            } catch (ClassCastException unused) {
                c2922mM5123a = null;
            }
        } else {
            c2922mM5123a = null;
        }
        if (c2922mM5123a != null) {
            m5125c(c2922mM5123a, true);
        }
        if (c2922mM5123a != null) {
            return c2922mM5123a.f9233k;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f9239g;
    }
}
