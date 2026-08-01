package p000;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.github.megatronking.stringfog.Base64;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class bc0 extends AbstractC0387ju {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f716c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ dc0 f717d;

    public /* synthetic */ bc0(dc0 dc0Var, int i) {
        this.f716c = i;
        this.f717d = dc0Var;
    }

    @Override // p000.db0
    /* JADX INFO: renamed from: a */
    public final void mo0a() {
        View view;
        int i = this.f716c;
        dc0 dc0Var = this.f717d;
        switch (i) {
            case Base64.DEFAULT /* 0 */:
                if (dc0Var.f1370J && (view = dc0Var.f1362B) != null) {
                    view.setTranslationY(0.0f);
                    dc0Var.f1383y.setTranslationY(0.0f);
                }
                dc0Var.f1383y.setVisibility(8);
                dc0Var.f1383y.setTransitioning(false);
                dc0Var.f1374N = null;
                C0138d4 c0138d4 = dc0Var.f1366F;
                if (c0138d4 != null) {
                    c0138d4.m832D(dc0Var.f1365E);
                    dc0Var.f1365E = null;
                    dc0Var.f1366F = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = dc0Var.f1382x;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = oa0.f3426a;
                    ba0.m506c(actionBarOverlayLayout);
                }
                break;
            default:
                dc0Var.f1374N = null;
                dc0Var.f1383y.requestLayout();
                break;
        }
    }
}
