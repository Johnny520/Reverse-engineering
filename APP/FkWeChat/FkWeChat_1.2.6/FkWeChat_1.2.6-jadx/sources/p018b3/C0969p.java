package p018b3;

import okhttp3.internal.url._UrlKt;
import p185m8.AbstractC5102r;

/* JADX INFO: renamed from: b3.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0969p {

    /* JADX INFO: renamed from: a */
    public int f2968a;

    /* JADX INFO: renamed from: b */
    public char[] f2969b;

    /* JADX INFO: renamed from: c */
    public int f2970c;

    /* JADX INFO: renamed from: d */
    public int f2971d;

    public C0969p(char[] cArr, int i10, int i11) {
        this.f2968a = cArr.length;
        this.f2969b = cArr;
        this.f2970c = i10;
        this.f2971d = i11;
    }

    /* JADX INFO: renamed from: a */
    public final void m3530a(StringBuilder sb2) {
        sb2.append(this.f2969b, 0, this.f2970c);
        char[] cArr = this.f2969b;
        int i10 = this.f2971d;
        sb2.append(cArr, i10, this.f2968a - i10);
    }

    /* JADX INFO: renamed from: b */
    public final void m3531b(int i10, int i11) {
        int i12 = this.f2970c;
        if (i10 < i12 && i11 <= i12) {
            int i13 = i12 - i11;
            char[] cArr = this.f2969b;
            AbstractC5102r.m20656h(cArr, cArr, this.f2971d - i13, i11, i12);
            this.f2970c = i10;
            this.f2971d -= i13;
            return;
        }
        if (i10 < i12 && i11 >= i12) {
            this.f2971d = i11 + m3532c();
            this.f2970c = i10;
            return;
        }
        int iM3532c = i10 + m3532c();
        int iM3532c2 = i11 + m3532c();
        int i14 = this.f2971d;
        char[] cArr2 = this.f2969b;
        AbstractC5102r.m20656h(cArr2, cArr2, this.f2970c, i14, iM3532c);
        this.f2970c += iM3532c - i14;
        this.f2971d = iM3532c2;
    }

    /* JADX INFO: renamed from: c */
    public final int m3532c() {
        return this.f2971d - this.f2970c;
    }

    /* JADX INFO: renamed from: d */
    public final char m3533d(int i10) {
        int i11 = this.f2970c;
        char[] cArr = this.f2969b;
        return i10 < i11 ? cArr[i10] : cArr[(i10 - i11) + this.f2971d];
    }

    /* JADX INFO: renamed from: e */
    public final int m3534e() {
        return this.f2968a - m3532c();
    }

    /* JADX INFO: renamed from: f */
    public final void m3535f(int i10) {
        if (i10 <= m3532c()) {
            return;
        }
        int iM3532c = i10 - m3532c();
        int i11 = this.f2968a;
        do {
            i11 *= 2;
        } while (i11 - this.f2968a < iM3532c);
        char[] cArr = new char[i11];
        AbstractC5102r.m20656h(this.f2969b, cArr, 0, 0, this.f2970c);
        int i12 = this.f2968a;
        int i13 = this.f2971d;
        int i14 = i12 - i13;
        int i15 = i11 - i14;
        AbstractC5102r.m20656h(this.f2969b, cArr, i15, i13, i14 + i13);
        this.f2969b = cArr;
        this.f2968a = i11;
        this.f2971d = i15;
    }

    /* JADX INFO: renamed from: g */
    public final void m3536g(int i10, int i11, String str) {
        m3535f(str.length() - (i11 - i10));
        m3531b(i10, i11);
        AbstractC0971q.m3540b(str, this.f2969b, this.f2970c);
        this.f2970c += str.length();
    }

    public String toString() {
        return _UrlKt.FRAGMENT_ENCODE_SET;
    }
}
