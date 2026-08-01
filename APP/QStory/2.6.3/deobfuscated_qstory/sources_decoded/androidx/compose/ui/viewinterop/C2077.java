package androidx.compose.ui.viewinterop;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1658;
import androidx.compose.ui.layout.InterfaceC1699;
import androidx.compose.ui.node.C1748;
import java.util.List;
import kotlin.C5176;
import kotlin.collections.AbstractC4339;
import p052.InterfaceC6558;
import p205.C7898;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2077 implements InterfaceC1658 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C1748 f6172;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2076 f6173;

    public C2077(AbstractC2076 abstractC2076, C1748 c1748) {
        this.f6173 = abstractC2076;
        this.f6172 = c1748;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo1104(InterfaceC1699 interfaceC1699, List list, int i) {
        AbstractC2076 abstractC2076 = this.f6173;
        ViewGroup.LayoutParams layoutParams = abstractC2076.getLayoutParams();
        layoutParams.getClass();
        abstractC2076.measure(AbstractC2076.m3821(abstractC2076, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return abstractC2076.getMeasuredHeight();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1105(InterfaceC1699 interfaceC1699, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        AbstractC2076 abstractC2076 = this.f6173;
        ViewGroup.LayoutParams layoutParams = abstractC2076.getLayoutParams();
        layoutParams.getClass();
        abstractC2076.measure(iMakeMeasureSpec, AbstractC2076.m3821(abstractC2076, 0, i, layoutParams.height));
        return abstractC2076.getMeasuredWidth();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1657 mo1106(InterfaceC1653 interfaceC1653, List list, long j) {
        final AbstractC2076 abstractC2076 = this.f6173;
        if (abstractC2076.getChildCount() == 0) {
            return interfaceC1653.mo1495(C7898.m13341(j), C7898.m13340(j), AbstractC4339.m8776(), new InterfaceC6558() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$1
                @Override // p052.InterfaceC6558
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((AbstractC1708) obj);
                    return C5176.f14739;
                }

                public final void invoke(AbstractC1708 abstractC1708) {
                }
            });
        }
        if (C7898.m13341(j) != 0) {
            abstractC2076.getChildAt(0).setMinimumWidth(C7898.m13341(j));
        }
        if (C7898.m13340(j) != 0) {
            abstractC2076.getChildAt(0).setMinimumHeight(C7898.m13340(j));
        }
        int iM13341 = C7898.m13341(j);
        int iM13337 = C7898.m13337(j);
        ViewGroup.LayoutParams layoutParams = abstractC2076.getLayoutParams();
        layoutParams.getClass();
        int iM3821 = AbstractC2076.m3821(abstractC2076, iM13341, iM13337, layoutParams.width);
        int iM13340 = C7898.m13340(j);
        int iM13338 = C7898.m13338(j);
        ViewGroup.LayoutParams layoutParams2 = abstractC2076.getLayoutParams();
        layoutParams2.getClass();
        abstractC2076.measure(iM3821, AbstractC2076.m3821(abstractC2076, iM13340, iM13338, layoutParams2.height));
        int measuredWidth = abstractC2076.getMeasuredWidth();
        int measuredHeight = abstractC2076.getMeasuredHeight();
        final C1748 c1748 = this.f6172;
        return interfaceC1653.mo1495(measuredWidth, measuredHeight, AbstractC4339.m8776(), new InterfaceC6558() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC1708) obj);
                return C5176.f14739;
            }

            public final void invoke(AbstractC1708 abstractC1708) {
                AbstractC2075.m3817(abstractC2076, c1748);
            }
        });
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final int mo1107(InterfaceC1699 interfaceC1699, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        AbstractC2076 abstractC2076 = this.f6173;
        ViewGroup.LayoutParams layoutParams = abstractC2076.getLayoutParams();
        layoutParams.getClass();
        abstractC2076.measure(iMakeMeasureSpec, AbstractC2076.m3821(abstractC2076, 0, i, layoutParams.height));
        return abstractC2076.getMeasuredWidth();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final int mo1108(InterfaceC1699 interfaceC1699, List list, int i) {
        AbstractC2076 abstractC2076 = this.f6173;
        ViewGroup.LayoutParams layoutParams = abstractC2076.getLayoutParams();
        layoutParams.getClass();
        abstractC2076.measure(AbstractC2076.m3821(abstractC2076, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return abstractC2076.getMeasuredHeight();
    }
}
