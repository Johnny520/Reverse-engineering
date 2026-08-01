package p179m2;

import java.util.List;
import p117i.AbstractC3075o;
import p117i.C3061i0;
import p277t2.C8087p;
import p277t2.C8094w;

/* JADX INFO: renamed from: m2.w2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4926w2 {

    /* JADX INFO: renamed from: a */
    public final C8087p f14915a;

    /* JADX INFO: renamed from: b */
    public final C3061i0 f14916b;

    public C4926w2(C8094w c8094w, AbstractC3075o abstractC3075o) {
        this.f14915a = c8094w.m31298y();
        this.f14916b = new C3061i0(c8094w.m31295v().size());
        List listM31295v = c8094w.m31295v();
        int size = listM31295v.size();
        for (int i10 = 0; i10 < size; i10++) {
            C8094w c8094w2 = (C8094w) listM31295v.get(i10);
            if (abstractC3075o.m11448a(c8094w2.m31290q())) {
                this.f14916b.m11336g(c8094w2.m31290q());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final C3061i0 m19908a() {
        return this.f14916b;
    }

    /* JADX INFO: renamed from: b */
    public final C8087p m19909b() {
        return this.f14915a;
    }
}
