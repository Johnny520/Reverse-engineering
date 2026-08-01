package p244u;

import android.os.Build;
import android.view.View;
import java.util.List;
import p154e2.C2023b;
import p229r1.AbstractC3094x;
import p229r1.C3046G;
import p229r1.C3064Z;
import p229r1.C3070c0;
import p229r1.InterfaceC3081k;

/* JADX INFO: renamed from: u.F */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3237F extends AbstractC3094x implements Runnable, InterfaceC3081k, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: f */
    public final C3278k0 f10027f;

    /* JADX INFO: renamed from: g */
    public boolean f10028g;

    /* JADX INFO: renamed from: h */
    public boolean f10029h;

    /* JADX INFO: renamed from: i */
    public C3070c0 f10030i;

    public RunnableC3237F(C3278k0 c3278k0) {
        super(!c3278k0.f10137s ? 1 : 0);
        this.f10027f = c3278k0;
    }

    @Override // p229r1.InterfaceC3081k
    /* JADX INFO: renamed from: a */
    public final C3070c0 mo680a(View view, C3070c0 c3070c0) {
        this.f10030i = c3070c0;
        C3278k0 c3278k0 = this.f10027f;
        C3274i0 c3274i0 = c3278k0.f10135q;
        C3064Z c3064z = c3070c0.f9782a;
        c3274i0.m5551f(AbstractC3261c.m5537x(c3064z.mo5367i(8)));
        if (this.f10028g) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f10029h) {
            c3278k0.f10136r.m5551f(AbstractC3261c.m5537x(c3064z.mo5367i(8)));
            C3278k0.m5556b(c3278k0, c3070c0);
        }
        return c3278k0.f10137s ? C3070c0.f9781b : c3070c0;
    }

    @Override // p229r1.AbstractC3094x
    /* JADX INFO: renamed from: b */
    public final void mo681b(C3046G c3046g) {
        this.f10028g = false;
        this.f10029h = false;
        C3070c0 c3070c0 = this.f10030i;
        if (c3046g.f9741a.mo5317b() > 0 && c3070c0 != null) {
            C3064Z c3064z = c3070c0.f9782a;
            C3278k0 c3278k0 = this.f10027f;
            c3278k0.f10136r.m5551f(AbstractC3261c.m5537x(c3064z.mo5367i(8)));
            c3278k0.f10135q.m5551f(AbstractC3261c.m5537x(c3064z.mo5367i(8)));
            C3278k0.m5556b(c3278k0, c3070c0);
        }
        this.f10030i = null;
    }

    @Override // p229r1.AbstractC3094x
    /* JADX INFO: renamed from: c */
    public final void mo682c(C3046G c3046g) {
        this.f10028g = true;
        this.f10029h = true;
    }

    @Override // p229r1.AbstractC3094x
    /* JADX INFO: renamed from: d */
    public final C3070c0 mo683d(C3070c0 c3070c0, List list) {
        C3278k0 c3278k0 = this.f10027f;
        C3278k0.m5556b(c3278k0, c3070c0);
        return c3278k0.f10137s ? C3070c0.f9781b : c3070c0;
    }

    @Override // p229r1.AbstractC3094x
    /* JADX INFO: renamed from: e */
    public final C2023b mo684e(C3046G c3046g, C2023b c2023b) {
        this.f10028g = false;
        return c2023b;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10028g) {
            this.f10028g = false;
            this.f10029h = false;
            C3070c0 c3070c0 = this.f10030i;
            if (c3070c0 != null) {
                C3278k0 c3278k0 = this.f10027f;
                c3278k0.f10136r.m5551f(AbstractC3261c.m5537x(c3070c0.f9782a.mo5367i(8)));
                C3278k0.m5556b(c3278k0, c3070c0);
                this.f10030i = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
