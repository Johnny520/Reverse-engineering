package androidx.compose.ui.node;

import androidx.collection.C0252;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.InterfaceC2124;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.platform.C1911;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import java.util.HashSet;
import p210.AbstractC7935;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1811 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public AbstractC2128 f5282;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1760 f5283;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public AbstractC1794 f5284;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1771 f5285;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1807 f5286;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1748 f5287;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C1224 f5288;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C1224 f5289;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C1224 f5290;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C1808 f5291;

    public C1811(C1748 c1748) {
        this.f5287 = c1748;
        C1807 c1807 = new C1807();
        c1807.f6284 = -1;
        this.f5286 = c1807;
        C1771 c1771 = new C1771(c1748);
        this.f5285 = c1771;
        this.f5284 = c1771;
        C1760 c1760 = c1771.f5202;
        this.f5283 = c1760;
        this.f5282 = c1760;
        this.f5290 = new C1224(0, new InterfaceC2129[16]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static AbstractC2128 m3412(AbstractC2128 abstractC2128) {
        boolean z = abstractC2128.f6278;
        if (z) {
            C0252 c0252 = AbstractC1793.f5233;
            if (!z) {
                AbstractC7935.m13395("autoInvalidateRemovedNode called on unattached node");
            }
            AbstractC1793.m3367(abstractC2128, -1, 2);
            abstractC2128.mo3355();
            abstractC2128.mo3361();
        }
        AbstractC2128 abstractC21282 = abstractC2128.f6287;
        AbstractC2128 abstractC21283 = abstractC2128.f6283;
        if (abstractC21282 != null) {
            abstractC21282.f6283 = abstractC21283;
            abstractC2128.f6287 = null;
        }
        if (abstractC21283 != null) {
            abstractC21283.f6287 = abstractC21282;
            abstractC2128.f6283 = null;
        }
        abstractC21283.getClass();
        return abstractC21283;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static AbstractC2128 m3413(InterfaceC2124 interfaceC2124, AbstractC2128 abstractC2128) {
        AbstractC2128 abstractC2128Mo1096;
        if (interfaceC2124 instanceof AbstractC1736) {
            abstractC2128Mo1096 = ((AbstractC1736) interfaceC2124).mo1096();
            abstractC2128Mo1096.f6290 = AbstractC1793.m3362(abstractC2128Mo1096);
        } else {
            C1768 c1768 = new C1768();
            c1768.f6290 = AbstractC1793.m3364(interfaceC2124);
            c1768.f5191 = interfaceC2124;
            c1768.f5192 = new HashSet();
            abstractC2128Mo1096 = c1768;
        }
        if (abstractC2128Mo1096.f6278) {
            AbstractC7935.m13395("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        abstractC2128Mo1096.f6286 = true;
        AbstractC2128 abstractC21282 = abstractC2128.f6287;
        if (abstractC21282 != null) {
            abstractC21282.f6283 = abstractC2128Mo1096;
            abstractC2128Mo1096.f6287 = abstractC21282;
        }
        abstractC2128.f6287 = abstractC2128Mo1096;
        abstractC2128Mo1096.f6283 = abstractC2128;
        return abstractC2128Mo1096;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m3414(C1811 c1811, AbstractC2128 abstractC2128, AbstractC1794 abstractC1794) {
        for (AbstractC2128 abstractC21282 = abstractC2128.f6283; abstractC21282 != null; abstractC21282 = abstractC21282.f6283) {
            if (abstractC21282 == c1811.f5286) {
                C1748 c1748M3246 = c1811.f5287.m3246();
                abstractC1794.f5255 = c1748M3246 != null ? c1748M3246.f5093.f5285 : null;
                c1811.f5284 = abstractC1794;
                return;
            } else {
                if ((abstractC21282.f6290 & 2) != 0) {
                    return;
                }
                abstractC21282.mo3353(abstractC1794);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m3415(InterfaceC2124 interfaceC2124, InterfaceC2124 interfaceC21242, AbstractC2128 abstractC2128) {
        if ((interfaceC2124 instanceof AbstractC1736) && (interfaceC21242 instanceof AbstractC1736)) {
            abstractC2128.getClass();
            ((AbstractC1736) interfaceC21242).mo1095(abstractC2128);
            if (abstractC2128.f6278) {
                AbstractC1793.m3365(abstractC2128);
                return;
            } else {
                abstractC2128.f6282 = true;
                return;
            }
        }
        if (!(abstractC2128 instanceof C1768)) {
            AbstractC7935.m13395("Unknown Modifier.Node type");
            return;
        }
        C1768 c1768 = (C1768) abstractC2128;
        boolean z = c1768.f6278;
        if (z) {
            if (!z) {
                AbstractC7935.m13395("unInitializeModifier called on unattached node");
            }
            if ((c1768.f6290 & 8) != 0) {
                ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3337(c1768)).m3517();
            }
        }
        c1768.f5191 = interfaceC21242;
        c1768.f6290 = AbstractC1793.m3364(interfaceC21242);
        if (c1768.f6278) {
            c1768.m3307(false);
        }
        if (abstractC2128.f6278) {
            AbstractC1793.m3365(abstractC2128);
        } else {
            abstractC2128.f6282 = true;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        AbstractC2128 abstractC2128 = this.f5282;
        C1760 c1760 = this.f5283;
        if (abstractC2128 == c1760) {
            sb.append("]");
        } else {
            while (true) {
                if (abstractC2128 == null || abstractC2128 == c1760) {
                    break;
                }
                sb.append(String.valueOf(abstractC2128));
                if (abstractC2128.f6287 == c1760) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                abstractC2128 = abstractC2128.f6287;
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
    
        if (r0.m3403(r14 - 1, r27 - 1) == false) goto L185;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3416(int r32, androidx.compose.runtime.collection.C1224 r33, androidx.compose.runtime.collection.C1224 r34, androidx.compose.ui.AbstractC2128 r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 925
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.C1811.m3416(int, androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲, androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲, androidx.compose.ui.飘花落叶言子楪哲苏世兰, boolean):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m3417() {
        for (AbstractC2128 abstractC2128 = this.f5282; abstractC2128 != null; abstractC2128 = abstractC2128.f6287) {
            abstractC2128.mo3359();
            if (abstractC2128.f6286) {
                C0252 c0252 = AbstractC1793.f5233;
                if (!abstractC2128.f6278) {
                    AbstractC7935.m13395("autoInvalidateInsertedNode called on unattached node");
                }
                AbstractC1793.m3367(abstractC2128, -1, 1);
            }
            if (abstractC2128.f6282) {
                AbstractC1793.m3365(abstractC2128);
            }
            abstractC2128.f6286 = false;
            abstractC2128.f6282 = false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m3418(int i) {
        return (this.f5282.f6284 & i) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m3419() {
        C1748 c1748;
        C1753 c1753;
        InterfaceC1806 interfaceC1806;
        AbstractC2128 abstractC2128 = this.f5283.f6283;
        AbstractC1794 abstractC1794 = this.f5285;
        while (true) {
            c1748 = this.f5287;
            if (abstractC2128 == null) {
                break;
            }
            InterfaceC1773 interfaceC1773M3328 = AbstractC1785.m3328(abstractC2128);
            if (interfaceC1773M3328 != null) {
                AbstractC1794 abstractC17942 = abstractC2128.f6285;
                if (abstractC17942 != null) {
                    c1753 = (C1753) abstractC17942;
                    InterfaceC1773 interfaceC1773 = c1753.f5140;
                    c1753.m3277(interfaceC1773M3328);
                    if (interfaceC1773 != abstractC2128 && (interfaceC1806 = c1753.f5259) != null) {
                        ((C1911) interfaceC1806).m3600();
                    }
                } else {
                    c1753 = new C1753(c1748, interfaceC1773M3328);
                    abstractC2128.mo3353(c1753);
                }
                abstractC1794.f5255 = c1753;
                c1753.f5256 = abstractC1794;
                abstractC1794 = c1753;
            } else {
                abstractC2128.mo3353(abstractC1794);
            }
            abstractC2128 = abstractC2128.f6283;
        }
        C1748 c1748M3246 = c1748.m3246();
        abstractC1794.f5255 = c1748M3246 != null ? c1748M3246.f5093.f5285 : null;
        this.f5284 = abstractC1794;
    }
}
