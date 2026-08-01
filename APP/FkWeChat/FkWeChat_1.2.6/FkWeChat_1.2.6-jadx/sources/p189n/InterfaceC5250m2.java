package p189n;

import android.os.Build;
import android.view.View;
import p121i3.InterfaceC3175e;
import p215oc.C5725t;

/* JADX INFO: renamed from: n.m2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5250m2 {

    /* JADX INFO: renamed from: a */
    public static final a f16151a = a.f16152a;

    /* JADX INFO: renamed from: n.m2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a f16152a = new a();

        /* JADX INFO: renamed from: a */
        public final InterfaceC5250m2 m21487a() {
            if (AbstractC5308z1.m21640d(0, 1, null)) {
                return Build.VERSION.SDK_INT == 28 ? C5255n2.f16154b : C5260o2.f16176b;
            }
            C5725t.m23179a("Magnifier is only supported on API level 28 and higher.");
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo21485a();

    /* JADX INFO: renamed from: b */
    InterfaceC5245l2 mo21486b(View view, boolean z10, long j10, float f10, float f11, boolean z11, InterfaceC3175e interfaceC3175e, float f12);
}
