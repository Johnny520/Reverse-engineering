package kotlinx.coroutines.internal;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import kotlin.collections.C4346;
import kotlin.sequences.AbstractC5122;
import kotlin.sequences.C5120;
import p093.C7203;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5350 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List f14920;

    static {
        try {
            Iterator it = Arrays.asList(new C7203()).iterator();
            it.getClass();
            f14920 = AbstractC5122.m10110(new C5120(new C4346(it, 3)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
