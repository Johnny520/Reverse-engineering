package Yue;

import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.location.LocationRequest;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Yue.ۥ۠ۨ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5845 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final long f14479 = Long.MAX_VALUE;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f14480 = 100;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f14481 = 102;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f14482 = 104;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final long f14483 = -1;

    /* JADX INFO: renamed from: ۥ */
    public final int f1722;

    /* JADX INFO: renamed from: ۥ۟ */
    public final long f1723;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final long f14484;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final long f14485;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int f14486;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final float f14487;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final long f14488;

    /* JADX INFO: renamed from: Yue.ۥ۠ۨ۠ۢ$ۥ */
    public static class C0880 {

        /* JADX INFO: renamed from: ۥ */
        public static Class<?> f1724;

        /* JADX INFO: renamed from: ۥ۟ */
        public static Method f1725;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static Method f14489;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static Method f14490;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static Method f14491;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static Method f14492;

        @SuppressLint({"BanUncheckedReflection"})
        /* JADX INFO: renamed from: ۥ */
        public static Object m2514(C5845 c5845, String str) {
            try {
                if (f1724 == null) {
                    f1724 = Class.forName("android.location.LocationRequest");
                }
                if (f1725 == null) {
                    Method declaredMethod = f1724.getDeclaredMethod("createFromDeprecatedProvider", String.class, Long.TYPE, Float.TYPE, Boolean.TYPE);
                    f1725 = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                Object objInvoke = f1725.invoke(null, str, Long.valueOf(c5845.m2513()), Float.valueOf(c5845.m18065()), Boolean.FALSE);
                if (objInvoke == null) {
                    return null;
                }
                if (f14489 == null) {
                    Method declaredMethod2 = f1724.getDeclaredMethod("setQuality", Integer.TYPE);
                    f14489 = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                f14489.invoke(objInvoke, Integer.valueOf(c5845.m18067()));
                if (f14490 == null) {
                    Method declaredMethod3 = f1724.getDeclaredMethod("setFastestInterval", Long.TYPE);
                    f14490 = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                f14490.invoke(objInvoke, Long.valueOf(c5845.m18066()));
                if (c5845.m18064() < Integer.MAX_VALUE) {
                    if (f14491 == null) {
                        Method declaredMethod4 = f1724.getDeclaredMethod("setNumUpdates", Integer.TYPE);
                        f14491 = declaredMethod4;
                        declaredMethod4.setAccessible(true);
                    }
                    f14491.invoke(objInvoke, Integer.valueOf(c5845.m18064()));
                }
                if (c5845.m2512() < Long.MAX_VALUE) {
                    if (f14492 == null) {
                        Method declaredMethod5 = f1724.getDeclaredMethod("setExpireIn", Long.TYPE);
                        f14492 = declaredMethod5;
                        declaredMethod5.setAccessible(true);
                    }
                    f14492.invoke(objInvoke, Long.valueOf(c5845.m2512()));
                }
                return objInvoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨ۠ۢ$ۥ۟ */
    @InterfaceC7113(31)
    public static class C0881 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static LocationRequest m2515(C5845 c5845) {
            return new LocationRequest.Builder(c5845.m2513()).setQuality(c5845.m18067()).setMinUpdateIntervalMillis(c5845.m18066()).setDurationMillis(c5845.m2512()).setMaxUpdates(c5845.m18064()).setMinUpdateDistanceMeters(c5845.m18065()).setMaxUpdateDelayMillis(c5845.m18063()).build();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨ۠ۢ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC5847 {
    }

    public C5845(long j, int i, long j2, int i2, long j3, float f, long j4) {
        this.f1723 = j;
        this.f1722 = i;
        this.f14484 = j3;
        this.f14485 = j2;
        this.f14486 = i2;
        this.f14487 = f;
        this.f14488 = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5845)) {
            return false;
        }
        C5845 c5845 = (C5845) obj;
        return this.f1722 == c5845.f1722 && this.f1723 == c5845.f1723 && this.f14484 == c5845.f14484 && this.f14485 == c5845.f14485 && this.f14486 == c5845.f14486 && Float.compare(c5845.f14487, this.f14487) == 0 && this.f14488 == c5845.f14488;
    }

    public int hashCode() {
        int i = this.f1722 * 31;
        long j = this.f1723;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f14484;
        return i2 + ((int) (j2 ^ (j2 >>> 32)));
    }

    @InterfaceC6391
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        if (this.f1723 != Long.MAX_VALUE) {
            sb.append("@");
            C7818.m24804(this.f1723, sb);
            int i = this.f1722;
            if (i == 100) {
                sb.append(" HIGH_ACCURACY");
            } else if (i == 102) {
                sb.append(" BALANCED");
            } else if (i == 104) {
                sb.append(" LOW_POWER");
            }
        } else {
            sb.append("PASSIVE");
        }
        if (this.f14485 != Long.MAX_VALUE) {
            sb.append(", duration=");
            C7818.m24804(this.f14485, sb);
        }
        if (this.f14486 != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.f14486);
        }
        long j = this.f14484;
        if (j != -1 && j < this.f1723) {
            sb.append(", minUpdateInterval=");
            C7818.m24804(this.f14484, sb);
        }
        if (this.f14487 > 0.0d) {
            sb.append(", minUpdateDistance=");
            sb.append(this.f14487);
        }
        if (this.f14488 / 2 > this.f1723) {
            sb.append(", maxUpdateDelay=");
            C7818.m24804(this.f14488, sb);
        }
        sb.append(']');
        return sb.toString();
    }

    @InterfaceC5459(from = 1)
    /* JADX INFO: renamed from: ۥ */
    public long m2512() {
        return this.f14485;
    }

    @InterfaceC5459(from = 0)
    /* JADX INFO: renamed from: ۥ۟ */
    public long m2513() {
        return this.f1723;
    }

    @InterfaceC5459(from = 0)
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public long m18063() {
        return this.f14488;
    }

    @InterfaceC5459(from = 1, m2228to = 2147483647L)
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int m18064() {
        return this.f14486;
    }

    @InterfaceC4885(from = 0.0d, m1796to = 3.4028234663852886E38d)
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float m18065() {
        return this.f14487;
    }

    @InterfaceC5459(from = 0)
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public long m18066() {
        long j = this.f14484;
        return j == -1 ? this.f1723 : j;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m18067() {
        return this.f1722;
    }

    @InterfaceC6391
    @InterfaceC7113(31)
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public LocationRequest m18068() {
        return C0881.m2515(this);
    }

    @InterfaceC6490
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public LocationRequest m18069(@InterfaceC6391 String str) {
        return Build.VERSION.SDK_INT >= 31 ? m18068() : C5844.m2511(C0880.m2514(this, str));
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨ۠ۢ$ۥ۟۟, reason: contains not printable characters */
    public static final class C5846 {

        /* JADX INFO: renamed from: ۥ */
        public long f1726;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f1727;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public long f14493;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f14494;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public long f14495;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public float f14496;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public long f14497;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C5846(long j) {
            m18071(j);
            this.f1727 = 102;
            this.f14493 = Long.MAX_VALUE;
            this.f14494 = Integer.MAX_VALUE;
            this.f14495 = -1L;
            this.f14496 = 0.0f;
            this.f14497 = 0L;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public C5845 m2516() {
            C6740.m21418((this.f1726 == Long.MAX_VALUE && this.f14495 == -1) ? false : true, "passive location requests must have an explicit minimum update interval");
            long j = this.f1726;
            return new C5845(j, this.f1727, this.f14493, this.f14494, Math.min(this.f14495, j), this.f14496, this.f14497);
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟ */
        public C5846 m2517() {
            this.f14495 = -1L;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public C5846 m18070(@InterfaceC5459(from = 1) long j) {
            this.f14493 = C6740.m21411(j, 1L, Long.MAX_VALUE, "durationMillis");
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public C5846 m18071(@InterfaceC5459(from = 0) long j) {
            this.f1726 = C6740.m21411(j, 0L, Long.MAX_VALUE, "intervalMillis");
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public C5846 m18072(@InterfaceC5459(from = 0) long j) {
            this.f14497 = j;
            this.f14497 = C6740.m21411(j, 0L, Long.MAX_VALUE, "maxUpdateDelayMillis");
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public C5846 m18073(@InterfaceC5459(from = 1, m2228to = 2147483647L) int i) {
            this.f14494 = C6740.m21410(i, 1, Integer.MAX_VALUE, "maxUpdates");
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public C5846 m18074(@InterfaceC4885(from = 0.0d, m1796to = 3.4028234663852886E38d) float f) {
            this.f14496 = f;
            this.f14496 = C6740.m21409(f, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public C5846 m18075(@InterfaceC5459(from = 0) long j) {
            this.f14495 = C6740.m21411(j, 0L, Long.MAX_VALUE, "minUpdateIntervalMillis");
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public C5846 m18076(int i) {
            C6740.m21406(i == 104 || i == 102 || i == 100, "quality must be a defined QUALITY constant, not %d", Integer.valueOf(i));
            this.f1727 = i;
            return this;
        }

        public C5846(@InterfaceC6391 C5845 c5845) {
            this.f1726 = c5845.f1723;
            this.f1727 = c5845.f1722;
            this.f14493 = c5845.f14485;
            this.f14494 = c5845.f14486;
            this.f14495 = c5845.f14484;
            this.f14496 = c5845.f14487;
            this.f14497 = c5845.f14488;
        }
    }
}
