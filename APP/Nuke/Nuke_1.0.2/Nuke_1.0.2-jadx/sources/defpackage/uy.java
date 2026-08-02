package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uy {
    public static final uy e;
    public static final uy f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ps psVar = ps.r;
        ps psVar2 = ps.s;
        ps psVar3 = ps.t;
        ps psVar4 = ps.l;
        ps psVar5 = ps.n;
        ps psVar6 = ps.m;
        ps psVar7 = ps.o;
        ps psVar8 = ps.q;
        ps psVar9 = ps.p;
        List listP = eu.P(psVar, psVar2, psVar3, psVar4, psVar5, psVar6, psVar7, psVar8, psVar9);
        List listP2 = eu.P(psVar, psVar2, psVar3, psVar4, psVar5, psVar6, psVar7, psVar8, psVar9, ps.j, ps.k, ps.h, ps.i, ps.f, ps.g, ps.e);
        ty tyVar = new ty();
        ps[] psVarArr = (ps[]) listP.toArray(new ps[0]);
        tyVar.b((ps[]) Arrays.copyOf(psVarArr, psVarArr.length));
        s23 s23Var = s23.j;
        s23 s23Var2 = s23.k;
        tyVar.c(s23Var, s23Var2);
        tyVar.d = true;
        tyVar.a();
        ty tyVar2 = new ty();
        ps[] psVarArr2 = (ps[]) listP2.toArray(new ps[0]);
        tyVar2.b((ps[]) Arrays.copyOf(psVarArr2, psVarArr2.length));
        tyVar2.c(s23Var, s23Var2);
        tyVar2.d = true;
        e = tyVar2.a();
        ty tyVar3 = new ty();
        ps[] psVarArr3 = (ps[]) listP2.toArray(new ps[0]);
        tyVar3.b((ps[]) Arrays.copyOf(psVarArr3, psVarArr3.length));
        tyVar3.c(s23Var, s23Var2, s23.l, s23.m);
        tyVar3.d = true;
        tyVar3.a();
        f = new uy(false, false, null, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public uy(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(SSLSocket sSLSocket, boolean z) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        enabledCipherSuites.getClass();
        String[] strArr = this.c;
        if (strArr != null) {
            enabledCipherSuites = ug3.i(strArr, enabledCipherSuites, ps.c);
        }
        String[] strArr2 = this.d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            enabledProtocols2.getClass();
            enabledProtocols = ug3.i(enabledProtocols2, strArr2, dm1.b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        sl0 sl0Var = ps.c;
        byte[] bArr = ug3.a;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (sl0Var.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z && i != -1) {
            String str = supportedCipherSuites[i];
            str.getClass();
            enabledCipherSuites.getClass();
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length);
        boolean z2 = this.a;
        if (!z2) {
            s.j("no cipher suites for cleartext connections");
            return;
        }
        if (strArr3.length == 0) {
            s.j("At least one cipher suite is required");
            return;
        }
        String[] strArr4 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
        String[] strArr5 = (String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length);
        if (!z2) {
            s.j("no TLS versions for cleartext connections");
            return;
        }
        if (strArr5.length == 0) {
            s.j("At least one TLS version is required");
            return;
        }
        uy uyVar = new uy(z2, this.b, strArr4, (String[]) Arrays.copyOf(strArr5, strArr5.length));
        if (uyVar.c() != null) {
            sSLSocket.setEnabledProtocols(uyVar.d);
        }
        if (uyVar.b() != null) {
            sSLSocket.setEnabledCipherSuites(uyVar.c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ArrayList b() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(ps.b.j(str));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ArrayList c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            s23.i.getClass();
            arrayList.add(ix2.e(str));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof uy)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        uy uyVar = (uy) obj;
        boolean z = uyVar.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, uyVar.c) && Arrays.equals(this.d, uyVar.d) && this.b == uyVar.b;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.b + ')';
    }
}
