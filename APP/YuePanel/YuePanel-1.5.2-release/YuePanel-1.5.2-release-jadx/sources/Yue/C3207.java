package Yue;

import android.os.Looper;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3207 implements InterfaceC5919 {
    @Override // Yue.InterfaceC5919
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public String mo285() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // Yue.InterfaceC5919
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public AbstractC5912 mo286(@InterfaceC6399 List<? extends InterfaceC5919> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C5236(C5239.m16045(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // Yue.InterfaceC5919
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int mo6568() {
        return C5858.f14516;
    }
}
