package p113hc;

import p099gc.EnumC2732a;
import p130ic.C3390h;
import p145jc.C3801d0;
import p228p8.InterfaceC5980j;
import p376zd.C10030z0;
import p376zd.C9994h0;

/* JADX INFO: renamed from: hc.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3000x {

    /* JADX INFO: renamed from: a */
    public static final C3801d0 f7965a = new C3801d0("NO_VALUE");

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2994r m11087a(int i10, int i11, EnumC2732a enumC2732a) {
        if (i10 < 0) {
            C10030z0.m38853a("replay cannot be negative, but was ", i10);
            return null;
        }
        if (i11 < 0) {
            C10030z0.m38853a("extraBufferCapacity cannot be negative, but was ", i11);
            return null;
        }
        if (i10 <= 0 && i11 <= 0 && enumC2732a != EnumC2732a.f7138q) {
            C9994h0.m38667a("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ", enumC2732a);
            return null;
        }
        int i12 = i11 + i10;
        if (i12 < 0) {
            i12 = Integer.MAX_VALUE;
        }
        return new C2999w(i10, i12, enumC2732a);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC2994r m11088b(int i10, int i11, EnumC2732a enumC2732a, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            enumC2732a = EnumC2732a.f7138q;
        }
        return m11087a(i10, i11, enumC2732a);
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC2972c m11091e(InterfaceC2998v interfaceC2998v, InterfaceC5980j interfaceC5980j, int i10, EnumC2732a enumC2732a) {
        return ((i10 == 0 || i10 == -3) && enumC2732a == EnumC2732a.f7138q) ? interfaceC2998v : new C3390h(interfaceC2998v, interfaceC5980j, i10, enumC2732a);
    }

    /* JADX INFO: renamed from: f */
    public static final Object m11092f(Object[] objArr, long j10) {
        return objArr[((int) j10) & (objArr.length - 1)];
    }

    /* JADX INFO: renamed from: g */
    public static final void m11093g(Object[] objArr, long j10, Object obj) {
        objArr[((int) j10) & (objArr.length - 1)] = obj;
    }
}
