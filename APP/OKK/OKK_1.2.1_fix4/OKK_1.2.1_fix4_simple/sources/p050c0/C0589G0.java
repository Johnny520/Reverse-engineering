package p050c0;

import android.view.View;
import android.widget.EditText;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.util.Set;
import p006D.RunnableC0129u;

/* JADX INFO: renamed from: c0.G0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0589G0 extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1790b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0595I0 f1791c;

    public C0589G0(int r1) {
        this.f1790b = r1;
        switch(r1) {
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        this.f1791c = C0595I0.f1818a;
        return;
    L6:
        this.f1791c = C0595I0.f1818a;
        return;
    L8:
        this.f1791c = C0595I0.f1818a;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public final void mo1385a(C0760b r3) {
        switch(this.f1790b) {
            case 0: goto L33;
            case 1: goto L18;
            default: goto L4;
        };
    L4:
        Object r32 = r3.f2669b;
        if ((r32 instanceof EditText) == false) goto L7;
        final EditText r33 = (EditText) r32;
    L8:
        if (r33 != null) goto L11;
        return;
    L11:
        if (C0595I0.f1821d.get() == true) goto L45;
        this.f1791c.getClass();
        if (C0595I0.m1478f(r33) == false) goto L46;
        final int r1 = 1;
        r33.post(new RunnableC0592H0(r33, r1));
        return;
    L46:
        return;
    L45:
        return;
    L7:
        r33 = null;
        goto L8
    L18:
        Object r34 = r3.f2669b;
        if ((r34 instanceof EditText) == false) goto L21;
        final EditText r35 = (EditText) r34;
    L22:
        if (r35 == null) goto L47;
        this.f1791c.getClass();
        Set r02 = C0595I0.f1823f;
        monitor-enter(r02);
        r02.add(r35);     // Catch: Throwable -> L30
        monitor-exit(r02);
        final int r12 = 0;
        r35.post(new RunnableC0592H0(r35, r12));
        return;
    L30:
        th = move-exception;
        throw th;
    L47:
        return;
    L21:
        r35 = null;
        goto L22
    L33:
        Object r36 = r3.f2669b;
        if ((r36 instanceof View) == false) goto L36;
        View r37 = (View) r36;
    L37:
        C0595I0.f1825h = r37;
        this.f1791c.getClass();
        View r38 = C0595I0.f1825h;
        if (r38 == null) goto L48;
        r38.post(new RunnableC0129u(r38, 3));
        return;
    L48:
        return;
    L36:
        r37 = null;
        goto L37
    }
}
