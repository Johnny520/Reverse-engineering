package p000;

import java.io.File;

/* JADX INFO: renamed from: ek */
/* JADX INFO: loaded from: classes.dex */
public final class C0190ek extends AbstractC0154dk {

    /* JADX INFO: renamed from: b */
    public boolean f1588b;

    /* JADX INFO: renamed from: c */
    public File[] f1589c;

    /* JADX INFO: renamed from: d */
    public int f1590d;

    /* JADX INFO: renamed from: e */
    public boolean f1591e;

    @Override // p000.AbstractC0337ik
    /* JADX INFO: renamed from: a */
    public final File mo999a() {
        boolean z = this.f1591e;
        File file = this.f2547a;
        if (!z && this.f1589c == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f1589c = fileArrListFiles;
            if (fileArrListFiles == null) {
                this.f1591e = true;
            }
        }
        File[] fileArr = this.f1589c;
        if (fileArr == null || this.f1590d >= fileArr.length) {
            if (this.f1588b) {
                return null;
            }
            this.f1588b = true;
            return file;
        }
        AbstractC0493mp.m1854d(fileArr);
        int i = this.f1590d;
        this.f1590d = i + 1;
        return fileArr[i];
    }
}
