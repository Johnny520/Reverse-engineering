package p113hc;

import p099gc.EnumC2732a;
import p130ic.C3390h;
import p130ic.InterfaceC3395m;
import p376zd.C10030z0;
import p376zd.C9987e;

/* JADX INFO: renamed from: hc.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2984i {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC2972c m11018a(InterfaceC2972c interfaceC2972c, int i10, EnumC2732a enumC2732a) {
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            C10030z0.m38853a("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i10);
            return null;
        }
        if (i10 == -1 && enumC2732a != EnumC2732a.f7138q) {
            C9987e.m38645a("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i10 == -1) {
            enumC2732a = EnumC2732a.f7139r;
            i10 = 0;
        }
        int i11 = i10;
        EnumC2732a enumC2732a2 = enumC2732a;
        return interfaceC2972c instanceof InterfaceC3395m ? InterfaceC3395m.a.m12744a((InterfaceC3395m) interfaceC2972c, null, i11, enumC2732a2, 1, null) : new C3390h(interfaceC2972c, null, i11, enumC2732a2, 2, null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC2972c m11019b(InterfaceC2972c interfaceC2972c, int i10, EnumC2732a enumC2732a, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            enumC2732a = EnumC2732a.f7138q;
        }
        return AbstractC2976e.m10975c(interfaceC2972c, i10, enumC2732a);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC2972c m11020c(InterfaceC2972c interfaceC2972c) {
        return m11019b(interfaceC2972c, -1, null, 2, null);
    }
}
