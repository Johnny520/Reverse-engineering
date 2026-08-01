package p167;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
import p075.C6960;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7688 implements Spannable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Spannable f20876;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f20877 = false;

    public C7688(Spannable spannable) {
        this.f20876 = spannable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f20876.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f20876.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f20876.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f20876.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f20876.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f20876.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f20876.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f20876.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f20876.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        m12960();
        this.f20876.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        m12960();
        this.f20876.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f20876.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f20876.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12960() {
        Spannable spannable = this.f20876;
        if (!this.f20877) {
            if ((Build.VERSION.SDK_INT < 28 ? new C6960(7) : new C7689(7)).mo12249(spannable)) {
                this.f20876 = new SpannableString(spannable);
            }
        }
        this.f20877 = true;
    }
}
