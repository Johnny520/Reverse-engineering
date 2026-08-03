package p061i;

import java.util.HashMap;

/* JADX INFO: renamed from: i.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0948a extends C0953f {

    /* JADX INFO: renamed from: e */
    public final HashMap f3365e;

    public C0948a() {
        this.f3365e = new HashMap();
    }

    @Override // p061i.C0953f
    /* JADX INFO: renamed from: a */
    public final C0950c mo2281a(Object r2) {
        return (C0950c) this.f3365e.get(r2);
    }

    @Override // p061i.C0953f
    /* JADX INFO: renamed from: b */
    public final Object mo2282b(Object r3) {
        Object r02 = super.mo2282b(r3);
        this.f3365e.remove(r3);
        return r02;
    }

    /* JADX INFO: renamed from: c */
    public final Object m2283c(Object r3, Object r4) {
        C0950c r02 = mo2281a(r3);
        if (r02 != null) goto L5;
        HashMap r03 = this.f3365e;
        C0950c r1 = new C0950c(r3, r4);
        this.f3379d++;
        C0950c r42 = this.f3377b;
        if (r42 != null) goto L9;
        this.f3376a = r1;
        this.f3377b = r1;
    L10:
        r03.put(r3, r1);
        return null;
    L9:
        r42.f3371c = r1;
        r1.f3372d = r42;
        this.f3377b = r1;
        goto L10
    L5:
        return r02.f3370b;
    }
}
