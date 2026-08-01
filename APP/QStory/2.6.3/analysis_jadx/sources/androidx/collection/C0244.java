package androidx.collection;

import androidx.activity.AbstractC0053;
import io.ktor.util.C4211;
import java.util.List;
import kotlin.collections.AbstractC4347;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0244 extends AbstractC0288 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C0242 f897;

    public C0244(int i) {
        this.f1005 = i == 0 ? AbstractC0287.f1003 : new Object[i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m770(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        AbstractC4347.m8835(0, 0, objArr, length, objArr2);
        this.f1005 = objArr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m771(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.f1004) || i2 < 0 || i2 > i3) {
            C4211.m8614(AbstractC0053.m149(i, i2, "Start (", ") and end (", ") must be in 0.."), this.f1004);
            return;
        }
        if (i2 < i) {
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.f1005;
                AbstractC4347.m8835(i, i2, objArr, i3, objArr);
            }
            int i4 = this.f1004;
            int i5 = i4 - (i2 - i);
            AbstractC4347.m8834(i5, i4, null, this.f1005);
            this.f1004 = i5;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final Object m772(int i, Object obj) {
        if (i < 0 || i >= this.f1004) {
            m877(i);
            throw null;
        }
        Object[] objArr = this.f1005;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m773(int i) {
        StringBuilder sbM150 = AbstractC0053.m150(i, "Index ", " must be in 0..");
        sbM150.append(this.f1004);
        throw new IndexOutOfBoundsException(sbM150.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m774(AbstractC0288 abstractC0288) {
        abstractC0288.getClass();
        if (abstractC0288.m879()) {
            return;
        }
        int i = this.f1004 + abstractC0288.f1004;
        Object[] objArr = this.f1005;
        if (objArr.length < i) {
            m770(i, objArr);
        }
        AbstractC4347.m8835(this.f1004, 0, abstractC0288.f1005, abstractC0288.f1004, this.f1005);
        this.f1004 += abstractC0288.f1004;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m775(Object obj) {
        int i = this.f1004 + 1;
        Object[] objArr = this.f1005;
        if (objArr.length < i) {
            m770(i, objArr);
        }
        Object[] objArr2 = this.f1005;
        int i2 = this.f1004;
        objArr2[i2] = obj;
        this.f1004 = i2 + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m776(Object obj) {
        int iM880 = m880(obj);
        if (iM880 < 0) {
            return false;
        }
        m777(iM880);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final Object m777(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f1004)) {
            m877(i);
            throw null;
        }
        Object[] objArr = this.f1005;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            AbstractC4347.m8835(i, i + 1, objArr, i2, objArr);
        }
        int i3 = this.f1004 - 1;
        this.f1004 = i3;
        objArr[i3] = null;
        return obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m778(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.f1004;
        int size = list.size() + i;
        Object[] objArr = this.f1005;
        if (objArr.length < size) {
            m770(size, objArr);
        }
        Object[] objArr2 = this.f1005;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.f1004 = list.size() + this.f1004;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m779() {
        AbstractC4347.m8834(0, this.f1004, null, this.f1005);
        this.f1004 = 0;
    }

    public /* synthetic */ C0244() {
        this(16);
    }
}
