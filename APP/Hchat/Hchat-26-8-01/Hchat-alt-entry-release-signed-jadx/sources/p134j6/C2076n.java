package p134j6;

import bsh.C0353j;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;
import p009a9.C0031h;

/* JADX INFO: renamed from: j6.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2076n extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: o */
    public static final C0031h f6971o = new C0031h(21);

    /* JADX INFO: renamed from: h */
    public final boolean f6973h;

    /* JADX INFO: renamed from: i */
    public C2075m f6974i;

    /* JADX INFO: renamed from: l */
    public final C2075m f6977l;

    /* JADX INFO: renamed from: m */
    public C2074l f6978m;

    /* JADX INFO: renamed from: n */
    public C2074l f6979n;

    /* JADX INFO: renamed from: j */
    public int f6975j = 0;

    /* JADX INFO: renamed from: k */
    public int f6976k = 0;

    /* JADX INFO: renamed from: g */
    public final Comparator f6972g = f6971o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2076n(boolean z9) {
        this.f6973h = z9;
        this.f6977l = new C2075m(z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C2075m m5134a(Object obj, boolean z9) {
        int iCompareTo;
        C2075m c2075m;
        C2075m c2075m2 = this.f6974i;
        C0031h c0031h = f6971o;
        Comparator comparator = this.f6972g;
        if (c2075m2 != null) {
            Comparable comparable = comparator == c0031h ? (Comparable) obj : null;
            while (true) {
                Object obj2 = c2075m2.f6967l;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return c2075m2;
                }
                C2075m c2075m3 = iCompareTo < 0 ? c2075m2.f6963h : c2075m2.f6964i;
                if (c2075m3 == null) {
                    break;
                }
                c2075m2 = c2075m3;
            }
        } else {
            iCompareTo = 0;
        }
        C2075m c2075m4 = c2075m2;
        if (!z9) {
            return null;
        }
        C2075m c2075m5 = this.f6977l;
        if (c2075m4 != null) {
            c2075m = new C2075m(this.f6973h, c2075m4, obj, c2075m5, c2075m5.f6966k);
            if (iCompareTo < 0) {
                c2075m4.f6963h = c2075m;
            } else {
                c2075m4.f6964i = c2075m;
            }
            m5135c(c2075m4, true);
        } else {
            if (comparator == c0031h && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c2075m = new C2075m(this.f6973h, c2075m4, obj, c2075m5, c2075m5.f6966k);
            this.f6974i = c2075m;
        }
        this.f6975j++;
        this.f6976k++;
        return c2075m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m5135c(C2075m c2075m, boolean z9) {
        while (c2075m != null) {
            C2075m c2075m2 = c2075m.f6963h;
            C2075m c2075m3 = c2075m.f6964i;
            int i9 = c2075m2 != null ? c2075m2.f6970o : 0;
            int i10 = c2075m3 != null ? c2075m3.f6970o : 0;
            int i11 = i9 - i10;
            if (i11 == -2) {
                C2075m c2075m4 = c2075m3.f6963h;
                C2075m c2075m5 = c2075m3.f6964i;
                int i12 = (c2075m4 != null ? c2075m4.f6970o : 0) - (c2075m5 != null ? c2075m5.f6970o : 0);
                if (i12 == -1 || (i12 == 0 && !z9)) {
                    m5138f(c2075m);
                } else {
                    m5139g(c2075m3);
                    m5138f(c2075m);
                }
                if (z9) {
                    return;
                }
            } else if (i11 == 2) {
                C2075m c2075m6 = c2075m2.f6963h;
                C2075m c2075m7 = c2075m2.f6964i;
                int i13 = (c2075m6 != null ? c2075m6.f6970o : 0) - (c2075m7 != null ? c2075m7.f6970o : 0);
                if (i13 == 1 || (i13 == 0 && !z9)) {
                    m5139g(c2075m);
                } else {
                    m5138f(c2075m2);
                    m5139g(c2075m);
                }
                if (z9) {
                    return;
                }
            } else if (i11 == 0) {
                c2075m.f6970o = i9 + 1;
                if (z9) {
                    return;
                }
            } else {
                c2075m.f6970o = Math.max(i9, i10) + 1;
                if (!z9) {
                    return;
                }
            }
            c2075m = c2075m.f6962g;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f6974i = null;
        this.f6975j = 0;
        this.f6976k++;
        C2075m c2075m = this.f6977l;
        c2075m.f6966k = c2075m;
        c2075m.f6965j = c2075m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C2075m c2075mM5134a = null;
        if (obj != null) {
            try {
                c2075mM5134a = m5134a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return c2075mM5134a != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m5136d(C2075m c2075m, boolean z9) {
        C2075m c2075m2;
        C2075m c2075m3;
        int i9;
        if (z9) {
            C2075m c2075m4 = c2075m.f6966k;
            c2075m4.f6965j = c2075m.f6965j;
            c2075m.f6965j.f6966k = c2075m4;
        }
        C2075m c2075m5 = c2075m.f6963h;
        C2075m c2075m6 = c2075m.f6964i;
        C2075m c2075m7 = c2075m.f6962g;
        int i10 = 0;
        if (c2075m5 == null || c2075m6 == null) {
            if (c2075m5 != null) {
                m5137e(c2075m, c2075m5);
                c2075m.f6963h = null;
            } else if (c2075m6 != null) {
                m5137e(c2075m, c2075m6);
                c2075m.f6964i = null;
            } else {
                m5137e(c2075m, null);
            }
            m5135c(c2075m7, false);
            this.f6975j--;
            this.f6976k++;
            return;
        }
        if (c2075m5.f6970o > c2075m6.f6970o) {
            C2075m c2075m8 = c2075m5.f6964i;
            while (true) {
                C2075m c2075m9 = c2075m8;
                c2075m3 = c2075m5;
                c2075m5 = c2075m9;
                if (c2075m5 == null) {
                    break;
                } else {
                    c2075m8 = c2075m5.f6964i;
                }
            }
        } else {
            C2075m c2075m10 = c2075m6.f6963h;
            while (true) {
                c2075m2 = c2075m6;
                c2075m6 = c2075m10;
                if (c2075m6 == null) {
                    break;
                } else {
                    c2075m10 = c2075m6.f6963h;
                }
            }
            c2075m3 = c2075m2;
        }
        m5136d(c2075m3, false);
        C2075m c2075m11 = c2075m.f6963h;
        if (c2075m11 != null) {
            i9 = c2075m11.f6970o;
            c2075m3.f6963h = c2075m11;
            c2075m11.f6962g = c2075m3;
            c2075m.f6963h = null;
        } else {
            i9 = 0;
        }
        C2075m c2075m12 = c2075m.f6964i;
        if (c2075m12 != null) {
            i10 = c2075m12.f6970o;
            c2075m3.f6964i = c2075m12;
            c2075m12.f6962g = c2075m3;
            c2075m.f6964i = null;
        }
        c2075m3.f6970o = Math.max(i9, i10) + 1;
        m5137e(c2075m, c2075m3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m5137e(C2075m c2075m, C2075m c2075m2) {
        C2075m c2075m3 = c2075m.f6962g;
        c2075m.f6962g = null;
        if (c2075m2 != null) {
            c2075m2.f6962g = c2075m3;
        }
        if (c2075m3 == null) {
            this.f6974i = c2075m2;
        } else if (c2075m3.f6963h == c2075m) {
            c2075m3.f6963h = c2075m2;
        } else {
            c2075m3.f6964i = c2075m2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C2074l c2074l = this.f6978m;
        if (c2074l != null) {
            return c2074l;
        }
        C2074l c2074l2 = new C2074l(this, 0);
        this.f6978m = c2074l2;
        return c2074l2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m5138f(C2075m c2075m) {
        C2075m c2075m2 = c2075m.f6963h;
        C2075m c2075m3 = c2075m.f6964i;
        C2075m c2075m4 = c2075m3.f6963h;
        C2075m c2075m5 = c2075m3.f6964i;
        c2075m.f6964i = c2075m4;
        if (c2075m4 != null) {
            c2075m4.f6962g = c2075m;
        }
        m5137e(c2075m, c2075m3);
        c2075m3.f6963h = c2075m;
        c2075m.f6962g = c2075m3;
        int iMax = Math.max(c2075m2 != null ? c2075m2.f6970o : 0, c2075m4 != null ? c2075m4.f6970o : 0) + 1;
        c2075m.f6970o = iMax;
        c2075m3.f6970o = Math.max(iMax, c2075m5 != null ? c2075m5.f6970o : 0) + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m5139g(C2075m c2075m) {
        C2075m c2075m2 = c2075m.f6963h;
        C2075m c2075m3 = c2075m.f6964i;
        C2075m c2075m4 = c2075m2.f6963h;
        C2075m c2075m5 = c2075m2.f6964i;
        c2075m.f6963h = c2075m5;
        if (c2075m5 != null) {
            c2075m5.f6962g = c2075m;
        }
        m5137e(c2075m, c2075m2);
        c2075m2.f6964i = c2075m;
        c2075m.f6962g = c2075m2;
        int iMax = Math.max(c2075m3 != null ? c2075m3.f6970o : 0, c2075m5 != null ? c2075m5.f6970o : 0) + 1;
        c2075m.f6970o = iMax;
        c2075m2.f6970o = Math.max(iMax, c2075m4 != null ? c2075m4.f6970o : 0) + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        C2075m c2075mM5134a;
        if (obj != null) {
            try {
                c2075mM5134a = m5134a(obj, false);
            } catch (ClassCastException unused) {
                c2075mM5134a = null;
            }
        } else {
            c2075mM5134a = null;
        }
        if (c2075mM5134a != null) {
            return c2075mM5134a.f6969n;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C2074l c2074l = this.f6979n;
        if (c2074l != null) {
            return c2074l;
        }
        C2074l c2074l2 = new C2074l(this, 1);
        this.f6979n = c2074l2;
        return c2074l2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            C0353j.m1305c("key == null");
            return null;
        }
        if (obj2 == null && !this.f6973h) {
            C0353j.m1305c("value == null");
            return null;
        }
        C2075m c2075mM5134a = m5134a(obj, true);
        Object obj3 = c2075mM5134a.f6969n;
        c2075mM5134a.f6969n = obj2;
        return obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        C2075m c2075mM5134a;
        if (obj != null) {
            try {
                c2075mM5134a = m5134a(obj, false);
            } catch (ClassCastException unused) {
                c2075mM5134a = null;
            }
        } else {
            c2075mM5134a = null;
        }
        if (c2075mM5134a != null) {
            m5136d(c2075mM5134a, true);
        }
        if (c2075mM5134a != null) {
            return c2075mM5134a.f6969n;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f6975j;
    }
}
