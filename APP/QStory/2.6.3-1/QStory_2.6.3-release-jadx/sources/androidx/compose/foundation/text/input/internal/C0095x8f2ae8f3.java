package androidx.compose.foundation.text.input.internal;

import androidx.compose.p001ui.graphics.C2422;
import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.runtime.AbstractC2182;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5214;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
public final /* synthetic */ class C0095x8f2ae8f3 extends FunctionReferenceImpl implements InterfaceC7387 {
    final /* synthetic */ InterfaceC1691 $node;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0095x8f2ae8f3(InterfaceC1691 interfaceC1691) {
        super(1, AbstractC5214.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.$node = interfaceC1691;
    }

    @Override // p068.InterfaceC7387
    public /* synthetic */ Object invoke(Object obj) {
        m2212invoke58bKbWc(((C2422) obj).f5019);
        return C6008.f15084;
    }

    /* JADX INFO: renamed from: invoke-58bKbWc, reason: not valid java name */
    public final void m2212invoke58bKbWc(float[] fArr) {
        InterfaceC2530 interfaceC2530 = (InterfaceC2530) ((AbstractC2182) ((C1703) this.$node).f2767).getValue();
        if (interfaceC2530 != null) {
            if (!interfaceC2530.mo3646()) {
                interfaceC2530 = null;
            }
            if (interfaceC2530 == null) {
                return;
            }
            interfaceC2530.mo3647(fArr);
        }
    }
}
