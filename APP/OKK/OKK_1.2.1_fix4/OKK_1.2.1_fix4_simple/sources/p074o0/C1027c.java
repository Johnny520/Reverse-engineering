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

    public C1027c(Chip r1) {
        this.f3775a = r1;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View r1, Outline r2) {
        C1030f r12 = this.f3775a.f2370e;
        if (r12 == null) goto L5;
        r12.getOutline(r2);
        return;
    L5:
        r2.setAlpha(0.0f);
    }
}
