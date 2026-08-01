package p167;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
import p075.C6961;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7689 implements Spannable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Spannable f20871;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f20872 = false;

    public C7689(Spannable spannable) {
        this.f20871 = spannable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f20871.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f20871.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f20871.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f20871.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f20871.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f20871.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f20871.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f20871.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f20871.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        m12992();
        this.f20871.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        m12992();
        this.f20871.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f20871.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f20871.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12992() {
        Spannable spannable = this.f20871;
        if (!this.f20872) {
            if ((Build.VERSION.SDK_INT < 28 ? new C6961(7) : new C7690(7)).mo12276(spannable)) {
                this.f20871 = new SpannableString(spannable);
            }
        }
        this.f20872 = true;
    }
}
