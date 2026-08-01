package p124;

import androidx.compose.runtime.AbstractC1392;
import androidx.compose.runtime.snapshots.C1284;
import io.ktor.client.plugins.AbstractC3933;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.collections.AbstractC4347;
import p316.C8667;

/* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7412 extends AbstractC7415 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f20094;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object[] f20095;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f20096;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object[] f20097;

    public C7412(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.f20097 = objArr;
        this.f20095 = objArr2;
        this.f20096 = i;
        this.f20094 = i2;
        if (!(size() > 32)) {
            AbstractC1392.m2538("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        size();
        size();
        int length = objArr2.length;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static Object[] m12627(int i, int i2, Object obj, Object[] objArr) {
        int iM8306 = AbstractC3933.m8306(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iM8306] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iM8306];
        obj2.getClass();
        objArrCopyOf[iM8306] = m12627(i - 5, i2, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static Object[] m12628(Object[] objArr, int i, int i2, C7413 c7413) {
        Object[] objArrM12628;
        int iM8306 = AbstractC3933.m8306(i2, i);
        if (i == 5) {
            c7413.f20099 = objArr[iM8306];
            objArrM12628 = null;
        } else {
            Object obj = objArr[iM8306];
            obj.getClass();
            objArrM12628 = m12628((Object[]) obj, i - 5, i2, c7413);
        }
        if (objArrM12628 == null && iM8306 == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iM8306] = objArrM12628;
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Object[] m12629(Object[] objArr, int i, int i2, Object obj, C7413 c7413) {
        int iM8306 = AbstractC3933.m8306(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iM8306 == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            AbstractC4347.m8835(iM8306 + 1, iM8306, objArr, 31, objArrCopyOf);
            c7413.f20099 = objArr[31];
            objArrCopyOf[iM8306] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[iM8306];
        obj2.getClass();
        objArrCopyOf2[iM8306] = m12629((Object[]) obj2, i3, i2, obj, c7413);
        while (true) {
            iM8306++;
            if (iM8306 >= 32 || objArrCopyOf2[iM8306] == null) {
                break;
            }
            Object obj3 = objArr[iM8306];
            obj3.getClass();
            objArrCopyOf2[iM8306] = m12629((Object[]) obj3, i3, 0, c7413.f20099, c7413);
        }
        return objArrCopyOf2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        C8667.m14373(i, size());
        if (m12633() <= i) {
            objArr = this.f20095;
        } else {
            Object[] objArr2 = this.f20097;
            for (int i2 = this.f20094; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[AbstractC3933.m8306(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // kotlin.collections.AbstractC4335
    public final int getSize() {
        return this.f20096;
    }

    @Override // kotlin.collections.AbstractC4330, java.util.List
    public final ListIterator listIterator(int i) {
        C8667.m14372(i, size());
        return new C7418(i, size(), this.f20097, (this.f20094 / 5) + 1, this.f20095);
    }

    @Override // p124.AbstractC7415
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C7411 mo12630() {
        return new C7411(this, this.f20097, this.f20095, this.f20094);
    }

    @Override // p124.AbstractC7415
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC7415 mo12631(Object obj) {
        int size = size() - m12633();
        Object[] objArr = this.f20097;
        Object[] objArr2 = this.f20095;
        if (size < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[size] = obj;
            return new C7412(objArr, objArrCopyOf, size() + 1, this.f20094);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return m12636(objArr, objArr2, objArr3);
    }

    @Override // p124.AbstractC7415
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC7415 mo12632(int i, Object obj) {
        C8667.m14372(i, size());
        if (i == size()) {
            return mo12631(obj);
        }
        int iM12633 = m12633();
        Object[] objArr = this.f20097;
        if (i >= iM12633) {
            return m12640(obj, i - iM12633, objArr);
        }
        C7413 c7413 = new C7413(null);
        return m12640(c7413.f20099, 0, m12629(objArr, this.f20094, i, obj, c7413));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int m12633() {
        return (size() - 1) & (-32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object[] m12634(Object[] objArr, int i, int i2, C7413 c7413) {
        int iM8306 = AbstractC3933.m8306(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iM8306 == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            AbstractC4347.m8835(iM8306, iM8306 + 1, objArr, 32, objArrCopyOf);
            objArrCopyOf[31] = c7413.f20099;
            c7413.f20099 = objArr[iM8306];
            return objArrCopyOf;
        }
        int iM83062 = objArr[31] == null ? AbstractC3933.m8306(m12633() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = iM8306 + 1;
        if (i4 <= iM83062) {
            while (true) {
                Object obj = objArrCopyOf2[iM83062];
                obj.getClass();
                objArrCopyOf2[iM83062] = m12634((Object[]) obj, i3, 0, c7413);
                if (iM83062 == i4) {
                    break;
                }
                iM83062--;
            }
        }
        Object obj2 = objArrCopyOf2[iM8306];
        obj2.getClass();
        objArrCopyOf2[iM8306] = m12634((Object[]) obj2, i3, i2, c7413);
        return objArrCopyOf2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC7415 m12635(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        if (size != 1) {
            Object[] objArr2 = this.f20095;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i4 = size - 1;
            if (i3 < i4) {
                AbstractC4347.m8835(i3, i3 + 1, objArr2, size, objArrCopyOf);
            }
            objArrCopyOf[i4] = null;
            return new C7412(objArr, objArrCopyOf, (i + size) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new C7419(objArr);
        }
        C7413 c7413 = new C7413(null);
        Object[] objArrM12628 = m12628(objArr, i2, i - 1, c7413);
        objArrM12628.getClass();
        Object obj = c7413.f20099;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (objArrM12628[1] != null) {
            return new C7412(objArrM12628, objArr3, i, i2);
        }
        Object obj2 = objArrM12628[0];
        obj2.getClass();
        return new C7412((Object[]) obj2, objArr3, i, i2 - 5);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C7412 m12636(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.f20094;
        if (size <= (1 << i)) {
            return new C7412(m12637(i, objArr, objArr2), objArr3, size() + 1, i);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i2 = i + 5;
        return new C7412(m12637(i2, objArr4, objArr2), objArr3, size() + 1, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object[] m12637(int i, Object[] objArr, Object[] objArr2) {
        int iM8306 = AbstractC3933.m8306(size() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iM8306] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iM8306] = m12637(i - 5, (Object[]) objArrCopyOf[iM8306], objArr2);
        return objArrCopyOf;
    }

    @Override // p124.AbstractC7415
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final AbstractC7415 mo12638(int i) {
        C8667.m14373(i, size());
        int iM12633 = m12633();
        int i2 = this.f20094;
        Object[] objArr = this.f20097;
        return i >= iM12633 ? m12635(objArr, iM12633, i2, i - iM12633) : m12635(m12634(objArr, i2, i, new C7413(this.f20095[0])), iM12633, i2, 0);
    }

    @Override // p124.AbstractC7415
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final AbstractC7415 mo12639(C1284 c1284) {
        C7411 c7411 = new C7411(this, this.f20097, this.f20095, this.f20094);
        c7411.m12601(c1284);
        return c7411.m12610();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C7412 m12640(Object obj, int i, Object[] objArr) {
        int size = size() - m12633();
        Object[] objArr2 = this.f20095;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (size < 32) {
            AbstractC4347.m8835(i + 1, i, objArr2, size, objArrCopyOf);
            objArrCopyOf[i] = obj;
            return new C7412(objArr, objArrCopyOf, size() + 1, this.f20094);
        }
        Object obj2 = objArr2[31];
        AbstractC4347.m8835(i + 1, i, objArr2, size - 1, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return m12636(objArr, objArrCopyOf, objArr3);
    }

    @Override // p124.AbstractC7415
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final AbstractC7415 mo12641(int i, Object obj) {
        C8667.m14373(i, size());
        int iM12633 = m12633();
        Object[] objArr = this.f20097;
        Object[] objArr2 = this.f20095;
        int i2 = this.f20094;
        if (iM12633 > i) {
            return new C7412(m12627(i2, i, obj, objArr), objArr2, size(), i2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = obj;
        return new C7412(objArr, objArrCopyOf, size(), i2);
    }
}
