package Yue;

import Yue.InterfaceC5599;
import Yue.InterfaceC5606;

/* JADX INFO: renamed from: Yue.ۥۡۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6301 extends AbstractC6307 implements InterfaceC5599 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC6301() {
    }

    @Override // Yue.AbstractC3648
    public InterfaceC5584 computeReflected() {
        return C7071.m22002(this);
    }

    @Override // Yue.InterfaceC5122
    public Object invoke() {
        return get();
    }

    @Override // Yue.InterfaceC5606
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥۣۣ۟۟ */
    public Object mo17384() {
        return ((InterfaceC5599) getReflected()).mo17384();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC7470(version = "1.1")
    public AbstractC6301(Object obj) {
        super(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: ۥ()LYue/ۥ۠ۦۤ۟$ۥ۟۟; */
    @Override // Yue.InterfaceC5604
    /* JADX INFO: renamed from: ۥ */
    public InterfaceC5606.InterfaceC0810 mo2313() {
        return ((InterfaceC5599) getReflected()).mo2313();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: ۥ۟()LYue/ۥ۠ۦۣۤ$ۥ; */
    @Override // Yue.InterfaceC5598
    /* JADX INFO: renamed from: ۥ۟ */
    public InterfaceC5599.InterfaceC0803 mo2310() {
        return ((InterfaceC5599) getReflected()).mo2310();
    }

    @InterfaceC7470(version = "1.4")
    public AbstractC6301(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
