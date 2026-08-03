package Yue;

import Yue.AbstractC2968;
import Yue.AbstractC3009;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3381<E> extends AbstractC2968<E> {

    @InterfaceC6399
    private volatile /* synthetic */ int size;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final int f5426;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public final EnumC3602 f5427;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @InterfaceC6399
    public final ReentrantLock f5428;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public Object[] f5429;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int f5430;

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۧ۟$ۥ */
    public /* synthetic */ class C0126 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f265;

        static {
            int[] iArr = new int[EnumC3602.values().length];
            iArr[EnumC3602.SUSPEND.ordinal()] = 1;
            iArr[EnumC3602.DROP_LATEST.ordinal()] = 2;
            iArr[EnumC3602.DROP_OLDEST.ordinal()] = 3;
            f265 = iArr;
        }
    }

    public C3381(int i, @InterfaceC6399 EnumC3602 enumC3602, @InterfaceC6489 InterfaceC5124<? super E, C8107> interfaceC5124) {
        super(interfaceC5124);
        this.f5426 = i;
        this.f5427 = enumC3602;
        if (i < 1) {
            throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i + " was specified").toString());
        }
        this.f5428 = new ReentrantLock();
        Object[] objArr = new Object[Math.min(i, 8)];
        C3404.m7201(objArr, C2978.f4309, 0, 0, 6, null);
        this.f5429 = objArr;
        this.size = 0;
    }

    @Override // Yue.AbstractC2968, Yue.InterfaceC7042
    public boolean isEmpty() {
        ReentrantLock reentrantLock = this.f5428;
        reentrantLock.lock();
        try {
            return m5736();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // Yue.AbstractC2968, Yue.InterfaceC7042
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public boolean mo5720() {
        ReentrantLock reentrantLock = this.f5428;
        reentrantLock.lock();
        try {
            return super.mo5720();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // Yue.AbstractC3009
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public Object mo5848(@InterfaceC6399 AbstractC7312 abstractC7312) {
        ReentrantLock reentrantLock = this.f5428;
        reentrantLock.lock();
        try {
            return super.mo5848(abstractC7312);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // Yue.AbstractC3009
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public String mo5849() {
        return "(buffer:capacity=" + this.f5426 + ",size=" + this.size + ')';
    }

    @Override // Yue.AbstractC3009
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public final boolean mo5861() {
        return false;
    }

    @Override // Yue.AbstractC3009
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
    public final boolean mo5862() {
        return this.size == this.f5426 && this.f5427 == EnumC3602.SUSPEND;
    }

    @Override // Yue.AbstractC3009
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
    public Object mo5865(E e) {
        InterfaceC7046<E> interfaceC7046Mo5727;
        ReentrantLock reentrantLock = this.f5428;
        reentrantLock.lock();
        try {
            int i = this.size;
            C3850<?> c3850M5851 = m5851();
            if (c3850M5851 != null) {
                return c3850M5851;
            }
            C7694 c7694M6959 = m6959(i);
            if (c7694M6959 != null) {
                return c7694M6959;
            }
            if (i == 0) {
                do {
                    interfaceC7046Mo5727 = mo5727();
                    if (interfaceC7046Mo5727 != null) {
                        if (interfaceC7046Mo5727 instanceof C3850) {
                            this.size = i;
                            return interfaceC7046Mo5727;
                        }
                        C5499.m17100(interfaceC7046Mo5727);
                    }
                } while (interfaceC7046Mo5727.mo5752(e, null) == null);
                this.size = i;
                C8107 c8107 = C8107.f3222;
                reentrantLock.unlock();
                interfaceC7046Mo5727.mo5753(e);
                return interfaceC7046Mo5727.mo10654();
            }
            m6957(i, e);
            return C2978.f4310;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // Yue.AbstractC3009
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public Object mo5868(E e, @InterfaceC6399 InterfaceC7289<?> interfaceC7289) {
        Object objMo22759;
        ReentrantLock reentrantLock = this.f5428;
        reentrantLock.lock();
        try {
            int i = this.size;
            C3850<?> c3850M5851 = m5851();
            if (c3850M5851 != null) {
                return c3850M5851;
            }
            C7694 c7694M6959 = m6959(i);
            if (c7694M6959 != null) {
                return c7694M6959;
            }
            if (i == 0) {
                do {
                    AbstractC3009.C3011<E> c3011M5847 = m5847(e);
                    objMo22759 = interfaceC7289.mo22759(c3011M5847);
                    if (objMo22759 == null) {
                        this.size = i;
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
                this.size = i;
                return objMo22759;
            }
            if (interfaceC7289.mo22760()) {
                m6957(i, e);
                return C2978.f4310;
            }
            this.size = i;
            return C7291.m22775();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // Yue.AbstractC2968
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ */
    public boolean mo5731(@InterfaceC6399 AbstractC7041<? super E> abstractC7041) {
        ReentrantLock reentrantLock = this.f5428;
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
        return this.size == 0;
    }

    @Override // Yue.AbstractC2968
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠ */
    public void mo5737(boolean z) {
        InterfaceC5124<E, C8107> interfaceC5124 = this.f4367;
        ReentrantLock reentrantLock = this.f5428;
        reentrantLock.lock();
        try {
            int i = this.size;
            C8100 c8100M20874 = null;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = this.f5429[this.f5430];
                if (interfaceC5124 != null && obj != C2978.f4309) {
                    c8100M20874 = C6560.m20874(interfaceC5124, obj, c8100M20874);
                }
                Object[] objArr = this.f5429;
                int i3 = this.f5430;
                objArr[i3] = C2978.f4309;
                this.f5430 = (i3 + 1) % objArr.length;
            }
            this.size = 0;
            C8107 c8107 = C8107.f3222;
            reentrantLock.unlock();
            super.mo5737(z);
            if (c8100M20874 != null) {
                throw c8100M20874;
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
        ReentrantLock reentrantLock = this.f5428;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object objM5851 = m5851();
                if (objM5851 == null) {
                    objM5851 = C2978.f4312;
                }
                return objM5851;
            }
            Object[] objArr = this.f5429;
            int i2 = this.f5430;
            Object obj = objArr[i2];
            AbstractC7312 abstractC7312 = null;
            objArr[i2] = null;
            this.size = i - 1;
            Object objMo5875 = C2978.f4312;
            boolean z = false;
            if (i == this.f5426) {
                AbstractC7312 abstractC73122 = null;
                while (true) {
                    AbstractC7312 abstractC7312M5873 = m5873();
                    if (abstractC7312M5873 == null) {
                        abstractC7312 = abstractC73122;
                        break;
                    }
                    C5499.m17100(abstractC7312M5873);
                    if (abstractC7312M5873.mo5877(null) != null) {
                        objMo5875 = abstractC7312M5873.mo5875();
                        z = true;
                        abstractC7312 = abstractC7312M5873;
                        break;
                    }
                    abstractC7312M5873.mo5878();
                    abstractC73122 = abstractC7312M5873;
                }
            }
            if (objMo5875 != C2978.f4312 && !(objMo5875 instanceof C3850)) {
                this.size = i;
                Object[] objArr2 = this.f5429;
                objArr2[(this.f5430 + i) % objArr2.length] = objMo5875;
            }
            this.f5430 = (this.f5430 + 1) % this.f5429.length;
            C8107 c8107 = C8107.f3222;
            if (z) {
                C5499.m17100(abstractC7312);
                abstractC7312.mo5874();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // Yue.AbstractC2968
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ */
    public Object mo5742(@InterfaceC6399 InterfaceC7289<?> interfaceC7289) {
        boolean z;
        ReentrantLock reentrantLock = this.f5428;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object objM5851 = m5851();
                if (objM5851 == null) {
                    objM5851 = C2978.f4312;
                }
                return objM5851;
            }
            Object[] objArr = this.f5429;
            int i2 = this.f5430;
            Object obj = objArr[i2];
            Object objM18126 = null;
            objArr[i2] = null;
            this.size = i - 1;
            Object objMo5875 = C2978.f4312;
            if (i == this.f5426) {
                while (true) {
                    AbstractC2968.C2973<E> c2973M5729 = m5729();
                    Object objMo22759 = interfaceC7289.mo22759(c2973M5729);
                    if (objMo22759 != null) {
                        if (objMo22759 == C2978.f4312) {
                            break;
                        }
                        if (objMo22759 != C3449.f296) {
                            if (objMo22759 == C7291.m22775()) {
                                this.size = i;
                                this.f5429[this.f5430] = obj;
                                return objMo22759;
                            }
                            if (!(objMo22759 instanceof C3850)) {
                                throw new IllegalStateException(("performAtomicTrySelect(describeTryOffer) returned " + objMo22759).toString());
                            }
                            z = true;
                            objMo5875 = objMo22759;
                            objM18126 = objMo5875;
                        }
                    } else {
                        objM18126 = c2973M5729.m18126();
                        C5499.m17100(objM18126);
                        objMo5875 = ((AbstractC7312) objM18126).mo5875();
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
            }
            if (objMo5875 != C2978.f4312 && !(objMo5875 instanceof C3850)) {
                this.size = i;
                Object[] objArr2 = this.f5429;
                objArr2[(this.f5430 + i) % objArr2.length] = objMo5875;
            } else if (!interfaceC7289.mo22760()) {
                this.size = i;
                this.f5429[this.f5430] = obj;
                return C7291.m22775();
            }
            this.f5430 = (this.f5430 + 1) % this.f5429.length;
            C8107 c8107 = C8107.f3222;
            if (z) {
                C5499.m17100(objM18126);
                ((AbstractC7312) objM18126).mo5874();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public final void m6957(int i, E e) {
        if (i < this.f5426) {
            m6958(i);
            Object[] objArr = this.f5429;
            objArr[(this.f5430 + i) % objArr.length] = e;
        } else {
            Object[] objArr2 = this.f5429;
            int i2 = this.f5430;
            objArr2[i2 % objArr2.length] = null;
            objArr2[(i + i2) % objArr2.length] = e;
            this.f5430 = (i2 + 1) % objArr2.length;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public final void m6958(int i) {
        Object[] objArr = this.f5429;
        if (i >= objArr.length) {
            int iMin = Math.min(objArr.length * 2, this.f5426);
            Object[] objArr2 = new Object[iMin];
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr3 = this.f5429;
                objArr2[i2] = objArr3[(this.f5430 + i2) % objArr3.length];
            }
            C3404.m7192(objArr2, C2978.f4309, i, iMin);
            this.f5429 = objArr2;
            this.f5430 = 0;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public final C7694 m6959(int i) {
        if (i < this.f5426) {
            this.size = i + 1;
            return null;
        }
        int i2 = C0126.f265[this.f5427.ordinal()];
        if (i2 == 1) {
            return C2978.f4311;
        }
        if (i2 == 2) {
            return C2978.f4310;
        }
        if (i2 == 3) {
            return null;
        }
        throw new C6380();
    }
}
