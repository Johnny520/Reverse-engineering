package p000;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: Df */
/* JADX INFO: loaded from: classes.dex */
public final class C0151Df extends AbstractC2278nf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f406a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f407b;

    public C0151Df(AbstractC1073Yz r2) {
        this.f406a = 1;
        this.f407b = new WeakReference(r2);
    }

    @Override // p000.AbstractC2278nf
    /* JADX INFO: renamed from: a */
    public void mo295a() {
        switch(this.f406a) {
            case 1: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        AbstractC1073Yz r0 = (AbstractC1073Yz) this.f407b.get();
        if (r0 == null) goto L9;
        r0.m2011c();
        return;
    }

    @Override // p000.AbstractC2278nf
    /* JADX INFO: renamed from: b */
    public final void mo296b() {
        switch(this.f406a) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        AbstractC1073Yz r0 = (AbstractC1073Yz) this.f407b.get();
        if (r0 == null) goto L10;
        r0.m2011c();
        return;
    L10:
        return;
    L8:
        C0194Ef.m387a((EditText) this.f407b.get(), 1);
    }

    public C0151Df(EditText r2) {
        this.f406a = 0;
        this.f407b = new WeakReference(r2);
    }
}
