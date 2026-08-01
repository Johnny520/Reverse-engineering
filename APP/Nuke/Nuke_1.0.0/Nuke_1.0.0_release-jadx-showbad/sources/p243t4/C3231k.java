package p243t4;

import java.util.ArrayList;
import java.util.List;
import p061L2.AbstractC0973m;
import p061L2.AbstractC0974n;
import p179i4.AbstractC2352g;
import p206n2.C2690b;
import p249u4.C3346a;

/* JADX INFO: renamed from: t4.k */
/* JADX INFO: loaded from: classes.dex */
public final class C3231k extends AbstractC2352g {

    /* JADX INFO: renamed from: b */
    public List f10019b;

    /* JADX INFO: renamed from: c */
    public C3346a f10020c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p179i4.AbstractC2352g
    /* JADX INFO: renamed from: w */
    public final int mo4213w(C2690b c2690b) {
        int iM4677g;
        List<C3230j> list = this.f10019b;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0974n.m2029K(list, 10));
            for (C3230j c3230j : list) {
                if (c3230j == null) {
                    c3230j = new C3230j();
                }
                arrayList.add(Integer.valueOf(c3230j.mo4213w(c2690b)));
            }
            int[] iArrM2023d0 = AbstractC0973m.m2023d0(arrayList);
            if (c2690b.f8583f) {
                throw new AssertionError("FlatBuffers: object serialization must not be nested.");
            }
            c2690b.m4683m(4, iArrM2023d0.length, 4);
            for (int length = iArrM2023d0.length - 1; length >= 0; length--) {
                c2690b.m4672b(iArrM2023d0[length]);
            }
            iM4677g = c2690b.m4677g();
        } else {
            iM4677g = 0;
        }
        C3346a c3346a = this.f10020c;
        int iMo4213w = c3346a != null ? c3346a.mo4213w(c2690b) : 0;
        c2690b.m4682l(2);
        c2690b.m4673c(1, iMo4213w);
        c2690b.m4673c(0, iM4677g);
        int iM4676f = c2690b.m4676f();
        c2690b.m4678h(iM4676f);
        return iM4676f;
    }
}
