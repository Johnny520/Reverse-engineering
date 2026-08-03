package androidx.emoji2.text;

import android.text.TextPaint;

/* JADX INFO: renamed from: androidx.emoji2.text.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0479d implements InterfaceC0482g {

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f1347b = null;

    /* JADX INFO: renamed from: a */
    public final TextPaint f1348a;

    static {
        f1347b = new ThreadLocal();
    }

    public C0479d() {
        TextPaint r02 = new TextPaint();
        this.f1348a = r02;
        r02.setTextSize(10.0f);
    }
}
