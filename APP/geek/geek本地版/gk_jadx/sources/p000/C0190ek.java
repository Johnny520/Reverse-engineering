package p000;

import java.io.File;

/* JADX INFO: renamed from: ek */
/* JADX INFO: loaded from: classes.dex */
public final class C0190ek extends AbstractC0071bk {

    /* JADX INFO: renamed from: b */
    public boolean f1808b;

    /* JADX INFO: renamed from: c */
    public File[] f1809c;

    /* JADX INFO: renamed from: d */
    public int f1810d;

    @Override // p000.AbstractC0264gk
    /* JADX INFO: renamed from: a */
    public final File mo692a() {
        boolean z = this.f1808b;
        File file = this.f2135a;
        if (!z) {
            this.f1808b = true;
            return file;
        }
        File[] fileArr = this.f1809c;
        if (fileArr != null && this.f1810d >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f1809c = fileArrListFiles;
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                return null;
            }
        }
        File[] fileArr2 = this.f1809c;
        AbstractC0346ip.m1500l(fileArr2);
        int i = this.f1810d;
        this.f1810d = i + 1;
        return fileArr2[i];
    }
}
