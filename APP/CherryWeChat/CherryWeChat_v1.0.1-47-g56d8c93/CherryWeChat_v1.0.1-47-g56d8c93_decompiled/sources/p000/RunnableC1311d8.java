package p000;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: d8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1311d8 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4764a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f4765b;

    public /* synthetic */ RunnableC1311d8(View view, int i) {
        this.f4764a = i;
        this.f4765b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4764a) {
            case 0:
                try {
                    View rootView = this.f4765b.getRootView();
                    ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
                    if (viewGroup != null) {
                        View viewM2810v = C1456gf.m2810v(viewGroup, AbstractC0295Gu.m625r(-257874131417141L));
                        if (viewM2810v != null) {
                            C1456gf.m2807r(viewM2810v);
                            if (viewM2810v instanceof ViewGroup) {
                                C1442g8.f5046b.getClass();
                                C1442g8.m2754g((ViewGroup) viewM2810v);
                            }
                            Object parent = viewM2810v.getParent();
                            View view = parent instanceof View ? (View) parent : null;
                            if (view != null && (view.getBackground() instanceof ColorDrawable)) {
                                view.setBackground(null);
                            }
                        }
                        View viewM2810v2 = C1456gf.m2810v(viewGroup, AbstractC0295Gu.m625r(-258067404945461L));
                        ViewGroup viewGroup2 = viewM2810v2 instanceof ViewGroup ? (ViewGroup) viewM2810v2 : null;
                        if (viewGroup2 != null) {
                            if (viewGroup2.getBackground() instanceof ColorDrawable) {
                                viewGroup2.setBackground(null);
                            }
                            View viewM2788F = C1456gf.m2788F(viewGroup2, 0);
                            if (viewM2788F != null) {
                                C1456gf.m2807r(viewM2788F);
                            }
                            View viewM2810v3 = C1456gf.m2810v(viewGroup2, AbstractC0295Gu.m625r(-256607116064821L));
                            if (viewM2810v3 != null) {
                                C1456gf.m2807r(viewM2810v3);
                            }
                        }
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 1:
                this.f4765b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                break;
            default:
                View view2 = this.f4765b;
                ((InputMethodManager) view2.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view2, 1);
                break;
        }
    }
}
