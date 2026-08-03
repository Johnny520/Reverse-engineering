package p000a;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.C1281a;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: a.Y2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0436Y2 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Chip f1639a;

    public C0436Y2(Chip chip) {
        this.f1639a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    @TargetApi(21)
    public final void getOutline(View view, Outline outline) {
        C1281a c1281a = this.f1639a.f5596e;
        if (c1281a != null) {
            c1281a.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
