package p000;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vf3 extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0356jn f11936a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf3(C0356jn c0356jn, Handler handler) {
        super(handler);
        this.f11936a = c0356jn;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.f11936a.mo2225s(a83.f116a);
    }
}
