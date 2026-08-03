package Yue;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.stream.IntStream;

/* JADX INFO: renamed from: Yue.ۥۣۢ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8109 implements Spannable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean f24033 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6391
    public Spannable f24034;

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠ۦ$ۥ */
    @InterfaceC7113(24)
    public static class C1435 {
        /* JADX INFO: renamed from: ۥ */
        public static IntStream m4139(CharSequence charSequence) {
            return charSequence.chars();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static IntStream m4140(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠ۦ$ۥ۟ */
    public static class C1436 {
        /* JADX INFO: renamed from: ۥ */
        public boolean mo4141(CharSequence charSequence) {
            return charSequence instanceof C6728;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠ۦ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(28)
    public static class C8110 extends C1436 {
        @Override // Yue.C8109.C1436
        /* JADX INFO: renamed from: ۥ */
        public boolean mo4141(CharSequence charSequence) {
            return C6720.m3201(charSequence) || (charSequence instanceof C6728);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8109(@InterfaceC6391 Spannable spannable) {
        this.f24034 = spannable;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C1436 m26711() {
        return Build.VERSION.SDK_INT < 28 ? new C1436() : new C8110();
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f24034.charAt(i);
    }

    @Override // java.lang.CharSequence
    @InterfaceC6391
    @InterfaceC7113(api = 24)
    public IntStream chars() {
        return C1435.m4139(this.f24034);
    }

    @Override // java.lang.CharSequence
    @InterfaceC6391
    @InterfaceC7113(api = 24)
    public IntStream codePoints() {
        return C1435.m4140(this.f24034);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f24034.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f24034.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f24034.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.f24034.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f24034.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f24034.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        m4137();
        this.f24034.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        m4137();
        this.f24034.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    @InterfaceC6391
    public CharSequence subSequence(int i, int i2) {
        return this.f24034.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    @InterfaceC6391
    public String toString() {
        return this.f24034.toString();
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m4137() {
        Spannable spannable = this.f24034;
        if (!this.f24033 && m26711().mo4141(spannable)) {
            this.f24034 = new SpannableString(spannable);
        }
        this.f24033 = true;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public Spannable m4138() {
        return this.f24034;
    }

    public C8109(@InterfaceC6391 Spanned spanned) {
        this.f24034 = new SpannableString(spanned);
    }

    public C8109(@InterfaceC6391 CharSequence charSequence) {
        this.f24034 = new SpannableString(charSequence);
    }
}
