package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import p000.C0668Pg;
import p000.ChoreographerFrameCallbackC0648P2;
import p000.InterfaceC2327ol;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC2327ol {
    public ProfileInstallerInitializer() {
    }

    @Override // p000.InterfaceC2327ol
    /* JADX INFO: renamed from: a */
    public final List mo2164a() {
        return Collections.EMPTY_LIST;
    }

    @Override // p000.InterfaceC2327ol
    /* JADX INFO: renamed from: b */
    public final Object mo2165b(Context r3) {
        Context r32 = r3.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new ChoreographerFrameCallbackC0648P2(this, r32));
        return new C0668Pg(27);
    }
}
