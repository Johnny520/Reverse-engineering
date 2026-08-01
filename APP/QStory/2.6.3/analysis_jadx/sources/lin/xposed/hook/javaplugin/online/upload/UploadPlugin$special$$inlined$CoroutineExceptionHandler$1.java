package lin.xposed.hook.javaplugin.online.upload;

import android.util.Log;
import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.InterfaceC3750;
import io.ktor.client.plugins.AbstractC3933;
import kotlin.Metadata;
import kotlin.coroutines.AbstractC4359;
import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.C5433;
import kotlinx.coroutines.InterfaceC5404;
import p257.C8198;
import p257.C8208;
import p257.RunnableC8202;
import p287.AbstractC8405;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"lin/xposed/hook/javaplugin/online/upload/UploadPlugin$special$$inlined$CoroutineExceptionHandler$1", "Lkotlin/coroutines/飘花落叶言子楪世苏哲兰;", "Lkotlinx/coroutines/飘花落叶言子世楪苏哲兰;", "Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;", "context", "", "exception", "Lkotlin/飘花落叶言子楪兰苏哲世;", "handleException", "(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class UploadPlugin$special$$inlined$CoroutineExceptionHandler$1 extends AbstractC4359 implements InterfaceC5404 {
    final /* synthetic */ UploadPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadPlugin$special$$inlined$CoroutineExceptionHandler$1(C5433 c5433, UploadPlugin uploadPlugin) {
        super(c5433);
        this.this$0 = uploadPlugin;
    }

    @Override // kotlinx.coroutines.InterfaceC5404
    public void handleException(InterfaceC4360 context, final Throwable exception) {
        final UploadPlugin uploadPlugin = this.this$0;
        AbstractC3933.m8301(new Runnable() { // from class: lin.xposed.hook.javaplugin.online.upload.UploadPlugin$exceptionHandler$1$1
            @Override // java.lang.Runnable
            public final void run() {
                C8198 c8198 = uploadPlugin.waitDialog;
                c8198.f11584 = false;
                AbstractC3738.m8030(new RunnableC8202(c8198, 2));
                C8208.m13729(Log.getStackTraceString(exception), AbstractC8405.m13972(1258)).mo13719(AbstractC8405.m13973("呜喵喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜喵喵喵呜呜喵呜~呜呜喵喵呜喵呜呜~呜呜呜呜喵呜呜喵"), new InterfaceC3750() { // from class: lin.xposed.hook.javaplugin.online.upload.UploadPlugin$exceptionHandler$1$1.1
                    @Override // com.kongzue.dialogx.interfaces.InterfaceC3750
                    public final boolean onClick(C8208 c8208, View view) {
                        return false;
                    }
                });
            }
        });
        Log.e(this.this$0.TAG, AbstractC8405.m13972(1259), exception);
    }
}
