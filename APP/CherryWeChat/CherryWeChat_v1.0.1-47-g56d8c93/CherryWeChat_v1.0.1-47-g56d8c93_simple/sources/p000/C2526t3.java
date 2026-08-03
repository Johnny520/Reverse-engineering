package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: t3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2526t3 extends AbstractC1406fG {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f8823g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f8824h;

    public /* synthetic */ C2526t3(int r1, Object r2) {
        this.f8823g = r1;
        super(21);
        this.f8824h = r2;
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0359IE
    /* JADX INFO: renamed from: C */
    public void mo795C() {
        int r0 = this.f8823g;
        Object r2 = this.f8824h;
        switch(r0) {
            case 0: goto L9;
            case 1: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        LayoutInflaterFactory2C0176E3 r22 = (LayoutInflaterFactory2C0176E3) r2;
        r22.f505v.setVisibility(0);
        if ((r22.f505v.getParent() instanceof View) == false) goto L11;
        View r02 = (View) r22.f505v.getParent();
        WeakHashMap r1 = AbstractC2185lE.f7617a;
        AbstractC1255cE.m2370c(r02);
        return;
    L11:
        return;
    L9:
        ((RunnableC2440r3) r2).f8556b.f505v.setVisibility(0);
    }

    @Override // p000.InterfaceC0359IE
    /* JADX INFO: renamed from: c */
    public final void mo796c() {
        int r0 = this.f8823g;
        Object r2 = this.f8824h;
        switch(r0) {
            case 0: goto L14;
            case 1: goto L12;
            default: goto L4;
        };
    L4:
        LayoutInflaterFactory2C0176E3 r02 = (LayoutInflaterFactory2C0176E3) ((C0649P3) r2).f2090c;
        r02.f505v.setVisibility(8);
        PopupWindow r1 = r02.f506w;
        if (r1 == null) goto L8;
        r1.dismiss();
    L10:
        r02.f505v.m2081e();
        r02.f508y.m556d(null);
        r02.f508y = null;
        ViewGroup r03 = r02.f460A;
        WeakHashMap r12 = AbstractC2185lE.f7617a;
        AbstractC1255cE.m2370c(r03);
        return;
    L8:
        if ((r02.f505v.getParent() instanceof View) == false) goto L10;
        View r13 = (View) r02.f505v.getParent();
        WeakHashMap r22 = AbstractC2185lE.f7617a;
        AbstractC1255cE.m2370c(r13);
        goto L10
    L12:
        LayoutInflaterFactory2C0176E3 r23 = (LayoutInflaterFactory2C0176E3) r2;
        r23.f505v.setAlpha(1.0f);
        r23.f508y.m556d(null);
        r23.f508y = null;
        return;
    L14:
        LayoutInflaterFactory2C0176E3 r04 = ((RunnableC2440r3) r2).f8556b;
        r04.f505v.setAlpha(1.0f);
        r04.f508y.m556d(null);
        r04.f508y = null;
    }
}
