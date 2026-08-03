package kh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends gg.m implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final kh.c f7614g = null;

    static {
            kh.c r0 = new kh.c
            r1 = 0
            r0.<init>(r1)
            kh.c.f7614g = r0
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r6 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.String[] r1 = kh.d.f7615a
            r2 = 0
            r3 = r2
        L9:
            r4 = 256(0x100, float:3.59E-43)
            if (r2 >= r4) goto L1c
            r4 = r1[r2]
            int r5 = r3 + 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r4, r3)
            int r2 = r2 + 1
            r3 = r5
            goto L9
        L1c:
            return r0
    }
}
