package Yue;

import Yue.C6283;
import androidx.constraintlayout.widget.C8770;

/* JADX INFO: renamed from: Yue.ۥۢۢ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7973 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f3152 = "TransitionBuilder";

    /* JADX INFO: renamed from: ۥ */
    public static C6283.C0952 m3990(C6283 c6283, int i, int i2, C8770 c8770, int i3, C8770 c87702) {
        C6283.C0952 c0952 = new C6283.C0952(i, c6283, i2, i3);
        m3991(c6283, c0952, c8770, c87702);
        return c0952;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m3991(C6283 c6283, C6283.C0952 c0952, C8770 c8770, C8770 c87702) {
        int iM19557 = c0952.m19557();
        int iM19550 = c0952.m19550();
        c6283.m19518(iM19557, c8770);
        c6283.m19518(iM19550, c87702);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m25146(C6273 c6273) {
        C6283 c6283 = c6273.f15620;
        if (c6283 == null) {
            throw new RuntimeException("Invalid motion layout. Layout missing Motion Scene.");
        }
        if (!c6283.m19526(c6273)) {
            throw new RuntimeException("MotionLayout doesn't have the right motion scene.");
        }
        if (c6283.f15769 == null || c6283.m19484().isEmpty()) {
            throw new RuntimeException("Invalid motion layout. Motion Scene doesn't have any transition.");
        }
    }
}
