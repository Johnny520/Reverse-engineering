package p000;

import java.io.File;

/* JADX INFO: renamed from: gk */
/* JADX INFO: loaded from: classes.dex */
public final class C0264gk extends AbstractC0154dk {

    /* JADX INFO: renamed from: b */
    public boolean f2019b;

    /* JADX INFO: renamed from: c */
    public File[] f2020c;

    /* JADX INFO: renamed from: d */
    public int f2021d;

    @Override // p000.AbstractC0337ik
    /* JADX INFO: renamed from: a */
    public final File mo999a() {
        boolean z = this.f2019b;
        File file = this.f2547a;
        if (!z) {
            this.f2019b = true;
            return file;
        }
        File[] fileArr = this.f2020c;
        if (fileArr != null && this.f2021d >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f2020c = fileArrListFiles;
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                return null;
            }
        }
        File[] fileArr2 = this.f2020c;
        AbstractC0493mp.m1854d(fileArr2);
        int i = this.f2021d;
        this.f2021d = i + 1;
        return fileArr2[i];
    }
}
