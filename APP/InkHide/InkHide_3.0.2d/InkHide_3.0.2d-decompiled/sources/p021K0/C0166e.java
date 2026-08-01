package p021K0;

import java.io.File;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: K0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0166e extends AbstractC0163b {

    /* JADX INFO: renamed from: b */
    public boolean f481b;

    /* JADX INFO: renamed from: c */
    public File[] f482c;

    /* JADX INFO: renamed from: d */
    public int f483d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0167f f484e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0166e(C0167f c0167f, File file) {
        super(file);
        this.f484e = c0167f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p021K0.AbstractC0168g
    /* JADX INFO: renamed from: a */
    public final File mo341a() {
        boolean z2 = this.f481b;
        File file = this.f487a;
        C0167f c0167f = this.f484e;
        if (!z2) {
            c0167f.f486d.getClass();
            this.f481b = true;
            return file;
        }
        File[] fileArr = this.f482c;
        if (fileArr != null && this.f483d >= fileArr.length) {
            c0167f.f486d.getClass();
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f482c = fileArrListFiles;
            if (fileArrListFiles == null) {
                c0167f.f486d.getClass();
            }
            File[] fileArr2 = this.f482c;
            if (fileArr2 == null || fileArr2.length == 0) {
                c0167f.f486d.getClass();
                return null;
            }
        }
        File[] fileArr3 = this.f482c;
        AbstractC0223g.m415b(fileArr3);
        int i2 = this.f483d;
        this.f483d = i2 + 1;
        return fileArr3[i2];
    }
}
