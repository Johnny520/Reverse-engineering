package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.C0644c;
import p252r3.AbstractC6476g;

/* JADX INFO: renamed from: androidx.emoji2.text.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C0643b implements C0644c.e {

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f1854b = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final TextPaint f1855a;

    public C0643b() {
        TextPaint textPaint = new TextPaint();
        this.f1855a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    /* JADX INFO: renamed from: b */
    public static StringBuilder m2512b() {
        ThreadLocal threadLocal = f1854b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    @Override // androidx.emoji2.text.C0644c.e
    /* JADX INFO: renamed from: a */
    public boolean mo2513a(CharSequence charSequence, int i10, int i11, int i12) {
        StringBuilder sbM2512b = m2512b();
        sbM2512b.setLength(0);
        while (i10 < i11) {
            sbM2512b.append(charSequence.charAt(i10));
            i10++;
        }
        return AbstractC6476g.m25657a(this.f1855a, sbM2512b.toString());
    }
}
