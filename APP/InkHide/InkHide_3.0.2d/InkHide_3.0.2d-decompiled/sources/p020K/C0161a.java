package p020K;

import androidx.lifecycle.AbstractC0460L;
import p012G.C0140d;
import p075l.C0754l;

/* JADX INFO: renamed from: K.a */
/* JADX INFO: loaded from: classes.dex */
public class C0161a extends AbstractC0460L {

    /* JADX INFO: renamed from: e */
    public static final C0140d f473e = new C0140d(3);

    /* JADX INFO: renamed from: d */
    public final C0754l f474d = new C0754l();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.AbstractC0460L
    /* JADX INFO: renamed from: b */
    public final void mo339b() {
        C0754l c0754l = this.f474d;
        int i2 = c0754l.f2560c;
        if (i2 > 0) {
            c0754l.f2559b[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = c0754l.f2559b;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        c0754l.f2560c = 0;
    }
}
