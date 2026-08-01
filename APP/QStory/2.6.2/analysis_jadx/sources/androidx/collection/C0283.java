package androidx.collection;

import java.util.Arrays;
import java.util.Map;
import kotlin.collections.AbstractC4346;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p007.AbstractC6136;
import p187.AbstractC7771;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C0283 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object[] f993;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f994;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int[] f995;

    public C0283(int i) {
        this.f995 = i == 0 ? AbstractC7771.f21084 : new int[i];
        this.f993 = i == 0 ? AbstractC7771.f21082 : new Object[i << 1];
    }

    public void clear() {
        if (this.f994 > 0) {
            this.f995 = AbstractC7771.f21084;
            this.f993 = AbstractC7771.f21082;
            this.f994 = 0;
        }
        if (this.f994 <= 0) {
            return;
        }
        C0276.m839();
    }

    public boolean containsKey(Object obj) {
        return m863(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m866(obj) >= 0;
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
                    Object objM861 = m861(i2);
                    Object objM870 = m870(i2);
                    Object obj2 = c0283.get(objM861);
                    if (objM870 == null) {
                        if (obj2 != null || !c0283.containsKey(objM861)) {
                            return false;
                        }
                    } else if (!objM870.equals(obj2)) {
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
                Object objM8612 = m861(i4);
                Object objM8702 = m870(i4);
                Object obj3 = ((Map) obj).get(objM8612);
                if (objM8702 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objM8612)) {
                        return false;
                    }
                } else if (!objM8702.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object get(Object obj) {
        int iM863 = m863(obj);
        if (iM863 >= 0) {
            return this.f993[(iM863 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM863 = m863(obj);
        return iM863 >= 0 ? this.f993[(iM863 << 1) + 1] : obj2;
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
        int iM864 = obj != null ? m864(iHashCode, obj) : m862();
        if (iM864 >= 0) {
            int i2 = (iM864 << 1) + 1;
            Object[] objArr = this.f993;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iM864;
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
                C0276.m839();
                return null;
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f995;
            int i5 = i3 + 1;
            AbstractC4346.m8842(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.f993;
            AbstractC4346.m8839(i5 << 1, i3 << 1, objArr2, this.f994 << 1, objArr2);
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
        C0276.m839();
        return null;
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM863 = m863(obj);
        if (iM863 < 0 || !AbstractC4394.m8917(obj2, m870(iM863))) {
            return false;
        }
        mo867(iM863);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM863 = m863(obj);
        if (iM863 < 0 || !AbstractC4394.m8917(obj2, m870(iM863))) {
            return false;
        }
        mo869(iM863, obj3);
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
            Object objM861 = m861(i2);
            if (objM861 != sb) {
                sb.append(objM861);
            } else {
                sb.append("(this Map)");
            }
            sb.append(SignatureVisitor.INSTANCEOF);
            Object objM870 = m870(i2);
            if (objM870 != sb) {
                sb.append(objM870);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object m861(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f994) {
            z = true;
        }
        if (z) {
            return this.f993[i << 1];
        }
        C5919.m11249(AbstractC6136.m11556(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m862() {
        int i = this.f994;
        if (i == 0) {
            return -1;
        }
        int iM13096 = AbstractC7771.m13096(this.f995, i, 0);
        if (iM13096 < 0 || this.f993[iM13096 << 1] == null) {
            return iM13096;
        }
        int i2 = iM13096 + 1;
        while (i2 < i && this.f995[i2] == 0) {
            if (this.f993[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM13096 - 1; i3 >= 0 && this.f995[i3] == 0; i3--) {
            if (this.f993[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m863(Object obj) {
        return obj == null ? m862() : m864(obj.hashCode(), obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m864(int i, Object obj) {
        int i2 = this.f994;
        if (i2 == 0) {
            return -1;
        }
        int iM13096 = AbstractC7771.m13096(this.f995, i2, i);
        if (iM13096 < 0 || AbstractC4394.m8917(obj, this.f993[iM13096 << 1])) {
            return iM13096;
        }
        int i3 = iM13096 + 1;
        while (i3 < i2 && this.f995[i3] == i) {
            if (AbstractC4394.m8917(obj, this.f993[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM13096 - 1; i4 >= 0 && this.f995[i4] == i; i4--) {
            if (AbstractC4394.m8917(obj, this.f993[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m865(int i) {
        int i2 = this.f994;
        int[] iArr = this.f995;
        if (iArr.length < i) {
            this.f995 = Arrays.copyOf(iArr, i);
            this.f993 = Arrays.copyOf(this.f993, i * 2);
        }
        if (this.f994 == i2) {
            return;
        }
        C0276.m839();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m866(Object obj) {
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
    public Object mo867(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f994)) {
            C5919.m11249(AbstractC6136.m11556(i, "Expected index to be within 0..size()-1, but was "));
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
                AbstractC4346.m8842(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.f993;
                AbstractC4346.m8839(i3, i5 << 1, objArr2, i2 << 1, objArr2);
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
                C0276.m839();
                return null;
            }
            if (i > 0) {
                AbstractC4346.m8842(0, 0, i, iArr, this.f995);
                AbstractC4346.m8839(0, 0, objArr, i3, this.f993);
            }
            if (i < i4) {
                int i8 = i + 1;
                AbstractC4346.m8842(i, i8, i2, iArr, this.f995);
                AbstractC4346.m8839(i3, i8 << 1, objArr, i2 << 1, this.f993);
            }
        }
        if (i2 == this.f994) {
            this.f994 = i4;
            return obj;
        }
        C0276.m839();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void mo868(C0257 c0257) {
        int i = c0257.f994;
        m865(this.f994 + i);
        if (this.f994 != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(c0257.m861(i2), c0257.m870(i2));
            }
        } else if (i > 0) {
            AbstractC4346.m8842(0, 0, i, c0257.f995, this.f995);
            AbstractC4346.m8839(0, 0, c0257.f993, i << 1, this.f993);
            this.f994 = i;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public Object mo869(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.f994) {
            z = true;
        }
        if (!z) {
            C5919.m11249(AbstractC6136.m11556(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f993;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Object m870(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f994) {
            z = true;
        }
        if (z) {
            return this.f993[(i << 1) + 1];
        }
        C5919.m11249(AbstractC6136.m11556(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public Object remove(Object obj) {
        int iM863 = m863(obj);
        if (iM863 >= 0) {
            return mo867(iM863);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM863 = m863(obj);
        if (iM863 >= 0) {
            return mo869(iM863, obj2);
        }
        return null;
    }
}
