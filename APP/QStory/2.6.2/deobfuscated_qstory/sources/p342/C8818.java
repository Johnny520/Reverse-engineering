package p342;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.bumptech.glide.AbstractC3056;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: 飘花落叶言苏哲世子楪兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8818 implements LocationListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ CountDownLatch f24804;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f24805;

    public C8818(Ref$ObjectRef ref$ObjectRef, CountDownLatch countDownLatch) {
        this.f24805 = ref$ObjectRef;
        this.f24804 = countDownLatch;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        "location";
        location.getClass();
        this.f24805.element = location;
        this.f24804.countDown();
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
