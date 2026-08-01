package p113hc;

import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: hc.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2988l {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0184l f7877a = new InterfaceC0184l() { // from class: hc.j
        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public final Object mo27m(Object obj) {
            return AbstractC2988l.m11032d(obj);
        }
    };

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0188p f7878b = new InterfaceC0188p() { // from class: hc.k
        @Override // p010a9.InterfaceC0188p
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(AbstractC2988l.m11031c(obj, obj2));
        }
    };

    /* JADX INFO: renamed from: c */
    public static final boolean m11031c(Object obj, Object obj2) {
        return AbstractC1061t.m3842c(obj, obj2);
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC2972c m11033e(InterfaceC2972c interfaceC2972c) {
        return interfaceC2972c instanceof InterfaceC2979f0 ? interfaceC2972c : m11034f(interfaceC2972c, f7877a, f7878b);
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC2972c m11034f(InterfaceC2972c interfaceC2972c, InterfaceC0184l interfaceC0184l, InterfaceC0188p interfaceC0188p) {
        if (interfaceC2972c instanceof C2970b) {
            C2970b c2970b = (C2970b) interfaceC2972c;
            if (c2970b.f7823r == interfaceC0184l && c2970b.f7824s == interfaceC0188p) {
                return interfaceC2972c;
            }
        }
        return new C2970b(interfaceC2972c, interfaceC0184l, interfaceC0188p);
    }

    /* JADX INFO: renamed from: d */
    public static final Object m11032d(Object obj) {
        return obj;
    }
}
