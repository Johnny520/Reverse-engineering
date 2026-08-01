package kotlin.jvm.internal;

import androidx.compose.foundation.C1868;
import io.ktor.util.C5043;
import java.util.List;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5924;
import kotlin.reflect.KVariance;

/* JADX INFO: renamed from: kotlin.jvm.internal.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5226 implements InterfaceC5924 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC6016 f13318;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f13319;

    public AbstractC5226(Object obj) {
        obj.getClass();
        this.f13319 = obj;
        this.f13318 = AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C1868(this, 21));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AbstractC5226)) {
            return false;
        }
        AbstractC5226 abstractC5226 = (AbstractC5226) obj;
        return AbstractC5227.m9466(mo9460(), abstractC5226.mo9460()) && AbstractC5227.m9466(this.f13319, abstractC5226.f13319);
    }

    public abstract List getUpperBounds();

    public final int hashCode() {
        return mo9460().hashCode() + (this.f13319.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = AbstractC5224.f13314[mo9459().ordinal()];
        if (i != 1) {
            if (i == 2) {
                sb.append("in ");
            } else {
                if (i != 3) {
                    C5043.m9170();
                    return null;
                }
                sb.append("out ");
            }
        }
        sb.append(mo9460());
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract KVariance mo9459();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract String mo9460();
}
