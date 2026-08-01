package androidx.compose.foundation.text.input.internal;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.recyclerview.widget.AbstractC2484;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.AbstractC3056;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;
import p007.C6132;
import p007.RunnableC6147;
import p161.AbstractC7641;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0876 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f2460;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2461;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2462;

    public /* synthetic */ RunnableC0876(Object obj, int i, int i2) {
        this.f2462 = i2;
        this.f2461 = obj;
        this.f2460 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        int i = this.f2462;
        int i2 = this.f2460;
        Object obj = this.f2461;
        switch (i) {
            case 0:
                ((IntConsumer) obj).accept(i2);
                break;
            case 1:
                int[] iArr = MaterialButton.f10086;
                ((MaterialButton) obj).setIconSize(i2);
                break;
            case 2:
                AbstractC2484 abstractC2484M4706 = ((RecyclerView) obj).m4706(i2);
                if (abstractC2484M4706 != null && (view = abstractC2484M4706.itemView) != null) {
                    C6132.f16715.getClass();
                    AbstractC3056.m6668(-3937687825932354983L);
                    view.clearAnimation();
                    view.animate().cancel();
                    view.post(new RunnableC6147(view, new ColorDrawable(-14235942), view.getBackground(), 1));
                    break;
                }
                break;
            case 3:
                ((AbstractC7641) obj).mo734(i2);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                WeakReference weakReference = sideSheetBehavior.f10559;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null) {
                    sideSheetBehavior.m7201(view2, i2, false);
                }
                break;
        }
    }
}
