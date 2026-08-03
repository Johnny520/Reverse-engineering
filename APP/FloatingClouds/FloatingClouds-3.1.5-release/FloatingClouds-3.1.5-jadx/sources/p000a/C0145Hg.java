package p000a;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: a.Hg */
/* JADX INFO: loaded from: classes.dex */
public class C0145Hg<V extends View> extends CoordinatorLayout.AbstractC1059c<V> {

    /* JADX INFO: renamed from: a */
    public C0305Qe f503a;

    /* JADX INFO: renamed from: b */
    public int f504b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0145Hg() {
        this.f504b = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: h */
    public boolean mo371h(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo374u(coordinatorLayout, v, i);
        if (this.f503a == null) {
            C0305Qe c0305Qe = new C0305Qe();
            c0305Qe.f1105d = v;
            this.f503a = c0305Qe;
        }
        C0305Qe c0305Qe2 = this.f503a;
        View view = (View) c0305Qe2.f1105d;
        c0305Qe2.f1102a = view.getTop();
        c0305Qe2.f1103b = view.getLeft();
        this.f503a.m850b();
        int i2 = this.f504b;
        if (i2 == 0) {
            return true;
        }
        C0305Qe c0305Qe3 = this.f503a;
        if (c0305Qe3.f1104c != i2) {
            c0305Qe3.f1104c = i2;
            c0305Qe3.m850b();
        }
        this.f504b = 0;
        return true;
    }

    /* JADX INFO: renamed from: s */
    public final int m372s() {
        C0305Qe c0305Qe = this.f503a;
        if (c0305Qe != null) {
            return c0305Qe.f1104c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: t */
    public int mo373t() {
        return m372s();
    }

    /* JADX INFO: renamed from: u */
    public void mo374u(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.m2448q(v, i);
    }

    public C0145Hg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f504b = 0;
    }
}
