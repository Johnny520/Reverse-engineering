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
    public final ArrayList f8935g;

    /* JADX INFO: renamed from: h */
    public final RunnableC0431K0 f8936h;

    public C2577uB(Toolbar r4, CharSequence r5, WindowCallbackC2741y3 r6) {
        this.f8935g = new ArrayList();
        this.f8936h = new RunnableC0431K0(17, this);
        C2534tB r0 = new C2534tB(this);
        C2663wB r1 = new C2663wB(r4, false);
        this.f8929a = r1;
        r6.getClass();
        this.f8930b = r6;
        r1.f9223k = r6;
        r4.setOnMenuItemClickListener(r0);
        if (r1.f9219g == true) goto L9;
        r1.f9220h = r5;
        if ((r1.f9214b & 8) == 0) goto L9;
        r4.setTitle(r5);
        if (r1.f9219g == false) goto L9;
        AbstractC2185lE.m4400m(r4.getRootView(), r5);
    L9:
        this.f8931c = new C2534tB(this);
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: a */
    public final boolean mo4586a() {
        ActionMenuView r0 = this.f8929a.f9213a.f3823a;
        if (r0 == null) goto L10;
        C0130D0 r02 = r0.f3781t;
        if (r02 != null) goto L7;
        return false;
    L7:
        if (r02.m214c() == false) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: b */
    public final boolean mo4502b() {
        C2354pB r0 = this.f8929a.f9213a.f3815M;
        if (r0 == null) goto L12;
        C2427qr r1 = r0.f8238b;
        if (r1 == null) goto L15;
        if (r0 != null) goto L8;
        r1 = null;
    L8:
        if (r1 == null) goto L14;
        r1.collapseActionView();
        return true;
    L14:
        return true;
    L15:
        return false;
    L12:
        return false;
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: c */
    public final void mo4503c(boolean r2) {
        if (r2 == this.f8934f) goto L10;
        this.f8934f = r2;
        ArrayList r22 = this.f8935g;
        if (r22.size() > 0) goto L8;
        return;
    L8:
        r22.get(0).getClass();
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
        C2663wB r0 = this.f8929a;
        Toolbar r1 = r0.f9213a;
        RunnableC0431K0 r2 = this.f8936h;
        r1.removeCallbacks(r2);
        Toolbar r02 = r0.f9213a;
        WeakHashMap r12 = AbstractC2185lE.f7617a;
        r02.postOnAnimation(r2);
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
    public final boolean mo4508j(int r5, KeyEvent r6) {
        Menu r0 = m5081q();
        if (r0 == null) goto L10;
        boolean r3 = true;
        if (KeyCharacterMap.load(r6.getDeviceId()).getKeyboardType() != 1) goto L8;
        r3 = false;
    L8:
        r0.setQwertyMode(r3);
        return r0.performShortcut(r5, r6, 0);
    L10:
        return false;
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: k */
    public final boolean mo4589k(KeyEvent r2) {
        if (r2.getAction() != 1) goto L5;
        mo4590l();
    L5:
        return true;
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: l */
    public final boolean mo4590l() {
        return this.f8929a.f9213a.m2117u();
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: m */
    public final void mo4509m(boolean r1) {
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: n */
    public final void mo4510n(boolean r1) {
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: o */
    public final void mo4511o(CharSequence r4) {
        C2663wB r0 = this.f8929a;
        if (r0.f9219g == true) goto L10;
        Toolbar r1 = r0.f9213a;
        r0.f9220h = r4;
        if ((r0.f9214b & 8) == 0) goto L11;
        r1.setTitle(r4);
        if (r0.f9219g == false) goto L12;
        AbstractC2185lE.m4400m(r1.getRootView(), r4);
        return;
    L12:
        return;
    L11:
        return;
    }

    /* JADX INFO: renamed from: q */
    public final Menu m5081q() {
        boolean r0 = this.f8933e;
        C2663wB r1 = this.f8929a;
        if (r0 == true) goto L9;
        C1037Y5 r02 = new C1037Y5(this);
        C2534tB r2 = new C2534tB(this);
        Toolbar r3 = r1.f9213a;
        r3.f3816N = r02;
        r3.f3817O = r2;
        ActionMenuView r32 = r3.f3823a;
        if (r32 == null) goto L7;
        r32.f3782u = r02;
        r32.f3783v = r2;
    L7:
        this.f8933e = true;
    L9:
        return r1.f9213a.getMenu();
    }
}
