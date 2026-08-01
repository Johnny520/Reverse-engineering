package ad;

import p299ub.AbstractC8611a0;

/* JADX INFO: renamed from: ad.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0254f implements CharSequence {

    /* JADX INFO: renamed from: q */
    public final char[] f630q;

    /* JADX INFO: renamed from: r */
    public int f631r;

    public C0254f(char[] cArr) {
        cArr.getClass();
        this.f630q = cArr;
        this.f631r = cArr.length;
    }

    /* JADX INFO: renamed from: a */
    public char m746a(int i10) {
        return this.f630q[i10];
    }

    /* JADX INFO: renamed from: b */
    public final char[] m747b() {
        return this.f630q;
    }

    /* JADX INFO: renamed from: c */
    public int m748c() {
        return this.f631r;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return m746a(i10);
    }

    /* JADX INFO: renamed from: d */
    public void m749d(int i10) {
        this.f631r = i10;
    }

    /* JADX INFO: renamed from: e */
    public final String m750e(int i10, int i11) {
        return AbstractC8611a0.m33077x(this.f630q, i10, Math.min(i11, length()));
    }

    /* JADX INFO: renamed from: f */
    public final void m751f(int i10) {
        m749d(Math.min(this.f630q.length, i10));
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return m748c();
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return AbstractC8611a0.m33077x(this.f630q, i10, Math.min(i11, length()));
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return m750e(0, length());
    }
}
