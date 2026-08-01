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
public class C0431l0 implements InterfaceC0425kv, InterfaceC0572ou, InterfaceC0175e5, InterfaceC0831vu, InterfaceC0370jd, InterfaceC0444ld, InterfaceC0945yw, InterfaceC0735t8, InterfaceC0225fi, InterfaceC0571ot, InterfaceC0650qy, InterfaceC0801v0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2885a;

    /* JADX INFO: renamed from: b */
    public Object f2886b;

    public /* synthetic */ C0431l0(int i, Object obj) {
        this.f2885a = i;
        this.f2886b = obj;
    }

    @Override // p000.InterfaceC0425kv
    /* JADX INFO: renamed from: a */
    public void mo1134a(MenuC0646qu menuC0646qu, boolean z) {
        if (menuC0646qu instanceof j50) {
            ((j50) menuC0646qu).f2661z.mo1570k().m2167c(false);
        }
        InterfaceC0425kv interfaceC0425kv = ((C0358j1) this.f2886b).f2627e;
        if (interfaceC0425kv != null) {
            interfaceC0425kv.mo1134a(menuC0646qu, z);
        }
    }

    @Override // p000.InterfaceC0225fi
    /* JADX INFO: renamed from: b */
    public void mo1102b(AbstractC0259gf abstractC0259gf) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0293hc("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC0299hi(this, abstractC0259gf, threadPoolExecutor, 0));
    }

    @Override // p000.InterfaceC0370jd
    public C0481md build() {
        return new C0481md(new C0431l0(((ContentInfo.Builder) this.f2886b).build()));
    }

    @Override // p000.InterfaceC0444ld
    /* JADX INFO: renamed from: c */
    public ClipData mo1677c() {
        return ((ContentInfo) this.f2886b).getClip();
    }

    @Override // p000.InterfaceC0801v0
    /* JADX INFO: renamed from: d */
    public boolean mo1072d(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f2886b;
        if (!swipeDismissBehavior.mo670r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = oa0.f3426a;
        boolean z = y90.m2732d(view) == 1;
        int i = swipeDismissBehavior.f934d;
        view.offsetLeftAndRight((!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // p000.InterfaceC0945yw
    /* JADX INFO: renamed from: e */
    public bd0 mo844e(View view, bd0 bd0Var) {
        yc0 yc0Var = bd0Var.f724a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f2886b;
        if (!AbstractC0908xw.m2709a(coordinatorLayout.f396n, bd0Var)) {
            coordinatorLayout.f396n = bd0Var;
            boolean z = bd0Var.m519d() > 0;
            coordinatorLayout.f397o = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!yc0Var.mo2411m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = oa0.f3426a;
                    if (x90.m2654b(childAt) && ((C0015ae) childAt.getLayoutParams()).f64a != null && yc0Var.mo2411m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return bd0Var;
    }

    @Override // p000.InterfaceC0444ld
    /* JADX INFO: renamed from: f */
    public int mo1678f() {
        return ((ContentInfo) this.f2886b).getFlags();
    }

    @Override // p000.InterfaceC0650qy
    /* JADX INFO: renamed from: g */
    public void mo1720g() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // p000.InterfaceC0444ld
    /* JADX INFO: renamed from: h */
    public ContentInfo mo1679h() {
        return (ContentInfo) this.f2886b;
    }

    @Override // p000.InterfaceC0650qy
    /* JADX INFO: renamed from: i */
    public void mo1721i(int i, Object obj) {
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
        ((ProfileInstallReceiver) this.f2886b).setResultCode(i);
    }

    @Override // p000.InterfaceC0572ou
    /* JADX INFO: renamed from: k */
    public void mo623k(MenuC0646qu menuC0646qu) {
        j70 j70Var = ((ActionMenuView) this.f2886b).f249u;
        if (j70Var != null) {
            j70Var.mo623k(menuC0646qu);
        }
    }

    @Override // p000.InterfaceC0370jd
    /* JADX INFO: renamed from: m */
    public void mo1602m(Uri uri) {
        ((ContentInfo.Builder) this.f2886b).setLinkUri(uri);
    }

    @Override // p000.InterfaceC0572ou
    /* JADX INFO: renamed from: n */
    public boolean mo626n(MenuC0646qu menuC0646qu, MenuItem menuItem) {
        InterfaceC0469m1 interfaceC0469m1 = ((ActionMenuView) this.f2886b).f254z;
        if (interfaceC0469m1 == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((j70) interfaceC0469m1).f2675a.f318G.f1298c).iterator();
        if (it.hasNext()) {
            throw g40.m1145h(it);
        }
        return false;
    }

    @Override // p000.InterfaceC0444ld
    /* JADX INFO: renamed from: o */
    public int mo1680o() {
        return ((ContentInfo) this.f2886b).getSource();
    }

    @Override // p000.InterfaceC0735t8
    public void onCancel() {
        switch (this.f2885a) {
            case 10:
                ((Animator) this.f2886b).end();
                break;
            default:
                ((n40) this.f2886b).m1912a();
                break;
        }
    }

    @Override // p000.InterfaceC0831vu
    /* JADX INFO: renamed from: p */
    public void mo1636p(MenuC0646qu menuC0646qu, MenuItem menuItem) {
        ((ViewOnKeyListenerC0179e9) this.f2886b).f1539f.removeCallbacksAndMessages(menuC0646qu);
    }

    @Override // p000.InterfaceC0425kv
    /* JADX INFO: renamed from: q */
    public boolean mo1135q(MenuC0646qu menuC0646qu) {
        C0358j1 c0358j1 = (C0358j1) this.f2886b;
        if (menuC0646qu == c0358j1.f2625c) {
            return false;
        }
        ((j50) menuC0646qu).f2660A.getClass();
        c0358j1.getClass();
        InterfaceC0425kv interfaceC0425kv = c0358j1.f2627e;
        if (interfaceC0425kv != null) {
            return interfaceC0425kv.mo1135q(menuC0646qu);
        }
        return false;
    }

    @Override // p000.InterfaceC0831vu
    /* JADX INFO: renamed from: r */
    public void mo1637r(MenuC0646qu menuC0646qu, C0869wu c0869wu) {
        ViewOnKeyListenerC0179e9 viewOnKeyListenerC0179e9 = (ViewOnKeyListenerC0179e9) this.f2886b;
        Handler handler = viewOnKeyListenerC0179e9.f1539f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0179e9.f1541h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0646qu == ((C0143d9) arrayList.get(i)).f1338b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new RunnableC0096c9(this, i2 < arrayList.size() ? (C0143d9) arrayList.get(i2) : null, c0869wu, menuC0646qu), menuC0646qu, SystemClock.uptimeMillis() + 200);
    }

    @Override // p000.InterfaceC0370jd
    /* JADX INFO: renamed from: s */
    public void mo1603s(int i) {
        ((ContentInfo.Builder) this.f2886b).setFlags(i);
    }

    @Override // p000.InterfaceC0370jd
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f2886b).setExtras(bundle);
    }

    /* JADX INFO: renamed from: t */
    public C0357j0 mo1723t(int i) {
        return null;
    }

    public String toString() {
        switch (this.f2885a) {
            case 8:
                return "ContentInfoCompat{" + ((ContentInfo) this.f2886b) + "}";
            case 27:
                return "<" + ((String) this.f2886b) + '>';
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public C0357j0 mo1724u(int i) {
        return null;
    }

    /* JADX INFO: renamed from: v */
    public void m1725v() {
        ((C0600pl) this.f2886b).f3725B.m61F();
    }

    /* JADX INFO: renamed from: w */
    public boolean mo1726w(int i, int i2, Bundle bundle) {
        return false;
    }

    public C0431l0(TextView textView) {
        this.f2885a = 14;
        this.f2886b = new C0708si(textView);
    }

    public C0431l0(EditText editText) {
        this.f2885a = 13;
        this.f2886b = new C0138d4(editText, 8);
    }

    public C0431l0(int i) {
        this.f2885a = i;
        switch (i) {
            case 28:
                break;
            default:
                this.f2886b = new C0394k0(this);
                break;
        }
    }

    public C0431l0(Context context) {
        this.f2885a = 12;
        this.f2886b = context.getApplicationContext();
    }

    public C0431l0(ContentInfo contentInfo) {
        this.f2885a = 8;
        contentInfo.getClass();
        this.f2886b = AbstractC0957z7.m2805h(contentInfo);
    }

    public C0431l0(ClipData clipData, int i) {
        this.f2885a = 7;
        this.f2886b = AbstractC0957z7.m2803f(clipData, i);
    }

    /* JADX INFO: renamed from: j */
    public void mo966j(int i) {
    }

    /* JADX INFO: renamed from: l */
    public void mo967l(int i) {
    }
}
