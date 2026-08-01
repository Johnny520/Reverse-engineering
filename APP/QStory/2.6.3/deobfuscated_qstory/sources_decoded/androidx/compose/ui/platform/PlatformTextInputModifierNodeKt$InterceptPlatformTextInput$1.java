package androidx.compose.ui.platform;

import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.AbstractC1390;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1334;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6554;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class PlatformTextInputModifierNodeKt$InterceptPlatformTextInput$1 extends Lambda implements InterfaceC6554 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC6554 $content;
    final /* synthetic */ InterfaceC1855 $interceptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformTextInputModifierNodeKt$InterceptPlatformTextInput$1(InterfaceC1855 interfaceC1855, InterfaceC6554 interfaceC6554, int i) {
        super(2);
        this.$content = interfaceC6554;
        this.$$changed = i;
    }

    public final void invoke(InterfaceC1373 interfaceC1373, int i) {
        int i2;
        InterfaceC6554 interfaceC6554 = this.$content;
        int iM2471 = AbstractC1367.m2471(this.$$changed | 1);
        C1334 c1334 = AbstractC1853.f5362;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(-1892278287);
        if ((iM2471 & 6) == 0) {
            i2 = ((iM2471 & 8) == 0 ? c1324.m2360(null) : c1324.m2378(null) ? 4 : 2) | iM2471;
        } else {
            i2 = iM2471;
        }
        if ((iM2471 & 48) == 0) {
            i2 |= c1324.m2378(interfaceC6554) ? 32 : 16;
        }
        if (c1324.m2343(i2 & 1, (i2 & 19) != 18)) {
            AbstractC1390 abstractC1390 = AbstractC1853.f5362;
            C1923 c1923 = (C1923) c1324.m2383(abstractC1390);
            boolean zM2360 = c1324.m2360(c1923);
            Object objM2345 = c1324.m2345();
            if (zM2360 || objM2345 == C1369.f3974) {
                objM2345 = new C1923(c1923);
                c1324.m2386(objM2345);
            }
            C1923 c19232 = (C1923) objM2345;
            ((AbstractC1347) c19232.f5671).setValue(null);
            AbstractC1367.m2487(abstractC1390.mo2428(c19232), interfaceC6554, c1324, (i2 & 112) | 8);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new PlatformTextInputModifierNodeKt$InterceptPlatformTextInput$1(null, interfaceC6554, iM2471);
        }
    }

    @Override // p052.InterfaceC6554
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
        return C5176.f14739;
    }
}
