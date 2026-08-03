package Yue;

import Yue.C3526;
import Yue.C4125;
import Yue.C4128;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥ۠ۤ۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5219 {

    /* JADX INFO: renamed from: ۥ */
    public static final boolean f1351 = false;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final boolean f1352 = false;

    /* JADX INFO: renamed from: ۥ */
    public static C8431 m1986(C4128 c4128, int i, ArrayList<C8431> arrayList, C8431 c8431) {
        int iM16182;
        int i2 = i == 0 ? c4128.f8439 : c4128.f8440;
        if (i2 != -1 && (c8431 == null || i2 != c8431.f3493)) {
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList.size()) {
                    break;
                }
                C8431 c84312 = arrayList.get(i3);
                if (c84312.m28199() == i2) {
                    if (c8431 != null) {
                        c8431.m28206(i, c84312);
                        arrayList.remove(c8431);
                    }
                    c8431 = c84312;
                } else {
                    i3++;
                }
            }
        } else if (i2 != -1) {
            return c8431;
        }
        if (c8431 == null) {
            if ((c4128 instanceof C5281) && (iM16182 = ((C5281) c4128).m16182(i)) != -1) {
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        break;
                    }
                    C8431 c84313 = arrayList.get(i4);
                    if (c84313.m28199() == iM16182) {
                        c8431 = c84313;
                        break;
                    }
                    i4++;
                }
            }
            if (c8431 == null) {
                c8431 = new C8431(i);
            }
            arrayList.add(c8431);
        }
        if (c8431.m4411(c4128)) {
            if (c4128 instanceof C5226) {
                C5226 c5226 = (C5226) c4128;
                c5226.m16002().m11760(c5226.m16003() == 0 ? 1 : 0, arrayList, c8431);
            }
            if (i == 0) {
                c4128.f8439 = c8431.m28199();
                c4128.f8386.m11760(i, arrayList, c8431);
                c4128.f8388.m11760(i, arrayList, c8431);
            } else {
                c4128.f8440 = c8431.m28199();
                c4128.f8387.m11760(i, arrayList, c8431);
                c4128.f8390.m11760(i, arrayList, c8431);
                c4128.f8389.m11760(i, arrayList, c8431);
            }
            c4128.f8393.m11760(i, arrayList, c8431);
        }
        return c8431;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static C8431 m1987(ArrayList<C8431> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C8431 c8431 = arrayList.get(i2);
            if (i == c8431.f3493) {
                return c8431;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0347  */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m15983(C4129 c4129, C3526.InterfaceC0170 interfaceC0170) {
        C8431 c8431;
        boolean z;
        C8431 c84312;
        ArrayList<C4128> arrayListM28192 = c4129.m28192();
        int size = arrayListM28192.size();
        for (int i = 0; i < size; i++) {
            C4128 c4128 = arrayListM28192.get(i);
            if (!m15984(c4129.m11863(), c4129.m11888(), c4128.m11863(), c4128.m11888()) || (c4128 instanceof C4889)) {
                return false;
            }
        }
        C6226 c6226 = c4129.f8455;
        if (c6226 != null) {
            c6226.f15383++;
        }
        ArrayList arrayList = null;
        ArrayList<C5281> arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList<C5281> arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        for (int i2 = 0; i2 < size; i2++) {
            C4128 c41282 = arrayListM28192.get(i2);
            if (!m15984(c4129.m11863(), c4129.m11888(), c41282.m11863(), c41282.m11888())) {
                C4129.m11972(c41282, interfaceC0170, c4129.f8479, C3526.C0169.f5967);
            }
            boolean z2 = c41282 instanceof C5226;
            if (z2) {
                C5226 c5226 = (C5226) c41282;
                if (c5226.m16003() == 0) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(c5226);
                }
                if (c5226.m16003() == 1) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c5226);
                }
            }
            if (c41282 instanceof C5281) {
                if (c41282 instanceof C3507) {
                    C3507 c3507 = (C3507) c41282;
                    if (c3507.m9349() == 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(c3507);
                    }
                    if (c3507.m9349() == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(c3507);
                    }
                } else {
                    C5281 c5281 = (C5281) c41282;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(c5281);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(c5281);
                }
            }
            if (c41282.f8386.f8275 == null && c41282.f8388.f8275 == null && !z2 && !(c41282 instanceof C3507)) {
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                arrayList5.add(c41282);
            }
            if (c41282.f8387.f8275 == null && c41282.f8389.f8275 == null && c41282.f8390.f8275 == null && !z2 && !(c41282 instanceof C3507)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(c41282);
            }
        }
        ArrayList<C8431> arrayList7 = new ArrayList<>();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m1986((C5226) it.next(), 0, arrayList7, null);
            }
        }
        int i3 = 0;
        C8431 c84313 = null;
        if (arrayList2 != null) {
            for (C5281 c52812 : arrayList2) {
                C8431 c8431M1986 = m1986(c52812, i3, arrayList7, c84313);
                c52812.m16181(arrayList7, i3, c8431M1986);
                c8431M1986.m28196(arrayList7);
                i3 = 0;
                c84313 = null;
            }
        }
        C4125 c4125Mo11847 = c4129.mo11847(C4125.EnumC0335.LEFT);
        if (c4125Mo11847.m11761() != null) {
            Iterator<C4125> it2 = c4125Mo11847.m11761().iterator();
            while (it2.hasNext()) {
                m1986(it2.next().f8273, 0, arrayList7, null);
            }
        }
        C4125 c4125Mo118472 = c4129.mo11847(C4125.EnumC0335.RIGHT);
        if (c4125Mo118472.m11761() != null) {
            Iterator<C4125> it3 = c4125Mo118472.m11761().iterator();
            while (it3.hasNext()) {
                m1986(it3.next().f8273, 0, arrayList7, null);
            }
        }
        C4125 c4125Mo118473 = c4129.mo11847(C4125.EnumC0335.CENTER);
        if (c4125Mo118473.m11761() != null) {
            Iterator<C4125> it4 = c4125Mo118473.m11761().iterator();
            while (it4.hasNext()) {
                m1986(it4.next().f8273, 0, arrayList7, null);
            }
        }
        C8431 c84314 = null;
        if (arrayList5 != null) {
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                m1986((C4128) it5.next(), 0, arrayList7, null);
            }
        }
        if (arrayList3 != null) {
            Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                m1986((C5226) it6.next(), 1, arrayList7, null);
            }
        }
        if (arrayList4 != null) {
            for (C5281 c52813 : arrayList4) {
                C8431 c8431M19862 = m1986(c52813, 1, arrayList7, c84314);
                c52813.m16181(arrayList7, 1, c8431M19862);
                c8431M19862.m28196(arrayList7);
                c84314 = null;
            }
        }
        C4125 c4125Mo118474 = c4129.mo11847(C4125.EnumC0335.TOP);
        if (c4125Mo118474.m11761() != null) {
            Iterator<C4125> it7 = c4125Mo118474.m11761().iterator();
            while (it7.hasNext()) {
                m1986(it7.next().f8273, 1, arrayList7, null);
            }
        }
        C4125 c4125Mo118475 = c4129.mo11847(C4125.EnumC0335.BASELINE);
        if (c4125Mo118475.m11761() != null) {
            Iterator<C4125> it8 = c4125Mo118475.m11761().iterator();
            while (it8.hasNext()) {
                m1986(it8.next().f8273, 1, arrayList7, null);
            }
        }
        C4125 c4125Mo118476 = c4129.mo11847(C4125.EnumC0335.BOTTOM);
        if (c4125Mo118476.m11761() != null) {
            Iterator<C4125> it9 = c4125Mo118476.m11761().iterator();
            while (it9.hasNext()) {
                m1986(it9.next().f8273, 1, arrayList7, null);
            }
        }
        C4125 c4125Mo118477 = c4129.mo11847(C4125.EnumC0335.CENTER);
        if (c4125Mo118477.m11761() != null) {
            Iterator<C4125> it10 = c4125Mo118477.m11761().iterator();
            while (it10.hasNext()) {
                m1986(it10.next().f8273, 1, arrayList7, null);
            }
        }
        if (arrayList6 != null) {
            Iterator it11 = arrayList6.iterator();
            while (it11.hasNext()) {
                m1986((C4128) it11.next(), 1, arrayList7, null);
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            C4128 c41283 = arrayListM28192.get(i4);
            if (c41283.m11910()) {
                C8431 c8431M1987 = m1987(arrayList7, c41283.f8439);
                C8431 c8431M19872 = m1987(arrayList7, c41283.f8440);
                if (c8431M1987 != null && c8431M19872 != null) {
                    c8431M1987.m28206(0, c8431M19872);
                    c8431M19872.m28208(2);
                    arrayList7.remove(c8431M1987);
                }
            }
        }
        if (arrayList7.size() <= 1) {
            return false;
        }
        if (c4129.m11863() == C4128.EnumC0339.WRAP_CONTENT) {
            c8431 = null;
            int i5 = 0;
            for (C8431 c84315 : arrayList7) {
                if (c84315.m28200() != 1) {
                    c84315.m28207(false);
                    int iM28205 = c84315.m28205(c4129.m11992(), 0);
                    if (iM28205 > i5) {
                        c8431 = c84315;
                        i5 = iM28205;
                    }
                }
            }
            if (c8431 != null) {
                c4129.m11940(C4128.EnumC0339.FIXED);
                c4129.m11965(i5);
                c8431.m28207(true);
            } else {
                c8431 = null;
            }
        }
        if (c4129.m11888() == C4128.EnumC0339.WRAP_CONTENT) {
            C8431 c84316 = null;
            int i6 = 0;
            for (C8431 c84317 : arrayList7) {
                if (c84317.m28200() != 0) {
                    c84317.m28207(false);
                    int iM282052 = c84317.m28205(c4129.m11992(), 1);
                    if (iM282052 > i6) {
                        c84316 = c84317;
                        i6 = iM282052;
                    }
                }
            }
            z = false;
            if (c84316 != null) {
                c4129.m11961(C4128.EnumC0339.FIXED);
                c4129.m11935(i6);
                c84316.m28207(true);
                c84312 = c84316;
            }
            if (c8431 == null || c84312 != null) {
                return true;
            }
            return z;
        }
        z = false;
        c84312 = null;
        if (c8431 == null) {
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean m15984(C4128.EnumC0339 enumC0339, C4128.EnumC0339 enumC03392, C4128.EnumC0339 enumC03393, C4128.EnumC0339 enumC03394) {
        C4128.EnumC0339 enumC03395;
        C4128.EnumC0339 enumC03396;
        C4128.EnumC0339 enumC03397 = C4128.EnumC0339.FIXED;
        return (enumC03393 == enumC03397 || enumC03393 == (enumC03396 = C4128.EnumC0339.WRAP_CONTENT) || (enumC03393 == C4128.EnumC0339.MATCH_PARENT && enumC0339 != enumC03396)) || (enumC03394 == enumC03397 || enumC03394 == (enumC03395 = C4128.EnumC0339.WRAP_CONTENT) || (enumC03394 == C4128.EnumC0339.MATCH_PARENT && enumC03392 != enumC03395));
    }
}
