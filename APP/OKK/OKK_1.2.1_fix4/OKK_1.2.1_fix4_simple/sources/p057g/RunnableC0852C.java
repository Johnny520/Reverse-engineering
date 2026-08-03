package p057g;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: g.C */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0852C implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3080a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3081b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f3082c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f3083d;

    public RunnableC0852C(TextView r2, Typeface r3, int r4) {
        this.f3080a = 0;
        this.f3082c = r2;
        this.f3083d = r3;
        this.f3081b = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f3080a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((BottomSheetBehavior) this.f3083d).m1838E(this.f3082c, this.f3081b, false);
        return;
    L6:
        Typeface r02 = (Typeface) this.f3083d;
        int r1 = this.f3081b;
        ((TextView) this.f3082c).setTypeface(r02, r1);
    }

    public RunnableC0852C(BottomSheetBehavior r2, View r3, int r4) {
        this.f3080a = 1;
        this.f3083d = r2;
        this.f3082c = r3;
        this.f3081b = r4;
    }
}
