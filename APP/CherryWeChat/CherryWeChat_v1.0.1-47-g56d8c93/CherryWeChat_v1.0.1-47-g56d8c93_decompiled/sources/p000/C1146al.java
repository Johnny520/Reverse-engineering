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

    public /* synthetic */ C1146al(View view, int i) {
        this.f3638a = i;
        this.f3639b = view;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f3638a) {
            case 0:
                ImageFilterView imageFilterView = (ImageFilterView) this.f3639b;
                outline.setRoundRect(0, 0, imageFilterView.getWidth(), imageFilterView.getHeight(), (Math.min(r9, r10) * imageFilterView.f3859i) / 2.0f);
                break;
            case 1:
                ImageFilterView imageFilterView2 = (ImageFilterView) this.f3639b;
                outline.setRoundRect(0, 0, imageFilterView2.getWidth(), imageFilterView2.getHeight(), imageFilterView2.f3860j);
                break;
            default:
                C2309o9 c2309o9 = ((Chip) this.f3639b).f4511e;
                if (c2309o9 == null) {
                    outline.setAlpha(0.0f);
                } else {
                    c2309o9.getOutline(outline);
                }
                break;
        }
    }
}
