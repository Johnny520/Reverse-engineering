package androidx.compose.foundation;

import android.content.Context;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2341;
import androidx.compose.p001ui.node.C2593;
import androidx.compose.p001ui.platform.AbstractC2670;
import androidx.compose.p001ui.platform.AbstractC2737;
import androidx.compose.p001ui.semantics.AbstractC2778;
import androidx.compose.p001ui.semantics.AbstractC2781;
import androidx.compose.p001ui.semantics.C2782;
import androidx.compose.p001ui.semantics.C2790;
import androidx.compose.p001ui.semantics.InterfaceC2779;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2169;
import androidx.compose.runtime.InterfaceC2203;
import androidx.compose.runtime.internal.C2088;
import kotlin.C6008;
import kotlin.reflect.InterfaceC5920;
import p068.InterfaceC7387;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1915 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3550;

    public /* synthetic */ C1915(int i) {
        this.f3550 = i;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f3550;
        C6008 c6008 = C6008.f15084;
        switch (i) {
            case 0:
                return MagnifierNode$onAttach$1.invokeSuspend$lambda$0(((Long) obj).longValue());
            case 1:
                ((C2593) ((InterfaceC2341) obj)).m3871();
                return c6008;
            case 2:
                return c6008;
            case 3:
                InterfaceC2203 interfaceC2203 = (InterfaceC2203) obj;
                int i2 = AbstractC1888.f3442;
                C2169 c2169 = AbstractC2670.f5681;
                C2088 c2088 = (C2088) interfaceC2203;
                c2088.getClass();
                Context context = (Context) AbstractC2202.m3042(c2088, c2169);
                C2088 c20882 = (C2088) interfaceC2203;
                InterfaceC8725 interfaceC8725 = (InterfaceC8725) AbstractC2202.m3042(c20882, AbstractC2737.f5933);
                C1927 c1927 = (C1927) AbstractC2202.m3042(c20882, AbstractC1926.f3561);
                if (c1927 == null) {
                    return null;
                }
                return new C1889(context, interfaceC8725, c1927.f3563, c1927.f3562);
            case 4:
                C2790 c2790 = C2790.f6119;
                InterfaceC5920[] interfaceC5920Arr = AbstractC2781.f6100;
                C2782 c2782 = AbstractC2778.f6077;
                InterfaceC5920 interfaceC5920 = AbstractC2781.f6100[1];
                c2782.getClass();
                ((InterfaceC2779) obj).mo4150(c2782, c2790);
                return c6008;
            default:
                return new C1878(((Integer) obj).intValue());
        }
    }
}
