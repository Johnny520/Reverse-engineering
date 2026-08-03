package p032c5;

import java.io.IOException;
import p061e5.C0826a;
import p342x5.C5693d;

/* JADX INFO: renamed from: c5.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0401d extends AbstractC0399b {

    /* JADX INFO: renamed from: i */
    public final int f1101i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0401d(int i9, C5693d c5693d) {
        super(i9, -2);
        this.f1101i = c5693d.f23155h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p020b5.AbstractC0191j
    /* JADX INFO: renamed from: c */
    public final boolean mo776c(C0826a c0826a) throws IOException {
        c0826a.write(".line ");
        int i9 = this.f1101i;
        if (i9 >= 0) {
            c0826a.m2084z(i9);
            return true;
        }
        long j3 = ((long) i9) & 4294967295L;
        if (j3 < 0) {
            c0826a.write(45);
        }
        int i10 = 23;
        while (true) {
            long jAbs = Math.abs(j3 % 10);
            char[] cArr = c0826a.f2474i;
            int i11 = i10 - 1;
            cArr[i10] = (char) (jAbs + 48);
            j3 /= 10;
            if (j3 == 0) {
                c0826a.write(cArr, i10, 24 - i10);
                return true;
            }
            i10 = i11;
        }
    }
}
