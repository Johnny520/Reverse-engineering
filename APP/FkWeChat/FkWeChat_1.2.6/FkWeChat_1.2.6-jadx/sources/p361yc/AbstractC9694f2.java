package p361yc;

import java.util.ArrayList;
import p300uc.C8649c;
import p329wc.InterfaceC9218f;

/* JADX INFO: renamed from: yc.f2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9694f2 {
    /* JADX INFO: renamed from: a */
    public static final void m37891a(int i10, int i11, InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
        ArrayList arrayList = new ArrayList();
        int i12 = (~i10) & i11;
        for (int i13 = 0; i13 < 32; i13++) {
            if ((i12 & 1) != 0) {
                arrayList.add(interfaceC9218f.mo35892f(i13));
            }
            i12 >>>= 1;
        }
        throw new C8649c(arrayList, interfaceC9218f.mo35888a());
    }
}
