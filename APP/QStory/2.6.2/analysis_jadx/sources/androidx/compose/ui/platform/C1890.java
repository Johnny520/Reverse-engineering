package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.C0236;
import androidx.collection.C0244;
import androidx.collection.C0246;
import androidx.compose.runtime.AbstractC1346;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.focus.AbstractC1481;
import androidx.compose.ui.focus.C1452;
import androidx.compose.ui.focus.C1464;
import androidx.compose.ui.focus.C1478;
import androidx.compose.ui.layout.AbstractC1681;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.C1677;
import androidx.compose.ui.layout.C1680;
import androidx.compose.ui.layout.C1700;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1683;
import androidx.compose.ui.layout.InterfaceC1695;
import androidx.compose.ui.layout.InterfaceC1723;
import androidx.compose.ui.node.AbstractC1754;
import androidx.compose.ui.node.AbstractC1794;
import androidx.compose.ui.node.C1755;
import androidx.compose.ui.node.InterfaceC1761;
import androidx.compose.ui.node.InterfaceC1764;
import androidx.compose.ui.node.InterfaceC1773;
import androidx.compose.ui.node.InterfaceC1787;
import androidx.compose.ui.relocation.InterfaceC1926;
import androidx.compose.ui.semantics.InterfaceC1944;
import kotlin.C5175;
import kotlin.collections.AbstractC4338;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p106.AbstractC7307;
import p106.AbstractC7310;
import p106.InterfaceC7306;
import p112.C7327;
import p175.AbstractC7738;
import p205.C7907;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1890 extends AbstractC2128 implements InterfaceC1926, InterfaceC1761, InterfaceC7306, InterfaceC1773, InterfaceC1764, InterfaceC1787 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1884 f5552;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public int f5551 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final InterfaceC6557 f5553 = new InterfaceC6557() { // from class: androidx.compose.ui.platform.AndroidComposeView$RootModifierNode$rulerLambda$1
        {
            super(1);
        }

        public final void invoke(InterfaceC1723 interfaceC1723) {
            C1890 c1890 = this.this$0;
            c1890.f5551 = ((AbstractC1346) c1890.f5552.getInsetsListener().f4972).m2422();
            C1890 c18902 = this.this$0;
            int i = c18902.f5551;
            ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = c18902.f5552;
            if (i > 0) {
                C0246 c0246 = AbstractC1681.f4930;
                C1755 c1755 = (C1755) interfaceC1723;
                c1755.f5155 = true;
                AbstractC1754 abstractC1754 = c1755.f5152;
                InterfaceC1695 interfaceC1695Mo3195 = abstractC1754.mo3195();
                if (C7907.m13336(c1755.f5153, 9223372034707292159L)) {
                    c1755.f5153 = AbstractC7738.m13022(interfaceC1695Mo3195.mo3074(0L));
                    c1755.f5154 = interfaceC1695Mo3195.mo3078();
                }
                abstractC1754.mo3194().f5131.m3290();
                long jMo3078 = interfaceC1695Mo3195.mo3078();
                C0236 c0236 = viewTreeObserverOnGlobalLayoutListenerC1884.getInsetsListener().f4971;
                int i2 = (int) (jMo3078 >> 32);
                int i3 = (int) (jMo3078 & 4294967295L);
                InterfaceC1683[] interfaceC1683Arr = AbstractC1681.f4929;
                int length = interfaceC1683Arr.length;
                int i4 = 0;
                while (i4 < length) {
                    InterfaceC1683 interfaceC1683 = interfaceC1683Arr[i4];
                    Object objM756 = c0236.m756(interfaceC1683);
                    objM756.getClass();
                    C1677 c1677 = (C1677) objM756;
                    InterfaceC1723 interfaceC17232 = interfaceC1723;
                    AbstractC1681.m3109(interfaceC17232, ((C1680) interfaceC1683).f4927, c1677.f4921, i2, i3);
                    if (((Boolean) ((AbstractC1347) c1677.f4919).getValue()).booleanValue()) {
                        AbstractC1681.m3109(interfaceC17232, c1677.f4915, c1677.f4925, i2, i3);
                        AbstractC1681.m3109(interfaceC17232, c1677.f4922, c1677.f4923, i2, i3);
                    }
                    AbstractC1681.m3109(interfaceC17232, ((C1680) interfaceC1683).f4926, c1677.f4924, i2, i3);
                    i4++;
                    interfaceC1723 = interfaceC17232;
                }
                InterfaceC1723 interfaceC17233 = interfaceC1723;
                C0244 c0244 = viewTreeObserverOnGlobalLayoutListenerC1884.getInsetsListener().f4969;
                if (c0244.m877()) {
                    SnapshotStateList snapshotStateList = viewTreeObserverOnGlobalLayoutListenerC1884.getInsetsListener().f4970;
                    Object[] objArr = c0244.f1005;
                    int i5 = c0244.f1004;
                    for (int i6 = 0; i6 < i5; i6++) {
                        InterfaceC1395 interfaceC1395 = (InterfaceC1395) objArr[i6];
                        C1700 c1700 = (C1700) snapshotStateList.get(i6);
                        Rect rect = (Rect) interfaceC1395.getValue();
                        C1755 c17552 = (C1755) interfaceC17233;
                        c17552.m3285(c1700.m3112(), rect.left);
                        c17552.m3285(c1700.m3110(), rect.top);
                        c17552.m3285(c1700.m3111(), rect.right);
                        c17552.m3285(c1700.m3113(), rect.bottom);
                    }
                }
            }
        }

        @Override // p052.InterfaceC6557
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC1723) obj);
            return C5175.f14739;
        }
    };

    public C1890(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884) {
        this.f5552 = viewTreeObserverOnGlobalLayoutListenerC1884;
    }

    @Override // androidx.compose.ui.relocation.InterfaceC1926
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final Object mo1565(AbstractC1794 abstractC1794, InterfaceC6542 interfaceC6542, ContinuationImpl continuationImpl) {
        long jMo3066 = abstractC1794.mo3066(0L);
        C7327 c7327 = (C7327) interfaceC6542.invoke();
        C7327 c7327M12497 = c7327 != null ? c7327.m12497(jMo3066) : null;
        if (c7327M12497 != null) {
            this.f5552.requestRectangleOnScreen(new Rect((int) c7327M12497.f19545, (int) c7327M12497.f19544, (int) c7327M12497.f19543, (int) c7327M12497.f19542), false);
        }
        return C5175.f14739;
    }

    @Override // p106.InterfaceC7306
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final boolean mo1280(KeyEvent keyEvent) {
        final C1464 c1464;
        int[] iArr = AbstractC1481.f4201;
        long jM12477 = AbstractC7307.m12477(keyEvent);
        if (AbstractC7310.m12479(jM12477, AbstractC7310.f19480)) {
            c1464 = new C1464(2);
        } else if (AbstractC7310.m12479(jM12477, AbstractC7310.f19479)) {
            c1464 = new C1464(1);
        } else if (AbstractC7310.m12479(jM12477, AbstractC7310.f19493)) {
            c1464 = new C1464(keyEvent.isShiftPressed() ? 2 : 1);
        } else {
            c1464 = AbstractC7310.m12479(jM12477, AbstractC7310.f19495) ? new C1464(4) : AbstractC7310.m12479(jM12477, AbstractC7310.f19476) ? new C1464(3) : (AbstractC7310.m12479(jM12477, AbstractC7310.f19478) || AbstractC7310.m12479(jM12477, AbstractC7310.f19465)) ? new C1464(5) : (AbstractC7310.m12479(jM12477, AbstractC7310.f19477) || AbstractC7310.m12479(jM12477, AbstractC7310.f19464)) ? new C1464(6) : (AbstractC7310.m12479(jM12477, AbstractC7310.f19494) || AbstractC7310.m12479(jM12477, AbstractC7310.f19491) || AbstractC7310.m12479(jM12477, AbstractC7310.f19475)) ? new C1464(7) : (AbstractC7310.m12479(jM12477, AbstractC7310.f19481) || AbstractC7310.m12479(jM12477, AbstractC7310.f19486)) ? new C1464(8) : null;
        }
        if (c1464 != null) {
            int i = c1464.f4160;
            if (AbstractC7307.m12476(keyEvent) == 2) {
                ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = this.f5552;
                C1452 c1452M2633 = ((C1478) viewTreeObserverOnGlobalLayoutListenerC1884.getFocusOwner()).m2633();
                if (c1452M2633 == null || !c1452M2633.f4146 || !viewTreeObserverOnGlobalLayoutListenerC1884.m3530(i)) {
                    Boolean boolM2634 = ((C1478) viewTreeObserverOnGlobalLayoutListenerC1884.getFocusOwner()).m2634(i, viewTreeObserverOnGlobalLayoutListenerC1884.getEmbeddedViewFocusRect(), new InterfaceC6557() { // from class: androidx.compose.ui.platform.AndroidComposeView$RootModifierNode$onKeyEvent$focusWasMovedOrCancelled$1
                        {
                            super(1);
                        }

                        @Override // p052.InterfaceC6557
                        public final Boolean invoke(C1452 c1452) {
                            return Boolean.valueOf(c1452.m2586(c1464.f4160));
                        }
                    });
                    if (!(boolM2634 != null ? boolM2634.booleanValue() : true)) {
                        if (i == 1 || i == 2) {
                            Integer numM2641 = AbstractC1481.m2641(i);
                            int iIntValue = numM2641 != null ? numM2641.intValue() : 2;
                            FocusFinder focusFinder = FocusFinder.getInstance();
                            View rootView = viewTreeObserverOnGlobalLayoutListenerC1884.getRootView();
                            rootView.getClass();
                            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewTreeObserverOnGlobalLayoutListenerC1884.getView(), iIntValue);
                            if (viewFindNextFocus == null || viewFindNextFocus.equals(viewTreeObserverOnGlobalLayoutListenerC1884)) {
                                return ((C1478) viewTreeObserverOnGlobalLayoutListenerC1884.getFocusOwner()).m2638(i);
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // p106.InterfaceC7306
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final boolean mo1285(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1764
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final Object mo1349() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1101(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        final AbstractC1724 abstractC1724Mo3045 = interfaceC1655.mo3045(j);
        return interfaceC1653.mo1486(abstractC1724Mo3045.f4998, abstractC1724Mo3045.f4996, AbstractC4338.m8781(), this.f5553, new InterfaceC6557() { // from class: androidx.compose.ui.platform.AndroidComposeView$RootModifierNode$measure$1
            {
                super(1);
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC1708) obj);
                return C5175.f14739;
            }

            public final void invoke(AbstractC1708 abstractC1708) {
                abstractC1708.m3125(abstractC1724Mo3045, 0, 0, 0.0f);
            }
        });
    }

    @Override // androidx.compose.ui.node.InterfaceC1761
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1284(InterfaceC1944 interfaceC1944) {
    }
}
