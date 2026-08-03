package p000a;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: a.h9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0612h9 extends AbstractC0472a2 {

    /* JADX INFO: renamed from: a */
    public List<C0549e3> f2269a;

    /* JADX INFO: renamed from: b */
    public final int f2270b = 1;

    @Override // p000a.AbstractC0472a2
    /* JADX INFO: renamed from: b */
    public final int mo1150b(C0026B6 c0026b6) {
        int iM63d;
        List<C0549e3> list = this.f2269a;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C0758p3.m1800g0(list, 10));
            for (C0549e3 c0549e3 : list) {
                c0549e3.getClass();
                arrayList.add(Integer.valueOf(c0549e3.mo1150b(c0026b6)));
            }
            iM63d = c0026b6.m63d(C0834t3.m1958v0(arrayList));
        } else {
            iM63d = 0;
        }
        int i = this.f2270b;
        byte b = 1;
        if (i == 1) {
            b = 0;
        } else if (i != 2) {
            throw null;
        }
        c0026b6.m68i(3);
        c0026b6.m60a(2, 0);
        c0026b6.m60a(0, iM63d);
        if (b != 0) {
            c0026b6.m67h(1, 0);
            ByteBuffer byteBuffer = c0026b6.f76a;
            int i2 = c0026b6.f77b - 1;
            c0026b6.f77b = i2;
            byteBuffer.put(i2, b);
            c0026b6.f79d[1] = c0026b6.m66g();
        }
        int iM64e = c0026b6.m64e();
        c0026b6.m65f(iM64e);
        return iM64e;
    }
}
