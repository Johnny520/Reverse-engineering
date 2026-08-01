package p083fc;

import android.os.Looper;
import ec.AbstractC2135g2;
import java.util.List;
import p145jc.InterfaceC3827r;
import p376zd.C10010p0;

/* JADX INFO: renamed from: fc.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2413a implements InterfaceC3827r {
    @Override // p145jc.InterfaceC3827r
    /* JADX INFO: renamed from: a */
    public String mo8704a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // p145jc.InterfaceC3827r
    /* JADX INFO: renamed from: b */
    public AbstractC2135g2 mo8705b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C2418f(AbstractC2420h.m8714a(mainLooper, true), null, 2, null);
        }
        C10010p0.m38820a("The main looper is not available");
        return null;
    }

    @Override // p145jc.InterfaceC3827r
    /* JADX INFO: renamed from: c */
    public int mo8706c() {
        return 1073741823;
    }
}
