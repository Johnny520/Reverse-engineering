package p000;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: renamed from: dD */
/* JADX INFO: loaded from: classes.dex */
public final class C1316dD implements Spannable {

    /* JADX INFO: renamed from: a */
    public boolean f4775a = false;

    /* JADX INFO: renamed from: b */
    public Spannable f4776b;

    public C1316dD(Spannable spannable) {
        this.f4776b = spannable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f4776b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f4776b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f4776b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f4776b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f4776b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f4776b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f4776b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f4776b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f4776b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        Spannable spannable = this.f4776b;
        if (!this.f4775a && (spannable instanceof PrecomputedText)) {
            this.f4776b = new SpannableString(spannable);
        }
        this.f4775a = true;
        this.f4776b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        Spannable spannable = this.f4776b;
        if (!this.f4775a && (spannable instanceof PrecomputedText)) {
            this.f4776b = new SpannableString(spannable);
        }
        this.f4775a = true;
        this.f4776b.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f4776b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f4776b.toString();
    }
}
