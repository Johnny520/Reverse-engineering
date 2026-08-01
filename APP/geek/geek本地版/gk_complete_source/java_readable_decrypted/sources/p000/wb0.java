package p000;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.github.megatronking.stringfog.Base64;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class wb0 extends AbstractC0126ct {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4949d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ yb0 f4950e;

    public /* synthetic */ wb0(yb0 yb0Var, int i) {
        this.f4949d = i;
        this.f4950e = yb0Var;
    }

    @Override // p000.ya0
    /* JADX INFO: renamed from: a */
    public final void mo0a() {
        View view;
        int i = this.f4949d;
        yb0 yb0Var = this.f4950e;
        switch (i) {
            case Base64.DEFAULT /* 0 */:
                if (yb0Var.f5317K && (view = yb0Var.f5309C) != null) {
                    view.setTranslationY(0.0f);
                    yb0Var.f5330z.setTranslationY(0.0f);
                }
                yb0Var.f5330z.setVisibility(8);
                yb0Var.f5330z.setTransitioning(false);
                yb0Var.f5321O = null;
                C0138d4 c0138d4 = yb0Var.f5313G;
                if (c0138d4 != null) {
                    c0138d4.m873D(yb0Var.f5312F);
                    yb0Var.f5312F = null;
                    yb0Var.f5313G = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = yb0Var.f5329y;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = ja0.f2600a;
                    w90.m2552c(actionBarOverlayLayout);
                }
                break;
            default:
                yb0Var.f5321O = null;
                yb0Var.f5330z.requestLayout();
                break;
        }
    }
}
