package p368;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪兰世子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9695 implements LocationListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ CountDownLatch f25353;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f25354;

    public C9695(Ref$ObjectRef ref$ObjectRef, CountDownLatch countDownLatch) {
        this.f25354 = ref$ObjectRef;
        this.f25353 = countDownLatch;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        "location";
        location.getClass();
        this.f25354.element = location;
        this.f25353.countDown();
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        "provider";
        str.getClass();
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
        "provider";
        str.getClass();
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
