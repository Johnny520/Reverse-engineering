package p000;

import java.io.File;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: rh */
/* JADX INFO: loaded from: classes.dex */
public final class C2460rh extends AbstractC2417qh {

    /* JADX INFO: renamed from: b */
    public boolean f8668b;

    /* JADX INFO: renamed from: c */
    public File[] f8669c;

    /* JADX INFO: renamed from: d */
    public int f8670d;

    /* JADX INFO: renamed from: e */
    public boolean f8671e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2589uh f8672f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2460rh(C2589uh c2589uh, File file) {
        super(file);
        this.f8672f = c2589uh;
    }

    @Override // p000.AbstractC2632vh
    /* JADX INFO: renamed from: a */
    public final File mo4952a() {
        int i;
        boolean z = this.f8671e;
        File file = this.f9142a;
        if (!z && this.f8669c == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f8669c = fileArrListFiles;
            if (fileArrListFiles == null) {
                Function2 function2 = this.f8672f.f8963d.f8786c;
                if (function2 != null) {
                    function2.mo446d(file, new C0516M(file, 0));
                }
                this.f8671e = true;
            }
        }
        File[] fileArr = this.f8669c;
        if (fileArr != null && (i = this.f8670d) < fileArr.length) {
            this.f8670d = i + 1;
            return fileArr[i];
        }
        if (this.f8668b) {
            return null;
        }
        this.f8668b = true;
        return file;
    }
}
