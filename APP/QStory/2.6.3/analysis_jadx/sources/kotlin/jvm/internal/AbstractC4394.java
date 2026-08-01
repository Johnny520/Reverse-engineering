package kotlin.jvm.internal;

import androidx.compose.foundation.C1030;
import io.ktor.util.C4211;
import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.KVariance;

/* JADX INFO: renamed from: kotlin.jvm.internal.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4394 implements InterfaceC5092 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5184 f12973;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f12974;

    public AbstractC4394(Object obj) {
        obj.getClass();
        this.f12974 = obj;
        this.f12973 = AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C1030(this, 21));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AbstractC4394)) {
            return false;
        }
        AbstractC4394 abstractC4394 = (AbstractC4394) obj;
        return AbstractC4395.m8907(mo8901(), abstractC4394.mo8901()) && AbstractC4395.m8907(this.f12974, abstractC4394.f12974);
    }

    public abstract List getUpperBounds();

    public final int hashCode() {
        return mo8901().hashCode() + (this.f12974.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = AbstractC4392.f12969[mo8900().ordinal()];
        if (i != 1) {
            if (i == 2) {
                sb.append("in ");
            } else {
                if (i != 3) {
                    C4211.m8611();
                    return null;
                }
                sb.append("out ");
            }
        }
        sb.append(mo8901());
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract KVariance mo8900();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract String mo8901();
}
