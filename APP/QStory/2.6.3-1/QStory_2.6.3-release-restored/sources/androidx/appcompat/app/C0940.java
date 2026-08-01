package androidx.appcompat.app;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.core.view.AbstractC3100;
import androidx.core.view.AbstractC3103;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0940 extends AbstractC3100 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f610;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f611;

    public /* synthetic */ C0940(Object obj, int i) {
        this.f611 = i;
        this.f610 = obj;
    }

    @Override // androidx.core.view.InterfaceC3116
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo884() {
        int i = this.f611;
        Object obj = this.f610;
        switch (i) {
            case 0:
                LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915 = ((RunnableC0942) obj).f621;
                layoutInflaterFactory2C0915.f507.setAlpha(1.0f);
                layoutInflaterFactory2C0915.f508.m4829(null);
                layoutInflaterFactory2C0915.f508 = null;
                break;
            case 1:
                LayoutInflaterFactory2C0915 layoutInflaterFactory2C09152 = (LayoutInflaterFactory2C0915) obj;
                layoutInflaterFactory2C09152.f507.setAlpha(1.0f);
                layoutInflaterFactory2C09152.f508.m4829(null);
                layoutInflaterFactory2C09152.f508 = null;
                break;
            default:
                LayoutInflaterFactory2C0915 layoutInflaterFactory2C09153 = (LayoutInflaterFactory2C0915) ((C0923) obj).f573;
                layoutInflaterFactory2C09153.f507.setVisibility(8);
                PopupWindow popupWindow = layoutInflaterFactory2C09153.f506;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C09153.f507.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C09153.f507.getParent();
                    WeakHashMap weakHashMap = AbstractC3103.f6939;
                    view.requestApplyInsets();
                }
                layoutInflaterFactory2C09153.f507.m1025();
                layoutInflaterFactory2C09153.f508.m4829(null);
                layoutInflaterFactory2C09153.f508 = null;
                ViewGroup viewGroup = layoutInflaterFactory2C09153.f505;
                WeakHashMap weakHashMap2 = AbstractC3103.f6939;
                viewGroup.requestApplyInsets();
                break;
        }
    }

    @Override // androidx.core.view.AbstractC3100, androidx.core.view.InterfaceC3116
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void mo885() {
        int i = this.f611;
        Object obj = this.f610;
        switch (i) {
            case 0:
                ((RunnableC0942) obj).f621.f507.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915 = (LayoutInflaterFactory2C0915) obj;
                layoutInflaterFactory2C0915.f507.setVisibility(0);
                if (layoutInflaterFactory2C0915.f507.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0915.f507.getParent();
                    WeakHashMap weakHashMap = AbstractC3103.f6939;
                    view.requestApplyInsets();
                }
                break;
        }
    }
}
