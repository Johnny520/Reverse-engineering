package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.activity.AbstractC0053;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.AbstractC1372;
import androidx.compose.runtime.C1314;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1765;
import androidx.compose.ui.node.InterfaceC1784;
import androidx.compose.ui.node.InterfaceC1801;
import androidx.compose.ui.platform.AbstractC1835;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.InterfaceC2388;
import io.ktor.util.C4211;
import kotlin.C5176;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p116.AbstractC7348;
import p116.InterfaceC7345;
import p142.InterfaceC7537;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2084 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC6558 f6182 = new InterfaceC6558() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$NoOpUpdate$1
        @Override // p052.InterfaceC6558
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return C5176.f14739;
        }

        public final void invoke(View view) {
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final void m3823(InterfaceC1373 interfaceC1373, InterfaceC2129 interfaceC2129, int i, InterfaceC7896 interfaceC7896, InterfaceC2388 interfaceC2388, InterfaceC7537 interfaceC7537, LayoutDirection layoutDirection, C1253 c1253) {
        InterfaceC1784.f5222.getClass();
        AbstractC1367.m2472(interfaceC1373, c1253, C1765.f5182);
        AbstractC1367.m2472(interfaceC1373, interfaceC2129, new InterfaceC6554() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$1
            @Override // p052.InterfaceC6554
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((C1748) obj, (InterfaceC2129) obj2);
                return C5176.f14739;
            }

            public final void invoke(C1748 c1748, InterfaceC2129 interfaceC21292) {
                AbstractC2084.m3825(c1748).setModifier(interfaceC21292);
            }
        });
        AbstractC1367.m2472(interfaceC1373, interfaceC7896, new InterfaceC6554() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$2
            @Override // p052.InterfaceC6554
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((C1748) obj, (InterfaceC7896) obj2);
                return C5176.f14739;
            }

            public final void invoke(C1748 c1748, InterfaceC7896 interfaceC78962) {
                AbstractC2084.m3825(c1748).setDensity(interfaceC78962);
            }
        });
        AbstractC1367.m2472(interfaceC1373, interfaceC2388, new InterfaceC6554() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$3
            @Override // p052.InterfaceC6554
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((C1748) obj, (InterfaceC2388) obj2);
                return C5176.f14739;
            }

            public final void invoke(C1748 c1748, InterfaceC2388 interfaceC23882) {
                AbstractC2084.m3825(c1748).setLifecycleOwner(interfaceC23882);
            }
        });
        AbstractC1367.m2472(interfaceC1373, interfaceC7537, new InterfaceC6554() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$4
            @Override // p052.InterfaceC6554
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((C1748) obj, (InterfaceC7537) obj2);
                return C5176.f14739;
            }

            public final void invoke(C1748 c1748, InterfaceC7537 interfaceC75372) {
                AbstractC2084.m3825(c1748).setSavedStateRegistryOwner(interfaceC75372);
            }
        });
        AbstractC1367.m2472(interfaceC1373, layoutDirection, new InterfaceC6554() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$5
            public final void invoke(C1748 c1748, LayoutDirection layoutDirection2) {
                ViewFactoryHolder viewFactoryHolderM3825 = AbstractC2084.m3825(c1748);
                int i2 = AbstractC2074.f6143[layoutDirection2.ordinal()];
                int i3 = 1;
                if (i2 == 1) {
                    i3 = 0;
                } else if (i2 != 2) {
                    C4211.m8611();
                    return;
                }
                viewFactoryHolderM3825.setLayoutDirection(i3);
            }

            @Override // p052.InterfaceC6554
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((C1748) obj, (LayoutDirection) obj2);
                return C5176.f14739;
            }
        });
        AbstractC1367.m2472(interfaceC1373, Integer.valueOf(i), C1765.f5188);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC6543 m3824(final InterfaceC6558 interfaceC6558, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        final int iHashCode = Long.hashCode(c1324.f3837);
        final Context context = (Context) c1324.m2383(AbstractC1835.f5336);
        final C1314 c1314M2480 = AbstractC1367.m2480(c1324);
        final InterfaceC7345 interfaceC7345 = (InterfaceC7345) c1324.m2383(AbstractC7348.f19574);
        final View view = (View) c1324.m2383(AbstractC1835.f5332);
        boolean zM2378 = ((((i & 14) ^ 6) > 4 && c1324.m2360(interfaceC6558)) || (i & 6) == 4) | c1324.m2378(context) | c1324.m2378(c1314M2480) | c1324.m2378(interfaceC7345) | c1324.m2362(iHashCode) | c1324.m2378(view);
        Object objM2345 = c1324.m2345();
        if (zM2378 || objM2345 == C1369.f3974) {
            InterfaceC6543 interfaceC6543 = new InterfaceC6543() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$createAndroidViewNodeFactory$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p052.InterfaceC6543
                public final C1748 invoke() {
                    Context context2 = context;
                    InterfaceC6558 interfaceC65582 = interfaceC6558;
                    AbstractC1372 abstractC1372 = c1314M2480;
                    InterfaceC7345 interfaceC73452 = interfaceC7345;
                    int i2 = iHashCode;
                    KeyEvent.Callback callback = view;
                    callback.getClass();
                    return new ViewFactoryHolder(context2, interfaceC65582, abstractC1372, interfaceC73452, i2, (InterfaceC1801) callback).getLayoutNode();
                }
            };
            c1324.m2386(interfaceC6543);
            objM2345 = interfaceC6543;
        }
        return (InterfaceC6543) objM2345;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final ViewFactoryHolder m3825(C1748 c1748) {
        AbstractC2076 abstractC2076 = c1748.f5116;
        if (abstractC2076 != null) {
            return (ViewFactoryHolder) abstractC2076;
        }
        throw AbstractC0053.m139("Required value was null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m3826(final p052.InterfaceC6558 r17, androidx.compose.ui.InterfaceC2129 r18, p052.InterfaceC6558 r19, p052.InterfaceC6558 r20, p052.InterfaceC6558 r21, androidx.compose.runtime.InterfaceC1373 r22, final int r23, final int r24) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AbstractC2084.m3826(飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, androidx.compose.ui.飘花落叶言子楪哲苏兰世, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, androidx.compose.runtime.飘花落叶言子楪苏哲世兰, int, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m3827(final InterfaceC6558 interfaceC6558, InterfaceC2129 interfaceC2129, InterfaceC6558 interfaceC65582, InterfaceC1373 interfaceC1373, final int i, final int i2) {
        int i3;
        final InterfaceC2129 interfaceC21292;
        final InterfaceC6558 interfaceC65583;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(-1783766393);
        if ((i & 6) == 0) {
            i3 = (c1324.m2378(interfaceC6558) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= c1324.m2360(interfaceC2129) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= c1324.m2378(interfaceC65582) ? 256 : 128;
        }
        if (c1324.m2343(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                interfaceC2129 = C2125.f6276;
            }
            InterfaceC2129 interfaceC21293 = interfaceC2129;
            InterfaceC6558 interfaceC65584 = f6182;
            InterfaceC6558 interfaceC65585 = i5 != 0 ? interfaceC65584 : interfaceC65582;
            m3826(interfaceC6558, interfaceC21293, null, interfaceC65584, interfaceC65585, c1324, (i3 & 14) | 3072 | (i3 & 112) | (57344 & (i3 << 6)), 4);
            interfaceC21292 = interfaceC21293;
            interfaceC65583 = interfaceC65585;
        } else {
            c1324.m2339();
            interfaceC21292 = interfaceC2129;
            interfaceC65583 = interfaceC65582;
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new InterfaceC6554() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(InterfaceC1373 interfaceC13732, int i6) {
                    AbstractC2084.m3827(interfaceC6558, interfaceC21292, interfaceC65583, interfaceC13732, AbstractC1367.m2471(i | 1), i2);
                }

                @Override // p052.InterfaceC6554
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
                    return C5176.f14739;
                }
            };
        }
    }
}
