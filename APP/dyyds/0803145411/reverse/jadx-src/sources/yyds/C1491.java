package yyds;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛷᛲᛴᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1491 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public Object f7036;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public List f7037;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public boolean f7038;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public boolean f7039;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public Object f7040;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public Object f7041;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public Object f7042;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Object f7043;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static void m2991(InterfaceC0124 interfaceC0124) throws Exception {
        InterfaceC1212 interfaceC1212Mo575 = interfaceC0124.mo575("PRAGMA busy_timeout");
        try {
            interfaceC1212Mo575.mo433();
            long j = interfaceC1212Mo575.getLong(0);
            AbstractC0797.m1819(interfaceC1212Mo575, null);
            if (j < 3000) {
                AbstractC2328.m4335(interfaceC0124, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC0797.m1819(interfaceC1212Mo575, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public void m2992(int i, int i2, int i3, int i4, C0944 c0944) {
        C0390 c0390 = (C0390) this.f7036;
        c0390.f2014 = i;
        c0390.f2015 = i3;
        c0390.f2018 = i2;
        c0390.f2020 = i4;
        ((C2594) this.f7040).m4676(c0944, c0390);
        c0944.m2064(c0390.f2013);
        c0944.m2082(c0390.f2019);
        c0944.f4388 = c0390.f2011;
        int i5 = c0390.f2016;
        c0944.f4399 = i5;
        c0944.f4388 = i5 > 0;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public void m2993(InterfaceC0124 interfaceC0124) throws Exception {
        AbstractC2328.m4335(interfaceC0124, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        AbstractC2328.m4335(interfaceC0124, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) ((AbstractC0353) this.f7043).f1829) + "')");
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public void m2994() {
        C1491 c1491;
        C0512 c0512;
        for (C0944 c0944 : ((C0859) this.f7041).f3930) {
            if (!c0944.f4353) {
                int[] iArr = c0944.f4401;
                boolean z = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = c0944.f4363;
                int i4 = c0944.f4389;
                boolean z2 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z = true;
                }
                C0136 c0136 = c0944.f4400.f6688;
                boolean z3 = c0136.f6520;
                C0136 c01362 = c0944.f4349.f6688;
                boolean z4 = c01362.f6520;
                boolean z5 = z2;
                if (z3 && z4) {
                    c1491 = this;
                    c1491.m2992(1, c0136.f6517, 1, c01362.f6517, c0944);
                    c0944.f4353 = true;
                } else if (z3 && z) {
                    c1491 = this;
                    c1491.m2992(1, c0136.f6517, 2, c01362.f6517, c0944);
                    C1220 c1220 = c0944.f4349;
                    if (i2 == 3) {
                        c1220.f6688.f841 = c0944.m2067();
                    } else {
                        c1220.f6688.mo612(c0944.m2067());
                        c0944.f4353 = true;
                    }
                } else {
                    c1491 = this;
                    if (z4 && z5) {
                        c1491.m2992(2, c0136.f6517, 1, c01362.f6517, c0944);
                        C1833 c1833 = c0944.f4400;
                        if (i == 3) {
                            c1833.f6688.f841 = c0944.m2072();
                        } else {
                            c1833.f6688.mo612(c0944.m2072());
                            c0944.f4353 = true;
                        }
                    }
                }
                if (c0944.f4353 && (c0512 = c0944.f4349.f5599) != null) {
                    c0512.mo612(c0944.f4399);
                }
                this = c1491;
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public void m2995(C1397 c1397, int i, ArrayList arrayList, C0327 c0327) {
        AbstractC1413 abstractC1413 = c1397.f6523;
        C0327 c03272 = abstractC1413.f6693;
        C1397 c13972 = abstractC1413.f6687;
        C1397 c13973 = abstractC1413.f6686;
        if (c03272 == null) {
            C0859 c0859 = (C0859) this.f7041;
            if (abstractC1413 == c0859.f4400 || abstractC1413 == c0859.f4349) {
                return;
            }
            if (c0327 == null) {
                c0327 = new C0327();
                c0327.f1715 = null;
                c0327.f1716 = new ArrayList();
                c0327.f1715 = abstractC1413;
                arrayList.add(c0327);
            }
            abstractC1413.f6693 = c0327;
            c0327.f1716.add(abstractC1413);
            for (InterfaceC2299 interfaceC2299 : c13973.f6518) {
                if (interfaceC2299 instanceof C1397) {
                    m2995((C1397) interfaceC2299, i, arrayList, c0327);
                }
            }
            for (InterfaceC2299 interfaceC22992 : c13972.f6518) {
                if (interfaceC22992 instanceof C1397) {
                    m2995((C1397) interfaceC22992, i, arrayList, c0327);
                }
            }
            if (i == 1 && (abstractC1413 instanceof C1220)) {
                for (InterfaceC2299 interfaceC22993 : ((C1220) abstractC1413).f5598.f6518) {
                    if (interfaceC22993 instanceof C1397) {
                        m2995((C1397) interfaceC22993, i, arrayList, c0327);
                    }
                }
            }
            Iterator it = c13973.f6519.iterator();
            while (it.hasNext()) {
                m2995((C1397) it.next(), i, arrayList, c0327);
            }
            Iterator it2 = c13972.f6519.iterator();
            while (it2.hasNext()) {
                m2995((C1397) it2.next(), i, arrayList, c0327);
            }
            if (i == 1 && (abstractC1413 instanceof C1220)) {
                Iterator it3 = ((C1220) abstractC1413).f5598.f6519.iterator();
                while (it3.hasNext()) {
                    m2995((C1397) it3.next(), i, arrayList, c0327);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x027e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x000a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019c  */
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m2996(C0859 c0859) {
        int i;
        int iM2067;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        ArrayList<C0944> arrayList = c0859.f3930;
        int[] iArr = c0859.f4401;
        for (C0944 c0944 : arrayList) {
            int[] iArr2 = c0944.f4401;
            C2141[] c2141Arr = c0944.f4378;
            C2141 c2141 = c0944.f4341;
            C2141 c21412 = c0944.f4403;
            C2141 c21413 = c0944.f4344;
            C2141 c21414 = c0944.f4382;
            int i12 = iArr2[0];
            int i13 = iArr2[1];
            if (c0944.f20 == 8) {
                c0944.f4353 = true;
            } else {
                float f = c0944.f4367;
                if (f < 1.0f && i12 == 3) {
                    c0944.f4363 = 2;
                }
                float f2 = c0944.f4366;
                if (f2 < 1.0f && i13 == 3) {
                    c0944.f4389 = 2;
                }
                if (c0944.f4359 > 0.0f) {
                    if (i12 == 3 && (i13 == 2 || i13 == 1)) {
                        c0944.f4363 = 3;
                    } else if (i13 == 3 && (i12 == 2 || i12 == 1)) {
                        c0944.f4389 = 3;
                    } else if (i12 == 3 && i13 == 3) {
                        if (c0944.f4363 == 0) {
                            c0944.f4363 = 3;
                        }
                        if (c0944.f4389 == 0) {
                            c0944.f4389 = 3;
                        }
                    }
                }
                if (i12 == 3 && c0944.f4363 == 1 && (c21414.f10577 == null || c21413.f10577 == null)) {
                    i12 = 2;
                }
                if (i13 == 3 && c0944.f4389 == 1 && (c21412.f10577 == null || c2141.f10577 == null)) {
                    i13 = 2;
                }
                C1833 c1833 = c0944.f4400;
                c1833.f6695 = i12;
                int i14 = c0944.f4363;
                c1833.f6689 = i14;
                C1220 c1220 = c0944.f4349;
                c1220.f6695 = i13;
                int i15 = c0944.f4389;
                c1220.f6689 = i15;
                if (i12 == 4 || i12 == 1) {
                    if (i13 != 4) {
                        if (i13 != 1) {
                            i3 = 2;
                            if (i13 != 2) {
                                if (i12 == 3) {
                                    i4 = i13;
                                    i5 = 1;
                                } else if (i13 != i3 && i13 != 1) {
                                    i4 = i13;
                                    i6 = 3;
                                    i5 = 1;
                                    if (i4 != i6) {
                                    }
                                    if (i12 != i10) {
                                    }
                                } else if (i14 == 3) {
                                    if (i13 == i3) {
                                        m2992(i3, 0, i3, 0, c0944);
                                    }
                                    int iM20672 = c0944.m2067();
                                    m2992(1, (int) ((iM20672 * c0944.f4359) + 0.5f), 1, iM20672, c0944);
                                    c0944.f4400.f6688.mo612(c0944.m2072());
                                    c0944.f4349.f6688.mo612(c0944.m2067());
                                    c0944.f4353 = true;
                                } else {
                                    int i16 = i3;
                                    i5 = 1;
                                    if (i14 == 1) {
                                        m2992(i16, 0, i13, 0, c0944);
                                        c0944.f4400.f6688.f841 = c0944.m2072();
                                    } else {
                                        i3 = i16;
                                        i4 = i13;
                                        if (i14 == 2) {
                                            int i17 = iArr[0];
                                            if (i17 == 1 || i17 == 4) {
                                                m2992(1, (int) ((f * c0859.m2072()) + 0.5f), i4, c0944.m2067(), c0944);
                                                c0944.f4400.f6688.mo612(c0944.m2072());
                                                c0944.f4349.f6688.mo612(c0944.m2067());
                                                c0944.f4353 = true;
                                            }
                                        } else if (c2141Arr[0].f10577 == null || c2141Arr[1].f10577 == null) {
                                            m2992(i3, 0, i4, 0, c0944);
                                            c0944.f4400.f6688.mo612(c0944.m2072());
                                            c0944.f4349.f6688.mo612(c0944.m2067());
                                            c0944.f4353 = true;
                                        }
                                        if (i4 != i6) {
                                            if (i12 != i3 && i12 != i5) {
                                                i10 = i6;
                                                i7 = i4;
                                                i8 = i3;
                                            } else if (i15 == i6) {
                                                if (i12 == i3) {
                                                    i11 = i5;
                                                    m2992(i3, 0, i3, 0, c0944);
                                                } else {
                                                    i11 = i5;
                                                }
                                                int iM2072 = c0944.m2072();
                                                float f3 = c0944.f4359;
                                                if (c0944.f4368 == -1) {
                                                    f3 = 1.0f / f3;
                                                }
                                                m2992(i11, iM2072, i11, (int) ((iM2072 * f3) + 0.5f), c0944);
                                                c0944.f4400.f6688.mo612(c0944.m2072());
                                                c0944.f4349.f6688.mo612(c0944.m2067());
                                                c0944.f4353 = true;
                                            } else {
                                                i7 = i4;
                                                i8 = i3;
                                                if (i15 == 1) {
                                                    m2992(i12, 0, i8, 0, c0944);
                                                    c0944.f4349.f6688.f841 = c0944.m2067();
                                                } else if (i15 == 2) {
                                                    int i18 = iArr[1];
                                                    if (i18 == i5 || i18 == 4) {
                                                        m2992(i12, c0944.m2072(), i5, (int) ((f2 * c0859.m2067()) + 0.5f), c0944);
                                                        c0944.f4400.f6688.mo612(c0944.m2072());
                                                        c0944.f4349.f6688.mo612(c0944.m2067());
                                                        c0944.f4353 = true;
                                                    } else {
                                                        i10 = 3;
                                                    }
                                                } else if (c2141Arr[2].f10577 == null || c2141Arr[3].f10577 == null) {
                                                    m2992(i8, 0, i7, 0, c0944);
                                                    c0944.f4400.f6688.mo612(c0944.m2072());
                                                    c0944.f4349.f6688.mo612(c0944.m2067());
                                                    c0944.f4353 = true;
                                                } else {
                                                    i10 = 3;
                                                }
                                            }
                                            i9 = 1;
                                        } else {
                                            i7 = i4;
                                            i8 = i3;
                                            i9 = 1;
                                            i10 = 3;
                                        }
                                        if (i12 != i10 && i7 == i10) {
                                            if (i14 == i9 || i15 == i9) {
                                                m2992(i8, 0, i8, 0, c0944);
                                                c0944.f4400.f6688.f841 = c0944.m2072();
                                                c0944.f4349.f6688.f841 = c0944.m2067();
                                            } else if (i15 == 2 && i14 == 2 && iArr[0] == i5 && iArr[i9] == i5) {
                                                m2992(i5, (int) ((f * c0859.m2072()) + 0.5f), i5, (int) ((f2 * c0859.m2067()) + 0.5f), c0944);
                                                c0944.f4400.f6688.mo612(c0944.m2072());
                                                c0944.f4349.f6688.mo612(c0944.m2067());
                                                c0944.f4353 = true;
                                            }
                                        }
                                    }
                                }
                                i6 = 3;
                                if (i4 != i6) {
                                }
                                if (i12 != i10) {
                                }
                            }
                        } else {
                            i = 1;
                            int iM20722 = c0944.m2072();
                            if (i12 == 4) {
                                iM20722 = (c0859.m2072() - c21414.f10575) - c21413.f10575;
                                i12 = i;
                            }
                            int iM20673 = c0944.m2067();
                            if (i13 != 4) {
                                iM2067 = (c0859.m2067() - c21412.f10575) - c2141.f10575;
                                i2 = i;
                            } else {
                                iM2067 = iM20673;
                                i2 = i13;
                            }
                            m2992(i12, iM20722, i2, iM2067, c0944);
                            c0944.f4400.f6688.mo612(c0944.m2072());
                            c0944.f4349.f6688.mo612(c0944.m2067());
                            c0944.f4353 = true;
                        }
                    }
                    i = 1;
                    int iM207222 = c0944.m2072();
                    if (i12 == 4) {
                    }
                    int iM206732 = c0944.m2067();
                    if (i13 != 4) {
                    }
                    m2992(i12, iM207222, i2, iM2067, c0944);
                    c0944.f4400.f6688.mo612(c0944.m2072());
                    c0944.f4349.f6688.mo612(c0944.m2067());
                    c0944.f4353 = true;
                } else {
                    i3 = 2;
                    if (i12 == 2) {
                    }
                    if (i12 == 3) {
                    }
                    i6 = 3;
                    if (i4 != i6) {
                    }
                    if (i12 != i10) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public void m2997(AbstractC1413 abstractC1413, int i, ArrayList arrayList) {
        C1397 c1397 = abstractC1413.f6686;
        C1397 c13972 = abstractC1413.f6687;
        for (InterfaceC2299 interfaceC2299 : c1397.f6518) {
            if (interfaceC2299 instanceof C1397) {
                m2995((C1397) interfaceC2299, i, arrayList, null);
            } else if (interfaceC2299 instanceof AbstractC1413) {
                m2995(((AbstractC1413) interfaceC2299).f6686, i, arrayList, null);
            }
        }
        for (InterfaceC2299 interfaceC22992 : c13972.f6518) {
            if (interfaceC22992 instanceof C1397) {
                m2995((C1397) interfaceC22992, i, arrayList, null);
            } else if (interfaceC22992 instanceof AbstractC1413) {
                m2995(((AbstractC1413) interfaceC22992).f6687, i, arrayList, null);
            }
        }
        if (i == 1) {
            for (InterfaceC2299 interfaceC22993 : ((C1220) abstractC1413).f5598.f6518) {
                if (interfaceC22993 instanceof C1397) {
                    m2995((C1397) interfaceC22993, i, arrayList, null);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m2998(InterfaceC0124 interfaceC0124, int i, int i2) {
        boolean z;
        AbstractC0353 abstractC0353 = (AbstractC0353) this.f7043;
        C0544 c0544 = (C0544) this.f7041;
        List<C1024> listM3199 = AbstractC1544.m3199(c0544.f2616, i, i2);
        if (listM3199 != null) {
            abstractC0353.mo1048(interfaceC0124);
            for (C1024 c1024 : listM3199) {
                c1024.getClass();
                if (!(interfaceC0124 instanceof C1519)) {
                    throw new C0869("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
                }
                C0574 c0574 = ((C1519) interfaceC0124).f7336;
                switch (c1024.f4673) {
                    case 0:
                        AbstractC2328.m4341(-1702193896522606L);
                        c0574.m1446(AbstractC2328.m4341(-1702206781424494L));
                        c0574.m1446(AbstractC2328.m4341(-1702477364364142L));
                        break;
                    case 1:
                        AbstractC2328.m4341(-18536651719534L);
                        c0574.m1446(AbstractC2328.m4341(-18549536621422L));
                        break;
                    default:
                        AbstractC2328.m4341(-1624429218661230L);
                        c0574.m1446(AbstractC2328.m4341(-1624442103563118L));
                        c0574.m1446(AbstractC2328.m4341(-1624686916698990L));
                        c0574.m1446(AbstractC2328.m4341(-1624918844932974L));
                        break;
                }
            }
            C1572 c1572Mo1047 = abstractC0353.mo1047(interfaceC0124);
            if (!c1572Mo1047.f7969) {
                throw new IllegalStateException(("Migration didn't properly handle: " + ((String) c1572Mo1047.f7970)).toString());
            }
            abstractC0353.mo1042();
            m2993(interfaceC0124);
            return;
        }
        if (i <= i2 || !c0544.f2611) {
            Set set = c0544.f2602;
            z = c0544.f2610 && (set == null || !set.contains(Integer.valueOf(i)));
        }
        if (z) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (c0544.f2614) {
            InterfaceC1212 interfaceC1212Mo575 = interfaceC0124.mo575("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                C2578 c2578M3296 = AbstractC0024.m3296();
                while (interfaceC1212Mo575.mo433()) {
                    String strMo430 = interfaceC1212Mo575.mo430(0);
                    if (!strMo430.startsWith("sqlite_") && !strMo430.equals("android_metadata")) {
                        c2578M3296.add(new Pair(strMo430, Boolean.valueOf(AbstractC1544.m3188(interfaceC1212Mo575.mo430(1), "view"))));
                    }
                }
                C2578 c2578M3305 = AbstractC0024.m3305(c2578M3296);
                AbstractC0797.m1819(interfaceC1212Mo575, null);
                ListIterator listIterator = c2578M3305.listIterator(0);
                while (true) {
                    C0368 c0368 = (C0368) listIterator;
                    if (!c0368.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) c0368.next();
                    String str = (String) pair.component1();
                    if (((Boolean) pair.component2()).booleanValue()) {
                        AbstractC2328.m4335(interfaceC0124, "DROP VIEW IF EXISTS `" + str + '`');
                    } else {
                        AbstractC2328.m4335(interfaceC0124, "DROP TABLE IF EXISTS `" + str + '`');
                    }
                }
            } finally {
            }
        } else {
            abstractC0353.mo1053(interfaceC0124);
        }
        Iterator it = this.f7037.iterator();
        while (it.hasNext()) {
            ((C0113) it.next()).getClass();
        }
        abstractC0353.mo1041(interfaceC0124);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m2999(InterfaceC0124 interfaceC0124) throws Exception {
        boolean z;
        Object c2658;
        C1572 c1572Mo1047;
        AbstractC0353 abstractC0353 = (AbstractC0353) this.f7043;
        String str = (String) abstractC0353.f1829;
        InterfaceC1212 interfaceC1212Mo575 = interfaceC0124.mo575("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            if (interfaceC1212Mo575.mo433()) {
                z = interfaceC1212Mo575.getLong(0) != 0;
            }
            AbstractC0797.m1819(interfaceC1212Mo575, null);
            if (z) {
                interfaceC1212Mo575 = interfaceC0124.mo575("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                try {
                    String strMo430 = interfaceC1212Mo575.mo433() ? interfaceC1212Mo575.mo430(0) : null;
                    AbstractC0797.m1819(interfaceC1212Mo575, null);
                    if (!str.equals(strMo430) && !((String) abstractC0353.f1830).equals(strMo430)) {
                        throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + str + ", found: " + strMo430).toString());
                    }
                } finally {
                }
            } else {
                AbstractC2328.m4335(interfaceC0124, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    c1572Mo1047 = abstractC0353.mo1047(interfaceC0124);
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                if (!c1572Mo1047.f7969) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + ((String) c1572Mo1047.f7970)).toString());
                }
                abstractC0353.mo1042();
                m2993(interfaceC0124);
                c2658 = C2746.f13459;
                if (!(c2658 instanceof C2658)) {
                    AbstractC2328.m4335(interfaceC0124, "END TRANSACTION");
                }
                Throwable thM4249 = C2248.m4249(c2658);
                if (thM4249 != null) {
                    AbstractC2328.m4335(interfaceC0124, "ROLLBACK TRANSACTION");
                    throw thM4249;
                }
            }
            abstractC0353.mo1052(interfaceC0124);
            for (C0113 c0113 : this.f7037) {
                c0113.getClass();
                if (interfaceC0124 instanceof C1519) {
                    c0113.f792.mo371(((C1519) interfaceC0124).f7336);
                }
            }
            this.f7038 = true;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public void m3000(InterfaceC0124 interfaceC0124) throws Exception {
        AbstractC0353 abstractC0353 = (AbstractC0353) this.f7043;
        InterfaceC1212 interfaceC1212Mo575 = interfaceC0124.mo575("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (interfaceC1212Mo575.mo433()) {
                if (interfaceC1212Mo575.getLong(0) == 0) {
                    z = true;
                }
            }
            AbstractC0797.m1819(interfaceC1212Mo575, null);
            abstractC0353.mo1041(interfaceC0124);
            if (!z) {
                C1572 c1572Mo1047 = abstractC0353.mo1047(interfaceC0124);
                if (!c1572Mo1047.f7969) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + ((String) c1572Mo1047.f7970)).toString());
                }
            }
            m2993(interfaceC0124);
            abstractC0353.mo1044();
            Iterator it = this.f7037.iterator();
            while (it.hasNext()) {
                ((C0113) it.next()).getClass();
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public void m3001() {
        C0859 c0859 = (C0859) this.f7041;
        ArrayList arrayList = (ArrayList) this.f7042;
        ArrayList<AbstractC1413> arrayList2 = (ArrayList) this.f7037;
        arrayList2.clear();
        C0859 c08592 = (C0859) this.f7043;
        c08592.f4400.mo1398();
        c08592.f4349.mo1398();
        arrayList2.add(c08592.f4400);
        arrayList2.add(c08592.f4349);
        HashSet hashSet = null;
        for (C0944 c0944 : c08592.f3930) {
            if (c0944 instanceof C2076) {
                C2275 c2275 = new C2275(c0944);
                c0944.f4400.mo1398();
                c0944.f4349.mo1398();
                c2275.f6694 = ((C2076) c0944).f10262;
                arrayList2.add(c2275);
            } else {
                if (c0944.m2077()) {
                    if (c0944.f4365 == null) {
                        c0944.f4365 = new C0552(c0944, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0944.f4365);
                } else {
                    arrayList2.add(c0944.f4400);
                }
                if (c0944.m2074()) {
                    if (c0944.f4390 == null) {
                        c0944.f4390 = new C0552(c0944, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0944.f4390);
                } else {
                    arrayList2.add(c0944.f4349);
                }
                if (c0944 instanceof C0411) {
                    arrayList2.add(new C2775(c0944));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((AbstractC1413) it.next()).mo1398();
        }
        for (AbstractC1413 abstractC1413 : arrayList2) {
            if (abstractC1413.f6690 != c08592) {
                abstractC1413.mo1399();
            }
        }
        arrayList.clear();
        m2997(c0859.f4400, 0, arrayList);
        m2997(c0859.f4349, 1, arrayList);
        this.f7038 = false;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public void m3002(InterfaceC0124 interfaceC0124) throws Exception {
        Object c2658;
        int i = ((AbstractC0353) this.f7043).f1828;
        m2991(interfaceC0124);
        C0544 c0544 = (C0544) this.f7041;
        if (c0544.f2609 == 3) {
            AbstractC2328.m4335(interfaceC0124, "PRAGMA journal_mode = WAL");
        } else {
            AbstractC2328.m4335(interfaceC0124, "PRAGMA journal_mode = TRUNCATE");
        }
        if (c0544.f2609 == 3) {
            AbstractC2328.m4335(interfaceC0124, "PRAGMA synchronous = NORMAL");
        } else {
            AbstractC2328.m4335(interfaceC0124, "PRAGMA synchronous = FULL");
        }
        InterfaceC1212 interfaceC1212Mo575 = interfaceC0124.mo575("PRAGMA user_version");
        try {
            interfaceC1212Mo575.mo433();
            int i2 = (int) interfaceC1212Mo575.getLong(0);
            AbstractC0797.m1819(interfaceC1212Mo575, null);
            if (i2 != i) {
                AbstractC2328.m4335(interfaceC0124, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i2 == 0) {
                        m3000(interfaceC0124);
                    } else {
                        m2998(interfaceC0124, i2, i);
                    }
                    AbstractC2328.m4335(interfaceC0124, "PRAGMA user_version = " + i);
                    c2658 = C2746.f13459;
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                if (!(c2658 instanceof C2658)) {
                    AbstractC2328.m4335(interfaceC0124, "END TRANSACTION");
                }
                Throwable thM4249 = C2248.m4249(c2658);
                if (thM4249 != null) {
                    AbstractC2328.m4335(interfaceC0124, "ROLLBACK TRANSACTION");
                    throw thM4249;
                }
            }
            m2999(interfaceC0124);
        } finally {
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int m3003(C0859 c0859, int i) {
        ArrayList arrayList;
        int i2;
        long jMax;
        float f;
        C0859 c08592 = c0859;
        ArrayList arrayList2 = (ArrayList) this.f7042;
        int size = arrayList2.size();
        long j = 0;
        int i3 = 0;
        long jMax2 = 0;
        while (i3 < size) {
            AbstractC1413 abstractC1413 = ((C0327) arrayList2.get(i3)).f1715;
            if (!(abstractC1413 instanceof C0552) ? !(i != 0 ? (abstractC1413 instanceof C1220) : (abstractC1413 instanceof C1833)) : ((C0552) abstractC1413).f6694 != i) {
                C1397 c1397 = (i == 0 ? c08592.f4400 : c08592.f4349).f6686;
                C1397 c13972 = (i == 0 ? c08592.f4400 : c08592.f4349).f6687;
                C1397 c13973 = abstractC1413.f6686;
                C1397 c13974 = abstractC1413.f6687;
                boolean zContains = c13973.f6519.contains(c1397);
                boolean zContains2 = c13974.f6519.contains(c13972);
                long jMo1397 = abstractC1413.mo1397();
                if (zContains && zContains2) {
                    long jM995 = C0327.m995(c13973, j);
                    arrayList = arrayList2;
                    long jM994 = C0327.m994(c13974, j);
                    long j2 = jM995 - jMo1397;
                    int i4 = c13974.f6522;
                    i2 = i3;
                    if (j2 >= (-i4)) {
                        j2 += (long) i4;
                    }
                    long j3 = c13973.f6522;
                    long j4 = ((-jM994) - jMo1397) - j3;
                    if (j4 >= j3) {
                        j4 -= j3;
                    }
                    C0944 c0944 = abstractC1413.f6690;
                    if (i == 0) {
                        f = c0944.f4347;
                    } else if (i == 1) {
                        f = c0944.f4360;
                    } else {
                        c0944.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j2 / (1.0f - f)) + (j4 / f)) : 0L;
                    jMax = (((long) c13973.f6522) + ((((long) ((f2 * f) + 0.5f)) + jMo1397) + ((long) (((1.0f - f) * f2) + 0.5f)))) - ((long) c13974.f6522);
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    jMax = zContains ? Math.max(C0327.m995(c13973, c13973.f6522), ((long) c13973.f6522) + jMo1397) : zContains2 ? Math.max(-C0327.m994(c13974, c13974.f6522), ((long) (-c13974.f6522)) + jMo1397) : (abstractC1413.mo1397() + ((long) c13973.f6522)) - ((long) c13974.f6522);
                }
            } else {
                arrayList = arrayList2;
                jMax = j;
                i2 = i3;
            }
            jMax2 = Math.max(jMax2, jMax);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            c08592 = c0859;
            j = 0;
        }
        return (int) jMax2;
    }
}
