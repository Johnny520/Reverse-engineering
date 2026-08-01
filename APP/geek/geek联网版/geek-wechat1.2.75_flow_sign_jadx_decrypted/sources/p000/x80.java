package p000;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public final class x80 implements Spannable {

    /* JADX INFO: renamed from: a */
    public boolean f5224a = false;

    /* JADX INFO: renamed from: b */
    public Spannable f5225b;

    public x80(Spannable spannable) {
        this.f5225b = spannable;
    }

    /* JADX INFO: renamed from: a */
    public final void m2652a() {
        Spannable spannable = this.f5225b;
        if (!this.f5224a) {
            if ((Build.VERSION.SDK_INT < 28 ? new C0426kw(12) : new w80(12)).mo1719b(spannable)) {
                this.f5225b = new SpannableString(spannable);
            }
        }
        this.f5224a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f5225b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f5225b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f5225b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f5225b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f5225b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f5225b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f5225b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f5225b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f5225b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        m2652a();
        this.f5225b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        m2652a();
        this.f5225b.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f5225b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f5225b.toString();
    }

    public x80(CharSequence charSequence) {
        this.f5225b = new SpannableString(charSequence);
    }
}
