package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import p162l3.C2469w;
import p190n2.ChoreographerFrameCallbackC2889x;
import p341x3.InterfaceC5689b;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC5689b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p341x3.InterfaceC5689b
    /* JADX INFO: renamed from: a */
    public final List mo506a() {
        return Collections.EMPTY_LIST;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p341x3.InterfaceC5689b
    /* JADX INFO: renamed from: b */
    public final Object mo507b(Context context) {
        Choreographer.getInstance().postFrameCallback(new ChoreographerFrameCallbackC2889x(this, context.getApplicationContext()));
        return new C2469w(26);
    }
}
