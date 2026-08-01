package p126;

import androidx.compose.runtime.AbstractC1374;
import androidx.compose.runtime.C1310;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.composer.gapbuffer.C1234;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.types.AbstractC4922;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7440 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f20140;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f20143;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C7441 f20144;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1324 f20145;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f20147;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f20149;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1310 f20142 = new C1310();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f20141 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ArrayList f20146 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f20150 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f20151 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f20148 = -1;

    public C7440(C1324 c1324, C7441 c7441) {
        this.f20145 = c1324;
        this.f20144 = c7441;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m12654(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                AbstractC1374.m2507("Invalid remove index " + i);
            }
            if (this.f20150 == i) {
                this.f20149 += i2;
                return;
            }
            m12656();
            this.f20150 = i;
            this.f20149 = i2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12655(boolean z) {
        C1234 c1234 = this.f20145.f3854;
        int i = z ? c1234.f3562 : c1234.f3559;
        int i2 = i - this.f20140;
        if (i2 < 0) {
            AbstractC1374.m2507("Tried to seek backward");
        }
        if (i2 > 0) {
            C7423 c7423 = this.f20144.f20152;
            c7423.m12652(C7438.f20137);
            c7423.f20122[c7423.f20119 - c7423.f20123[c7423.f20121 - 1].f18404] = i2;
            this.f20140 = i;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12656() {
        int i = this.f20149;
        if (i > 0) {
            int i2 = this.f20150;
            if (i2 >= 0) {
                m12657();
                C7423 c7423 = this.f20144.f20152;
                c7423.m12652(C7428.f20128);
                int i3 = c7423.f20119 - c7423.f20123[c7423.f20121 - 1].f18404;
                int[] iArr = c7423.f20122;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.f20150 = -1;
            } else {
                int i4 = this.f20148;
                int i5 = this.f20151;
                m12657();
                C7423 c74232 = this.f20144.f20152;
                c74232.m12652(C7447.f20158);
                int i6 = c74232.f20119 - c74232.f20123[c74232.f20121 - 1].f18404;
                int[] iArr2 = c74232.f20122;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.f20151 = -1;
                this.f20148 = -1;
            }
            this.f20149 = 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12657() {
        int i = this.f20147;
        if (i > 0) {
            C7423 c7423 = this.f20144.f20152;
            c7423.m12652(C7432.f20131);
            c7423.f20122[c7423.f20119 - c7423.f20123[c7423.f20121 - 1].f18404] = i;
            this.f20147 = 0;
        }
        ArrayList arrayList = this.f20146;
        if (arrayList.isEmpty()) {
            return;
        }
        C7441 c7441 = this.f20144;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        c7441.getClass();
        if (size != 0) {
            C7423 c74232 = c7441.f20152;
            c74232.m12652(C7456.f20171);
            AbstractC4922.m9866(c74232, 0, objArr);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12658() {
        m12656();
        ArrayList arrayList = this.f20146;
        if (arrayList.isEmpty()) {
            this.f20147++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }
}
