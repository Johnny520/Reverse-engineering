package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class u80 implements r70 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ c90 f6160a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jn0 f6161b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0298hw f6162c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC0794u8 f6163d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0966yk f6164e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ jo0 f6165f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0239ga f6166g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u80(c90 c90Var, jn0 jn0Var, x70 x70Var, InterfaceC0794u8 interfaceC0794u8, InterfaceC0966yk interfaceC0966yk, InterfaceC0819ux interfaceC0819ux, jo0 jo0Var, C0239ga c0239ga) {
        this.f6160a = c90Var;
        this.f6161b = jn0Var;
        this.f6162c = x70Var;
        this.f6163d = interfaceC0794u8;
        this.f6164e = interfaceC0966yk;
        this.f6165f = jo0Var;
        this.f6166g = c0239ga;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x07b7  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01af  */
    @Override // p000.r70
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yd0 mo3426a(s70 s70Var, long j) {
        int i;
        long j2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        w80 w80Var;
        int i7;
        List arrayList;
        int i8;
        int i9;
        ArrayList arrayList2;
        y41 y41Var;
        long j3;
        long j4;
        int i10;
        int i11;
        int iM3259f;
        y41 y41Var2;
        oh0 oh0Var;
        boolean z;
        int i12;
        List list;
        Integer numValueOf;
        List list2;
        v80 v80Var;
        int i13;
        tg0 tg0Var;
        int i14;
        int i15;
        ArrayList arrayList3;
        w80 w80VarM4191a;
        int[] iArr;
        int iM4922a;
        Object obj;
        int i16;
        int iMax;
        int i17;
        int iM4199b;
        int i18;
        int i19;
        boolean zM628a = d30.m628a(0L, 0L);
        y41 y41Var3 = s70Var.f5665e;
        c90 c90Var = this.f6160a;
        c90Var.f757s.getValue();
        boolean z2 = c90Var.f740b || y41Var3.mo53m();
        um0 um0Var = um0.f6265e;
        s91.m4051p(j, um0Var);
        k50 layoutDirection = y41Var3.getLayoutDirection();
        k50 k50Var = k50.f3015d;
        jn0 jn0Var = this.f6161b;
        int iMo641F = y41Var3.mo641F(layoutDirection == k50Var ? jn0Var.mo224a(layoutDirection) : jn0Var.mo225b(layoutDirection));
        k50 layoutDirection2 = y41Var3.getLayoutDirection();
        int iMo641F2 = y41Var3.mo641F(layoutDirection2 == k50Var ? jn0Var.mo225b(layoutDirection2) : jn0Var.mo224a(layoutDirection2));
        int iMo641F3 = y41Var3.mo641F(jn0Var.mo227d());
        int iMo641F4 = y41Var3.mo641F(jn0Var.mo226c()) + iMo641F3;
        int i20 = iMo641F2 + iMo641F;
        int i21 = i20 - iMo641F;
        long jM3261h = AbstractC0654qj.m3261h(j, -i20, -iMo641F4);
        r80 r80Var = (r80) this.f6162c.invoke();
        y60 y60Var = r80Var.f5325c;
        int iM3137h = C0617pj.m3137h(jM3261h);
        int iM3136g = C0617pj.m3136g(jM3261h);
        y60Var.f7552a.m721h(iM3137h);
        y60Var.f7553b.m721h(iM3136g);
        InterfaceC0794u8 interfaceC0794u8 = this.f6163d;
        if (interfaceC0794u8 == null) {
            z10.m5362b("null horizontalAlignment when isVertical == false");
            throw new C0725sg();
        }
        int iMo641F5 = y41Var3.mo641F(interfaceC0794u8.mo3374a());
        int iMo2791a = r80Var.mo2791a();
        int iM3137h2 = C0617pj.m3137h(j) - i20;
        y41 y41Var4 = y41Var3;
        t80 t80Var = new t80(jM3261h, r80Var, s70Var, iMo2791a, iMo641F5, this.f6166g, iMo641F, i21, (((long) iMo641F) << 32) | (((long) iMo641F3) & 4294967295L), this.f6160a);
        int i22 = iMo641F;
        l21 l21VarM4270k = u50.m4270k();
        Integer numValueOf2 = null;
        InterfaceC0742sw interfaceC0742swMo809e = l21VarM4270k != null ? l21VarM4270k.mo809e() : null;
        l21 l21VarM4276s = u50.m4276s(l21VarM4270k);
        try {
            C0206fe c0206fe = c90Var.f743e;
            int iM720g = ((dp0) c0206fe.f1697b).m720g();
            int iM1212k = g60.m1212k(iM720g, r80Var, c0206fe.f1699d);
            if (iM720g != iM1212k) {
                i = iMo2791a;
                ((dp0) c0206fe.f1697b).m721h(iM1212k);
                ((t70) c0206fe.f1700e).m4190a(iM720g);
            } else {
                i = iMo2791a;
            }
            int iM720g2 = ((dp0) c0206fe.f1698c).m720g();
            u50.m4283z(l21VarM4270k, l21VarM4276s, interfaceC0742swMo809e);
            List listM1659i = j50.m1659i(r80Var, c90Var.f756r, c90Var.f753o);
            float fFloatValue = (y41Var4.mo53m() || !z2) ? c90Var.f746h : ((Number) ((C0879w7) c90Var.f761w.f920f).f7016e.getValue()).floatValue();
            l70 l70Var = c90Var.f752n;
            int i23 = iM1212k;
            boolean zMo53m = y41Var4.mo53m();
            oh0 oh0Var2 = c90Var.f760v;
            if (i22 < 0) {
                z10.m5361a("invalid beforeContentPadding");
            }
            if (i21 < 0) {
                z10.m5361a("invalid afterContentPadding");
            }
            C0330is c0330is = C0330is.f2614d;
            int i24 = iM720g2;
            r80 r80Var2 = t80Var.f5942b;
            float f2 = fFloatValue;
            InterfaceC0966yk interfaceC0966yk = this.f6164e;
            C0294hs c0294hs = C0294hs.f2354d;
            if (i <= 0) {
                int iM3139j = C0617pj.m3139j(jM3261h);
                int iM3138i = C0617pj.m3138i(jM3261h);
                l70Var.m1980b(iM3139j, iM3138i, new ArrayList(), r80Var2.f5326d, t80Var, zMo53m, z2, 0, 0);
                if (!zMo53m) {
                    l70Var.m1979a();
                    if (zM628a) {
                        i19 = iM3139j;
                    } else {
                        int iM3259f2 = AbstractC0654qj.m3259f(0, jM3261h);
                        iM3138i = AbstractC0654qj.m3258e(0, jM3261h);
                        i19 = iM3259f2;
                    }
                    v80Var = new v80(null, 0, false, 0.0f, y41Var4.mo1279Q(AbstractC0654qj.m3259f(i19 + i20, j), AbstractC0654qj.m3258e(iM3138i + iMo641F4, j), c0330is, new C0621pn(25)), 0.0f, false, interfaceC0966yk, s70Var, t80Var.f5944d, c0294hs, -i22, iM3137h2 + i21, 0, um0Var, i21, iMo641F5);
                }
            } else {
                int i25 = i;
                boolean z3 = z2;
                if (i23 >= i25) {
                    i23 = i25 - 1;
                    i24 = 0;
                }
                int iRound = Math.round(f2);
                int i26 = i24 - iRound;
                if (i23 == 0 && i26 < 0) {
                    iRound += i26;
                    i26 = 0;
                }
                C0917x8 c0917x8 = new C0917x8();
                int i27 = -i22;
                int i28 = (iMo641F5 < 0 ? iMo641F5 : 0) + i27;
                int i29 = i27;
                int i30 = i26 + i28;
                int i31 = i23;
                int iMax2 = 0;
                while (true) {
                    j2 = t80Var.f5944d;
                    if (i30 >= 0 || i31 <= 0) {
                        break;
                    }
                    oh0 oh0Var3 = oh0Var2;
                    int i32 = i31 - 1;
                    w80 w80VarM4191a2 = t80Var.m4191a(i32, j2);
                    c0917x8.add(0, w80VarM4191a2);
                    iMax2 = Math.max(iMax2, w80VarM4191a2.f7042l);
                    i30 += w80VarM4191a2.f7041k;
                    i31 = i32;
                    oh0Var2 = oh0Var3;
                }
                oh0 oh0Var4 = oh0Var2;
                if (i30 < i28) {
                    iRound -= i28 - i30;
                    i30 = i28;
                }
                int i33 = iRound;
                int i34 = i30 - i28;
                int i35 = iM3137h2 + i21;
                int i36 = iMax2;
                int i37 = i35 < 0 ? 0 : i35;
                int i38 = -i34;
                int i39 = i34;
                int i40 = i31;
                int i41 = 0;
                boolean z4 = false;
                while (i41 < c0917x8.f7284f) {
                    if (i38 >= i37) {
                        c0917x8.mo1b(i41);
                        z4 = true;
                    } else {
                        i40++;
                        i38 += ((w80) c0917x8.get(i41)).f7041k;
                        i41++;
                    }
                }
                int iMax3 = i36;
                int i42 = i40;
                while (i42 < i25 && (i38 < i37 || i38 <= 0 || c0917x8.isEmpty())) {
                    int i43 = i25;
                    w80 w80VarM4191a3 = t80Var.m4191a(i42, j2);
                    int i44 = i37;
                    int i45 = w80VarM4191a3.f7041k;
                    i38 += i45;
                    if (i38 <= i28) {
                        i18 = i28;
                        if (i42 != i43 - 1) {
                            i39 -= i45;
                            i31 = i42 + 1;
                            z4 = true;
                        }
                        i42++;
                        i25 = i43;
                        i37 = i44;
                        i28 = i18;
                    } else {
                        i18 = i28;
                    }
                    int iMax4 = Math.max(iMax3, w80VarM4191a3.f7042l);
                    c0917x8.addLast(w80VarM4191a3);
                    iMax3 = iMax4;
                    i42++;
                    i25 = i43;
                    i37 = i44;
                    i28 = i18;
                }
                int i46 = i25;
                if (i38 < iM3137h2) {
                    int i47 = iM3137h2 - i38;
                    i38 += i47;
                    i5 = i39 - i47;
                    while (i5 < i22 && i31 > 0) {
                        int i48 = i31 - 1;
                        int i49 = i47;
                        w80 w80VarM4191a4 = t80Var.m4191a(i48, j2);
                        c0917x8.add(0, w80VarM4191a4);
                        iMax3 = Math.max(iMax3, w80VarM4191a4.f7042l);
                        i5 += w80VarM4191a4.f7041k;
                        i31 = i48;
                        i47 = i49;
                        i22 = i22;
                    }
                    i2 = i22;
                    i3 = i33 + i47;
                    if (i5 < 0) {
                        i3 += i5;
                        i38 += i5;
                        i4 = i31;
                        i5 = 0;
                    } else {
                        i4 = i31;
                    }
                } else {
                    i2 = i22;
                    i3 = i33;
                    i4 = i31;
                    i5 = i39;
                }
                int i50 = iMax3;
                float f3 = (Integer.signum(Math.round(f2)) != Integer.signum(i3) || Math.abs(Math.round(f2)) < Math.abs(i3)) ? f2 : i3;
                float f4 = f2 - f3;
                float f5 = 0.0f;
                if (zMo53m && i3 > i33 && f4 <= 0.0f) {
                    f5 = (i3 - i33) + f4;
                }
                float f6 = f5;
                if (i5 < 0) {
                    z10.m5361a("negative currentFirstItemScrollOffset");
                }
                int i51 = -i5;
                w80 w80Var2 = (w80) c0917x8.first();
                if (i2 > 0 || iMo641F5 < 0) {
                    int iMo0a = c0917x8.mo0a();
                    w80 w80Var3 = w80Var2;
                    i6 = i5;
                    int i52 = 0;
                    while (true) {
                        if (i52 >= iMo0a) {
                            f = f6;
                            break;
                        }
                        f = f6;
                        int i53 = ((w80) c0917x8.get(i52)).f7041k;
                        if (i6 == 0 || i53 > i6 || i52 == c0917x8.mo0a() - 1) {
                            break;
                        }
                        i6 -= i53;
                        i52++;
                        w80Var3 = (w80) c0917x8.get(i52);
                        f6 = f;
                    }
                    w80Var = w80Var3;
                } else {
                    f = f6;
                    w80Var = w80Var2;
                    i6 = i5;
                }
                int iMax5 = Math.max(0, i4);
                int i54 = i4 - 1;
                if (iMax5 <= i54) {
                    arrayList = null;
                    while (true) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        i7 = i51;
                        arrayList.add(t80Var.m4191a(i54, j2));
                        if (i54 == iMax5) {
                            break;
                        }
                        i54--;
                        i51 = i7;
                    }
                } else {
                    i7 = i51;
                    arrayList = null;
                }
                int size = listM1659i.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i55 = size - 1;
                        int iIntValue = ((Number) listM1659i.get(size)).intValue();
                        if (iIntValue < iMax5) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(t80Var.m4191a(iIntValue, j2));
                        }
                        if (i55 < 0) {
                            break;
                        }
                        size = i55;
                    }
                }
                if (arrayList == null) {
                    arrayList = c0294hs;
                }
                int iMax6 = i50;
                int i56 = 0;
                for (int size2 = arrayList.size(); i56 < size2; size2 = size2) {
                    iMax6 = Math.max(iMax6, ((w80) arrayList.get(i56)).f7042l);
                    i56++;
                }
                int iMin = Math.min(((w80) AbstractC0960ye.m5246P(c0917x8)).f7031a, i46 - 1);
                int i57 = ((w80) AbstractC0960ye.m5246P(c0917x8)).f7031a + 1;
                if (i57 <= iMin) {
                    ArrayList arrayList4 = null;
                    while (true) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        i8 = iMax6;
                        arrayList2 = arrayList4;
                        i9 = i6;
                        arrayList2.add(t80Var.m4191a(i57, j2));
                        if (i57 == iMin) {
                            break;
                        }
                        i57++;
                        i6 = i9;
                        arrayList4 = arrayList2;
                        iMax6 = i8;
                    }
                } else {
                    i8 = iMax6;
                    i9 = i6;
                    arrayList2 = null;
                }
                if (arrayList2 != null && ((w80) AbstractC0960ye.m5246P(arrayList2)).f7031a > iMin) {
                    iMin = ((w80) AbstractC0960ye.m5246P(arrayList2)).f7031a;
                }
                int size3 = listM1659i.size();
                List arrayList5 = arrayList2;
                int i58 = 0;
                while (i58 < size3) {
                    List list3 = listM1659i;
                    int iIntValue2 = ((Number) listM1659i.get(i58)).intValue();
                    if (iIntValue2 > iMin) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        arrayList5.add(t80Var.m4191a(iIntValue2, j2));
                    }
                    i58++;
                    listM1659i = list3;
                }
                if (arrayList5 == null) {
                    arrayList5 = c0294hs;
                }
                int size4 = arrayList5.size();
                int iMax7 = i8;
                for (int i59 = 0; i59 < size4; i59++) {
                    iMax7 = Math.max(iMax7, ((w80) arrayList5.get(i59)).f7042l);
                }
                boolean z5 = p30.m3002l(w80Var, c0917x8.first()) && arrayList.isEmpty() && arrayList5.isEmpty();
                int iM3259f3 = AbstractC0654qj.m3259f(i38, jM3261h);
                int iM3258e = AbstractC0654qj.m3258e(iMax7, jM3261h);
                boolean z6 = i38 < Math.min(iM3259f3, iM3137h2);
                if (z6 && i7 != 0) {
                    z10.m5363c("non-zero itemsScrollOffset");
                }
                w80 w80Var4 = w80Var;
                ArrayList arrayList6 = new ArrayList(arrayList5.size() + arrayList.size() + c0917x8.mo0a());
                if (z6) {
                    if (!arrayList.isEmpty() || !arrayList5.isEmpty()) {
                        z10.m5361a("no extra items");
                    }
                    int iMo0a2 = c0917x8.mo0a();
                    int[] iArr2 = new int[iMo0a2];
                    for (int i60 = 0; i60 < iMo0a2; i60++) {
                        iArr2[i60] = ((w80) c0917x8.get(i60)).f7040j;
                    }
                    int[] iArr3 = new int[iMo0a2];
                    if (interfaceC0794u8 == null) {
                        z10.m5362b("null horizontalArrangement when isVertical == false");
                        throw new C0725sg();
                    }
                    y41Var = y41Var4;
                    i10 = iM3259f3;
                    j3 = j2;
                    j4 = jM3261h;
                    interfaceC0794u8.mo3375b(s70Var, i10, iArr2, k50Var, iArr3);
                    z20 z20VarM1063i0 = AbstractC0201f9.m1063i0(iArr3);
                    int i61 = z20VarM1063i0.f7248d;
                    int i62 = z20VarM1063i0.f7249e;
                    int i63 = z20VarM1063i0.f7250f;
                    if ((i63 > 0 && i61 <= i62) || (i63 < 0 && i62 <= i61)) {
                        while (true) {
                            int i64 = iArr3[i61];
                            int i65 = i63;
                            w80 w80Var5 = (w80) c0917x8.get(i61);
                            w80Var5.m4924c(i64, i10, iM3258e);
                            arrayList6.add(w80Var5);
                            if (i61 == i62) {
                                break;
                            }
                            i61 += i65;
                            i63 = i65;
                        }
                    }
                    i11 = iM3137h2;
                } else {
                    y41Var = y41Var4;
                    j3 = j2;
                    j4 = jM3261h;
                    i10 = iM3259f3;
                    i11 = iM3137h2;
                    int size5 = arrayList.size();
                    int i66 = i7;
                    int i67 = 0;
                    while (i67 < size5) {
                        int i68 = size5;
                        w80 w80Var6 = (w80) arrayList.get(i67);
                        i66 -= w80Var6.f7041k;
                        w80Var6.m4924c(i66, i10, iM3258e);
                        arrayList6.add(w80Var6);
                        i67++;
                        size5 = i68;
                    }
                    int iMo0a3 = c0917x8.mo0a();
                    int i69 = i7;
                    for (int i70 = 0; i70 < iMo0a3; i70++) {
                        w80 w80Var7 = (w80) c0917x8.get(i70);
                        w80Var7.m4924c(i69, i10, iM3258e);
                        arrayList6.add(w80Var7);
                        i69 += w80Var7.f7041k;
                    }
                    int size6 = arrayList5.size();
                    for (int i71 = 0; i71 < size6; i71++) {
                        w80 w80Var8 = (w80) arrayList5.get(i71);
                        w80Var8.m4924c(i69, i10, iM3258e);
                        arrayList6.add(w80Var8);
                        i69 += w80Var8.f7041k;
                    }
                }
                int i72 = i42;
                int i73 = i38;
                oh0 oh0Var5 = oh0Var4;
                int i74 = i10;
                l70Var.m1980b(i74, iM3258e, arrayList6, r80Var2.f5326d, t80Var, zMo53m, z3, i9, i73);
                if (!zMo53m) {
                    l70Var.m1979a();
                    if (zM628a) {
                        iM3259f = i74;
                    } else {
                        iM3259f = AbstractC0654qj.m3259f(Math.max(i74, 0), j4);
                        iM3258e = AbstractC0654qj.m3258e(Math.max(iM3258e, 0), j4);
                        if (iM3259f != i74) {
                            int size7 = arrayList6.size();
                            for (int i75 = 0; i75 < size7; i75++) {
                                ((w80) arrayList6.get(i75)).f7044n = iM3259f;
                            }
                        }
                    }
                    w80 w80Var9 = (w80) (c0917x8.isEmpty() ? null : c0917x8.f7283e[c0917x8.f7282d]);
                    int i76 = w80Var9 != null ? w80Var9.f7031a : 0;
                    w80 w80Var10 = (w80) c0917x8.m5098f();
                    int i77 = w80Var10 != null ? w80Var10.f7031a : 0;
                    r80Var2.f5324b.getClass();
                    tg0 tg0Var2 = t20.f5890a;
                    if (this.f6165f == null || arrayList6.isEmpty() || (i13 = tg0Var2.f6001b) == 0) {
                        y41Var2 = y41Var;
                        oh0Var = oh0Var5;
                        z = true;
                        i12 = i29;
                        list = c0294hs;
                    } else {
                        if (i77 - i76 < 0 || i13 == 0) {
                            tg0Var = tg0Var2;
                        } else {
                            z20 z20VarM4893O = w60.m4893O(0, i13);
                            int i78 = z20VarM4893O.f7248d;
                            int i79 = z20VarM4893O.f7249e;
                            if (i78 <= i79) {
                                int i80 = -1;
                                while (true) {
                                    if (tg0Var2.m4199b(i78) > i76) {
                                        iM4199b = i80;
                                        break;
                                    }
                                    iM4199b = tg0Var2.m4199b(i78);
                                    if (i78 == i79) {
                                        break;
                                    }
                                    i78++;
                                    i80 = iM4199b;
                                }
                                i17 = -1;
                            } else {
                                i17 = -1;
                                iM4199b = -1;
                            }
                            if (iM4199b == i17) {
                                tg0Var = t20.f5890a;
                            } else {
                                tg0Var = new tg0(1);
                                tg0Var.m4198a(iM4199b);
                            }
                        }
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList(arrayList6.size());
                        int size8 = arrayList6.size();
                        y41Var2 = y41Var;
                        int i81 = 0;
                        while (i81 < size8) {
                            int i82 = size8;
                            Object obj2 = arrayList6.get(i81);
                            int i83 = i81;
                            int i84 = ((w80) obj2).f7031a;
                            oh0 oh0Var6 = oh0Var5;
                            int[] iArr4 = tg0Var2.f6000a;
                            int i85 = tg0Var2.f6001b;
                            tg0 tg0Var3 = tg0Var2;
                            int i86 = 0;
                            while (true) {
                                if (i86 < i85) {
                                    int i87 = i86;
                                    if (iArr4[i87] == i84) {
                                        arrayList8.add(obj2);
                                        break;
                                    }
                                    i86 = i87 + 1;
                                }
                            }
                            i81 = i83 + 1;
                            size8 = i82;
                            tg0Var2 = tg0Var3;
                            oh0Var5 = oh0Var6;
                        }
                        oh0Var = oh0Var5;
                        int[] iArr5 = tg0Var.f6000a;
                        int i88 = tg0Var.f6001b;
                        int i89 = 0;
                        ArrayList arrayList9 = arrayList7;
                        while (i89 < i88) {
                            int i90 = iArr5[i89];
                            Iterator it = arrayList6.iterator();
                            int i91 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i14 = i88;
                                    i15 = -1;
                                    break;
                                }
                                i14 = i88;
                                if (((w80) it.next()).f7031a == i90) {
                                    i15 = i91;
                                    break;
                                }
                                i91++;
                                i88 = i14;
                            }
                            if (i15 == -1) {
                                arrayList3 = arrayList9;
                                w80VarM4191a = t80Var.m4191a(i90, j3);
                            } else {
                                arrayList3 = arrayList9;
                                w80VarM4191a = (w80) arrayList6.remove(i15);
                            }
                            w80 w80Var11 = w80VarM4191a;
                            int i92 = w80Var11.f7041k;
                            if (i15 == -1) {
                                iArr = iArr5;
                                iM4922a = Integer.MIN_VALUE;
                            } else {
                                iArr = iArr5;
                                iM4922a = (int) (w80Var11.m4922a(0) >> 32);
                            }
                            int size9 = arrayList8.size();
                            int i93 = i89;
                            int i94 = 0;
                            while (true) {
                                if (i94 >= size9) {
                                    obj = null;
                                    break;
                                }
                                obj = arrayList8.get(i94);
                                int i95 = size9;
                                if (((w80) obj).f7031a != i90) {
                                    break;
                                }
                                i94++;
                                size9 = i95;
                            }
                            w80 w80Var12 = (w80) obj;
                            int iM4922a2 = w80Var12 != null ? (int) (w80Var12.m4922a(0) >> 32) : Integer.MIN_VALUE;
                            if (iM4922a == Integer.MIN_VALUE) {
                                iMax = i29;
                                i16 = iMax;
                            } else {
                                i16 = i29;
                                iMax = Math.max(i16, iM4922a);
                            }
                            if (iM4922a2 != Integer.MIN_VALUE) {
                                iMax = Math.min(iMax, iM4922a2 - i92);
                            }
                            w80Var11.f7043m = true;
                            w80Var11.m4924c(iMax, iM3259f, iM3258e);
                            ArrayList arrayList10 = arrayList3;
                            arrayList10.add(w80Var11);
                            i89 = i93 + 1;
                            i29 = i16;
                            iArr5 = iArr;
                            i88 = i14;
                            arrayList9 = arrayList10;
                        }
                        i12 = i29;
                        z = true;
                        list = arrayList9;
                    }
                    if (z5) {
                        w80 w80Var13 = (w80) AbstractC0960ye.m5241K(arrayList6);
                        numValueOf = w80Var13 != null ? Integer.valueOf(w80Var13.f7031a) : null;
                        if (z5) {
                            w80 w80Var14 = (w80) c0917x8.m5098f();
                            if (w80Var14 != null) {
                                numValueOf2 = Integer.valueOf(w80Var14.f7031a);
                            }
                        } else {
                            w80 w80Var15 = (w80) AbstractC0960ye.m5247Q(arrayList6);
                            if (w80Var15 != null) {
                                numValueOf2 = Integer.valueOf(w80Var15.f7031a);
                            }
                        }
                        if (i72 >= i46 && i73 <= i11) {
                            z = false;
                        }
                        y41 y41Var5 = y41Var2;
                        yd0 yd0VarMo1279Q = y41Var5.mo1279Q(AbstractC0654qj.m3259f(iM3259f + i20, j), AbstractC0654qj.m3258e(iM3258e + iMo641F4, j), c0330is, new C1006zj(oh0Var, arrayList6, list, zMo53m));
                        int iIntValue3 = numValueOf == null ? numValueOf.intValue() : 0;
                        int iIntValue4 = numValueOf2 == null ? numValueOf2.intValue() : 0;
                        if (arrayList6.isEmpty()) {
                            ArrayList arrayList11 = new ArrayList(list);
                            int size10 = arrayList6.size();
                            for (int i96 = 0; i96 < size10; i96++) {
                                w80 w80Var16 = (w80) arrayList6.get(i96);
                                int i97 = w80Var16.f7031a;
                                if (iIntValue3 <= i97 && i97 <= iIntValue4) {
                                    arrayList11.add(w80Var16);
                                }
                            }
                            AbstractC0127df.m688F(arrayList11, o30.f4441k);
                            list2 = arrayList11;
                        } else {
                            list2 = c0294hs;
                        }
                        y41Var4 = y41Var5;
                        v80Var = new v80(w80Var4, i9, z, f3, yd0VarMo1279Q, f, z4, interfaceC0966yk, s70Var, t80Var.f5944d, list2, i12, i35, i46, um0Var, i21, iMo641F5);
                    } else {
                        w80 w80Var17 = (w80) (c0917x8.isEmpty() ? null : c0917x8.f7283e[c0917x8.f7282d]);
                        if (w80Var17 != null) {
                            numValueOf = Integer.valueOf(w80Var17.f7031a);
                        }
                        if (z5) {
                        }
                        if (i72 >= i46) {
                            z = false;
                        }
                        y41 y41Var52 = y41Var2;
                        yd0 yd0VarMo1279Q2 = y41Var52.mo1279Q(AbstractC0654qj.m3259f(iM3259f + i20, j), AbstractC0654qj.m3258e(iM3258e + iMo641F4, j), c0330is, new C1006zj(oh0Var, arrayList6, list, zMo53m));
                        if (numValueOf == null) {
                        }
                        if (numValueOf2 == null) {
                        }
                        if (arrayList6.isEmpty()) {
                        }
                        y41Var4 = y41Var52;
                        v80Var = new v80(w80Var4, i9, z, f3, yd0VarMo1279Q2, f, z4, interfaceC0966yk, s70Var, t80Var.f5944d, list2, i12, i35, i46, um0Var, i21, iMo641F5);
                    }
                }
            }
            c90Var.m505f(v80Var, y41Var4.mo53m(), false);
            C0134dm c0134dm = c90Var.f739a;
            return v80Var;
        } catch (Throwable th) {
            u50.m4283z(l21VarM4270k, l21VarM4276s, interfaceC0742swMo809e);
            throw th;
        }
    }
}
