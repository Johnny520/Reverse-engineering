package p020b5;

import java.io.IOException;
import p005a5.C0016a;
import p061e5.C0826a;

/* JADX INFO: renamed from: b5.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0183b extends AbstractC0191j {

    /* JADX INFO: renamed from: h */
    public final String f465h;

    /* JADX INFO: renamed from: i */
    public final C0187f f466i;

    /* JADX INFO: renamed from: j */
    public final C0187f f467j;

    /* JADX INFO: renamed from: k */
    public final C0187f f468k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0183b(C0016a c0016a, C0189h c0189h, int i9, String str, int i10, int i11, int i12) {
        super(i9);
        this.f465h = str;
        this.f466i = c0189h.m833b(new C0187f(c0016a, i10, "try_start_"));
        C0186e c0186e = new C0186e(c0016a, i9, "try_end_");
        c0186e.f472i = i11;
        this.f467j = c0189h.m833b(c0186e);
        if (str == null) {
            this.f468k = c0189h.m833b(new C0187f(c0016a, i12, "catchall_"));
        } else {
            this.f468k = c0189h.m833b(new C0187f(c0016a, i12, "catch_"));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p020b5.AbstractC0191j
    /* JADX INFO: renamed from: b */
    public final double mo775b() {
        return 102.0d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p020b5.AbstractC0191j
    /* JADX INFO: renamed from: c */
    public final boolean mo776c(C0826a c0826a) throws IOException {
        String str = this.f465h;
        if (str == null) {
            c0826a.write(".catchall");
        } else {
            c0826a.write(".catch ");
            c0826a.write(str);
        }
        c0826a.write(" {");
        this.f466i.mo776c(c0826a);
        c0826a.write(" .. ");
        this.f467j.mo776c(c0826a);
        c0826a.write("} ");
        this.f468k.mo776c(c0826a);
        return true;
    }
}
