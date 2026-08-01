package androidx.compose.ui.focus;

import android.view.View;
import androidx.collection.C0244;
import androidx.collection.C0253;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.AbstractC1788;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1811;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import io.ktor.util.C4210;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6557;
import p210.AbstractC7935;

/* JADX INFO: renamed from: androidx.compose.ui.focus.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1478 implements InterfaceC1483 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C0253 f4186;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1480 f4188;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC1884 f4190;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC1884 f4191;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C1452 f4192;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1452 f4189 = new C1452(2, null, 14);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1474 f4187 = new C1474(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C0244 f4193 = new C0244(1);

    public C1478(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884, ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC18842) {
        this.f4191 = viewTreeObserverOnGlobalLayoutListenerC1884;
        this.f4190 = viewTreeObserverOnGlobalLayoutListenerC18842;
        this.f4188 = new C1480(this, viewTreeObserverOnGlobalLayoutListenerC18842);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v20, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v23, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r12v24, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r12v28, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r12v29, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r12v33, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v42, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2629(android.view.KeyEvent r13, p052.InterfaceC6542 r14) {
        /*
            Method dump skipped, instruction units count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.C1478.m2629(android.view.KeyEvent, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m2630() {
        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = this.f4191;
        if (viewTreeObserverOnGlobalLayoutListenerC1884.isFocused() || viewTreeObserverOnGlobalLayoutListenerC1884.hasFocus()) {
            viewTreeObserverOnGlobalLayoutListenerC1884.clearFocus();
        } else if (viewTreeObserverOnGlobalLayoutListenerC1884.hasFocus()) {
            View viewFindFocus = viewTreeObserverOnGlobalLayoutListenerC1884.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            viewTreeObserverOnGlobalLayoutListenerC1884.clearFocus();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m2631(int i, boolean z, boolean z2) {
        boolean z3 = true;
        if (z) {
            m2632(z);
        } else {
            int i2 = AbstractC1475.f4173[AbstractC1459.m2603(this.f4189, i).ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                z3 = false;
            } else {
                if (i2 != 4) {
                    C4210.m8621();
                    return false;
                }
                m2632(z);
            }
        }
        if (z3 && z2) {
            m2630();
        }
        return z3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m2632(boolean z) {
        C1811 c1811;
        if (m2633() != null) {
            C1452 c1452M2633 = m2633();
            m2635(null);
            if (c1452M2633 != null) {
                c1452M2633.m2591(FocusStateImpl.Active, FocusStateImpl.Inactive);
                if (!c1452M2633.f6291.f6278) {
                    AbstractC7935.m13395("visitAncestors called on an unattached node");
                }
                AbstractC2128 abstractC2128 = c1452M2633.f6291.f6283;
                C1748 c1748M3336 = AbstractC1785.m3336(c1452M2633);
                while (c1748M3336 != null) {
                    if ((c1748M3336.f5093.f5282.f6284 & 1024) != 0) {
                        while (abstractC2128 != null) {
                            if ((abstractC2128.f6290 & 1024) != 0) {
                                AbstractC2128 abstractC2128M3329 = abstractC2128;
                                C1224 c1224 = null;
                                while (abstractC2128M3329 != null) {
                                    if (abstractC2128M3329 instanceof C1452) {
                                        ((C1452) abstractC2128M3329).m2591(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                                    } else if ((abstractC2128M3329.f6290 & 1024) != 0 && (abstractC2128M3329 instanceof AbstractC1788)) {
                                        int i = 0;
                                        for (AbstractC2128 abstractC21282 = ((AbstractC1788) abstractC2128M3329).f5225; abstractC21282 != null; abstractC21282 = abstractC21282.f6287) {
                                            if ((abstractC21282.f6290 & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    abstractC2128M3329 = abstractC21282;
                                                } else {
                                                    if (c1224 == null) {
                                                        c1224 = new C1224(0, new AbstractC2128[16]);
                                                    }
                                                    if (abstractC2128M3329 != null) {
                                                        c1224.m2037(abstractC2128M3329);
                                                        abstractC2128M3329 = null;
                                                    }
                                                    c1224.m2037(abstractC21282);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    abstractC2128M3329 = AbstractC1785.m3329(c1224);
                                }
                            }
                            abstractC2128 = abstractC2128.f6283;
                        }
                    }
                    c1748M3336 = c1748M3336.m3246();
                    abstractC2128 = (c1748M3336 == null || (c1811 = c1748M3336.f5093) == null) ? null : c1811.f5283;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C1452 m2633() {
        C1452 c1452 = this.f4192;
        if (c1452 == null || !c1452.f6278) {
            return null;
        }
        return c1452;
    }

    /* JADX WARN: Code restructure failed: missing block: B:235:0x0126, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean m2634(int r20, p112.C7327 r21, final p052.InterfaceC6557 r22) {
        /*
            Method dump skipped, instruction units count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.C1478.m2634(int, 飘花落叶言子世哲兰楪苏.飘花落叶言子楪世哲苏兰, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世):java.lang.Boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m2635(C1452 c1452) {
        C1452 c14522 = this.f4192;
        this.f4192 = c1452;
        C0244 c0244 = this.f4193;
        Object[] objArr = c0244.f1005;
        int i = c0244.f1004;
        for (int i2 = 0; i2 < i; i2++) {
            ((InterfaceC1484) objArr[i2]).mo2532(c14522, c1452);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0099, code lost:
    
        r33 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a3, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == r33) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
    
        r0 = r4.m809(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if (r4.f919 != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bc, code lost:
    
        if (((r4.f923[r0 >> 3] >> ((r0 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00be, code lost:
    
        r37 = true;
        r40 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c4, code lost:
    
        r0 = r4.f921;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c6, code lost:
    
        if (r0 <= 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d7, code lost:
    
        if (java.lang.Long.compareUnsigned(((long) r4.f920) * 32, ((long) r0) * 25) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d9, code lost:
    
        r0 = r4.f923;
        r6 = r4.f921;
        r12 = r4.f922;
        r13 = (r6 + 7) >> 3;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e5, code lost:
    
        if (r14 >= r13) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e7, code lost:
    
        r8 = r0[r14] & (-9187201950435737472L);
        r0[r14] = ((~r8) + (r8 >>> 7)) & (-72340172838076674L);
        r14 = r14 + 1;
        r5 = r5;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0102, code lost:
    
        r15 = r5;
        r16 = r6;
        r40 = 128;
        r5 = kotlin.collections.AbstractC4346.m8847(r0);
        r6 = r5 - 1;
        r13 = 72057594037927935L;
        r0[r6] = (r0[r6] & 72057594037927935L) | (-72057594037927936L);
        r0[r5] = r0[0];
        r5 = r16;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0123, code lost:
    
        if (r6 == r5) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0125, code lost:
    
        r8 = r6 >> 3;
        r9 = (r6 & 7) << 3;
        r16 = (r0[r8] >> r9) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0133, code lost:
    
        if (r16 != 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0135, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x013a, code lost:
    
        if (r16 == 254) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013d, code lost:
    
        r16 = java.lang.Long.hashCode(r12[r6]) * r28;
        r16 = r16 ^ (r16 << 16);
        r17 = r13;
        r13 = r16 >>> 7;
        r14 = r4.m809(r13);
        r13 = r13 & r5;
        r29 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0161, code lost:
    
        if ((((r14 - r13) & r5) / 8) != (((r6 - r13) & r5) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0163, code lost:
    
        r37 = r7;
        r0[r8] = ((~(255 << r9)) & r0[r8]) | (((long) (r16 & 127)) << r9);
        r0[r0.length - 1] = (r0[0] & r17) | Long.MIN_VALUE;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0181, code lost:
    
        r13 = r17;
        r15 = r29;
        r7 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0188, code lost:
    
        r37 = r7;
        r7 = r14 >> 3;
        r26 = r0[r7];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x019a, code lost:
    
        if (((r26 >> r8) & 255) != 128) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x019c, code lost:
    
        r15 = r5;
        r35 = r6;
        r0[r7] = (r26 & (~(255 << r8))) | (((long) (r16 & 127)) << r8);
        r0[r8] = (r0[r8] & (~(255 << r9))) | (128 << r9);
        r12[r14] = r12[r35];
        r12[r35] = r33;
        r6 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c3, code lost:
    
        r15 = r5;
        r35 = r6;
        r0[r7] = (r26 & (~(255 << r8))) | (((long) (r16 & 127)) << r8);
        r5 = r12[r14];
        r12[r14] = r12[r35];
        r12[r35] = r5;
        r6 = r35 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01df, code lost:
    
        r0[r0.length - 1] = (r0[0] & r17) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01ee, code lost:
    
        r37 = r7;
        r4.f919 = androidx.collection.AbstractC0290.m885(r4.f921) - r4.f920;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01fd, code lost:
    
        r37 = true;
        r40 = 128;
        r0 = androidx.collection.AbstractC0290.m884(r4.f921);
        r5 = r4.f923;
        r6 = r4.f922;
        r7 = r4.f921;
        r4.m808(r0);
        r0 = r4.f923;
        r8 = r4.f922;
        r9 = r4.f921;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0218, code lost:
    
        if (r12 >= r7) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0227, code lost:
    
        if (((r5[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= 128) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0229, code lost:
    
        r13 = r6[r12];
        r15 = java.lang.Long.hashCode(r13) * r28;
        r15 = r15 ^ (r15 << 16);
        r16 = r0;
        r0 = r4.m809(r15 >>> 7);
        r17 = r5;
        r18 = r6;
        r5 = r15 & 127;
        r15 = r0 >> 3;
        r19 = (r0 & 7) << 3;
        r5 = (r16[r15] & (~(255 << r19))) | (r5 << r19);
        r16[r15] = r5;
        r16[(((r0 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r0] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0267, code lost:
    
        r16 = r0;
        r17 = r5;
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x026d, code lost:
    
        r12 = r12 + 1;
        r0 = r16;
        r5 = r17;
        r6 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0276, code lost:
    
        r0 = r4.m809(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x027a, code lost:
    
        r14 = r0;
        r4.f920++;
        r0 = r4.f919;
        r3 = r4.f923;
        r5 = r14 >> 3;
        r6 = r3[r5];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0293, code lost:
    
        if (((r6 >> r8) & 255) != r40) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0295, code lost:
    
        r21 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0297, code lost:
    
        r4.f919 = r0 - r21;
        r0 = r4.f921;
        r6 = (r6 & (~(255 << r8))) | (r10 << r8);
        r3[r5] = r6;
        r3[(((r14 - 7) & r0) + (r0 & 7)) >> 3] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x033f, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0341, code lost:
    
        r10 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v3, types: [int] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2636(android.view.KeyEvent r41) {
        /*
            Method dump skipped, instruction units count: 895
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.C1478.m2636(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Boolean] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m2637(final int i, boolean z) {
        C1452 c1452M2633 = m2633();
        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = this.f4191;
        if (c1452M2633 == null || !c1452M2633.f4146 || !viewTreeObserverOnGlobalLayoutListenerC1884.m3530(i)) {
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = Boolean.FALSE;
            C1452 c1452M26332 = m2633();
            Boolean boolM2634 = m2634(i, viewTreeObserverOnGlobalLayoutListenerC1884.getEmbeddedViewFocusRect(), new InterfaceC6557() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$focusSearchSuccess$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
                @Override // p052.InterfaceC6557
                public final Boolean invoke(C1452 c1452) {
                    ref$ObjectRef.element = Boolean.valueOf(c1452.m2586(i));
                    return ref$ObjectRef.element;
                }
            });
            if (!AbstractC4394.m8917(boolM2634, Boolean.TRUE) || c1452M26332 == m2633()) {
                if (boolM2634 != null && ref$ObjectRef.element != 0) {
                    if (!boolM2634.booleanValue() || !((Boolean) ref$ObjectRef.element).booleanValue()) {
                        if ((i == 1 || i == 2) && z && m2631(i, false, false)) {
                            Boolean boolM26342 = m2634(i, null, new InterfaceC6557() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$takeFocus$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // p052.InterfaceC6557
                                public final Boolean invoke(C1452 c1452) {
                                    return Boolean.valueOf(c1452.m2586(i));
                                }
                            });
                            if (boolM26342 != null ? boolM26342.booleanValue() : false) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m2638(final int i) {
        if (!m2631(i, false, false)) {
            return false;
        }
        Boolean boolM2634 = m2634(i, null, new InterfaceC6557() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$resetFocus$successfulReset$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6557
            public final Boolean invoke(C1452 c1452) {
                return Boolean.valueOf(c1452.m2586(i));
            }
        });
        boolean zBooleanValue = boolM2634 != null ? boolM2634.booleanValue() : false;
        if (!zBooleanValue) {
            m2630();
        }
        return zBooleanValue;
    }
}
