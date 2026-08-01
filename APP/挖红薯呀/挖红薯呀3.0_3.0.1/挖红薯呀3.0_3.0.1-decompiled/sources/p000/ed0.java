package p000;

import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ed0 {

    /* JADX INFO: renamed from: d */
    public int f1420d;

    /* JADX INFO: renamed from: e */
    public int f1421e;

    /* JADX INFO: renamed from: f */
    public int f1422f;

    /* JADX INFO: renamed from: g */
    public Object f1423g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ed0() {
        if (jo0.f2919e == null) {
            jo0.f2919e = new jo0(24);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public int m925a(int i) {
        if (i < this.f1422f) {
            return ((ByteBuffer) this.f1423g).getShort(this.f1421e + i);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void m926b() {
        if (((fd0) this.f1423g).f1690k != this.f1422f) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void m927c() {
        while (true) {
            int i = this.f1420d;
            fd0 fd0Var = (fd0) this.f1423g;
            if (i >= fd0Var.f1688i || fd0Var.f1685f[i] >= 0) {
                return;
            } else {
                this.f1420d = i + 1;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean hasNext() {
        return this.f1420d < ((fd0) this.f1423g).f1688i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void remove() {
        fd0 fd0Var = (fd0) this.f1423g;
        m926b();
        if (this.f1421e == -1) {
            C0921xc.m5134o("Call next() before removing element from the iterator.");
            return;
        }
        fd0Var.m1081b();
        fd0Var.m1089j(this.f1421e);
        this.f1421e = -1;
        this.f1422f = fd0Var.f1690k;
    }
}
