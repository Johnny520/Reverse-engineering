package p183;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
import p091.C7790;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8518 implements Spannable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Spannable f21216;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f21217 = false;

    public C8518(Spannable spannable) {
        this.f21216 = spannable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f21216.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f21216.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f21216.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f21216.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f21216.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f21216.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f21216.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f21216.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f21216.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        m13551();
        this.f21216.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        m13551();
        this.f21216.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f21216.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f21216.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13551() {
        Spannable spannable = this.f21216;
        if (!this.f21217) {
            if ((Build.VERSION.SDK_INT < 28 ? new C7790(7) : new C8519(7)).mo12835(spannable)) {
                this.f21216 = new SpannableString(spannable);
            }
        }
        this.f21217 = true;
    }
}
