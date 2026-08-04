package yyds;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: yyds.ᛳᲇᛸᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0728 implements Map, Serializable, InterfaceC0527 {

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static final C0728 f3395;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public C1479 f3396;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f3397;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public C2314 f3398;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int f3399;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int[] f3400;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public boolean f3401;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f3402;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public int f3403;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public C1479 f3404;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public int f3405;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public Object[] f3406;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int[] f3407;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Object[] f3408;

    static {
        C0728 c0728 = new C0728(0);
        c0728.f3401 = true;
        f3395 = c0728;
    }

    public C0728(int i) {
        if (i < 0) {
            C0188.m798("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f3406 = objArr;
        this.f3408 = null;
        this.f3400 = iArr;
        this.f3407 = new int[iHighestOneBit];
        this.f3402 = 2;
        this.f3397 = 0;
        this.f3399 = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    @Override // java.util.Map
    public final void clear() {
        m1672();
        int i = this.f3397 - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f3400;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.f3407[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        AbstractC2217.m4202(this.f3406, 0, this.f3397);
        Object[] objArr = this.f3408;
        if (objArr != null) {
            AbstractC2217.m4202(objArr, 0, this.f3397);
        }
        this.f3403 = 0;
        this.f3397 = 0;
        this.f3405++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m1670(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i;
        int i2 = this.f3397;
        while (true) {
            i = -1;
            i2--;
            if (i2 >= 0) {
                if (this.f3400[i2] >= 0 && AbstractC1544.m3188(this.f3408[i2], obj)) {
                    i = i2;
                    break;
                }
            } else {
                break;
            }
        }
        return i >= 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C1479 c1479 = this.f3396;
        if (c1479 != null) {
            return c1479;
        }
        C1479 c14792 = new C1479(this, 0);
        this.f3396 = c14792;
        return c14792;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f3403 == map.size()) {
                for (Object obj2 : map.entrySet()) {
                    if (obj2 != null) {
                        try {
                            Map.Entry entry = (Map.Entry) obj2;
                            int iM1670 = m1670(entry.getKey());
                            if (!(iM1670 < 0 ? false : AbstractC1544.m3188(this.f3408[iM1670], entry.getValue()))) {
                            }
                        } catch (ClassCastException unused) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iM1670 = m1670(obj);
        if (iM1670 < 0) {
            return null;
        }
        return this.f3408[iM1670];
    }

    @Override // java.util.Map
    public final int hashCode() {
        C0523 c0523 = new C0523(this, 0);
        int i = 0;
        while (c0523.hasNext()) {
            int i2 = c0523.f9365;
            C0728 c0728 = (C0728) c0523.f9366;
            if (i2 >= c0728.f3397) {
                throw new NoSuchElementException();
            }
            c0523.f9365 = i2 + 1;
            c0523.f9367 = i2;
            Object obj = c0728.f3406[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object obj2 = c0728.f3408[c0523.f9367];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c0523.m3644();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f3403 == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C1479 c1479 = this.f3404;
        if (c1479 != null) {
            return c1479;
        }
        C1479 c14792 = new C1479(this, 1);
        this.f3404 = c14792;
        return c14792;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        m1672();
        int iM1671 = m1671(obj);
        Object[] objArr = this.f3408;
        if (objArr == null) {
            int length = this.f3406.length;
            if (length < 0) {
                C0188.m798("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.f3408 = objArr;
        }
        if (iM1671 >= 0) {
            objArr[iM1671] = obj2;
            return null;
        }
        int i = (-iM1671) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m1672();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        m1676(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iM1671 = m1671(entry.getKey());
            Object[] objArr = this.f3408;
            if (objArr == null) {
                int length = this.f3406.length;
                if (length < 0) {
                    C0188.m798("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.f3408 = objArr;
                }
            }
            if (iM1671 >= 0) {
                objArr[iM1671] = entry.getValue();
            } else {
                int i = (-iM1671) - 1;
                if (!AbstractC1544.m3188(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        m1672();
        int iM1670 = m1670(obj);
        if (iM1670 < 0) {
            return null;
        }
        Object obj2 = this.f3408[iM1670];
        m1669(iM1670);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f3403;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f3403 * 3) + 2);
        sb.append("{");
        int i = 0;
        C0523 c0523 = new C0523(this, 0);
        while (c0523.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = c0523.f9365;
            C0728 c0728 = (C0728) c0523.f9366;
            if (i2 >= c0728.f3397) {
                throw new NoSuchElementException();
            }
            c0523.f9365 = i2 + 1;
            c0523.f9367 = i2;
            Object obj = c0728.f3406[i2];
            if (obj == c0728) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object obj2 = c0728.f3408[c0523.f9367];
            if (obj2 == c0728) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            c0523.m3644();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        C2314 c2314 = this.f3398;
        if (c2314 != null) {
            return c2314;
        }
        C2314 c23142 = new C2314(this);
        this.f3398 = c23142;
        return c23142;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final void m1669(int i) {
        int i2;
        int i3;
        int iM1675;
        int[] iArr;
        this.f3406[i] = null;
        Object[] objArr = this.f3408;
        if (objArr != null) {
            objArr[i] = null;
        }
        int length = this.f3400[i];
        loop0: while (true) {
            int i4 = length;
            int i5 = 0;
            do {
                length = length == 0 ? this.f3407.length - 1 : length - 1;
                int[] iArr2 = this.f3407;
                i2 = iArr2[length];
                i5++;
                if (i5 > this.f3402) {
                    iArr2[i4] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i4] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    iM1675 = m1675(this.f3406[i3]) - length;
                    iArr = this.f3407;
                }
            } while ((iM1675 & (iArr.length - 1)) < i5);
            iArr[i4] = i2;
            this.f3400[i3] = i4;
        }
        this.f3400[i] = -1;
        this.f3403--;
        this.f3405++;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int m1670(Object obj) {
        int iM1675 = m1675(obj);
        int i = this.f3402;
        while (true) {
            int i2 = this.f3407[iM1675];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (AbstractC1544.m3188(this.f3406[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iM1675 = iM1675 == 0 ? this.f3407.length - 1 : iM1675 - 1;
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int m1671(Object obj) {
        m1672();
        while (true) {
            int iM1675 = m1675(obj);
            int i = this.f3402 * 2;
            int length = this.f3407.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.f3407;
                int i3 = iArr[iM1675];
                if (i3 == 0) {
                    int i4 = this.f3397;
                    Object[] objArr = this.f3406;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.f3397 = i5;
                        objArr[i4] = obj;
                        this.f3400[i4] = iM1675;
                        iArr[iM1675] = i5;
                        this.f3403++;
                        this.f3405++;
                        if (i2 > this.f3402) {
                            this.f3402 = i2;
                        }
                        return i4;
                    }
                    m1676(1);
                } else {
                    if (AbstractC1544.m3188(this.f3406[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        m1673(this.f3407.length * 2);
                        break;
                    }
                    iM1675 = iM1675 == 0 ? this.f3407.length - 1 : iM1675 - 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m1672() {
        if (this.f3401) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f3400[r2] = r0;
        r2 = r6;
     */
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1673(int i) {
        this.f3405++;
        int i2 = 0;
        if (this.f3397 > this.f3403) {
            m1674(false);
        }
        this.f3407 = new int[i];
        this.f3399 = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.f3397) {
            int i3 = i2 + 1;
            int iM1675 = m1675(this.f3406[i2]);
            int i4 = this.f3402;
            while (true) {
                int[] iArr = this.f3407;
                if (iArr[iM1675] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    C0188.m800("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                iM1675 = iM1675 == 0 ? iArr.length - 1 : iM1675 - 1;
            }
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m1674(boolean z) {
        int i;
        Object[] objArr = this.f3408;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f3397;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f3400;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.f3406;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.f3407[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        AbstractC2217.m4202(this.f3406, i3, i);
        if (objArr != null) {
            AbstractC2217.m4202(objArr, i3, this.f3397);
        }
        this.f3397 = i3;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final int m1675(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f3399;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m1676(int i) {
        Object[] objArr = this.f3406;
        int length = objArr.length;
        int i2 = this.f3397;
        int i3 = length - i2;
        int i4 = i2 - this.f3403;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            m1674(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.f3406 = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.f3408;
            this.f3408 = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.f3400 = Arrays.copyOf(this.f3400, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.f3407.length) {
                m1673(iHighestOneBit);
            }
        }
    }

    public C0728() {
        this(8);
    }
}
