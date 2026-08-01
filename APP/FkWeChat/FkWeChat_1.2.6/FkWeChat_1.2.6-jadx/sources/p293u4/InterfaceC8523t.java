package p293u4;

import android.content.Context;
import android.os.Build;
import p279t4.C8106a;

/* JADX INFO: renamed from: u4.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8523t {

    /* JADX INFO: renamed from: a */
    public static final a f28412a = a.f28413a;

    /* JADX INFO: renamed from: u4.t$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a f28413a = new a();

        /* JADX INFO: renamed from: a */
        public final InterfaceC8523t m32777a() {
            int i10 = Build.VERSION.SDK_INT;
            return i10 >= 34 ? C8525v.f28415b : i10 >= 30 ? C8524u.f28414b : C8526w.f28416b;
        }
    }

    /* JADX INFO: renamed from: a */
    C8106a mo32776a(Context context, InterfaceC8514k interfaceC8514k);
}
