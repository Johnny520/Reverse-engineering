package androidx.emoji2.text;

import android.os.Build;
import p018J0.C0234d;
import p037U.AbstractC0358S;
import p043Y.C0463v;

/* JADX INFO: renamed from: androidx.emoji2.text.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0480e extends AbstractC0358S {

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C0481f f1349z;

    public C0480e(C0481f c0481f) {
        this.f1349z = c0481f;
    }

    @Override // p037U.AbstractC0358S
    /* JADX INFO: renamed from: U */
    public final void mo921U(Throwable th) {
        this.f1349z.f1350a.m1202d(th);
    }

    @Override // p037U.AbstractC0358S
    /* JADX INFO: renamed from: V */
    public final void mo922V(C0463v c0463v) {
        C0481f c0481f = this.f1349z;
        c0481f.f1352c = c0463v;
        C0463v c0463v2 = c0481f.f1352c;
        C0485j c0485j = c0481f.f1350a;
        c0481f.f1351b = new C0234d(c0463v2, c0485j.f1361g, c0485j.f1363i, Build.VERSION.SDK_INT >= 34 ? AbstractC0489n.m1206a() : AbstractC0358S.m918x());
        c0481f.f1350a.m1203e();
    }
}
