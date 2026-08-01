package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public final class s80 implements Spannable {
    public boolean a;
    public Spannable b;

    public s80(Spannable r2) {
        this.a = false;
        this.b = r2;
    }

    public final void a() {
        Spannable r0 = this.b;
        if (this.a == false) goto L5;
    L11:
        this.a = true;
        return;
    L5:
        if (Build.VERSION.SDK_INT >= 28) goto L7;
        iy r1 = new iy(10);
    L9:
        if (r1.b(r0) == false) goto L11;
        this.b = new SpannableString(r0);
        goto L11
    L7:
        r1 = new r80(10);
        goto L9
    }

    @Override // java.lang.CharSequence
    public final char charAt(int r2) {
        return this.b.charAt(r2);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object r2) {
        return this.b.getSpanEnd(r2);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object r2) {
        return this.b.getSpanFlags(r2);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object r2) {
        return this.b.getSpanStart(r2);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int r2, int r3, Class r4) {
        return this.b.getSpans(r2, r3, r4);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int r2, int r3, Class r4) {
        return this.b.nextSpanTransition(r2, r3, r4);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object r2) {
        a();
        this.b.removeSpan(r2);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object r2, int r3, int r4, int r5) {
        a();
        this.b.setSpan(r2, r3, r4, r5);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int r2, int r3) {
        return this.b.subSequence(r2, r3);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.b.toString();
    }

    public s80(CharSequence r2) {
        this.a = false;
        this.b = new SpannableString(r2);
    }
}
