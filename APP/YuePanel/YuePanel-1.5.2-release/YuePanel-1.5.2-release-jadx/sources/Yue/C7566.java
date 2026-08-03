package Yue;

import Yue.AbstractC3086;
import Yue.InterfaceC7144;
import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C8694;
import androidx.appcompat.view.menu.C8698;
import androidx.appcompat.view.menu.SubMenuC8702;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C7566 extends AbstractC3086 implements C8694.InterfaceC1603 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Context f22866;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public ActionBarContextView f22867;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public AbstractC3086.InterfaceC0044 f22868;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public WeakReference<View> f22869;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public boolean f22870;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean f22871;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public C8694 f22872;

    public C7566(Context context, ActionBarContextView actionBarContextView, AbstractC3086.InterfaceC0044 interfaceC0044, boolean z) {
        this.f22866 = context;
        this.f22867 = actionBarContextView;
        this.f22868 = interfaceC0044;
        C8694 defaultShowAsAction = new C8694(actionBarContextView.getContext()).setDefaultShowAsAction(1);
        this.f22872 = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
        this.f22871 = z;
    }

    @Override // androidx.appcompat.view.menu.C8694.InterfaceC1603
    public boolean onMenuItemSelected(@InterfaceC6391 C8694 c8694, @InterfaceC6391 MenuItem menuItem) {
        return this.f22868.mo6288(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C8694.InterfaceC1603
    public void onMenuModeChange(@InterfaceC6391 C8694 c8694) {
        mo6277();
        this.f22867.mo5709();
    }

    @Override // Yue.AbstractC3086
    /* JADX INFO: renamed from: ۥ */
    public void mo174() {
        if (this.f22870) {
            return;
        }
        this.f22870 = true;
        this.f22868.mo6287(this);
    }

    @Override // Yue.AbstractC3086
    /* JADX INFO: renamed from: ۥ۟ */
    public View mo175() {
        WeakReference<View> weakReference = this.f22869;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // Yue.AbstractC3086
    /* JADX INFO: renamed from: ۥ۟۟ */
    public Menu mo6271() {
        return this.f22872;
    }

    @Override // Yue.AbstractC3086
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public MenuInflater mo6272() {
        return new C7683(this.f22867.getContext());
    }

    @Override // Yue.AbstractC3086
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public CharSequence mo6273() {
        return this.f22867.getSubtitle();
    }

    @Override // Yue.AbstractC3086
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public CharSequence mo6275() {
        return this.f22867.getTitle();
    }

    @Override // Yue.AbstractC3086
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo6277() {
        this.f22868.mo177(this, this.f22872);
    }

    @Override // Yue.AbstractC3086
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public boolean mo6278() {
        return this.f22867.m29071();
    }

    @Override // Yue.AbstractC3086
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public boolean mo6279() {
        return this.f22871;
    }

    @Override // Yue.AbstractC3086
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo6280(View view) {
        this.f22867.setCustomView(view);
        this.f22869 = view != null ? new WeakReference<>(view) : null;
    }

    @Override // Yue.AbstractC3086
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public void mo6281(int i) {
        mo6282(this.f22866.getString(i));
    }

    @Override // Yue.AbstractC3086
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo6282(CharSequence charSequence) {
        this.f22867.setSubtitle(charSequence);
    }

    @Override // Yue.AbstractC3086
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public void mo6284(int i) {
        mo6285(this.f22866.getString(i));
    }

    @Override // Yue.AbstractC3086
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public void mo6285(CharSequence charSequence) {
        this.f22867.setTitle(charSequence);
    }

    @Override // Yue.AbstractC3086
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public void mo6286(boolean z) {
        super.mo6286(z);
        this.f22867.setTitleOptional(z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m23693(C8694 c8694, boolean z) {
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m23694(SubMenuC8702 subMenuC8702) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean m23695(SubMenuC8702 subMenuC8702) {
        if (!subMenuC8702.hasVisibleItems()) {
            return true;
        }
        new C8698(this.f22867.getContext(), subMenuC8702).m29062();
        return true;
    }
}
