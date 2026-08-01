package androidx.compose.foundation.gestures;

import androidx.appcompat.app.C0954;
import androidx.appcompat.widget.C0984;
import androidx.collection.C1102;
import androidx.compose.foundation.C1863;
import androidx.compose.foundation.InterfaceC1864;
import androidx.compose.foundation.InterfaceC1922;
import androidx.compose.foundation.interaction.C1410;
import androidx.compose.foundation.interaction.C1411;
import androidx.compose.foundation.interaction.C1412;
import androidx.compose.foundation.interaction.C1414;
import androidx.compose.foundation.interaction.InterfaceC1421;
import androidx.compose.p001ui.input.pointer.AbstractC2481;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2623;
import androidx.compose.p001ui.node.InterfaceC2618;
import androidx.compose.p001ui.node.InterfaceC2631;
import androidx.compose.p001ui.platform.AbstractC2737;
import androidx.compose.p001ui.platform.InterfaceC2698;
import com.alibaba.fastjson2.AbstractC3738;
import com.alibaba.fastjson2.C3776;
import io.ktor.util.C5043;
import java.util.ArrayList;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5179;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.channels.AbstractC6037;
import kotlinx.coroutines.channels.C6022;
import kotlinx.coroutines.channels.InterfaceC6039;
import p050.AbstractC7173;
import p123.C8141;
import p123.C8143;
import p126.C8150;
import p126.C8151;
import p126.InterfaceC8149;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1304 extends AbstractC2623 implements InterfaceC2631, InterfaceC8149, InterfaceC2618, InterfaceC1864 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public long f1753;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public C1342 f1754;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public C1325 f1755;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public C1324 f1756;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public C6686 f1757;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public AbstractC1362 f1758;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public C1314 f1759;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public C1323 f1760;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public C1411 f1761;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C6022 f1762;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public boolean f1763;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public boolean f1764;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public C1863 f1765;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public InterfaceC1421 f1766;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f1767;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C1361 f1768;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public Orientation f1769;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public long f1770;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public C1387 f1771;

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    public static void m1777(C1358 c1358, C2478 c2478, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        C1324 c1324 = c1358.f1756;
        if (c1324 == null) {
            c1324 = new C1324();
            c1324.f1797 = null;
            c1324.f1796 = Long.MAX_VALUE;
            c1324.f1795 = false;
            c1358.f1756 = c1324;
        }
        c1324.f1797 = c2478;
        c1324.f1796 = j;
        C1342 c1342 = c1358.f1754;
        Orientation orientation = c1358.f1769;
        if (c1342 == null) {
            c1358.f1754 = new C1342(orientation, 2);
        } else {
            c1342.f1831 = orientation;
            c1342.f1830 = j2;
        }
        c1324.f1795 = false;
        c1358.f1758 = c1324;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1778(AbstractC1304 abstractC1304, C1320 c1320, ContinuationImpl continuationImpl) {
        DragGestureNode$processDragStart$1 dragGestureNode$processDragStart$1;
        InterfaceC1421 interfaceC1421;
        C1411 c1411;
        C1320 c13202;
        C1411 c14112;
        abstractC1304.getClass();
        if (continuationImpl instanceof DragGestureNode$processDragStart$1) {
            dragGestureNode$processDragStart$1 = (DragGestureNode$processDragStart$1) continuationImpl;
            int i = dragGestureNode$processDragStart$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dragGestureNode$processDragStart$1.label = i - Integer.MIN_VALUE;
            } else {
                dragGestureNode$processDragStart$1 = new DragGestureNode$processDragStart$1(abstractC1304, continuationImpl);
            }
        }
        Object obj = dragGestureNode$processDragStart$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dragGestureNode$processDragStart$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            C1411 c14113 = abstractC1304.f1761;
            if (c14113 != null && (interfaceC1421 = abstractC1304.f1766) != null) {
                C1412 c1412 = new C1412(c14113);
                dragGestureNode$processDragStart$1.L$0 = c1320;
                dragGestureNode$processDragStart$1.label = 1;
                if (((C1414) interfaceC1421).m1914(c1412, dragGestureNode$processDragStart$1) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            abstractC1304.f1761 = c1411;
            long j = c1320.f1790;
            return C6008.f15084;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c14112 = (C1411) dragGestureNode$processDragStart$1.L$1;
            c13202 = (C1320) dragGestureNode$processDragStart$1.L$0;
            AbstractC6017.m10769(obj);
            c1411 = c14112;
            c1320 = c13202;
            abstractC1304.f1761 = c1411;
            long j2 = c1320.f1790;
            return C6008.f15084;
        }
        c1320 = (C1320) dragGestureNode$processDragStart$1.L$0;
        AbstractC6017.m10769(obj);
        c1411 = new C1411();
        InterfaceC1421 interfaceC14212 = abstractC1304.f1766;
        if (interfaceC14212 != null) {
            dragGestureNode$processDragStart$1.L$0 = c1320;
            dragGestureNode$processDragStart$1.L$1 = c1411;
            dragGestureNode$processDragStart$1.label = 2;
            if (((C1414) interfaceC14212).m1914(c1411, dragGestureNode$processDragStart$1) != coroutineSingletons) {
                c13202 = c1320;
                c14112 = c1411;
                c1411 = c14112;
                c1320 = c13202;
            }
            return coroutineSingletons;
        }
        abstractC1304.f1761 = c1411;
        long j22 = c1320.f1790;
        return C6008.f15084;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1779(AbstractC1304 abstractC1304, ContinuationImpl continuationImpl) {
        DragGestureNode$processDragCancel$1 dragGestureNode$processDragCancel$1;
        abstractC1304.getClass();
        if (continuationImpl instanceof DragGestureNode$processDragCancel$1) {
            dragGestureNode$processDragCancel$1 = (DragGestureNode$processDragCancel$1) continuationImpl;
            int i = dragGestureNode$processDragCancel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dragGestureNode$processDragCancel$1.label = i - Integer.MIN_VALUE;
            } else {
                dragGestureNode$processDragCancel$1 = new DragGestureNode$processDragCancel$1(abstractC1304, continuationImpl);
            }
        }
        Object obj = dragGestureNode$processDragCancel$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dragGestureNode$processDragCancel$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            C1411 c1411 = abstractC1304.f1761;
            if (c1411 != null) {
                InterfaceC1421 interfaceC1421 = abstractC1304.f1766;
                if (interfaceC1421 != null) {
                    C1412 c1412 = new C1412(c1411);
                    dragGestureNode$processDragCancel$1.label = 1;
                    if (((C1414) interfaceC1421).m1914(c1412, dragGestureNode$processDragCancel$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            C1358 c1358 = (C1358) abstractC1304;
            AbstractC6231.m11036(c1358.f1871.m3551(), null, null, new ScrollableNode$onDragStopped$1(new C1311(0L, false), c1358, null), 3);
            return C6008.f15084;
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        abstractC1304.f1761 = null;
        C1358 c13582 = (C1358) abstractC1304;
        AbstractC6231.m11036(c13582.f1871.m3551(), null, null, new ScrollableNode$onDragStopped$1(new C1311(0L, false), c13582, null), 3);
        return C6008.f15084;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1780(AbstractC1304 abstractC1304, C1311 c1311, ContinuationImpl continuationImpl) {
        DragGestureNode$processDragStop$1 dragGestureNode$processDragStop$1;
        abstractC1304.getClass();
        if (continuationImpl instanceof DragGestureNode$processDragStop$1) {
            dragGestureNode$processDragStop$1 = (DragGestureNode$processDragStop$1) continuationImpl;
            int i = dragGestureNode$processDragStop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dragGestureNode$processDragStop$1.label = i - Integer.MIN_VALUE;
            } else {
                dragGestureNode$processDragStop$1 = new DragGestureNode$processDragStop$1(abstractC1304, continuationImpl);
            }
        }
        Object obj = dragGestureNode$processDragStop$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dragGestureNode$processDragStop$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            C1411 c1411 = abstractC1304.f1761;
            if (c1411 != null) {
                InterfaceC1421 interfaceC1421 = abstractC1304.f1766;
                if (interfaceC1421 != null) {
                    C1410 c1410 = new C1410(c1411);
                    dragGestureNode$processDragStop$1.L$0 = c1311;
                    dragGestureNode$processDragStop$1.label = 1;
                    if (((C1414) interfaceC1421).m1914(c1410, dragGestureNode$processDragStop$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            C1358 c1358 = (C1358) abstractC1304;
            AbstractC6231.m11036(c1358.f1871.m3551(), null, null, new ScrollableNode$onDragStopped$1(c1311, c1358, null), 3);
            return C6008.f15084;
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        c1311 = (C1311) dragGestureNode$processDragStop$1.L$0;
        AbstractC6017.m10769(obj);
        abstractC1304.f1761 = null;
        C1358 c13582 = (C1358) abstractC1304;
        AbstractC6231.m11036(c13582.f1871.m3551(), null, null, new ScrollableNode$onDragStopped$1(c1311, c13582, null), 3);
        return C6008.f15084;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    @Override // p126.InterfaceC8149
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1781(C0984 c0984, PointerEventPass pointerEventPass) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        EnumC0041xecab5e0c enumC0041xecab5e0c;
        int i = c0984.f941;
        ArrayList arrayList = (ArrayList) c0984.f940;
        if (this.f1765 == null) {
            C1863 c1863 = new C1863(this);
            m3924(c1863);
            this.f1765 = c1863;
        }
        if (this.f1767) {
            if (this.f1771 == null) {
                this.f1771 = new C1387(this);
            }
            C1387 c1387 = this.f1771;
            if (c1387 != null) {
                AbstractC1304 abstractC1304 = c1387.f1921;
                int i2 = 0;
                if (c1387.f1916 == null) {
                    C1405 c1405 = c1387.f1920;
                    if (c1405 == null) {
                        EnumC0041xecab5e0c enumC0041xecab5e0c2 = EnumC0041xecab5e0c.NotInitialized;
                        c1405 = new C1405();
                        c1405.f1961 = enumC0041xecab5e0c2;
                        c1405.f1960 = false;
                        c1387.f1920 = c1405;
                    }
                    c1387.f1916 = c1405;
                }
                AbstractC1362 abstractC1362 = c1387.f1916;
                if (abstractC1362 == null) {
                    C6755.m11869("currentDragState should not be null");
                    return;
                }
                boolean z = true;
                if (abstractC1362 instanceof C1405) {
                    C1405 c14052 = (C1405) abstractC1362;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        if (!AbstractC1362.m1867((C8150) arrayList.get(i3))) {
                            return;
                        }
                    }
                    C8150 c8150 = (C8150) AbstractC5176.m9379(arrayList);
                    if (AbstractC1388.f1928[c14052.f1961.ordinal()] == 1) {
                        C1343 c1343 = ((C1358) abstractC1304).f1868;
                        if (c1343.f1837.mo1810()) {
                            enumC0041xecab5e0c = EnumC0041xecab5e0c.f3No;
                        } else {
                            InterfaceC1922 interfaceC1922 = c1343.f1836;
                            if (!(interfaceC1922 != null ? interfaceC1922.mo2516() : false)) {
                                enumC0041xecab5e0c = EnumC0041xecab5e0c.Yes;
                            }
                        }
                    } else {
                        enumC0041xecab5e0c = c14052.f1961;
                    }
                    c14052.f1961 = enumC0041xecab5e0c;
                    if (pointerEventPass == PointerEventPass.Initial && enumC0041xecab5e0c == EnumC0041xecab5e0c.f3No) {
                        c8150.f19868 = true;
                        c14052.f1960 = true;
                    }
                    if (pointerEventPass == PointerEventPass.Main) {
                        if (enumC0041xecab5e0c == EnumC0041xecab5e0c.Yes) {
                            C1387.m1885(c1387, c8150, c8150.f19865, 0L, 12);
                            return;
                        }
                        if (c14052.f1960) {
                            c1387.m1886(c8150, c8150, new C8151(i), 0L);
                            c1387.m1887(c8150, new C8151(i), 0L);
                            long j = c8150.f19865;
                            C1404 c1404 = c1387.f1919;
                            if (c1404 == null) {
                                c1404 = new C1404();
                                c1404.f1959 = Long.MAX_VALUE;
                                c1387.f1919 = c1404;
                            }
                            c1404.f1959 = j;
                            c1387.f1916 = c1404;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!(abstractC1362 instanceof C1403)) {
                    if (abstractC1362 instanceof C1406) {
                        C1406 c1406 = (C1406) abstractC1362;
                        if (pointerEventPass != PointerEventPass.Final) {
                            return;
                        }
                        int size2 = arrayList.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size2) {
                                break;
                            }
                            if (((C8150) arrayList.get(i4)).f19868) {
                                z = false;
                                break;
                            }
                            i4++;
                        }
                        int size3 = arrayList.size();
                        while (true) {
                            if (i2 >= size3) {
                                break;
                            }
                            if (!((C8150) arrayList.get(i2)).f19862) {
                                i2++;
                            } else if (!arrayList.isEmpty()) {
                                if (z) {
                                    long jM1865 = AbstractC1362.m1865((C8150) AbstractC5176.m9379(arrayList), abstractC1304.f1769, new C8151(i));
                                    C8150 c81502 = c1406.f1963;
                                    c81502.getClass();
                                    long jM13085 = C8158.m13085(jM1865, AbstractC1362.m1865(c81502, abstractC1304.f1769, new C8151(i)));
                                    C8150 c81503 = c1406.f1963;
                                    if (c81503 != null) {
                                        C1387.m1885(c1387, c81503, c1406.f1962, jM13085, 8);
                                        return;
                                    } else {
                                        C6755.m11869("AwaitGesturePickup.initialDown was not initialized.");
                                        return;
                                    }
                                }
                                return;
                            }
                        }
                        c1387.m1890();
                        return;
                    }
                    if (!(abstractC1362 instanceof C1404)) {
                        C5043.m9170();
                        return;
                    }
                    C1404 c14042 = (C1404) abstractC1362;
                    if (pointerEventPass != PointerEventPass.Main) {
                        return;
                    }
                    long j2 = c14042.f1959;
                    int size4 = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size4) {
                            obj = null;
                            break;
                        }
                        obj = arrayList.get(i5);
                        if (AbstractC2481.m3586(((C8150) obj).f19865, j2)) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                    C8150 c81504 = (C8150) obj;
                    if (c81504 == null) {
                        return;
                    }
                    boolean zM1861 = AbstractC1362.m1861(c81504);
                    C1322 c1322 = C1322.f1793;
                    if (!zM1861) {
                        if (c81504.f19868) {
                            abstractC1304.m1787(c1322);
                            return;
                        } else {
                            if (C8158.m13086(AbstractC1362.m1868(c81504, abstractC1304.f1769, new C8151(i), true)) == 0.0f) {
                                return;
                            }
                            c1387.m1887(c81504, new C8151(i), AbstractC1362.m1868(c81504, abstractC1304.f1769, new C8151(i), false));
                            c81504.f19868 = true;
                            return;
                        }
                    }
                    int size5 = arrayList.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size5) {
                            obj2 = null;
                            break;
                        }
                        obj2 = arrayList.get(i6);
                        if (((C8150) obj2).f19862) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    C8150 c81505 = (C8150) obj2;
                    if (c81505 != null) {
                        c14042.f1959 = c81505.f19865;
                        return;
                    }
                    if (c81504.f19868 || !AbstractC1362.m1861(c81504)) {
                        abstractC1304.m1787(c1322);
                    } else {
                        AbstractC1362.m1862(c1387.m1888(), c81504, abstractC1304.f1769, new C8151(i), c1387.f1927, c1387.f1925);
                        float fMo4014 = ((InterfaceC2698) AbstractC2620.m3916(abstractC1304, AbstractC2737.f5921)).mo4014();
                        long jM11818 = c1387.m1888().m11818(AbstractC3738.m6871(fMo4014, fMo4014));
                        C3776 c3776 = (C3776) c1387.m1888().f16359;
                        C8141 c8141 = (C8141) c3776.f9664;
                        C8143[] c8143Arr = c8141.f19842;
                        AbstractC5179.m9393(0, c8143Arr.length, null, c8143Arr);
                        c8141.f19841 = 0;
                        C8141 c81412 = (C8141) c3776.f9663;
                        C8143[] c8143Arr2 = c81412.f19842;
                        AbstractC5179.m9393(0, c8143Arr2.length, null, c8143Arr2);
                        c81412.f19841 = 0;
                        c3776.f9665 = 0L;
                        abstractC1304.m1787(new C1311(AbstractC1303.m1776(jM11818), true));
                    }
                    c1387.m1890();
                    return;
                }
                C1403 c1403 = (C1403) abstractC1362;
                if (pointerEventPass == PointerEventPass.Initial) {
                    return;
                }
                int size6 = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj3 = null;
                        break;
                    }
                    obj3 = arrayList.get(i7);
                    int i8 = i7;
                    if (AbstractC2481.m3586(((C8150) obj3).f19865, c1403.f1957)) {
                        break;
                    } else {
                        i7 = i8 + 1;
                    }
                }
                C8150 c81506 = (C8150) obj3;
                if (c81506 == null) {
                    int size7 = arrayList.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size7) {
                            obj5 = null;
                            break;
                        }
                        obj5 = arrayList.get(i9);
                        if (((C8150) obj5).f19862) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                    c81506 = (C8150) obj5;
                    if (c81506 == null) {
                        c1387.m1890();
                        return;
                    }
                    c1403.f1957 = c81506.f19865;
                }
                if (pointerEventPass == PointerEventPass.Main) {
                    if (c81506.f19868) {
                        C8150 c81507 = c1403.f1958;
                        if (c81507 == null) {
                            C6755.m11869("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        long j3 = c1403.f1957;
                        C1342 c1342 = c1387.f1926;
                        if (c1342 == null) {
                            C6755.m11869("AwaitTouchSlop.touchSlopDetector was not initialized");
                            return;
                        }
                        c1387.m1889(c81507, j3, c1342);
                    } else if (AbstractC1362.m1861(c81506)) {
                        int size8 = arrayList.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size8) {
                                obj4 = null;
                                break;
                            }
                            Object obj6 = arrayList.get(i10);
                            if (((C8150) obj6).f19862) {
                                obj4 = obj6;
                                break;
                            }
                            i10++;
                        }
                        C8150 c81508 = (C8150) obj4;
                        if (c81508 == null) {
                            c1387.m1890();
                        } else {
                            c1403.f1957 = c81508.f19865;
                        }
                    } else {
                        InterfaceC2698 interfaceC2698 = (InterfaceC2698) AbstractC2620.m3916(abstractC1304, AbstractC2737.f5921);
                        float f = AbstractC1309.f1775;
                        float fMo3838 = interfaceC2698.mo3838();
                        C1342 c13422 = c1387.f1926;
                        if (c13422 == null) {
                            C6755.m11869("Touch slop detector not initialized.");
                            return;
                        }
                        long jM1821 = c13422.m1821(fMo3838, AbstractC1362.m1868(c81506, abstractC1304.f1769, new C8151(i), true), true);
                        if ((9223372034707292159L & jM1821) != 9205357640488583168L) {
                            c81506.f19868 = true;
                            C8150 c81509 = c1403.f1958;
                            c81509.getClass();
                            C8150 c815010 = c81506;
                            c1387.m1886(c81509, c815010, new C8151(i), jM1821);
                            c81506 = c815010;
                            c1387.m1887(c81506, new C8151(i), jM1821);
                            long j4 = c81506.f19865;
                            C1404 c14043 = c1387.f1919;
                            if (c14043 == null) {
                                c14043 = new C1404();
                                c14043.f1959 = Long.MAX_VALUE;
                                c1387.f1919 = c14043;
                            }
                            c14043.f1959 = j4;
                            c1387.f1916 = c14043;
                        } else {
                            c1403.f1956 = true;
                        }
                    }
                }
                if (pointerEventPass == PointerEventPass.Final && c1403.f1956) {
                    if (!c81506.f19868) {
                        c1403.f1956 = false;
                        return;
                    }
                    C8150 c815011 = c1403.f1958;
                    if (c815011 == null) {
                        C6755.m11869("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j5 = c1403.f1957;
                    C1342 c13423 = c1387.f1926;
                    if (c13423 != null) {
                        c1387.m1889(c815011, j5, c13423);
                    } else {
                        C6755.m11869("AwaitTouchSlop.touchSlopDetector was not initialized");
                    }
                }
            }
        }
    }

    @Override // androidx.compose.foundation.InterfaceC1864
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final boolean mo1782(C2478 c2478) {
        if (AbstractC2481.m3589(c2478)) {
            return this.f1767;
        }
        if (!AbstractC2481.m3587(c2478)) {
            if (this.f1754 == null) {
                this.f1754 = new C1342(this.f1769, 2);
            }
            float fMo3838 = ((InterfaceC2698) AbstractC2620.m3916(this, AbstractC2737.f5921)).mo3838();
            long jM3591 = AbstractC2481.m3591(c2478, false);
            C1342 c1342 = this.f1754;
            if (c1342 == null) {
                C6755.m11869("Touch slop detector not initialized.");
                return false;
            }
            if (!C8158.m13087(c1342.m1821(fMo3838, jM3591, false), 9205357640488583168L)) {
                long jM13084 = C8158.m13084(c1342.f1830, jM3591);
                double dAtan2 = ((double) (((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (jM13084 & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (jM13084 >> 32))))) * 180.0f)) / 3.141592653589793d;
                Orientation orientation = c1342.f1831;
                int i = orientation == null ? -1 : AbstractC1341.f1829[orientation.ordinal()];
                if (i == 1 ? dAtan2 < 30.0d : !(i != 2 || dAtan2 <= 30.0d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.foundation.InterfaceC1864
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final boolean mo1783(C8150 c8150) {
        return AbstractC1362.m1867(c8150) && this.f1767;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2631
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void mo1784() {
        if (this.f1763) {
            m1790();
            if (this.f1764) {
                m1789().mo8995(C1322.f1793);
            }
            this.f1757 = null;
        }
        this.f1763 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
    public final void m1785(long j, C2478 c2478) {
        long jMo3644 = AbstractC2620.m3909(this.f6637).mo3644(0L);
        if (!C8158.m13087(this.f1753, 9205357640488583168L) && !C8158.m13087(jMo3644, this.f1753)) {
            this.f1770 = C8158.m13084(this.f1770, C8158.m13085(jMo3644, this.f1753));
        }
        this.f1753 = jMo3644;
        AbstractC7173.m12432(m1788(), c2478, this.f1770);
        m1789().mo8995(new C1321(j, false));
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
    public final void m1786(C2478 c2478, C2478 c24782, long j) {
        if (this.f1757 == null) {
            this.f1757 = new C6686(11);
        }
        AbstractC7173.m12432(m1788(), c2478, 0L);
        long jM13085 = C8158.m13085(c24782.f5152, j);
        this.f1770 = 0L;
        C1361 c1361 = this.f1768;
        int i = c2478.f5164;
        c1361.getClass();
        if (i == 2) {
            return;
        }
        if (!this.f1764) {
            if (this.f1762 == null) {
                this.f1762 = AbstractC6037.m10841(Integer.MAX_VALUE, 6, null);
            }
            m1793();
        }
        this.f1753 = AbstractC2620.m3909(this).mo3644(0L);
        m1789().mo8995(new C1320(jM13085));
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public final void m1787(AbstractC1310 abstractC1310) {
        if ((abstractC1310 instanceof C1320) && !this.f1764) {
            this.f1764 = true;
            m1793();
        }
        m1789().mo8995(abstractC1310);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public final C6686 m1788() {
        C6686 c6686 = this.f1757;
        if (c6686 != null) {
            return c6686;
        }
        C6755.m11869("Velocity Tracker not initialized.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    public final InterfaceC6039 m1789() {
        C6022 c6022 = this.f1762;
        if (c6022 != null) {
            return c6022;
        }
        C6755.m11869("Events channel not initialized.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public final void m1790() {
        C1314 c1314 = this.f1759;
        if (c1314 == null) {
            DragDetectionState$AwaitDown$AwaitTouchSlop dragDetectionState$AwaitDown$AwaitTouchSlop = DragDetectionState$AwaitDown$AwaitTouchSlop.NotInitialized;
            c1314 = new C1314();
            c1314.f1782 = dragDetectionState$AwaitDown$AwaitTouchSlop;
            c1314.f1781 = false;
            this.f1759 = c1314;
        }
        c1314.f1782 = DragDetectionState$AwaitDown$AwaitTouchSlop.NotInitialized;
        c1314.f1781 = false;
        this.f1758 = c1314;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public final void m1791(C2478 c2478, long j, C1342 c1342) {
        C1325 c1325 = this.f1755;
        if (c1325 == null) {
            c1325 = new C1325();
            c1325.f1799 = null;
            c1325.f1798 = Long.MAX_VALUE;
            this.f1755 = c1325;
        }
        c1325.f1799 = c2478;
        c1325.f1798 = j;
        c1342.f1830 = 0L;
        this.f1758 = c1325;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public final void m1792() {
        C1411 c1411 = this.f1761;
        if (c1411 != null) {
            InterfaceC1421 interfaceC1421 = this.f1766;
            if (interfaceC1421 != null) {
                ((C1414) interfaceC1421).m1913(new C1412(c1411));
            }
            this.f1761 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
    public final void m1793() {
        this.f1764 = true;
        if (this.f1762 == null) {
            this.f1762 = AbstractC6037.m10841(Integer.MAX_VALUE, 6, null);
        }
        AbstractC6231.m11036(m4427(), null, null, new DragGestureNode$startListeningForEvents$1(this, null), 3);
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1686() {
        this.f1764 = false;
        m1792();
        this.f1770 = 0L;
        C1863 c1863 = this.f1765;
        if (c1863 != null) {
            m3928(c1863);
        }
        this.f1765 = null;
    }

    @Override // p126.InterfaceC8149
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final void mo1794() {
        C1387 c1387 = this.f1771;
        if (c1387 != null) {
            c1387.m1890();
            AbstractC1304 abstractC1304 = c1387.f1921;
            if (abstractC1304.f1764) {
                abstractC1304.m1787(C1322.f1793);
            }
            c1387.f1923 = null;
            C0954 c0954 = c1387.f1924;
            c0954.f659 = 0;
            ((C1102) c0954.f660).f1275 = 0;
        }
    }
}
