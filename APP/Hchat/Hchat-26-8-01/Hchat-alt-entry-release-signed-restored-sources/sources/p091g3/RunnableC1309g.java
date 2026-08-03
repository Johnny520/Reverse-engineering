package p091g3;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import p154k9.C2374r;

/* JADX INFO: renamed from: g3.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1309g implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4367g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ View f4368h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC1309g(View view, int i9) {
        this.f4367g = i9;
        this.f4368h = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4367g) {
            case 0:
                View view = this.f4368h;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            case 1:
                View view2 = this.f4368h;
                ViewParent parent = view2.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(view2);
                }
                if (C2374r.f7807i.get() == view2) {
                    C2374r.f7807i.clear();
                }
                break;
            default:
                View view3 = this.f4368h;
                view3.setTranslationX(0.0f);
                view3.setAlpha(1.0f);
                break;
        }
    }
}
