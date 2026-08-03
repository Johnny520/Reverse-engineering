package androidx.emoji2.text;

import android.os.Build;
import java.util.Set;
import p018J0.C0234d;
import p037U.AbstractC0358S;
import p043Y.C0463v;
import p089x0.C1121e;

/* JADX INFO: renamed from: androidx.emoji2.text.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0480e extends AbstractC0358S {

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C0481f f1349z;

    public C0480e(C0481f r1) {
        this.f1349z = r1;
    }

    @Override // p037U.AbstractC0358S
    /* JADX INFO: renamed from: U */
    public final void mo921U(Throwable r2) {
        this.f1349z.f1350a.m1202d(r2);
    }

    @Override // p037U.AbstractC0358S
    /* JADX INFO: renamed from: V */
    public final void mo922V(C0463v r7) {
        C0481f r02 = this.f1349z;
        r02.f1352c = r7;
        C0463v r1 = r02.f1352c;
        C0485j r2 = r02.f1350a;
        C1121e r3 = r2.f1361g;
        C0479d r22 = r2.f1363i;
        if (Build.VERSION.SDK_INT < 34) goto L5;
        Set<int[]> r4 = AbstractC0489n.m1206a();
    L6:
        r02.f1351b = new C0234d(r1, r3, r22, r4);
        r02.f1350a.m1203e();
        return;
    L5:
        r4 = AbstractC0358S.m918x();
        goto L6
    }
}
