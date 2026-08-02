package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ox2 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c g(int i) {
        c cVar = new c();
        int iB = b(4);
        if (iB == 0) {
            return null;
        }
        int iA = a((i * 4) + e(iB));
        ByteBuffer byteBuffer = this.b;
        byteBuffer.getClass();
        cVar.c(iA, byteBuffer);
        return cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f h(int i) {
        f fVar = new f();
        int iB = b(4);
        if (iB == 0) {
            return null;
        }
        int iA = a((i * 4) + e(iB));
        ByteBuffer byteBuffer = this.b;
        byteBuffer.getClass();
        fVar.c(iA, byteBuffer);
        return fVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int i() {
        int iB = b(4);
        if (iB != 0) {
            return f(iB);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r j(int i) {
        r rVar = new r();
        int iB = b(4);
        if (iB == 0) {
            return null;
        }
        int iA = a((i * 4) + e(iB));
        ByteBuffer byteBuffer = this.b;
        byteBuffer.getClass();
        rVar.c(iA, byteBuffer);
        return rVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ox2 k(ox2 ox2Var) {
        int iB = b(8);
        if (iB == 0) {
            return null;
        }
        int i = iB + this.a;
        ByteBuffer byteBuffer = this.b;
        ox2Var.c(byteBuffer.getInt(i) + i, byteBuffer);
        return ox2Var;
    }
}
