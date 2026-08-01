package p094g5;

import p309v5.AbstractC8824f;

/* JADX INFO: renamed from: g5.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2528k extends AbstractC8824f implements InterfaceC2519b {
    public C2528k(int i10) {
        super(i10);
    }

    /* JADX INFO: renamed from: E */
    public InterfaceC2518a m9033E(int i10) {
        return (InterfaceC2518a) m33887w(i10);
    }

    /* JADX INFO: renamed from: F */
    public void m9034F(int i10, InterfaceC2518a interfaceC2518a) {
        m33889y(i10, interfaceC2518a);
    }

    @Override // p094g5.InterfaceC2519b
    /* JADX INFO: renamed from: a */
    public int mo9026a() {
        int size = size();
        int iMo5336a = 2;
        for (int i10 = 0; i10 < size; i10++) {
            iMo5336a += m9033E(i10).mo5336a();
        }
        return iMo5336a;
    }

    @Override // p094g5.InterfaceC2519b
    /* JADX INFO: renamed from: k */
    public InterfaceC2518a mo9028k(String str) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC2518a interfaceC2518aM9033E = m9033E(i10);
            if (interfaceC2518aM9033E.getName().equals(str)) {
                return interfaceC2518aM9033E;
            }
        }
        return null;
    }

    @Override // p094g5.InterfaceC2519b
    /* JADX INFO: renamed from: n */
    public InterfaceC2518a mo9029n(InterfaceC2518a interfaceC2518a) {
        InterfaceC2518a interfaceC2518aM9033E;
        int size = size();
        int i10 = 0;
        while (i10 < size) {
            if (m9033E(i10) == interfaceC2518a) {
                String name = interfaceC2518a.getName();
                do {
                    i10++;
                    if (i10 >= size) {
                        return null;
                    }
                    interfaceC2518aM9033E = m9033E(i10);
                } while (!interfaceC2518aM9033E.getName().equals(name));
                return interfaceC2518aM9033E;
            }
            i10++;
        }
        return null;
    }
}
