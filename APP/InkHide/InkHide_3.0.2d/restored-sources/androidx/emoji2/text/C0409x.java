package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
import p012G.C0140d;

/* JADX INFO: renamed from: androidx.emoji2.text.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0409x implements Spannable {

    /* JADX INFO: renamed from: a */
    public boolean f1220a = false;

    /* JADX INFO: renamed from: b */
    public Spannable f1221b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0409x(Spannable spannable) {
        this.f1221b = spannable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m783a() {
        Spannable spannable = this.f1221b;
        if (!this.f1220a) {
            if ((Build.VERSION.SDK_INT < 28 ? new C0140d(20) : new C0408w(20)).mo314f(spannable)) {
                this.f1221b = new SpannableString(spannable);
            }
        }
        this.f1220a = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final char charAt(int i2) {
        return this.f1221b.charAt(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f1221b.chars();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f1221b.codePoints();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f1221b.getSpanEnd(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f1221b.getSpanFlags(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f1221b.getSpanStart(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.Spanned
    public final Object[] getSpans(int i2, int i3, Class cls) {
        return this.f1221b.getSpans(i2, i3, cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final int length() {
        return this.f1221b.length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.Spanned
    public final int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f1221b.nextSpanTransition(i2, i3, cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        m783a();
        this.f1221b.removeSpan(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        m783a();
        this.f1221b.setSpan(obj, i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i3) {
        return this.f1221b.subSequence(i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f1221b.toString();
    }

    public C0409x(CharSequence charSequence) {
        this.f1221b = new SpannableString(charSequence);
    }
}
