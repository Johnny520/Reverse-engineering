package androidx.collection;

import java.util.Arrays;
import java.util.Map;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p025.AbstractC7012;
import p203.AbstractC8601;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C1130 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object[] f1338;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f1339;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int[] f1340;

    public C1130(int i) {
        this.f1340 = i == 0 ? AbstractC8601.f21426 : new int[i];
        this.f1338 = i == 0 ? AbstractC8601.f21424 : new Object[i << 1];
    }

    public void clear() {
        if (this.f1339 > 0) {
            this.f1340 = AbstractC8601.f21426;
            this.f1338 = AbstractC8601.f21424;
            this.f1339 = 0;
        }
        if (this.f1339 <= 0) {
            return;
        }
        C1123.m1400();
    }

    public boolean containsKey(Object obj) {
        return m1424(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m1427(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C1130) {
                int i = this.f1339;
                if (i != ((C1130) obj).f1339) {
                    return false;
                }
                C1130 c1130 = (C1130) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objM1422 = m1422(i2);
                    Object objM1431 = m1431(i2);
                    Object obj2 = c1130.get(objM1422);
                    if (objM1431 == null) {
                        if (obj2 != null || !c1130.containsKey(objM1422)) {
                            return false;
                        }
                    } else if (!objM1431.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f1339 != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.f1339;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objM14222 = m1422(i4);
                Object objM14312 = m1431(i4);
                Object obj3 = ((Map) obj).get(objM14222);
                if (objM14312 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objM14222)) {
                        return false;
                    }
                } else if (!objM14312.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object get(Object obj) {
        int iM1424 = m1424(obj);
        if (iM1424 >= 0) {
            return this.f1338[(iM1424 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM1424 = m1424(obj);
        return iM1424 >= 0 ? this.f1338[(iM1424 << 1) + 1] : obj2;
    }

    public int hashCode() {
        int[] iArr = this.f1340;
        Object[] objArr = this.f1338;
        int i = this.f1339;
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

    public final boolean isEmpty() {
        return this.f1339 <= 0;
    }

    public Object put(Object obj, Object obj2) {
        int i = this.f1339;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iM1425 = obj != null ? m1425(iHashCode, obj) : m1423();
        if (iM1425 >= 0) {
            int i2 = (iM1425 << 1) + 1;
            Object[] objArr = this.f1338;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iM1425;
        int[] iArr = this.f1340;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.f1340 = Arrays.copyOf(iArr, i4);
            this.f1338 = Arrays.copyOf(this.f1338, i4 << 1);
            if (i != this.f1339) {
                C1123.m1400();
                return null;
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f1340;
            int i5 = i3 + 1;
            AbstractC5179.m9395(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.f1338;
            AbstractC5179.m9394(i5 << 1, i3 << 1, objArr2, this.f1339 << 1, objArr2);
        }
        int i6 = this.f1339;
        if (i == i6) {
            int[] iArr3 = this.f1340;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.f1338;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.f1339 = i6 + 1;
                return null;
            }
        }
        C1123.m1400();
        return null;
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM1424 = m1424(obj);
        if (iM1424 < 0 || !AbstractC5227.m9466(obj2, m1431(iM1424))) {
            return false;
        }
        mo1428(iM1424);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM1424 = m1424(obj);
        if (iM1424 < 0 || !AbstractC5227.m9466(obj2, m1431(iM1424))) {
            return false;
        }
        mo1430(iM1424, obj3);
        return true;
    }

    public final int size() {
        return this.f1339;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1339 * 28);
        sb.append('{');
        int i = this.f1339;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objM1422 = m1422(i2);
            if (objM1422 != sb) {
                sb.append(objM1422);
            } else {
                sb.append("(this Map)");
            }
            sb.append(SignatureVisitor.INSTANCEOF);
            Object objM1431 = m1431(i2);
            if (objM1431 != sb) {
                sb.append(objM1431);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object m1422(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f1339) {
            z = true;
        }
        if (z) {
            return this.f1338[i << 1];
        }
        C6755.m11869(AbstractC7012.m12147(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m1423() {
        int i = this.f1339;
        if (i == 0) {
            return -1;
        }
        int iM13683 = AbstractC8601.m13683(this.f1340, i, 0);
        if (iM13683 < 0 || this.f1338[iM13683 << 1] == null) {
            return iM13683;
        }
        int i2 = iM13683 + 1;
        while (i2 < i && this.f1340[i2] == 0) {
            if (this.f1338[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM13683 - 1; i3 >= 0 && this.f1340[i3] == 0; i3--) {
            if (this.f1338[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m1424(Object obj) {
        return obj == null ? m1423() : m1425(obj.hashCode(), obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m1425(int i, Object obj) {
        int i2 = this.f1339;
        if (i2 == 0) {
            return -1;
        }
        int iM13683 = AbstractC8601.m13683(this.f1340, i2, i);
        if (iM13683 < 0 || AbstractC5227.m9466(obj, this.f1338[iM13683 << 1])) {
            return iM13683;
        }
        int i3 = iM13683 + 1;
        while (i3 < i2 && this.f1340[i3] == i) {
            if (AbstractC5227.m9466(obj, this.f1338[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM13683 - 1; i4 >= 0 && this.f1340[i4] == i; i4--) {
            if (AbstractC5227.m9466(obj, this.f1338[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m1426(int i) {
        int i2 = this.f1339;
        int[] iArr = this.f1340;
        if (iArr.length < i) {
            this.f1340 = Arrays.copyOf(iArr, i);
            this.f1338 = Arrays.copyOf(this.f1338, i * 2);
        }
        if (this.f1339 == i2) {
            return;
        }
        C1123.m1400();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m1427(Object obj) {
        int i = this.f1339 * 2;
        Object[] objArr = this.f1338;
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

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public Object mo1428(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f1339)) {
            C6755.m11869(AbstractC7012.m12147(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        Object[] objArr = this.f1338;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.f1340;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                AbstractC5179.m9395(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.f1338;
                AbstractC5179.m9394(i3, i5 << 1, objArr2, i2 << 1, objArr2);
            }
            Object[] objArr3 = this.f1338;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.f1340 = Arrays.copyOf(iArr, i7);
            this.f1338 = Arrays.copyOf(this.f1338, i7 << 1);
            if (i2 != this.f1339) {
                C1123.m1400();
                return null;
            }
            if (i > 0) {
                AbstractC5179.m9395(0, 0, i, iArr, this.f1340);
                AbstractC5179.m9394(0, 0, objArr, i3, this.f1338);
            }
            if (i < i4) {
                int i8 = i + 1;
                AbstractC5179.m9395(i, i8, i2, iArr, this.f1340);
                AbstractC5179.m9394(i3, i8 << 1, objArr, i2 << 1, this.f1338);
            }
        }
        if (i2 == this.f1339) {
            this.f1339 = i4;
            return obj;
        }
        C1123.m1400();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void mo1429(C1104 c1104) {
        int i = c1104.f1339;
        m1426(this.f1339 + i);
        if (this.f1339 != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(c1104.m1422(i2), c1104.m1431(i2));
            }
        } else if (i > 0) {
            AbstractC5179.m9395(0, 0, i, c1104.f1340, this.f1340);
            AbstractC5179.m9394(0, 0, c1104.f1338, i << 1, this.f1338);
            this.f1339 = i;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public Object mo1430(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.f1339) {
            z = true;
        }
        if (!z) {
            C6755.m11869(AbstractC7012.m12147(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f1338;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Object m1431(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f1339) {
            z = true;
        }
        if (z) {
            return this.f1338[(i << 1) + 1];
        }
        C6755.m11869(AbstractC7012.m12147(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public Object remove(Object obj) {
        int iM1424 = m1424(obj);
        if (iM1424 >= 0) {
            return mo1428(iM1424);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM1424 = m1424(obj);
        if (iM1424 >= 0) {
            return mo1430(iM1424, obj2);
        }
        return null;
    }
}
