package p000;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: b1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1199b1 extends AbstractC0903V0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC1242c1 f4110a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f4111b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0817T0 f4112c;

    public C1199b1(AbstractC1242c1 r1, String r2, AbstractC0817T0 r3) {
        this.f4110a = r1;
        this.f4111b = r2;
        this.f4112c = r3;
    }

    /* JADX INFO: renamed from: a */
    public final void m2318a(Object r6) {
        AbstractC1242c1 r0 = this.f4110a;
        ArrayList r1 = r0.f4223d;
        LinkedHashMap r2 = r0.f4221b;
        String r3 = this.f4111b;
        Object r22 = r2.get(r3);
        AbstractC0817T0 r4 = this.f4112c;
        if (r22 == null) goto L11;
        int r23 = ((Number) r22).intValue();
        r1.add(r3);
        r0.mo1452b(r23, r4, r6);     // Catch: Exception -> L7
        return;
    L7:
        e = move-exception;
        r1.remove(r3);
        throw e;
    L11:
        throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + r4 + " and input " + r6 + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
    }
}
