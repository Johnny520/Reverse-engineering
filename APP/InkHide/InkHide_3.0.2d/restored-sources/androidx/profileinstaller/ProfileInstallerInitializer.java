package androidx.profileinstaller;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import p001A0.RunnableC0040m;
import p012G.C0140d;
import p022L.AbstractC0180j;
import p026N.InterfaceC0216b;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0216b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p026N.InterfaceC0216b
    /* JADX INFO: renamed from: a */
    public final List mo409a() {
        return Collections.EMPTY_LIST;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p026N.InterfaceC0216b
    /* JADX INFO: renamed from: b */
    public final Object mo410b(Context context) {
        AbstractC0180j.m383a(new RunnableC0040m(this, context.getApplicationContext(), 2));
        return new C0140d(6);
    }
}
