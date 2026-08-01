package p041V;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: renamed from: V.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0322o extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: i */
    public static final C0318k f717i = new C0318k(0);

    /* JADX INFO: renamed from: a */
    public final Comparator f718a;

    /* JADX INFO: renamed from: b */
    public final boolean f719b;

    /* JADX INFO: renamed from: c */
    public C0321n f720c;

    /* JADX INFO: renamed from: d */
    public int f721d;

    /* JADX INFO: renamed from: e */
    public int f722e;

    /* JADX INFO: renamed from: f */
    public final C0321n f723f;

    /* JADX INFO: renamed from: g */
    public C0320m f724g;

    /* JADX INFO: renamed from: h */
    public C0320m f725h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0322o(boolean z2) {
        C0318k c0318k = f717i;
        this.f721d = 0;
        this.f722e = 0;
        this.f718a = c0318k;
        this.f719b = z2;
        this.f723f = new C0321n(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C0321n m554a(Object obj, boolean z2) {
        int iCompareTo;
        C0321n c0321n;
        C0321n c0321n2 = this.f720c;
        C0318k c0318k = f717i;
        Comparator comparator = this.f718a;
        if (c0321n2 != null) {
            Comparable comparable = comparator == c0318k ? (Comparable) obj : null;
            while (true) {
                Object obj2 = c0321n2.f713f;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return c0321n2;
                }
                C0321n c0321n3 = iCompareTo < 0 ? c0321n2.f709b : c0321n2.f710c;
                if (c0321n3 == null) {
                    break;
                }
                c0321n2 = c0321n3;
            }
        } else {
            iCompareTo = 0;
        }
        C0321n c0321n4 = c0321n2;
        if (!z2) {
            return null;
        }
        C0321n c0321n5 = this.f723f;
        if (c0321n4 != null) {
            c0321n = new C0321n(this.f719b, c0321n4, obj, c0321n5, c0321n5.f712e);
            if (iCompareTo < 0) {
                c0321n4.f709b = c0321n;
            } else {
                c0321n4.f710c = c0321n;
            }
            m555b(c0321n4, true);
        } else {
            if (comparator == c0318k && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c0321n = new C0321n(this.f719b, c0321n4, obj, c0321n5, c0321n5.f712e);
            this.f720c = c0321n;
        }
        this.f721d++;
        this.f722e++;
        return c0321n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m555b(C0321n c0321n, boolean z2) {
        while (c0321n != null) {
            C0321n c0321n2 = c0321n.f709b;
            C0321n c0321n3 = c0321n.f710c;
            int i2 = c0321n2 != null ? c0321n2.f716i : 0;
            int i3 = c0321n3 != null ? c0321n3.f716i : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C0321n c0321n4 = c0321n3.f709b;
                C0321n c0321n5 = c0321n3.f710c;
                int i5 = (c0321n4 != null ? c0321n4.f716i : 0) - (c0321n5 != null ? c0321n5.f716i : 0);
                if (i5 == -1 || (i5 == 0 && !z2)) {
                    m558e(c0321n);
                } else {
                    m559f(c0321n3);
                    m558e(c0321n);
                }
                if (z2) {
                    return;
                }
            } else if (i4 == 2) {
                C0321n c0321n6 = c0321n2.f709b;
                C0321n c0321n7 = c0321n2.f710c;
                int i6 = (c0321n6 != null ? c0321n6.f716i : 0) - (c0321n7 != null ? c0321n7.f716i : 0);
                if (i6 == 1 || (i6 == 0 && !z2)) {
                    m559f(c0321n);
                } else {
                    m558e(c0321n2);
                    m559f(c0321n);
                }
                if (z2) {
                    return;
                }
            } else if (i4 == 0) {
                c0321n.f716i = i2 + 1;
                if (z2) {
                    return;
                }
            } else {
                c0321n.f716i = Math.max(i2, i3) + 1;
                if (!z2) {
                    return;
                }
            }
            c0321n = c0321n.f708a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m556c(C0321n c0321n, boolean z2) {
        C0321n c0321n2;
        C0321n c0321n3;
        int i2;
        if (z2) {
            C0321n c0321n4 = c0321n.f712e;
            c0321n4.f711d = c0321n.f711d;
            c0321n.f711d.f712e = c0321n4;
        }
        C0321n c0321n5 = c0321n.f709b;
        C0321n c0321n6 = c0321n.f710c;
        C0321n c0321n7 = c0321n.f708a;
        int i3 = 0;
        if (c0321n5 == null || c0321n6 == null) {
            if (c0321n5 != null) {
                m557d(c0321n, c0321n5);
                c0321n.f709b = null;
            } else if (c0321n6 != null) {
                m557d(c0321n, c0321n6);
                c0321n.f710c = null;
            } else {
                m557d(c0321n, null);
            }
            m555b(c0321n7, false);
            this.f721d--;
            this.f722e++;
            return;
        }
        if (c0321n5.f716i > c0321n6.f716i) {
            C0321n c0321n8 = c0321n5.f710c;
            while (true) {
                C0321n c0321n9 = c0321n8;
                c0321n3 = c0321n5;
                c0321n5 = c0321n9;
                if (c0321n5 == null) {
                    break;
                } else {
                    c0321n8 = c0321n5.f710c;
                }
            }
        } else {
            C0321n c0321n10 = c0321n6.f709b;
            while (true) {
                c0321n2 = c0321n6;
                c0321n6 = c0321n10;
                if (c0321n6 == null) {
                    break;
                } else {
                    c0321n10 = c0321n6.f709b;
                }
            }
            c0321n3 = c0321n2;
        }
        m556c(c0321n3, false);
        C0321n c0321n11 = c0321n.f709b;
        if (c0321n11 != null) {
            i2 = c0321n11.f716i;
            c0321n3.f709b = c0321n11;
            c0321n11.f708a = c0321n3;
            c0321n.f709b = null;
        } else {
            i2 = 0;
        }
        C0321n c0321n12 = c0321n.f710c;
        if (c0321n12 != null) {
            i3 = c0321n12.f716i;
            c0321n3.f710c = c0321n12;
            c0321n12.f708a = c0321n3;
            c0321n.f710c = null;
        }
        c0321n3.f716i = Math.max(i2, i3) + 1;
        m557d(c0321n, c0321n3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f720c = null;
        this.f721d = 0;
        this.f722e++;
        C0321n c0321n = this.f723f;
        c0321n.f712e = c0321n;
        c0321n.f711d = c0321n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C0321n c0321nM554a = null;
        if (obj != null) {
            try {
                c0321nM554a = m554a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return c0321nM554a != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m557d(C0321n c0321n, C0321n c0321n2) {
        C0321n c0321n3 = c0321n.f708a;
        c0321n.f708a = null;
        if (c0321n2 != null) {
            c0321n2.f708a = c0321n3;
        }
        if (c0321n3 == null) {
            this.f720c = c0321n2;
        } else if (c0321n3.f709b == c0321n) {
            c0321n3.f709b = c0321n2;
        } else {
            c0321n3.f710c = c0321n2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m558e(C0321n c0321n) {
        C0321n c0321n2 = c0321n.f709b;
        C0321n c0321n3 = c0321n.f710c;
        C0321n c0321n4 = c0321n3.f709b;
        C0321n c0321n5 = c0321n3.f710c;
        c0321n.f710c = c0321n4;
        if (c0321n4 != null) {
            c0321n4.f708a = c0321n;
        }
        m557d(c0321n, c0321n3);
        c0321n3.f709b = c0321n;
        c0321n.f708a = c0321n3;
        int iMax = Math.max(c0321n2 != null ? c0321n2.f716i : 0, c0321n4 != null ? c0321n4.f716i : 0) + 1;
        c0321n.f716i = iMax;
        c0321n3.f716i = Math.max(iMax, c0321n5 != null ? c0321n5.f716i : 0) + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0320m c0320m = this.f724g;
        if (c0320m != null) {
            return c0320m;
        }
        C0320m c0320m2 = new C0320m(this, 0);
        this.f724g = c0320m2;
        return c0320m2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m559f(C0321n c0321n) {
        C0321n c0321n2 = c0321n.f709b;
        C0321n c0321n3 = c0321n.f710c;
        C0321n c0321n4 = c0321n2.f709b;
        C0321n c0321n5 = c0321n2.f710c;
        c0321n.f709b = c0321n5;
        if (c0321n5 != null) {
            c0321n5.f708a = c0321n;
        }
        m557d(c0321n, c0321n2);
        c0321n2.f710c = c0321n;
        c0321n.f708a = c0321n2;
        int iMax = Math.max(c0321n3 != null ? c0321n3.f716i : 0, c0321n5 != null ? c0321n5.f716i : 0) + 1;
        c0321n.f716i = iMax;
        c0321n2.f716i = Math.max(iMax, c0321n4 != null ? c0321n4.f716i : 0) + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        C0321n c0321nM554a;
        if (obj != null) {
            try {
                c0321nM554a = m554a(obj, false);
            } catch (ClassCastException unused) {
                c0321nM554a = null;
            }
        } else {
            c0321nM554a = null;
        }
        if (c0321nM554a != null) {
            return c0321nM554a.f715h;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C0320m c0320m = this.f725h;
        if (c0320m != null) {
            return c0320m;
        }
        C0320m c0320m2 = new C0320m(this, 1);
        this.f725h = c0320m2;
        return c0320m2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f719b) {
            throw new NullPointerException("value == null");
        }
        C0321n c0321nM554a = m554a(obj, true);
        Object obj3 = c0321nM554a.f715h;
        c0321nM554a.f715h = obj2;
        return obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        C0321n c0321nM554a;
        if (obj != null) {
            try {
                c0321nM554a = m554a(obj, false);
            } catch (ClassCastException unused) {
                c0321nM554a = null;
            }
        } else {
            c0321nM554a = null;
        }
        if (c0321nM554a != null) {
            m556c(c0321nM554a, true);
        }
        if (c0321nM554a != null) {
            return c0321nM554a.f715h;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f721d;
    }
}
