package Yue;

import Yue.InterfaceC5608;

/* JADX INFO: renamed from: Yue.ۥۡۥۣۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6830 extends AbstractC6832 implements InterfaceC5608 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC6830() {
    }

    @Override // Yue.AbstractC3648
    public InterfaceC5584 computeReflected() {
        return C7071.m22014(this);
    }

    @Override // Yue.InterfaceC5138
    public Object invoke(Object obj, Object obj2) {
        return mo17386(obj, obj2);
    }

    @Override // Yue.InterfaceC5608
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ */
    public Object mo17387(Object obj, Object obj2) {
        return ((InterfaceC5608) getReflected()).mo17387(obj, obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC7470(version = "1.4")
    public AbstractC6830(Class cls, String str, String str2, int i) {
        super(AbstractC3648.NO_RECEIVER, cls, str, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: ۥ()LYue/ۥ۠ۦۤ۟$ۥ۟۟; */
    @Override // Yue.InterfaceC5604
    /* JADX INFO: renamed from: ۥ */
    public InterfaceC5608.InterfaceC0812 mo2313() {
        return ((InterfaceC5608) getReflected()).mo2313();
    }
}
