package p000;

import android.text.TextPaint;

/* JADX INFO: renamed from: Rc */
/* JADX INFO: loaded from: classes.dex */
public final class C0749Rc implements InterfaceC2235mf {

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f2384b = null;

    /* JADX INFO: renamed from: a */
    public final TextPaint f2385a;

    static {
        f2384b = new ThreadLocal();
    }

    public C0749Rc() {
        TextPaint r0 = new TextPaint();
        this.f2385a = r0;
        r0.setTextSize(10.0f);
    }
}
