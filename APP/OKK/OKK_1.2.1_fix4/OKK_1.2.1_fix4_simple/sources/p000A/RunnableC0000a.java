package p000A;

import android.graphics.Typeface;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Field;
import p004C.InterfaceC0060a;
import p006D.AbstractC0080Q;
import p006D.C0095d;
import p021L.C0245e;
import p055f.InterfaceC0777h;
import p055f.MenuC0779j;
import p057g.C0900f;
import p057g.C0906i;
import p083u.AbstractC1083b;

/* JADX INFO: renamed from: A.a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0000a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f0a;

    /* JADX INFO: renamed from: b */
    public final Object f1b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2c;

    public /* synthetic */ RunnableC0000a(Object r1, Object r2, int r3) {
        this.f0a = r3;
        this.f1b = r1;
        this.f2c = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object r02 = this.f1b;
        Object r1 = this.f2c;
        switch(this.f0a) {
            case 0: goto L31;
            case 1: goto L29;
            case 2: goto L10;
            default: goto L4;
        };
    L4:
        C0245e r12 = ((SwipeDismissBehavior) r1).f2273a;
        if (r12 != null) goto L7;
        return;
    L7:
        if (r12.m674f() == false) goto L36;
        Field r13 = AbstractC0080Q.f219a;
        ((View) r02).postOnAnimation(this);
        return;
    L36:
        return;
    L10:
        C0906i r14 = (C0906i) r1;
        MenuC0779j r2 = r14.f3205c;
        if (r2 == null) goto L15;
        InterfaceC0777h r3 = r2.f2789e;
        if (r3 == null) goto L15;
        r3.mo346l(r2);
    L15:
        ActionMenuView r22 = r14.f3209g;
        if (r22 != null) goto L18;
    L27:
        r14.f3222t = null;
        return;
    L18:
        if (r22.getWindowToken() == null) goto L27;
        C0900f r03 = (C0900f) r02;
        if (r03.m2027b() == false) goto L23;
    L26:
        r14.f3220r = r03;
        goto L27
    L23:
        if (r03.f2840f == null) goto L27;
        r03.m2029d(0, 0, false, false);
        goto L26
    L29:
        ((InterfaceC0060a) r02).mo16a(r1);
        return;
    L31:
        AbstractC1083b r04 = (AbstractC1083b) ((C0095d) r02).f251b;
        if (r04 == null) goto L37;
        r04.mo2164g((Typeface) r1);
        return;
    }

    public RunnableC0000a(SwipeDismissBehavior r1, View r2, boolean r3) {
        this.f0a = 3;
        this.f2c = r1;
        this.f1b = r2;
    }

    public RunnableC0000a(C0906i r2, C0900f r3) {
        this.f0a = 2;
        this.f2c = r2;
        this.f1b = r3;
    }
}
