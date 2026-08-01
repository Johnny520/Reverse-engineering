package top.anjao2024.xp1whs;

import android.R;
import android.content.ComponentName;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import org.luckypray.dexkit.C0587R;
import p000.AbstractActivityC0246gh;
import p000.AbstractC0256gr;
import p000.AbstractC0283hh;
import p000.AbstractC0293hr;
import p000.AbstractC0398kl;
import p000.C0073c;
import p000.C0168ed;
import p000.C0219fr;
import p000.C0247gi;
import p000.C0320ii;
import p000.C0404kr;
import p000.C0441lr;
import p000.C0474mh;
import p000.C0616pi;
import p000.InterfaceC0356ji;
import p000.InterfaceC0742sw;
import p000.RunnableC0084ca;
import p000.j50;
import p000.lf1;
import p000.na1;
import p000.oh0;
import p000.p30;
import p000.r60;
import p000.sx0;
import p000.u50;
import p000.v50;
import p000.x71;
import p000.y51;
import p000.zc0;
import top.anjao2024.xp1whs.App;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0246gh implements App.InterfaceC0773b {
    public static final int $stable = 8;
    private final oh0 mServiceState = r60.m3419u(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void ensureAliasEnabledOnce() {
        SharedPreferences preferences = getPreferences(0);
        if (preferences.getBoolean("alias_reset_done", false)) {
            return;
        }
        getPackageManager().setComponentEnabledSetting(new ComponentName(this, getPackageName() + ".LauncherActivityAlias"), 0, 1);
        preferences.edit().putBoolean("alias_reset_done", true).apply();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean isLauncherIconVisible() {
        String packageName = getPackageName();
        StringBuilder sb = new StringBuilder();
        sb.append(packageName);
        sb.append(".LauncherActivityAlias");
        return getPackageManager().getComponentEnabledSetting(new ComponentName(this, sb.toString())) != 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final na1 onCreate$lambda$4(MainActivity mainActivity, oh0 oh0Var, InterfaceC0356ji interfaceC0356ji, int i) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        if (c0616pi.m3082O(i & 1, (i & 3) != 2)) {
            x71.m5092c(false, AbstractC0398kl.m1937w(-1358784389, new C0168ed(7, mainActivity, oh0Var), c0616pi), c0616pi, 48, 1);
        } else {
            c0616pi.m3085R();
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final na1 onCreate$lambda$4$lambda$3(MainActivity mainActivity, oh0 oh0Var, InterfaceC0356ji interfaceC0356ji, int i) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        if (c0616pi.m3082O(i & 1, (i & 3) != 2)) {
            boolean zM3002l = p30.m3002l(mainActivity.getIntent().getStringExtra("open_tab"), "thanks");
            boolean booleanExtra = mainActivity.getIntent().getBooleanExtra("open_donate", false);
            lf1 lf1VarOnCreate$lambda$4$lambda$3$lambda$0 = onCreate$lambda$4$lambda$3$lambda$0(mainActivity.mServiceState);
            boolean zBooleanValue = ((Boolean) oh0Var.getValue()).booleanValue();
            boolean zM3108h = c0616pi.m3108h(mainActivity) | c0616pi.m3104f(oh0Var);
            Object objM3080L = c0616pi.m3080L();
            if (zM3108h || objM3080L == C0320ii.f2572a) {
                objM3080L = new C0073c(11, mainActivity, oh0Var);
                c0616pi.m3107g0(objM3080L);
            }
            zc0.m5475B0(lf1VarOnCreate$lambda$4$lambda$3$lambda$0, zBooleanValue, (InterfaceC0742sw) objM3080L, null, zM3002l ? 1 : 0, booleanExtra, c0616pi, 0, 8);
        } else {
            c0616pi.m3085R();
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final lf1 onCreate$lambda$4$lambda$3$lambda$0(oh0 oh0Var) {
        return (lf1) oh0Var.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final na1 onCreate$lambda$4$lambda$3$lambda$2$lambda$1(MainActivity mainActivity, oh0 oh0Var, boolean z) {
        mainActivity.setLauncherIconVisible(z);
        oh0Var.setValue(Boolean.valueOf(z));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void setLauncherIconVisible(boolean z) {
        getPackageManager().setComponentEnabledSetting(new ComponentName(this, getPackageName() + ".LauncherActivityAlias"), z ? 1 : 2, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractActivityC0246gh, p000.AbstractActivityC0209fh, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        int i2 = 18;
        y51 y51Var = new y51(0, 0, new sx0(i2));
        y51 y51Var2 = new y51(AbstractC0256gr.f2039a, AbstractC0256gr.f2040b, new sx0(i2));
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        C0404kr c0441lr = AbstractC0256gr.f2041c;
        if (c0441lr == null) {
            c0441lr = Build.VERSION.SDK_INT >= 35 ? new C0441lr() : new C0404kr();
            AbstractC0256gr.f2041c = c0441lr;
        }
        C0404kr c0404kr = c0441lr;
        RunnableC0084ca runnableC0084ca = new RunnableC0084ca(c0404kr, y51Var, y51Var2, this, decorView, 1);
        ViewGroup viewGroup = (ViewGroup) decorView;
        int i3 = 0;
        while (true) {
            i = 8;
            if (i3 >= viewGroup.getChildCount()) {
                C0219fr c0219fr = new C0219fr(runnableC0084ca, viewGroup.getContext());
                c0219fr.setTag(c0404kr);
                c0219fr.setVisibility(8);
                c0219fr.setWillNotDraw(true);
                viewGroup.addView(c0219fr);
                break;
            }
            int i4 = i3 + 1;
            View childAt = viewGroup.getChildAt(i3);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof AbstractC0293hr) {
                break;
            } else {
                i3 = i4;
            }
        }
        runnableC0084ca.run();
        Window window = getWindow();
        window.getClass();
        c0404kr.mo1595b(window);
        ensureAliasEnabledOnce();
        C0474mh c0474mh = new C0474mh(-1585102819, true, new C0168ed(i, this, r60.m3419u(Boolean.valueOf(isLauncherIconVisible()))));
        ViewGroup.LayoutParams layoutParams = AbstractC0283hh.f2261a;
        View childAt2 = ((ViewGroup) getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        C0247gi c0247gi = childAt2 instanceof C0247gi ? (C0247gi) childAt2 : null;
        if (c0247gi != null) {
            c0247gi.setParentCompositionContext(null);
            c0247gi.setContent(c0474mh);
            return;
        }
        C0247gi c0247gi2 = new C0247gi(this);
        c0247gi2.setParentCompositionContext(null);
        c0247gi2.setContent(c0474mh);
        View decorView2 = getWindow().getDecorView();
        if (j50.m1663m(decorView2) == null) {
            decorView2.setTag(C0587R.id.view_tree_lifecycle_owner, this);
        }
        if (v50.m4404i(decorView2) == null) {
            decorView2.setTag(C0587R.id.view_tree_view_model_store_owner, this);
        }
        if (u50.m4269j(decorView2) == null) {
            decorView2.setTag(C0587R.id.view_tree_saved_state_registry_owner, this);
        }
        setContentView(c0247gi2, AbstractC0283hh.f2261a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // top.anjao2024.xp1whs.App.InterfaceC0773b
    public void onServiceStateChanged(lf1 lf1Var) {
        this.mServiceState.setValue(lf1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        App.f6029d.m4218b(this, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onStop() {
        App.f6029d.m4220e(this);
        super.onStop();
    }
}
