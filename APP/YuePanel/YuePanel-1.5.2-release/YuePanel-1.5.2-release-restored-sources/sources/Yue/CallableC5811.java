package Yue;

import Yue.C5812;
import android.location.LocationManager;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC5811 implements Callable {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ LocationManager f1699;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ C5812.C5820 f1700;

    public /* synthetic */ CallableC5811(LocationManager locationManager, C5812.C5820 c5820) {
        this.f1699 = locationManager;
        this.f1700 = c5820;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C5812.m18008(this.f1699, this.f1700);
    }
}
