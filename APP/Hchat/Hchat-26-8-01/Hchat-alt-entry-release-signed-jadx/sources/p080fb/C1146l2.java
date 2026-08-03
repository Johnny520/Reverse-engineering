package p080fb;

import gg.AbstractC1416l;
import java.io.File;
import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: fb.l2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1146l2 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3781g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ File f3782h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1146l2(File file, int i9) {
        this.f3781g = i9;
        this.f3782h = file;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        boolean zEquals;
        File file = (File) obj;
        switch (this.f3781g) {
            case 0:
                file.getClass();
                zEquals = file.equals(this.f3782h);
                break;
            case 1:
                file.getClass();
                zEquals = file.equals(this.f3782h);
                break;
            default:
                file.getClass();
                return Boolean.valueOf(file.isFile() && !AbstractC1416l.m3825a(file.getCanonicalFile(), this.f3782h.getCanonicalFile()));
        }
        return Boolean.valueOf(!zEquals);
    }
}
