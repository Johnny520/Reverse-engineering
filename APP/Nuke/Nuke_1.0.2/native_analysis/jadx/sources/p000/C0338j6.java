package p000;

import android.content.ClipboardManager;
import android.content.Context;

/* JADX INFO: renamed from: j6 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0338j6 implements InterfaceC0706st {

    /* JADX INFO: renamed from: a */
    public final Context f4897a;

    /* JADX INFO: renamed from: b */
    public ClipboardManager f4898b;

    public C0338j6(Context context) {
        this.f4897a = context;
    }

    /* JADX INFO: renamed from: a */
    public final ClipboardManager m2455a() {
        ClipboardManager clipboardManager = this.f4898b;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Object systemService = this.f4897a.getSystemService("clipboard");
        systemService.getClass();
        ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
        this.f4898b = clipboardManager2;
        return clipboardManager2;
    }
}
