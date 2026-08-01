package p045;

import androidx.activity.AbstractC0053;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲楪苏.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6472 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f17759;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f17760;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4686 f17761;

    public AbstractC6472(C4686 c4686, String str, int i) {
        c4686.getClass();
        this.f17761 = c4686;
        this.f17760 = str;
        this.f17759 = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17761);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        return AbstractC0053.m155(sb, this.f17760, 'N');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4690 m11949(int i) {
        return C4690.m9340(this.f17760 + i);
    }
}
