package kotlin.reflect.jvm.internal;

import io.ktor.util.C4210;
import java.io.IOException;
import kotlin.AbstractC5186;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5106;
import kotlin.reflect.InterfaceC5107;
import kotlin.reflect.InterfaceC5109;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5059 implements InterfaceC5107 {
    public AbstractC5059() {
        AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C5011(this, 16));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AbstractC5059)) {
            return false;
        }
        AbstractC5059 abstractC5059 = (AbstractC5059) obj;
        return AbstractC4394.m8917(mo9958(), abstractC5059.mo9958()) && getIndex() == abstractC5059.getIndex();
    }

    public final int hashCode() {
        return Integer.hashCode(getIndex()) + (mo9958().hashCode() * 31);
    }

    public final String toString() throws IOException {
        String strM10080;
        StringBuilder sb = new StringBuilder();
        int i = AbstractC5076.f14628[getKind().ordinal()];
        if (i == 1) {
            sb.append("instance parameter");
        } else if (i == 2) {
            sb.append("context parameter " + getName());
        } else if (i == 3) {
            sb.append("extension receiver parameter");
        } else {
            if (i != 4) {
                C4210.m8621();
                return null;
            }
            sb.append("parameter #" + getIndex() + ' ' + getName());
        }
        sb.append(" of ");
        InterfaceC5063 interfaceC5063Mo9958 = mo9958();
        if (interfaceC5063Mo9958 instanceof InterfaceC5087) {
            InterfaceC5087 interfaceC5087 = (InterfaceC5087) interfaceC5063Mo9958;
            StringBuilder sb2 = new StringBuilder();
            C5068.m10083(sb2, interfaceC5087);
            sb2.append(interfaceC5087 instanceof InterfaceC5106 ? "var " : "val ");
            C5068.m10081(sb2, interfaceC5087);
            C5068.m10082(sb2, interfaceC5087.getName());
            sb2.append(": ");
            sb2.append(C5068.m10078(interfaceC5087.getReturnType(), false));
            strM10080 = sb2.toString();
        } else {
            if (!(interfaceC5063Mo9958 instanceof InterfaceC5109)) {
                C4210.m8602(interfaceC5063Mo9958, "Illegal callable: ");
                return null;
            }
            strM10080 = C5068.m10080((InterfaceC5109) interfaceC5063Mo9958);
        }
        sb.append(strM10080);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract InterfaceC5063 mo9958();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public abstract boolean mo9959();
}
