package p252r3;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: renamed from: r3.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6475f {

    /* JADX INFO: renamed from: e */
    public static final C6475f f20346e = new C6475f(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f20347a;

    /* JADX INFO: renamed from: b */
    public final int f20348b;

    /* JADX INFO: renamed from: c */
    public final int f20349c;

    /* JADX INFO: renamed from: d */
    public final int f20350d;

    /* JADX INFO: renamed from: r3.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static Insets m25656a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    public C6475f(int i10, int i11, int i12, int i13) {
        this.f20347a = i10;
        this.f20348b = i11;
        this.f20349c = i12;
        this.f20350d = i13;
    }

    /* JADX INFO: renamed from: a */
    public static C6475f m25651a(C6475f c6475f, C6475f c6475f2) {
        return m25652b(Math.max(c6475f.f20347a, c6475f2.f20347a), Math.max(c6475f.f20348b, c6475f2.f20348b), Math.max(c6475f.f20349c, c6475f2.f20349c), Math.max(c6475f.f20350d, c6475f2.f20350d));
    }

    /* JADX INFO: renamed from: b */
    public static C6475f m25652b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f20346e : new C6475f(i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: c */
    public static C6475f m25653c(Rect rect) {
        return m25652b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: renamed from: d */
    public static C6475f m25654d(Insets insets) {
        return m25652b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* JADX INFO: renamed from: e */
    public Insets m25655e() {
        return a.m25656a(this.f20347a, this.f20348b, this.f20349c, this.f20350d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6475f.class != obj.getClass()) {
            return false;
        }
        C6475f c6475f = (C6475f) obj;
        return this.f20350d == c6475f.f20350d && this.f20347a == c6475f.f20347a && this.f20349c == c6475f.f20349c && this.f20348b == c6475f.f20348b;
    }

    public int hashCode() {
        return (((((this.f20347a * 31) + this.f20348b) * 31) + this.f20349c) * 31) + this.f20350d;
    }

    public String toString() {
        return "Insets{left=" + this.f20347a + ", top=" + this.f20348b + ", right=" + this.f20349c + ", bottom=" + this.f20350d + '}';
    }
}
