package androidx.compose.p001ui.window;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.compose.p001ui.platform.AbstractC2716;
import androidx.compose.p001ui.viewinterop.C2912;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.InterfaceC2230;
import androidx.core.view.AbstractC3026;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3058;
import androidx.core.view.InterfaceC3038;
import java.util.WeakHashMap;
import kotlin.C6008;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.ui.window.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2936 extends AbstractC2716 implements InterfaceC3038 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f6573;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f6574;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f6575;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f6576;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final InterfaceC2230 f6577;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Window f6578;

    public C2936(Context context, Window window) {
        super(context);
        this.f6578 = window;
        this.f6577 = AbstractC2202.m3034(AbstractC2945.f6596);
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        AbstractC3026.m4564(this, this);
        AbstractC3103.m4802(this, new C2912(1, this));
    }

    @Override // androidx.compose.p001ui.platform.AbstractC2716
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f6573;
    }

    @Override // androidx.compose.p001ui.platform.AbstractC2716
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo4059(InterfaceC2208 interfaceC2208, final int i) {
        int i2;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(1735448596);
        if ((i & 6) == 0) {
            i2 = (c2159.m2938(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (c2159.m2903(i2 & 1, (i2 & 3) != 2)) {
            ((InterfaceC7383) ((AbstractC2182) this.f6577).getValue()).invoke(c2159, 0);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new InterfaceC7383() { // from class: androidx.compose.ui.window.DialogLayout$Content$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p068.InterfaceC7383
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
                    return C6008.f15084;
                }

                public final void invoke(InterfaceC2208 interfaceC22082, int i3) {
                    this.$tmp0_rcvr.mo4059(interfaceC22082, AbstractC2202.m3031(i | 1));
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    @Override // androidx.compose.p001ui.platform.AbstractC2716
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo4060(int i, int i2) {
        int iM4416;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.mo4060(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        Window window = this.f6578;
        if (mode != Integer.MIN_VALUE || this.f6576 || window.getAttributes().height != -2) {
            iM4416 = size2;
        } else if (this.f6575) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 30) {
                iM4416 = C2943.f6595.m4411(window);
            } else if (i3 < 32) {
                iM4416 = C2946.f6597.m4416(window);
            }
        } else {
            iM4416 = size2 + 1;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i4 = size - paddingRight;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = iM4416 - paddingBottom;
        int i6 = i5 >= 0 ? i5 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
        if (this.f6575 || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.f6576) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // androidx.compose.p001ui.platform.AbstractC2716
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo4061(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // androidx.core.view.InterfaceC3038
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public final C3058 mo863(View view, C3058 c3058) {
        if (!this.f6575) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return c3058.f6866.mo4609(iMax, iMax2, iMax3, iMax4);
            }
        }
        return c3058;
    }
}
