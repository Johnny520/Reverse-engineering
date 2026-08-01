package androidx.compose.ui.platform;

import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.AbstractC1390;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1334;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6553;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class PlatformTextInputModifierNodeKt$InterceptPlatformTextInput$1 extends Lambda implements InterfaceC6553 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC6553 $content;
    final /* synthetic */ InterfaceC1855 $interceptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformTextInputModifierNodeKt$InterceptPlatformTextInput$1(InterfaceC1855 interfaceC1855, InterfaceC6553 interfaceC6553, int i) {
        super(2);
        this.$content = interfaceC6553;
        this.$$changed = i;
    }

    public final void invoke(InterfaceC1373 interfaceC1373, int i) {
        int i2;
        InterfaceC6553 interfaceC6553 = this.$content;
        int iM2460 = AbstractC1367.m2460(this.$$changed | 1);
        C1334 c1334 = AbstractC1853.f5361;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-1892278287);
        if ((iM2460 & 6) == 0) {
            i2 = ((iM2460 & 8) == 0 ? c1324.m2350(null) : c1324.m2368(null) ? 4 : 2) | iM2460;
        } else {
            i2 = iM2460;
        }
        if ((iM2460 & 48) == 0) {
            i2 |= c1324.m2368(interfaceC6553) ? 32 : 16;
        }
        if (c1324.m2333(i2 & 1, (i2 & 19) != 18)) {
            AbstractC1390 abstractC1390 = AbstractC1853.f5361;
            C1923 c1923 = (C1923) c1324.m2373(abstractC1390);
            boolean zM2350 = c1324.m2350(c1923);
            Object objM2335 = c1324.m2335();
            if (zM2350 || objM2335 == C1369.f3973) {
                objM2335 = new C1923(c1923);
                c1324.m2376(objM2335);
            }
            C1923 c19232 = (C1923) objM2335;
            ((AbstractC1347) c19232.f5670).setValue(null);
            AbstractC1367.m2478(abstractC1390.mo2418(c19232), interfaceC6553, c1324, (i2 & 112) | 8);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new PlatformTextInputModifierNodeKt$InterceptPlatformTextInput$1(null, interfaceC6553, iM2460);
        }
    }

    @Override // p052.InterfaceC6553
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
        return C5175.f14739;
    }
}
