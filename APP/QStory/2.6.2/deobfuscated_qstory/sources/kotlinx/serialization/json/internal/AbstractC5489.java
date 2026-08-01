package kotlinx.serialization.json.internal;

import androidx.activity.AbstractC0053;
import kotlin.Result;
import kotlin.text.AbstractC5138;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5489 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final int f15172;

    static {
        Object objM162;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            objM162 = Result.m8755constructorimpl(property != null ? AbstractC5138.m10136(property) : null);
        } catch (Throwable th) {
            objM162 = AbstractC0053.m162(th);
        }
        Integer num = (Integer) (Result.m8761isFailureimpl(objM162) ? null : objM162);
        f15172 = num != null ? num.intValue() : 2097152;
    }
}
