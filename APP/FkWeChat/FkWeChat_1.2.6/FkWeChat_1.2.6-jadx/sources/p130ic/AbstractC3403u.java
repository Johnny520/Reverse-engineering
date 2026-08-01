package p130ic;

import ec.InterfaceC2198w1;
import p010a9.InterfaceC0188p;
import p145jc.C3835z;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: ic.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3403u {
    /* JADX INFO: renamed from: a */
    public static int m12751a(C3400r c3400r, int i10, InterfaceC5980j.b bVar) {
        InterfaceC5980j.c key = bVar.getKey();
        InterfaceC5980j.b bVarMo1654h = c3400r.f9383r.mo1654h(key);
        if (key != InterfaceC2198w1.f6022g) {
            if (bVar != bVarMo1654h) {
                return Integer.MIN_VALUE;
            }
            return i10 + 1;
        }
        InterfaceC2198w1 interfaceC2198w1 = (InterfaceC2198w1) bVarMo1654h;
        InterfaceC2198w1 interfaceC2198w1M12753c = m12753c((InterfaceC2198w1) bVar, interfaceC2198w1);
        if (interfaceC2198w1M12753c == interfaceC2198w1) {
            return interfaceC2198w1 == null ? i10 : i10 + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC2198w1M12753c + ", expected child of " + interfaceC2198w1 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    /* JADX INFO: renamed from: b */
    public static final void m12752b(final C3400r c3400r, InterfaceC5980j interfaceC5980j) {
        if (((Number) interfaceC5980j.mo1655q(0, new InterfaceC0188p() { // from class: ic.t
            @Override // p010a9.InterfaceC0188p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(AbstractC3403u.m12751a(c3400r, ((Integer) obj).intValue(), (InterfaceC5980j.b) obj2));
            }
        })).intValue() == c3400r.f9384s) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + c3400r.f9383r + ",\n\t\tbut emission happened in " + interfaceC5980j + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC2198w1 m12753c(InterfaceC2198w1 interfaceC2198w1, InterfaceC2198w1 interfaceC2198w12) {
        while (interfaceC2198w1 != null) {
            if (interfaceC2198w1 == interfaceC2198w12 || !(interfaceC2198w1 instanceof C3835z)) {
                return interfaceC2198w1;
            }
            interfaceC2198w1 = ((C3835z) interfaceC2198w1).m7695m0();
        }
        return null;
    }
}
