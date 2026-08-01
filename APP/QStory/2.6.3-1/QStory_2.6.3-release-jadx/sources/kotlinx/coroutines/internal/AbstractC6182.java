package kotlinx.coroutines.internal;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import kotlin.collections.C5178;
import kotlin.sequences.AbstractC5954;
import kotlin.sequences.C5952;
import p109.C8032;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6182 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List f15265;

    static {
        try {
            Iterator it = Arrays.asList(new C8032()).iterator();
            it.getClass();
            f15265 = AbstractC5954.m10669(new C5952(new C5178(it, 3)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
