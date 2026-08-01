package p000;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.github.megatronking.stringfog.Base64;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: y4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0917y4 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5268a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f5269b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f5270c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f5271d;

    public RunnableC0917y4(TextView textView, Typeface typeface, int i) {
        this.f5270c = textView;
        this.f5271d = typeface;
        this.f5269b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5268a) {
            case Base64.DEFAULT /* 0 */:
                ((TextView) this.f5270c).setTypeface((Typeface) this.f5271d, this.f5269b);
                break;
            default:
                ((BottomSheetBehavior) this.f5271d).m719E(this.f5270c, this.f5269b, false);
                break;
        }
    }

    public RunnableC0917y4(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f5271d = bottomSheetBehavior;
        this.f5270c = view;
        this.f5269b = i;
    }
}
