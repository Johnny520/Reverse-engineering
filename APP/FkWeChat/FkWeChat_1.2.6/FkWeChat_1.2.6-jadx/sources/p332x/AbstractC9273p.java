package p332x;

import androidx.compose.foundation.lazy.layout.InterfaceC0406o;
import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import com.alibaba.fastjson2.internal.asm.Opcodes;

/* JADX INFO: renamed from: x.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9273p {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC0406o m36100a(AbstractC9242c1 abstractC9242c1, int i10, InterfaceC0572r interfaceC0572r, int i11) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(373558254, i11, -1, "androidx.compose.foundation.pager.rememberPagerBeyondBoundsState (PagerBeyondBoundsModifier.kt:25)");
        }
        boolean z10 = ((((i11 & 14) ^ 6) > 4 && interfaceC0572r.mo2162U(abstractC9242c1)) || (i11 & 6) == 4) | ((((i11 & Opcodes.IREM) ^ 48) > 32 && interfaceC0572r.mo2172h(i10)) || (i11 & 48) == 32);
        Object objMo2170f = interfaceC0572r.mo2170f();
        if (z10 || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
            objMo2170f = new C9275q(abstractC9242c1, i10);
            interfaceC0572r.mo2153L(objMo2170f);
        }
        C9275q c9275q = (C9275q) objMo2170f;
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return c9275q;
    }
}
