package p162l3;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: renamed from: l3.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2471y implements Spannable {

    /* JADX INFO: renamed from: g */
    public boolean f8105g = false;

    /* JADX INFO: renamed from: h */
    public Spannable f8106h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2471y(Spannable spannable) {
        this.f8106h = spannable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m5876a() {
        Spannable spannable = this.f8106h;
        if (!this.f8105g) {
            if ((Build.VERSION.SDK_INT < 28 ? new C2469w(0) : new C2470x(0)).mo5875j(spannable)) {
                this.f8106h = new SpannableString(spannable);
            }
        }
        this.f8105g = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final char charAt(int i9) {
        return this.f8106h.charAt(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f8106h.chars();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f8106h.codePoints();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f8106h.getSpanEnd(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f8106h.getSpanFlags(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f8106h.getSpanStart(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.Spanned
    public final Object[] getSpans(int i9, int i10, Class cls) {
        return this.f8106h.getSpans(i9, i10, cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final int length() {
        return this.f8106h.length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.Spanned
    public final int nextSpanTransition(int i9, int i10, Class cls) {
        return this.f8106h.nextSpanTransition(i9, i10, cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        m5876a();
        this.f8106h.removeSpan(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i9, int i10, int i11) {
        m5876a();
        this.f8106h.setSpan(obj, i9, i10, i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i9, int i10) {
        return this.f8106h.subSequence(i9, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f8106h.toString();
    }
}
