package d7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends d7.t {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public d7.h f2045o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d7.h f2046p;

    public final java.lang.String toString() {
            r5 = this;
            int r0 = r5.p()
            int r1 = r5.f2071n
            if (r0 >= r1) goto Lb
            java.lang.String r0 = "Invalid"
            return r0
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            c7.g r1 = r5.T()
            r0.append(r1)
            byte[] r1 = r5.f11553k
            r2 = 16
            int r1 = k7.a.s(r1, r2)
            r3 = -1
            if (r1 != r3) goto L27
            java.lang.String r1 = ", ZIP64"
            r0.append(r1)
        L27:
            java.lang.String r1 = ", disks="
            r0.append(r1)
            r1 = 4
            int r1 = r5.O(r1)
            r0.append(r1)
            java.lang.String r1 = ", start disk="
            r0.append(r1)
            r1 = 6
            int r1 = r5.O(r1)
            r0.append(r1)
            java.lang.String r1 = ", dirs="
            r0.append(r1)
            r1 = 8
            int r3 = r5.O(r1)
            r0.append(r3)
            java.lang.String r3 = ", total dirs="
            r0.append(r3)
            r3 = 10
            int r3 = r5.O(r3)
            r0.append(r3)
            java.lang.String r3 = ", length="
            r0.append(r3)
            r3 = 12
            long r3 = r5.N(r3)
            r0.append(r3)
            java.lang.String r3 = ", offset="
            r0.append(r3)
            d7.h r3 = r5.f2046p
            if (r3 == 0) goto L7d
            r2 = 48
            byte[] r3 = r3.f11553k
            long r2 = k7.a.t(r3, r2)
            goto L81
        L7d:
            long r2 = r5.N(r2)
        L81:
            r0.append(r2)
            java.lang.String r2 = ", last="
            r0.append(r2)
            r2 = 20
            int r2 = r5.O(r2)
            java.lang.String r1 = y7.a.k(r2, r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
