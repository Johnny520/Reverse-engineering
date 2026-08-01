package androidx.collection;

import java.util.Arrays;
import kotlin.collections.AbstractC5179;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p025.AbstractC7012;
import p203.AbstractC8601;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1110 implements Cloneable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public /* synthetic */ int f1293;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public /* synthetic */ long[] f1294;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public /* synthetic */ Object[] f1295;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public /* synthetic */ boolean f1296;

    public C1110(int i) {
        if (i == 0) {
            this.f1294 = AbstractC8601.f21425;
            this.f1295 = AbstractC8601.f21424;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.f1294 = new long[i5];
        this.f1295 = new Object[i5];
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        C1110 c1110 = (C1110) objClone;
        c1110.f1294 = (long[]) this.f1294.clone();
        c1110.f1295 = (Object[]) this.f1295.clone();
        return c1110;
    }

    public final String toString() {
        if (m1388() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1293 * 28);
        sb.append('{');
        int i = this.f1293;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(m1384(i2));
            sb.append(SignatureVisitor.INSTANCEOF);
            Object objM1389 = m1389(i2);
            if (objM1389 != sb) {
                sb.append(objM1389);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m1382(long j) {
        int iM13682 = AbstractC8601.m13682(this.f1294, this.f1293, j);
        if (iM13682 >= 0) {
            Object[] objArr = this.f1295;
            Object obj = objArr[iM13682];
            Object obj2 = AbstractC1114.f1307;
            if (obj != obj2) {
                objArr[iM13682] = obj2;
                this.f1296 = true;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m1383(Object obj, long j) {
        Object obj2 = AbstractC1114.f1307;
        int iM13682 = AbstractC8601.m13682(this.f1294, this.f1293, j);
        if (iM13682 >= 0) {
            this.f1295[iM13682] = obj;
            return;
        }
        int i = ~iM13682;
        int i2 = this.f1293;
        if (i < i2) {
            Object[] objArr = this.f1295;
            if (objArr[i] == obj2) {
                this.f1294[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f1296) {
            long[] jArr = this.f1294;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.f1295;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.f1296 = false;
                this.f1293 = i3;
                i = ~AbstractC8601.m13682(this.f1294, i3, j);
            }
        }
        int i5 = this.f1293;
        if (i5 >= this.f1294.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            this.f1294 = Arrays.copyOf(this.f1294, i9);
            this.f1295 = Arrays.copyOf(this.f1295, i9);
        }
        int i10 = this.f1293;
        if (i10 - i != 0) {
            long[] jArr2 = this.f1294;
            int i11 = i + 1;
            AbstractC5179.m9401(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.f1295;
            AbstractC5179.m9394(i11, i, objArr3, this.f1293, objArr3);
        }
        this.f1294[i] = j;
        this.f1295[i] = obj;
        this.f1293++;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long m1384(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f1293)) {
            C6755.m11869(AbstractC7012.m12147(i, "Expected index to be within 0..size()-1, but was "));
            return 0L;
        }
        if (this.f1296) {
            long[] jArr = this.f1294;
            Object[] objArr = this.f1295;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC1114.f1307) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f1296 = false;
            this.f1293 = i3;
        }
        return this.f1294[i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m1385(long j) {
        if (this.f1296) {
            int i = this.f1293;
            long[] jArr = this.f1294;
            Object[] objArr = this.f1295;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != AbstractC1114.f1307) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f1296 = false;
            this.f1293 = i2;
        }
        return AbstractC8601.m13682(this.f1294, this.f1293, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m1386(long j) {
        Object obj;
        int iM13682 = AbstractC8601.m13682(this.f1294, this.f1293, j);
        if (iM13682 < 0 || (obj = this.f1295[iM13682]) == AbstractC1114.f1307) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1387() {
        int i = this.f1293;
        Object[] objArr = this.f1295;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1293 = 0;
        this.f1296 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int m1388() {
        if (this.f1296) {
            int i = this.f1293;
            long[] jArr = this.f1294;
            Object[] objArr = this.f1295;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != AbstractC1114.f1307) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f1296 = false;
            this.f1293 = i2;
        }
        return this.f1293;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Object m1389(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f1293)) {
            C6755.m11869(AbstractC7012.m12147(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        if (this.f1296) {
            long[] jArr = this.f1294;
            Object[] objArr = this.f1295;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC1114.f1307) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f1296 = false;
            this.f1293 = i3;
        }
        return this.f1295[i];
    }

    public /* synthetic */ C1110(Object obj) {
        this(10);
    }
}
