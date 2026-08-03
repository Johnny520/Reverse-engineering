package p026N0;

import java.io.File;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: N0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0263d extends AbstractC0262c {

    /* JADX INFO: renamed from: b */
    public boolean f548b;

    /* JADX INFO: renamed from: c */
    public File[] f549c;

    /* JADX INFO: renamed from: d */
    public int f550d;

    /* JADX INFO: renamed from: e */
    public boolean f551e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0266g f552f;

    public C0263d(C0266g r2, File r3) {
        AbstractC0307g.m703e(r3, "rootDir");
        this.f552f = r2;
        super(r3);
    }

    @Override // p026N0.AbstractC0267h
    /* JADX INFO: renamed from: a */
    public final File mo688a() {
        boolean r02 = this.f551e;
        File r1 = this.f560a;
        C0266g r3 = this.f552f;
        if (r02 == false) goto L5;
    L9:
        File[] r03 = this.f549c;
        if (r03 == null) goto L16;
        int r4 = this.f550d;
        AbstractC0307g.m700b(r03);
        if (r4 >= r03.length) goto L16;
        File[] r04 = this.f549c;
        AbstractC0307g.m700b(r04);
        int r12 = this.f550d;
        this.f550d = r12 + 1;
        return r04[r12];
    L16:
        if (this.f548b == true) goto L19;
        this.f548b = true;
        return r1;
    L19:
        r3.f559d.getClass();
        return null;
    L5:
        if (this.f549c != null) goto L9;
        r3.f559d.getClass();
        File[] r05 = r1.listFiles();
        this.f549c = r05;
        if (r05 != null) goto L9;
        r3.f559d.getClass();
        this.f551e = true;
        goto L9
    }
}
