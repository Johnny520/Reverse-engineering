package p206;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.davemorrissey.labs.subscaleview.C0328R;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8614 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public View f21529;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f21530;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f21531;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f21532;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final MenuC8631 f21533;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f21534;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f21535;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f21537;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public InterfaceC8618 f21539;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public AbstractC8623 f21540;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f21536 = 8388611;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C8615 f21538 = new C8615(this);

    public C8614(int i, int i2, Context context, View view, MenuC8631 menuC8631, boolean z) {
        this.f21534 = context;
        this.f21533 = menuC8631;
        this.f21529 = view;
        this.f21532 = z;
        this.f21531 = i;
        this.f21530 = i2;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f21537 = onDismissListener;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13703(int i, int i2, boolean z, boolean z2) {
        AbstractC8623 abstractC8623M13705 = m13705();
        abstractC8623M13705.mo13694(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f21536, this.f21529.getLayoutDirection()) & 7) == 5) {
                i -= this.f21529.getWidth();
            }
            abstractC8623M13705.mo13697(i);
            abstractC8623M13705.mo13695(i2);
            int i3 = (int) ((this.f21534.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC8623M13705.f21547 = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        abstractC8623M13705.show();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo1265() {
        this.f21540 = null;
        PopupWindow.OnDismissListener onDismissListener = this.f21537;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m13704() {
        AbstractC8623 abstractC8623 = this.f21540;
        return abstractC8623 != null && abstractC8623.mo1206();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC8623 m13705() {
        AbstractC8623 viewOnKeyListenerC8605;
        if (this.f21540 == null) {
            Context context = this.f21534;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iMin = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0328R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.f21534;
            if (iMin >= dimensionPixelSize) {
                viewOnKeyListenerC8605 = new ViewOnKeyListenerC8610(context2, this.f21529, this.f21531, this.f21530, this.f21532);
            } else {
                View view = this.f21529;
                viewOnKeyListenerC8605 = new ViewOnKeyListenerC8605(this.f21531, this.f21530, context2, view, this.f21533, this.f21532);
            }
            viewOnKeyListenerC8605.mo13698(this.f21533);
            viewOnKeyListenerC8605.setOnDismissListener(this.f21538);
            viewOnKeyListenerC8605.mo13693(this.f21529);
            viewOnKeyListenerC8605.mo1261(this.f21539);
            viewOnKeyListenerC8605.mo13692(this.f21535);
            viewOnKeyListenerC8605.mo13696(this.f21536);
            this.f21540 = viewOnKeyListenerC8605;
        }
        return this.f21540;
    }
}
