package p006D;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.util.List;
import java.util.Set;
import p009E0.AbstractC0181l;
import p031Q0.AbstractC0307g;
import p050c0.C0595I0;
import p050c0.C0639a0;

/* JADX INFO: renamed from: D.u */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0129u implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f318a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f319b;

    public /* synthetic */ RunnableC0129u(View view, int i2) {
        this.f318a = i2;
        this.f319b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<View> listM553y0;
        switch (this.f318a) {
            case 0:
                View view = this.f319b;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 1:
                View view2 = this.f319b;
                AbstractC0307g.m703e(view2, "$view");
                C0639a0 c0639a0 = C0639a0.f1967a;
                C0639a0.m1581f0(view2);
                return;
            case 2:
                View view3 = this.f319b;
                AbstractC0307g.m703e(view3, "$view");
                C0639a0 c0639a02 = C0639a0.f1967a;
                C0639a0.m1581f0(view3);
                return;
            default:
                View view4 = this.f319b;
                AbstractC0307g.m703e(view4, "$footer");
                C0595I0 c0595i0 = C0595I0.f1818a;
                C0595I0.m1474b(view4);
                EditText editTextM1476d = C0595I0.m1476d(view4);
                if (editTextM1476d != null) {
                    C0595I0.m1473a(editTextM1476d);
                }
                Set set = C0595I0.f1823f;
                synchronized (set) {
                    listM553y0 = AbstractC0181l.m553y0(set);
                }
                for (View view5 : listM553y0) {
                    C0595I0 c0595i02 = C0595I0.f1818a;
                    C0595I0.m1473a(view5);
                }
                return;
        }
    }
}
