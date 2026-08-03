package l7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l7.h[] f7879c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f7881b;

    static {
            l7.h r0 = new l7.h
            r1 = 1
            java.lang.String r2 = "public"
            r0.<init>(r1, r2)
            l7.h r1 = new l7.h
            r2 = 2
            java.lang.String r3 = "system"
            r1.<init>(r2, r3)
            l7.h r2 = new l7.h
            r3 = 4
            java.lang.String r4 = "vendor"
            r2.<init>(r3, r4)
            l7.h r3 = new l7.h
            r4 = 8
            java.lang.String r5 = "product"
            r3.<init>(r4, r5)
            l7.h r4 = new l7.h
            r5 = 16
            java.lang.String r6 = "signature"
            r4.<init>(r5, r6)
            l7.h r5 = new l7.h
            r6 = 32
            java.lang.String r7 = "odm"
            r5.<init>(r6, r7)
            l7.h r6 = new l7.h
            r7 = 64
            java.lang.String r8 = "oem"
            r6.<init>(r7, r8)
            l7.h r7 = new l7.h
            r8 = 128(0x80, float:1.8E-43)
            java.lang.String r9 = "actor"
            r7.<init>(r8, r9)
            l7.h r8 = new l7.h
            r9 = 256(0x100, float:3.59E-43)
            java.lang.String r10 = "config"
            r8.<init>(r9, r10)
            l7.h[] r0 = new l7.h[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            l7.h.f7879c = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
        L5a:
            r3 = 9
            if (r2 >= r3) goto L68
            r3 = r0[r2]
            java.lang.String r4 = r3.f7881b
            r1.put(r4, r3)
            int r2 = r2 + 1
            goto L5a
        L68:
            return
    }

    public h(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f7880a = r1
            r0.f7881b = r2
            return
    }
}
