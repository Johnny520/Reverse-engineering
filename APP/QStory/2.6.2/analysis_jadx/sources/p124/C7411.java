package p124;

import androidx.compose.runtime.AbstractC1392;
import androidx.compose.runtime.snapshots.C1284;
import com.bumptech.glide.AbstractC3056;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.collections.AbstractC4346;
import p033.AbstractC6325;

/* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7411 extends AbstractC7414 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f20099;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object[] f20100;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f20101;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object[] f20102;

    public C7411(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.f20102 = objArr;
        this.f20100 = objArr2;
        this.f20101 = i;
        this.f20099 = i2;
        if (!(size() > 32)) {
            AbstractC1392.m2528("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        size();
        size();
        int length = objArr2.length;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static Object[] m12600(int i, int i2, Object obj, Object[] objArr) {
        int iM6665 = AbstractC3056.m6665(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iM6665] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iM6665];
        obj2.getClass();
        objArrCopyOf[iM6665] = m12600(i - 5, i2, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static Object[] m12601(Object[] objArr, int i, int i2, C7412 c7412) {
        Object[] objArrM12601;
        int iM6665 = AbstractC3056.m6665(i2, i);
        if (i == 5) {
            c7412.f20104 = objArr[iM6665];
            objArrM12601 = null;
        } else {
            Object obj = objArr[iM6665];
            obj.getClass();
            objArrM12601 = m12601((Object[]) obj, i - 5, i2, c7412);
        }
        if (objArrM12601 == null && iM6665 == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iM6665] = objArrM12601;
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Object[] m12602(Object[] objArr, int i, int i2, Object obj, C7412 c7412) {
        int iM6665 = AbstractC3056.m6665(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iM6665 == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            AbstractC4346.m8839(iM6665 + 1, iM6665, objArr, 31, objArrCopyOf);
            c7412.f20104 = objArr[31];
            objArrCopyOf[iM6665] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[iM6665];
        obj2.getClass();
        objArrCopyOf2[iM6665] = m12602((Object[]) obj2, i3, i2, obj, c7412);
        while (true) {
            iM6665++;
            if (iM6665 >= 32 || objArrCopyOf2[iM6665] == null) {
                break;
            }
            Object obj3 = objArr[iM6665];
            obj3.getClass();
            objArrCopyOf2[iM6665] = m12602((Object[]) obj3, i3, 0, c7412.f20104, c7412);
        }
        return objArrCopyOf2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        AbstractC6325.m11857(i, size());
        if (m12606() <= i) {
            objArr = this.f20100;
        } else {
            Object[] objArr2 = this.f20102;
            for (int i2 = this.f20099; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[AbstractC3056.m6665(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // kotlin.collections.AbstractC4334
    public final int getSize() {
        return this.f20101;
    }

    @Override // kotlin.collections.AbstractC4329, java.util.List
    public final ListIterator listIterator(int i) {
        AbstractC6325.m11856(i, size());
        return new C7417(i, size(), this.f20102, (this.f20099 / 5) + 1, this.f20100);
    }

    @Override // p124.AbstractC7414
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C7410 mo12603() {
        return new C7410(this, this.f20102, this.f20100, this.f20099);
    }

    @Override // p124.AbstractC7414
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC7414 mo12604(Object obj) {
        int size = size() - m12606();
        Object[] objArr = this.f20102;
        Object[] objArr2 = this.f20100;
        if (size < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[size] = obj;
            return new C7411(objArr, objArrCopyOf, size() + 1, this.f20099);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return m12609(objArr, objArr2, objArr3);
    }

    @Override // p124.AbstractC7414
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC7414 mo12605(int i, Object obj) {
        AbstractC6325.m11856(i, size());
        if (i == size()) {
            return mo12604(obj);
        }
        int iM12606 = m12606();
        Object[] objArr = this.f20102;
        if (i >= iM12606) {
            return m12613(obj, i - iM12606, objArr);
        }
        C7412 c7412 = new C7412(null);
        return m12613(c7412.f20104, 0, m12602(objArr, this.f20099, i, obj, c7412));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int m12606() {
        return (size() - 1) & (-32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object[] m12607(Object[] objArr, int i, int i2, C7412 c7412) {
        int iM6665 = AbstractC3056.m6665(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iM6665 == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            AbstractC4346.m8839(iM6665, iM6665 + 1, objArr, 32, objArrCopyOf);
            objArrCopyOf[31] = c7412.f20104;
            c7412.f20104 = objArr[iM6665];
            return objArrCopyOf;
        }
        int iM66652 = objArr[31] == null ? AbstractC3056.m6665(m12606() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = iM6665 + 1;
        if (i4 <= iM66652) {
            while (true) {
                Object obj = objArrCopyOf2[iM66652];
                obj.getClass();
                objArrCopyOf2[iM66652] = m12607((Object[]) obj, i3, 0, c7412);
                if (iM66652 == i4) {
                    break;
                }
                iM66652--;
            }
        }
        Object obj2 = objArrCopyOf2[iM6665];
        obj2.getClass();
        objArrCopyOf2[iM6665] = m12607((Object[]) obj2, i3, i2, c7412);
        return objArrCopyOf2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC7414 m12608(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        if (size != 1) {
            Object[] objArr2 = this.f20100;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i4 = size - 1;
            if (i3 < i4) {
                AbstractC4346.m8839(i3, i3 + 1, objArr2, size, objArrCopyOf);
            }
            objArrCopyOf[i4] = null;
            return new C7411(objArr, objArrCopyOf, (i + size) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new C7418(objArr);
        }
        C7412 c7412 = new C7412(null);
        Object[] objArrM12601 = m12601(objArr, i2, i - 1, c7412);
        objArrM12601.getClass();
        Object obj = c7412.f20104;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (objArrM12601[1] != null) {
            return new C7411(objArrM12601, objArr3, i, i2);
        }
        Object obj2 = objArrM12601[0];
        obj2.getClass();
        return new C7411((Object[]) obj2, objArr3, i, i2 - 5);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C7411 m12609(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.f20099;
        if (size <= (1 << i)) {
            return new C7411(m12610(i, objArr, objArr2), objArr3, size() + 1, i);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i2 = i + 5;
        return new C7411(m12610(i2, objArr4, objArr2), objArr3, size() + 1, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object[] m12610(int i, Object[] objArr, Object[] objArr2) {
        int iM6665 = AbstractC3056.m6665(size() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iM6665] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iM6665] = m12610(i - 5, (Object[]) objArrCopyOf[iM6665], objArr2);
        return objArrCopyOf;
    }

    @Override // p124.AbstractC7414
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final AbstractC7414 mo12611(int i) {
        AbstractC6325.m11857(i, size());
        int iM12606 = m12606();
        int i2 = this.f20099;
        Object[] objArr = this.f20102;
        return i >= iM12606 ? m12608(objArr, iM12606, i2, i - iM12606) : m12608(m12607(objArr, i2, i, new C7412(this.f20100[0])), iM12606, i2, 0);
    }

    @Override // p124.AbstractC7414
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final AbstractC7414 mo12612(C1284 c1284) {
        C7410 c7410 = new C7410(this, this.f20102, this.f20100, this.f20099);
        c7410.m12574(c1284);
        return c7410.m12584();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C7411 m12613(Object obj, int i, Object[] objArr) {
        int size = size() - m12606();
        Object[] objArr2 = this.f20100;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (size < 32) {
            AbstractC4346.m8839(i + 1, i, objArr2, size, objArrCopyOf);
            objArrCopyOf[i] = obj;
            return new C7411(objArr, objArrCopyOf, size() + 1, this.f20099);
        }
        Object obj2 = objArr2[31];
        AbstractC4346.m8839(i + 1, i, objArr2, size - 1, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return m12609(objArr, objArrCopyOf, objArr3);
    }

    @Override // p124.AbstractC7414
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final AbstractC7414 mo12614(int i, Object obj) {
        AbstractC6325.m11857(i, size());
        int iM12606 = m12606();
        Object[] objArr = this.f20102;
        Object[] objArr2 = this.f20100;
        int i2 = this.f20099;
        if (iM12606 > i) {
            return new C7411(m12600(i2, i, obj, objArr), objArr2, size(), i2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = obj;
        return new C7411(objArr, objArrCopyOf, size(), i2);
    }
}
