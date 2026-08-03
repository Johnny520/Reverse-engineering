package p000;

import java.io.File;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: th */
/* JADX INFO: loaded from: classes.dex */
public final class C2546th extends AbstractC2417qh {

    /* JADX INFO: renamed from: b */
    public boolean f8864b;

    /* JADX INFO: renamed from: c */
    public File[] f8865c;

    /* JADX INFO: renamed from: d */
    public int f8866d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2589uh f8867e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2546th(C2589uh c2589uh, File file) {
        super(file);
        this.f8867e = c2589uh;
    }

    @Override // p000.AbstractC2632vh
    /* JADX INFO: renamed from: a */
    public final File mo4952a() {
        Function2 function2;
        boolean z = this.f8864b;
        File file = this.f9142a;
        if (!z) {
            this.f8864b = true;
            return file;
        }
        File[] fileArr = this.f8865c;
        if (fileArr != null && this.f8866d >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f8865c = fileArrListFiles;
            if (fileArrListFiles == null && (function2 = this.f8867e.f8963d.f8786c) != null) {
                function2.mo446d(file, new C0516M(file, 0));
            }
            File[] fileArr2 = this.f8865c;
            if (fileArr2 == null || fileArr2.length == 0) {
                return null;
            }
        }
        File[] fileArr3 = this.f8865c;
        int i = this.f8866d;
        this.f8866d = i + 1;
        return fileArr3[i];
    }
}
