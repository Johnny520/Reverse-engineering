package p178m3;

import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import p136j8.C2104o;
import p162l3.C2469w;
import p304uf.C4333g;

/* JADX INFO: renamed from: m3.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2777c {

    /* JADX INFO: renamed from: g */
    public int f9015g;

    /* JADX INFO: renamed from: h */
    public int f9016h;

    /* JADX INFO: renamed from: i */
    public int f9017i;

    /* JADX INFO: renamed from: j */
    public Object f9018j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC2777c() {
        if (C2469w.f8103h == null) {
            C2469w.f8103h = new C2469w(8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public int m6155a(int i9) {
        if (i9 < this.f9017i) {
            return ((ByteBuffer) this.f9018j).getShort(this.f9016h + i9);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void m6156c() {
        if (((C4333g) this.f9018j).f14484n != this.f9017i) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public void m6157d() {
        while (true) {
            int i9 = this.f9015g;
            C4333g c4333g = (C4333g) this.f9018j;
            if (i9 >= c4333g.f14482l || c4333g.f14479i[i9] >= 0) {
                return;
            } else {
                this.f9015g = i9 + 1;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean hasNext() {
        return this.f9015g < ((C4333g) this.f9018j).f14482l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void remove() {
        C4333g c4333g = (C4333g) this.f9018j;
        m6156c();
        if (this.f9016h == -1) {
            C2104o.m5276A("Call next() before removing element from the iterator.");
            return;
        }
        c4333g.m8781d();
        c4333g.m8789l(this.f9016h);
        this.f9016h = -1;
        this.f9017i = c4333g.f14484n;
    }
}
