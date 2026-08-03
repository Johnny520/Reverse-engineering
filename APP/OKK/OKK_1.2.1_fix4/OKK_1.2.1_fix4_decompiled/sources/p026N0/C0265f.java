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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0265f(C0266g c0266g, File file) {
        super(file);
        AbstractC0307g.m703e(file, "rootDir");
        this.f557e = c0266g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (r0.length == 0) goto L22;
     */
    @Override // p026N0.AbstractC0267h
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final File mo688a() {
        boolean z2 = this.f554b;
        File file = this.f560a;
        C0266g c0266g = this.f557e;
        if (!z2) {
            c0266g.f559d.getClass();
            this.f554b = true;
            return file;
        }
        File[] fileArr = this.f555c;
        if (fileArr != null) {
            int i2 = this.f556d;
            AbstractC0307g.m700b(fileArr);
            if (i2 >= fileArr.length) {
                c0266g.f559d.getClass();
                return null;
            }
        }
        if (this.f555c == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f555c = fileArrListFiles;
            if (fileArrListFiles == null) {
                c0266g.f559d.getClass();
            }
            File[] fileArr2 = this.f555c;
            if (fileArr2 != null) {
                AbstractC0307g.m700b(fileArr2);
            }
            c0266g.f559d.getClass();
            return null;
        }
        File[] fileArr3 = this.f555c;
        AbstractC0307g.m700b(fileArr3);
        int i3 = this.f556d;
        this.f556d = i3 + 1;
        return fileArr3[i3];
    }
}
