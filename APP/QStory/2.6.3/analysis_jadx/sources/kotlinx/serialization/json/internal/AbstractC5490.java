package kotlinx.serialization.json.internal;

import androidx.activity.AbstractC0053;
import kotlin.Result;
import kotlin.text.AbstractC5139;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5490 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final int f15172;

    static {
        Object objM163;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            objM163 = Result.m8745constructorimpl(property != null ? AbstractC5139.m10140(property) : null);
        } catch (Throwable th) {
            objM163 = AbstractC0053.m163(th);
        }
        Integer num = (Integer) (Result.m8751isFailureimpl(objM163) ? null : objM163);
        f15172 = num != null ? num.intValue() : 2097152;
    }
}
