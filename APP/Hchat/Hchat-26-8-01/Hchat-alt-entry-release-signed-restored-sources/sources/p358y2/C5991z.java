package p358y2;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;

/* JADX INFO: renamed from: y2.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5991z extends C5990y {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p358y2.C5963a0
    /* JADX INFO: renamed from: a */
    public final void mo10710a(View view, Rect rect) {
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        rect.set(((WindowManager) systemService).getCurrentWindowMetrics().getBounds());
    }
}
