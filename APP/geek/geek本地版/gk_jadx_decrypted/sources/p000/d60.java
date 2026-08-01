package p000;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class d60 {

    /* JADX INFO: renamed from: c */
    public float f1391c;

    /* JADX INFO: renamed from: e */
    public final WeakReference f1393e;

    /* JADX INFO: renamed from: f */
    public a60 f1394f;

    /* JADX INFO: renamed from: a */
    public final TextPaint f1389a = new TextPaint(1);

    /* JADX INFO: renamed from: b */
    public final C0291ha f1390b = new C0291ha(1, this);

    /* JADX INFO: renamed from: d */
    public boolean f1392d = true;

    public d60(C0404ka c0404ka) {
        this.f1393e = new WeakReference(null);
        this.f1393e = new WeakReference(c0404ka);
    }

    /* JADX INFO: renamed from: a */
    public final float m924a(String str) {
        if (!this.f1392d) {
            return this.f1391c;
        }
        TextPaint textPaint = this.f1389a;
        this.f1391c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f1392d = false;
        return this.f1391c;
    }
}
