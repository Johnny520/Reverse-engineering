package p000;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public final class s80 implements Spannable {

    /* JADX INFO: renamed from: a */
    public boolean f4395a = false;

    /* JADX INFO: renamed from: b */
    public Spannable f4396b;

    public s80(Spannable spannable) {
        this.f4396b = spannable;
    }

    /* JADX INFO: renamed from: a */
    public final void m2308a() {
        Spannable spannable = this.f4396b;
        if (!this.f4395a) {
            if ((Build.VERSION.SDK_INT < 28 ? new C0354iy(10) : new r80(10)).mo1530b(spannable)) {
                this.f4396b = new SpannableString(spannable);
            }
        }
        this.f4395a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f4396b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f4396b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f4396b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f4396b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f4396b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f4396b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f4396b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f4396b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f4396b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        m2308a();
        this.f4396b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        m2308a();
        this.f4396b.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f4396b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f4396b.toString();
    }

    public s80(CharSequence charSequence) {
        this.f4396b = new SpannableString(charSequence);
    }
}
