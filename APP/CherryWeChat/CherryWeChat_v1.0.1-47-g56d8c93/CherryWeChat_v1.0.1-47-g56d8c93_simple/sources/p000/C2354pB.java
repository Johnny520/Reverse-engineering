package p000;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: renamed from: pB */
/* JADX INFO: loaded from: classes.dex */
public final class C2354pB implements InterfaceC0163Dr {

    /* JADX INFO: renamed from: a */
    public MenuC2204lr f8237a;

    /* JADX INFO: renamed from: b */
    public C2427qr f8238b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Toolbar f8239c;

    public C2354pB(Toolbar r1) {
        this.f8239c = r1;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: b */
    public final void mo213b(MenuC2204lr r1, boolean r2) {
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: d */
    public final boolean mo215d(C2427qr r7) {
        Toolbar r0 = this.f8239c;
        KeyEvent.Callback r1 = r0.f3831i;
        if ((r1 instanceof InterfaceC2316oa) == false) goto L5;
        ((C2513sr) ((InterfaceC2316oa) r1)).f8802a.onActionViewCollapsed();
    L5:
        r0.removeView(r0.f3831i);
        r0.removeView(r0.f3830h);
        r0.f3831i = null;
        ArrayList r2 = r0.f3807E;
        int r3 = r2.size() - 1;
    L6:
        if (r3 < 0) goto L8;
        r0.addView((View) r2.get(r3));
        r3 = r3 - 1;
        goto L6
    L8:
        r2.clear();
        this.f8238b = null;
        r0.requestLayout();
        r7.f8491C = false;
        r7.f8505n.m4435p(false);
        r0.m2118v();
        return true;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: f */
    public final boolean mo217f(C2427qr r7) {
        Toolbar r0 = this.f8239c;
        r0.m2103c();
        ViewParent r1 = r0.f3830h.getParent();
        if (r1 != r0) goto L5;
    L8:
        View r12 = r7.getActionView();
        r0.f3831i = r12;
        this.f8238b = r7;
        ViewParent r13 = r12.getParent();
        if (r13 != r0) goto L11;
    L14:
        int r14 = r0.getChildCount() - 1;
    L15:
        if (r14 < 0) goto L22;
        View r4 = r0.getChildAt(r14);
        if (((C2405qB) r4.getLayoutParams()).f8439b == 2) goto L21;
        if (r4 == r0.f3823a) goto L21;
        r0.removeViewAt(r14);
        r0.f3807E.add(r4);
    L21:
        r14 = r14 - 1;
        goto L15
    L22:
        r0.requestLayout();
        r7.f8491C = true;
        r7.f8505n.m4435p(false);
        KeyEvent.Callback r72 = r0.f3831i;
        if ((r72 instanceof InterfaceC2316oa) == false) goto L25;
        ((C2513sr) ((InterfaceC2316oa) r72)).f8802a.onActionViewExpanded();
    L25:
        r0.m2118v();
        return true;
    L11:
        if ((r13 instanceof ViewGroup) == false) goto L13;
        ((ViewGroup) r13).removeView(r0.f3831i);
    L13:
        C2405qB r15 = Toolbar.m2097h();
        r15.f8438a = (r0.f3836n & 112) | 8388611;
        r15.f8439b = 2;
        r0.f3831i.setLayoutParams(r15);
        r0.addView(r0.f3831i);
        goto L14
    L5:
        if ((r1 instanceof ViewGroup) == false) goto L7;
        ((ViewGroup) r1).removeView(r0.f3830h);
    L7:
        r0.addView(r0.f3830h);
        goto L8
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: g */
    public final void mo218g() {
        if (this.f8238b == null) goto L16;
        MenuC2204lr r0 = this.f8237a;
        if (r0 == null) goto L12;
        int r02 = r0.f7665f.size();
        int r1 = 0;
    L7:
        if (r1 >= r02) goto L12;
        if (this.f8237a.getItem(r1) == this.f8238b) goto L17;
        r1 = r1 + 1;
        goto L7
    L17:
        return;
    L12:
        mo215d(this.f8238b);
        return;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: i */
    public final void mo220i(Context r2, MenuC2204lr r3) {
        MenuC2204lr r22 = this.f8237a;
        if (r22 == null) goto L7;
        C2427qr r0 = this.f8238b;
        if (r0 == null) goto L7;
        r22.mo426d(r0);
    L7:
        this.f8237a = r3;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: j */
    public final boolean mo221j(SubMenuC0214Ez r1) {
        return false;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: k */
    public final boolean mo222k() {
        return false;
    }
}
