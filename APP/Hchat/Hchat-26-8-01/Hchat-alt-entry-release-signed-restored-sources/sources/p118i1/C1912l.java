package p118i1;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: i1.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1912l extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6444a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.f6444a) {
            case 0:
                if (!(view instanceof C1913m) || (outline2 = ((C1913m) view).f6450k) == null) {
                    return;
                }
                outline.set(outline2);
                return;
            case 1:
                view.getClass();
                throw new ClassCastException();
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            default:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
        }
    }
}
