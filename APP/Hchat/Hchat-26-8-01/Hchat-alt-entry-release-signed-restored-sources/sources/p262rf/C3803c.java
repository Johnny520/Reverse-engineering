package p262rf;

import java.nio.file.Path;
import java.nio.file.Paths;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import nf.InterfaceC2999a;

/* JADX INFO: renamed from: rf.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3803c implements InterfaceC3802b {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2844b f12487a = AbstractC2846d.m6274b(C3803c.class);

    /* JADX INFO: renamed from: b */
    public static final Path f12488b = Paths.get(".", new String[0]).toAbsolutePath().normalize();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p262rf.InterfaceC3802b
    /* JADX INFO: renamed from: a */
    public final boolean mo437a(InterfaceC2999a interfaceC2999a) {
        if (mo439c(interfaceC2999a.getName())) {
            long jMo6400d = interfaceC2999a.mo6400d();
            long jMo6399c = interfaceC2999a.mo6399c();
            boolean z9 = jMo6400d < 0 || jMo6399c < 0;
            boolean z10 = jMo6399c >= ((long) 26214400) && ((long) 100) * jMo6400d < jMo6399c;
            if (!z9 && !z10) {
                return true;
            }
            f12487a.mo6263q(Long.valueOf(jMo6400d), Long.valueOf(jMo6399c), interfaceC2999a.getName());
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p262rf.InterfaceC3802b
    /* JADX INFO: renamed from: b */
    public final int mo438b() {
        return 100000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p262rf.InterfaceC3802b
    /* JADX INFO: renamed from: c */
    public final boolean mo439c(String str) {
        boolean zContains = str.contains("..");
        InterfaceC2844b interfaceC2844b = f12487a;
        if (zContains && (str.contains("../") || str.contains("..\\"))) {
            interfaceC2844b.mo6264r(str, "Path traversal attack detected in entry: '{}'");
            return false;
        }
        try {
            Path path = f12488b;
            if (path.resolve(str).normalize().startsWith(path)) {
                return true;
            }
            interfaceC2844b.mo6264r(str, "Invalid file name or path traversal attack detected: {}");
            return false;
        } catch (Exception e6) {
            interfaceC2844b.mo6260n(str, "Invalid file name or path traversal attack detected: {} - error: {}", e6.getMessage());
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p262rf.InterfaceC3802b
    /* JADX INFO: renamed from: d */
    public final boolean mo440d() {
        return true;
    }
}
