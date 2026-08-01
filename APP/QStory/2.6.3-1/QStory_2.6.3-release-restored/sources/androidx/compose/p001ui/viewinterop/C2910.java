package androidx.compose.p001ui.viewinterop;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.p001ui.layout.InterfaceC2534;
import androidx.compose.p001ui.node.C2583;
import java.util.List;
import kotlin.C6008;
import kotlin.collections.AbstractC5171;
import p068.InterfaceC7387;
import p221.C8727;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2910 implements InterfaceC2493 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C2583 f6517;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2909 f6518;

    public C2910(AbstractC2909 abstractC2909, C2583 c2583) {
        this.f6518 = abstractC2909;
        this.f6517 = c2583;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo1664(InterfaceC2534 interfaceC2534, List list, int i) {
        AbstractC2909 abstractC2909 = this.f6518;
        ViewGroup.LayoutParams layoutParams = abstractC2909.getLayoutParams();
        layoutParams.getClass();
        abstractC2909.measure(AbstractC2909.m4381(abstractC2909, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return abstractC2909.getMeasuredHeight();
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1665(InterfaceC2534 interfaceC2534, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        AbstractC2909 abstractC2909 = this.f6518;
        ViewGroup.LayoutParams layoutParams = abstractC2909.getLayoutParams();
        layoutParams.getClass();
        abstractC2909.measure(iMakeMeasureSpec, AbstractC2909.m4381(abstractC2909, 0, i, layoutParams.height));
        return abstractC2909.getMeasuredWidth();
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC2492 mo1666(InterfaceC2488 interfaceC2488, List list, long j) {
        final AbstractC2909 abstractC2909 = this.f6518;
        if (abstractC2909.getChildCount() == 0) {
            return interfaceC2488.mo2055(C8727.m13900(j), C8727.m13899(j), AbstractC5171.m9335(), new InterfaceC7387() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$1
                @Override // p068.InterfaceC7387
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((AbstractC2543) obj);
                    return C6008.f15084;
                }

                public final void invoke(AbstractC2543 abstractC2543) {
                }
            });
        }
        if (C8727.m13900(j) != 0) {
            abstractC2909.getChildAt(0).setMinimumWidth(C8727.m13900(j));
        }
        if (C8727.m13899(j) != 0) {
            abstractC2909.getChildAt(0).setMinimumHeight(C8727.m13899(j));
        }
        int iM13900 = C8727.m13900(j);
        int iM13896 = C8727.m13896(j);
        ViewGroup.LayoutParams layoutParams = abstractC2909.getLayoutParams();
        layoutParams.getClass();
        int iM4381 = AbstractC2909.m4381(abstractC2909, iM13900, iM13896, layoutParams.width);
        int iM13899 = C8727.m13899(j);
        int iM13897 = C8727.m13897(j);
        ViewGroup.LayoutParams layoutParams2 = abstractC2909.getLayoutParams();
        layoutParams2.getClass();
        abstractC2909.measure(iM4381, AbstractC2909.m4381(abstractC2909, iM13899, iM13897, layoutParams2.height));
        int measuredWidth = abstractC2909.getMeasuredWidth();
        int measuredHeight = abstractC2909.getMeasuredHeight();
        final C2583 c2583 = this.f6517;
        return interfaceC2488.mo2055(measuredWidth, measuredHeight, AbstractC5171.m9335(), new InterfaceC7387() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC2543) obj);
                return C6008.f15084;
            }

            public final void invoke(AbstractC2543 abstractC2543) {
                AbstractC2908.m4377(abstractC2909, c2583);
            }
        });
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final int mo1667(InterfaceC2534 interfaceC2534, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        AbstractC2909 abstractC2909 = this.f6518;
        ViewGroup.LayoutParams layoutParams = abstractC2909.getLayoutParams();
        layoutParams.getClass();
        abstractC2909.measure(iMakeMeasureSpec, AbstractC2909.m4381(abstractC2909, 0, i, layoutParams.height));
        return abstractC2909.getMeasuredWidth();
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final int mo1668(InterfaceC2534 interfaceC2534, List list, int i) {
        AbstractC2909 abstractC2909 = this.f6518;
        ViewGroup.LayoutParams layoutParams = abstractC2909.getLayoutParams();
        layoutParams.getClass();
        abstractC2909.measure(AbstractC2909.m4381(abstractC2909, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return abstractC2909.getMeasuredHeight();
    }
}
