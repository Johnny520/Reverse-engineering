package androidx.compose.runtime.collection;

import androidx.collection.C0242;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC4395;
import p034.AbstractC6347;

/* JADX INFO: renamed from: androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1224 implements RandomAccess {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C0242 f3519;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f3520;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Object[] f3521;

    public C1224(int i, Object[] objArr) {
        this.f3521 = objArr;
        this.f3520 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final List m2043() {
        C0242 c0242 = this.f3519;
        if (c0242 != null) {
            return c0242;
        }
        C0242 c02422 = new C0242(this, 1);
        this.f3519 = c02422;
        return c02422;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m2044(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.f3520 + size;
        if (this.f3521.length < i3) {
            m2049(i3);
        }
        Object[] objArr = this.f3521;
        int i4 = this.f3520;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                AbstractC6347.m11920();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.f3520 += size;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m2045(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.f3520 + size;
        if (this.f3521.length < i2) {
            m2049(i2);
        }
        Object[] objArr = this.f3521;
        int i3 = this.f3520;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.f3520 += size;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m2046(int i, C1224 c1224) {
        int i2 = c1224.f3520;
        if (i2 == 0) {
            return;
        }
        int i3 = this.f3520 + i2;
        if (this.f3521.length < i3) {
            m2049(i3);
        }
        Object[] objArr = this.f3521;
        int i4 = this.f3520;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(c1224.f3521, 0, objArr, i, i2);
        this.f3520 += i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m2047(Object obj) {
        int i = this.f3520 + 1;
        if (this.f3521.length < i) {
            m2049(i);
        }
        Object[] objArr = this.f3521;
        int i2 = this.f3520;
        objArr[i2] = obj;
        this.f3520 = i2 + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2048(int i, Object obj) {
        int i2 = this.f3520 + 1;
        if (this.f3521.length < i2) {
            m2049(i2);
        }
        Object[] objArr = this.f3521;
        int i3 = this.f3520;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.f3520++;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m2049(int i) {
        Object[] objArr = this.f3521;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f3521 = objArr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m2050(int i, int i2) {
        if (i2 > i) {
            int i3 = this.f3520;
            if (i2 < i3) {
                Object[] objArr = this.f3521;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.f3520;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.f3521[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.f3520 = i5;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m2051(Object obj) {
        int i = this.f3520 - 1;
        if (i >= 0) {
            for (int i2 = 0; !AbstractC4395.m8907(this.f3521[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m2052() {
        Object[] objArr = this.f3521;
        int i = this.f3520;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f3520 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Object m2053(int i) {
        Object[] objArr = this.f3521;
        Object obj = objArr[i];
        int i2 = this.f3520;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.f3520 - 1;
        this.f3520 = i4;
        objArr[i4] = null;
        return obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int m2054(Object obj) {
        Object[] objArr = this.f3521;
        int i = this.f3520;
        for (int i2 = 0; i2 < i; i2++) {
            if (AbstractC4395.m8907(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m2055(Object obj) {
        int iM2054 = m2054(obj);
        if (iM2054 < 0) {
            return false;
        }
        m2053(iM2054);
        return true;
    }
}
