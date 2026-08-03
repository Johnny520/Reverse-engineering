package androidx.recyclerview.widget;

import java.util.ArrayList;
import p000.C1017Xm;
import p000.C1067Yt;
import p000.C1347e1;

/* JADX INFO: renamed from: androidx.recyclerview.widget.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1152a {

    /* JADX INFO: renamed from: d */
    public final C1157f f4014d;

    /* JADX INFO: renamed from: a */
    public final C1067Yt f4011a = new C1067Yt(30);

    /* JADX INFO: renamed from: b */
    public final ArrayList f4012b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f4013c = new ArrayList();

    /* JADX INFO: renamed from: f */
    public int f4016f = 0;

    /* JADX INFO: renamed from: e */
    public final C1017Xm f4015e = new C1017Xm(10, this);

    public C1152a(C1157f c1157f) {
        this.f4014d = c1157f;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2216a(int i) {
        ArrayList arrayList = this.f4013c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1347e1 c1347e1 = (C1347e1) arrayList.get(i2);
            int i3 = c1347e1.f4841a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = c1347e1.f4842b;
                    int i5 = c1347e1.f4844d + i4;
                    while (i4 < i5) {
                        if (m2221f(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (m2221f(c1347e1.f4844d, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m2217b() {
        ArrayList arrayList = this.f4013c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f4014d.m2244a((C1347e1) arrayList.get(i));
        }
        m2226k(arrayList);
        this.f4016f = 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m2218c() {
        m2217b();
        ArrayList arrayList = this.f4012b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1347e1 c1347e1 = (C1347e1) arrayList.get(i);
            int i2 = c1347e1.f4841a;
            C1157f c1157f = this.f4014d;
            if (i2 == 1) {
                c1157f.m2244a(c1347e1);
                int i3 = c1347e1.f4842b;
                int i4 = c1347e1.f4844d;
                RecyclerView recyclerView = c1157f.f4032a;
                recyclerView.offsetPositionRecordsForInsert(i3, i4);
                recyclerView.mItemsAddedOrRemoved = true;
            } else if (i2 == 2) {
                c1157f.m2244a(c1347e1);
                int i5 = c1347e1.f4842b;
                int i6 = c1347e1.f4844d;
                RecyclerView recyclerView2 = c1157f.f4032a;
                recyclerView2.offsetPositionRecordsForRemove(i5, i6, true);
                recyclerView2.mItemsAddedOrRemoved = true;
                recyclerView2.mState.f78c += i6;
            } else if (i2 == 4) {
                c1157f.m2244a(c1347e1);
                int i7 = c1347e1.f4842b;
                int i8 = c1347e1.f4844d;
                Object obj = c1347e1.f4843c;
                RecyclerView recyclerView3 = c1157f.f4032a;
                recyclerView3.viewRangeUpdate(i7, i8, obj);
                recyclerView3.mItemsChanged = true;
            } else if (i2 == 8) {
                c1157f.m2244a(c1347e1);
                int i9 = c1347e1.f4842b;
                int i10 = c1347e1.f4844d;
                RecyclerView recyclerView4 = c1157f.f4032a;
                recyclerView4.offsetPositionRecordsForMove(i9, i10);
                recyclerView4.mItemsAddedOrRemoved = true;
            }
        }
        m2226k(arrayList);
        this.f4016f = 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m2219d(C1347e1 c1347e1) {
        int i;
        C1067Yt c1067Yt;
        int i2 = c1347e1.f4841a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM2227l = m2227l(c1347e1.f4842b, i2);
        int i3 = c1347e1.f4842b;
        int i4 = c1347e1.f4841a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c1347e1);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c1347e1.f4844d;
            c1067Yt = this.f4011a;
            if (i5 >= i7) {
                break;
            }
            int iM2227l2 = m2227l((i * i5) + c1347e1.f4842b, c1347e1.f4841a);
            int i8 = c1347e1.f4841a;
            if (i8 == 2 ? iM2227l2 != iM2227l : !(i8 == 4 && iM2227l2 == iM2227l + 1)) {
                C1347e1 c1347e1M2223h = m2223h(c1347e1.f4843c, i8, iM2227l, i6);
                m2220e(c1347e1M2223h, i3);
                c1347e1M2223h.f4843c = null;
                c1067Yt.mo1934a(c1347e1M2223h);
                if (c1347e1.f4841a == 4) {
                    i3 += i6;
                }
                i6 = 1;
                iM2227l = iM2227l2;
            } else {
                i6++;
            }
            i5++;
        }
        Object obj = c1347e1.f4843c;
        c1347e1.f4843c = null;
        c1067Yt.mo1934a(c1347e1);
        if (i6 > 0) {
            C1347e1 c1347e1M2223h2 = m2223h(obj, c1347e1.f4841a, iM2227l, i6);
            m2220e(c1347e1M2223h2, i3);
            c1347e1M2223h2.f4843c = null;
            c1067Yt.mo1934a(c1347e1M2223h2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2220e(C1347e1 c1347e1, int i) {
        C1157f c1157f = this.f4014d;
        c1157f.m2244a(c1347e1);
        RecyclerView recyclerView = c1157f.f4032a;
        int i2 = c1347e1.f4841a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            recyclerView.viewRangeUpdate(i, c1347e1.f4844d, c1347e1.f4843c);
            recyclerView.mItemsChanged = true;
            return;
        }
        int i3 = c1347e1.f4844d;
        recyclerView.offsetPositionRecordsForRemove(i, i3, true);
        recyclerView.mItemsAddedOrRemoved = true;
        recyclerView.mState.f78c += i3;
    }

    /* JADX INFO: renamed from: f */
    public final int m2221f(int i, int i2) {
        ArrayList arrayList = this.f4013c;
        int size = arrayList.size();
        while (i2 < size) {
            C1347e1 c1347e1 = (C1347e1) arrayList.get(i2);
            int i3 = c1347e1.f4841a;
            if (i3 == 8) {
                int i4 = c1347e1.f4842b;
                if (i4 == i) {
                    i = c1347e1.f4844d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c1347e1.f4844d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c1347e1.f4842b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c1347e1.f4844d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c1347e1.f4844d;
                }
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2222g() {
        return this.f4012b.size() > 0;
    }

    /* JADX INFO: renamed from: h */
    public final C1347e1 m2223h(Object obj, int i, int i2, int i3) {
        C1347e1 c1347e1 = (C1347e1) this.f4011a.mo1935c();
        if (c1347e1 != null) {
            c1347e1.f4841a = i;
            c1347e1.f4842b = i2;
            c1347e1.f4844d = i3;
            c1347e1.f4843c = obj;
            return c1347e1;
        }
        C1347e1 c1347e12 = new C1347e1();
        c1347e12.f4841a = i;
        c1347e12.f4842b = i2;
        c1347e12.f4844d = i3;
        c1347e12.f4843c = obj;
        return c1347e12;
    }

    /* JADX INFO: renamed from: i */
    public final void m2224i(C1347e1 c1347e1) {
        this.f4013c.add(c1347e1);
        int i = c1347e1.f4841a;
        C1157f c1157f = this.f4014d;
        if (i == 1) {
            int i2 = c1347e1.f4842b;
            int i3 = c1347e1.f4844d;
            RecyclerView recyclerView = c1157f.f4032a;
            recyclerView.offsetPositionRecordsForInsert(i2, i3);
            recyclerView.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 2) {
            int i4 = c1347e1.f4842b;
            int i5 = c1347e1.f4844d;
            RecyclerView recyclerView2 = c1157f.f4032a;
            recyclerView2.offsetPositionRecordsForRemove(i4, i5, false);
            recyclerView2.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 4) {
            int i6 = c1347e1.f4842b;
            int i7 = c1347e1.f4844d;
            Object obj = c1347e1.f4843c;
            RecyclerView recyclerView3 = c1157f.f4032a;
            recyclerView3.viewRangeUpdate(i6, i7, obj);
            recyclerView3.mItemsChanged = true;
            return;
        }
        if (i != 8) {
            throw new IllegalArgumentException("Unknown update op type for " + c1347e1);
        }
        int i8 = c1347e1.f4842b;
        int i9 = c1347e1.f4844d;
        RecyclerView recyclerView4 = c1157f.f4032a;
        recyclerView4.offsetPositionRecordsForMove(i8, i9);
        recyclerView4.mItemsAddedOrRemoved = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2225j() {
        ArrayList arrayList;
        int i;
        byte b;
        int i2;
        int i3;
        int i4;
        boolean z;
        byte b2;
        C1347e1 c1347e1M2223h;
        int i5;
        int i6;
        C1347e1 c1347e1M2223h2;
        boolean z2;
        boolean z3;
        Object obj;
        C1347e1 c1347e1;
        C1017Xm c1017Xm = this.f4015e;
        c1017Xm.getClass();
        while (true) {
            arrayList = this.f4012b;
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                i = 8;
                b = -1;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((C1347e1) arrayList.get(size)).f4841a != 8) {
                    z4 = true;
                } else if (z4) {
                    break;
                }
                size--;
            }
            i2 = 2;
            i3 = 4;
            if (size == -1) {
                break;
            }
            int i7 = size + 1;
            C1152a c1152a = (C1152a) c1017Xm.f3226b;
            C1067Yt c1067Yt = c1152a.f4011a;
            C1347e1 c1347e12 = (C1347e1) arrayList.get(size);
            C1347e1 c1347e13 = (C1347e1) arrayList.get(i7);
            int i8 = c1347e13.f4841a;
            if (i8 == 1) {
                int i9 = c1347e12.f4844d;
                int i10 = c1347e13.f4842b;
                int i11 = i9 < i10 ? -1 : 0;
                int i12 = c1347e12.f4842b;
                if (i12 < i10) {
                    i11++;
                }
                if (i10 <= i12) {
                    c1347e12.f4842b = i12 + c1347e13.f4844d;
                }
                int i13 = c1347e13.f4842b;
                if (i13 <= i9) {
                    c1347e12.f4844d = i9 + c1347e13.f4844d;
                }
                c1347e13.f4842b = i13 + i11;
                arrayList.set(size, c1347e13);
                arrayList.set(i7, c1347e12);
            } else if (i8 == 2) {
                int i14 = c1347e12.f4842b;
                int i15 = c1347e12.f4844d;
                if (i14 < i15) {
                    z3 = c1347e13.f4842b == i14 && c1347e13.f4844d == i15 - i14;
                    z2 = false;
                } else if (c1347e13.f4842b == i15 + 1 && c1347e13.f4844d == i14 - i15) {
                    z3 = true;
                    z2 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                int i16 = c1347e13.f4842b;
                if (i15 < i16) {
                    c1347e13.f4842b = i16 - 1;
                } else {
                    int i17 = c1347e13.f4844d;
                    if (i15 < i16 + i17) {
                        c1347e13.f4844d = i17 - 1;
                        c1347e12.f4841a = 2;
                        c1347e12.f4844d = 1;
                        if (c1347e13.f4844d == 0) {
                            arrayList.remove(i7);
                            c1347e13.f4843c = null;
                            c1067Yt.mo1934a(c1347e13);
                        }
                    }
                }
                int i18 = c1347e12.f4842b;
                int i19 = c1347e13.f4842b;
                if (i18 <= i19) {
                    c1347e13.f4842b = i19 + 1;
                } else {
                    int i20 = i19 + c1347e13.f4844d;
                    if (i18 < i20) {
                        obj = null;
                        C1347e1 c1347e1M2223h3 = c1152a.m2223h(null, 2, i18 + 1, i20 - i18);
                        c1347e13.f4844d = c1347e12.f4842b - c1347e13.f4842b;
                        c1347e1 = c1347e1M2223h3;
                    }
                    if (z3) {
                        if (z2) {
                            if (c1347e1 != null) {
                                int i21 = c1347e12.f4842b;
                                if (i21 > c1347e1.f4842b) {
                                    c1347e12.f4842b = i21 - c1347e1.f4844d;
                                }
                                int i22 = c1347e12.f4844d;
                                if (i22 > c1347e1.f4842b) {
                                    c1347e12.f4844d = i22 - c1347e1.f4844d;
                                }
                            }
                            int i23 = c1347e12.f4842b;
                            if (i23 > c1347e13.f4842b) {
                                c1347e12.f4842b = i23 - c1347e13.f4844d;
                            }
                            int i24 = c1347e12.f4844d;
                            if (i24 > c1347e13.f4842b) {
                                c1347e12.f4844d = i24 - c1347e13.f4844d;
                            }
                        } else {
                            if (c1347e1 != null) {
                                int i25 = c1347e12.f4842b;
                                if (i25 >= c1347e1.f4842b) {
                                    c1347e12.f4842b = i25 - c1347e1.f4844d;
                                }
                                int i26 = c1347e12.f4844d;
                                if (i26 >= c1347e1.f4842b) {
                                    c1347e12.f4844d = i26 - c1347e1.f4844d;
                                }
                            }
                            int i27 = c1347e12.f4842b;
                            if (i27 >= c1347e13.f4842b) {
                                c1347e12.f4842b = i27 - c1347e13.f4844d;
                            }
                            int i28 = c1347e12.f4844d;
                            if (i28 >= c1347e13.f4842b) {
                                c1347e12.f4844d = i28 - c1347e13.f4844d;
                            }
                        }
                        arrayList.set(size, c1347e13);
                        if (c1347e12.f4842b != c1347e12.f4844d) {
                            arrayList.set(i7, c1347e12);
                        } else {
                            arrayList.remove(i7);
                        }
                        if (c1347e1 != null) {
                            arrayList.add(size, c1347e1);
                        }
                    } else {
                        arrayList.set(size, c1347e13);
                        arrayList.remove(i7);
                        c1347e12.f4843c = obj;
                        c1067Yt.mo1934a(c1347e12);
                    }
                }
                obj = null;
                c1347e1 = null;
                if (z3) {
                }
            } else if (i8 == 4) {
                int i29 = c1347e12.f4844d;
                int i30 = c1347e13.f4842b;
                if (i29 < i30) {
                    c1347e13.f4842b = i30 - 1;
                } else {
                    int i31 = c1347e13.f4844d;
                    if (i29 < i30 + i31) {
                        c1347e13.f4844d = i31 - 1;
                        c1347e1M2223h = c1152a.m2223h(c1347e13.f4843c, 4, c1347e12.f4842b, 1);
                    }
                    i5 = c1347e12.f4842b;
                    i6 = c1347e13.f4842b;
                    if (i5 > i6) {
                        c1347e13.f4842b = i6 + 1;
                    } else {
                        int i32 = i6 + c1347e13.f4844d;
                        if (i5 < i32) {
                            int i33 = i32 - i5;
                            c1347e1M2223h2 = c1152a.m2223h(c1347e13.f4843c, 4, i5 + 1, i33);
                            c1347e13.f4844d -= i33;
                        }
                        arrayList.set(i7, c1347e12);
                        if (c1347e13.f4844d > 0) {
                            arrayList.set(size, c1347e13);
                        } else {
                            arrayList.remove(size);
                            c1347e13.f4843c = null;
                            c1067Yt.mo1934a(c1347e13);
                        }
                        if (c1347e1M2223h != null) {
                            arrayList.add(size, c1347e1M2223h);
                        }
                        if (c1347e1M2223h2 != null) {
                            arrayList.add(size, c1347e1M2223h2);
                        }
                    }
                    c1347e1M2223h2 = null;
                    arrayList.set(i7, c1347e12);
                    if (c1347e13.f4844d > 0) {
                    }
                    if (c1347e1M2223h != null) {
                    }
                    if (c1347e1M2223h2 != null) {
                    }
                }
                c1347e1M2223h = null;
                i5 = c1347e12.f4842b;
                i6 = c1347e13.f4842b;
                if (i5 > i6) {
                }
                c1347e1M2223h2 = null;
                arrayList.set(i7, c1347e12);
                if (c1347e13.f4844d > 0) {
                }
                if (c1347e1M2223h != null) {
                }
                if (c1347e1M2223h2 != null) {
                }
            }
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            C1347e1 c1347e1M2223h4 = (C1347e1) arrayList.get(i34);
            int i35 = c1347e1M2223h4.f4841a;
            if (i35 != 1) {
                C1067Yt c1067Yt2 = this.f4011a;
                C1157f c1157f = this.f4014d;
                if (i35 == i2) {
                    int i36 = c1347e1M2223h4.f4842b;
                    int i37 = c1347e1M2223h4.f4844d + i36;
                    int i38 = i36;
                    int i39 = 0;
                    byte b3 = -1;
                    while (i38 < i37) {
                        RecyclerView recyclerView = c1157f.f4032a;
                        AbstractC1166o abstractC1166oFindViewHolderForPosition = recyclerView.findViewHolderForPosition(i38, true);
                        if (abstractC1166oFindViewHolderForPosition == null) {
                            abstractC1166oFindViewHolderForPosition = null;
                        } else {
                            if (recyclerView.mChildHelper.f4019c.contains(abstractC1166oFindViewHolderForPosition.itemView)) {
                                int i40 = RecyclerView.HORIZONTAL;
                                abstractC1166oFindViewHolderForPosition = null;
                            }
                        }
                        if (abstractC1166oFindViewHolderForPosition != null || m2216a(i38)) {
                            if (b3 == 0) {
                                m2219d(m2223h(null, 2, i36, i39));
                                z = true;
                            } else {
                                z = false;
                            }
                            b2 = 1;
                        } else {
                            if (b3 == 1) {
                                m2224i(m2223h(null, 2, i36, i39));
                                z = true;
                            } else {
                                z = false;
                            }
                            b2 = 0;
                        }
                        if (z) {
                            i38 -= i39;
                            i37 -= i39;
                            i39 = 1;
                        } else {
                            i39++;
                        }
                        i38++;
                        b3 = b2;
                    }
                    if (i39 != c1347e1M2223h4.f4844d) {
                        c1347e1M2223h4.f4843c = null;
                        c1067Yt2.mo1934a(c1347e1M2223h4);
                        i4 = 2;
                        c1347e1M2223h4 = m2223h(null, 2, i36, i39);
                    } else {
                        i4 = 2;
                    }
                    if (b3 == 0) {
                        m2219d(c1347e1M2223h4);
                    } else {
                        m2224i(c1347e1M2223h4);
                    }
                } else if (i35 != i3) {
                    if (i35 == i) {
                        m2224i(c1347e1M2223h4);
                    }
                    i4 = i2;
                } else {
                    int i41 = c1347e1M2223h4.f4842b;
                    int i42 = c1347e1M2223h4.f4844d + i41;
                    int i43 = i41;
                    byte b4 = b;
                    int i44 = 0;
                    while (i41 < i42) {
                        RecyclerView recyclerView2 = c1157f.f4032a;
                        AbstractC1166o abstractC1166oFindViewHolderForPosition2 = recyclerView2.findViewHolderForPosition(i41, true);
                        if (abstractC1166oFindViewHolderForPosition2 == null) {
                            abstractC1166oFindViewHolderForPosition2 = null;
                        } else {
                            if (recyclerView2.mChildHelper.f4019c.contains(abstractC1166oFindViewHolderForPosition2.itemView)) {
                                int i45 = RecyclerView.HORIZONTAL;
                                abstractC1166oFindViewHolderForPosition2 = null;
                            }
                        }
                        if (abstractC1166oFindViewHolderForPosition2 != null || m2216a(i41)) {
                            if (b4 == 0) {
                                m2219d(m2223h(c1347e1M2223h4.f4843c, 4, i43, i44));
                                i43 = i41;
                                i44 = 0;
                            }
                            b4 = 1;
                        } else {
                            if (b4 == 1) {
                                m2224i(m2223h(c1347e1M2223h4.f4843c, 4, i43, i44));
                                i43 = i41;
                                i44 = 0;
                            }
                            b4 = 0;
                        }
                        i44++;
                        i41++;
                    }
                    if (i44 != c1347e1M2223h4.f4844d) {
                        Object obj2 = c1347e1M2223h4.f4843c;
                        c1347e1M2223h4.f4843c = null;
                        c1067Yt2.mo1934a(c1347e1M2223h4);
                        c1347e1M2223h4 = m2223h(obj2, 4, i43, i44);
                    }
                    if (b4 == 0) {
                        m2219d(c1347e1M2223h4);
                    } else {
                        m2224i(c1347e1M2223h4);
                    }
                    i4 = 2;
                }
            } else {
                i4 = i2;
                m2224i(c1347e1M2223h4);
            }
            i34++;
            i2 = i4;
            i = 8;
            b = -1;
            i3 = 4;
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: k */
    public final void m2226k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1347e1 c1347e1 = (C1347e1) arrayList.get(i);
            c1347e1.f4843c = null;
            this.f4011a.mo1934a(c1347e1);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: l */
    public final int m2227l(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = this.f4013c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1347e1 c1347e1 = (C1347e1) arrayList.get(size);
            int i5 = c1347e1.f4841a;
            if (i5 == 8) {
                int i6 = c1347e1.f4842b;
                int i7 = c1347e1.f4844d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            c1347e1.f4842b = i6 + 1;
                            c1347e1.f4844d = i7 + 1;
                        } else if (i2 == 2) {
                            c1347e1.f4842b = i6 - 1;
                            c1347e1.f4844d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c1347e1.f4844d = i7 + 1;
                    } else if (i2 == 2) {
                        c1347e1.f4844d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c1347e1.f4842b = i6 + 1;
                    } else if (i2 == 2) {
                        c1347e1.f4842b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c1347e1.f4842b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c1347e1.f4844d;
                    } else if (i5 == 2) {
                        i += c1347e1.f4844d;
                    }
                } else if (i2 == 1) {
                    c1347e1.f4842b = i8 + 1;
                } else if (i2 == 2) {
                    c1347e1.f4842b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C1347e1 c1347e12 = (C1347e1) arrayList.get(size2);
            int i9 = c1347e12.f4841a;
            C1067Yt c1067Yt = this.f4011a;
            if (i9 == 8) {
                int i10 = c1347e12.f4844d;
                if (i10 == c1347e12.f4842b || i10 < 0) {
                    arrayList.remove(size2);
                    c1347e12.f4843c = null;
                    c1067Yt.mo1934a(c1347e12);
                }
            } else if (c1347e12.f4844d <= 0) {
                arrayList.remove(size2);
                c1347e12.f4843c = null;
                c1067Yt.mo1934a(c1347e12);
            }
        }
        return i;
    }
}
