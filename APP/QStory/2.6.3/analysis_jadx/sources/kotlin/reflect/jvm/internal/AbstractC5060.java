package kotlin.reflect.jvm.internal;

import io.ktor.util.C4211;
import java.io.IOException;
import kotlin.AbstractC5187;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.InterfaceC5107;
import kotlin.reflect.InterfaceC5108;
import kotlin.reflect.InterfaceC5110;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5060 implements InterfaceC5108 {
    public AbstractC5060() {
        AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C5012(this, 16));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AbstractC5060)) {
            return false;
        }
        AbstractC5060 abstractC5060 = (AbstractC5060) obj;
        return AbstractC4395.m8907(mo9955(), abstractC5060.mo9955()) && getIndex() == abstractC5060.getIndex();
    }

    public final int hashCode() {
        return Integer.hashCode(getIndex()) + (mo9955().hashCode() * 31);
    }

    public final String toString() throws IOException {
        String strM10084;
        StringBuilder sb = new StringBuilder();
        int i = AbstractC5077.f14628[getKind().ordinal()];
        if (i == 1) {
            sb.append("instance parameter");
        } else if (i == 2) {
            sb.append("context parameter " + getName());
        } else if (i == 3) {
            sb.append("extension receiver parameter");
        } else {
            if (i != 4) {
                C4211.m8611();
                return null;
            }
            sb.append("parameter #" + getIndex() + ' ' + getName());
        }
        sb.append(" of ");
        InterfaceC5064 interfaceC5064Mo9955 = mo9955();
        if (interfaceC5064Mo9955 instanceof InterfaceC5088) {
            InterfaceC5088 interfaceC5088 = (InterfaceC5088) interfaceC5064Mo9955;
            StringBuilder sb2 = new StringBuilder();
            C5069.m10087(sb2, interfaceC5088);
            sb2.append(interfaceC5088 instanceof InterfaceC5107 ? "var " : "val ");
            C5069.m10085(sb2, interfaceC5088);
            C5069.m10086(sb2, interfaceC5088.getName());
            sb2.append(": ");
            sb2.append(C5069.m10082(interfaceC5088.getReturnType(), false));
            strM10084 = sb2.toString();
        } else {
            if (!(interfaceC5064Mo9955 instanceof InterfaceC5110)) {
                C4211.m8592(interfaceC5064Mo9955, "Illegal callable: ");
                return null;
            }
            strM10084 = C5069.m10084((InterfaceC5110) interfaceC5064Mo9955);
        }
        sb.append(strM10084);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract InterfaceC5064 mo9955();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public abstract boolean mo9956();
}
