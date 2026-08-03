package p057g;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: g.C */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0852C implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3080a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3081b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f3082c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f3083d;

    public RunnableC0852C(TextView textView, Typeface typeface, int i2) {
        this.f3082c = textView;
        this.f3083d = typeface;
        this.f3081b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3080a) {
            case 0:
                ((TextView) this.f3082c).setTypeface((Typeface) this.f3083d, this.f3081b);
                break;
            default:
                ((BottomSheetBehavior) this.f3083d).m1838E(this.f3082c, this.f3081b, false);
                break;
        }
    }

    public RunnableC0852C(BottomSheetBehavior bottomSheetBehavior, View view, int i2) {
        this.f3083d = bottomSheetBehavior;
        this.f3082c = view;
        this.f3081b = i2;
    }
}
