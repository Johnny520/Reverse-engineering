package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import p000a.AbstractC0290Q;
import p000a.C0889w1;
import p000a.C0893w5;
import p000a.InterfaceMenuItemC0179Je;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1000h implements InterfaceMenuItemC0179Je {

    /* JADX INFO: renamed from: A */
    public AbstractC0290Q f3811A;

    /* JADX INFO: renamed from: B */
    public MenuItem.OnActionExpandListener f3812B;

    /* JADX INFO: renamed from: a */
    public final int f3814a;

    /* JADX INFO: renamed from: b */
    public final int f3815b;

    /* JADX INFO: renamed from: c */
    public final int f3816c;

    /* JADX INFO: renamed from: d */
    public final int f3817d;

    /* JADX INFO: renamed from: e */
    public CharSequence f3818e;

    /* JADX INFO: renamed from: f */
    public CharSequence f3819f;

    /* JADX INFO: renamed from: g */
    public Intent f3820g;

    /* JADX INFO: renamed from: h */
    public char f3821h;

    /* JADX INFO: renamed from: j */
    public char f3823j;

    /* JADX INFO: renamed from: l */
    public Drawable f3825l;

    /* JADX INFO: renamed from: n */
    public final C0998f f3827n;

    /* JADX INFO: renamed from: o */
    public SubMenuC1005m f3828o;

    /* JADX INFO: renamed from: p */
    public MenuItem.OnMenuItemClickListener f3829p;

    /* JADX INFO: renamed from: q */
    public CharSequence f3830q;

    /* JADX INFO: renamed from: r */
    public CharSequence f3831r;

    /* JADX INFO: renamed from: y */
    public int f3838y;

    /* JADX INFO: renamed from: z */
    public View f3839z;

    /* JADX INFO: renamed from: i */
    public int f3822i = 4096;

    /* JADX INFO: renamed from: k */
    public int f3824k = 4096;

    /* JADX INFO: renamed from: m */
    public int f3826m = 0;

    /* JADX INFO: renamed from: s */
    public ColorStateList f3832s = null;

    /* JADX INFO: renamed from: t */
    public PorterDuff.Mode f3833t = null;

    /* JADX INFO: renamed from: u */
    public boolean f3834u = false;

    /* JADX INFO: renamed from: v */
    public boolean f3835v = false;

    /* JADX INFO: renamed from: w */
    public boolean f3836w = false;

    /* JADX INFO: renamed from: x */
    public int f3837x = 16;

    /* JADX INFO: renamed from: C */
    public boolean f3813C = false;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.h$a */
    public class a {
        public a() {
        }
    }

    public C1000h(C0998f c0998f, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f3827n = c0998f;
        this.f3814a = i2;
        this.f3815b = i;
        this.f3816c = i3;
        this.f3817d = i4;
        this.f3818e = charSequence;
        this.f3838y = i5;
    }

    /* JADX INFO: renamed from: c */
    public static void m2339c(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // p000a.InterfaceMenuItemC0179Je
    /* JADX INFO: renamed from: a */
    public final AbstractC0290Q mo486a() {
        return this.f3811A;
    }

    @Override // p000a.InterfaceMenuItemC0179Je
    /* JADX INFO: renamed from: b */
    public final InterfaceMenuItemC0179Je mo487b(AbstractC0290Q abstractC0290Q) {
        AbstractC0290Q abstractC0290Q2 = this.f3811A;
        if (abstractC0290Q2 != null) {
            abstractC0290Q2.f987a = null;
        }
        this.f3839z = null;
        this.f3811A = abstractC0290Q;
        this.f3827n.m2331p(true);
        AbstractC0290Q abstractC0290Q3 = this.f3811A;
        if (abstractC0290Q3 != null) {
            abstractC0290Q3.mo793h(new a());
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f3838y & 8) == 0) {
            return false;
        }
        if (this.f3839z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3812B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f3827n.mo2319d(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m2340d(Drawable drawable) {
        if (drawable != null && this.f3836w && (this.f3834u || this.f3835v)) {
            drawable = drawable.mutate();
            if (this.f3834u) {
                C0893w5.a.m2176h(drawable, this.f3832s);
            }
            if (this.f3835v) {
                C0893w5.a.m2177i(drawable, this.f3833t);
            }
            this.f3836w = false;
        }
        return drawable;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2341e() {
        AbstractC0290Q abstractC0290Q;
        if ((this.f3838y & 8) == 0) {
            return false;
        }
        if (this.f3839z == null && (abstractC0290Q = this.f3811A) != null) {
            this.f3839z = abstractC0290Q.mo789d(this);
        }
        return this.f3839z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m2341e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3812B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f3827n.mo2321f(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m2342f(boolean z) {
        if (z) {
            this.f3837x |= 32;
        } else {
            this.f3837x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f3839z;
        if (view != null) {
            return view;
        }
        AbstractC0290Q abstractC0290Q = this.f3811A;
        if (abstractC0290Q == null) {
            return null;
        }
        View viewMo789d = abstractC0290Q.mo789d(this);
        this.f3839z = viewMo789d;
        return viewMo789d;
    }

    @Override // p000a.InterfaceMenuItemC0179Je, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f3824k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f3823j;
    }

    @Override // p000a.InterfaceMenuItemC0179Je, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f3830q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f3815b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f3825l;
        if (drawable != null) {
            return m2340d(drawable);
        }
        int i = this.f3826m;
        if (i == 0) {
            return null;
        }
        Drawable drawableM2115A = C0889w1.m2115A(this.f3827n.f3784a, i);
        this.f3826m = 0;
        this.f3825l = drawableM2115A;
        return m2340d(drawableM2115A);
    }

    @Override // p000a.InterfaceMenuItemC0179Je, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f3832s;
    }

    @Override // p000a.InterfaceMenuItemC0179Je, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f3833t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f3820g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f3814a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000a.InterfaceMenuItemC0179Je, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f3822i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f3821h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f3816c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f3828o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f3818e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3819f;
        return charSequence != null ? charSequence : this.f3818e;
    }

    @Override // p000a.InterfaceMenuItemC0179Je, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f3831r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f3828o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f3813C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f3837x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f3837x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f3837x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        AbstractC0290Q abstractC0290Q = this.f3811A;
        return (abstractC0290Q == null || !abstractC0290Q.mo792g()) ? (this.f3837x & 8) == 0 : (this.f3837x & 8) == 0 && this.f3811A.mo787b();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f3839z = view;
        this.f3811A = null;
        if (view != null && view.getId() == -1 && (i = this.f3814a) > 0) {
            view.setId(i);
        }
        C0998f c0998f = this.f3827n;
        c0998f.f3794k = true;
        c0998f.m2331p(true);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f3823j == c) {
            return this;
        }
        this.f3823j = Character.toLowerCase(c);
        this.f3827n.m2331p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f3837x;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f3837x = i2;
        if (i != i2) {
            this.f3827n.m2331p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.f3837x;
        if ((i & 4) == 0) {
            int i2 = (i & (-3)) | (z ? 2 : 0);
            this.f3837x = i2;
            if (i != i2) {
                this.f3827n.m2331p(false);
            }
            return this;
        }
        C0998f c0998f = this.f3827n;
        c0998f.getClass();
        ArrayList<C1000h> arrayList = c0998f.f3789f;
        int size = arrayList.size();
        c0998f.m2338w();
        for (int i3 = 0; i3 < size; i3++) {
            C1000h c1000h = arrayList.get(i3);
            if (c1000h.f3815b == this.f3815b && (c1000h.f3837x & 4) != 0 && c1000h.isCheckable()) {
                boolean z2 = c1000h == this;
                int i4 = c1000h.f3837x;
                int i5 = (z2 ? 2 : 0) | (i4 & (-3));
                c1000h.f3837x = i5;
                if (i4 != i5) {
                    c1000h.f3827n.m2331p(false);
                }
            }
        }
        c0998f.m2337v();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000a.InterfaceMenuItemC0179Je, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f3837x |= 16;
        } else {
            this.f3837x &= -17;
        }
        this.f3827n.m2331p(false);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f3826m = 0;
        this.f3825l = drawable;
        this.f3836w = true;
        this.f3827n.m2331p(false);
        return this;
    }

    @Override // p000a.InterfaceMenuItemC0179Je, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3832s = colorStateList;
        this.f3834u = true;
        this.f3836w = true;
        this.f3827n.m2331p(false);
        return this;
    }

    @Override // p000a.InterfaceMenuItemC0179Je, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3833t = mode;
        this.f3835v = true;
        this.f3836w = true;
        this.f3827n.m2331p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f3820g = intent;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f3821h == c) {
            return this;
        }
        this.f3821h = c;
        this.f3827n.m2331p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3812B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3829p = onMenuItemClickListener;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f3821h = c;
        this.f3823j = Character.toLowerCase(c2);
        this.f3827n.m2331p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f3838y = i;
        C0998f c0998f = this.f3827n;
        c0998f.f3794k = true;
        c0998f.m2331p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3818e = charSequence;
        this.f3827n.m2331p(false);
        SubMenuC1005m subMenuC1005m = this.f3828o;
        if (subMenuC1005m != null) {
            subMenuC1005m.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3819f = charSequence;
        this.f3827n.m2331p(false);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000a.InterfaceMenuItemC0179Je, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.f3837x;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f3837x = i2;
        if (i != i2) {
            C0998f c0998f = this.f3827n;
            c0998f.f3791h = true;
            c0998f.m2331p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f3818e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // p000a.InterfaceMenuItemC0179Je, android.view.MenuItem
    public final InterfaceMenuItemC0179Je setContentDescription(CharSequence charSequence) {
        this.f3830q = charSequence;
        this.f3827n.m2331p(false);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // p000a.InterfaceMenuItemC0179Je, android.view.MenuItem
    public final InterfaceMenuItemC0179Je setTooltipText(CharSequence charSequence) {
        this.f3831r = charSequence;
        this.f3827n.m2331p(false);
        return this;
    }

    @Override // p000a.InterfaceMenuItemC0179Je, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f3823j == c && this.f3824k == i) {
            return this;
        }
        this.f3823j = Character.toLowerCase(c);
        this.f3824k = KeyEvent.normalizeMetaState(i);
        this.f3827n.m2331p(false);
        return this;
    }

    @Override // p000a.InterfaceMenuItemC0179Je, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f3821h == c && this.f3822i == i) {
            return this;
        }
        this.f3821h = c;
        this.f3822i = KeyEvent.normalizeMetaState(i);
        this.f3827n.m2331p(false);
        return this;
    }

    @Override // p000a.InterfaceMenuItemC0179Je, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f3821h = c;
        this.f3822i = KeyEvent.normalizeMetaState(i);
        this.f3823j = Character.toLowerCase(c2);
        this.f3824k = KeyEvent.normalizeMetaState(i2);
        this.f3827n.m2331p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f3825l = null;
        this.f3826m = i;
        this.f3836w = true;
        this.f3827n.m2331p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f3827n.f3784a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.f3827n.f3784a;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f3839z = viewInflate;
        this.f3811A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.f3814a) > 0) {
            viewInflate.setId(i2);
        }
        C0998f c0998f = this.f3827n;
        c0998f.f3794k = true;
        c0998f.m2331p(true);
        return this;
    }
}
