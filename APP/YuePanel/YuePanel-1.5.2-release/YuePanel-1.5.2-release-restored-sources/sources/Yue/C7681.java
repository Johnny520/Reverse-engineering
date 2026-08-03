package Yue;

import Yue.AbstractC3086;
import Yue.InterfaceC7144;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۥ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C7681 extends ActionMode {

    /* JADX INFO: renamed from: ۥ */
    public final Context f3009;

    /* JADX INFO: renamed from: ۥ۟ */
    public final AbstractC3086 f3010;

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۥ۠$ۥ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public static class C1323 implements AbstractC3086.InterfaceC0044 {

        /* JADX INFO: renamed from: ۥ */
        public final ActionMode.Callback f3011;

        /* JADX INFO: renamed from: ۥ۟ */
        public final Context f3012;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final ArrayList<C7681> f23117 = new ArrayList<>();

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final C7467<Menu, Menu> f23118 = new C7467<>();

        public C1323(Context context, ActionMode.Callback callback) {
            this.f3012 = context;
            this.f3011 = callback;
        }

        @Override // Yue.AbstractC3086.InterfaceC0044
        /* JADX INFO: renamed from: ۥ */
        public boolean mo176(AbstractC3086 abstractC3086, Menu menu) {
            return this.f3011.onCreateActionMode(m24450(abstractC3086), m24451(menu));
        }

        @Override // Yue.AbstractC3086.InterfaceC0044
        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo177(AbstractC3086 abstractC3086, Menu menu) {
            return this.f3011.onPrepareActionMode(m24450(abstractC3086), m24451(menu));
        }

        @Override // Yue.AbstractC3086.InterfaceC0044
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo6287(AbstractC3086 abstractC3086) {
            this.f3011.onDestroyActionMode(m24450(abstractC3086));
        }

        @Override // Yue.AbstractC3086.InterfaceC0044
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public boolean mo6288(AbstractC3086 abstractC3086, MenuItem menuItem) {
            return this.f3011.onActionItemClicked(m24450(abstractC3086), new MenuItemC6158(this.f3012, (InterfaceMenuItemC7684) menuItem));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public ActionMode m24450(AbstractC3086 abstractC3086) {
            int size = this.f23117.size();
            for (int i = 0; i < size; i++) {
                C7681 c7681 = this.f23117.get(i);
                if (c7681 != null && c7681.f3010 == abstractC3086) {
                    return c7681;
                }
            }
            C7681 c76812 = new C7681(this.f3012, abstractC3086);
            this.f23117.add(c76812);
            return c76812;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final Menu m24451(Menu menu) {
            Menu menu2 = this.f23118.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            MenuC6167 menuC6167 = new MenuC6167(this.f3012, (InterfaceMenuC7682) menu);
            this.f23118.put(menu, menuC6167);
            return menuC6167;
        }
    }

    public C7681(Context context, AbstractC3086 abstractC3086) {
        this.f3009 = context;
        this.f3010 = abstractC3086;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f3010.mo174();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f3010.mo175();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC6167(this.f3009, (InterfaceMenuC7682) this.f3010.mo6271());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f3010.mo6272();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f3010.mo6273();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f3010.m6274();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f3010.mo6275();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f3010.m6276();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f3010.mo6277();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f3010.mo6278();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f3010.mo6280(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f3010.mo6282(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f3010.m6283(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f3010.mo6285(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f3010.mo6286(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f3010.mo6281(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f3010.mo6284(i);
    }
}
