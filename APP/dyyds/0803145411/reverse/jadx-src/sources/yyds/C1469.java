package yyds;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛶᲈᲈᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1469 extends AbstractC2408 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f6983;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ Object f6984;

    public /* synthetic */ C1469(int i, Object obj) {
        this.f6983 = i;
        this.f6984 = obj;
    }

    @Override // yyds.InterfaceC1824
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo1183() {
        int i = this.f6983;
        Object obj = this.f6984;
        switch (i) {
            case 0:
                LayoutInflaterFactory2C2181 layoutInflaterFactory2C2181 = ((RunnableC1745) obj).f8802;
                layoutInflaterFactory2C2181.f10695.setAlpha(1.0f);
                layoutInflaterFactory2C2181.f10694.m629(null);
                layoutInflaterFactory2C2181.f10694 = null;
                break;
            case 1:
                LayoutInflaterFactory2C2181 layoutInflaterFactory2C21812 = (LayoutInflaterFactory2C2181) obj;
                layoutInflaterFactory2C21812.f10695.setAlpha(1.0f);
                layoutInflaterFactory2C21812.f10694.m629(null);
                layoutInflaterFactory2C21812.f10694 = null;
                break;
            default:
                LayoutInflaterFactory2C2181 layoutInflaterFactory2C21813 = (LayoutInflaterFactory2C2181) ((C2133) obj).f10553;
                layoutInflaterFactory2C21813.f10695.setVisibility(8);
                PopupWindow popupWindow = layoutInflaterFactory2C21813.f10683;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C21813.f10695.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C21813.f10695.getParent();
                    WeakHashMap weakHashMap = AbstractC1640.f8352;
                    view.requestApplyInsets();
                }
                layoutInflaterFactory2C21813.f10695.m38();
                layoutInflaterFactory2C21813.f10694.m629(null);
                layoutInflaterFactory2C21813.f10694 = null;
                ViewGroup viewGroup = layoutInflaterFactory2C21813.f10675;
                WeakHashMap weakHashMap2 = AbstractC1640.f8352;
                viewGroup.requestApplyInsets();
                break;
        }
    }

    @Override // yyds.AbstractC2408, yyds.InterfaceC1824
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public void mo2973() {
        int i = this.f6983;
        Object obj = this.f6984;
        switch (i) {
            case 0:
                ((RunnableC1745) obj).f8802.f10695.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C2181 layoutInflaterFactory2C2181 = (LayoutInflaterFactory2C2181) obj;
                layoutInflaterFactory2C2181.f10695.setVisibility(0);
                if (layoutInflaterFactory2C2181.f10695.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C2181.f10695.getParent();
                    WeakHashMap weakHashMap = AbstractC1640.f8352;
                    view.requestApplyInsets();
                }
                break;
        }
    }
}
