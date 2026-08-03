package p054dg;

import java.io.File;
import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: dg.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0788g extends AbstractC0785d {

    /* JADX INFO: renamed from: b */
    public boolean f2364b;

    /* JADX INFO: renamed from: c */
    public File[] f2365c;

    /* JADX INFO: renamed from: d */
    public int f2366d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0789h f2367e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0788g(C0789h c0789h, File file) {
        super(file);
        file.getClass();
        this.f2367e = c0789h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054dg.AbstractC0790i
    /* JADX INFO: renamed from: a */
    public final File mo2017a() {
        boolean z9 = this.f2364b;
        File file = this.f2370a;
        if (!z9) {
            InterfaceC1231l interfaceC1231l = this.f2367e.f2369j.f2372b;
            if (interfaceC1231l != null && !((Boolean) interfaceC1231l.invoke(file)).booleanValue()) {
                return null;
            }
            this.f2364b = true;
            return file;
        }
        File[] fileArr = this.f2365c;
        if (fileArr != null && this.f2366d >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f2365c = fileArrListFiles;
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                return null;
            }
        }
        File[] fileArr2 = this.f2365c;
        fileArr2.getClass();
        int i9 = this.f2366d;
        this.f2366d = i9 + 1;
        return fileArr2[i9];
    }
}
