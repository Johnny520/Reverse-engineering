package yyds;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: yyds.ᛷᛵᛶᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1559 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f7954;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f7955;

    public /* synthetic */ C1559(int i, Object obj) {
        this.f7954 = i;
        this.f7955 = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i = this.f7954;
        Object obj = this.f7955;
        switch (i) {
            case 0:
                int width = view.getWidth();
                float height = view.getHeight();
                float f = ((C2457) obj).f12138.f3529;
                outline.setRoundRect(0, 0, width, (int) (height + f), f);
                break;
            case 1:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((C1188) ((C2283) obj).f11233).f5453);
                break;
            default:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((C2458) obj).f12153.f8267);
                break;
        }
    }
}
