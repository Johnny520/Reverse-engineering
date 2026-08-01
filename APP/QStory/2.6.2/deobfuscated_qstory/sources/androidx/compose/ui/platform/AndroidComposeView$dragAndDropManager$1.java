package androidx.compose.ui.platform;

import android.content.res.Resources;
import androidx.compose.ui.draganddrop.AbstractC1433;
import androidx.compose.ui.draganddrop.C1427;
import com.alibaba.fastjson2.C2941;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6550;
import p052.InterfaceC6557;
import p112.C7325;
import p205.C7894;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class AndroidComposeView$dragAndDropManager$1 extends FunctionReferenceImpl implements InterfaceC6550 {
    public AndroidComposeView$dragAndDropManager$1(Object obj) {
        super(3, obj, ViewTreeObserverOnGlobalLayoutListenerC1884.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
    }

    @Override // p052.InterfaceC6550
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (obj == null) {
            return m3420invoke12SF9DM(null, ((C7325) obj2).f19532, (InterfaceC6557) obj3);
        }
        C2941.m6336();
        return null;
    }

    /* JADX INFO: renamed from: invoke-12SF9DM, reason: not valid java name */
    public final Boolean m3420invoke12SF9DM(AbstractC1433 abstractC1433, long j, InterfaceC6557 interfaceC6557) {
        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = (ViewTreeObserverOnGlobalLayoutListenerC1884) this.receiver;
        Class cls = ViewTreeObserverOnGlobalLayoutListenerC1884.f5413;
        Resources resources = viewTreeObserverOnGlobalLayoutListenerC1884.getContext().getResources();
        return Boolean.valueOf(C1829.f5320.m3452(viewTreeObserverOnGlobalLayoutListenerC1884, abstractC1433, new C1427(new C7894(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j, interfaceC6557)));
    }
}
