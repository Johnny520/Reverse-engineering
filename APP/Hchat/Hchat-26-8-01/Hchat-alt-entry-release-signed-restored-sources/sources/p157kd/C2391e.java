package p157kd;

import be.AbstractC0269a;
import gd.AbstractC1400c;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import p025bc.C0257g;
import p302ud.C4325u;

/* JADX INFO: renamed from: kd.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2391e extends AbstractC0269a {

    /* JADX INFO: renamed from: g */
    public static final InterfaceC2844b f7856g = AbstractC2846d.m6274b(C2391e.class);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: e */
    public final String mo1051e() {
        return "SaveDeobfMapping";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: f */
    public final void mo1052f(C4325u c4325u) {
        C0257g c0257g = c4325u.f14435a;
        c0257g.getClass();
        int i9 = c0257g.f735U;
        if (i9 != 2) {
            int i10 = c4325u.f14435a.f733S;
            if (i10 == 0) {
                throw null;
            }
            if (i10 == 2 || i10 == 3) {
                C2388b c2388bM5709a = C2388b.m5709a(c4325u);
                Path path = c2388bM5709a.f7846a;
                if (i10 != 2 || !Files.exists(path, new LinkOption[0])) {
                    try {
                        c2388bM5709a.f7847b.clear();
                        c2388bM5709a.f7848c.clear();
                        c2388bM5709a.f7849d.clear();
                        c2388bM5709a.f7850e.clear();
                        c2388bM5709a.m5710b(c4325u);
                        c2388bM5709a.m5711c();
                    } catch (Exception e6) {
                        f7856g.mo6260n(path.toAbsolutePath(), "Failed to save deobfuscation map file '{}'", e6);
                    }
                }
            }
        }
        if (i9 == 2) {
            AbstractC1400c.m3804a(c4325u);
        }
    }
}
