package p000;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class mj0 {

    /* JADX INFO: renamed from: a */
    public final b60 f3993a;

    /* JADX INFO: renamed from: b */
    public final lj0 f3994b;

    /* JADX INFO: renamed from: c */
    public final c20 f3995c;

    /* JADX INFO: renamed from: d */
    public qj0 f3996d;

    /* JADX INFO: renamed from: e */
    public final d61 f3997e;

    /* JADX INFO: renamed from: f */
    public oe0 f3998f;

    /* JADX INFO: renamed from: g */
    public sh0 f3999g;

    /* JADX INFO: renamed from: h */
    public sh0 f4000h;

    /* JADX INFO: renamed from: i */
    public final sh0 f4001i;

    /* JADX INFO: renamed from: j */
    public kj0 f4002j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public mj0(b60 b60Var) {
        this.f3993a = b60Var;
        lj0 lj0Var = new lj0();
        lj0Var.f4532g = -1;
        this.f3994b = lj0Var;
        c20 c20Var = new c20(b60Var);
        this.f3995c = c20Var;
        this.f3996d = c20Var;
        d61 d61Var = c20Var.f643T;
        this.f3997e = d61Var;
        this.f3998f = d61Var;
        this.f4001i = new sh0(new pe0[16]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m2596a(mj0 mj0Var, oe0 oe0Var, qj0 qj0Var) {
        for (oe0 oe0Var2 = oe0Var.f4533h; oe0Var2 != null; oe0Var2 = oe0Var2.f4533h) {
            if (oe0Var2 == mj0Var.f3994b) {
                b60 b60VarM315v = mj0Var.f3993a.m315v();
                qj0Var.f5182t = b60VarM315v != null ? b60VarM315v.f395I.f3995c : null;
                mj0Var.f3996d = qj0Var;
                return;
            } else {
                if ((oe0Var2.f4531f & 2) != 0) {
                    return;
                }
                oe0Var2.mo2886v0(qj0Var);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static oe0 m2597b(ne0 ne0Var, oe0 oe0Var) {
        oe0 oe0VarMo228e;
        if (ne0Var instanceof te0) {
            oe0VarMo228e = ((te0) ne0Var).mo228e();
            oe0VarMo228e.f4531f = rj0.m3514e(oe0VarMo228e);
        } else {
            C0795u9 c0795u9 = new C0795u9();
            ch0 ch0Var = rj0.f5425a;
            int i = ne0Var instanceof InterfaceC0735sq ? 5 : 1;
            if (ne0Var instanceof tz0) {
                i |= 8;
            }
            if (ne0Var instanceof InterfaceC0123db) {
                i |= 524288;
            }
            c0795u9.f4531f = i;
            c0795u9.f6169r = ne0Var;
            new HashSet();
            oe0VarMo228e = c0795u9;
        }
        if (oe0VarMo228e.f4542q) {
            w10.m4824b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        oe0VarMo228e.f4537l = true;
        oe0 oe0Var2 = oe0Var.f4534i;
        if (oe0Var2 != null) {
            oe0Var2.f4533h = oe0VarMo228e;
            oe0VarMo228e.f4534i = oe0Var2;
        }
        oe0Var.f4534i = oe0VarMo228e;
        oe0VarMo228e.f4533h = oe0Var;
        return oe0VarMo228e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static oe0 m2598c(oe0 oe0Var) {
        boolean z = oe0Var.f4542q;
        if (z) {
            ch0 ch0Var = rj0.f5425a;
            if (!z) {
                w10.m4824b("autoInvalidateRemovedNode called on unattached node");
            }
            rj0.m3510a(oe0Var, -1, 2);
            oe0Var.mo2884t0();
            oe0Var.mo2881n0();
        }
        oe0 oe0Var2 = oe0Var.f4534i;
        oe0 oe0Var3 = oe0Var.f4533h;
        if (oe0Var2 != null) {
            oe0Var2.f4533h = oe0Var3;
            oe0Var.f4534i = null;
        }
        if (oe0Var3 != null) {
            oe0Var3.f4534i = oe0Var2;
            oe0Var.f4533h = null;
        }
        oe0Var3.getClass();
        return oe0Var3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m2599h(ne0 ne0Var, ne0 ne0Var2, oe0 oe0Var) {
        if ((ne0Var instanceof te0) && (ne0Var2 instanceof te0)) {
            oe0Var.getClass();
            ((te0) ne0Var2).mo229f(oe0Var);
            if (oe0Var.f4542q) {
                rj0.m3512c(oe0Var);
                return;
            } else {
                oe0Var.f4538m = true;
                return;
            }
        }
        if (!(oe0Var instanceof C0795u9)) {
            w10.m4824b("Unknown Modifier.Node type");
            return;
        }
        C0795u9 c0795u9 = (C0795u9) oe0Var;
        boolean z = c0795u9.f4542q;
        if (z) {
            if (!z) {
                w10.m4824b("unInitializeModifier called on unattached node");
            }
            if ((c0795u9.f4531f & 8) != 0) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) pf1.m3040R(c0795u9)).m4865y();
            }
        }
        c0795u9.f6169r = ne0Var2;
        ch0 ch0Var = rj0.f5425a;
        int i = ne0Var2 instanceof InterfaceC0735sq ? 5 : 1;
        if (ne0Var2 instanceof tz0) {
            i |= 8;
        }
        if (ne0Var2 instanceof InterfaceC0123db) {
            i |= 524288;
        }
        c0795u9.f4531f = i;
        if (c0795u9.f4542q) {
            c0795u9.m4290w0(false);
        }
        if (oe0Var.f4542q) {
            rj0.m3512c(oe0Var);
        } else {
            oe0Var.f4538m = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m2600d(int i) {
        return (this.f3998f.f4532g & i) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m2601e() {
        for (oe0 oe0Var = this.f3998f; oe0Var != null; oe0Var = oe0Var.f4534i) {
            oe0Var.mo2883s0();
            if (oe0Var.f4537l) {
                ch0 ch0Var = rj0.f5425a;
                if (!oe0Var.f4542q) {
                    w10.m4824b("autoInvalidateInsertedNode called on unattached node");
                }
                rj0.m3510a(oe0Var, -1, 1);
            }
            if (oe0Var.f4538m) {
                rj0.m3512c(oe0Var);
            }
            oe0Var.f4537l = false;
            oe0Var.f4538m = false;
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
    
        if (r0.m1909a(r14 - 1, r27 - 1) == false) goto L185;
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
    public final void m2602f(int i, sh0 sh0Var, sh0 sh0Var2, oe0 oe0Var, boolean z) {
        int i2;
        sh0 sh0Var3;
        sh0 sh0Var4;
        int i3;
        int[] iArr;
        int[] iArr2;
        char c;
        char c2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        kj0 kj0Var = this.f4002j;
        if (kj0Var == null) {
            i2 = i;
            sh0Var3 = sh0Var;
            sh0Var4 = sh0Var2;
            kj0Var = new kj0(this, oe0Var, i2, sh0Var3, sh0Var4, z);
            this.f4002j = kj0Var;
        } else {
            i2 = i;
            sh0Var3 = sh0Var;
            sh0Var4 = sh0Var2;
            kj0Var.f3176a = oe0Var;
            kj0Var.f3177b = i2;
            kj0Var.f3178c = sh0Var3;
            kj0Var.f3179d = sh0Var4;
            kj0Var.f3180e = z;
        }
        mj0 mj0Var = kj0Var.f3181f;
        int i9 = sh0Var3.f5770f - i2;
        int i10 = sh0Var4.f5770f - i2;
        char c3 = 2;
        int i11 = ((i9 + i10) + 1) / 2;
        e30 e30Var = new e30(i11 * 3);
        e30 e30Var2 = new e30(i11 * 4);
        int i12 = 0;
        e30Var2.m773e(0, i9, 0, i10);
        int i13 = (i11 * 2) + 1;
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int[] iArr5 = new int[5];
        while (true) {
            int i14 = e30Var2.f1283b;
            if (i14 == 0) {
                break;
            }
            char c4 = c3;
            int[] iArr6 = e30Var2.f1282a;
            int i15 = i12;
            int i16 = i14 - 1;
            e30Var2.f1283b = i16;
            int i17 = iArr6[i16];
            int i18 = i14 - 2;
            e30Var2.f1283b = i18;
            int i19 = iArr6[i18];
            int i20 = i14 - 3;
            e30Var2.f1283b = i20;
            int i21 = iArr6[i20];
            int i22 = i14 - 4;
            e30Var2.f1283b = i22;
            int i23 = iArr6[i22];
            int i24 = i21 - i23;
            int i25 = i13;
            int i26 = i17 - i19;
            int[] iArr7 = iArr3;
            if (i24 < 1 || i26 < 1) {
                iArr = iArr4;
                iArr2 = iArr5;
            } else {
                int i27 = 1;
                int i28 = ((i24 + i26) + 1) / 2;
                int i29 = i25 / 2;
                int i30 = i29 + 1;
                iArr7[i30] = i23;
                iArr4[i30] = i21;
                int i31 = i15;
                while (i31 < i28) {
                    int i32 = i24 - i26;
                    int i33 = i28;
                    iArr = iArr4;
                    int i34 = -i31;
                    int i35 = (Math.abs(i32) & 1) == i27 ? 1 : i15;
                    int i36 = i34;
                    while (true) {
                        if (i36 > i31) {
                            break;
                        }
                        if (i36 != i34) {
                            if (i36 != i31) {
                                i4 = i36;
                                iArr2 = iArr5;
                                if (iArr7[i36 + 1 + i29] > iArr7[(i4 - 1) + i29]) {
                                }
                                int i37 = ((i6 - i23) + i19) - i4;
                                int i38 = i37 - ((i31 != 0 ? 1 : i15) & (i6 == i5 ? 1 : i15));
                                int i39 = i5;
                                i7 = i37;
                                while (i6 < i21 && i7 < i17 && kj0Var.m1909a(i6, i7)) {
                                    i6++;
                                    i7++;
                                }
                                iArr7[i29 + i4] = i6;
                                if (i35 != 0) {
                                    int i40 = i7;
                                    int i41 = i32 - i4;
                                    i8 = i24;
                                    if (i41 >= i34 + 1 && i41 <= i31 - 1 && iArr[i29 + i41] <= i6) {
                                        iArr2[i15] = i39;
                                        iArr2[1] = i38;
                                        iArr2[c4] = i6;
                                        iArr2[3] = i40;
                                        iArr2[4] = i15;
                                        c = 1;
                                        break;
                                    }
                                } else {
                                    i8 = i24;
                                }
                                i36 = i4 + 2;
                                iArr5 = iArr2;
                                i24 = i8;
                            } else {
                                i4 = i36;
                                iArr2 = iArr5;
                            }
                            i5 = iArr7[(i4 - 1) + i29];
                            i6 = i5 + 1;
                            int i372 = ((i6 - i23) + i19) - i4;
                            int i382 = i372 - ((i31 != 0 ? 1 : i15) & (i6 == i5 ? 1 : i15));
                            int i392 = i5;
                            i7 = i372;
                            while (i6 < i21) {
                                i6++;
                                i7++;
                            }
                            iArr7[i29 + i4] = i6;
                            if (i35 != 0) {
                            }
                            i36 = i4 + 2;
                            iArr5 = iArr2;
                            i24 = i8;
                        } else {
                            i4 = i36;
                            iArr2 = iArr5;
                        }
                        i5 = iArr7[i4 + 1 + i29];
                        i6 = i5;
                        int i3722 = ((i6 - i23) + i19) - i4;
                        int i3822 = i3722 - ((i31 != 0 ? 1 : i15) & (i6 == i5 ? 1 : i15));
                        int i3922 = i5;
                        i7 = i3722;
                        while (i6 < i21) {
                        }
                        iArr7[i29 + i4] = i6;
                        if (i35 != 0) {
                        }
                        i36 = i4 + 2;
                        iArr5 = iArr2;
                        i24 = i8;
                    }
                    if (Math.min(iArr2[c4] - iArr2[i15], iArr2[3] - iArr2[c]) > 0) {
                        int i42 = iArr2[i15];
                        int i43 = iArr2[c];
                        int i44 = iArr2[3] - i43;
                        int iMin = iArr2[c4] - i42;
                        if (i44 != iMin) {
                            iMin = Math.min(iMin, i44);
                            int i45 = iArr2[4];
                            int i46 = i45 != 0 ? 1 : i15;
                            int i47 = iArr2[3];
                            c2 = 1;
                            int i48 = iArr2[1];
                            int i49 = i47 - i48;
                            int i50 = iArr2[c4];
                            int i51 = iArr2[i15];
                            int i52 = i42 + (((i49 > i50 - i51 ? 1 : i15) | i46) ^ 1);
                            i43 += (((i47 - i48 > i50 - i51 ? 1 : i15) ^ 1) | (i45 != 0 ? 1 : i15)) ^ 1;
                            i42 = i52;
                        } else {
                            c2 = 1;
                        }
                        e30Var.m772d(i42, i43, iMin);
                    } else {
                        c2 = c;
                    }
                    e30Var2.m773e(i23, iArr2[i15], i19, iArr2[c2]);
                    e30Var2.m773e(iArr2[c4], i21, iArr2[3], i17);
                }
                iArr = iArr4;
                iArr2 = iArr5;
            }
            c3 = c4;
            i12 = i15;
            i13 = i25;
            iArr3 = iArr7;
            iArr4 = iArr;
            iArr5 = iArr2;
        }
        int i53 = i12;
        int i54 = e30Var.f1283b;
        if (i54 % 3 != 0) {
            w10.m4824b("Array size not a multiple of 3");
        }
        if (i54 > 3) {
            i3 = i53;
            e30Var.m774f(i3, i54 - 3);
        } else {
            i3 = i53;
        }
        e30Var.m772d(i9, i10, i3);
        int i55 = i3;
        int i56 = i55;
        int i57 = i56;
        while (i55 < e30Var.f1283b) {
            int[] iArr8 = e30Var.f1282a;
            int i58 = iArr8[i55];
            int i59 = iArr8[i55 + 2];
            int i60 = i58 - i59;
            int i61 = iArr8[i55 + 1] - i59;
            i55 += 3;
            while (i56 < i60) {
                oe0 oe0Var2 = kj0Var.f3176a.f4534i;
                oe0Var2.getClass();
                if ((oe0Var2.f4531f & 2) != 0) {
                    qj0 qj0Var = oe0Var2.f4536k;
                    qj0Var.getClass();
                    qj0 qj0Var2 = qj0Var.f5182t;
                    qj0 qj0Var3 = qj0Var.f5181s;
                    qj0Var3.getClass();
                    if (qj0Var2 != null) {
                        qj0Var2.f5181s = qj0Var3;
                    }
                    qj0Var3.f5182t = qj0Var2;
                    m2596a(mj0Var, kj0Var.f3176a, qj0Var3);
                }
                kj0Var.f3176a = m2598c(oe0Var2);
                i56++;
            }
            while (i57 < i61) {
                oe0 oe0VarM2597b = m2597b((ne0) kj0Var.f3179d.f5768d[kj0Var.f3177b + i57], kj0Var.f3176a);
                kj0Var.f3176a = oe0VarM2597b;
                if (kj0Var.f3180e) {
                    oe0 oe0Var3 = oe0VarM2597b.f4534i;
                    oe0Var3.getClass();
                    qj0 qj0Var4 = oe0Var3.f4536k;
                    qj0Var4.getClass();
                    r50 r50VarM3052i = pf1.m3052i(kj0Var.f3176a);
                    if (r50VarM3052i != null) {
                        t50 t50Var = new t50(mj0Var.f3993a, r50VarM3052i);
                        kj0Var.f3176a.mo2886v0(t50Var);
                        m2596a(mj0Var, kj0Var.f3176a, t50Var);
                        t50Var.f5182t = qj0Var4.f5182t;
                        t50Var.f5181s = qj0Var4;
                        qj0Var4.f5182t = t50Var;
                    } else {
                        kj0Var.f3176a.mo2886v0(qj0Var4);
                    }
                    kj0Var.f3176a.mo2880m0();
                    kj0Var.f3176a.mo2883s0();
                    oe0 oe0Var4 = kj0Var.f3176a;
                    ch0 ch0Var = rj0.f5425a;
                    if (!oe0Var4.f4542q) {
                        w10.m4824b("autoInvalidateInsertedNode called on unattached node");
                    }
                    rj0.m3510a(oe0Var4, -1, 1);
                } else {
                    oe0VarM2597b.f4537l = true;
                }
                i57++;
            }
            while (true) {
                int i62 = i59 - 1;
                if (i59 > 0) {
                    oe0 oe0Var5 = kj0Var.f3176a.f4534i;
                    oe0Var5.getClass();
                    kj0Var.f3176a = oe0Var5;
                    sh0 sh0Var5 = kj0Var.f3178c;
                    int i63 = kj0Var.f3177b;
                    ne0 ne0Var = (ne0) sh0Var5.f5768d[i63 + i56];
                    ne0 ne0Var2 = (ne0) kj0Var.f3179d.f5768d[i63 + i57];
                    if (!p30.m3002l(ne0Var, ne0Var2)) {
                        m2599h(ne0Var, ne0Var2, kj0Var.f3176a);
                    }
                    i56++;
                    i57++;
                    i59 = i62;
                }
            }
        }
        int i64 = i3;
        for (oe0 oe0Var6 = this.f3997e.f4533h; oe0Var6 != null && oe0Var6 != this.f3994b; oe0Var6 = oe0Var6.f4533h) {
            i64 |= oe0Var6.f4531f;
            oe0Var6.f4532g = i64;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m2603g() {
        b60 b60Var;
        t50 t50Var;
        cn0 cn0Var;
        oe0 oe0Var = this.f3997e.f4533h;
        qj0 qj0Var = this.f3995c;
        while (true) {
            b60Var = this.f3993a;
            if (oe0Var == null) {
                break;
            }
            r50 r50VarM3052i = pf1.m3052i(oe0Var);
            if (r50VarM3052i != null) {
                qj0 qj0Var2 = oe0Var.f4536k;
                if (qj0Var2 != null) {
                    t50Var = (t50) qj0Var2;
                    r50 r50Var = t50Var.f5915T;
                    t50Var.m4188f1(r50VarM3052i);
                    if (r50Var != oe0Var && (cn0Var = t50Var.f5179O) != null) {
                        ((C0942xx) cn0Var).m5173c();
                    }
                } else {
                    t50Var = new t50(b60Var, r50VarM3052i);
                    oe0Var.mo2886v0(t50Var);
                }
                qj0Var.f5182t = t50Var;
                t50Var.f5181s = qj0Var;
                qj0Var = t50Var;
            } else {
                oe0Var.mo2886v0(qj0Var);
            }
            oe0Var = oe0Var.f4533h;
        }
        b60 b60VarM315v = b60Var.m315v();
        qj0Var.f5182t = b60VarM315v != null ? b60VarM315v.f395I.f3995c : null;
        this.f3996d = qj0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        oe0 oe0Var = this.f3998f;
        d61 d61Var = this.f3997e;
        if (oe0Var == d61Var) {
            sb.append("]");
        } else {
            while (true) {
                if (oe0Var == null || oe0Var == d61Var) {
                    break;
                }
                sb.append(String.valueOf(oe0Var));
                if (oe0Var.f4534i == d61Var) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                oe0Var = oe0Var.f4534i;
            }
        }
        return sb.toString();
    }
}
