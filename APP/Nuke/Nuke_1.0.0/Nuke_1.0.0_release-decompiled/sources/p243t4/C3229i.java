package p243t4;

import java.util.ArrayList;
import java.util.Iterator;
import me.dartcv.nuke.BuildConfig;
import p056K2.C0889o;
import p061L2.AbstractC0973m;
import p061L2.AbstractC0974n;
import p117X2.AbstractC1665j;
import p179i4.AbstractC2352g;
import p206n2.C2690b;
import p249u4.C3347b;

/* JADX INFO: renamed from: t4.i */
/* JADX INFO: loaded from: classes.dex */
public final class C3229i extends AbstractC2352g {

    /* JADX INFO: renamed from: b */
    public C3221a f10015b;

    /* JADX INFO: renamed from: c */
    public C3231k f10016c;

    /* JADX INFO: renamed from: d */
    public ArrayList f10017d;

    @Override // p179i4.AbstractC2352g
    /* JADX INFO: renamed from: w */
    public final int mo4213w(C2690b c2690b) {
        int iM4677g;
        int iM4677g2;
        byte b2;
        C3221a c3221a = this.f10015b;
        int iMo4213w = c3221a != null ? c3221a.mo4213w(c2690b) : 0;
        C3231k c3231k = this.f10016c;
        int iMo4213w2 = c3231k != null ? c3231k.mo4213w(c2690b) : 0;
        ArrayList arrayList = this.f10017d;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC0974n.m2029K(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int i5 = ((C3347b) it.next()).f10407b;
                if (i5 == 0) {
                    NullPointerException nullPointerException = new NullPointerException();
                    AbstractC1665j.m2989i(nullPointerException, AbstractC1665j.class.getName());
                    throw nullPointerException;
                }
                switch (i5) {
                    case BuildConfig.VERSION_CODE /* 1 */:
                        b2 = 1;
                        break;
                    case 2:
                        b2 = 2;
                        break;
                    case 3:
                        b2 = 3;
                        break;
                    case 4:
                        b2 = 4;
                        break;
                    case 5:
                        b2 = 5;
                        break;
                    case 6:
                        b2 = 6;
                        break;
                    default:
                        throw null;
                }
                arrayList2.add(new C0889o(b2));
            }
            int size = arrayList2.size();
            byte[] bArr = new byte[size];
            Iterator it2 = arrayList2.iterator();
            int i6 = 0;
            while (it2.hasNext()) {
                bArr[i6] = ((C0889o) it2.next()).f2778d;
                i6++;
            }
            c2690b.m4683m(1, size, 1);
            for (int i7 = size - 1; -1 < i7; i7--) {
                c2690b.m4671a(bArr[i7]);
            }
            iM4677g = c2690b.m4677g();
        } else {
            iM4677g = 0;
        }
        ArrayList arrayList3 = this.f10017d;
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList(AbstractC0974n.m2029K(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                AbstractC3222b abstractC3222b = ((C3347b) it3.next()).f10406a;
                AbstractC1665j.m2983c(abstractC3222b, "null cannot be cast to non-null type org.luckypray.dexkit.query.base.BaseMatcher");
                arrayList4.add(Integer.valueOf(abstractC3222b.mo4213w(c2690b)));
            }
            int[] iArrM2023d0 = AbstractC0973m.m2023d0(arrayList4);
            c2690b.m4683m(4, iArrM2023d0.length, 4);
            for (int length = iArrM2023d0.length - 1; -1 < length; length--) {
                c2690b.m4672b(iArrM2023d0[length]);
            }
            iM4677g2 = c2690b.m4677g();
        } else {
            iM4677g2 = 0;
        }
        c2690b.m4682l(17);
        c2690b.m4673c(16, 0);
        c2690b.m4673c(15, 0);
        c2690b.m4673c(14, 0);
        c2690b.m4673c(13, 0);
        c2690b.m4673c(12, 0);
        c2690b.m4673c(11, 0);
        c2690b.m4673c(10, iM4677g2);
        c2690b.m4673c(9, iM4677g);
        c2690b.m4673c(8, 0);
        c2690b.m4673c(7, 0);
        c2690b.m4673c(6, 0);
        c2690b.m4673c(5, 0);
        c2690b.m4673c(4, iMo4213w2);
        c2690b.m4673c(3, iMo4213w);
        c2690b.m4673c(2, 0);
        c2690b.m4673c(1, 0);
        c2690b.m4673c(0, 0);
        int iM4676f = c2690b.m4676f();
        c2690b.m4678h(iM4676f);
        return iM4676f;
    }
}
