package p000;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: renamed from: Jd */
/* JADX INFO: loaded from: classes.dex */
public final class C0407Jd extends AbstractC0828TB {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C1371ei f1369l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0450Kd f1370m;

    public C0407Jd(DialogInterfaceOnCancelListenerC0450Kd r1, C1371ei r2) {
        this.f1370m = r1;
        this.f1369l = r2;
    }

    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: y */
    public final View mo852y(int r3) {
        C1371ei r0 = this.f1369l;
        if (r0.mo853z() == true) goto L5;
        Dialog r02 = this.f1370m.f1479c0;
        if (r02 != null) goto L9;
        return null;
    L9:
        return r02.findViewById(r3);
    L5:
        return r0.mo852y(r3);
    }

    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: z */
    public final boolean mo853z() {
        if (this.f1369l.mo853z() == false) goto L5;
        return true;
    L5:
        if (this.f1370m.f1482f0 == true) goto L11;
        return false;
    L11:
        return true;
    }
}
