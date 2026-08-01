package p077f6;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import p121i3.C3179i;
import p274t.AbstractC7872n2;
import p274t.InterfaceC7887q2;

/* JADX INFO: renamed from: f6.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2311g0 {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC2309f0 m8454a(float f10, float f11, float f12, float f13, C3179i c3179i, float f14, InterfaceC7887q2 interfaceC7887q2, InterfaceC7887q2 interfaceC7887q22, InterfaceC7887q2 interfaceC7887q23, InterfaceC7887q2.a aVar, InterfaceC0572r interfaceC0572r, int i10, int i11) {
        InterfaceC7887q2.a aVar2;
        if ((i11 & 1) != 0) {
            f10 = C3179i.m12003k(2);
        }
        float fM12003k = (i11 & 2) != 0 ? C3179i.m12003k(4) : f11;
        float fM12003k2 = (i11 & 4) != 0 ? C3179i.m12003k(4) : f12;
        float fM12003k3 = (i11 & 8) != 0 ? C3179i.m12003k(4) : f13;
        C3179i c3179i2 = (i11 & 16) != 0 ? null : c3179i;
        float fM12003k4 = (i11 & 32) != 0 ? C3179i.m12003k(8) : f14;
        InterfaceC7887q2 interfaceC7887q2M30444e = (i11 & 64) != 0 ? AbstractC7872n2.m30444e(C3179i.m12003k(8)) : interfaceC7887q2;
        InterfaceC7887q2 interfaceC7887q2M30445f = (i11 & 128) != 0 ? AbstractC7872n2.m30445f(C3179i.m12003k(16), C3179i.m12003k(0)) : interfaceC7887q22;
        InterfaceC7887q2 interfaceC7887q2M30446g = (i11 & 256) != 0 ? AbstractC7872n2.m30446g(0.0f, C3179i.m12003k(4), 1, null) : interfaceC7887q23;
        if ((i11 & 512) != 0) {
            float f15 = 4;
            float f16 = 2;
            aVar2 = new InterfaceC7887q2.a(C3179i.m12003k(f15), C3179i.m12003k(f16), C3179i.m12003k(f15), C3179i.m12003k(f16), null);
        } else {
            aVar2 = aVar;
        }
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-1184703318, i10, -1, "com.mikepenz.markdown.model.markdownPadding (MarkdownPadding.kt:55)");
        }
        if (c3179i2 != null) {
            fM12003k4 = c3179i2.m12009r();
        }
        C2314i c2314i = new C2314i(f10, fM12003k, fM12003k2, fM12003k3, fM12003k4, interfaceC7887q2M30444e, interfaceC7887q2M30445f, interfaceC7887q2M30446g, aVar2, null);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return c2314i;
    }
}
