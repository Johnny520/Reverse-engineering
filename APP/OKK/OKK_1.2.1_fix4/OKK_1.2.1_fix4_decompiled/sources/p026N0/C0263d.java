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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0263d(C0266g c0266g, File file) {
        super(file);
        AbstractC0307g.m703e(file, "rootDir");
        this.f552f = c0266g;
    }

    @Override // p026N0.AbstractC0267h
    /* JADX INFO: renamed from: a */
    public final File mo688a() {
        boolean z2 = this.f551e;
        File file = this.f560a;
        C0266g c0266g = this.f552f;
        if (!z2 && this.f549c == null) {
            c0266g.f559d.getClass();
            File[] fileArrListFiles = file.listFiles();
            this.f549c = fileArrListFiles;
            if (fileArrListFiles == null) {
                c0266g.f559d.getClass();
                this.f551e = true;
            }
        }
        File[] fileArr = this.f549c;
        if (fileArr != null) {
            int i2 = this.f550d;
            AbstractC0307g.m700b(fileArr);
            if (i2 < fileArr.length) {
                File[] fileArr2 = this.f549c;
                AbstractC0307g.m700b(fileArr2);
                int i3 = this.f550d;
                this.f550d = i3 + 1;
                return fileArr2[i3];
            }
        }
        if (this.f548b) {
            c0266g.f559d.getClass();
            return null;
        }
        this.f548b = true;
        return file;
    }
}
