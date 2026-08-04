package yyds;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛸᛸᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1849 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f9318;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ int f9319;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ WeakReference f9320;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C1495 f9321;

    public C1849(C1495 c1495, int i, int i2, WeakReference weakReference) {
        this.f9321 = c1495;
        this.f9318 = i;
        this.f9319 = i2;
        this.f9320 = weakReference;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m3613() {
        new Handler(Looper.getMainLooper()).post(new RunnableC0089(this));
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m3614(Typeface typeface) {
        int i = this.f9318;
        if (i != -1) {
            typeface = AbstractC1957.m3772(typeface, i, (this.f9319 & 2) != 0);
        }
        C1495 c1495 = this.f9321;
        if (c1495.f7052) {
            c1495.f7059 = typeface;
            TextView textView = (TextView) this.f9320.get();
            if (textView != null) {
                WeakHashMap weakHashMap = AbstractC1640.f8352;
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i2 = c1495.f7060;
                if (zIsAttachedToWindow) {
                    textView.post(new RunnableC2140(textView, typeface, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }
}
