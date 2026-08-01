package gb;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.Iterator;
import p160kb.InterfaceC4231k;
import p160kb.InterfaceC4232l;
import p185m8.AbstractC5081g0;
import p243q9.InterfaceC6328c;
import p259ra.AbstractC6569n;
import p299ub.AbstractC8642x;

/* JADX INFO: renamed from: gb.c1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2650c1 extends AbstractC2687l2 implements InterfaceC4231k, InterfaceC4232l {
    public AbstractC2650c1() {
        super(null);
    }

    /* JADX INFO: renamed from: a1 */
    public abstract AbstractC2650c1 mo7032X0(boolean z10);

    /* JADX INFO: renamed from: b1 */
    public abstract AbstractC2650c1 mo7034Z0(C2704q1 c2704q1);

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            AbstractC8642x.m33248o(sb2, "[", AbstractC6569n.m25895O(AbstractC6569n.f20555k, (InterfaceC6328c) it.next(), null, 2, null), "] ");
        }
        sb2.append(mo9332T0());
        if (!mo9330R0().isEmpty()) {
            AbstractC5081g0.m20583q0(mo9330R0(), sb2, ", ", "<", ">", 0, null, null, Opcodes.IREM, null);
        }
        if (mo9258U0()) {
            sb2.append("?");
        }
        return sb2.toString();
    }
}
