package p069i;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import androidx.activity.RunnableC0371b;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p099y.AbstractC1048L;

/* JADX INFO: renamed from: i.W */
/* JADX INFO: loaded from: classes.dex */
public final class C0651W {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2216a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2217b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ WeakReference f2218c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0666c0 f2219d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0651W(C0666c0 c0666c0, int i2, int i3, WeakReference weakReference) {
        this.f2219d = c0666c0;
        this.f2216a = i2;
        this.f2217b = i3;
        this.f2218c = weakReference;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1266a() {
        new Handler(Looper.getMainLooper()).post(new RunnableC0371b(5, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m1267b(Typeface typeface) {
        int i2;
        if (Build.VERSION.SDK_INT >= 28 && (i2 = this.f2216a) != -1) {
            typeface = AbstractC0663b0.m1277a(typeface, i2, (this.f2217b & 2) != 0);
        }
        C0666c0 c0666c0 = this.f2219d;
        if (c0666c0.f2253m) {
            c0666c0.f2252l = typeface;
            TextView textView = (TextView) this.f2218c.get();
            if (textView != null) {
                WeakHashMap weakHashMap = AbstractC1048L.f3662a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC0653X(textView, typeface, c0666c0.f2250j));
                } else {
                    textView.setTypeface(typeface, c0666c0.f2250j);
                }
            }
        }
    }
}
