package yyds;

/* JADX INFO: renamed from: yyds.ᛶᲀᲁᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1413 implements InterfaceC2299 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public int f6689;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public C0944 f6690;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public C0327 f6693;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f6695;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C0136 f6688 = new C0136(this);

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f6694 = 0;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public boolean f6691 = false;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final C1397 f6686 = new C1397(this);

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final C1397 f6687 = new C1397(this);

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public int f6692 = 1;

    public AbstractC1413(C0944 c0944) {
        this.f6690 = c0944;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static C1397 m2870(C2141 c2141) {
        C2141 c21412 = c2141.f10577;
        if (c21412 == null) {
            return null;
        }
        C0944 c0944 = c21412.f10578;
        int iM4012 = AbstractC2104.m4012(c21412.f10572);
        if (iM4012 == 1) {
            return c0944.f4400.f6686;
        }
        if (iM4012 == 2) {
            return c0944.f4349.f6686;
        }
        if (iM4012 == 3) {
            return c0944.f4400.f6687;
        }
        if (iM4012 == 4) {
            return c0944.f4349.f6687;
        }
        if (iM4012 != 5) {
            return null;
        }
        return c0944.f4349.f5598;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static C1397 m2871(C2141 c2141, int i) {
        C2141 c21412 = c2141.f10577;
        if (c21412 == null) {
            return null;
        }
        C0944 c0944 = c21412.f10578;
        AbstractC1413 abstractC1413 = i == 0 ? c0944.f4400 : c0944.f4349;
        int iM4012 = AbstractC2104.m4012(c21412.f10572);
        if (iM4012 == 1 || iM4012 == 2) {
            return abstractC1413.f6686;
        }
        if (iM4012 == 3 || iM4012 == 4) {
            return abstractC1413.f6687;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static void m2872(C1397 c1397, C1397 c13972, int i) {
        c1397.f6519.add(c13972);
        c1397.f6522 = i;
        c13972.f6518.add(c1397);
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public abstract void mo1394();

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final int m2873(int i, int i2) {
        C0944 c0944 = this.f6690;
        if (i2 == 0) {
            int i3 = c0944.f4374;
            int iMax = Math.max(c0944.f4376, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            int i4 = c0944.f4404;
            int iMax2 = Math.max(c0944.f4350, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public abstract boolean mo1396();

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2874(C2141 c2141, C2141 c21412, int i) {
        C1397 c1397M2870 = m2870(c2141);
        C1397 c1397M28702 = m2870(c21412);
        if (c1397M2870.f6520 && c1397M28702.f6520) {
            int iM4088 = c2141.m4088() + c1397M2870.f6517;
            int iM40882 = c1397M28702.f6517 - c21412.m4088();
            int i2 = iM40882 - iM4088;
            C0136 c0136 = this.f6688;
            if (!c0136.f6520 && this.f6695 == 3) {
                int i3 = this.f6689;
                if (i3 == 0) {
                    c0136.mo612(m2873(i2, i));
                } else if (i3 == 1) {
                    c0136.mo612(Math.min(m2873(c0136.f841, i), i2));
                } else if (i3 == 2) {
                    C0944 c0944 = this.f6690;
                    C0859 c0859 = c0944.f4342;
                    if (c0859 != null) {
                        if ((i == 0 ? c0859.f4400 : c0859.f4349).f6688.f6520) {
                            c0136.mo612(m2873((int) ((r6.f6517 * (i == 0 ? c0944.f4367 : c0944.f4366)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    C0944 c09442 = this.f6690;
                    AbstractC1413 abstractC1413 = c09442.f4400;
                    if (abstractC1413.f6695 == 3 && abstractC1413.f6689 == 3) {
                        C1220 c1220 = c09442.f4349;
                        if (c1220.f6695 != 3 || c1220.f6689 != 3) {
                        }
                    } else {
                        if (i == 0) {
                            abstractC1413 = c09442.f4349;
                        }
                        C0136 c01362 = abstractC1413.f6688;
                        if (c01362.f6520) {
                            float f = c09442.f4359;
                            int i4 = c01362.f6517;
                            c0136.mo612(i == 1 ? (int) ((i4 / f) + 0.5f) : (int) ((f * i4) + 0.5f));
                        }
                    }
                }
            }
            if (c0136.f6520) {
                int i5 = c0136.f6517;
                C1397 c1397 = this.f6687;
                C1397 c13972 = this.f6686;
                if (i5 == i2) {
                    c13972.mo612(iM4088);
                    c1397.mo612(iM40882);
                    return;
                }
                C0944 c09443 = this.f6690;
                float f2 = i == 0 ? c09443.f4347 : c09443.f4360;
                if (c1397M2870 == c1397M28702) {
                    iM4088 = c1397M2870.f6517;
                    iM40882 = c1397M28702.f6517;
                    f2 = 0.5f;
                }
                c13972.mo612((int) ((((iM40882 - iM4088) - i5) * f2) + iM4088 + 0.5f));
                c1397.mo612(c13972.f6517 + c0136.f6517);
            }
        }
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public long mo1397() {
        if (this.f6688.f6520) {
            return r2.f6517;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m2875(C1397 c1397, C1397 c13972, int i, C0136 c0136) {
        c1397.f6519.add(c13972);
        c1397.f6519.add(this.f6688);
        c1397.f6512 = i;
        c1397.f6513 = c0136;
        c13972.f6518.add(c1397);
        c0136.f6518.add(c1397);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public abstract void mo1398();

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public abstract void mo1399();
}
