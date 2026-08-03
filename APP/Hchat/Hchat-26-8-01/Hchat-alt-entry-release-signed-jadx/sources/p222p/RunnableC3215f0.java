package p222p;

import android.os.Build;
import android.view.View;
import java.util.List;
import p014b.C0126e;
import p091g3.AbstractC1333s;
import p091g3.C1300b0;
import p091g3.C1324n0;
import p091g3.C1332r0;
import p091g3.InterfaceC1305e;

/* JADX INFO: renamed from: p.f0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3215f0 extends AbstractC1333s implements Runnable, InterfaceC1305e, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: j */
    public final C3255s1 f10268j;

    /* JADX INFO: renamed from: k */
    public boolean f10269k;

    /* JADX INFO: renamed from: l */
    public boolean f10270l;

    /* JADX INFO: renamed from: m */
    public C1332r0 f10271m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC3215f0(C3255s1 c3255s1) {
        super(!c3255s1.f10379s ? 1 : 0);
        this.f10268j = c3255s1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.AbstractC1333s
    /* JADX INFO: renamed from: a */
    public final void mo3560a(C1300b0 c1300b0) {
        this.f10269k = false;
        this.f10270l = false;
        C1332r0 c1332r0 = this.f10271m;
        if (c1300b0.f4355a.mo3445b() > 0 && c1332r0 != null) {
            C1324n0 c1324n0 = c1332r0.f4398a;
            C3255s1 c3255s1 = this.f10268j;
            c3255s1.f10378r.m6932f(AbstractC3208d.m6887q(c1324n0.mo3501g(8)));
            c3255s1.f10377q.m6932f(AbstractC3208d.m6887q(c1324n0.mo3501g(8)));
            C3255s1.m6936b(c3255s1, c1332r0);
        }
        this.f10271m = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.AbstractC1333s
    /* JADX INFO: renamed from: b */
    public final void mo3561b() {
        this.f10269k = true;
        this.f10270l = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.InterfaceC1305e
    /* JADX INFO: renamed from: c */
    public final C1332r0 mo3460c(View view, C1332r0 c1332r0) {
        this.f10271m = c1332r0;
        C3255s1 c3255s1 = this.f10268j;
        C3243o1 c3243o1 = c3255s1.f10377q;
        C1324n0 c1324n0 = c1332r0.f4398a;
        c3243o1.m6932f(AbstractC3208d.m6887q(c1324n0.mo3501g(8)));
        if (this.f10269k) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f10270l) {
            c3255s1.f10378r.m6932f(AbstractC3208d.m6887q(c1324n0.mo3501g(8)));
            C3255s1.m6936b(c3255s1, c1332r0);
        }
        return c3255s1.f10379s ? C1332r0.f4397b : c1332r0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.AbstractC1333s
    /* JADX INFO: renamed from: d */
    public final C1332r0 mo3562d(C1332r0 c1332r0, List list) {
        C3255s1 c3255s1 = this.f10268j;
        C3255s1.m6936b(c3255s1, c1332r0);
        return c3255s1.f10379s ? C1332r0.f4397b : c1332r0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.AbstractC1333s
    /* JADX INFO: renamed from: e */
    public final C0126e mo3563e(C1300b0 c1300b0, C0126e c0126e) {
        this.f10269k = false;
        return c0126e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10269k) {
            this.f10269k = false;
            this.f10270l = false;
            C1332r0 c1332r0 = this.f10271m;
            if (c1332r0 != null) {
                C3255s1 c3255s1 = this.f10268j;
                c3255s1.f10378r.m6932f(AbstractC3208d.m6887q(c1332r0.f4398a.mo3501g(8)));
                C3255s1.m6936b(c3255s1, c1332r0);
                this.f10271m = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
