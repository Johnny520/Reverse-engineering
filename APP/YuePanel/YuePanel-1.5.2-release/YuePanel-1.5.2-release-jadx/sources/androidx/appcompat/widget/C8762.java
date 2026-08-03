package androidx.appcompat.widget;

import Yue.C3085;
import Yue.C3323;
import Yue.C3327;
import Yue.C6898;
import Yue.C7837;
import Yue.C8273;
import Yue.C8357;
import Yue.C8360;
import Yue.InterfaceC4330;
import Yue.InterfaceC7144;
import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.menu.C8694;
import androidx.appcompat.view.menu.InterfaceC8699;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟۟۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C8762 implements InterfaceC4330 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final String f26420 = "ToolbarWidgetWrapper";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f26421 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final long f26422 = 200;

    /* JADX INFO: renamed from: ۥ */
    public Toolbar f3678;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f3679;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public View f26423;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Spinner f26424;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public View f26425;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Drawable f26426;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Drawable f26427;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Drawable f26428;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean f26429;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public CharSequence f26430;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public CharSequence f26431;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public CharSequence f26432;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public Window.Callback f26433;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean f26434;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public C1628 f26435;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public int f26436;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public int f26437;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public Drawable f26438;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟۟۟ۡ$ۥ */
    public class ViewOnClickListenerC1637 implements View.OnClickListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final C3085 f26439;

        public ViewOnClickListenerC1637() {
            this.f26439 = new C3085(C8762.this.f3678.getContext(), 0, R.id.home, 0, 0, C8762.this.f26430);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C8762 c8762 = C8762.this;
            Window.Callback callback = c8762.f26433;
            if (callback == null || !c8762.f26434) {
                return;
            }
            callback.onMenuItemSelected(0, this.f26439);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟۟۟ۡ$ۥ۟ */
    public class C1638 extends C8360 {

        /* JADX INFO: renamed from: ۥ */
        public boolean f3680 = false;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ int f3681;

        public C1638(int i) {
            this.f3681 = i;
        }

        @Override // Yue.C8360, Yue.InterfaceC8359
        /* JADX INFO: renamed from: ۥ */
        public void mo33(View view) {
            this.f3680 = true;
        }

        @Override // Yue.C8360, Yue.InterfaceC8359
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo34(View view) {
            if (this.f3680) {
                return;
            }
            C8762.this.f3678.setVisibility(this.f3681);
        }

        @Override // Yue.C8360, Yue.InterfaceC8359
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo5710(View view) {
            C8762.this.f3678.setVisibility(0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8762(Toolbar toolbar, boolean z) {
        this(toolbar, z, C6898.C6907.f2457, C6898.C6902.f18819);
    }

    @Override // Yue.InterfaceC4330
    public void collapseActionView() {
        this.f3678.collapseActionView();
    }

    @Override // Yue.InterfaceC4330
    public Context getContext() {
        return this.f3678.getContext();
    }

    @Override // Yue.InterfaceC4330
    public int getHeight() {
        return this.f3678.getHeight();
    }

    @Override // Yue.InterfaceC4330
    public CharSequence getTitle() {
        return this.f3678.getTitle();
    }

    @Override // Yue.InterfaceC4330
    public int getVisibility() {
        return this.f3678.getVisibility();
    }

    @Override // Yue.InterfaceC4330
    public void setBackgroundDrawable(Drawable drawable) {
        this.f3678.setBackground(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC4330
    public void setIcon(int i) {
        setIcon(i != 0 ? C3323.m396(getContext(), i) : null);
    }

    @Override // Yue.InterfaceC4330
    public void setLogo(int i) {
        mo12548(i != 0 ? C3323.m396(getContext(), i) : null);
    }

    @Override // Yue.InterfaceC4330
    public void setTitle(CharSequence charSequence) {
        this.f26429 = true;
        m29250(charSequence);
    }

    @Override // Yue.InterfaceC4330
    public void setVisibility(int i) {
        this.f3678.setVisibility(i);
    }

    @Override // Yue.InterfaceC4330
    public void setWindowCallback(Window.Callback callback) {
        this.f26433 = callback;
    }

    @Override // Yue.InterfaceC4330
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f26429) {
            return;
        }
        m29250(charSequence);
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ */
    public void mo1296(Menu menu, InterfaceC8699.InterfaceC1607 interfaceC1607) {
        if (this.f26435 == null) {
            C1628 c1628 = new C1628(this.f3678.getContext());
            this.f26435 = c1628;
            c1628.m29000(C6898.C6903.f18894);
        }
        this.f26435.setCallback(interfaceC1607);
        this.f3678.setMenu((C8694) menu, this.f26435);
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo1297() {
        return this.f3678.isOverflowMenuShowing();
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo12537() {
        this.f26434 = true;
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public boolean mo12538() {
        return this.f26426 != null;
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public boolean mo12539() {
        return this.f3678.canShowOverflowMenu();
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public boolean mo12540() {
        return this.f26427 != null;
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public boolean mo12541() {
        return this.f3678.isOverflowMenuShowPending();
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public boolean mo12542() {
        return this.f3678.hideOverflowMenu();
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public boolean mo12543() {
        return this.f3678.showOverflowMenu();
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo12544(int i) {
        if (i == this.f26437) {
            return;
        }
        this.f26437 = i;
        if (TextUtils.isEmpty(this.f3678.getNavigationContentDescription())) {
            mo12572(this.f26437);
        }
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public void mo12545() {
        this.f3678.dismissPopupMenus();
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public View mo12546() {
        return this.f26425;
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public void mo12547(C8756 c8756) {
        View view = this.f26423;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f3678;
            if (parent == toolbar) {
                toolbar.removeView(this.f26423);
            }
        }
        this.f26423 = c8756;
        if (c8756 == null || this.f26436 != 2) {
            return;
        }
        this.f3678.addView(c8756, 0);
        Toolbar.C8734 c8734 = (Toolbar.C8734) this.f26423.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c8734).width = -2;
        ((ViewGroup.MarginLayoutParams) c8734).height = -2;
        c8734.f3618 = 8388691;
        c8756.setAllowCollapse(true);
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo12548(Drawable drawable) {
        this.f26427 = drawable;
        m29253();
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public boolean mo12549() {
        return this.f3678.hasExpandedActionView();
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public boolean mo12550() {
        return this.f3678.isTitleTruncated();
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public void mo12551(int i) {
        View view;
        int i2 = this.f3679 ^ i;
        this.f3679 = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m29251();
                }
                m29252();
            }
            if ((i2 & 3) != 0) {
                m29253();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f3678.setTitle(this.f26430);
                    this.f3678.setSubtitle(this.f26431);
                } else {
                    this.f3678.setTitle((CharSequence) null);
                    this.f3678.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f26425) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f3678.addView(view);
            } else {
                this.f3678.removeView(view);
            }
        }
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public void mo12552(CharSequence charSequence) {
        this.f26432 = charSequence;
        m29251();
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public void mo12553(CharSequence charSequence) {
        this.f26431 = charSequence;
        if ((this.f3679 & 8) != 0) {
            this.f3678.setSubtitle(charSequence);
        }
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public void mo12554(Drawable drawable) {
        if (this.f26438 != drawable) {
            this.f26438 = drawable;
            m29252();
        }
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public void mo12555(SparseArray<Parcelable> sparseArray) {
        this.f3678.saveHierarchyState(sparseArray);
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public void mo12556(int i) {
        Spinner spinner = this.f26424;
        if (spinner == null) {
            throw new IllegalStateException("Can't set dropdown selected position without an adapter");
        }
        spinner.setSelection(i);
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public Menu mo12557() {
        return this.f3678.getMenu();
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    public boolean mo12558() {
        return this.f26423 != null;
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public int mo12559() {
        return this.f26436;
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public void mo12560(int i) {
        C8357 c8357Mo12561 = mo12561(i, 200L);
        if (c8357Mo12561 != null) {
            c8357Mo12561.m27877();
        }
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
    public C8357 mo12561(int i, long j) {
        return C8273.m27308(this.f3678).m4324(i == 0 ? 1.0f : 0.0f).m27871(j).m27873(new C1638(i));
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public void mo12562(int i) {
        View view;
        int i2 = this.f26436;
        if (i != i2) {
            if (i2 == 1) {
                Spinner spinner = this.f26424;
                if (spinner != null) {
                    ViewParent parent = spinner.getParent();
                    Toolbar toolbar = this.f3678;
                    if (parent == toolbar) {
                        toolbar.removeView(this.f26424);
                    }
                }
            } else if (i2 == 2 && (view = this.f26423) != null) {
                ViewParent parent2 = view.getParent();
                Toolbar toolbar2 = this.f3678;
                if (parent2 == toolbar2) {
                    toolbar2.removeView(this.f26423);
                }
            }
            this.f26436 = i;
            if (i != 0) {
                if (i == 1) {
                    m29249();
                    this.f3678.addView(this.f26424, 0);
                    return;
                }
                if (i != 2) {
                    throw new IllegalArgumentException("Invalid navigation mode " + i);
                }
                View view2 = this.f26423;
                if (view2 != null) {
                    this.f3678.addView(view2, 0);
                    Toolbar.C8734 c8734 = (Toolbar.C8734) this.f26423.getLayoutParams();
                    ((ViewGroup.MarginLayoutParams) c8734).width = -2;
                    ((ViewGroup.MarginLayoutParams) c8734).height = -2;
                    c8734.f3618 = 8388691;
                }
            }
        }
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ */
    public void mo12563(int i) {
        mo12577(i != 0 ? C3323.m396(getContext(), i) : null);
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
    public void mo12564(InterfaceC8699.InterfaceC1607 interfaceC1607, C8694.InterfaceC1603 interfaceC1603) {
        this.f3678.setMenuCallbacks(interfaceC1607, interfaceC1603);
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public ViewGroup mo12565() {
        return this.f3678;
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public void mo12566(boolean z) {
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
    public void mo12567(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        m29249();
        this.f26424.setAdapter(spinnerAdapter);
        this.f26424.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public void mo12568(SparseArray<Parcelable> sparseArray) {
        this.f3678.restoreHierarchyState(sparseArray);
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
    public CharSequence mo12569() {
        return this.f3678.getSubtitle();
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ */
    public int mo12570() {
        return this.f3679;
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public int mo12571() {
        Spinner spinner = this.f26424;
        if (spinner != null) {
            return spinner.getSelectedItemPosition();
        }
        return 0;
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
    public void mo12572(int i) {
        mo12552(i == 0 ? null : getContext().getString(i));
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public void mo12573(View view) {
        View view2 = this.f26425;
        if (view2 != null && (this.f3679 & 16) != 0) {
            this.f3678.removeView(view2);
        }
        this.f26425 = view;
        if (view == null || (this.f3679 & 16) == 0) {
            return;
        }
        this.f3678.addView(view);
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ */
    public void mo12574() {
        Log.i(f26420, "Progress display unsupported");
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public int mo12575() {
        Spinner spinner = this.f26424;
        if (spinner != null) {
            return spinner.getCount();
        }
        return 0;
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    public void mo12576() {
        Log.i(f26420, "Progress display unsupported");
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ */
    public void mo12577(Drawable drawable) {
        this.f26428 = drawable;
        m29252();
    }

    @Override // Yue.InterfaceC4330
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ */
    public void mo12578(boolean z) {
        this.f3678.setCollapsible(z);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public final int m29248() {
        if (this.f3678.getNavigationIcon() == null) {
            return 11;
        }
        this.f26438 = this.f3678.getNavigationIcon();
        return 15;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public final void m29249() {
        if (this.f26424 == null) {
            this.f26424 = new C3327(getContext(), null, C6898.C1110.f18362);
            this.f26424.setLayoutParams(new Toolbar.C8734(-2, -2, 8388627));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public final void m29250(CharSequence charSequence) {
        this.f26430 = charSequence;
        if ((this.f3679 & 8) != 0) {
            this.f3678.setTitle(charSequence);
            if (this.f26429) {
                C8273.m27442(this.f3678.getRootView(), charSequence);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final void m29251() {
        if ((this.f3679 & 4) != 0) {
            if (TextUtils.isEmpty(this.f26432)) {
                this.f3678.setNavigationContentDescription(this.f26437);
            } else {
                this.f3678.setNavigationContentDescription(this.f26432);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m29252() {
        if ((this.f3679 & 4) == 0) {
            this.f3678.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f3678;
        Drawable drawable = this.f26428;
        if (drawable == null) {
            drawable = this.f26438;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m29253() {
        Drawable drawable;
        int i = this.f3679;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f26427) == null) {
            drawable = this.f26426;
        }
        this.f3678.setLogo(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8762(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f26436 = 0;
        this.f26437 = 0;
        this.f3678 = toolbar;
        this.f26430 = toolbar.getTitle();
        this.f26431 = toolbar.getSubtitle();
        this.f26429 = this.f26430 != null;
        this.f26428 = toolbar.getNavigationIcon();
        C7837 c7837M24869 = C7837.m24869(toolbar.getContext(), null, C6898.C6909.f2460, C6898.C1110.f18355, 0);
        this.f26438 = c7837M24869.m24875(C6898.C6909.f19381);
        if (z) {
            CharSequence charSequenceM24891 = c7837M24869.m24891(C6898.C6909.f19393);
            if (!TextUtils.isEmpty(charSequenceM24891)) {
                setTitle(charSequenceM24891);
            }
            CharSequence charSequenceM248912 = c7837M24869.m24891(C6898.C6909.f19391);
            if (!TextUtils.isEmpty(charSequenceM248912)) {
                mo12553(charSequenceM248912);
            }
            Drawable drawableM24875 = c7837M24869.m24875(C6898.C6909.f19386);
            if (drawableM24875 != null) {
                mo12548(drawableM24875);
            }
            Drawable drawableM248752 = c7837M24869.m24875(C6898.C6909.f19383);
            if (drawableM248752 != null) {
                setIcon(drawableM248752);
            }
            if (this.f26428 == null && (drawable = this.f26438) != null) {
                mo12577(drawable);
            }
            mo12551(c7837M24869.m24882(C6898.C6909.f19376, 0));
            int iM24888 = c7837M24869.m24888(C6898.C6909.f19375, 0);
            if (iM24888 != 0) {
                mo12573(LayoutInflater.from(this.f3678.getContext()).inflate(iM24888, (ViewGroup) this.f3678, false));
                mo12551(this.f3679 | 16);
            }
            int iM24884 = c7837M24869.m24884(C6898.C6909.f19379, 0);
            if (iM24884 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f3678.getLayoutParams();
                layoutParams.height = iM24884;
                this.f3678.setLayoutParams(layoutParams);
            }
            int iM24873 = c7837M24869.m24873(C6898.C6909.f19373, -1);
            int iM248732 = c7837M24869.m24873(C6898.C6909.f19369, -1);
            if (iM24873 >= 0 || iM248732 >= 0) {
                this.f3678.setContentInsetsRelative(Math.max(iM24873, 0), Math.max(iM248732, 0));
            }
            int iM248882 = c7837M24869.m24888(C6898.C6909.f19394, 0);
            if (iM248882 != 0) {
                Toolbar toolbar2 = this.f3678;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), iM248882);
            }
            int iM248883 = c7837M24869.m24888(C6898.C6909.f19392, 0);
            if (iM248883 != 0) {
                Toolbar toolbar3 = this.f3678;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), iM248883);
            }
            int iM248884 = c7837M24869.m24888(C6898.C6909.f19388, 0);
            if (iM248884 != 0) {
                this.f3678.setPopupTheme(iM248884);
            }
        } else {
            this.f3679 = m29248();
        }
        c7837M24869.m24899();
        mo12544(i);
        this.f26432 = this.f3678.getNavigationContentDescription();
        this.f3678.setNavigationOnClickListener(new ViewOnClickListenerC1637());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC4330
    public void setIcon(Drawable drawable) {
        this.f26426 = drawable;
        m29253();
    }
}
