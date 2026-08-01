package androidx.appcompat.app;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.core.view.AbstractC2267;
import androidx.core.view.AbstractC2270;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0093 extends AbstractC2267 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f265;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f266;

    public /* synthetic */ C0093(Object obj, int i) {
        this.f266 = i;
        this.f265 = obj;
    }

    @Override // androidx.core.view.InterfaceC2283
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo323() {
        int i = this.f266;
        Object obj = this.f265;
        switch (i) {
            case 0:
                LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068 = ((RunnableC0095) obj).f276;
                layoutInflaterFactory2C0068.f162.setAlpha(1.0f);
                layoutInflaterFactory2C0068.f163.m4259(null);
                layoutInflaterFactory2C0068.f163 = null;
                break;
            case 1:
                LayoutInflaterFactory2C0068 layoutInflaterFactory2C00682 = (LayoutInflaterFactory2C0068) obj;
                layoutInflaterFactory2C00682.f162.setAlpha(1.0f);
                layoutInflaterFactory2C00682.f163.m4259(null);
                layoutInflaterFactory2C00682.f163 = null;
                break;
            default:
                LayoutInflaterFactory2C0068 layoutInflaterFactory2C00683 = (LayoutInflaterFactory2C0068) ((C0076) obj).f228;
                layoutInflaterFactory2C00683.f162.setVisibility(8);
                PopupWindow popupWindow = layoutInflaterFactory2C00683.f161;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C00683.f162.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C00683.f162.getParent();
                    WeakHashMap weakHashMap = AbstractC2270.f6593;
                    view.requestApplyInsets();
                }
                layoutInflaterFactory2C00683.f162.m464();
                layoutInflaterFactory2C00683.f163.m4259(null);
                layoutInflaterFactory2C00683.f163 = null;
                ViewGroup viewGroup = layoutInflaterFactory2C00683.f160;
                WeakHashMap weakHashMap2 = AbstractC2270.f6593;
                viewGroup.requestApplyInsets();
                break;
        }
    }

    @Override // androidx.core.view.AbstractC2267, androidx.core.view.InterfaceC2283
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void mo324() {
        int i = this.f266;
        Object obj = this.f265;
        switch (i) {
            case 0:
                ((RunnableC0095) obj).f276.f162.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068 = (LayoutInflaterFactory2C0068) obj;
                layoutInflaterFactory2C0068.f162.setVisibility(0);
                if (layoutInflaterFactory2C0068.f162.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0068.f162.getParent();
                    WeakHashMap weakHashMap = AbstractC2270.f6593;
                    view.requestApplyInsets();
                }
                break;
        }
    }
}
