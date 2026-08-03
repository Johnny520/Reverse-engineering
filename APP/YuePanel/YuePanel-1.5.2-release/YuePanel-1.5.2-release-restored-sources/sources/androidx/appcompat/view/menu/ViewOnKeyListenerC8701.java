package androidx.appcompat.view.menu;

import Yue.AbstractC6162;
import Yue.C6163;
import Yue.C6898;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC8699;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟۟۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC8701 extends AbstractC6162 implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, InterfaceC8699, View.OnKeyListener {

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final int f26085 = C6898.C6906.f18987;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final Context f26086;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final C8694 f26087;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final C8693 f26088;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final boolean f26089;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final int f26090;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final int f26091;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final int f26092;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final C6163 f26093;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f26096;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public View f26097;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public View f26098;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public InterfaceC8699.InterfaceC1607 f26099;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public ViewTreeObserver f26100;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public boolean f26101;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public boolean f26102;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public int f26103;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public boolean f26105;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final ViewTreeObserver.OnGlobalLayoutListener f26094 = new ViewTreeObserverOnGlobalLayoutListenerC1609();

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final View.OnAttachStateChangeListener f26095 = new ViewOnAttachStateChangeListenerC1610();

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public int f26104 = 0;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟۟۟ۦ$ۥ */
    public class ViewTreeObserverOnGlobalLayoutListenerC1609 implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC1609() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC8701.this.mo2407() || ViewOnKeyListenerC8701.this.f26093.m17762()) {
                return;
            }
            View view = ViewOnKeyListenerC8701.this.f26098;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC8701.this.dismiss();
            } else {
                ViewOnKeyListenerC8701.this.f26093.show();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟۟۟ۦ$ۥ۟ */
    public class ViewOnAttachStateChangeListenerC1610 implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC1610() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC8701.this.f26100;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC8701.this.f26100 = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC8701 viewOnKeyListenerC8701 = ViewOnKeyListenerC8701.this;
                viewOnKeyListenerC8701.f26100.removeGlobalOnLayoutListener(viewOnKeyListenerC8701.f26094);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public ViewOnKeyListenerC8701(Context context, C8694 c8694, View view, int i, int i2, boolean z) {
        this.f26086 = context;
        this.f26087 = c8694;
        this.f26089 = z;
        this.f26088 = new C8693(c8694, LayoutInflater.from(context), z, f26085);
        this.f26091 = i;
        this.f26092 = i2;
        Resources resources = context.getResources();
        this.f26090 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C6898.C6901.f18725));
        this.f26097 = view;
        this.f26093 = new C6163(context, null, i, i2);
        c8694.addMenuPresenter(this, context);
    }

    @Override // Yue.InterfaceC7462
    public void dismiss() {
        if (mo2407()) {
            this.f26093.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public void onCloseMenu(C8694 c8694, boolean z) {
        if (c8694 != this.f26087) {
            return;
        }
        dismiss();
        InterfaceC8699.InterfaceC1607 interfaceC1607 = this.f26099;
        if (interfaceC1607 != null) {
            interfaceC1607.onCloseMenu(c8694, z);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f26101 = true;
        this.f26087.close();
        ViewTreeObserver viewTreeObserver = this.f26100;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f26100 = this.f26098.getViewTreeObserver();
            }
            this.f26100.removeGlobalOnLayoutListener(this.f26094);
            this.f26100 = null;
        }
        this.f26098.removeOnAttachStateChangeListener(this.f26095);
        PopupWindow.OnDismissListener onDismissListener = this.f26096;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public boolean onSubMenuSelected(SubMenuC8702 subMenuC8702) {
        if (subMenuC8702.hasVisibleItems()) {
            C8698 c8698 = new C8698(this.f26086, subMenuC8702, this.f26098, this.f26089, this.f26091, this.f26092);
            c8698.mo4652(this.f26099);
            c8698.m29059(AbstractC6162.m19013(subMenuC8702));
            c8698.m29061(this.f26096);
            this.f26096 = null;
            this.f26087.close(false);
            int iM2408 = this.f26093.m2408();
            int iM17742 = this.f26093.m17742();
            if ((Gravity.getAbsoluteGravity(this.f26104, this.f26097.getLayoutDirection()) & 7) == 5) {
                iM2408 += this.f26097.getWidth();
            }
            if (c8698.m29066(iM2408, iM17742)) {
                InterfaceC8699.InterfaceC1607 interfaceC1607 = this.f26099;
                if (interfaceC1607 == null) {
                    return true;
                }
                interfaceC1607.mo4617(subMenuC8702);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public void setCallback(InterfaceC8699.InterfaceC1607 interfaceC1607) {
        this.f26099 = interfaceC1607;
    }

    @Override // Yue.InterfaceC7462
    public void show() {
        if (!m29067()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public void updateMenuView(boolean z) {
        this.f26102 = false;
        C8693 c8693 = this.f26088;
        if (c8693 != null) {
            c8693.notifyDataSetChanged();
        }
    }

    @Override // Yue.InterfaceC7462
    /* JADX INFO: renamed from: ۥ */
    public boolean mo2407() {
        return !this.f26101 && this.f26093.mo2407();
    }

    @Override // Yue.AbstractC6162
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo2665(C8694 c8694) {
    }

    @Override // Yue.AbstractC6162
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo19017(View view) {
        this.f26097 = view;
    }

    @Override // Yue.InterfaceC7462
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public ListView mo17740() {
        return this.f26093.mo17740();
    }

    @Override // Yue.AbstractC6162
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo19019(boolean z) {
        this.f26088.m29015(z);
    }

    @Override // Yue.AbstractC6162
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo19020(int i) {
        this.f26104 = i;
    }

    @Override // Yue.AbstractC6162
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public void mo19021(int i) {
        this.f26093.m17738(i);
    }

    @Override // Yue.AbstractC6162
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo19022(PopupWindow.OnDismissListener onDismissListener) {
        this.f26096 = onDismissListener;
    }

    @Override // Yue.AbstractC6162
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public void mo19023(boolean z) {
        this.f26105 = z;
    }

    @Override // Yue.AbstractC6162
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo19024(int i) {
        this.f26093.m17741(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final boolean m29067() {
        View view;
        if (mo2407()) {
            return true;
        }
        if (this.f26101 || (view = this.f26097) == null) {
            return false;
        }
        this.f26098 = view;
        this.f26093.m17781(this);
        this.f26093.m17782(this);
        this.f26093.m17780(true);
        View view2 = this.f26098;
        boolean z = this.f26100 == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f26100 = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f26094);
        }
        view2.addOnAttachStateChangeListener(this.f26095);
        this.f26093.m17769(view2);
        this.f26093.m17773(this.f26104);
        if (!this.f26102) {
            this.f26103 = AbstractC6162.m19012(this.f26088, null, this.f26086, this.f26090);
            this.f26102 = true;
        }
        this.f26093.m17771(this.f26103);
        this.f26093.m17777(2);
        this.f26093.m17774(m19016());
        this.f26093.show();
        ListView listViewMo17740 = this.f26093.mo17740();
        listViewMo17740.setOnKeyListener(this);
        if (this.f26105 && this.f26087.getHeaderTitle() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f26086).inflate(C6898.C6906.f18986, (ViewGroup) listViewMo17740, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f26087.getHeaderTitle());
            }
            frameLayout.setEnabled(false);
            listViewMo17740.addHeaderView(frameLayout, null, false);
        }
        this.f26093.mo6805(this.f26088);
        this.f26093.show();
        return true;
    }
}
