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
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C7784 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public View f21187;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f21188;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f21189;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f21190;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final MenuC7801 f21191;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f21192;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f21193;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f21195;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public InterfaceC7788 f21197;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public AbstractC7793 f21198;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f21194 = 8388611;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C7785 f21196 = new C7785(this);

    public C7784(int i, int i2, Context context, View view, MenuC7801 menuC7801, boolean z) {
        this.f21192 = context;
        this.f21191 = menuC7801;
        this.f21187 = view;
        this.f21190 = z;
        this.f21189 = i;
        this.f21188 = i2;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f21195 = onDismissListener;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13116(int i, int i2, boolean z, boolean z2) {
        AbstractC7793 abstractC7793M13118 = m13118();
        abstractC7793M13118.mo13107(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f21194, this.f21187.getLayoutDirection()) & 7) == 5) {
                i -= this.f21187.getWidth();
            }
            abstractC7793M13118.mo13110(i);
            abstractC7793M13118.mo13108(i2);
            int i3 = (int) ((this.f21192.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC7793M13118.f21205 = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        abstractC7793M13118.show();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo704() {
        this.f21198 = null;
        PopupWindow.OnDismissListener onDismissListener = this.f21195;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m13117() {
        AbstractC7793 abstractC7793 = this.f21198;
        return abstractC7793 != null && abstractC7793.mo645();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC7793 m13118() {
        AbstractC7793 viewOnKeyListenerC7775;
        if (this.f21198 == null) {
            Context context = this.f21192;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iMin = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.f21192;
            if (iMin >= dimensionPixelSize) {
                viewOnKeyListenerC7775 = new ViewOnKeyListenerC7780(context2, this.f21187, this.f21189, this.f21188, this.f21190);
            } else {
                View view = this.f21187;
                viewOnKeyListenerC7775 = new ViewOnKeyListenerC7775(this.f21189, this.f21188, context2, view, this.f21191, this.f21190);
            }
            viewOnKeyListenerC7775.mo13111(this.f21191);
            viewOnKeyListenerC7775.setOnDismissListener(this.f21196);
            viewOnKeyListenerC7775.mo13106(this.f21187);
            viewOnKeyListenerC7775.mo700(this.f21197);
            viewOnKeyListenerC7775.mo13105(this.f21193);
            viewOnKeyListenerC7775.mo13109(this.f21194);
            this.f21198 = viewOnKeyListenerC7775;
        }
        return this.f21198;
    }
}
