package p000;

/* JADX INFO: renamed from: Zn */
/* JADX INFO: loaded from: classes.dex */
public final class C1104Zn {

    /* JADX INFO: renamed from: a */
    public EnumC0675Pn f3496a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0889Un f3497b;

    /* JADX INFO: renamed from: a */
    public final void m2028a(InterfaceC1061Yn r4, EnumC0632On r5) {
        EnumC0675Pn r0 = r5.m1254a();
        EnumC0675Pn r1 = this.f3496a;
        if (r0.compareTo(r1) >= 0) goto L5;
        r1 = r0;
    L5:
        this.f3496a = r1;
        this.f3497b.onStateChanged(r4, r5);
        this.f3496a = r0;
    }
}
