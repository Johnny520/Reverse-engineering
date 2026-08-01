package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.C0423t0;
import java.util.ArrayList;
import java.util.List;
import p080f9.C2363j;
import p185m8.AbstractC5114x;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0410p {
    /* JADX INFO: renamed from: a */
    public static final List m1309a(InterfaceC0437y interfaceC0437y, C0423t0 c0423t0, C0386j c0386j) {
        if (!c0386j.m1219d() && c0423t0.isEmpty()) {
            return AbstractC5114x.m20800o();
        }
        ArrayList arrayList = new ArrayList();
        C2363j c2363j = c0386j.m1219d() ? new C2363j(c0386j.m1218c(), Math.min(c0386j.m1217b(), interfaceC0437y.mo1451a() - 1)) : C2363j.f6495u.m8569a();
        int size = c0423t0.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0423t0.a aVar = (C0423t0.a) c0423t0.get(i10);
            int iM1464a = AbstractC0440z.m1464a(interfaceC0437y, aVar.getKey(), aVar.getIndex());
            int iM8560o = c2363j.m8560o();
            if ((iM1464a > c2363j.m8561p() || iM8560o > iM1464a) && iM1464a >= 0 && iM1464a < interfaceC0437y.mo1451a()) {
                arrayList.add(Integer.valueOf(iM1464a));
            }
        }
        int iM8560o2 = c2363j.m8560o();
        int iM8561p = c2363j.m8561p();
        if (iM8560o2 <= iM8561p) {
            while (true) {
                arrayList.add(Integer.valueOf(iM8560o2));
                if (iM8560o2 == iM8561p) {
                    break;
                }
                iM8560o2++;
            }
        }
        return arrayList;
    }
}
