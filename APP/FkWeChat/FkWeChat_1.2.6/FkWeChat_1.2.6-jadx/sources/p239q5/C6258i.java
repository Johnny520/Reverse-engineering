package p239q5;

import p239q5.AbstractC6257h;
import p309v5.AbstractC8824f;

/* JADX INFO: renamed from: q5.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6258i extends AbstractC8824f {
    public C6258i(int i10) {
        super(i10);
    }

    /* JADX INFO: renamed from: E */
    public boolean m24702E(C6258i c6258i) {
        int size;
        if (c6258i == null || (size = size()) != c6258i.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!m24704G(i10).mo24687c(c6258i.m24704G(i10))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: F */
    public void m24703F(AbstractC6257h.b bVar) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            m24704G(i10).mo24658a(bVar);
        }
    }

    /* JADX INFO: renamed from: G */
    public AbstractC6257h m24704G(int i10) {
        return (AbstractC6257h) m33887w(i10);
    }

    /* JADX INFO: renamed from: H */
    public AbstractC6257h m24705H() {
        return m24704G(size() - 1);
    }

    /* JADX INFO: renamed from: I */
    public void m24706I(int i10, AbstractC6257h abstractC6257h) {
        m33889y(i10, abstractC6257h);
    }
}
