package l5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends l5.a0 implements t5.h, t5.d {
    @Override // t5.h
    public final v5.b a() {
            r4 = this;
            k5.u r0 = r4.f7847a
            androidx.lifecycle.x r1 = r0.f7264b
            int r2 = r4.f7849c
            int r3 = r2 + 2
            int r1 = r1.P(r3)
            androidx.lifecycle.x r3 = r0.f7264b     // Catch: f5.h -> L22
            int r2 = r2 + 1
            int r2 = r3.O(r2)     // Catch: f5.h -> L22
            int r2 = r2 >>> 6
            int r2 = r2 + 1
            if (r2 < 0) goto L24
            r3 = 4
            if (r2 > r3) goto L24
            a.a r0 = oh.h.N(r0, r2, r1)     // Catch: f5.h -> L22
            return r0
        L22:
            r0 = move-exception
            goto L2a
        L24:
            f5.h r0 = new f5.h     // Catch: f5.h -> L22
            r0.<init>(r2)     // Catch: f5.h -> L22
            throw r0     // Catch: f5.h -> L22
        L2a:
            a5.a r2 = new a5.a
            r3 = 6
            r2.<init>(r1, r3, r0)
            return r2
    }
}
