package Yue;

import Yue.AbstractC3009;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4101<E> extends AbstractC2968<E> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public final ReentrantLock f8188;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6489
    public Object f8189;

    public C4101(@InterfaceC6489 InterfaceC5124<? super E, C8107> interfaceC5124) {
        super(interfaceC5124);
        this.f8188 = new ReentrantLock();
        this.f8189 = C2978.f4309;
    }

    @Override // Yue.AbstractC2968, Yue.InterfaceC7042
    public boolean isEmpty() {
        ReentrantLock reentrantLock = this.f8188;
        reentrantLock.lock();
        try {
            return m5736();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // Yue.AbstractC3009
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public String mo5849() {
        ReentrantLock reentrantLock = this.f8188;
        reentrantLock.lock();
        try {
            return "(value=" + this.f8189 + ')';
        } finally {
            reentrantLock.unlock();
        }
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
        InterfaceC7046<E> interfaceC7046Mo5727;
        ReentrantLock reentrantLock = this.f8188;
        reentrantLock.lock();
        try {
            C3850<?> c3850M5851 = m5851();
            if (c3850M5851 != null) {
                return c3850M5851;
            }
            if (this.f8189 == C2978.f4309) {
                do {
                    interfaceC7046Mo5727 = mo5727();
                    if (interfaceC7046Mo5727 != null) {
                        if (interfaceC7046Mo5727 instanceof C3850) {
                            return interfaceC7046Mo5727;
                        }
                        C5499.m17100(interfaceC7046Mo5727);
                    }
                } while (interfaceC7046Mo5727.mo5752(e, null) == null);
                C8107 c8107 = C8107.f3222;
                reentrantLock.unlock();
                interfaceC7046Mo5727.mo5753(e);
                return interfaceC7046Mo5727.mo10654();
            }
            C8100 c8100M11601 = m11601(e);
            if (c8100M11601 == null) {
                return C2978.f4310;
            }
            throw c8100M11601;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // Yue.AbstractC3009
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public Object mo5868(E e, @InterfaceC6399 InterfaceC7289<?> interfaceC7289) {
        Object objMo22759;
        ReentrantLock reentrantLock = this.f8188;
        reentrantLock.lock();
        try {
            C3850<?> c3850M5851 = m5851();
            if (c3850M5851 != null) {
                return c3850M5851;
            }
            if (this.f8189 == C2978.f4309) {
                do {
                    AbstractC3009.C3011<E> c3011M5847 = m5847(e);
                    objMo22759 = interfaceC7289.mo22759(c3011M5847);
                    if (objMo22759 == null) {
                        InterfaceC7046<? super E> interfaceC7046M18126 = c3011M5847.m18126();
                        C8107 c8107 = C8107.f3222;
                        reentrantLock.unlock();
                        C5499.m17100(interfaceC7046M18126);
                        InterfaceC7046<? super E> interfaceC7046 = interfaceC7046M18126;
                        interfaceC7046.mo5753(e);
                        return interfaceC7046.mo10654();
                    }
                    if (objMo22759 != C2978.f4311) {
                    }
                } while (objMo22759 == C3449.f296);
                if (objMo22759 != C7291.m22775() && !(objMo22759 instanceof C3850)) {
                    throw new IllegalStateException(("performAtomicTrySelect(describeTryOffer) returned " + objMo22759).toString());
                }
                return objMo22759;
            }
            if (!interfaceC7289.mo22760()) {
                return C7291.m22775();
            }
            C8100 c8100M11601 = m11601(e);
            if (c8100M11601 == null) {
                return C2978.f4310;
            }
            throw c8100M11601;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // Yue.AbstractC2968
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ */
    public boolean mo5731(@InterfaceC6399 AbstractC7041<? super E> abstractC7041) {
        ReentrantLock reentrantLock = this.f8188;
        reentrantLock.lock();
        try {
            return super.mo5731(abstractC7041);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // Yue.AbstractC2968
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ */
    public final boolean mo5734() {
        return false;
    }

    @Override // Yue.AbstractC2968
    /* JADX INFO: renamed from: ۥ۟۟ۤ */
    public final boolean mo5735() {
        ReentrantLock reentrantLock = this.f8188;
        reentrantLock.lock();
        try {
            return this.f8189 == C2978.f4309;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // Yue.AbstractC2968
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠ */
    public void mo5737(boolean z) {
        ReentrantLock reentrantLock = this.f8188;
        reentrantLock.lock();
        try {
            C8100 c8100M11601 = m11601(C2978.f4309);
            C8107 c8107 = C8107.f3222;
            reentrantLock.unlock();
            super.mo5737(z);
            if (c8100M11601 != null) {
                throw c8100M11601;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // Yue.AbstractC2968
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ */
    public Object mo5741() {
        ReentrantLock reentrantLock = this.f8188;
        reentrantLock.lock();
        try {
            Object obj = this.f8189;
            C7694 c7694 = C2978.f4309;
            if (obj != c7694) {
                this.f8189 = c7694;
                C8107 c8107 = C8107.f3222;
                return obj;
            }
            Object objM5851 = m5851();
            if (objM5851 == null) {
                objM5851 = C2978.f4312;
            }
            return objM5851;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // Yue.AbstractC2968
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ */
    public Object mo5742(@InterfaceC6399 InterfaceC7289<?> interfaceC7289) {
        ReentrantLock reentrantLock = this.f8188;
        reentrantLock.lock();
        try {
            Object obj = this.f8189;
            C7694 c7694 = C2978.f4309;
            if (obj == c7694) {
                Object objM5851 = m5851();
                if (objM5851 == null) {
                    objM5851 = C2978.f4312;
                }
                return objM5851;
            }
            if (!interfaceC7289.mo22760()) {
                return C7291.m22775();
            }
            Object obj2 = this.f8189;
            this.f8189 = c7694;
            C8107 c8107 = C8107.f3222;
            return obj2;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public final C8100 m11601(Object obj) {
        InterfaceC5124<E, C8107> interfaceC5124;
        Object obj2 = this.f8189;
        C8100 c8100M20875 = null;
        if (obj2 != C2978.f4309 && (interfaceC5124 = this.f4367) != null) {
            c8100M20875 = C6560.m20875(interfaceC5124, obj2, null, 2, null);
        }
        this.f8189 = obj;
        return c8100M20875;
    }
}
