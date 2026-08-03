package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: al */
/* JADX INFO: loaded from: classes.dex */
public final class C1146al extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3638a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f3639b;

    public /* synthetic */ C1146al(View r1, int r2) {
        this.f3638a = r2;
        this.f3639b = r1;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View r13, Outline r14) {
        switch(this.f3638a) {
            case 0: goto L11;
            case 1: goto L9;
            default: goto L4;
        };
    L4:
        C2309o9 r132 = ((Chip) this.f3639b).f4511e;
        if (r132 == null) goto L7;
        r132.getOutline(r14);
        return;
    L7:
        r14.setAlpha(0.0f);
        return;
    L9:
        ImageFilterView r133 = (ImageFilterView) this.f3639b;
        r14.setRoundRect(0, 0, r133.getWidth(), r133.getHeight(), r133.f3860j);
        return;
    L11:
        ImageFilterView r134 = (ImageFilterView) this.f3639b;
        r14.setRoundRect(0, 0, r134.getWidth(), r134.getHeight(), (Math.min(r9, r10) * r134.f3859i) / 2.0f);
    }
}
