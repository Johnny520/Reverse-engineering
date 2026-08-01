package p061;

import androidx.activity.AbstractC0900;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲楪苏.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7302 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f18100;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18101;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5519 f18102;

    public AbstractC7302(C5519 c5519, String str, int i) {
        c5519.getClass();
        this.f18102 = c5519;
        this.f18101 = str;
        this.f18100 = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18102);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        return AbstractC0900.m708(sb, this.f18101, 'N');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5523 m12551(int i) {
        return C5523.m9889(this.f18101 + i);
    }
}
