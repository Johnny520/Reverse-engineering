package androidx.compose.ui.platform;

import androidx.activity.ComponentActivity;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.InterfaceC1395;
import kotlin.C5176;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1905 extends AbstractC1881 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f5618;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC1395 f5619;

    public C1905(ComponentActivity componentActivity) {
        super(componentActivity);
        this.f5619 = AbstractC1367.m2474(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return C1905.class.getName();
    }

    @Override // androidx.compose.ui.platform.AbstractC1881
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f5618;
    }

    public final void setContent(InterfaceC6554 interfaceC6554) {
        this.f5618 = true;
        ((AbstractC1347) this.f5619).setValue(interfaceC6554);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            m3496();
        }
    }

    @Override // androidx.compose.ui.platform.AbstractC1881
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo3499(InterfaceC1373 interfaceC1373, final int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(420213850);
        if ((i & 6) == 0) {
            i2 = (c1324.m2378(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (c1324.m2343(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC6554 interfaceC6554 = (InterfaceC6554) ((AbstractC1347) this.f5619).getValue();
            if (interfaceC6554 == null) {
                c1324.m2392(-1238823553);
            } else {
                c1324.m2392(98585282);
                interfaceC6554.invoke(c1324, 0);
            }
            c1324.m2377(false);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new InterfaceC6554() { // from class: androidx.compose.ui.platform.ComposeView$Content$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p052.InterfaceC6554
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
                    return C5176.f14739;
                }

                public final void invoke(InterfaceC1373 interfaceC13732, int i3) {
                    this.$tmp0_rcvr.mo3499(interfaceC13732, AbstractC1367.m2471(i | 1));
                }
            };
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
