package androidx.collection;

import java.util.Arrays;
import java.util.Map;
import kotlin.collections.AbstractC4347;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p009.AbstractC6183;
import p187.AbstractC7772;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C0283 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object[] f993;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f994;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int[] f995;

    public C0283(int i) {
        this.f995 = i == 0 ? AbstractC7772.f21081 : new int[i];
        this.f993 = i == 0 ? AbstractC7772.f21079 : new Object[i << 1];
    }

    public void clear() {
        if (this.f994 > 0) {
            this.f995 = AbstractC7772.f21081;
            this.f993 = AbstractC7772.f21079;
            this.f994 = 0;
        }
        if (this.f994 <= 0) {
            return;
        }
        C0276.m840();
    }

    public boolean containsKey(Object obj) {
        return m864(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m867(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C0283) {
                int i = this.f994;
                if (i != ((C0283) obj).f994) {
                    return false;
                }
                C0283 c0283 = (C0283) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objM862 = m862(i2);
                    Object objM871 = m871(i2);
                    Object obj2 = c0283.get(objM862);
                    if (objM871 == null) {
                        if (obj2 != null || !c0283.containsKey(objM862)) {
                            return false;
                        }
                    } else if (!objM871.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f994 != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.f994;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objM8622 = m862(i4);
                Object objM8712 = m871(i4);
                Object obj3 = ((Map) obj).get(objM8622);
                if (objM8712 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objM8622)) {
                        return false;
                    }
                } else if (!objM8712.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object get(Object obj) {
        int iM864 = m864(obj);
        if (iM864 >= 0) {
            return this.f993[(iM864 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM864 = m864(obj);
        return iM864 >= 0 ? this.f993[(iM864 << 1) + 1] : obj2;
    }

    public int hashCode() {
        int[] iArr = this.f995;
        Object[] objArr = this.f993;
        int i = this.f994;
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
        return this.f994 <= 0;
    }

    public Object put(Object obj, Object obj2) {
        int i = this.f994;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iM865 = obj != null ? m865(iHashCode, obj) : m863();
        if (iM865 >= 0) {
            int i2 = (iM865 << 1) + 1;
            Object[] objArr = this.f993;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iM865;
        int[] iArr = this.f995;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.f995 = Arrays.copyOf(iArr, i4);
            this.f993 = Arrays.copyOf(this.f993, i4 << 1);
            if (i != this.f994) {
                C0276.m840();
                return null;
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f995;
            int i5 = i3 + 1;
            AbstractC4347.m8836(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.f993;
            AbstractC4347.m8835(i5 << 1, i3 << 1, objArr2, this.f994 << 1, objArr2);
        }
        int i6 = this.f994;
        if (i == i6) {
            int[] iArr3 = this.f995;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.f993;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.f994 = i6 + 1;
                return null;
            }
        }
        C0276.m840();
        return null;
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM864 = m864(obj);
        if (iM864 < 0 || !AbstractC4395.m8907(obj2, m871(iM864))) {
            return false;
        }
        mo868(iM864);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM864 = m864(obj);
        if (iM864 < 0 || !AbstractC4395.m8907(obj2, m871(iM864))) {
            return false;
        }
        mo870(iM864, obj3);
        return true;
    }

    public final int size() {
        return this.f994;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f994 * 28);
        sb.append('{');
        int i = this.f994;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objM862 = m862(i2);
            if (objM862 != sb) {
                sb.append(objM862);
            } else {
                sb.append("(this Map)");
            }
            sb.append(SignatureVisitor.INSTANCEOF);
            Object objM871 = m871(i2);
            if (objM871 != sb) {
                sb.append(objM871);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object m862(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f994) {
            z = true;
        }
        if (z) {
            return this.f993[i << 1];
        }
        C5925.m11310(AbstractC6183.m11588(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m863() {
        int i = this.f994;
        if (i == 0) {
            return -1;
        }
        int iM13124 = AbstractC7772.m13124(this.f995, i, 0);
        if (iM13124 < 0 || this.f993[iM13124 << 1] == null) {
            return iM13124;
        }
        int i2 = iM13124 + 1;
        while (i2 < i && this.f995[i2] == 0) {
            if (this.f993[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM13124 - 1; i3 >= 0 && this.f995[i3] == 0; i3--) {
            if (this.f993[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m864(Object obj) {
        return obj == null ? m863() : m865(obj.hashCode(), obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m865(int i, Object obj) {
        int i2 = this.f994;
        if (i2 == 0) {
            return -1;
        }
        int iM13124 = AbstractC7772.m13124(this.f995, i2, i);
        if (iM13124 < 0 || AbstractC4395.m8907(obj, this.f993[iM13124 << 1])) {
            return iM13124;
        }
        int i3 = iM13124 + 1;
        while (i3 < i2 && this.f995[i3] == i) {
            if (AbstractC4395.m8907(obj, this.f993[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM13124 - 1; i4 >= 0 && this.f995[i4] == i; i4--) {
            if (AbstractC4395.m8907(obj, this.f993[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m866(int i) {
        int i2 = this.f994;
        int[] iArr = this.f995;
        if (iArr.length < i) {
            this.f995 = Arrays.copyOf(iArr, i);
            this.f993 = Arrays.copyOf(this.f993, i * 2);
        }
        if (this.f994 == i2) {
            return;
        }
        C0276.m840();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m867(Object obj) {
        int i = this.f994 * 2;
        Object[] objArr = this.f993;
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
    public Object mo868(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f994)) {
            C5925.m11310(AbstractC6183.m11588(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        Object[] objArr = this.f993;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.f995;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                AbstractC4347.m8836(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.f993;
                AbstractC4347.m8835(i3, i5 << 1, objArr2, i2 << 1, objArr2);
            }
            Object[] objArr3 = this.f993;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.f995 = Arrays.copyOf(iArr, i7);
            this.f993 = Arrays.copyOf(this.f993, i7 << 1);
            if (i2 != this.f994) {
                C0276.m840();
                return null;
            }
            if (i > 0) {
                AbstractC4347.m8836(0, 0, i, iArr, this.f995);
                AbstractC4347.m8835(0, 0, objArr, i3, this.f993);
            }
            if (i < i4) {
                int i8 = i + 1;
                AbstractC4347.m8836(i, i8, i2, iArr, this.f995);
                AbstractC4347.m8835(i3, i8 << 1, objArr, i2 << 1, this.f993);
            }
        }
        if (i2 == this.f994) {
            this.f994 = i4;
            return obj;
        }
        C0276.m840();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void mo869(C0257 c0257) {
        int i = c0257.f994;
        m866(this.f994 + i);
        if (this.f994 != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(c0257.m862(i2), c0257.m871(i2));
            }
        } else if (i > 0) {
            AbstractC4347.m8836(0, 0, i, c0257.f995, this.f995);
            AbstractC4347.m8835(0, 0, c0257.f993, i << 1, this.f993);
            this.f994 = i;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public Object mo870(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.f994) {
            z = true;
        }
        if (!z) {
            C5925.m11310(AbstractC6183.m11588(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f993;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Object m871(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f994) {
            z = true;
        }
        if (z) {
            return this.f993[(i << 1) + 1];
        }
        C5925.m11310(AbstractC6183.m11588(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public Object remove(Object obj) {
        int iM864 = m864(obj);
        if (iM864 >= 0) {
            return mo868(iM864);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM864 = m864(obj);
        if (iM864 >= 0) {
            return mo870(iM864, obj2);
        }
        return null;
    }
}
