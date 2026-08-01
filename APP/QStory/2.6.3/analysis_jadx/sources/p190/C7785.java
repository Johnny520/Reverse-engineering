package p190;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.davemorrissey.labs.subscaleview.R;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C7785 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public View f21184;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f21185;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f21186;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f21187;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final MenuC7802 f21188;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f21189;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f21190;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f21192;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public InterfaceC7789 f21194;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public AbstractC7794 f21195;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f21191 = 8388611;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C7786 f21193 = new C7786(this);

    public C7785(int i, int i2, Context context, View view, MenuC7802 menuC7802, boolean z) {
        this.f21189 = context;
        this.f21188 = menuC7802;
        this.f21184 = view;
        this.f21187 = z;
        this.f21186 = i;
        this.f21185 = i2;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f21192 = onDismissListener;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13144(int i, int i2, boolean z, boolean z2) {
        AbstractC7794 abstractC7794M13146 = m13146();
        abstractC7794M13146.mo13135(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f21191, this.f21184.getLayoutDirection()) & 7) == 5) {
                i -= this.f21184.getWidth();
            }
            abstractC7794M13146.mo13138(i);
            abstractC7794M13146.mo13136(i2);
            int i3 = (int) ((this.f21189.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC7794M13146.f21202 = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        abstractC7794M13146.show();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo705() {
        this.f21195 = null;
        PopupWindow.OnDismissListener onDismissListener = this.f21192;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m13145() {
        AbstractC7794 abstractC7794 = this.f21195;
        return abstractC7794 != null && abstractC7794.mo646();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC7794 m13146() {
        AbstractC7794 viewOnKeyListenerC7776;
        if (this.f21195 == null) {
            Context context = this.f21189;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iMin = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.f21189;
            if (iMin >= dimensionPixelSize) {
                viewOnKeyListenerC7776 = new ViewOnKeyListenerC7781(context2, this.f21184, this.f21186, this.f21185, this.f21187);
            } else {
                View view = this.f21184;
                viewOnKeyListenerC7776 = new ViewOnKeyListenerC7776(this.f21186, this.f21185, context2, view, this.f21188, this.f21187);
            }
            viewOnKeyListenerC7776.mo13139(this.f21188);
            viewOnKeyListenerC7776.setOnDismissListener(this.f21193);
            viewOnKeyListenerC7776.mo13134(this.f21184);
            viewOnKeyListenerC7776.mo701(this.f21194);
            viewOnKeyListenerC7776.mo13133(this.f21190);
            viewOnKeyListenerC7776.mo13137(this.f21191);
            this.f21195 = viewOnKeyListenerC7776;
        }
        return this.f21195;
    }
}
