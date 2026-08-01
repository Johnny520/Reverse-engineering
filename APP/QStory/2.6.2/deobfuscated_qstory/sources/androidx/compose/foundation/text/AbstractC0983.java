package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.activity.AbstractC0053;
import androidx.activity.compose.C0001;
import androidx.appcompat.app.C0076;
import androidx.appcompat.app.C0113;
import androidx.collection.C0276;
import androidx.compose.foundation.layout.AbstractC0643;
import androidx.compose.foundation.lazy.C0756;
import androidx.compose.foundation.text.contextmenu.internal.AbstractC0808;
import androidx.compose.foundation.text.selection.AbstractC0895;
import androidx.compose.foundation.text.selection.C0882;
import androidx.compose.foundation.text.selection.C0884;
import androidx.compose.foundation.text.selection.InterfaceC0918;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.runtime.snapshots.AbstractC1274;
import androidx.compose.runtime.snapshots.AbstractC1286;
import androidx.compose.ui.AbstractC2120;
import androidx.compose.ui.C2119;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.input.pointer.AbstractC1622;
import androidx.compose.ui.input.pointer.C1634;
import androidx.compose.ui.input.pointer.InterfaceC1635;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.InterfaceC1658;
import androidx.compose.ui.layout.InterfaceC1695;
import androidx.compose.ui.node.C1765;
import androidx.compose.ui.node.InterfaceC1784;
import androidx.compose.ui.platform.AbstractC1902;
import androidx.compose.ui.semantics.AbstractC1948;
import androidx.compose.ui.text.C2033;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.C2068;
import androidx.compose.ui.text.input.C1997;
import androidx.compose.ui.text.input.C2004;
import androidx.compose.ui.text.input.C2013;
import androidx.compose.ui.text.input.C2014;
import androidx.compose.ui.text.input.C2025;
import androidx.compose.ui.text.input.InterfaceC2020;
import androidx.compose.ui.text.input.InterfaceC2022;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.text.BreakIterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C5175;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.AbstractC5061;
import kotlinx.coroutines.AbstractC5398;
import p000.AbstractC6087;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p106.AbstractC7307;
import p112.C7327;
import p167.C7712;
import p176.AbstractC7740;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0983 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final int f2849 = 9;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final int f2855 = 12;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final int f2856 = 10;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1242 f2854 = new C1242(759698998, false, new C0984(0));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0113 f2853 = new C0113(new C0944(0), 13);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C0944 f2852 = new C0944(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C1634 f2851 = new C1634(1022);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C0966 f2850 = new C0966(0, 0);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final void m1876(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbM151 = AbstractC0053.m151(i3, i, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
        sbM151.append(i2);
        sbM151.append(']');
        AbstractC7740.m13067(sbM151.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final void m1877(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbM151 = AbstractC0053.m151(i3, i, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
        sbM151.append(i2);
        sbM151.append(']');
        AbstractC7740.m13067(sbM151.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final void m1878(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            AbstractC7740.m13069("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        AbstractC7740.m13069("minLines " + i + " must be less than or equal to maxLines " + i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m1879(C0882 c0882, boolean z, InterfaceC1373 interfaceC1373, int i) {
        C0963 c0963M1855;
        C2033 c2033;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(626339208);
        int i2 = (c1324.m2368(c0882) ? 4 : 2) | i | (c1324.m2369(z) ? 32 : 16);
        if (!c1324.m2333(i2 & 1, (i2 & 19) != 18)) {
            c1324.m2329();
        } else if (z) {
            c1324.m2382(1530097388);
            C0943 c0943 = c0882.f2486;
            C2033 c20332 = null;
            if (c0943 != null && (c0963M1855 = c0943.m1855()) != null && (c2033 = c0963M1855.f2744) != null) {
                C0943 c09432 = c0882.f2486;
                if (!(c09432 != null ? c09432.f2681 : true)) {
                    c20332 = c2033;
                }
            }
            if (c20332 == null) {
                c1324.m2382(1530097387);
                c1324.m2367(false);
            } else {
                c1324.m2382(1530097388);
                if (C2035.m3742(c0882.m1749().f5945)) {
                    c1324.m2382(2110860558);
                    c1324.m2367(false);
                } else {
                    c1324.m2382(2109807302);
                    InterfaceC2022 interfaceC2022 = c0882.f2488;
                    int i3 = (int) (c0882.m1749().f5945 >> 32);
                    interfaceC2022.mo1872(i3);
                    InterfaceC2022 interfaceC20222 = c0882.f2488;
                    int i4 = (int) (c0882.m1749().f5945 & 4294967295L);
                    interfaceC20222.mo1872(i4);
                    ResolvedTextDirection resolvedTextDirectionM3735 = c20332.m3735(i3);
                    ResolvedTextDirection resolvedTextDirectionM37352 = c20332.m3735(Math.max(i4 - 1, 0));
                    C0943 c09433 = c0882.f2486;
                    if (c09433 == null || !((Boolean) ((AbstractC1347) c09433.f2677).getValue()).booleanValue()) {
                        c1324.m2382(2110490542);
                        c1324.m2367(false);
                    } else {
                        c1324.m2382(2110225306);
                        AbstractC0895.m1792(true, resolvedTextDirectionM3735, c0882, c1324, ((i2 << 6) & 896) | 6);
                        c1324.m2367(false);
                    }
                    C0943 c09434 = c0882.f2486;
                    if (c09434 == null || !((Boolean) ((AbstractC1347) c09434.f2676).getValue()).booleanValue()) {
                        c1324.m2382(2110838734);
                        c1324.m2367(false);
                    } else {
                        c1324.m2382(2110574459);
                        AbstractC0895.m1792(false, resolvedTextDirectionM37352, c0882, c1324, ((i2 << 6) & 896) | 6);
                        c1324.m2367(false);
                    }
                    c1324.m2367(false);
                }
                C0943 c09435 = c0882.f2486;
                if (c09435 != null) {
                    InterfaceC1395 interfaceC1395 = c09435.f2685;
                    if (!AbstractC4394.m8917(c0882.f2494.f5946.f6128, c0882.m1749().f5946.f6128)) {
                        ((AbstractC1347) interfaceC1395).setValue(Boolean.FALSE);
                    }
                    if (c09435.m1857()) {
                        if (((Boolean) ((AbstractC1347) interfaceC1395).getValue()).booleanValue()) {
                            c0882.m1745();
                        } else {
                            c0882.m1753();
                        }
                    }
                }
                c1324.m2367(false);
            }
            c1324.m2367(false);
        } else {
            c1324.m2382(1989076778);
            c1324.m2367(false);
            c0882.m1753();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0001(c0882, z, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final void m1880(InterfaceC2129 interfaceC2129, C0882 c0882, C1242 c1242, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(2036174316);
        int i2 = (c1324.m2350(interfaceC2129) ? 4 : 2) | i | (c1324.m2368(c0882) ? 32 : 16);
        if (c1324.m2333(i2 & 1, (i2 & 147) != 146)) {
            InterfaceC1658 interfaceC1658M1441 = AbstractC0643.m1441(C2119.f6271, true);
            int iHashCode = Long.hashCode(c1324.f3836);
            C1253 c1253M2371 = c1324.m2371();
            InterfaceC2129 interfaceC2129M3851 = AbstractC2120.m3851(c1324, interfaceC2129);
            InterfaceC1784.f5221.getClass();
            InterfaceC6542 interfaceC6542 = C1765.f5184;
            c1324.m2386();
            if (c1324.f3837) {
                c1324.m2370(interfaceC6542);
            } else {
                c1324.m2380();
            }
            AbstractC1367.m2464(c1324, interfaceC1658M1441, C1765.f5180);
            AbstractC1367.m2464(c1324, c1253M2371, C1765.f5181);
            AbstractC1367.m2464(c1324, Integer.valueOf(iHashCode), C1765.f5187);
            AbstractC1367.m2472(c1324, C1765.f5186);
            AbstractC1367.m2464(c1324, interfaceC2129M3851, C1765.f5182);
            m1882(c0882, c1242, c1324, (i2 >> 3) & 126);
            c1324.m2367(true);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0981(interfaceC2129, c0882, c1242, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0460 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05f9 A[PHI: r12 r20 r25
  0x05f9: PHI (r12v21 androidx.compose.ui.text.input.飘花落叶言子楪苏兰世哲) = (r12v14 androidx.compose.ui.text.input.飘花落叶言子楪苏兰世哲), (r12v22 androidx.compose.ui.text.input.飘花落叶言子楪苏兰世哲) binds: [B:281:0x05f7, B:278:0x05e8] A[DONT_GENERATE, DONT_INLINE]
  0x05f9: PHI (r20v24 androidx.compose.foundation.text.飘花落叶言子世兰苏楪哲) = (r20v19 androidx.compose.foundation.text.飘花落叶言子世兰苏楪哲), (r20v26 androidx.compose.foundation.text.飘花落叶言子世兰苏楪哲) binds: [B:281:0x05f7, B:278:0x05e8] A[DONT_GENERATE, DONT_INLINE]
  0x05f9: PHI (r25v8 boolean) = (r25v2 boolean), (r25v9 boolean) binds: [B:281:0x05f7, B:278:0x05e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0618 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x082f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x08c4  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x098a  */
    /* JADX WARN: Type inference failed for: r0v28, types: [androidx.compose.foundation.text.飘花落叶言子苏世兰哲楪] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1881(final androidx.compose.ui.text.input.C2013 r64, final p052.InterfaceC6557 r65, final androidx.compose.ui.InterfaceC2129 r66, final androidx.compose.ui.text.C2031 r67, final androidx.collection.C0276 r68, final p052.InterfaceC6557 r69, final androidx.compose.ui.graphics.AbstractC1598 r70, final boolean r71, final int r72, final int r73, final androidx.compose.ui.text.input.C2025 r74, final androidx.compose.foundation.text.C0941 r75, final boolean r76, final p052.InterfaceC6550 r77, androidx.compose.runtime.InterfaceC1373 r78, final int r79, final int r80) {
        /*
            Method dump skipped, instruction units count: 2562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.AbstractC0983.m1881(androidx.compose.ui.text.input.飘花落叶言子楪兰哲世苏, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, androidx.compose.ui.飘花落叶言子楪哲苏兰世, androidx.compose.ui.text.飘花落叶言子世哲兰楪苏, androidx.collection.飘花落叶言子楪苏世哲兰, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, androidx.compose.ui.graphics.飘花落叶言子楪兰世苏哲, boolean, int, int, androidx.compose.ui.text.input.飘花落叶言子楪苏兰世哲, androidx.compose.foundation.text.飘花落叶言子世兰楪苏哲, boolean, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏, androidx.compose.runtime.飘花落叶言子楪苏哲世兰, int, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m1882(C0882 c0882, C1242 c1242, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(2080741862);
        if ((i & 6) == 0) {
            i2 = (c1324.m2368(c0882) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2368(c1242) ? 32 : 16;
        }
        int i3 = 1;
        if (c1324.m2333(i2 & 1, (i2 & 19) != 18)) {
            m1883(c0882, c1242, c1324, i2 & 126);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0980(c0882, c1242, i, i3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m1883(C0882 c0882, C1242 c1242, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(1533506138);
        if ((i & 6) == 0) {
            i2 = (c1324.m2368(c0882) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2368(c1242) ? 32 : 16;
        }
        int i3 = 0;
        if (c1324.m2333(i2 & 1, (i2 & 19) != 18)) {
            c1324.m2382(-885604480);
            AbstractC0808.m1624(c0882.m1755(), c1242, c1324, i2 & 112);
            c1324.m2367(false);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0980(c0882, c1242, i, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0111  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1884(java.lang.String r20, final androidx.compose.ui.InterfaceC2129 r21, final androidx.compose.ui.text.C2031 r22, p052.InterfaceC6557 r23, int r24, boolean r25, final int r26, int r27, androidx.compose.runtime.InterfaceC1373 r28, final int r29, final int r30) {
        /*
            Method dump skipped, instruction units count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.AbstractC0983.m1884(java.lang.String, androidx.compose.ui.飘花落叶言子楪哲苏兰世, androidx.compose.ui.text.飘花落叶言子世哲兰楪苏, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, int, boolean, int, int, androidx.compose.runtime.飘花落叶言子楪苏哲世兰, int, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C7712 m1885() {
        if (!C7712.m12979()) {
            return null;
        }
        C7712 c7712M12980 = C7712.m12980();
        if (c7712M12980.m12983() == 1) {
            return c7712M12980;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1886(kotlin.coroutines.jvm.internal.ContinuationImpl r4) {
        /*
            boolean r0 = r4 instanceof androidx.compose.foundation.text.CommonContextMenuAreaKt$getContextMenuItemsAvailability$1
            if (r0 == 0) goto L13
            r0 = r4
            androidx.compose.foundation.text.CommonContextMenuAreaKt$getContextMenuItemsAvailability$1 r0 = (androidx.compose.foundation.text.CommonContextMenuAreaKt$getContextMenuItemsAvailability$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.CommonContextMenuAreaKt$getContextMenuItemsAvailability$1 r0 = new androidx.compose.foundation.text.CommonContextMenuAreaKt$getContextMenuItemsAvailability$1
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 != r3) goto L32
            java.lang.Object r0 = r0.L$0
            if (r0 != 0) goto L2c
            kotlin.AbstractC5184.m10206(r4)
            throw r2
        L2c:
            java.lang.ClassCastException r4 = new java.lang.ClassCastException
            r4.<init>()
            throw r4
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L3a:
            kotlin.AbstractC5184.m10206(r4)
            r0.L$0 = r2
            r0.label = r3
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.AbstractC0983.m1886(kotlin.coroutines.jvm.internal.ContinuationImpl):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static void m1887(C2013 c2013, C1009 c1009, C2033 c2033, InterfaceC1695 interfaceC1695, C1997 c1997, boolean z, InterfaceC2022 interfaceC2022) {
        if (z) {
            int iM3740 = C2035.m3740(c2013.f5945);
            interfaceC2022.mo1872(iM3740);
            String str = AbstractC0996.f2915;
            C7327 c7327M3734 = iM3740 < c2033.f5990.f5996.f6128.length() ? c2033.m3734(iM3740) : iM3740 != 0 ? c2033.m3734(iM3740 - 1) : new C7327(0.0f, 0.0f, 1.0f, (int) (AbstractC0996.m1906(c1009.f2954, c1009.f2957, c1009.f2956, AbstractC0996.f2915, 1) & 4294967295L));
            float f = c7327M3734.f19544;
            float f2 = c7327M3734.f19545;
            long jMo3066 = interfaceC1695.mo3066((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            C7327 c7327M10034 = AbstractC5061.m10034((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo3066 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo3066 >> 32)))) << 32), (((long) Float.floatToRawIntBits(c7327M3734.f19543 - f2)) << 32) | (((long) Float.floatToRawIntBits(c7327M3734.f19542 - f)) & 4294967295L));
            if (AbstractC4394.m8917((C1997) c1997.f5888.f5947.get(), c1997)) {
                c1997.f5887.mo1674(c7327M10034);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [T, androidx.compose.ui.text.input.飘花落叶言子世楪兰哲苏, java.lang.Object] */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final void m1888(C2014 c2014, C0943 c0943, C2013 c2013, C2025 c2025, InterfaceC2022 interfaceC2022) {
        C0076 c0076 = c0943.f2666;
        C0977 c0977 = c0943.f2675;
        C0977 c09772 = c0943.f2672;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        C0756 c0756 = new C0756(c0076, c0977, ref$ObjectRef, 3);
        InterfaceC2020 interfaceC2020 = c2014.f5948;
        interfaceC2020.mo1676(c2013, c2025, c0756, c09772);
        ?? c1997 = new C1997(c2014, interfaceC2020);
        c2014.f5947.set(c1997);
        ref$ObjectRef.element = c1997;
        c0943.f2665 = c1997;
        m1890(c0943, c2013, interfaceC2022);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final int m1889(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final void m1890(C0943 c0943, C2013 c2013, InterfaceC2022 interfaceC2022) {
        AbstractC1286 abstractC1286M2221 = AbstractC1274.m2221();
        InterfaceC6557 interfaceC6557Mo2193 = abstractC1286M2221 != null ? abstractC1286M2221.mo2193() : null;
        AbstractC1286 abstractC1286M2233 = AbstractC1274.m2233(abstractC1286M2221);
        try {
            C0963 c0963M1855 = c0943.m1855();
            if (c0963M1855 == null) {
                return;
            }
            C1997 c1997 = c0943.f2665;
            if (c1997 == null) {
                return;
            }
            InterfaceC1695 interfaceC1695M1856 = c0943.m1856();
            if (interfaceC1695M1856 == null) {
                return;
            }
            m1887(c2013, c0943.f2669, c0963M1855.f2744, interfaceC1695M1856, c1997, c0943.m1857(), interfaceC2022);
        } finally {
            AbstractC1274.m2227(abstractC1286M2221, abstractC1286M2233, interfaceC6557Mo2193);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.appcompat.app.飘花落叶言子苏楪世兰哲, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int m1891(int r11, java.lang.String r12) {
        /*
            飘花落叶言子哲苏兰楪世.飘花落叶言子楪苏哲世兰 r0 = m1885()
            r1 = 0
            if (r0 == 0) goto L79
            int r2 = r0.m12983()
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L10
            goto L11
        L10:
            r4 = r3
        L11:
            if (r4 == 0) goto L73
            java.lang.String r2 = "charSequence cannot be null"
            p053.AbstractC6560.m12036(r12, r2)
            飘花落叶言子哲苏兰楪世.飘花落叶言子楪世兰哲苏 r0 = r0.f20925
            androidx.appcompat.app.飘花落叶言子苏楪世兰哲 r4 = r0.f20879
            r4.getClass()
            r0 = -1
            if (r11 < 0) goto L28
            int r2 = r12.length()
            if (r11 < r2) goto L2a
        L28:
            r5 = r12
            goto L69
        L2a:
            boolean r2 = r12 instanceof android.text.Spanned
            if (r2 == 0) goto L46
            r2 = r12
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r5 = r11 + 1
            java.lang.Class<飘花落叶言子哲苏兰楪世.飘花落叶言子楪兰哲苏世> r6 = p167.C7699.class
            java.lang.Object[] r5 = r2.getSpans(r11, r5, r6)
            飘花落叶言子哲苏兰楪世.飘花落叶言子楪兰哲苏世[] r5 = (p167.C7699[]) r5
            int r6 = r5.length
            if (r6 <= 0) goto L46
            r3 = r5[r3]
            int r2 = r2.getSpanEnd(r3)
            r5 = r12
            goto L6a
        L46:
            int r2 = r11 + (-16)
            int r6 = java.lang.Math.max(r3, r2)
            int r2 = r12.length()
            int r3 = r11 + 16
            int r7 = java.lang.Math.min(r2, r3)
            飘花落叶言子哲苏兰楪世.飘花落叶言子楪哲苏兰世 r10 = new 飘花落叶言子哲苏兰楪世.飘花落叶言子楪哲苏兰世
            r10.<init>(r11)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 1
            r5 = r12
            java.lang.Object r12 = r4.m372(r5, r6, r7, r8, r9, r10)
            飘花落叶言子哲苏兰楪世.飘花落叶言子楪哲苏兰世 r12 = (p167.C7707) r12
            int r2 = r12.f20916
            goto L6a
        L69:
            r2 = r0
        L6a:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            if (r2 != r0) goto L71
            goto L7a
        L71:
            r1 = r12
            goto L7a
        L73:
            java.lang.String r11 = "Not initialized yet"
            top.suzhelan.qstory.hook.item.C5919.m11250(r11)
            return r3
        L79:
            r5 = r12
        L7a:
            if (r1 == 0) goto L81
            int r11 = r1.intValue()
            return r11
        L81:
            java.text.BreakIterator r12 = java.text.BreakIterator.getCharacterInstance()
            r12.setText(r5)
            int r11 = r12.following(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.AbstractC0983.m1891(int, java.lang.String):int");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C2004 m1892(C0276 c0276, C2068 c2068) {
        c0276.getClass();
        int length = c2068.f6128.length();
        String str = c2068.f6128;
        int length2 = str.length();
        int iMin = Math.min(length, 100);
        for (int i = 0; i < iMin; i++) {
            m1877(i, length2, i);
        }
        m1877(length, length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < iMin2; i2++) {
            m1876(i2, length, i2);
        }
        m1876(length2, length, length2);
        return new C2004(c2068, new C0966(str.length(), str.length()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final int m1893(int i, String str) {
        C7712 c7712M1885 = m1885();
        Integer num = null;
        if (c7712M1885 != null) {
            Integer numValueOf = Integer.valueOf(c7712M1885.m12984(Math.max(0, i - 1), str));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1894(androidx.compose.foundation.text.selection.C0882 r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof androidx.compose.foundation.text.CommonContextMenuAreaKt$getContextMenuItemsAvailability$2
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.text.CommonContextMenuAreaKt$getContextMenuItemsAvailability$2 r0 = (androidx.compose.foundation.text.CommonContextMenuAreaKt$getContextMenuItemsAvailability$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.CommonContextMenuAreaKt$getContextMenuItemsAvailability$2 r0 = new androidx.compose.foundation.text.CommonContextMenuAreaKt$getContextMenuItemsAvailability$2
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            androidx.compose.foundation.text.selection.飘花落叶言子世兰哲苏楪 r4 = (androidx.compose.foundation.text.selection.C0882) r4
            kotlin.AbstractC5184.m10206(r5)
            goto L40
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r4)
            r4 = 0
            return r4
        L32:
            kotlin.AbstractC5184.m10206(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r4.m1744(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            androidx.compose.ui.text.input.飘花落叶言子楪兰哲世苏 r5 = r4.m1749()
            long r0 = r5.f5945
            boolean r5 = androidx.compose.ui.text.C2035.m3742(r0)
            r0 = 0
            if (r5 != 0) goto L52
            androidx.compose.ui.platform.飘花落叶言子苏楪兰世哲 r5 = r4.f2503
            if (r5 == 0) goto L52
            goto L53
        L52:
            r3 = r0
        L53:
            boolean r5 = r4.m1746()
            boolean r1 = r4.m1747()
            boolean r2 = r4.m1762()
            boolean r4 = r4.m1748()
            if (r5 == 0) goto L67
            r5 = 2
            goto L68
        L67:
            r5 = r0
        L68:
            r5 = r5 | r3
            if (r1 == 0) goto L6d
            r1 = 4
            goto L6e
        L6d:
            r1 = r0
        L6e:
            r5 = r5 | r1
            if (r2 == 0) goto L74
            r1 = 8
            goto L75
        L74:
            r1 = r0
        L75:
            r5 = r5 | r1
            if (r4 == 0) goto L7a
            r0 = 16
        L7a:
            r4 = r5 | r0
            androidx.compose.foundation.text.飘花落叶言子世兰哲苏楪 r5 = new androidx.compose.foundation.text.飘花落叶言子世兰哲苏楪
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.AbstractC0983.m1894(androidx.compose.foundation.text.selection.飘花落叶言子世兰哲苏楪, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final int m1895(int i, CharSequence charSequence) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final int m1896(int i, CharSequence charSequence) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C7327 m1897(AbstractC1708 abstractC1708, int i, C2004 c2004, C2033 c2033, boolean z, int i2) {
        C7327 c7327M3733;
        if (c2033 != null) {
            c2004.f5908.mo1872(i);
            c7327M3733 = c2033.m3733(i);
        } else {
            c7327M3733 = C7327.f19541;
        }
        float f = c7327M3733.f19545;
        int iMo1333 = abstractC1708.mo1333(2.0f);
        return new C7327(z ? (i2 - f) - iMo1333 : f, c7327M3733.f19544, z ? i2 - f : iMo1333 + f, c7327M3733.f19542);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final void m1898(C0882 c0882, InterfaceC1373 interfaceC1373, int i) {
        C2068 c2068M1750;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-1436003720);
        int i2 = (c1324.m2368(c0882) ? 4 : 2) | i;
        int i3 = 1;
        if (c1324.m2333(i2 & 1, (i2 & 3) != 2)) {
            C0943 c0943 = c0882.f2486;
            if (c0943 == null || !((Boolean) ((AbstractC1347) c0943.f2680).getValue()).booleanValue() || (c2068M1750 = c0882.m1750()) == null || c2068M1750.f6128.length() <= 0) {
                c1324.m2382(-2111042550);
                c1324.m2367(false);
            } else {
                c1324.m2382(-2112351432);
                boolean zM2350 = c1324.m2350(c0882);
                Object objM2335 = c1324.m2335();
                C1353 c1353 = C1369.f3973;
                if (zM2350 || objM2335 == c1353) {
                    objM2335 = new C0884(c0882);
                    c1324.m2376(objM2335);
                }
                InterfaceC1013 interfaceC1013 = (InterfaceC1013) objM2335;
                InterfaceC7895 interfaceC7895 = (InterfaceC7895) c1324.m2373(AbstractC1902.f5587);
                InterfaceC2022 interfaceC2022 = c0882.f2488;
                long j = c0882.m1749().f5945;
                int i4 = C2035.f6001;
                int i5 = (int) (j >> 32);
                interfaceC2022.mo1872(i5);
                C0943 c09432 = c0882.f2486;
                C0963 c0963M1855 = c09432 != null ? c09432.m1855() : null;
                c0963M1855.getClass();
                C2033 c2033 = c0963M1855.f2744;
                C7327 c7327M3733 = c2033.m3733(AbstractC6087.m11420(i5, 0, c2033.f5990.f5996.f6128.length()));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((interfaceC7895.mo1334(2.0f) / 2.0f) + c7327M3733.f19545)) << 32) | (((long) Float.floatToRawIntBits(c7327M3733.f19542)) & 4294967295L);
                boolean zM2351 = c1324.m2351(jFloatToRawIntBits);
                Object objM23352 = c1324.m2335();
                if (zM2351 || objM23352 == c1353) {
                    objM23352 = new C0950(jFloatToRawIntBits);
                    c1324.m2376(objM23352);
                }
                InterfaceC0918 interfaceC0918 = (InterfaceC0918) objM23352;
                boolean zM2368 = c1324.m2368(interfaceC1013) | c1324.m2368(c0882);
                Object objM23353 = c1324.m2335();
                if (zM2368 || objM23353 == c1353) {
                    objM23353 = new C0960(interfaceC1013, c0882);
                    c1324.m2376(objM23353);
                }
                InterfaceC2129 interfaceC2129M2992 = AbstractC1622.m2992(C2125.f6275, interfaceC1013, (PointerInputEventHandler) objM23353);
                boolean zM23512 = c1324.m2351(jFloatToRawIntBits);
                Object objM23354 = c1324.m2335();
                if (zM23512 || objM23354 == c1353) {
                    objM23354 = new C0969(jFloatToRawIntBits, i3);
                    c1324.m2376(objM23354);
                }
                AbstractC0968.m1875(interfaceC0918, AbstractC1948.m3639(interfaceC2129M2992, false, (InterfaceC6557) objM23354), 0L, c1324, 0);
                c1324.m2367(false);
            }
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0973(c0882, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Object m1899(InterfaceC1635 interfaceC1635, InterfaceC1013 interfaceC1013, InterfaceC4356 interfaceC4356) throws Throwable {
        Object objM10503 = AbstractC5398.m10503(new LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(interfaceC1635, interfaceC1013, null), interfaceC4356);
        return objM10503 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM10503 : C5175.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final void m1900(C0943 c0943) {
        C1997 c1997 = c0943.f2665;
        if (c1997 != null) {
            c0943.f2675.invoke(C2013.m3705((C2013) c0943.f2666.f227, null, 0L, 3));
            C2014 c2014 = c1997.f5888;
            AtomicReference atomicReference = c2014.f5947;
            while (true) {
                if (atomicReference.compareAndSet(c1997, null)) {
                    c2014.f5948.mo1672();
                    break;
                } else if (atomicReference.get() != c1997) {
                    break;
                }
            }
        }
        c0943.f2665 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final boolean m1901(int i, KeyEvent keyEvent) {
        return ((int) (AbstractC7307.m12477(keyEvent) >> 32)) == i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final int m1902(float f) {
        return Math.round((float) Math.ceil(f));
    }
}
