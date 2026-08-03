package p081s0;

import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p074o0.C1026b;
import p084u0.C1099d;

/* JADX INFO: renamed from: s0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1075i {

    /* JADX INFO: renamed from: a */
    public final TextPaint f4172a;

    /* JADX INFO: renamed from: b */
    public final C1026b f4173b;

    /* JADX INFO: renamed from: c */
    public float f4174c;

    /* JADX INFO: renamed from: d */
    public boolean f4175d;

    /* JADX INFO: renamed from: e */
    public final WeakReference f4176e;

    /* JADX INFO: renamed from: f */
    public C1099d f4177f;

    public C1075i(InterfaceC1074h r4) {
        this.f4172a = new TextPaint(1);
        this.f4173b = new C1026b(1, this);
        this.f4175d = true;
        this.f4176e = new WeakReference(null);
        this.f4176e = new WeakReference(r4);
    }

    /* JADX INFO: renamed from: a */
    public final float m2552a(String r4) {
        if (this.f4175d == false) goto L5;
        TextPaint r02 = this.f4172a;
        if (r4 != null) goto L9;
        float r2 = 0.0f;
    L10:
        this.f4174c = r2;
        if (r4 == null) goto L14;
        Math.abs(r02.getFontMetrics().ascent);
    L14:
        this.f4175d = false;
        return this.f4174c;
    L9:
        r2 = r02.measureText(r4, 0, r4.length());
        goto L10
    L5:
        return this.f4174c;
    }
}
