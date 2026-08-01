package p180m3;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: renamed from: m3.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C4959t implements InterfaceC4956q {
    @Override // p180m3.InterfaceC4956q
    /* JADX INFO: renamed from: a */
    public void mo20043a(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        windowManager.updateViewLayout(view, layoutParams);
    }

    @Override // p180m3.InterfaceC4956q
    /* JADX INFO: renamed from: c */
    public void mo20045c(View view, Rect rect) {
        view.getWindowVisibleDisplayFrame(rect);
    }

    @Override // p180m3.InterfaceC4956q
    /* JADX INFO: renamed from: b */
    public void mo20044b(View view, int i10, int i11) {
    }
}
