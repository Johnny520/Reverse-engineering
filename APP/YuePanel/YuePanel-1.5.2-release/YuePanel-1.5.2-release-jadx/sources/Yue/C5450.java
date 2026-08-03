package Yue;

import Yue.InterfaceC7144;
import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۣۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5450 {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6391
    public static final C5450 f13398 = new C5450(0, 0, 0, 0);

    /* JADX INFO: renamed from: ۥ */
    public final int f1520;

    /* JADX INFO: renamed from: ۥ۟ */
    public final int f1521;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int f13399;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final int f13400;

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۣۡ$ۥ */
    @InterfaceC7113(29)
    public static class C0766 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Insets m2221(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    public C5450(int i, int i2, int i3, int i4) {
        this.f1520 = i;
        this.f1521 = i2;
        this.f13399 = i3;
        this.f13400 = i4;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static C5450 m2219(@InterfaceC6391 C5450 c5450, @InterfaceC6391 C5450 c54502) {
        return m16958(c5450.f1520 + c54502.f1520, c5450.f1521 + c54502.f1521, c5450.f13399 + c54502.f13399, c5450.f13400 + c54502.f13400);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public static C5450 m2220(@InterfaceC6391 C5450 c5450, @InterfaceC6391 C5450 c54502) {
        return m16958(Math.max(c5450.f1520, c54502.f1520), Math.max(c5450.f1521, c54502.f1521), Math.max(c5450.f13399, c54502.f13399), Math.max(c5450.f13400, c54502.f13400));
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C5450 m16957(@InterfaceC6391 C5450 c5450, @InterfaceC6391 C5450 c54502) {
        return m16958(Math.min(c5450.f1520, c54502.f1520), Math.min(c5450.f1521, c54502.f1521), Math.min(c5450.f13399, c54502.f13399), Math.min(c5450.f13400, c54502.f13400));
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static C5450 m16958(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f13398 : new C5450(i, i2, i3, i4);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static C5450 m16959(@InterfaceC6391 Rect rect) {
        return m16958(rect.left, rect.top, rect.right, rect.bottom);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static C5450 m16960(@InterfaceC6391 C5450 c5450, @InterfaceC6391 C5450 c54502) {
        return m16958(c5450.f1520 - c54502.f1520, c5450.f1521 - c54502.f1521, c5450.f13399 - c54502.f13399, c5450.f13400 - c54502.f13400);
    }

    @InterfaceC6391
    @InterfaceC7113(api = 29)
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static C5450 m16961(@InterfaceC6391 Insets insets) {
        return m16958(insets.left, insets.top, insets.right, insets.bottom);
    }

    @InterfaceC7113(api = 29)
    @Deprecated
    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static C5450 m16962(@InterfaceC6391 Insets insets) {
        return m16961(insets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5450.class != obj.getClass()) {
            return false;
        }
        C5450 c5450 = (C5450) obj;
        return this.f13400 == c5450.f13400 && this.f1520 == c5450.f1520 && this.f13399 == c5450.f13399 && this.f1521 == c5450.f1521;
    }

    public int hashCode() {
        return (((((this.f1520 * 31) + this.f1521) * 31) + this.f13399) * 31) + this.f13400;
    }

    @InterfaceC6391
    public String toString() {
        return "Insets{left=" + this.f1520 + ", top=" + this.f1521 + ", right=" + this.f13399 + ", bottom=" + this.f13400 + C6193.f1885;
    }

    @InterfaceC6391
    @InterfaceC7113(29)
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Insets m16963() {
        return C0766.m2221(this.f1520, this.f1521, this.f13399, this.f13400);
    }
}
