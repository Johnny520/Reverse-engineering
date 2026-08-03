package p050c0;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p034S.RunnableC0328h;
import p037U.AbstractC0358S;
import p049b0.C0551a;
import p056f0.C0797H;
import p056f0.C0817b;
import p056f0.C0830i;
import p056f0.DialogC0823e;
import p056f0.RunnableC0819c;

/* JADX INFO: renamed from: c0.B */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0573B implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1694a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1695b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1696c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f1697d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f1698e;

    public /* synthetic */ RunnableC0573B(KeyEvent.Callback r1, Object r2, Object r3, Object r4, int r5) {
        this.f1694a = r5;
        this.f1696c = r1;
        this.f1697d = r2;
        this.f1695b = r3;
        this.f1698e = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r02 = 1;
        Object r1 = this.f1698e;
        Object r2 = this.f1695b;
        Object r3 = this.f1697d;
        Object r4 = this.f1696c;
        switch(this.f1694a) {
            case 0: goto L19;
            case 1: goto L15;
            case 2: goto L13;
            default: goto L4;
        };
    L4:
        View r42 = (View) r4;
        AbstractC0307g.m703e(r42, "$rowView");
        ScrollView r32 = (ScrollView) r3;
        AbstractC0307g.m703e(r32, "$scroll");
        C0797H r22 = (C0797H) r2;
        AbstractC0307g.m703e(r22, "$item");
        Activity r12 = (Activity) r1;
        AbstractC0307g.m703e(r12, "$host");
        int r5 = 0;
    L5:
        if (r42 == null) goto L11;
        r5 = r5 + r42.getTop();
        Object r43 = r42.getParent();
        if ((r43 instanceof View) == false) goto L9;
        r42 = (View) r43;
    L10:
        if (r42 != r32) goto L5;
    L9:
        r42 = null;
    L11:
        r32.smoothScrollTo(0, r5);
        r32.postDelayed(new RunnableC0328h(r22, r12, 7), 380);
        return;
    L13:
        Activity r44 = (Activity) r4;
        AbstractC0307g.m703e(r44, "$activity");
        ClassLoader r33 = (ClassLoader) r3;
        AbstractC0307g.m703e(r33, "$classLoader");
        DialogC0823e r13 = (DialogC0823e) r1;
        AbstractC0307g.m703e(r13, "$progress");
        Context r52 = r44.getApplicationContext();
        AbstractC0307g.m702d(r52, "getApplicationContext(...)");
        C0551a r23 = AbstractC0358S.m884e0(r52, new C0817b(r13, 1), r33, (String) r2);
        C0830i r34 = C0830i.f3000a;
        C0830i.f3001b.post(new RunnableC0819c(r13, C0830i.m2155e(r23), r44, r02));
        return;
    L15:
        String r45 = (String) r4;
        AbstractC0307g.m703e(r45, "$sender");
        AbstractC0307g.m703e((C0688q1) r3, "$this_runCatching");
        InterfaceC0286l r14 = (InterfaceC0286l) r1;
        AbstractC0307g.m703e(r14, "$onResult");
        if (C0688q1.f2174l.remove(r2) == null) goto L26;
        C0688q1.f2173k.remove(r2);
        C0688q1.f2171i.remove(r45);
        C0688q1.m1782s("timeout ".concat(r45));
        r14.invoke(new C0676m1("timeout"));
        return;
    L26:
        return;
    L19:
        ViewGroup r46 = (ViewGroup) r4;
        AbstractC0307g.m703e(r46, "$parent");
        AbstractC0307g.m703e(r2, "$mainTabUi");
        C0588G.m1435v(16, r46, (ViewGroup) r3, r2, r1);
    }

    public /* synthetic */ RunnableC0573B(Object r2, String r3, C0688q1 r4, C0641b r5) {
        this.f1694a = 1;
        this.f1695b = r2;
        this.f1696c = r3;
        this.f1697d = r4;
        this.f1698e = r5;
    }
}
