package p351xe;

import java.io.OutputStream;
import p081fc.C1203f;

/* JADX INFO: renamed from: xe.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5797r extends OutputStream {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1203f f23544g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5797r(C1203f c1203f) {
        this.f23544g = c1203f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.OutputStream
    public final void write(int i9) {
        char c10 = (char) i9;
        C1203f c1203f = this.f23544g;
        if (c10 == '\n') {
            c1203f.m3269p();
        } else if (c10 != '\r') {
            c1203f.mo3254d(c10);
        }
    }
}
