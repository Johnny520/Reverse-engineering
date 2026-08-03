package p000;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: uB */
/* JADX INFO: loaded from: classes.dex */
public final class C2577uB extends AbstractC2257n0 {

    /* JADX INFO: renamed from: a */
    public final C2663wB f8929a;

    /* JADX INFO: renamed from: b */
    public final Window.Callback f8930b;

    /* JADX INFO: renamed from: c */
    public final C2534tB f8931c;

    /* JADX INFO: renamed from: d */
    public boolean f8932d;

    /* JADX INFO: renamed from: e */
    public boolean f8933e;

    /* JADX INFO: renamed from: f */
    public boolean f8934f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f8935g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final RunnableC0431K0 f8936h = new RunnableC0431K0(17, this);

    public C2577uB(Toolbar toolbar, CharSequence charSequence, WindowCallbackC2741y3 windowCallbackC2741y3) {
        C2534tB c2534tB = new C2534tB(this);
        C2663wB c2663wB = new C2663wB(toolbar, false);
        this.f8929a = c2663wB;
        windowCallbackC2741y3.getClass();
        this.f8930b = windowCallbackC2741y3;
        c2663wB.f9223k = windowCallbackC2741y3;
        toolbar.setOnMenuItemClickListener(c2534tB);
        if (!c2663wB.f9219g) {
            c2663wB.f9220h = charSequence;
            if ((c2663wB.f9214b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (c2663wB.f9219g) {
                    AbstractC2185lE.m4400m(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.f8931c = new C2534tB(this);
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: a */
    public final boolean mo4586a() {
        C0130D0 c0130d0;
        ActionMenuView actionMenuView = this.f8929a.f9213a.f3823a;
        return (actionMenuView == null || (c0130d0 = actionMenuView.f3781t) == null || !c0130d0.m214c()) ? false : true;
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: b */
    public final boolean mo4502b() {
        C2427qr c2427qr;
        C2354pB c2354pB = this.f8929a.f9213a.f3815M;
        if (c2354pB == null || (c2427qr = c2354pB.f8238b) == null) {
            return false;
        }
        if (c2354pB == null) {
            c2427qr = null;
        }
        if (c2427qr == null) {
            return true;
        }
        c2427qr.collapseActionView();
        return true;
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: c */
    public final void mo4503c(boolean z) {
        if (z == this.f8934f) {
            return;
        }
        this.f8934f = z;
        ArrayList arrayList = this.f8935g;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: d */
    public final int mo4504d() {
        return this.f8929a.f9214b;
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: e */
    public final Context mo4505e() {
        return this.f8929a.f9213a.getContext();
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: f */
    public final void mo4506f() {
        this.f8929a.f9213a.setVisibility(8);
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: g */
    public final boolean mo4587g() {
        C2663wB c2663wB = this.f8929a;
        Toolbar toolbar = c2663wB.f9213a;
        RunnableC0431K0 runnableC0431K0 = this.f8936h;
        toolbar.removeCallbacks(runnableC0431K0);
        Toolbar toolbar2 = c2663wB.f9213a;
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        toolbar2.postOnAnimation(runnableC0431K0);
        return true;
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: h */
    public final void mo4507h() {
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: i */
    public final void mo4588i() {
        this.f8929a.f9213a.removeCallbacks(this.f8936h);
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: j */
    public final boolean mo4508j(int i, KeyEvent keyEvent) {
        Menu menuM5081q = m5081q();
        if (menuM5081q == null) {
            return false;
        }
        menuM5081q.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuM5081q.performShortcut(i, keyEvent, 0);
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: k */
    public final boolean mo4589k(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo4590l();
        }
        return true;
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: l */
    public final boolean mo4590l() {
        return this.f8929a.f9213a.m2117u();
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: m */
    public final void mo4509m(boolean z) {
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: n */
    public final void mo4510n(boolean z) {
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: o */
    public final void mo4511o(CharSequence charSequence) {
        C2663wB c2663wB = this.f8929a;
        if (c2663wB.f9219g) {
            return;
        }
        Toolbar toolbar = c2663wB.f9213a;
        c2663wB.f9220h = charSequence;
        if ((c2663wB.f9214b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c2663wB.f9219g) {
                AbstractC2185lE.m4400m(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final Menu m5081q() {
        boolean z = this.f8933e;
        C2663wB c2663wB = this.f8929a;
        if (!z) {
            C1037Y5 c1037y5 = new C1037Y5(this);
            C2534tB c2534tB = new C2534tB(this);
            Toolbar toolbar = c2663wB.f9213a;
            toolbar.f3816N = c1037y5;
            toolbar.f3817O = c2534tB;
            ActionMenuView actionMenuView = toolbar.f3823a;
            if (actionMenuView != null) {
                actionMenuView.f3782u = c1037y5;
                actionMenuView.f3783v = c2534tB;
            }
            this.f8933e = true;
        }
        return c2663wB.f9213a.getMenu();
    }
}
