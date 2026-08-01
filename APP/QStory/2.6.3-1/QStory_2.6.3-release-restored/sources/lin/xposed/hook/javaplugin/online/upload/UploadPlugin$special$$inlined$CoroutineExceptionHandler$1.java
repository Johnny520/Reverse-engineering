package lin.xposed.hook.javaplugin.online.upload;

import android.util.Log;
import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.InterfaceC4582;
import io.ktor.client.plugins.AbstractC4765;
import kotlin.Metadata;
import kotlin.coroutines.AbstractC5191;
import kotlin.coroutines.InterfaceC5192;
import kotlinx.coroutines.C6265;
import kotlinx.coroutines.InterfaceC6236;
import p273.C9027;
import p273.C9037;
import p273.RunnableC9031;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m151d2 = {"lin/xposed/hook/javaplugin/online/upload/UploadPlugin$special$$inlined$CoroutineExceptionHandler$1", "Lkotlin/coroutines/飘花落叶言子楪世苏哲兰;", "Lkotlinx/coroutines/飘花落叶言子世楪苏哲兰;", "Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;", "context", "", "exception", "Lkotlin/飘花落叶言子楪兰苏哲世;", "handleException", "(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class UploadPlugin$special$$inlined$CoroutineExceptionHandler$1 extends AbstractC5191 implements InterfaceC6236 {
    final /* synthetic */ UploadPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadPlugin$special$$inlined$CoroutineExceptionHandler$1(C6265 c6265, UploadPlugin uploadPlugin) {
        super(c6265);
        this.this$0 = uploadPlugin;
    }

    @Override // kotlinx.coroutines.InterfaceC6236
    public void handleException(InterfaceC5192 context, final Throwable exception) {
        final UploadPlugin uploadPlugin = this.this$0;
        AbstractC4765.m8860(new Runnable() { // from class: lin.xposed.hook.javaplugin.online.upload.UploadPlugin$exceptionHandler$1$1
            @Override // java.lang.Runnable
            public final void run() {
                C9027 c9027 = uploadPlugin.waitDialog;
                c9027.f11929 = false;
                AbstractC4570.m8589(new RunnableC9031(c9027, 2));
                C9037.m14288(Log.getStackTraceString(exception), "上传失败").mo14278("确定", new InterfaceC4582() { // from class: lin.xposed.hook.javaplugin.online.upload.UploadPlugin$exceptionHandler$1$1.1
                    @Override // com.kongzue.dialogx.interfaces.InterfaceC4582
                    public final boolean onClick(C9037 c9037, View view) {
                        return false;
                    }
                });
            }
        });
        Log.e(this.this$0.TAG, "exceptionHandler", exception);
    }
}
