package kotlinx.serialization.json.internal;

import androidx.activity.AbstractC0900;
import kotlin.Result;
import kotlin.text.AbstractC5971;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6322 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final int f15517;

    static {
        Object objM723;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            objM723 = Result.m9304constructorimpl(property != null ? AbstractC5971.m10699(property) : null);
        } catch (Throwable th) {
            objM723 = AbstractC0900.m723(th);
        }
        Integer num = (Integer) (Result.m9310isFailureimpl(objM723) ? null : objM723);
        f15517 = num != null ? num.intValue() : 2097152;
    }
}
