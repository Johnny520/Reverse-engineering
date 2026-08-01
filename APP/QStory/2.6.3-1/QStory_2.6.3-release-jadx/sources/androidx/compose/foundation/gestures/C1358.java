package androidx.compose.foundation.gestures;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.appcompat.app.C0954;
import androidx.appcompat.app.C0960;
import androidx.collection.C1102;
import androidx.compose.animation.core.C1179;
import androidx.compose.foundation.C1863;
import androidx.compose.foundation.InterfaceC1864;
import androidx.compose.foundation.InterfaceC1922;
import androidx.compose.foundation.interaction.InterfaceC1421;
import androidx.compose.foundation.relocation.C1611;
import androidx.compose.p001ui.focus.C2287;
import androidx.compose.p001ui.input.nestedscroll.C2451;
import androidx.compose.p001ui.input.nestedscroll.C2454;
import androidx.compose.p001ui.input.pointer.AbstractC2481;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.InterfaceC2596;
import androidx.compose.p001ui.node.InterfaceC2599;
import androidx.compose.p001ui.platform.AbstractC2737;
import androidx.compose.p001ui.platform.InterfaceC2698;
import androidx.compose.p001ui.semantics.AbstractC2781;
import androidx.compose.p001ui.semantics.AbstractC2794;
import androidx.compose.p001ui.semantics.C2776;
import androidx.compose.p001ui.semantics.InterfaceC2779;
import com.alibaba.fastjson2.AbstractC3738;
import com.alibaba.fastjson2.C3776;
import io.ktor.util.C5043;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.InterfaceC5920;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import p050.AbstractC7173;
import p068.InterfaceC7383;
import p122.AbstractC8137;
import p122.AbstractC8140;
import p122.InterfaceC8136;
import p123.C8141;
import p123.C8143;
import p128.C8158;
import p221.InterfaceC8725;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1358 extends AbstractC1304 implements InterfaceC8136, InterfaceC2596 {

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public InterfaceC7383 f1863;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public C1391 f1864;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final C1365 f1865;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final C2287 f1866;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final C1335 f1867;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final C1343 f1868;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public C1395 f1869;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public C1345 f1870;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final C2454 f1871;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final C1367 f1872;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public InterfaceC1922 f1873;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public InterfaceC1401 f1874;

    public C1358(InterfaceC1922 interfaceC1922, InterfaceC1401 interfaceC1401, Orientation orientation, InterfaceC1354 interfaceC1354, InterfaceC1421 interfaceC1421, boolean z, boolean z2) {
        C1361 c1361 = AbstractC1339.f1825;
        this.f1769 = orientation;
        this.f1768 = c1361;
        this.f1767 = z;
        this.f1766 = interfaceC1421;
        this.f1753 = 9205357640488583168L;
        this.f1770 = 0L;
        this.f1873 = interfaceC1922;
        this.f1874 = interfaceC1401;
        C2454 c2454 = new C2454();
        this.f1871 = c2454;
        C1367 c1367 = new C1367(new C1179(new C0960(AbstractC1339.f1822)));
        this.f1872 = c1367;
        InterfaceC1922 interfaceC19222 = this.f1873;
        InterfaceC1401 interfaceC14012 = this.f1874;
        C1343 c1343 = new C1343(interfaceC1354, interfaceC19222, interfaceC14012 == null ? c1367 : interfaceC14012, orientation, z2, c2454, this, new C1336(this, 0));
        this.f1868 = c1343;
        C1335 c1335 = new C1335(c1343, z);
        this.f1867 = c1335;
        C2287 c2287 = new C2287(2, null, 10);
        m3924(c2287);
        this.f1866 = c2287;
        C1365 c1365 = new C1365(orientation, c1343, z2, new C1336(this, 1));
        m3924(c1365);
        this.f1865 = c1365;
        m3924(new C2451(c1335, c2454));
        C1611 c1611 = new C1611();
        c1611.f2586 = c1365;
        m3924(c1611);
    }

    @Override // p122.InterfaceC8136
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final boolean mo1850(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (!this.f1767 || ((!AbstractC8140.m13065(AbstractC8137.m13063(keyEvent), AbstractC8140.f19804) && !AbstractC8140.m13065(AbstractC8137.m13064(keyEvent.getKeyCode()), AbstractC8140.f19805)) || AbstractC8137.m13062(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.f1868.f1834 == Orientation.Vertical;
        C1365 c1365 = this.f1865;
        if (z) {
            int iM1880 = (int) (c1365.m1880() & 4294967295L);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(AbstractC8140.m13065(AbstractC8137.m13064(keyEvent.getKeyCode()), AbstractC8140.f19805) ? iM1880 : -iM1880)));
        } else {
            int iM18802 = (int) (c1365.m1880() >> 32);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(AbstractC8140.m13065(AbstractC8137.m13064(keyEvent.getKeyCode()), AbstractC8140.f19805) ? iM18802 : -iM18802)) << 32);
        }
        AbstractC6231.m11036(m4427(), null, null, new ScrollableNode$onKeyEvent$1(this, jFloatToRawIntBits, null), 3);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0149  */
    @Override // androidx.compose.p001ui.node.InterfaceC2631
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1851(C2487 c2487, PointerEventPass pointerEventPass, long j) {
        C1343 c1343;
        int i;
        int i2;
        Object obj;
        Object obj2;
        boolean z;
        Object obj3;
        boolean z2;
        C1323 c1323;
        Object obj4;
        Object obj5;
        DragDetectionState$AwaitDown$AwaitTouchSlop dragDetectionState$AwaitDown$AwaitTouchSlop;
        List list = c2487.f5197;
        int size = list.size();
        int i3 = 0;
        while (true) {
            c1343 = this.f1868;
            if (i3 >= size) {
                break;
            }
            C2478 c2478 = (C2478) list.get(i3);
            C1361 c1361 = this.f1768;
            int i4 = c2478.f5164;
            c1361.getClass();
            if (i4 == 2) {
                i3++;
            } else {
                this.f1763 = true;
                if (this.f1765 == null) {
                    C1863 c1863 = new C1863(this);
                    m3924(c1863);
                    this.f1765 = c1863;
                }
                if (!this.f1767) {
                    break;
                }
                if (this.f1758 == null) {
                    C1314 c1314 = this.f1759;
                    if (c1314 == null) {
                        DragDetectionState$AwaitDown$AwaitTouchSlop dragDetectionState$AwaitDown$AwaitTouchSlop2 = DragDetectionState$AwaitDown$AwaitTouchSlop.NotInitialized;
                        c1314 = new C1314();
                        c1314.f1782 = dragDetectionState$AwaitDown$AwaitTouchSlop2;
                        c1314.f1781 = false;
                        this.f1759 = c1314;
                    }
                    this.f1758 = c1314;
                }
                AbstractC1362 abstractC1362 = this.f1758;
                if (abstractC1362 == null) {
                    C6755.m11869("currentDragState should not be null");
                    return;
                }
                if (abstractC1362 instanceof C1314) {
                    C1314 c13142 = (C1314) abstractC1362;
                    if (!list.isEmpty() && AbstractC1344.m1838(c2487, false, false)) {
                        C2478 c24782 = (C2478) AbstractC5176.m9379(list);
                        if (AbstractC1305.f1772[c13142.f1782.ordinal()] != 1) {
                            dragDetectionState$AwaitDown$AwaitTouchSlop = c13142.f1782;
                        } else if (c1343.f1837.mo1810()) {
                            dragDetectionState$AwaitDown$AwaitTouchSlop = DragDetectionState$AwaitDown$AwaitTouchSlop.f2No;
                        } else {
                            InterfaceC1922 interfaceC1922 = c1343.f1836;
                            if (!(interfaceC1922 != null ? interfaceC1922.mo2516() : false)) {
                                dragDetectionState$AwaitDown$AwaitTouchSlop = DragDetectionState$AwaitDown$AwaitTouchSlop.Yes;
                            }
                        }
                        c13142.f1782 = dragDetectionState$AwaitDown$AwaitTouchSlop;
                        if (pointerEventPass == PointerEventPass.Initial && dragDetectionState$AwaitDown$AwaitTouchSlop == DragDetectionState$AwaitDown$AwaitTouchSlop.f2No) {
                            c24782.m3584();
                            c13142.f1781 = true;
                        }
                        if (pointerEventPass == PointerEventPass.Main) {
                            if (dragDetectionState$AwaitDown$AwaitTouchSlop == DragDetectionState$AwaitDown$AwaitTouchSlop.Yes) {
                                AbstractC1304.m1777(this, c24782, c24782.f5154, 0L, 12);
                            } else if (c13142.f1781) {
                                m1786(c24782, c24782, 0L);
                                m1785(0L, c24782);
                                long j2 = c24782.f5154;
                                C1323 c13232 = this.f1760;
                                if (c13232 == null) {
                                    c13232 = new C1323();
                                    c13232.f1794 = Long.MAX_VALUE;
                                    this.f1760 = c13232;
                                }
                                c13232.f1794 = j2;
                                this.f1758 = c13232;
                            }
                        }
                    }
                } else if (abstractC1362 instanceof C1324) {
                    C1324 c1324 = (C1324) abstractC1362;
                    if (pointerEventPass != PointerEventPass.Initial) {
                        int size2 = list.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size2) {
                                obj3 = null;
                                break;
                            }
                            obj3 = list.get(i5);
                            if (AbstractC2481.m3586(((C2478) obj3).f5154, c1324.f1796)) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        C2478 c24783 = (C2478) obj3;
                        if (c24783 == null) {
                            int size3 = list.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size3) {
                                    obj5 = null;
                                    break;
                                }
                                obj5 = list.get(i6);
                                if (((C2478) obj5).f5151) {
                                    break;
                                } else {
                                    i6++;
                                }
                            }
                            c24783 = (C2478) obj5;
                            if (c24783 == null) {
                                m1790();
                            } else {
                                c1324.f1796 = c24783.f5154;
                                if (pointerEventPass == PointerEventPass.Main) {
                                    if (c24783.m3582()) {
                                        C2478 c24784 = c1324.f1797;
                                        if (c24784 == null) {
                                            C6755.m11869("AwaitTouchSlop.initialDown was not initialized");
                                            return;
                                        }
                                        long j3 = c1324.f1796;
                                        C1342 c1342 = this.f1754;
                                        if (c1342 == null) {
                                            C6755.m11869("AwaitTouchSlop.touchSlopDetector was not initialized");
                                            return;
                                        }
                                        m1791(c24784, j3, c1342);
                                    } else if (AbstractC2481.m3587(c24783)) {
                                        int size4 = list.size();
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 >= size4) {
                                                obj4 = null;
                                                break;
                                            }
                                            obj4 = list.get(i7);
                                            if (((C2478) obj4).f5151) {
                                                break;
                                            } else {
                                                i7++;
                                            }
                                        }
                                        C2478 c24785 = (C2478) obj4;
                                        if (c24785 == null) {
                                            m1790();
                                        } else {
                                            c1324.f1796 = c24785.f5154;
                                        }
                                    } else {
                                        float fM1804 = AbstractC1309.m1804((InterfaceC2698) AbstractC2620.m3916(this, AbstractC2737.f5921), c24783.f5164);
                                        C1342 c13422 = this.f1754;
                                        if (c13422 == null) {
                                            C6755.m11869("Touch slop detector not initialized.");
                                            return;
                                        }
                                        long jM1821 = c13422.m1821(fM1804, AbstractC2481.m3591(c24783, true), true);
                                        if ((jM1821 & 9223372034707292159L) != 9205357640488583168L) {
                                            boolean zMo1782 = mo1782(c24783);
                                            InterfaceC2599 interfaceC2599M3921 = AbstractC2620.m3921(this, C1863.f3347);
                                            C1863 c18632 = interfaceC2599M3921 instanceof C1863 ? (C1863) interfaceC2599M3921 : null;
                                            InterfaceC1864 interfaceC1864 = c18632 != null ? c18632.f3348 : null;
                                            if (interfaceC1864 != null) {
                                                z2 = true;
                                                boolean z3 = interfaceC1864.mo1782(c24783);
                                                if (zMo1782 && z3) {
                                                    c1324.f1795 = z2;
                                                } else {
                                                    c24783.m3584();
                                                    C2478 c24786 = c1324.f1797;
                                                    c24786.getClass();
                                                    m1786(c24786, c24783, jM1821);
                                                    m1785(jM1821, c24783);
                                                    long j4 = c24783.f5154;
                                                    c1323 = this.f1760;
                                                    if (c1323 == null) {
                                                        c1323 = new C1323();
                                                        c1323.f1794 = Long.MAX_VALUE;
                                                        this.f1760 = c1323;
                                                    }
                                                    c1323.f1794 = j4;
                                                    this.f1758 = c1323;
                                                }
                                            } else {
                                                z2 = true;
                                            }
                                            if (zMo1782) {
                                                c24783.m3584();
                                                C2478 c247862 = c1324.f1797;
                                                c247862.getClass();
                                                m1786(c247862, c24783, jM1821);
                                                m1785(jM1821, c24783);
                                                long j42 = c24783.f5154;
                                                c1323 = this.f1760;
                                                if (c1323 == null) {
                                                }
                                                c1323.f1794 = j42;
                                                this.f1758 = c1323;
                                            }
                                        } else {
                                            c1324.f1795 = true;
                                        }
                                    }
                                }
                                if (pointerEventPass != PointerEventPass.Final && c1324.f1795) {
                                    if (c24783.m3582()) {
                                        C2478 c24787 = c1324.f1797;
                                        if (c24787 == null) {
                                            C6755.m11869("AwaitTouchSlop.initialDown was not initialized");
                                            return;
                                        }
                                        long j5 = c1324.f1796;
                                        C1342 c13423 = this.f1754;
                                        if (c13423 == null) {
                                            C6755.m11869("AwaitTouchSlop.touchSlopDetector was not initialized");
                                            return;
                                        }
                                        m1791(c24787, j5, c13423);
                                    } else {
                                        c1324.f1795 = false;
                                        i = 0;
                                    }
                                }
                            }
                        } else {
                            if (pointerEventPass == PointerEventPass.Main) {
                            }
                            if (pointerEventPass != PointerEventPass.Final) {
                            }
                        }
                    }
                } else if (abstractC1362 instanceof C1325) {
                    C1325 c1325 = (C1325) abstractC1362;
                    if (pointerEventPass == PointerEventPass.Final) {
                        int size5 = list.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= size5) {
                                z = true;
                                break;
                            } else {
                                if (((C2478) list.get(i8)).m3582()) {
                                    z = false;
                                    break;
                                }
                                i8++;
                            }
                        }
                        int size6 = list.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= size6) {
                                break;
                            }
                            if (!((C2478) list.get(i9)).f5151) {
                                i9++;
                            } else {
                                if (list.isEmpty()) {
                                    break;
                                }
                                if (z) {
                                    long j6 = ((C2478) AbstractC5176.m9379(list)).f5152;
                                    C2478 c24788 = c1325.f1799;
                                    c24788.getClass();
                                    long jM13085 = C8158.m13085(j6, c24788.f5152);
                                    C2478 c24789 = c1325.f1799;
                                    if (c24789 == null) {
                                        C6755.m11869("AwaitGesturePickup.initialDown was not initialized.");
                                        return;
                                    }
                                    AbstractC1304.m1777(this, c24789, c1325.f1798, jM13085, 8);
                                }
                            }
                        }
                        m1790();
                    }
                } else {
                    if (!(abstractC1362 instanceof C1323)) {
                        C5043.m9170();
                        return;
                    }
                    C1323 c13233 = (C1323) abstractC1362;
                    if (pointerEventPass == PointerEventPass.Main) {
                        long j7 = c13233.f1794;
                        int size7 = list.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size7) {
                                obj = null;
                                break;
                            }
                            obj = list.get(i10);
                            if (AbstractC2481.m3586(((C2478) obj).f5154, j7)) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                        C2478 c247810 = (C2478) obj;
                        if (c247810 != null) {
                            boolean zM3587 = AbstractC2481.m3587(c247810);
                            Object obj6 = C1322.f1793;
                            if (zM3587) {
                                int size8 = list.size();
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= size8) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = list.get(i11);
                                    if (((C2478) obj2).f5151) {
                                        break;
                                    } else {
                                        i11++;
                                    }
                                }
                                C2478 c247811 = (C2478) obj2;
                                if (c247811 == null) {
                                    if (c247810.m3582() || !AbstractC2481.m3587(c247810)) {
                                        m1789().mo8995(obj6);
                                    } else {
                                        AbstractC7173.m12432(m1788(), c247810, 0L);
                                        float fMo4014 = ((InterfaceC2698) AbstractC2620.m3916(this, AbstractC2737.f5921)).mo4014();
                                        long jM11818 = m1788().m11818(AbstractC3738.m6871(fMo4014, fMo4014));
                                        C3776 c3776 = (C3776) m1788().f16359;
                                        C8141 c8141 = (C8141) c3776.f9664;
                                        C8143[] c8143Arr = c8141.f19842;
                                        AbstractC5179.m9393(0, c8143Arr.length, null, c8143Arr);
                                        c8141.f19841 = 0;
                                        C8141 c81412 = (C8141) c3776.f9663;
                                        C8143[] c8143Arr2 = c81412.f19842;
                                        AbstractC5179.m9393(0, c8143Arr2.length, null, c8143Arr2);
                                        c81412.f19841 = 0;
                                        c3776.f9665 = 0L;
                                        m1789().mo8995(new C1311(AbstractC1303.m1776(jM11818), false));
                                        this.f1763 = false;
                                    }
                                    m1790();
                                } else {
                                    c13233.f1794 = c247811.f5154;
                                }
                            } else if (c247810.m3582()) {
                                m1789().mo8995(obj6);
                            } else if (C8158.m13086(AbstractC2481.m3591(c247810, true)) != 0.0f) {
                                i = 0;
                                m1785(AbstractC2481.m3591(c247810, false), c247810);
                                c247810.m3584();
                            }
                        }
                    }
                }
                i = 0;
            }
        }
        i = 0;
        if (this.f1765 == null) {
            C1863 c18633 = new C1863(this);
            m3924(c18633);
            this.f1765 = c18633;
        }
        if (this.f1767) {
            int i12 = 10;
            if (pointerEventPass == PointerEventPass.Initial && c2487.f5192 == 6) {
                if (this.f1869 == null) {
                    this.f1869 = new C1395(c1343, new C0960(ViewConfiguration.get(AbstractC2620.m3897(this).getContext()), i12), new ScrollableNode$ensureMouseWheelScrollingLogicInitialized$1(this), AbstractC2620.m3906(this).f5444);
                }
                C1395 c1395 = this.f1869;
                if (c1395 != null) {
                    InterfaceC6233 interfaceC6233M4427 = m4427();
                    if (c1395.f1939 == null) {
                        c1395.f1939 = AbstractC6231.m11036(interfaceC6233M4427, null, null, new MouseWheelScrollingLogic$startReceivingEvents$1(c1395, null), 3);
                    }
                }
            }
            C1395 c13952 = this.f1869;
            if (c13952 != null && c2487.f5192 == 6) {
                int size9 = list.size();
                int i13 = i;
                while (true) {
                    if (i13 >= size9) {
                        if (pointerEventPass == PointerEventPass.Initial && c13952.f1947) {
                            c13952.m1908(c2487, j);
                            AbstractC1397.m1910(c2487);
                        }
                        if (pointerEventPass == PointerEventPass.Main && !c13952.f1947 && c13952.m1908(c2487, j)) {
                            AbstractC1397.m1910(c2487);
                        }
                    } else if (((C2478) list.get(i13)).m3582()) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            if (pointerEventPass == PointerEventPass.Initial && ((i2 = c2487.f5192) == 10 || i2 == 11 || i2 == 12)) {
                if (this.f1870 == null) {
                    this.f1870 = new C1345(c1343, new ScrollableNode$ensureTrackpadScrollingLogicInitialized$1(this), AbstractC2620.m3906(this).f5444);
                }
                C1345 c1345 = this.f1870;
                if (c1345 != null) {
                    InterfaceC6233 interfaceC6233M44272 = m4427();
                    if (c1345.f1847 == null) {
                        c1345.f1847 = AbstractC6231.m11036(interfaceC6233M44272, null, null, new TrackpadScrollingLogic$startReceivingEvents$1(c1345, null), 3);
                    }
                }
            }
            C1345 c13452 = this.f1870;
            if (c13452 != null) {
                int i14 = c2487.f5192;
                if (i14 == 10 || i14 == 11 || i14 == 12) {
                    int size10 = list.size();
                    for (int i15 = i; i15 < size10; i15++) {
                        if (((C2478) list.get(i15)).m3582()) {
                            return;
                        }
                    }
                    if (pointerEventPass == PointerEventPass.Initial && c13452.f1947) {
                        c13452.m1844(c2487);
                        AbstractC1397.m1910(c2487);
                    }
                    if (pointerEventPass == PointerEventPass.Main && !c13452.f1947 && c13452.m1844(c2487)) {
                        AbstractC1397.m1910(c2487);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
    public final void m1852(InterfaceC1922 interfaceC1922, InterfaceC1401 interfaceC1401, Orientation orientation, InterfaceC1354 interfaceC1354, InterfaceC1421 interfaceC1421, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (this.f1767 != z) {
            this.f1867.f1818 = z;
            z3 = true;
        } else {
            z3 = false;
        }
        InterfaceC1401 interfaceC14012 = interfaceC1401 == null ? this.f1872 : interfaceC1401;
        C1343 c1343 = this.f1868;
        if (AbstractC5227.m9466(c1343.f1837, interfaceC1354)) {
            z4 = false;
        } else {
            c1343.f1837 = interfaceC1354;
            z4 = true;
        }
        c1343.f1836 = interfaceC1922;
        if (c1343.f1834 != orientation) {
            c1343.f1834 = orientation;
            z4 = true;
        }
        if (c1343.f1833 != z2) {
            c1343.f1833 = z2;
            z4 = true;
        }
        c1343.f1835 = interfaceC14012;
        c1343.f1832 = this.f1871;
        C1365 c1365 = this.f1865;
        c1365.f1882 = orientation;
        c1365.f1887 = z2;
        this.f1873 = interfaceC1922;
        this.f1874 = interfaceC1401;
        C1361 c1361 = AbstractC1339.f1825;
        Orientation orientation2 = c1343.f1834;
        Orientation orientation3 = Orientation.Vertical;
        if (orientation2 != orientation3) {
            orientation3 = Orientation.Horizontal;
        }
        this.f1768 = c1361;
        if (this.f1767 != z) {
            this.f1767 = z;
            if (!z) {
                m1792();
                this.f1771 = null;
            }
            z4 = true;
        }
        if (!AbstractC5227.m9466(this.f1766, interfaceC1421)) {
            m1792();
            this.f1766 = interfaceC1421;
        }
        if (this.f1769 != orientation3) {
            this.f1769 = orientation3;
        } else {
            z5 = z4;
        }
        if (z5) {
            boolean z6 = this.f1763;
            C1322 c1322 = C1322.f1793;
            if (z6) {
                m1790();
                if (this.f1764) {
                    m1789().mo8995(c1322);
                }
                this.f1757 = null;
            }
            C1387 c1387 = this.f1771;
            if (c1387 != null) {
                c1387.m1890();
                AbstractC1304 abstractC1304 = c1387.f1921;
                if (abstractC1304.f1764) {
                    abstractC1304.m1787(c1322);
                }
                c1387.f1923 = null;
                C0954 c0954 = c1387.f1924;
                c0954.f659 = 0;
                ((C1102) c0954.f660).f1275 = 0;
            }
        }
        if (z3) {
            this.f1864 = null;
            this.f1863 = null;
            AbstractC2620.m3914(this);
        }
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public final boolean mo1853() {
        return false;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2596
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public final void mo1854(InterfaceC2779 interfaceC2779) {
        if (this.f1767 && (this.f1864 == null || this.f1863 == null)) {
            this.f1864 = new C1391(this);
            this.f1863 = new ScrollableNode$setScrollSemanticsActions$2(this, null);
        }
        C1391 c1391 = this.f1864;
        if (c1391 != null) {
            InterfaceC5920[] interfaceC5920Arr = AbstractC2781.f6100;
            interfaceC2779.mo4150(AbstractC2794.f6135, new C2776(null, c1391));
        }
        InterfaceC7383 interfaceC7383 = this.f1863;
        if (interfaceC7383 != null) {
            InterfaceC5920[] interfaceC5920Arr2 = AbstractC2781.f6100;
            interfaceC2779.mo4150(AbstractC2794.f6134, interfaceC7383);
        }
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1661() {
        if (this.f6624) {
            InterfaceC8725 interfaceC8725 = AbstractC2620.m3906(this).f5444;
            C1367 c1367 = this.f1872;
            c1367.getClass();
            c1367.f1893 = new C1179(new C0960(interfaceC8725));
        }
        C1395 c1395 = this.f1869;
        if (c1395 != null) {
            c1395.f1948 = AbstractC2620.m3906(this).f5444;
        }
        C1345 c1345 = this.f1870;
        if (c1345 != null) {
            c1345.f1948 = AbstractC2620.m3906(this).f5444;
        }
    }

    @Override // p122.InterfaceC8136
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean mo1855(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2622, androidx.compose.p001ui.node.InterfaceC2631
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo1856() {
        mo1784();
        if (this.f6624) {
            InterfaceC8725 interfaceC8725 = AbstractC2620.m3906(this).f5444;
            C1367 c1367 = this.f1872;
            c1367.getClass();
            c1367.f1893 = new C1179(new C0960(interfaceC8725));
        }
        C1395 c1395 = this.f1869;
        if (c1395 != null) {
            c1395.f1948 = AbstractC2620.m3906(this).f5444;
        }
        C1345 c1345 = this.f1870;
        if (c1345 != null) {
            c1345.f1948 = AbstractC2620.m3906(this).f5444;
        }
    }
}
