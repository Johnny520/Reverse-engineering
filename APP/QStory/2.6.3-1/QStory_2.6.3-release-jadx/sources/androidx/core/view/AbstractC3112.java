package androidx.core.view;

import androidx.appcompat.app.C0923;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3112 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f6965;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f6966;

    public AbstractC3112() {
        this.f6965 = new long[8];
        this.f6966 = -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public long m4825() {
        int i = this.f6966;
        if (i == -1) {
            return 19500L;
        }
        return ((long[]) this.f6965)[i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public void m4826(long j) {
        if (j == 19500) {
            return;
        }
        int i = this.f6966 + 1;
        this.f6966 = i;
        long[] jArr = (long[]) this.f6965;
        if (i >= jArr.length) {
            this.f6965 = Arrays.copyOf(jArr, jArr.length * 2);
        }
        ((long[]) this.f6965)[i] = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public abstract C3058 mo2025(C3058 c3058, List list);

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public long m4827() {
        int i = this.f6966;
        if (i == -1) {
            return 19500L;
        }
        long[] jArr = (long[]) this.f6965;
        this.f6966 = i - 1;
        return jArr[i];
    }

    public AbstractC3112(int i) {
        this.f6966 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public void mo2026(C3107 c3107) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public void mo2028(C3107 c3107) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public C0923 mo2027(C3107 c3107, C0923 c0923) {
        return c0923;
    }
}
