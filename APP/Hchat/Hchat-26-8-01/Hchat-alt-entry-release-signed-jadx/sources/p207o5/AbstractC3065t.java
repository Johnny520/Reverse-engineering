package p207o5;

import androidx.lifecycle.C0119x;
import bsh.C0353j;
import java.util.Iterator;
import p005a5.C0016a;

/* JADX INFO: renamed from: o5.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3065t implements Iterator {

    /* JADX INFO: renamed from: g */
    public int f9909g = 2;

    /* JADX INFO: renamed from: h */
    public Object f9910h;

    /* JADX INFO: renamed from: i */
    public final C0016a f9911i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC3065t(C0119x c0119x, int i9) {
        c0119x.getClass();
        this.f9911i = new C0016a(i9, 5, c0119x);
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo5492a(C0016a c0016a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i9 = this.f9909g;
        if (i9 == 1) {
            return true;
        }
        if (i9 == 3) {
            return false;
        }
        this.f9909g = 4;
        this.f9910h = mo5492a(this.f9911i);
        if (this.f9909g == 3) {
            return false;
        }
        this.f9909g = 1;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C0353j.m1307e();
            return null;
        }
        this.f9909g = 2;
        Object obj = this.f9910h;
        this.f9910h = null;
        return obj;
    }
}
