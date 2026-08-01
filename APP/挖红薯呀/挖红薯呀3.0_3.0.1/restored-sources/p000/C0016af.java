package p000;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: af */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0016af implements Iterator, p40 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f144d = 1;

    /* JADX INFO: renamed from: e */
    public final Object f145e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0016af(eq0 eq0Var) {
        m91[] m91VarArr = new m91[8];
        for (int i = 0; i < 8; i++) {
            m91VarArr[i] = new o91(this);
        }
        this.f145e = new iq0(eq0Var, m91VarArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f144d;
        Object obj = this.f145e;
        switch (i) {
            case 0:
                return ((Enumeration) obj).hasMoreElements();
            case 1:
                return ((iq0) obj).f2352f;
            default:
                return ((Iterator) obj).hasNext();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f144d;
        Object obj = this.f145e;
        switch (i) {
            case 0:
                return ((Enumeration) obj).nextElement();
            case 1:
                return (Map.Entry) ((iq0) obj).next();
            default:
                return (jb1) ((Iterator) obj).next();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f144d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                ((iq0) this.f145e).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0016af(Enumeration enumeration) {
        this.f145e = enumeration;
    }

    public C0016af(hb1 hb1Var) {
        this.f145e = hb1Var.f2195e.iterator();
    }
}
