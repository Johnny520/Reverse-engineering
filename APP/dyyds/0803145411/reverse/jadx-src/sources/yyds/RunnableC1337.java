package yyds;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: yyds.ᛶᛵᛸᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1337 implements Runnable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f6188;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ ActionBarOverlayLayout f6189;

    public /* synthetic */ RunnableC1337(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f6188 = i;
        this.f6189 = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6188;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f6189;
        switch (i) {
            case 0:
                actionBarOverlayLayout.m42();
                actionBarOverlayLayout.f132 = actionBarOverlayLayout.f130.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f117);
                break;
            default:
                actionBarOverlayLayout.m42();
                actionBarOverlayLayout.f132 = actionBarOverlayLayout.f130.animate().translationY(-actionBarOverlayLayout.f130.getHeight()).setListener(actionBarOverlayLayout.f117);
                break;
        }
    }
}
