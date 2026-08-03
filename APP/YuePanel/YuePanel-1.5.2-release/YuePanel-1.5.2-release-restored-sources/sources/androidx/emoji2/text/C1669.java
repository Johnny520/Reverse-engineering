package androidx.emoji2.text;

import Yue.C6597;
import Yue.InterfaceC3262;
import Yue.InterfaceC6391;
import Yue.InterfaceC7144;
import android.text.TextPaint;
import androidx.emoji2.text.C8812;

/* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟ */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
@InterfaceC3262
public class C1669 implements C8812.InterfaceC8817 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f3762 = 10;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final ThreadLocal<StringBuilder> f29494 = new ThreadLocal<>();

    /* JADX INFO: renamed from: ۥ */
    public final TextPaint f3763;

    public C1669() {
        TextPaint textPaint = new TextPaint();
        this.f3763 = textPaint;
        textPaint.setTextSize(10.0f);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static StringBuilder m4779() {
        ThreadLocal<StringBuilder> threadLocal = f29494;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override // androidx.emoji2.text.C8812.InterfaceC8817
    /* JADX INFO: renamed from: ۥ */
    public boolean mo4780(@InterfaceC6391 CharSequence charSequence, int i, int i2, int i3) {
        StringBuilder sbM4779 = m4779();
        sbM4779.setLength(0);
        while (i < i2) {
            sbM4779.append(charSequence.charAt(i));
            i++;
        }
        return C6597.m3057(this.f3763, sbM4779.toString());
    }
}
