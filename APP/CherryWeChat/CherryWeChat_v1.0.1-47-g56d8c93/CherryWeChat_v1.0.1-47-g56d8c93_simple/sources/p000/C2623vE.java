package p000;

import android.app.Application;

/* JADX INFO: renamed from: vE */
/* JADX INFO: loaded from: classes.dex */
public final class C2623vE extends C0111Ci {

    /* JADX INFO: renamed from: d */
    public static C2623vE f9107d;

    /* JADX INFO: renamed from: c */
    public final Application f9108c;

    public C2623vE(Application r2) {
        super(2);
        this.f9108c = r2;
    }

    @Override // p000.C0111Ci, p000.InterfaceC2666wE
    /* JADX INFO: renamed from: a */
    public final AbstractC2580uE mo171a(Class r2) {
        Application r0 = this.f9108c;
        if (r0 == null) goto L7;
        return m5139c(r2, r0);
    L7:
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // p000.InterfaceC2666wE
    /* JADX INFO: renamed from: b */
    public final AbstractC2580uE mo2563b(Class r2, C2557ts r3) {
        if (this.f9108c != null) goto L5;
        C1456gf r0 = C1456gf.f5169m;
        Application r32 = (Application) r3.f7638a.get(r0);
        if (r32 == null) goto L11;
        return m5139c(r2, r32);
    L11:
        if (AbstractC0218F2.class.isAssignableFrom(r2) == true) goto L15;
        return super.mo171a(r2);
    L15:
        throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
    L5:
        return mo171a(r2);
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC2580uE m5139c(Class r4, Application r5) {
        if (AbstractC0218F2.class.isAssignableFrom(r4) == false) goto L23;
        return (AbstractC2580uE) r4.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{r5});
    L10:
        e = move-exception;
        throw new RuntimeException("Cannot create an instance of " + r4, e);
    L8:
        e = move-exception;
        throw new RuntimeException("Cannot create an instance of " + r4, e);
    L12:
        e = move-exception;
        throw new RuntimeException("Cannot create an instance of " + r4, e);
    L6:
        e = move-exception;
        throw new RuntimeException("Cannot create an instance of " + r4, e);
    L23:
        return super.mo171a(r4);
    }
}
