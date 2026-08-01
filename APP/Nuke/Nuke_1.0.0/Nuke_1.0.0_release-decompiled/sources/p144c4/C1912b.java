package p144c4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import p068N1.C1013c;
import p117X2.AbstractC1665j;
import p118X3.AbstractC1682D;
import p118X3.C1679A;
import p118X3.C1684F;
import p118X3.InterfaceC1710t;
import p138b4.C1869n;
import p138b4.C1872q;
import p138b4.InterfaceC1862g;
import p156e4.C2038a;

/* JADX INFO: renamed from: c4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1912b implements InterfaceC1710t {

    /* JADX INFO: renamed from: b */
    public static final C1912b f6482b = new C1912b(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6483a;

    public /* synthetic */ C1912b(int i5) {
        this.f6483a = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00d5  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p118X3.C1679A m3393b(p118X3.C1684F r10, p068N1.C1013c r11, p144c4.C1917g r12) throws java.net.ProtocolException {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p144c4.C1912b.m3393b(X3.F, N1.c, c4.g):X3.A");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3394c(IOException iOException, C1869n c1869n, C1917g c1917g, C1679A c1679a) {
        AbstractC1682D abstractC1682D;
        boolean z5 = iOException instanceof C2038a;
        if (!c1917g.f6501q) {
            return false;
        }
        if ((!z5 && (((abstractC1682D = c1679a.f5715d) != null && abstractC1682D.mo3002c()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z5) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        C1013c c1013c = c1869n.f6343u;
        if (c1013c == null || !c1013c.f3128a) {
            return false;
        }
        InterfaceC1862g interfaceC1862g = c1869n.f6333k;
        AbstractC1665j.m2982b(interfaceC1862g);
        C1872q c1872qMo3118h = interfaceC1862g.mo3118h();
        C1013c c1013c2 = c1869n.f6343u;
        return c1872qMo3118h.m3364a(c1013c2 != null ? c1013c2.m2081c() : null);
    }

    /* JADX INFO: renamed from: d */
    public static int m3395d(C1684F c1684f, int i5) {
        String strM3038a = c1684f.f5743i.m3038a("Retry-After");
        if (strM3038a == null) {
            strM3038a = null;
        }
        if (strM3038a == null) {
            return i5;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        AbstractC1665j.m2984d(patternCompile, "compile(...)");
        if (!patternCompile.matcher(strM3038a).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strM3038a);
        AbstractC1665j.m2984d(numValueOf, "valueOf(...)");
        return numValueOf.intValue();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v72 b4.q, still in use, count: 2, list:
          (r0v72 b4.q) from 0x0068: MOVE (r16v5 b4.q) = (r0v72 b4.q) (LINE:105)
          (r0v72 b4.q) from 0x005d: MOVE (r16v8 b4.q) = (r0v72 b4.q) (LINE:94)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // p118X3.InterfaceC1710t
    /* JADX INFO: renamed from: a */
    public final p118X3.C1684F mo1903a(p144c4.C1917g r36) {
        /*
            Method dump skipped, instruction units count: 1342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p144c4.C1912b.mo1903a(c4.g):X3.F");
    }
}
