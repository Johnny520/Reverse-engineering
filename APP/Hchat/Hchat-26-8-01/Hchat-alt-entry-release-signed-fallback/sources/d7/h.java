package d7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends d7.t {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2044o;

    public /* synthetic */ h(int r1, c7.g r2, int r3) {
            r0 = this;
            r0.f2044o = r3
            r0.<init>(r1, r2)
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            int r0 = r4.f2044o
            switch(r0) {
                case 0: goto Le7;
                case 1: goto Lab;
                default: goto L5;
            }
        L5:
            int r0 = r4.p()
            int r1 = r4.f2071n
            if (r0 >= r1) goto L11
            java.lang.String r0 = "Invalid"
            goto Laa
        L11:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            c7.g r1 = r4.T()
            r0.append(r1)
            java.lang.String r1 = ", EOCDR="
            r0.append(r1)
            r1 = 4
            byte[] r2 = r4.f11553k
            long r1 = k7.a.t(r2, r1)
            r0.append(r1)
            java.lang.String r1 = ", creator="
            r0.append(r1)
            r1 = 12
            int r2 = r4.O(r1)
            r0.append(r2)
            java.lang.String r2 = ", viewer="
            r0.append(r2)
            int r1 = r4.O(r1)
            r0.append(r1)
            java.lang.String r1 = ", disk number="
            r0.append(r1)
            r1 = 16
            byte[] r2 = r4.f11553k
            int r1 = k7.a.s(r2, r1)
            r0.append(r1)
            java.lang.String r1 = ", disk CD="
            r0.append(r1)
            r1 = 20
            byte[] r2 = r4.f11553k
            int r1 = k7.a.s(r2, r1)
            r0.append(r1)
            java.lang.String r1 = ", noOf CDR="
            r0.append(r1)
            r1 = 24
            byte[] r2 = r4.f11553k
            long r1 = k7.a.t(r2, r1)
            r0.append(r1)
            java.lang.String r1 = ", total rec="
            r0.append(r1)
            r1 = 32
            byte[] r2 = r4.f11553k
            long r1 = k7.a.t(r2, r1)
            r0.append(r1)
            java.lang.String r1 = ", size of CD="
            r0.append(r1)
            r1 = 40
            byte[] r2 = r4.f11553k
            long r1 = k7.a.t(r2, r1)
            r0.append(r1)
            java.lang.String r1 = ", offset of CD="
            r0.append(r1)
            r1 = 48
            byte[] r2 = r4.f11553k
            long r1 = k7.a.t(r2, r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        Laa:
            return r0
        Lab:
            int r0 = r4.p()
            int r1 = r4.f2071n
            if (r0 >= r1) goto Lb6
            java.lang.String r0 = "Invalid"
            goto Le6
        Lb6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            c7.g r1 = r4.T()
            r0.append(r1)
            java.lang.String r1 = ", offsetZip64Record="
            r0.append(r1)
            r1 = 8
            byte[] r2 = r4.f11553k
            long r1 = k7.a.t(r2, r1)
            r0.append(r1)
            java.lang.String r1 = ", numberOfDisks="
            r0.append(r1)
            r1 = 16
            byte[] r2 = r4.f11553k
            int r1 = k7.a.s(r2, r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        Le6:
            return r0
        Le7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            c7.g r1 = r4.T()
            r0.append(r1)
            java.lang.String r1 = ", crc="
            r0.append(r1)
            r1 = 4
            long r1 = r4.N(r1)
            r3 = 8
            java.lang.String r1 = y7.a.l(r3, r1)
            r0.append(r1)
            java.lang.String r1 = ", compressed="
            r0.append(r1)
            long r1 = r4.N(r3)
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            r1 = 12
            long r1 = r4.N(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
