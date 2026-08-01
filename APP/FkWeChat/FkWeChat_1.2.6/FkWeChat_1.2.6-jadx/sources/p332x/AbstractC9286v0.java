package p332x;

import androidx.compose.foundation.lazy.layout.InterfaceC0360c1;
import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import com.alibaba.fastjson2.internal.asm.Opcodes;

/* JADX INFO: renamed from: x.v0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9286v0 {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC0360c1 m36127a(AbstractC9242c1 abstractC9242c1, boolean z10, InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-786344289, i10, -1, "androidx.compose.foundation.pager.rememberPagerSemanticState (PagerSemantics.kt:26)");
        }
        boolean z11 = ((((i10 & 14) ^ 6) > 4 && interfaceC0572r.mo2162U(abstractC9242c1)) || (i10 & 6) == 4) | ((((i10 & Opcodes.IREM) ^ 48) > 32 && interfaceC0572r.mo2167c(z10)) || (i10 & 48) == 32);
        Object objMo2170f = interfaceC0572r.mo2170f();
        if (z11 || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
            objMo2170f = AbstractC9265l.m36076a(abstractC9242c1, z10);
            interfaceC0572r.mo2153L(objMo2170f);
        }
        InterfaceC0360c1 interfaceC0360c1 = (InterfaceC0360c1) objMo2170f;
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return interfaceC0360c1;
    }
}
