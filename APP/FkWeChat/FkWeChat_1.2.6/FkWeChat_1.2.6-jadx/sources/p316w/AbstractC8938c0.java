package p316w;

import java.util.List;
import p219p.EnumC5898w0;

/* JADX INFO: renamed from: w.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8938c0 {
    /* JADX INFO: renamed from: a */
    public static final int m34322a(InterfaceC8935b0 interfaceC8935b0) {
        boolean z10 = interfaceC8935b0.mo34309f() == EnumC5898w0.f18786q;
        List listMo34314k = interfaceC8935b0.mo34314k();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < listMo34314k.size()) {
            int iM34323b = m34323b(z10, interfaceC8935b0, i10);
            if (iM34323b == -1) {
                i10++;
            } else {
                int iMax = 0;
                while (i10 < listMo34314k.size() && m34323b(z10, interfaceC8935b0, i10) == iM34323b) {
                    iMax = Math.max(iMax, (int) (z10 ? ((InterfaceC8964m) listMo34314k.get(i10)).mo34403a() & 4294967295L : ((InterfaceC8964m) listMo34314k.get(i10)).mo34403a() >> 32));
                    i10++;
                }
                i11 += iMax;
                i12++;
            }
        }
        return (i11 / i12) + interfaceC8935b0.mo34313j();
    }

    /* JADX INFO: renamed from: b */
    public static final int m34323b(boolean z10, InterfaceC8935b0 interfaceC8935b0, int i10) {
        return z10 ? ((InterfaceC8964m) interfaceC8935b0.mo34314k().get(i10)).getRow() : ((InterfaceC8964m) interfaceC8935b0.mo34314k().get(i10)).mo34405m();
    }
}
