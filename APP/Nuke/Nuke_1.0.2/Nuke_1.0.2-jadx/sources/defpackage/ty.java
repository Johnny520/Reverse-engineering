package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ty {
    public final boolean a = true;
    public String[] b;
    public String[] c;
    public boolean d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final uy a() {
        return new uy(this.a, this.d, this.b, this.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(ps... psVarArr) {
        boolean z = this.a;
        if (!z) {
            s.j("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(psVarArr.length);
        for (ps psVar : psVarArr) {
            arrayList.add(psVar.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!z) {
            s.j("no cipher suites for cleartext connections");
        } else if (strArr2.length != 0) {
            this.b = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            s.j("At least one cipher suite is required");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(s23... s23VarArr) {
        boolean z = this.a;
        if (!z) {
            s.j("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(s23VarArr.length);
        for (s23 s23Var : s23VarArr) {
            arrayList.add(s23Var.h);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!z) {
            s.j("no TLS versions for cleartext connections");
        } else if (strArr2.length != 0) {
            this.c = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            s.j("At least one TLS version is required");
        }
    }
}
