package Yue;

import Yue.InterfaceC7144;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C3085 implements InterfaceMenuItemC7684 {

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int f4579 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f4580 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int f4581 = 4;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final int f4582 = 8;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final int f4583 = 16;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final int f4584;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final int f4585;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final int f4586;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public CharSequence f4587;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public CharSequence f4588;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public Intent f4589;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public char f4590;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public char f4592;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Drawable f4594;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public Context f4595;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public MenuItem.OnMenuItemClickListener f4596;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public CharSequence f4597;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public CharSequence f4598;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public int f4591 = 4096;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f4593 = 4096;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public ColorStateList f4599 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public PorterDuff.Mode f4600 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean f4601 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public boolean f4602 = false;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public int f4603 = 16;

    public C3085(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f4595 = context;
        this.f4584 = i2;
        this.f4585 = i;
        this.f4586 = i4;
        this.f4587 = charSequence;
    }

    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f4593;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f4592;
    }

    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f4597;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f4585;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f4594;
    }

    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f4599;
    }

    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f4600;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f4589;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f4584;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f4591;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f4590;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f4586;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f4587;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f4588;
        return charSequence != null ? charSequence : this.f4587;
    }

    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f4598;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f4603 & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f4603 & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f4603 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f4603 & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f4592 = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f4603 = (z ? 1 : 0) | (this.f4603 & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f4603 = (z ? 2 : 0) | (this.f4603 & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f4603 = (z ? 16 : 0) | (this.f4603 & (-17));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f4594 = drawable;
        m6265();
        return this;
    }

    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    @InterfaceC6391
    public MenuItem setIconTintList(@InterfaceC6490 ColorStateList colorStateList) {
        this.f4599 = colorStateList;
        this.f4601 = true;
        m6265();
        return this;
    }

    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    @InterfaceC6391
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f4600 = mode;
        this.f4602 = true;
        m6265();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f4589 = intent;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f4590 = c;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f4596 = onMenuItemClickListener;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f4590 = c;
        this.f4592 = Character.toLowerCase(c2);
        return this;
    }

    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    public void setShowAsAction(int i) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f4587 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4588 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.f4603 = (this.f4603 & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // Yue.InterfaceMenuItemC7684
    /* JADX INFO: renamed from: ۥ */
    public AbstractC3087 mo172() {
        return null;
    }

    @Override // Yue.InterfaceMenuItemC7684
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo173() {
        return false;
    }

    @Override // Yue.InterfaceMenuItemC7684
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public InterfaceMenuItemC7684 mo6263(AbstractC3087 abstractC3087) {
        throw new UnsupportedOperationException();
    }

    @Override // Yue.InterfaceMenuItemC7684
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean mo6264() {
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m6265() {
        Drawable drawable = this.f4594;
        if (drawable != null) {
            if (this.f4601 || this.f4602) {
                Drawable drawableM13239 = C4520.m13239(drawable);
                this.f4594 = drawableM13239;
                Drawable drawableMutate = drawableM13239.mutate();
                this.f4594 = drawableMutate;
                if (this.f4601) {
                    C4520.m13236(drawableMutate, this.f4599);
                }
                if (this.f4602) {
                    C4520.m13237(this.f4594, this.f4600);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m6266() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f4596;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        Intent intent = this.f4589;
        if (intent == null) {
            return false;
        }
        this.f4595.startActivity(intent);
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: setActionView(I)Landroid/view/MenuItem; */
    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public InterfaceMenuItemC7684 setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Method merged with bridge method: setActionView(Landroid/view/View;)Landroid/view/MenuItem; */
    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public InterfaceMenuItemC7684 setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public C3085 m6269(boolean z) {
        this.f4603 = (z ? 4 : 0) | (this.f4603 & (-5));
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setShowAsActionFlags(I)Landroid/view/MenuItem; */
    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public InterfaceMenuItemC7684 setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    @InterfaceC6391
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f4592 = Character.toLowerCase(c);
        this.f4593 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setContentDescription(Ljava/lang/CharSequence;)Landroid/view/MenuItem; */
    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    @InterfaceC6391
    public InterfaceMenuItemC7684 setContentDescription(CharSequence charSequence) {
        this.f4597 = charSequence;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    @InterfaceC6391
    public MenuItem setNumericShortcut(char c, int i) {
        this.f4590 = c;
        this.f4591 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f4587 = this.f4595.getResources().getString(i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setTooltipText(Ljava/lang/CharSequence;)Landroid/view/MenuItem; */
    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    @InterfaceC6391
    public InterfaceMenuItemC7684 setTooltipText(CharSequence charSequence) {
        this.f4598 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f4594 = C4187.m12065(this.f4595, i);
        m6265();
        return this;
    }

    @Override // Yue.InterfaceMenuItemC7684, android.view.MenuItem
    @InterfaceC6391
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f4590 = c;
        this.f4591 = KeyEvent.normalizeMetaState(i);
        this.f4592 = Character.toLowerCase(c2);
        this.f4593 = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
