package p192;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.C0157;
import androidx.core.view.C2282;
import androidx.core.view.InterfaceC2283;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7817 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f21336;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC2283 f21337;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Interpolator f21338;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f21339 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C0157 f21335 = new C0157(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f21340 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13152() {
        View view;
        if (this.f21336) {
            return;
        }
        for (C2282 c2282 : this.f21340) {
            long j = this.f21339;
            if (j >= 0) {
                c2282.m4260(j);
            }
            Interpolator interpolator = this.f21338;
            if (interpolator != null && (view = (View) c2282.f6629.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f21337 != null) {
                c2282.m4259(this.f21335);
            }
            View view2 = (View) c2282.f6629.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f21336 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13153() {
        if (this.f21336) {
            Iterator it = this.f21340.iterator();
            while (it.hasNext()) {
                ((C2282) it.next()).m4261();
            }
            this.f21336 = false;
        }
    }
}
