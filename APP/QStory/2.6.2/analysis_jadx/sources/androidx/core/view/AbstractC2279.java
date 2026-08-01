package androidx.core.view;

import androidx.appcompat.app.C0076;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2279 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f6619;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f6620;

    public AbstractC2279() {
        this.f6619 = new long[8];
        this.f6620 = -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public long m4255() {
        int i = this.f6620;
        if (i == -1) {
            return 19500L;
        }
        return ((long[]) this.f6619)[i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public void m4256(long j) {
        if (j == 19500) {
            return;
        }
        int i = this.f6620 + 1;
        this.f6620 = i;
        long[] jArr = (long[]) this.f6619;
        if (i >= jArr.length) {
            this.f6619 = Arrays.copyOf(jArr, jArr.length * 2);
        }
        ((long[]) this.f6619)[i] = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public abstract C2225 mo1455(C2225 c2225, List list);

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public long m4257() {
        int i = this.f6620;
        if (i == -1) {
            return 19500L;
        }
        long[] jArr = (long[]) this.f6619;
        this.f6620 = i - 1;
        return jArr[i];
    }

    public AbstractC2279(int i) {
        this.f6620 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public void mo1456(C2274 c2274) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public void mo1458(C2274 c2274) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public C0076 mo1457(C2274 c2274, C0076 c0076) {
        return c0076;
    }
}
