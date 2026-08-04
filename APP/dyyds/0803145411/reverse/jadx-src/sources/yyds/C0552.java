package yyds;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᛳᛳᛵᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0552 extends AbstractC1413 {

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final ArrayList f2641;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public int f2642;

    public C0552(C0944 c0944, int i) {
        C0944 c09442;
        super(c0944);
        ArrayList<AbstractC1413> arrayList = new ArrayList();
        this.f2641 = arrayList;
        this.f6694 = i;
        C0944 c09443 = this.f6690;
        C0944 c0944M2079 = c09443.m2079(i);
        while (true) {
            c09442 = c09443;
            c09443 = c0944M2079;
            if (c09443 == null) {
                break;
            } else {
                c0944M2079 = c09443.m2079(this.f6694);
            }
        }
        this.f6690 = c09442;
        int i2 = this.f6694;
        arrayList.add(i2 == 0 ? c09442.f4400 : i2 == 1 ? c09442.f4349 : null);
        C0944 c0944M2083 = c09442.m2083(this.f6694);
        while (c0944M2083 != null) {
            int i3 = this.f6694;
            arrayList.add(i3 == 0 ? c0944M2083.f4400 : i3 == 1 ? c0944M2083.f4349 : null);
            c0944M2083 = c0944M2083.m2083(this.f6694);
        }
        for (AbstractC1413 abstractC1413 : arrayList) {
            int i4 = this.f6694;
            if (i4 == 0) {
                abstractC1413.f6690.f4365 = this;
            } else if (i4 == 1) {
                abstractC1413.f6690.f4390 = this;
            }
        }
        if (this.f6694 == 0 && this.f6690.f4342.f3942 && arrayList.size() > 1) {
            this.f6690 = ((AbstractC1413) arrayList.get(arrayList.size() - 1)).f6690;
        }
        int i5 = this.f6694;
        C0944 c09444 = this.f6690;
        this.f2642 = i5 == 0 ? c09444.f4393 : c09444.f4391;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f6694 == 0 ? "horizontal : " : "vertical : ");
        for (AbstractC1413 abstractC1413 : this.f2641) {
            sb.append("<");
            sb.append(abstractC1413);
            sb.append("> ");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final C0944 m1392() {
        ArrayList arrayList = this.f2641;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0944 c0944 = ((AbstractC1413) arrayList.get(size)).f6690;
            if (c0944.f20 != 8) {
                return c0944;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final C0944 m1393() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2641;
            if (i >= arrayList.size()) {
                return null;
            }
            C0944 c0944 = ((AbstractC1413) arrayList.get(i)).f6690;
            if (c0944.f20 != 8) {
                return c0944;
            }
            i++;
        }
    }

    @Override // yyds.AbstractC1413
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void mo1394() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2641;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC1413) arrayList.get(i)).mo1394();
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d9  */
    @Override // yyds.InterfaceC2299
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1395(InterfaceC2299 interfaceC2299) {
        int i;
        int i2;
        boolean z;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        int i13;
        C1397 c1397 = this.f6686;
        if (c1397.f6520) {
            C1397 c13972 = this.f6687;
            if (c13972.f6520) {
                C0859 c0859 = this.f6690.f4342;
                boolean z3 = c0859 != null ? c0859.f3942 : false;
                int i14 = c13972.f6517 - c1397.f6517;
                ArrayList arrayList = this.f2641;
                int size = arrayList.size();
                int i15 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i15 >= size) {
                        i15 = -1;
                        break;
                    } else if (((AbstractC1413) arrayList.get(i15)).f6690.f20 != 8) {
                        break;
                    } else {
                        i15++;
                    }
                }
                int i16 = size - 1;
                int i17 = i16;
                while (true) {
                    if (i17 < 0) {
                        break;
                    }
                    if (((AbstractC1413) arrayList.get(i17)).f6690.f20 != 8) {
                        i = i17;
                        break;
                    }
                    i17--;
                }
                int i18 = 0;
                while (i18 < 2) {
                    f = 0.0f;
                    int i19 = 0;
                    i5 = 0;
                    int i20 = 0;
                    int i21 = 0;
                    while (i19 < size) {
                        AbstractC1413 abstractC1413 = (AbstractC1413) arrayList.get(i19);
                        C0944 c0944 = abstractC1413.f6690;
                        boolean z4 = z3;
                        if (c0944.f20 == i2) {
                            i12 = i18;
                        } else {
                            i21++;
                            if (i19 > 0 && i19 >= i15) {
                                i5 += abstractC1413.f6686.f6522;
                            }
                            C0136 c0136 = abstractC1413.f6688;
                            int i22 = c0136.f6517;
                            i12 = i18;
                            boolean z5 = abstractC1413.f6695 != 3;
                            if (z5) {
                                int i23 = this.f6694;
                                if (i23 == 0 && !c0944.f4400.f6688.f6520) {
                                    return;
                                }
                                if (i23 == 1 && !c0944.f4349.f6688.f6520) {
                                    return;
                                } else {
                                    z2 = z5;
                                }
                            } else {
                                z2 = z5;
                                if (abstractC1413.f6689 == 1 && i12 == 0) {
                                    i13 = c0136.f841;
                                    i20++;
                                } else if (c0136.f6520) {
                                    i13 = i22;
                                }
                                z2 = true;
                                if (z2) {
                                    i20++;
                                    float f3 = c0944.f4358[this.f6694];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                } else {
                                    i5 += i13;
                                }
                                if (i19 >= i16 && i19 < i) {
                                    i5 += -abstractC1413.f6687.f6522;
                                }
                            }
                            i13 = i22;
                            if (z2) {
                            }
                            if (i19 >= i16) {
                            }
                        }
                        i19++;
                        z3 = z4;
                        i18 = i12;
                        i2 = 8;
                    }
                    z = z3;
                    int i24 = i18;
                    if (i5 < i14 || i20 == 0) {
                        i3 = i20;
                        i4 = i21;
                        break;
                    } else {
                        i18 = i24 + 1;
                        z3 = z;
                        i2 = 8;
                    }
                }
                z = z3;
                f = 0.0f;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                int i25 = c1397.f6517;
                if (z) {
                    i25 = c13972.f6517;
                }
                float f4 = 0.5f;
                if (i5 > i14) {
                    i25 = z ? i25 + ((int) (((i5 - i14) / 2.0f) + 0.5f)) : i25 - ((int) (((i5 - i14) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f5 = i14 - i5;
                    int i26 = (int) ((f5 / i3) + 0.5f);
                    int i27 = 0;
                    int i28 = 0;
                    while (i27 < size) {
                        float f6 = f4;
                        AbstractC1413 abstractC14132 = (AbstractC1413) arrayList.get(i27);
                        int i29 = i25;
                        C0944 c09442 = abstractC14132.f6690;
                        int i30 = i3;
                        C0136 c01362 = abstractC14132.f6688;
                        float f7 = f5;
                        int i31 = i26;
                        if (c09442.f20 == 8 || abstractC14132.f6695 != 3 || c01362.f6520) {
                            i11 = i27;
                        } else {
                            int i32 = f > 0.0f ? (int) (((c09442.f4358[this.f6694] * f7) / f) + f6) : i31;
                            if (this.f6694 == 0) {
                                i9 = c09442.f4374;
                                i10 = c09442.f4376;
                            } else {
                                i9 = c09442.f4404;
                                i10 = c09442.f4350;
                            }
                            i11 = i27;
                            int iMax = Math.max(i10, abstractC14132.f6689 == 1 ? Math.min(i32, c01362.f841) : i32);
                            if (i9 > 0) {
                                iMax = Math.min(i9, iMax);
                            }
                            if (iMax != i32) {
                                i28++;
                                i32 = iMax;
                            }
                            c01362.mo612(i32);
                        }
                        i27 = i11 + 1;
                        i25 = i29;
                        f4 = f6;
                        i3 = i30;
                        f5 = f7;
                        i26 = i31;
                    }
                    i6 = i25;
                    f2 = f4;
                    int i33 = i3;
                    if (i28 > 0) {
                        i3 = i33 - i28;
                        i5 = 0;
                        for (int i34 = 0; i34 < size; i34++) {
                            AbstractC1413 abstractC14133 = (AbstractC1413) arrayList.get(i34);
                            if (abstractC14133.f6690.f20 != 8) {
                                if (i34 > 0 && i34 >= i15) {
                                    i5 += abstractC14133.f6686.f6522;
                                }
                                i5 += abstractC14133.f6688.f6517;
                                if (i34 < i16 && i34 < i) {
                                    i5 += -abstractC14133.f6687.f6522;
                                }
                            }
                        }
                    } else {
                        i3 = i33;
                    }
                    i8 = 2;
                    if (this.f2642 == 2 && i28 == 0) {
                        i7 = 0;
                        this.f2642 = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i25;
                    f2 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i5 > i14) {
                    this.f2642 = i8;
                }
                if (i4 > 0 && i3 == 0 && i15 == i) {
                    this.f2642 = i8;
                }
                int i35 = this.f2642;
                if (i35 == 1) {
                    int i36 = i4 > 1 ? (i14 - i5) / (i4 - 1) : i4 == 1 ? (i14 - i5) / 2 : i7;
                    if (i3 > 0) {
                        i36 = i7;
                    }
                    int i37 = i6;
                    for (int i38 = i7; i38 < size; i38++) {
                        AbstractC1413 abstractC14134 = (AbstractC1413) arrayList.get(z ? size - (i38 + 1) : i38);
                        C0944 c09443 = abstractC14134.f6690;
                        C1397 c13973 = abstractC14134.f6687;
                        C1397 c13974 = abstractC14134.f6686;
                        if (c09443.f20 == 8) {
                            c13974.mo612(i37);
                            c13973.mo612(i37);
                        } else {
                            if (i38 > 0) {
                                i37 = z ? i37 - i36 : i37 + i36;
                            }
                            if (i38 > 0 && i38 >= i15) {
                                i37 = z ? i37 - c13974.f6522 : i37 + c13974.f6522;
                            }
                            if (z) {
                                c13973.mo612(i37);
                            } else {
                                c13974.mo612(i37);
                            }
                            C0136 c01363 = abstractC14134.f6688;
                            int i39 = c01363.f6517;
                            if (abstractC14134.f6695 == 3 && abstractC14134.f6689 == 1) {
                                i39 = c01363.f841;
                            }
                            i37 = z ? i37 - i39 : i37 + i39;
                            if (z) {
                                c13974.mo612(i37);
                            } else {
                                c13973.mo612(i37);
                            }
                            abstractC14134.f6691 = true;
                            if (i38 < i16 && i38 < i) {
                                i37 = z ? i37 - (-c13973.f6522) : i37 + (-c13973.f6522);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 0) {
                    int i40 = (i14 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i40 = i7;
                    }
                    int i41 = i6;
                    for (int i42 = i7; i42 < size; i42++) {
                        AbstractC1413 abstractC14135 = (AbstractC1413) arrayList.get(z ? size - (i42 + 1) : i42);
                        C0944 c09444 = abstractC14135.f6690;
                        C1397 c13975 = abstractC14135.f6687;
                        C1397 c13976 = abstractC14135.f6686;
                        if (c09444.f20 == 8) {
                            c13976.mo612(i41);
                            c13975.mo612(i41);
                        } else {
                            int i43 = z ? i41 - i40 : i41 + i40;
                            if (i42 > 0 && i42 >= i15) {
                                i43 = z ? i43 - c13976.f6522 : i43 + c13976.f6522;
                            }
                            if (z) {
                                c13975.mo612(i43);
                            } else {
                                c13976.mo612(i43);
                            }
                            C0136 c01364 = abstractC14135.f6688;
                            int iMin = c01364.f6517;
                            if (abstractC14135.f6695 == 3 && abstractC14135.f6689 == 1) {
                                iMin = Math.min(iMin, c01364.f841);
                            }
                            i41 = z ? i43 - iMin : i43 + iMin;
                            if (z) {
                                c13976.mo612(i41);
                            } else {
                                c13975.mo612(i41);
                            }
                            if (i42 < i16 && i42 < i) {
                                i41 = z ? i41 - (-c13975.f6522) : i41 + (-c13975.f6522);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 2) {
                    int i44 = this.f6694;
                    C0944 c09445 = this.f6690;
                    float f8 = i44 == 0 ? c09445.f4347 : c09445.f4360;
                    if (z) {
                        f8 = 1.0f - f8;
                    }
                    int i45 = (int) (((i14 - i5) * f8) + f2);
                    if (i45 < 0 || i3 > 0) {
                        i45 = i7;
                    }
                    int i46 = z ? i6 - i45 : i6 + i45;
                    for (int i47 = i7; i47 < size; i47++) {
                        AbstractC1413 abstractC14136 = (AbstractC1413) arrayList.get(z ? size - (i47 + 1) : i47);
                        C0944 c09446 = abstractC14136.f6690;
                        C1397 c13977 = abstractC14136.f6687;
                        C1397 c13978 = abstractC14136.f6686;
                        if (c09446.f20 == 8) {
                            c13978.mo612(i46);
                            c13977.mo612(i46);
                        } else {
                            if (i47 > 0 && i47 >= i15) {
                                i46 = z ? i46 - c13978.f6522 : i46 + c13978.f6522;
                            }
                            if (z) {
                                c13977.mo612(i46);
                            } else {
                                c13978.mo612(i46);
                            }
                            C0136 c01365 = abstractC14136.f6688;
                            int i48 = c01365.f6517;
                            if (abstractC14136.f6695 == 3 && abstractC14136.f6689 == 1) {
                                i48 = c01365.f841;
                            }
                            i46 = z ? i46 - i48 : i46 + i48;
                            if (z) {
                                c13978.mo612(i46);
                            } else {
                                c13977.mo612(i46);
                            }
                            if (i47 < i16 && i47 < i) {
                                i46 = z ? i46 - (-c13977.f6522) : i46 + (-c13977.f6522);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // yyds.AbstractC1413
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final boolean mo1396() {
        ArrayList arrayList = this.f2641;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC1413) arrayList.get(i)).mo1396()) {
                return false;
            }
        }
        return true;
    }

    @Override // yyds.AbstractC1413
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final long mo1397() {
        ArrayList arrayList = this.f2641;
        int size = arrayList.size();
        long jMo1397 = 0;
        for (int i = 0; i < size; i++) {
            AbstractC1413 abstractC1413 = (AbstractC1413) arrayList.get(i);
            jMo1397 = ((long) abstractC1413.f6687.f6522) + abstractC1413.mo1397() + jMo1397 + ((long) abstractC1413.f6686.f6522);
        }
        return jMo1397;
    }

    @Override // yyds.AbstractC1413
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void mo1398() {
        this.f6693 = null;
        Iterator it = this.f2641.iterator();
        while (it.hasNext()) {
            ((AbstractC1413) it.next()).mo1398();
        }
    }

    @Override // yyds.AbstractC1413
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void mo1399() {
        ArrayList arrayList = this.f2641;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC1413) it.next()).mo1399();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C0944 c0944 = ((AbstractC1413) arrayList.get(0)).f6690;
        C0944 c09442 = ((AbstractC1413) arrayList.get(size - 1)).f6690;
        int i = this.f6694;
        C1397 c1397 = this.f6687;
        C1397 c13972 = this.f6686;
        if (i == 0) {
            C2141 c2141 = c0944.f4382;
            C2141 c21412 = c09442.f4344;
            C1397 c1397M2871 = AbstractC1413.m2871(c2141, 0);
            int iM4088 = c2141.m4088();
            C0944 c0944M1393 = m1393();
            if (c0944M1393 != null) {
                iM4088 = c0944M1393.f4382.m4088();
            }
            if (c1397M2871 != null) {
                AbstractC1413.m2872(c13972, c1397M2871, iM4088);
            }
            C1397 c1397M28712 = AbstractC1413.m2871(c21412, 0);
            int iM40882 = c21412.m4088();
            C0944 c0944M1392 = m1392();
            if (c0944M1392 != null) {
                iM40882 = c0944M1392.f4344.m4088();
            }
            if (c1397M28712 != null) {
                AbstractC1413.m2872(c1397, c1397M28712, -iM40882);
            }
        } else {
            C2141 c21413 = c0944.f4403;
            C2141 c21414 = c09442.f4341;
            C1397 c1397M28713 = AbstractC1413.m2871(c21413, 1);
            int iM40883 = c21413.m4088();
            C0944 c0944M13932 = m1393();
            if (c0944M13932 != null) {
                iM40883 = c0944M13932.f4403.m4088();
            }
            if (c1397M28713 != null) {
                AbstractC1413.m2872(c13972, c1397M28713, iM40883);
            }
            C1397 c1397M28714 = AbstractC1413.m2871(c21414, 1);
            int iM40884 = c21414.m4088();
            C0944 c0944M13922 = m1392();
            if (c0944M13922 != null) {
                iM40884 = c0944M13922.f4341.m4088();
            }
            if (c1397M28714 != null) {
                AbstractC1413.m2872(c1397, c1397M28714, -iM40884);
            }
        }
        c13972.f6515 = this;
        c1397.f6515 = this;
    }
}
