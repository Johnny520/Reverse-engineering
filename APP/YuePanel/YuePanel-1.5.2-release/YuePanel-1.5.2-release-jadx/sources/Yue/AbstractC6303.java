package Yue;

import Yue.InterfaceC5600;
import Yue.InterfaceC5607;

/* JADX INFO: renamed from: Yue.ۥۡۡۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6303 extends AbstractC6307 implements InterfaceC5600 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC6303() {
    }

    @Override // Yue.AbstractC3648
    public InterfaceC5584 computeReflected() {
        return C7071.m22003(this);
    }

    @Override // Yue.InterfaceC5124
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // Yue.InterfaceC5607
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public Object mo17385(Object obj) {
        return ((InterfaceC5600) getReflected()).mo17385(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC7470(version = "1.1")
    public AbstractC6303(Object obj) {
        super(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: ۥ()LYue/ۥ۠ۦۤ۟$ۥ۟۟; */
    @Override // Yue.InterfaceC5604
    /* JADX INFO: renamed from: ۥ */
    public InterfaceC5607.InterfaceC0811 mo2313() {
        return ((InterfaceC5600) getReflected()).mo2313();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: ۥ۟()LYue/ۥ۠ۦۣۤ$ۥ; */
    @Override // Yue.InterfaceC5598
    /* JADX INFO: renamed from: ۥ۟ */
    public InterfaceC5600.InterfaceC0804 mo2310() {
        return ((InterfaceC5600) getReflected()).mo2310();
    }

    @InterfaceC7470(version = "1.4")
    public AbstractC6303(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
