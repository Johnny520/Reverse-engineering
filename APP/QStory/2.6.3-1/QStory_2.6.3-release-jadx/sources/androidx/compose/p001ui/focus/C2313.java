package androidx.compose.p001ui.focus;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import androidx.collection.C1091;
import androidx.collection.C1100;
import androidx.collection.C1123;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2623;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.C2646;
import androidx.compose.p001ui.node.InterfaceC2622;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.collection.C2059;
import io.ktor.util.C5043;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$ObjectRef;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p122.AbstractC8137;
import p122.InterfaceC8136;
import p128.C8157;
import p226.AbstractC8765;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.focus.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2313 implements InterfaceC2318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C1100 f4532;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C2315 f4534;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC2719 f4536;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC2719 f4537;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C2287 f4538;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2287 f4535 = new C2287(2, null, 14);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2309 f4533 = new C2309(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C1091 f4539 = new C1091(1);

    public C2313(ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719, ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC27192) {
        this.f4537 = viewTreeObserverOnGlobalLayoutListenerC2719;
        this.f4536 = viewTreeObserverOnGlobalLayoutListenerC27192;
        this.f4534 = new C2315(this, viewTreeObserverOnGlobalLayoutListenerC27192);
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
    */
    public final boolean m3199(KeyEvent keyEvent, InterfaceC7372 interfaceC7372) {
        InterfaceC2622 interfaceC2622;
        AbstractC2961 abstractC2961;
        C2646 c2646;
        InterfaceC2622 interfaceC26222;
        C2646 c26462;
        int size;
        C2646 c26463;
        boolean z;
        C2287 c2287 = this.f4535;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.f4534.f4541) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            if (!m3206(keyEvent)) {
                return false;
            }
            C2287 c2287M3167 = AbstractC2294.m3167(c2287);
            if (c2287M3167 != null) {
                if (!c2287M3167.f6637.f6624) {
                    AbstractC8765.m13982("visitLocalDescendants called on an unattached node");
                }
                AbstractC2961 abstractC29612 = c2287M3167.f6637;
                if ((abstractC29612.f6630 & 9216) != 0) {
                    abstractC2961 = null;
                    for (AbstractC2961 abstractC29613 = abstractC29612.f6633; abstractC29613 != null; abstractC29613 = abstractC29613.f6633) {
                        int i = abstractC29613.f6636;
                        if ((i & 9216) != 0) {
                            if ((i & 1024) != 0) {
                                break;
                            }
                            abstractC2961 = abstractC29613;
                        }
                    }
                } else {
                    abstractC2961 = null;
                }
                if (abstractC2961 == null) {
                }
            } else if (c2287M3167 == null) {
                if (!c2287.f6637.f6624) {
                    AbstractC8765.m13982("visitAncestors called on an unattached node");
                }
                AbstractC2961 abstractC29614 = c2287.f6637.f6629;
                C2583 c2583M3906 = AbstractC2620.m3906(c2287);
                loop15: while (true) {
                    if (c2583M3906 == null) {
                        interfaceC2622 = null;
                        break;
                    }
                    if ((c2583M3906.f5439.f5628.f6630 & 8192) != 0) {
                        while (abstractC29614 != null) {
                            if ((abstractC29614.f6636 & 8192) != 0) {
                                AbstractC2961 abstractC2961M3899 = abstractC29614;
                                C2059 c2059 = null;
                                while (abstractC2961M3899 != null) {
                                    if (abstractC2961M3899 instanceof InterfaceC8136) {
                                        interfaceC2622 = abstractC2961M3899;
                                        break loop15;
                                    }
                                    if ((abstractC2961M3899.f6636 & 8192) != 0 && (abstractC2961M3899 instanceof AbstractC2623)) {
                                        AbstractC2961 abstractC29615 = ((AbstractC2623) abstractC2961M3899).f5571;
                                        int i2 = 0;
                                        abstractC2961M3899 = abstractC2961M3899;
                                        c2059 = c2059;
                                        while (abstractC29615 != null) {
                                            if ((abstractC29615.f6636 & 8192) != 0) {
                                                i2++;
                                                c2059 = c2059;
                                                if (i2 == 1) {
                                                    abstractC2961M3899 = abstractC29615;
                                                } else {
                                                    if (c2059 == null) {
                                                        c2059 = new C2059(0, new AbstractC2961[16]);
                                                    }
                                                    if (abstractC2961M3899 != null) {
                                                        c2059.m2607(abstractC2961M3899);
                                                        abstractC2961M3899 = null;
                                                    }
                                                    c2059.m2607(abstractC29615);
                                                }
                                            }
                                            abstractC29615 = abstractC29615.f6633;
                                            abstractC2961M3899 = abstractC2961M3899;
                                            c2059 = c2059;
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    abstractC2961M3899 = AbstractC2620.m3899(c2059);
                                }
                            }
                            abstractC29614 = abstractC29614.f6629;
                        }
                    }
                    c2583M3906 = c2583M3906.m3816();
                    abstractC29614 = (c2583M3906 == null || (c2646 = c2583M3906.f5439) == null) ? null : c2646.f5629;
                }
                InterfaceC2622 interfaceC26223 = (InterfaceC8136) interfaceC2622;
                abstractC2961 = interfaceC26223 != null ? ((AbstractC2961) interfaceC26223).f6637 : null;
            } else {
                if (!c2287M3167.f6637.f6624) {
                    AbstractC8765.m13982("visitAncestors called on an unattached node");
                }
                AbstractC2961 abstractC29616 = c2287M3167.f6637;
                C2583 c2583M39062 = AbstractC2620.m3906(c2287M3167);
                loop11: while (true) {
                    if (c2583M39062 == null) {
                        interfaceC26222 = null;
                        break;
                    }
                    if ((c2583M39062.f5439.f5628.f6630 & 8192) != 0) {
                        while (abstractC29616 != null) {
                            if ((abstractC29616.f6636 & 8192) != 0) {
                                C2059 c20592 = null;
                                AbstractC2961 abstractC2961M38992 = abstractC29616;
                                while (abstractC2961M38992 != null) {
                                    if (abstractC2961M38992 instanceof InterfaceC8136) {
                                        interfaceC26222 = abstractC2961M38992;
                                        break loop11;
                                    }
                                    if ((abstractC2961M38992.f6636 & 8192) != 0 && (abstractC2961M38992 instanceof AbstractC2623)) {
                                        AbstractC2961 abstractC29617 = ((AbstractC2623) abstractC2961M38992).f5571;
                                        int i3 = 0;
                                        abstractC2961M38992 = abstractC2961M38992;
                                        c20592 = c20592;
                                        while (abstractC29617 != null) {
                                            if ((abstractC29617.f6636 & 8192) != 0) {
                                                i3++;
                                                c20592 = c20592;
                                                if (i3 == 1) {
                                                    abstractC2961M38992 = abstractC29617;
                                                } else {
                                                    if (c20592 == null) {
                                                        c20592 = new C2059(0, new AbstractC2961[16]);
                                                    }
                                                    if (abstractC2961M38992 != null) {
                                                        c20592.m2607(abstractC2961M38992);
                                                        abstractC2961M38992 = null;
                                                    }
                                                    c20592.m2607(abstractC29617);
                                                }
                                            }
                                            abstractC29617 = abstractC29617.f6633;
                                            abstractC2961M38992 = abstractC2961M38992;
                                            c20592 = c20592;
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    abstractC2961M38992 = AbstractC2620.m3899(c20592);
                                }
                            }
                            abstractC29616 = abstractC29616.f6629;
                        }
                    }
                    c2583M39062 = c2583M39062.m3816();
                    abstractC29616 = (c2583M39062 == null || (c26462 = c2583M39062.f5439) == null) ? null : c26462.f5629;
                }
                InterfaceC2622 interfaceC26224 = (InterfaceC8136) interfaceC26222;
                if (interfaceC26224 != null) {
                    abstractC2961 = ((AbstractC2961) interfaceC26224).f6637;
                }
            }
            if (abstractC2961 != null) {
                if (!abstractC2961.f6637.f6624) {
                    AbstractC8765.m13982("visitAncestors called on an unattached node");
                }
                AbstractC2961 abstractC29618 = abstractC2961.f6637.f6629;
                C2583 c2583M39063 = AbstractC2620.m3906(abstractC2961);
                ArrayList arrayList = null;
                while (c2583M39063 != null) {
                    if ((c2583M39063.f5439.f5628.f6630 & 8192) != 0) {
                        while (abstractC29618 != null) {
                            if ((abstractC29618.f6636 & 8192) != 0) {
                                AbstractC2961 abstractC2961M38993 = abstractC29618;
                                C2059 c20593 = null;
                                while (abstractC2961M38993 != null) {
                                    if (abstractC2961M38993 instanceof InterfaceC8136) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(abstractC2961M38993);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (abstractC2961M38993.f6636 & 8192) != 0 && (abstractC2961M38993 instanceof AbstractC2623)) {
                                        int i4 = 0;
                                        for (AbstractC2961 abstractC29619 = ((AbstractC2623) abstractC2961M38993).f5571; abstractC29619 != null; abstractC29619 = abstractC29619.f6633) {
                                            if ((abstractC29619.f6636 & 8192) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    abstractC2961M38993 = abstractC29619;
                                                } else {
                                                    if (c20593 == null) {
                                                        c20593 = new C2059(0, new AbstractC2961[16]);
                                                    }
                                                    if (abstractC2961M38993 != null) {
                                                        c20593.m2607(abstractC2961M38993);
                                                        abstractC2961M38993 = null;
                                                    }
                                                    c20593.m2607(abstractC29619);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    abstractC2961M38993 = AbstractC2620.m3899(c20593);
                                }
                            }
                            abstractC29618 = abstractC29618.f6629;
                        }
                    }
                    c2583M39063 = c2583M39063.m3816();
                    abstractC29618 = (c2583M39063 == null || (c26463 = c2583M39063.f5439) == null) ? null : c26463.f5629;
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i5 = size - 1;
                        if (((InterfaceC8136) arrayList.get(size)).mo1855(keyEvent)) {
                            return true;
                        }
                        if (i5 < 0) {
                            break;
                        }
                        size = i5;
                    }
                }
                ?? M3899 = abstractC2961.f6637;
                ?? c20594 = 0;
                while (M3899 != 0) {
                    if (M3899 instanceof InterfaceC8136) {
                        if (((InterfaceC8136) M3899).mo1855(keyEvent)) {
                            return true;
                        }
                    } else if ((M3899.f6636 & 8192) != 0 && (M3899 instanceof AbstractC2623)) {
                        AbstractC2961 abstractC296110 = ((AbstractC2623) M3899).f5571;
                        int i6 = 0;
                        c20594 = c20594;
                        M3899 = M3899;
                        while (abstractC296110 != null) {
                            if ((abstractC296110.f6636 & 8192) != 0) {
                                i6++;
                                c20594 = c20594;
                                if (i6 == 1) {
                                    M3899 = abstractC296110;
                                } else {
                                    if (c20594 == 0) {
                                        c20594 = new C2059(0, new AbstractC2961[16]);
                                    }
                                    if (M3899 != 0) {
                                        c20594.m2607(M3899);
                                        M3899 = 0;
                                    }
                                    c20594.m2607(abstractC296110);
                                }
                            }
                            abstractC296110 = abstractC296110.f6633;
                            c20594 = c20594;
                            M3899 = M3899;
                        }
                        if (i6 == 1) {
                        }
                    }
                    M3899 = AbstractC2620.m3899(c20594);
                }
                if (((Boolean) interfaceC7372.invoke()).booleanValue()) {
                    return true;
                }
                ?? M38992 = abstractC2961.f6637;
                ?? c20595 = 0;
                while (M38992 != 0) {
                    if (M38992 instanceof InterfaceC8136) {
                        if (((InterfaceC8136) M38992).mo1850(keyEvent)) {
                            return true;
                        }
                    } else if ((M38992.f6636 & 8192) != 0 && (M38992 instanceof AbstractC2623)) {
                        AbstractC2961 abstractC296111 = ((AbstractC2623) M38992).f5571;
                        int i7 = 0;
                        M38992 = M38992;
                        c20595 = c20595;
                        while (abstractC296111 != null) {
                            if ((abstractC296111.f6636 & 8192) != 0) {
                                i7++;
                                c20595 = c20595;
                                if (i7 == 1) {
                                    M38992 = abstractC296111;
                                } else {
                                    if (c20595 == 0) {
                                        c20595 = new C2059(0, new AbstractC2961[16]);
                                    }
                                    if (M38992 != 0) {
                                        c20595.m2607(M38992);
                                        M38992 = 0;
                                    }
                                    c20595.m2607(abstractC296111);
                                }
                            }
                            abstractC296111 = abstractC296111.f6633;
                            M38992 = M38992;
                            c20595 = c20595;
                        }
                        if (i7 == 1) {
                        }
                    }
                    M38992 = AbstractC2620.m3899(c20595);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        if (((InterfaceC8136) arrayList.get(i8)).mo1850(keyEvent)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m3200() {
        ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = this.f4537;
        if (viewTreeObserverOnGlobalLayoutListenerC2719.isFocused() || viewTreeObserverOnGlobalLayoutListenerC2719.hasFocus()) {
            viewTreeObserverOnGlobalLayoutListenerC2719.clearFocus();
        } else if (viewTreeObserverOnGlobalLayoutListenerC2719.hasFocus()) {
            View viewFindFocus = viewTreeObserverOnGlobalLayoutListenerC2719.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            viewTreeObserverOnGlobalLayoutListenerC2719.clearFocus();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m3201(int i, boolean z, boolean z2) {
        boolean z3 = true;
        if (z) {
            m3202(z);
        } else {
            int i2 = AbstractC2310.f4519[AbstractC2294.m3173(this.f4535, i).ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                z3 = false;
            } else {
                if (i2 != 4) {
                    C5043.m9170();
                    return false;
                }
                m3202(z);
            }
        }
        if (z3 && z2) {
            m3200();
        }
        return z3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m3202(boolean z) {
        C2646 c2646;
        if (m3203() != null) {
            C2287 c2287M3203 = m3203();
            m3205(null);
            if (c2287M3203 != null) {
                c2287M3203.m3161(FocusStateImpl.Active, FocusStateImpl.Inactive);
                if (!c2287M3203.f6637.f6624) {
                    AbstractC8765.m13982("visitAncestors called on an unattached node");
                }
                AbstractC2961 abstractC2961 = c2287M3203.f6637.f6629;
                C2583 c2583M3906 = AbstractC2620.m3906(c2287M3203);
                while (c2583M3906 != null) {
                    if ((c2583M3906.f5439.f5628.f6630 & 1024) != 0) {
                        while (abstractC2961 != null) {
                            if ((abstractC2961.f6636 & 1024) != 0) {
                                AbstractC2961 abstractC2961M3899 = abstractC2961;
                                C2059 c2059 = null;
                                while (abstractC2961M3899 != null) {
                                    if (abstractC2961M3899 instanceof C2287) {
                                        ((C2287) abstractC2961M3899).m3161(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                                    } else if ((abstractC2961M3899.f6636 & 1024) != 0 && (abstractC2961M3899 instanceof AbstractC2623)) {
                                        int i = 0;
                                        for (AbstractC2961 abstractC29612 = ((AbstractC2623) abstractC2961M3899).f5571; abstractC29612 != null; abstractC29612 = abstractC29612.f6633) {
                                            if ((abstractC29612.f6636 & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    abstractC2961M3899 = abstractC29612;
                                                } else {
                                                    if (c2059 == null) {
                                                        c2059 = new C2059(0, new AbstractC2961[16]);
                                                    }
                                                    if (abstractC2961M3899 != null) {
                                                        c2059.m2607(abstractC2961M3899);
                                                        abstractC2961M3899 = null;
                                                    }
                                                    c2059.m2607(abstractC29612);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    abstractC2961M3899 = AbstractC2620.m3899(c2059);
                                }
                            }
                            abstractC2961 = abstractC2961.f6629;
                        }
                    }
                    c2583M3906 = c2583M3906.m3816();
                    abstractC2961 = (c2583M3906 == null || (c2646 = c2583M3906.f5439) == null) ? null : c2646.f5629;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C2287 m3203() {
        C2287 c2287 = this.f4538;
        if (c2287 == null || !c2287.f6624) {
            return null;
        }
        return c2287;
    }

    /* JADX WARN: Code restructure failed: missing block: B:235:0x0126, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean m3204(int i, C8157 c8157, final InterfaceC7387 interfaceC7387) {
        boolean zM3172;
        boolean z;
        C2287 c2287;
        C2646 c2646;
        boolean z2;
        C2287 c22872 = this.f4535;
        final C2287 c2287M3167 = AbstractC2294.m3167(c22872);
        int i2 = 4;
        ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = this.f4536;
        if (c2287M3167 != null) {
            LayoutDirection layoutDirection = viewTreeObserverOnGlobalLayoutListenerC2719.getLayoutDirection();
            C2312 c2312M3160 = c2287M3167.m3160();
            C2303 c2303 = c2312M3160.f4526;
            C2303 c23032 = c2312M3160.f4530;
            if (i == 1) {
                c2303 = c2312M3160.f4524;
            } else if (i == 2) {
                c2303 = c2312M3160.f4523;
            } else if (i == 5) {
                c2303 = c2312M3160.f4522;
            } else if (i == 6) {
                c2303 = c2312M3160.f4521;
            } else if (i == 3) {
                int i3 = AbstractC2296.f4505[layoutDirection.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        C5043.m9170();
                        return null;
                    }
                    c2303 = c23032;
                }
                if (c2303 == C2303.f4514) {
                    c2303 = null;
                }
                if (c2303 == null) {
                    c2303 = c2312M3160.f4520;
                }
            } else if (i == 4) {
                int i4 = AbstractC2296.f4505[layoutDirection.ordinal()];
                if (i4 == 1) {
                    c2303 = c23032;
                } else if (i4 != 2) {
                    C5043.m9170();
                    return null;
                }
                if (c2303 == C2303.f4514) {
                    c2303 = null;
                }
                if (c2303 == null) {
                    c2303 = c2312M3160.f4527;
                }
            } else {
                if (i != 7 && i != 8) {
                    C6755.m11870("invalid FocusDirection");
                    return null;
                }
                C2302 c2302 = new C2302(i);
                C2313 c2313 = (C2313) ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(c2287M3167)).getFocusOwner();
                C2287 c2287M3203 = c2313.m3203();
                if (i == 7) {
                    c2312M3160.f4531.invoke(c2302);
                } else {
                    c2312M3160.f4528.invoke(c2302);
                }
                c2303 = c2302.f4510 ? C2303.f4513 : c2287M3203 != c2313.m3203() ? C2303.f4512 : C2303.f4514;
            }
            C2303 c23033 = C2303.f4513;
            if (!AbstractC5227.m9466(c2303, c23033)) {
                if (AbstractC5227.m9466(c2303, C2303.f4512)) {
                    C2287 c2287M31672 = AbstractC2294.m3167(c22872);
                    if (c2287M31672 != null) {
                        return (Boolean) interfaceC7387.invoke(c2287M31672);
                    }
                } else {
                    C2303 c23034 = C2303.f4514;
                    if (!AbstractC5227.m9466(c2303, c23034)) {
                        if (c2303 == c23034) {
                            C6755.m11870("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        if (c2303 == c23033) {
                            C6755.m11870("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        C2059 c2059 = c2303.f4515;
                        int i5 = c2059.f3865;
                        if (i5 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                            z2 = false;
                        } else {
                            Object[] objArr = c2059.f3866;
                            boolean z3 = false;
                            for (int i6 = 0; i6 < i5; i6++) {
                                InterfaceC2622 interfaceC2622 = (InterfaceC2308) objArr[i6];
                                if (!((AbstractC2961) interfaceC2622).f6637.f6624) {
                                    AbstractC8765.m13982("visitChildren called on an unattached node");
                                }
                                C2059 c20592 = new C2059(0, new AbstractC2961[16]);
                                AbstractC2961 abstractC2961 = ((AbstractC2961) interfaceC2622).f6637;
                                AbstractC2961 abstractC29612 = abstractC2961.f6633;
                                if (abstractC29612 == null) {
                                    AbstractC2620.m3902(c20592, abstractC2961);
                                } else {
                                    c20592.m2607(abstractC29612);
                                }
                                while (true) {
                                    int i7 = c20592.f3865;
                                    if (i7 != 0) {
                                        AbstractC2961 abstractC2961M3899 = (AbstractC2961) c20592.m2613(i7 - 1);
                                        if ((abstractC2961M3899.f6630 & 1024) == 0) {
                                            AbstractC2620.m3902(c20592, abstractC2961M3899);
                                        } else {
                                            while (true) {
                                                if (abstractC2961M3899 == null) {
                                                    break;
                                                }
                                                if ((abstractC2961M3899.f6636 & 1024) != 0) {
                                                    C2059 c20593 = null;
                                                    while (abstractC2961M3899 != null) {
                                                        if (abstractC2961M3899 instanceof C2287) {
                                                            if (((Boolean) interfaceC7387.invoke((C2287) abstractC2961M3899)).booleanValue()) {
                                                                z3 = true;
                                                                break;
                                                            }
                                                        } else if ((abstractC2961M3899.f6636 & 1024) != 0 && (abstractC2961M3899 instanceof AbstractC2623)) {
                                                            C2059 c20594 = c20593;
                                                            int i8 = 0;
                                                            for (AbstractC2961 abstractC29613 = ((AbstractC2623) abstractC2961M3899).f5571; abstractC29613 != null; abstractC29613 = abstractC29613.f6633) {
                                                                if ((abstractC29613.f6636 & 1024) != 0) {
                                                                    i8++;
                                                                    if (i8 == 1) {
                                                                        abstractC2961M3899 = abstractC29613;
                                                                    } else {
                                                                        if (c20594 == null) {
                                                                            c20594 = new C2059(0, new AbstractC2961[16]);
                                                                        }
                                                                        if (abstractC2961M3899 != null) {
                                                                            c20594.m2607(abstractC2961M3899);
                                                                            abstractC2961M3899 = null;
                                                                        }
                                                                        c20594.m2607(abstractC29613);
                                                                    }
                                                                }
                                                            }
                                                            if (i8 == 1) {
                                                                c20593 = c20594;
                                                            } else {
                                                                c20593 = c20594;
                                                            }
                                                        }
                                                        abstractC2961M3899 = AbstractC2620.m3899(c20593);
                                                    }
                                                } else {
                                                    abstractC2961M3899 = abstractC2961M3899.f6633;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z2 = z3;
                        }
                        return Boolean.valueOf(z2);
                    }
                }
            }
            return null;
        }
        c2287M3167 = null;
        LayoutDirection layoutDirection2 = viewTreeObserverOnGlobalLayoutListenerC2719.getLayoutDirection();
        InterfaceC7387 interfaceC73872 = new InterfaceC7387() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$focusSearch$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public final Boolean invoke(C2287 c22873) {
                boolean zBooleanValue;
                if (AbstractC5227.m9466(c22873, c2287M3167)) {
                    zBooleanValue = false;
                } else {
                    if (AbstractC5227.m9466(c22873, this.f4535)) {
                        C6755.m11870("Focus search landed at the root.");
                        return null;
                    }
                    zBooleanValue = ((Boolean) interfaceC7387.invoke(c22873)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            }
        };
        if (i == 1 || i == 2) {
            if (i == 1) {
                zM3172 = AbstractC2294.m3187(c22872, interfaceC73872);
            } else {
                if (i != 2) {
                    C6755.m11870("This function should only be used for 1-D focus search");
                    return null;
                }
                zM3172 = AbstractC2294.m3172(c22872, interfaceC73872);
            }
            return Boolean.valueOf(zM3172);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return AbstractC2294.m3162(i, c22872, interfaceC73872, c8157);
        }
        if (i == 7) {
            int i9 = AbstractC2296.f4505[layoutDirection2.ordinal()];
            if (i9 != 1) {
                if (i9 != 2) {
                    C5043.m9170();
                    return null;
                }
                i2 = 3;
            }
            C2287 c2287M31673 = AbstractC2294.m3167(c22872);
            if (c2287M31673 != null) {
                return AbstractC2294.m3162(i2, c2287M31673, interfaceC73872, c8157);
            }
            return null;
        }
        if (i != 8) {
            C1123.m1405(C2299.m3191(i), "Focus search invoked with invalid FocusDirection ");
            return null;
        }
        C2287 c2287M31674 = AbstractC2294.m3167(c22872);
        if (c2287M31674 != null) {
            if (!c2287M31674.f6637.f6624) {
                AbstractC8765.m13982("visitAncestors called on an unattached node");
            }
            AbstractC2961 abstractC29614 = c2287M31674.f6637.f6629;
            C2583 c2583M3906 = AbstractC2620.m3906(c2287M31674);
            loop5: while (true) {
                if (c2583M3906 == null) {
                    c2287 = null;
                    break;
                }
                if ((c2583M3906.f5439.f5628.f6630 & 1024) != 0) {
                    while (abstractC29614 != null) {
                        if ((abstractC29614.f6636 & 1024) != 0) {
                            AbstractC2961 abstractC2961M38992 = abstractC29614;
                            C2059 c20595 = null;
                            while (abstractC2961M38992 != null) {
                                if (abstractC2961M38992 instanceof C2287) {
                                    C2287 c22873 = (C2287) abstractC2961M38992;
                                    if (c22873.m3160().f4525) {
                                        c2287 = c22873;
                                        break loop5;
                                    }
                                } else if ((abstractC2961M38992.f6636 & 1024) != 0 && (abstractC2961M38992 instanceof AbstractC2623)) {
                                    int i10 = 0;
                                    for (AbstractC2961 abstractC29615 = ((AbstractC2623) abstractC2961M38992).f5571; abstractC29615 != null; abstractC29615 = abstractC29615.f6633) {
                                        if ((abstractC29615.f6636 & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                abstractC2961M38992 = abstractC29615;
                                            } else {
                                                if (c20595 == null) {
                                                    c20595 = new C2059(0, new AbstractC2961[16]);
                                                }
                                                if (abstractC2961M38992 != null) {
                                                    c20595.m2607(abstractC2961M38992);
                                                    abstractC2961M38992 = null;
                                                }
                                                c20595.m2607(abstractC29615);
                                            }
                                        }
                                    }
                                    if (i10 != 1) {
                                        abstractC2961M38992 = AbstractC2620.m3899(c20595);
                                    }
                                }
                                abstractC2961M38992 = AbstractC2620.m3899(c20595);
                            }
                        }
                        abstractC29614 = abstractC29614.f6629;
                    }
                }
                c2583M3906 = c2583M3906.m3816();
                abstractC29614 = (c2583M3906 == null || (c2646 = c2583M3906.f5439) == null) ? null : c2646.f5629;
            }
            z = false;
        } else {
            z = false;
            c2287 = null;
        }
        return Boolean.valueOf((c2287 == null || c2287 == c22872) ? z : ((Boolean) interfaceC73872.invoke(c2287)).booleanValue());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m3205(C2287 c2287) {
        C2287 c22872 = this.f4538;
        this.f4538 = c2287;
        C1091 c1091 = this.f4539;
        Object[] objArr = c1091.f1350;
        int i = c1091.f1349;
        for (int i2 = 0; i2 < i; i2++) {
            ((InterfaceC2319) objArr[i2]).mo3102(c22872, c2287);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0099, code lost:
    
        r33 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a3, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == r33) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
    
        r0 = r4.m1370(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if (r4.f1264 != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bc, code lost:
    
        if (((r4.f1268[r0 >> 3] >> ((r0 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00be, code lost:
    
        r37 = true;
        r40 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c4, code lost:
    
        r0 = r4.f1266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c6, code lost:
    
        if (r0 <= 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d7, code lost:
    
        if (java.lang.Long.compareUnsigned(((long) r4.f1265) * 32, ((long) r0) * 25) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d9, code lost:
    
        r0 = r4.f1268;
        r6 = r4.f1266;
        r12 = r4.f1267;
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
        r5 = kotlin.collections.AbstractC5179.m9386(r0);
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
        r14 = r4.m1370(r13);
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
        r4.f1264 = androidx.collection.AbstractC1137.m1446(r4.f1266) - r4.f1265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01fd, code lost:
    
        r37 = true;
        r40 = 128;
        r0 = androidx.collection.AbstractC1137.m1445(r4.f1266);
        r5 = r4.f1268;
        r6 = r4.f1267;
        r7 = r4.f1266;
        r4.m1369(r0);
        r0 = r4.f1268;
        r8 = r4.f1267;
        r9 = r4.f1266;
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
        r0 = r4.m1370(r15 >>> 7);
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
    
        r0 = r4.m1370(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x027a, code lost:
    
        r14 = r0;
        r4.f1265++;
        r0 = r4.f1264;
        r3 = r4.f1268;
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
    
        r4.f1264 = r0 - r21;
        r0 = r4.f1266;
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
    */
    public final boolean m3206(KeyEvent keyEvent) {
        int iNumberOfTrailingZeros;
        long j;
        boolean z;
        int iNumberOfTrailingZeros2;
        long jM13063 = AbstractC8137.m13063(keyEvent);
        int iM13062 = AbstractC8137.m13062(keyEvent);
        int i = -862048943;
        long j2 = 0;
        char c = '\b';
        int i2 = 0;
        ?? r21 = 0;
        boolean z2 = true;
        if (iM13062 == 2) {
            C1100 c1100 = this.f4532;
            if (c1100 == null) {
                c1100 = new C1100(3);
                this.f4532 = c1100;
            }
            C1100 c11002 = c1100;
            int iHashCode = Long.hashCode(jM13063) * (-862048943);
            int i3 = iHashCode ^ (iHashCode << 16);
            int i4 = i3 >>> 7;
            int i5 = i3 & 127;
            int i6 = c11002.f1266;
            int i7 = i4 & i6;
            int i8 = 0;
            loop0: while (true) {
                long[] jArr = c11002.f1268;
                int i9 = i7 >> 3;
                int i10 = (i7 & 7) << 3;
                long j3 = (jArr[i9] >>> i10) | ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63));
                int i11 = i;
                long j4 = i5;
                long j5 = j3 ^ (j4 * 72340172838076673L);
                long j6 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L);
                while (true) {
                    if (j6 == j2) {
                        break;
                    }
                    iNumberOfTrailingZeros2 = (i7 + (Long.numberOfTrailingZeros(j6) >> 3)) & i6;
                    long j7 = j2;
                    if (c11002.f1267[iNumberOfTrailingZeros2] == jM13063) {
                        z = true;
                        break loop0;
                    }
                    j6 &= j6 - 1;
                    j2 = j7;
                }
                i8 += 8;
                i7 = (i7 + i8) & i6;
                i = i11;
                j2 = j;
            }
            c11002.f1267[iNumberOfTrailingZeros2] = jM13063;
            return z;
        }
        if (iM13062 != 1) {
            return true;
        }
        C1100 c11003 = this.f4532;
        if (c11003 == null || !c11003.m1371(jM13063)) {
            return false;
        }
        C1100 c11004 = this.f4532;
        if (c11004 != null) {
            int iHashCode2 = Long.hashCode(jM13063) * (-862048943);
            int i12 = iHashCode2 ^ (iHashCode2 << 16);
            int i13 = i12 & 127;
            int i14 = c11004.f1266;
            int i15 = i12 >>> 7;
            loop5: while (true) {
                int i16 = i15 & i14;
                long[] jArr2 = c11004.f1268;
                int i17 = i16 >> 3;
                int i18 = (i16 & 7) << 3;
                long j8 = ((jArr2[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr2[i17] >>> i18);
                long j9 = (((long) i13) * 72340172838076673L) ^ j8;
                long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j10 == 0) {
                        break;
                    }
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i16) & i14;
                    if (c11004.f1267[iNumberOfTrailingZeros] == jM13063) {
                        break loop5;
                    }
                    j10 &= j10 - 1;
                }
                i2 += 8;
                i15 = i16 + i2;
            }
            if (iNumberOfTrailingZeros >= 0) {
                c11004.f1265--;
                long[] jArr3 = c11004.f1268;
                int i19 = c11004.f1266;
                int i20 = iNumberOfTrailingZeros >> 3;
                int i21 = (iNumberOfTrailingZeros & 7) << 3;
                long j11 = (jArr3[i20] & (~(255 << i21))) | (254 << i21);
                jArr3[i20] = j11;
                jArr3[(((iNumberOfTrailingZeros - 7) & i19) + (i19 & 7)) >> 3] = j11;
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Boolean] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m3207(final int i, boolean z) {
        C2287 c2287M3203 = m3203();
        ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = this.f4537;
        if (c2287M3203 == null || !c2287M3203.f4492 || !viewTreeObserverOnGlobalLayoutListenerC2719.m4100(i)) {
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = Boolean.FALSE;
            C2287 c2287M32032 = m3203();
            Boolean boolM3204 = m3204(i, viewTreeObserverOnGlobalLayoutListenerC2719.getEmbeddedViewFocusRect(), new InterfaceC7387() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$focusSearchSuccess$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
                @Override // p068.InterfaceC7387
                public final Boolean invoke(C2287 c2287) {
                    ref$ObjectRef.element = Boolean.valueOf(c2287.m3156(i));
                    return ref$ObjectRef.element;
                }
            });
            if (!AbstractC5227.m9466(boolM3204, Boolean.TRUE) || c2287M32032 == m3203()) {
                if (boolM3204 != null && ref$ObjectRef.element != 0) {
                    if (!boolM3204.booleanValue() || !((Boolean) ref$ObjectRef.element).booleanValue()) {
                        if ((i == 1 || i == 2) && z && m3201(i, false, false)) {
                            Boolean boolM32042 = m3204(i, null, new InterfaceC7387() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$takeFocus$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // p068.InterfaceC7387
                                public final Boolean invoke(C2287 c2287) {
                                    return Boolean.valueOf(c2287.m3156(i));
                                }
                            });
                            if (boolM32042 != null ? boolM32042.booleanValue() : false) {
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
    public final boolean m3208(final int i) {
        if (!m3201(i, false, false)) {
            return false;
        }
        Boolean boolM3204 = m3204(i, null, new InterfaceC7387() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$resetFocus$successfulReset$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public final Boolean invoke(C2287 c2287) {
                return Boolean.valueOf(c2287.m3156(i));
            }
        });
        boolean zBooleanValue = boolM3204 != null ? boolM3204.booleanValue() : false;
        if (!zBooleanValue) {
            m3200();
        }
        return zBooleanValue;
    }
}
