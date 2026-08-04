package androidx.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0038;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.LinkedHashMap;
import yyds.AbstractC0578;
import yyds.AbstractC0729;
import yyds.AbstractC0879;
import yyds.AbstractC2478;
import yyds.C0130;
import yyds.C0188;
import yyds.C0298;
import yyds.C0328;
import yyds.C0805;
import yyds.C1067;
import yyds.C2225;
import yyds.EnumC0637;
import yyds.InterfaceC0538;
import yyds.InterfaceC0657;
import yyds.InterfaceC2164;
import yyds.InterfaceC2345;
import yyds.InterfaceC2657;
import yyds.InterfaceC2671;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements InterfaceC0538, InterfaceC2657, InterfaceC2164, InterfaceC2671 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f30;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public C2225 f31;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public boolean f32;

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$3 */
    /* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
    class C00003 implements InterfaceC0657 {
        @Override // yyds.InterfaceC0657
        /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
        public final void mo20(InterfaceC2345 interfaceC2345, EnumC0637 enumC0637) {
            if (enumC0637 == EnumC0637.ON_STOP) {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$4 */
    /* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
    class C00014 implements InterfaceC0657 {
        @Override // yyds.InterfaceC0657
        /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
        public final void mo20(InterfaceC2345 interfaceC2345, EnumC0637 enumC0637) {
            if (enumC0637 == EnumC0637.ON_DESTROY) {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$5 */
    /* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
    class C00025 implements InterfaceC0657 {
        @Override // yyds.InterfaceC0657
        /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
        public final void mo20(InterfaceC2345 interfaceC2345, EnumC0637 enumC0637) {
            throw null;
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m18();
        getWindow().getDecorView();
        throw null;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        throw null;
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        throw null;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        throw null;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        throw null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        throw null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        throw null;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.f32 = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.f32 = false;
            throw null;
        } catch (Throwable th) {
            this.f32 = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        throw null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        throw null;
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.f30 = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.f30 = false;
            throw null;
        } catch (Throwable th) {
            this.f30 = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        throw null;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr);
        throw null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0130 c0130;
        C2225 c2225 = this.f31;
        if (c2225 == null && (c0130 = (C0130) getLastNonConfigurationInstance()) != null) {
            c2225 = c0130.f830;
        }
        if (c2225 == null) {
            return null;
        }
        C0130 c01302 = new C0130();
        c01302.f830 = c2225;
        return c01302;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        throw null;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        throw null;
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC2478.m4528()) {
                AbstractC0879.m1969("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            throw null;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m18();
        getWindow().getDecorView();
        throw null;
    }

    @Override // androidx.core.app.ComponentActivity, yyds.InterfaceC2345
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C0038 mo14() {
        return null;
    }

    @Override // yyds.InterfaceC2671
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C0033 mo15() {
        return null;
    }

    @Override // yyds.InterfaceC2164
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C0328 mo16() {
        throw null;
    }

    @Override // yyds.InterfaceC2657
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final AbstractC0729 mo17() {
        C0298 c0298 = C0298.f1572;
        C1067 c1067 = new C1067(1);
        ((LinkedHashMap) c1067.f3409).putAll((LinkedHashMap) c0298.f3409);
        if (getApplication() != null) {
            c1067.m2257(C0805.f3690, getApplication());
        }
        c1067.m2257(AbstractC0578.f2770, this);
        c1067.m2257(AbstractC0578.f2771, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            c1067.m2257(AbstractC0578.f2772, getIntent().getExtras());
        }
        return c1067;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m18() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        getWindow().getDecorView().setTag(R.id.report_drawn, this);
    }

    @Override // yyds.InterfaceC0538
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C2225 mo19() {
        if (getApplication() == null) {
            C0188.m800("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        C2225 c2225 = this.f31;
        if (c2225 != null) {
            return c2225;
        }
        C0130 c0130 = (C0130) getLastNonConfigurationInstance();
        if (c0130 != null) {
            this.f31 = c0130.f830;
        }
        C2225 c22252 = this.f31;
        if (c22252 != null) {
            return c22252;
        }
        C2225 c22253 = new C2225(2);
        this.f31 = c22253;
        return c22253;
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m18();
        getWindow().getDecorView();
        throw null;
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m18();
        getWindow().getDecorView();
        throw null;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (!this.f32) {
            throw null;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (!this.f30) {
            throw null;
        }
    }
}
