package p208;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.C1004;
import androidx.core.view.C3115;
import androidx.core.view.InterfaceC3116;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8647 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f21678;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC3116 f21679;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Interpolator f21680;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f21681 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C1004 f21677 = new C1004(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f21682 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13739() {
        View view;
        if (this.f21678) {
            return;
        }
        for (C3115 c3115 : this.f21682) {
            long j = this.f21681;
            if (j >= 0) {
                c3115.m4830(j);
            }
            Interpolator interpolator = this.f21680;
            if (interpolator != null && (view = (View) c3115.f6975.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f21679 != null) {
                c3115.m4829(this.f21677);
            }
            View view2 = (View) c3115.f6975.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f21678 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13740() {
        if (this.f21678) {
            Iterator it = this.f21682.iterator();
            while (it.hasNext()) {
                ((C3115) it.next()).m4831();
            }
            this.f21678 = false;
        }
    }
}
