package Yue;

import Yue.InterfaceC7144;
import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3087 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f4606 = "ActionProvider(support)";

    /* JADX INFO: renamed from: ۥ */
    public final Context f67;

    /* JADX INFO: renamed from: ۥ۟ */
    public InterfaceC0045 f68;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public InterfaceC0046 f4607;

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۧ۠$ۥ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public interface InterfaceC0045 {
        /* JADX INFO: renamed from: ۥ */
        void mo180(boolean z);
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۧ۠$ۥ۟ */
    public interface InterfaceC0046 {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public AbstractC3087(@InterfaceC6391 Context context) {
        this.f67 = context;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public Context m178() {
        return this.f67;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo179() {
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean mo6289() {
        return true;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public abstract View mo6290();

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public View mo6291(@InterfaceC6391 MenuItem menuItem) {
        return mo6290();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean mo6292() {
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void mo6293(@InterfaceC6391 SubMenu subMenu) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean mo6294() {
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void mo6295() {
        if (this.f4607 == null || !mo6294()) {
            return;
        }
        this.f4607.onActionProviderVisibilityChanged(mo6289());
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m6296() {
        this.f4607 = null;
        this.f68 = null;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m6297(@InterfaceC6490 InterfaceC0045 interfaceC0045) {
        this.f68 = interfaceC0045;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void mo6298(@InterfaceC6490 InterfaceC0046 interfaceC0046) {
        if (this.f4607 != null && interfaceC0046 != null) {
            Log.w(f4606, "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f4607 = interfaceC0046;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m6299(boolean z) {
        InterfaceC0045 interfaceC0045 = this.f68;
        if (interfaceC0045 != null) {
            interfaceC0045.mo180(z);
        }
    }
}
