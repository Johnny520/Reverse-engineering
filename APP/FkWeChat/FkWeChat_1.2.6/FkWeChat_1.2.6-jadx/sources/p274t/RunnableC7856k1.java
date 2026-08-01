package p274t;

import android.os.Build;
import android.view.View;
import java.util.List;
import p336x3.C9408m0;
import p336x3.C9436y;
import p336x3.InterfaceC9392h;

/* JADX INFO: renamed from: t.k1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7856k1 extends C9436y.b implements Runnable, InterfaceC9392h, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: s */
    public final C7898s3 f26185s;

    /* JADX INFO: renamed from: t */
    public boolean f26186t;

    /* JADX INFO: renamed from: u */
    public boolean f26187u;

    /* JADX INFO: renamed from: v */
    public C9408m0 f26188v;

    public RunnableC7856k1(C7898s3 c7898s3) {
        super(!c7898s3.m30499c() ? 1 : 0);
        this.f26185s = c7898s3;
    }

    @Override // p336x3.InterfaceC9392h
    /* JADX INFO: renamed from: a */
    public C9408m0 mo13332a(View view, C9408m0 c9408m0) {
        this.f26188v = c9408m0;
        this.f26185s.m30507l(c9408m0);
        if (this.f26186t) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f26187u) {
            this.f26185s.m30506k(c9408m0);
            C7898s3.m30497j(this.f26185s, c9408m0, 0, 2, null);
        }
        return this.f26185s.m30499c() ? C9408m0.f31978b : c9408m0;
    }

    @Override // p336x3.C9436y.b
    /* JADX INFO: renamed from: c */
    public void mo13333c(C9436y c9436y) {
        this.f26186t = false;
        this.f26187u = false;
        C9408m0 c9408m0 = this.f26188v;
        if (c9436y.m36713b() > 0 && c9408m0 != null) {
            this.f26185s.m30506k(c9408m0);
            this.f26185s.m30507l(c9408m0);
            C7898s3.m30497j(this.f26185s, c9408m0, 0, 2, null);
        }
        this.f26188v = null;
        super.mo13333c(c9436y);
    }

    @Override // p336x3.C9436y.b
    /* JADX INFO: renamed from: d */
    public void mo13334d(C9436y c9436y) {
        this.f26186t = true;
        this.f26187u = true;
        super.mo13334d(c9436y);
    }

    @Override // p336x3.C9436y.b
    /* JADX INFO: renamed from: e */
    public C9408m0 mo13335e(C9408m0 c9408m0, List list) {
        C7898s3.m30497j(this.f26185s, c9408m0, 0, 2, null);
        return this.f26185s.m30499c() ? C9408m0.f31978b : c9408m0;
    }

    @Override // p336x3.C9436y.b
    /* JADX INFO: renamed from: f */
    public C9436y.a mo13336f(C9436y c9436y, C9436y.a aVar) {
        this.f26186t = false;
        return super.mo13336f(c9436y, aVar);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f26186t) {
            this.f26186t = false;
            this.f26187u = false;
            C9408m0 c9408m0 = this.f26188v;
            if (c9408m0 != null) {
                this.f26185s.m30506k(c9408m0);
                C7898s3.m30497j(this.f26185s, c9408m0, 0, 2, null);
                this.f26188v = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }
}
