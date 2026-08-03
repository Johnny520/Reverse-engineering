package androidx.appcompat.app;

import Yue.AbstractC3086;
import Yue.C3084;
import Yue.C3323;
import Yue.C6898;
import Yue.C7683;
import Yue.C8273;
import Yue.C8357;
import Yue.C8358;
import Yue.C8360;
import Yue.InterfaceC4330;
import Yue.InterfaceC6391;
import Yue.InterfaceC7144;
import Yue.InterfaceC8359;
import Yue.InterfaceC8361;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.AbstractC1583;
import androidx.appcompat.view.menu.C8694;
import androidx.appcompat.view.menu.C8698;
import androidx.appcompat.view.menu.SubMenuC8702;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C8756;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AbstractC8885;
import androidx.fragment.app.FragmentActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C8682 extends AbstractC1583 implements ActionBarOverlayLayout.InterfaceC8704 {

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final String f25877 = "WindowDecorActionBar";

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final Interpolator f25878 = new AccelerateInterpolator();

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final Interpolator f25879 = new DecelerateInterpolator();

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final int f25880 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final long f25881 = 100;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final long f25882 = 200;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public Context f25883;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public Context f25884;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public Activity f25885;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public ActionBarOverlayLayout f25886;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public ActionBarContainer f25887;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public InterfaceC4330 f25888;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public ActionBarContextView f25889;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public View f25890;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public C8756 f25891;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public C8685 f25893;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f25895;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public C8684 f25896;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public AbstractC3086 f25897;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public AbstractC3086.InterfaceC0044 f25898;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean f25899;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean f25901;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public boolean f25904;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public boolean f25905;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public boolean f25906;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public C8358 f25908;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public boolean f25909;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public boolean f25910;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public ArrayList<C8685> f25892 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int f25894 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public ArrayList<AbstractC1583.InterfaceC8641> f25900 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public int f25902 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean f25903 = true;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public boolean f25907 = true;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final InterfaceC8359 f25911 = new C1596();

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public final InterfaceC8359 f25912 = new C1597();

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public final InterfaceC8361 f25913 = new C8683();

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟ۢ$ۥ */
    public class C1596 extends C8360 {
        public C1596() {
        }

        @Override // Yue.C8360, Yue.InterfaceC8359
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo34(View view) {
            View view2;
            C8682 c8682 = C8682.this;
            if (c8682.f25903 && (view2 = c8682.f25890) != null) {
                view2.setTranslationY(0.0f);
                C8682.this.f25887.setTranslationY(0.0f);
            }
            C8682.this.f25887.setVisibility(8);
            C8682.this.f25887.setTransitioning(false);
            C8682 c86822 = C8682.this;
            c86822.f25908 = null;
            c86822.m28969();
            ActionBarOverlayLayout actionBarOverlayLayout = C8682.this.f25886;
            if (actionBarOverlayLayout != null) {
                C8273.m27433(actionBarOverlayLayout);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟ۢ$ۥ۟ */
    public class C1597 extends C8360 {
        public C1597() {
        }

        @Override // Yue.C8360, Yue.InterfaceC8359
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo34(View view) {
            C8682 c8682 = C8682.this;
            c8682.f25908 = null;
            c8682.f25887.requestLayout();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟ۢ$ۥ۟۟, reason: contains not printable characters */
    public class C8683 implements InterfaceC8361 {
        public C8683() {
        }

        @Override // Yue.InterfaceC8361
        /* JADX INFO: renamed from: ۥ */
        public void mo4329(View view) {
            ((View) C8682.this.f25887.getParent()).invalidate();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟ۢ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public class C8684 extends AbstractC3086 implements C8694.InterfaceC1603 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final Context f25914;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final C8694 f25915;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public AbstractC3086.InterfaceC0044 f25916;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public WeakReference<View> f25917;

        public C8684(Context context, AbstractC3086.InterfaceC0044 interfaceC0044) {
            this.f25914 = context;
            this.f25916 = interfaceC0044;
            C8694 defaultShowAsAction = new C8694(context).setDefaultShowAsAction(1);
            this.f25915 = defaultShowAsAction;
            defaultShowAsAction.setCallback(this);
        }

        @Override // androidx.appcompat.view.menu.C8694.InterfaceC1603
        public boolean onMenuItemSelected(@InterfaceC6391 C8694 c8694, @InterfaceC6391 MenuItem menuItem) {
            AbstractC3086.InterfaceC0044 interfaceC0044 = this.f25916;
            if (interfaceC0044 != null) {
                return interfaceC0044.mo6288(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C8694.InterfaceC1603
        public void onMenuModeChange(@InterfaceC6391 C8694 c8694) {
            if (this.f25916 == null) {
                return;
            }
            mo6277();
            C8682.this.f25889.mo5709();
        }

        @Override // Yue.AbstractC3086
        /* JADX INFO: renamed from: ۥ */
        public void mo174() {
            C8682 c8682 = C8682.this;
            if (c8682.f25896 != this) {
                return;
            }
            if (C8682.m28962(c8682.f25904, c8682.f25905, false)) {
                this.f25916.mo6287(this);
            } else {
                C8682 c86822 = C8682.this;
                c86822.f25897 = this;
                c86822.f25898 = this.f25916;
            }
            this.f25916 = null;
            C8682.this.m28967(false);
            C8682.this.f25889.m29068();
            C8682 c86823 = C8682.this;
            c86823.f25886.setHideOnContentScrollEnabled(c86823.f25910);
            C8682.this.f25896 = null;
        }

        @Override // Yue.AbstractC3086
        /* JADX INFO: renamed from: ۥ۟ */
        public View mo175() {
            WeakReference<View> weakReference = this.f25917;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // Yue.AbstractC3086
        /* JADX INFO: renamed from: ۥ۟۟ */
        public Menu mo6271() {
            return this.f25915;
        }

        @Override // Yue.AbstractC3086
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public MenuInflater mo6272() {
            return new C7683(this.f25914);
        }

        @Override // Yue.AbstractC3086
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public CharSequence mo6273() {
            return C8682.this.f25889.getSubtitle();
        }

        @Override // Yue.AbstractC3086
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public CharSequence mo6275() {
            return C8682.this.f25889.getTitle();
        }

        @Override // Yue.AbstractC3086
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public void mo6277() {
            if (C8682.this.f25896 != this) {
                return;
            }
            this.f25915.stopDispatchingItemsChanged();
            try {
                this.f25916.mo177(this, this.f25915);
            } finally {
                this.f25915.startDispatchingItemsChanged();
            }
        }

        @Override // Yue.AbstractC3086
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public boolean mo6278() {
            return C8682.this.f25889.m29071();
        }

        @Override // Yue.AbstractC3086
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public void mo6280(View view) {
            C8682.this.f25889.setCustomView(view);
            this.f25917 = new WeakReference<>(view);
        }

        @Override // Yue.AbstractC3086
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo6281(int i) {
            mo6282(C8682.this.f25883.getResources().getString(i));
        }

        @Override // Yue.AbstractC3086
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        public void mo6282(CharSequence charSequence) {
            C8682.this.f25889.setSubtitle(charSequence);
        }

        @Override // Yue.AbstractC3086
        /* JADX INFO: renamed from: ۥ۟۟۠۟ */
        public void mo6284(int i) {
            mo6285(C8682.this.f25883.getResources().getString(i));
        }

        @Override // Yue.AbstractC3086
        /* JADX INFO: renamed from: ۥ۟۟۠۠ */
        public void mo6285(CharSequence charSequence) {
            C8682.this.f25889.setTitle(charSequence);
        }

        @Override // Yue.AbstractC3086
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
        public void mo6286(boolean z) {
            super.mo6286(z);
            C8682.this.f25889.setTitleOptional(z);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public boolean m28983() {
            this.f25915.stopDispatchingItemsChanged();
            try {
                return this.f25916.mo176(this, this.f25915);
            } finally {
                this.f25915.startDispatchingItemsChanged();
            }
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public void m28984(C8694 c8694, boolean z) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public void m28985(SubMenuC8702 subMenuC8702) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean m28986(SubMenuC8702 subMenuC8702) {
            if (this.f25916 == null) {
                return false;
            }
            if (!subMenuC8702.hasVisibleItems()) {
                return true;
            }
            new C8698(C8682.this.mo28708(), subMenuC8702).m29062();
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟ۢ$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public class C8685 extends AbstractC1583.AbstractC8643 {

        /* JADX INFO: renamed from: ۥ۟ */
        public AbstractC1583.InterfaceC8644 f3646;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Object f25919;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Drawable f25920;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public CharSequence f25921;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public CharSequence f25922;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int f25923 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public View f25924;

        public C8685() {
        }

        @Override // androidx.appcompat.app.AbstractC1583.AbstractC8643
        /* JADX INFO: renamed from: ۥ */
        public CharSequence mo4598() {
            return this.f25922;
        }

        @Override // androidx.appcompat.app.AbstractC1583.AbstractC8643
        /* JADX INFO: renamed from: ۥ۟ */
        public View mo4599() {
            return this.f25924;
        }

        @Override // androidx.appcompat.app.AbstractC1583.AbstractC8643
        /* JADX INFO: renamed from: ۥ۟۟ */
        public Drawable mo28764() {
            return this.f25920;
        }

        @Override // androidx.appcompat.app.AbstractC1583.AbstractC8643
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public int mo28765() {
            return this.f25923;
        }

        @Override // androidx.appcompat.app.AbstractC1583.AbstractC8643
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public Object mo28766() {
            return this.f25919;
        }

        @Override // androidx.appcompat.app.AbstractC1583.AbstractC8643
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public CharSequence mo28767() {
            return this.f25921;
        }

        @Override // androidx.appcompat.app.AbstractC1583.AbstractC8643
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo28768() {
            C8682.this.mo28726(this);
        }

        @Override // androidx.appcompat.app.AbstractC1583.AbstractC8643
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public AbstractC1583.AbstractC8643 mo28769(int i) {
            return mo28770(C8682.this.f25883.getResources().getText(i));
        }

        @Override // androidx.appcompat.app.AbstractC1583.AbstractC8643
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public AbstractC1583.AbstractC8643 mo28770(CharSequence charSequence) {
            this.f25922 = charSequence;
            int i = this.f25923;
            if (i >= 0) {
                C8682.this.f25891.m29241(i);
            }
            return this;
        }

        @Override // androidx.appcompat.app.AbstractC1583.AbstractC8643
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public AbstractC1583.AbstractC8643 mo28771(int i) {
            return mo28772(LayoutInflater.from(C8682.this.mo28708()).inflate(i, (ViewGroup) null));
        }

        @Override // androidx.appcompat.app.AbstractC1583.AbstractC8643
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
        public AbstractC1583.AbstractC8643 mo28772(View view) {
            this.f25924 = view;
            int i = this.f25923;
            if (i >= 0) {
                C8682.this.f25891.m29241(i);
            }
            return this;
        }

        @Override // androidx.appcompat.app.AbstractC1583.AbstractC8643
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public AbstractC1583.AbstractC8643 mo28773(int i) {
            return mo28774(C3323.m396(C8682.this.f25883, i));
        }

        @Override // androidx.appcompat.app.AbstractC1583.AbstractC8643
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public AbstractC1583.AbstractC8643 mo28774(Drawable drawable) {
            this.f25920 = drawable;
            int i = this.f25923;
            if (i >= 0) {
                C8682.this.f25891.m29241(i);
            }
            return this;
        }

        @Override // androidx.appcompat.app.AbstractC1583.AbstractC8643
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        public AbstractC1583.AbstractC8643 mo28775(AbstractC1583.InterfaceC8644 interfaceC8644) {
            this.f3646 = interfaceC8644;
            return this;
        }

        @Override // androidx.appcompat.app.AbstractC1583.AbstractC8643
        /* JADX INFO: renamed from: ۥ۟۟۠ */
        public AbstractC1583.AbstractC8643 mo28776(Object obj) {
            this.f25919 = obj;
            return this;
        }

        @Override // androidx.appcompat.app.AbstractC1583.AbstractC8643
        /* JADX INFO: renamed from: ۥ۟۟۠۟ */
        public AbstractC1583.AbstractC8643 mo28777(int i) {
            return mo28778(C8682.this.f25883.getResources().getText(i));
        }

        @Override // androidx.appcompat.app.AbstractC1583.AbstractC8643
        /* JADX INFO: renamed from: ۥ۟۟۠۠ */
        public AbstractC1583.AbstractC8643 mo28778(CharSequence charSequence) {
            this.f25921 = charSequence;
            int i = this.f25923;
            if (i >= 0) {
                C8682.this.f25891.m29241(i);
            }
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public AbstractC1583.InterfaceC8644 m28987() {
            return this.f3646;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public void m28988(int i) {
            this.f25923 = i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8682(Activity activity, boolean z) {
        this.f25885 = activity;
        View decorView = activity.getWindow().getDecorView();
        m28978(decorView);
        if (z) {
            return;
        }
        this.f25890 = decorView.findViewById(R.id.content);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public static boolean m28962(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC8704
    /* JADX INFO: renamed from: ۥ */
    public void mo4633() {
        if (this.f25905) {
            this.f25905 = false;
            m28982(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC8704
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo4634() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC8704
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void mo28963(boolean z) {
        this.f25903 = z;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC8704
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void mo28964() {
        if (this.f25905) {
            return;
        }
        this.f25905 = true;
        m28982(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC8704
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void mo28965() {
        C8358 c8358 = this.f25908;
        if (c8358 != null) {
            c8358.m4327();
            this.f25908 = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC8704
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void mo28966(int i) {
        this.f25902 = i;
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo28688(AbstractC1583.InterfaceC8641 interfaceC8641) {
        this.f25900.add(interfaceC8641);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public void mo28689(AbstractC1583.AbstractC8643 abstractC8643) {
        mo28692(abstractC8643, this.f25892.isEmpty());
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo28690(AbstractC1583.AbstractC8643 abstractC8643, int i) {
        mo28691(abstractC8643, i, this.f25892.isEmpty());
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo28691(AbstractC1583.AbstractC8643 abstractC8643, int i, boolean z) {
        m28973();
        this.f25891.m4697(abstractC8643, i, z);
        m28970(abstractC8643, i);
        if (z) {
            mo28726(abstractC8643);
        }
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public void mo28692(AbstractC1583.AbstractC8643 abstractC8643, boolean z) {
        m28973();
        this.f25891.m4698(abstractC8643, z);
        m28970(abstractC8643, this.f25892.size());
        if (z) {
            mo28726(abstractC8643);
        }
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public boolean mo28694() {
        InterfaceC4330 interfaceC4330 = this.f25888;
        if (interfaceC4330 == null || !interfaceC4330.mo12549()) {
            return false;
        }
        this.f25888.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo28695(boolean z) {
        if (z == this.f25899) {
            return;
        }
        this.f25899 = z;
        int size = this.f25900.size();
        for (int i = 0; i < size; i++) {
            this.f25900.get(i).m4596(z);
        }
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public View mo28696() {
        return this.f25888.mo12546();
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public int mo28697() {
        return this.f25888.mo12570();
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public float mo28698() {
        return C8273.m27347(this.f25887);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public int mo28699() {
        return this.f25887.getHeight();
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public int mo28700() {
        return this.f25886.getActionBarHideOffset();
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public int mo28701() {
        int iMo12559 = this.f25888.mo12559();
        if (iMo12559 == 1) {
            return this.f25888.mo12575();
        }
        if (iMo12559 != 2) {
            return 0;
        }
        return this.f25892.size();
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public int mo28702() {
        return this.f25888.mo12559();
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public int mo28703() {
        C8685 c8685;
        int iMo12559 = this.f25888.mo12559();
        if (iMo12559 == 1) {
            return this.f25888.mo12571();
        }
        if (iMo12559 == 2 && (c8685 = this.f25893) != null) {
            return c8685.mo28765();
        }
        return -1;
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public AbstractC1583.AbstractC8643 mo28704() {
        return this.f25893;
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    public CharSequence mo28705() {
        return this.f25888.mo12569();
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public AbstractC1583.AbstractC8643 mo28706(int i) {
        return this.f25892.get(i);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public int mo28707() {
        return this.f25892.size();
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
    public Context mo28708() {
        if (this.f25884 == null) {
            TypedValue typedValue = new TypedValue();
            this.f25883.getTheme().resolveAttribute(C6898.C1110.f18360, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f25884 = new ContextThemeWrapper(this.f25883, i);
            } else {
                this.f25884 = this.f25883;
            }
        }
        return this.f25884;
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public CharSequence mo28709() {
        return this.f25888.getTitle();
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ */
    public void mo28710() {
        if (this.f25904) {
            return;
        }
        this.f25904 = true;
        m28982(false);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public boolean mo28712() {
        return this.f25886.m29081();
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public boolean mo28713() {
        int iMo28699 = mo28699();
        return this.f25907 && (iMo28699 == 0 || mo28700() < iMo28699);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
    public boolean mo28714() {
        InterfaceC4330 interfaceC4330 = this.f25888;
        return interfaceC4330 != null && interfaceC4330.mo12550();
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public AbstractC1583.AbstractC8643 mo28715() {
        return new C8685();
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
    public void mo28716(Configuration configuration) {
        m28979(C3084.m170(this.f25883).m6261());
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public boolean mo28718(int i, KeyEvent keyEvent) {
        Menu menuMo6271;
        C8684 c8684 = this.f25896;
        if (c8684 == null || (menuMo6271 = c8684.mo6271()) == null) {
            return false;
        }
        menuMo6271.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuMo6271.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ */
    public void mo28721() {
        m28968();
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public void mo28722(AbstractC1583.InterfaceC8641 interfaceC8641) {
        this.f25900.remove(interfaceC8641);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    public void mo28723(AbstractC1583.AbstractC8643 abstractC8643) {
        mo28724(abstractC8643.mo28765());
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ */
    public void mo28724(int i) {
        if (this.f25891 == null) {
            return;
        }
        C8685 c8685 = this.f25893;
        int iMo28765 = c8685 != null ? c8685.mo28765() : this.f25894;
        this.f25891.m29240(i);
        C8685 c8685Remove = this.f25892.remove(i);
        if (c8685Remove != null) {
            c8685Remove.m28988(-1);
        }
        int size = this.f25892.size();
        for (int i2 = i; i2 < size; i2++) {
            this.f25892.get(i2).m28988(i2);
        }
        if (iMo28765 == i) {
            mo28726(this.f25892.isEmpty() ? null : this.f25892.get(Math.max(0, i - 1)));
        }
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ */
    public boolean mo28725() {
        ViewGroup viewGroupMo12565 = this.f25888.mo12565();
        if (viewGroupMo12565 == null || viewGroupMo12565.hasFocus()) {
            return false;
        }
        viewGroupMo12565.requestFocus();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ */
    public void mo28726(AbstractC1583.AbstractC8643 abstractC8643) {
        if (mo28702() != 2) {
            this.f25894 = abstractC8643 != null ? abstractC8643.mo28765() : -1;
            return;
        }
        AbstractC8885 abstractC8885M30052 = (!(this.f25885 instanceof FragmentActivity) || this.f25888.mo12565().isInEditMode()) ? null : ((FragmentActivity) this.f25885).getSupportFragmentManager().m29749().m30052();
        C8685 c8685 = this.f25893;
        if (c8685 != abstractC8643) {
            this.f25891.setTabSelected(abstractC8643 != null ? abstractC8643.mo28765() : -1);
            C8685 c86852 = this.f25893;
            if (c86852 != null) {
                c86852.m28987().m4601(this.f25893, abstractC8885M30052);
            }
            C8685 c86853 = (C8685) abstractC8643;
            this.f25893 = c86853;
            if (c86853 != null) {
                c86853.m28987().m4600(this.f25893, abstractC8885M30052);
            }
        } else if (c8685 != null) {
            c8685.m28987().m28779(this.f25893, abstractC8885M30052);
            this.f25891.m29231(abstractC8643.mo28765());
        }
        if (abstractC8885M30052 == null || abstractC8885M30052.mo29911()) {
            return;
        }
        abstractC8885M30052.mo29904();
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
    public void mo28727(Drawable drawable) {
        this.f25887.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ */
    public void mo28728(int i) {
        mo28729(LayoutInflater.from(mo28708()).inflate(i, this.f25888.mo12565(), false));
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥۣ۟۟ */
    public void mo28729(View view) {
        this.f25888.mo12573(view);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo28730(View view, AbstractC1583.C8639 c8639) {
        view.setLayoutParams(c8639);
        this.f25888.mo12573(view);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public void mo28731(boolean z) {
        if (this.f25895) {
            return;
        }
        mo28732(z);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public void mo28732(boolean z) {
        mo28734(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    public void mo28733(int i) {
        if ((i & 4) != 0) {
            this.f25895 = true;
        }
        this.f25888.mo12551(i);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥۣۣ۟۟ */
    public void mo28734(int i, int i2) {
        int iMo12570 = this.f25888.mo12570();
        if ((i2 & 4) != 0) {
            this.f25895 = true;
        }
        this.f25888.mo12551((i & i2) | ((~i2) & iMo12570));
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public void mo28735(boolean z) {
        mo28734(z ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ */
    public void mo28736(boolean z) {
        mo28734(z ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ */
    public void mo28737(boolean z) {
        mo28734(z ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ */
    public void mo28738(boolean z) {
        mo28734(z ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ */
    public void mo28739(float f) {
        C8273.m27453(this.f25887, f);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۤ */
    public void mo28740(int i) {
        if (i != 0 && !this.f25886.m29082()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
        }
        this.f25886.setActionBarHideOffset(i);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۤ۟ */
    public void mo28741(boolean z) {
        if (z && !this.f25886.m29082()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f25910 = z;
        this.f25886.setHideOnContentScrollEnabled(z);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠ */
    public void mo28742(int i) {
        this.f25888.mo12572(i);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ */
    public void mo28743(CharSequence charSequence) {
        this.f25888.mo12552(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ */
    public void mo28744(int i) {
        this.f25888.mo12563(i);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public void mo28745(Drawable drawable) {
        this.f25888.mo12577(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ */
    public void mo28746(boolean z) {
        this.f25888.mo12566(z);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ */
    public void mo28747(int i) {
        this.f25888.setIcon(i);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۤۦ */
    public void mo28748(Drawable drawable) {
        this.f25888.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    public void mo28749(SpinnerAdapter spinnerAdapter, AbstractC1583.InterfaceC8642 interfaceC8642) {
        this.f25888.mo12567(spinnerAdapter, new C8677(interfaceC8642));
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ */
    public void mo28750(int i) {
        this.f25888.setLogo(i);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۥ */
    public void mo28751(Drawable drawable) {
        this.f25888.mo12548(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۥ۟ */
    public void mo28752(int i) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        int iMo12559 = this.f25888.mo12559();
        if (iMo12559 == 2) {
            this.f25894 = mo28703();
            mo28726(null);
            this.f25891.setVisibility(8);
        }
        if (iMo12559 != i && !this.f25901 && (actionBarOverlayLayout = this.f25886) != null) {
            C8273.m27433(actionBarOverlayLayout);
        }
        this.f25888.mo12562(i);
        boolean z = false;
        if (i == 2) {
            m28973();
            this.f25891.setVisibility(0);
            int i2 = this.f25894;
            if (i2 != -1) {
                mo28753(i2);
                this.f25894 = -1;
            }
        }
        this.f25888.mo12578(i == 2 && !this.f25901);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f25886;
        if (i == 2 && !this.f25901) {
            z = true;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠ */
    public void mo28753(int i) {
        int iMo12559 = this.f25888.mo12559();
        if (iMo12559 == 1) {
            this.f25888.mo12556(i);
        } else {
            if (iMo12559 != 2) {
                throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
            }
            mo28726(this.f25892.get(i));
        }
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۥۡ */
    public void mo28754(boolean z) {
        C8358 c8358;
        this.f25909 = z;
        if (z || (c8358 = this.f25908) == null) {
            return;
        }
        c8358.m4327();
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ */
    public void mo28755(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۥۣ */
    public void mo28756(Drawable drawable) {
        this.f25887.setStackedBackground(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۥۤ */
    public void mo28757(int i) {
        mo28758(this.f25883.getString(i));
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۥۥ */
    public void mo28758(CharSequence charSequence) {
        this.f25888.mo12553(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۥۦ */
    public void mo28759(int i) {
        mo28760(this.f25883.getString(i));
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۥۧ */
    public void mo28760(CharSequence charSequence) {
        this.f25888.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۥۨ */
    public void mo28761(CharSequence charSequence) {
        this.f25888.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۦ */
    public void mo28762() {
        if (this.f25904) {
            this.f25904 = false;
            m28982(false);
        }
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۦ۟ */
    public AbstractC3086 mo28763(AbstractC3086.InterfaceC0044 interfaceC0044) {
        C8684 c8684 = this.f25896;
        if (c8684 != null) {
            c8684.mo174();
        }
        this.f25886.setHideOnContentScrollEnabled(false);
        this.f25889.m29072();
        C8684 c86842 = new C8684(this.f25889.getContext(), interfaceC0044);
        if (!c86842.m28983()) {
            return null;
        }
        this.f25896 = c86842;
        c86842.mo6277();
        this.f25889.m29069(c86842);
        m28967(true);
        return c86842;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public void m28967(boolean z) {
        C8357 c8357Mo12561;
        C8357 c8357Mo5708;
        if (z) {
            m28981();
        } else {
            m28977();
        }
        if (!m28980()) {
            if (z) {
                this.f25888.setVisibility(4);
                this.f25889.setVisibility(0);
                return;
            } else {
                this.f25888.setVisibility(0);
                this.f25889.setVisibility(8);
                return;
            }
        }
        if (z) {
            c8357Mo5708 = this.f25888.mo12561(4, 100L);
            c8357Mo12561 = this.f25889.mo5708(0, 200L);
        } else {
            c8357Mo12561 = this.f25888.mo12561(0, 200L);
            c8357Mo5708 = this.f25889.mo5708(8, 100L);
        }
        C8358 c8358 = new C8358();
        c8358.m27896(c8357Mo5708, c8357Mo12561);
        c8358.m27900();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public final void m28968() {
        if (this.f25893 != null) {
            mo28726(null);
        }
        this.f25892.clear();
        C8756 c8756 = this.f25891;
        if (c8756 != null) {
            c8756.m29239();
        }
        this.f25894 = -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public void m28969() {
        AbstractC3086.InterfaceC0044 interfaceC0044 = this.f25898;
        if (interfaceC0044 != null) {
            interfaceC0044.mo6287(this.f25897);
            this.f25897 = null;
            this.f25898 = null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public final void m28970(AbstractC1583.AbstractC8643 abstractC8643, int i) {
        C8685 c8685 = (C8685) abstractC8643;
        if (c8685.m28987() == null) {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
        c8685.m28988(i);
        this.f25892.add(i, c8685);
        int size = this.f25892.size();
        while (true) {
            i++;
            if (i >= size) {
                return;
            } else {
                this.f25892.get(i).m28988(i);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public void m28971(boolean z) {
        View view;
        C8358 c8358 = this.f25908;
        if (c8358 != null) {
            c8358.m4327();
        }
        if (this.f25902 != 0 || (!this.f25909 && !z)) {
            this.f25911.mo34(null);
            return;
        }
        this.f25887.setAlpha(1.0f);
        this.f25887.setTransitioning(true);
        C8358 c83582 = new C8358();
        float f = -this.f25887.getHeight();
        if (z) {
            this.f25887.getLocationInWindow(new int[]{0, 0});
            f -= r5[1];
        }
        C8357 c8357M27880 = C8273.m27308(this.f25887).m27880(f);
        c8357M27880.m27876(this.f25913);
        c83582.m27895(c8357M27880);
        if (this.f25903 && (view = this.f25890) != null) {
            c83582.m27895(C8273.m27308(view).m27880(f));
        }
        c83582.m27898(f25878);
        c83582.m27897(250L);
        c83582.m27899(this.f25911);
        this.f25908 = c83582;
        c83582.m27900();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public void m28972(boolean z) {
        View view;
        View view2;
        C8358 c8358 = this.f25908;
        if (c8358 != null) {
            c8358.m4327();
        }
        this.f25887.setVisibility(0);
        if (this.f25902 == 0 && (this.f25909 || z)) {
            this.f25887.setTranslationY(0.0f);
            float f = -this.f25887.getHeight();
            if (z) {
                this.f25887.getLocationInWindow(new int[]{0, 0});
                f -= r5[1];
            }
            this.f25887.setTranslationY(f);
            C8358 c83582 = new C8358();
            C8357 c8357M27880 = C8273.m27308(this.f25887).m27880(0.0f);
            c8357M27880.m27876(this.f25913);
            c83582.m27895(c8357M27880);
            if (this.f25903 && (view2 = this.f25890) != null) {
                view2.setTranslationY(f);
                c83582.m27895(C8273.m27308(this.f25890).m27880(0.0f));
            }
            c83582.m27898(f25879);
            c83582.m27897(250L);
            c83582.m27899(this.f25912);
            this.f25908 = c83582;
            c83582.m27900();
        } else {
            this.f25887.setAlpha(1.0f);
            this.f25887.setTranslationY(0.0f);
            if (this.f25903 && (view = this.f25890) != null) {
                view.setTranslationY(0.0f);
            }
            this.f25912.mo34(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f25886;
        if (actionBarOverlayLayout != null) {
            C8273.m27433(actionBarOverlayLayout);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public final void m28973() {
        if (this.f25891 != null) {
            return;
        }
        C8756 c8756 = new C8756(this.f25883);
        if (this.f25901) {
            c8756.setVisibility(0);
            this.f25888.mo12547(c8756);
        } else {
            if (mo28702() == 2) {
                c8756.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f25886;
                if (actionBarOverlayLayout != null) {
                    C8273.m27433(actionBarOverlayLayout);
                }
            } else {
                c8756.setVisibility(8);
            }
            this.f25887.setTabContainer(c8756);
        }
        this.f25891 = c8756;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public final InterfaceC4330 m28974(View view) {
        if (view instanceof InterfaceC4330) {
            return (InterfaceC4330) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public boolean m28975() {
        return this.f25888.mo12538();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public boolean m28976() {
        return this.f25888.mo12540();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public final void m28977() {
        if (this.f25906) {
            this.f25906 = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f25886;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m28982(false);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public final void m28978(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C6898.C6903.f18908);
        this.f25886 = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f25888 = m28974(view.findViewById(C6898.C6903.f2448));
        this.f25889 = (ActionBarContextView) view.findViewById(C6898.C6903.f18892);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C6898.C6903.f18887);
        this.f25887 = actionBarContainer;
        InterfaceC4330 interfaceC4330 = this.f25888;
        if (interfaceC4330 == null || this.f25889 == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f25883 = interfaceC4330.getContext();
        boolean z = (this.f25888.mo12570() & 4) != 0;
        if (z) {
            this.f25895 = true;
        }
        C3084 c3084M170 = C3084.m170(this.f25883);
        mo28746(c3084M170.m171() || z);
        m28979(c3084M170.m6261());
        TypedArray typedArrayObtainStyledAttributes = this.f25883.obtainStyledAttributes(null, C6898.C6909.f2460, C6898.C1110.f18355, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(C6898.C6909.f19380, false)) {
            mo28741(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6898.C6909.f19378, 0);
        if (dimensionPixelSize != 0) {
            mo28739(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public final void m28979(boolean z) {
        this.f25901 = z;
        if (z) {
            this.f25887.setTabContainer(null);
            this.f25888.mo12547(this.f25891);
        } else {
            this.f25888.mo12547(null);
            this.f25887.setTabContainer(this.f25891);
        }
        boolean z2 = mo28702() == 2;
        C8756 c8756 = this.f25891;
        if (c8756 != null) {
            if (z2) {
                c8756.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f25886;
                if (actionBarOverlayLayout != null) {
                    C8273.m27433(actionBarOverlayLayout);
                }
            } else {
                c8756.setVisibility(8);
            }
        }
        this.f25888.mo12578(!this.f25901 && z2);
        this.f25886.setHasNonEmbeddedTabs(!this.f25901 && z2);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public final boolean m28980() {
        return this.f25887.isLaidOut();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public final void m28981() {
        if (this.f25906) {
            return;
        }
        this.f25906 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f25886;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        m28982(false);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public final void m28982(boolean z) {
        if (m28962(this.f25904, this.f25905, this.f25906)) {
            if (this.f25907) {
                return;
            }
            this.f25907 = true;
            m28972(z);
            return;
        }
        if (this.f25907) {
            this.f25907 = false;
            m28971(z);
        }
    }

    public C8682(Dialog dialog) {
        m28978(dialog.getWindow().getDecorView());
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public C8682(View view) {
        m28978(view);
    }
}
