package androidx.recyclerview.widget;

import Yue.C3530;
import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8995 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f30339 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f30340 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f30341 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f30342 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f30343 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f30344 = 2;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f30345 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f30346 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f30347 = 16;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f30348 = 32;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f30349 = 64;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f30350 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f30351 = 256;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f30352 = 512;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f30353 = 1024;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int f30354 = 12;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f30355 = 4096;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f30356 = 8192;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f30357 = 16384;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f30358 = 7;

    /* JADX INFO: renamed from: ۥ */
    public final InterfaceC1789 f3993;

    /* JADX INFO: renamed from: ۥ۟ */
    public C1788 f3994 = new C1788();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠ۨ$ۥ */
    public static class C1788 {

        /* JADX INFO: renamed from: ۥ */
        public int f3995 = 0;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f3996;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f30359;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f30360;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f30361;

        /* JADX INFO: renamed from: ۥ */
        public void m5013(int i) {
            this.f3995 = i | this.f3995;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean m5014() {
            int i = this.f3995;
            if ((i & 7) != 0 && (i & m30780(this.f30360, this.f3996)) == 0) {
                return false;
            }
            int i2 = this.f3995;
            if ((i2 & 112) != 0 && (i2 & (m30780(this.f30360, this.f30359) << 4)) == 0) {
                return false;
            }
            int i3 = this.f3995;
            if ((i3 & C3530.C0172.f6005) != 0 && (i3 & (m30780(this.f30361, this.f3996) << 8)) == 0) {
                return false;
            }
            int i4 = this.f3995;
            return (i4 & 28672) == 0 || (i4 & (m30780(this.f30361, this.f30359) << 12)) != 0;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int m30780(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m30781() {
            this.f3995 = 0;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m30782(int i, int i2, int i3, int i4) {
            this.f3996 = i;
            this.f30359 = i2;
            this.f30360 = i3;
            this.f30361 = i4;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠ۨ$ۥ۟ */
    public interface InterfaceC1789 {
        /* JADX INFO: renamed from: ۥ */
        View mo4927(int i);

        /* JADX INFO: renamed from: ۥ۟ */
        int mo4928(View view);

        /* JADX INFO: renamed from: ۥ۟۟ */
        int mo30301();

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        int mo30302();

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        int mo30303(View view);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠ۨ$ۥ۟۟, reason: contains not printable characters */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8996 {
    }

    public C8995(InterfaceC1789 interfaceC1789) {
        this.f3993 = interfaceC1789;
    }

    /* JADX INFO: renamed from: ۥ */
    public View m5011(int i, int i2, int i3, int i4) {
        int iMo30301 = this.f3993.mo30301();
        int iMo30302 = this.f3993.mo30302();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewMo4927 = this.f3993.mo4927(i);
            this.f3994.m30782(iMo30301, iMo30302, this.f3993.mo4928(viewMo4927), this.f3993.mo30303(viewMo4927));
            if (i3 != 0) {
                this.f3994.m30781();
                this.f3994.m5013(i3);
                if (this.f3994.m5014()) {
                    return viewMo4927;
                }
            }
            if (i4 != 0) {
                this.f3994.m30781();
                this.f3994.m5013(i4);
                if (this.f3994.m5014()) {
                    view = viewMo4927;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean m5012(View view, int i) {
        this.f3994.m30782(this.f3993.mo30301(), this.f3993.mo30302(), this.f3993.mo4928(view), this.f3993.mo30303(view));
        if (i == 0) {
            return false;
        }
        this.f3994.m30781();
        this.f3994.m5013(i);
        return this.f3994.m5014();
    }
}
