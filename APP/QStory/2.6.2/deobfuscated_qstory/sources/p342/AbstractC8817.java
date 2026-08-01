package p342;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.AbstractC3056;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Ref$ObjectRef;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p162.AbstractC7652;

/* JADX INFO: renamed from: 飘花落叶言苏哲世子楪兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8817 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Handler f24803 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static boolean m14461(Context context) {
        Object systemService = context.getSystemService("location");
        "null cannot be cast to non-null type android.location.LocationManager";
        systemService.getClass();
        LocationManager locationManager = (LocationManager) systemService;
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m14462(Context context, Location location) throws IOException {
        List<Address> fromLocation = new Geocoder(context, Locale.getDefault()).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
        if (fromLocation == null || fromLocation.isEmpty()) {
            return "";
        }
        Address address = fromLocation.get(0);
        return address.getCountryName() + SignatureVisitor.SUPER + address.getAddressLine(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Location m14463(LocationManager locationManager, String str, long j) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        C8818 c8818 = new C8818(ref$ObjectRef, countDownLatch);
        try {
            try {
                locationManager.requestLocationUpdates(str, 0L, 0.0f, c8818);
                boolean zAwait = countDownLatch.await(j, TimeUnit.MILLISECONDS);
                locationManager.removeUpdates(c8818);
                if (zAwait) {
                    return (Location) ref$ObjectRef.element;
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
            return null;
        } catch (Exception unused2) {
            locationManager.removeUpdates(c8818);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m14464(Context context) {
        int iM12891 = AbstractC7652.m12891(context, "android.permission.ACCESS_FINE_LOCATION");
        int iM128912 = AbstractC7652.m12891(context, "android.permission.ACCESS_COARSE_LOCATION");
        if ((iM12891 != 0 && iM128912 != 0) || !m14461(context)) {
            return "";
        }
        Object systemService = context.getSystemService("location");
        "null cannot be cast to non-null type android.location.LocationManager";
        systemService.getClass();
        LocationManager locationManager = (LocationManager) systemService;
        if (locationManager.isProviderEnabled("gps")) {
            try {
                Location locationM14463 = m14463(locationManager, "gps", 15000L);
                if (locationM14463 != null) {
                    return m14462(context, locationM14463);
                }
            } catch (TimeoutException unused) {
            }
        }
        if (locationManager.isProviderEnabled("network")) {
            try {
                Location locationM144632 = m14463(locationManager, "network", 5000L);
                if (locationM144632 != null) {
                    return m14462(context, locationM144632);
                }
            } catch (TimeoutException unused2) {
            }
        }
        return "";
    }
}
