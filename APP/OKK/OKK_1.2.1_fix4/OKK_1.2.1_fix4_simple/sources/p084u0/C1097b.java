package p084u0;

import android.graphics.Typeface;
import p056f0.AbstractC0805P;
import p083u.AbstractC1083b;

/* JADX INFO: renamed from: u0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1097b extends AbstractC1083b {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC0805P f4227e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1099d f4228f;

    public C1097b(C1099d r1, AbstractC0805P r2) {
        this.f4228f = r1;
        this.f4227e = r2;
    }

    @Override // p083u.AbstractC1083b
    /* JADX INFO: renamed from: f */
    public final void mo2163f(int r3) {
        this.f4228f.f4245m = true;
        this.f4227e.mo2059M(r3);
    }

    @Override // p083u.AbstractC1083b
    /* JADX INFO: renamed from: g */
    public final void mo2164g(Typeface r3) {
        C1099d r02 = this.f4228f;
        r02.f4246n = Typeface.create(r3, r02.f4235c);
        r02.f4245m = true;
        Typeface r32 = r02.f4246n;
        this.f4227e.mo2060N(r32, false);
    }
}
