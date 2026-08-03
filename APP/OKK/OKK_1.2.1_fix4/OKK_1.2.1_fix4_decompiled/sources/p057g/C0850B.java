package p057g;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p083u.AbstractC1083b;

/* JADX INFO: renamed from: g.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0850B extends AbstractC1083b {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f3075e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f3076f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ WeakReference f3077g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0860G f3078h;

    public C0850B(C0860G c0860g, int i2, int i3, WeakReference weakReference) {
        this.f3078h = c0860g;
        this.f3075e = i2;
        this.f3076f = i3;
        this.f3077g = weakReference;
    }

    @Override // p083u.AbstractC1083b
    /* JADX INFO: renamed from: f */
    public final void mo2163f(int i2) {
    }

    @Override // p083u.AbstractC1083b
    /* JADX INFO: renamed from: g */
    public final void mo2164g(Typeface typeface) {
        int i2;
        if (Build.VERSION.SDK_INT >= 28 && (i2 = this.f3075e) != -1) {
            typeface = AbstractC0858F.m2172a(typeface, i2, (this.f3076f & 2) != 0);
        }
        C0860G c0860g = this.f3078h;
        if (c0860g.f3103m) {
            c0860g.f3102l = typeface;
            TextView textView = (TextView) this.f3077g.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC0852C(textView, typeface, c0860g.f3100j));
                } else {
                    textView.setTypeface(typeface, c0860g.f3100j);
                }
            }
        }
    }
}
