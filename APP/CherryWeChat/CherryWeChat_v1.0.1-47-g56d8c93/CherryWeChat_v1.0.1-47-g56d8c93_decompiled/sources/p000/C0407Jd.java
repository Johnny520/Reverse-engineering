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

    public C0407Jd(DialogInterfaceOnCancelListenerC0450Kd dialogInterfaceOnCancelListenerC0450Kd, C1371ei c1371ei) {
        this.f1370m = dialogInterfaceOnCancelListenerC0450Kd;
        this.f1369l = c1371ei;
    }

    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: y */
    public final View mo852y(int i) {
        C1371ei c1371ei = this.f1369l;
        if (c1371ei.mo853z()) {
            return c1371ei.mo852y(i);
        }
        Dialog dialog = this.f1370m.f1479c0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: z */
    public final boolean mo853z() {
        return this.f1369l.mo853z() || this.f1370m.f1482f0;
    }
}
