package p357y1;

import android.content.ClipboardManager;
import android.content.Context;

/* JADX INFO: renamed from: y1.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5890i implements InterfaceC5959z0 {

    /* JADX INFO: renamed from: a */
    public final Context f23943a;

    /* JADX INFO: renamed from: b */
    public ClipboardManager f23944b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5890i(Context context) {
        this.f23943a = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final ClipboardManager m10610a() {
        ClipboardManager clipboardManager = this.f23944b;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Object systemService = this.f23943a.getSystemService("clipboard");
        systemService.getClass();
        ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
        this.f23944b = clipboardManager2;
        return clipboardManager2;
    }
}
