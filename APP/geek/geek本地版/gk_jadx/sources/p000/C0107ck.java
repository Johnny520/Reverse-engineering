package p000;

import java.io.File;

/* JADX INFO: renamed from: ck */
/* JADX INFO: loaded from: classes.dex */
public final class C0107ck extends AbstractC0071bk {

    /* JADX INFO: renamed from: b */
    public boolean f963b;

    /* JADX INFO: renamed from: c */
    public File[] f964c;

    /* JADX INFO: renamed from: d */
    public int f965d;

    /* JADX INFO: renamed from: e */
    public boolean f966e;

    @Override // p000.AbstractC0264gk
    /* JADX INFO: renamed from: a */
    public final File mo692a() {
        boolean z = this.f966e;
        File file = this.f2135a;
        if (!z && this.f964c == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f964c = fileArrListFiles;
            if (fileArrListFiles == null) {
                this.f966e = true;
            }
        }
        File[] fileArr = this.f964c;
        if (fileArr == null || this.f965d >= fileArr.length) {
            if (this.f963b) {
                return null;
            }
            this.f963b = true;
            return file;
        }
        AbstractC0346ip.m1500l(fileArr);
        int i = this.f965d;
        this.f965d = i + 1;
        return fileArr[i];
    }
}
