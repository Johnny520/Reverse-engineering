package p000;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: x4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0880x4 extends AbstractC0979zt {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f5092e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f5093f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ WeakReference f5094g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0139d5 f5095h;

    public C0880x4(C0139d5 c0139d5, int i, int i2, WeakReference weakReference) {
        this.f5095h = c0139d5;
        this.f5092e = i;
        this.f5093f = i2;
        this.f5094g = weakReference;
    }

    @Override // p000.AbstractC0979zt
    /* JADX INFO: renamed from: J */
    public final void mo2609J(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f5092e) != -1) {
            typeface = AbstractC0092c5.m628a(typeface, i, (this.f5093f & 2) != 0);
        }
        C0139d5 c0139d5 = this.f5095h;
        if (c0139d5.f1379m) {
            c0139d5.f1378l = typeface;
            TextView textView = (TextView) this.f5094g.get();
            if (textView != null) {
                WeakHashMap weakHashMap = ja0.f2600a;
                if (v90.m2495b(textView)) {
                    textView.post(new RunnableC0917y4(textView, typeface, c0139d5.f1376j));
                } else {
                    textView.setTypeface(typeface, c0139d5.f1376j);
                }
            }
        }
    }

    @Override // p000.AbstractC0979zt
    /* JADX INFO: renamed from: I */
    public final void mo2608I(int i) {
    }
}
