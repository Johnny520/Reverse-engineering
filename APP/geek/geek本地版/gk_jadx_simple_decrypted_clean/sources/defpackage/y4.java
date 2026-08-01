package defpackage;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class y4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Object d;

    public y4(TextView r2, Typeface r3, int r4) {
        this.a = 0;
        this.c = r2;
        this.d = r3;
        this.b = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        BottomSheetBehavior r0 = (BottomSheetBehavior) this.d;
        int r1 = this.b;
        r0.E(this.c, r1, false);
        return;
    L6:
        ((TextView) this.c).setTypeface((Typeface) this.d, this.b);
    }

    public y4(BottomSheetBehavior r2, View r3, int r4) {
        this.a = 1;
        this.d = r2;
        this.c = r3;
        this.b = r4;
    }
}
