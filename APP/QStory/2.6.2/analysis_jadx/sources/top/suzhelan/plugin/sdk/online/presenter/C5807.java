package top.suzhelan.plugin.sdk.online.presenter;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.kongzue.dialogx.interfaces.RunnableC3741;
import kotlin.coroutines.AbstractC4358;
import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.C5432;
import kotlinx.coroutines.InterfaceC5403;
import top.suzhelan.qstory.hook.item.C5951;
import top.suzhelan.sticker.sdk.presenter.C5979;

/* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5807 extends AbstractC4358 implements InterfaceC5403 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f15928;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15929 = 2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5807(C5806 c5806) {
        super(C5432.f15082);
        this.f15928 = c5806;
    }

    @Override // kotlinx.coroutines.InterfaceC5403
    public final void handleException(InterfaceC4359 interfaceC4359, Throwable th) {
        int i = this.f15929;
        Object obj = this.f15928;
        switch (i) {
            case 0:
                C5806 c5806 = (C5806) obj;
                if (!c5806.f15926) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC3741(5, c5806, th, false));
                    Log.e("CommentPresenter", "exceptionHandler", th);
                }
                break;
            case 1:
                C5805 c5805 = (C5805) obj;
                if (!c5805.f15922) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC3741(6, c5805, th, false));
                    Log.e("MessagePresenter", "Error in MessagePresenter", th);
                }
                break;
            case 2:
                C5804 c5804 = (C5804) obj;
                if (!c5804.f15919) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC3741(7, c5804, th, false));
                    Log.e("PluginPresenter", "exceptionHandler", th);
                    break;
                }
                break;
            case 3:
                ((C5951) obj).getExceptionCollectionToolInstance().m11804(th);
                break;
            default:
                C5979 c5979 = (C5979) obj;
                if (!c5979.f16295) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC3741(8, c5979, th, false));
                    Log.e("StickerPresenter", "exceptionHandler", th);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5807(C5805 c5805) {
        super(C5432.f15082);
        this.f15928 = c5805;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5807(C5804 c5804) {
        super(C5432.f15082);
        this.f15928 = c5804;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5807(C5979 c5979) {
        super(C5432.f15082);
        this.f15928 = c5979;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5807(C5951 c5951) {
        super(C5432.f15082);
        this.f15928 = c5951;
    }
}
