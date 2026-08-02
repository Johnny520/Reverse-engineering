package p000;

import android.content.ClipData;
import android.os.Build;

/* JADX INFO: renamed from: i6 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0303i6 implements InterfaceC0668rt {

    /* JADX INFO: renamed from: a */
    public final C0338j6 f4283a;

    public C0303i6(C0338j6 c0338j6) {
        this.f4283a = c0338j6;
    }

    /* JADX INFO: renamed from: a */
    public final void m2279a(C0631qt c0631qt) {
        C0338j6 c0338j6 = this.f4283a;
        if (c0631qt != null) {
            c0338j6.m2455a().setPrimaryClip(c0631qt.f9158a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            c0338j6.m2455a().clearPrimaryClip();
        } else {
            c0338j6.m2455a().setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
