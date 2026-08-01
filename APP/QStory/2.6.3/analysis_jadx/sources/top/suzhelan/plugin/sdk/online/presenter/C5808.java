package top.suzhelan.plugin.sdk.online.presenter;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.kongzue.dialogx.interfaces.RunnableC3742;
import kotlin.coroutines.AbstractC4359;
import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.C5433;
import kotlinx.coroutines.InterfaceC5404;
import top.suzhelan.qstory.hook.item.C5954;
import top.suzhelan.sticker.sdk.presenter.C5985;

/* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5808 extends AbstractC4359 implements InterfaceC5404 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f15928;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15929 = 2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5808(C5807 c5807) {
        super(C5433.f15082);
        this.f15928 = c5807;
    }

    @Override // kotlinx.coroutines.InterfaceC5404
    public final void handleException(InterfaceC4360 interfaceC4360, Throwable th) {
        int i = this.f15929;
        Object obj = this.f15928;
        switch (i) {
            case 0:
                C5807 c5807 = (C5807) obj;
                if (!c5807.f15926) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC3742(5, c5807, th, false));
                    Log.e("CommentPresenter", "exceptionHandler", th);
                }
                break;
            case 1:
                C5806 c5806 = (C5806) obj;
                if (!c5806.f15922) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC3742(6, c5806, th, false));
                    Log.e("MessagePresenter", "Error in MessagePresenter", th);
                }
                break;
            case 2:
                C5805 c5805 = (C5805) obj;
                if (!c5805.f15919) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC3742(7, c5805, th, false));
                    Log.e("PluginPresenter", "exceptionHandler", th);
                    break;
                }
                break;
            case 3:
                ((C5954) obj).getExceptionCollectionToolInstance().m11832(th);
                break;
            default:
                C5985 c5985 = (C5985) obj;
                if (!c5985.f16304) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC3742(8, c5985, th, false));
                    Log.e("StickerPresenter", "exceptionHandler", th);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5808(C5806 c5806) {
        super(C5433.f15082);
        this.f15928 = c5806;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5808(C5805 c5805) {
        super(C5433.f15082);
        this.f15928 = c5805;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5808(C5985 c5985) {
        super(C5433.f15082);
        this.f15928 = c5985;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5808(C5954 c5954) {
        super(C5433.f15082);
        this.f15928 = c5954;
    }
}
