package androidx.compose.runtime.collection;

import androidx.collection.C0242;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC4394;
import p253.AbstractC8189;

/* JADX INFO: renamed from: androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1224 implements RandomAccess {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C0242 f3518;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f3519;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Object[] f3520;

    public C1224(int i, Object[] objArr) {
        this.f3520 = objArr;
        this.f3519 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final List m2033() {
        C0242 c0242 = this.f3518;
        if (c0242 != null) {
            return c0242;
        }
        C0242 c02422 = new C0242(this, 1);
        this.f3518 = c02422;
        return c02422;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m2034(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.f3519 + size;
        if (this.f3520.length < i3) {
            m2039(i3);
        }
        Object[] objArr = this.f3520;
        int i4 = this.f3519;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                AbstractC8189.m13662();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.f3519 += size;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m2035(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.f3519 + size;
        if (this.f3520.length < i2) {
            m2039(i2);
        }
        Object[] objArr = this.f3520;
        int i3 = this.f3519;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.f3519 += size;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m2036(int i, C1224 c1224) {
        int i2 = c1224.f3519;
        if (i2 == 0) {
            return;
        }
        int i3 = this.f3519 + i2;
        if (this.f3520.length < i3) {
            m2039(i3);
        }
        Object[] objArr = this.f3520;
        int i4 = this.f3519;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(c1224.f3520, 0, objArr, i, i2);
        this.f3519 += i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m2037(Object obj) {
        int i = this.f3519 + 1;
        if (this.f3520.length < i) {
            m2039(i);
        }
        Object[] objArr = this.f3520;
        int i2 = this.f3519;
        objArr[i2] = obj;
        this.f3519 = i2 + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2038(int i, Object obj) {
        int i2 = this.f3519 + 1;
        if (this.f3520.length < i2) {
            m2039(i2);
        }
        Object[] objArr = this.f3520;
        int i3 = this.f3519;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.f3519++;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m2039(int i) {
        Object[] objArr = this.f3520;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f3520 = objArr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m2040(int i, int i2) {
        if (i2 > i) {
            int i3 = this.f3519;
            if (i2 < i3) {
                Object[] objArr = this.f3520;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.f3519;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.f3520[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.f3519 = i5;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m2041(Object obj) {
        int i = this.f3519 - 1;
        if (i >= 0) {
            for (int i2 = 0; !AbstractC4394.m8917(this.f3520[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m2042() {
        Object[] objArr = this.f3520;
        int i = this.f3519;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f3519 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Object m2043(int i) {
        Object[] objArr = this.f3520;
        Object obj = objArr[i];
        int i2 = this.f3519;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.f3519 - 1;
        this.f3519 = i4;
        objArr[i4] = null;
        return obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int m2044(Object obj) {
        Object[] objArr = this.f3520;
        int i = this.f3519;
        for (int i2 = 0; i2 < i; i2++) {
            if (AbstractC4394.m8917(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m2045(Object obj) {
        int iM2044 = m2044(obj);
        if (iM2044 < 0) {
            return false;
        }
        m2043(iM2044);
        return true;
    }
}
