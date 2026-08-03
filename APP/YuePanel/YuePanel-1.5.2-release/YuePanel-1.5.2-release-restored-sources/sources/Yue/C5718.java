package Yue;

import Yue.AbstractC3009;
import java.util.ArrayList;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5718<E> extends AbstractC2968<E> {
    public C5718(@InterfaceC6489 InterfaceC5124<? super E, C8107> interfaceC5124) {
        super(interfaceC5124);
    }

    @Override // Yue.AbstractC3009
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public final boolean mo5861() {
        return false;
    }

    @Override // Yue.AbstractC3009
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
    public final boolean mo5862() {
        return false;
    }

    @Override // Yue.AbstractC3009
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
    public Object mo5865(E e) {
        InterfaceC7046<?> interfaceC7046M5871;
        do {
            Object objMo5865 = super.mo5865(e);
            C7694 c7694 = C2978.f4310;
            if (objMo5865 == c7694) {
                return c7694;
            }
            if (objMo5865 != C2978.f4311) {
                if (objMo5865 instanceof C3850) {
                    return objMo5865;
                }
                throw new IllegalStateException(("Invalid offerInternal result " + objMo5865).toString());
            }
            interfaceC7046M5871 = m5871(e);
            if (interfaceC7046M5871 == null) {
                return c7694;
            }
        } while (!(interfaceC7046M5871 instanceof C3850));
        return interfaceC7046M5871;
    }

    @Override // Yue.AbstractC3009
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public Object mo5868(E e, @InterfaceC6399 InterfaceC7289<?> interfaceC7289) {
        Object objMo22759;
        while (true) {
            if (m5733()) {
                objMo22759 = super.mo5868(e, interfaceC7289);
            } else {
                objMo22759 = interfaceC7289.mo22759(m5846(e));
                if (objMo22759 == null) {
                    objMo22759 = C2978.f4310;
                }
            }
            if (objMo22759 == C7291.m22775()) {
                return C7291.m22775();
            }
            C7694 c7694 = C2978.f4310;
            if (objMo22759 == c7694) {
                return c7694;
            }
            if (objMo22759 != C2978.f4311 && objMo22759 != C3449.f296) {
                if (objMo22759 instanceof C3850) {
                    return objMo22759;
                }
                throw new IllegalStateException(("Invalid result " + objMo22759).toString());
            }
        }
    }

    @Override // Yue.AbstractC2968
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ */
    public final boolean mo5734() {
        return true;
    }

    @Override // Yue.AbstractC2968
    /* JADX INFO: renamed from: ۥ۟۟ۤ */
    public final boolean mo5735() {
        return true;
    }

    @Override // Yue.AbstractC2968
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ */
    public void mo5738(@InterfaceC6399 Object obj, @InterfaceC6399 C3850<?> c3850) {
        C8100 c8100M20874 = null;
        if (obj != null) {
            if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                C8100 c8100M208742 = null;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    AbstractC7312 abstractC7312 = (AbstractC7312) arrayList.get(size);
                    if (abstractC7312 instanceof AbstractC3009.C0025) {
                        InterfaceC5124<E, C8107> interfaceC5124 = this.f4367;
                        c8100M208742 = interfaceC5124 != null ? C6560.m20874(interfaceC5124, ((AbstractC3009.C0025) abstractC7312).f4369, c8100M208742) : null;
                    } else {
                        abstractC7312.mo5876(c3850);
                    }
                }
                c8100M20874 = c8100M208742;
            } else {
                AbstractC7312 abstractC73122 = (AbstractC7312) obj;
                if (abstractC73122 instanceof AbstractC3009.C0025) {
                    InterfaceC5124<E, C8107> interfaceC51242 = this.f4367;
                    if (interfaceC51242 != null) {
                        c8100M20874 = C6560.m20874(interfaceC51242, ((AbstractC3009.C0025) abstractC73122).f4369, null);
                    }
                } else {
                    abstractC73122.mo5876(c3850);
                }
            }
        }
        if (c8100M20874 != null) {
            throw c8100M20874;
        }
    }
}
