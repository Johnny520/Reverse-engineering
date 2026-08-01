package p031c4;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: renamed from: c4.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1325k implements Spannable {

    /* JADX INFO: renamed from: q */
    public boolean f3965q = false;

    /* JADX INFO: renamed from: r */
    public Spannable f3966r;

    /* JADX INFO: renamed from: c4.k$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static IntStream m5332a(CharSequence charSequence) {
            return charSequence.chars();
        }

        /* JADX INFO: renamed from: b */
        public static IntStream m5333b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* JADX INFO: renamed from: c4.k$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b {
        /* JADX INFO: renamed from: a */
        public boolean mo5334a(CharSequence charSequence) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c4.k$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class c extends b {
        @Override // p031c4.C1325k.b
        /* JADX INFO: renamed from: a */
        public boolean mo5334a(CharSequence charSequence) {
            return AbstractC1326l.m5335a(charSequence);
        }
    }

    public C1325k(CharSequence charSequence) {
        this.f3966r = new SpannableString(charSequence);
    }

    /* JADX INFO: renamed from: c */
    public static b m5329c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    /* JADX INFO: renamed from: a */
    public final void m5330a() {
        Spannable spannable = this.f3966r;
        if (!this.f3965q && m5329c().mo5334a(spannable)) {
            this.f3966r = new SpannableString(spannable);
        }
        this.f3965q = true;
    }

    /* JADX INFO: renamed from: b */
    public Spannable m5331b() {
        return this.f3966r;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f3966r.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.m5332a(this.f3966r);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.m5333b(this.f3966r);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f3966r.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f3966r.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f3966r.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i10, int i11, Class cls) {
        return this.f3966r.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f3966r.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f3966r.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        m5330a();
        this.f3966r.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        m5330a();
        this.f3966r.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f3966r.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f3966r.toString();
    }

    public C1325k(Spannable spannable) {
        this.f3966r = spannable;
    }
}
