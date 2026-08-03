package p000;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: Df */
/* JADX INFO: loaded from: classes.dex */
public final class C0151Df extends AbstractC2278nf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f406a = 1;

    /* JADX INFO: renamed from: b */
    public final WeakReference f407b;

    public C0151Df(AbstractC1073Yz abstractC1073Yz) {
        this.f407b = new WeakReference(abstractC1073Yz);
    }

    @Override // p000.AbstractC2278nf
    /* JADX INFO: renamed from: a */
    public void mo295a() {
        switch (this.f406a) {
            case 1:
                AbstractC1073Yz abstractC1073Yz = (AbstractC1073Yz) this.f407b.get();
                if (abstractC1073Yz != null) {
                    abstractC1073Yz.m2011c();
                }
                break;
        }
    }

    @Override // p000.AbstractC2278nf
    /* JADX INFO: renamed from: b */
    public final void mo296b() {
        switch (this.f406a) {
            case 0:
                C0194Ef.m387a((EditText) this.f407b.get(), 1);
                break;
            default:
                AbstractC1073Yz abstractC1073Yz = (AbstractC1073Yz) this.f407b.get();
                if (abstractC1073Yz != null) {
                    abstractC1073Yz.m2011c();
                }
                break;
        }
    }

    public C0151Df(EditText editText) {
        this.f407b = new WeakReference(editText);
    }
}
