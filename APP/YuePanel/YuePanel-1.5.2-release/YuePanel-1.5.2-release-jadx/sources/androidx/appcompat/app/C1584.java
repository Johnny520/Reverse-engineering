package androidx.appcompat.app;

import Yue.C4536;
import Yue.C4537;
import Yue.C5194;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7613;
import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟ */
/* JADX INFO: loaded from: classes.dex */
public class C1584 implements C4537.InterfaceC4540 {

    /* JADX INFO: renamed from: ۥ */
    public final InterfaceC8646 f3620;

    /* JADX INFO: renamed from: ۥ۟ */
    public final C4537 f3621;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C4536 f25729;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f25730;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Drawable f25731;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f25732;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean f25733;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final int f25734;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final int f25735;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public View.OnClickListener f25736;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean f25737;

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟$ۥ, reason: contains not printable characters */
    public class ViewOnClickListenerC8645 implements View.OnClickListener {
        public ViewOnClickListenerC8645() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1584 c1584 = C1584.this;
            if (c1584.f25732) {
                c1584.m28795();
                return;
            }
            View.OnClickListener onClickListener = c1584.f25736;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟$ۥ۟, reason: contains not printable characters */
    public interface InterfaceC8646 {
        /* JADX INFO: renamed from: ۥ */
        boolean mo4604();

        /* JADX INFO: renamed from: ۥ۟ */
        Context mo4605();

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        void mo28796(Drawable drawable, @InterfaceC7613 int i);

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        Drawable mo28797();

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        void mo28798(@InterfaceC7613 int i);
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟$ۥ۟۟, reason: contains not printable characters */
    public interface InterfaceC8647 {
        @InterfaceC6490
        InterfaceC8646 getDrawerToggleDelegate();
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟$ۥ۟۟۟, reason: contains not printable characters */
    public static class C8648 implements InterfaceC8646 {

        /* JADX INFO: renamed from: ۥ */
        public final Activity f3622;

        public C8648(Activity activity) {
            this.f3622 = activity;
        }

        @Override // androidx.appcompat.app.C1584.InterfaceC8646
        /* JADX INFO: renamed from: ۥ */
        public boolean mo4604() {
            ActionBar actionBar = this.f3622.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.C1584.InterfaceC8646
        /* JADX INFO: renamed from: ۥ۟ */
        public Context mo4605() {
            ActionBar actionBar = this.f3622.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f3622;
        }

        @Override // androidx.appcompat.app.C1584.InterfaceC8646
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo28796(Drawable drawable, int i) {
            ActionBar actionBar = this.f3622.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i);
            }
        }

        @Override // androidx.appcompat.app.C1584.InterfaceC8646
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public Drawable mo28797() {
            TypedArray typedArrayObtainStyledAttributes = mo4605().obtainStyledAttributes(null, new int[]{R.attr.homeAsUpIndicator}, R.attr.actionBarStyle, 0);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            typedArrayObtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.C1584.InterfaceC8646
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo28798(int i) {
            ActionBar actionBar = this.f3622.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C8649 implements InterfaceC8646 {

        /* JADX INFO: renamed from: ۥ */
        public final Toolbar f3623;

        /* JADX INFO: renamed from: ۥ۟ */
        public final Drawable f3624;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final CharSequence f25739;

        public C8649(Toolbar toolbar) {
            this.f3623 = toolbar;
            this.f3624 = toolbar.getNavigationIcon();
            this.f25739 = toolbar.getNavigationContentDescription();
        }

        @Override // androidx.appcompat.app.C1584.InterfaceC8646
        /* JADX INFO: renamed from: ۥ */
        public boolean mo4604() {
            return true;
        }

        @Override // androidx.appcompat.app.C1584.InterfaceC8646
        /* JADX INFO: renamed from: ۥ۟ */
        public Context mo4605() {
            return this.f3623.getContext();
        }

        @Override // androidx.appcompat.app.C1584.InterfaceC8646
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo28796(Drawable drawable, @InterfaceC7613 int i) {
            this.f3623.setNavigationIcon(drawable);
            mo28798(i);
        }

        @Override // androidx.appcompat.app.C1584.InterfaceC8646
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public Drawable mo28797() {
            return this.f3624;
        }

        @Override // androidx.appcompat.app.C1584.InterfaceC8646
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo28798(@InterfaceC7613 int i) {
            if (i == 0) {
                this.f3623.setNavigationContentDescription(this.f25739);
            } else {
                this.f3623.setNavigationContentDescription(i);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1584(Activity activity, C4537 c4537, @InterfaceC7613 int i, @InterfaceC7613 int i2) {
        this(activity, null, c4537, null, i, i2);
    }

    @Override // Yue.C4537.InterfaceC4540
    public void onDrawerClosed(View view) {
        m28792(0.0f);
        if (this.f25732) {
            m28785(this.f25734);
        }
    }

    @Override // Yue.C4537.InterfaceC4540
    public void onDrawerOpened(View view) {
        m28792(1.0f);
        if (this.f25732) {
            m28785(this.f25735);
        }
    }

    @Override // Yue.C4537.InterfaceC4540
    public void onDrawerSlide(View view, float f) {
        if (this.f25730) {
            m28792(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            m28792(0.0f);
        }
    }

    @Override // Yue.C4537.InterfaceC4540
    public void onDrawerStateChanged(int i) {
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public C4536 m4602() {
        return this.f25729;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public Drawable m4603() {
        return this.f3620.mo28797();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public View.OnClickListener m28780() {
        return this.f25736;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m28781() {
        return this.f25732;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean m28782() {
        return this.f25730;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m28783(Configuration configuration) {
        if (!this.f25733) {
            this.f25731 = m4603();
        }
        m28794();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m28784(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.f25732) {
            return false;
        }
        m28795();
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m28785(int i) {
        this.f3620.mo28798(i);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m28786(Drawable drawable, int i) {
        if (!this.f25737 && !this.f3620.mo4604()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f25737 = true;
        }
        this.f3620.mo28796(drawable, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m28787(@InterfaceC6391 C4536 c4536) {
        this.f25729 = c4536;
        m28794();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m28788(boolean z) {
        if (z != this.f25732) {
            if (z) {
                m28786(this.f25729, this.f3621.m13335(C5194.f1338) ? this.f25735 : this.f25734);
            } else {
                m28786(this.f25731, 0);
            }
            this.f25732 = z;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m28789(boolean z) {
        this.f25730 = z;
        if (z) {
            return;
        }
        m28792(0.0f);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m28790(int i) {
        m28791(i != 0 ? this.f3621.getResources().getDrawable(i) : null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m28791(Drawable drawable) {
        if (drawable == null) {
            this.f25731 = m4603();
            this.f25733 = false;
        } else {
            this.f25731 = drawable;
            this.f25733 = true;
        }
        if (this.f25732) {
            return;
        }
        m28786(this.f25731, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m28792(float f) {
        if (f == 1.0f) {
            this.f25729.m13308(true);
        } else if (f == 0.0f) {
            this.f25729.m13308(false);
        }
        this.f25729.m13306(f);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m28793(View.OnClickListener onClickListener) {
        this.f25736 = onClickListener;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m28794() {
        if (this.f3621.m13335(C5194.f1338)) {
            m28792(1.0f);
        } else {
            m28792(0.0f);
        }
        if (this.f25732) {
            m28786(this.f25729, this.f3621.m13335(C5194.f1338) ? this.f25735 : this.f25734);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m28795() {
        int iM13326 = this.f3621.m13326(C5194.f1338);
        if (this.f3621.m13338(C5194.f1338) && iM13326 != 2) {
            this.f3621.m13313(C5194.f1338);
        } else if (iM13326 != 1) {
            this.f3621.m13343(C5194.f1338);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1584(Activity activity, C4537 c4537, Toolbar toolbar, @InterfaceC7613 int i, @InterfaceC7613 int i2) {
        this(activity, toolbar, c4537, null, i, i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    public C1584(Activity activity, Toolbar toolbar, C4537 c4537, C4536 c4536, @InterfaceC7613 int i, @InterfaceC7613 int i2) {
        this.f25730 = true;
        this.f25732 = true;
        this.f25737 = false;
        if (toolbar != null) {
            this.f3620 = new C8649(toolbar);
            toolbar.setNavigationOnClickListener(new ViewOnClickListenerC8645());
        } else if (activity instanceof InterfaceC8647) {
            this.f3620 = ((InterfaceC8647) activity).getDrawerToggleDelegate();
        } else {
            this.f3620 = new C8648(activity);
        }
        this.f3621 = c4537;
        this.f25734 = i;
        this.f25735 = i2;
        if (c4536 == null) {
            this.f25729 = new C4536(this.f3620.mo4605());
        } else {
            this.f25729 = c4536;
        }
        this.f25731 = m4603();
    }
}
