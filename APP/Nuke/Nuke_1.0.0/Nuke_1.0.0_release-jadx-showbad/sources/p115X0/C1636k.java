package p115X0;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;
import p125Z0.C1781b;

/* JADX INFO: renamed from: X0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1636k {

    /* JADX INFO: renamed from: g */
    public static final C1636k f5625g = new C1636k(false, 0, true, 1, 1, C1781b.f6089f);

    /* JADX INFO: renamed from: a */
    public final boolean f5626a;

    /* JADX INFO: renamed from: b */
    public final int f5627b;

    /* JADX INFO: renamed from: c */
    public final boolean f5628c;

    /* JADX INFO: renamed from: d */
    public final int f5629d;

    /* JADX INFO: renamed from: e */
    public final int f5630e;

    /* JADX INFO: renamed from: f */
    public final C1781b f5631f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1636k(boolean z5, int i5, boolean z6, int i6, int i7, C1781b c1781b) {
        this.f5626a = z5;
        this.f5627b = i5;
        this.f5628c = z6;
        this.f5629d = i6;
        this.f5630e = i7;
        this.f5631f = c1781b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1636k)) {
            return false;
        }
        C1636k c1636k = (C1636k) obj;
        return this.f5626a == c1636k.f5626a && this.f5627b == c1636k.f5627b && this.f5628c == c1636k.f5628c && this.f5629d == c1636k.f5629d && this.f5630e == c1636k.f5630e && AbstractC1665j.m2981a(this.f5631f, c1636k.f5631f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5631f.f6090d.hashCode() + AbstractC0231b.m391b(this.f5630e, AbstractC0231b.m391b(this.f5629d, AbstractC0231b.m395f(AbstractC0231b.m391b(this.f5627b, Boolean.hashCode(this.f5626a) * 31, 31), 31, this.f5628c), 31), 961);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ImeOptions(singleLine=" + this.f5626a + ", capitalization=" + ((Object) C1637l.m2938a(this.f5627b)) + ", autoCorrect=" + this.f5628c + ", keyboardType=" + ((Object) C1638m.m2939a(this.f5629d)) + ", imeAction=" + ((Object) C1635j.m2937a(this.f5630e)) + ", platformImeOptions=null, hintLocales=" + this.f5631f + ')';
    }
}
