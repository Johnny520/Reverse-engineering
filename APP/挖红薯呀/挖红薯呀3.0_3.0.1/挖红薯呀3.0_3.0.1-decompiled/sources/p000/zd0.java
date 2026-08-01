package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public interface zd0 extends l30 {
    /* JADX INFO: renamed from: E */
    yd0 mo1278E(int i, int i2, Map map, InterfaceC0742sw interfaceC0742sw, InterfaceC0742sw interfaceC0742sw2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    default yd0 mo1279Q(int i, int i2, Map map, InterfaceC0742sw interfaceC0742sw) {
        return mo1278E(i, i2, map, null, interfaceC0742sw);
    }
}
