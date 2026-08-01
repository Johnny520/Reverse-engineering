package p275t0;

import okhttp3.internal.url._UrlKt;
import p299ub.AbstractC8611a0;
import p299ub.AbstractC8621f0;
import p299ub.C8622g;
import p299ub.C8632n;
import p299ub.InterfaceC8626i;

/* JADX INFO: renamed from: t0.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7959g0 {
    /* JADX INFO: renamed from: a */
    public static final C7991p0 m30718a(String str) {
        String strM33103J0 = AbstractC8621f0.m33103J0(AbstractC8611a0.m33069N(new C8632n("y{1,4}").m33219k(new C8632n("M{1,2}").m33219k(new C8632n("d{1,2}").m33219k(new C8632n("[^dMy/\\-.]").m33219k(str, _UrlKt.FRAGMENT_ENCODE_SET), "dd"), "MM"), "yyyy"), "My", "M/y", false, 4, null), ".");
        InterfaceC8626i interfaceC8626iM33210c = C8632n.m33210c(new C8632n("[/\\-.]"), strM33103J0, 0, 2, null);
        interfaceC8626iM33210c.getClass();
        C8622g c8622g = interfaceC8626iM33210c.mo33183c().get(0);
        c8622g.getClass();
        return new C7991p0(strM33103J0, c8622g.m33172a().charAt(0));
    }
}
