package p074o0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: o0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1027c extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Chip f3775a;

    public C1027c(Chip chip) {
        this.f3775a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C1030f c1030f = this.f3775a.f2370e;
        if (c1030f != null) {
            c1030f.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
