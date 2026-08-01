package p000;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class j60 {

    /* JADX INFO: renamed from: c */
    public float f2666c;

    /* JADX INFO: renamed from: e */
    public final WeakReference f2668e;

    /* JADX INFO: renamed from: f */
    public g60 f2669f;

    /* JADX INFO: renamed from: a */
    public final TextPaint f2664a = new TextPaint(1);

    /* JADX INFO: renamed from: b */
    public final C0589pa f2665b = new C0589pa(1, this);

    /* JADX INFO: renamed from: d */
    public boolean f2667d = true;

    public j60(C0700sa c0700sa) {
        this.f2668e = new WeakReference(null);
        this.f2668e = new WeakReference(c0700sa);
    }

    /* JADX INFO: renamed from: a */
    public final float m1575a(String str) {
        if (!this.f2667d) {
            return this.f2666c;
        }
        TextPaint textPaint = this.f2664a;
        this.f2666c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f2667d = false;
        return this.f2666c;
    }
}
