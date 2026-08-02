package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class uq2 {
    public int[] h = rg3.f;
    public Object[] i = rg3.h;
    public int j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public uq2(int i) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a(Object obj) {
        int i = this.j * 2;
        Object[] objArr = this.i;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(int i) {
        int i2 = this.j;
        int[] iArr = this.h;
        if (iArr.length < i) {
            this.h = Arrays.copyOf(iArr, i);
            this.i = Arrays.copyOf(this.i, i * 2);
        }
        if (this.j != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int c(int i, Object obj) {
        int i2 = this.j;
        if (i2 == 0) {
            return -1;
        }
        int iP = rg3.p(this.h, i2, i);
        if (iP < 0 || t11.l(obj, this.i[iP << 1])) {
            return iP;
        }
        int i3 = iP + 1;
        while (i3 < i2 && this.h[i3] == i) {
            if (t11.l(obj, this.i[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iP - 1; i4 >= 0 && this.h[i4] == i; i4--) {
            if (t11.l(obj, this.i[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void clear() {
        if (this.j > 0) {
            this.h = rg3.f;
            this.i = rg3.h;
            this.j = 0;
        }
        if (this.j > 0) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int e() {
        int i = this.j;
        if (i == 0) {
            return -1;
        }
        int iP = rg3.p(this.h, i, 0);
        if (iP < 0 || this.i[iP << 1] == null) {
            return iP;
        }
        int i2 = iP + 1;
        while (i2 < i && this.h[i2] == 0) {
            if (this.i[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iP - 1; i3 >= 0 && this.h[i3] == 0; i3--) {
            if (this.i[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof uq2) {
                int i = this.j;
                if (i != ((uq2) obj).j) {
                    return false;
                }
                uq2 uq2Var = (uq2) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objF = f(i2);
                    Object objJ = j(i2);
                    Object obj2 = uq2Var.get(objF);
                    if (objJ == null) {
                        if (obj2 != null || !uq2Var.containsKey(objF)) {
                            return false;
                        }
                    } else if (!objJ.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.j != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.j;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objF2 = f(i4);
                Object objJ2 = j(i4);
                Object obj3 = ((Map) obj).get(objF2);
                if (objJ2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!objJ2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object f(int i) {
        boolean z = false;
        if (i >= 0 && i < this.j) {
            z = true;
        }
        if (z) {
            return this.i[i << 1];
        }
        s.j(vi0.g("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void g(ro roVar) {
        int i = roVar.j;
        b(this.j + i);
        if (this.j != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(roVar.f(i2), roVar.j(i2));
            }
        } else if (i > 0) {
            mg.a0(roVar.h, this.h, 0, 0, i);
            mg.c0(roVar.i, this.i, 0, 0, i << 1);
            this.j = i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.i[(iD << 1) + 1];
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.i[(iD << 1) + 1] : obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object h(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.j)) {
            s.j(vi0.g("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        Object[] objArr = this.i;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.h;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                mg.a0(iArr, iArr, i, i5, i2);
                Object[] objArr2 = this.i;
                mg.c0(objArr2, objArr2, i3, i5 << 1, i2 << 1);
            }
            Object[] objArr3 = this.i;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.h = Arrays.copyOf(iArr, i7);
            this.i = Arrays.copyOf(this.i, i7 << 1);
            if (i2 != this.j) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                mg.a0(iArr, this.h, 0, 0, i);
                mg.c0(objArr, this.i, 0, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                mg.a0(iArr, this.h, i, i8, i2);
                mg.c0(objArr, this.i, i3, i8 << 1, i2 << 1);
            }
        }
        if (i2 != this.j) {
            throw new ConcurrentModificationException();
        }
        this.j = i4;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        int[] iArr = this.h;
        Object[] objArr = this.i;
        int i = this.j;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object i(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.j) {
            z = true;
        }
        if (!z) {
            s.j(vi0.g("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.i;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isEmpty() {
        return this.j <= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object j(int i) {
        boolean z = false;
        if (i >= 0 && i < this.j) {
            z = true;
        }
        if (z) {
            return this.i[(i << 1) + 1];
        }
        s.j(vi0.g("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object put(Object obj, Object obj2) {
        int i = this.j;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : e();
        if (iC >= 0) {
            int i2 = (iC << 1) + 1;
            Object[] objArr = this.i;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iC;
        int[] iArr = this.h;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.h = Arrays.copyOf(iArr, i4);
            this.i = Arrays.copyOf(this.i, i4 << 1);
            if (i != this.j) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.h;
            int i5 = i3 + 1;
            mg.a0(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.i;
            mg.c0(objArr2, objArr2, i5 << 1, i3 << 1, this.j << 1);
        }
        int i6 = this.j;
        if (i == i6) {
            int[] iArr3 = this.h;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.i;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.j = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !t11.l(obj2, j(iD))) {
            return false;
        }
        h(iD);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !t11.l(obj2, j(iD))) {
            return false;
        }
        i(iD, obj3);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int size() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.j * 28);
        sb.append('{');
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objF = f(i2);
            if (objF != sb) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objJ = j(i2);
            if (objJ != sb) {
                sb.append(objJ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return i(iD, obj2);
        }
        return null;
    }
}
