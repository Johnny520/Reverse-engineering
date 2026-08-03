package androidx.emoji2.text;

import android.text.TextPaint;

/* JADX INFO: renamed from: androidx.emoji2.text.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0479d implements InterfaceC0482g {

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f1347b = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final TextPaint f1348a;

    public C0479d() {
        TextPaint textPaint = new TextPaint();
        this.f1348a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
