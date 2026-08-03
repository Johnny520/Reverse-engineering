package Yue;

import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.location.GnssStatus;
import android.location.GpsStatus;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۦ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5179 {

    /* JADX INFO: renamed from: ۥ */
    @SuppressLint({"InlinedApi"})
    public static final int f1323 = 0;

    /* JADX INFO: renamed from: ۥ۟ */
    @SuppressLint({"InlinedApi"})
    public static final int f1324 = 1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @SuppressLint({"InlinedApi"})
    public static final int f12231 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @SuppressLint({"InlinedApi"})
    public static final int f12232 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @SuppressLint({"InlinedApi"})
    public static final int f12233 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @SuppressLint({"InlinedApi"})
    public static final int f12234 = 5;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @SuppressLint({"InlinedApi"})
    public static final int f12235 = 6;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @SuppressLint({"InlinedApi"})
    public static final int f12236 = 7;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۦ۟$ۥ */
    public static abstract class AbstractC0657 {
        /* JADX INFO: renamed from: ۥ */
        public void m1957(@InterfaceC5459(from = 0) int i) {
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m1958(@InterfaceC6391 AbstractC5179 abstractC5179) {
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m15876() {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m15877() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۦ۟$ۥ۟ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC0658 {
    }

    @InterfaceC6391
    @InterfaceC7113(24)
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static AbstractC5179 m15863(@InterfaceC6391 GnssStatus gnssStatus) {
        return new C5180(gnssStatus);
    }

    @InterfaceC6391
    @SuppressLint({"ReferencesDeprecated"})
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static AbstractC5179 m15864(@InterfaceC6391 GpsStatus gpsStatus) {
        return new C5191(gpsStatus);
    }

    @InterfaceC4885(from = 0.0d, m1796to = 360.0d)
    /* JADX INFO: renamed from: ۥ */
    public abstract float mo1955(@InterfaceC5459(from = 0) int i);

    @InterfaceC4885(from = 0.0d, m1796to = 63.0d)
    /* JADX INFO: renamed from: ۥ۟ */
    public abstract float mo1956(@InterfaceC5459(from = 0) int i);

    @InterfaceC4885(from = 0.0d)
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public abstract float mo15865(@InterfaceC5459(from = 0) int i);

    @InterfaceC4885(from = 0.0d, m1796to = 63.0d)
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public abstract float mo15866(@InterfaceC5459(from = 0) int i);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public abstract int mo15867(@InterfaceC5459(from = 0) int i);

    @InterfaceC4885(from = -90.0d, m1796to = 90.0d)
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public abstract float mo15868(@InterfaceC5459(from = 0) int i);

    @InterfaceC5459(from = 0)
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public abstract int mo15869();

    @InterfaceC5459(from = 1, m2228to = 200)
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public abstract int mo15870(@InterfaceC5459(from = 0) int i);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public abstract boolean mo15871(@InterfaceC5459(from = 0) int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public abstract boolean mo15872(@InterfaceC5459(from = 0) int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public abstract boolean mo15873(@InterfaceC5459(from = 0) int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public abstract boolean mo15874(@InterfaceC5459(from = 0) int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public abstract boolean mo15875(@InterfaceC5459(from = 0) int i);
}
