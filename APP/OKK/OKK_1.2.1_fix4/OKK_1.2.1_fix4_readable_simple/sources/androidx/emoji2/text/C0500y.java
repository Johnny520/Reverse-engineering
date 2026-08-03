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
    public boolean f1406a;

    /* JADX INFO: renamed from: b */
    public Spannable f1407b;

    public C0500y(Spannable r2) {
        this.f1406a = false;
        this.f1407b = r2;
    }

    /* JADX INFO: renamed from: a */
    public final void m1222a() {
        Spannable r02 = this.f1407b;
        if (this.f1406a == false) goto L5;
    L11:
        this.f1406a = true;
        return;
    L5:
        if (Build.VERSION.SDK_INT >= 28) goto L7;
        C1121e r1 = new C1121e(23);
    L9:
        if (r1.mo1221f(r02) == false) goto L11;
        this.f1407b = new SpannableString(r02);
        goto L11
    L7:
        r1 = new C0499x(23);
        goto L9
    }

    @Override // java.lang.CharSequence
    public final char charAt(int r2) {
        return this.f1407b.charAt(r2);
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
    public final int getSpanEnd(Object r2) {
        return this.f1407b.getSpanEnd(r2);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object r2) {
        return this.f1407b.getSpanFlags(r2);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object r2) {
        return this.f1407b.getSpanStart(r2);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int r2, int r3, Class r4) {
        return this.f1407b.getSpans(r2, r3, r4);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f1407b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int r2, int r3, Class r4) {
        return this.f1407b.nextSpanTransition(r2, r3, r4);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object r2) {
        m1222a();
        this.f1407b.removeSpan(r2);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object r2, int r3, int r4, int r5) {
        m1222a();
        this.f1407b.setSpan(r2, r3, r4, r5);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int r2, int r3) {
        return this.f1407b.subSequence(r2, r3);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f1407b.toString();
    }
}
