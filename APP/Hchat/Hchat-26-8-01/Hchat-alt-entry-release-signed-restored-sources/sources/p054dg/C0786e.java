package p054dg;

import java.io.File;
import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: dg.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0786e extends AbstractC0785d {

    /* JADX INFO: renamed from: b */
    public boolean f2358b;

    /* JADX INFO: renamed from: c */
    public File[] f2359c;

    /* JADX INFO: renamed from: d */
    public int f2360d;

    /* JADX INFO: renamed from: e */
    public boolean f2361e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0789h f2362f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0786e(C0789h c0789h, File file) {
        super(file);
        file.getClass();
        this.f2362f = c0789h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054dg.AbstractC0790i
    /* JADX INFO: renamed from: a */
    public final File mo2017a() {
        boolean z9 = this.f2361e;
        File file = this.f2370a;
        if (!z9 && this.f2359c == null) {
            InterfaceC1231l interfaceC1231l = this.f2362f.f2369j.f2372b;
            if (interfaceC1231l != null && !((Boolean) interfaceC1231l.invoke(file)).booleanValue()) {
                return null;
            }
            File[] fileArrListFiles = file.listFiles();
            this.f2359c = fileArrListFiles;
            if (fileArrListFiles == null) {
                this.f2361e = true;
            }
        }
        File[] fileArr = this.f2359c;
        if (fileArr == null || this.f2360d >= fileArr.length) {
            if (this.f2358b) {
                return null;
            }
            this.f2358b = true;
            return file;
        }
        fileArr.getClass();
        int i9 = this.f2360d;
        this.f2360d = i9 + 1;
        return fileArr[i9];
    }
}
