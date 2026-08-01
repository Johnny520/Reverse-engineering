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
import kotlin.C5176;
import kotlin.collections.AbstractC4339;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p106.AbstractC7308;
import p106.AbstractC7311;
import p106.InterfaceC7307;
import p112.C7328;
import p205.C7908;
import p253.AbstractC8190;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1890 extends AbstractC2128 implements InterfaceC1926, InterfaceC1761, InterfaceC7307, InterfaceC1773, InterfaceC1764, InterfaceC1787 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1884 f5553;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public int f5552 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final InterfaceC6558 f5554 = new InterfaceC6558() { // from class: androidx.compose.ui.platform.AndroidComposeView$RootModifierNode$rulerLambda$1
        {
            super(1);
        }

        public final void invoke(InterfaceC1723 interfaceC1723) {
            C1890 c1890 = this.this$0;
            c1890.f5552 = ((AbstractC1346) c1890.f5553.getInsetsListener().f4973).m2432();
            C1890 c18902 = this.this$0;
            int i = c18902.f5552;
            ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = c18902.f5553;
            if (i > 0) {
                C0246 c0246 = AbstractC1681.f4931;
                C1755 c1755 = (C1755) interfaceC1723;
                c1755.f5156 = true;
                AbstractC1754 abstractC1754 = c1755.f5153;
                InterfaceC1695 interfaceC1695Mo3205 = abstractC1754.mo3205();
                if (C7908.m13364(c1755.f5154, 9223372034707292159L)) {
                    c1755.f5154 = AbstractC8190.m13681(interfaceC1695Mo3205.mo3084(0L));
                    c1755.f5155 = interfaceC1695Mo3205.mo3088();
                }
                abstractC1754.mo3204().f5132.m3300();
                long jMo3088 = interfaceC1695Mo3205.mo3088();
                C0236 c0236 = viewTreeObserverOnGlobalLayoutListenerC1884.getInsetsListener().f4972;
                int i2 = (int) (jMo3088 >> 32);
                int i3 = (int) (jMo3088 & 4294967295L);
                InterfaceC1683[] interfaceC1683Arr = AbstractC1681.f4930;
                int length = interfaceC1683Arr.length;
                int i4 = 0;
                while (i4 < length) {
                    InterfaceC1683 interfaceC1683 = interfaceC1683Arr[i4];
                    Object objM757 = c0236.m757(interfaceC1683);
                    objM757.getClass();
                    C1677 c1677 = (C1677) objM757;
                    InterfaceC1723 interfaceC17232 = interfaceC1723;
                    AbstractC1681.m3119(interfaceC17232, ((C1680) interfaceC1683).f4928, c1677.f4922, i2, i3);
                    if (((Boolean) ((AbstractC1347) c1677.f4920).getValue()).booleanValue()) {
                        AbstractC1681.m3119(interfaceC17232, c1677.f4916, c1677.f4926, i2, i3);
                        AbstractC1681.m3119(interfaceC17232, c1677.f4923, c1677.f4924, i2, i3);
                    }
                    AbstractC1681.m3119(interfaceC17232, ((C1680) interfaceC1683).f4927, c1677.f4925, i2, i3);
                    i4++;
                    interfaceC1723 = interfaceC17232;
                }
                InterfaceC1723 interfaceC17233 = interfaceC1723;
                C0244 c0244 = viewTreeObserverOnGlobalLayoutListenerC1884.getInsetsListener().f4970;
                if (c0244.m878()) {
                    SnapshotStateList snapshotStateList = viewTreeObserverOnGlobalLayoutListenerC1884.getInsetsListener().f4971;
                    Object[] objArr = c0244.f1005;
                    int i5 = c0244.f1004;
                    for (int i6 = 0; i6 < i5; i6++) {
                        InterfaceC1395 interfaceC1395 = (InterfaceC1395) objArr[i6];
                        C1700 c1700 = (C1700) snapshotStateList.get(i6);
                        Rect rect = (Rect) interfaceC1395.getValue();
                        C1755 c17552 = (C1755) interfaceC17233;
                        c17552.m3295(c1700.m3122(), rect.left);
                        c17552.m3295(c1700.m3120(), rect.top);
                        c17552.m3295(c1700.m3121(), rect.right);
                        c17552.m3295(c1700.m3123(), rect.bottom);
                    }
                }
            }
        }

        @Override // p052.InterfaceC6558
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC1723) obj);
            return C5176.f14739;
        }
    };

    public C1890(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884) {
        this.f5553 = viewTreeObserverOnGlobalLayoutListenerC1884;
    }

    @Override // androidx.compose.ui.relocation.InterfaceC1926
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final Object mo1575(AbstractC1794 abstractC1794, InterfaceC6543 interfaceC6543, ContinuationImpl continuationImpl) {
        long jMo3076 = abstractC1794.mo3076(0L);
        C7328 c7328 = (C7328) interfaceC6543.invoke();
        C7328 c7328M12524 = c7328 != null ? c7328.m12524(jMo3076) : null;
        if (c7328M12524 != null) {
            this.f5553.requestRectangleOnScreen(new Rect((int) c7328M12524.f19540, (int) c7328M12524.f19539, (int) c7328M12524.f19538, (int) c7328M12524.f19537), false);
        }
        return C5176.f14739;
    }

    @Override // p106.InterfaceC7307
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final boolean mo1290(KeyEvent keyEvent) {
        final C1464 c1464;
        int[] iArr = AbstractC1481.f4202;
        long jM12504 = AbstractC7308.m12504(keyEvent);
        if (AbstractC7311.m12506(jM12504, AbstractC7311.f19475)) {
            c1464 = new C1464(2);
        } else if (AbstractC7311.m12506(jM12504, AbstractC7311.f19474)) {
            c1464 = new C1464(1);
        } else if (AbstractC7311.m12506(jM12504, AbstractC7311.f19488)) {
            c1464 = new C1464(keyEvent.isShiftPressed() ? 2 : 1);
        } else {
            c1464 = AbstractC7311.m12506(jM12504, AbstractC7311.f19490) ? new C1464(4) : AbstractC7311.m12506(jM12504, AbstractC7311.f19471) ? new C1464(3) : (AbstractC7311.m12506(jM12504, AbstractC7311.f19473) || AbstractC7311.m12506(jM12504, AbstractC7311.f19460)) ? new C1464(5) : (AbstractC7311.m12506(jM12504, AbstractC7311.f19472) || AbstractC7311.m12506(jM12504, AbstractC7311.f19459)) ? new C1464(6) : (AbstractC7311.m12506(jM12504, AbstractC7311.f19489) || AbstractC7311.m12506(jM12504, AbstractC7311.f19486) || AbstractC7311.m12506(jM12504, AbstractC7311.f19470)) ? new C1464(7) : (AbstractC7311.m12506(jM12504, AbstractC7311.f19476) || AbstractC7311.m12506(jM12504, AbstractC7311.f19481)) ? new C1464(8) : null;
        }
        if (c1464 != null) {
            int i = c1464.f4161;
            if (AbstractC7308.m12503(keyEvent) == 2) {
                ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = this.f5553;
                C1452 c1452M2643 = ((C1478) viewTreeObserverOnGlobalLayoutListenerC1884.getFocusOwner()).m2643();
                if (c1452M2643 == null || !c1452M2643.f4147 || !viewTreeObserverOnGlobalLayoutListenerC1884.m3540(i)) {
                    Boolean boolM2644 = ((C1478) viewTreeObserverOnGlobalLayoutListenerC1884.getFocusOwner()).m2644(i, viewTreeObserverOnGlobalLayoutListenerC1884.getEmbeddedViewFocusRect(), new InterfaceC6558() { // from class: androidx.compose.ui.platform.AndroidComposeView$RootModifierNode$onKeyEvent$focusWasMovedOrCancelled$1
                        {
                            super(1);
                        }

                        @Override // p052.InterfaceC6558
                        public final Boolean invoke(C1452 c1452) {
                            return Boolean.valueOf(c1452.m2596(c1464.f4161));
                        }
                    });
                    if (!(boolM2644 != null ? boolM2644.booleanValue() : true)) {
                        if (i == 1 || i == 2) {
                            Integer numM2651 = AbstractC1481.m2651(i);
                            int iIntValue = numM2651 != null ? numM2651.intValue() : 2;
                            FocusFinder focusFinder = FocusFinder.getInstance();
                            View rootView = viewTreeObserverOnGlobalLayoutListenerC1884.getRootView();
                            rootView.getClass();
                            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewTreeObserverOnGlobalLayoutListenerC1884.getView(), iIntValue);
                            if (viewFindNextFocus == null || viewFindNextFocus.equals(viewTreeObserverOnGlobalLayoutListenerC1884)) {
                                return ((C1478) viewTreeObserverOnGlobalLayoutListenerC1884.getFocusOwner()).m2648(i);
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // p106.InterfaceC7307
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final boolean mo1295(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1764
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final Object mo1359() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1102(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        final AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(j);
        return interfaceC1653.mo1496(abstractC1724Mo3055.f4999, abstractC1724Mo3055.f4997, AbstractC4339.m8776(), this.f5554, new InterfaceC6558() { // from class: androidx.compose.ui.platform.AndroidComposeView$RootModifierNode$measure$1
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC1708) obj);
                return C5176.f14739;
            }

            public final void invoke(AbstractC1708 abstractC1708) {
                abstractC1708.m3135(abstractC1724Mo3055, 0, 0, 0.0f);
            }
        });
    }

    @Override // androidx.compose.ui.node.InterfaceC1761
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1294(InterfaceC1944 interfaceC1944) {
    }
}
