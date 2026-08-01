package p077f6;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import p121i3.C3179i;

/* JADX INFO: renamed from: f6.a0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2299a0 {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC2340z m8421a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, InterfaceC0572r interfaceC0572r, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = C3179i.m12003k(1);
        }
        if ((i11 & 2) != 0) {
            f11 = C3179i.m12003k(8);
        }
        if ((i11 & 4) != 0) {
            f12 = C3179i.m12003k(2);
        }
        if ((i11 & 8) != 0) {
            f13 = C3179i.f8458r.m12012c();
        }
        if ((i11 & 16) != 0) {
            f14 = C3179i.m12003k(Opcodes.IF_ICMPNE);
        }
        if ((i11 & 32) != 0) {
            f15 = C3179i.m12003k(16);
        }
        float f17 = f15;
        if ((i11 & 64) != 0) {
            f16 = C3179i.m12003k(8);
        }
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(1463461627, i10, -1, "com.mikepenz.markdown.model.markdownDimens (MarkdownDimens.kt:38)");
        }
        float f18 = f16;
        float f19 = f14;
        float f20 = f12;
        C2308f c2308f = new C2308f(f10, f11, f20, f13, f19, f17, f18, null);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return c2308f;
    }
}
