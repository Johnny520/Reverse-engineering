package Yue;

import android.annotation.SuppressLint;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5803 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f1696 = "mockLocation";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f1697 = "verticalAccuracy";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f14412 = "speedAccuracy";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f14413 = "bearingAccuracy";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String f14414 = "androidx.core.location.extra.MSL_ALTITUDE";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final String f14415 = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6490
    public static Method f14416;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6490
    public static Field f14417;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6490
    public static Integer f14418;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC6490
    public static Integer f14419;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC6490
    public static Integer f14420;

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨ$ۥ */
    @InterfaceC7113(26)
    public static class C0876 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static float m2477(Location location) {
            return location.getBearingAccuracyDegrees();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static float m2478(Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static float m17982(Location location) {
            return location.getVerticalAccuracyMeters();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static boolean m17983(Location location) {
            return location.hasBearingAccuracy();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static boolean m17984(Location location) {
            return location.hasSpeedAccuracy();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static boolean m17985(Location location) {
            return location.hasVerticalAccuracy();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static void m17986(Location location) {
            try {
                C5803.m17954().setByte(location, (byte) (C5803.m17954().getByte(location) & (~C5803.m17955())));
            } catch (IllegalAccessException e) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e);
                throw illegalAccessError;
            } catch (NoSuchFieldException e2) {
                NoSuchFieldError noSuchFieldError = new NoSuchFieldError();
                noSuchFieldError.initCause(e2);
                throw noSuchFieldError;
            }
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static void m17987(Location location) {
            try {
                C5803.m17954().setByte(location, (byte) (C5803.m17954().getByte(location) & (~C5803.m17956())));
            } catch (IllegalAccessException e) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e);
                throw illegalAccessError;
            } catch (NoSuchFieldException e2) {
                NoSuchFieldError noSuchFieldError = new NoSuchFieldError();
                noSuchFieldError.initCause(e2);
                throw noSuchFieldError;
            }
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static void m17988(Location location) {
            try {
                C5803.m17954().setByte(location, (byte) (C5803.m17954().getByte(location) & (~C5803.m17957())));
            } catch (IllegalAccessException | NoSuchFieldException e) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e);
                throw illegalAccessError;
            }
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static void m17989(Location location, float f) {
            location.setBearingAccuracyDegrees(f);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static void m17990(Location location, float f) {
            location.setSpeedAccuracyMetersPerSecond(f);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static void m17991(Location location, float f) {
            location.setVerticalAccuracyMeters(f);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨ$ۥ۟ */
    @InterfaceC7113(28)
    public static class C0877 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m2479(Location location) {
            if (location.hasBearingAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean zHasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean zHasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean zHasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean zHasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean zHasVerticalAccuracy = location.hasVerticalAccuracy();
                float verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                boolean zHasSpeedAccuracy = location.hasSpeedAccuracy();
                float speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (zHasAltitude) {
                    location.setAltitude(altitude);
                }
                if (zHasSpeed) {
                    location.setSpeed(speed);
                }
                if (zHasBearing) {
                    location.setBearing(bearing);
                }
                if (zHasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (zHasVerticalAccuracy) {
                    location.setVerticalAccuracyMeters(verticalAccuracyMeters);
                }
                if (zHasSpeedAccuracy) {
                    location.setBearingAccuracyDegrees(speedAccuracyMetersPerSecond);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m2480(Location location) {
            if (location.hasSpeedAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean zHasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean zHasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean zHasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean zHasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean zHasVerticalAccuracy = location.hasVerticalAccuracy();
                float verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                boolean zHasBearingAccuracy = location.hasBearingAccuracy();
                float bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (zHasAltitude) {
                    location.setAltitude(altitude);
                }
                if (zHasSpeed) {
                    location.setSpeed(speed);
                }
                if (zHasBearing) {
                    location.setBearing(bearing);
                }
                if (zHasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (zHasVerticalAccuracy) {
                    location.setVerticalAccuracyMeters(verticalAccuracyMeters);
                }
                if (zHasBearingAccuracy) {
                    location.setBearingAccuracyDegrees(bearingAccuracyDegrees);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m17992(Location location) {
            if (location.hasVerticalAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean zHasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean zHasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean zHasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean zHasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean zHasSpeedAccuracy = location.hasSpeedAccuracy();
                float speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                boolean zHasBearingAccuracy = location.hasBearingAccuracy();
                float bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (zHasAltitude) {
                    location.setAltitude(altitude);
                }
                if (zHasSpeed) {
                    location.setSpeed(speed);
                }
                if (zHasBearing) {
                    location.setBearing(bearing);
                }
                if (zHasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (zHasSpeedAccuracy) {
                    location.setSpeedAccuracyMetersPerSecond(speedAccuracyMetersPerSecond);
                }
                if (zHasBearingAccuracy) {
                    location.setBearingAccuracyDegrees(bearingAccuracyDegrees);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(29)
    public static class C5804 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m2481(Location location) {
            if (location.hasBearingAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                C0877.m2479(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m2482(Location location) {
            if (location.hasSpeedAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                C0877.m2480(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m17993(Location location) {
            if (location.hasVerticalAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                C0877.m17992(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(33)
    public static class C5805 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m2483(Location location) {
            location.removeBearingAccuracy();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m2484(Location location) {
            location.removeSpeedAccuracy();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m17994(Location location) {
            location.removeVerticalAccuracy();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨ$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(34)
    public static class C5806 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static float m2485(Location location) {
            return location.getMslAltitudeAccuracyMeters();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static double m2486(Location location) {
            return location.getMslAltitudeMeters();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean m17995(Location location) {
            return location.hasMslAltitude();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static boolean m17996(Location location) {
            return location.hasMslAltitudeAccuracy();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static void m17997(Location location) {
            location.removeMslAltitude();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static void m17998(Location location) {
            location.removeMslAltitudeAccuracy();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static void m17999(Location location, float f) {
            location.setMslAltitudeAccuracyMeters(f);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static void m18000(Location location, double d) {
            location.setMslAltitudeMeters(d);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static boolean m2475(@InterfaceC6391 Location location, String str) {
        Bundle extras = location.getExtras();
        return extras != null && extras.containsKey(str);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static float m2476(@InterfaceC6391 Location location) {
        return C0876.m2477(location);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static long m17952(@InterfaceC6391 Location location) {
        return TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static long m17953(@InterfaceC6391 Location location) {
        return location.getElapsedRealtimeNanos();
    }

    @SuppressLint({"BlockedPrivateApi"})
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Field m17954() throws NoSuchFieldException {
        if (f14417 == null) {
            Field declaredField = Location.class.getDeclaredField("mFieldsMask");
            f14417 = declaredField;
            declaredField.setAccessible(true);
        }
        return f14417;
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static int m17955() throws IllegalAccessException, NoSuchFieldException {
        if (f14419 == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_BEARING_ACCURACY_MASK");
            declaredField.setAccessible(true);
            f14419 = Integer.valueOf(declaredField.getInt(null));
        }
        return f14419.intValue();
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static int m17956() throws IllegalAccessException, NoSuchFieldException {
        if (f14418 == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_SPEED_ACCURACY_MASK");
            declaredField.setAccessible(true);
            f14418 = Integer.valueOf(declaredField.getInt(null));
        }
        return f14418.intValue();
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static int m17957() throws IllegalAccessException, NoSuchFieldException {
        if (f14420 == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_VERTICAL_ACCURACY_MASK");
            declaredField.setAccessible(true);
            f14420 = Integer.valueOf(declaredField.getInt(null));
        }
        return f14420.intValue();
    }

    @InterfaceC4885(from = 0.0d)
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static float m17958(@InterfaceC6391 Location location) {
        return Build.VERSION.SDK_INT >= 34 ? C5806.m2485(location) : m17960(location).getFloat(f14415);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static double m17959(@InterfaceC6391 Location location) {
        return Build.VERSION.SDK_INT >= 34 ? C5806.m2486(location) : m17960(location).getDouble(f14414);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static Bundle m17960(@InterfaceC6391 Location location) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            return extras;
        }
        location.setExtras(new Bundle());
        return location.getExtras();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static Method m17961() throws NoSuchMethodException {
        if (f14416 == null) {
            Method declaredMethod = Location.class.getDeclaredMethod("setIsFromMockProvider", Boolean.TYPE);
            f14416 = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f14416;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static float m17962(@InterfaceC6391 Location location) {
        return C0876.m2478(location);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static float m17963(@InterfaceC6391 Location location) {
        return C0876.m17982(location);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static boolean m17964(@InterfaceC6391 Location location) {
        return C0876.m17983(location);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static boolean m17965(@InterfaceC6391 Location location) {
        return Build.VERSION.SDK_INT >= 34 ? C5806.m17995(location) : m2475(location, f14414);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static boolean m17966(@InterfaceC6391 Location location) {
        return Build.VERSION.SDK_INT >= 34 ? C5806.m17996(location) : m2475(location, f14415);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static boolean m17967(@InterfaceC6391 Location location) {
        return C0876.m17984(location);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static boolean m17968(@InterfaceC6391 Location location) {
        return C0876.m17985(location);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static boolean m17969(@InterfaceC6391 Location location) {
        return location.isFromMockProvider();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static void m17970(@InterfaceC6391 Location location) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            C5805.m2483(location);
            return;
        }
        if (i >= 29) {
            C5804.m2481(location);
        } else if (i >= 28) {
            C0877.m2479(location);
        } else {
            C0876.m17986(location);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static void m17971(@InterfaceC6391 Location location, String str) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            extras.remove(str);
            if (extras.isEmpty()) {
                location.setExtras(null);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static void m17972(@InterfaceC6391 Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            C5806.m17997(location);
        } else {
            m17971(location, f14414);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static void m17973(@InterfaceC6391 Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            C5806.m17998(location);
        } else {
            m17971(location, f14415);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static void m17974(@InterfaceC6391 Location location) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            C5805.m2484(location);
            return;
        }
        if (i >= 29) {
            C5804.m2482(location);
        } else if (i >= 28) {
            C0877.m2480(location);
        } else {
            C0876.m17987(location);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static void m17975(@InterfaceC6391 Location location) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            C5805.m17994(location);
            return;
        }
        if (i >= 29) {
            C5804.m17993(location);
        } else if (i >= 28) {
            C0877.m17992(location);
        } else {
            C0876.m17988(location);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static void m17976(@InterfaceC6391 Location location, float f) {
        C0876.m17989(location, f);
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static void m17977(@InterfaceC6391 Location location, boolean z) {
        try {
            m17961().invoke(location, Boolean.valueOf(z));
        } catch (IllegalAccessException e) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e);
            throw illegalAccessError;
        } catch (NoSuchMethodException e2) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e2);
            throw noSuchMethodError;
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static void m17978(@InterfaceC6391 Location location, @InterfaceC4885(from = 0.0d) float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            C5806.m17999(location, f);
        } else {
            m17960(location).putFloat(f14415, f);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static void m17979(@InterfaceC6391 Location location, double d) {
        if (Build.VERSION.SDK_INT >= 34) {
            C5806.m18000(location, d);
        } else {
            m17960(location).putDouble(f14414, d);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static void m17980(@InterfaceC6391 Location location, float f) {
        C0876.m17990(location, f);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static void m17981(@InterfaceC6391 Location location, float f) {
        C0876.m17991(location, f);
    }
}
