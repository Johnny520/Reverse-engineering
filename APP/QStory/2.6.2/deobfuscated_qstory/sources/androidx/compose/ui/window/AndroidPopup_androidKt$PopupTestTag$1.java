package androidx.compose.ui.window;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1358;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6553;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class AndroidPopup_androidKt$PopupTestTag$1 extends Lambda implements InterfaceC6553 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC6553 $content;
    final /* synthetic */ String $tag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$PopupTestTag$1(String str, InterfaceC6553 interfaceC6553, int i) {
        super(2);
        this.$tag = str;
        this.$content = interfaceC6553;
        this.$$changed = i;
    }

    public final void invoke(InterfaceC1373 interfaceC1373, int i) {
        int i2;
        String str = this.$tag;
        InterfaceC6553 interfaceC6553 = this.$content;
        int iM2460 = AbstractC1367.m2460(this.$$changed | 1);
        C1358 c1358 = AbstractC2091.f6197;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(1357513789);
        if ((iM2460 & 6) == 0) {
            i2 = (c1324.m2350(str) ? 4 : 2) | iM2460;
        } else {
            i2 = iM2460;
        }
        if ((iM2460 & 48) == 0) {
            i2 |= c1324.m2368(interfaceC6553) ? 32 : 16;
        }
        if (c1324.m2333(i2 & 1, (i2 & 19) != 18)) {
            AbstractC1367.m2478(AbstractC2091.f6197.mo2418(str), interfaceC6553, c1324, (i2 & 112) | 8);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new AndroidPopup_androidKt$PopupTestTag$1(str, interfaceC6553, iM2460);
        }
    }

    @Override // p052.InterfaceC6553
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
        return C5175.f14739;
    }
}
