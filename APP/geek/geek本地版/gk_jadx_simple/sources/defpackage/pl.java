package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;

/* JADX INFO: loaded from: classes.dex */
public final class pl implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public pl(ql r2, a r3) {
        this.a = 0;
        this.c = r2;
        this.b = r3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View r3) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ip.o(u40.a("ZA==\n", "ElH1bmmP0/k=\n"), r3);
        return;
    L6:
        a r32 = (a) this.b;
        ml r0 = r32.c;
        r32.k();
        cg.f((ViewGroup) r0.E.getParent(), ((ql) this.c).a.y()).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View r3) {
        switch(this.a) {
            case 0: goto L14;
            default: goto L4;
        };
    L4:
        ip.o(u40.a("3w==\n", "qZwR1n1Fv/g=\n"), r3);
        ValueAnimator r32 = (ValueAnimator) ((i00) this.b).b;
        if (r32 == null) goto L7;
        r32.cancel();
    L7:
        Object r33 = ((View) this.c).getTag(2114519045);
        if ((r33 instanceof h40) == false) goto L10;
        h40 r34 = (h40) r33;
    L11:
        if (r34 == null) goto L15;
        r34.c();
        return;
    L15:
        return;
    L10:
        r34 = null;
        goto L11
    }

    public pl(i00 r2, View r3) {
        this.a = 1;
        this.b = r2;
        this.c = r3;
    }

    private final void a(View r1) {
    }
}
