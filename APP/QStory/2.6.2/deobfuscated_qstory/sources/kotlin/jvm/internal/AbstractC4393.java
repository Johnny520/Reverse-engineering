package kotlin.jvm.internal;

import androidx.compose.foundation.C1030;
import io.ktor.util.C4210;
import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5091;
import kotlin.reflect.KVariance;

/* JADX INFO: renamed from: kotlin.jvm.internal.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4393 implements InterfaceC5091 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5183 f12969;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f12970;

    public AbstractC4393(Object obj) {
        obj.getClass();
        this.f12970 = obj;
        this.f12969 = AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C1030(this, 21));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AbstractC4393)) {
            return false;
        }
        AbstractC4393 abstractC4393 = (AbstractC4393) obj;
        return AbstractC4394.m8917(mo8911(), abstractC4393.mo8911()) && AbstractC4394.m8917(this.f12970, abstractC4393.f12970);
    }

    public abstract List getUpperBounds();

    public final int hashCode() {
        return mo8911().hashCode() + (this.f12970.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = AbstractC4391.f12965[mo8910().ordinal()];
        if (i != 1) {
            if (i == 2) {
                sb.append("in ");
            } else {
                if (i != 3) {
                    C4210.m8621();
                    return null;
                }
                sb.append("out ");
            }
        }
        sb.append(mo8911());
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract KVariance mo8910();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract String mo8911();
}
