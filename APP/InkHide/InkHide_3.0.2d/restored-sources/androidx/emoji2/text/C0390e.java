package androidx.emoji2.text;

import android.text.TextPaint;

/* JADX INFO: renamed from: androidx.emoji2.text.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0390e {

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f1165b = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final TextPaint f1166a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0390e() {
        TextPaint textPaint = new TextPaint();
        this.f1166a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
