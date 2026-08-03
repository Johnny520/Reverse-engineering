package p000;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: h4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1482h4 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5232a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f5233b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f5234c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f5235d;

    public RunnableC1482h4(TextView textView, Typeface typeface, int i) {
        this.f5234c = textView;
        this.f5235d = typeface;
        this.f5233b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5232a) {
            case 0:
                ((TextView) this.f5234c).setTypeface((Typeface) this.f5235d, this.f5233b);
                break;
            default:
                ((BottomSheetBehavior) this.f5235d).m2433E(this.f5234c, this.f5233b, false);
                break;
        }
    }

    public RunnableC1482h4(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f5235d = bottomSheetBehavior;
        this.f5234c = view;
        this.f5233b = i;
    }
}
