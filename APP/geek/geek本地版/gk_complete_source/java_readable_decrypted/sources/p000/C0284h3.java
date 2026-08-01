package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.github.megatronking.stringfog.Base64;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: h3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0284h3 extends AbstractC0126ct {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2202d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f2203e;

    public /* synthetic */ C0284h3(int i, Object obj) {
        this.f2202d = i;
        this.f2203e = obj;
    }

    @Override // p000.ya0
    /* JADX INFO: renamed from: a */
    public final void mo0a() {
        int i = this.f2202d;
        Object obj = this.f2203e;
        switch (i) {
            case Base64.DEFAULT /* 0 */:
                LayoutInflaterFactory2C0657r3 layoutInflaterFactory2C0657r3 = ((RunnableC0210f3) obj).f1874b;
                layoutInflaterFactory2C0657r3.f4188v.setAlpha(1.0f);
                layoutInflaterFactory2C0657r3.f4191y.m2556d(null);
                layoutInflaterFactory2C0657r3.f4191y = null;
                break;
            case Base64.NO_PADDING /* 1 */:
                LayoutInflaterFactory2C0657r3 layoutInflaterFactory2C0657r32 = (LayoutInflaterFactory2C0657r3) obj;
                layoutInflaterFactory2C0657r32.f4188v.setAlpha(1.0f);
                layoutInflaterFactory2C0657r32.f4191y.m2556d(null);
                layoutInflaterFactory2C0657r32.f4191y = null;
                break;
            default:
                LayoutInflaterFactory2C0657r3 layoutInflaterFactory2C0657r33 = (LayoutInflaterFactory2C0657r3) ((C0138d4) obj).f1364c;
                layoutInflaterFactory2C0657r33.f4188v.setVisibility(8);
                PopupWindow popupWindow = layoutInflaterFactory2C0657r33.f4189w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0657r33.f4188v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0657r33.f4188v.getParent();
                    WeakHashMap weakHashMap = ja0.f2600a;
                    w90.m2552c(view);
                }
                layoutInflaterFactory2C0657r33.f4188v.m145e();
                layoutInflaterFactory2C0657r33.f4191y.m2556d(null);
                layoutInflaterFactory2C0657r33.f4191y = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0657r33.f4143A;
                WeakHashMap weakHashMap2 = ja0.f2600a;
                w90.m2552c(viewGroup);
                break;
        }
    }

    @Override // p000.AbstractC0126ct, p000.ya0
    /* JADX INFO: renamed from: c */
    public void mo2c() {
        int i = this.f2202d;
        Object obj = this.f2203e;
        switch (i) {
            case Base64.DEFAULT /* 0 */:
                ((RunnableC0210f3) obj).f1874b.f4188v.setVisibility(0);
                break;
            case Base64.NO_PADDING /* 1 */:
                LayoutInflaterFactory2C0657r3 layoutInflaterFactory2C0657r3 = (LayoutInflaterFactory2C0657r3) obj;
                layoutInflaterFactory2C0657r3.f4188v.setVisibility(0);
                if (layoutInflaterFactory2C0657r3.f4188v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0657r3.f4188v.getParent();
                    WeakHashMap weakHashMap = ja0.f2600a;
                    w90.m2552c(view);
                }
                break;
        }
    }
}
