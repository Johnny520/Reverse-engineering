package p154k5;

import java.util.ArrayList;
import p123i5.C3198a;
import p215oc.C5725t;

/* JADX INFO: renamed from: k5.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3988v {

    /* JADX INFO: renamed from: a */
    public final C3989w f11740a;

    /* JADX INFO: renamed from: b */
    public ArrayList f11741b;

    public C3988v(C3198a c3198a, int i10, int i11, int i12, int i13) {
        this.f11740a = new C3989w(c3198a, i10, i12, i13);
        this.f11741b = new ArrayList(i11);
    }

    /* JADX INFO: renamed from: a */
    public void m15871a(AbstractC3976j abstractC3976j) {
        this.f11740a.m15889a(abstractC3976j);
    }

    /* JADX INFO: renamed from: b */
    public void m15872b(AbstractC3976j abstractC3976j) {
        this.f11741b.add(abstractC3976j);
    }

    /* JADX INFO: renamed from: c */
    public final void m15873c() {
        int size = this.f11741b.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f11740a.m15889a((AbstractC3976j) this.f11741b.get(i10));
        }
        this.f11741b = null;
    }

    /* JADX INFO: renamed from: d */
    public AbstractC3976j m15874d(int i10) {
        if (i10 >= this.f11740a.m15887D() || i10 < 0) {
            return null;
        }
        return this.f11740a.m15901q(i10);
    }

    /* JADX INFO: renamed from: e */
    public C3989w m15875e() {
        if (this.f11741b != null) {
            m15873c();
            return this.f11740a;
        }
        C5725t.m23179a("already processed");
        return null;
    }

    /* JADX INFO: renamed from: f */
    public void m15876f(int i10, C3970f c3970f) {
        this.f11740a.m15884A(i10, c3970f);
    }

    /* JADX INFO: renamed from: g */
    public int m15877g() {
        return this.f11740a.m15887D();
    }
}
