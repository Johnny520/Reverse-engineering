package p000;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: tA */
/* JADX INFO: loaded from: classes.dex */
public final class C2533tA {

    /* JADX INFO: renamed from: c */
    public float f8835c;

    /* JADX INFO: renamed from: e */
    public final WeakReference f8837e;

    /* JADX INFO: renamed from: f */
    public C2404qA f8838f;

    /* JADX INFO: renamed from: a */
    public final TextPaint f8833a = new TextPaint(1);

    /* JADX INFO: renamed from: b */
    public final C2180l9 f8834b = new C2180l9(1, this);

    /* JADX INFO: renamed from: d */
    public boolean f8836d = true;

    public C2533tA(C2309o9 c2309o9) {
        this.f8837e = new WeakReference(null);
        this.f8837e = new WeakReference(c2309o9);
    }

    /* JADX INFO: renamed from: a */
    public final float m5014a(String str) {
        if (!this.f8836d) {
            return this.f8835c;
        }
        TextPaint textPaint = this.f8833a;
        this.f8835c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f8836d = false;
        return this.f8835c;
    }
}
