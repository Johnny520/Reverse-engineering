package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.activity.compose.C0002;
import androidx.activity.compose.C0004;
import androidx.appcompat.app.C0076;
import androidx.compose.foundation.C1060;
import androidx.compose.foundation.gestures.C0541;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.C0742;
import androidx.compose.foundation.lazy.C0743;
import androidx.compose.foundation.lazy.C0753;
import androidx.compose.foundation.lazy.C0758;
import androidx.compose.foundation.lazy.C0760;
import androidx.compose.foundation.lazy.C0762;
import androidx.compose.foundation.lazy.C0765;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1334;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1358;
import androidx.compose.runtime.C1359;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.runtime.internal.AbstractC1254;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.runtime.snapshots.AbstractC1274;
import androidx.compose.runtime.snapshots.AbstractC1286;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.layout.AbstractC1670;
import androidx.compose.ui.layout.AbstractC1709;
import androidx.compose.ui.layout.C1719;
import androidx.compose.ui.layout.InterfaceC1710;
import androidx.compose.ui.platform.AbstractC1835;
import com.davemorrissey.labs.subscaleview.R;
import java.util.Arrays;
import kotlin.C5175;
import kotlin.reflect.InterfaceC5096;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import p052.InterfaceC6542;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p088.C7166;
import p116.AbstractC7346;
import p116.AbstractC7347;
import p116.C7338;
import p116.InterfaceC7339;
import p116.InterfaceC7344;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0722 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0707 f2030 = new C0707(1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1 A[Catch: ItemFoundInScroll -> 0x01b3, TryCatch #1 {ItemFoundInScroll -> 0x01b3, blocks: (B:35:0x00cd, B:37:0x00d1, B:39:0x00d7, B:53:0x0101, B:55:0x011b, B:59:0x0130, B:63:0x0138), top: B:106:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0201  */
    /* JADX WARN: Type inference failed for: r10v0, types: [T, androidx.compose.animation.core.飘花落叶言子楪苏哲兰世] */
    /* JADX WARN: Type inference failed for: r10v12, types: [T, androidx.compose.animation.core.飘花落叶言子楪苏哲兰世] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0188 -> B:18:0x006a). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1506(androidx.compose.foundation.lazy.layout.InterfaceC0689 r28, int r29, int r30, int r31, p205.InterfaceC7895 r32, kotlin.coroutines.jvm.internal.ContinuationImpl r33) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.AbstractC0722.m1506(androidx.compose.foundation.lazy.layout.飘花落叶言子世哲苏楪兰, int, int, int, 飘花落叶言子苏哲世楪兰.飘花落叶言子楪世哲苏兰, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int m1507(int i, C1224 c1224) {
        int i2 = c1224.f3519 - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = c1224.f3520;
            int i5 = ((C0720) objArr[i4]).f2028;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((C0720) objArr[i3]).f2028) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m1508(C0762 c0762, Object obj, int i, Object obj2, InterfaceC1373 interfaceC1373, int i2) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(1439843069);
        int i3 = (c1324.m2350(c0762) ? 4 : 2) | i2 | (c1324.m2350(obj) ? 32 : 16) | (c1324.m2352(i) ? 256 : 128) | (c1324.m2350(obj2) ? 2048 : 1024);
        if (c1324.m2333(i3 & 1, (i3 & 1171) != 1170)) {
            ((InterfaceC7339) obj).mo1472(obj2, AbstractC1254.m2179(980966366, new C0765(i, c0762, obj2), c1324), c1324, 48);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0695(c0762, obj, i, obj2, i2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m1509(final C1242 c1242, InterfaceC1373 interfaceC1373, final int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-709502251);
        int i2 = 2;
        if (c1324.m2333(i & 1, (i & 3) != 2)) {
            C1334 c1334 = AbstractC7347.f19579;
            InterfaceC7344 interfaceC7344 = (InterfaceC7344) c1324.m2373(c1334);
            c1324.m2382(1967007413);
            Object[] objArr = new Object[0];
            Object objM2335 = c1324.m2335();
            C1353 c1353 = C1369.f3973;
            if (objM2335 == c1353) {
                objM2335 = new C7166(6);
                c1324.m2376(objM2335);
            }
            C7338 c7338 = (C7338) AbstractC7346.m12511(objArr, C7338.f19555, (InterfaceC6542) objM2335, c1324, 384);
            c7338.f19558 = (InterfaceC7344) c1324.m2373(c1334);
            c1324.m2367(false);
            Object[] objArr2 = {interfaceC7344};
            C4870 c4870 = new C4870(new C0753(i2), 13, new C0002(interfaceC7344, 12, c7338));
            boolean zM2368 = c1324.m2368(interfaceC7344) | c1324.m2368(c7338);
            Object objM23352 = c1324.m2335();
            int i3 = 3;
            if (zM2368 || objM23352 == c1353) {
                objM23352 = new C0004(interfaceC7344, i3, c7338);
                c1324.m2376(objM23352);
            }
            C0683 c0683 = (C0683) AbstractC7346.m12511(objArr2, c4870, (InterfaceC6542) objM23352, c1324, 0);
            AbstractC1367.m2478(c1334.mo2418(c0683), AbstractC1254.m2179(-412824043, new C1060(c1242, i3, c0683), c1324), c1324, 56);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new InterfaceC6553(i) { // from class: androidx.compose.foundation.lazy.layout.飘花落叶言子世兰苏哲楪
                @Override // p052.InterfaceC6553
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM2460 = AbstractC1367.m2460(7);
                    AbstractC0722.m1509(this.f1906, (InterfaceC1373) obj, iM2460);
                    return C5175.f14739;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m1510(final Object obj, final int i, final C0699 c0699, final C1242 c1242, InterfaceC1373 interfaceC1373, final int i2) {
        int i3;
        C0701 c0701;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(872548579);
        if ((i2 & 6) == 0) {
            i3 = (c1324.m2368(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c1324.m2352(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c1324.m2368(c0699) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= c1324.m2368(c1242) ? 2048 : 1024;
        }
        if (c1324.m2333(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zM2350 = c1324.m2350(obj) | c1324.m2350(c0699);
            Object objM2335 = c1324.m2335();
            C1353 c1353 = C1369.f3973;
            if (zM2350 || objM2335 == c1353) {
                objM2335 = new C0701(obj, c0699);
                c1324.m2376(objM2335);
            }
            C0701 c07012 = (C0701) objM2335;
            c07012.f1973 = i;
            InterfaceC1395 interfaceC1395 = c07012.f1976;
            C1358 c1358 = AbstractC1709.f4980;
            InterfaceC1710 interfaceC1710 = (InterfaceC1710) c1324.m2373(c1358);
            AbstractC1286 abstractC1286M2221 = AbstractC1274.m2221();
            InterfaceC6557 interfaceC6557Mo2193 = abstractC1286M2221 != null ? abstractC1286M2221.mo2193() : null;
            AbstractC1286 abstractC1286M2233 = AbstractC1274.m2233(abstractC1286M2221);
            try {
                if (interfaceC1710 != ((InterfaceC1710) ((AbstractC1347) interfaceC1395).getValue())) {
                    ((AbstractC1347) interfaceC1395).setValue(interfaceC1710);
                    if (c07012.f1972 > 0) {
                        C0701 c07013 = c07012.f1971;
                        if (c07013 != null) {
                            c07013.m1489();
                        }
                        if (interfaceC1710 != null) {
                            c0701 = (C0701) interfaceC1710;
                            c0701.m1490();
                        } else {
                            c0701 = null;
                        }
                        c07012.f1971 = c0701;
                    }
                }
                AbstractC1274.m2227(abstractC1286M2221, abstractC1286M2233, interfaceC6557Mo2193);
                boolean zM23502 = c1324.m2350(c07012);
                Object objM23352 = c1324.m2335();
                if (zM23502 || objM23352 == c1353) {
                    objM23352 = new C0723(c07012, 2);
                    c1324.m2376(objM23352);
                }
                AbstractC1367.m2475(c07012, (InterfaceC6557) objM23352, c1324);
                AbstractC1367.m2478(c1358.mo2418(c07012), c1242, c1324, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                AbstractC1274.m2227(abstractC1286M2221, abstractC1286M2233, interfaceC6557Mo2193);
                throw th;
            }
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new InterfaceC6553() { // from class: androidx.compose.foundation.lazy.layout.飘花落叶言子世苏楪兰哲
                @Override // p052.InterfaceC6553
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    AbstractC0722.m1510(obj, i, c0699, c1242, (InterfaceC1373) obj2, AbstractC1367.m2460(i2 | 1));
                    return C5175.f14739;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m1511(final InterfaceC6542 interfaceC6542, final InterfaceC2129 interfaceC2129, final C0696 c0696, final C0758 c0758, InterfaceC1373 interfaceC1373, final int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(1055276397);
        int i2 = (c1324.m2368(interfaceC6542) ? 4 : 2) | i | (c1324.m2350(interfaceC2129) ? 32 : 16) | (c1324.m2350(c0696) ? 256 : 128) | (c1324.m2350(c0758) ? 2048 : 1024);
        if (c1324.m2333(i2 & 1, (i2 & 1171) != 1170)) {
            final InterfaceC1395 interfaceC1395M2463 = AbstractC1367.m2463(interfaceC6542, c1324);
            m1509(AbstractC1254.m2179(-933153643, new InterfaceC6550() { // from class: androidx.compose.foundation.lazy.layout.飘花落叶言子世楪苏兰哲
                @Override // p052.InterfaceC6550
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    InterfaceC2129 interfaceC2129Mo3856;
                    InterfaceC7339 interfaceC7339 = (InterfaceC7339) obj;
                    ((Integer) obj3).getClass();
                    C1324 c13242 = (C1324) ((InterfaceC1373) obj2);
                    Object objM2335 = c13242.m2335();
                    C1353 c1353 = C1369.f3973;
                    if (objM2335 == c1353) {
                        objM2335 = new C0711(interfaceC7339, new C0685(interfaceC1395M2463, 3));
                        c13242.m2376(objM2335);
                    }
                    final C0711 c0711 = (C0711) objM2335;
                    Object objM23352 = c13242.m2335();
                    if (objM23352 == c1353) {
                        objM23352 = new C1719(new C0076(c0711));
                        c13242.m2376(objM23352);
                    }
                    final C1719 c1719 = (C1719) objM23352;
                    final C0696 c06962 = c0696;
                    if (c06962 != null) {
                        c13242.m2382(1743490539);
                        c13242.m2382(887527095);
                        final InterfaceC0735 interfaceC0735 = AbstractC0733.f2067;
                        if (interfaceC0735 != null) {
                            c13242.m2382(1345554384);
                        } else {
                            c13242.m2382(1345603457);
                            View view = (View) c13242.m2373(AbstractC1835.f5331);
                            boolean zM2350 = c13242.m2350(view);
                            Object objM23353 = c13242.m2335();
                            if (zM2350 || objM23353 == c1353) {
                                Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                                objM23353 = tag instanceof InterfaceC0735 ? (InterfaceC0735) tag : null;
                                if (objM23353 == null) {
                                    objM23353 = new ViewOnAttachStateChangeListenerC0706(view);
                                    view.setTag(R.id.compose_prefetch_scheduler, objM23353);
                                }
                                c13242.m2376(objM23353);
                            }
                            interfaceC0735 = (InterfaceC0735) objM23353;
                        }
                        c13242.m2367(false);
                        c13242.m2367(false);
                        Object[] objArr = {c06962, c0711, c1719, interfaceC0735};
                        boolean zM23502 = c13242.m2350(c06962) | c13242.m2368(c0711) | c13242.m2368(c1719) | c13242.m2368(interfaceC0735);
                        Object objM23354 = c13242.m2335();
                        if (zM23502 || objM23354 == c1353) {
                            objM23354 = new InterfaceC6557() { // from class: androidx.compose.foundation.lazy.layout.飘花落叶言子世楪哲兰苏
                                @Override // p052.InterfaceC6557
                                public final Object invoke(Object obj4) {
                                    C0734 c0734 = new C0734(c0711, c1719, interfaceC0735);
                                    C0696 c06963 = c06962;
                                    c06963.f1958 = c0734;
                                    return new C0713(c06963, 1);
                                }
                            };
                            c13242.m2376(objM23354);
                        }
                        InterfaceC6557 interfaceC6557 = (InterfaceC6557) objM23354;
                        boolean zM23503 = false;
                        for (Object obj4 : Arrays.copyOf(objArr, 4)) {
                            zM23503 |= c13242.m2350(obj4);
                        }
                        Object objM23355 = c13242.m2335();
                        if (zM23503 || objM23355 == c1353) {
                            c13242.m2376(new C1359(interfaceC6557));
                        }
                        c13242.m2367(false);
                    } else {
                        c13242.m2382(1744076749);
                        c13242.m2367(false);
                    }
                    int i3 = AbstractC0687.f1918;
                    InterfaceC2129 interfaceC21292 = interfaceC2129;
                    if (c06962 != null && (interfaceC2129Mo3856 = interfaceC21292.mo3856(new C0727(c06962))) != null) {
                        interfaceC21292 = interfaceC2129Mo3856;
                    }
                    boolean zM23504 = c13242.m2350(c0711);
                    C0758 c07582 = c0758;
                    boolean zM23505 = zM23504 | c13242.m2350(c07582);
                    Object objM23356 = c13242.m2335();
                    if (zM23505 || objM23356 == c1353) {
                        objM23356 = new C1060(c0711, 2, c07582);
                        c13242.m2376(objM23356);
                    }
                    AbstractC1670.m3093(c1719, interfaceC21292, (InterfaceC6553) objM23356, c13242, 8, 0);
                    return C5175.f14739;
                }
            }, c1324), c1324, 6);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new InterfaceC6553(interfaceC2129, c0696, c0758, i) { // from class: androidx.compose.foundation.lazy.layout.飘花落叶言子世楪哲苏兰

                /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
                public final /* synthetic */ C0758 f1942;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC2129 f1943;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                public final /* synthetic */ C0696 f1944;

                @Override // p052.InterfaceC6553
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM2460 = AbstractC1367.m2460(1);
                    AbstractC0722.m1511(this.f1945, this.f1943, this.f1944, this.f1942, (InterfaceC1373) obj, iM2460);
                    return C5175.f14739;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final InterfaceC2129 m1512(InterfaceC2129 interfaceC2129, InterfaceC5096 interfaceC5096, C0743 c0743, Orientation orientation, boolean z) {
        return interfaceC2129.mo3856(new C0684(interfaceC5096, c0743, orientation, z));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static InterfaceC1395 m1513() {
        return AbstractC1367.m2466(C5175.f14739, C1353.f3919);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final boolean m1514(boolean z, InterfaceC0689 interfaceC0689, int i, int i2) {
        if (z) {
            if (interfaceC0689.mo1483() > i) {
                return true;
            }
            return interfaceC0689.mo1483() == i && interfaceC0689.mo1480() > i2;
        }
        if (interfaceC0689.mo1483() < i) {
            return true;
        }
        return interfaceC0689.mo1483() == i && interfaceC0689.mo1480() < i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final boolean m1515(InterfaceC0689 interfaceC0689, int i) {
        return i <= interfaceC0689.mo1482() && interfaceC0689.mo1483() <= i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final InterfaceC2129 m1516(C0742 c0742, C0541 c0541, Orientation orientation) {
        return new C0725(c0742, c0541, orientation);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final int m1517(int i, C0762 c0762, Object obj) {
        int iM1465;
        return (obj == null || c0762.m1561() == 0 || (i < c0762.m1561() && obj.equals(c0762.m1560(i))) || (iM1465 = c0762.f2225.m1465(obj)) == -1) ? i : iM1465;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Object m1518(int i) {
        Object objInvoke;
        C0720 c0720M1466 = ((C0760) this).f2223.m1466(i);
        int i2 = i - c0720M1466.f2028;
        InterfaceC6557 interfaceC6557 = (InterfaceC6557) c0720M1466.f2026.f319;
        return (interfaceC6557 == null || (objInvoke = interfaceC6557.invoke(Integer.valueOf(i2))) == null) ? new DefaultLazyKey(i) : objInvoke;
    }
}
