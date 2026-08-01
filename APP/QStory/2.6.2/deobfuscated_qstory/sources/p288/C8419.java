package p288;

import androidx.compose.foundation.lazy.layout.C0734;
import java.io.File;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: 飘花落叶言楪子兰苏哲世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8419 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C0734 f23312;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f23313;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final File[] f23314;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final File[] f23315;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long[] f23316;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f23317;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final /* synthetic */ C8418 f23318;

    public C8419(C8418 c8418, String str) {
        this.f23318 = c8418;
        this.f23317 = str;
        int i = c8418.f23308;
        File file = c8418.f23311;
        this.f23316 = new long[i];
        this.f23315 = new File[i];
        this.f23314 = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        int length = sb.length();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(i2);
            this.f23315[i2] = new File(file, sb.toString());
            sb.append(".tmp");
            this.f23314[i2] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String m13972() {
        StringBuilder sb = new StringBuilder();
        for (long j : this.f23316) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }
}
