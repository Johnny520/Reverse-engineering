package androidx.compose.ui.platform;

import android.content.res.Resources;
import androidx.compose.ui.draganddrop.AbstractC1433;
import androidx.compose.ui.draganddrop.C1427;
import com.alibaba.fastjson2.C2942;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6551;
import p052.InterfaceC6558;
import p112.C7326;
import p205.C7895;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class AndroidComposeView$dragAndDropManager$1 extends FunctionReferenceImpl implements InterfaceC6551 {
    public AndroidComposeView$dragAndDropManager$1(Object obj) {
        super(3, obj, ViewTreeObserverOnGlobalLayoutListenerC1884.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
    }

    @Override // p052.InterfaceC6551
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (obj == null) {
            return m3430invoke12SF9DM(null, ((C7326) obj2).f19527, (InterfaceC6558) obj3);
        }
        C2942.m6394();
        return null;
    }

    /* JADX INFO: renamed from: invoke-12SF9DM, reason: not valid java name */
    public final Boolean m3430invoke12SF9DM(AbstractC1433 abstractC1433, long j, InterfaceC6558 interfaceC6558) {
        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = (ViewTreeObserverOnGlobalLayoutListenerC1884) this.receiver;
        Class cls = ViewTreeObserverOnGlobalLayoutListenerC1884.f5414;
        Resources resources = viewTreeObserverOnGlobalLayoutListenerC1884.getContext().getResources();
        return Boolean.valueOf(C1829.f5321.m3462(viewTreeObserverOnGlobalLayoutListenerC1884, abstractC1433, new C1427(new C7895(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j, interfaceC6558)));
    }
}
