package androidx.compose.runtime.collection;

import androidx.collection.C1089;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC5227;
import p050.AbstractC7176;

/* JADX INFO: renamed from: androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2059 implements RandomAccess {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C1089 f3864;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f3865;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Object[] f3866;

    public C2059(int i, Object[] objArr) {
        this.f3866 = objArr;
        this.f3865 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final List m2603() {
        C1089 c1089 = this.f3864;
        if (c1089 != null) {
            return c1089;
        }
        C1089 c10892 = new C1089(this, 1);
        this.f3864 = c10892;
        return c10892;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m2604(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.f3865 + size;
        if (this.f3866.length < i3) {
            m2609(i3);
        }
        Object[] objArr = this.f3866;
        int i4 = this.f3865;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                AbstractC7176.m12479();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.f3865 += size;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m2605(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.f3865 + size;
        if (this.f3866.length < i2) {
            m2609(i2);
        }
        Object[] objArr = this.f3866;
        int i3 = this.f3865;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.f3865 += size;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m2606(int i, C2059 c2059) {
        int i2 = c2059.f3865;
        if (i2 == 0) {
            return;
        }
        int i3 = this.f3865 + i2;
        if (this.f3866.length < i3) {
            m2609(i3);
        }
        Object[] objArr = this.f3866;
        int i4 = this.f3865;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(c2059.f3866, 0, objArr, i, i2);
        this.f3865 += i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m2607(Object obj) {
        int i = this.f3865 + 1;
        if (this.f3866.length < i) {
            m2609(i);
        }
        Object[] objArr = this.f3866;
        int i2 = this.f3865;
        objArr[i2] = obj;
        this.f3865 = i2 + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2608(int i, Object obj) {
        int i2 = this.f3865 + 1;
        if (this.f3866.length < i2) {
            m2609(i2);
        }
        Object[] objArr = this.f3866;
        int i3 = this.f3865;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.f3865++;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m2609(int i) {
        Object[] objArr = this.f3866;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f3866 = objArr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m2610(int i, int i2) {
        if (i2 > i) {
            int i3 = this.f3865;
            if (i2 < i3) {
                Object[] objArr = this.f3866;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.f3865;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.f3866[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.f3865 = i5;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m2611(Object obj) {
        int i = this.f3865 - 1;
        if (i >= 0) {
            for (int i2 = 0; !AbstractC5227.m9466(this.f3866[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m2612() {
        Object[] objArr = this.f3866;
        int i = this.f3865;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f3865 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Object m2613(int i) {
        Object[] objArr = this.f3866;
        Object obj = objArr[i];
        int i2 = this.f3865;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.f3865 - 1;
        this.f3865 = i4;
        objArr[i4] = null;
        return obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int m2614(Object obj) {
        Object[] objArr = this.f3866;
        int i = this.f3865;
        for (int i2 = 0; i2 < i; i2++) {
            if (AbstractC5227.m9466(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m2615(Object obj) {
        int iM2614 = m2614(obj);
        if (iM2614 < 0) {
            return false;
        }
        m2613(iM2614);
        return true;
    }
}
