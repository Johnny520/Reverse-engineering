package top.suzhelan.plugin.sdk.online.presenter;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.kongzue.dialogx.interfaces.RunnableC4574;
import kotlin.coroutines.AbstractC5191;
import kotlin.coroutines.InterfaceC5192;
import kotlinx.coroutines.C6265;
import kotlinx.coroutines.InterfaceC6236;
import top.suzhelan.qstory.hook.item.C6784;
import top.suzhelan.sticker.sdk.presenter.C6815;

/* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6638 extends AbstractC5191 implements InterfaceC6236 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16273;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16274 = 2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6638(C6637 c6637) {
        super(C6265.f15427);
        this.f16273 = c6637;
    }

    @Override // kotlinx.coroutines.InterfaceC6236
    public final void handleException(InterfaceC5192 interfaceC5192, Throwable th) {
        int i = this.f16274;
        Object obj = this.f16273;
        switch (i) {
            case 0:
                C6637 c6637 = (C6637) obj;
                if (!c6637.f16271) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC4574(5, c6637, th, false));
                    Log.e("CommentPresenter", "exceptionHandler", th);
                }
                break;
            case 1:
                C6636 c6636 = (C6636) obj;
                if (!c6636.f16267) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC4574(6, c6636, th, false));
                    Log.e("MessagePresenter", "Error in MessagePresenter", th);
                }
                break;
            case 2:
                C6635 c6635 = (C6635) obj;
                if (!c6635.f16264) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC4574(7, c6635, th, false));
                    Log.e("PluginPresenter", "exceptionHandler", th);
                    break;
                }
                break;
            case 3:
                ((C6784) obj).getExceptionCollectionToolInstance().m12391(th);
                break;
            default:
                C6815 c6815 = (C6815) obj;
                if (!c6815.f16649) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC4574(8, c6815, th, false));
                    Log.e("StickerPresenter", "exceptionHandler", th);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6638(C6636 c6636) {
        super(C6265.f15427);
        this.f16273 = c6636;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6638(C6635 c6635) {
        super(C6265.f15427);
        this.f16273 = c6635;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6638(C6815 c6815) {
        super(C6265.f15427);
        this.f16273 = c6815;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6638(C6784 c6784) {
        super(C6265.f15427);
        this.f16273 = c6784;
    }
}
