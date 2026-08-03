package p050c0;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.concurrent.atomic.AtomicBoolean;
import p031Q0.AbstractC0307g;
import p083u.AbstractC1083b;

/* JADX INFO: renamed from: c0.z0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0714z0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2246a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2247b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2248c;

    public /* synthetic */ RunnableC0714z0(Object r1, int r2, int r3) {
        this.f2246a = r3;
        this.f2248c = r1;
        this.f2247b = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r02 = this.f2247b;
        Object r1 = this.f2248c;
        switch(this.f2246a) {
            case 0: goto L12;
            case 1: goto L10;
            case 2: goto L8;
            default: goto L4;
        };
    L4:
        SideSheetBehavior r12 = (SideSheetBehavior) r1;
        View r2 = (View) r12.f2424p.get();
        if (r2 == null) goto L14;
        r12.m1884t(r2, r02, false);
        return;
    L14:
        return;
    L8:
        ((AbstractC1083b) r1).mo2163f(r02);
        return;
    L10:
        TextView r13 = (TextView) r1;
        AbstractC0307g.m703e(r13, "$nickname");
        AtomicBoolean r22 = AbstractC0610N0.f1874a;
        AbstractC0610N0.m1496a(r13, r02);
        return;
    L12:
        View r14 = (View) r1;
        AbstractC0307g.m703e(r14, "$v");
        r14.setVisibility(r02);
    }
}
