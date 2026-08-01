package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.AbstractC1347;
import androidx.compose.ui.graphics.C1587;
import androidx.compose.ui.layout.InterfaceC1695;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4382;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1 extends FunctionReferenceImpl implements InterfaceC6558 {
    final /* synthetic */ InterfaceC0853 $node;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1(InterfaceC0853 interfaceC0853) {
        super(1, AbstractC4382.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.$node = interfaceC0853;
    }

    @Override // p052.InterfaceC6558
    public /* synthetic */ Object invoke(Object obj) {
        m1652invoke58bKbWc(((C1587) obj).f4674);
        return C5176.f14739;
    }

    /* JADX INFO: renamed from: invoke-58bKbWc, reason: not valid java name */
    public final void m1652invoke58bKbWc(float[] fArr) {
        InterfaceC1695 interfaceC1695 = (InterfaceC1695) ((AbstractC1347) ((C0865) this.$node).f2422).getValue();
        if (interfaceC1695 != null) {
            if (!interfaceC1695.mo3086()) {
                interfaceC1695 = null;
            }
            if (interfaceC1695 == null) {
                return;
            }
            interfaceC1695.mo3087(fArr);
        }
    }
}
