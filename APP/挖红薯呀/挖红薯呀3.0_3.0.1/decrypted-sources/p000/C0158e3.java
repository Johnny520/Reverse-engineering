package p000;

import android.content.ClipboardManager;
import android.content.Context;

/* JADX INFO: renamed from: e3 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0158e3 implements InterfaceC0761te {

    /* JADX INFO: renamed from: a */
    public final ClipboardManager f1281a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0158e3(Context context) {
        Object systemService = context.getSystemService("clipboard");
        systemService.getClass();
        this.f1281a = (ClipboardManager) systemService;
    }
}
