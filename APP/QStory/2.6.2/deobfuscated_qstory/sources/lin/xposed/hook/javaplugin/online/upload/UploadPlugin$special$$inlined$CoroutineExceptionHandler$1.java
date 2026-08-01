package lin.xposed.hook.javaplugin.online.upload;

import android.util.Log;
import android.view.View;
import com.bumptech.glide.AbstractC3056;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.InterfaceC3749;
import kotlin.Metadata;
import kotlin.coroutines.AbstractC4358;
import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.C5432;
import kotlinx.coroutines.InterfaceC5403;
import p000.AbstractC6087;
import p257.C8197;
import p257.C8207;
import p257.RunnableC8201;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"lin/xposed/hook/javaplugin/online/upload/UploadPlugin$special$$inlined$CoroutineExceptionHandler$1", "Lkotlin/coroutines/飘花落叶言子楪世苏哲兰;", "Lkotlinx/coroutines/飘花落叶言子世楪苏哲兰;", "Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;", "context", "", "exception", "Lkotlin/飘花落叶言子楪兰苏哲世;", "handleException", "(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class UploadPlugin$special$$inlined$CoroutineExceptionHandler$1 extends AbstractC4358 implements InterfaceC5403 {
    final /* synthetic */ UploadPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadPlugin$special$$inlined$CoroutineExceptionHandler$1(C5432 c5432, UploadPlugin uploadPlugin) {
        super(c5432);
        this.this$0 = uploadPlugin;
    }

    @Override // kotlinx.coroutines.InterfaceC5403
    public void handleException(InterfaceC4359 context, final Throwable exception) {
        final UploadPlugin uploadPlugin = this.this$0;
        AbstractC6087.m11424(new Runnable() { // from class: lin.xposed.hook.javaplugin.online.upload.UploadPlugin$exceptionHandler$1$1
            @Override // java.lang.Runnable
            public final void run() {
                C8197 c8197 = uploadPlugin.waitDialog;
                c8197.f11579 = false;
                AbstractC3737.m8043(new RunnableC8201(c8197, 2));
                C8207.m13712(Log.getStackTraceString(exception), "\u4e0a\u4f20\u5931\u8d25").mo13702("\u786e\u5b9a", new InterfaceC3749() { // from class: lin.xposed.hook.javaplugin.online.upload.UploadPlugin$exceptionHandler$1$1.1
                    @Override // com.kongzue.dialogx.interfaces.InterfaceC3749
                    public final boolean onClick(C8207 c8207, View view) {
                        return false;
                    }
                });
            }
        });
        Log.e(this.this$0.TAG, "exceptionHandler", exception);
    }
}
