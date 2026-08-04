package yyds;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import com.p000ss.android.ugc.awemes.MainActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛳᛴᛱᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0562 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f2694;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f2695;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0562(int i, Object obj) {
        this.f2694 = i;
        this.f2695 = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View childAt;
        int i = this.f2694;
        Object obj = this.f2695;
        switch (i) {
            case 0:
                C1921 c1921 = (C1921) obj;
                if (!c1921.getInternalPopup().mo2574()) {
                    c1921.f9673.mo2576(AbstractC0162.m728(c1921), AbstractC0162.m727(c1921));
                }
                ViewTreeObserver viewTreeObserver = c1921.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    AbstractC1799.m3578(viewTreeObserver, this);
                }
                break;
            case 1:
                C2600 c2600 = (C2600) obj;
                C1921 c19212 = c2600.f12801;
                WeakHashMap weakHashMap = AbstractC1640.f8352;
                if (c19212.isAttachedToWindow() && c19212.getGlobalVisibleRect(c2600.f12799)) {
                    c2600.m4679();
                    c2600.show();
                } else {
                    c2600.dismiss();
                }
                break;
            case 2:
                ViewOnKeyListenerC2374 viewOnKeyListenerC2374 = (ViewOnKeyListenerC2374) obj;
                ArrayList arrayList = viewOnKeyListenerC2374.f11707;
                if (viewOnKeyListenerC2374.mo1515() && arrayList.size() > 0 && !((C0597) arrayList.get(0)).f2821.f11548) {
                    View view = viewOnKeyListenerC2374.f11700;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((C0597) it.next()).f2821.show();
                        }
                    } else {
                        viewOnKeyListenerC2374.dismiss();
                    }
                    break;
                }
                break;
            case 3:
                MainActivity mainActivity = (MainActivity) obj;
                LinearLayout linearLayout = mainActivity.f478;
                LinearLayout linearLayout2 = null;
                if (linearLayout == null) {
                    AbstractC2328.m4341(-1711084478825326L);
                    linearLayout = null;
                }
                linearLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                LinearLayout linearLayout3 = mainActivity.f478;
                if (linearLayout3 != null && (childAt = linearLayout3.getChildAt(0)) != null) {
                    LinearLayout linearLayout4 = mainActivity.f478;
                    if (linearLayout4 == null) {
                        AbstractC2328.m4341(-266738516788078L);
                    } else {
                        linearLayout2 = linearLayout4;
                    }
                    View childAt2 = linearLayout2.getChildAt(1);
                    childAt.setAlpha(0.0f);
                    childAt.setTranslationY(-mainActivity.m311(40));
                    childAt.setScaleX(0.95f);
                    childAt.setScaleY(0.95f);
                    childAt.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setStartDelay(120L).setDuration(460L).setInterpolator(new OvershootInterpolator(0.8f)).start();
                    if (childAt2 != null) {
                        childAt2.setAlpha(0.0f);
                        childAt2.setTranslationY(mainActivity.m311(24));
                        childAt2.animate().alpha(1.0f).translationY(0.0f).setStartDelay(320L).setDuration(360L).setInterpolator(new OvershootInterpolator(0.6f)).start();
                    }
                }
                break;
            default:
                ViewOnKeyListenerC0619 viewOnKeyListenerC0619 = (ViewOnKeyListenerC0619) obj;
                C2795 c2795 = viewOnKeyListenerC0619.f3003;
                if (viewOnKeyListenerC0619.mo1515() && !c2795.f11548) {
                    View view2 = viewOnKeyListenerC0619.f2995;
                    if (view2 != null && view2.isShown()) {
                        c2795.show();
                    } else {
                        viewOnKeyListenerC0619.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
