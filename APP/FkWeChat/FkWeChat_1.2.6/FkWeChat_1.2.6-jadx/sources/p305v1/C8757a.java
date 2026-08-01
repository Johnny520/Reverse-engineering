package p305v1;

import p117i.AbstractC3050e1;
import p117i.C3084s0;
import p265s1.AbstractC7104l2;

/* JADX INFO: renamed from: v1.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8757a {

    /* JADX INFO: renamed from: a */
    public C8761c f29145a;

    /* JADX INFO: renamed from: b */
    public C8761c f29146b;

    /* JADX INFO: renamed from: c */
    public C3084s0 f29147c;

    /* JADX INFO: renamed from: d */
    public C3084s0 f29148d;

    /* JADX INFO: renamed from: e */
    public boolean f29149e;

    /* JADX INFO: renamed from: i */
    public final boolean m33599i(C8761c c8761c) {
        if (!this.f29149e) {
            AbstractC7104l2.m27988a("Only add dependencies during a tracking");
        }
        C3084s0 c3084s0 = this.f29147c;
        if (c3084s0 != null) {
            c3084s0.getClass();
            c3084s0.m11536h(c8761c);
        } else if (this.f29145a != null) {
            C3084s0 c3084s0M11284b = AbstractC3050e1.m11284b();
            C8761c c8761c2 = this.f29145a;
            c8761c2.getClass();
            c3084s0M11284b.m11536h(c8761c2);
            c3084s0M11284b.m11536h(c8761c);
            this.f29147c = c3084s0M11284b;
            this.f29145a = null;
        } else {
            this.f29145a = c8761c;
        }
        C3084s0 c3084s02 = this.f29148d;
        if (c3084s02 != null) {
            c3084s02.getClass();
            return !c3084s02.m11553y(c8761c);
        }
        if (this.f29146b != c8761c) {
            return true;
        }
        this.f29146b = null;
        return false;
    }
}
