package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class jq1 {

    /* JADX INFO: renamed from: α */
    public final p000.kq1 f5546;

    /* JADX INFO: renamed from: β */
    public final p000.C1084 f5547;

    /* JADX INFO: renamed from: γ */
    public final p000.zz1 f5548;

    /* JADX INFO: renamed from: δ */
    public final java.util.LinkedHashMap f5549;

    /* JADX INFO: renamed from: ε */
    public boolean f5550;

    /* JADX INFO: renamed from: ζ */
    public android.os.Bundle f5551;

    /* JADX INFO: renamed from: η */
    public boolean f5552;

    /* JADX INFO: renamed from: θ */
    public boolean f5553;

    public jq1(p000.kq1 r2, p000.C1084 r3) {
            r1 = this;
            r1.<init>()
            r1.f5546 = r2
            r1.f5547 = r3
            zz1 r2 = new zz1
            r3 = 3
            r0 = 0
            r2.<init>(r3, r0)
            r1.f5548 = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.f5549 = r2
            r2 = 1
            r1.f5553 = r2
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m2979() {
            r3 = this;
            kq1 r0 = r3.f5546
            jr0 r1 = r0.mo192()
            cr0 r1 = r1.f5558
            cr0 r2 = p000.cr0.f2725
            if (r1 != r2) goto L2b
            boolean r1 = r3.f5550
            if (r1 != 0) goto L25
            η r1 = r3.f5547
            r1.invoke()
            jr0 r0 = r0.mo192()
            iq1 r1 = new iq1
            r1.<init>(r3)
            r0.m2980(r1)
            r0 = 1
            r3.f5550 = r0
            return
        L25:
            java.lang.String r3 = "SavedStateRegistry was already attached."
            p000.C1080.m7279(r3)
            return
        L2b:
            java.lang.String r3 = "Restarter must be created only during owner's initialization stage"
            p000.C1080.m7279(r3)
            return
    }
}
