package androidx.appcompat.widget;

import Yue.AbstractC3087;
import Yue.C3323;
import Yue.C6898;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.C1629;

/* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟۟۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8760 extends AbstractC3087 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f26412 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final String f26413 = "share_history.xml";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f26414;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final MenuItemOnMenuItemClickListenerC8761 f26415;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final Context f26416;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public String f26417;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public InterfaceC1635 f26418;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public C1629.InterfaceC8751 f26419;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟۟۟۠$ۥ */
    public interface InterfaceC1635 {
        /* JADX INFO: renamed from: ۥ */
        boolean m4702(C8760 c8760, Intent intent);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟۟۟۠$ۥ۟ */
    public class C1636 implements C1629.InterfaceC8751 {
        public C1636() {
        }

        @Override // androidx.appcompat.widget.C1629.InterfaceC8751
        /* JADX INFO: renamed from: ۥ */
        public boolean mo4695(C1629 c1629, Intent intent) {
            C8760 c8760 = C8760.this;
            InterfaceC1635 interfaceC1635 = c8760.f26418;
            if (interfaceC1635 == null) {
                return false;
            }
            interfaceC1635.m4702(c8760, intent);
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟۟۟۠$ۥ۟۟, reason: contains not printable characters */
    public class MenuItemOnMenuItemClickListenerC8761 implements MenuItem.OnMenuItemClickListener {
        public MenuItemOnMenuItemClickListenerC8761() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            C8760 c8760 = C8760.this;
            Intent intentM4692 = C1629.m29208(c8760.f26416, c8760.f26417).m4692(menuItem.getItemId());
            if (intentM4692 == null) {
                return true;
            }
            String action = intentM4692.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                C8760.this.m29247(intentM4692);
            }
            C8760.this.f26416.startActivity(intentM4692);
            return true;
        }
    }

    public C8760(Context context) {
        super(context);
        this.f26414 = 4;
        this.f26415 = new MenuItemOnMenuItemClickListenerC8761();
        this.f26417 = f26413;
        this.f26416 = context;
    }

    @Override // Yue.AbstractC3087
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo179() {
        return true;
    }

    @Override // Yue.AbstractC3087
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public View mo6290() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.f26416);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(C1629.m29208(this.f26416, this.f26417));
        }
        TypedValue typedValue = new TypedValue();
        this.f26416.getTheme().resolveAttribute(C6898.C1110.f18376, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(C3323.m396(this.f26416, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(C6898.C6907.f19023);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(C6898.C6907.f19022);
        return activityChooserView;
    }

    @Override // Yue.AbstractC3087
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo6293(SubMenu subMenu) {
        subMenu.clear();
        C1629 c1629M29208 = C1629.m29208(this.f26416, this.f26417);
        PackageManager packageManager = this.f26416.getPackageManager();
        int iM29211 = c1629M29208.m29211();
        int iMin = Math.min(iM29211, this.f26414);
        for (int i = 0; i < iMin; i++) {
            ResolveInfo resolveInfoM29210 = c1629M29208.m29210(i);
            subMenu.add(0, i, i, resolveInfoM29210.loadLabel(packageManager)).setIcon(resolveInfoM29210.loadIcon(packageManager)).setOnMenuItemClickListener(this.f26415);
        }
        if (iMin < iM29211) {
            SubMenu subMenuAddSubMenu = subMenu.addSubMenu(0, iMin, iMin, this.f26416.getString(C6898.C6907.f19002));
            for (int i2 = 0; i2 < iM29211; i2++) {
                ResolveInfo resolveInfoM292102 = c1629M29208.m29210(i2);
                subMenuAddSubMenu.add(0, i2, i2, resolveInfoM292102.loadLabel(packageManager)).setIcon(resolveInfoM292102.loadIcon(packageManager)).setOnMenuItemClickListener(this.f26415);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m29243() {
        if (this.f26418 == null) {
            return;
        }
        if (this.f26419 == null) {
            this.f26419 = new C1636();
        }
        C1629.m29208(this.f26416, this.f26417).m29226(this.f26419);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m29244(InterfaceC1635 interfaceC1635) {
        this.f26418 = interfaceC1635;
        m29243();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m29245(String str) {
        this.f26417 = str;
        m29243();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m29246(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                m29247(intent);
            }
        }
        C1629.m29208(this.f26416, this.f26417).m29225(intent);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m29247(Intent intent) {
        intent.addFlags(134742016);
    }
}
