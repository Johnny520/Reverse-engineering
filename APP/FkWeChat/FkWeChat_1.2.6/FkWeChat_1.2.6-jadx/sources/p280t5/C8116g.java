package p280t5;

import java.util.ArrayList;
import p239q5.C6267r;
import p239q5.C6268s;
import p294u5.C8529c;
import p309v5.C8820b;
import p309v5.InterfaceC8830l;

/* JADX INFO: renamed from: t5.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C8116g extends C8110a {

    /* JADX INFO: renamed from: c */
    public final ArrayList f27111c;

    /* JADX INFO: renamed from: d */
    public final C8529c f27112d;

    public C8116g(C8529c c8529c, int i10) {
        super(i10);
        this.f27111c = new ArrayList();
        this.f27112d = c8529c;
    }

    @Override // p280t5.C8110a
    /* JADX INFO: renamed from: e */
    public void mo31332e(int i10, int i11, int i12) {
        super.mo31332e(i10, i11, i12);
        m31381g(i11, i10);
        if (i12 == 2) {
            m31381g(i11 + 1, i10);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m31381g(int i10, int i11) {
        int i12 = i10 + 1;
        this.f27111c.ensureCapacity(i12);
        while (i10 >= this.f27111c.size()) {
            this.f27111c.add(new C8820b(i12));
        }
        this.f27112d.m32826c(i11, (InterfaceC8830l) this.f27111c.get(i10));
    }

    /* JADX INFO: renamed from: h */
    public boolean m31382h(C6268s c6268s, int i10, int i11) {
        int size = c6268s.size();
        for (int i12 = 0; i12 < size; i12++) {
            C6267r c6267rM24769G = c6268s.m24769G(i12);
            int iM31333f = m31333f(c6267rM24769G.m24754t());
            if (iM31333f == i10) {
                return true;
            }
            if (c6267rM24769G.m24751n() == 2 && iM31333f + 1 == i10) {
                return true;
            }
            if (i11 == 2 && iM31333f == i10 + 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public boolean m31383i(int i10, int i11, int i12) {
        InterfaceC8830l interfaceC8830l;
        if (i11 < this.f27111c.size() && (interfaceC8830l = (InterfaceC8830l) this.f27111c.get(i11)) != null) {
            return i12 == 1 ? interfaceC8830l.mo33831c(i10) : interfaceC8830l.mo33831c(i10) || m31383i(i10, i11 + 1, i12 - 1);
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public boolean m31384j(C6267r c6267r, int i10) {
        return m31383i(c6267r.m24754t(), i10, c6267r.m24751n());
    }
}
