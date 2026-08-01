package androidx.compose.p001ui.node;

import androidx.appcompat.app.C0954;
import androidx.collection.C1099;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.InterfaceC2957;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.platform.C2746;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.runtime.collection.C2059;
import java.util.HashSet;
import kotlin.jvm.internal.AbstractC5227;
import p226.AbstractC8765;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2646 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public AbstractC2961 f5628;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2595 f5629;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public AbstractC2629 f5630;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2606 f5631;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2642 f5632;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2583 f5633;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C2059 f5634;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C2059 f5635;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C2059 f5636;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C2643 f5637;

    public C2646(C2583 c2583) {
        this.f5633 = c2583;
        C2642 c2642 = new C2642();
        c2642.f6630 = -1;
        this.f5632 = c2642;
        C2606 c2606 = new C2606(c2583);
        this.f5631 = c2606;
        this.f5630 = c2606;
        C2595 c2595 = c2606.f5548;
        this.f5629 = c2595;
        this.f5628 = c2595;
        this.f5636 = new C2059(0, new InterfaceC2962[16]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static AbstractC2961 m3982(AbstractC2961 abstractC2961) {
        boolean z = abstractC2961.f6624;
        if (z) {
            C1099 c1099 = AbstractC2628.f5579;
            if (!z) {
                AbstractC8765.m13982("autoInvalidateRemovedNode called on unattached node");
            }
            AbstractC2628.m3937(abstractC2961, -1, 2);
            abstractC2961.mo3925();
            abstractC2961.mo3931();
        }
        AbstractC2961 abstractC29612 = abstractC2961.f6633;
        AbstractC2961 abstractC29613 = abstractC2961.f6629;
        if (abstractC29612 != null) {
            abstractC29612.f6629 = abstractC29613;
            abstractC2961.f6633 = null;
        }
        if (abstractC29613 != null) {
            abstractC29613.f6633 = abstractC29612;
            abstractC2961.f6629 = null;
        }
        abstractC29613.getClass();
        return abstractC29613;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static AbstractC2961 m3983(InterfaceC2957 interfaceC2957, AbstractC2961 abstractC2961) {
        AbstractC2961 abstractC2961Mo1657;
        if (interfaceC2957 instanceof AbstractC2571) {
            abstractC2961Mo1657 = ((AbstractC2571) interfaceC2957).mo1657();
            abstractC2961Mo1657.f6636 = AbstractC2628.m3932(abstractC2961Mo1657);
        } else {
            C2603 c2603 = new C2603();
            c2603.f6636 = AbstractC2628.m3934(interfaceC2957);
            c2603.f5537 = interfaceC2957;
            c2603.f5538 = new HashSet();
            abstractC2961Mo1657 = c2603;
        }
        if (abstractC2961Mo1657.f6624) {
            AbstractC8765.m13982("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        abstractC2961Mo1657.f6632 = true;
        AbstractC2961 abstractC29612 = abstractC2961.f6633;
        if (abstractC29612 != null) {
            abstractC29612.f6629 = abstractC2961Mo1657;
            abstractC2961Mo1657.f6633 = abstractC29612;
        }
        abstractC2961.f6633 = abstractC2961Mo1657;
        abstractC2961Mo1657.f6629 = abstractC2961;
        return abstractC2961Mo1657;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m3984(C2646 c2646, AbstractC2961 abstractC2961, AbstractC2629 abstractC2629) {
        for (AbstractC2961 abstractC29612 = abstractC2961.f6629; abstractC29612 != null; abstractC29612 = abstractC29612.f6629) {
            if (abstractC29612 == c2646.f5632) {
                C2583 c2583M3816 = c2646.f5633.m3816();
                abstractC2629.f5601 = c2583M3816 != null ? c2583M3816.f5439.f5631 : null;
                c2646.f5630 = abstractC2629;
                return;
            } else {
                if ((abstractC29612.f6636 & 2) != 0) {
                    return;
                }
                abstractC29612.mo3923(abstractC2629);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m3985(InterfaceC2957 interfaceC2957, InterfaceC2957 interfaceC29572, AbstractC2961 abstractC2961) {
        if ((interfaceC2957 instanceof AbstractC2571) && (interfaceC29572 instanceof AbstractC2571)) {
            abstractC2961.getClass();
            ((AbstractC2571) interfaceC29572).mo1656(abstractC2961);
            if (abstractC2961.f6624) {
                AbstractC2628.m3935(abstractC2961);
                return;
            } else {
                abstractC2961.f6628 = true;
                return;
            }
        }
        if (!(abstractC2961 instanceof C2603)) {
            AbstractC8765.m13982("Unknown Modifier.Node type");
            return;
        }
        C2603 c2603 = (C2603) abstractC2961;
        boolean z = c2603.f6624;
        if (z) {
            if (!z) {
                AbstractC8765.m13982("unInitializeModifier called on unattached node");
            }
            if ((c2603.f6636 & 8) != 0) {
                ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(c2603)).m4087();
            }
        }
        c2603.f5537 = interfaceC29572;
        c2603.f6636 = AbstractC2628.m3934(interfaceC29572);
        if (c2603.f6624) {
            c2603.m3877(false);
        }
        if (abstractC2961.f6624) {
            AbstractC2628.m3935(abstractC2961);
        } else {
            abstractC2961.f6628 = true;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        AbstractC2961 abstractC2961 = this.f5628;
        C2595 c2595 = this.f5629;
        if (abstractC2961 == c2595) {
            sb.append("]");
        } else {
            while (true) {
                if (abstractC2961 == null || abstractC2961 == c2595) {
                    break;
                }
                sb.append(String.valueOf(abstractC2961));
                if (abstractC2961.f6633 == c2595) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                abstractC2961 = abstractC2961.f6633;
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0264, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x026a, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014a, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0150, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0152, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0154, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0156, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0157, code lost:
    
        if (r13 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0159, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015b, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015d, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016b, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016e, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0170, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0179, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017b, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0182, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0188, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018a, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018d, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018f, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0191, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0194, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0196, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a0, code lost:
    
        if (r14 <= r7) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a2, code lost:
    
        if (r11 <= r15) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b0, code lost:
    
        if (r0.m3973(r14 - 1, r27 - 1) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b2, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b9, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bd, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c1, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c3, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c5, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c7, code lost:
    
        if (r11 > r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cd, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01cf, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0140  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3986(int i, C2059 c2059, C2059 c20592, AbstractC2961 abstractC2961, boolean z) {
        int i2;
        C2059 c20593;
        C2059 c20594;
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
        C2643 c2643 = this.f5637;
        if (c2643 == null) {
            i2 = i;
            c20593 = c2059;
            c20594 = c20592;
            c2643 = new C2643(this, abstractC2961, i2, c20593, c20594, z);
            this.f5637 = c2643;
        } else {
            i2 = i;
            c20593 = c2059;
            c20594 = c20592;
            c2643.f5627 = abstractC2961;
            c2643.f5626 = i2;
            c2643.f5625 = c20593;
            c2643.f5624 = c20594;
            c2643.f5623 = z;
        }
        C2646 c2646 = c2643.f5622;
        int i9 = c20593.f3865 - i2;
        int i10 = c20594.f3865 - i2;
        char c3 = 2;
        int i11 = ((i9 + i10) + 1) / 2;
        C0954 c0954 = new C0954(i11 * 3);
        C0954 c09542 = new C0954(i11 * 4);
        int i12 = 0;
        c09542.m910(0, i9, 0, i10);
        int i13 = (i11 * 2) + 1;
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int[] iArr5 = new int[5];
        while (true) {
            int i14 = c09542.f659;
            if (i14 == 0) {
                break;
            }
            char c4 = c3;
            int[] iArr6 = (int[]) c09542.f660;
            int i15 = i12;
            int i16 = i14 - 1;
            c09542.f659 = i16;
            int i17 = iArr6[i16];
            int i18 = i14 - 2;
            c09542.f659 = i18;
            int i19 = iArr6[i18];
            int i20 = i14 - 3;
            c09542.f659 = i20;
            int i21 = iArr6[i20];
            int i22 = i14 - 4;
            c09542.f659 = i22;
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
                                while (i6 < i21 && i7 < i17 && c2643.m3973(i6, i7)) {
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
                        c0954.m906(i42, i43, iMin);
                    } else {
                        c2 = c;
                    }
                    c09542.m910(i23, iArr2[i15], i19, iArr2[c2]);
                    c09542.m910(iArr2[c4], i21, iArr2[3], i17);
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
        int i54 = c0954.f659;
        if (i54 % 3 != 0) {
            AbstractC8765.m13982("Array size not a multiple of 3");
        }
        if (i54 > 3) {
            i3 = i53;
            c0954.m911(i3, i54 - 3);
        } else {
            i3 = i53;
        }
        c0954.m906(i9, i10, i3);
        int i55 = i3;
        int i56 = i55;
        int i57 = i56;
        while (i55 < c0954.f659) {
            int[] iArr8 = (int[]) c0954.f660;
            int i58 = iArr8[i55];
            int i59 = iArr8[i55 + 2];
            int i60 = i58 - i59;
            int i61 = iArr8[i55 + 1] - i59;
            i55 += 3;
            while (i56 < i60) {
                AbstractC2961 abstractC29612 = c2643.f5627.f6633;
                abstractC29612.getClass();
                if ((abstractC29612.f6636 & 2) != 0) {
                    AbstractC2629 abstractC2629 = abstractC29612.f6631;
                    abstractC2629.getClass();
                    AbstractC2629 abstractC26292 = abstractC2629.f5601;
                    AbstractC2629 abstractC26293 = abstractC2629.f5602;
                    abstractC26293.getClass();
                    if (abstractC26292 != null) {
                        abstractC26292.f5602 = abstractC26293;
                    }
                    abstractC26293.f5601 = abstractC26292;
                    m3984(c2646, c2643.f5627, abstractC26293);
                }
                c2643.f5627 = m3982(abstractC29612);
                i56++;
            }
            while (i57 < i61) {
                AbstractC2961 abstractC2961M3983 = m3983((InterfaceC2957) c2643.f5624.f3866[c2643.f5626 + i57], c2643.f5627);
                c2643.f5627 = abstractC2961M3983;
                if (c2643.f5623) {
                    AbstractC2961 abstractC29613 = abstractC2961M3983.f6633;
                    abstractC29613.getClass();
                    AbstractC2629 abstractC26294 = abstractC29613.f6631;
                    abstractC26294.getClass();
                    InterfaceC2608 interfaceC2608M3898 = AbstractC2620.m3898(c2643.f5627);
                    if (interfaceC2608M3898 != null) {
                        C2588 c2588 = new C2588(c2646.f5633, interfaceC2608M3898);
                        c2643.f5627.mo3923(c2588);
                        m3984(c2646, c2643.f5627, c2588);
                        c2588.f5601 = abstractC26294.f5601;
                        c2588.f5602 = abstractC26294;
                        abstractC26294.f5601 = c2588;
                    } else {
                        c2643.f5627.mo3923(abstractC26294);
                    }
                    c2643.f5627.mo3922();
                    c2643.f5627.mo3929();
                    AbstractC2961 abstractC29614 = c2643.f5627;
                    C1099 c1099 = AbstractC2628.f5579;
                    if (!abstractC29614.f6624) {
                        AbstractC8765.m13982("autoInvalidateInsertedNode called on unattached node");
                    }
                    AbstractC2628.m3937(abstractC29614, -1, 1);
                } else {
                    abstractC2961M3983.f6632 = true;
                }
                i57++;
            }
            while (true) {
                int i62 = i59 - 1;
                if (i59 > 0) {
                    AbstractC2961 abstractC29615 = c2643.f5627.f6633;
                    abstractC29615.getClass();
                    c2643.f5627 = abstractC29615;
                    C2059 c20595 = c2643.f5625;
                    int i63 = c2643.f5626;
                    InterfaceC2957 interfaceC2957 = (InterfaceC2957) c20595.f3866[i63 + i56];
                    InterfaceC2957 interfaceC29572 = (InterfaceC2957) c2643.f5624.f3866[i63 + i57];
                    if (!AbstractC5227.m9466(interfaceC2957, interfaceC29572)) {
                        m3985(interfaceC2957, interfaceC29572, c2643.f5627);
                    }
                    i56++;
                    i57++;
                    i59 = i62;
                }
            }
        }
        int i64 = i3;
        for (AbstractC2961 abstractC29616 = this.f5629.f6629; abstractC29616 != null && abstractC29616 != this.f5632; abstractC29616 = abstractC29616.f6629) {
            i64 |= abstractC29616.f6636;
            abstractC29616.f6630 = i64;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m3987() {
        for (AbstractC2961 abstractC2961 = this.f5628; abstractC2961 != null; abstractC2961 = abstractC2961.f6633) {
            abstractC2961.mo3929();
            if (abstractC2961.f6632) {
                C1099 c1099 = AbstractC2628.f5579;
                if (!abstractC2961.f6624) {
                    AbstractC8765.m13982("autoInvalidateInsertedNode called on unattached node");
                }
                AbstractC2628.m3937(abstractC2961, -1, 1);
            }
            if (abstractC2961.f6628) {
                AbstractC2628.m3935(abstractC2961);
            }
            abstractC2961.f6632 = false;
            abstractC2961.f6628 = false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m3988(int i) {
        return (this.f5628.f6630 & i) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m3989() {
        C2583 c2583;
        C2588 c2588;
        InterfaceC2641 interfaceC2641;
        AbstractC2961 abstractC2961 = this.f5629.f6629;
        AbstractC2629 abstractC2629 = this.f5631;
        while (true) {
            c2583 = this.f5633;
            if (abstractC2961 == null) {
                break;
            }
            InterfaceC2608 interfaceC2608M3898 = AbstractC2620.m3898(abstractC2961);
            if (interfaceC2608M3898 != null) {
                AbstractC2629 abstractC26292 = abstractC2961.f6631;
                if (abstractC26292 != null) {
                    c2588 = (C2588) abstractC26292;
                    InterfaceC2608 interfaceC2608 = c2588.f5486;
                    c2588.m3847(interfaceC2608M3898);
                    if (interfaceC2608 != abstractC2961 && (interfaceC2641 = c2588.f5605) != null) {
                        ((C2746) interfaceC2641).m4170();
                    }
                } else {
                    c2588 = new C2588(c2583, interfaceC2608M3898);
                    abstractC2961.mo3923(c2588);
                }
                abstractC2629.f5601 = c2588;
                c2588.f5602 = abstractC2629;
                abstractC2629 = c2588;
            } else {
                abstractC2961.mo3923(abstractC2629);
            }
            abstractC2961 = abstractC2961.f6629;
        }
        C2583 c2583M3816 = c2583.m3816();
        abstractC2629.f5601 = c2583M3816 != null ? c2583M3816.f5439.f5631 : null;
        this.f5630 = abstractC2629;
    }
}
