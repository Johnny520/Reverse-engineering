package androidx.compose.foundation.text;

import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.C1363;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.layout.InterfaceC1695;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.C2068;
import androidx.compose.ui.text.input.C2013;
import androidx.compose.ui.text.input.C2028;
import kotlin.C5175;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0977 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0943 f2803;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2804;

    public /* synthetic */ C0977(C0943 c0943, int i) {
        this.f2804 = i;
        this.f2803 = c0943;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f2804;
        C5175 c5175 = C5175.f14739;
        C0943 c0943 = this.f2803;
        switch (i) {
            case 0:
                InterfaceC1695 interfaceC1695 = (InterfaceC1695) obj;
                C0963 c0963M1855 = c0943.m1855();
                if (c0963M1855 != null) {
                    c0963M1855.f2742 = interfaceC1695;
                }
                return c5175;
            case 1:
                InterfaceC1395 interfaceC1395 = c0943.f2670;
                C2013 c2013 = (C2013) obj;
                String str = c2013.f5946.f6128;
                C2068 c2068 = c0943.f2687;
                if (!AbstractC4394.m8917(str, c2068 != null ? c2068.f6128 : null)) {
                    ((AbstractC1347) c0943.f2684).setValue(HandleState.None);
                    if (((Boolean) ((AbstractC1347) interfaceC1395).getValue()).booleanValue()) {
                        ((AbstractC1347) interfaceC1395).setValue(Boolean.FALSE);
                    } else {
                        ((AbstractC1347) c0943.f2671).setValue(Boolean.FALSE);
                    }
                }
                long j = C2035.f6002;
                c0943.m1853(j);
                c0943.m1854(j);
                c0943.f2674.invoke(c2013);
                C1389 c1389 = c0943.f2668;
                C1363 c1363 = c1389.f4036;
                if (c1363 != null) {
                    c1363.m2450(c1389, null);
                }
                return c5175;
            case 2:
                c0943.f2679.m1860(((C2028) obj).f5977);
                return c5175;
            case 3:
                return Boolean.valueOf(c0943.f2679.m1860(((C2028) obj).f5977));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((AbstractC1347) c0943.f2678).setValue(bool);
                return c5175;
        }
    }
}
