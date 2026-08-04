package yyds;

import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛸᛸᛱᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1833 extends AbstractC1413 {

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final int[] f9192 = new int[2];

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static void m3593(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    public final String toString() {
        return "HorizontalRun " + this.f6690.f4387;
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final void m3594() {
        this.f6691 = false;
        C1397 c1397 = this.f6686;
        c1397.m2810();
        c1397.f6520 = false;
        C1397 c13972 = this.f6687;
        c13972.m2810();
        c13972.f6520 = false;
        this.f6688.f6520 = false;
    }

    @Override // yyds.AbstractC1413
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo1394() {
        C1397 c1397 = this.f6686;
        if (c1397.f6520) {
            this.f6690.f4371 = c1397.f6517;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // yyds.InterfaceC2299
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1395(InterfaceC2299 interfaceC2299) {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC2104.m4012(this.f6692) == 3) {
            C0944 c0944 = this.f6690;
            m2874(c0944.f4382, c0944.f4344, 0);
            return;
        }
        C0136 c0136 = this.f6688;
        boolean z = c0136.f6520;
        C1397 c1397 = this.f6686;
        C1397 c13972 = this.f6687;
        if (z || this.f6695 != 3) {
            f = 0.5f;
        } else {
            C0944 c09442 = this.f6690;
            int i2 = c09442.f4363;
            if (i2 == 2) {
                f = 0.5f;
                C0859 c0859 = c09442.f4342;
                if (c0859 != null) {
                    if (c0859.f4400.f6688.f6520) {
                        c0136.mo612((int) ((r5.f6517 * c09442.f4367) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = c09442.f4389;
                if (i3 == 0 || i3 == 3) {
                    C1220 c1220 = c09442.f4349;
                    C1397 c13973 = c1220.f6686;
                    C1397 c13974 = c1220.f6687;
                    boolean z2 = c09442.f4382.f10577 != null;
                    boolean z3 = c09442.f4403.f10577 != null;
                    boolean z4 = c09442.f4344.f10577 != null;
                    boolean z5 = c09442.f4341.f10577 != null;
                    f = 0.5f;
                    int i4 = c09442.f4368;
                    if (z2 && z3 && z4 && z5) {
                        float f5 = c09442.f4359;
                        boolean z6 = c13973.f6520;
                        ArrayList arrayList = c13973.f6519;
                        int[] iArr = f9192;
                        if (z6 && c13974.f6520) {
                            if (c1397.f6521 && c13972.f6521) {
                                m3593(iArr, ((C1397) c1397.f6519.get(0)).f6517 + c1397.f6522, ((C1397) c13972.f6519.get(0)).f6517 - c13972.f6522, c13973.f6517 + c13973.f6522, c13974.f6517 - c13974.f6522, f5, i4);
                                c0136.mo612(iArr[0]);
                                this.f6690.f4349.f6688.mo612(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (c1397.f6520 && c13972.f6520) {
                            if (!c13973.f6521 || !c13974.f6521) {
                                return;
                            }
                            m3593(iArr, c1397.f6517 + c1397.f6522, c13972.f6517 - c13972.f6522, ((C1397) arrayList.get(0)).f6517 + c13973.f6522, ((C1397) c13974.f6519.get(0)).f6517 - c13974.f6522, f5, i4);
                            c0136.mo612(iArr[0]);
                            this.f6690.f4349.f6688.mo612(iArr[1]);
                        }
                        if (!c1397.f6521 || !c13972.f6521 || !c13973.f6521 || !c13974.f6521) {
                            return;
                        }
                        m3593(iArr, ((C1397) c1397.f6519.get(0)).f6517 + c1397.f6522, ((C1397) c13972.f6519.get(0)).f6517 - c13972.f6522, ((C1397) arrayList.get(0)).f6517 + c13973.f6522, ((C1397) c13974.f6519.get(0)).f6517 - c13974.f6522, f5, i4);
                        c0136.mo612(iArr[0]);
                        this.f6690.f4349.f6688.mo612(iArr[1]);
                    } else if (z2 && z4) {
                        if (!c1397.f6521 || !c13972.f6521) {
                            return;
                        }
                        float f6 = c09442.f4359;
                        int i5 = ((C1397) c1397.f6519.get(0)).f6517 + c1397.f6522;
                        int i6 = ((C1397) c13972.f6519.get(0)).f6517 - c13972.f6522;
                        if (i4 == -1 || i4 == 0) {
                            int iM2873 = m2873(i6 - i5, 0);
                            int i7 = (int) ((iM2873 * f6) + 0.5f);
                            int iM28732 = m2873(i7, 1);
                            if (i7 != iM28732) {
                                iM2873 = (int) ((iM28732 / f6) + 0.5f);
                            }
                            c0136.mo612(iM2873);
                            this.f6690.f4349.f6688.mo612(iM28732);
                        } else if (i4 == 1) {
                            int iM28733 = m2873(i6 - i5, 0);
                            int i8 = (int) ((iM28733 / f6) + 0.5f);
                            int iM28734 = m2873(i8, 1);
                            if (i8 != iM28734) {
                                iM28733 = (int) ((iM28734 * f6) + 0.5f);
                            }
                            c0136.mo612(iM28733);
                            this.f6690.f4349.f6688.mo612(iM28734);
                        }
                    } else if (z3 && z5) {
                        if (!c13973.f6521 || !c13974.f6521) {
                            return;
                        }
                        float f7 = c09442.f4359;
                        int i9 = ((C1397) c13973.f6519.get(0)).f6517 + c13973.f6522;
                        int i10 = ((C1397) c13974.f6519.get(0)).f6517 - c13974.f6522;
                        if (i4 == -1) {
                            int iM28735 = m2873(i10 - i9, 1);
                            int i11 = (int) ((iM28735 / f7) + 0.5f);
                            int iM28736 = m2873(i11, 0);
                            if (i11 != iM28736) {
                                iM28735 = (int) ((iM28736 * f7) + 0.5f);
                            }
                            c0136.mo612(iM28736);
                            this.f6690.f4349.f6688.mo612(iM28735);
                        } else if (i4 == 0) {
                            int iM28737 = m2873(i10 - i9, 1);
                            int i12 = (int) ((iM28737 * f7) + 0.5f);
                            int iM28738 = m2873(i12, 0);
                            if (i12 != iM28738) {
                                iM28737 = (int) ((iM28738 / f7) + 0.5f);
                            }
                            c0136.mo612(iM28738);
                            this.f6690.f4349.f6688.mo612(iM28737);
                        } else if (i4 == 1) {
                        }
                    }
                } else {
                    int i13 = c09442.f4368;
                    if (i13 == -1) {
                        f2 = c09442.f4349.f6688.f6517;
                        f3 = c09442.f4359;
                    } else if (i13 == 0) {
                        f4 = c09442.f4349.f6688.f6517 / c09442.f4359;
                        i = (int) (f4 + 0.5f);
                        c0136.mo612(i);
                        f = 0.5f;
                    } else if (i13 != 1) {
                        i = 0;
                        c0136.mo612(i);
                        f = 0.5f;
                    } else {
                        f2 = c09442.f4349.f6688.f6517;
                        f3 = c09442.f4359;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    c0136.mo612(i);
                    f = 0.5f;
                }
            }
        }
        boolean z7 = c1397.f6521;
        ArrayList arrayList2 = c1397.f6519;
        if (z7) {
            boolean z8 = c13972.f6521;
            ArrayList arrayList3 = c13972.f6519;
            if (z8) {
                if (c1397.f6520 && c13972.f6520 && c0136.f6520) {
                    return;
                }
                if (!c0136.f6520 && this.f6695 == 3) {
                    C0944 c09443 = this.f6690;
                    if (c09443.f4363 == 0 && !c09443.m2077()) {
                        C1397 c13975 = (C1397) arrayList2.get(0);
                        C1397 c13976 = (C1397) arrayList3.get(0);
                        int i14 = c13975.f6517 + c1397.f6522;
                        int i15 = c13976.f6517 + c13972.f6522;
                        c1397.mo612(i14);
                        c13972.mo612(i15);
                        c0136.mo612(i15 - i14);
                        return;
                    }
                }
                if (!c0136.f6520 && this.f6695 == 3 && this.f6689 == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((C1397) arrayList3.get(0)).f6517 + c13972.f6522) - (((C1397) arrayList2.get(0)).f6517 + c1397.f6522), c0136.f841);
                    C0944 c09444 = this.f6690;
                    int i16 = c09444.f4374;
                    int iMax = Math.max(c09444.f4376, iMin);
                    if (i16 > 0) {
                        iMax = Math.min(i16, iMax);
                    }
                    c0136.mo612(iMax);
                }
                if (c0136.f6520) {
                    C1397 c13977 = (C1397) arrayList2.get(0);
                    C1397 c13978 = (C1397) arrayList3.get(0);
                    int i17 = c13977.f6517;
                    int i18 = c1397.f6522 + i17;
                    int i19 = c13978.f6517;
                    int i20 = c13972.f6522 + i19;
                    float f8 = this.f6690.f4347;
                    if (c13977 == c13978) {
                        f8 = f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    c1397.mo612((int) ((((i19 - i17) - c0136.f6517) * f8) + i17 + f));
                    c13972.mo612(c1397.f6517 + c0136.f6517);
                }
            }
        }
    }

    @Override // yyds.AbstractC1413
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public final boolean mo1396() {
        return this.f6695 != 3 || this.f6690.f4363 == 0;
    }

    @Override // yyds.AbstractC1413
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final void mo1398() {
        this.f6693 = null;
        this.f6686.m2810();
        this.f6687.m2810();
        this.f6688.m2810();
        this.f6691 = false;
    }

    @Override // yyds.AbstractC1413
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo1399() {
        C0944 c0944;
        C0859 c0859;
        int i;
        C0859 c08592;
        C0859 c08593;
        int i2;
        C0944 c09442 = this.f6690;
        boolean z = c09442.f4353;
        C0136 c0136 = this.f6688;
        if (z) {
            c0136.mo612(c09442.m2072());
        }
        boolean z2 = c0136.f6520;
        ArrayList arrayList = c0136.f6518;
        ArrayList arrayList2 = c0136.f6519;
        C1397 c1397 = this.f6687;
        C1397 c13972 = this.f6686;
        if (!z2) {
            C0944 c09443 = this.f6690;
            int i3 = c09443.f4401[0];
            this.f6695 = i3;
            if (i3 != 3) {
                if (i3 == 4 && (c08593 = c09443.f4342) != null && ((i2 = c08593.f4401[0]) == 1 || i2 == 4)) {
                    int iM2072 = (c08593.m2072() - this.f6690.f4382.m4088()) - this.f6690.f4344.m4088();
                    AbstractC1413.m2872(c13972, c08593.f4400.f6686, this.f6690.f4382.m4088());
                    AbstractC1413.m2872(c1397, c08593.f4400.f6687, -this.f6690.f4344.m4088());
                    c0136.mo612(iM2072);
                    return;
                }
                if (i3 == 1) {
                    c0136.mo612(c09443.m2072());
                }
            }
        } else if (this.f6695 == 4 && (c0859 = (c0944 = this.f6690).f4342) != null && ((i = c0859.f4401[0]) == 1 || i == 4)) {
            AbstractC1413.m2872(c13972, c0859.f4400.f6686, c0944.f4382.m4088());
            AbstractC1413.m2872(c1397, c0859.f4400.f6687, -this.f6690.f4344.m4088());
            return;
        }
        if (c0136.f6520) {
            C0944 c09444 = this.f6690;
            if (c09444.f4353) {
                C2141[] c2141Arr = c09444.f4378;
                C2141 c2141 = c2141Arr[0];
                C2141 c21412 = c2141.f10577;
                if (c21412 != null && c2141Arr[1].f10577 != null) {
                    boolean zM2077 = c09444.m2077();
                    C0944 c09445 = this.f6690;
                    if (zM2077) {
                        c13972.f6522 = c09445.f4378[0].m4088();
                        c1397.f6522 = -this.f6690.f4378[1].m4088();
                        return;
                    }
                    C1397 c1397M2870 = AbstractC1413.m2870(c09445.f4378[0]);
                    if (c1397M2870 != null) {
                        AbstractC1413.m2872(c13972, c1397M2870, this.f6690.f4378[0].m4088());
                    }
                    C1397 c1397M28702 = AbstractC1413.m2870(this.f6690.f4378[1]);
                    if (c1397M28702 != null) {
                        AbstractC1413.m2872(c1397, c1397M28702, -this.f6690.f4378[1].m4088());
                    }
                    c13972.f6516 = true;
                    c1397.f6516 = true;
                    return;
                }
                if (c21412 != null) {
                    C1397 c1397M28703 = AbstractC1413.m2870(c2141);
                    if (c1397M28703 != null) {
                        AbstractC1413.m2872(c13972, c1397M28703, this.f6690.f4378[0].m4088());
                        AbstractC1413.m2872(c1397, c13972, c0136.f6517);
                        return;
                    }
                    return;
                }
                C2141 c21413 = c2141Arr[1];
                if (c21413.f10577 != null) {
                    C1397 c1397M28704 = AbstractC1413.m2870(c21413);
                    if (c1397M28704 != null) {
                        AbstractC1413.m2872(c1397, c1397M28704, -this.f6690.f4378[1].m4088());
                        AbstractC1413.m2872(c13972, c1397, -c0136.f6517);
                        return;
                    }
                    return;
                }
                if ((c09444 instanceof C0411) || c09444.f4342 == null || c09444.mo2076(7).f10577 != null) {
                    return;
                }
                C0944 c09446 = this.f6690;
                AbstractC1413.m2872(c13972, c09446.f4342.f4400.f6686, c09446.m2087());
                AbstractC1413.m2872(c1397, c13972, c0136.f6517);
                return;
            }
        }
        if (this.f6695 == 3) {
            C0944 c09447 = this.f6690;
            int i4 = c09447.f4363;
            if (i4 == 2) {
                C0859 c08594 = c09447.f4342;
                if (c08594 != null) {
                    C0136 c01362 = c08594.f4349.f6688;
                    arrayList2.add(c01362);
                    c01362.f6518.add(c0136);
                    c0136.f6516 = true;
                    arrayList.add(c13972);
                    arrayList.add(c1397);
                }
            } else if (i4 == 3) {
                if (c09447.f4389 == 3) {
                    c13972.f6515 = this;
                    c1397.f6515 = this;
                    C1220 c1220 = c09447.f4349;
                    c1220.f6686.f6515 = this;
                    c1220.f6687.f6515 = this;
                    c0136.f6515 = this;
                    if (c09447.m2074()) {
                        arrayList2.add(this.f6690.f4349.f6688);
                        this.f6690.f4349.f6688.f6518.add(c0136);
                        C1220 c12202 = this.f6690.f4349;
                        c12202.f6688.f6515 = this;
                        arrayList2.add(c12202.f6686);
                        arrayList2.add(this.f6690.f4349.f6687);
                        this.f6690.f4349.f6686.f6518.add(c0136);
                        this.f6690.f4349.f6687.f6518.add(c0136);
                    } else {
                        boolean zM20772 = this.f6690.m2077();
                        C0944 c09448 = this.f6690;
                        if (zM20772) {
                            c09448.f4349.f6688.f6519.add(c0136);
                            arrayList.add(this.f6690.f4349.f6688);
                        } else {
                            c09448.f4349.f6688.f6519.add(c0136);
                        }
                    }
                } else {
                    C0136 c01363 = c09447.f4349.f6688;
                    arrayList2.add(c01363);
                    c01363.f6518.add(c0136);
                    this.f6690.f4349.f6686.f6518.add(c0136);
                    this.f6690.f4349.f6687.f6518.add(c0136);
                    c0136.f6516 = true;
                    arrayList.add(c13972);
                    arrayList.add(c1397);
                    c13972.f6519.add(c0136);
                    c1397.f6519.add(c0136);
                }
            }
        }
        C0944 c09449 = this.f6690;
        C2141[] c2141Arr2 = c09449.f4378;
        C2141 c21414 = c2141Arr2[0];
        C2141 c21415 = c21414.f10577;
        if (c21415 != null && c2141Arr2[1].f10577 != null) {
            boolean zM20773 = c09449.m2077();
            C0944 c094410 = this.f6690;
            if (zM20773) {
                c13972.f6522 = c094410.f4378[0].m4088();
                c1397.f6522 = -this.f6690.f4378[1].m4088();
                return;
            }
            C1397 c1397M28705 = AbstractC1413.m2870(c094410.f4378[0]);
            C1397 c1397M28706 = AbstractC1413.m2870(this.f6690.f4378[1]);
            if (c1397M28705 != null) {
                c1397M28705.m2809(this);
            }
            if (c1397M28706 != null) {
                c1397M28706.m2809(this);
            }
            this.f6692 = 4;
            return;
        }
        if (c21415 != null) {
            C1397 c1397M28707 = AbstractC1413.m2870(c21414);
            if (c1397M28707 != null) {
                AbstractC1413.m2872(c13972, c1397M28707, this.f6690.f4378[0].m4088());
                m2875(c1397, c13972, 1, c0136);
                return;
            }
            return;
        }
        C2141 c21416 = c2141Arr2[1];
        if (c21416.f10577 != null) {
            C1397 c1397M28708 = AbstractC1413.m2870(c21416);
            if (c1397M28708 != null) {
                AbstractC1413.m2872(c1397, c1397M28708, -this.f6690.f4378[1].m4088());
                m2875(c13972, c1397, -1, c0136);
                return;
            }
            return;
        }
        if ((c09449 instanceof C0411) || (c08592 = c09449.f4342) == null) {
            return;
        }
        AbstractC1413.m2872(c13972, c08592.f4400.f6686, c09449.m2087());
        m2875(c1397, c13972, 1, c0136);
    }
}
