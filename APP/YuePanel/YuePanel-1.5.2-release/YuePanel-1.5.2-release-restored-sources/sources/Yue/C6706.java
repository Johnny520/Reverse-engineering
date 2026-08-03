package Yue;

import Yue.C6898;
import Yue.InterfaceC7144;
import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C8694;
import androidx.appcompat.view.menu.C8698;

/* JADX INFO: renamed from: Yue.ۥۣۡۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6706 {

    /* JADX INFO: renamed from: ۥ */
    public final Context f2256;

    /* JADX INFO: renamed from: ۥ۟ */
    public final C8694 f2257;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final View f17269;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final C8698 f17270;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public InterfaceC6709 f17271;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public InterfaceC6708 f17272;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public View.OnTouchListener f17273;

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۤ$ۥ */
    public class C1069 implements C8694.InterfaceC1603 {
        public C1069() {
        }

        @Override // androidx.appcompat.view.menu.C8694.InterfaceC1603
        public boolean onMenuItemSelected(@InterfaceC6391 C8694 c8694, @InterfaceC6391 MenuItem menuItem) {
            InterfaceC6709 interfaceC6709 = C6706.this.f17271;
            if (interfaceC6709 != null) {
                return interfaceC6709.onMenuItemClick(menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C8694.InterfaceC1603
        public void onMenuModeChange(@InterfaceC6391 C8694 c8694) {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۤ$ۥ۟ */
    public class C1070 implements PopupWindow.OnDismissListener {
        public C1070() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C6706 c6706 = C6706.this;
            InterfaceC6708 interfaceC6708 = c6706.f17272;
            if (interfaceC6708 != null) {
                interfaceC6708.m3187(c6706);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۤ$ۥ۟۟, reason: contains not printable characters */
    public class C6707 extends AbstractViewOnTouchListenerC5066 {
        public C6707(View view) {
            super(view);
        }

        @Override // Yue.AbstractViewOnTouchListenerC5066
        /* JADX INFO: renamed from: ۥ۟ */
        public InterfaceC7462 mo399() {
            return C6706.this.f17270.m29055();
        }

        @Override // Yue.AbstractViewOnTouchListenerC5066
        /* JADX INFO: renamed from: ۥ۟۟ */
        public boolean mo6795() {
            C6706.this.m21388();
            return true;
        }

        @Override // Yue.AbstractViewOnTouchListenerC5066
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public boolean mo15609() {
            C6706.this.m3185();
            return true;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۤ$ۥ۟۟۟, reason: contains not printable characters */
    public interface InterfaceC6708 {
        /* JADX INFO: renamed from: ۥ */
        void m3187(C6706 c6706);
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۤ$ۥ۟۟۟۟, reason: contains not printable characters */
    public interface InterfaceC6709 {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6706(@InterfaceC6391 Context context, @InterfaceC6391 View view) {
        this(context, view, 0);
    }

    /* JADX INFO: renamed from: ۥ */
    public void m3185() {
        this.f17270.dismiss();
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public View.OnTouchListener m3186() {
        if (this.f17273 == null) {
            this.f17273 = new C6707(this.f17269);
        }
        return this.f17273;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m21379() {
        return this.f17270.m29053();
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Menu m21380() {
        return this.f2257;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public MenuInflater m21381() {
        return new C7683(this.f2256);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public ListView m21382() {
        if (this.f17270.m29056()) {
            return this.f17270.m29054();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m21383(@InterfaceC6166 int i) {
        m21381().inflate(i, this.f2257);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m21384(boolean z) {
        this.f17270.m29059(z);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m21385(int i) {
        this.f17270.m29060(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m21386(@InterfaceC6490 InterfaceC6708 interfaceC6708) {
        this.f17272 = interfaceC6708;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m21387(@InterfaceC6490 InterfaceC6709 interfaceC6709) {
        this.f17271 = interfaceC6709;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m21388() {
        this.f17270.m29062();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C6706(@InterfaceC6391 Context context, @InterfaceC6391 View view, int i) {
        this(context, view, i, C6898.C1110.f18531, 0);
    }

    public C6706(@InterfaceC6391 Context context, @InterfaceC6391 View view, int i, @InterfaceC3451 int i2, @InterfaceC7651 int i3) {
        this.f2256 = context;
        this.f17269 = view;
        C8694 c8694 = new C8694(context);
        this.f2257 = c8694;
        c8694.setCallback(new C1069());
        C8698 c8698 = new C8698(context, c8694, view, false, i2, i3);
        this.f17270 = c8698;
        c8698.m29060(i);
        c8698.m29061(new C1070());
    }
}
