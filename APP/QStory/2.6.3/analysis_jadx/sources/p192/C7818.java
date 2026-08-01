package p192;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.C0157;
import androidx.core.view.C2282;
import androidx.core.view.InterfaceC2283;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7818 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f21333;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC2283 f21334;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Interpolator f21335;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f21336 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C0157 f21332 = new C0157(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f21337 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13180() {
        View view;
        if (this.f21333) {
            return;
        }
        for (C2282 c2282 : this.f21337) {
            long j = this.f21336;
            if (j >= 0) {
                c2282.m4270(j);
            }
            Interpolator interpolator = this.f21335;
            if (interpolator != null && (view = (View) c2282.f6630.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f21334 != null) {
                c2282.m4269(this.f21332);
            }
            View view2 = (View) c2282.f6630.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f21333 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13181() {
        if (this.f21333) {
            Iterator it = this.f21337.iterator();
            while (it.hasNext()) {
                ((C2282) it.next()).m4271();
            }
            this.f21333 = false;
        }
    }
}
