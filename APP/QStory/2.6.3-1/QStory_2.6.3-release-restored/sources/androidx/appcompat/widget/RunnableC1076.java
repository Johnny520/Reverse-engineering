package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1076 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f1205;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f1206;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ View f1207;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1208 = 0;

    public RunnableC1076(TextView textView, Typeface typeface, int i) {
        this.f1207 = textView;
        this.f1205 = typeface;
        this.f1206 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1208;
        int i2 = this.f1206;
        View view = this.f1207;
        Object obj = this.f1205;
        switch (i) {
            case 0:
                ((TextView) view).setTypeface((Typeface) obj, i2);
                break;
            default:
                ((BottomSheetBehavior) obj).m7581(view, i2, false);
                break;
        }
    }

    public RunnableC1076(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f1205 = bottomSheetBehavior;
        this.f1207 = view;
        this.f1206 = i;
    }
}
