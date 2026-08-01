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
    public final /* synthetic */ int f5341a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f5342b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f5343c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f5344d;

    public RunnableC0917y4(TextView textView, Typeface typeface, int i) {
        this.f5343c = textView;
        this.f5344d = typeface;
        this.f5342b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5341a) {
            case Base64.DEFAULT /* 0 */:
                ((TextView) this.f5343c).setTypeface((Typeface) this.f5344d, this.f5342b);
                break;
            default:
                ((BottomSheetBehavior) this.f5344d).m677E(this.f5343c, this.f5342b, false);
                break;
        }
    }

    public RunnableC0917y4(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f5344d = bottomSheetBehavior;
        this.f5343c = view;
        this.f5342b = i;
    }
}
