package p000;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: tA */
/* JADX INFO: loaded from: classes.dex */
public final class C2533tA {

    /* JADX INFO: renamed from: a */
    public final TextPaint f8833a;

    /* JADX INFO: renamed from: b */
    public final C2180l9 f8834b;

    /* JADX INFO: renamed from: c */
    public float f8835c;

    /* JADX INFO: renamed from: d */
    public boolean f8836d;

    /* JADX INFO: renamed from: e */
    public final WeakReference f8837e;

    /* JADX INFO: renamed from: f */
    public C2404qA f8838f;

    public C2533tA(C2309o9 r4) {
        this.f8833a = new TextPaint(1);
        this.f8834b = new C2180l9(1, this);
        this.f8836d = true;
        this.f8837e = new WeakReference(null);
        this.f8837e = new WeakReference(r4);
    }

    /* JADX INFO: renamed from: a */
    public final float m5014a(String r4) {
        if (this.f8836d == false) goto L5;
        TextPaint r1 = this.f8833a;
        if (r4 != null) goto L9;
        float r2 = 0.0f;
    L10:
        this.f8835c = r2;
        if (r4 == null) goto L14;
        Math.abs(r1.getFontMetrics().ascent);
    L14:
        this.f8836d = false;
        return this.f8835c;
    L9:
        r2 = r1.measureText(r4, 0, r4.length());
        goto L10
    L5:
        return this.f8835c;
    }
}
