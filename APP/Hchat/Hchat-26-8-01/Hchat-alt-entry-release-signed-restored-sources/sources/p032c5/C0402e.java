package p032c5;

import java.io.IOException;
import p061e5.C0826a;
import p342x5.C5695f;

/* JADX INFO: renamed from: c5.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0402e extends AbstractC0399b {

    /* JADX INFO: renamed from: i */
    public final String f1102i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0402e(int i9, C5695f c5695f) {
        super(i9, -3);
        this.f1102i = c5695f.f23160h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p020b5.AbstractC0191j
    /* JADX INFO: renamed from: c */
    public final boolean mo776c(C0826a c0826a) throws IOException {
        c0826a.write(".source");
        String str = this.f1102i;
        if (str == null) {
            return true;
        }
        c0826a.write(" ");
        c0826a.m7218m(str);
        return true;
    }
}
