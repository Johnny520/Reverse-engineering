package yyds;

import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛵᲇᛴᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1220 extends AbstractC1413 {

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public C1397 f5598;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public C0512 f5599;

    public final String toString() {
        return "VerticalRun " + this.f6690.f4387;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final void m2478() {
        this.f6691 = false;
        C1397 c1397 = this.f6686;
        c1397.m2810();
        c1397.f6520 = false;
        C1397 c13972 = this.f6687;
        c13972.m2810();
        c13972.f6520 = false;
        C1397 c13973 = this.f5598;
        c13973.m2810();
        c13973.f6520 = false;
        this.f6688.f6520 = false;
    }

    @Override // yyds.AbstractC1413
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo1394() {
        C1397 c1397 = this.f6686;
        if (c1397.f6520) {
            this.f6690.f4354 = c1397.f6517;
        }
    }

    @Override // yyds.InterfaceC2299
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo1395(InterfaceC2299 interfaceC2299) {
        float f;
        float f2;
        float f3;
        int i;
        if (AbstractC2104.m4012(this.f6692) == 3) {
            C0944 c0944 = this.f6690;
            m2874(c0944.f4403, c0944.f4341, 1);
            return;
        }
        C0136 c0136 = this.f6688;
        if (c0136.f6521 && !c0136.f6520 && this.f6695 == 3) {
            C0944 c09442 = this.f6690;
            int i2 = c09442.f4389;
            if (i2 == 2) {
                C0859 c0859 = c09442.f4342;
                if (c0859 != null) {
                    if (c0859.f4349.f6688.f6520) {
                        c0136.mo612((int) ((r5.f6517 * c09442.f4366) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C0136 c01362 = c09442.f4400.f6688;
                if (c01362.f6520) {
                    int i3 = c09442.f4368;
                    if (i3 == -1) {
                        f = c01362.f6517;
                        f2 = c09442.f4359;
                    } else if (i3 == 0) {
                        f3 = c01362.f6517 * c09442.f4359;
                        i = (int) (f3 + 0.5f);
                        c0136.mo612(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c0136.mo612(i);
                    } else {
                        f = c01362.f6517;
                        f2 = c09442.f4359;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    c0136.mo612(i);
                }
            }
        }
        C1397 c1397 = this.f6686;
        boolean z = c1397.f6521;
        ArrayList arrayList = c1397.f6519;
        if (z) {
            C1397 c13972 = this.f6687;
            boolean z2 = c13972.f6521;
            ArrayList arrayList2 = c13972.f6519;
            if (z2) {
                if (c1397.f6520 && c13972.f6520 && c0136.f6520) {
                    return;
                }
                if (!c0136.f6520 && this.f6695 == 3) {
                    C0944 c09443 = this.f6690;
                    if (c09443.f4363 == 0 && !c09443.m2074()) {
                        C1397 c13973 = (C1397) arrayList.get(0);
                        C1397 c13974 = (C1397) arrayList2.get(0);
                        int i4 = c13973.f6517 + c1397.f6522;
                        int i5 = c13974.f6517 + c13972.f6522;
                        c1397.mo612(i4);
                        c13972.mo612(i5);
                        c0136.mo612(i5 - i4);
                        return;
                    }
                }
                if (!c0136.f6520 && this.f6695 == 3 && this.f6689 == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C1397 c13975 = (C1397) arrayList.get(0);
                    int i6 = (((C1397) arrayList2.get(0)).f6517 + c13972.f6522) - (c13975.f6517 + c1397.f6522);
                    int i7 = c0136.f841;
                    if (i6 < i7) {
                        c0136.mo612(i6);
                    } else {
                        c0136.mo612(i7);
                    }
                }
                if (c0136.f6520 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C1397 c13976 = (C1397) arrayList.get(0);
                    C1397 c13977 = (C1397) arrayList2.get(0);
                    int i8 = c13976.f6517;
                    int i9 = c1397.f6522 + i8;
                    int i10 = c13977.f6517;
                    int i11 = c13972.f6522 + i10;
                    float f4 = this.f6690.f4360;
                    if (c13976 == c13977) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c1397.mo612((int) ((((i10 - i8) - c0136.f6517) * f4) + i8 + 0.5f));
                    c13972.mo612(c1397.f6517 + c0136.f6517);
                }
            }
        }
    }

    @Override // yyds.AbstractC1413
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public final boolean mo1396() {
        return this.f6695 != 3 || this.f6690.f4389 == 0;
    }

    @Override // yyds.AbstractC1413
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final void mo1398() {
        this.f6693 = null;
        this.f6686.m2810();
        this.f6687.m2810();
        this.f5598.m2810();
        this.f6688.m2810();
        this.f6691 = false;
    }

    @Override // yyds.AbstractC1413
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo1399() {
        C0944 c0944;
        C0859 c0859;
        C0859 c08592;
        C0859 c08593;
        C1397 c1397 = this.f5598;
        C0944 c09442 = this.f6690;
        boolean z = c09442.f4353;
        C0136 c0136 = this.f6688;
        if (z) {
            c0136.mo612(c09442.m2067());
        }
        boolean z2 = c0136.f6520;
        ArrayList arrayList = c0136.f6518;
        ArrayList arrayList2 = c0136.f6519;
        C1397 c13972 = this.f6687;
        C1397 c13973 = this.f6686;
        if (!z2) {
            C0944 c09443 = this.f6690;
            this.f6695 = c09443.f4401[1];
            if (c09443.f4388) {
                this.f5599 = new C0512(this);
            }
            int i = this.f6695;
            if (i != 3) {
                if (i == 4 && (c08593 = this.f6690.f4342) != null && c08593.f4401[1] == 1) {
                    int iM2067 = (c08593.m2067() - this.f6690.f4403.m4088()) - this.f6690.f4341.m4088();
                    AbstractC1413.m2872(c13973, c08593.f4349.f6686, this.f6690.f4403.m4088());
                    AbstractC1413.m2872(c13972, c08593.f4349.f6687, -this.f6690.f4341.m4088());
                    c0136.mo612(iM2067);
                    return;
                }
                if (i == 1) {
                    c0136.mo612(this.f6690.m2067());
                }
            }
        } else if (this.f6695 == 4 && (c0859 = (c0944 = this.f6690).f4342) != null && c0859.f4401[1] == 1) {
            AbstractC1413.m2872(c13973, c0859.f4349.f6686, c0944.f4403.m4088());
            AbstractC1413.m2872(c13972, c0859.f4349.f6687, -this.f6690.f4341.m4088());
            return;
        }
        boolean z3 = c0136.f6520;
        if (z3) {
            C0944 c09444 = this.f6690;
            if (c09444.f4353) {
                C2141[] c2141Arr = c09444.f4378;
                C2141 c2141 = c2141Arr[2];
                C2141 c21412 = c2141.f10577;
                if (c21412 != null && c2141Arr[3].f10577 != null) {
                    boolean zM2074 = c09444.m2074();
                    C0944 c09445 = this.f6690;
                    if (zM2074) {
                        c13973.f6522 = c09445.f4378[2].m4088();
                        c13972.f6522 = -this.f6690.f4378[3].m4088();
                    } else {
                        C1397 c1397M2870 = AbstractC1413.m2870(c09445.f4378[2]);
                        if (c1397M2870 != null) {
                            AbstractC1413.m2872(c13973, c1397M2870, this.f6690.f4378[2].m4088());
                        }
                        C1397 c1397M28702 = AbstractC1413.m2870(this.f6690.f4378[3]);
                        if (c1397M28702 != null) {
                            AbstractC1413.m2872(c13972, c1397M28702, -this.f6690.f4378[3].m4088());
                        }
                        c13973.f6516 = true;
                        c13972.f6516 = true;
                    }
                    C0944 c09446 = this.f6690;
                    if (c09446.f4388) {
                        AbstractC1413.m2872(c1397, c13973, c09446.f4399);
                        return;
                    }
                    return;
                }
                if (c21412 != null) {
                    C1397 c1397M28703 = AbstractC1413.m2870(c2141);
                    if (c1397M28703 != null) {
                        AbstractC1413.m2872(c13973, c1397M28703, this.f6690.f4378[2].m4088());
                        AbstractC1413.m2872(c13972, c13973, c0136.f6517);
                        C0944 c09447 = this.f6690;
                        if (c09447.f4388) {
                            AbstractC1413.m2872(c1397, c13973, c09447.f4399);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C2141 c21413 = c2141Arr[3];
                if (c21413.f10577 != null) {
                    C1397 c1397M28704 = AbstractC1413.m2870(c21413);
                    if (c1397M28704 != null) {
                        AbstractC1413.m2872(c13972, c1397M28704, -this.f6690.f4378[3].m4088());
                        AbstractC1413.m2872(c13973, c13972, -c0136.f6517);
                    }
                    C0944 c09448 = this.f6690;
                    if (c09448.f4388) {
                        AbstractC1413.m2872(c1397, c13973, c09448.f4399);
                        return;
                    }
                    return;
                }
                C2141 c21414 = c2141Arr[4];
                if (c21414.f10577 != null) {
                    C1397 c1397M28705 = AbstractC1413.m2870(c21414);
                    if (c1397M28705 != null) {
                        AbstractC1413.m2872(c1397, c1397M28705, 0);
                        AbstractC1413.m2872(c13973, c1397, -this.f6690.f4399);
                        AbstractC1413.m2872(c13972, c13973, c0136.f6517);
                        return;
                    }
                    return;
                }
                if ((c09444 instanceof C0411) || c09444.f4342 == null || c09444.mo2076(7).f10577 != null) {
                    return;
                }
                C0944 c09449 = this.f6690;
                AbstractC1413.m2872(c13973, c09449.f4342.f4349.f6686, c09449.m2075());
                AbstractC1413.m2872(c13972, c13973, c0136.f6517);
                C0944 c094410 = this.f6690;
                if (c094410.f4388) {
                    AbstractC1413.m2872(c1397, c13973, c094410.f4399);
                    return;
                }
                return;
            }
        }
        if (z3 || this.f6695 != 3) {
            c0136.m2809(this);
        } else {
            C0944 c094411 = this.f6690;
            int i2 = c094411.f4389;
            if (i2 == 2) {
                C0859 c08594 = c094411.f4342;
                if (c08594 != null) {
                    C0136 c01362 = c08594.f4349.f6688;
                    arrayList2.add(c01362);
                    c01362.f6518.add(c0136);
                    c0136.f6516 = true;
                    arrayList.add(c13973);
                    arrayList.add(c13972);
                }
            } else if (i2 == 3 && !c094411.m2074()) {
                C0944 c094412 = this.f6690;
                if (c094412.f4363 != 3) {
                    C0136 c01363 = c094412.f4400.f6688;
                    arrayList2.add(c01363);
                    c01363.f6518.add(c0136);
                    c0136.f6516 = true;
                    arrayList.add(c13973);
                    arrayList.add(c13972);
                }
            }
        }
        C0944 c094413 = this.f6690;
        C2141[] c2141Arr2 = c094413.f4378;
        C2141 c21415 = c2141Arr2[2];
        C2141 c21416 = c21415.f10577;
        if (c21416 != null && c2141Arr2[3].f10577 != null) {
            boolean zM20742 = c094413.m2074();
            C0944 c094414 = this.f6690;
            if (zM20742) {
                c13973.f6522 = c094414.f4378[2].m4088();
                c13972.f6522 = -this.f6690.f4378[3].m4088();
            } else {
                C1397 c1397M28706 = AbstractC1413.m2870(c094414.f4378[2]);
                C1397 c1397M28707 = AbstractC1413.m2870(this.f6690.f4378[3]);
                if (c1397M28706 != null) {
                    c1397M28706.m2809(this);
                }
                if (c1397M28707 != null) {
                    c1397M28707.m2809(this);
                }
                this.f6692 = 4;
            }
            if (this.f6690.f4388) {
                m2875(c1397, c13973, 1, this.f5599);
            }
        } else if (c21416 != null) {
            C1397 c1397M28708 = AbstractC1413.m2870(c21415);
            if (c1397M28708 != null) {
                AbstractC1413.m2872(c13973, c1397M28708, this.f6690.f4378[2].m4088());
                m2875(c13972, c13973, 1, c0136);
                if (this.f6690.f4388) {
                    m2875(c1397, c13973, 1, this.f5599);
                }
                if (this.f6695 == 3) {
                    C0944 c094415 = this.f6690;
                    if (c094415.f4359 > 0.0f) {
                        C1833 c1833 = c094415.f4400;
                        if (c1833.f6695 == 3) {
                            c1833.f6688.f6518.add(c0136);
                            arrayList2.add(this.f6690.f4400.f6688);
                            c0136.f6515 = this;
                        }
                    }
                }
            }
        } else {
            C2141 c21417 = c2141Arr2[3];
            if (c21417.f10577 != null) {
                C1397 c1397M28709 = AbstractC1413.m2870(c21417);
                if (c1397M28709 != null) {
                    AbstractC1413.m2872(c13972, c1397M28709, -this.f6690.f4378[3].m4088());
                    m2875(c13973, c13972, -1, c0136);
                    if (this.f6690.f4388) {
                        m2875(c1397, c13973, 1, this.f5599);
                    }
                }
            } else {
                C2141 c21418 = c2141Arr2[4];
                if (c21418.f10577 != null) {
                    C1397 c1397M287010 = AbstractC1413.m2870(c21418);
                    if (c1397M287010 != null) {
                        AbstractC1413.m2872(c1397, c1397M287010, 0);
                        m2875(c13973, c1397, -1, this.f5599);
                        m2875(c13972, c13973, 1, c0136);
                    }
                } else if (!(c094413 instanceof C0411) && (c08592 = c094413.f4342) != null) {
                    AbstractC1413.m2872(c13973, c08592.f4349.f6686, c094413.m2075());
                    m2875(c13972, c13973, 1, c0136);
                    if (this.f6690.f4388) {
                        m2875(c1397, c13973, 1, this.f5599);
                    }
                    if (this.f6695 == 3) {
                        C0944 c094416 = this.f6690;
                        if (c094416.f4359 > 0.0f) {
                            C1833 c18332 = c094416.f4400;
                            if (c18332.f6695 == 3) {
                                c18332.f6688.f6518.add(c0136);
                                arrayList2.add(this.f6690.f4400.f6688);
                                c0136.f6515 = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            c0136.f6521 = true;
        }
    }
}
