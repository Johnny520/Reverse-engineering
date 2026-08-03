package sh;

import p117i0.C1829f1;
import p119i2.C1954y;
import p227p4.C3315t;
import p259r9.AbstractC3754e0;
import p259r9.C3766p;
import p307v0.AbstractC4371k;

/* JADX INFO: renamed from: sh.e2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4005e2 {

    /* JADX INFO: renamed from: d */
    public static final C3315t f13114d = AbstractC4371k.m8804b(new C1954y(22), new C3766p(7));

    /* JADX INFO: renamed from: a */
    public float f13115a;

    /* JADX INFO: renamed from: b */
    public final C1829f1 f13116b;

    /* JADX INFO: renamed from: c */
    public final C1829f1 f13117c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4005e2(float f3, float f10, float f11) {
        this.f13115a = f3;
        this.f13116b = new C1829f1(f11);
        this.f13117c = new C1829f1(f10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final float m8228a() {
        if (this.f13115a == 0.0f) {
            return 0.0f;
        }
        return this.f13117c.m4488g() / this.f13115a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m8229b(float f3) {
        this.f13117c.m4489h(AbstractC3754e0.m7907q(f3, this.f13115a, 0.0f));
    }
}
