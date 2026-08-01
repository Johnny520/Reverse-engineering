package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.provider.AbstractC1673;
import androidx.compose.foundation.text.contextmenu.provider.InterfaceC1674;
import androidx.compose.p001ui.node.AbstractC2620;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.AbstractC6231;
import p068.InterfaceC7387;
import p128.C8158;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final /* synthetic */ class TextContextMenuGestureNode$1$1 extends FunctionReferenceImpl implements InterfaceC7387 {
    public TextContextMenuGestureNode$1$1(Object obj) {
        super(1, obj, C1661.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0);
    }

    @Override // p068.InterfaceC7387
    public /* synthetic */ Object invoke(Object obj) {
        m2197invokek4lQ0M(((C8158) obj).f19886);
        return C6008.f15084;
    }

    /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
    public final void m2197invokek4lQ0M(long j) {
        C1661 c1661 = (C1661) this.receiver;
        c1661.getClass();
        InterfaceC1674 interfaceC1674 = (InterfaceC1674) AbstractC2620.m3916(c1661, AbstractC1673.f2714);
        if (interfaceC1674 == null) {
            return;
        }
        AbstractC6231.m11036(c1661.m4427(), null, null, new TextContextMenuGestureNode$tryShowContextMenu$1(c1661, j, interfaceC1674, new C1662(c1661, j), null), 3);
    }
}
