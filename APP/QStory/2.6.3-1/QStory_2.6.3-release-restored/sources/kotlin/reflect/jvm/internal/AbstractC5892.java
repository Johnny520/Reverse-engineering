package kotlin.reflect.jvm.internal;

import io.ktor.util.C5043;
import java.io.IOException;
import kotlin.AbstractC6019;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.InterfaceC5939;
import kotlin.reflect.InterfaceC5940;
import kotlin.reflect.InterfaceC5942;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5892 implements InterfaceC5940 {
    public AbstractC5892() {
        AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C5844(this, 16));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AbstractC5892)) {
            return false;
        }
        AbstractC5892 abstractC5892 = (AbstractC5892) obj;
        return AbstractC5227.m9466(mo10514(), abstractC5892.mo10514()) && getIndex() == abstractC5892.getIndex();
    }

    public final int hashCode() {
        return Integer.hashCode(getIndex()) + (mo10514().hashCode() * 31);
    }

    public final String toString() throws IOException {
        String strM10643;
        StringBuilder sb = new StringBuilder();
        int i = AbstractC5909.f14973[getKind().ordinal()];
        if (i == 1) {
            sb.append("instance parameter");
        } else if (i == 2) {
            sb.append("context parameter " + getName());
        } else if (i == 3) {
            sb.append("extension receiver parameter");
        } else {
            if (i != 4) {
                C5043.m9170();
                return null;
            }
            sb.append("parameter #" + getIndex() + ' ' + getName());
        }
        sb.append(" of ");
        InterfaceC5896 interfaceC5896Mo10514 = mo10514();
        if (interfaceC5896Mo10514 instanceof InterfaceC5920) {
            InterfaceC5920 interfaceC5920 = (InterfaceC5920) interfaceC5896Mo10514;
            StringBuilder sb2 = new StringBuilder();
            C5901.m10646(sb2, interfaceC5920);
            sb2.append(interfaceC5920 instanceof InterfaceC5939 ? "var " : "val ");
            C5901.m10644(sb2, interfaceC5920);
            C5901.m10645(sb2, interfaceC5920.getName());
            sb2.append(": ");
            sb2.append(C5901.m10641(interfaceC5920.getReturnType(), false));
            strM10643 = sb2.toString();
        } else {
            if (!(interfaceC5896Mo10514 instanceof InterfaceC5942)) {
                C5043.m9151(interfaceC5896Mo10514, "Illegal callable: ");
                return null;
            }
            strM10643 = C5901.m10643((InterfaceC5942) interfaceC5896Mo10514);
        }
        sb.append(strM10643);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract InterfaceC5896 mo10514();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public abstract boolean mo10515();
}
