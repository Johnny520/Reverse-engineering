package p084u0;

import android.graphics.Typeface;
import com.abc.core.runtime.AbstractC0805P;
import p083u.AbstractC1083b;

/* JADX INFO: renamed from: u0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1097b extends AbstractC1083b {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC0805P f4227e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1099d f4228f;

    public C1097b(C1099d c1099d, AbstractC0805P abstractC0805P) {
        this.f4228f = c1099d;
        this.f4227e = abstractC0805P;
    }

    @Override // p083u.AbstractC1083b
    /* JADX INFO: renamed from: f */
    public final void mo2163f(int i2) {
        this.f4228f.f4245m = true;
        this.f4227e.mo2059M(i2);
    }

    @Override // p083u.AbstractC1083b
    /* JADX INFO: renamed from: g */
    public final void mo2164g(Typeface typeface) {
        C1099d c1099d = this.f4228f;
        c1099d.f4246n = Typeface.create(typeface, c1099d.f4235c);
        c1099d.f4245m = true;
        this.f4227e.mo2060N(c1099d.f4246n, false);
    }
}
