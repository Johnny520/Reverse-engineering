package p000;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: x4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0880x4 extends AbstractC0498mu {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5160a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f5161b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ WeakReference f5162c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0139d5 f5163d;

    public C0880x4(C0139d5 c0139d5, int i, int i2, WeakReference weakReference) {
        this.f5163d = c0139d5;
        this.f5160a = i;
        this.f5161b = i2;
        this.f5162c = weakReference;
    }

    @Override // p000.AbstractC0498mu
    /* JADX INFO: renamed from: x */
    public final void mo969x(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f5160a) != -1) {
            typeface = AbstractC0092c5.m586a(typeface, i, (this.f5161b & 2) != 0);
        }
        C0139d5 c0139d5 = this.f5163d;
        if (c0139d5.f1313m) {
            c0139d5.f1312l = typeface;
            TextView textView = (TextView) this.f5162c.get();
            if (textView != null) {
                WeakHashMap weakHashMap = oa0.f3426a;
                if (aa0.m39b(textView)) {
                    textView.post(new RunnableC0917y4(textView, typeface, c0139d5.f1310j));
                } else {
                    textView.setTypeface(typeface, c0139d5.f1310j);
                }
            }
        }
    }

    @Override // p000.AbstractC0498mu
    /* JADX INFO: renamed from: w */
    public final void mo968w(int i) {
    }
}
