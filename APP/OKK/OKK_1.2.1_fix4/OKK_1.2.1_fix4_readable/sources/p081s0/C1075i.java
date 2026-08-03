package p081s0;

import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p074o0.C1026b;
import p084u0.C1099d;

/* JADX INFO: renamed from: s0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1075i {

    /* JADX INFO: renamed from: c */
    public float f4174c;

    /* JADX INFO: renamed from: e */
    public final WeakReference f4176e;

    /* JADX INFO: renamed from: f */
    public C1099d f4177f;

    /* JADX INFO: renamed from: a */
    public final TextPaint f4172a = new TextPaint(1);

    /* JADX INFO: renamed from: b */
    public final C1026b f4173b = new C1026b(1, this);

    /* JADX INFO: renamed from: d */
    public boolean f4175d = true;

    public C1075i(InterfaceC1074h interfaceC1074h) {
        this.f4176e = new WeakReference(null);
        this.f4176e = new WeakReference(interfaceC1074h);
    }

    /* JADX INFO: renamed from: a */
    public final float m2552a(String str) {
        if (!this.f4175d) {
            return this.f4174c;
        }
        TextPaint textPaint = this.f4172a;
        this.f4174c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f4175d = false;
        return this.f4174c;
    }
}
