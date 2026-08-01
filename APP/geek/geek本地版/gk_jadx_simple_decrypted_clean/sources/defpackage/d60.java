package defpackage;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class d60 {
    public final TextPaint a;
    public final ha b;
    public float c;
    public boolean d;
    public final WeakReference e;
    public a60 f;

    public d60(ka r4) {
        this.a = new TextPaint(1);
        this.b = new ha(1, this);
        this.d = true;
        this.e = new WeakReference(null);
        this.e = new WeakReference(r4);
    }

    public final float a(String r4) {
        if (this.d == false) goto L5;
        TextPaint r1 = this.a;
        if (r4 != null) goto L9;
        float r2 = 0.0f;
    L10:
        this.c = r2;
        if (r4 == null) goto L14;
        Math.abs(r1.getFontMetrics().ascent);
    L14:
        this.d = false;
        return this.c;
    L9:
        r2 = r1.measureText(r4, 0, r4.length());
        goto L10
    L5:
        return this.c;
    }
}
