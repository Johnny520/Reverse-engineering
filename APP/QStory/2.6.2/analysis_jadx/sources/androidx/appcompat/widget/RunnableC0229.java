package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0229 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f860;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f861;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ View f862;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f863 = 0;

    public RunnableC0229(TextView textView, Typeface typeface, int i) {
        this.f862 = textView;
        this.f860 = typeface;
        this.f861 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f863;
        int i2 = this.f861;
        View view = this.f862;
        Object obj = this.f860;
        switch (i) {
            case 0:
                ((TextView) view).setTypeface((Typeface) obj, i2);
                break;
            default:
                ((BottomSheetBehavior) obj).m7035(view, i2, false);
                break;
        }
    }

    public RunnableC0229(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f860 = bottomSheetBehavior;
        this.f862 = view;
        this.f861 = i;
    }
}
