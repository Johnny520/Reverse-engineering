package Yue;

import Yue.AbstractC5179;
import android.annotation.SuppressLint;
import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5812 {

    /* JADX INFO: renamed from: ۥ */
    public static final long f1701 = 30000;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final long f1702 = 10000;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final long f14423 = 5;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Field f14424;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Class<?> f14425;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static Method f14426;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static Method f14427;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC5225("sLocationListeners")
    public static final WeakHashMap<C5822, WeakReference<C5823>> f14428 = new WeakHashMap<>();

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨۤ$ۥ */
    public static class C0878 {

        /* JADX INFO: renamed from: ۥ */
        public static Class<?> f1703;

        /* JADX INFO: renamed from: ۥ۟ */
        public static Method f1704;

        @InterfaceC4482
        @SuppressLint({"BanUncheckedReflection"})
        /* JADX INFO: renamed from: ۥ */
        public static boolean m2491(LocationManager locationManager, String str, C5845 c5845, InterfaceC5808 interfaceC5808, Looper looper) {
            try {
                if (f1703 == null) {
                    f1703 = Class.forName("android.location.LocationRequest");
                }
                if (f1704 == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f1703, LocationListener.class, Looper.class);
                    f1704 = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest locationRequestM18069 = c5845.m18069(str);
                if (locationRequestM18069 == null) {
                    return false;
                }
                f1704.invoke(locationManager, locationRequestM18069, interfaceC5808, looper);
                return true;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                return false;
            }
        }

        @InterfaceC4482
        @InterfaceC7118(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @SuppressLint({"BanUncheckedReflection"})
        /* JADX INFO: renamed from: ۥ۟ */
        public static boolean m2492(LocationManager locationManager, String str, C5845 c5845, C5823 c5823) {
            try {
                if (f1703 == null) {
                    f1703 = Class.forName("android.location.LocationRequest");
                }
                if (f1704 == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f1703, LocationListener.class, Looper.class);
                    f1704 = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest locationRequestM18069 = c5845.m18069(str);
                if (locationRequestM18069 == null) {
                    return false;
                }
                synchronized (C5812.f14428) {
                    f1704.invoke(locationManager, locationRequestM18069, c5823, Looper.getMainLooper());
                    C5812.m18015(locationManager, c5823);
                }
                return true;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨۤ$ۥ۟ */
    @InterfaceC7113(24)
    public static class C0879 {
        @InterfaceC4482
        @InterfaceC7118("android.permission.ACCESS_FINE_LOCATION")
        /* JADX INFO: renamed from: ۥ */
        public static boolean m2493(@InterfaceC6391 LocationManager locationManager, @InterfaceC6391 GnssMeasurementsEvent.Callback callback) {
            return locationManager.registerGnssMeasurementsCallback(callback);
        }

        @InterfaceC4482
        @InterfaceC7118("android.permission.ACCESS_FINE_LOCATION")
        /* JADX INFO: renamed from: ۥ۟ */
        public static boolean m2494(@InterfaceC6391 LocationManager locationManager, @InterfaceC6391 GnssMeasurementsEvent.Callback callback, @InterfaceC6391 Handler handler) {
            return locationManager.registerGnssMeasurementsCallback(callback, handler);
        }

        @InterfaceC4482
        @InterfaceC7118(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean m18021(LocationManager locationManager, Handler handler, Executor executor, AbstractC5179.AbstractC0657 abstractC0657) {
            C6740.m3226(handler != null);
            C7467<Object, Object> c7467 = C5817.f1709;
            synchronized (c7467) {
                try {
                    C5824 c5824 = (C5824) c7467.get(abstractC0657);
                    if (c5824 == null) {
                        c5824 = new C5824(abstractC0657);
                    } else {
                        c5824.m18062();
                    }
                    c5824.m18061(executor);
                    if (!locationManager.registerGnssStatusCallback(c5824, handler)) {
                        return false;
                    }
                    c7467.put(abstractC0657, c5824);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m18022(@InterfaceC6391 LocationManager locationManager, @InterfaceC6391 GnssMeasurementsEvent.Callback callback) {
            locationManager.unregisterGnssMeasurementsCallback(callback);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static void m18023(LocationManager locationManager, Object obj) {
            if (obj instanceof C5824) {
                ((C5824) obj).m18062();
            }
            locationManager.unregisterGnssStatusCallback((GnssStatus.Callback) obj);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨۤ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(28)
    public static class C5813 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static String m2495(LocationManager locationManager) {
            return locationManager.getGnssHardwareModelName();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static int m2496(LocationManager locationManager) {
            return locationManager.getGnssYearOfHardware();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean m18024(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨۤ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(30)
    public static class C5814 {

        /* JADX INFO: renamed from: ۥ */
        public static Class<?> f1705;

        /* JADX INFO: renamed from: ۥ۟ */
        public static Method f1706;

        @InterfaceC4482
        @InterfaceC7118(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        /* JADX INFO: renamed from: ۥ */
        public static void m2497(LocationManager locationManager, @InterfaceC6391 String str, @InterfaceC6490 CancellationSignal cancellationSignal, @InterfaceC6391 Executor executor, @InterfaceC6391 final InterfaceC4144<Location> interfaceC4144) {
            Objects.requireNonNull(interfaceC4144);
            locationManager.getCurrentLocation(str, cancellationSignal, executor, new Consumer() { // from class: Yue.ۥ۠ۧۨۥ
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    interfaceC4144.accept((Location) obj);
                }
            });
        }

        @InterfaceC4482
        @InterfaceC7118(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        /* JADX INFO: renamed from: ۥ۟ */
        public static boolean m2498(LocationManager locationManager, Handler handler, Executor executor, AbstractC5179.AbstractC0657 abstractC0657) {
            C7467<Object, Object> c7467 = C5817.f1709;
            synchronized (c7467) {
                try {
                    C5819 c5819 = (C5819) c7467.get(abstractC0657);
                    if (c5819 == null) {
                        c5819 = new C5819(abstractC0657);
                    }
                    if (!locationManager.registerGnssStatusCallback(executor, c5819)) {
                        return false;
                    }
                    c7467.put(abstractC0657, c5819);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean m18025(LocationManager locationManager, String str, C5845 c5845, Executor executor, InterfaceC5808 interfaceC5808) {
            if (Build.VERSION.SDK_INT < 30) {
                return false;
            }
            try {
                if (f1705 == null) {
                    f1705 = Class.forName("android.location.LocationRequest");
                }
                if (f1706 == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f1705, Executor.class, LocationListener.class);
                    f1706 = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest locationRequestM18069 = c5845.m18069(str);
                if (locationRequestM18069 == null) {
                    return false;
                }
                f1706.invoke(locationManager, locationRequestM18069, executor, interfaceC5808);
                return true;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨۤ$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(31)
    public static class C5815 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static boolean m2499(LocationManager locationManager, @InterfaceC6391 String str) {
            return locationManager.hasProvider(str);
        }

        @InterfaceC4482
        @InterfaceC7118("android.permission.ACCESS_FINE_LOCATION")
        /* JADX INFO: renamed from: ۥ۟ */
        public static boolean m2500(@InterfaceC6391 LocationManager locationManager, @InterfaceC6391 Executor executor, @InterfaceC6391 GnssMeasurementsEvent.Callback callback) {
            return locationManager.registerGnssMeasurementsCallback(executor, callback);
        }

        @InterfaceC4482
        @InterfaceC7118(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m18026(LocationManager locationManager, @InterfaceC6391 String str, @InterfaceC6391 LocationRequest locationRequest, @InterfaceC6391 Executor executor, @InterfaceC6391 LocationListener locationListener) {
            locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨۤ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C5816 implements LocationListener {

        /* JADX INFO: renamed from: ۥ */
        public final LocationManager f1707;

        /* JADX INFO: renamed from: ۥ۟ */
        public final Executor f1708;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Handler f14429 = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public InterfaceC4144<Location> f14430;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @InterfaceC5225("this")
        public boolean f14431;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        @InterfaceC6490
        public Runnable f14432;

        public C5816(LocationManager locationManager, Executor executor, InterfaceC4144<Location> interfaceC4144) {
            this.f1707 = locationManager;
            this.f1708 = executor;
            this.f14430 = interfaceC4144;
        }

        @Override // android.location.LocationListener
        @InterfaceC7118(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onLocationChanged(@InterfaceC6490 final Location location) {
            synchronized (this) {
                try {
                    if (this.f14431) {
                        return;
                    }
                    this.f14431 = true;
                    final InterfaceC4144<Location> interfaceC4144 = this.f14430;
                    this.f1708.execute(new Runnable() { // from class: Yue.ۥ۠ۧۨۧ
                        @Override // java.lang.Runnable
                        public final void run() {
                            interfaceC4144.accept(location);
                        }
                    });
                    m18029();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.location.LocationListener
        @InterfaceC7118(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onProviderDisabled(@InterfaceC6391 String str) {
            onLocationChanged((Location) null);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@InterfaceC6391 String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
        }

        @InterfaceC7118(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m18028() {
            synchronized (this) {
                try {
                    if (this.f14431) {
                        return;
                    }
                    this.f14431 = true;
                    m18029();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @InterfaceC7118(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m18029() {
            this.f14430 = null;
            this.f1707.removeUpdates(this);
            Runnable runnable = this.f14432;
            if (runnable != null) {
                this.f14429.removeCallbacks(runnable);
                this.f14432 = null;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ void m18030() {
            this.f14432 = null;
            onLocationChanged((Location) null);
        }

        @SuppressLint({"MissingPermission"})
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m18031(long j) {
            synchronized (this) {
                try {
                    if (this.f14431) {
                        return;
                    }
                    Runnable runnable = new Runnable() { // from class: Yue.ۥ۠ۧۨۦ
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f14436.m18030();
                        }
                    };
                    this.f14432 = runnable;
                    this.f14429.postDelayed(runnable, j);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C5817 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC5225("sGnssStatusListeners")
        public static final C7467<Object, Object> f1709 = new C7467<>();

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC5225("sGnssMeasurementListeners")
        public static final C7467<GnssMeasurementsEvent.Callback, GnssMeasurementsEvent.Callback> f1710 = new C7467<>();
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC7113(24)
    public static class C5818 extends GnssMeasurementsEvent.Callback {

        /* JADX INFO: renamed from: ۥ */
        public final GnssMeasurementsEvent.Callback f1711;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6490
        public volatile Executor f1712;

        public C5818(@InterfaceC6391 GnssMeasurementsEvent.Callback callback, @InterfaceC6391 Executor executor) {
            this.f1711 = callback;
            this.f1712 = executor;
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onGnssMeasurementsReceived(final GnssMeasurementsEvent gnssMeasurementsEvent) {
            final Executor executor = this.f1712;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: Yue.ۥ۠ۧۨۨ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14439.m18032(executor, gnssMeasurementsEvent);
                }
            });
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onStatusChanged(final int i) {
            final Executor executor = this.f1712;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: Yue.ۥ۠ۨ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14442.m18033(executor, i);
                }
            });
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ void m18032(Executor executor, GnssMeasurementsEvent gnssMeasurementsEvent) {
            if (this.f1712 != executor) {
                return;
            }
            this.f1711.onGnssMeasurementsReceived(gnssMeasurementsEvent);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ void m18033(Executor executor, int i) {
            if (this.f1712 != executor) {
                return;
            }
            this.f1711.onStatusChanged(i);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m18034() {
            this.f1712 = null;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨۤ$ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(30)
    public static class C5819 extends GnssStatus.Callback {

        /* JADX INFO: renamed from: ۥ */
        public final AbstractC5179.AbstractC0657 f1713;

        public C5819(AbstractC5179.AbstractC0657 abstractC0657) {
            C6740.m3227(abstractC0657 != null, "invalid null callback");
            this.f1713 = abstractC0657;
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int i) {
            this.f1713.m1957(i);
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            this.f1713.m1958(AbstractC5179.m15863(gnssStatus));
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            this.f1713.m15876();
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            this.f1713.m15877();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static class C5820 implements GpsStatus.Listener {

        /* JADX INFO: renamed from: ۥ */
        public final LocationManager f1714;

        /* JADX INFO: renamed from: ۥ۟ */
        public final AbstractC5179.AbstractC0657 f1715;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6490
        public volatile Executor f14433;

        public C5820(LocationManager locationManager, AbstractC5179.AbstractC0657 abstractC0657) {
            C6740.m3227(abstractC0657 != null, "invalid null callback");
            this.f1714 = locationManager;
            this.f1715 = abstractC0657;
        }

        @Override // android.location.GpsStatus.Listener
        @InterfaceC7118("android.permission.ACCESS_FINE_LOCATION")
        public void onGpsStatusChanged(int i) {
            GpsStatus gpsStatus;
            final Executor executor = this.f14433;
            if (executor == null) {
                return;
            }
            if (i == 1) {
                executor.execute(new Runnable() { // from class: Yue.ۥ۠ۨ۟
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f14445.m18037(executor);
                    }
                });
                return;
            }
            if (i == 2) {
                executor.execute(new Runnable() { // from class: Yue.ۥ۠ۨ۟۟
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f14447.m18038(executor);
                    }
                });
                return;
            }
            if (i != 3) {
                if (i == 4 && (gpsStatus = this.f1714.getGpsStatus(null)) != null) {
                    final AbstractC5179 abstractC5179M15864 = AbstractC5179.m15864(gpsStatus);
                    executor.execute(new Runnable() { // from class: Yue.ۥ۠ۨ۟ۡ
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f14452.m18040(executor, abstractC5179M15864);
                        }
                    });
                    return;
                }
                return;
            }
            GpsStatus gpsStatus2 = this.f1714.getGpsStatus(null);
            if (gpsStatus2 != null) {
                final int timeToFirstFix = gpsStatus2.getTimeToFirstFix();
                executor.execute(new Runnable() { // from class: Yue.ۥ۠ۨ۟۠
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f14449.m18039(executor, timeToFirstFix);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ void m18037(Executor executor) {
            if (this.f14433 != executor) {
                return;
            }
            this.f1715.m15876();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ void m18038(Executor executor) {
            if (this.f14433 != executor) {
                return;
            }
            this.f1715.m15877();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ void m18039(Executor executor, int i) {
            if (this.f14433 != executor) {
                return;
            }
            this.f1715.m1957(i);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final /* synthetic */ void m18040(Executor executor, AbstractC5179 abstractC5179) {
            if (this.f14433 != executor) {
                return;
            }
            this.f1715.m1958(abstractC5179);
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void m18041(Executor executor) {
            C6740.m21417(this.f14433 == null);
            this.f14433 = executor;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m18042() {
            this.f14433 = null;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final class ExecutorC5821 implements Executor {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final Handler f14434;

        public ExecutorC5821(@InterfaceC6391 Handler handler) {
            this.f14434 = (Handler) C6740.m21415(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@InterfaceC6391 Runnable runnable) {
            if (Looper.myLooper() == this.f14434.getLooper()) {
                runnable.run();
            } else {
                if (this.f14434.post((Runnable) C6740.m21415(runnable))) {
                    return;
                }
                throw new RejectedExecutionException(this.f14434 + " is shutting down");
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static class C5822 {

        /* JADX INFO: renamed from: ۥ */
        public final String f1716;

        /* JADX INFO: renamed from: ۥ۟ */
        public final InterfaceC5808 f1717;

        public C5822(String str, InterfaceC5808 interfaceC5808) {
            this.f1716 = (String) C6499.m20593(str, "invalid null provider");
            this.f1717 = (InterfaceC5808) C6499.m20593(interfaceC5808, "invalid null listener");
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C5822)) {
                return false;
            }
            C5822 c5822 = (C5822) obj;
            return this.f1716.equals(c5822.f1716) && this.f1717.equals(c5822.f1717);
        }

        public int hashCode() {
            return C6499.m2996(this.f1716, this.f1717);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۨ, reason: contains not printable characters */
    @InterfaceC7113(24)
    public static class C5824 extends GnssStatus.Callback {

        /* JADX INFO: renamed from: ۥ */
        public final AbstractC5179.AbstractC0657 f1720;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6490
        public volatile Executor f1721;

        public C5824(AbstractC5179.AbstractC0657 abstractC0657) {
            C6740.m3227(abstractC0657 != null, "invalid null callback");
            this.f1720 = abstractC0657;
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(final int i) {
            final Executor executor = this.f1721;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: Yue.ۥ۠ۨ۟ۨ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14469.m18057(executor, i);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(final GnssStatus gnssStatus) {
            final Executor executor = this.f1721;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: Yue.ۥ۠ۨ۠
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14472.m18058(executor, gnssStatus);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            final Executor executor = this.f1721;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: Yue.ۥ۠ۨ۠۠
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14477.m18059(executor);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            final Executor executor = this.f1721;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: Yue.ۥ۠ۨ۠۟
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14475.m18060(executor);
                }
            });
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ void m18057(Executor executor, int i) {
            if (this.f1721 != executor) {
                return;
            }
            this.f1720.m1957(i);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ void m18058(Executor executor, GnssStatus gnssStatus) {
            if (this.f1721 != executor) {
                return;
            }
            this.f1720.m1958(AbstractC5179.m15863(gnssStatus));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ void m18059(Executor executor) {
            if (this.f1721 != executor) {
                return;
            }
            this.f1720.m15876();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final /* synthetic */ void m18060(Executor executor) {
            if (this.f1721 != executor) {
                return;
            }
            this.f1720.m15877();
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void m18061(Executor executor) {
            C6740.m3227(executor != null, "invalid null executor");
            C6740.m21417(this.f1721 == null);
            this.f1721 = executor;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m18062() {
            this.f1721 = null;
        }
    }

    @InterfaceC7118(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m18001(@InterfaceC6391 LocationManager locationManager, @InterfaceC6391 String str, @InterfaceC6490 C3674 c3674, @InterfaceC6391 Executor executor, @InterfaceC6391 InterfaceC4144<Location> interfaceC4144) {
        m18002(locationManager, str, c3674 != null ? (CancellationSignal) c3674.m742() : null, executor, interfaceC4144);
    }

    @InterfaceC7118(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m18002(@InterfaceC6391 LocationManager locationManager, @InterfaceC6391 String str, @InterfaceC6490 CancellationSignal cancellationSignal, @InterfaceC6391 Executor executor, @InterfaceC6391 final InterfaceC4144<Location> interfaceC4144) {
        if (Build.VERSION.SDK_INT >= 30) {
            C5814.m2497(locationManager, str, cancellationSignal, executor, interfaceC4144);
            return;
        }
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        final Location lastKnownLocation = locationManager.getLastKnownLocation(str);
        if (lastKnownLocation != null && SystemClock.elapsedRealtime() - C5803.m17952(lastKnownLocation) < 10000) {
            executor.execute(new Runnable() { // from class: Yue.ۥ۠ۧۨۡ
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC4144.accept(lastKnownLocation);
                }
            });
            return;
        }
        final C5816 c5816 = new C5816(locationManager, executor, interfaceC4144);
        locationManager.requestLocationUpdates(str, 0L, 0.0f, c5816, Looper.getMainLooper());
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: Yue.ۥ۠ۧۨۢ
                @Override // android.os.CancellationSignal.OnCancelListener
                public final void onCancel() {
                    c5816.m18028();
                }
            });
        }
        c5816.m18031(f1701);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static String m18003(@InterfaceC6391 LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C5813.m2495(locationManager);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static int m18004(@InterfaceC6391 LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C5813.m2496(locationManager);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static boolean m18005(@InterfaceC6391 LocationManager locationManager, @InterfaceC6391 String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C5815.m2499(locationManager, str);
        }
        if (locationManager.getAllProviders().contains(str)) {
            return true;
        }
        try {
            return locationManager.getProvider(str) != null;
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m18006(@InterfaceC6391 LocationManager locationManager) {
        return Build.VERSION.SDK_INT >= 28 ? C5813.m18024(locationManager) : locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ Boolean m18008(LocationManager locationManager, C5820 c5820) throws Exception {
        return Boolean.valueOf(locationManager.addGpsStatusListener(c5820));
    }

    @InterfaceC7118("android.permission.ACCESS_FINE_LOCATION")
    @InterfaceC7113(24)
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static boolean m18009(@InterfaceC6391 LocationManager locationManager, @InterfaceC6391 GnssMeasurementsEvent.Callback callback, @InterfaceC6391 Handler handler) {
        int i = Build.VERSION.SDK_INT;
        if (i > 30) {
            return C0879.m2494(locationManager, callback, handler);
        }
        if (i == 30) {
            return m18011(locationManager, C4745.m1664(handler), callback);
        }
        C7467<GnssMeasurementsEvent.Callback, GnssMeasurementsEvent.Callback> c7467 = C5817.f1710;
        synchronized (c7467) {
            try {
                m18019(locationManager, callback);
                if (!C0879.m2494(locationManager, callback, handler)) {
                    return false;
                }
                c7467.put(callback, callback);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC7118("android.permission.ACCESS_FINE_LOCATION")
    @InterfaceC7113(24)
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static boolean m18010(@InterfaceC6391 LocationManager locationManager, @InterfaceC6391 Executor executor, @InterfaceC6391 GnssMeasurementsEvent.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        if (i > 30) {
            return C5815.m2500(locationManager, executor, callback);
        }
        if (i == 30) {
            return m18011(locationManager, executor, callback);
        }
        C7467<GnssMeasurementsEvent.Callback, GnssMeasurementsEvent.Callback> c7467 = C5817.f1710;
        synchronized (c7467) {
            try {
                C5818 c5818 = new C5818(callback, executor);
                m18019(locationManager, callback);
                if (!C0879.m2493(locationManager, c5818)) {
                    return false;
                }
                c7467.put(callback, c5818);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC7113(30)
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static boolean m18011(@InterfaceC6391 LocationManager locationManager, @InterfaceC6391 Executor executor, @InterfaceC6391 GnssMeasurementsEvent.Callback callback) {
        if (Build.VERSION.SDK_INT != 30) {
            throw new IllegalStateException();
        }
        try {
            if (f14425 == null) {
                f14425 = Class.forName("android.location.GnssRequest$Builder");
            }
            if (f14426 == null) {
                Method declaredMethod = f14425.getDeclaredMethod("build", null);
                f14426 = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            if (f14427 == null) {
                Method declaredMethod2 = LocationManager.class.getDeclaredMethod("registerGnssMeasurementsCallback", Class.forName("android.location.GnssRequest"), Executor.class, GnssMeasurementsEvent.Callback.class);
                f14427 = declaredMethod2;
                declaredMethod2.setAccessible(true);
            }
            Object objInvoke = f14427.invoke(locationManager, f14426.invoke(f14425.getDeclaredConstructor(null).newInstance(null), null), executor, callback);
            if (objInvoke != null) {
                return ((Boolean) objInvoke).booleanValue();
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    @InterfaceC7118("android.permission.ACCESS_FINE_LOCATION")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static boolean m18012(@InterfaceC6391 LocationManager locationManager, @InterfaceC6391 AbstractC5179.AbstractC0657 abstractC0657, @InterfaceC6391 Handler handler) {
        return Build.VERSION.SDK_INT >= 30 ? m18014(locationManager, C4745.m1664(handler), abstractC0657) : m18014(locationManager, new ExecutorC5821(handler), abstractC0657);
    }

    @InterfaceC7118("android.permission.ACCESS_FINE_LOCATION")
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static boolean m18013(LocationManager locationManager, Handler handler, Executor executor, AbstractC5179.AbstractC0657 abstractC0657) {
        return Build.VERSION.SDK_INT >= 30 ? C5814.m2498(locationManager, handler, executor, abstractC0657) : C0879.m18021(locationManager, handler, executor, abstractC0657);
    }

    @InterfaceC7118("android.permission.ACCESS_FINE_LOCATION")
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static boolean m18014(@InterfaceC6391 LocationManager locationManager, @InterfaceC6391 Executor executor, @InterfaceC6391 AbstractC5179.AbstractC0657 abstractC0657) {
        if (Build.VERSION.SDK_INT >= 30) {
            return m18013(locationManager, null, executor, abstractC0657);
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        return m18013(locationManager, new Handler(looperMyLooper), executor, abstractC0657);
    }

    @InterfaceC5225("sLocationListeners")
    @InterfaceC7118(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static void m18015(LocationManager locationManager, C5823 c5823) {
        WeakReference<C5823> weakReferencePut = f14428.put(c5823.m18047(), new WeakReference<>(c5823));
        C5823 c58232 = weakReferencePut != null ? weakReferencePut.get() : null;
        if (c58232 != null) {
            c58232.m18054();
            locationManager.removeUpdates(c58232);
        }
    }

    @InterfaceC7118(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static void m18016(@InterfaceC6391 LocationManager locationManager, @InterfaceC6391 InterfaceC5808 interfaceC5808) {
        WeakHashMap<C5822, WeakReference<C5823>> weakHashMap = f14428;
        synchronized (weakHashMap) {
            try {
                Iterator<WeakReference<C5823>> it = weakHashMap.values().iterator();
                ArrayList arrayList = null;
                while (it.hasNext()) {
                    C5823 c5823 = it.next().get();
                    if (c5823 != null) {
                        C5822 c5822M18047 = c5823.m18047();
                        if (c5822M18047.f1717 == interfaceC5808) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(c5822M18047);
                            c5823.m18054();
                            locationManager.removeUpdates(c5823);
                        }
                    }
                }
                if (arrayList != null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        f14428.remove((C5822) it2.next());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        locationManager.removeUpdates(interfaceC5808);
    }

    @InterfaceC7118(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static void m18017(@InterfaceC6391 LocationManager locationManager, @InterfaceC6391 String str, @InterfaceC6391 C5845 c5845, @InterfaceC6391 InterfaceC5808 interfaceC5808, @InterfaceC6391 Looper looper) {
        if (Build.VERSION.SDK_INT >= 31) {
            C5815.m18026(locationManager, str, c5845.m18068(), C4745.m1664(new Handler(looper)), interfaceC5808);
        } else {
            if (C0878.m2491(locationManager, str, c5845, interfaceC5808, looper)) {
                return;
            }
            locationManager.requestLocationUpdates(str, c5845.m2513(), c5845.m18065(), interfaceC5808, looper);
        }
    }

    @InterfaceC7118(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static void m18018(@InterfaceC6391 LocationManager locationManager, @InterfaceC6391 String str, @InterfaceC6391 C5845 c5845, @InterfaceC6391 Executor executor, @InterfaceC6391 InterfaceC5808 interfaceC5808) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            C5815.m18026(locationManager, str, c5845.m18068(), executor, interfaceC5808);
            return;
        }
        if (i < 30 || !C5814.m18025(locationManager, str, c5845, executor, interfaceC5808)) {
            C5823 c5823 = new C5823(new C5822(str, interfaceC5808), executor);
            if (C0878.m2492(locationManager, str, c5845, c5823)) {
                return;
            }
            synchronized (f14428) {
                locationManager.requestLocationUpdates(str, c5845.m2513(), c5845.m18065(), c5823, Looper.getMainLooper());
                m18015(locationManager, c5823);
            }
        }
    }

    @InterfaceC7113(24)
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static void m18019(@InterfaceC6391 LocationManager locationManager, @InterfaceC6391 GnssMeasurementsEvent.Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            C0879.m18022(locationManager, callback);
            return;
        }
        C7467<GnssMeasurementsEvent.Callback, GnssMeasurementsEvent.Callback> c7467 = C5817.f1710;
        synchronized (c7467) {
            try {
                GnssMeasurementsEvent.Callback callbackRemove = c7467.remove(callback);
                if (callbackRemove != null) {
                    if (callbackRemove instanceof C5818) {
                        ((C5818) callbackRemove).m18034();
                    }
                    C0879.m18022(locationManager, callbackRemove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static void m18020(@InterfaceC6391 LocationManager locationManager, @InterfaceC6391 AbstractC5179.AbstractC0657 abstractC0657) {
        C7467<Object, Object> c7467 = C5817.f1709;
        synchronized (c7467) {
            try {
                Object objRemove = c7467.remove(abstractC0657);
                if (objRemove != null) {
                    C0879.m18023(locationManager, objRemove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static class C5823 implements LocationListener {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6490
        public volatile C5822 f1718;

        /* JADX INFO: renamed from: ۥ۟ */
        public final Executor f1719;

        public C5823(@InterfaceC6490 C5822 c5822, Executor executor) {
            this.f1718 = c5822;
            this.f1719 = executor;
        }

        @Override // android.location.LocationListener
        public void onFlushComplete(final int i) {
            if (this.f1718 == null) {
                return;
            }
            this.f1719.execute(new Runnable() { // from class: Yue.ۥ۠ۨ۟ۦ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14463.m18048(i);
                }
            });
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.location.LocationListener
        public void onLocationChanged(@InterfaceC6391 final Location location) {
            if (this.f1718 == null) {
                return;
            }
            this.f1719.execute(new Runnable() { // from class: Yue.ۥ۠ۨ۟ۥ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14461.m18049(location);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(@InterfaceC6391 final String str) {
            if (this.f1718 == null) {
                return;
            }
            this.f1719.execute(new Runnable() { // from class: Yue.ۥۣ۠ۨ۟
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14457.m18051(str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@InterfaceC6391 final String str) {
            if (this.f1718 == null) {
                return;
            }
            this.f1719.execute(new Runnable() { // from class: Yue.ۥ۠ۨ۟ۢ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14455.m18052(str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(final String str, final int i, final Bundle bundle) {
            if (this.f1718 == null) {
                return;
            }
            this.f1719.execute(new Runnable() { // from class: Yue.ۥ۠ۨ۟ۧ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14465.m18053(str, i, bundle);
                }
            });
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public C5822 m18047() {
            return (C5822) C6499.m20592(this.f1718);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final /* synthetic */ void m18048(int i) {
            C5822 c5822 = this.f1718;
            if (c5822 == null) {
                return;
            }
            c5822.f1717.onFlushComplete(i);
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ void m18049(Location location) {
            C5822 c5822 = this.f1718;
            if (c5822 == null) {
                return;
            }
            c5822.f1717.onLocationChanged(location);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final /* synthetic */ void m18050(List list) {
            C5822 c5822 = this.f1718;
            if (c5822 == null) {
                return;
            }
            c5822.f1717.onLocationChanged((List<Location>) list);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final /* synthetic */ void m18051(String str) {
            C5822 c5822 = this.f1718;
            if (c5822 == null) {
                return;
            }
            c5822.f1717.onProviderDisabled(str);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final /* synthetic */ void m18052(String str) {
            C5822 c5822 = this.f1718;
            if (c5822 == null) {
                return;
            }
            c5822.f1717.onProviderEnabled(str);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final /* synthetic */ void m18053(String str, int i, Bundle bundle) {
            C5822 c5822 = this.f1718;
            if (c5822 == null) {
                return;
            }
            c5822.f1717.onStatusChanged(str, i, bundle);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public void m18054() {
            this.f1718 = null;
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@InterfaceC6391 final List<Location> list) {
            if (this.f1718 == null) {
                return;
            }
            this.f1719.execute(new Runnable() { // from class: Yue.ۥ۠ۨ۟ۤ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14459.m18050(list);
                }
            });
        }
    }
}
