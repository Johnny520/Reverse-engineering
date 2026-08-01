package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import io.ktor.client.plugins.api.C3886;
import java.util.Collections;
import java.util.List;
import p133.InterfaceC7506;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC7506 {
    @Override // p133.InterfaceC7506
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo4324(Context context) {
        Choreographer.getInstance().postFrameCallback(new ChoreographerFrameCallbackC2446(this, context.getApplicationContext()));
        return new C3886(12);
    }

    @Override // p133.InterfaceC7506
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo4325() {
        return Collections.EMPTY_LIST;
    }
}
