package kotlinx.coroutines.internal;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import kotlin.collections.C4345;
import kotlin.sequences.AbstractC5121;
import kotlin.sequences.C5119;
import p093.C7202;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5349 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List f14920;

    static {
        try {
            Iterator it = Arrays.asList(new C7202()).iterator();
            it.getClass();
            f14920 = AbstractC5121.m10106(new C5119(new C4345(it, 3)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
