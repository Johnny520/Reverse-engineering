package defpackage;

/* JADX INFO: renamed from: ᛵᛶᲈᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0921 implements defpackage.InterfaceC1711 {

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f4177;

    public C0921(java.lang.Object r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Argument must not be null"
            defpackage.C0292.m944(r2, r0)
            r1.f4177 = r2
            return
    }

    @Override // defpackage.InterfaceC1711
    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.C0921
            if (r0 == 0) goto Lf
            ᛵᛶᲈᛵ r2 = (defpackage.C0921) r2
            java.lang.Object r1 = r1.f4177
            java.lang.Object r2 = r2.f4177
            boolean r1 = r1.equals(r2)
            return r1
        Lf:
            r1 = 0
            return r1
    }

    @Override // defpackage.InterfaceC1711
    public final int hashCode() {
            r0 = this;
            java.lang.Object r0 = r0.f4177
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ObjectKey{object="
            r0.<init>(r1)
            java.lang.Object r2 = r2.f4177
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.InterfaceC1711
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo1225(java.security.MessageDigest r2) {
            r1 = this;
            java.lang.Object r1 = r1.f4177
            java.lang.String r1 = r1.toString()
            java.nio.charset.Charset r0 = defpackage.InterfaceC1711.f7614
            byte[] r1 = r1.getBytes(r0)
            r2.update(r1)
            return
    }
}
