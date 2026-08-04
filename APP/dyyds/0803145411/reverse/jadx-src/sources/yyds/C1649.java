package yyds;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛷᲁᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C1649 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public InterfaceC2407 f8389;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public AbstractC2356 f8390;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public View f8391;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Context f8392;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final MenuC0836 f8393;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public boolean f8394;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f8396;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean f8397;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f8399;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f8398 = 8388611;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final C2277 f8395 = new C2277(this);

    public C1649(Context context, MenuC0836 menuC0836, View view, boolean z, int i, int i2) {
        this.f8392 = context;
        this.f8393 = menuC0836;
        this.f8391 = view;
        this.f8397 = z;
        this.f8399 = i;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final AbstractC2356 m3360() {
        AbstractC2356 viewOnKeyListenerC0619 = this.f8390;
        if (viewOnKeyListenerC0619 == null) {
            Context context = this.f8392;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            AbstractC1797.m3576(defaultDisplay, point);
            int iMin = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.f8392;
            if (iMin >= dimensionPixelSize) {
                viewOnKeyListenerC0619 = new ViewOnKeyListenerC2374(context2, this.f8391, this.f8399, this.f8397);
            } else {
                viewOnKeyListenerC0619 = new ViewOnKeyListenerC0619(context2, this.f8393, this.f8391, this.f8399, this.f8397);
            }
            viewOnKeyListenerC0619.mo1519(this.f8393);
            viewOnKeyListenerC0619.mo1518(this.f8395);
            viewOnKeyListenerC0619.mo1514(this.f8391);
            viewOnKeyListenerC0619.mo1508(this.f8389);
            viewOnKeyListenerC0619.mo1513(this.f8394);
            viewOnKeyListenerC0619.mo1516(this.f8398);
            this.f8390 = viewOnKeyListenerC0619;
        }
        return viewOnKeyListenerC0619;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean m3361() {
        AbstractC2356 abstractC2356 = this.f8390;
        return abstractC2356 != null && abstractC2356.mo1515();
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public void mo1534() {
        this.f8390 = null;
        PopupWindow.OnDismissListener onDismissListener = this.f8396;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m3362(int i, int i2, boolean z, boolean z2) {
        AbstractC2356 abstractC2356M3360 = m3360();
        abstractC2356M3360.mo1517(z2);
        if (z) {
            int i3 = this.f8398;
            View view = this.f8391;
            WeakHashMap weakHashMap = AbstractC1640.f8352;
            if ((Gravity.getAbsoluteGravity(i3, view.getLayoutDirection()) & 7) == 5) {
                i -= this.f8391.getWidth();
            }
            abstractC2356M3360.mo1521(i);
            abstractC2356M3360.mo1520(i2);
            int i4 = (int) ((this.f8392.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC2356M3360.f11576 = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        abstractC2356M3360.show();
    }
}
