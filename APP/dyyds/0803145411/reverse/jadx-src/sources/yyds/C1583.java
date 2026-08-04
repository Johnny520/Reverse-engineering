package yyds;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: renamed from: yyds.ᛷᛶᲁᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1583 extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final C1300 f8019 = new C1300(15);

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final C2580 f8020;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public C0628 f8021;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public C2580 f8022;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public C0628 f8024;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final boolean f8027;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f8026 = 0;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f8023 = 0;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Comparator f8025 = f8019;

    public C1583(boolean z) {
        this.f8027 = z;
        this.f8020 = new C2580(z);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f8022 = null;
        this.f8026 = 0;
        this.f8023++;
        C2580 c2580 = this.f8020;
        c2580.f12722 = c2580;
        c2580.f12726 = c2580;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C2580 c2580M3246 = null;
        if (obj != null) {
            try {
                c2580M3246 = m3246(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return c2580M3246 != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0628 c0628 = this.f8021;
        if (c0628 != null) {
            return c0628;
        }
        C0628 c06282 = new C0628(this, 0);
        this.f8021 = c06282;
        return c06282;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        C2580 c2580M3246;
        if (obj != null) {
            try {
                c2580M3246 = m3246(obj, false);
            } catch (ClassCastException unused) {
                c2580M3246 = null;
            }
        } else {
            c2580M3246 = null;
        }
        if (c2580M3246 != null) {
            return c2580M3246.f12724;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C0628 c0628 = this.f8024;
        if (c0628 != null) {
            return c0628;
        }
        C0628 c06282 = new C0628(this, 1);
        this.f8024 = c06282;
        return c06282;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            C0188.m789("key == null");
            return null;
        }
        if (obj2 == null && !this.f8027) {
            C0188.m789("value == null");
            return null;
        }
        C2580 c2580M3246 = m3246(obj, true);
        Object obj3 = c2580M3246.f12724;
        c2580M3246.f12724 = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        C2580 c2580M3246;
        if (obj != null) {
            try {
                c2580M3246 = m3246(obj, false);
            } catch (ClassCastException unused) {
                c2580M3246 = null;
            }
        } else {
            c2580M3246 = null;
        }
        if (c2580M3246 != null) {
            m3248(c2580M3246, true);
        }
        if (c2580M3246 != null) {
            return c2580M3246.f12724;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f8026;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m3245(C2580 c2580) {
        C2580 c25802 = c2580.f12727;
        C2580 c25803 = c2580.f12721;
        C2580 c25804 = c25803.f12727;
        C2580 c25805 = c25803.f12721;
        c2580.f12721 = c25804;
        if (c25804 != null) {
            c25804.f12725 = c2580;
        }
        m3250(c2580, c25803);
        c25803.f12727 = c2580;
        c2580.f12725 = c25803;
        int iMax = Math.max(c25802 != null ? c25802.f12723 : 0, c25804 != null ? c25804.f12723 : 0) + 1;
        c2580.f12723 = iMax;
        c25803.f12723 = Math.max(iMax, c25805 != null ? c25805.f12723 : 0) + 1;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C2580 m3246(Object obj, boolean z) {
        int iCompareTo;
        C2580 c2580;
        C2580 c25802 = this.f8022;
        C1300 c1300 = f8019;
        Comparator comparator = this.f8025;
        if (c25802 != null) {
            Comparable comparable = comparator == c1300 ? (Comparable) obj : null;
            while (true) {
                Object obj2 = c25802.f12719;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return c25802;
                }
                C2580 c25803 = iCompareTo < 0 ? c25802.f12727 : c25802.f12721;
                if (c25803 == null) {
                    break;
                }
                c25802 = c25803;
            }
        } else {
            iCompareTo = 0;
        }
        C2580 c25804 = c25802;
        if (!z) {
            return null;
        }
        C2580 c25805 = this.f8020;
        if (c25804 != null) {
            c2580 = new C2580(this.f8027, c25804, obj, c25805, c25805.f12722);
            if (iCompareTo < 0) {
                c25804.f12727 = c2580;
            } else {
                c25804.f12721 = c2580;
            }
            m3247(c25804, true);
        } else {
            if (comparator == c1300 && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c2580 = new C2580(this.f8027, c25804, obj, c25805, c25805.f12722);
            this.f8022 = c2580;
        }
        this.f8026++;
        this.f8023++;
        return c2580;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m3247(C2580 c2580, boolean z) {
        while (c2580 != null) {
            C2580 c25802 = c2580.f12727;
            C2580 c25803 = c2580.f12721;
            int i = c25802 != null ? c25802.f12723 : 0;
            int i2 = c25803 != null ? c25803.f12723 : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                C2580 c25804 = c25803.f12727;
                C2580 c25805 = c25803.f12721;
                int i4 = (c25804 != null ? c25804.f12723 : 0) - (c25805 != null ? c25805.f12723 : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    m3245(c2580);
                } else {
                    m3249(c25803);
                    m3245(c2580);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                C2580 c25806 = c25802.f12727;
                C2580 c25807 = c25802.f12721;
                int i5 = (c25806 != null ? c25806.f12723 : 0) - (c25807 != null ? c25807.f12723 : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    m3249(c2580);
                } else {
                    m3245(c25802);
                    m3249(c2580);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                c2580.f12723 = i + 1;
                if (z) {
                    return;
                }
            } else {
                c2580.f12723 = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c2580 = c2580.f12725;
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m3248(C2580 c2580, boolean z) {
        C2580 c25802;
        C2580 c25803;
        int i;
        if (z) {
            C2580 c25804 = c2580.f12722;
            c25804.f12726 = c2580.f12726;
            c2580.f12726.f12722 = c25804;
        }
        C2580 c25805 = c2580.f12727;
        C2580 c25806 = c2580.f12721;
        C2580 c25807 = c2580.f12725;
        int i2 = 0;
        if (c25805 == null || c25806 == null) {
            if (c25805 != null) {
                m3250(c2580, c25805);
                c2580.f12727 = null;
            } else if (c25806 != null) {
                m3250(c2580, c25806);
                c2580.f12721 = null;
            } else {
                m3250(c2580, null);
            }
            m3247(c25807, false);
            this.f8026--;
            this.f8023++;
            return;
        }
        if (c25805.f12723 > c25806.f12723) {
            C2580 c25808 = c25805.f12721;
            while (true) {
                C2580 c25809 = c25808;
                c25803 = c25805;
                c25805 = c25809;
                if (c25805 == null) {
                    break;
                } else {
                    c25808 = c25805.f12721;
                }
            }
        } else {
            C2580 c258010 = c25806.f12727;
            while (true) {
                c25802 = c25806;
                c25806 = c258010;
                if (c25806 == null) {
                    break;
                } else {
                    c258010 = c25806.f12727;
                }
            }
            c25803 = c25802;
        }
        m3248(c25803, false);
        C2580 c258011 = c2580.f12727;
        if (c258011 != null) {
            i = c258011.f12723;
            c25803.f12727 = c258011;
            c258011.f12725 = c25803;
            c2580.f12727 = null;
        } else {
            i = 0;
        }
        C2580 c258012 = c2580.f12721;
        if (c258012 != null) {
            i2 = c258012.f12723;
            c25803.f12721 = c258012;
            c258012.f12725 = c25803;
            c2580.f12721 = null;
        }
        c25803.f12723 = Math.max(i, i2) + 1;
        m3250(c2580, c25803);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m3249(C2580 c2580) {
        C2580 c25802 = c2580.f12727;
        C2580 c25803 = c2580.f12721;
        C2580 c25804 = c25802.f12727;
        C2580 c25805 = c25802.f12721;
        c2580.f12727 = c25805;
        if (c25805 != null) {
            c25805.f12725 = c2580;
        }
        m3250(c2580, c25802);
        c25802.f12721 = c2580;
        c2580.f12725 = c25802;
        int iMax = Math.max(c25803 != null ? c25803.f12723 : 0, c25805 != null ? c25805.f12723 : 0) + 1;
        c2580.f12723 = iMax;
        c25802.f12723 = Math.max(iMax, c25804 != null ? c25804.f12723 : 0) + 1;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m3250(C2580 c2580, C2580 c25802) {
        C2580 c25803 = c2580.f12725;
        c2580.f12725 = null;
        if (c25802 != null) {
            c25802.f12725 = c25803;
        }
        if (c25803 == null) {
            this.f8022 = c25802;
        } else if (c25803.f12727 == c2580) {
            c25803.f12727 = c25802;
        } else {
            c25803.f12721 = c25802;
        }
    }
}
