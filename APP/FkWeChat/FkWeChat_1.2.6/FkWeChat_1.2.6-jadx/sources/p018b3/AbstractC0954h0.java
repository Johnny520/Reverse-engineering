package p018b3;

import android.os.Build;
import android.view.inputmethod.InputConnection;
import p010a9.InterfaceC0184l;

/* JADX INFO: renamed from: b3.h0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0954h0 {
    /* JADX INFO: renamed from: a */
    public static final InterfaceInputConnectionC0935a0 m3482a(InputConnection inputConnection, InterfaceC0184l interfaceC0184l) {
        return Build.VERSION.SDK_INT >= 34 ? new C0952g0(inputConnection, interfaceC0184l) : new C0944d0(inputConnection, interfaceC0184l);
    }
}
