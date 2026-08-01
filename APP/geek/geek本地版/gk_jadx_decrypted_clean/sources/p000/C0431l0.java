package p000;

import android.animation.Animator;
import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.github.megatronking.stringfog.Base64;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l0 */
/* JADX INFO: loaded from: classes.dex */
public class C0431l0 implements InterfaceC0128cv, InterfaceC0350iu, InterfaceC0175e5, InterfaceC0535nu, InterfaceC0962zc, InterfaceC0064bd, InterfaceC0649qw, InterfaceC0365j8, InterfaceC0152di, InterfaceC0423kt, InterfaceC0391jy, InterfaceC0802v0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2979a;

    /* JADX INFO: renamed from: b */
    public Object f2980b;

    public /* synthetic */ C0431l0(int i, Object obj) {
        this.f2979a = i;
        this.f2980b = obj;
    }

    @Override // p000.InterfaceC0128cv
    /* JADX INFO: renamed from: a */
    public void mo829a(MenuC0424ku menuC0424ku, boolean z) {
        if (menuC0424ku instanceof c50) {
            ((c50) menuC0424ku).f890z.mo633k().m1718c(false);
        }
        InterfaceC0128cv interfaceC0128cv = ((C0358j1) this.f2980b).f2520e;
        if (interfaceC0128cv != null) {
            interfaceC0128cv.mo829a(menuC0424ku, z);
        }
    }

    @Override // p000.InterfaceC0064bd
    /* JADX INFO: renamed from: b */
    public ClipData mo88b() {
        return ((ContentInfo) this.f2980b).getClip();
    }

    @Override // p000.InterfaceC0962zc
    public C0100cd build() {
        return new C0100cd(new C0431l0(((ContentInfo.Builder) this.f2980b).build()));
    }

    @Override // p000.InterfaceC0802v0
    /* JADX INFO: renamed from: c */
    public boolean mo1134c(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f2980b;
        if (!swipeDismissBehavior.mo712r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = ja0.f2600a;
        boolean z = t90.m2367d(view) == 1;
        int i = swipeDismissBehavior.f1009d;
        view.offsetLeftAndRight((!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // p000.InterfaceC0649qw
    /* JADX INFO: renamed from: d */
    public wc0 mo474d(View view, wc0 wc0Var) {
        tc0 tc0Var = wc0Var.f4955a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f2980b;
        if (!AbstractC0612pw.m2131a(coordinatorLayout.f433n, wc0Var)) {
            coordinatorLayout.f433n = wc0Var;
            boolean z = wc0Var.m2567d() > 0;
            coordinatorLayout.f434o = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!tc0Var.mo2015m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = ja0.f2600a;
                    if (s90.m2310b(childAt) && ((C0963zd) childAt.getLayoutParams()).f5539a != null && tc0Var.mo2015m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return wc0Var;
    }

    @Override // p000.InterfaceC0152di
    /* JADX INFO: renamed from: e */
    public void mo943e(AbstractC0346ip abstractC0346ip) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0924yb("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC0225fi(this, abstractC0346ip, threadPoolExecutor, 0));
    }

    @Override // p000.InterfaceC0064bd
    /* JADX INFO: renamed from: f */
    public int mo89f() {
        return ((ContentInfo) this.f2980b).getFlags();
    }

    @Override // p000.InterfaceC0391jy
    /* JADX INFO: renamed from: g */
    public void mo1531g() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // p000.InterfaceC0064bd
    /* JADX INFO: renamed from: h */
    public ContentInfo mo90h() {
        return (ContentInfo) this.f2980b;
    }

    @Override // p000.InterfaceC0391jy
    /* JADX INFO: renamed from: i */
    public void mo1532i(int i, Object obj) {
        String str;
        switch (i) {
            case Base64.NO_PADDING /* 1 */:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case Base64.NO_WRAP /* 2 */:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f2980b).setResultCode(i);
    }

    @Override // p000.InterfaceC0350iu
    /* JADX INFO: renamed from: k */
    public void mo925k(MenuC0424ku menuC0424ku) {
        d70 d70Var = ((ActionMenuView) this.f2980b).f286u;
        if (d70Var != null) {
            d70Var.mo925k(menuC0424ku);
        }
    }

    @Override // p000.InterfaceC0962zc
    /* JADX INFO: renamed from: m */
    public void mo91m(Uri uri) {
        ((ContentInfo.Builder) this.f2980b).setLinkUri(uri);
    }

    @Override // p000.InterfaceC0350iu
    /* JADX INFO: renamed from: n */
    public boolean mo926n(MenuC0424ku menuC0424ku, MenuItem menuItem) {
        InterfaceC0469m1 interfaceC0469m1 = ((ActionMenuView) this.f2980b).f291z;
        if (interfaceC0469m1 == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((d70) interfaceC0469m1).f1398a.f355G.f1364c).iterator();
        if (it.hasNext()) {
            throw z30.m2763h(it);
        }
        return false;
    }

    @Override // p000.InterfaceC0064bd
    /* JADX INFO: renamed from: o */
    public int mo92o() {
        return ((ContentInfo) this.f2980b).getSource();
    }

    @Override // p000.InterfaceC0365j8
    public void onCancel() {
        switch (this.f2979a) {
            case 10:
                ((Animator) this.f2980b).end();
                break;
            default:
                ((g40) this.f2980b).m1259a();
                break;
        }
    }

    @Override // p000.InterfaceC0535nu
    /* JADX INFO: renamed from: p */
    public void mo580p(MenuC0424ku menuC0424ku, MenuItem menuItem) {
        ((ViewOnKeyListenerC0736t8) this.f2980b).f4527f.removeCallbacksAndMessages(menuC0424ku);
    }

    @Override // p000.InterfaceC0128cv
    /* JADX INFO: renamed from: q */
    public boolean mo830q(MenuC0424ku menuC0424ku) {
        C0358j1 c0358j1 = (C0358j1) this.f2980b;
        if (menuC0424ku == c0358j1.f2518c) {
            return false;
        }
        ((c50) menuC0424ku).f889A.getClass();
        c0358j1.getClass();
        InterfaceC0128cv interfaceC0128cv = c0358j1.f2520e;
        if (interfaceC0128cv != null) {
            return interfaceC0128cv.mo830q(menuC0424ku);
        }
        return false;
    }

    @Override // p000.InterfaceC0535nu
    /* JADX INFO: renamed from: r */
    public void mo581r(MenuC0424ku menuC0424ku, C0572ou c0572ou) {
        ViewOnKeyListenerC0736t8 viewOnKeyListenerC0736t8 = (ViewOnKeyListenerC0736t8) this.f2980b;
        Handler handler = viewOnKeyListenerC0736t8.f4527f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0736t8.f4529h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0424ku == ((C0699s8) arrayList.get(i)).f4393b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new RunnableC0662r8(this, i2 < arrayList.size() ? (C0699s8) arrayList.get(i2) : null, c0572ou, menuC0424ku), menuC0424ku, SystemClock.uptimeMillis() + 200);
    }

    @Override // p000.InterfaceC0962zc
    /* JADX INFO: renamed from: s */
    public void mo93s(int i) {
        ((ContentInfo.Builder) this.f2980b).setFlags(i);
    }

    @Override // p000.InterfaceC0962zc
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f2980b).setExtras(bundle);
    }

    /* JADX INFO: renamed from: t */
    public C0357j0 mo1733t(int i) {
        return null;
    }

    public String toString() {
        switch (this.f2979a) {
            case 8:
                return "ContentInfoCompat{" + ((ContentInfo) this.f2980b) + "}";
            case 27:
                return "<" + ((String) this.f2980b) + '>';
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public C0357j0 mo1734u(int i) {
        return null;
    }

    /* JADX INFO: renamed from: v */
    public void m1735v() {
        ((C0526nl) this.f2980b).f3430F.m2695F();
    }

    /* JADX INFO: renamed from: w */
    public boolean mo1736w(int i, int i2, Bundle bundle) {
        return false;
    }

    public C0431l0(TextView textView) {
        this.f2979a = 14;
        this.f2980b = new C0635qi(textView);
    }

    public C0431l0(EditText editText) {
        this.f2979a = 13;
        this.f2980b = new C0138d4(editText, 8);
    }

    public C0431l0(int i) {
        this.f2979a = i;
        switch (i) {
            case 28:
                break;
            default:
                this.f2980b = new C0394k0(this);
                break;
        }
    }

    public C0431l0(Context context) {
        this.f2979a = 12;
        this.f2980b = context.getApplicationContext();
    }

    public C0431l0(ContentInfo contentInfo) {
        this.f2979a = 8;
        contentInfo.getClass();
        this.f2980b = AbstractC0587p7.m2053h(contentInfo);
    }

    public C0431l0(ClipData clipData, int i) {
        this.f2979a = 7;
        this.f2980b = AbstractC0587p7.m2051f(clipData, i);
    }

    /* JADX INFO: renamed from: j */
    public void mo986j(int i) {
    }

    /* JADX INFO: renamed from: l */
    public void mo987l(int i) {
    }
}
