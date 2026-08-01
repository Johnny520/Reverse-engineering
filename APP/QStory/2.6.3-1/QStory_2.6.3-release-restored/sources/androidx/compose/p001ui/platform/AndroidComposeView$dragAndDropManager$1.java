package androidx.compose.p001ui.platform;

import android.content.res.Resources;
import androidx.compose.p001ui.draganddrop.AbstractC2268;
import androidx.compose.p001ui.draganddrop.C2262;
import com.alibaba.fastjson2.C3775;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p068.InterfaceC7380;
import p068.InterfaceC7387;
import p128.C8155;
import p221.C8724;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final /* synthetic */ class AndroidComposeView$dragAndDropManager$1 extends FunctionReferenceImpl implements InterfaceC7380 {
    public AndroidComposeView$dragAndDropManager$1(Object obj) {
        super(3, obj, ViewTreeObserverOnGlobalLayoutListenerC2719.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
    }

    @Override // p068.InterfaceC7380
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (obj == null) {
            return m3990invoke12SF9DM(null, ((C8155) obj2).f19872, (InterfaceC7387) obj3);
        }
        C3775.m6954();
        return null;
    }

    /* JADX INFO: renamed from: invoke-12SF9DM, reason: not valid java name */
    public final Boolean m3990invoke12SF9DM(AbstractC2268 abstractC2268, long j, InterfaceC7387 interfaceC7387) {
        ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = (ViewTreeObserverOnGlobalLayoutListenerC2719) this.receiver;
        Class cls = ViewTreeObserverOnGlobalLayoutListenerC2719.f5759;
        Resources resources = viewTreeObserverOnGlobalLayoutListenerC2719.getContext().getResources();
        return Boolean.valueOf(C2664.f5666.m4022(viewTreeObserverOnGlobalLayoutListenerC2719, abstractC2268, new C2262(new C8724(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j, interfaceC7387)));
    }
}
