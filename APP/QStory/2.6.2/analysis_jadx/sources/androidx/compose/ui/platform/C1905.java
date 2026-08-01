package androidx.compose.ui.platform;

import androidx.activity.ComponentActivity;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.InterfaceC1395;
import kotlin.C5175;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1905 extends AbstractC1881 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f5617;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC1395 f5618;

    public C1905(ComponentActivity componentActivity) {
        super(componentActivity);
        this.f5618 = AbstractC1367.m2465(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return C1905.class.getName();
    }

    @Override // androidx.compose.ui.platform.AbstractC1881
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f5617;
    }

    public final void setContent(InterfaceC6553 interfaceC6553) {
        this.f5617 = true;
        ((AbstractC1347) this.f5618).setValue(interfaceC6553);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            m3486();
        }
    }

    @Override // androidx.compose.ui.platform.AbstractC1881
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo3489(InterfaceC1373 interfaceC1373, final int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(420213850);
        if ((i & 6) == 0) {
            i2 = (c1324.m2368(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (c1324.m2333(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC6553 interfaceC6553 = (InterfaceC6553) ((AbstractC1347) this.f5618).getValue();
            if (interfaceC6553 == null) {
                c1324.m2382(-1238823553);
            } else {
                c1324.m2382(98585282);
                interfaceC6553.invoke(c1324, 0);
            }
            c1324.m2367(false);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new InterfaceC6553() { // from class: androidx.compose.ui.platform.ComposeView$Content$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p052.InterfaceC6553
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
                    return C5175.f14739;
                }

                public final void invoke(InterfaceC1373 interfaceC13732, int i3) {
                    this.$tmp0_rcvr.mo3489(interfaceC13732, AbstractC1367.m2460(i | 1));
                }
            };
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
