package p026N0;

import java.io.File;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: N0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0265f extends AbstractC0262c {

    /* JADX INFO: renamed from: b */
    public boolean f554b;

    /* JADX INFO: renamed from: c */
    public File[] f555c;

    /* JADX INFO: renamed from: d */
    public int f556d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0266g f557e;

    public C0265f(C0266g r2, File r3) {
        AbstractC0307g.m703e(r3, "rootDir");
        this.f557e = r2;
        super(r3);
    }

    @Override // p026N0.AbstractC0267h
    /* JADX INFO: renamed from: a */
    public final File mo688a() {
        boolean r02 = this.f554b;
        File r1 = this.f560a;
        C0266g r2 = this.f557e;
        if (r02 == true) goto L6;
        r2.f559d.getClass();
        this.f554b = true;
        return r1;
    L6:
        File[] r03 = this.f555c;
        if (r03 == null) goto L14;
        int r4 = this.f556d;
        AbstractC0307g.m700b(r03);
        if (r4 < r03.length) goto L14;
        r2.f559d.getClass();
        return null;
    L14:
        if (this.f555c != null) goto L24;
        File[] r04 = r1.listFiles();
        this.f555c = r04;
        if (r04 != null) goto L18;
        r2.f559d.getClass();
    L18:
        File[] r05 = this.f555c;
        if (r05 == null) goto L22;
        AbstractC0307g.m700b(r05);
        if (r05.length != 0) goto L24;
    L22:
        r2.f559d.getClass();
        return null;
    L24:
        File[] r06 = this.f555c;
        AbstractC0307g.m700b(r06);
        int r12 = this.f556d;
        this.f556d = r12 + 1;
        return r06[r12];
    }
}
