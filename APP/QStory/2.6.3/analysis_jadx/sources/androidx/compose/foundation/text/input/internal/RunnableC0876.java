package androidx.compose.foundation.text.input.internal;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.recyclerview.widget.AbstractC2484;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;
import p009.C6170;
import p009.RunnableC6173;
import p161.AbstractC7642;
import p287.AbstractC8405;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0876 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f2461;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2462;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2463;

    public /* synthetic */ RunnableC0876(Object obj, int i, int i2) {
        this.f2463 = i2;
        this.f2462 = obj;
        this.f2461 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        int i = this.f2463;
        int i2 = this.f2461;
        Object obj = this.f2462;
        switch (i) {
            case 0:
                ((IntConsumer) obj).accept(i2);
                break;
            case 1:
                int[] iArr = MaterialButton.f10091;
                ((MaterialButton) obj).setIconSize(i2);
                break;
            case 2:
                AbstractC2484 abstractC2484M4716 = ((RecyclerView) obj).m4716(i2);
                if (abstractC2484M4716 != null && (view = abstractC2484M4716.itemView) != null) {
                    C6170.f16967.getClass();
                    AbstractC8405.m13973("喵呜喵喵呜呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵呜呜喵~喵呜喵呜喵喵呜喵");
                    view.clearAnimation();
                    view.animate().cancel();
                    view.post(new RunnableC6173(view, new ColorDrawable(-14235942), view.getBackground(), 1));
                    break;
                }
                break;
            case 3:
                ((AbstractC7642) obj).mo735(i2);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                WeakReference weakReference = sideSheetBehavior.f10564;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null) {
                    sideSheetBehavior.m7188(view2, i2, false);
                }
                break;
        }
    }
}
