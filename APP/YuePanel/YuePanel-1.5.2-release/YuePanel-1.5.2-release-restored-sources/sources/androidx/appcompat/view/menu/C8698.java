package androidx.appcompat.view.menu;

import Yue.AbstractC6162;
import Yue.C5194;
import Yue.C6898;
import Yue.InterfaceC3451;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import Yue.InterfaceC7651;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.InterfaceC8699;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥۣ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C8698 implements InterfaceC8696 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f26073 = 48;

    /* JADX INFO: renamed from: ۥ */
    public final Context f3650;

    /* JADX INFO: renamed from: ۥ۟ */
    public final C8694 f3651;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean f26074;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final int f26075;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int f26076;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public View f26077;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f26078;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean f26079;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public InterfaceC8699.InterfaceC1607 f26080;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public AbstractC6162 f26081;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f26082;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final PopupWindow.OnDismissListener f26083;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥۣ۟۟۟$ۥ */
    public class C1606 implements PopupWindow.OnDismissListener {
        public C1606() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C8698.this.mo29057();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8698(@InterfaceC6391 Context context, @InterfaceC6391 C8694 c8694) {
        this(context, c8694, null, false, C6898.C1110.f18531, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8696
    public void dismiss() {
        if (m29056()) {
            this.f26081.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8696
    /* JADX INFO: renamed from: ۥ */
    public void mo4652(@InterfaceC6490 InterfaceC8699.InterfaceC1607 interfaceC1607) {
        this.f26080 = interfaceC1607;
        AbstractC6162 abstractC6162 = this.f26081;
        if (abstractC6162 != null) {
            abstractC6162.setCallback(interfaceC1607);
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public final AbstractC6162 m4653() {
        Display defaultDisplay = ((WindowManager) this.f3650.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        AbstractC6162 viewOnKeyListenerC1601 = Math.min(point.x, point.y) >= this.f3650.getResources().getDimensionPixelSize(C6898.C6901.f18724) ? new ViewOnKeyListenerC1601(this.f3650, this.f26077, this.f26075, this.f26076, this.f26074) : new ViewOnKeyListenerC8701(this.f3650, this.f3651, this.f26077, this.f26075, this.f26076, this.f26074);
        viewOnKeyListenerC1601.mo2665(this.f3651);
        viewOnKeyListenerC1601.mo19022(this.f26083);
        viewOnKeyListenerC1601.mo19017(this.f26077);
        viewOnKeyListenerC1601.setCallback(this.f26080);
        viewOnKeyListenerC1601.mo19019(this.f26079);
        viewOnKeyListenerC1601.mo19020(this.f26078);
        return viewOnKeyListenerC1601;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m29053() {
        return this.f26078;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public ListView m29054() {
        return m29055().mo17740();
    }

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public AbstractC6162 m29055() {
        if (this.f26081 == null) {
            this.f26081 = m4653();
        }
        return this.f26081;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m29056() {
        AbstractC6162 abstractC6162 = this.f26081;
        return abstractC6162 != null && abstractC6162.mo2407();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void mo29057() {
        this.f26081 = null;
        PopupWindow.OnDismissListener onDismissListener = this.f26082;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m29058(@InterfaceC6391 View view) {
        this.f26077 = view;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m29059(boolean z) {
        this.f26079 = z;
        AbstractC6162 abstractC6162 = this.f26081;
        if (abstractC6162 != null) {
            abstractC6162.mo19019(z);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m29060(int i) {
        this.f26078 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m29061(@InterfaceC6490 PopupWindow.OnDismissListener onDismissListener) {
        this.f26082 = onDismissListener;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m29062() {
        if (!m29065()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m29063(int i, int i2) {
        if (!m29066(i, i2)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m29064(int i, int i2, boolean z, boolean z2) {
        AbstractC6162 abstractC6162M29055 = m29055();
        abstractC6162M29055.mo19023(z2);
        if (z) {
            if ((C5194.m15901(this.f26078, this.f26077.getLayoutDirection()) & 7) == 5) {
                i -= this.f26077.getWidth();
            }
            abstractC6162M29055.mo19021(i);
            abstractC6162M29055.mo19024(i2);
            int i3 = (int) ((this.f3650.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC6162M29055.m19018(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        abstractC6162M29055.show();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean m29065() {
        if (m29056()) {
            return true;
        }
        if (this.f26077 == null) {
            return false;
        }
        m29064(0, 0, false, false);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public boolean m29066(int i, int i2) {
        if (m29056()) {
            return true;
        }
        if (this.f26077 == null) {
            return false;
        }
        m29064(i, i2, true, true);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8698(@InterfaceC6391 Context context, @InterfaceC6391 C8694 c8694, @InterfaceC6391 View view) {
        this(context, c8694, view, false, C6898.C1110.f18531, 0);
    }

    public C8698(@InterfaceC6391 Context context, @InterfaceC6391 C8694 c8694, @InterfaceC6391 View view, boolean z, @InterfaceC3451 int i) {
        this(context, c8694, view, z, i, 0);
    }

    public C8698(@InterfaceC6391 Context context, @InterfaceC6391 C8694 c8694, @InterfaceC6391 View view, boolean z, @InterfaceC3451 int i, @InterfaceC7651 int i2) {
        this.f26078 = C5194.f1338;
        this.f26083 = new C1606();
        this.f3650 = context;
        this.f3651 = c8694;
        this.f26077 = view;
        this.f26074 = z;
        this.f26075 = i;
        this.f26076 = i2;
    }
}
