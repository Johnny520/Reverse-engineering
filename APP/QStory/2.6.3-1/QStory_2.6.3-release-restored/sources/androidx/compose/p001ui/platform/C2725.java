package androidx.compose.p001ui.platform;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.C1083;
import androidx.collection.C1091;
import androidx.collection.C1093;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.focus.AbstractC2316;
import androidx.compose.p001ui.focus.C2287;
import androidx.compose.p001ui.focus.C2299;
import androidx.compose.p001ui.focus.C2313;
import androidx.compose.p001ui.layout.AbstractC2516;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.C2512;
import androidx.compose.p001ui.layout.C2515;
import androidx.compose.p001ui.layout.C2535;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2518;
import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.p001ui.layout.InterfaceC2558;
import androidx.compose.p001ui.node.AbstractC2589;
import androidx.compose.p001ui.node.AbstractC2629;
import androidx.compose.p001ui.node.C2590;
import androidx.compose.p001ui.node.InterfaceC2596;
import androidx.compose.p001ui.node.InterfaceC2599;
import androidx.compose.p001ui.node.InterfaceC2608;
import androidx.compose.p001ui.node.InterfaceC2622;
import androidx.compose.p001ui.relocation.InterfaceC2761;
import androidx.compose.p001ui.semantics.InterfaceC2779;
import androidx.compose.runtime.AbstractC2181;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.C6008;
import kotlin.collections.AbstractC5171;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p122.AbstractC8137;
import p122.AbstractC8140;
import p122.InterfaceC8136;
import p128.C8157;
import p221.C8737;
import p269.AbstractC9019;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2725 extends AbstractC2961 implements InterfaceC2761, InterfaceC2596, InterfaceC8136, InterfaceC2608, InterfaceC2599, InterfaceC2622 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC2719 f5898;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public int f5897 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final InterfaceC7387 f5899 = new InterfaceC7387() { // from class: androidx.compose.ui.platform.AndroidComposeView$RootModifierNode$rulerLambda$1
        {
            super(1);
        }

        public final void invoke(InterfaceC2558 interfaceC2558) {
            C2725 c2725 = this.this$0;
            c2725.f5897 = ((AbstractC2181) c2725.f5898.getInsetsListener().f5318).m2992();
            C2725 c27252 = this.this$0;
            int i = c27252.f5897;
            ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = c27252.f5898;
            if (i > 0) {
                C1093 c1093 = AbstractC2516.f5276;
                C2590 c2590 = (C2590) interfaceC2558;
                c2590.f5501 = true;
                AbstractC2589 abstractC2589 = c2590.f5498;
                InterfaceC2530 interfaceC2530Mo3765 = abstractC2589.mo3765();
                if (C8737.m13923(c2590.f5499, 9223372034707292159L)) {
                    c2590.f5499 = AbstractC9019.m14240(interfaceC2530Mo3765.mo3644(0L));
                    c2590.f5500 = interfaceC2530Mo3765.mo3648();
                }
                abstractC2589.mo3764().f5477.m3860();
                long jMo3648 = interfaceC2530Mo3765.mo3648();
                C1083 c1083 = viewTreeObserverOnGlobalLayoutListenerC2719.getInsetsListener().f5317;
                int i2 = (int) (jMo3648 >> 32);
                int i3 = (int) (jMo3648 & 4294967295L);
                InterfaceC2518[] interfaceC2518Arr = AbstractC2516.f5275;
                int length = interfaceC2518Arr.length;
                int i4 = 0;
                while (i4 < length) {
                    InterfaceC2518 interfaceC2518 = interfaceC2518Arr[i4];
                    Object objM1317 = c1083.m1317(interfaceC2518);
                    objM1317.getClass();
                    C2512 c2512 = (C2512) objM1317;
                    InterfaceC2558 interfaceC25582 = interfaceC2558;
                    AbstractC2516.m3679(interfaceC25582, ((C2515) interfaceC2518).f5273, c2512.f5267, i2, i3);
                    if (((Boolean) ((AbstractC2182) c2512.f5265).getValue()).booleanValue()) {
                        AbstractC2516.m3679(interfaceC25582, c2512.f5261, c2512.f5271, i2, i3);
                        AbstractC2516.m3679(interfaceC25582, c2512.f5268, c2512.f5269, i2, i3);
                    }
                    AbstractC2516.m3679(interfaceC25582, ((C2515) interfaceC2518).f5272, c2512.f5270, i2, i3);
                    i4++;
                    interfaceC2558 = interfaceC25582;
                }
                InterfaceC2558 interfaceC25583 = interfaceC2558;
                C1091 c1091 = viewTreeObserverOnGlobalLayoutListenerC2719.getInsetsListener().f5315;
                if (c1091.m1438()) {
                    SnapshotStateList snapshotStateList = viewTreeObserverOnGlobalLayoutListenerC2719.getInsetsListener().f5316;
                    Object[] objArr = c1091.f1350;
                    int i5 = c1091.f1349;
                    for (int i6 = 0; i6 < i5; i6++) {
                        InterfaceC2230 interfaceC2230 = (InterfaceC2230) objArr[i6];
                        C2535 c2535 = (C2535) snapshotStateList.get(i6);
                        Rect rect = (Rect) interfaceC2230.getValue();
                        C2590 c25902 = (C2590) interfaceC25583;
                        c25902.m3855(c2535.m3682(), rect.left);
                        c25902.m3855(c2535.m3680(), rect.top);
                        c25902.m3855(c2535.m3681(), rect.right);
                        c25902.m3855(c2535.m3683(), rect.bottom);
                    }
                }
            }
        }

        @Override // p068.InterfaceC7387
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC2558) obj);
            return C6008.f15084;
        }
    };

    public C2725(ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719) {
        this.f5898 = viewTreeObserverOnGlobalLayoutListenerC2719;
    }

    @Override // androidx.compose.p001ui.relocation.InterfaceC2761
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final Object mo2135(AbstractC2629 abstractC2629, InterfaceC7372 interfaceC7372, ContinuationImpl continuationImpl) {
        long jMo3636 = abstractC2629.mo3636(0L);
        C8157 c8157 = (C8157) interfaceC7372.invoke();
        C8157 c8157M13083 = c8157 != null ? c8157.m13083(jMo3636) : null;
        if (c8157M13083 != null) {
            this.f5898.requestRectangleOnScreen(new Rect((int) c8157M13083.f19885, (int) c8157M13083.f19884, (int) c8157M13083.f19883, (int) c8157M13083.f19882), false);
        }
        return C6008.f15084;
    }

    @Override // p122.InterfaceC8136
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final boolean mo1850(KeyEvent keyEvent) {
        final C2299 c2299;
        int[] iArr = AbstractC2316.f4547;
        long jM13063 = AbstractC8137.m13063(keyEvent);
        if (AbstractC8140.m13065(jM13063, AbstractC8140.f19820)) {
            c2299 = new C2299(2);
        } else if (AbstractC8140.m13065(jM13063, AbstractC8140.f19819)) {
            c2299 = new C2299(1);
        } else if (AbstractC8140.m13065(jM13063, AbstractC8140.f19833)) {
            c2299 = new C2299(keyEvent.isShiftPressed() ? 2 : 1);
        } else {
            c2299 = AbstractC8140.m13065(jM13063, AbstractC8140.f19835) ? new C2299(4) : AbstractC8140.m13065(jM13063, AbstractC8140.f19816) ? new C2299(3) : (AbstractC8140.m13065(jM13063, AbstractC8140.f19818) || AbstractC8140.m13065(jM13063, AbstractC8140.f19805)) ? new C2299(5) : (AbstractC8140.m13065(jM13063, AbstractC8140.f19817) || AbstractC8140.m13065(jM13063, AbstractC8140.f19804)) ? new C2299(6) : (AbstractC8140.m13065(jM13063, AbstractC8140.f19834) || AbstractC8140.m13065(jM13063, AbstractC8140.f19831) || AbstractC8140.m13065(jM13063, AbstractC8140.f19815)) ? new C2299(7) : (AbstractC8140.m13065(jM13063, AbstractC8140.f19821) || AbstractC8140.m13065(jM13063, AbstractC8140.f19826)) ? new C2299(8) : null;
        }
        if (c2299 != null) {
            int i = c2299.f4506;
            if (AbstractC8137.m13062(keyEvent) == 2) {
                ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = this.f5898;
                C2287 c2287M3203 = ((C2313) viewTreeObserverOnGlobalLayoutListenerC2719.getFocusOwner()).m3203();
                if (c2287M3203 == null || !c2287M3203.f4492 || !viewTreeObserverOnGlobalLayoutListenerC2719.m4100(i)) {
                    Boolean boolM3204 = ((C2313) viewTreeObserverOnGlobalLayoutListenerC2719.getFocusOwner()).m3204(i, viewTreeObserverOnGlobalLayoutListenerC2719.getEmbeddedViewFocusRect(), new InterfaceC7387() { // from class: androidx.compose.ui.platform.AndroidComposeView$RootModifierNode$onKeyEvent$focusWasMovedOrCancelled$1
                        {
                            super(1);
                        }

                        @Override // p068.InterfaceC7387
                        public final Boolean invoke(C2287 c2287) {
                            return Boolean.valueOf(c2287.m3156(c2299.f4506));
                        }
                    });
                    if (!(boolM3204 != null ? boolM3204.booleanValue() : true)) {
                        if (i == 1 || i == 2) {
                            Integer numM3211 = AbstractC2316.m3211(i);
                            int iIntValue = numM3211 != null ? numM3211.intValue() : 2;
                            FocusFinder focusFinder = FocusFinder.getInstance();
                            View rootView = viewTreeObserverOnGlobalLayoutListenerC2719.getRootView();
                            rootView.getClass();
                            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewTreeObserverOnGlobalLayoutListenerC2719.getView(), iIntValue);
                            if (viewFindNextFocus == null || viewFindNextFocus.equals(viewTreeObserverOnGlobalLayoutListenerC2719)) {
                                return ((C2313) viewTreeObserverOnGlobalLayoutListenerC2719.getFocusOwner()).m3208(i);
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // p122.InterfaceC8136
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final boolean mo1855(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2599
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final Object mo1919() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC2492 mo1662(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
        final AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(j);
        return interfaceC2488.mo2056(abstractC2559Mo3615.f5344, abstractC2559Mo3615.f5342, AbstractC5171.m9335(), this.f5899, new InterfaceC7387() { // from class: androidx.compose.ui.platform.AndroidComposeView$RootModifierNode$measure$1
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC2543) obj);
                return C6008.f15084;
            }

            public final void invoke(AbstractC2543 abstractC2543) {
                abstractC2543.m3695(abstractC2559Mo3615, 0, 0, 0.0f);
            }
        });
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2596
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1854(InterfaceC2779 interfaceC2779) {
    }
}
