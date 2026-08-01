package p140;

import androidx.compose.runtime.AbstractC2227;
import androidx.compose.runtime.snapshots.C2119;
import io.ktor.client.plugins.AbstractC4765;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.collections.AbstractC5179;
import p332.C9496;

/* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8241 extends AbstractC8244 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f20439;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object[] f20440;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f20441;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object[] f20442;

    public C8241(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.f20442 = objArr;
        this.f20440 = objArr2;
        this.f20441 = i;
        this.f20439 = i2;
        if (!(size() > 32)) {
            AbstractC2227.m3098("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        size();
        size();
        int length = objArr2.length;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static Object[] m13186(int i, int i2, Object obj, Object[] objArr) {
        int iM8865 = AbstractC4765.m8865(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iM8865] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iM8865];
        obj2.getClass();
        objArrCopyOf[iM8865] = m13186(i - 5, i2, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static Object[] m13187(Object[] objArr, int i, int i2, C8242 c8242) {
        Object[] objArrM13187;
        int iM8865 = AbstractC4765.m8865(i2, i);
        if (i == 5) {
            c8242.f20444 = objArr[iM8865];
            objArrM13187 = null;
        } else {
            Object obj = objArr[iM8865];
            obj.getClass();
            objArrM13187 = m13187((Object[]) obj, i - 5, i2, c8242);
        }
        if (objArrM13187 == null && iM8865 == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iM8865] = objArrM13187;
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Object[] m13188(Object[] objArr, int i, int i2, Object obj, C8242 c8242) {
        int iM8865 = AbstractC4765.m8865(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iM8865 == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            AbstractC5179.m9394(iM8865 + 1, iM8865, objArr, 31, objArrCopyOf);
            c8242.f20444 = objArr[31];
            objArrCopyOf[iM8865] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[iM8865];
        obj2.getClass();
        objArrCopyOf2[iM8865] = m13188((Object[]) obj2, i3, i2, obj, c8242);
        while (true) {
            iM8865++;
            if (iM8865 >= 32 || objArrCopyOf2[iM8865] == null) {
                break;
            }
            Object obj3 = objArr[iM8865];
            obj3.getClass();
            objArrCopyOf2[iM8865] = m13188((Object[]) obj3, i3, 0, c8242.f20444, c8242);
        }
        return objArrCopyOf2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        C9496.m14932(i, size());
        if (m13192() <= i) {
            objArr = this.f20440;
        } else {
            Object[] objArr2 = this.f20442;
            for (int i2 = this.f20439; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[AbstractC4765.m8865(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // kotlin.collections.AbstractC5167
    public final int getSize() {
        return this.f20441;
    }

    @Override // kotlin.collections.AbstractC5162, java.util.List
    public final ListIterator listIterator(int i) {
        C9496.m14931(i, size());
        return new C8247(i, size(), this.f20442, (this.f20439 / 5) + 1, this.f20440);
    }

    @Override // p140.AbstractC8244
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8240 mo13189() {
        return new C8240(this, this.f20442, this.f20440, this.f20439);
    }

    @Override // p140.AbstractC8244
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC8244 mo13190(Object obj) {
        int size = size() - m13192();
        Object[] objArr = this.f20442;
        Object[] objArr2 = this.f20440;
        if (size < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[size] = obj;
            return new C8241(objArr, objArrCopyOf, size() + 1, this.f20439);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return m13195(objArr, objArr2, objArr3);
    }

    @Override // p140.AbstractC8244
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC8244 mo13191(int i, Object obj) {
        C9496.m14931(i, size());
        if (i == size()) {
            return mo13190(obj);
        }
        int iM13192 = m13192();
        Object[] objArr = this.f20442;
        if (i >= iM13192) {
            return m13199(obj, i - iM13192, objArr);
        }
        C8242 c8242 = new C8242(null);
        return m13199(c8242.f20444, 0, m13188(objArr, this.f20439, i, obj, c8242));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int m13192() {
        return (size() - 1) & (-32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object[] m13193(Object[] objArr, int i, int i2, C8242 c8242) {
        int iM8865 = AbstractC4765.m8865(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iM8865 == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            AbstractC5179.m9394(iM8865, iM8865 + 1, objArr, 32, objArrCopyOf);
            objArrCopyOf[31] = c8242.f20444;
            c8242.f20444 = objArr[iM8865];
            return objArrCopyOf;
        }
        int iM88652 = objArr[31] == null ? AbstractC4765.m8865(m13192() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = iM8865 + 1;
        if (i4 <= iM88652) {
            while (true) {
                Object obj = objArrCopyOf2[iM88652];
                obj.getClass();
                objArrCopyOf2[iM88652] = m13193((Object[]) obj, i3, 0, c8242);
                if (iM88652 == i4) {
                    break;
                }
                iM88652--;
            }
        }
        Object obj2 = objArrCopyOf2[iM8865];
        obj2.getClass();
        objArrCopyOf2[iM8865] = m13193((Object[]) obj2, i3, i2, c8242);
        return objArrCopyOf2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC8244 m13194(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        if (size != 1) {
            Object[] objArr2 = this.f20440;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i4 = size - 1;
            if (i3 < i4) {
                AbstractC5179.m9394(i3, i3 + 1, objArr2, size, objArrCopyOf);
            }
            objArrCopyOf[i4] = null;
            return new C8241(objArr, objArrCopyOf, (i + size) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new C8248(objArr);
        }
        C8242 c8242 = new C8242(null);
        Object[] objArrM13187 = m13187(objArr, i2, i - 1, c8242);
        objArrM13187.getClass();
        Object obj = c8242.f20444;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (objArrM13187[1] != null) {
            return new C8241(objArrM13187, objArr3, i, i2);
        }
        Object obj2 = objArrM13187[0];
        obj2.getClass();
        return new C8241((Object[]) obj2, objArr3, i, i2 - 5);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C8241 m13195(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.f20439;
        if (size <= (1 << i)) {
            return new C8241(m13196(i, objArr, objArr2), objArr3, size() + 1, i);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i2 = i + 5;
        return new C8241(m13196(i2, objArr4, objArr2), objArr3, size() + 1, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object[] m13196(int i, Object[] objArr, Object[] objArr2) {
        int iM8865 = AbstractC4765.m8865(size() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iM8865] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iM8865] = m13196(i - 5, (Object[]) objArrCopyOf[iM8865], objArr2);
        return objArrCopyOf;
    }

    @Override // p140.AbstractC8244
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final AbstractC8244 mo13197(int i) {
        C9496.m14932(i, size());
        int iM13192 = m13192();
        int i2 = this.f20439;
        Object[] objArr = this.f20442;
        return i >= iM13192 ? m13194(objArr, iM13192, i2, i - iM13192) : m13194(m13193(objArr, i2, i, new C8242(this.f20440[0])), iM13192, i2, 0);
    }

    @Override // p140.AbstractC8244
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final AbstractC8244 mo13198(C2119 c2119) {
        C8240 c8240 = new C8240(this, this.f20442, this.f20440, this.f20439);
        c8240.m13160(c2119);
        return c8240.m13169();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C8241 m13199(Object obj, int i, Object[] objArr) {
        int size = size() - m13192();
        Object[] objArr2 = this.f20440;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (size < 32) {
            AbstractC5179.m9394(i + 1, i, objArr2, size, objArrCopyOf);
            objArrCopyOf[i] = obj;
            return new C8241(objArr, objArrCopyOf, size() + 1, this.f20439);
        }
        Object obj2 = objArr2[31];
        AbstractC5179.m9394(i + 1, i, objArr2, size - 1, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return m13195(objArr, objArrCopyOf, objArr3);
    }

    @Override // p140.AbstractC8244
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final AbstractC8244 mo13200(int i, Object obj) {
        C9496.m14932(i, size());
        int iM13192 = m13192();
        Object[] objArr = this.f20442;
        Object[] objArr2 = this.f20440;
        int i2 = this.f20439;
        if (iM13192 > i) {
            return new C8241(m13186(i2, i, obj, objArr), objArr2, size(), i2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = obj;
        return new C8241(objArr, objArrCopyOf, size(), i2);
    }
}
