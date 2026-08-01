package androidx.compose.ui.window;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.platform.AbstractC1881;
import androidx.compose.ui.viewinterop.C2079;
import androidx.core.view.AbstractC2193;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2225;
import androidx.core.view.InterfaceC2205;
import java.util.WeakHashMap;
import kotlin.C5176;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.ui.window.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2103 extends AbstractC1881 implements InterfaceC2205 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f6228;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f6229;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f6230;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f6231;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final InterfaceC1395 f6232;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Window f6233;

    public C2103(Context context, Window window) {
        super(context);
        this.f6233 = window;
        this.f6232 = AbstractC1367.m2474(AbstractC2112.f6251);
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        AbstractC2193.m4004(this, this);
        AbstractC2270.m4242(this, new C2079(1, this));
    }

    @Override // androidx.compose.ui.platform.AbstractC1881
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f6228;
    }

    @Override // androidx.compose.ui.platform.AbstractC1881
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo3499(InterfaceC1373 interfaceC1373, final int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(1735448596);
        if ((i & 6) == 0) {
            i2 = (c1324.m2378(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (c1324.m2343(i2 & 1, (i2 & 3) != 2)) {
            ((InterfaceC6554) ((AbstractC1347) this.f6232).getValue()).invoke(c1324, 0);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new InterfaceC6554() { // from class: androidx.compose.ui.window.DialogLayout$Content$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p052.InterfaceC6554
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
                    return C5176.f14739;
                }

                public final void invoke(InterfaceC1373 interfaceC13732, int i3) {
                    this.$tmp0_rcvr.mo3499(interfaceC13732, AbstractC1367.m2471(i | 1));
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    @Override // androidx.compose.ui.platform.AbstractC1881
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo3500(int r13, int r14) {
        /*
            r12 = this;
            r0 = 0
            android.view.View r1 = r12.getChildAt(r0)
            if (r1 != 0) goto Lb
            super.mo3500(r13, r14)
            return
        Lb:
            int r2 = android.view.View.MeasureSpec.getSize(r13)
            int r3 = android.view.View.MeasureSpec.getSize(r14)
            int r4 = android.view.View.MeasureSpec.getMode(r14)
            r5 = -2
            android.view.Window r6 = r12.f6233
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r7) goto L49
            boolean r8 = r12.f6231
            if (r8 != 0) goto L49
            android.view.WindowManager$LayoutParams r8 = r6.getAttributes()
            int r8 = r8.height
            if (r8 != r5) goto L49
            boolean r8 = r12.f6230
            if (r8 == 0) goto L46
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 30
            if (r8 >= r9) goto L3b
            androidx.compose.ui.window.飘花落叶言子楪苏世哲兰 r8 = androidx.compose.ui.window.C2110.f6250
            int r8 = r8.m3851(r6)
            goto L4a
        L3b:
            r9 = 32
            if (r8 >= r9) goto L49
            androidx.compose.ui.window.飘花落叶言子楪苏哲世兰 r8 = androidx.compose.ui.window.C2113.f6252
            int r8 = r8.m3856(r6)
            goto L4a
        L46:
            int r8 = r3 + 1
            goto L4a
        L49:
            r8 = r3
        L4a:
            int r9 = r12.getPaddingLeft()
            int r10 = r12.getPaddingRight()
            int r10 = r10 + r9
            int r9 = r12.getPaddingTop()
            int r11 = r12.getPaddingBottom()
            int r11 = r11 + r9
            int r9 = r2 - r10
            if (r9 >= 0) goto L61
            r9 = r0
        L61:
            int r8 = r8 - r11
            if (r8 >= 0) goto L65
            goto L66
        L65:
            r0 = r8
        L66:
            int r8 = android.view.View.MeasureSpec.getMode(r13)
            if (r8 != 0) goto L6d
            goto L71
        L6d:
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r7)
        L71:
            if (r4 != 0) goto L74
            goto L78
        L74:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r7)
        L78:
            r1.measure(r13, r14)
            r13 = 1073741824(0x40000000, float:2.0)
            if (r8 == r7) goto L88
            if (r8 == r13) goto L91
            int r14 = r1.getMeasuredWidth()
            int r2 = r14 + r10
            goto L91
        L88:
            int r14 = r1.getMeasuredWidth()
            int r14 = r14 + r10
            int r2 = java.lang.Math.min(r2, r14)
        L91:
            if (r4 == r7) goto L9d
            if (r4 == r13) goto L9b
            int r13 = r1.getMeasuredHeight()
            int r13 = r13 + r11
            goto La6
        L9b:
            r13 = r3
            goto La6
        L9d:
            int r13 = r1.getMeasuredHeight()
            int r13 = r13 + r11
            int r13 = java.lang.Math.min(r3, r13)
        La6:
            r12.setMeasuredDimension(r2, r13)
            boolean r13 = r12.f6230
            if (r13 != 0) goto Lc7
            int r13 = r1.getMeasuredHeight()
            int r13 = r13 + r11
            if (r13 <= r3) goto Lc7
            android.view.WindowManager$LayoutParams r13 = r6.getAttributes()
            int r13 = r13.height
            if (r13 != r5) goto Lc7
            r6.addFlags(r7)
            boolean r12 = r12.f6231
            if (r12 != 0) goto Lc7
            r12 = -1
            r6.setLayout(r12, r12)
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.C2103.mo3500(int, int):void");
    }

    @Override // androidx.compose.ui.platform.AbstractC1881
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo3501(boolean z, int i, int i2, int i3, int i4) {
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

    @Override // androidx.core.view.InterfaceC2205
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public final C2225 mo303(View view, C2225 c2225) {
        if (!this.f6230) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return c2225.f6521.mo4049(iMax, iMax2, iMax3, iMax4);
            }
        }
        return c2225;
    }
}
