package p315v8;

import gg.AbstractC1416l;
import java.io.File;
import p085fg.InterfaceC1220a;
import p276sf.C3967n;

/* JADX INFO: renamed from: v8.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4523c implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f14914g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4528h f14915h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ File f14916i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C4537q f14917j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4523c(C4528h c4528h, File file, C4537q c4537q) {
        this.f14915h = c4528h;
        this.f14916i = file;
        this.f14917j = c4537q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f14914g) {
            case 0:
                File file = new File(this.f14915h.f14953n);
                C4537q c4537q = this.f14917j;
                String strM8958g = c4537q.m8958g(file);
                if (strM8958g != null) {
                    File file2 = this.f14916i;
                    if (AbstractC1416l.m3825a(c4537q.m8958g(file2), strM8958g)) {
                        c4537q.m8955a(file2);
                    }
                }
                break;
            default:
                C4528h c4528h = this.f14915h;
                c4528h.f14956q = false;
                String absolutePath = this.f14916i.getAbsolutePath();
                absolutePath.getClass();
                c4528h.f14954o = absolutePath;
                this.f14917j.m8960k(c4528h);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4523c(C4537q c4537q, C4528h c4528h, File file) {
        this.f14917j = c4537q;
        this.f14915h = c4528h;
        this.f14916i = file;
    }
}
