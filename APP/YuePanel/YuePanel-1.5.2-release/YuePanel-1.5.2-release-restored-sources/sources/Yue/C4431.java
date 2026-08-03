package Yue;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4431 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f893 = "android.hardware.display.category.PRESENTATION";

    /* JADX INFO: renamed from: ۥ */
    public final Context f894;

    public C4431(Context context) {
        this.f894 = context;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static C4431 m12901(@InterfaceC6391 Context context) {
        return new C4431(context);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public Display m1389(int i) {
        return ((DisplayManager) this.f894.getSystemService("display")).getDisplay(i);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public Display[] m1390() {
        return ((DisplayManager) this.f894.getSystemService("display")).getDisplays();
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Display[] m12902(@InterfaceC6490 String str) {
        return ((DisplayManager) this.f894.getSystemService("display")).getDisplays();
    }
}
