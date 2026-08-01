package androidx.compose.p001ui.platform;

import androidx.activity.ComponentActivity;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.InterfaceC2230;
import kotlin.C6008;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2740 extends AbstractC2716 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f5963;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC2230 f5964;

    public C2740(ComponentActivity componentActivity) {
        super(componentActivity);
        this.f5964 = AbstractC2202.m3034(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return C2740.class.getName();
    }

    @Override // androidx.compose.p001ui.platform.AbstractC2716
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f5963;
    }

    public final void setContent(InterfaceC7383 interfaceC7383) {
        this.f5963 = true;
        ((AbstractC2182) this.f5964).setValue(interfaceC7383);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            m4056();
        }
    }

    @Override // androidx.compose.p001ui.platform.AbstractC2716
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo4059(InterfaceC2208 interfaceC2208, final int i) {
        int i2;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(420213850);
        if ((i & 6) == 0) {
            i2 = (c2159.m2938(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (c2159.m2903(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC7383 interfaceC7383 = (InterfaceC7383) ((AbstractC2182) this.f5964).getValue();
            if (interfaceC7383 == null) {
                c2159.m2952(-1238823553);
            } else {
                c2159.m2952(98585282);
                interfaceC7383.invoke(c2159, 0);
            }
            c2159.m2937(false);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new InterfaceC7383() { // from class: androidx.compose.ui.platform.ComposeView$Content$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p068.InterfaceC7383
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
                    return C6008.f15084;
                }

                public final void invoke(InterfaceC2208 interfaceC22082, int i3) {
                    this.$tmp0_rcvr.mo4059(interfaceC22082, AbstractC2202.m3031(i | 1));
                }
            };
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
