package p288;

import androidx.compose.foundation.lazy.layout.C0734;
import java.io.File;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: 飘花落叶言楪子兰苏哲世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8411 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C0734 f23303;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f23304;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final File[] f23305;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final File[] f23306;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long[] f23307;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f23308;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final /* synthetic */ C8410 f23309;

    public C8411(C8410 c8410, String str) {
        this.f23309 = c8410;
        this.f23308 = str;
        int i = c8410.f23299;
        File file = c8410.f23302;
        this.f23307 = new long[i];
        this.f23306 = new File[i];
        this.f23305 = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        int length = sb.length();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(i2);
            this.f23306[i2] = new File(file, sb.toString());
            sb.append(".tmp");
            this.f23305[i2] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String m13991() {
        StringBuilder sb = new StringBuilder();
        for (long j : this.f23307) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }
}
