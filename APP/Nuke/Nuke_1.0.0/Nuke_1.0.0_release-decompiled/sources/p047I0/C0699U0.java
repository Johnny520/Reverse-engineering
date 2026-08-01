package p047I0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import me.dartcv.nuke.BuildConfig;
import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;
import p228r0.C3039l;

/* JADX INFO: renamed from: I0.U0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0699U0 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2228a;

    public /* synthetic */ C0699U0(int i5) {
        this.f2228a = i5;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.f2228a) {
            case 0:
                AbstractC1665j.m2983c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                AbstractC0231b.m408s(view);
                throw null;
            case BuildConfig.VERSION_CODE /* 1 */:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            default:
                if (!(view instanceof C3039l) || (outline2 = ((C3039l) view).f9716h) == null) {
                    return;
                }
                outline.set(outline2);
                return;
        }
    }
}
