package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: renamed from: Mk */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnLayoutChangeListenerC0543Mk implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1760a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f1761b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewGroup f1762c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ImageView f1763d;

    public /* synthetic */ ViewOnLayoutChangeListenerC0543Mk(ViewGroup r1, ViewGroup r2, ImageView r3, int r4) {
        this.f1760a = r4;
        this.f1761b = r1;
        this.f1762c = r2;
        this.f1763d = r3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
        switch(this.f1760a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        final int r22 = 1;
        final ViewGroup r32 = this.f1761b;
        final ViewGroup r42 = this.f1762c;
        final ImageView r52 = this.f1763d;
        r32.post(new RunnableC0629Ok(r32, r42, r52, r22));
        return;
    L6:
        final int r23 = 0;
        final ViewGroup r33 = this.f1761b;
        final ViewGroup r43 = this.f1762c;
        final ImageView r53 = this.f1763d;
        r33.post(new RunnableC0629Ok(r33, r43, r53, r23));
    }
}
