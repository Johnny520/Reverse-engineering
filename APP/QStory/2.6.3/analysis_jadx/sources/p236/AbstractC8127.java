package p236;

import java.util.Set;
import kotlin.collections.AbstractC4347;
import kotlin.text.Regex;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8127 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Set f22428;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Regex f22429;

    static {
        AbstractC4347.m8845(new String[]{"max-age", "expires", "domain", "path", "secure", "httponly", "$x-enc"});
        f22429 = new Regex("(^|;)\\s*([^;=\\{\\}\\s]+)\\s*(=\\s*(\"[^\"]*\"|[^;]*))?");
        f22428 = AbstractC4347.m8845(new Character[]{Character.valueOf(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER), ',', '\"'});
    }
}
