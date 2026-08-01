package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.github.megatronking.stringfog.Base64;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: h3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0284h3 extends AbstractC0387ju {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f2094c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f2095d;

    public /* synthetic */ C0284h3(int i, Object obj) {
        this.f2094c = i;
        this.f2095d = obj;
    }

    @Override // p000.db0
    /* JADX INFO: renamed from: a */
    public final void mo0a() {
        int i = this.f2094c;
        Object obj = this.f2095d;
        switch (i) {
            case Base64.DEFAULT /* 0 */:
                LayoutInflaterFactory2C0656r3 layoutInflaterFactory2C0656r3 = ((RunnableC0210f3) obj).f1724b;
                layoutInflaterFactory2C0656r3.f4049v.setAlpha(1.0f);
                layoutInflaterFactory2C0656r3.f4052y.m510d(null);
                layoutInflaterFactory2C0656r3.f4052y = null;
                break;
            case Base64.NO_PADDING /* 1 */:
                LayoutInflaterFactory2C0656r3 layoutInflaterFactory2C0656r32 = (LayoutInflaterFactory2C0656r3) obj;
                layoutInflaterFactory2C0656r32.f4049v.setAlpha(1.0f);
                layoutInflaterFactory2C0656r32.f4052y.m510d(null);
                layoutInflaterFactory2C0656r32.f4052y = null;
                break;
            default:
                LayoutInflaterFactory2C0656r3 layoutInflaterFactory2C0656r33 = (LayoutInflaterFactory2C0656r3) ((C0138d4) obj).f1298c;
                layoutInflaterFactory2C0656r33.f4049v.setVisibility(8);
                PopupWindow popupWindow = layoutInflaterFactory2C0656r33.f4050w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0656r33.f4049v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0656r33.f4049v.getParent();
                    WeakHashMap weakHashMap = oa0.f3426a;
                    ba0.m506c(view);
                }
                layoutInflaterFactory2C0656r33.f4049v.m130e();
                layoutInflaterFactory2C0656r33.f4052y.m510d(null);
                layoutInflaterFactory2C0656r33.f4052y = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0656r33.f4004A;
                WeakHashMap weakHashMap2 = oa0.f3426a;
                ba0.m506c(viewGroup);
                break;
        }
    }

    @Override // p000.AbstractC0387ju, p000.db0
    /* JADX INFO: renamed from: c */
    public void mo2c() {
        int i = this.f2094c;
        Object obj = this.f2095d;
        switch (i) {
            case Base64.DEFAULT /* 0 */:
                ((RunnableC0210f3) obj).f1724b.f4049v.setVisibility(0);
                break;
            case Base64.NO_PADDING /* 1 */:
                LayoutInflaterFactory2C0656r3 layoutInflaterFactory2C0656r3 = (LayoutInflaterFactory2C0656r3) obj;
                layoutInflaterFactory2C0656r3.f4049v.setVisibility(0);
                if (layoutInflaterFactory2C0656r3.f4049v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0656r3.f4049v.getParent();
                    WeakHashMap weakHashMap = oa0.f3426a;
                    ba0.m506c(view);
                }
                break;
        }
    }
}
