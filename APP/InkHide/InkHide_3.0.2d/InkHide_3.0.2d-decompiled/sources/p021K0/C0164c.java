package p021K0;

import java.io.File;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: K0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0164c extends AbstractC0163b {

    /* JADX INFO: renamed from: b */
    public boolean f475b;

    /* JADX INFO: renamed from: c */
    public File[] f476c;

    /* JADX INFO: renamed from: d */
    public int f477d;

    /* JADX INFO: renamed from: e */
    public boolean f478e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0167f f479f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0164c(C0167f c0167f, File file) {
        super(file);
        this.f479f = c0167f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p021K0.AbstractC0168g
    /* JADX INFO: renamed from: a */
    public final File mo341a() {
        boolean z2 = this.f478e;
        File file = this.f487a;
        C0167f c0167f = this.f479f;
        if (!z2 && this.f476c == null) {
            c0167f.f486d.getClass();
            File[] fileArrListFiles = file.listFiles();
            this.f476c = fileArrListFiles;
            if (fileArrListFiles == null) {
                c0167f.f486d.getClass();
                this.f478e = true;
            }
        }
        File[] fileArr = this.f476c;
        if (fileArr != null && this.f477d < fileArr.length) {
            AbstractC0223g.m415b(fileArr);
            int i2 = this.f477d;
            this.f477d = i2 + 1;
            return fileArr[i2];
        }
        if (this.f475b) {
            c0167f.f486d.getClass();
            return null;
        }
        this.f475b = true;
        return file;
    }
}
