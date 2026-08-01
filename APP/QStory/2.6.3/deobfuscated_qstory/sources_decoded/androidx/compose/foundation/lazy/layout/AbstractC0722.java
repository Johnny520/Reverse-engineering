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
import kotlin.C5176;
import kotlin.reflect.InterfaceC5097;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import p052.InterfaceC6543;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p088.C7167;
import p116.AbstractC7347;
import p116.AbstractC7348;
import p116.C7339;
import p116.InterfaceC7340;
import p116.InterfaceC7345;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0722 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0707 f2031 = new C0707(1);

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
    public static final java.lang.Object m1516(androidx.compose.foundation.lazy.layout.InterfaceC0689 r28, int r29, int r30, int r31, p205.InterfaceC7896 r32, kotlin.coroutines.jvm.internal.ContinuationImpl r33) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.AbstractC0722.m1516(androidx.compose.foundation.lazy.layout.飘花落叶言子世哲苏楪兰, int, int, int, 飘花落叶言子苏哲世楪兰.飘花落叶言子楪世哲苏兰, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int m1517(int i, C1224 c1224) {
        int i2 = c1224.f3520 - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = c1224.f3521;
            int i5 = ((C0720) objArr[i4]).f2029;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((C0720) objArr[i3]).f2029) {
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
    public static final void m1518(C0762 c0762, Object obj, int i, Object obj2, InterfaceC1373 interfaceC1373, int i2) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(1439843069);
        int i3 = (c1324.m2360(c0762) ? 4 : 2) | i2 | (c1324.m2360(obj) ? 32 : 16) | (c1324.m2362(i) ? 256 : 128) | (c1324.m2360(obj2) ? 2048 : 1024);
        if (c1324.m2343(i3 & 1, (i3 & 1171) != 1170)) {
            ((InterfaceC7340) obj).mo1482(obj2, AbstractC1254.m2189(980966366, new C0765(i, c0762, obj2), c1324), c1324, 48);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C0695(c0762, obj, i, obj2, i2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m1519(final C1242 c1242, InterfaceC1373 interfaceC1373, final int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(-709502251);
        int i2 = 2;
        if (c1324.m2343(i & 1, (i & 3) != 2)) {
            C1334 c1334 = AbstractC7348.f19574;
            InterfaceC7345 interfaceC7345 = (InterfaceC7345) c1324.m2383(c1334);
            c1324.m2392(1967007413);
            Object[] objArr = new Object[0];
            Object objM2345 = c1324.m2345();
            C1353 c1353 = C1369.f3974;
            if (objM2345 == c1353) {
                objM2345 = new C7167(6);
                c1324.m2386(objM2345);
            }
            C7339 c7339 = (C7339) AbstractC7347.m12538(objArr, C7339.f19550, (InterfaceC6543) objM2345, c1324, 384);
            c7339.f19553 = (InterfaceC7345) c1324.m2383(c1334);
            c1324.m2377(false);
            Object[] objArr2 = {interfaceC7345};
            C4871 c4871 = new C4871(new C0753(i2), 13, new C0002(interfaceC7345, 12, c7339));
            boolean zM2378 = c1324.m2378(interfaceC7345) | c1324.m2378(c7339);
            Object objM23452 = c1324.m2345();
            int i3 = 3;
            if (zM2378 || objM23452 == c1353) {
                objM23452 = new C0004(interfaceC7345, i3, c7339);
                c1324.m2386(objM23452);
            }
            C0683 c0683 = (C0683) AbstractC7347.m12538(objArr2, c4871, (InterfaceC6543) objM23452, c1324, 0);
            AbstractC1367.m2487(c1334.mo2428(c0683), AbstractC1254.m2189(-412824043, new C1060(c1242, i3, c0683), c1324), c1324, 56);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new InterfaceC6554(i) { // from class: androidx.compose.foundation.lazy.layout.飘花落叶言子世兰苏哲楪
                @Override // p052.InterfaceC6554
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM2471 = AbstractC1367.m2471(7);
                    AbstractC0722.m1519(this.f1907, (InterfaceC1373) obj, iM2471);
                    return C5176.f14739;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m1520(final Object obj, final int i, final C0699 c0699, final C1242 c1242, InterfaceC1373 interfaceC1373, final int i2) {
        int i3;
        C0701 c0701;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(872548579);
        if ((i2 & 6) == 0) {
            i3 = (c1324.m2378(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c1324.m2362(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c1324.m2378(c0699) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= c1324.m2378(c1242) ? 2048 : 1024;
        }
        if (c1324.m2343(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zM2360 = c1324.m2360(obj) | c1324.m2360(c0699);
            Object objM2345 = c1324.m2345();
            C1353 c1353 = C1369.f3974;
            if (zM2360 || objM2345 == c1353) {
                objM2345 = new C0701(obj, c0699);
                c1324.m2386(objM2345);
            }
            C0701 c07012 = (C0701) objM2345;
            c07012.f1974 = i;
            InterfaceC1395 interfaceC1395 = c07012.f1977;
            C1358 c1358 = AbstractC1709.f4981;
            InterfaceC1710 interfaceC1710 = (InterfaceC1710) c1324.m2383(c1358);
            AbstractC1286 abstractC1286M2231 = AbstractC1274.m2231();
            InterfaceC6558 interfaceC6558Mo2203 = abstractC1286M2231 != null ? abstractC1286M2231.mo2203() : null;
            AbstractC1286 abstractC1286M2243 = AbstractC1274.m2243(abstractC1286M2231);
            try {
                if (interfaceC1710 != ((InterfaceC1710) ((AbstractC1347) interfaceC1395).getValue())) {
                    ((AbstractC1347) interfaceC1395).setValue(interfaceC1710);
                    if (c07012.f1973 > 0) {
                        C0701 c07013 = c07012.f1972;
                        if (c07013 != null) {
                            c07013.m1499();
                        }
                        if (interfaceC1710 != null) {
                            c0701 = (C0701) interfaceC1710;
                            c0701.m1500();
                        } else {
                            c0701 = null;
                        }
                        c07012.f1972 = c0701;
                    }
                }
                AbstractC1274.m2237(abstractC1286M2231, abstractC1286M2243, interfaceC6558Mo2203);
                boolean zM23602 = c1324.m2360(c07012);
                Object objM23452 = c1324.m2345();
                if (zM23602 || objM23452 == c1353) {
                    objM23452 = new C0723(c07012, 2);
                    c1324.m2386(objM23452);
                }
                AbstractC1367.m2484(c07012, (InterfaceC6558) objM23452, c1324);
                AbstractC1367.m2487(c1358.mo2428(c07012), c1242, c1324, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                AbstractC1274.m2237(abstractC1286M2231, abstractC1286M2243, interfaceC6558Mo2203);
                throw th;
            }
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new InterfaceC6554() { // from class: androidx.compose.foundation.lazy.layout.飘花落叶言子世苏楪兰哲
                @Override // p052.InterfaceC6554
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    AbstractC0722.m1520(obj, i, c0699, c1242, (InterfaceC1373) obj2, AbstractC1367.m2471(i2 | 1));
                    return C5176.f14739;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m1521(final InterfaceC6543 interfaceC6543, final InterfaceC2129 interfaceC2129, final C0696 c0696, final C0758 c0758, InterfaceC1373 interfaceC1373, final int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(1055276397);
        int i2 = (c1324.m2378(interfaceC6543) ? 4 : 2) | i | (c1324.m2360(interfaceC2129) ? 32 : 16) | (c1324.m2360(c0696) ? 256 : 128) | (c1324.m2360(c0758) ? 2048 : 1024);
        if (c1324.m2343(i2 & 1, (i2 & 1171) != 1170)) {
            final InterfaceC1395 interfaceC1395M2479 = AbstractC1367.m2479(interfaceC6543, c1324);
            m1519(AbstractC1254.m2189(-933153643, new InterfaceC6551() { // from class: androidx.compose.foundation.lazy.layout.飘花落叶言子世楪苏兰哲
                @Override // p052.InterfaceC6551
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    InterfaceC2129 interfaceC2129Mo3866;
                    InterfaceC7340 interfaceC7340 = (InterfaceC7340) obj;
                    ((Integer) obj3).getClass();
                    C1324 c13242 = (C1324) ((InterfaceC1373) obj2);
                    Object objM2345 = c13242.m2345();
                    C1353 c1353 = C1369.f3974;
                    if (objM2345 == c1353) {
                        objM2345 = new C0711(interfaceC7340, new C0685(interfaceC1395M2479, 3));
                        c13242.m2386(objM2345);
                    }
                    final C0711 c0711 = (C0711) objM2345;
                    Object objM23452 = c13242.m2345();
                    if (objM23452 == c1353) {
                        objM23452 = new C1719(new C0076(c0711));
                        c13242.m2386(objM23452);
                    }
                    final C1719 c1719 = (C1719) objM23452;
                    final C0696 c06962 = c0696;
                    if (c06962 != null) {
                        c13242.m2392(1743490539);
                        c13242.m2392(887527095);
                        final InterfaceC0735 interfaceC0735 = AbstractC0733.f2068;
                        if (interfaceC0735 != null) {
                            c13242.m2392(1345554384);
                        } else {
                            c13242.m2392(1345603457);
                            View view = (View) c13242.m2383(AbstractC1835.f5332);
                            boolean zM2360 = c13242.m2360(view);
                            Object objM23453 = c13242.m2345();
                            if (zM2360 || objM23453 == c1353) {
                                Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                                objM23453 = tag instanceof InterfaceC0735 ? (InterfaceC0735) tag : null;
                                if (objM23453 == null) {
                                    objM23453 = new ViewOnAttachStateChangeListenerC0706(view);
                                    view.setTag(R.id.compose_prefetch_scheduler, objM23453);
                                }
                                c13242.m2386(objM23453);
                            }
                            interfaceC0735 = (InterfaceC0735) objM23453;
                        }
                        c13242.m2377(false);
                        c13242.m2377(false);
                        Object[] objArr = {c06962, c0711, c1719, interfaceC0735};
                        boolean zM23602 = c13242.m2360(c06962) | c13242.m2378(c0711) | c13242.m2378(c1719) | c13242.m2378(interfaceC0735);
                        Object objM23454 = c13242.m2345();
                        if (zM23602 || objM23454 == c1353) {
                            objM23454 = new InterfaceC6558() { // from class: androidx.compose.foundation.lazy.layout.飘花落叶言子世楪哲兰苏
                                @Override // p052.InterfaceC6558
                                public final Object invoke(Object obj4) {
                                    C0734 c0734 = new C0734(c0711, c1719, interfaceC0735);
                                    C0696 c06963 = c06962;
                                    c06963.f1959 = c0734;
                                    return new C0713(c06963, 1);
                                }
                            };
                            c13242.m2386(objM23454);
                        }
                        InterfaceC6558 interfaceC6558 = (InterfaceC6558) objM23454;
                        boolean zM23603 = false;
                        for (Object obj4 : Arrays.copyOf(objArr, 4)) {
                            zM23603 |= c13242.m2360(obj4);
                        }
                        Object objM23455 = c13242.m2345();
                        if (zM23603 || objM23455 == c1353) {
                            c13242.m2386(new C1359(interfaceC6558));
                        }
                        c13242.m2377(false);
                    } else {
                        c13242.m2392(1744076749);
                        c13242.m2377(false);
                    }
                    int i3 = AbstractC0687.f1919;
                    InterfaceC2129 interfaceC21292 = interfaceC2129;
                    if (c06962 != null && (interfaceC2129Mo3866 = interfaceC21292.mo3866(new C0727(c06962))) != null) {
                        interfaceC21292 = interfaceC2129Mo3866;
                    }
                    boolean zM23604 = c13242.m2360(c0711);
                    C0758 c07582 = c0758;
                    boolean zM23605 = zM23604 | c13242.m2360(c07582);
                    Object objM23456 = c13242.m2345();
                    if (zM23605 || objM23456 == c1353) {
                        objM23456 = new C1060(c0711, 2, c07582);
                        c13242.m2386(objM23456);
                    }
                    AbstractC1670.m3103(c1719, interfaceC21292, (InterfaceC6554) objM23456, c13242, 8, 0);
                    return C5176.f14739;
                }
            }, c1324), c1324, 6);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new InterfaceC6554(interfaceC2129, c0696, c0758, i) { // from class: androidx.compose.foundation.lazy.layout.飘花落叶言子世楪哲苏兰

                /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
                public final /* synthetic */ C0758 f1943;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC2129 f1944;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                public final /* synthetic */ C0696 f1945;

                @Override // p052.InterfaceC6554
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM2471 = AbstractC1367.m2471(1);
                    AbstractC0722.m1521(this.f1946, this.f1944, this.f1945, this.f1943, (InterfaceC1373) obj, iM2471);
                    return C5176.f14739;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final InterfaceC2129 m1522(InterfaceC2129 interfaceC2129, InterfaceC5097 interfaceC5097, C0743 c0743, Orientation orientation, boolean z) {
        return interfaceC2129.mo3866(new C0684(interfaceC5097, c0743, orientation, z));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static InterfaceC1395 m1523() {
        return AbstractC1367.m2475(C5176.f14739, C1353.f3920);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final boolean m1524(boolean z, InterfaceC0689 interfaceC0689, int i, int i2) {
        if (z) {
            if (interfaceC0689.mo1493() > i) {
                return true;
            }
            return interfaceC0689.mo1493() == i && interfaceC0689.mo1490() > i2;
        }
        if (interfaceC0689.mo1493() < i) {
            return true;
        }
        return interfaceC0689.mo1493() == i && interfaceC0689.mo1490() < i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final boolean m1525(InterfaceC0689 interfaceC0689, int i) {
        return i <= interfaceC0689.mo1492() && interfaceC0689.mo1493() <= i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final InterfaceC2129 m1526(C0742 c0742, C0541 c0541, Orientation orientation) {
        return new C0725(c0742, c0541, orientation);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final int m1527(int i, C0762 c0762, Object obj) {
        int iM1475;
        return (obj == null || c0762.m1571() == 0 || (i < c0762.m1571() && obj.equals(c0762.m1570(i))) || (iM1475 = c0762.f2226.m1475(obj)) == -1) ? i : iM1475;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Object m1528(int i) {
        Object objInvoke;
        C0720 c0720M1476 = ((C0760) this).f2224.m1476(i);
        int i2 = i - c0720M1476.f2029;
        InterfaceC6558 interfaceC6558 = (InterfaceC6558) c0720M1476.f2027.f319;
        return (interfaceC6558 == null || (objInvoke = interfaceC6558.invoke(Integer.valueOf(i2))) == null) ? new DefaultLazyKey(i) : objInvoke;
    }
}
