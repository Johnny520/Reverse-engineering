package defpackage;

import java.io.EOFException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uj1 extends o82 {
    public static final vf1 f;
    public static final vf1 g;
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    public final no b;
    public final List c;
    public final vf1 d;
    public long e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        o72 o72Var = vf1.d;
        f = te.C("multipart/mixed");
        te.C("multipart/alternative");
        te.C("multipart/digest");
        te.C("multipart/parallel");
        g = te.C("multipart/form-data");
        h = new byte[]{58, 32};
        i = new byte[]{13, 10};
        j = new byte[]{45, 45};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public uj1(no noVar, vf1 vf1Var, List list) {
        noVar.getClass();
        vf1Var.getClass();
        this.b = noVar;
        this.c = list;
        o72 o72Var = vf1.d;
        this.d = te.C(vf1Var + "; boundary=" + noVar.j());
        this.e = -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.o82
    public final long a() throws EOFException {
        long j2 = this.e;
        if (j2 != -1) {
            return j2;
        }
        long jE = e(null, true);
        this.e = jE;
        return jE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.o82
    public final vf1 b() {
        return this.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.o82
    public final boolean c() {
        List list = this.c;
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((tj1) it.next()).b.c()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.o82
    public final void d(nn nnVar) throws EOFException {
        e(nnVar, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: fn */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: fn */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: fn */
    /* JADX WARN: Multi-variable type inference failed */
    public final long e(nn nnVar, boolean z) throws EOFException {
        fn fnVar;
        nn fnVar2;
        if (z) {
            fnVar2 = new fn();
            fnVar = fnVar2;
        } else {
            fnVar = 0;
            fnVar2 = nnVar;
        }
        List list = this.c;
        int size = list.size();
        long j2 = 0;
        int i2 = 0;
        while (true) {
            no noVar = this.b;
            byte[] bArr = j;
            byte[] bArr2 = i;
            if (i2 >= size) {
                fnVar2.getClass();
                fnVar2.write(bArr);
                fnVar2.z(noVar);
                fnVar2.write(bArr);
                fnVar2.write(bArr2);
                if (!z) {
                    return j2;
                }
                fnVar.getClass();
                long j3 = j2 + fnVar.i;
                fnVar.g();
                return j3;
            }
            tj1 tj1Var = (tj1) list.get(i2);
            js0 js0Var = tj1Var.a;
            o82 o82Var = tj1Var.b;
            fnVar2.getClass();
            fnVar2.write(bArr);
            fnVar2.z(noVar);
            fnVar2.write(bArr2);
            int size2 = js0Var.size();
            for (int i3 = 0; i3 < size2; i3++) {
                fnVar2.y(js0Var.b(i3)).write(h).y(js0Var.d(i3)).write(bArr2);
            }
            vf1 vf1VarB = o82Var.b();
            if (vf1VarB != null) {
                fnVar2.y("Content-Type: ").y(vf1VarB.a).write(bArr2);
            }
            long jA = o82Var.a();
            if (jA == -1 && z) {
                fnVar.getClass();
                fnVar.g();
                return -1L;
            }
            fnVar2.write(bArr2);
            if (z) {
                j2 += jA;
            } else {
                o82Var.d(fnVar2);
            }
            fnVar2.write(bArr2);
            i2++;
        }
    }
}
