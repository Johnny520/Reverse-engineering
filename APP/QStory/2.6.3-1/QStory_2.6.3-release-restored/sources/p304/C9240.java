package p304;

import androidx.compose.foundation.lazy.layout.C1575;
import java.io.File;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: 飘花落叶言楪子兰苏哲世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9240 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C1575 f23648;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f23649;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final File[] f23650;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final File[] f23651;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long[] f23652;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f23653;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final /* synthetic */ C9239 f23654;

    public C9240(C9239 c9239, String str) {
        this.f23654 = c9239;
        this.f23653 = str;
        int i = c9239.f23644;
        File file = c9239.f23647;
        this.f23652 = new long[i];
        this.f23651 = new File[i];
        this.f23650 = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        int length = sb.length();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(i2);
            this.f23651[i2] = new File(file, sb.toString());
            sb.append(".tmp");
            this.f23650[i2] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String m14550() {
        StringBuilder sb = new StringBuilder();
        for (long j : this.f23652) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }
}
