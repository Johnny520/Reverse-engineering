package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import io.ktor.client.plugins.api.C4718;
import java.util.Collections;
import java.util.List;
import p149.InterfaceC8335;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC8335 {
    @Override // p149.InterfaceC8335
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo4884(Context context) {
        Choreographer.getInstance().postFrameCallback(new ChoreographerFrameCallbackC3279(this, context.getApplicationContext()));
        return new C4718(12);
    }

    @Override // p149.InterfaceC8335
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo4885() {
        return Collections.EMPTY_LIST;
    }
}
