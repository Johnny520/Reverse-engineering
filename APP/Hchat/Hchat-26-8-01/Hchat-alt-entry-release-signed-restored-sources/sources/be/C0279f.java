package be;

import ac.C0058k;
import ae.C0070a;
import ae.C0071b;
import ae.C0072c;
import ae.C0075f;
import af.C0081d;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import md.C2825b;
import md.EnumC2824a;
import mh.AbstractC2846d;
import p000a.AbstractC0000a;
import p005a5.C0016a;
import p068eh.AbstractC0921a;
import p215od.C3128a;
import p222p.AbstractC3199a;
import p233pd.EnumC3400k;
import p245qc.C3492b;
import p245qc.C3496f;
import p302ud.C4320p;
import p302ud.C4322r;

/* JADX INFO: renamed from: be.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0279f extends AbstractC0269a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC2846d.m6274b(C0279f.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static C0075f m1120i(C4322r c4322r, C4320p[] c4320pArr, int i9, C3128a c3128a) {
        C4320p c4320p = c4320pArr[i9];
        if (c4320p != null) {
            C0072c c0072c = (C0072c) c4320p.f9217g.mo6237c(C2825b.f9178E);
            if (c0072c != null) {
                C0075f c0075f = c0072c.f229g;
                if (c0075f.m442a(c4322r, c3128a)) {
                    return null;
                }
                return c0075f;
            }
        } else {
            c4320p = new C4320p(EnumC3400k.f10965Q, 0);
            c4320p.f14399n = i9;
            c4320p.m6231w(EnumC2824a.f9159m);
            c4320pArr[i9] = c4320p;
        }
        C0075f c0075f2 = new C0075f(i9);
        c0075f2.m442a(c4322r, c3128a);
        if (c4322r.f14405E.isEmpty()) {
            c4322r.f14405E = new ArrayList(2);
        }
        c4322r.f14405E.add(c0075f2);
        c4320p.m6233y(new C0072c(c0075f2));
        return c0075f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: g */
    public final void mo1053g(C4322r c4322r) {
        int iM6834g;
        boolean z9;
        List<C3496f> list;
        EnumC2824a enumC2824a;
        C0075f c0075fM1120i;
        if (c4322r.f14415p) {
            return;
        }
        C4320p[] c4320pArr = c4322r.f14424y;
        C0016a c0016a = c4322r.f14413n;
        C0058k c0058k = (C0058k) c0016a.f56i;
        c0058k.m336B(6);
        boolean z10 = true;
        if (c0058k.m346L() == 0) {
            iM6834g = -1;
        } else {
            int iM202f = c0016a.m202f();
            iM6834g = AbstractC3199a.m6834g(iM202f, 2, 16, iM202f % 2 == 1 ? 2 : 0);
        }
        if (iM6834g == -1) {
            list = Collections.EMPTY_LIST;
            z9 = true;
        } else {
            C0058k c0058k2 = (C0058k) c0016a.f56i;
            c0058k2.m336B(6);
            int iM346L = c0058k2.m346L();
            C0058k c0058kM356g = c0058k.m356g();
            ByteBuffer byteBuffer = (ByteBuffer) c0058k.f177i;
            c0058k.m336B((iM346L * 8) + iM6834g);
            int iPosition = byteBuffer.position();
            int iM14H0 = AbstractC0000a.m14H0(c0058k);
            HashMap map = new HashMap(iM14H0);
            int i9 = 0;
            while (i9 < iM14H0) {
                int iPosition2 = byteBuffer.position() - iPosition;
                int iM343I = c0058k.m343I();
                boolean z11 = z10;
                int iAbs = Math.abs(iM343I);
                int[] iArr = new int[iAbs];
                String[] strArr = new String[iAbs];
                int i10 = iPosition;
                int i11 = 0;
                while (i11 < iAbs) {
                    int i12 = i11;
                    strArr[i12] = c0058kM356g.m373y(AbstractC0000a.m14H0(c0058k));
                    iArr[i12] = AbstractC0000a.m14H0(c0058k);
                    i11 = i12 + 1;
                }
                map.put(Integer.valueOf(iPosition2), new C3492b(iArr, strArr, iM343I <= 0 ? AbstractC0000a.m14H0(c0058k) : -1));
                i9++;
                z10 = z11;
                iPosition = i10;
            }
            z9 = z10;
            c0058k.m336B(iM6834g);
            ArrayList arrayList = new ArrayList(iM346L);
            for (int i13 = 0; i13 < iM346L; i13++) {
                int i14 = byteBuffer.getInt();
                int iM346L2 = c0058k.m346L();
                int iM346L3 = c0058k.m346L();
                C3492b c3492b = (C3492b) map.get(Integer.valueOf(iM346L3));
                if (c3492b == null) {
                    throw new C0081d(AbstractC0921a.m2249l(iM346L3, "Catch handler not found by byte offset: "));
                }
                arrayList.add(new C3496f(i14, (iM346L2 + i14) - 1, c3492b));
            }
            list = arrayList;
        }
        if (list.isEmpty()) {
            return;
        }
        for (C3496f c3496f : list) {
            C3492b c3492b2 = c3496f.f11363c;
            int i15 = c3496f.f11361a;
            int[] iArr2 = c3492b2.f11352a;
            String[] strArr2 = c3492b2.f11353b;
            int length = iArr2.length;
            ArrayList arrayList2 = new ArrayList(length);
            for (int i16 = 0; i16 < length; i16++) {
                C0075f c0075fM1120i2 = m1120i(c4322r, c4320pArr, iArr2[i16], C3128a.m6636d(c4322r.f14411l.f14371k, strArr2[i16]));
                if (c0075fM1120i2 != null) {
                    arrayList2.add(c0075fM1120i2);
                }
            }
            int i17 = c3492b2.f11354c;
            C4320p c4320p = null;
            if (i17 >= 0 && (c0075fM1120i = m1120i(c4322r, c4320pArr, i17, null)) != null) {
                arrayList2.add(c0075fM1120i);
            }
            if (!arrayList2.isEmpty()) {
                arrayList2.sort(Comparator.comparingInt(new C0070a(0)));
                C0071b c0071b = new C0071b(arrayList2);
                int i18 = c3496f.f11362b;
                int iM1069E = i15;
                boolean z12 = false;
                do {
                    enumC2824a = EnumC2824a.f9151i;
                    if (iM1069E > i18) {
                        break;
                    }
                    C4320p c4320p2 = c4320pArr[iM1069E];
                    if (c4320p2 != null) {
                        C0071b c0071b2 = (C0071b) c4320p2.f9217g.mo6237c(C2825b.f9179F);
                        if (c0071b2 != null) {
                            List list2 = c0071b2.f228g;
                            int size = list2.size();
                            List list3 = c0071b.f228g;
                            int size2 = list3.size();
                            if (size == 0 && size2 == 0) {
                                list2 = Collections.EMPTY_LIST;
                            } else if (size == 0) {
                                list2 = list3;
                            } else if (size2 != 0) {
                                ArrayList arrayList3 = new ArrayList(size + size2);
                                arrayList3.addAll(list2);
                                arrayList3.addAll(list3);
                                list2 = arrayList3;
                            }
                            list2.sort(Comparator.comparingInt(new C0070a(0)));
                            c4320p2.m6233y(new C0071b(list2));
                        } else {
                            c4320p2.m6233y(c0071b);
                        }
                        if (z12) {
                            c4320p = c4320p2;
                        } else {
                            c4320p2.m6231w(enumC2824a);
                            c4320p = c4320p2;
                            z12 = z9;
                        }
                    }
                    iM1069E = C0271b.m1069E(c4320pArr, iM1069E);
                } while (iM1069E != -1);
                EnumC2824a enumC2824a2 = EnumC2824a.f9153j;
                if (z12) {
                    c4320p.m6231w(enumC2824a2);
                } else {
                    C4320p c4320p3 = new C4320p(EnumC3400k.f10965Q, 0);
                    c4320p3.f14399n = i15;
                    c4320p3.m6231w(EnumC2824a.f9159m);
                    c4320pArr[i15] = c4320p3;
                    c4320p3.m6231w(enumC2824a);
                    c4320p3.m6231w(enumC2824a2);
                    c4320p3.m6233y(c0071b);
                }
            }
        }
    }
}
