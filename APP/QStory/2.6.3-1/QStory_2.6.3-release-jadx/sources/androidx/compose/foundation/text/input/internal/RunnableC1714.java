package androidx.compose.foundation.text.input.internal;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.recyclerview.widget.AbstractC3317;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;
import p025.C6999;
import p025.RunnableC7002;
import p177.AbstractC8471;
import p303.AbstractC9234;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1714 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f2806;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2807;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2808;

    public /* synthetic */ RunnableC1714(Object obj, int i, int i2) {
        this.f2808 = i2;
        this.f2807 = obj;
        this.f2806 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        int i = this.f2808;
        int i2 = this.f2806;
        Object obj = this.f2807;
        switch (i) {
            case 0:
                ((IntConsumer) obj).accept(i2);
                break;
            case 1:
                int[] iArr = MaterialButton.f10436;
                ((MaterialButton) obj).setIconSize(i2);
                break;
            case 2:
                AbstractC3317 abstractC3317M5276 = ((RecyclerView) obj).m5276(i2);
                if (abstractC3317M5276 != null && (view = abstractC3317M5276.itemView) != null) {
                    C6999.f17312.getClass();
                    AbstractC9234.m14532("喵呜喵喵呜呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵呜呜喵~喵呜喵呜喵喵呜喵");
                    view.clearAnimation();
                    view.animate().cancel();
                    view.post(new RunnableC7002(view, new ColorDrawable(-14235942), view.getBackground(), 1));
                    break;
                }
                break;
            case 3:
                ((AbstractC8471) obj).mo1295(i2);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                WeakReference weakReference = sideSheetBehavior.f10909;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null) {
                    sideSheetBehavior.m7747(view2, i2, false);
                }
                break;
        }
    }
}
