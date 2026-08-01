package p126;

import androidx.compose.runtime.AbstractC1374;
import androidx.compose.runtime.C1310;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.composer.gapbuffer.C1234;
import com.bumptech.glide.AbstractC3054;
import java.util.ArrayList;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7439 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f20145;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f20148;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C7440 f20149;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1324 f20150;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f20152;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f20154;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1310 f20147 = new C1310();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f20146 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ArrayList f20151 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f20155 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f20156 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f20153 = -1;

    public C7439(C1324 c1324, C7440 c7440) {
        this.f20150 = c1324;
        this.f20149 = c7440;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m12627(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                AbstractC1374.m2497("Invalid remove index " + i);
            }
            if (this.f20155 == i) {
                this.f20154 += i2;
                return;
            }
            m12629();
            this.f20155 = i;
            this.f20154 = i2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12628(boolean z) {
        C1234 c1234 = this.f20150.f3853;
        int i = z ? c1234.f3561 : c1234.f3558;
        int i2 = i - this.f20145;
        if (i2 < 0) {
            AbstractC1374.m2497("Tried to seek backward");
        }
        if (i2 > 0) {
            C7422 c7422 = this.f20149.f20157;
            c7422.m12623(C7437.f20142);
            c7422.f20127[c7422.f20128 - c7422.f20124[c7422.f20123 - 1].f18409] = i2;
            this.f20145 = i;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12629() {
        int i = this.f20154;
        if (i > 0) {
            int i2 = this.f20155;
            if (i2 >= 0) {
                m12630();
                C7422 c7422 = this.f20149.f20157;
                c7422.m12623(C7427.f20133);
                int i3 = c7422.f20128 - c7422.f20124[c7422.f20123 - 1].f18409;
                int[] iArr = c7422.f20127;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.f20155 = -1;
            } else {
                int i4 = this.f20153;
                int i5 = this.f20156;
                m12630();
                C7422 c74222 = this.f20149.f20157;
                c74222.m12623(C7446.f20163);
                int i6 = c74222.f20128 - c74222.f20124[c74222.f20123 - 1].f18409;
                int[] iArr2 = c74222.f20127;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.f20156 = -1;
                this.f20153 = -1;
            }
            this.f20154 = 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12630() {
        int i = this.f20152;
        if (i > 0) {
            C7422 c7422 = this.f20149.f20157;
            c7422.m12623(C7431.f20136);
            c7422.f20127[c7422.f20128 - c7422.f20124[c7422.f20123 - 1].f18409] = i;
            this.f20152 = 0;
        }
        ArrayList arrayList = this.f20151;
        if (arrayList.isEmpty()) {
            return;
        }
        C7440 c7440 = this.f20149;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        c7440.getClass();
        if (size != 0) {
            C7422 c74222 = c7440.f20157;
            c74222.m12623(C7455.f20176);
            AbstractC3054.m6592(c74222, 0, objArr);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12631() {
        m12629();
        ArrayList arrayList = this.f20151;
        if (arrayList.isEmpty()) {
            this.f20152++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }
}
