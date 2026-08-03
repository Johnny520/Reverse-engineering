package p339x1;

import gg.AbstractC1416l;
import java.util.HashSet;
import p069f.C0925b0;
import p117i0.C1856m0;
import p131j0.C2046b;
import p292u1.AbstractC4229a;
import p356y0.AbstractC5852n;
import p356y0.InterfaceC5851m;
import p356y0.InterfaceC5853o;
import p357y1.C5916o1;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: x1.b1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5587b1 {

    /* JADX INFO: renamed from: a */
    public final C5602f0 f22714a;

    /* JADX INFO: renamed from: b */
    public final C5583a1 f22715b;

    /* JADX INFO: renamed from: c */
    public final C5639r f22716c;

    /* JADX INFO: renamed from: d */
    public AbstractC5614i1 f22717d;

    /* JADX INFO: renamed from: e */
    public final C5588b2 f22718e;

    /* JADX INFO: renamed from: f */
    public AbstractC5852n f22719f;

    /* JADX INFO: renamed from: g */
    public C2046b f22720g;

    /* JADX INFO: renamed from: h */
    public C2046b f22721h;

    /* JADX INFO: renamed from: i */
    public final C2046b f22722i;

    /* JADX INFO: renamed from: j */
    public C5664z0 f22723j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5587b1(C5602f0 c5602f0) {
        this.f22714a = c5602f0;
        C5583a1 c5583a1 = new C5583a1();
        c5583a1.f23791j = -1;
        this.f22715b = c5583a1;
        C5639r c5639r = new C5639r(c5602f0);
        this.f22716c = c5639r;
        this.f22717d = c5639r;
        C5588b2 c5588b2 = c5639r.f22950Y;
        this.f22718e = c5588b2;
        this.f22719f = c5588b2;
        this.f22722i = new C2046b(new InterfaceC5853o[16]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m9978a(C5587b1 c5587b1, AbstractC5852n abstractC5852n, AbstractC5614i1 abstractC5614i1) {
        for (AbstractC5852n abstractC5852n2 = abstractC5852n.f23792k; abstractC5852n2 != null; abstractC5852n2 = abstractC5852n2.f23792k) {
            if (abstractC5852n2 == c5587b1.f22715b) {
                C5602f0 c5602f0M10049u = c5587b1.f22714a.m10049u();
                abstractC5614i1.f22870w = c5602f0M10049u != null ? c5602f0M10049u.f22778L.f22716c : null;
                c5587b1.f22717d = abstractC5614i1;
                return;
            } else {
                if ((abstractC5852n2.f23790i & 2) != 0) {
                    return;
                }
                abstractC5852n2.mo10121j1(abstractC5614i1);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static AbstractC5852n m9979b(InterfaceC5851m interfaceC5851m, AbstractC5852n abstractC5852n) {
        AbstractC5852n abstractC5852nMo740f;
        if (interfaceC5851m instanceof AbstractC5658x0) {
            abstractC5852nMo740f = ((AbstractC5658x0) interfaceC5851m).mo740f();
            abstractC5852nMo740f.f23790i = AbstractC5617j1.m10140f(abstractC5852nMo740f);
        } else {
            C5585b c5585b = new C5585b();
            c5585b.f23790i = AbstractC5617j1.m10138d(interfaceC5851m);
            c5585b.f22707u = interfaceC5851m;
            new HashSet();
            abstractC5852nMo740f = c5585b;
        }
        if (abstractC5852nMo740f.f23801t) {
            AbstractC4229a.m8494b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        abstractC5852nMo740f.f23796o = true;
        AbstractC5852n abstractC5852n2 = abstractC5852n.f23793l;
        if (abstractC5852n2 != null) {
            abstractC5852n2.f23792k = abstractC5852nMo740f;
            abstractC5852nMo740f.f23793l = abstractC5852n2;
        }
        abstractC5852n.f23793l = abstractC5852nMo740f;
        abstractC5852nMo740f.f23792k = abstractC5852n;
        return abstractC5852nMo740f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static AbstractC5852n m9980c(AbstractC5852n abstractC5852n) {
        boolean z9 = abstractC5852n.f23801t;
        if (z9) {
            C0925b0 c0925b0 = AbstractC5617j1.f22893a;
            if (!z9) {
                AbstractC4229a.m8494b("autoInvalidateRemovedNode called on unattached node");
            }
            AbstractC5617j1.m10135a(abstractC5852n, -1, 2);
            abstractC5852n.mo10119h1();
            abstractC5852n.mo10116b1();
        }
        AbstractC5852n abstractC5852n2 = abstractC5852n.f23793l;
        AbstractC5852n abstractC5852n3 = abstractC5852n.f23792k;
        if (abstractC5852n2 != null) {
            abstractC5852n2.f23792k = abstractC5852n3;
            abstractC5852n.f23793l = null;
        }
        if (abstractC5852n3 != null) {
            abstractC5852n3.f23793l = abstractC5852n2;
            abstractC5852n.f23792k = null;
        }
        abstractC5852n3.getClass();
        return abstractC5852n3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m9981h(InterfaceC5851m interfaceC5851m, InterfaceC5851m interfaceC5851m2, AbstractC5852n abstractC5852n) {
        if ((interfaceC5851m instanceof AbstractC5658x0) && (interfaceC5851m2 instanceof AbstractC5658x0)) {
            abstractC5852n.getClass();
            ((AbstractC5658x0) interfaceC5851m2).mo741g(abstractC5852n);
            if (abstractC5852n.f23801t) {
                AbstractC5617j1.m10137c(abstractC5852n);
                return;
            } else {
                abstractC5852n.f23797p = true;
                return;
            }
        }
        if (!(abstractC5852n instanceof C5585b)) {
            AbstractC4229a.m8494b("Unknown Modifier.Node type");
            return;
        }
        C5585b c5585b = (C5585b) abstractC5852n;
        boolean z9 = c5585b.f23801t;
        if (z9) {
            if (!z9) {
                AbstractC4229a.m8494b("unInitializeModifier called on unattached node");
            }
            if ((c5585b.f23790i & 8) != 0) {
                ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5618k.m10168x(c5585b)).m10646E();
            }
        }
        c5585b.f22707u = interfaceC5851m2;
        c5585b.f23790i = AbstractC5617j1.m10138d(interfaceC5851m2);
        if (c5585b.f23801t) {
            c5585b.m9977k1(false);
        }
        if (abstractC5852n.f23801t) {
            AbstractC5617j1.m10137c(abstractC5852n);
        } else {
            abstractC5852n.f23797p = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m9982d(int i9) {
        return (i9 & this.f22719f.f23791j) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m9983e() {
        for (AbstractC5852n abstractC5852n = this.f22719f; abstractC5852n != null; abstractC5852n = abstractC5852n.f23793l) {
            abstractC5852n.mo10118g1();
            if (abstractC5852n.f23796o) {
                C0925b0 c0925b0 = AbstractC5617j1.f22893a;
                if (!abstractC5852n.f23801t) {
                    AbstractC4229a.m8494b("autoInvalidateInsertedNode called on unattached node");
                }
                AbstractC5617j1.m10135a(abstractC5852n, -1, 1);
            }
            if (abstractC5852n.f23797p) {
                AbstractC5617j1.m10137c(abstractC5852n);
            }
            abstractC5852n.f23796o = false;
            abstractC5852n.f23797p = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0262, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0268, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0148, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014e, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0150, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0152, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0154, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0155, code lost:
    
        if (r13 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0157, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0159, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015b, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0169, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016c, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016e, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0177, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0179, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0180, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0186, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0188, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018b, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018d, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018f, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0192, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0194, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019e, code lost:
    
        if (r14 <= r7) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a0, code lost:
    
        if (r11 <= r15) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a2, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ae, code lost:
    
        if (r0.m10229a(r14 - 1, r27 - 1) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b0, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b7, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bb, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01bf, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c1, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c3, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c5, code lost:
    
        if (r11 > r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cb, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01cd, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0109 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013e  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m9984f(int i9, C2046b c2046b, C2046b c2046b2, AbstractC5852n abstractC5852n, boolean z9) {
        int i10;
        C2046b c2046b3;
        C2046b c2046b4;
        int i11;
        int[] iArr;
        int[] iArr2;
        char c10;
        char c11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        C5664z0 c5664z0 = this.f22723j;
        if (c5664z0 == null) {
            i10 = i9;
            c2046b3 = c2046b;
            c2046b4 = c2046b2;
            c5664z0 = new C5664z0(this, abstractC5852n, i10, c2046b3, c2046b4, z9);
            this.f22723j = c5664z0;
        } else {
            i10 = i9;
            c2046b3 = c2046b;
            c2046b4 = c2046b2;
            c5664z0.f23051a = abstractC5852n;
            c5664z0.f23052b = i10;
            c5664z0.f23053c = c2046b3;
            c5664z0.f23054d = c2046b4;
            c5664z0.f23055e = z9;
        }
        C5587b1 c5587b1 = c5664z0.f23056f;
        int i17 = c2046b3.f6893i - i10;
        int i18 = c2046b4.f6893i - i10;
        char c12 = 2;
        int i19 = ((i17 + i18) + 1) / 2;
        C1856m0 c1856m0 = new C1856m0(i19 * 3);
        C1856m0 c1856m02 = new C1856m0(i19 * 4);
        int i20 = 0;
        c1856m02.m4579e(0, i17, 0, i18);
        int i21 = (i19 * 2) + 1;
        int[] iArr3 = new int[i21];
        int[] iArr4 = new int[i21];
        int[] iArr5 = new int[5];
        while (true) {
            int i22 = c1856m02.f6175b;
            if (i22 == 0) {
                break;
            }
            char c13 = c12;
            int[] iArr6 = c1856m02.f6174a;
            int i23 = i20;
            int i24 = i22 - 1;
            c1856m02.f6175b = i24;
            int i25 = iArr6[i24];
            int i26 = i22 - 2;
            c1856m02.f6175b = i26;
            int i27 = iArr6[i26];
            int i28 = i22 - 3;
            c1856m02.f6175b = i28;
            int i29 = iArr6[i28];
            int i30 = i22 - 4;
            c1856m02.f6175b = i30;
            int i31 = iArr6[i30];
            int i32 = i29 - i31;
            int i33 = i21;
            int i34 = i25 - i27;
            int[] iArr7 = iArr3;
            if (i32 < 1 || i34 < 1) {
                iArr = iArr4;
                iArr2 = iArr5;
            } else {
                int i35 = 1;
                int i36 = ((i32 + i34) + 1) / 2;
                int i37 = i33 / 2;
                int i38 = i37 + 1;
                iArr7[i38] = i31;
                iArr4[i38] = i29;
                int i39 = i23;
                while (i39 < i36) {
                    int i40 = i32 - i34;
                    int i41 = i36;
                    iArr = iArr4;
                    int i42 = -i39;
                    int i43 = (Math.abs(i40) & 1) == i35 ? 1 : i23;
                    int i44 = i42;
                    while (true) {
                        if (i44 > i39) {
                            break;
                        }
                        if (i44 != i42) {
                            if (i44 != i39) {
                                i12 = i44;
                                iArr2 = iArr5;
                                if (iArr7[i44 + 1 + i37] > iArr7[(i12 - 1) + i37]) {
                                }
                                int i45 = ((i14 - i31) + i27) - i12;
                                int i46 = i45 - ((i39 != 0 ? 1 : i23) & (i14 == i13 ? 1 : i23));
                                int i47 = i13;
                                i15 = i45;
                                while (i14 < i29 && i15 < i25 && c5664z0.m10229a(i14, i15)) {
                                    i14++;
                                    i15++;
                                }
                                iArr7[i37 + i12] = i14;
                                if (i43 != 0) {
                                    int i48 = i15;
                                    int i49 = i40 - i12;
                                    i16 = i32;
                                    if (i49 >= i42 + 1 && i49 <= i39 - 1 && iArr[i37 + i49] <= i14) {
                                        iArr2[i23] = i47;
                                        iArr2[1] = i46;
                                        iArr2[c13] = i14;
                                        iArr2[3] = i48;
                                        iArr2[4] = i23;
                                        c10 = 1;
                                        break;
                                    }
                                } else {
                                    i16 = i32;
                                }
                                i44 = i12 + 2;
                                iArr5 = iArr2;
                                i32 = i16;
                            } else {
                                i12 = i44;
                                iArr2 = iArr5;
                            }
                            i13 = iArr7[(i12 - 1) + i37];
                            i14 = i13 + 1;
                            int i452 = ((i14 - i31) + i27) - i12;
                            int i462 = i452 - ((i39 != 0 ? 1 : i23) & (i14 == i13 ? 1 : i23));
                            int i472 = i13;
                            i15 = i452;
                            while (i14 < i29) {
                                i14++;
                                i15++;
                            }
                            iArr7[i37 + i12] = i14;
                            if (i43 != 0) {
                            }
                            i44 = i12 + 2;
                            iArr5 = iArr2;
                            i32 = i16;
                        } else {
                            i12 = i44;
                            iArr2 = iArr5;
                        }
                        i13 = iArr7[i12 + 1 + i37];
                        i14 = i13;
                        int i4522 = ((i14 - i31) + i27) - i12;
                        int i4622 = i4522 - ((i39 != 0 ? 1 : i23) & (i14 == i13 ? 1 : i23));
                        int i4722 = i13;
                        i15 = i4522;
                        while (i14 < i29) {
                        }
                        iArr7[i37 + i12] = i14;
                        if (i43 != 0) {
                        }
                        i44 = i12 + 2;
                        iArr5 = iArr2;
                        i32 = i16;
                    }
                    if (Math.min(iArr2[c13] - iArr2[i23], iArr2[3] - iArr2[c10]) > 0) {
                        int i50 = iArr2[i23];
                        int i51 = iArr2[c10];
                        int i52 = iArr2[3] - i51;
                        int iMin = iArr2[c13] - i50;
                        if (i52 != iMin) {
                            iMin = Math.min(iMin, i52);
                            int i53 = iArr2[4];
                            int i54 = i53 != 0 ? 1 : i23;
                            int i55 = iArr2[3];
                            c11 = 1;
                            int i56 = iArr2[1];
                            int i57 = i55 - i56;
                            int i58 = iArr2[c13];
                            int i59 = iArr2[i23];
                            int i60 = i50 + (((i57 > i58 - i59 ? 1 : i23) | i54) ^ 1);
                            i51 += (((i55 - i56 > i58 - i59 ? 1 : i23) ^ 1) | (i53 != 0 ? 1 : i23)) ^ 1;
                            i50 = i60;
                        } else {
                            c11 = 1;
                        }
                        c1856m0.m4578d(i50, i51, iMin);
                    } else {
                        c11 = c10;
                    }
                    c1856m02.m4579e(i31, iArr2[i23], i27, iArr2[c11]);
                    c1856m02.m4579e(iArr2[c13], i29, iArr2[3], i25);
                }
                iArr = iArr4;
                iArr2 = iArr5;
            }
            c12 = c13;
            i20 = i23;
            i21 = i33;
            iArr3 = iArr7;
            iArr4 = iArr;
            iArr5 = iArr2;
        }
        int i61 = i20;
        int i62 = c1856m0.f6175b;
        if (i62 % 3 != 0) {
            AbstractC4229a.m8494b("Array size not a multiple of 3");
        }
        if (i62 > 3) {
            i11 = i61;
            c1856m0.m4580f(i11, i62 - 3);
        } else {
            i11 = i61;
        }
        c1856m0.m4578d(i17, i18, i11);
        int i63 = i11;
        int i64 = i63;
        int i65 = i64;
        while (i63 < c1856m0.f6175b) {
            int[] iArr8 = c1856m0.f6174a;
            int i66 = iArr8[i63];
            int i67 = iArr8[i63 + 2];
            int i68 = i66 - i67;
            int i69 = iArr8[i63 + 1] - i67;
            i63 += 3;
            while (i64 < i68) {
                AbstractC5852n abstractC5852n2 = c5664z0.f23051a.f23793l;
                abstractC5852n2.getClass();
                if ((abstractC5852n2.f23790i & 2) != 0) {
                    AbstractC5614i1 abstractC5614i1 = abstractC5852n2.f23795n;
                    abstractC5614i1.getClass();
                    AbstractC5614i1 abstractC5614i12 = abstractC5614i1.f22870w;
                    AbstractC5614i1 abstractC5614i13 = abstractC5614i1.f22869v;
                    abstractC5614i13.getClass();
                    if (abstractC5614i12 != null) {
                        abstractC5614i12.f22869v = abstractC5614i13;
                    }
                    abstractC5614i13.f22870w = abstractC5614i12;
                    m9978a(c5587b1, c5664z0.f23051a, abstractC5614i13);
                }
                c5664z0.f23051a = m9980c(abstractC5852n2);
                i64++;
            }
            while (i65 < i69) {
                AbstractC5852n abstractC5852nM9979b = m9979b((InterfaceC5851m) c5664z0.f23054d.f6891g[c5664z0.f23052b + i65], c5664z0.f23051a);
                c5664z0.f23051a = abstractC5852nM9979b;
                if (c5664z0.f23055e) {
                    AbstractC5852n abstractC5852n3 = abstractC5852nM9979b.f23793l;
                    abstractC5852n3.getClass();
                    AbstractC5614i1 abstractC5614i14 = abstractC5852n3.f23795n;
                    abstractC5614i14.getClass();
                    InterfaceC5651v interfaceC5651vM10150f = AbstractC5618k.m10150f(c5664z0.f23051a);
                    if (interfaceC5651vM10150f != null) {
                        C5657x c5657x = new C5657x(c5587b1.f22714a, interfaceC5651vM10150f);
                        c5664z0.f23051a.mo10121j1(c5657x);
                        m9978a(c5587b1, c5664z0.f23051a, c5657x);
                        c5657x.f22870w = abstractC5614i14.f22870w;
                        c5657x.f22869v = abstractC5614i14;
                        abstractC5614i14.f22870w = c5657x;
                    } else {
                        c5664z0.f23051a.mo10121j1(abstractC5614i14);
                    }
                    c5664z0.f23051a.mo10115a1();
                    c5664z0.f23051a.mo10118g1();
                    AbstractC5852n abstractC5852n4 = c5664z0.f23051a;
                    C0925b0 c0925b0 = AbstractC5617j1.f22893a;
                    if (!abstractC5852n4.f23801t) {
                        AbstractC4229a.m8494b("autoInvalidateInsertedNode called on unattached node");
                    }
                    AbstractC5617j1.m10135a(abstractC5852n4, -1, 1);
                } else {
                    abstractC5852nM9979b.f23796o = true;
                }
                i65++;
            }
            while (true) {
                int i70 = i67 - 1;
                if (i67 > 0) {
                    AbstractC5852n abstractC5852n5 = c5664z0.f23051a.f23793l;
                    abstractC5852n5.getClass();
                    c5664z0.f23051a = abstractC5852n5;
                    C2046b c2046b5 = c5664z0.f23053c;
                    int i71 = c5664z0.f23052b;
                    InterfaceC5851m interfaceC5851m = (InterfaceC5851m) c2046b5.f6891g[i71 + i64];
                    InterfaceC5851m interfaceC5851m2 = (InterfaceC5851m) c5664z0.f23054d.f6891g[i71 + i65];
                    if (!AbstractC1416l.m3825a(interfaceC5851m, interfaceC5851m2)) {
                        m9981h(interfaceC5851m, interfaceC5851m2, c5664z0.f23051a);
                    }
                    i64++;
                    i65++;
                    i67 = i70;
                }
            }
        }
        int i72 = i11;
        for (AbstractC5852n abstractC5852n6 = this.f22718e.f23792k; abstractC5852n6 != null && abstractC5852n6 != this.f22715b; abstractC5852n6 = abstractC5852n6.f23792k) {
            i72 |= abstractC5852n6.f23790i;
            abstractC5852n6.f23791j = i72;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m9985g() {
        C5602f0 c5602f0;
        C5657x c5657x;
        InterfaceC5638q1 interfaceC5638q1;
        AbstractC5852n abstractC5852n = this.f22718e.f23792k;
        AbstractC5614i1 abstractC5614i1 = this.f22716c;
        while (true) {
            c5602f0 = this.f22714a;
            if (abstractC5852n == null) {
                break;
            }
            InterfaceC5651v interfaceC5651vM10150f = AbstractC5618k.m10150f(abstractC5852n);
            if (interfaceC5651vM10150f != null) {
                AbstractC5614i1 abstractC5614i12 = abstractC5852n.f23795n;
                if (abstractC5614i12 != null) {
                    c5657x = (C5657x) abstractC5614i12;
                    InterfaceC5651v interfaceC5651v = c5657x.f23048Y;
                    c5657x.m10224U1(interfaceC5651vM10150f);
                    if (interfaceC5651v != abstractC5852n && (interfaceC5638q1 = c5657x.f22866R) != null) {
                        ((C5916o1) interfaceC5638q1).m10625c();
                    }
                } else {
                    c5657x = new C5657x(c5602f0, interfaceC5651vM10150f);
                    abstractC5852n.mo10121j1(c5657x);
                }
                abstractC5614i1.f22870w = c5657x;
                c5657x.f22869v = abstractC5614i1;
                abstractC5614i1 = c5657x;
            } else {
                abstractC5852n.mo10121j1(abstractC5614i1);
            }
            abstractC5852n = abstractC5852n.f23792k;
        }
        C5602f0 c5602f0M10049u = c5602f0.m10049u();
        abstractC5614i1.f22870w = c5602f0M10049u != null ? c5602f0M10049u.f22778L.f22716c : null;
        this.f22717d = abstractC5614i1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        AbstractC5852n abstractC5852n = this.f22719f;
        C5588b2 c5588b2 = this.f22718e;
        if (abstractC5852n == c5588b2) {
            sb2.append("]");
        } else {
            while (true) {
                if (abstractC5852n == null || abstractC5852n == c5588b2) {
                    break;
                }
                sb2.append(String.valueOf(abstractC5852n));
                if (abstractC5852n.f23793l == c5588b2) {
                    sb2.append("]");
                    break;
                }
                sb2.append(",");
                abstractC5852n = abstractC5852n.f23793l;
            }
        }
        return sb2.toString();
    }
}
