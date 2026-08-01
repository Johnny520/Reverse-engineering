package androidx.collection;

import androidx.activity.AbstractC0900;
import io.ktor.util.C5043;
import java.util.List;
import kotlin.collections.AbstractC5179;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1091 extends AbstractC1135 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C1089 f1242;

    public C1091(int i) {
        this.f1350 = i == 0 ? AbstractC1134.f1348 : new Object[i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m1330(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        AbstractC5179.m9394(0, 0, objArr, length, objArr2);
        this.f1350 = objArr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m1331(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.f1349) || i2 < 0 || i2 > i3) {
            C5043.m9173(AbstractC0900.m709(i, i2, "Start (", ") and end (", ") must be in 0.."), this.f1349);
            return;
        }
        if (i2 < i) {
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.f1350;
                AbstractC5179.m9394(i, i2, objArr, i3, objArr);
            }
            int i4 = this.f1349;
            int i5 = i4 - (i2 - i);
            AbstractC5179.m9393(i5, i4, null, this.f1350);
            this.f1349 = i5;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final Object m1332(int i, Object obj) {
        if (i < 0 || i >= this.f1349) {
            m1437(i);
            throw null;
        }
        Object[] objArr = this.f1350;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m1333(int i) {
        StringBuilder sbM710 = AbstractC0900.m710(i, "Index ", " must be in 0..");
        sbM710.append(this.f1349);
        throw new IndexOutOfBoundsException(sbM710.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m1334(AbstractC1135 abstractC1135) {
        abstractC1135.getClass();
        if (abstractC1135.m1439()) {
            return;
        }
        int i = this.f1349 + abstractC1135.f1349;
        Object[] objArr = this.f1350;
        if (objArr.length < i) {
            m1330(i, objArr);
        }
        AbstractC5179.m9394(this.f1349, 0, abstractC1135.f1350, abstractC1135.f1349, this.f1350);
        this.f1349 += abstractC1135.f1349;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m1335(Object obj) {
        int i = this.f1349 + 1;
        Object[] objArr = this.f1350;
        if (objArr.length < i) {
            m1330(i, objArr);
        }
        Object[] objArr2 = this.f1350;
        int i2 = this.f1349;
        objArr2[i2] = obj;
        this.f1349 = i2 + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m1336(Object obj) {
        int iM1440 = m1440(obj);
        if (iM1440 < 0) {
            return false;
        }
        m1337(iM1440);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final Object m1337(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f1349)) {
            m1437(i);
            throw null;
        }
        Object[] objArr = this.f1350;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            AbstractC5179.m9394(i, i + 1, objArr, i2, objArr);
        }
        int i3 = this.f1349 - 1;
        this.f1349 = i3;
        objArr[i3] = null;
        return obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m1338(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.f1349;
        int size = list.size() + i;
        Object[] objArr = this.f1350;
        if (objArr.length < size) {
            m1330(size, objArr);
        }
        Object[] objArr2 = this.f1350;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.f1349 = list.size() + this.f1349;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m1339() {
        AbstractC5179.m9393(0, this.f1349, null, this.f1350);
        this.f1349 = 0;
    }

    public /* synthetic */ C1091() {
        this(16);
    }
}
