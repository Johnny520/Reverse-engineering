package p000;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: renamed from: dD */
/* JADX INFO: loaded from: classes.dex */
public final class C1316dD implements Spannable {

    /* JADX INFO: renamed from: a */
    public boolean f4775a;

    /* JADX INFO: renamed from: b */
    public Spannable f4776b;

    public C1316dD(Spannable r2) {
        this.f4775a = false;
        this.f4776b = r2;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int r2) {
        return this.f4776b.charAt(r2);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f4776b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f4776b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object r2) {
        return this.f4776b.getSpanEnd(r2);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object r2) {
        return this.f4776b.getSpanFlags(r2);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object r2) {
        return this.f4776b.getSpanStart(r2);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int r2, int r3, Class r4) {
        return this.f4776b.getSpans(r2, r3, r4);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f4776b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int r2, int r3, Class r4) {
        return this.f4776b.nextSpanTransition(r2, r3, r4);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object r3) {
        Spannable r0 = this.f4776b;
        if (this.f4775a == false) goto L5;
    L7:
        this.f4775a = true;
        this.f4776b.removeSpan(r3);
        return;
    L5:
        if ((r0 instanceof PrecomputedText) == false) goto L7;
        this.f4776b = new SpannableString(r0);
        goto L7
    }

    @Override // android.text.Spannable
    public final void setSpan(Object r3, int r4, int r5, int r6) {
        Spannable r0 = this.f4776b;
        if (this.f4775a == false) goto L5;
    L7:
        this.f4775a = true;
        this.f4776b.setSpan(r3, r4, r5, r6);
        return;
    L5:
        if ((r0 instanceof PrecomputedText) == false) goto L7;
        this.f4776b = new SpannableString(r0);
        goto L7
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int r2, int r3) {
        return this.f4776b.subSequence(r2, r3);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f4776b.toString();
    }
}
