package p352;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Ref$ObjectRef;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p162.AbstractC7653;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪兰世子.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8865 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Handler f25007 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static boolean m14532(Context context) {
        Object systemService = context.getSystemService(AbstractC8405.m13972(1235));
        AbstractC8405.m13972(3261);
        systemService.getClass();
        LocationManager locationManager = (LocationManager) systemService;
        return locationManager.isProviderEnabled(AbstractC8405.m13973("喵喵喵呜喵呜喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜喵喵呜")) || locationManager.isProviderEnabled(AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵喵呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜喵呜喵"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m14533(Context context, Location location) throws IOException {
        List<Address> fromLocation = new Geocoder(context, Locale.getDefault()).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
        if (fromLocation == null || fromLocation.isEmpty()) {
            return "";
        }
        Address address = fromLocation.get(0);
        return address.getCountryName() + SignatureVisitor.SUPER + address.getAddressLine(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Location m14534(LocationManager locationManager, String str, long j) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        C8866 c8866 = new C8866(ref$ObjectRef, countDownLatch);
        try {
            try {
                locationManager.requestLocationUpdates(str, 0L, 0.0f, c8866);
                boolean zAwait = countDownLatch.await(j, TimeUnit.MILLISECONDS);
                locationManager.removeUpdates(c8866);
                if (zAwait) {
                    return (Location) ref$ObjectRef.element;
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
            return null;
        } catch (Exception unused2) {
            locationManager.removeUpdates(c8866);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m14535(Context context) {
        int iM12920 = AbstractC7653.m12920(context, AbstractC8405.m13972(3262));
        int iM129202 = AbstractC7653.m12920(context, AbstractC8405.m13972(3263));
        if ((iM12920 == 0 || iM129202 == 0) && m14532(context)) {
            Object systemService = context.getSystemService(AbstractC8405.m13972(1235));
            AbstractC8405.m13972(3261);
            systemService.getClass();
            LocationManager locationManager = (LocationManager) systemService;
            if (locationManager.isProviderEnabled(AbstractC8405.m13973("喵喵喵呜喵呜喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜喵喵呜"))) {
                try {
                    Location locationM14534 = m14534(locationManager, AbstractC8405.m13973("喵喵喵呜喵呜喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜喵喵呜"), 15000L);
                    if (locationM14534 != null) {
                        return m14533(context, locationM14534);
                    }
                } catch (TimeoutException unused) {
                }
            }
            if (locationManager.isProviderEnabled(AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵喵呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜喵呜喵"))) {
                try {
                    Location locationM145342 = m14534(locationManager, AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵喵呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜喵呜喵"), 5000L);
                    if (locationM145342 != null) {
                        return m14533(context, locationM145342);
                    }
                } catch (TimeoutException unused2) {
                }
            }
        }
        return "";
    }
}
