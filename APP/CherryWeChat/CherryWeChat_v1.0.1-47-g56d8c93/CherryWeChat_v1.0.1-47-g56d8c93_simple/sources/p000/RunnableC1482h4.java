package p000;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: h4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1482h4 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5232a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f5233b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f5234c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f5235d;

    public RunnableC1482h4(TextView r2, Typeface r3, int r4) {
        this.f5232a = 0;
        this.f5234c = r2;
        this.f5235d = r3;
        this.f5233b = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f5232a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        BottomSheetBehavior r0 = (BottomSheetBehavior) this.f5235d;
        int r1 = this.f5233b;
        r0.m2433E(this.f5234c, r1, false);
        return;
    L6:
        ((TextView) this.f5234c).setTypeface((Typeface) this.f5235d, this.f5233b);
    }

    public RunnableC1482h4(BottomSheetBehavior r2, View r3, int r4) {
        this.f5232a = 1;
        this.f5235d = r2;
        this.f5234c = r3;
        this.f5233b = r4;
    }
}
