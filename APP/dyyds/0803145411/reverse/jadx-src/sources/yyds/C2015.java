package yyds;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: renamed from: yyds.ᲀᛵᲇᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2015 implements Spannable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public boolean f10075 = false;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Spannable f10076;

    public C2015(CharSequence charSequence) {
        this.f10076 = new SpannableString(charSequence);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f10076.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f10076.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f10076.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f10076.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f10076.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f10076.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f10076.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f10076.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f10076.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        Spannable spannable = this.f10076;
        if (!this.f10075 && (spannable instanceof PrecomputedText)) {
            SpannableString spannableString = new SpannableString(spannable);
            this.f10076 = spannableString;
            spannable = spannableString;
        }
        this.f10075 = true;
        spannable.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        Spannable spannable = this.f10076;
        if (!this.f10075 && (spannable instanceof PrecomputedText)) {
            SpannableString spannableString = new SpannableString(spannable);
            this.f10076 = spannableString;
            spannable = spannableString;
        }
        this.f10075 = true;
        spannable.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f10076.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f10076.toString();
    }

    public C2015(Spannable spannable) {
        this.f10076 = spannable;
    }
}
