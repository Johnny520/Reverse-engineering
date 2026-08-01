package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import io.ktor.client.plugins.api.C3885;
import java.util.Collections;
import java.util.List;
import p133.InterfaceC7505;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC7505 {
    @Override // p133.InterfaceC7505
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo4314(Context context) {
        Choreographer.getInstance().postFrameCallback(new ChoreographerFrameCallbackC2446(this, context.getApplicationContext()));
        return new C3885(12);
    }

    @Override // p133.InterfaceC7505
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo4315() {
        return Collections.EMPTY_LIST;
    }
}
