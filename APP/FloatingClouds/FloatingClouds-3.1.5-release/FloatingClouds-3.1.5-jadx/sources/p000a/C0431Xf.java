package p000a;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: renamed from: a.Xf */
/* JADX INFO: loaded from: classes.dex */
public final class C0431Xf implements Spannable {

    /* JADX INFO: renamed from: a */
    public boolean f1616a = false;

    /* JADX INFO: renamed from: b */
    public Spannable f1617b;

    public C0431Xf(Spannable spannable) {
        this.f1617b = spannable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f1617b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f1617b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f1617b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f1617b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f1617b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f1617b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.f1617b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f1617b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f1617b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        Spannable spannable = this.f1617b;
        if (!this.f1616a && ((spannable instanceof PrecomputedText) || (spannable instanceof C0123Gc))) {
            this.f1617b = new SpannableString(spannable);
        }
        this.f1616a = true;
        this.f1617b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        Spannable spannable = this.f1617b;
        if (!this.f1616a && ((spannable instanceof PrecomputedText) || (spannable instanceof C0123Gc))) {
            this.f1617b = new SpannableString(spannable);
        }
        this.f1616a = true;
        this.f1617b.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f1617b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f1617b.toString();
    }
}
