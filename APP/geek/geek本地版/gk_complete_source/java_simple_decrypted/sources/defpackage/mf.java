package defpackage;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class mf implements bi {
    public static final ThreadLocal b = null;
    public final TextPaint a;

    static {
        b = new ThreadLocal();
    }

    public mf() {
        TextPaint r0 = new TextPaint();
        this.a = r0;
        r0.setTextSize(10.0f);
    }
}
