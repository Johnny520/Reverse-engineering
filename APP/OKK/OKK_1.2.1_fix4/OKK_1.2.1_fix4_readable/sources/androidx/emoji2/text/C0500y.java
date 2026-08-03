package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
import p089x0.C1121e;

/* JADX INFO: renamed from: androidx.emoji2.text.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0500y implements Spannable {

    /* JADX INFO: renamed from: a */
    public boolean f1406a = false;

    /* JADX INFO: renamed from: b */
    public Spannable f1407b;

    public C0500y(Spannable spannable) {
        this.f1407b = spannable;
    }

    /* JADX INFO: renamed from: a */
    public final void m1222a() {
        Spannable spannable = this.f1407b;
        if (!this.f1406a) {
            if ((Build.VERSION.SDK_INT < 28 ? new C1121e(23) : new C0499x(23)).mo1221f(spannable)) {
                this.f1407b = new SpannableString(spannable);
            }
        }
        this.f1406a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i2) {
        return this.f1407b.charAt(i2);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f1407b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f1407b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f1407b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f1407b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f1407b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i2, int i3, Class cls) {
        return this.f1407b.getSpans(i2, i3, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f1407b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f1407b.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        m1222a();
        this.f1407b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        m1222a();
        this.f1407b.setSpan(obj, i2, i3, i4);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i3) {
        return this.f1407b.subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f1407b.toString();
    }
}
