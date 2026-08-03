package p000a;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import p000a.C0437Y3;

/* JADX INFO: renamed from: a.t5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0836t5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3306a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f3307b;

    public /* synthetic */ RunnableC0836t5(View view, int i) {
        this.f3306a = i;
        this.f3307b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3306a) {
            case 0:
                this.f3307b.setVisibility(0);
                break;
            case 1:
                View view = this.f3307b;
                Object systemService = view.getContext().getSystemService("input_method");
                C0631i9.m1480c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).showSoftInput(view, 2);
                break;
            case 2:
                View view2 = this.f3307b;
                if (view2.isFocused()) {
                    Object systemService2 = view2.getContext().getSystemService("input_method");
                    C0631i9.m1480c(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    ((InputMethodManager) systemService2).showSoftInput(view2, 2);
                }
                break;
            default:
                View view3 = this.f3307b;
                ((InputMethodManager) C0437Y3.b.m1096b(view3.getContext(), InputMethodManager.class)).showSoftInput(view3, 1);
                break;
        }
    }
}
